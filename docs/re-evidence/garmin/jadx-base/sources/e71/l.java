package e71;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B)\b\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Le71/l;", "", "", "labelRes", "colorRes", "statusRes", "<init>", "(Ljava/lang/Integer;II)V", "c", "a", JWKParameterNames.RSA_EXPONENT, "f", "g", IntegerTokenConverter.CONVERTER_KEY, "b", "d", "h", "Le71/l$a;", "Le71/l$b;", "Le71/l$d;", "Le71/l$e;", "Le71/l$f;", "Le71/l$g;", "Le71/l$h;", "Le71/l$i;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f63316d = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f63317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63319c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$a;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends l {
        public a() {
            super(Integer.valueOf(R.string.activities_training_effect_anaerobic_capacity), R.color.gcm_exercise_load_purple, R.string.activity_anaerobic_label, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$b;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends l {
        public b() {
            super(Integer.valueOf(R.string.activities_training_effect_aerobic_base), R.color.gcm_exercise_load_teal, R.string.activities_low_aerobic_title, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$d;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends l {
        public d() {
            super(Integer.valueOf(R.string.activities_training_effect_recovery), R.color.gcm_exercise_load_teal, R.string.activities_low_aerobic_title, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$e;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends l {
        public e() {
            super(Integer.valueOf(R.string.lbl_segment_classification_sprint), R.color.gcm_exercise_load_purple, R.string.activity_anaerobic_label, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$f;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends l {
        public f() {
            super(Integer.valueOf(R.string.activities_training_effect_tempo), R.color.gcm_exercise_load_orange, R.string.activities_high_aerobic_title, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$g;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends l {
        public g() {
            super(Integer.valueOf(R.string.activities_training_effect_threshold), R.color.gcm_exercise_load_orange, R.string.activities_high_aerobic_title, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$h;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends l {
        /* JADX WARN: Multi-variable type inference failed */
        public h() {
            super(null, R.color.gcm_exercise_load_gray, R.string.lbl_unknown, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le71/l$i;", "Le71/l;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i extends l {
        public i() {
            super(Integer.valueOf(R.string.activities_training_effect_vo2_max), R.color.gcm_exercise_load_orange, R.string.activities_high_aerobic_title, null);
        }
    }

    private l(Integer num, int i14, int i15) {
        this.f63317a = num;
        this.f63318b = i14;
        this.f63319c = i15;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Le71/l$c;", "", "<init>", "()V", "", "ANAEROBIC_CAPACITY", "Ljava/lang/String;", "SPEED", "TEMPO", "LACTATE_THRESHOLD", "VO2MAX", "AEROBIC_BASE", "RECOVERY", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static l a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1758336501:
                        if (str.equals("VO2MAX")) {
                            return new i();
                        }
                        break;
                    case -16486507:
                        if (str.equals("RECOVERY")) {
                            return new d();
                        }
                        break;
                    case 35142616:
                        if (str.equals("LACTATE_THRESHOLD")) {
                            return new g();
                        }
                        break;
                    case 79104039:
                        if (str.equals("SPEED")) {
                            return new e();
                        }
                        break;
                    case 79707899:
                        if (str.equals("TEMPO")) {
                            return new f();
                        }
                        break;
                    case 1808173237:
                        if (str.equals("AEROBIC_BASE")) {
                            return new b();
                        }
                        break;
                    case 2125400779:
                        if (str.equals("ANAEROBIC_CAPACITY")) {
                            return new a();
                        }
                        break;
                }
            }
            return new h();
        }

        private c() {
        }
    }

    public /* synthetic */ l(Integer num, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(num, i14, i15);
    }
}
