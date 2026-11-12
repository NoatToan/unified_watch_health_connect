package defpackage;

import android.content.Context;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes37.dex */
public class ltv extends HwBaseManager {

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ltv f40826c = new ltv(BaseApplication.getContext());
    }

    private ltv(Context context) {
        super(context);
    }

    public static ltv e() {
        return d.f40826c;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return Integer.valueOf(PrebakedEffectId.RT_COIN_DROP);
    }

    public void c(String str, int i, String str2) {
        LogUtil.a("SleepServiceMgr", "enter create():");
        createStorageDataTable(str, i, str2);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
    }
}
