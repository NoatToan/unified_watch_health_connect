package o71;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o13.m;
import o13.t;
import p005kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo71/a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f130129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w13.c f130130b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    /* JADX INFO: renamed from: o71.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/MuscleGroup.ARMS", "Lo71/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2479a extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f130131f = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f130132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n71.g.a f130133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n71.g.a f130134e;

        public C2479a(String str, int i14) {
            super(str, i14, null);
            this.f130132c = m.b(new nw1.e(16));
            this.f130133d = new n71.g.a(R.string.muscle_group_arms);
            this.f130134e = new n71.g.a(R.string.filter_all_arms_muscles);
        }

        @Override // o71.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n71.g.a getF130154e() {
            return this.f130134e;
        }

        @Override // o71.a
        public final List<zw1.a> b() {
            return (List) this.f130132c.getValue();
        }

        @Override // o71.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public final n71.g.a getF130153d() {
            return this.f130133d;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/MuscleGroup.BACK", "Lo71/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f130135f = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f130136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n71.g.a f130137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n71.g.a f130138e;

        public b(String str, int i14) {
            super(str, i14, null);
            this.f130136c = m.b(new nw1.e(17));
            this.f130137d = new n71.g.a(R.string.muscle_group_back);
            this.f130138e = new n71.g.a(R.string.filter_all_back_muscles);
        }

        @Override // o71.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n71.g.a getF130154e() {
            return this.f130138e;
        }

        @Override // o71.a
        public final List<zw1.a> b() {
            return (List) this.f130136c.getValue();
        }

        @Override // o71.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public final n71.g.a getF130153d() {
            return this.f130137d;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/MuscleGroup.CORE", "Lo71/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f130139f = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f130140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n71.g.a f130141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n71.g.a f130142e;

        public c(String str, int i14) {
            super(str, i14, null);
            this.f130140c = m.b(new nw1.e(18));
            this.f130141d = new n71.g.a(R.string.muscle_group_core);
            this.f130142e = new n71.g.a(R.string.filter_all_core_muscles);
        }

        @Override // o71.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n71.g.a getF130154e() {
            return this.f130142e;
        }

        @Override // o71.a
        public final List<zw1.a> b() {
            return (List) this.f130140c.getValue();
        }

        @Override // o71.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public final n71.g.a getF130153d() {
            return this.f130141d;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/MuscleGroup.HIPS", "Lo71/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f130143f = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f130144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n71.g.a f130145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n71.g.a f130146e;

        public d(String str, int i14) {
            super(str, i14, null);
            this.f130144c = m.b(new nw1.e(19));
            this.f130145d = new n71.g.a(R.string.muscle_group_hips);
            this.f130146e = new n71.g.a(R.string.filter_all_hips_muscles);
        }

        @Override // o71.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n71.g.a getF130154e() {
            return this.f130146e;
        }

        @Override // o71.a
        public final List<zw1.a> b() {
            return (List) this.f130144c.getValue();
        }

        @Override // o71.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public final n71.g.a getF130153d() {
            return this.f130145d;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/MuscleGroup.LEGS", "Lo71/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f130147f = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f130148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n71.g.a f130149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n71.g.a f130150e;

        public e(String str, int i14) {
            super(str, i14, null);
            this.f130148c = m.b(new nw1.e(20));
            this.f130149d = new n71.g.a(R.string.muscle_group_legs);
            this.f130150e = new n71.g.a(R.string.filter_all_legs_muscles);
        }

        @Override // o71.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n71.g.a getF130154e() {
            return this.f130150e;
        }

        @Override // o71.a
        public final List<zw1.a> b() {
            return (List) this.f130148c.getValue();
        }

        @Override // o71.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public final n71.g.a getF130153d() {
            return this.f130149d;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/MuscleGroup.UPPER_BODY", "Lo71/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f130151f = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f130152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n71.g.a f130153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n71.g.a f130154e;

        public f(String str, int i14) {
            super(str, i14, null);
            this.f130152c = m.b(new nw1.e(21));
            this.f130153d = new n71.g.a(R.string.muscle_group_upper_body);
            this.f130154e = new n71.g.a(R.string.filter_all_upper_body_muscles);
        }

        @Override // o71.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n71.g.a getF130154e() {
            return this.f130154e;
        }

        @Override // o71.a
        public final List<zw1.a> b() {
            return (List) this.f130152c.getValue();
        }

        @Override // o71.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public final n71.g.a getF130153d() {
            return this.f130153d;
        }
    }

    static {
        a[] aVarArr = {new f("UPPER_BODY", 0), new C2479a("ARMS", 1), new b("BACK", 2), new c("CORE", 3), new d("HIPS", 4), new e("LEGS", 5)};
        f130129a = aVarArr;
        f130130b = new w13.c(aVarArr);
    }

    public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, i14);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f130129a.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract n71.g.a getF130154e();

    public abstract List<zw1.a> b();

    /* JADX INFO: renamed from: c */
    public abstract n71.g.a getF130153d();

    private a(String str, int i14) {
        super(str, i14);
    }
}
