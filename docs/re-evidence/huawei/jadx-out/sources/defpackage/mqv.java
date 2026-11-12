package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mqv extends ContentObserver {
    private Runnable d;
    private Handler e;

    public mqv(Handler handler) {
        super(handler);
        this.e = null;
        this.d = new Runnable() { // from class: mqv.3
            @Override // java.lang.Runnable
            public void run() {
                mqy mqyVarD = mqy.d();
                if (mri.b()) {
                    mqyVarD.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1);
                } else {
                    mqyVarD.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 6);
                    LogUtil.j("CalendarObserver", "onChange: cannot sync Calendar without contact permissions.");
                }
            }
        };
        this.e = handler;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        LogUtil.a("CalendarObserver", "Listen for calendar schedule changes.");
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.d);
            this.e.postDelayed(this.d, 1000L);
        }
    }
}
