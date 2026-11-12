package defpackage;

import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Log;
import com.xiaomi.mimotion.IMimotionModeService;

/* JADX INFO: loaded from: classes3.dex */
public class dvf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static dvf f15965b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IMimotionModeService f15966a = IMimotionModeService.Stub.asInterface(ServiceManager.getService("MimotionModeService"));

    public static dvf a() {
        if (f15965b == null) {
            f15965b = new dvf();
        }
        return f15965b;
    }

    public int[] b() {
        IMimotionModeService iMimotionModeService = this.f15966a;
        if (iMimotionModeService == null) {
            return null;
        }
        try {
            return iMimotionModeService.getRefreshRateSpeedLimitsDp();
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("get refresh rate speed limits from cloud failed ");
            sb.append(Log.getStackTraceString(e));
            return null;
        }
    }
}
