package w00;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import j20.x;
import o13.m;
import o13.p;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lw00/b;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "a", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f180998f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f180999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f181000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f181001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f181002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f181003e;

    static {
        new a(null);
    }

    public b(l22.b bVar) {
        bVar.getClass();
        this.f180999a = bVar;
        final int i14 = 0;
        this.f181000b = m.b(new e23.a(this) { // from class: w00.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f180997b;

            {
                this.f180997b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f180997b.f180999a.getString(R.string.no_value);
                    case 1:
                        return this.f180997b.f180999a.getString(R.string.lbl_average_heart_rate);
                    case 2:
                        return this.f180997b.f180999a.getString(R.string.txt_empty_page_no_data);
                    default:
                        return this.f180997b.f180999a.getString(R.string.lbl_heart_rate_beats_per_minute);
                }
            }
        });
        final int i15 = 1;
        this.f181001c = m.b(new e23.a(this) { // from class: w00.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f180997b;

            {
                this.f180997b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.f180997b.f180999a.getString(R.string.no_value);
                    case 1:
                        return this.f180997b.f180999a.getString(R.string.lbl_average_heart_rate);
                    case 2:
                        return this.f180997b.f180999a.getString(R.string.txt_empty_page_no_data);
                    default:
                        return this.f180997b.f180999a.getString(R.string.lbl_heart_rate_beats_per_minute);
                }
            }
        });
        final int i16 = 2;
        this.f181002d = m.b(new e23.a(this) { // from class: w00.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f180997b;

            {
                this.f180997b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return this.f180997b.f180999a.getString(R.string.no_value);
                    case 1:
                        return this.f180997b.f180999a.getString(R.string.lbl_average_heart_rate);
                    case 2:
                        return this.f180997b.f180999a.getString(R.string.txt_empty_page_no_data);
                    default:
                        return this.f180997b.f180999a.getString(R.string.lbl_heart_rate_beats_per_minute);
                }
            }
        });
        final int i17 = 3;
        this.f181003e = m.b(new e23.a(this) { // from class: w00.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f180997b;

            {
                this.f180997b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return this.f180997b.f180999a.getString(R.string.no_value);
                    case 1:
                        return this.f180997b.f180999a.getString(R.string.lbl_average_heart_rate);
                    case 2:
                        return this.f180997b.f180999a.getString(R.string.txt_empty_page_no_data);
                    default:
                        return this.f180997b.f180999a.getString(R.string.lbl_heart_rate_beats_per_minute);
                }
            }
        });
    }

    public final String a(int i14) {
        return e.d(i14, StringUtils.SPACE, this.f180999a.getString(i14 == 1 ? R.string.lbl_course_point_alert : R.string.device_alerts));
    }

    public final String b(double d14) {
        l22.b bVar = this.f180999a;
        return d14 > 0.0d ? x.d(e(d14), StringUtils.SPACE, bVar.getString(R.string.lbl_heart_rate_beats_per_minute), StringUtils.SPACE, g()) : e5.g(g(), StringUtils.SPACE, bVar.getString(R.string.txt_empty_page_no_data));
    }

    public final String c(Double d14) {
        t tVar = this.f181001c;
        if (d14 == null) {
            return e5.g((String) tVar.getValue(), StringUtils.SPACE, (String) this.f181002d.getValue());
        }
        double dDoubleValue = d14.doubleValue();
        l3.a aVar = l3.f23124b;
        String strK = k();
        aVar.getClass();
        return x.d((String) tVar.getValue(), StringUtils.SPACE, l3.a.k0(this.f180999a, dDoubleValue, true, strK), StringUtils.SPACE, (String) this.f181003e.getValue());
    }

    public final String d(int i14, boolean z14) {
        double d14 = i14;
        if (d14 < 30.0d) {
            return k();
        }
        l3.a aVar = l3.f23124b;
        String strK = k();
        aVar.getClass();
        return l3.a.k0(this.f180999a, d14, z14, strK);
    }

    public final String e(double d14) {
        if (d14 <= 0.0d) {
            return k();
        }
        l3.a aVar = l3.f23124b;
        double dFloor = Math.floor(d14);
        String strK = k();
        aVar.getClass();
        return l3.a.k0(this.f180999a, dFloor, false, strK);
    }

    public final String f(Double d14, boolean z14) {
        String strK = k();
        if (d14 == null || d14.doubleValue() <= 0.0d) {
            return strK;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.k0(this.f180999a, dDoubleValue, z14, strK);
    }

    public final String g() {
        l22.b bVar = this.f180999a;
        return e5.g(bVar.getString(R.string.lbl_average), StringUtils.SPACE, bVar.getString(R.string.lbl_overnight_heart_rate));
    }

    public final String h() {
        l22.b bVar = this.f180999a;
        return e5.g(bVar.getString(R.string.lbl_average), StringUtils.SPACE, bVar.getString(R.string.hr_zones_lbl_resting_heart_rate));
    }

    public final p i(Double d14) {
        String strF = f(d14, true);
        l22.b bVar = this.f180999a;
        return new p(bVar.a(R.string.param_avg_hr, strF), bVar.a(R.string.string_space_string_pattern, strF, bVar.getString(R.string.lbl_average_heart_rate)));
    }

    public final String j() {
        return this.f180999a.getString(R.string.lbl_bpm);
    }

    public final String k() {
        return (String) this.f181000b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw00/b$a;", "", "<init>", "()V", "", "MIN_HEART_RATE", "D", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
