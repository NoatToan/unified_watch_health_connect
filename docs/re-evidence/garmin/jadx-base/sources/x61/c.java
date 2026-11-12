package x61;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u001f\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0010\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lx61/c;", "", "", Action.KEY_ATTRIBUTE, "", "resId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "m", "p", "l", "f", "c", IntegerTokenConverter.CONVERTER_KEY, "d", "j", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_EXPONENT, "b", "g", "a", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "o", JWKParameterNames.RSA_MODULUS, "h", "Lx61/c$a;", "Lx61/c$b;", "Lx61/c$c;", "Lx61/c$d;", "Lx61/c$e;", "Lx61/c$f;", "Lx61/c$g;", "Lx61/c$h;", "Lx61/c$i;", "Lx61/c$j;", "Lx61/c$k;", "Lx61/c$l;", "Lx61/c$n;", "Lx61/c$o;", "Lx61/c$p;", "Lx61/c$q;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f189186c = new m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f189188b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$a;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c {
        public a() {
            super("ABOVE_TARGETS", Integer.valueOf(R.string.lbl_above_targets_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$b;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends c {
        public b() {
            super("AEROBIC_HIGH_FOCUS", Integer.valueOf(R.string.activities_high_aerobic_title), null);
        }
    }

    /* JADX INFO: renamed from: x61.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$c;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3520c extends c {
        public C3520c() {
            super("AEROBIC_HIGH_SHORTAGE", Integer.valueOf(R.string.lbl_high_aerobic_shortage), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$d;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends c {
        public d() {
            super("AEROBIC_HIGH_SHORTAGE", Integer.valueOf(R.string.lbl_high_aerobic_shortage), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$e;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends c {
        public e() {
            super("AEROBIC_LOW_FOCUS", Integer.valueOf(R.string.activities_low_aerobic_title), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$f;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends c {
        public f() {
            super("AEROBIC_LOW_SHORTAGE", Integer.valueOf(R.string.lbl_low_aer_shortage_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$g;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends c {
        public g() {
            super("ANAEROBIC_FOCUS", Integer.valueOf(R.string.activity_anaerobic_label), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$h;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends c {
        public h() {
            super("ABOVE_TARGETS", Integer.valueOf(R.string.lbl_anaerobic_overage_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$i;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i extends c {
        public i() {
            super("ANAEROBIC_SHORTAGE", Integer.valueOf(R.string.lbl_anaer_shortage_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$j;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j extends c {
        public j() {
            super("ANAEROBIC_SHORTAGE", Integer.valueOf(R.string.lbl_anaer_shortage_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$k;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k extends c {
        public k() {
            super("BALANCED", Integer.valueOf(R.string.lbl_is_in_balance), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$l;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l extends c {
        public l() {
            super("BELOW_TARGETS", Integer.valueOf(R.string.lbl_below_targets_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$n;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n extends c {
        public n() {
            super("ABOVE_TARGETS", Integer.valueOf(R.string.lbl_high_aero_overage_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$o;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class o extends c {
        public o() {
            super("ABOVE_TARGETS", Integer.valueOf(R.string.lbl_low_aero_overage_lf), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$p;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class p extends c {
        public p() {
            super("NO_RESULT", Integer.valueOf(R.string.common_not_available), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx61/c$q;", "Lx61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class q extends c {
        public q() {
            super("ABOVE_TARGETS", Integer.valueOf(R.string.lbl_on_target_lf), null);
        }
    }

    private c(String str, Integer num) {
        this.f189187a = str;
        this.f189188b = num;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lx61/c$m;", "", "<init>", "()V", "", "NO_RESULT", "Ljava/lang/String;", "BELOW_TARGETS", "AEROBIC_LOW_SHORTAGE", "AEROBIC_HIGH_SHORTAGE", "ANAEROBIC_SHORTAGE", "BALANCED", "AEROBIC_LOW_FOCUS", "AEROBIC_HIGH_FOCUS", "ANAEROBIC_FOCUS", "ABOVE_TARGETS", "ON_TARGET", "LOW_AEROBIC_OVERAGE", "HIGH_AEROBIC_OVERAGE", "ANAEROBIC_OVERAGE", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m {
        public /* synthetic */ m(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static c a(String str) {
            if (p005kotlin.jvm.internal.s.g(str, "AEROBIC_HIGH_SHORTAGE")) {
                return new d();
            }
            if (p005kotlin.jvm.internal.s.g(str, "ANAEROBIC_SHORTAGE")) {
                return new j();
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1673834511:
                        if (str.equals("ON_TARGET")) {
                            return new q();
                        }
                        break;
                    case -1646479332:
                        if (str.equals("LOW_AEROBIC_OVERAGE")) {
                            return new o();
                        }
                        break;
                    case -1349355449:
                        if (str.equals("ANAEROBIC_FOCUS")) {
                            return new g();
                        }
                        break;
                    case -1142203128:
                        if (str.equals("BALANCED")) {
                            return new k();
                        }
                        break;
                    case -992037751:
                        if (str.equals("AEROBIC_LOW_FOCUS")) {
                            return new e();
                        }
                        break;
                    case -529706464:
                        if (str.equals("ABOVE_TARGETS")) {
                            return new a();
                        }
                        break;
                    case -521663086:
                        if (str.equals("AEROBIC_LOW_SHORTAGE")) {
                            return new f();
                        }
                        break;
                    case -433789260:
                        if (str.equals("BELOW_TARGETS")) {
                            return new l();
                        }
                        break;
                    case -50717862:
                        if (str.equals("ANAEROBIC_OVERAGE")) {
                            return new h();
                        }
                        break;
                    case 90418076:
                        if (str.equals("AEROBIC_HIGH_SHORTAGE")) {
                            return new C3520c();
                        }
                        break;
                    case 1850722580:
                        if (str.equals("ANAEROBIC_SHORTAGE")) {
                            return new i();
                        }
                        break;
                    case 2007294655:
                        if (str.equals("AEROBIC_HIGH_FOCUS")) {
                            return new b();
                        }
                        break;
                    case 2078198410:
                        if (str.equals("HIGH_AEROBIC_OVERAGE")) {
                            return new n();
                        }
                        break;
                }
            }
            return new p();
        }

        private m() {
        }
    }

    public /* synthetic */ c(String str, Integer num, p005kotlin.jvm.internal.j jVar) {
        this(str, num);
    }
}
