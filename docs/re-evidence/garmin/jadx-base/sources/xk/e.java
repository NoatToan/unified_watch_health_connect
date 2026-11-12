package xk;

import ak.k;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class e extends kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f191190a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f191191b = null;

    @Override // kk.a
    public final void a(dk.a aVar) {
        int i14 = aVar.f60156b[2] & UnsignedBytes.MAX_VALUE;
        this.f191190a = Boolean.valueOf(k.d(4, i14));
        this.f191191b = Boolean.valueOf(k.d(2, i14));
    }

    @Override // kk.a
    public final List<Integer> b() {
        return Arrays.asList(22);
    }
}
