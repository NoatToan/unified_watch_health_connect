package o62;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.w0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lo62/x;", "", "<init>", "()V", "Lx5/l0;", "textFieldValue", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f129810a = new x();

    private x() {
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public final void a(h4.r rVar, final String str, final String str2, final e23.l<? super String, Unit> lVar, String str3, final e23.l<? super String, Boolean> lVar2, final String str4, final int i14, int i15, p3.m mVar, final int i16, final int i17) {
        String str5;
        int i18;
        boolean z14;
        final h4.r rVar2;
        final int i19;
        final String str6;
        p2 p2VarI0;
        String str7;
        Object objQ;
        int i24;
        int i25;
        int i26;
        str.getClass();
        str2.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1635977737);
        int i27 = i16 | 6;
        if ((i16 & 48) == 0) {
            i27 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i27 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i27 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        int i28 = i17 & 16;
        if (i28 == 0) {
            if ((i16 & 24576) == 0) {
                str5 = str3;
                i27 |= o0VarE.B(str5) ? 16384 : 8192;
            }
            if ((196608 & i16) == 0) {
                if (o0VarE.r(lVar2)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i27 |= i26;
            }
            if ((1572864 & i16) == 0) {
                if (o0VarE.B(str4)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i27 |= i25;
            }
            if ((12582912 & i16) == 0) {
                if (o0VarE.k(i14)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i27 |= i24;
            }
            i18 = i27 | 100663296;
            if ((38347923 & i18) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                h4.r.a aVar = h4.r.S;
                if (i28 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                x5.p.f188918b.getClass();
                int i29 = x5.p.f188926j;
                x1 x1Var = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p3.p0.n(new x5.l0(str2, og.a.l(0, str2.length()), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ);
                }
                p3.v.a(u2.f201804a.c(new t2(ds.e0.d(d92.b.f58623a, o0VarE), o4.d0.c(0.4f, d92.b.a(o0VarE).k().b(), 14), null)), z3.f.c(1625229623, new v(aVar, str7, lVar, str, new m4.b0(), i14, i29, str4, lVar2, (p1) objQ, 0), o0VarE), o0VarE, 56);
                rVar2 = aVar;
                str6 = str7;
                i19 = i29;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                i19 = i15;
                str6 = str5;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: o62.w
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        x xVar = x.f129810a;
                        this.f129798a.a(rVar2, str, str2, lVar, str6, lVar2, str4, i14, i19, mVar2, p3.p0.t(i16 | 1), i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i27 |= 24576;
        str5 = str3;
        if ((196608 & i16) == 0) {
            if (o0VarE.r(lVar2)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i27 |= i26;
        }
        if ((1572864 & i16) == 0) {
            if (o0VarE.B(str4)) {
                i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i25 = 524288;
            }
            i27 |= i25;
        }
        if ((12582912 & i16) == 0) {
            if (o0VarE.k(i14)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i27 |= i24;
        }
        i18 = i27 | 100663296;
        if ((38347923 & i18) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            h4.r.a aVar2 = h4.r.S;
            if (i28 != 0) {
                str7 = "";
            } else {
                str7 = str5;
            }
            x5.p.f188918b.getClass();
            int i210 = x5.p.f188926j;
            x1 x1Var2 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(new x5.l0(str2, og.a.l(0, str2.length()), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ);
            }
            p3.v.a(u2.f201804a.c(new t2(ds.e0.d(d92.b.f58623a, o0VarE), o4.d0.c(0.4f, d92.b.a(o0VarE).k().b(), 14), null)), z3.f.c(1625229623, new v(aVar2, str7, lVar, str, new m4.b0(), i14, i210, str4, lVar2, (p1) objQ, 0), o0VarE), o0VarE, 56);
            rVar2 = aVar2;
            str6 = str7;
            i19 = i210;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            i19 = i15;
            str6 = str5;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: o62.w
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    x xVar = x.f129810a;
                    this.f129798a.a(rVar2, str, str2, lVar, str6, lVar2, str4, i14, i19, mVar2, p3.p0.t(i16 | 1), i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
