package w2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.garmin.android.apps.connectmobile.R;
import com.google.common.net.HttpHeaders;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import lc.m0;
import lc.v0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.m2;
import p006l2.n0;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x1.k f181280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p f181281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f181282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m2 f181283d;

        public a(x1.k kVar, e23.p pVar, n nVar, m2 m2Var) {
            this.f181280a = kVar;
            this.f181281b = pVar;
            this.f181282c = nVar;
            this.f181283d = m2Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f181281b.invoke(this.f181282c, this.f181283d);
            this.f181280a.f188365a.setValue(x1.k.a.C3505a.f188366a);
            return Unit.INSTANCE;
        }
    }

    public static final void a(n50.e eVar, e23.l lVar, p3.m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(37529455);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d40.a.a(gl1.y.Q(o0VarE, R.string.custom_course_creator_description), eVar, lVar, o0VarE, (i15 << 3) & 1008);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m30.e(eVar, lVar, i14, i16);
        }
    }

    public static final void b(rd1.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, p3.m mVar, int i14) {
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(-580533044);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024) | (o0VarE.r(lVar4) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            qd1.a aVar2 = aVar.f152032a;
            boolean z14 = aVar2.f144475a;
            b63.v vVar = aVar2.f144477c;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_morning_reminders);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_morning_reminders_description);
            qd1.a aVar3 = aVar.f152033b;
            v02.b.a(z14, vVar, strQ, strQ2, aVar3.f144475a, aVar3.f144477c, gl1.y.Q(o0VarE, R.string.lbl_evening_reminders), gl1.y.Q(o0VarE, R.string.msg_evening_reminders_description), lVar, lVar2, lVar3, lVar4, o0VarE, (i15 << 21) & 2113929216, (i15 >> 9) & 126);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ew0.w(aVar, lVar, lVar2, lVar3, lVar4, i14, 1);
        }
    }

    public static final void c(Long l14, m0 m0Var, e23.a aVar, p3.m mVar, int i14) {
        m0 m0Var2;
        m0 m0VarI;
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(-831874680);
        int i16 = 2;
        int i17 = i14 | (o0VarE.B(l14) ? 4 : 2) | 16 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                m0VarI = gl1.y.I(new v0[0], o0VarE);
                i15 = i17 & (-113);
            } else {
                o0VarE.e();
                i15 = i17 & (-113);
                m0VarI = m0Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            ey1.a aVarN = zf.b.N(o0VarE);
            aVarN.f67285q = l14;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(aVarN) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new yx1.d(aVarN, aVar, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarE);
            String strC = (aVarN.f67285q != null ? by1.v.f22216a : by1.x.f22221a).c();
            boolean zR2 = o0VarE.r(m0VarI);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new mt1.a(m0VarI, feVar, i16);
                o0VarE.K(objQ3);
            }
            nc.y.b(m0VarI, strC, null, null, null, null, null, null, (e23.l) objQ3, o0VarE, 0, 1020);
            boolean zR3 = o0VarE.r(aVarN);
            Object objQ4 = o0VarE.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new yx1.e(aVarN, feVar, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, unit, o0VarE);
            m0Var2 = m0VarI;
        } else {
            o0VarE.e();
            m0Var2 = m0Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(l14, m0Var2, aVar, i14, 24);
        }
    }

    public static String d() {
        int i14 = zg.c.f204673a;
        String strC = w3.x.c("ro.aliyun.clouduuid");
        if (TextUtils.isEmpty(strC)) {
            strC = w3.x.c("ro.sys.aliyun.clouduuid");
        }
        if (TextUtils.isEmpty(strC)) {
            try {
                strC = (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", null).invoke(null, null);
            } catch (Exception unused) {
                strC = "";
            }
        }
        if (!zg.c.b(strC)) {
            return strC;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bArrD = w13.b.d(iCurrentTimeMillis);
        byte[] bArrD2 = w13.b.d(iNanoTime);
        byte[] bArrD3 = w13.b.d(iNextInt);
        byte[] bArrD4 = w13.b.d(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrD, 0, bArr, 0, 4);
        System.arraycopy(bArrD2, 0, bArr, 4, 4);
        System.arraycopy(bArrD3, 0, bArr, 8, 4);
        System.arraycopy(bArrD4, 0, bArr, 12, 4);
        return zg.a.c(bArr);
    }

    public static final String e(z51.h hVar) {
        hVar.getClass();
        List<String> list = hVar.f202514j;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) p13.h0.d0(list);
    }

    public static final Object f(q03.v vVar, v13.c cVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(cVar), 1);
        kVar.q();
        vVar.a(new w53.b(kVar));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final Object g(z03.d dVar, v13.c cVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(cVar), 1);
        kVar.q();
        dVar.a(new w53.a(kVar));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public static final void h(x1.i iVar, x1.k kVar, e23.p pVar, n nVar, m2 m2Var, boolean z14) {
        if (z14) {
            x1.i.b(iVar, new n0(m2Var), null, new a(kVar, pVar, nVar, m2Var), 14);
        }
    }

    public static final String i(sd2.f fVar) {
        fVar.getClass();
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        if (!d53.w.J(displayName)) {
            return displayName;
        }
        String productDisplayName = fVar.getProductDisplayName();
        productDisplayName.getClass();
        return d53.w.J(productDisplayName) ? "--" : productDisplayName;
    }

    public static final s5.c j(x5.l0 l0Var) {
        s5.c cVar = l0Var.f188878a;
        long j8 = l0Var.f188879b;
        cVar.getClass();
        return cVar.subSequence(w0.h(j8), w0.g(j8));
    }

    public static final s5.c k(x5.l0 l0Var, int i14) {
        s5.c cVar = l0Var.f188878a;
        s5.c cVar2 = l0Var.f188878a;
        long j8 = l0Var.f188879b;
        int iG = w0.g(j8);
        int iG2 = w0.g(j8);
        int length = iG2 + i14;
        if (((i14 ^ length) & (iG2 ^ length)) < 0) {
            length = cVar2.f157138b.length();
        }
        return cVar.subSequence(iG, Math.min(length, cVar2.f157138b.length()));
    }

    public static final s5.c l(x5.l0 l0Var, int i14) {
        s5.c cVar = l0Var.f188878a;
        long j8 = l0Var.f188879b;
        int iH = w0.h(j8);
        int i15 = iH - i14;
        if (((iH ^ i15) & (i14 ^ iH)) < 0) {
            i15 = 0;
        }
        return cVar.subSequence(Math.max(0, i15), w0.h(j8));
    }

    public static final void m(LottieAnimationView lottieAnimationView, List list, Integer num) {
        if (lottieAnimationView != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lottieAnimationView.addValueCallback((KeyPath) it.next(), LottieProperty.COLOR, new xw.b(num, 21));
            }
        }
    }

    public static final void n(LottieAnimationView lottieAnimationView, List list, List list2, int i14, int i15, int i16, zw1.c cVar) {
        cVar.getClass();
        m(lottieAnimationView, cVar.Q, Integer.valueOf(i16));
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                List<KeyPath> listB = cVar.b((String) it.next());
                if (listB != null) {
                    arrayList.add(listB);
                }
            }
            m(lottieAnimationView, p13.y.s(arrayList), Integer.valueOf(i15));
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                List<KeyPath> listB2 = cVar.b((String) it3.next());
                if (listB2 != null) {
                    arrayList2.add(listB2);
                }
            }
            m(lottieAnimationView, p13.y.s(arrayList2), Integer.valueOf(i14));
        }
    }

    public static final boolean o(sd2.f fVar) {
        fVar.getClass();
        return fVar.isPaired() && fVar.i1() && fVar.getConnectionType() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    public static final boolean p(xn2.w wVar, CharSequence charSequence, CharSequence charSequence2, DateTime dateTime, pn2.u uVar, CharSequence charSequence3) {
        boolean z14;
        sy2.d dVar = (sy2.d) wVar;
        ((xn2.y) dVar.getView()).k0();
        if (charSequence == null || d53.w.J(charSequence)) {
            ((xn2.y) dVar.getView()).q3(R.id.last_name, w5.r.u(R.string.wallet_error_hint_suica_last_name_is_required), true);
        } else {
            if (charSequence.length() <= 10) {
                if (new d53.k("^[ァ-ロワン-ヴヲ０-９Ａ-Ｚ．ー－]+$").d(charSequence)) {
                    z14 = false;
                } else {
                    ((xn2.y) dVar.getView()).q3(R.id.last_name, w5.r.u(R.string.wallet_error_hint_contains_forbidden_characters), true);
                }
                if (charSequence2 != null || d53.w.J(charSequence2)) {
                    ((xn2.y) dVar.getView()).q3(R.id.first_name, w5.r.u(R.string.wallet_error_hint_suica_first_name_is_required), !z14);
                } else {
                    if (charSequence2.length() <= 10) {
                        if (!new d53.k("^[ァ-ロワン-ヴヲ０-９Ａ-Ｚ．ー－]+$").d(charSequence2)) {
                            ((xn2.y) dVar.getView()).q3(R.id.first_name, w5.r.u(R.string.wallet_error_hint_contains_forbidden_characters), !z14);
                        }
                        if (dateTime == null) {
                            ((xn2.y) dVar.getView()).q3(R.id.birthday, w5.r.u(R.string.wallet_error_hint_suica_birth_date_is_required), !z14);
                            z14 = true;
                        }
                        if (uVar == null) {
                            ((xn2.y) dVar.getView()).q3(R.id.gender, w5.r.u(R.string.wallet_error_hint_gender_is_required), !z14);
                            z14 = true;
                        }
                        if (charSequence3 != null || d53.w.J(charSequence3)) {
                            ((xn2.y) dVar.getView()).q3(R.id.phone_number, w5.r.u(R.string.wallet_error_hint_phone_number_required), !z14);
                            return true;
                        }
                        if (charSequence3.length() != 11) {
                            ((xn2.y) dVar.getView()).q3(R.id.phone_number, w5.r.u(R.string.wallet_error_hint_mobile_phone_number_incorrect), !z14);
                            return true;
                        }
                        if (new d53.k("[0-9]*").d(charSequence3)) {
                            return z14;
                        }
                        ((xn2.y) dVar.getView()).q3(R.id.phone_number, w5.r.u(R.string.wallet_error_hint_half_width_number_only), !z14);
                        return true;
                    }
                    ((xn2.y) dVar.getView()).q3(R.id.first_name, w5.r.u(R.string.wallet_error_hint_exceeded_10_characters), !z14);
                }
                z14 = true;
                if (dateTime == null) {
                    ((xn2.y) dVar.getView()).q3(R.id.birthday, w5.r.u(R.string.wallet_error_hint_suica_birth_date_is_required), !z14);
                    z14 = true;
                }
                if (uVar == null) {
                    ((xn2.y) dVar.getView()).q3(R.id.gender, w5.r.u(R.string.wallet_error_hint_gender_is_required), !z14);
                    z14 = true;
                }
                if (charSequence3 != null) {
                }
                ((xn2.y) dVar.getView()).q3(R.id.phone_number, w5.r.u(R.string.wallet_error_hint_phone_number_required), !z14);
                return true;
            }
            ((xn2.y) dVar.getView()).q3(R.id.last_name, w5.r.u(R.string.wallet_error_hint_exceeded_10_characters), true);
        }
        z14 = true;
        if (charSequence2 != null) {
            ((xn2.y) dVar.getView()).q3(R.id.first_name, w5.r.u(R.string.wallet_error_hint_suica_first_name_is_required), !z14);
            z14 = true;
        } else {
            ((xn2.y) dVar.getView()).q3(R.id.first_name, w5.r.u(R.string.wallet_error_hint_suica_first_name_is_required), !z14);
            z14 = true;
        }
        if (dateTime == null) {
            ((xn2.y) dVar.getView()).q3(R.id.birthday, w5.r.u(R.string.wallet_error_hint_suica_birth_date_is_required), !z14);
            z14 = true;
        }
        if (uVar == null) {
            ((xn2.y) dVar.getView()).q3(R.id.gender, w5.r.u(R.string.wallet_error_hint_gender_is_required), !z14);
            z14 = true;
        }
        if (charSequence3 != null) {
        }
        ((xn2.y) dVar.getView()).q3(R.id.phone_number, w5.r.u(R.string.wallet_error_hint_phone_number_required), !z14);
        return true;
    }

    public static void q(ImageView imageView, boolean z14) {
        imageView.getClass();
        imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(imageView.getContext(), z14 ? R.color.gcm_icon_primary_action_disabled : R.color.gcm_icon_primary_action)));
    }

    public static final Integer r(z51.h hVar) {
        List<String> list = hVar.f202514j;
        if (list == null || list.isEmpty()) {
            return Integer.valueOf(R.string.activity_type_timed_activity);
        }
        return null;
    }

    public static final l22.a s(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return new l22.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
    }

    public static final String t(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((wh.e) next).f185221a.equalsIgnoreCase(HttpHeaders.CONTENT_TYPE));
        wh.e eVar = (wh.e) next;
        if (eVar != null) {
            return eVar.f185222b;
        }
        return null;
    }
}
