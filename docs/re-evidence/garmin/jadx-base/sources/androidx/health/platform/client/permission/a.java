package androidx.health.platform.client.permission;

import androidx.health.platform.client.proto.o1;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg9/b;", "U", "", "it", "invoke", "([B)Lg9/b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class a extends w implements l<byte[], Permission> {
    public a() {
        super(1);
    }

    @Override // e23.l
    public final Permission invoke(byte[] bArr) {
        byte[] bArr2 = bArr;
        bArr2.getClass();
        o1 o1VarW = o1.w(bArr2);
        o1VarW.getClass();
        return new Permission(o1VarW);
    }
}
