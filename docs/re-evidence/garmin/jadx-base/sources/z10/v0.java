package z10;

import android.content.SharedPreferences;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz10/v0;", "", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f201271b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.t f201272c = o13.m.b(new yx2.b(20));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f201273a = ((bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null)).e();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201274a;

        static {
            int[] iArr = new int[q92.x.values().length];
            try {
                iArr[q92.x.DI_CONNECT_INSIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q92.x.DI_CONNECT_LIVETRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f201274a = iArr;
        }
    }

    private v0() {
    }

    public static v0 a() {
        return new v0();
    }

    public final long b(q92.x xVar) {
        xVar.getClass();
        int i14 = b.f201274a[xVar.ordinal()];
        SharedPreferences sharedPreferences = this.f201273a;
        if (i14 == 1) {
            return sharedPreferences.getLong("gcm_consent_insights_dialog_key", 0L);
        }
        if (i14 == 2) {
            return sharedPreferences.getLong("gcm_consent_live_track_dialog_key", 0L);
        }
        if (i14 != 3) {
            return 0L;
        }
        return sharedPreferences.getLong("gcm_consent_product_improvement_dialog_key", 0L);
    }

    public final void c(q92.x xVar, long j8) {
        xVar.getClass();
        int i14 = b.f201274a[xVar.ordinal()];
        SharedPreferences sharedPreferences = this.f201273a;
        if (i14 == 1) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("gcm_consent_insights_dialog_key", j8);
            editorEdit.apply();
        } else if (i14 == 2) {
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putLong("gcm_consent_live_track_dialog_key", j8);
            editorEdit2.apply();
        } else {
            if (i14 != 3) {
                return;
            }
            SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
            editorEdit3.putLong("gcm_consent_product_improvement_dialog_key", j8);
            editorEdit3.apply();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lz10/v0$a;", "", "<init>", "()V", "", "CONSENT_PREFS", "Ljava/lang/String;", "CONSENT_INSIGHTS_DIALOG_KEY", "CONSENT_LIVE_TRACK_DIALOG_KEY", "CONSENT_PRODUCT_IMPROVEMENT_DIALOG_KEY", "CONSENT_HIDE_MY_DAY_KEY", "CONSENT_PRIVACY_POLICY_CHECK_TIMESTAMP_KEY", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static v0 a() {
            return (v0) v0.f201272c.getValue();
        }

        private a() {
        }
    }
}
