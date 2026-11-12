package io.reactivex.internal.util;

import defpackage.bua;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, bua<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> bua<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // defpackage.bua
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
