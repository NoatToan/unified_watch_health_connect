package com.xiaomi.smarthome.core.server.internal.plugin.util;

/* JADX INFO: loaded from: classes10.dex */
public interface Callback<T, E> {
    E call(T t) throws RuntimeException;
}
