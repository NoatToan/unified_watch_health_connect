package com.huami.tools.log.parser;

/* JADX INFO: loaded from: classes15.dex */
public interface IParser<T> {
    Class<T> getClassType();

    String parseString(T t);
}
