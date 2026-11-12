package m63;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/m;", "Lm63/n1;", "", "bufferWithData", "<init>", "([C)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends n1<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f116979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116980b;

    public m(char[] cArr) {
        cArr.getClass();
        this.f116979a = cArr;
        this.f116980b = cArr.length;
        b(10);
    }

    @Override // m63.n1
    public final char[] a() {
        return Arrays.copyOf(this.f116979a, this.f116980b);
    }

    @Override // m63.n1
    public final void b(int i14) {
        char[] cArr = this.f116979a;
        if (cArr.length < i14) {
            int length = cArr.length * 2;
            if (i14 < length) {
                i14 = length;
            }
            this.f116979a = Arrays.copyOf(cArr, i14);
        }
    }

    @Override // m63.n1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF117024b() {
        return this.f116980b;
    }
}
