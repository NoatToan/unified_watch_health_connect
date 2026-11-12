package b63;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\tB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lb63/t;", "Lb63/r;", "Lj23/g;", "Lb63/o;", "Lj23/r;", TtmlNode.START, "endInclusive", "<init>", "(Lb63/o;Lb63/o;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends r implements j23.g<o>, j23.r<o> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16215d = new a(null);

    static {
        new t(new o(1970, 1, 2), new o(1970, 1, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, o oVar2) {
        super(oVar, oVar2, 1L);
        oVar.getClass();
        oVar2.getClass();
    }

    @Override // j23.g
    public final Comparable b() {
        return this.f16213c;
    }

    @Override // j23.r
    public final Comparable c() {
        o.INSTANCE.getClass();
        o oVar = o.f16205b;
        o oVar2 = this.f16213c;
        if (p005kotlin.jvm.internal.s.g(oVar2, oVar)) {
            vb.h.z("Cannot return the exclusive upper bound of a range that includes LocalDate.MAX.");
            return null;
        }
        i.INSTANCE.getClass();
        return q.e(oVar2, 1, i.f16190d);
    }

    @Override // b63.r
    /* JADX INFO: renamed from: d */
    public final boolean contains(o oVar) {
        oVar.getClass();
        return this.f16212b.compareTo(oVar) <= 0 && oVar.compareTo(this.f16213c) <= 0;
    }

    @Override // j23.g, j23.r
    public final Comparable getStart() {
        return this.f16212b;
    }

    @Override // b63.r, java.util.Collection
    public final boolean isEmpty() {
        return this.f16212b.compareTo(this.f16213c) > 0;
    }

    @Override // b63.r
    public final String toString() {
        return this.f16212b + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f16213c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/t$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
