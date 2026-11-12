package z2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\tB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lz2/b0;", "", "Lz2/b0$a;", TtmlNode.START, TtmlNode.END, "", "handlesCrossed", "<init>", "(Lz2/b0$a;Lz2/b0$a;Z)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f201523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f201524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201525c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz2/b0$a;", "", "Ld6/g;", "direction", "", MapboxMap.QFE_OFFSET, "", "selectableId", "<init>", "(Ld6/g;IJ)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d6.g f201526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f201527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f201528c;

        public a(d6.g gVar, int i14, long j8) {
            this.f201526a = gVar;
            this.f201527b = i14;
            this.f201528c = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f201526a == aVar.f201526a && this.f201527b == aVar.f201527b && this.f201528c == aVar.f201528c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f201528c) + r1.q2.d(this.f201527b, this.f201526a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AnchorInfo(direction=");
            sb3.append(this.f201526a);
            sb3.append(", offset=");
            sb3.append(this.f201527b);
            sb3.append(", selectableId=");
            return androidx.room.a0.l(sb3, this.f201528c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public b0(a aVar, a aVar2, boolean z14) {
        this.f201523a = aVar;
        this.f201524b = aVar2;
        this.f201525c = z14;
    }

    public static b0 a(b0 b0Var, a aVar, a aVar2, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            aVar = b0Var.f201523a;
        }
        if ((i14 & 2) != 0) {
            aVar2 = b0Var.f201524b;
        }
        if ((i14 & 4) != 0) {
            z14 = b0Var.f201525c;
        }
        b0Var.getClass();
        return new b0(aVar, aVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p005kotlin.jvm.internal.s.g(this.f201523a, b0Var.f201523a) && p005kotlin.jvm.internal.s.g(this.f201524b, b0Var.f201524b) && this.f201525c == b0Var.f201525c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201525c) + ((this.f201524b.hashCode() + (this.f201523a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Selection(start=");
        sb3.append(this.f201523a);
        sb3.append(", end=");
        sb3.append(this.f201524b);
        sb3.append(", handlesCrossed=");
        return am.j.t(sb3, this.f201525c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ b0(a aVar, a aVar2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, aVar2, (i14 & 4) != 0 ? false : z14);
    }
}
