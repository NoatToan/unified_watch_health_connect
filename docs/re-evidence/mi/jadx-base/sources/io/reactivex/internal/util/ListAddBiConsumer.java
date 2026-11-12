package io.reactivex.internal.util;

import defpackage.oi2;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public enum ListAddBiConsumer implements oi2<List, Object, List> {
    INSTANCE;

    public static <T> oi2<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // defpackage.oi2
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
