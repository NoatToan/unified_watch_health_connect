package m63;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/d2;", "Lm63/n1;", "Lo13/y;", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/j;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d2 extends n1<o13.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f116934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116935b;

    private d2(int[] iArr) {
        iArr.getClass();
        this.f116934a = iArr;
        this.f116935b = iArr.length;
        b(10);
    }

    @Override // m63.n1
    public final o13.y a() {
        return o13.y.a(Arrays.copyOf(this.f116934a, this.f116935b));
    }

    @Override // m63.n1
    public final void b(int i14) {
        int[] iArr = this.f116934a;
        if (iArr.length < i14) {
            int length = iArr.length * 2;
            if (i14 < length) {
                i14 = length;
            }
            this.f116934a = Arrays.copyOf(iArr, i14);
        }
    }

    @Override // m63.n1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF116935b() {
        return this.f116935b;
    }

    public /* synthetic */ d2(int[] iArr, p005kotlin.jvm.internal.j jVar) {
        this(iArr);
    }
}
