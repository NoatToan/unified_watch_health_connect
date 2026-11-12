package com.fasterxml.jackson.core;

import defpackage.wo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public interface TreeNode {
    JsonToken asToken();

    TreeNode at(String str) throws IllegalArgumentException;

    TreeNode at(wo woVar);

    Iterator<String> fieldNames();

    TreeNode get(int i);

    TreeNode get(String str);

    boolean isArray();

    boolean isContainerNode();

    boolean isMissingNode();

    boolean isObject();

    boolean isValueNode();

    JsonParser.NumberType numberType();

    TreeNode path(int i);

    TreeNode path(String str);

    int size();

    JsonParser traverse();

    JsonParser traverse(ObjectCodec objectCodec);
}
