package m63;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/b2;", "Lm63/n1;", "Lo13/w;", "bufferWithData", "<init>", "([BLkotlin/jvm/internal/j;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 extends n1<o13.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f116921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116922b;

    private b2(byte[] bArr) {
        bArr.getClass();
        this.f116921a = bArr;
        this.f116922b = bArr.length;
        b(10);
    }

    @Override // m63.n1
    public final o13.w a() {
        return o13.w.a(Arrays.copyOf(this.f116921a, this.f116922b));
    }

    @Override // m63.n1
    public final void b(int i14) {
        byte[] bArr = this.f116921a;
        if (bArr.length < i14) {
            int length = bArr.length * 2;
            if (i14 < length) {
                i14 = length;
            }
            this.f116921a = Arrays.copyOf(bArr, i14);
        }
    }

    @Override // m63.n1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF116922b() {
        return this.f116922b;
    }

    public /* synthetic */ b2(byte[] bArr, p005kotlin.jvm.internal.j jVar) {
        this(bArr);
    }
}
