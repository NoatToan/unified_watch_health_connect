package jo;

import eo.g;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ljo/f;", "", "Leo/f;", "sortBy", "Leo/g;", "sortOrder", "<init>", "(Leo/f;Leo/g;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f99756c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.f f99757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f99758b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99760b;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f99759a = iArr;
            int[] iArr2 = new int[eo.f.values().length];
            try {
                iArr2[eo.f.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[eo.f.START_LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f99760b = iArr2;
        }
    }

    public /* synthetic */ f(eo.f fVar, g gVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? eo.f.START_LOCAL : fVar, (i14 & 2) != 0 ? g.DESCENDING : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f99757a == fVar.f99757a && this.f99758b == fVar.f99758b;
    }

    public final int hashCode() {
        return this.f99758b.hashCode() + (this.f99757a.hashCode() * 31);
    }

    public final String toString() {
        return "SortData(sortBy=" + this.f99757a + ", sortOrder=" + this.f99758b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo/f$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static List a() {
            eo.f fVar = eo.f.START_LOCAL;
            g gVar = g.DESCENDING;
            f fVar2 = new f(fVar, gVar);
            g gVar2 = g.ASCENDING;
            f fVar3 = new f(fVar, gVar2);
            eo.f fVar4 = eo.f.NAME;
            return x.k(fVar2, fVar3, new f(fVar4, gVar2), new f(fVar4, gVar));
        }

        private a() {
        }
    }

    public f(eo.f fVar, g gVar) {
        fVar.getClass();
        gVar.getClass();
        this.f99757a = fVar;
        this.f99758b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
