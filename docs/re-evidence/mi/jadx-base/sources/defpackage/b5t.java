package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.util.LogUtils;
import com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b5t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hjs f3836b;
    public CountDownLatch c = new CountDownLatch(1);
    public BaseResponse d = new BaseResponse();

    public b5t(Context context) {
        this.f3835a = context;
    }

    public void a() {
        hjs hjsVar = this.f3836b;
        if (hjsVar != null) {
            hjsVar.c();
            this.f3836b = null;
        }
    }

    public final void b(int i) {
        f(i);
    }

    public void c(int i, String str) {
        BaseResponse baseResponse = this.d;
        baseResponse.mResultCode = i;
        baseResponse.setDatas(str);
        this.c.countDown();
    }

    public abstract void d(IDigitalKeyFramework iDigitalKeyFramework) throws RemoteException;

    public BaseResponse e() {
        try {
            hjs hjsVar = new hjs(this.f3835a);
            this.f3836b = hjsVar;
            int iA = hjsVar.a();
            if (iA == 0) {
                g(this.f3836b.b());
                this.c.await();
            } else {
                LogUtils.d("service not bonded, return");
                b(iA);
            }
        } catch (RemoteException e) {
            LogUtils.e("SDK Call DKF method RemoteException: " + e.getMessage());
            b(4);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            b(11);
        } finally {
            a();
        }
        return this.d;
    }

    public void f(int i) {
        c(i, "");
    }

    public final void g(IDigitalKeyFramework iDigitalKeyFramework) throws RemoteException {
        try {
            d(iDigitalKeyFramework);
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                e.printStackTrace(printWriter);
                printWriter.close();
                throw new RemoteException(stringWriter.toString());
            } catch (Throwable th) {
                try {
                    printWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
