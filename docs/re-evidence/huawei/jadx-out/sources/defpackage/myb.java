package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class myb extends ContentObserver {
    public myb(Handler handler) {
        super(handler);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        LogUtil.a("StorePutBackObserver", "StorePutBackObserver onChange.");
        mxs.a().e();
    }
}
