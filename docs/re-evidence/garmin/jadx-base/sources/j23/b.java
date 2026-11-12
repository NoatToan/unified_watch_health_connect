package j23;

import p005kotlin.Metadata;
import p13.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj23/b;", "Lp13/v;", "", "first", "last", "", "step", "<init>", "(CCI)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f96785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96786d;

    public b(char c14, char c15, int i14) {
        this.f96783a = i14;
        this.f96784b = c15;
        boolean z14 = false;
        if (i14 <= 0 ? p005kotlin.jvm.internal.s.h(c14, c15) >= 0 : p005kotlin.jvm.internal.s.h(c14, c15) <= 0) {
            z14 = true;
        }
        this.f96785c = z14;
        this.f96786d = z14 ? c14 : c15;
    }

    @Override // p13.v
    public final char a() {
        int i14 = this.f96786d;
        if (i14 != this.f96784b) {
            this.f96786d = this.f96783a + i14;
        } else {
            if (!this.f96785c) {
                c22.t.g();
                return (char) 0;
            }
            this.f96785c = false;
        }
        return (char) i14;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f96785c;
    }
}
