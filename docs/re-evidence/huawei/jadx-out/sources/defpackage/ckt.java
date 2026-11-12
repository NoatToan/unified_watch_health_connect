package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;

/* JADX INFO: loaded from: classes4.dex */
public class ckt extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    cml f1688b;

    public ckt(cml cmlVar) {
        this.f1688b = cmlVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0116";
    }
}
