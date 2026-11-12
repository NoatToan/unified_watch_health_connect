package e71;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\b\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\t\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Le71/m;", "", "", "labelResId", "feedbackPhraseId", "<init>", "(Ljava/lang/Integer;I)V", "a", "Le71/a;", "Le71/b;", "Le71/c;", "Le71/d;", "Le71/e;", "Le71/h;", "Le71/j;", "Le71/k;", "Le71/n;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f63320c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f63321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63322b;

    private m(Integer num, int i14) {
        this.f63321a = num;
        this.f63322b = i14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Le71/m$a;", "", "<init>", "()V", "", "LOAD_STATUS_NONE", "Ljava/lang/String;", "LOAD_STATUS_LOW", "LOAD_STATUS_OPTIMAL", "LOAD_STATUS_HIGH", "LOAD_STATUS_VERY_HIGH", "LOAD_STATUS_FEEDBACK_1", "LOAD_STATUS_FEEDBACK_2", "LOAD_STATUS_FEEDBACK_3", "LOAD_STATUS_FEEDBACK_4", "LOAD_STATUS_FEEDBACK_5", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static int a(String str) {
            switch (str.hashCode()) {
                case 1135811063:
                    return !str.equals("FEEDBACK_1") ? R.string.ts_acute_load_feedback_none : R.string.ts_acute_load_feedback_1;
                case 1135811064:
                    return !str.equals("FEEDBACK_2") ? R.string.ts_acute_load_feedback_none : R.string.ts_acute_load_feedback_2;
                case 1135811065:
                    return !str.equals("FEEDBACK_3") ? R.string.ts_acute_load_feedback_none : R.string.ts_acute_load_feedback_3;
                case 1135811066:
                    return !str.equals("FEEDBACK_4") ? R.string.ts_acute_load_feedback_none : R.string.ts_acute_load_feedback_4;
                case 1135811067:
                    return !str.equals("FEEDBACK_5") ? R.string.ts_acute_load_feedback_none : R.string.ts_acute_load_feedback_5;
                default:
                    return R.string.ts_acute_load_feedback_none;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static m b(String str, String str2) {
            str.getClass();
            str2.getClass();
            switch (str.hashCode()) {
                case -531494558:
                    if (str.equals("OPTIMAL")) {
                        return new d(str2);
                    }
                    break;
                case 75572:
                    if (str.equals("LOW")) {
                        return new b(str2);
                    }
                    break;
                case 2217378:
                    if (str.equals("HIGH")) {
                        return new e71.a(str2);
                    }
                    break;
                case 2402104:
                    if (str.equals("NONE")) {
                        return new c(str2);
                    }
                    break;
                case 1571371787:
                    if (str.equals("VERY_HIGH")) {
                        return new e(str2);
                    }
                    break;
            }
            return new k();
        }

        public static m c(double d14, double d15, double d16) {
            if (Double.isNaN(d14)) {
                return new n();
            }
            if (Double.isNaN(d15) && Double.isNaN(d16)) {
                return new k();
            }
            if (d14 > d16) {
                return new h();
            }
            return d14 < d15 ? new j() : new k();
        }

        private a() {
        }
    }

    public /* synthetic */ m(Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, i14);
    }
}
