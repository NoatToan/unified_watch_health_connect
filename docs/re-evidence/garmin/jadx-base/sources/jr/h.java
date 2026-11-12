package jr;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB#\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Ljr/h;", "", "", "isLight", "", "Lfs/e;", "stickers", "<init>", "(ZLjava/util/List;)V", "a", "b", JWKParameterNames.RSA_EXPONENT, "c", "d", "f", "Ljr/h$a;", "Ljr/h$b;", "Ljr/h$c;", "Ljr/h$d;", "Ljr/h$e;", "Ljr/h$f;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f100059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<fs.e> f100060b;

    public h(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list, null);
    }

    public List<fs.e> a() {
        return this.f100060b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getF100059a() {
        return this.f100059a;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/h$a;", "Ljr/h;", "", "isLight", "", "Lfs/e;", "stickers", "<init>", "(ZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<fs.e> f100062d;

        public a(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        @Override // jr.h
        public final List<fs.e> a() {
            return this.f100062d;
        }

        @Override // jr.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF100059a() {
            return this.f100061c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f100061c == aVar.f100061c && p005kotlin.jvm.internal.s.g(this.f100062d, aVar.f100062d);
        }

        public final int hashCode() {
            return this.f100062d.hashCode() + (Boolean.hashCode(this.f100061c) * 31);
        }

        public final String toString() {
            return "BottomStats(isLight=" + this.f100061c + ", stickers=" + this.f100062d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, List<fs.e> list) {
            super(z14, list, null);
            list.getClass();
            this.f100061c = z14;
            this.f100062d = list;
        }

        public a() {
            this(false, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/h$b;", "Ljr/h;", "", "isLight", "", "Lfs/e;", "stickers", "<init>", "(ZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<fs.e> f100064d;

        public b(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        @Override // jr.h
        public final List<fs.e> a() {
            return this.f100064d;
        }

        @Override // jr.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF100059a() {
            return this.f100063c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f100063c == bVar.f100063c && p005kotlin.jvm.internal.s.g(this.f100064d, bVar.f100064d);
        }

        public final int hashCode() {
            return this.f100064d.hashCode() + (Boolean.hashCode(this.f100063c) * 31);
        }

        public final String toString() {
            return "BottomStatsWithLocation(isLight=" + this.f100063c + ", stickers=" + this.f100064d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, List<fs.e> list) {
            super(z14, list, null);
            list.getClass();
            this.f100063c = z14;
            this.f100064d = list;
        }

        public b() {
            this(false, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/h$c;", "Ljr/h;", "", "isLight", "", "Lfs/e;", "stickers", "<init>", "(ZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<fs.e> f100066d;

        public c(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        @Override // jr.h
        public final List<fs.e> a() {
            return this.f100066d;
        }

        @Override // jr.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF100059a() {
            return this.f100065c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f100065c == cVar.f100065c && p005kotlin.jvm.internal.s.g(this.f100066d, cVar.f100066d);
        }

        public final int hashCode() {
            return this.f100066d.hashCode() + (Boolean.hashCode(this.f100065c) * 31);
        }

        public final String toString() {
            return "LogoOnly(isLight=" + this.f100065c + ", stickers=" + this.f100066d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z14, List<fs.e> list) {
            super(z14, list, null);
            list.getClass();
            this.f100065c = z14;
            this.f100066d = list;
        }

        public c() {
            this(false, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/h$d;", "Ljr/h;", "", "isLight", "", "Lfs/e;", "stickers", "<init>", "(ZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<fs.e> f100068d;

        public d(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        @Override // jr.h
        public final List<fs.e> a() {
            return this.f100068d;
        }

        @Override // jr.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF100059a() {
            return this.f100067c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f100067c == dVar.f100067c && p005kotlin.jvm.internal.s.g(this.f100068d, dVar.f100068d);
        }

        public final int hashCode() {
            return this.f100068d.hashCode() + (Boolean.hashCode(this.f100067c) * 31);
        }

        public final String toString() {
            return "PhotoSharingLine(isLight=" + this.f100067c + ", stickers=" + this.f100068d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z14, List<fs.e> list) {
            super(z14, list, null);
            list.getClass();
            this.f100067c = z14;
            this.f100068d = list;
        }

        public d() {
            this(false, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/h$e;", "Ljr/h;", "", "isLight", "", "Lfs/e;", "stickers", "<init>", "(ZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<fs.e> f100070d;

        public e(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        @Override // jr.h
        public final List<fs.e> a() {
            return this.f100070d;
        }

        @Override // jr.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF100059a() {
            return this.f100069c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f100069c == eVar.f100069c && p005kotlin.jvm.internal.s.g(this.f100070d, eVar.f100070d);
        }

        public final int hashCode() {
            return this.f100070d.hashCode() + (Boolean.hashCode(this.f100069c) * 31);
        }

        public final String toString() {
            return "PolyLine(isLight=" + this.f100069c + ", stickers=" + this.f100070d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z14, List<fs.e> list) {
            super(z14, list, null);
            list.getClass();
            this.f100069c = z14;
            this.f100070d = list;
        }

        public e() {
            this(false, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/h$f;", "Ljr/h;", "", "isLight", "", "Lfs/e;", "stickers", "<init>", "(ZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<fs.e> f100072d;

        public f(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        @Override // jr.h
        public final List<fs.e> a() {
            return this.f100072d;
        }

        @Override // jr.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF100059a() {
            return this.f100071c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f100071c == fVar.f100071c && p005kotlin.jvm.internal.s.g(this.f100072d, fVar.f100072d);
        }

        public final int hashCode() {
            return this.f100072d.hashCode() + (Boolean.hashCode(this.f100071c) * 31);
        }

        public final String toString() {
            return "TopLeftStats(isLight=" + this.f100071c + ", stickers=" + this.f100072d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z14, List<fs.e> list) {
            super(z14, list, null);
            list.getClass();
            this.f100071c = z14;
            this.f100072d = list;
        }

        public f() {
            this(false, null, 3, null);
        }
    }

    private h(boolean z14, List<fs.e> list) {
        this.f100059a = z14;
        this.f100060b = list;
    }

    public /* synthetic */ h(boolean z14, List list, p005kotlin.jvm.internal.j jVar) {
        this(z14, list);
    }
}
