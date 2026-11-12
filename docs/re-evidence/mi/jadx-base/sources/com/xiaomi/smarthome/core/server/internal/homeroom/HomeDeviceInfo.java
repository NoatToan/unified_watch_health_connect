package com.xiaomi.smarthome.core.server.internal.homeroom;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.fitness.userinfo.collect.Category;
import com.xiaomi.smarthome.core.server.internal.device.DeviceFactory;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HomeDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<HomeDeviceInfo> CREATOR = new Parcelable.Creator<HomeDeviceInfo>() { // from class: com.xiaomi.smarthome.core.server.internal.homeroom.HomeDeviceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HomeDeviceInfo createFromParcel(Parcel parcel) {
            return new HomeDeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HomeDeviceInfo[] newArray(int i) {
            return new HomeDeviceInfo[i];
        }
    };
    private List<Device> deviceList;
    protected Map<String, Device> deviceMap = new ConcurrentHashMap();
    private List<String> didList;
    protected boolean hasMore;
    protected Home home;
    protected String maxDid;
    protected String userId;

    public HomeDeviceInfo() {
    }

    private void addToMap(List<Device> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Device device = list.get(i);
            if (device != null) {
                this.deviceMap.put(device.getDid(), device);
            }
        }
    }

    private void generateDids() {
        List<Device> list = this.deviceList;
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            this.didList = arrayList;
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Device device = list.get(i);
            if (device != null) {
                arrayList.add(device.getDid());
            }
        }
        this.didList = arrayList;
    }

    private void mergeDevices(HomeDeviceInfo homeDeviceInfo) {
        List<Device> list;
        if (homeDeviceInfo == null || (list = homeDeviceInfo.deviceList) == null || list.isEmpty()) {
            return;
        }
        List<Device> list2 = this.deviceList;
        if (list2 == null) {
            setDeviceList(homeDeviceInfo.deviceList);
        } else {
            list2.addAll(homeDeviceInfo.deviceList);
            setDeviceList(this.deviceList);
        }
    }

    private void mergeHomeRoom(HomeDeviceInfo homeDeviceInfo) {
        Home home;
        if (homeDeviceInfo == null || (home = homeDeviceInfo.home) == null) {
            return;
        }
        Home home2 = this.home;
        if (home2 == null) {
            setHome(home);
        } else {
            home2.merge(home);
        }
    }

    public static HomeDeviceInfo parseData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HomeDeviceInfo homeDeviceInfo = new HomeDeviceInfo();
        if (!jSONObject.isNull("home_info")) {
            homeDeviceInfo.home = Home.parse(jSONObject.optJSONObject("home_info"));
        }
        if (!jSONObject.isNull(Category.DEVICE_INFO)) {
            homeDeviceInfo.setDeviceList(parseDevices(jSONObject.optJSONArray(Category.DEVICE_INFO)));
        }
        if (!jSONObject.isNull("dids")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dids");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString)) {
                        arrayList.add(strOptString);
                    }
                }
                homeDeviceInfo.setDidList(arrayList);
            }
        } else if (homeDeviceInfo.getDeviceList() != null && !homeDeviceInfo.getDeviceList().isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Device device : homeDeviceInfo.getDeviceList()) {
                if (device != null && !TextUtils.isEmpty(device.getDid())) {
                    arrayList2.add(device.getDid());
                }
            }
            homeDeviceInfo.setDidList(arrayList2);
        }
        homeDeviceInfo.setHasMore(jSONObject.optBoolean("has_more", false));
        homeDeviceInfo.setMaxDid(jSONObject.optString("max_did"));
        return homeDeviceInfo;
    }

    private static List<Device> parseDevices(JSONArray jSONArray) {
        Device deviceCreateDevice;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (deviceCreateDevice = DeviceFactory.createDevice(jSONObjectOptJSONObject)) != null) {
                arrayList.add(deviceCreateDevice);
            }
        }
        return arrayList;
    }

    public void addDeviceList(List<Device> list) {
        if (list == null) {
            return;
        }
        addToMap(list);
        List<Device> list2 = this.deviceList;
        if (list2 == null) {
            this.deviceList = new ArrayList(list);
        } else {
            list2.addAll(list);
            generateDids();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Device> getDeviceList() {
        List<Device> list = this.deviceList;
        return list == null ? new ArrayList() : list;
    }

    public Map<String, Device> getDeviceMap() {
        return this.deviceMap;
    }

    public List<String> getDidList() {
        List<String> list = this.didList;
        return list == null ? new ArrayList() : list;
    }

    public Home getHome() {
        return this.home;
    }

    public String getMaxDid() {
        return this.maxDid;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void merge(HomeDeviceInfo homeDeviceInfo) {
        if (homeDeviceInfo == null) {
            return;
        }
        mergeDevices(homeDeviceInfo);
        mergeHomeRoom(homeDeviceInfo);
    }

    public void setDeviceList(List<Device> list) {
        this.deviceList = list;
        this.deviceMap = new ConcurrentHashMap();
        addToMap(list);
        generateDids();
    }

    public void setDidList(List<String> list) {
        this.didList = list;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public void setMaxDid(String str) {
        this.maxDid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Home home = this.home;
        if (home != null) {
            jSONObject.put("home_info", home.toJSON());
        }
        jSONObject.put("has_more", this.hasMore);
        jSONObject.put("max_did", this.maxDid);
        List<String> list = this.didList;
        if (list != null && list.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (!TextUtils.isEmpty(str)) {
                    jSONArray.put(str);
                }
            }
            jSONObject.put("dids", jSONArray);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeParcelable(this.home, i);
        parcel.writeByte(this.hasMore ? (byte) 1 : (byte) 0);
        parcel.writeString(this.maxDid);
        parcel.writeStringList(this.didList);
    }

    public HomeDeviceInfo(Parcel parcel) {
        this.userId = parcel.readString();
        this.home = (Home) parcel.readParcelable(Home.class.getClassLoader());
        this.hasMore = parcel.readByte() != 0;
        this.maxDid = parcel.readString();
        this.didList = parcel.createStringArrayList();
    }
}
