package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealthkit.context.OutOfBandData;
import com.huawei.hihealthkit.context.QuickAppInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lbk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kxj f39828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f39829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39830c;
    private int d;
    private kzw e = kzw.c();

    public lbk(Context context, int i, int i2) {
        this.f39829b = context;
        this.f39828a = kxj.a(context);
        this.f39830c = i;
        this.d = i2;
    }

    public int e(OutOfBandData outOfBandData) throws RemoteException {
        if (!d(outOfBandData)) {
            return 1001;
        }
        QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        if (lep.d(quickAppInfo)) {
            return a(this.e.a(quickAppInfo.getPackageName()), quickAppInfo.getPackageName(), this.d, this.f39830c) ? 0 : 1001;
        }
        ReleaseLogUtil.e("R_QuickAppPermissionChecker", "scope deny");
        LogUtil.d("QuickAppPermissionChecker", "quickApp", quickAppInfo.getPackageName());
        return 1001;
    }

    private boolean d(OutOfBandData outOfBandData) {
        return outOfBandData instanceof QuickAppInfo;
    }

    private boolean a(int i, String str, int i2, int i3) {
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            return this.f39828a.e(i, HiHealthDataType.a(i3));
        }
        if ("com.huawei.health".equals(lkf.d(this.f39829b)) && "com.huawei.healthsport.h5-bloodsugar-export".equals(str)) {
            LogUtil.a("QuickAppPermissionChecker", "permission owned by default");
            return true;
        }
        return this.f39828a.d(i, HiHealthDataType.a(i3));
    }
}
