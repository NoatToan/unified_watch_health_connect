package m63;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/f2;", "Lm63/n1;", "Lo13/a0;", "bufferWithData", "<init>", "([JLkotlin/jvm/internal/j;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f2 extends n1<o13.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f116946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116947b;

    private f2(long[] jArr) {
        jArr.getClass();
        this.f116946a = jArr;
        this.f116947b = jArr.length;
        b(10);
    }

    @Override // m63.n1
    public final o13.a0 a() {
        return o13.a0.a(Arrays.copyOf(this.f116946a, this.f116947b));
    }

    @Override // m63.n1
    public final void b(int i14) {
        long[] jArr = this.f116946a;
        if (jArr.length < i14) {
            int length = jArr.length * 2;
            if (i14 < length) {
                i14 = length;
            }
            this.f116946a = Arrays.copyOf(jArr, i14);
        }
    }

    @Override // m63.n1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF116947b() {
        return this.f116947b;
    }

    public /* synthetic */ f2(long[] jArr, p005kotlin.jvm.internal.j jVar) {
        this(jArr);
    }
}
