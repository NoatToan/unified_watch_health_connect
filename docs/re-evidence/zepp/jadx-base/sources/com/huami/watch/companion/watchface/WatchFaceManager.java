package com.huami.watch.companion.watchface;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.activeandroid.query.Update;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceManager {
    private static final String c = "WatchFace-Manager";
    private static final int d = 1;
    private static WatchFaceManager e;
    private Map<String, WatchFace> a = new HashMap();
    private Map<String, WatchFace> b = new HashMap();

    private WatchFaceManager() {
    }

    private WatchFace a(boolean z, String str, JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("pkgName");
        String strOptString2 = jSONObject.optString("serviceName");
        if (z) {
            return get(strOptString, strOptString2, str);
        }
        WatchFace watchFace = new WatchFace();
        watchFace.packageName = strOptString;
        watchFace.serviceName = strOptString2;
        return watchFace;
    }

    private String b(List<WatchFace> list) {
        StringBuilder sb = new StringBuilder();
        for (WatchFace watchFace : list) {
            sb.append("\t\t\n");
            sb.append(watchFace);
        }
        return sb.toString();
    }

    private WatchFace c(Context context, boolean z, String str) {
        String string = UserSettings.getString(context.getContentResolver(), UserSettingsKeys.KEY_WATCHFACE_SELECTED);
        Device deviceFindByDeviceId = DeviceManager.getManager(context).findByDeviceId(str);
        WatchFace watchFaceA = null;
        if (deviceFindByDeviceId == null) {
            return null;
        }
        Log.d(c, "Get User Saved Selected WatchFace : " + string, new Object[0]);
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            String huamiModel = deviceFindByDeviceId.info().getHuamiModel();
            if (!TextUtils.isEmpty(huamiModel)) {
                String strOptString = jSONObject.optString(huamiModel);
                if (!TextUtils.isEmpty(strOptString)) {
                    watchFaceA = a(z, str, new JSONObject(strOptString));
                }
            }
            return watchFaceA == null ? a(z, str, jSONObject) : watchFaceA;
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.d(c, e2.toString(), new Object[0]);
            return null;
        }
    }

    private void d(Context context, String str, String str2, String str3) {
        Log.d(c, "Save User Selected WatchFace : <" + str + ", " + str2 + "," + str3 + SearchCriteria.GT, new Object[0]);
        Device deviceFindByDeviceId = DeviceManager.getManager(context).findByDeviceId(str3);
        if (deviceFindByDeviceId == null) {
            return;
        }
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String string2 = UserSettings.getString(context.getContentResolver(), UserSettingsKeys.KEY_WATCHFACE_SELECTED);
                JSONObject jSONObject = TextUtils.isEmpty(string2) ? new JSONObject() : new JSONObject(string2);
                String huamiModel = deviceFindByDeviceId.info().getHuamiModel();
                if (TextUtils.isEmpty(huamiModel)) {
                    jSONObject.put("pkgName", str);
                    jSONObject.put("serviceName", str2);
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("pkgName", str);
                    jSONObject2.put("serviceName", str2);
                    jSONObject.put(huamiModel, jSONObject2.toString());
                }
                string = jSONObject.toString();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.d(c, "Save User Selected WatchFace :" + string, new Object[0]);
        UserSettings.putString(context.getContentResolver(), UserSettingsKeys.KEY_WATCHFACE_SELECTED, string);
    }

    public static WatchFaceManager getManager() {
        if (e == null) {
            e = new WatchFaceManager();
        }
        return e;
    }

    public static boolean isEqualsWatchFace(WatchFace watchFace, WatchFace watchFace2) {
        return (watchFace == null || TextUtils.isEmpty(watchFace.packageName) || TextUtils.isEmpty(watchFace.serviceName) || !watchFace.packageName.equals(watchFace2.packageName) || !watchFace.serviceName.equals(watchFace2.serviceName)) ? false : true;
    }

    public byte[] Bitmap2Bytes(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean add(WatchFace watchFace) {
        Log.d(c, "Add : " + watchFace, new Object[0]);
        return watchFace.save().longValue() > 0;
    }

    public void clearCachedSelectedWatchFace() {
        this.a.clear();
    }

    public void clearCachedWatchFace() {
        this.a.clear();
        this.b.clear();
    }

    public void delete(WatchFace watchFace) {
        Log.d(c, "Delete : " + watchFace, new Object[0]);
        if (watchFace == null) {
            return;
        }
        watchFace.delete();
    }

    public WatchFace get(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return (WatchFace) new Select().from(WatchFace.class).where("PackageName=?", str).and("ServiceName=?", str2).and("DeviceId=?", str3).executeSingle();
    }

    @NonNull
    public List<WatchFace> getAll(int i, String str) {
        List<WatchFace> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            arrayList = new Select().from(WatchFace.class).where("DeviceId=?", str).orderBy("DownloadTime DESC").limit(i).execute();
        }
        String str2 = "Get All <" + str + "> : " + arrayList.size();
        if (Config.isDebug()) {
            str2 = str2 + b(arrayList);
        }
        Log.v(c, str2, new Object[0]);
        return arrayList;
    }

    @NonNull
    public List<WatchFace> getDefault(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        Device deviceFindByDeviceId = DeviceManager.getManager(context).findByDeviceId(str);
        arrayList.add((deviceFindByDeviceId == null || !DeviceSource.isModelEverest(deviceFindByDeviceId)) ? new WatchFace("com.huami.watch.watchface.analogyellow", "com.huami.watch.watchface.DigitalWatchFaceSportOne", context.getString(R.string.watchface_1), Bitmap2Bytes(BitmapFactory.decodeResource(context.getResources(), R.drawable.watchface_default_sport_one))) : new WatchFace("com.huami.watch.watchface.analogyellow", "com.huami.watch.watchface.AnalogWatchFaceSixteen", context.getString(R.string.watchface_everest), Bitmap2Bytes(BitmapFactory.decodeResource(context.getResources(), R.drawable.watchface_default_everest))));
        return arrayList;
    }

    public WatchFace getDefaultWatchFace(Context context, boolean z, String str) {
        byte[] bArrBitmap2Bytes;
        WatchFace watchFace;
        if (this.b.get(str) == null || (z && this.b.get(str).previewThumb == null)) {
            if (this.b.get(str) == null) {
                Device deviceFindByDeviceId = DeviceManager.getManager(context).findByDeviceId(str);
                if (deviceFindByDeviceId != null && DeviceSource.isModelQogir(deviceFindByDeviceId)) {
                    watchFace = new WatchFace("com.huami.watch.watchface.analogyellow", "com.huami.watch.watchface.DigitalWatchFaceSportTwentyTwo", "", null);
                } else if (deviceFindByDeviceId == null || !DeviceSource.isModelEverest(deviceFindByDeviceId)) {
                    watchFace = (deviceFindByDeviceId == null || !DeviceSource.isModelXihu(deviceFindByDeviceId)) ? new WatchFace("com.huami.watch.watchface.analogyellow", "com.huami.watch.watchface.DigitalWatchFaceSportOne", context.getString(R.string.watchface_1), null) : new WatchFace("com.huami.watch.watchface.one", "com.huami.watch.watchface.XhAnalogWatchFaceOne", "", null);
                } else {
                    watchFace = new WatchFace("com.huami.watch.watchface.analogyellow", "com.huami.watch.watchface.AnalogWatchFaceSixteen", context.getString(R.string.watchface_everest), null);
                }
                this.b.put(str, watchFace);
            }
            if (z && this.b.get(str).previewThumb == null) {
                Device deviceFindByDeviceId2 = DeviceManager.getManager(context).findByDeviceId(str);
                if (deviceFindByDeviceId2 != null && DeviceSource.isModelQogir(deviceFindByDeviceId2)) {
                    bArrBitmap2Bytes = Bitmap2Bytes(BitmapFactory.decodeResource(context.getResources(), R.drawable.watchface_default_qogir));
                } else if (deviceFindByDeviceId2 == null || !DeviceSource.isModelEverest(deviceFindByDeviceId2)) {
                    bArrBitmap2Bytes = (deviceFindByDeviceId2 == null || !DeviceSource.isModelXihu(deviceFindByDeviceId2)) ? Bitmap2Bytes(BitmapFactory.decodeResource(context.getResources(), R.drawable.watchface_default_sport_one)) : Bitmap2Bytes(BitmapFactory.decodeResource(context.getResources(), R.drawable.watch_face_normal_bg));
                } else {
                    bArrBitmap2Bytes = Bitmap2Bytes(BitmapFactory.decodeResource(context.getResources(), R.drawable.watchface_default_everest));
                }
                this.b.get(str).previewThumb = bArrBitmap2Bytes;
            }
        }
        return this.b.get(str);
    }

    public WatchFace getSelectedWatchFace(Context context, boolean z, String str) {
        if (this.a.get(str) != null) {
            return this.a.get(str);
        }
        WatchFace watchFaceC = c(context, true, str);
        this.a.put(str, watchFaceC);
        if (watchFaceC != null) {
            return watchFaceC;
        }
        Log.d(c, "None selected watch on local, watch face has not been synced from watch yet!!!", new Object[0]);
        return getDefaultWatchFace(context, z, str);
    }

    public WatchFace getUserSelectedWatchFace(Context context, String str) {
        return c(context, false, str);
    }

    public int getWatchFaceCount(String str) {
        int iCount = !TextUtils.isEmpty(str) ? new Select().from(WatchFace.class).where("DeviceId=?", str).count() : 0;
        Log.d(c, "Get Count : " + iCount + ", DID : " + str, new Object[0]);
        if (iCount <= 0) {
            return 1;
        }
        return iCount;
    }

    public boolean has(String str, String str2, String str3) {
        return get(str, str2, str3) != null;
    }

    public boolean isUserSelectedWatchFaceEmpty(Context context) {
        boolean zIsEmpty = TextUtils.isEmpty(UserSettings.getString(context.getContentResolver(), UserSettingsKeys.KEY_WATCHFACE_SELECTED));
        Log.d(c, "Is Saved Selected WatchFace Empty : " + zIsEmpty, new Object[0]);
        return zIsEmpty;
    }

    public void resetDefaultWatchFace(Context context, Device device) {
        WatchFace defaultWatchFace = getDefaultWatchFace(context, false, device.getCpuId());
        setSelectedWatchFace(context, defaultWatchFace.packageName, defaultWatchFace.serviceName, device.getCpuId());
        SyncUtil.syncWatchFaceToWatch(context, defaultWatchFace.packageName, defaultWatchFace.serviceName);
    }

    public void setSelectedWatchFace(Context context, String str, String str2, String str3) {
        this.a.put(str3, get(str, str2, str3));
        d(context, str, str2, str3);
        UserSettingsManager.getManager(context).syncAllToCloudAsync();
        RxBus.get().postMainThread(new WatchFaceArrivingEvent(WatchFaceArrivingEvent.CMD_SET));
    }

    public void update(WatchFace watchFace) {
        Log.d(c, "Update : " + watchFace, new Object[0]);
        if (watchFace == null) {
            return;
        }
        watchFace.save();
    }

    public void updateLabel(String str, String str2, String str3, String str4) {
        Log.d(c, "Update label: " + str + " " + str2, new Object[0]);
        new Update(WatchFace.class).set("Label=?", str3).where("PackageName=? and ServiceName=? and DeviceId=?", str, str2, str4).execute();
    }

    public void updateSlpt(String str, String str2, boolean z, String str3) {
        Log.d(c, "Update Slpt: " + str + " " + str2, new Object[0]);
        new Update(WatchFace.class).set("HasSlpt=?", Integer.valueOf(z ? 1 : 0)).where("PackageName=? and ServiceName=? and DeviceId=?", str, str2, str3).execute();
    }

    public void wipeAll() {
        new Delete().from(WatchFace.class).execute();
        clearCachedWatchFace();
    }

    public boolean add(List<WatchFace> list) {
        boolean z;
        Log.d(c, "Add Items : " + list.size(), new Object[0]);
        ActiveAndroid.beginTransaction();
        boolean z2 = true;
        try {
            try {
                Iterator<WatchFace> it2 = list.iterator();
                boolean zAdd = true;
                while (it2.hasNext()) {
                    try {
                        zAdd &= add(it2.next());
                    } catch (Exception e2) {
                        e = e2;
                        z2 = zAdd;
                        e.printStackTrace();
                        z = z2 & false;
                    }
                }
                ActiveAndroid.setTransactionSuccessful();
                z = zAdd & true;
            } finally {
                ActiveAndroid.endTransaction();
            }
        } catch (Exception e3) {
            e = e3;
        }
        return z;
    }

    public WatchFace get(int i) {
        WatchFace watchFace = (WatchFace) new Select().from(WatchFace.class).orderBy("Label ASC").offset(i).executeSingle();
        Log.d(c, "Get : " + i + ", " + watchFace, new Object[0]);
        return watchFace;
    }

    @NonNull
    public List<WatchFace> getAll(String str) {
        return getAll(Integer.MAX_VALUE, str);
    }
}
