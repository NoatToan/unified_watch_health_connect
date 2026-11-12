package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import defpackage.cbt;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends a<cbt> {
    public i(Context context, String str, Handler handler) {
        super(context, str, handler);
    }

    private static String a(cbt cbtVar) {
        return cbtVar == null ? "" : cbtVar.b();
    }

    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method */
    private static int b2(cbt cbtVar) {
        if (cbtVar == null) {
            return -113;
        }
        return cbtVar.c;
    }

    /* JADX INFO: renamed from: c, reason: avoid collision after fix types in other method */
    private static long c2(cbt cbtVar) {
        if (cbtVar == null) {
            return 0L;
        }
        return cbtVar.f;
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ long d(cbt cbtVar) {
        return c2(cbtVar);
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static void a2(cbt cbtVar, long j) {
        if (cbtVar != null) {
            cbtVar.f = j;
        }
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ String b(cbt cbtVar) {
        return a(cbtVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ int c(cbt cbtVar) {
        return b2(cbtVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final long b() {
        return com.autonavi.aps.amapapi.config.a.e;
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final long c() {
        return com.autonavi.aps.amapapi.config.a.f;
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* bridge */ /* synthetic */ void a(cbt cbtVar, long j) {
        a2(cbtVar, j);
    }
}
