package e9;

import androidx.health.platform.client.proto.x;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg9/b;", "U", "", "it", "invoke", "([B)Lg9/b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class c extends w implements l<byte[], b> {
    public c() {
        super(1);
    }

    @Override // e23.l
    public final b invoke(byte[] bArr) {
        byte[] bArr2 = bArr;
        bArr2.getClass();
        x xVarZ = x.z(bArr2);
        b.a aVar = b.f63476e;
        int iV = xVarZ.v();
        String strW = xVarZ.x() ? xVarZ.w() : null;
        aVar.getClass();
        return b.a.a(iV, strW);
    }
}
