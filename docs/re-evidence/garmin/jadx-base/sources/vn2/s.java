package vn2;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import com.google.common.base.Optional;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ty1.g2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J+\u0010\u001d\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c0\u00190\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J+\u0010\u001e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c0\u00190\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b&\u0010\u0012J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013H\u0016¢\u0006\u0004\b-\u0010\u0016J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\"0\u0013H\u0016¢\u0006\u0004\b.\u0010\u0016J\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00132\u0006\u0010/\u001a\u00020\u001fH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010,J-\u00108\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020605\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u0019040\u0013H\u0016¢\u0006\u0004\b8\u0010\u0016J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0013H\u0016¢\u0006\u0004\b:\u0010\u0016J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u001b*\u00020;H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010N¨\u0006P"}, d2 = {"Lvn2/s;", "Lvn2/b;", "Lvn2/a1;", "Lvn2/z0;", "", "cid", "", "deviceUnitId", "<init>", "(Ljava/lang/String;J)V", "getDeviceName", "()Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Lkotlin/Function1;", "", "longWaitingCallback", "Lq03/b;", "k0", "(Le23/l;)Lq03/b;", "Lq03/r;", "Lvn2/z0$b;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Lq03/r;", "Lpn2/e;", "t0", "Lcom/google/common/base/Optional;", "Las2/b;", "", "Lcom/garmin/feature/garminpay/util/transit/BalanceInfo;", "f", "j", "", "c", "()Z", "Lvn2/z0$e;", "cardRemovalState", "B", "(Lvn2/z0$e;Le23/l;)Lq03/b;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "Ltn2/f0$a;", "functionality", JWKParameterNames.RSA_EXPONENT, "(Ltn2/f0$a;)Lq03/b;", "v0", "()Lq03/b;", "E0", "p0", "force", "Ltn2/y0$c;", "D", "(Z)Lq03/r;", "W", "Lo13/p;", "", "Lvr2/q;", "Lhs2/c;", "P", "Ljava/io/File;", "o0", "Lqs2/f;", "cardStatus", "d2", "(Ljava/lang/String;Lqs2/f;)Lq03/b;", "b2", "(Lqs2/f;)I", "Lpn2/a$h;", "T1", "()Lpn2/a$h;", "g", "Ljava/lang/String;", "V", "h", "J", "getDeviceUnitId", "()J", IntegerTokenConverter.CONVERTER_KEY, "Ltn2/y0$c;", "syncInfo", "Lpn2/e;", "historyInfo", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends b<a1> implements z0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f178940k = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String cid;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private tn2.y0.c syncInfo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private pn2.e historyInfo;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f178946b;

        static {
            int[] iArr = new int[pn2.a.h.values().length];
            try {
                iArr[pn2.a.h.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pn2.a.h.FORCE_PERMANENT_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pn2.a.h.FORCE_DELETE_WITH_BALANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pn2.a.h.FORCE_DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f178945a = iArr;
            int[] iArr2 = new int[qs2.f.values().length];
            try {
                iArr2[qs2.f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f178946b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, long j8) {
        super(j8);
        str.getClass();
        this.cid = str;
        this.deviceUnitId = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0.e.b A1(e23.l lVar, Object obj) {
        obj.getClass();
        return (z0.e.b) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v B1(e23.l lVar, Object obj) {
        obj.getClass();
        return (q03.v) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v C1(boolean z14, s sVar) {
        int i14 = 0;
        if (z14) {
            e13.j jVarA = sVar.R0().f165644m.a(false);
            h hVar = new h(new q(sVar, i14), 13);
            int i15 = w03.b.f181178a;
            return new e13.o(jVarA, hVar);
        }
        tn2.y0.c cVar = sVar.syncInfo;
        if (cVar != null) {
            return q03.r.f(cVar);
        }
        e13.j jVarA2 = sVar.R0().f165644m.a(false);
        h hVar2 = new h(new q(sVar, 1), 14);
        int i16 = w03.b.f181178a;
        return new e13.o(jVarA2, hVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tn2.y0.c D1(s sVar, tn2.y0.c cVar) {
        cVar.getClass();
        sVar.syncInfo = cVar;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tn2.y0.c E1(e23.l lVar, Object obj) {
        obj.getClass();
        return (tn2.y0.c) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tn2.y0.c F1(s sVar, tn2.y0.c cVar) {
        cVar.getClass();
        sVar.syncInfo = cVar;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tn2.y0.c G1(e23.l lVar, Object obj) {
        obj.getClass();
        return (tn2.y0.c) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List H1(s sVar) {
        qs2.a aVar;
        tn2.c cVar = tn2.c.f165530a;
        k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(es2.a.class);
        cVar.getClass();
        Object obj = tn2.c.f165531b.get(dVarB);
        obj.getClass();
        List<fs2.a> listB = ((es2.a) obj).b(sVar.getDeviceUnitId());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            fs2.a aVar2 = (fs2.a) obj2;
            if (aVar2.f73433h != null && (aVar = aVar2.f73428c) != null && p13.u.z(aVar.f147397b, qs2.e.TRANSIT)) {
                arrayList.add(obj2);
            }
        }
        List<fs2.a> listN0 = p13.h0.N0(arrayList, r13.a.a(new vb1.d(23), new q(sVar, 3)));
        ArrayList arrayList2 = new ArrayList();
        for (fs2.a aVar3 : listN0) {
            is2.b bVar = aVar3.f73427b;
            vr2.q qVarA = bVar != null ? yr2.m.a(bVar).a(aVar3) : null;
            if (qVarA != null) {
                arrayList2.add(qVarA);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable I1(fs2.a aVar) {
        aVar.getClass();
        return aVar.f73426a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable J1(s sVar, fs2.a aVar) {
        aVar.getClass();
        qs2.f fVar = aVar.f73433h;
        fVar.getClass();
        return Integer.valueOf(sVar.b2(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v K1(s sVar, List list) {
        list.getClass();
        ps2.w wVar = ps2.w.f140538a;
        long deviceUnitId = sVar.getDeviceUnitId();
        wVar.getClass();
        ps2.n nVarI = ps2.w.i(deviceUnitId);
        nVarI.getClass();
        e13.b bVarA = nVarI.a();
        h hVar = new h(new aq1.d0(list, 29), 15);
        int i14 = w03.b.f181178a;
        return new e13.o(bVarA, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o13.p L1(List list, Optional optional) {
        optional.getClass();
        return new o13.p(list, optional);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o13.p M1(e23.l lVar, Object obj) {
        obj.getClass();
        return (o13.p) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v N1(e23.l lVar, Object obj) {
        obj.getClass();
        return (q03.v) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v O1(s sVar) {
        return sVar.R0().f165643l.a(sVar.getCid(), false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v P1(s sVar) {
        pn2.e eVar = sVar.historyInfo;
        if (eVar != null) {
            return q03.r.f(eVar);
        }
        e13.j jVarI = sVar.R0().i(sVar.getCid());
        h hVar = new h(new q(sVar, 5), 20);
        int i14 = w03.b.f181178a;
        return new e13.o(jVarI, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pn2.e Q1(s sVar, pn2.e eVar) {
        eVar.getClass();
        sVar.historyInfo = eVar;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pn2.e R1(e23.l lVar, Object obj) {
        obj.getClass();
        return (pn2.e) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v S1(s sVar) {
        return sVar.R0().f165643l.a(sVar.getCid(), true, true);
    }

    private final pn2.a.h T1() {
        wr2.p.f186870a.getClass();
        String strC = wr2.p.c("felicaPrefCache", "felica.refund.policy.pref.key");
        return strC == null ? pn2.a.h.PRODUCTION : pn2.a.h.valueOf(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v U1(s sVar) throws IllegalAccessException {
        rn2.i iVar;
        tn2.y0.c cVar = sVar.syncInfo;
        if (cVar == null || (iVar = cVar.f165746a) == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("SyncInfo.fnCard should not be null");
            return null;
        }
        q03.r<Optional<as2.b<Integer>>> rVarJ = sVar.j();
        h hVar = new h(new g2(17, sVar, iVar), 16);
        rVarJ.getClass();
        int i14 = w03.b.f181178a;
        return new e13.j(rVarJ, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v V1(s sVar, final rn2.i iVar, final Optional optional) {
        optional.getClass();
        q03.r<pn2.e> rVarT0 = sVar.t0();
        final int i14 = 0;
        h hVar = new h(new e23.l() { // from class: vn2.o
            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return s.W1(iVar, optional, (pn2.e) obj);
                    default:
                        return s.Y1(iVar, optional, (Throwable) obj);
                }
            }
        }, 11);
        rVarT0.getClass();
        int i15 = w03.b.f181178a;
        e13.o oVar = new e13.o(rVarT0, hVar);
        final int i16 = 1;
        return new e13.r(oVar, new h(new e23.l() { // from class: vn2.o
            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return s.W1(iVar, optional, (pn2.e) obj);
                    default:
                        return s.Y1(iVar, optional, (Throwable) obj);
                }
            }
        }, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0.b W1(rn2.i iVar, Optional optional, pn2.e eVar) {
        eVar.getClass();
        return new z0.b(iVar, eVar, null, (as2.b) optional.orNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0.b X1(e23.l lVar, Object obj) {
        obj.getClass();
        return (z0.b) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v Y1(rn2.i iVar, Optional optional, Throwable th3) {
        th3.getClass();
        return q03.r.f(new z0.b(iVar, null, th3, (as2.b) optional.orNull()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v Z1(e23.l lVar, Object obj) {
        obj.getClass();
        return (q03.v) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v a2(e23.l lVar, Object obj) {
        obj.getClass();
        return (q03.v) lVar.invoke(obj);
    }

    private final int b2(qs2.f fVar) {
        return a.f178946b[fVar.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.f c2(s sVar, e23.l lVar) throws DeviceNotConnectedException {
        if (sVar.R0().f165636e.isPaired()) {
            return sVar.R0().o(lVar, sVar.getCid());
        }
        throw new DeviceNotConnectedException("Device is not connected.");
    }

    private final q03.b d2(String cid, qs2.f cardStatus) {
        p62.e eVar = new p62.e(this, 15, cid, cardStatus);
        int i14 = w03.b.f181178a;
        return new z03.h(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(s sVar, String str, qs2.f fVar) {
        sVar.R0().f165642k.b(str, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.f x1(s sVar) throws IllegalAccessException {
        tn2.y0.c cVar = sVar.syncInfo;
        if (cVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("SyncInfo should not be null");
            return null;
        }
        rn2.i iVar = cVar.f165746a;
        tn2.r0 r0VarR0 = sVar.R0();
        if (iVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("The card to add to device metadata should not be null");
            return null;
        }
        r0VarR0.getClass();
        a73.h hVar = new a73.h(r0VarR0, 10);
        int i14 = w03.b.f181178a;
        return new e13.k(new e13.j(new e13.m(hVar), new tn2.k0(new tn2.i0(r0VarR0, 1), 5)), new tn2.v(new sy.i(19, r0VarR0, iVar), 27)).d(sVar.d2(iVar.getCid(), cVar.f165748c == null ? qs2.f.ACTIVE : qs2.f.ERROR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.v y1(s sVar, Optional optional) {
        optional.getClass();
        if (!optional.isPresent()) {
            return q03.r.f(new z0.e.a());
        }
        int iIntValue = ((Number) ((as2.b) optional.get()).a()).intValue();
        if (iIntValue <= 220) {
            return q03.r.f(new z0.e.c(iIntValue));
        }
        q03.r<c83.a0<rn2.v>> rVarO = sVar.R0().f165633b.o();
        tn2.k0 k0Var = new tn2.k0(new tn2.m(24), 6);
        rVarO.getClass();
        int i14 = w03.b.f181178a;
        return new e13.o(new e13.o(rVarO, k0Var), new h(new cf.a0(iIntValue, 9), 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0.e.b z1(int i14, rn2.v vVar) {
        vVar.getClass();
        return new z0.e.b(vVar.getEmailAddress(), i14);
    }

    @Override // vn2.z0
    public q03.b B(z0.e cardRemovalState, e23.l<? super Long, Unit> longWaitingCallback) {
        cardRemovalState.getClass();
        int i14 = cardRemovalState.f178979a;
        longWaitingCallback.getClass();
        int i15 = a.f178945a[T1().ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return R0().n(getCid(), String.valueOf(i14), longWaitingCallback);
            }
            if (i15 == 3) {
                return R0().c(i14, getCid(), longWaitingCallback);
            }
            if (i15 == 4) {
                return R0().b(longWaitingCallback, getCid());
            }
            lc.u0.r();
            return null;
        }
        if (cardRemovalState instanceof z0.e.c) {
            return R0().n(getCid(), String.valueOf(i14), longWaitingCallback);
        }
        if (cardRemovalState instanceof z0.e.b) {
            return R0().c(i14, getCid(), longWaitingCallback);
        }
        if (cardRemovalState instanceof z0.e.a) {
            return R0().b(longWaitingCallback, getCid());
        }
        lc.u0.r();
        return null;
    }

    @Override // vn2.z0
    public q03.r<tn2.y0.c> D(final boolean force) {
        Callable callable = new Callable() { // from class: vn2.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.C1(force, this);
            }
        };
        int i14 = w03.b.f181178a;
        return new e13.b(callable);
    }

    @Override // vn2.z0
    public q03.r<Boolean> E0() {
        return R0().k(getCid());
    }

    @Override // vn2.z0
    public q03.r<o13.p<List<vr2.q>, Optional<hs2.c>>> P() {
        r rVar = new r(this, 1);
        int i14 = w03.b.f181178a;
        return new e13.j(new e13.m(rVar), new h(new q(this, 2), 17));
    }

    @Override // vn2.z0
    /* JADX INFO: renamed from: V, reason: from getter */
    public String getCid() {
        return this.cid;
    }

    @Override // vn2.z0
    public q03.b W() {
        r rVar = new r(this, 3);
        int i14 = w03.b.f181178a;
        return new z03.d(rVar);
    }

    @Override // vn2.z0
    public boolean c() {
        return P0().f165680a.s();
    }

    @Override // vn2.z0
    public q03.b e(tn2.f0.a functionality) {
        functionality.getClass();
        return R0().g(functionality);
    }

    @Override // vn2.z0
    public q03.r<Optional<as2.b<Integer>>> f() {
        r rVar = new r(this, 2);
        int i14 = w03.b.f181178a;
        return new e13.b(rVar);
    }

    @Override // vn2.z0
    public String getDeviceName() {
        return R0().f165641j;
    }

    @Override // vn2.z0
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // vn2.z0
    @uy2.k(description = "GooglePay is ready")
    public /* bridge */ q03.b i(Activity activity) {
        return super.i(activity);
    }

    @Override // vn2.z0
    public q03.r<Optional<as2.b<Integer>>> j() {
        r rVar = new r(this, 4);
        int i14 = w03.b.f181178a;
        return new e13.b(rVar);
    }

    @Override // vn2.z0
    public q03.b k0(e23.l<? super Long, Unit> longWaitingCallback) {
        longWaitingCallback.getClass();
        com.google.firebase.remoteconfig.b bVar = new com.google.firebase.remoteconfig.b(8, this, longWaitingCallback);
        int i14 = w03.b.f181178a;
        return new z03.d(bVar);
    }

    @Override // vn2.z0
    public q03.r<File> o0() {
        tn2.r0 r0VarR0 = R0();
        String cid = getCid();
        r0VarR0.getClass();
        cid.getClass();
        e13.j jVarT = r0VarR0.f165632a.t(new tn2.w.d(true, false, false, false, false, false, true, false, false, false, 958, null));
        tn2.k0 k0Var = new tn2.k0(new tn2.h0(r0VarR0, cid, 8), 24);
        int i14 = w03.b.f181178a;
        return new e13.j(jVarT, k0Var);
    }

    @Override // vn2.z0
    public q03.r<z0.e> p0() {
        e13.b bVarA = R0().f165643l.a(getCid(), true, false);
        h hVar = new h(new q(this, 4), 19);
        int i14 = w03.b.f181178a;
        return new e13.j(bVarA, hVar);
    }

    @Override // vn2.z0
    public q03.r<z0.b> q() {
        r rVar = new r(this, 0);
        int i14 = w03.b.f181178a;
        return new e13.b(rVar);
    }

    @Override // vn2.z0
    public String r() {
        String strT = w52.u0.t(R0().f165636e);
        strT.getClass();
        return strT;
    }

    @Override // vn2.z0
    public q03.r<pn2.e> t0() {
        r rVar = new r(this, 5);
        int i14 = w03.b.f181178a;
        return new e13.b(rVar);
    }

    @Override // vn2.z0
    public q03.b v0() {
        return R0().e();
    }

    @Override // vn2.z0
    public q03.b y(e23.l<? super Long, Unit> longWaitingCallback) {
        longWaitingCallback.getClass();
        return R0().b(longWaitingCallback, getCid());
    }
}
