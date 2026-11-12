package kr2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import com.google.firebase.perf.util.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.y;
import q03.r;
import zn2.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"Lkr2/h;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "b", "d", "h", "c", JWKParameterNames.RSA_EXPONENT, "g", "f", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f106255y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Logger f106256z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeveloperSettingsActivity f106257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f106258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f106261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f106262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f106263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f106264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f106265i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f106267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f106268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f106269m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f106271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0<List<kr2.a>> f106272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f106273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f106274r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f106275t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f106276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0<Boolean> f106277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wr2.e f106278x;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f106266j = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f106270n = new ArrayList();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkr2/h$b;", "", "", "", "title", "", Constants.ENABLE_DISABLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        BUILD_CONFIG("Build Config", true),
        SERVER_ENVIRONMENT("Server Environment", true),
        ANDROID_ACCOUNT_MGR("Android Acct. Mgr.", true),
        FIREBASE_REMOTE_CONFIG("Firebase Remote Config", true),
        GARMIN_PAY_UI_REVIEW("UI Review For Common Pages", true),
        FIT_PAY_SETTINGS("Fit Pay Settings", true),
        UNIONPAY_SETTINGS("UnionPay Settings", true),
        FELICA_SETTINGS("Felica Settings", true),
        RABBIT_SETTINGS("Rabbit Settings", true),
        SNOWBALL_SETTINGS("Snowball Settings", true),
        TEST_DEV_SETTINGS("Developer & Test Device Options", true),
        TOGGLE_TEST_DEV_SETTINGS("Toggle Test Device On Startup", true),
        DELETE_ALL_LOCAL_WALLET_ITEMS("Delete Local Wallet Items", true),
        TEST_GENERIC_SYNC_PUSH_NOTIF("Test Generic Sync Push Notif", true),
        MOVE_FIREBASE_PUSH_NOTIF_LOGGING_TO_PUBLIC_DIR("Move Firebase Push Notif Logging to Public Dir", true),
        DDS_SOCKET_TEST("Test Device-Driven Socket", true),
        DISABLE_ECOM_FEATURES("Disable ECOM Features", true),
        DISABLE_ECOM_TOKENIZATION("Disable ECOM Tokenization", true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106299b;

        b(String str, boolean z14) {
            this.f106298a = str;
            this.f106299b = z14;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkr2/h$c;", "", "", "", "title", "", Constants.ENABLE_DISABLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        REVIEW_ISSUE_CARD_FLOW_GUI("Review Issue Card Flow GUI", true),
        REVIEW_CARD_DETAIL_FLOW_GUI("Review Card Detail Flow GUI", true),
        CHANGE_FELICA_REFUND_POLICY("Change Felica Refund Policy", true),
        SP_SERVER_ENVIRONMENT("Sp Server Param", true),
        MFI_SERVER_ENVIRONMENT("Mfi Server Param", true),
        DP_SERVER_ENVIRONMENT("Dp Server Param", true),
        GOOGLE_PAY_SERVER_ENVIRONMENT("Google Pay Server Param", true),
        INITIAL_CHARGE_OPTIONS_SOURCE("Initial Charge Options Source", true),
        FETCH_SEIDS("Fetch all FeliCa SEID for all NFC connected devices", true),
        FELICA_CONSOLE("Felica Console", true),
        SET_DEVICE_NAME_OVERWRITE("Set Device Name Overwrite", true),
        EXPERT_INITIALIZE_CHIP("Expert - Initialize Chip", true),
        EXPERT_PROVISION("Expert - Provision", true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106315b;

        c(String str, boolean z14) {
            this.f106314a = str;
            this.f106315b = z14;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkr2/h$d;", "", "", "", "title", "", Constants.ENABLE_DISABLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum d {
        TOGGLE_EARLY_TOKEN_EXPIRATION("Toggle Early Token Expiration", false),
        TEST_PUSH_NOTIF("Test Push Notification", false),
        DELETE_CURRENT_FIT_PAY_USER("Delete Current FitPay User", false),
        SHOULD_USER_REMOTE_CONFIG("Should use remote config?", false),
        CURRENT_FITPAY("Current FitPay", false),
        SHOULD_USE_OAUTH2_TOKEN("Should use OAuth2 token?", false),
        BLOCK_VIDEO_RECORDING_AND_SCREEN_SHOOTS("Block video recording and screen shoots for Garmin Pay screens. Do not use real card number while protection is off.", true),
        TURN_ON_MAINTENANCE_MODE("Turn on 'Maintenance Mode'", true),
        TEST_IN_PRODUCTION("Test in Production", true),
        NFC_DEVICES("NFC Devices", true),
        ADDRESS_MANAGEMENT_DIRECT_ACCESS("Address Management Direct Access", true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106329b;

        d(String str, boolean z14) {
            this.f106328a = str;
            this.f106329b = z14;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkr2/h$e;", "", "", "", "title", "", Constants.ENABLE_DISABLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum e {
        REVIEW_CARD_DETAIL_FLOW_GUI("Review Card Detail Flow GUI", true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106333b;

        e(String str, boolean z14) {
            this.f106332a = str;
            this.f106333b = z14;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkr2/h$f;", "", "Lzi2/a;", "serverEnvironment", "<init>", "(Lzi2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zi2.a f106334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f106337d;

        public f(zi2.a aVar) {
            aVar.getClass();
            this.f106334a = aVar;
            this.f106335b = aVar.toString();
            String str = aVar.f204881b;
            str.getClass();
            this.f106336c = str;
            String str2 = aVar.f204880a;
            str2.getClass();
            this.f106337d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f106334a == ((f) obj).f106334a;
        }

        public final int hashCode() {
            return this.f106334a.hashCode();
        }

        public final String toString() {
            return "ServerEnvironmentInfoModel(serverEnvironment=" + this.f106334a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkr2/h$g;", "", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum g {
        REVIEW_SNOWBALL_GUI("Review Snowball GUI"),
        SHOULD_BYPASS_ALIPAY("Should bypass AliPay"),
        SKIP_DEVICE_CHECK("Should skip device check"),
        SKIP_SHIFTED_OUT_CARDS_CHECK("Skip shift out cards check for Snowball"),
        INCLUDE_UNRELEASED("Include unreleased"),
        SKIP_DELETABLE_CHECK("Skip deletable check"),
        ALIPAY_ENVIRONMENT("AliPay Environment"),
        SANDBOX_ROLE("Is Sandbox Role");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106348b = ordinal();

        g(String str) {
            this.f106347a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f106347a;
        }
    }

    /* JADX INFO: renamed from: kr2.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkr2/h$h;", "", "", "", "title", "", Constants.ENABLE_DISABLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC2053h {
        SKIP_VERIFICATION("Skip UnionPay OTP Verification", true),
        REVIEW_ADD_CARD_FLOW_GUI("Review Add Card Flow GUI", true),
        REVIEW_MANAGE_CARD_FLOW_GUI("Review Manage Card Flow GUI", true),
        REVIEW_GRAY_CARD_FLOW_GUI("Review Gray Card Flow GUI", true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106355b;

        EnumC2053h(String str, boolean z14) {
            this.f106354a = str;
            this.f106355b = z14;
        }
    }

    public static final /* synthetic */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f106357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f106358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f106359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f106360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f106361f;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BUILD_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SERVER_ENVIRONMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.ANDROID_ACCOUNT_MGR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.FIREBASE_REMOTE_CONFIG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.GARMIN_PAY_UI_REVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.FIT_PAY_SETTINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.UNIONPAY_SETTINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.FELICA_SETTINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.RABBIT_SETTINGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.SNOWBALL_SETTINGS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.TEST_DEV_SETTINGS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.TOGGLE_TEST_DEV_SETTINGS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.DELETE_ALL_LOCAL_WALLET_ITEMS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[b.TEST_GENERIC_SYNC_PUSH_NOTIF.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[b.MOVE_FIREBASE_PUSH_NOTIF_LOGGING_TO_PUBLIC_DIR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[b.DDS_SOCKET_TEST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[b.DISABLE_ECOM_FEATURES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[b.DISABLE_ECOM_TOKENIZATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f106356a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.TOGGLE_EARLY_TOKEN_EXPIRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[d.TEST_PUSH_NOTIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[d.DELETE_CURRENT_FIT_PAY_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[d.SHOULD_USER_REMOTE_CONFIG.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[d.CURRENT_FITPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[d.SHOULD_USE_OAUTH2_TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[d.BLOCK_VIDEO_RECORDING_AND_SCREEN_SHOOTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[d.TURN_ON_MAINTENANCE_MODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[d.TEST_IN_PRODUCTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[d.NFC_DEVICES.ordinal()] = 10;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[d.ADDRESS_MANAGEMENT_DIRECT_ACCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused29) {
            }
            f106357b = iArr2;
            int[] iArr3 = new int[EnumC2053h.values().length];
            try {
                iArr3[EnumC2053h.SKIP_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[EnumC2053h.REVIEW_ADD_CARD_FLOW_GUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[EnumC2053h.REVIEW_MANAGE_CARD_FLOW_GUI.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[EnumC2053h.REVIEW_GRAY_CARD_FLOW_GUI.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            f106358c = iArr3;
            int[] iArr4 = new int[c.values().length];
            try {
                iArr4[c.REVIEW_ISSUE_CARD_FLOW_GUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[c.REVIEW_CARD_DETAIL_FLOW_GUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr4[c.CHANGE_FELICA_REFUND_POLICY.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[c.SP_SERVER_ENVIRONMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[c.MFI_SERVER_ENVIRONMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[c.DP_SERVER_ENVIRONMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[c.GOOGLE_PAY_SERVER_ENVIRONMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[c.INITIAL_CHARGE_OPTIONS_SOURCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[c.FELICA_CONSOLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr4[c.SET_DEVICE_NAME_OVERWRITE.ordinal()] = 10;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr4[c.EXPERT_INITIALIZE_CHIP.ordinal()] = 11;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[c.EXPERT_PROVISION.ordinal()] = 12;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr4[c.FETCH_SEIDS.ordinal()] = 13;
            } catch (NoSuchFieldError unused46) {
            }
            f106359d = iArr4;
            int[] iArr5 = new int[e.values().length];
            try {
                iArr5[e.REVIEW_CARD_DETAIL_FLOW_GUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            f106360e = iArr5;
            int[] iArr6 = new int[g.values().length];
            try {
                iArr6[g.REVIEW_SNOWBALL_GUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[g.SHOULD_BYPASS_ALIPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[g.SKIP_DEVICE_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr6[g.SKIP_SHIFTED_OUT_CARDS_CHECK.ordinal()] = 4;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr6[g.INCLUDE_UNRELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr6[g.SKIP_DELETABLE_CHECK.ordinal()] = 6;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr6[g.ALIPAY_ENVIRONMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr6[g.SANDBOX_ROLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused55) {
            }
            f106361f = iArr6;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f106256z = gt2.b.f79005a.h("PAY#DeveloperSettingViewModel");
    }

    public h() {
        zi2.a.values();
        this.f106271o = new ArrayList();
        this.f106272p = new y0<>();
        this.f106273q = new ArrayList();
        this.f106274r = new ArrayList();
        this.f106275t = new ArrayList();
        this.f106276v = new ArrayList();
        this.f106277w = new y0<>();
        this.f106278x = wr2.e.f186838m;
    }

    public final void x4() {
        u0.f205864a.getClass();
        u0.i().debug("retrieveDevicesForFPUser called");
        r<a0<Collection<on2.a>>> rVarF = u0.h().f();
        int i14 = 14;
        xw.b bVar = new xw.b(new z81.b(15), i14);
        rVarF.getClass();
        int i15 = w03.b.f181178a;
        T tC = new e13.j(rVarF, bVar).j(l13.a.f108327b).c();
        tC.getClass();
        Iterable<on2.a> iterable = (Iterable) tC;
        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
        for (on2.a aVar : iterable) {
            arrayList.add(new kr2.a(aVar.getDeviceId(), null, new jt1.d(i14, aVar, this), 2, null));
        }
        this.f106272p.j(arrayList);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkr2/h$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static int a(Enum r14) {
            r14.getClass();
            return r14.ordinal();
        }

        private a() {
        }
    }
}
