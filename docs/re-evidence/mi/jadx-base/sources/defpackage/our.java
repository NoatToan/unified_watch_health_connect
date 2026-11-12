package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.yrn.manager.YRNBizInstance;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;

/* JADX INFO: loaded from: classes2.dex */
public class our extends jxr {
    public YRNBizInstance d;

    public our(YRNBizInstance yRNBizInstance, YRNBundleInfo yRNBundleInfo) {
        this.d = yRNBizInstance;
        this.c = yRNBundleInfo;
    }

    public void h() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: nur
            @Override // java.lang.Runnable
            public final void run() {
                this.f28387a.j();
            }
        });
    }

    public YRNBizInstance i() {
        return this.d;
    }

    public final /* synthetic */ void j() {
        if (b() != null) {
            ezr.c().f(YRNTraceEvent.newEvent(b().getAppName(), 31, "卸载业务bundle", null, b()));
        }
        YRNBizInstance yRNBizInstance = this.d;
        if (yRNBizInstance != null) {
            yRNBizInstance.destroy(true);
            this.d = null;
        }
        if (b() != null) {
            ezr.c().f(YRNTraceEvent.newEvent(b().getAppName(), 310, "卸载业务bundle成功", null, b()));
        }
    }
}
