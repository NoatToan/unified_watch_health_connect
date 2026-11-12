package f2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf2/f0;", "Lf2/e0;", "", "lineIndex", "", "mainAxisSizes", "<init>", "(ILjava/util/List;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Integer> f68199a;

    public f0(int i14, List<Integer> list) {
        this.f68199a = list;
    }

    @Override // f2.e0
    public final int a(int i14) {
        return this.f68199a.get(i14).intValue();
    }

    @Override // f2.e0
    public final int b() {
        return this.f68199a.size();
    }
}
