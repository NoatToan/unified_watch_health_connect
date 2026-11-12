package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.KeyValDbManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes37.dex */
public class lts {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile lts f40822c;
    public static final String e;
    private ltv d;

    static {
        StringBuilder sb = new StringBuilder(16);
        sb.append("id integer primary key autoincrement,uid varchar(300),description varchar(300),url varchar(300),title varchar(300),time varchar(300)");
        e = sb.toString();
    }

    private lts() {
        LogUtil.a("SleepServiceDB", "create table");
        this.d = ltv.e();
        a();
    }

    public static lts d() {
        if (f40822c == null) {
            synchronized (lts.class) {
                if (f40822c == null) {
                    LogUtil.a("SleepServiceDB", "mSleepServiceDb");
                    f40822c = new lts();
                }
            }
        }
        return f40822c;
    }

    private void a() {
        this.d.c("coresleepservice", 1, e);
    }

    public List<ltu> a(String str) {
        int i;
        Cursor cursorRawQueryStorageData = this.d.rawQueryStorageData(1, "select *  from " + ("module_" + this.d.getModuleId() + "_coresleepservice") + " where   uid= '" + str + "'", null);
        ArrayList arrayList = new ArrayList(16);
        if (cursorRawQueryStorageData == null) {
            LogUtil.e("SleepServiceDB", "get() query failed");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(16);
        while (true) {
            if (!cursorRawQueryStorageData.moveToNext()) {
                break;
            }
            ltu ltuVar = new ltu();
            try {
                ltuVar.b(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("title")));
                ltuVar.e(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("time")));
                ltuVar.c(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("uid")));
                ltuVar.d(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("description")));
                ltuVar.a(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("url")));
            } catch (SQLException e2) {
                LogUtil.e("SleepServiceDB", "Exception = ", e2.getMessage());
            }
            arrayList2.add(0, ltuVar);
        }
        cursorRawQueryStorageData.close();
        arrayList.clear();
        for (i = 0; i < arrayList2.size() - 1; i++) {
            for (int size = arrayList2.size() - 1; size > i; size--) {
                if (((ltu) arrayList2.get(size)).a().trim().equals(((ltu) arrayList2.get(i)).a().trim())) {
                    arrayList2.remove(size);
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public String b() {
        return KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
    }

    public String e() {
        List<ltu> listA = f40822c.a(b());
        Iterator<ltu> it = listA.iterator();
        while (it.hasNext()) {
            LogUtil.a("SleepServiceDB", "data:", it.next().toString());
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (ltu ltuVar : listA) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", ltuVar.d());
                jSONObject2.put("description", ltuVar.e());
                jSONObject2.put("title", ltuVar.a());
                jSONObject2.put(JsbMapKeyNames.H5_USER_ID, ltuVar.c());
                jSONObject2.put("url", ltuVar.b());
                jSONArray.put(jSONObject2);
            } catch (JSONException e2) {
                LogUtil.a("SleepServiceDB", "put joson object:", e2.getMessage());
            }
        }
        try {
            jSONObject.put("sleepServiceType", jSONArray.toString());
        } catch (JSONException e3) {
            LogUtil.e("SleepServiceDB", "Exception = ", e3.getMessage());
        }
        return jSONObject.toString();
    }
}
