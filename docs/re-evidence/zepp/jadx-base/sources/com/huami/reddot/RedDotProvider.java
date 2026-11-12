package com.huami.reddot;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.reddot.network.RedDotAPI;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes12.dex */
public class RedDotProvider {
    private static final String c = "Discovery-Provider";
    private static final String d = "redDotInfoData";
    private static RedDotProvider e;
    private SharedPreferences a;
    private final Object b = new Object();

    public class a extends TypeToken<List<RedDotAPI.RedDotParamInfo>> {
        public a() {
        }
    }

    private RedDotProvider(Context context) {
        this.a = context.getSharedPreferences(c, 0);
    }

    private void a(RedDotAPI.RedDotParamInfo redDotParamInfo) {
        List<RedDotAPI.RedDotParamInfo> redDotInfos = getRedDotInfos();
        for (int i = 0; i < redDotInfos.size(); i++) {
            if (redDotInfos.get(i).equals(redDotParamInfo)) {
                redDotInfos.get(i).setDotDismissTime(redDotParamInfo.getDotDismissTime());
                break;
            }
        }
        saveRedDotInfos(redDotInfos);
    }

    private void b(String str, long j) {
        a(new RedDotAPI.RedDotParamInfo(str, j));
    }

    public static synchronized RedDotProvider getProvider() {
        if (e == null) {
            e = new RedDotProvider(ConfigurationHolder.getContext());
        }
        return e;
    }

    public void clear() {
        this.a.edit().clear().apply();
    }

    public String get(String str) {
        return this.a.getString(str, "");
    }

    public String getDeviceEntranceRedDotInfo() {
        return this.a.getString("DeviceEntranceRedDotInfo", null);
    }

    public List<RedDotAPI.RedDotParamInfo> getRedDotInfos() {
        List<RedDotAPI.RedDotParamInfo> arrayList = new ArrayList<>();
        synchronized (this.b) {
            String string = this.a.getString(d, null);
            HMLog.d(c, "getRedDotInfos ==" + string, new Object[0]);
            if (!TextUtils.isEmpty(string)) {
                try {
                    arrayList = (List) new Gson().fromJson(string, new a().getType());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public long readLastHomeDotDismissTime() {
        long j = this.a.getLong("HomeDotDismissTime", 0L);
        HMLog.d(c, "Read Last HomeDotDismissTime : " + ((Object) DateFormat.format("yyyy-MM-dd HH:mm:ss", 1000 * j)), new Object[0]);
        return j;
    }

    public void saveHomeDotDismissTime(long j) {
        HMLog.d(c, "Save HomeDotDismissTime : " + ((Object) DateFormat.format("yyyy-MM-dd HH:mm:ss", 1000 * j)), new Object[0]);
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong("HomeDotDismissTime", j);
        editorEdit.apply();
    }

    public void saveRedDotInfo(String str) {
        b(str, System.currentTimeMillis() / 1000);
    }

    public void saveRedDotInfos(List<RedDotAPI.RedDotParamInfo> list) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        synchronized (this.b) {
            if (list == null) {
                HMLog.d(c, "Save Items " + d + " : <Empty>", new Object[0]);
                editorEdit.putString(d, "");
            } else if (list.size() == 0) {
                HMLog.d(c, "Save Items " + d + " : <Empty>", new Object[0]);
                editorEdit.putString(d, "");
            } else {
                String json = new Gson().toJson(list);
                HMLog.d(c, "Save Items " + d + " : <" + json + SearchCriteria.GT, new Object[0]);
                editorEdit.putString(d, json);
            }
            throw th;
        }
        editorEdit.apply();
    }

    public void setDeviceEntranceRedDotInfo(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString("DeviceEntranceRedDotInfo", str);
        editorEdit.apply();
    }
}
