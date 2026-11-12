package x61;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u007f\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lx61/a;", "", "", Action.KEY_ATTRIBUTE, "", "altitudeMessageResId", "percentageAltitudeMessageResId", "heatMessageResId", "fullAltitudeAcclimationMessageResId", "fullHeatAcclimationMessageResId", "trendDrawableRes", "percentageTrendDrawableRes", "percentageTrendResId", "trendInfoResId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "c", "d", "b", "a", JWKParameterNames.RSA_EXPONENT, "Lx61/a$a;", "Lx61/a$b;", "Lx61/a$d;", "Lx61/a$e;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f189174j = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f189175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f189176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f189177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f189178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f189179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f189180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f189181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f189182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f189183i;

    /* JADX INFO: renamed from: x61.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/a$a;", "Lx61/a;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3518a extends a {
        public C3518a() {
            super("ACCLIMATIZED", Integer.valueOf(R.string.msg_altitude_acc_maintaining), Integer.valueOf(R.string.msg_ability_train_altitude_stable), Integer.valueOf(R.string.msg_temperature_acc_decrease), Integer.valueOf(R.string.msg_altitude_acc_full), Integer.valueOf(R.string.msg_temperature_acc_full), null, Integer.valueOf(R.drawable.icon_trend_stable), Integer.valueOf(R.string.lbl_stable_content_description), Integer.valueOf(R.string.lbl_maintaining_acclimation), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/a$b;", "Lx61/a;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            Integer numValueOf = Integer.valueOf(R.string.msg_altitude_acc_increase);
            Integer numValueOf2 = Integer.valueOf(R.string.msg_ability_train_altitude_increasing);
            Integer numValueOf3 = Integer.valueOf(R.string.msg_temperature_acc_increase);
            Integer numValueOf4 = Integer.valueOf(R.string.msg_altitude_acc_full);
            Integer numValueOf5 = Integer.valueOf(R.string.msg_temperature_acc_full);
            Integer numValueOf6 = Integer.valueOf(R.drawable.icon_trend_up);
            super("ACCLIMATIZING", numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf6, Integer.valueOf(R.string.lbl_trending_up_content_description), Integer.valueOf(R.string.lbl_trending_up_from), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/a$d;", "Lx61/a;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        public d() {
            Integer numValueOf = Integer.valueOf(R.string.msg_altitude_acc_decrease);
            Integer numValueOf2 = Integer.valueOf(R.string.msg_ability_train_altitude_decreasing);
            Integer numValueOf3 = Integer.valueOf(R.string.msg_temperature_acc_decrease);
            Integer numValueOf4 = Integer.valueOf(R.string.msg_altitude_acc_full);
            Integer numValueOf5 = Integer.valueOf(R.string.msg_temperature_acc_full);
            Integer numValueOf6 = Integer.valueOf(R.drawable.icon_trend_down);
            super("DEACCLIMATIZING", numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf6, Integer.valueOf(R.string.lbl_trending_down_content_description), Integer.valueOf(R.string.lbl_trending_down_from), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/a$e;", "Lx61/a;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends a {
        public e() {
            super("", Integer.valueOf(R.string.gcm_training_status_altitude_acclimation_no_trend), null, Integer.valueOf(R.string.gcm_training_status_heat_acclimation_no_trend), null, null, null, null, null, null, null);
        }
    }

    private a(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        this.f189175a = num;
        this.f189176b = num2;
        this.f189177c = num3;
        this.f189178d = num4;
        this.f189179e = num5;
        this.f189180f = num6;
        this.f189181g = num7;
        this.f189182h = num8;
        this.f189183i = num9;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx61/a$c;", "", "<init>", "()V", "", "DEACCLIMATIZING", "Ljava/lang/String;", "ACCLIMATIZING", "ACCLIMATIZED", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1734063281) {
                    if (iHashCode != -610126990) {
                        if (iHashCode == 1471405166 && str.equals("DEACCLIMATIZING")) {
                            return new d();
                        }
                    } else if (str.equals("ACCLIMATIZED")) {
                        return new C3518a();
                    }
                } else if (str.equals("ACCLIMATIZING")) {
                    return new b();
                }
            }
            return new e();
        }

        private c() {
        }
    }

    public /* synthetic */ a(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, p005kotlin.jvm.internal.j jVar) {
        this(str, num, num2, num3, num4, num5, num6, num7, num8, num9);
    }
}
