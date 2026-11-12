package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import a42.r;
import android.content.Context;
import android.os.Bundle;
import c62.m1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import cu1.z;
import d53.w;
import d6.i;
import gl1.y;
import java.util.List;
import o4.f0;
import o4.q1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import q4.g;
import s5.i0;
import w5.b0;
import w5.c0;
import w5.q;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/c;", "Lh82/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends h82.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f45406k = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f45407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f45408g = f0.d(4291765176L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45409h = f0.d(4283478034L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f45410i = f0.d(4294942221L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f45411j = f0.d(4294901813L);

    public static s5.c g(int i14, int i15, long j8, m mVar) {
        x1 x1Var = n.f135158a;
        String strQ = y.Q(mVar, i14);
        int iH = w.H(strQ, "<span>", 0, false, 6);
        int iH2 = w.H(strQ, "</span>", 0, false, 6);
        i0 i0Var = new i0(com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar), 0L, (w5.f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (i) null, (q1) null, (s5.b0) null, (g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (j) null);
        i0 i0Var2 = new i0(j8, 0L, (w5.f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (i) null, (q1) null, (s5.b0) null, (g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (j) null);
        s5.c.b bVar = new s5.c.b(0, 1, null);
        int iJ = bVar.j(i0Var);
        try {
            bVar.b(strQ.substring(0, iH));
            Unit unit = Unit.INSTANCE;
            bVar.f(iJ);
            int iJ2 = bVar.j(i0Var2);
            try {
                bVar.b(strQ.substring(iH + 6, iH2));
                bVar.f(iJ2);
                int iJ3 = bVar.j(i0Var);
                try {
                    bVar.b(strQ.substring(iH2 + 7, strQ.length()));
                    return bVar.k();
                } finally {
                    bVar.f(iJ3);
                }
            } catch (Throwable th3) {
                bVar.f(iJ2);
                throw th3;
            }
        } catch (Throwable th4) {
            bVar.f(iJ);
            throw th4;
        }
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1677719615);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f45407f = Integer.valueOf(bundle.getInt("EXTRA_CONFIDENCE_SCORE"));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(this, bundle, i14, 17);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-196354226, true, new z(this, 0)), 4, null));
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(598785896);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(1658332341, new z(this, 1), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m1(this, i14, 21);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/c$a;", "", "<init>", "()V", "", "EXTRA_CONFIDENCE_SCORE", "Ljava/lang/String;", "", "NOT_CONFIDENT_MAX_LEVEL", "I", "SOMEWHAT_CONFIDENT_MAX_LEVEL", "EXTREMELY_CONFIDENT_MIN_LEVEL", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
