package com.huami.watch.companion.usersettings;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.huami.watch.companion.cloud.api.UserSettingsAPI;
import com.huami.watch.companion.util.KeyValueUtil;
import com.huami.watch.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class UserSettingsManager {
    private static final String b = "UserSettings-Manager";
    private static UserSettingsManager c;
    private Context a;

    public static class SyncResult {
        public boolean success;
        public boolean syncToCloudSuccess;

        public String toString() {
            return "<Success : " + this.success + ", syncToCloudSuccess : " + this.syncToCloudSuccess + SearchCriteria.GT;
        }
    }

    public class a implements ObservableOnSubscribe<Void> {
        public a() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Void> observableEmitter) throws Exception {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SyncResult syncResultSyncAllToCloud = UserSettingsManager.this.syncAllToCloud();
            if (syncResultSyncAllToCloud.success && syncResultSyncAllToCloud.syncToCloudSuccess) {
                UserSettingsManager.this.updateAllToSynced();
            }
        }
    }

    private UserSettingsManager(Context context) {
        this.a = context;
    }

    public static UserSettingsManager getManager(Context context) {
        if (c == null) {
            c = new UserSettingsManager(context.getApplicationContext());
        }
        return c;
    }

    public boolean addAll(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("Add All : ");
        sb.append(map);
        sb.append(", ");
        sb.append(map != null ? map.size() : 0);
        Log.d(b, sb.toString(), new Object[0]);
        if (map == null || map.size() == 0) {
            return true;
        }
        com.huami.watch.companion.usersettings.a.a(this.a, map);
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            boolean zPutString = UserSettings.putString(this.a.getContentResolver(), entry.getKey(), entry.getValue());
            if (!zPutString) {
                Log.w(b, "Add All Fail : " + entry.getKey() + ", " + entry.getValue(), new Object[0]);
                z = zPutString;
                break;
            }
            z = zPutString;
        }
        com.huami.watch.companion.usersettings.a.b(this.a, map);
        return z;
    }

    public void clearAll() {
        Log.d(b, "Clean All!!", new Object[0]);
        try {
            Log.d(b, "Clean All : " + this.a.getContentResolver().delete(SettingsEntry.CONTENT_URI, null, null), new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @NonNull
    public Map<String, String> getAll() {
        int count;
        HashMap map = new HashMap();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.a.getContentResolver().query(SettingsEntry.CONTENT_URI, SettingsEntry.COLUMNS_KEY_VALUE, null, null, null);
                if (cursorQuery != null) {
                    count = cursorQuery.getCount();
                    while (cursorQuery.moveToNext()) {
                        try {
                            map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            if (cursorQuery != null) {
                            }
                            Log.d(b, "Get All, Count : " + map.size() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + count, new Object[0]);
                            return map;
                        }
                    }
                } else {
                    count = 0;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                e = e2;
                count = 0;
            }
            Log.d(b, "Get All, Count : " + map.size() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + count, new Object[0]);
            return map;
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @NonNull
    public Map<String, String> getAllNeedSync() {
        int count;
        HashMap map = new HashMap();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.a.getContentResolver().query(SettingsEntry.CONTENT_URI, SettingsEntry.COLUMNS_ALL, null, null, null);
                if (cursorQuery != null) {
                    count = cursorQuery.getCount();
                    while (cursorQuery.moveToNext()) {
                        try {
                            if (cursorQuery.getInt(cursorQuery.getColumnIndex("cloud_sync_state")) != 1) {
                                map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                            }
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            if (cursorQuery != null) {
                            }
                            Log.d(b, "Get All Need Sync, Count : " + map.size() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + count, new Object[0]);
                            return map;
                        }
                    }
                } else {
                    count = 0;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            count = 0;
        }
        Log.d(b, "Get All Need Sync, Count : " + map.size() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + count, new Object[0]);
        return map;
    }

    @NonNull
    public Map<String, String> getAllWatch() {
        HashMap map = new HashMap();
        Map<String, String> all = getAll();
        if (!all.isEmpty()) {
            map.putAll(KeyValueUtil.filterNonStartWith(all, UserSettingsKeys.SCOPE_PHONE_ALL));
        }
        return map;
    }

    public SyncResult syncAllToCloud() {
        SyncResult syncResult = new SyncResult();
        Map<String, String> allNeedSync = getAllNeedSync();
        if (allNeedSync.size() == 0) {
            syncResult.success = true;
            return syncResult;
        }
        if (UserSettingsAPI.postUserSettings(this.a, allNeedSync)) {
            syncResult.success = true;
            syncResult.syncToCloudSuccess = true;
        }
        return syncResult;
    }

    public void syncAllToCloudAsync() {
        Observable.create(new a()).subscribeOn(Schedulers.io()).subscribe();
    }

    public void updateAllToSynced() {
        Log.d(b, "Update All To Synced!!", new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("cloud_sync_state", (Integer) 1);
        try {
            ContentResolver contentResolver = this.a.getContentResolver();
            Log.d(b, "Update Values : " + contentValues.toString(), new Object[0]);
            Log.d(b, "All To Synced Count : " + contentResolver.update(SettingsEntry.CONTENT_URI, contentValues, null, null), new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean updateToSynced(String str) {
        Log.d(b, "Update To Synced : " + str, new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("cloud_sync_state", (Integer) 1);
        try {
            return this.a.getContentResolver().update(SettingsEntry.CONTENT_URI, contentValues, "key=?", new String[]{str}) == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateToSynced(@NonNull Map<String, String> map) {
        Iterator<String> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            updateToSynced(it2.next());
        }
        return true;
    }
}
