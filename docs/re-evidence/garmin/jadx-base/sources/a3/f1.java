package a3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"La3/f1;", "Lu1/f1;", "", "bounded", "Lg6/f;", "radius", "Lo4/j0;", "colorProducer", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(ZFLo4/j0;J)V", "(ZFLo4/j0;Lkotlin/jvm/internal/j;)V", "(ZFJLkotlin/jvm/internal/j;)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 implements u1.f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o4.j0 f657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f658d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements o4.j0 {
        public a() {
        }

        @Override // o4.j0
        public final long a() {
            return f1.this.f658d;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private f1(boolean z14, float f14, o4.j0 j0Var) {
        this(z14, f14, j0Var, o4.d0.f128832k);
        o4.d0.f128823b.getClass();
    }

    @Override // u1.f1
    public final h5.j a(a2.i iVar) {
        o4.j0 aVar = this.f657c;
        if (aVar == null) {
            aVar = new a();
        }
        float f14 = this.f656b;
        return new g0(iVar, this.f655a, f14, aVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (this.f655a == f1Var.f655a && g6.f.c(this.f656b, f1Var.f656b) && p005kotlin.jvm.internal.s.g(this.f657c, f1Var.f657c)) {
            return o4.d0.d(this.f658d, f1Var.f658d);
        }
        return false;
    }

    @Override // u1.f1
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f655a) * 31;
        g6.f.a aVar = g6.f.f75994b;
        int iD = q6.f.d(this.f656b, iHashCode, 31);
        o4.j0 j0Var = this.f657c;
        int iHashCode2 = j0Var != null ? j0Var.hashCode() : 0;
        o4.d0.a aVar2 = o4.d0.f128823b;
        o13.z.a aVar3 = o13.z.f128618b;
        return Long.hashCode(this.f658d) + ((iD + iHashCode2) * 31);
    }

    public /* synthetic */ f1(boolean z14, float f14, o4.j0 j0Var, p005kotlin.jvm.internal.j jVar) {
        this(z14, f14, j0Var);
    }

    private f1(boolean z14, float f14, o4.j0 j0Var, long j8) {
        this.f655a = z14;
        this.f656b = f14;
        this.f657c = j0Var;
        this.f658d = j8;
    }

    public /* synthetic */ f1(boolean z14, float f14, long j8, p005kotlin.jvm.internal.j jVar) {
        this(z14, f14, j8);
    }

    private f1(boolean z14, float f14, long j8) {
        this(z14, f14, (o4.j0) null, j8);
    }
}
