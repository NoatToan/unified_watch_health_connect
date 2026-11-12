package lc2;

import com.garmin.android.lib.legal.d;
import java.util.Arrays;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llc2/a;", "", "", "urlTemplate", "urlTemplateChina", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    ACTIVITY_TRACKING_ACCURACY_DISCLAIMER("https://www.garmin.com/%1$s/legal/atdisclaimer", "https://www.garmin.cn/%1$s/legal/atdisclaimer"),
    APP_COPYRIGHT("file:///android_asset/copyrights.html", "file:///android_asset/copyrights.html"),
    APP_EULA("file:///android_asset/eula/eula-%1$s.html", "file:///android_asset/eula/eula-%1$s.html"),
    BETA_TERMS("file:///android_asset/beta/beta-terms-%1$s.html", "file:///android_asset/beta/beta-terms-%1$s.html"),
    GARMIN_CLIPBOARD_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/clipboard/policy/", "https://www.garmin.com/%1$s/privacy/clipboard/policy/"),
    GARMIN_CONNECT_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/connect/", "https://www.garmin.cn/%1$s/privacy/connect/"),
    GARMIN_CONNECT_IQ_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/connectiq/policy/", "https://www.garmin.cn/%1$s/privacy/connectiq/policy/"),
    GARMIN_CONSUMER_AUTO_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/consumerauto/", "https://www.garmin.cn/%1$s/privacy/consumerauto/"),
    GARMIN_DIVE_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/dive", "https://www.garmin.cn/%1$s/privacy/dive"),
    GARMIN_GOLF_GDPR_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/golf", "https://www.garmin.cn/%1$s/privacy/golf"),
    GARMIN_GOLF_PRIVACY_POLICY("https://www.garmin.com/%1$s/legal/golf-privacy-statement", "https://www.garmin.cn/%1$s/legal/golf-privacy-statement"),
    GARMIN_MARINE_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/marine/", "https://www.garmin.cn/%1$s/privacy/marine/"),
    GARMIN_OUTDOOR_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/outdoor/", "https://www.garmin.cn/%1$s/privacy/outdoor/"),
    GARMIN_PAY_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/garminpay/policy", "https://www.garmin.cn/%1$s/privacy/garminpay/policy"),
    GARMIN_PAY_TERMS_AND_CONDITIONS("https://www.garmin.com/%1$s/legal/garmin-pay/terms", "https://www.garmin.cn/%1$s/legal/garmin-pay/terms"),
    GARMIN_PRIVACY_POLICY("https://www.garmin.com/%1$s/privacy/global/policy/", "https://www.garmin.cn/%1$s/privacy/global/policy/"),
    GARMIN_PRIVACY_POLICY_GLOBAL("https://www.garmin.com/%1$s/privacy/global/", "https://www.garmin.cn/%1$s/privacy/global/"),
    GARMIN_SECURITY_POLICY("https://www.garmin.com/%1$s/legal/security", "https://www.garmin.cn/%1$s/legal/security"),
    LIVETRACK_EULA("https://static.garmincdn.com/livetrack/%1$s/LiveTrack_tou.htm", "https://static.garmin.cn/livetrack/%1$s/LiveTrack_tou.htm"),
    LIVETRACK_PRIVACY_POLICY("https://static.garmincdn.com/livetrack/%1$s/LiveTrack_privacy.htm", "https://static.garmin.cn/livetrack/%1$s/LiveTrack_privacy.htm"),
    MOBILE_CORE_TEST("https://yellow.garmin.com/mobileapps/mobcore_legal_doc_test.html", "");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111982b;

    /* JADX INFO: renamed from: lc2.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2145a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111983a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.APP_COPYRIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.APP_EULA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.BETA_TERMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.ACTIVITY_TRACKING_ACCURACY_DISCLAIMER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.GARMIN_CONNECT_PRIVACY_POLICY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.GARMIN_CONNECT_IQ_PRIVACY_POLICY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.GARMIN_SECURITY_POLICY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.LIVETRACK_EULA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.LIVETRACK_PRIVACY_POLICY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.GARMIN_OUTDOOR_PRIVACY_POLICY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.MOBILE_CORE_TEST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.GARMIN_PAY_PRIVACY_POLICY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.GARMIN_PAY_TERMS_AND_CONDITIONS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a.GARMIN_PRIVACY_POLICY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a.GARMIN_PRIVACY_POLICY_GLOBAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[a.GARMIN_GOLF_PRIVACY_POLICY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[a.GARMIN_GOLF_GDPR_PRIVACY_POLICY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[a.GARMIN_DIVE_PRIVACY_POLICY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[a.GARMIN_CONSUMER_AUTO_PRIVACY_POLICY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[a.GARMIN_CLIPBOARD_PRIVACY_POLICY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[a.GARMIN_MARINE_PRIVACY_POLICY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f111983a = iArr;
        }
    }

    a(String str, String str2) {
        this.f111981a = str;
        this.f111982b = str2;
    }

    public final String a(d dVar, boolean z14) {
        String str;
        dVar.getClass();
        String str2 = dVar.f50048c;
        String str3 = dVar.f50046a;
        String str4 = dVar.f50047b;
        switch (C2145a.f111983a[ordinal()]) {
            case 1:
                str2 = "";
                break;
            case 2:
            case 11:
                str2 = str3;
                break;
            case 3:
                str2 = dVar.f50053h;
                if (str2 == null) {
                    str2 = d.US.f50053h;
                    str2.getClass();
                }
                break;
            case 4:
                str2 = dVar.f50052g;
                break;
            case 5:
                if (str2 == null) {
                    str2 = d.US.f50048c;
                    str2.getClass();
                }
                break;
            case 6:
                if (str2 == null) {
                    str2 = d.US.f50048c;
                    str2.getClass();
                }
                break;
            case 7:
                str2 = dVar.f50049d;
                if (str2 == null) {
                    str2 = d.US.f50049d;
                    str2.getClass();
                }
                break;
            case 8:
                str2 = dVar.f50050e;
                if (str2 == null) {
                    str2 = d.US.f50050e;
                    str2.getClass();
                }
                break;
            case 9:
                str2 = dVar.f50051f;
                if (str2 == null) {
                    str2 = d.US.f50051f;
                    str2.getClass();
                }
                break;
            case 10:
                b.f111984a.getClass();
                switch (b.a.f111985a[dVar.ordinal()]) {
                    case 1:
                        str = "vi-VN";
                        str2 = str;
                        break;
                    case 2:
                    case 3:
                        str2 = null;
                        break;
                    case 4:
                        str = "rs-RS";
                        str2 = str;
                        break;
                    case 5:
                        str = "ro-RO";
                        str2 = str;
                        break;
                    case 6:
                        str = "en-SG";
                        str2 = str;
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        str = "ar-AE";
                        str2 = str;
                        break;
                    default:
                        str2 = str4;
                        break;
                }
                if (str2 == null) {
                    str2 = d.US.f50047b;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                str2 = str4;
                break;
            default:
                u0.r();
                return null;
        }
        x0 x0Var = x0.f105818a;
        return String.format(z14 ? this.f111982b : this.f111981a, Arrays.copyOf(new Object[]{str2}, 1));
    }
}
