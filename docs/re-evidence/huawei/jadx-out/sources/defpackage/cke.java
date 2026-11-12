package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
class cke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cml f1674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cmh f1675c = new cmh();
    private String e;

    cke(cml cmlVar) {
        this.f1674b = cmlVar;
    }

    HandshakeCommandBase d(HandshakeCommandBase handshakeCommandBase, int i) {
        byte[] bArrD = d();
        if (bArrD == null || this.f1674b == null) {
            LogUtil.d("DealWithHiChain", "startAuthentic randB is null");
            this.f1675c.e(13);
            this.f1675c.d(i);
            return handshakeCommandBase;
        }
        String strD = cph.d(bArrD);
        this.e = strD;
        this.f1673a = cku.c(this.f1674b, strD, "0100");
        int iJ = this.f1674b.j();
        if (cnc.b(iJ) || cni.b(iJ) || cmz.c(iJ)) {
            LogUtil.b("DealWithHiChain", "Device support HiChain or HiChainLite.");
            this.f1675c.e(15);
            this.f1675c.d(100000);
            return new ckx(iJ, this.e, this.f1674b);
        }
        LogUtil.b("DealWithHiChain", "Device support traditional authentication.");
        if (CommonUtil.ao()) {
            LogUtil.b("DealWithHiChain", "dealWithHiChainModule is debug, use old.");
            return c(handshakeCommandBase, i);
        }
        return e(handshakeCommandBase, i);
    }

    private HandshakeCommandBase c(HandshakeCommandBase handshakeCommandBase, int i) {
        if (this.f1674b.b() != 0) {
            LogUtil.b("DealWithHiChain", "Device need authentic Application after check device available.");
            return e(handshakeCommandBase, i);
        }
        LogUtil.b("DealWithHiChain", "Device do not need authentic after check device available.");
        this.f1675c.e(15);
        this.f1675c.d(100000);
        return new ckq(false);
    }

    cmh b() {
        return this.f1675c;
    }

    private HandshakeCommandBase e(HandshakeCommandBase handshakeCommandBase, int i) {
        LogUtil.b("DealWithHiChain", "Enter startAuthenticBTDevice().");
        if (this.f1674b.g() != null && this.f1674b.g().length() != 32) {
            LogUtil.b("DealWithHiChain", "RandA parameter is incorrect so stop authentic");
            this.f1675c.e(13);
            this.f1675c.d(i);
            return handshakeCommandBase;
        }
        if (!TextUtils.isEmpty(this.f1673a)) {
            this.f1675c.e(15);
            this.f1675c.d(100000);
            return new ckd(this.f1673a, this.e, this.f1674b);
        }
        this.f1675c.e(13);
        this.f1675c.d(i);
        return handshakeCommandBase;
    }

    private byte[] d() {
        try {
            byte[] bArrB = ckg.b(16);
            if (bArrB == null) {
                LogUtil.d("DealWithHiChain", "generateRandomBytes fail.");
            }
            return bArrB;
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.d("DealWithHiChain", "generateRandomBytes exception");
            return null;
        }
    }
}
