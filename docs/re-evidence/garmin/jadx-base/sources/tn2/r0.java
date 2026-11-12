package tn2;

import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.util.gson.GCMEnumTypeAdapterFactory;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.b4;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Ltn2/r0;", "Las2/i;", "", "Ltn2/w;", "felicaDeviceService", "Lmn2/b;", "felicaApi", "Lmn2/o;", "gcsCiqImageApi", "Lmn2/k;", "gcNfcApi", "Lsd2/f;", "deviceRecord", "<init>", "(Ltn2/w;Lmn2/b;Lmn2/o;Lmn2/k;Lsd2/f;)V", "a", "b", "d", JWKParameterNames.RSA_EXPONENT, "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 implements as2.i<Integer> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f165631n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f165632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2.b f165633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn2.o f165634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mn2.k f165635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd2.f f165636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pn2.n f165637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pn2.o f165638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f165639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f165640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f165641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f165642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final as2.f<Integer> f165643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f165644m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltn2/r0$b;", "", "", "resultConfirmId", "xMfiVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f165645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f165646b;

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f165645a = str;
            this.f165646b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f165645a.equals(bVar.f165645a) && this.f165646b.equals(bVar.f165646b);
        }

        public final int hashCode() {
            return this.f165646b.hashCode() + (this.f165645a.hashCode() * 31);
        }

        public final String toString() {
            return v.e0.g("EndApiCallParameter(resultConfirmId=", this.f165645a, ", xMfiVersion=", this.f165646b, ")");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B{\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f0\u000b0\t\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\t¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ltn2/r0$c;", "Ltn2/r0$d;", "Lrn2/q;", "Ltn2/r0;", "", "operationId", "seId", "serviceId", "chipDestinationId", "Lkotlin/Function1;", "Ltn2/r0$b;", "Lq03/r;", "Lc83/a0;", "Lpn2/p;", "callEndApi", "", "onResumeEndApiError", "", "", "longWaitingCallback", "<init>", "(Ltn2/r0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/l;Le23/l;Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends d<rn2.q> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ r0 f165647k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0 r0Var, String str, String str2, String str3, String str4, e23.l<? super b, ? extends q03.r<c83.a0<pn2.p<rn2.q>>>> lVar, e23.l<? super Throwable, ? extends q03.r<rn2.q>> lVar2, e23.l<? super Long, Unit> lVar3) {
            super(r0Var, str, str2, str3, str4, lVar, lVar2, lVar3);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
            this.f165647k = r0Var;
        }

        @Override // tn2.r0.d
        public final e13.b e(c83.a0 a0Var, String str) {
            a0Var.getClass();
            o oVar = new o(a0Var, this, this.f165647k, str, 1);
            int i14 = w03.b.f181178a;
            return new e13.b(oVar);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b¦\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B{\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b0\t\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\t¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ltn2/r0$d;", "Lpn2/d;", "R", "", "", "operationId", "seId", "serviceId", "chipDestinationId", "Lkotlin/Function1;", "Ltn2/r0$b;", "Lq03/r;", "Lc83/a0;", "Lpn2/p;", "callEndApi", "", "onResumeEndApiError", "", "", "longWaitingCallback", "<init>", "(Ltn2/r0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/l;Le23/l;Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class d<R extends pn2.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f165648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f165649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f165650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f165651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.l<b, q03.r<c83.a0<pn2.p<R>>>> f165652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.l<Throwable, q03.r<R>> f165653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.l<Long, Unit> f165654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f165655h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f165656i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ r0 f165657j;

        /* JADX WARN: Multi-variable type inference failed */
        public d(r0 r0Var, String str, String str2, String str3, String str4, e23.l<? super b, ? extends q03.r<c83.a0<pn2.p<R>>>> lVar, e23.l<? super Throwable, ? extends q03.r<R>> lVar2, e23.l<? super Long, Unit> lVar3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
            this.f165657j = r0Var;
            this.f165648a = str;
            this.f165649b = str2;
            this.f165650c = str3;
            this.f165651d = str4;
            this.f165652e = lVar;
            this.f165653f = lVar2;
            this.f165654g = lVar3;
        }

        public static e13.n a(pn2.d dVar) throws FNValidateException {
            T t7 = new b1(dVar).f165529a;
            if (t7 instanceof rn2.r) {
                rn2.r rVar = (rn2.r) t7;
                b1.a(rVar.getResultCode(), rVar.getResultMessage());
            } else if (t7 instanceof rn2.q) {
                rn2.q qVar = (rn2.q) t7;
                String resultCode = qVar.getResultCode();
                resultCode.getClass();
                b1.a(resultCode, qVar.getResultMessage());
            } else {
                if (!(t7 instanceof rn2.p)) {
                    vb.h.s("Developer!! Fix me!! You should handle ".concat(t7.getClass().getName()));
                    return null;
                }
                rn2.p pVar = (rn2.p) t7;
                b1.a(pVar.getResultCode(), pVar.getResultMessage());
            }
            return q03.r.f(dVar);
        }

        public final e13.c b(String str, String str2, String str3, String str4) {
            com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
            e13.p pVarA = ks2.e.a(this.f165657j.f165632a.f165680a);
            p0 p0Var = new p0(new b4(this, this.f165648a, this.f165651d, str, str3, str4, this.f165649b, this.f165650c, this.f165657j, 6), 14);
            int i14 = w03.b.f181178a;
            return new z03.o(new e13.k(pVarA, p0Var), new p0(new s0(this, str2, str4), 12)).c(new e13.b(new com.airbnb.lottie.k(this, str2, 4, str4)));
        }

        public final e13.b c(c83.a0 a0Var, String str) {
            a0Var.getClass();
            str.getClass();
            com.airbnb.lottie.k kVar = new com.airbnb.lottie.k(a0Var, 3, this, str);
            int i14 = w03.b.f181178a;
            return new e13.b(kVar);
        }

        public final e13.k d(String str, String str2, String str3, pn2.m mVar, ul2.c cVar, String str4, String str5) {
            r0 r0Var = this.f165657j;
            mn2.b bVar = r0Var.f165633b;
            String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
            Logger logger = mn2.j.f119822a;
            bVar.getClass();
            strValueOf.getClass();
            q03.r<c83.a0<pn2.p<rn2.b>>> rVarI = bVar.i(strValueOf, str2, str3, mVar);
            mn2.e eVar = new mn2.e(new mn2.d(this.f165654g, bVar, strValueOf, str2, str3, mVar, 9), 18);
            rVarI.getClass();
            int i14 = w03.b.f181178a;
            return new e13.k(new e13.j(rVarI, eVar), new p0(new b4(this.f165657j, cVar, this, str, mVar, str4, str5, str2, str3, 5), 8));
        }

        public abstract e13.b e(c83.a0 a0Var, String str);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0012\u0004\u0012\u00028\u00000\u0003R\u00020\u0004B{\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012$\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r0\f0\n\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\n\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\n¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ltn2/r0$e;", "Lpn2/d;", "R", "Ltn2/r0$d;", "Ltn2/r0;", "", "operationId", "seId", "serviceId", "chipDestinationId", "Lkotlin/Function1;", "Ltn2/r0$b;", "Lq03/r;", "Lc83/a0;", "Lpn2/p;", "callEndApi", "", "onResumeEndApiError", "", "", "longWaitingCallback", "<init>", "(Ltn2/r0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/l;Le23/l;Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e<R extends pn2.d> extends d<R> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r0 r0Var, String str, String str2, String str3, String str4, e23.l<? super b, ? extends q03.r<c83.a0<pn2.p<R>>>> lVar, e23.l<? super Throwable, ? extends q03.r<R>> lVar2, e23.l<? super Long, Unit> lVar3) {
            super(r0Var, str, str2, str3, str4, lVar, lVar2, lVar3);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
        }

        @Override // tn2.r0.d
        public final e13.b e(c83.a0 a0Var, String str) {
            a0Var.getClass();
            mn2.q qVar = new mn2.q(a0Var, this);
            int i14 = w03.b.f181178a;
            return new e13.b(qVar);
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165658a;

        static {
            int[] iArr = new int[pn2.a.f.values().length];
            try {
                iArr[pn2.a.f.FnTest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pn2.a.f.Prod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pn2.a.f.FnCertificate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pn2.a.f.SonyLab.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f165658a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.a<String> {
        public g(Object obj) {
            super(0, obj, r0.class, "getFNDeviceName", "getFNDeviceName()Ljava/lang/String;", 0);
        }

        @Override // e23.a
        public final String invoke() {
            String string;
            r0 r0Var = (r0) this.receiver;
            Logger logger = r0.f165631n;
            r0Var.getClass();
            pn2.a.f138690a.getClass();
            wr2.p.f186870a.getClass();
            SharedPreferences sharedPreferencesA = wr2.p.a("general_app");
            if (sharedPreferencesA != null) {
                String string2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.felica_device_name_overwrite);
                string2.getClass();
                string = sharedPreferencesA.getString(string2, null);
            } else {
                string = null;
            }
            if (string != null) {
                return string;
            }
            int i14 = f.f165658a[pn2.a.d().ordinal()];
            if (i14 == 1) {
                return String.valueOf(r0Var.f165632a.f165681b.getProductNumber());
            }
            if (i14 != 2 && i14 != 3 && i14 != 4) {
                lc.u0.r();
                return null;
            }
            String applicationKey = r0Var.f165636e.getApplicationKey();
            applicationKey.getClass();
            return applicationKey;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f165631n = gt2.b.f79005a.h("PAY#FN#FelicaService");
    }

    public r0(w wVar, mn2.b bVar, mn2.o oVar, mn2.k kVar, sd2.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            ln2.e eVar = ln2.e.f113687a;
            Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new GCMEnumTypeAdapterFactory()).registerTypeAdapterFactory(new GsonUtil.BundleTypeAdapterFactory()).setExclusionStrategies(new com.garmin.android.apps.connectmobile.util.gson.a()).create();
            gsonCreate.getClass();
            eVar.getClass();
            Object objB = ln2.e.b(gsonCreate).b(mn2.b.class);
            objB.getClass();
            bVar = (mn2.b) objB;
        }
        mn2.b bVar2 = bVar;
        if ((i14 & 4) != 0) {
            ln2.e.f113687a.getClass();
            Object objB2 = ln2.e.c().b(mn2.o.class);
            objB2.getClass();
            oVar = (mn2.o) objB2;
        }
        mn2.o oVar2 = oVar;
        if ((i14 & 8) != 0) {
            ln2.e.f113687a.getClass();
            Object objB3 = ln2.e.a().b(mn2.k.class);
            objB3.getClass();
            kVar = (mn2.k) objB3;
        }
        mn2.k kVar2 = kVar;
        if ((i14 & 16) != 0) {
            k0 k0Var = new k0(wVar, 3);
            int i15 = w03.b.f181178a;
            T tC = new e13.a(k0Var).j(l13.a.f108328c).c();
            tC.getClass();
            fVar = (sd2.f) tC;
        }
        this(wVar, bVar2, oVar2, kVar2, fVar);
    }

    public static com.garmin.device.nfc.h[] p(rn2.i iVar) {
        byte[] bytes = iVar.getCid().getBytes(d53.c.f57666b);
        bytes.getClass();
        com.garmin.device.nfc.h hVarI = com.garmin.device.nfc.h.i(bytes);
        qs2.a aVar = qs2.a.f147386o;
        com.garmin.device.nfc.h hVarH = com.garmin.device.nfc.h.h(aVar.f147399d);
        com.garmin.device.nfc.h hVar = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_ISSUER_NAME, "JRE".getBytes());
        com.garmin.device.nfc.h hVar2 = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_ACTIVE, new byte[]{1});
        wr2.k kVar = wr2.k.f186863a;
        byte[] bArrC = wq2.a.c(iVar.getAppletInstanceAid());
        kVar.getClass();
        return new com.garmin.device.nfc.h[]{hVarI, hVarH, hVar, hVar2, new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CREDIT_CARD_HASH, wr2.k.a("Suica", aVar, bArrC, (byte) 1)), new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_DESCRIPTION, "Suica".getBytes()), new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_TOP_OF_WALLET_APDU, wq2.a.c(iVar.getAppletInstanceAid()))};
    }

    public static e13.b r(String str, Throwable th3) {
        o0 o0Var = new o0(1, str, th3);
        int i14 = w03.b.f181178a;
        return new e13.b(o0Var);
    }

    public final z03.j a(String str, String str2, String str3, e23.l lVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        lVar.getClass();
        e13.j jVarT = this.f165632a.t(new w.d(true, false, false, false, true, false, true, false, false, false, 942, null));
        v vVar = new v(new g0(1, lVar, str, str2, str3, this), 29);
        int i14 = w03.b.f181178a;
        return new z03.j(new e13.j(jVarT, vVar));
    }

    public final z03.a b(e23.l lVar, String str) {
        str.getClass();
        e13.k kVarD = d(str);
        w wVar = this.f165632a;
        wVar.getClass();
        com.google.firebase.remoteconfig.b bVar = new com.google.firebase.remoteconfig.b(5, wVar, str);
        int i14 = w03.b.f181178a;
        return kVarD.d(new z03.d(bVar)).d(wVar.o()).d(new e13.k(new e13.j(wVar.t(new w.d(true, false, false, false, true, false, true, false, false, false, 942, null)), new v(new j0(this, str, lVar, 0), 24)), new v(new h0(this, str, 2), 25)));
    }

    public final z03.a c(int i14, String str, e23.l lVar) {
        str.getClass();
        e13.k kVarD = d(str);
        w wVar = this.f165632a;
        wVar.getClass();
        com.google.firebase.remoteconfig.b bVar = new com.google.firebase.remoteconfig.b(5, wVar, str);
        int i15 = w03.b.f181178a;
        return kVarD.d(new z03.d(bVar)).d(wVar.o()).d(new e13.k(new e13.j(wVar.t(new w.d(true, false, false, false, true, false, true, false, false, false, 942, null)), new k0(new cw1.k0(this, str, lVar, i14), 0)), new k0(new h0(this, str, 3), 1)));
    }

    public final e13.k d(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(d53.c.f57666b);
        bytes.getClass();
        w wVar = this.f165632a;
        wVar.getClass();
        e13.p pVarB = ks2.e.b(wVar.f165680a);
        int i14 = 2;
        n nVar = new n(new ct2.d(bytes, i14), i14);
        int i15 = w03.b.f181178a;
        return new e13.k(pVarB, nVar);
    }

    public final e13.k e() {
        e13.j jVarT = this.f165632a.t(new w.d(false, false, false, false, false, false, false, false, true, false, 767, null));
        k0 k0Var = new k0(new m(22), 2);
        int i14 = w03.b.f181178a;
        return new e13.k(jVarT, k0Var);
    }

    @Override // as2.i
    public final void f(String str, as2.b<Integer> bVar) {
        Object next;
        j.a aVar;
        str.getClass();
        int iIntValue = bVar.a().intValue();
        long lastBalanceSyncTimeStamp = bVar.getLastBalanceSyncTimeStamp();
        j jVar = this.f165642k;
        jVar.getClass();
        Iterator it = jVar.f165578a.j(jVar.f165579b, "FELICA").iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((fs2.a) next).f73426a, str));
        fs2.a aVar2 = (fs2.a) next;
        if (aVar2 == null || (aVar = (j.a) fs2.a.f(aVar2, j.a.class)) == null) {
            return;
        }
        rn2.i iVarD = aVar.getCardInfo();
        qs2.f fVar = aVar2.f73433h;
        fVar.getClass();
        jVar.a(iVarD, fVar, new as2.b<>(Integer.valueOf(iIntValue), lastBalanceSyncTimeStamp));
    }

    public final z03.h g(f0.a aVar) {
        f0 f0Var = this.f165639h;
        f0Var.getClass();
        o62.b0 b0Var = new o62.b0(13, f0Var, aVar);
        int i14 = w03.b.f181178a;
        return new z03.h(b0Var);
    }

    @Override // as2.i
    public final Optional<as2.b<Integer>> getBy(String str) {
        Object next;
        str.getClass();
        j jVar = this.f165642k;
        Iterator it = jVar.f165578a.j(jVar.f165579b, "FELICA").iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((fs2.a) next).f73426a, str));
        fs2.a aVar = (fs2.a) next;
        if (aVar != null) {
            j.a aVar2 = (j.a) fs2.a.f(aVar, j.a.class);
            Optional<as2.b<Integer>> optionalFromNullable = Optional.fromNullable(aVar2 != null ? aVar2.b() : null);
            if (optionalFromNullable != null) {
                return optionalFromNullable;
            }
        }
        Optional<as2.b<Integer>> optionalAbsent = Optional.absent();
        optionalAbsent.getClass();
        return optionalAbsent;
    }

    public final e13.j h() {
        e13.j jVarT = this.f165632a.t(new w.d(true, false, false, false, false, false, true, false, false, false, 958, null));
        k0 k0Var = new k0(new i0(this, 3), 13);
        int i14 = w03.b.f181178a;
        return new e13.j(jVarT, k0Var);
    }

    public final e13.j i(String str) {
        str.getClass();
        e13.j jVarT = this.f165632a.t(new w.d(true, false, false, false, false, false, true, false, false, false, 958, null));
        k0 k0Var = new k0(new h0(this, str, 5), 9);
        int i14 = w03.b.f181178a;
        return new e13.j(jVarT, k0Var);
    }

    public final e13.k j() {
        w wVar = this.f165632a;
        e13.p pVarA = ks2.e.a(wVar.f165680a);
        n nVar = new n(new l(wVar, 1), 3);
        int i14 = w03.b.f181178a;
        return new e13.k(new e13.j(pVarA, nVar), new v(new i0(this, 0), 23));
    }

    public final e13.o k(String str) {
        str.getClass();
        e13.j jVarT = this.f165632a.t(new w.d(false, false, false, false, false, false, false, false, false, true, 511, null));
        v vVar = new v(new s70.r0(str, 21), 28);
        int i14 = w03.b.f181178a;
        return new e13.o(jVarT, vVar);
    }

    public final e13.j l(pn2.t tVar, String str, String str2, e23.l lVar, e23.l lVar2) {
        lVar.invoke(0);
        e13.j jVarM = m(tVar, str, str2, lVar, lVar2);
        k0 k0Var = new k0(new sy.i(20, lVar, this), 21);
        int i14 = w03.b.f181178a;
        return new e13.j(jVarM, k0Var);
    }

    public final e13.j m(pn2.t tVar, String str, String str2, e23.l lVar, e23.l lVar2) {
        e13.j jVarT = this.f165632a.t(new w.d(true, false, true, false, true, false, true, false, false, false, 938, null));
        p0 p0Var = new p0(new q0(lVar, this, tVar, str, str2, lVar2), 1);
        int i14 = w03.b.f181178a;
        return new e13.j(jVarT, p0Var);
    }

    public final z03.a n(String str, String str2, e23.l lVar) {
        str.getClass();
        str2.getClass();
        e13.k kVarD = d(str);
        w wVar = this.f165632a;
        wVar.getClass();
        com.google.firebase.remoteconfig.b bVar = new com.google.firebase.remoteconfig.b(5, wVar, str);
        int i14 = w03.b.f181178a;
        return kVarD.d(new z03.d(bVar)).d(wVar.o()).d(new e13.k(new e13.j(wVar.t(new w.d(true, false, false, false, true, false, true, false, false, false, 942, null)), new p0(new t42.l(this, str, str2, lVar, 7), 0)), new v(new h0(this, str, 11), 18)));
    }

    public final z03.j o(e23.l lVar, String str) {
        str.getClass();
        lVar.getClass();
        e13.j jVarT = this.f165632a.t(new w.d(true, false, false, false, true, false, true, false, false, false, 942, null));
        v vVar = new v(new j0(this, str, lVar, 1), 26);
        int i14 = w03.b.f181178a;
        return new z03.j(new e13.j(jVarT, vVar));
    }

    public final e13.k q(String str, pn2.t tVar) {
        str.getClass();
        e13.j jVarT = this.f165632a.t(new w.d(true, false, false, false, false, false, true, false, false, false, 958, null));
        k0 k0Var = new k0(new rp.b(this, 28, str, tVar), 14);
        int i14 = w03.b.f181178a;
        return new e13.k(jVarT, k0Var);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltn2/r0$a;", "", "<init>", "()V", "", "TRUE", "B", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public r0(w wVar, mn2.b bVar, mn2.o oVar, mn2.k kVar, sd2.f fVar) {
        wVar.getClass();
        bVar.getClass();
        oVar.getClass();
        kVar.getClass();
        fVar.getClass();
        this.f165632a = wVar;
        this.f165633b = bVar;
        this.f165634c = oVar;
        this.f165635d = kVar;
        this.f165636e = fVar;
        this.f165637f = new pn2.n(wVar.f165681b, new g(this));
        this.f165638g = new pn2.o();
        this.f165639h = new f0();
        long j8 = wVar.f165682c;
        this.f165640i = j8;
        this.f165641j = w2.a0.i(fVar);
        tn2.c cVar = tn2.c.f165530a;
        k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(es2.a.class);
        cVar.getClass();
        Object obj = tn2.c.f165531b.get(dVarB);
        obj.getClass();
        this.f165642k = new j((es2.a) obj, j8);
        this.f165643l = new as2.f<>(this, wVar);
        this.f165644m = new y0(this);
    }
}
