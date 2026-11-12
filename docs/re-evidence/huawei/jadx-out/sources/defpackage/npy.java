package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.hwlogsmodel.impl.writer.bytes.IBytesWriter;
import com.huawei.hwlogsmodel.impl.writer.common.FlushTickFileHandler;

/* JADX INFO: loaded from: classes11.dex */
public class npy extends FlushTickFileHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBytesWriter f43431c;

    @Override // com.huawei.hwlogsmodel.impl.writer.common.FlushTickFileHandler
    public void onFlushLog() {
    }

    public npy(Looper looper) {
        super(looper);
        this.f43431c = new npw();
    }

    public void d() {
        this.f43431c.clearLogCache();
    }

    public void e(byte[] bArr, String str) {
        saveLogObj(bArr, str);
    }

    @Override // com.huawei.hwlogsmodel.impl.writer.common.FlushTickFileHandler
    public void dataTicker(Object obj, String str) {
        LogConfig logConfigB;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (!TextUtils.isEmpty(str)) {
                logConfigB = LogUtil.d(str);
            } else {
                logConfigB = LogUtil.b();
            }
            if (this.f43431c.write(logConfigB.l(), bArr, true)) {
                return;
            }
            Log.w("BytesLogFileHandler", "writer.write() in Handler failed");
            return;
        }
        Log.e("BytesLogFileHandler", "instanceof error");
    }
}
