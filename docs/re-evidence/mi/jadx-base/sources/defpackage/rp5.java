package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class rp5 extends i00 implements acd, flh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rp5 f32765a = new rp5();

    @Override // defpackage.ck4
    public Class<?> e() {
        return Date.class;
    }

    @Override // defpackage.i00, defpackage.acd
    public long i(Object obj, bw3 bw3Var) {
        return ((Date) obj).getTime();
    }
}
