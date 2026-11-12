package health.compact.a;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hwlogsmodel.impl.writer.common.FlushTickFileHandler;
import com.huawei.hwlogsmodel.impl.writer.str.IStrWriter;

/* JADX INFO: loaded from: classes2.dex */
public class StrLogFileHandler extends FlushTickFileHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IStrWriter f36656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StrLogImpl f36657b;

    public StrLogFileHandler(Looper looper, StrLogImpl strLogImpl) {
        super(looper);
        this.f36656a = new StrWriterImpl();
        this.f36657b = strLogImpl;
    }

    public void d(String str) {
        saveLogObj(str);
    }

    public void e() {
        this.f36656a.clearLogCache();
    }

    @Override // com.huawei.hwlogsmodel.impl.writer.common.FlushTickFileHandler
    public void dataTicker(Object obj, String str) {
        com.huawei.hwlogsmodel.common.LogConfig logConfigB;
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                logConfigB = com.huawei.hwlogsmodel.LogUtil.d(str);
            } else {
                logConfigB = com.huawei.hwlogsmodel.LogUtil.b();
            }
            if (this.f36656a.write(logConfigB.l(), str2, true)) {
                return;
            }
            Log.w("LogUtil_LogFileHandler", "writer.write() in Handler failed");
            return;
        }
        Log.e("LogUtil_LogFileHandler", "instanceof error");
    }

    @Override // com.huawei.hwlogsmodel.impl.writer.common.FlushTickFileHandler
    public void onFlushLog() {
        this.f36657b.d();
    }
}
