package xk;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class d extends kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f191189a;

    public d(a aVar) {
        this.f191189a = aVar;
    }

    @Override // kk.a
    public final void a(dk.a aVar) {
        byte[] bArr = aVar.f60156b;
        int i14 = bArr[2] & UnsignedBytes.MAX_VALUE;
        int i15 = bArr[3] & UnsignedBytes.MAX_VALUE;
        int i16 = bArr[4] & UnsignedBytes.MAX_VALUE;
        int i17 = bArr[5] & UnsignedBytes.MAX_VALUE;
        a aVar2 = this.f191189a;
        mk.a aVar3 = aVar2.f191183a;
        if (aVar3 != null) {
            aVar3.a(i14);
        }
        mk.a aVar4 = aVar2.f191184b;
        if (aVar4 != null) {
            aVar4.a(i15);
        }
        mk.a aVar5 = aVar2.f191185c;
        if (aVar5 != null) {
            aVar5.a(i16);
        }
        mk.a aVar6 = aVar2.f191186d;
        if (aVar6 != null) {
            aVar6.a(i17);
        }
        byte[] bArr2 = aVar.f60156b;
        byte b14 = bArr2[7];
        byte b15 = bArr2[8];
    }

    @Override // kk.a
    public final List<Integer> b() {
        return Arrays.asList(1);
    }
}
