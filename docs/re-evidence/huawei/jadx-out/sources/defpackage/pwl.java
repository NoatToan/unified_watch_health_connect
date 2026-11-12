package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes15.dex */
public class pwl extends pwj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected pwp f45909b;

    public pwl() {
        this.mHwMultiDeviceManager = new ocr();
    }

    @Override // defpackage.pwj, com.huawei.sim.esimhandler.EsimHandler
    public void handle(pxp pxpVar) {
        if (pxpVar == null) {
            LogUtil.e("AuthHandler", "request is null");
            return;
        }
        d(pxpVar);
        LogUtil.a("AuthHandler", "startAuth");
        if (pxpVar.f45947c != 1) {
            this.mMsgHandler.sendEmptyMessageDelayed(100003, 10000L);
        }
        this.mHwMultiDeviceManager.d(this.mContext, this.f45909b, pxk.a(pxpVar.h, pxpVar.n), pxk.e(pxpVar.j.d), this.mMsgHandler.obtainMessage(100001));
    }

    private void d(pxp pxpVar) {
        setContext(pxpVar.f45946b);
        setMsgHandler(pxpVar.f);
        if (pxpVar.f45947c == 1) {
            e(pxpVar);
        } else {
            c(pxpVar);
        }
        a();
    }

    private void a() {
        this.mHwMultiDeviceManager.a(this.mContext, this.f45909b, new String(Base64.b("MENBM0RBMzQ5QUExQ0I2OA=="), StandardCharsets.UTF_8), new String(Base64.b("MDZFMUJDMjgwRDFDQ0RCMTFCQjczNEZGREU3QUIyNkYwMzc0QkZFNTY2NUU2MkU4MjZDQzA1N0MwN0IyN0Q2OA=="), StandardCharsets.UTF_8));
    }

    private void c(pxp pxpVar) {
        pwp pwpVar = new pwp(pxpVar.f45947c);
        this.f45909b = pwpVar;
        pwpVar.setSlotId(pxpVar.i);
        this.f45909b.setImsi(pxpVar.h);
        LogUtil.a("AuthHandler", "setAuthParam AuthMethod = ", Integer.valueOf(pxpVar.f45947c), ", SlotId = ", Integer.valueOf(pxpVar.i));
    }

    private void e(pxp pxpVar) {
        pwp pwpVar = new pwp(pxpVar.f45947c);
        this.f45909b = pwpVar;
        pwpVar.setSlotId(pxpVar.i);
        this.f45909b.setImsi("460091234567890");
        this.f45909b.setCiphertext(pxpVar.e);
        this.f45909b.setCiphertextSign(pxpVar.f45945a);
        LogUtil.a("AuthHandler", "setAuthParam AuthMethod = ", Integer.valueOf(pxpVar.f45947c), ", SlotId = ", Integer.valueOf(pxpVar.i));
    }
}
