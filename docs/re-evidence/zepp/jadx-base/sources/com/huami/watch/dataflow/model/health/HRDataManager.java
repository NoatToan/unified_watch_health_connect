package com.huami.watch.dataflow.model.health;

import androidx.annotation.NonNull;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.huami.watch.dataflow.model.health.bean.HealthHRDataItem;
import com.huami.watch.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class HRDataManager {
    private static final String a = "DataFlow-Model-HRDataManager";
    private static HRDataManager b;

    private HRDataManager() {
    }

    private boolean a(@NonNull HealthHRDataItem healthHRDataItem, boolean z) {
        Long id = healthHRDataItem.getId();
        Long lSave = healthHRDataItem.save();
        boolean z2 = true;
        if (id == null && lSave.longValue() < 0) {
            z2 = false;
        }
        if (z) {
            Log.d(tag(), "Save : " + itemToShortString(healthHRDataItem) + ", " + z2, new Object[0]);
        }
        return z2;
    }

    public static HRDataManager getManager() {
        if (b == null) {
            b = new HRDataManager();
        }
        return b;
    }

    public void delete(HealthHRDataItem healthHRDataItem) {
        Log.d(a, "Delete : " + healthHRDataItem, new Object[0]);
        if (healthHRDataItem == null) {
            return;
        }
        healthHRDataItem.delete();
    }

    public boolean deleteAll() {
        new Delete().from(HealthHRDataItem.class).execute();
        Log.d(a, "Delete All!!", new Object[0]);
        return true;
    }

    public HealthHRDataItem get(long j) {
        HealthHRDataItem healthHRDataItem = (HealthHRDataItem) new Select().from(HealthHRDataItem.class).where("timestamp = ?", Long.valueOf(j)).executeSingle();
        Log.d(a, "Get <" + j + ">: " + healthHRDataItem, new Object[0]);
        return healthHRDataItem;
    }

    public List<HealthHRDataItem> getAll() {
        return getAll(0L, System.currentTimeMillis() / 1000, Integer.MAX_VALUE);
    }

    public HealthHRDataItem getLatest() {
        HealthHRDataItem healthHRDataItem = (HealthHRDataItem) new Select().from(HealthHRDataItem.class).orderBy("timestamp DESC").executeSingle();
        Log.d(a, "Get Latest: " + healthHRDataItem, new Object[0]);
        return healthHRDataItem;
    }

    public String itemToShortString(HealthHRDataItem healthHRDataItem) {
        if (healthHRDataItem == null) {
            return null;
        }
        return healthHRDataItem.toString();
    }

    public String itemsToShortString(Collection<HealthHRDataItem> collection) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        Iterator<HealthHRDataItem> it2 = collection.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().toString());
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    public boolean save(@NonNull HealthHRDataItem healthHRDataItem) {
        return a(healthHRDataItem, true);
    }

    public boolean saveAll(@NonNull List<HealthHRDataItem> list) {
        boolean z;
        ActiveAndroid.beginTransaction();
        try {
            try {
                Iterator<HealthHRDataItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    a(it2.next(), false);
                }
                ActiveAndroid.setTransactionSuccessful();
                ActiveAndroid.endTransaction();
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(tag(), "Save All Fail", e, new Object[0]);
                ActiveAndroid.endTransaction();
                z = false;
            }
            Log.d(tag(), "Save Items : " + z + ", " + list.size() + ", " + itemsToShortString(list), new Object[0]);
            return z;
        } catch (Throwable th) {
            ActiveAndroid.endTransaction();
            throw th;
        }
    }

    public String tag() {
        return a;
    }

    public List<HealthHRDataItem> getAll(long j, long j2, int i) {
        List<HealthHRDataItem> listExecute = new Select().from(HealthHRDataItem.class).where("timestamp between ? and ?", Long.valueOf(j), Long.valueOf(j2)).orderBy("timestamp DESC").limit(i).execute();
        Log.d(a, "Get All HR : < startTime : " + j + " endTime : " + j2 + " limit :" + i + " size : " + listExecute.size() + "\n" + itemsToShortString(listExecute) + SearchCriteria.GT, new Object[0]);
        return listExecute;
    }
}
