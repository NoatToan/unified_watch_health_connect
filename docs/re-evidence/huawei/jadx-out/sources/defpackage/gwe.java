package defpackage;

import com.huawei.alarm.AlarmManager;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class gwe extends AlarmManager<gwd> {
    @Override // com.huawei.alarm.AlarmManager
    public String getAlarmKey() {
        return "SleepAlarmManager";
    }

    public boolean b(gwd gwdVar) {
        if (gwdVar.d() != 1000) {
            LogUtil.e("SleepAlarmManager", "alarm id match fail");
            return false;
        }
        return addOrUpdateAlarm(gwdVar);
    }

    public gwd c() {
        Set<gwd> alarms = getAlarms();
        gwd gwdVar = new gwd(1000, 7, 0, null);
        Iterator<gwd> it = alarms.iterator();
        return it.hasNext() ? it.next() : gwdVar;
    }
}
