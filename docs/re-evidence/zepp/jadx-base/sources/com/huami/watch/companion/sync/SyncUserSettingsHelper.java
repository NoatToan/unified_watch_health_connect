package com.huami.watch.companion.sync;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.cloud.api.UserSettingsAPI;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.companion.util.KeyValueUtil;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SyncUserSettingsHelper {
    private static final String c = "SyncHelper-UserSettings";
    private static SyncUserSettingsHelper d;
    private Context a;
    private boolean b;

    public class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Transporter b;

        public a(String str, Transporter transporter) {
            this.a = str;
            this.b = transporter;
        }

        @Override // java.lang.Runnable
        public void run() {
            SyncUserSettingsHelper.this.b = true;
            SyncUserSettingsHelper.this.syncToCloud(this.a, this.b);
            SyncUserSettingsHelper.this.b = false;
        }
    }

    private SyncUserSettingsHelper(Context context) {
        this.a = context;
    }

    private void b(Context context, Map<String, String> map) {
        if (map.containsKey("huami.watch.health.config")) {
            String str = map.get("huami.watch.health.config");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("step_target", HealthData.getUserGoalSteps(context));
                jSONObject.put("calory_target", HealthData.getUserGoalCal(context));
                map.put("huami.watch.health.config", jSONObject.toString());
                Log.d(c, "Updated watch health config:" + jSONObject.toString(), new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void c(Map<String, String> map, Transporter transporter) {
        int i = 0;
        Log.d(c, "OnSync To Cloud Success!!", new Object[0]);
        UserSettingsManager.getManager(this.a).updateToSynced(map);
        if (transporter == null) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        if (map.size() > 0) {
            String[] strArr = new String[map.size()];
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                strArr[i] = it2.next();
                i++;
            }
            dataBundle.putStringArray(CompanionModule.KEY_KEYS, strArr);
            transporter.send(CompanionModule.ACTION_SYNC_USER_SETTINGS_FINISH, dataBundle);
        }
    }

    public static SyncUserSettingsHelper getHelper(Context context) {
        if (d == null) {
            d = new SyncUserSettingsHelper(context.getApplicationContext());
        }
        return d;
    }

    public boolean syncToCloud(String str) {
        return syncToCloud(str, null);
    }

    public void syncToCloudAsync(String str, Transporter transporter) {
        if (this.b) {
            Log.w(c, "Is already syncing...abort!!", new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            Log.w(c, "Sync To Cloud Success : true, isEmpty!!", new Object[0]);
        } else {
            Rx.io(new a(str, transporter)).safeSubscribe();
        }
    }

    public boolean syncToCloud(String str, Transporter transporter) {
        Map<String, String> keyValues = KeyValueUtil.toKeyValues(str);
        if (TextUtils.isEmpty(str) || keyValues.size() == 0) {
            Log.w(c, "Sync To Cloud Success : " + str + ", isEmpty!!", new Object[0]);
            return true;
        }
        b(this.a, keyValues);
        UserSettingsManager.getManager(this.a).addAll(keyValues);
        boolean zPostUserSettings = UserSettingsAPI.postUserSettings(this.a, keyValues);
        if (zPostUserSettings) {
            c(keyValues, transporter);
        }
        return zPostUserSettings;
    }
}
