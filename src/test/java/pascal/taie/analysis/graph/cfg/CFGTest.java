/*
 * Tai-e: A Static Analysis Framework for Java
 *
 * Copyright (C) 2022 Tian Tan <tiantan@nju.edu.cn>
 * Copyright (C) 2022 Yue Li <yueli@nju.edu.cn>
 *
 * This file is part of Tai-e.
 *
 * Tai-e is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * Tai-e is distributed in the hope that it will be useful,but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Tai-e. If not, see <https://www.gnu.org/licenses/>.
 */

package pascal.taie.analysis.graph.cfg;

import org.junit.Test;
import pascal.taie.Main;
import pascal.taie.analysis.exception.ThrowAnalysis;

public class CFGTest {

    @Test
    public void testCFG() {
        test("CFG", "explicit");
    }

    @Test
    public void testException() {
        test("Exceptions", "all");
    }

    private static void test(String main, String exception) {
        String[] args = new String[]{
                "-pp", "-cp", "src/test/resources/controlflow", "-m", main,
                "-a", ThrowAnalysis.ID + "=exception:" + exception,
                "-a", CFGBuilder.ID + "=exception:" + exception + ";dump:true"
        };
        Main.main(args);
    }
}
