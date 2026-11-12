package bz;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbz/d;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0336d f22263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f22265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f22266e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/capabilities/DeviceFeatureCompatibility.COMPATIBLE", "Lbz/d;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends d {
        public a(String str, int i14) {
            super(str, i14, null);
        }

        @Override // bz.d
        public final List<String> a() {
            return null;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: b */
        public final Integer getF22267f() {
            return null;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: c */
        public final Integer getF22268g() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/capabilities/DeviceFeatureCompatibility.GC_PLUS_REQUIRED", "Lbz/d;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends d {
        public b(String str, int i14) {
            super(str, i14, null);
        }

        @Override // bz.d
        public final List<String> a() {
            return null;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: b */
        public final Integer getF22267f() {
            return null;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: c */
        public final Integer getF22268g() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/capabilities/DeviceFeatureCompatibility.INCOMPATIBLE", "Lbz/d;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends d {
        public c(String str, int i14) {
            super(str, i14, null);
        }

        @Override // bz.d
        public final List<String> a() {
            return null;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: b */
        public final Integer getF22267f() {
            return null;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: c */
        public final Integer getF22268g() {
            return null;
        }
    }

    /* JADX INFO: renamed from: bz.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/capabilities/DeviceFeatureCompatibility.PARTIALLY_COMPATIBLE", "Lbz/d;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0336d extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f22267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f22268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<String> f22269h;

        public C0336d(String str, int i14) {
            super(str, i14, null);
        }

        @Override // bz.d
        public final List<String> a() {
            return this.f22269h;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getF22267f() {
            return this.f22267f;
        }

        @Override // bz.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF22268g() {
            return this.f22268g;
        }
    }

    static {
        a aVar = new a("COMPATIBLE", 0);
        f22262a = aVar;
        C0336d c0336d = new C0336d("PARTIALLY_COMPATIBLE", 1);
        f22263b = c0336d;
        c cVar = new c("INCOMPATIBLE", 2);
        f22264c = cVar;
        b bVar = new b("GC_PLUS_REQUIRED", 3);
        f22265d = bVar;
        f22266e = new d[]{aVar, c0336d, cVar, bVar};
    }

    public /* synthetic */ d(String str, int i14, j jVar) {
        this(str, i14);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f22266e.clone();
    }

    public abstract List<String> a();

    /* JADX INFO: renamed from: b */
    public abstract Integer getF22267f();

    /* JADX INFO: renamed from: c */
    public abstract Integer getF22268g();

    private d(String str, int i14) {
        super(str, i14);
    }
}
