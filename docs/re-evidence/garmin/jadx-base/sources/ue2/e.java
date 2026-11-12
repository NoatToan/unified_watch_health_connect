package ue2;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.agesignals.AgeSignalsAccessRequest;
import com.google.android.play.agesignals.AgeSignalsAccessResult;
import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.agesignals.AgeSignalsManagerFactory;
import com.google.android.play.agesignals.AgeSignalsRequest;
import com.google.android.play.agesignals.AgeSignalsResult;
import com.google.android.play.agesignals.testing.FakeAgeSignalsManager;
import com.google.maps.android.BuildConfig;
import d53.w;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import o13.m;
import o13.p;
import o13.q;
import o13.r;
import o13.t;
import org.apache.commons.lang3.time.TimeZones;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import re2.l0;
import tn.k;
import u1.p1;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lue2/e;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f170268c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f170269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f170270b;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170271a;

        static {
            int[] iArr = new int[ue2.a.values().length];
            try {
                iArr[ue2.a.APP_DOES_NOT_SUPPORT_AGE_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue2.a.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ue2.a.NO_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ue2.a.CLIENT_TRANSIENT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ue2.a.INTERNAL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ue2.a.APP_NOT_OWNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ue2.a.SDK_VERSION_OUTDATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ue2.a.API_NOT_AVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ue2.a.PLAY_STORE_NOT_FOUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ue2.a.CANNOT_BIND_TO_SERVICE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ue2.a.PLAY_STORE_VERSION_OUTDATED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ue2.a.PLAY_SERVICES_NOT_FOUND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ue2.a.PLAY_SERVICES_VERSION_OUTDATED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ue2.a.VERIFICATION_REQUIRED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f170271a = iArr;
        }
    }

    static {
        new a(null);
    }

    public e() {
        re2.b.f152215a.getClass();
        if (!re2.b.f152233s) {
            vb.h.z("AuthenticationHelper must be initialized before using GooglePlayAgeSignalsHelper.");
            throw null;
        }
        l0.f152316a.getClass();
        this.f170269a = l0.c("GooglePlayAgeSignalsHelper");
        this.f170270b = m.b(new p1(16));
    }

    public static SpannableStringBuilder b(e23.a aVar, String str, String str2) {
        re2.b bVar = re2.b.f152215a;
        String strG = k.g(str, bVar.b().getString(R.string.age_signals_msg_update_app, str2, str2));
        int iL = w.L(0, 6, strG, str2);
        int length = str2.length() + iL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strG);
        spannableStringBuilder.setSpan(new f(aVar, a7.b.getColor(bVar.b(), R.color.ssoTouText)), iL, length, 33);
        return spannableStringBuilder;
    }

    public static String e(int i14) {
        String string = re2.b.f152215a.b().getString(i14);
        string.getClass();
        return string;
    }

    public static String m(int i14) {
        if (i14 == 0) {
            return "UNSPECIFIED";
        }
        if (i14 == 1) {
            return "SHARED";
        }
        if (i14 != 2) {
            return i14 != 3 ? e0.f(i14, "access status [", "] not defined in 'com.google.android.play.agesignals.model.AgeSignalsStatus'") : "VERIFICATION_REQUIRED";
        }
        return "NOT_SHARED";
    }

    public final void a() {
        Logger logger = this.f170269a;
        logger.warn("clearAllTestVariables");
        logger.warn("clearTestAccessStatus");
        i().edit().remove("testAccessStatus").commit();
        logger.warn("clearTestError");
        i().edit().remove("testError").commit();
        logger.warn("clearTestAgeRange");
        i().edit().remove("testAgeRange").commit();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r12 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r12 == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(AuthenticationActivity authenticationActivity, v13.c cVar) {
        g gVar;
        AgeSignalsAccessRequest ageSignalsAccessRequestBuild;
        AgeSignalsAccessResult ageSignalsAccessResult;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f170277d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f170277d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objJ = gVar.f170275b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f170277d;
        Logger logger = this.f170269a;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    ageSignalsAccessRequestBuild = gVar.f170274a;
                    r.b(objJ);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objJ);
                }
                ageSignalsAccessResult = (AgeSignalsAccessResult) objJ;
                ageSignalsAccessResult.getClass();
                Integer numAgeSignalsStatus = ageSignalsAccessResult.ageSignalsStatus();
                if (numAgeSignalsStatus == null) {
                    logger.warn("fetchAccessStatus: Google 'AgeSignalsAccessResult.ageSignalsStatus' is null.");
                    int i16 = q.f128596b;
                    return new q.b(new Throwable("fetchAccessStatus: Google 'AgeSignalsAccessResult.ageSignalsStatus' is null."));
                }
                int iIntValue = numAgeSignalsStatus.intValue();
                logger.debug("fetchAccessStatus: ".concat(m(iIntValue)));
                int i17 = q.f128596b;
                return new Integer(iIntValue);
            }
            r.b(objJ);
            ageSignalsAccessRequestBuild = AgeSignalsAccessRequest.builder().setActivity(authenticationActivity).build();
            ageSignalsAccessRequestBuild.getClass();
            Integer numF = f();
            if (numF != null) {
                int iIntValue2 = numF.intValue();
                logger.warn("fetchAccessStatus: using 'FakeAgeSignalsManager', test access status [" + m(iIntValue2) + "]");
                AgeSignalsAccessResult ageSignalsAccessResultBuild = AgeSignalsAccessResult.builder().setAgeSignalsStatus(new Integer(iIntValue2)).build();
                ageSignalsAccessResultBuild.getClass();
                FakeAgeSignalsManager fakeAgeSignalsManager = new FakeAgeSignalsManager();
                fakeAgeSignalsManager.setNextAgeSignalsAccessResult(ageSignalsAccessResultBuild);
                Task<AgeSignalsAccessResult> taskRequestAgeSignalsAccess = fakeAgeSignalsManager.requestAgeSignalsAccess(ageSignalsAccessRequestBuild);
                taskRequestAgeSignalsAccess.getClass();
                gVar.f170274a = ageSignalsAccessRequestBuild;
                gVar.f170277d = 1;
                objJ = xy2.b.j(taskRequestAgeSignalsAccess, gVar);
                if (objJ == aVar) {
                }
            } else {
                Task<AgeSignalsAccessResult> taskRequestAgeSignalsAccess2 = AgeSignalsManagerFactory.create(re2.b.f152215a.b()).requestAgeSignalsAccess(ageSignalsAccessRequestBuild);
                taskRequestAgeSignalsAccess2.getClass();
                gVar.f170274a = null;
                gVar.f170277d = 2;
                objJ = xy2.b.j(taskRequestAgeSignalsAccess2, gVar);
            }
            return aVar;
            ageSignalsAccessResult = (AgeSignalsAccessResult) objJ;
        } catch (Exception e4) {
            int i18 = q.f128596b;
            return new q.b(j(e4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0136, code lost:
    
        if (r14 == r4) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(v13.c cVar) {
        h hVar;
        String strI;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f170280c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f170280c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objJ = hVar.f170278a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f170280c;
        Logger logger = this.f170269a;
        try {
            try {
                try {
                    if (i15 == 0) {
                        r.b(objJ);
                        AgeSignalsRequest ageSignalsRequestBuild = AgeSignalsRequest.builder().build();
                        ageSignalsRequestBuild.getClass();
                        ue2.a aVarH = h();
                        if (aVarH != null) {
                            logger.warn("fetchSignals: using 'FakeAgeSignalsManager', test error [" + aVarH.name() + "]");
                            FakeAgeSignalsManager fakeAgeSignalsManager = new FakeAgeSignalsManager();
                            fakeAgeSignalsManager.setNextAgeSignalsException(new AgeSignalsException(aVarH.f170259a));
                            Task<AgeSignalsResult> taskCheckAgeSignals = fakeAgeSignalsManager.checkAgeSignals(ageSignalsRequestBuild);
                            taskCheckAgeSignals.getClass();
                            hVar.f170280c = 1;
                            objJ = xy2.b.j(taskCheckAgeSignals, hVar);
                            if (objJ == aVar) {
                            }
                            AgeSignalsResult ageSignalsResult = (AgeSignalsResult) objJ;
                            int i16 = q.f128596b;
                            return ageSignalsResult;
                        }
                        p<Integer, Integer> pVarG = g();
                        if (pVarG != null) {
                            Integer num = pVarG.f128594a;
                            Integer num2 = pVarG.f128595b;
                            logger.warn("fetchSignals: using 'FakeAgeSignalsManager', test age range [" + num + "-" + num2 + "]");
                            AgeSignalsResult ageSignalsResultBuild = AgeSignalsResult.builder().setAgeRangeSource(new Integer(0)).setAgeLower(num).setAgeUpper(num2).setInstallId("fake_install_id_123").build();
                            ageSignalsResultBuild.getClass();
                            FakeAgeSignalsManager fakeAgeSignalsManager2 = new FakeAgeSignalsManager();
                            fakeAgeSignalsManager2.setNextAgeSignalsResult(ageSignalsResultBuild);
                            Task<AgeSignalsResult> taskCheckAgeSignals2 = fakeAgeSignalsManager2.checkAgeSignals(ageSignalsRequestBuild);
                            taskCheckAgeSignals2.getClass();
                            hVar.f170280c = 2;
                            objJ = xy2.b.j(taskCheckAgeSignals2, hVar);
                            if (objJ == aVar) {
                            }
                            AgeSignalsResult ageSignalsResult2 = (AgeSignalsResult) objJ;
                            int i17 = q.f128596b;
                            return ageSignalsResult2;
                        }
                        Task<AgeSignalsResult> taskCheckAgeSignals3 = AgeSignalsManagerFactory.create(re2.b.f152215a.b()).checkAgeSignals(ageSignalsRequestBuild);
                        taskCheckAgeSignals3.getClass();
                        hVar.f170280c = 3;
                        objJ = xy2.b.j(taskCheckAgeSignals3, hVar);
                        return aVar;
                    }
                    if (i15 == 1) {
                        r.b(objJ);
                        AgeSignalsResult ageSignalsResult3 = (AgeSignalsResult) objJ;
                        int i18 = q.f128596b;
                        return ageSignalsResult3;
                    }
                    if (i15 == 2) {
                        r.b(objJ);
                        AgeSignalsResult ageSignalsResult4 = (AgeSignalsResult) objJ;
                        int i19 = q.f128596b;
                        return ageSignalsResult4;
                    }
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objJ);
                    AgeSignalsResult ageSignalsResult5 = (AgeSignalsResult) objJ;
                    String strInstallId = ageSignalsResult5.installId();
                    Integer numAgeRangeSource = ageSignalsResult5.ageRangeSource();
                    String strI2 = "UNSPECIFIED";
                    String str = BuildConfig.TRAVIS;
                    if (numAgeRangeSource == null) {
                        strI = BuildConfig.TRAVIS;
                    } else if (numAgeRangeSource.intValue() == 0) {
                        strI = "UNSPECIFIED";
                    } else if (numAgeRangeSource.intValue() == 1) {
                        strI = "TIER_A";
                    } else if (numAgeRangeSource.intValue() == 2) {
                        strI = "TIER_B";
                    } else if (numAgeRangeSource.intValue() == 3) {
                        strI = "TIER_C";
                    } else {
                        strI = numAgeRangeSource.intValue() == 4 ? "TIER_D" : a0.i("age range source [", numAgeRangeSource, "] not defined in 'com.google.android.play.agesignals.model.AgeRangeSource'");
                    }
                    Integer numAgeLower = ageSignalsResult5.ageLower();
                    Integer numAgeUpper = ageSignalsResult5.ageUpper();
                    Integer numSignificantChangeStatus = ageSignalsResult5.significantChangeStatus();
                    if (numSignificantChangeStatus == null) {
                        strI2 = BuildConfig.TRAVIS;
                    } else if (numSignificantChangeStatus.intValue() != 0) {
                        if (numSignificantChangeStatus.intValue() == 1) {
                            strI2 = "APPROVED";
                        } else if (numSignificantChangeStatus.intValue() == 2) {
                            strI2 = "PENDING";
                        } else {
                            strI2 = numSignificantChangeStatus.intValue() == 3 ? "DECLINED" : a0.i("significant change status [", numSignificantChangeStatus, "] not defined in 'com.google.android.play.agesignals.model.SignificantChangeStatus'");
                        }
                    }
                    Date dateSignificantChangeApprovalDate = ageSignalsResult5.significantChangeApprovalDate();
                    if (dateSignificantChangeApprovalDate != null) {
                        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
                        dateTimeInstance.setTimeZone(TimeZone.getTimeZone(TimeZones.GMT_ID));
                        String str2 = dateTimeInstance.format(dateSignificantChangeApprovalDate);
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                    logger.debug("fetchSignals:\n   installId=" + strInstallId + "\n   source=" + strI + "\n   ageLower=" + numAgeLower + "\n   ageUpper=" + numAgeUpper + "\n   significantChangeStatus=" + strI2 + "\n   significantChangeApprovalDate=" + str);
                    int i24 = q.f128596b;
                    return ageSignalsResult5;
                } catch (Exception e4) {
                    int i25 = q.f128596b;
                    return new q.b(j(e4));
                }
            } catch (Exception e14) {
                int i26 = q.f128596b;
                return new q.b(j(e14));
            }
        } catch (Exception e15) {
            int i27 = q.f128596b;
            return new q.b(j(e15));
        }
    }

    public final Integer f() {
        int i14 = i().getInt("testAccessStatus", 999);
        if (i14 == 999) {
            return null;
        }
        return Integer.valueOf(i14);
    }

    public final p<Integer, Integer> g() {
        String string = i().getString("testAgeRange", "arbitrary");
        if (string != null && string.hashCode() == 1780188658 && string.equals("arbitrary")) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        List listW = w.W(string, new String[]{"-"});
        return new p<>(d53.t.i((String) listW.get(0)), d53.t.i((String) listW.get(1)));
    }

    public final ue2.a h() {
        String string = i().getString("testError", "arbitrary");
        if (string != null && string.hashCode() == 1780188658 && string.equals("arbitrary")) {
            string = null;
        }
        if (string != null) {
            try {
                return ue2.a.valueOf(string);
            } catch (IllegalArgumentException unused) {
                com.airbnb.lottie.animation.keyframe.a.z("getTestError: invalid test error value [", string, "] in shared preferences.", this.f170269a);
            }
        }
        return null;
    }

    public final SharedPreferences i() {
        return (SharedPreferences) this.f170270b.getValue();
    }

    public final Throwable j(Exception exc) {
        Object obj = null;
        AgeSignalsException ageSignalsException = exc instanceof AgeSignalsException ? (AgeSignalsException) exc : null;
        Logger logger = this.f170269a;
        if (ageSignalsException == null) {
            logger.error("handleAgeSignalsError", (Throwable) exc);
            return new Throwable(exc);
        }
        int errorCode = ((AgeSignalsException) exc).getErrorCode();
        w13.c cVar = ue2.a.f170258q;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (((ue2.a) next).f170259a == errorCode) {
                obj = next;
                break;
            }
        }
        ue2.a aVar = (ue2.a) obj;
        if (aVar != null) {
            String str = "handleAgeSignalsError: Google 'AgeSignalsException' error code [" + errorCode + "].";
            logger.warn(str);
            return new ue2.b(aVar, str);
        }
        String str2 = "handleAgeSignalsError: Unknown Google 'AgeSignalsException' error code [" + errorCode + "]. Developer, update Garmin 'AgeSignalsError' enum to include this new error code.";
        logger.error(str2);
        return new Throwable(str2);
    }

    public final void k(androidx.fragment.app.m mVar) {
        Intent launchIntentForPackage = mVar.getPackageManager().getLaunchIntentForPackage("com.android.vending");
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            mVar.startActivity(launchIntentForPackage);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com"));
            intent.addCategory("android.intent.category.BROWSABLE");
            mVar.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            this.f170269a.error("openGooglePlayStore: No browser found to open the Play Store web page.");
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final void l(Integer num, Integer num2) {
        String str = num + "-" + num2;
        this.f170269a.warn("setTestAgeRange: ".concat(str));
        i().edit().putString("testAgeRange", str).commit();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lue2/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PREF_KEY_TEST_ACCESS_STATUS", "PREF_KEY_TEST_ERROR", "PREF_KEY_TEST_AGE_RANGE", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
