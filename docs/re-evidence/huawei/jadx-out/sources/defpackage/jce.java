package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jce implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38373a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jcc f38374c;
    private final int d;

    public jce(Context context, int i, String str) {
        if (context != null) {
            this.f38374c = jcc.e(context);
        } else {
            ReleaseLogUtil.d("Track_OfflineMapOnClickListener", "context == null");
        }
        this.d = i;
        this.f38373a = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f38374c == null) {
            ReleaseLogUtil.d("Track_OfflineMapOnClickListener", "onClick mController is null");
            return;
        }
        if (qrs.c(750)) {
            LogUtil.a("Track_OfflineMapOnClickListener", "onClick isFastClick");
            return;
        }
        LogUtil.a("Track_OfflineMapOnClickListener", "onClick() ", this.f38373a, Integer.valueOf(this.d));
        int i = this.d;
        if (i != -1) {
            if (i == 0) {
                this.f38374c.e(this.f38373a);
                return;
            }
            if (i != 3) {
                if (i != 10) {
                    if (i != 1002 && i != 5 && i != 6) {
                        if (i != 7) {
                            switch (i) {
                                case 102:
                                    this.f38374c.e(this.f38373a, false);
                                    this.f38374c.d(this.f38373a, false);
                                    break;
                            }
                            return;
                        }
                    }
                }
                this.f38374c.d(this.f38373a, true);
                return;
            }
        }
        this.f38374c.d(this.f38373a, false);
    }
}
