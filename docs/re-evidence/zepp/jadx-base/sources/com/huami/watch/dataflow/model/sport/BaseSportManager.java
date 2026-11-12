package com.huami.watch.dataflow.model.sport;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.Model;
import com.activeandroid.query.Delete;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseSportManager<T extends Model> {
    private boolean a(@NonNull T t, boolean z) {
        Long id = t.getId();
        Long lSave = t.save();
        boolean z2 = true;
        if (id == null && lSave.longValue() < 0) {
            z2 = false;
        }
        if (z) {
            Log.d(tag(), "Save : " + itemToShortString(t) + ", " + z2, new Object[0]);
        }
        return z2;
    }

    public void delete(T t) {
        Log.d(tag(), "Delete : " + t, new Object[0]);
        if (t == null) {
            return;
        }
        t.delete();
    }

    public boolean deleteAll() {
        new Delete().from(itemClassType()).execute();
        Log.d(tag(), "Delete All!!", new Object[0]);
        return true;
    }

    public String getRawData(long j, String str, File file) {
        if (j > 0 && !TextUtils.isEmpty(str)) {
            return FilesUtil.readSafe(file);
        }
        return null;
    }

    public abstract Class<T> itemClassType();

    public String itemToShortString(T t) {
        if (t == null) {
            return null;
        }
        return t.toString();
    }

    public String itemsToShortString(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().toString());
        }
        return sb.toString();
    }

    public boolean save(@NonNull T t) {
        return a(t, true);
    }

    public boolean saveAll(@NonNull List<T> list) {
        boolean z;
        ActiveAndroid.beginTransaction();
        try {
            try {
                Iterator<T> it2 = list.iterator();
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

    public boolean saveRawData(long j, String str, String str2, File file) {
        if (j <= 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return FilesUtil.saveSafe(str2.getBytes(), file);
    }

    public abstract String tag();
}
