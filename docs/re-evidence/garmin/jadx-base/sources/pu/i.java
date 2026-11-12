package pu;

import android.content.Context;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Locale;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.m0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpu/i;", "Lpu/h;", "Landroid/content/Context;", "appContext", "Lf12/l;", "prefs", "<init>", "(Landroid/content/Context;Lf12/l;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f141084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f141085b;

    static {
        new a(null);
    }

    public i(Context context, f12.l lVar) {
        context.getClass();
        lVar.getClass();
        this.f141084a = context;
        this.f141085b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r0 == r3) goto L40;
     */
    @Override // pu.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) throws Throwable {
        j jVar;
        long jL3;
        String upperCase;
        String str;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f141092d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f141092d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objE0 = jVar.f141090b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f141092d;
        Context context = this.f141084a;
        f12.l lVar = this.f141085b;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    jL3 = jVar.f141089a;
                    o13.r.b(objE0);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(objE0);
                }
                lVar.u2(((tc2.d) objE0).getDigitalAgeOfConsent(), "keyCountryMinimumConsentAge");
                lVar.h2(System.currentTimeMillis(), "keyUserRequestMinimumAgeTime");
                return Unit.INSTANCE;
            }
            o13.r.b(objE0);
            jL3 = lVar.l3("keyUserRequestMinimumAgeTime");
            if (System.currentTimeMillis() - jL3 > 86400000) {
                Pair<String, Long> pairU0 = lVar.U0();
                if (pairU0 == null || (str = (String) pairU0.first) == null) {
                    upperCase = null;
                } else {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                ud2.b.f170019a.getClass();
                String strA = ud2.b.a(context, "DEFAULT");
                if (upperCase == null) {
                    upperCase = strA;
                }
                if (upperCase == null) {
                    re2.b.f152215a.getClass();
                    String strK = re2.b.k();
                    jVar.f141089a = jL3;
                    jVar.f141092d = 1;
                    x53.c cVar2 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new ud2.d(context, strK, null), jVar);
                    if (objE0 == aVar) {
                    }
                } else {
                    te2.k0 k0Var = new te2.k0();
                    jVar.f141089a = jL3;
                    jVar.f141092d = 2;
                    x53.c cVar3 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new m0(upperCase, k0Var, context, null), jVar);
                }
                return aVar;
            }
            return Unit.INSTANCE;
            upperCase = (String) objE0;
            te2.k0 k0Var2 = new te2.k0();
            jVar.f141089a = jL3;
            jVar.f141092d = 2;
            x53.c cVar4 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new m0(upperCase, k0Var2, context, null), jVar);
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to set user country minimum age: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "CountryMinimumAgeUtil", strD);
        }
    }

    @Override // pu.h
    public final int b() {
        try {
            return this.f141085b.i2(16, "keyCountryMinimumConsentAge");
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to get minimum age: ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "CountryMinimumAgeUtil", strD);
            return 16;
        }
    }

    @Override // pu.h
    public final String c() {
        try {
            int iK0 = this.f141085b.k0("keyCountryMinimumConsentAge");
            return iK0 > 0 ? String.valueOf(iK0) : "-";
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to get minimum age: ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "CountryMinimumAgeUtil", strD);
            return "-";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lpu/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EMPTY_AGE", "", "FALLBACK_AGE", "I", "DEFAULT_KEY", "ONE_DAY_MILLIS", "COUNTRY_MINIMUM_CONSENT_AGE", "USER_REQUEST_MINIMUM_AGE_TIME", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
