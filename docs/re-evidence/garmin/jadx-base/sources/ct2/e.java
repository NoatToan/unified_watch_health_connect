package ct2;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.m;
import e2.b0;
import e2.f0;
import e2.x;
import e23.l;
import e23.p;
import f5.v1;
import g2.z0;
import j23.t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import o51.i;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.c3;
import p006l2.f3;
import p006l2.i3;
import p006l2.v3;
import p008y1.b2;
import p1.p0;
import p1.t0;
import p13.h0;
import p3.e0;
import p3.o;
import p3.p1;
import p3.p2;
import p3.r;
import p5.k0;
import rs2.y;
import s5.q0;
import s5.w0;
import u1.c2;
import v2.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55540d;

    public /* synthetic */ e(int i14, y yVar, byte[] bArr) {
        this.f55537a = 0;
        this.f55538b = i14;
        this.f55539c = yVar;
        this.f55540d = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) throws IOException {
        o oVar;
        int i14;
        o oVar2;
        int i15;
        String str;
        int i16 = this.f55537a;
        int i17 = 8;
        int i18 = 0;
        int i19 = this.f55538b;
        Object obj2 = this.f55540d;
        Object obj3 = this.f55539c;
        switch (i16) {
            case 0:
                ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
                int i24 = f.f55541g;
                byteArrayOutputStream.getClass();
                lg.d.P(byteArrayOutputStream, i19);
                byteArrayOutputStream.write(((y) obj3).f154466a);
                byteArrayOutputStream.write((byte[]) obj2);
                return Unit.INSTANCE;
            case 1:
                int iC = 0;
                l lVar = (l) obj3;
                x xVar = (x) obj2;
                z0.c cVar = (z0.c) obj;
                if (lVar != null) {
                    int iB = cVar.b();
                    for (int i25 = 0; i25 < iB; i25++) {
                        iC += (int) (xVar.f62556p == b2.Vertical ? cVar.c(i25) & 4294967295L : cVar.c(i25) >> 32);
                    }
                    lVar.invoke(new b0(i19, iC));
                }
                return Unit.INSTANCE;
            case 2:
                p pVar = (p) obj2;
                t41.h hVar = (t41.h) h0.e0(((Integer) obj).intValue(), ((i) obj3).f129269a);
                if (hVar != null) {
                    pVar.invoke(hVar, Integer.valueOf(i19));
                }
                return Unit.INSTANCE;
            case 3:
                p1 p1Var = (p1) obj3;
                p1 p1Var2 = (p1) obj2;
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                p1Var2.setValue(Boolean.valueOf(q0Var.d() || (((Boolean) p1Var.getF182175a()).booleanValue() && q0Var.f157281b.f157257f > i19)));
                return Unit.INSTANCE;
            case 4:
                v3 v3Var = (v3) obj3;
                v1 v1Var = (v1) obj2;
                v1.a aVar = (v1.a) obj;
                int i26 = v3Var.f108832b;
                f3 f3Var = v3Var.f108831a;
                x5.q0 q0Var2 = v3Var.f108833c;
                i3 i3VarInvoke = v3Var.f108834d.invoke();
                f3Var.a(b2.Vertical, c3.a(aVar, i26, q0Var2, i3VarInvoke != null ? i3VarInvoke.f108575a : null, false, v1Var.f69144a), i19, v1Var.f69145b);
                v1.a.B(aVar, v1Var, 0, Math.round(-f3Var.f108480a.getFloatValue()));
                return Unit.INSTANCE;
            case 5:
                p2 p2Var = (p2) obj3;
                p0 p0Var = (p0) obj2;
                o oVar3 = (o) obj;
                if (p2Var.f135220e == i19 && s.g(p0Var, p2Var.f135221f) && (oVar3 instanceof r)) {
                    long[] jArr = p0Var.f134873a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i27 = 0;
                        while (true) {
                            long j8 = jArr[i27];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i28 = 8 - ((~(i27 - length)) >>> 31);
                                int i29 = i18;
                                while (i29 < i28) {
                                    if ((255 & j8) < 128) {
                                        int i30 = (i27 << 3) + i29;
                                        Object obj4 = p0Var.f134874b[i30];
                                        boolean z14 = p0Var.f134875c[i30] != i19;
                                        if (z14) {
                                            i15 = i17;
                                            r rVar = (r) oVar3;
                                            t0<Object, Object> t0Var = rVar.f135235g;
                                            q3.f.b(t0Var, obj4, p2Var);
                                            oVar2 = oVar3;
                                            if (obj4 instanceof e0) {
                                                e0 e0Var = (e0) obj4;
                                                if (!t0Var.b(e0Var)) {
                                                    q3.f.c(rVar.f135238j, e0Var);
                                                }
                                                t0<e0<?>, Object> t0Var2 = p2Var.f135222g;
                                                if (t0Var2 != null) {
                                                    t0Var2.k((e0<?>) obj4);
                                                }
                                            }
                                        } else {
                                            oVar2 = oVar3;
                                            i15 = i17;
                                        }
                                        if (z14) {
                                            p0Var.g(i30);
                                        }
                                    } else {
                                        oVar2 = oVar3;
                                        i15 = i17;
                                    }
                                    j8 >>= i15;
                                    i29++;
                                    oVar3 = oVar2;
                                    i17 = i15;
                                }
                                oVar = oVar3;
                                i14 = i17;
                                if (i28 == i14) {
                                }
                            } else {
                                oVar = oVar3;
                                i14 = i17;
                            }
                            if (i27 != length) {
                                i27++;
                                oVar3 = oVar;
                                i17 = i14;
                                i18 = 0;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                i53.c cVar2 = (i53.c) obj3;
                String str2 = (String) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                if (cVar2 != null && (str = (String) h0.e0(i19, cVar2)) != null) {
                    str2 = str;
                }
                p5.h0.n(k0Var, str2);
                return Unit.INSTANCE;
            case 7:
                List list = (List) obj3;
                l lVar2 = (l) obj2;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0.b(f0Var, null, new z3.e(875375273, true, new af1.l(i19, list, i17)), 3);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        f0.b(f0Var, null, new z3.e(-2144471659, true, new o72.b(22, (id1.c.e) it.next(), lVar2)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 8:
                c2 c2Var = (c2) obj3;
                v1 v1Var2 = (v1) obj2;
                v1.a aVar2 = (v1.a) obj;
                int intValue = c2Var.f167421a.f167433a.getIntValue();
                if (intValue < 0) {
                    intValue = 0;
                }
                if (intValue > i19) {
                    intValue = i19;
                }
                int i34 = c2Var.f167422b ? intValue - i19 : -intValue;
                boolean z15 = c2Var.f167423c;
                int i35 = z15 ? 0 : i34;
                if (!z15) {
                    i34 = 0;
                }
                aVar2.f69149a = true;
                v1.a.E(aVar2, v1Var2, i35, i34);
                Unit unit = Unit.INSTANCE;
                aVar2.f69149a = false;
                return Unit.INSTANCE;
            case 9:
                String str3 = (String) obj3;
                List<s5.c.d<s5.c.a>> list2 = (List) obj2;
                u2.d dVar = (u2.d) obj;
                w0 w0Var = dVar.f167834e;
                if (w0Var != null) {
                    long j14 = w0Var.f157317a;
                    int i36 = (int) (j14 >> 32);
                    r0.b(dVar, i36, (int) (4294967295L & j14), str3);
                    if (str3.length() > 0) {
                        dVar.d(i36, str3.length() + i36, list2);
                    }
                } else {
                    long j15 = dVar.f167833d;
                    w0.a aVar3 = w0.f157315b;
                    int i37 = (int) (j15 >> 32);
                    r0.b(dVar, i37, (int) (4294967295L & j15), str3);
                    if (str3.length() > 0) {
                        dVar.d(i37, str3.length() + i37, list2);
                    }
                }
                long j16 = dVar.f167833d;
                w0.a aVar4 = w0.f157315b;
                int i38 = (int) (j16 >> 32);
                int iE = t.e(i19 > 0 ? (i38 + i19) - 1 : (i38 + i19) - str3.length(), 0, dVar.f167831b.length());
                dVar.f(og.a.l(iE, iE));
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b bVar = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b) obj3;
                fz.c cVar3 = (fz.c) obj2;
                zm.p pVar2 = (zm.p) obj;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m;
                g22.e.f(bVar);
                bVar.w6().removeAllViews();
                if (pVar2 != null) {
                    m mVarRequireActivity = bVar.requireActivity();
                    mVarRequireActivity.getClass();
                    int i39 = this.f55538b;
                    wo.e eVar = new wo.e(mVarRequireActivity, pVar2, i39, null, cVar3, true);
                    bVar.f29320g = eVar;
                    LinearLayout linearLayout = bVar.f29319f;
                    if (linearLayout == null) {
                        s.m("legendContainer");
                        throw null;
                    }
                    eVar.f205210i = linearLayout;
                    FrameLayout frameLayoutW6 = bVar.w6();
                    wo.e eVar2 = bVar.f29320g;
                    frameLayoutW6.addView(eVar2 != null ? eVar2.d(bVar.w6()) : null);
                    wo.e eVar3 = bVar.f29320g;
                    if (eVar3 != null) {
                        eVar3.R(i39);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, int i14, Object obj2, int i15) {
        this.f55537a = i15;
        this.f55539c = obj;
        this.f55538b = i14;
        this.f55540d = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i14, int i15) {
        this.f55537a = i15;
        this.f55539c = obj;
        this.f55540d = obj2;
        this.f55538b = i14;
    }
}
