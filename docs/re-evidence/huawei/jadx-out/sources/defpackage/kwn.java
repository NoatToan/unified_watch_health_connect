package defpackage;

import android.content.ContentValues;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kuu f39559b;

    private kwn() {
        this.f39559b = kuu.e();
    }

    static class d {
        private static final kwn e = new kwn();
    }

    public static kwn e() {
        return d.e;
    }

    public static String[] c() {
        return new String[]{"_id", "date", "hihealth_type", "stat_type", "value", "user_id", DBPointCommon.COLUMN_UNIT_ID, "client_id", "timeZone", "sync_status", "modified_time"};
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table  IF NOT EXISTS " + str + Constants.LEFT_BRACKET_ONLY);
        sb.append("_id integer primary key not null,date integer not null,hihealth_type integer not null,stat_type integer not null,value double not null,user_id integer,unit_id integer not null,client_id integer,timeZone text not null,sync_status integer not null,modified_time integer not null)");
        return sb.toString();
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(" CREATE INDEX IF NOT EXISTS ConfigStatIndex ON " + str + Constants.LEFT_BRACKET_ONLY);
        sb.append("date,stat_type,client_id)");
        return sb.toString();
    }

    private long a(kuk kukVar) {
        return this.f39559b.insert(kvw.e(kukVar));
    }

    public kuk c(String str, int i, int i2, int i3) {
        return kwf.s(this.f39559b.b(str, d(), e(i, i2, i3), null, null, null));
    }

    public List<HiHealthData> a(String str, HiDataReadOption hiDataReadOption, int i, int i2) {
        String strC = kwb.c("date", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        return kwf.y(this.f39559b.b(str, a(), new String[]{Integer.toString(HiDateUtil.d(hiDataReadOption.getStartTime())), Integer.toString(HiDateUtil.d(hiDataReadOption.getEndTime())), Integer.toString(i), Integer.toString(i2)}, null, null, strC));
    }

    private long c(String str, kuk kukVar) {
        if (kukVar.e() == HiDateUtil.d(System.currentTimeMillis())) {
            ReleaseLogUtil.d("HiH_ConfigDataStatManager", "updateStatData today stat need to upload.");
            LogUtil.a("Debug_ConfigDataStatManager", "updateStatData today stat need to upload, statTable is ", kukVar);
            kukVar.i(0);
        }
        ContentValues contentValuesC = kvw.c(kukVar);
        if (kukVar.h() == 1) {
            contentValuesC.remove("sync_status");
        }
        return this.f39559b.c(str, contentValuesC, d(), e(kukVar.e(), kukVar.g(), kukVar.c()));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    public boolean b(String str, kuk kukVar) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    boolean zD = d(str, kukVar);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zD;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.e("HiH_ConfigDataStatManager", "insertOrUpdateStatData exception: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private boolean d(String str, kuk kukVar) {
        boolean z = HiDateUtil.d(System.currentTimeMillis()) == kukVar.e();
        if (kukVar.d() <= 0) {
            kukVar.a(System.currentTimeMillis());
        }
        double dL = kukVar.l();
        kuk kukVarC = c(str, kukVar.e(), kukVar.g(), kukVar.c());
        if (kukVarC != null) {
            if (z) {
                LogUtil.a("HiH_ConfigDataStatManager", "insertStatData() new date =", Integer.valueOf(kukVar.e()), ", type=", Integer.valueOf(kukVar.g()), ",", Double.valueOf(kukVar.l()), ",old=", Double.valueOf(kukVarC.l()));
            }
            if (kxf.c(kukVarC, kukVar)) {
                return kwb.b(c(str, kukVar));
            }
            return false;
        }
        if (dL <= 0.0d) {
            LogUtil.j("Debug_ConfigDataStatManager", "insertStatData() newStat value <= 0 ");
            return false;
        }
        if (z) {
            LogUtil.a("HiH_ConfigDataStatManager", "insertStatData() new date =", Integer.valueOf(kukVar.e()), ", type=", Integer.valueOf(kukVar.g()), ",", Double.valueOf(kukVar.l()), ",old=null");
        }
        return kwb.b(a(kukVar));
    }

    private String d() {
        return "date =? and stat_type =? and client_id =? ";
    }

    private String[] e(int i, int i2, int i3) {
        return new String[]{Integer.toString(i), Long.toString(i2), Integer.toString(i3)};
    }

    private String a() {
        return "date >=? and date <=? and stat_type =? and client_id =? ";
    }
}
