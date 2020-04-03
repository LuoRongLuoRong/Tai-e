/*
 * Bamboo - A Program Analysis Framework for Java
 *
 * Copyright (C) 2020 Tian Tan <tiantan@nju.edu.cn>
 * Copyright (C) 2020 Yue Li <yueli@nju.edu.cn>
 * All rights reserved.
 *
 * This software is designed for the "Static Program Analysis" course at
 * Nanjing University, and it supports a subset of Java features.
 * Bamboo is only for educational and academic purposes, and any form of
 * commercial use is disallowed.
 */

package bamboo.pta.analysis.heap;

import bamboo.pta.element.Method;
import bamboo.pta.element.Obj;
import bamboo.pta.element.Type;

public interface HeapModel {

    Obj getObj(Object allocationSite, Type type, Method containerMethod);
}
