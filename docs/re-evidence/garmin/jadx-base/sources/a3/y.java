package a3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La3/y;", "Lo4/d0;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/j;)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f883d;

    private y(long j8, long j14, long j15, long j16) {
        this.f880a = j8;
        this.f881b = j14;
        this.f882c = j15;
        this.f883d = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return o4.d0.d(this.f880a, yVar.f880a) && o4.d0.d(this.f881b, yVar.f881b) && o4.d0.d(this.f882c, yVar.f882c) && o4.d0.d(this.f883d, yVar.f883d);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f883d) + q6.f.e(q6.f.e(Long.hashCode(this.f880a) * 31, 31, this.f881b), 31, this.f882c);
    }

    public /* synthetic */ y(long j8, long j14, long j15, long j16, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16);
    }
}
