package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vqw implements IBaseResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f51493a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Object> f51494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f51495c;
    private int d;
    private int[] e;

    public vqw(Handler handler, int i) {
        synchronized (f51493a) {
            this.d = i;
        }
        this.f51495c = handler;
        this.f51494b = new ArrayList(this.d);
        this.e = new int[this.d];
        for (int i2 = 0; i2 < this.d; i2++) {
            this.e[i2] = -1;
        }
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    public void onResponse(int i, Object obj) {
        synchronized (f51493a) {
            this.d--;
            this.f51494b.add(obj);
            int[] iArr = this.e;
            int i2 = this.d;
            iArr[i2] = i;
            if (i2 == 0) {
                Message messageObtainMessage = this.f51495c.obtainMessage();
                messageObtainMessage.what = 102;
                messageObtainMessage.obj = this.f51494b;
                this.f51495c.sendMessage(messageObtainMessage);
            }
        }
    }
}
