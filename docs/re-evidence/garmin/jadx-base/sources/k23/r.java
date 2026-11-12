package k23;

import com.garmin.android.gncs.NotificationConstants;
import lc.u0;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk23/r;", "", "Lk23/s;", "variance", "Lk23/p;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lk23/s;Lk23/p;)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f102461c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f102462d = new r(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f102463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f102464b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102465a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102465a = iArr;
        }
    }

    public r(s sVar, p pVar) {
        String str;
        this.f102463a = sVar;
        this.f102464b = pVar;
        if ((sVar == null) == (pVar == null)) {
            return;
        }
        if (sVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + sVar + " requires type to be specified.";
        }
        vb.h.x(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f102463a == rVar.f102463a && p005kotlin.jvm.internal.s.g(this.f102464b, rVar.f102464b);
    }

    public final int hashCode() {
        s sVar = this.f102463a;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        p pVar = this.f102464b;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        s sVar = this.f102463a;
        int i14 = sVar == null ? -1 : b.f102465a[sVar.ordinal()];
        if (i14 == -1) {
            return Marker.ANY_MARKER;
        }
        p pVar = this.f102464b;
        if (i14 == 1) {
            return String.valueOf(pVar);
        }
        if (i14 == 2) {
            return "in " + pVar;
        }
        if (i14 != 3) {
            u0.r();
            return null;
        }
        return "out " + pVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk23/r$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static r a(p pVar) {
            pVar.getClass();
            return new r(s.INVARIANT, pVar);
        }

        private a() {
        }
    }
}
