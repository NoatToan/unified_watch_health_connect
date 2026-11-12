package com.huami.assistant.model;

import androidx.annotation.NonNull;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.huami.assistant.model.bean.Update;
import com.huami.watch.model.BaseModelManager;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class UpdatesManager extends BaseModelManager<Update> {
    private static final String c = "Assist-UpdatesManager";

    private void a(Update source, Update target) {
        if (target == null) {
            return;
        }
        target.type = source.type;
        target.title = source.title;
        target.description = source.description;
        target.startTime = source.startTime;
        target.endTime = source.endTime;
        target.data = source.data;
        target.data1 = source.data1;
        target.syncId = source.syncId;
        target.syncState = source.syncState;
    }

    private boolean b(int type, @NonNull String[] syncIds) {
        new Delete().from(Update.class).where("type=? AND sync_id NOT IN (" + ArraysUtil.join(syncIds, "'", "'", ",") + ")", Integer.valueOf(type)).execute();
        Log.d(tag(), "Delete <Type: " + type + ", ExcludeSyncIds: " + ArraysUtil.toString(syncIds) + SearchCriteria.GT, new Object[0]);
        return true;
    }

    public static UpdatesManager getManager() {
        return (UpdatesManager) BaseModelManager.getManager(UpdatesManager.class);
    }

    public boolean delete(long id) {
        delete(Update.class, id);
        return true;
    }

    public boolean deleteAll(int type) {
        new Delete().from(Update.class).where("type=?", Integer.valueOf(type)).execute();
        Log.d(tag(), "Delete All, Type : " + type, new Object[0]);
        return true;
    }

    public boolean deleteAllAndSave(int type, @NonNull List<Update> updates) {
        boolean z;
        ActiveAndroid.beginTransaction();
        try {
            try {
                if (ArraysUtil.isEmpty(updates)) {
                    deleteAll(type);
                } else {
                    String[] strArr = new String[updates.size()];
                    int i = 0;
                    for (Update update : updates) {
                        update.save();
                        strArr[i] = update.syncId;
                        i++;
                    }
                    b(type, strArr);
                }
                ActiveAndroid.setTransactionSuccessful();
                ActiveAndroid.endTransaction();
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                ActiveAndroid.endTransaction();
                z = false;
            }
            Log.d(c, "Delete All & Save <Type: " + type + ", " + ArraysUtil.toString(updates) + ">, Success: " + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            ActiveAndroid.endTransaction();
            throw th;
        }
    }

    public boolean deleteBySyncId(int type, @NonNull String syncId) {
        new Delete().from(Update.class).where("type=? AND sync_id=?", Integer.valueOf(type), syncId).execute();
        Log.d(tag(), "Delete <Type: " + type + ", SyncId: " + syncId + SearchCriteria.GT, new Object[0]);
        return true;
    }

    public boolean deleteBySyncIds(int type, @NonNull String[] syncIds) {
        new Delete().from(Update.class).where("type=? AND sync_id IN (" + ArraysUtil.join(syncIds, "'", "'", ",") + ")", Integer.valueOf(type)).execute();
        Log.d(tag(), "Delete <Type: " + type + ", SyncIds: " + ArraysUtil.toString(syncIds) + SearchCriteria.GT, new Object[0]);
        return true;
    }

    public Update get(long id) {
        return get(Update.class, id);
    }

    public List<Update> getAll(int type) {
        return getAll(type, -1, -1L, -1L);
    }

    public Update getBySyncId(String syncId) {
        List listExecute = new Select().from(Update.class).where("sync_id=?", syncId).execute();
        Log.d(c, "Get <SyncId: " + syncId + ">: " + ArraysUtil.toString((List<?>) listExecute), new Object[0]);
        if (ArraysUtil.isEmpty(listExecute)) {
            return null;
        }
        return (Update) listExecute.get(0);
    }

    public List<Update> getNeedSyncUpdates(int type) {
        List<Update> listExecute = new Select().from(Update.class).where("type=? AND sync_state=?", Integer.valueOf(type), 1).execute();
        Log.d(c, "Get Need Sync <Type: " + type + ">: " + ArraysUtil.toString(listExecute), new Object[0]);
        return listExecute;
    }

    public List<Update> getPinData() {
        return new Select().from(Update.class).where("state=?", Boolean.TRUE).and("(sync_state!=? and sync_state!=?)", 4, 3).execute();
    }

    public boolean isSmsExist(long startTime) {
        return ((Update) new Select().from(Update.class).where("sync_id=?", String.valueOf(startTime)).executeSingle()) != null;
    }

    public boolean logicDeleteBySyncId(int type, @NonNull String syncId) {
        new com.activeandroid.query.Update(Update.class).set("sync_state=4").where("type=? AND sync_id=?", Integer.valueOf(type), syncId).execute();
        Log.d(tag(), "Logic Delete <Type: " + type + ", SyncId: " + syncId + SearchCriteria.GT, new Object[0]);
        return true;
    }

    public boolean logicDeleteBySyncIds(@NonNull String[] syncIds) {
        new com.activeandroid.query.Update(Update.class).set("sync_state=4").where("sync_id IN (" + ArraysUtil.join(syncIds, "'", "'", ",") + ")").execute();
        Log.d(tag(), "Logic Delete <SyncIds: " + ArraysUtil.toString(syncIds) + SearchCriteria.GT, new Object[0]);
        return true;
    }

    @Override // com.huami.watch.model.BaseModelManager
    public String tag() {
        return c;
    }

    public void updatePinData(Update update) {
        if (update == null) {
            return;
        }
        save(update);
        List<Update> pinData = getPinData();
        for (int i = 0; i < pinData.size(); i++) {
            Update update2 = pinData.get(i);
            if (!update2.getId().equals(update.getId())) {
                update2.setPin(false);
                update2.save();
            }
        }
    }

    public List<Update> getAll(int type, long startTime, long endTime) {
        return getAll(type, -1, startTime, endTime);
    }

    @Override // com.huami.watch.model.BaseModelManager
    public boolean save(Update data) {
        Update bySyncId = getBySyncId(data.syncId);
        if (bySyncId != null) {
            a(data, bySyncId);
        }
        if (bySyncId != null) {
            data = bySyncId;
        }
        return super.save(data);
    }

    public List<Update> getAll(int type, int limit, long startTime, long endTime) {
        ArrayList arrayList = new ArrayList();
        From from = new Select().from(Update.class);
        from.where("type=?", Integer.valueOf(type));
        if (limit > 0) {
            from.limit(limit);
        }
        from.and("(sync_state!=? and sync_state!=?)", 4, 3);
        from.orderBy("start_time DESC");
        List<Update> listExecute = from.execute();
        if (listExecute != null && !listExecute.isEmpty()) {
            for (Update update : listExecute) {
                if (startTime == -1 && endTime == -1) {
                    arrayList.add(update);
                } else {
                    long j = update.startTime;
                    if (j >= startTime && j <= endTime) {
                        arrayList.add(update);
                    }
                }
            }
        }
        Log.d(tag(), "Get all updates,<Type:" + type + ",Limit:" + limit + ",StartTime:" + startTime + ",EndTime:" + endTime + ",Result:" + arrayList + SearchCriteria.GT, new Object[0]);
        return arrayList;
    }

    public boolean deleteAll() {
        deleteAll(Update.class);
        return true;
    }

    public Update getBySyncId(int type, String syncId) {
        List listExecute = new Select().from(Update.class).where("type=? AND sync_id=?", Integer.valueOf(type), syncId).execute();
        Log.d(c, "Get <Type: " + type + ", " + syncId + ">: " + ArraysUtil.toString((List<?>) listExecute), new Object[0]);
        if (ArraysUtil.isEmpty(listExecute)) {
            return null;
        }
        return (Update) listExecute.get(0);
    }
}
