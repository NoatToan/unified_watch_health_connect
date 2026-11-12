package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class pbr {
    private static volatile pbr e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Toast f45133c;

    private pbr() {
    }

    public static pbr a() {
        pbr pbrVar;
        synchronized (pbr.class) {
            if (e == null) {
                synchronized (pbr.class) {
                    if (e == null) {
                        e = new pbr();
                    }
                }
            }
            pbrVar = e;
        }
        return pbrVar;
    }

    public void e(Context context, String str) {
        LogUtil.a("PLGACHIEVE_ToastUtils", "showShortToast");
        if (this.f45133c == null) {
            this.f45133c = Toast.makeText(context == null ? BaseApplication.getContext() : context.getApplicationContext(), str, 0);
        }
        this.f45133c.setText(str);
        this.f45133c.show();
    }
}
