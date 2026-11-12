package com.google.firebase.datastorage;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import y7.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ly7/g;", "Ly7/g$a;", Action.KEY_ATTRIBUTE, "defaultValue", "getOrDefault", "(Ly7/g;Ly7/g$a;Ljava/lang/Object;)Ljava/lang/Object;", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorageKt {
    public static final <T> T getOrDefault(g gVar, g.a<T> aVar, T t7) {
        gVar.getClass();
        aVar.getClass();
        T t14 = (T) gVar.c(aVar);
        return t14 == null ? t7 : t14;
    }
}
