package rf2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lrf2/d;", "", "", "clusterId", "<init>", "(I)V", "a", "d", "c", "b", "Lrf2/d$a;", "Lrf2/d$b;", "Lrf2/d$c;", "Lrf2/d$d;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152463a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrf2/d$a;", "Lrf2/d;", "", TtmlNode.ATTR_ID, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f152464b;

        public a(int i14) {
            super(i14, null);
            this.f152464b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f152464b == ((a) obj).f152464b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f152464b);
        }

        public final String toString() {
            return e0.f(this.f152464b, "AddCluster(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrf2/d$b;", "Lrf2/d;", "", TtmlNode.ATTR_ID, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f152465b;

        public b(int i14) {
            super(i14, null);
            this.f152465b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f152465b == ((b) obj).f152465b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f152465b);
        }

        public final String toString() {
            return e0.f(this.f152465b, "DeletedCluster(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrf2/d$c;", "Lrf2/d;", "", TtmlNode.ATTR_ID, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f152466b;

        public c(int i14) {
            super(i14, null);
            this.f152466b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f152466b == ((c) obj).f152466b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f152466b);
        }

        public final String toString() {
            return e0.f(this.f152466b, "SkippedCluster(id=", ")");
        }
    }

    /* JADX INFO: renamed from: rf2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrf2/d$d;", "Lrf2/d;", "", TtmlNode.ATTR_ID, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2867d extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f152467b;

        public C2867d(int i14) {
            super(i14, null);
            this.f152467b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2867d) && this.f152467b == ((C2867d) obj).f152467b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f152467b);
        }

        public final String toString() {
            return e0.f(this.f152467b, "StartCluster(id=", ")");
        }
    }

    private d(int i14) {
        this.f152463a = i14;
    }

    public /* synthetic */ d(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }
}
