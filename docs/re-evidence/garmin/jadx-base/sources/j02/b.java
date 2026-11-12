package j02;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import lc.u0;
import p005kotlin.Metadata;
import p008y1.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lj02/b;", "", "", TtmlNode.START, TtmlNode.END, "<init>", "(FF)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f96025c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f96026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96027b;

    static {
        new b(0.0f, 0.0f);
    }

    public b(float f14, float f15) {
        this.f96026a = f14;
        this.f96027b = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f96026a, bVar.f96026a) == 0 && Float.compare(this.f96027b, bVar.f96027b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f96027b) + (Float.hashCode(this.f96026a) * 31);
    }

    public final String toString() {
        return am.j.l("CollectionScrollPadding(start=", this.f96026a, ", end=", this.f96027b, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj02/b$a;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: j02.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1839a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96028a;

            static {
                int[] iArr = new int[b2.values().length];
                try {
                    iArr[b2.Vertical.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b2.Horizontal.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f96028a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(b2 b2Var, j02.a aVar, boolean z14) {
            b bVar;
            b2Var.getClass();
            aVar.getClass();
            int i14 = C1839a.f96028a[b2Var.ordinal()];
            if (i14 == 1) {
                bVar = new b(aVar.f96016c, aVar.f96017d);
            } else {
                if (i14 != 2) {
                    u0.r();
                    return null;
                }
                bVar = new b(aVar.f96014a, aVar.f96015b);
            }
            if (z14) {
                return new b(bVar.f96027b, bVar.f96026a);
            }
            if (!z14) {
                return bVar;
            }
            u0.r();
            return null;
        }

        private a() {
        }
    }
}
