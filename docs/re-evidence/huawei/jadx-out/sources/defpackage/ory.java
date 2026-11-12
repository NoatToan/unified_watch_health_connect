package defpackage;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class ory {
    public static void e(Context context) {
        d(context);
    }

    private static void d(final Context context) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ory.2
            @Override // java.lang.Runnable
            public void run() {
                osf osfVarB = otl.b(context).b(1, new HashMap(16));
                TotalRecord totalRecord = osfVarB instanceof TotalRecord ? (TotalRecord) osfVarB : null;
                if (totalRecord == null) {
                    LogUtil.j("PLGACHIEVE_AchieveReportMgr", "computeDomesticData no TotalRecordDB.");
                } else {
                    Context context2 = context;
                    orx.d(context2, oru.a(context2).getAdapter(), totalRecord);
                }
            }
        });
    }
}
