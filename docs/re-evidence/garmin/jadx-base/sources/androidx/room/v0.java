package androidx.room;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public static final Object a(w wVar, String str, v13.c cVar) {
        Object objC = wVar.c(new a81.m(29), str, cVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
