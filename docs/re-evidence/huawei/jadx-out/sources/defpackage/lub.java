package defpackage;

import android.content.Context;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class lub extends HwBaseManager {
    private static lub e;

    private lub(Context context) {
        super(context);
        new lty().c(this);
    }

    public static lub c() {
        lub lubVar;
        synchronized (lub.class) {
            LogUtil.d("MigrateDbManager", "Enter getInstance()");
            if (e == null) {
                e = new lub(BaseApplication.getContext());
            }
            lubVar = e;
        }
        return lubVar;
    }

    public long e(ltz ltzVar) {
        lty ltyVar = new lty();
        if (ltzVar == null || ltyVar.a(this, ltzVar.a(), ltzVar.b())) {
            return 0L;
        }
        return ltyVar.a(this, ltzVar);
    }

    public int b() {
        return new lty().a(this);
    }

    public ArrayList<ltz> a(String str) {
        return new lty().d(this, str);
    }

    public int d(String str, String str2) {
        return new lty().d(this, str, str2);
    }

    public int e(String str, String str2) {
        return new lty().c(this, str, str2);
    }

    public int a(String str, String str2) {
        return new lty().e(this, str, str2);
    }

    public int b(String str, String str2) {
        return new lty().b(this, str, str2);
    }

    public int c(String str, String str2) {
        return new lty().h(this, str, str2);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20008;
    }
}
