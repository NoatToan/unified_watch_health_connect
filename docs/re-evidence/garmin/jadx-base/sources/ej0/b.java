package ej0;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lej0/b;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "a", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f64399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f64400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f64401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f64402d;

    /* JADX INFO: renamed from: ej0.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1364b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64403a;

        static {
            int[] iArr = new int[yi0.a.values().length];
            try {
                iArr[yi0.a.SUPERIOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yi0.a.UNTRAINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64403a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(l22.b bVar) {
        bVar.getClass();
        this.f64399a = bVar;
        final int i14 = 0;
        this.f64400b = m.b(new e23.a(this) { // from class: ej0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f64398b;

            {
                this.f64398b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f64398b.f64399a.getString(R.string.no_value);
                    case 1:
                        return this.f64398b.f64399a.getString(R.string.lbl_gender_males);
                    default:
                        return this.f64398b.f64399a.getString(R.string.lbl_gender_females);
                }
            }
        });
        final int i15 = 1;
        this.f64401c = m.b(new e23.a(this) { // from class: ej0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f64398b;

            {
                this.f64398b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.f64398b.f64399a.getString(R.string.no_value);
                    case 1:
                        return this.f64398b.f64399a.getString(R.string.lbl_gender_males);
                    default:
                        return this.f64398b.f64399a.getString(R.string.lbl_gender_females);
                }
            }
        });
        final int i16 = 2;
        this.f64402d = m.b(new e23.a(this) { // from class: ej0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f64398b;

            {
                this.f64398b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return this.f64398b.f64399a.getString(R.string.no_value);
                    case 1:
                        return this.f64398b.f64399a.getString(R.string.lbl_gender_males);
                    default:
                        return this.f64398b.f64399a.getString(R.string.lbl_gender_females);
                }
            }
        });
    }

    public static boolean c(Double d14) {
        return (d14 == null || Double.isNaN(d14.doubleValue()) || s.c(d14, 0.0d)) ? false : true;
    }

    public final String a(Double d14, yi0.b bVar) {
        if (!c(d14)) {
            return (String) this.f64400b.getValue();
        }
        if (bVar == yi0.b.W_PER_KG) {
            return l3.f23129g.format(d14);
        }
        return String.valueOf(d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null);
    }

    public final int b() {
        l.f68084a.getClass();
        String strW = l.a.a().w();
        l22.b bVar = this.f64399a;
        if (bVar.getString(R.string.user_gender_value_male).equalsIgnoreCase(strW)) {
            return 0;
        }
        return bVar.getString(R.string.user_gender_value_female).equalsIgnoreCase(strW) ? 1 : 2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lej0/b$a;", "", "<init>", "()V", "", "GENDER_MALE", "I", "GENDER_FEMALE", "GENDER_NOT_SPECIFIED", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
