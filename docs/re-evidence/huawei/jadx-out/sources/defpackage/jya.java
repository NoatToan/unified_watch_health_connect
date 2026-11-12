package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes33.dex */
public class jya extends jyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile jya f39196a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f39197c = new Object();

    protected jya(Context context) {
        super(context);
    }

    public static jya b() {
        jya jyaVar;
        synchronized (f39197c) {
            LogUtil.a("Track_HiWearEngineHealthMgr", "getInstance()");
            if (f39196a == null) {
                f39196a = new jya(BaseApplication.getContext());
            }
            jyaVar = f39196a;
        }
        return jyaVar;
    }

    @Override // defpackage.jyb, com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.watch.health.p2p";
    }
}
