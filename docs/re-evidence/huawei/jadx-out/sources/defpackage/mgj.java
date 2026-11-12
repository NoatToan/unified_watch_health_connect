package defpackage;

import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes38.dex */
public class mgj {
    public static void a(final String str) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: mgo
                @Override // java.lang.Runnable
                public final void run() {
                    mgj.a(str);
                }
            });
        }
        mhs.a().sendSettingSwitchCommand("hw.unitedevice.physiological", "hw.watch.health.physiological", 900300012L, str);
        mhs.a().setSwitchSetting("menstrual_predict_switch", str, new IBaseResponseCallback() { // from class: mgl
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("MenstrualUtil", "setMenstrualPredictStatus errorCode = ", Integer.valueOf(i));
            }
        });
    }

    public static void a(final IBaseResponseCallback iBaseResponseCallback) {
        mhs.a().getSwitchSetting("menstrual_predict_switch", new IBaseResponseCallback() { // from class: mgk
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                mgj.d(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        String str;
        ReleaseLogUtil.d("R_MenstrualUtil", "initSwitchStatus errorCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = "0";
        }
        iBaseResponseCallback.a(i, str);
        LogUtil.a("MenstrualUtil", "initSwitchStatus switchStatus = ", str);
    }
}
