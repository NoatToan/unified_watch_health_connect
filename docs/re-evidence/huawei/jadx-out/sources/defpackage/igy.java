package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class igy extends HwBaseManager {
    private static volatile igy e;

    private igy(Context context) {
        super(context);
        o();
    }

    public static igy e() {
        if (e == null) {
            synchronized (igy.class) {
                if (e == null) {
                    e = new igy(BaseApplication.getContext());
                }
            }
        }
        return e;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10105;
    }

    private void o() {
        LogUtil.a("TaskPlatform_HealthDatabaseMgr", "initDb");
        Map<String, String> mapJ = j();
        if (d(mapJ)) {
            return;
        }
        LogUtil.j("TaskPlatform_HealthDatabaseMgr", "create all table failed.");
        if (deleteDatabase()) {
            d(mapJ);
        } else {
            LogUtil.e("TaskPlatform_HealthDatabaseMgr", "data base error.");
        }
    }

    private boolean d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (createStorageDataTable(entry.getKey(), 1, entry.getValue()) != 0) {
                arrayList.add(entry.getKey());
            }
        }
        LogUtil.a("TaskPlatform_HealthDatabaseMgr", "create failed table list: ", Arrays.toString(arrayList.toArray()));
        return arrayList.isEmpty();
    }

    private Map<String, String> j() {
        HashMap map = new HashMap(5);
        map.put("health_plan", "id integer primary key autoincrement,huid text,planId text not null,startDay integer not null,endDay integer not null,category integer,subcategory integer,plan text,status integer,timeZone text");
        map.put("health_task", "id integer primary key autoincrement,huid text,taskId text not null,parentId text,status integer,task text");
        map.put("health_schedule", "id integer primary key autoincrement,huid text,planId text,taskId text not null,scheduleId text not null,endDay integer not null,startDay integer not null,schedule text,status integer");
        map.put("health_result", "id integer primary key autoincrement,huid text,planId text,taskId text not null,scheduleId text not null,recordDay integer not null,scheduleResult text,syncStatus integer");
        map.put("health_life_task", "id integer primary key autoincrement,huid text,startDay integer not null,endDay integer not null,datasource integer,tasks text,status integer,timeZone text");
        map.put("health_life_snapshot", "id integer primary key autoincrement,huid text,planId text,recordDay integer not null,modifiedTime integer not null,timeZone text,deviceModel text,snapshotId text not null,tasks text,syncStatus integer");
        return map;
    }

    public void a() {
        DbManager.a(String.valueOf(getModuleId()));
    }

    public void d() {
        try {
            DbManager.d(String.valueOf(getModuleId()));
        } catch (IllegalStateException e2) {
            ReleaseLogUtil.a("R_TaskPlatform_HealthDatabaseMgr", "endTransaction Exception:", LogAnonymous.b(e2));
        }
    }

    public ihb b() {
        return e.d;
    }

    public ihc f() {
        return c.e;
    }

    public iha h() {
        return b.e;
    }

    public igz i() {
        return d.f37615c;
    }

    public igu c() {
        return a.f37614c;
    }

    public ihe g() {
        return g.f37616b;
    }

    /* JADX INFO: loaded from: classes31.dex */
    static final class e {
        private static final ihb d = new ihb();
    }

    /* JADX INFO: loaded from: classes31.dex */
    static final class c {
        private static final ihc e = new ihc();
    }

    /* JADX INFO: loaded from: classes31.dex */
    static final class b {
        private static final iha e = new iha();
    }

    /* JADX INFO: loaded from: classes31.dex */
    static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final igz f37615c = new igz();
    }

    /* JADX INFO: loaded from: classes31.dex */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final igu f37614c = new igu();
    }

    static final class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ihe f37616b = new ihe();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public String getTableFullName(String str) {
        return DbManager.d(String.valueOf(getModuleId()), str);
    }

    public void c(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }
}
