package com.huami.watch.companion.watchface.manager;

import androidx.annotation.NonNull;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.util.Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceCloudManager {
    private static final String a = "WatchFaceCloud-Manager";
    private static WatchFaceCloudManager b;

    private WatchFaceCloudManager() {
    }

    private String a(List<WatchFaceCloud> list) {
        StringBuilder sb = new StringBuilder();
        for (WatchFaceCloud watchFaceCloud : list) {
            sb.append("\t\t\n");
            sb.append(watchFaceCloud);
        }
        return sb.toString();
    }

    public static WatchFaceCloudManager getManager() {
        if (b == null) {
            b = new WatchFaceCloudManager();
        }
        return b;
    }

    public boolean add(WatchFaceCloud watchFaceCloud) {
        long jLongValue = watchFaceCloud.save().longValue();
        Log.d(a, jLongValue + ":Add : " + watchFaceCloud, new Object[0]);
        return jLongValue > 0;
    }

    public void delete(WatchFaceCloud watchFaceCloud) {
        Log.d(a, "Delete : " + watchFaceCloud, new Object[0]);
        if (watchFaceCloud == null) {
            return;
        }
        watchFaceCloud.delete();
    }

    public void deleteAll() {
        Log.d(a, "Delete All !!! ", new Object[0]);
        new Delete().from(WatchFaceCloud.class).execute();
    }

    @NonNull
    public List<WatchFaceCloud> getAll() {
        return getAll(Integer.MAX_VALUE);
    }

    @NonNull
    public WatchFaceCloud getWatchFace(int i) {
        return (WatchFaceCloud) new Select().from(WatchFaceCloud.class).where("WatchFaceId=?", Integer.valueOf(i)).executeSingle();
    }

    @NonNull
    public List<WatchFaceCloud> getWatchFaceByIds(String str) {
        List<WatchFaceCloud> listExecute = new Select().from(WatchFaceCloud.class).where("WatchFaceId in (" + str + ")").execute();
        StringBuilder sb = new StringBuilder();
        sb.append("Get getWatchFaceByIds  : ");
        sb.append(listExecute.size());
        String string = sb.toString();
        if (Config.isDebug()) {
            string = string + a(listExecute);
        }
        Log.v(a, string, new Object[0]);
        return listExecute;
    }

    @NonNull
    public List<WatchFaceCloud> getAll(int i) {
        List<WatchFaceCloud> listExecute = new Select().from(WatchFaceCloud.class).limit(i).execute();
        String str = "Get All  : " + listExecute.size();
        if (Config.isDebug()) {
            str = str + a(listExecute);
        }
        Log.v(a, str, new Object[0]);
        return listExecute;
    }

    public boolean add(List<WatchFaceCloud> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Add Items : ");
        sb.append(list == null ? "null" : Integer.valueOf(list.size()));
        Log.d(a, sb.toString(), new Object[0]);
        if (list == null || list.size() == 0) {
            return false;
        }
        ActiveAndroid.beginTransaction();
        boolean z = true;
        try {
            try {
                Iterator<WatchFaceCloud> it2 = list.iterator();
                boolean zAdd = true;
                while (it2.hasNext()) {
                    try {
                        zAdd &= add(it2.next());
                    } catch (Exception e) {
                        e = e;
                        z = zAdd;
                        e.printStackTrace();
                        boolean z2 = z & false;
                        Log.e(a, "addAll : error : " + e.getClass(), new Object[0]);
                        return z2;
                    }
                }
                ActiveAndroid.setTransactionSuccessful();
                return zAdd & true;
            } finally {
                ActiveAndroid.endTransaction();
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
