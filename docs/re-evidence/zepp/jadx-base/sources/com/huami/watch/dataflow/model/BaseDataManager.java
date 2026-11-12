package com.huami.watch.dataflow.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.google.gson.Gson;
import com.huami.watch.dataflow.model.DataItem;
import com.huami.watch.dataflow.model.DataSummaryItem;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseDataManager<D extends DataItem, S extends DataSummaryItem> {
    private static final String[] a = {"Id", "date", "summary", "synced"};
    private static final String[] b = {"Id", "date"};
    private static final String[] c = {"Id", "date", "synced"};

    @NonNull
    private List<S> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<D> it2 = getAll(false, a).iterator();
        while (it2.hasNext()) {
            arrayList.add(c(it2.next()));
        }
        Log.d(tag(), "Get AllSummary : " + arrayList.size() + Arrays.toString(arrayList.toArray()), new Object[0]);
        return arrayList;
    }

    @NonNull
    private Select b(String[] strArr) {
        return (strArr == null || strArr.length <= 0) ? new Select() : new Select(strArr);
    }

    private S c(D d) {
        S s = (S) new Gson().fromJson(d.getSummary(), (Class) itemSummaryClassType());
        if (s != null) {
            s.setDate(d.getDate());
        }
        return s;
    }

    private boolean d(@NonNull D d, boolean z) {
        Long id = d.getId();
        Long lSave = d.save();
        boolean z2 = true;
        if (id == null && lSave.longValue() < 0) {
            z2 = false;
        }
        if (z) {
            Log.d(tag(), "Save : " + itemToShortString(d) + ", " + z2, new Object[0]);
        }
        return z2;
    }

    public boolean deleteAll() {
        new Delete().from(itemClassType()).execute();
        Log.d(tag(), "Delete All!!", new Object[0]);
        return true;
    }

    @Nullable
    public D get(String str) {
        return (D) get(str, true, null);
    }

    @NonNull
    public List<D> getAll(String str, String str2, boolean z, String... strArr) {
        List<D> listExecute = b(strArr).from(itemClassType()).where("date between ? and ?", str, str2).execute();
        if (z) {
            Log.d(tag(), "Get All : <" + str + Constants.WAVE_SEPARATOR + str2 + ">, " + listExecute.size(), new Object[0]);
        }
        return listExecute;
    }

    @NonNull
    public Map<String, D> getAllDetails(String str, String str2) {
        HashMap map = new HashMap();
        for (D d : getAll(str, str2, false, null)) {
            map.put(d.getDate(), d);
        }
        Log.d(tag(), "Get AllDetail : <" + str + Constants.WAVE_SEPARATOR + str2 + ">, " + map.size() + ", " + itemsToShortString(map.values()), new Object[0]);
        return map;
    }

    public Map<String, S> getAllSummary(String str, String str2) {
        HashMap map = new HashMap();
        for (D d : getAll(str, str2, false, a)) {
            map.put(d.getDate(), c(d));
        }
        Log.d(tag(), "Get AllSummary : <" + str + Constants.WAVE_SEPARATOR + str2 + ">, " + map.size() + ", " + Arrays.toString(map.values().toArray()), new Object[0]);
        return map;
    }

    public String getStartDay() {
        DataItem dataItem = (DataItem) b(b).from(itemClassType()).orderBy("date ASC").executeSingle();
        Log.d(tag(), "Get StartDay : <" + itemToShortString(dataItem) + SearchCriteria.GT, new Object[0]);
        if (dataItem != null) {
            return dataItem.getDate();
        }
        return null;
    }

    @Nullable
    public S getSummary(String str) {
        DataItem dataItem = get(str, false, summaryColumns());
        S s = dataItem != null ? (S) c(dataItem) : null;
        Log.d(tag(), "Get Summary <" + str + ">: " + s, new Object[0]);
        return s;
    }

    public D getSyncState(String str) {
        return (D) get(str, true, c);
    }

    public abstract Class<D> itemClassType();

    public abstract Class<S> itemSummaryClassType();

    public String itemToShortString(D d) {
        if (d == null) {
            return null;
        }
        return d.toStringShort();
    }

    public String itemsToShortString(Collection<D> collection) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        Iterator<D> it2 = collection.iterator();
        while (it2.hasNext()) {
            sb.append(itemToShortString(it2.next()));
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    public boolean save(@NonNull D d) {
        return d(d, true);
    }

    public boolean saveAll(@NonNull List<D> list) {
        boolean z;
        ActiveAndroid.beginTransaction();
        try {
            try {
                Iterator<D> it2 = list.iterator();
                while (it2.hasNext()) {
                    d(it2.next(), false);
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

    public String[] summaryColumns() {
        return a;
    }

    public abstract String tag();

    @Nullable
    public D get(String str, boolean z, String... strArr) {
        if (DateDay.from(str).after(DateDay.today())) {
            return null;
        }
        D d = (D) b(strArr).from(itemClassType()).where("date = ?", str).executeSingle();
        if (z) {
            Log.d(tag(), "Get (" + str + ") : " + itemToShortString(d), new Object[0]);
        }
        return d;
    }

    @NonNull
    public List<D> getAll(boolean z, String... strArr) {
        List<D> listExecute = b(strArr).from(itemClassType()).execute();
        if (z) {
            Log.d(tag(), "Get All : " + listExecute.size(), new Object[0]);
        }
        return listExecute;
    }
}
