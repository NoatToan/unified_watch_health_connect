package com.huawei.pluginsport.ftp;

import com.huawei.basefitnessadvice.callback.UiCallback;
import defpackage.lsy;
import defpackage.ppv;
import defpackage.ppz;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class PowerZoneConfigHelper {
    private volatile ppz d;
    private final OnConfigHelperListener e;

    public interface OnConfigHelperListener {
        void onInitComplete(boolean z);
    }

    public PowerZoneConfigHelper(OnConfigHelperListener onConfigHelperListener) {
        this.e = onConfigHelperListener;
        lsy.a(new Runnable() { // from class: ppy
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b();
            }
        });
    }

    public /* synthetic */ void b() {
        ppv.d().e(new UiCallback<ppz>() { // from class: com.huawei.pluginsport.ftp.PowerZoneConfigHelper.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.d("R_PowerZoneConfigHelper", "PowerZoneConfigHelper onFailure ", Integer.valueOf(i));
                if (PowerZoneConfigHelper.this.e != null) {
                    PowerZoneConfigHelper.this.e.onInitComplete(false);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ppz ppzVar) {
                ReleaseLogUtil.d("R_PowerZoneConfigHelper", "PowerZoneConfigHelper onSuccess ", ppzVar);
                PowerZoneConfigHelper.this.d = ppzVar;
                if (PowerZoneConfigHelper.this.e != null) {
                    PowerZoneConfigHelper.this.e.onInitComplete(PowerZoneConfigHelper.this.d != null);
                }
            }
        });
    }

    public int e(int i) {
        if (this.d != null) {
            return this.d.b(i);
        }
        return -1;
    }

    public float c(int i) {
        if (this.d != null) {
            return this.d.a(i);
        }
        return 0.0f;
    }

    public String b(int i) {
        if (this.d != null) {
            return this.d.c(i);
        }
        return "";
    }
}
