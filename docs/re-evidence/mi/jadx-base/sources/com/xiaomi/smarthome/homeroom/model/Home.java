package com.xiaomi.smarthome.homeroom.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.facebook.react.modules.appstate.AppStateModule;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class Home implements Parcelable {
    public static final Parcelable.Creator<Home> CREATOR = new Parcelable.Creator<Home>() { // from class: com.xiaomi.smarthome.homeroom.model.Home.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Home createFromParcel(Parcel parcel) {
            return new Home(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Home[] newArray(int i) {
            return new Home[i];
        }
    };
    private static final String HOME_DEFAULT = "1";
    public static final String JSON_KEY_ADDRESS = "address";
    public static final String JSON_KEY_LATITUDE = "latitude";
    public static final String JSON_KEY_LOCATIONID = "city_id";
    public static final String JSON_KEY_LONGITUDE = "longitude";
    public static final int PERMIT_HOME_MANAGER = 9;
    public static final int PERMIT_HOME_MEMBER = 2;
    public static final int PERMIT_HOME_MEMBER_READ_ONLY = 1;
    public static final int PERMIT_HOME_OWNER = 10;
    public static final String TAG = "Home";
    private String addr;
    private String autoPageBg;
    private String background;
    private String bssid;
    private String city_id;
    private long create_time;
    private String desc;
    private List<String> dids;
    private String icon;
    private String id;
    private String latitude;
    private String longitude;
    private String name;
    private long ownerUid;
    private int permitLevel;
    private List<Room> roomList;
    private int shareflag;
    private List<String> status;
    private final String statusFlag;

    public static class Builder {
        private long create_time;
        private long ownerUid;
        private int permit_level;
        private String bssid = "";
        private String desc = "";
        private String icon = "";
        private String status = "";
        private String background = "";
        private String autoPageBg = "";
        private String id = "";
        private String name = "";
        private int shareflag = 0;
        private List<String> dids = new UnduplicateList(new CopyOnWriteArrayList());
        private List<Room> roomList = new ArrayList();
        private String latitude = "0";
        private String longitude = "0";
        private String city_id = "0";
        private String addr = "";

        public Builder addr(String str) {
            this.addr = str;
            return this;
        }

        public Builder autoPageBg(String str) {
            this.autoPageBg = str;
            return this;
        }

        public Builder background(String str) {
            this.background = str;
            return this;
        }

        public Builder bssid(String str) {
            this.bssid = str;
            return this;
        }

        public Home build() {
            return new Home(this);
        }

        public Builder city_id(String str) {
            this.city_id = str;
            return this;
        }

        public Builder create_time(Long l) {
            this.create_time = l.longValue();
            return this;
        }

        public Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public Builder dids(List<String> list) {
            List<String> list2 = this.dids;
            if (list2 != list) {
                list2.clear();
                this.dids.addAll(list);
            }
            return this;
        }

        public Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder latitude(String str) {
            this.latitude = str;
            return this;
        }

        public Builder longitude(String str) {
            this.longitude = str;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder ownerUid(long j) {
            this.ownerUid = j;
            return this;
        }

        public Builder permit_level(int i) {
            this.permit_level = i;
            return this;
        }

        public Builder roomList(List<Room> list) {
            this.roomList = list;
            return this;
        }

        public Builder shareflag(int i) {
            this.shareflag = i;
            return this;
        }

        public Builder status(String str) {
            this.status = str;
            return this;
        }
    }

    public static boolean isSameLocation(String str, String str2, String str3, String str4) {
        if (!isValidLatLng(str) || !isValidLatLng(str2) || !isValidLatLng(str3) || !isValidLatLng(str4)) {
            return false;
        }
        return Math.abs(Double.parseDouble(str) - Double.parseDouble(str3)) < 0.001d && Math.abs(Double.parseDouble(str2) - Double.parseDouble(str4)) < 0.001d;
    }

    public static boolean isValidLatLng(String str) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, "0")) ? false : true;
    }

    private void mergeDefaultDids(Home home) {
        if (home == null || home.getDids() == null || home.getDids().isEmpty()) {
            return;
        }
        List<String> list = this.dids;
        if (list == null) {
            this.dids = home.dids;
        } else {
            list.addAll(home.dids);
        }
    }

    private void mergeDids(Home home) {
        mergeDefaultDids(home);
        mergeRoomDids(home);
    }

    private void mergeRoomDids(Home home) {
        if (home == null || home.getRoomList() == null || home.getRoomList().isEmpty()) {
            return;
        }
        if (getRoomList() == null) {
            setRoomList(home.getRoomList());
            return;
        }
        List<Room> roomList = home.getRoomList();
        List<Room> roomList2 = getRoomList();
        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            if (room != null) {
                int iIndexOf = roomList2.indexOf(room);
                if (iIndexOf == -1) {
                    roomList2.add(room);
                } else {
                    roomList2.get(iIndexOf).merge(room);
                }
            }
        }
    }

    public static Home parse(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        Builder builder = new Builder();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(DeviceTagInterface.ROUTER_BSSID)) {
                    builder.bssid(jSONObject.optString(DeviceTagInterface.ROUTER_BSSID));
                }
                if (!jSONObject.isNull("desc")) {
                    builder.desc(jSONObject.optString("desc"));
                }
                if (!jSONObject.isNull("id")) {
                    builder.id(jSONObject.optString("id"));
                }
                if (!jSONObject.isNull("name")) {
                    builder.name(jSONObject.optString("name"));
                }
                if (!jSONObject.isNull("shareflag")) {
                    builder.shareflag(jSONObject.optInt("shareflag"));
                }
                if (!jSONObject.isNull("uid")) {
                    builder.ownerUid(jSONObject.optLong("uid"));
                }
                if (!jSONObject.isNull("icon")) {
                    builder.icon(jSONObject.optString("icon"));
                }
                if (!jSONObject.isNull("status")) {
                    builder.status(jSONObject.optString("status"));
                }
                if (!jSONObject.isNull(AppStateModule.APP_STATE_BACKGROUND)) {
                    builder.background(jSONObject.optString(AppStateModule.APP_STATE_BACKGROUND));
                }
                if (!jSONObject.isNull("smart_room_background")) {
                    builder.autoPageBg(jSONObject.optString("smart_room_background"));
                }
                if (!jSONObject.isNull("latitude")) {
                    builder.latitude = jSONObject.optString("latitude");
                }
                if (!jSONObject.isNull("longitude")) {
                    builder.longitude = jSONObject.optString("longitude");
                }
                if (!jSONObject.isNull(JSON_KEY_LOCATIONID)) {
                    builder.city_id = jSONObject.optString(JSON_KEY_LOCATIONID);
                }
                if (!jSONObject.isNull("status")) {
                    builder.status = jSONObject.optString("status");
                }
                if (!jSONObject.isNull(MiuiCursorConstants.CREATE_TIME)) {
                    builder.create_time(Long.valueOf(jSONObject.optLong(MiuiCursorConstants.CREATE_TIME)));
                }
                if (!jSONObject.isNull("permit_level")) {
                    builder.permit_level(jSONObject.optInt("permit_level"));
                }
                if (!jSONObject.isNull("dids") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("dids")) != null) {
                    UnduplicateList unduplicateList = new UnduplicateList(new CopyOnWriteArrayList());
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        if (!TextUtils.isEmpty(jSONArrayOptJSONArray.optString(i))) {
                            unduplicateList.add(jSONArrayOptJSONArray.optString(i));
                        }
                    }
                    builder.dids(unduplicateList);
                }
                if (!jSONObject.isNull("roomlist")) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("roomlist");
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                        arrayList.add(Room.parse(jSONArrayOptJSONArray3.optJSONObject(i2)));
                    }
                    builder.roomList(arrayList);
                    arrayList.trimToSize();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Home homeBuild = builder.build();
        try {
            if (!jSONObject.isNull("status_list") && (jSONArrayOptJSONArray2 = jSONObject.optJSONArray("status_list")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    String strOptString = jSONArrayOptJSONArray2.optString(i3);
                    if (!TextUtils.isEmpty(strOptString)) {
                        arrayList2.add(strOptString);
                    }
                }
                homeBuild.status = arrayList2;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return homeBuild;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Home)) {
            return false;
        }
        Home home = (Home) obj;
        return TextUtils.equals(this.id, home.id) && TextUtils.equals(this.name, home.name);
    }

    public String getAddr() {
        return this.addr;
    }

    public List<String> getAllDids() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.dids;
        if (list != null) {
            arrayList.addAll(list);
        }
        for (int i = 0; i < this.roomList.size(); i++) {
            Room room = this.roomList.get(i);
            if (room != null && room.getDids() != null) {
                arrayList.addAll(room.getDids());
            }
        }
        return arrayList;
    }

    public String getAutoPageBg() {
        return this.autoPageBg;
    }

    public String getBackground() {
        return this.background;
    }

    public String getBssid() {
        return this.bssid;
    }

    public long getCreate_time() {
        return this.create_time;
    }

    public List<String> getDefDids() {
        return this.status;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<String> getDids() {
        List<String> list = this.status;
        if (list == null || list.size() == 0) {
            return this.dids;
        }
        if (this.dids == null) {
            return this.status;
        }
        UnduplicateList unduplicateList = new UnduplicateList(new CopyOnWriteArrayList());
        unduplicateList.addAll(this.dids);
        unduplicateList.addAll(this.status);
        return unduplicateList;
    }

    public List<String> getDidsExcludeStatus() {
        return this.dids;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLocationId() {
        return this.city_id;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public long getOwnerUid() {
        return this.ownerUid;
    }

    public int getPermitLevel() {
        return this.permitLevel;
    }

    public String getRawName() {
        return this.name;
    }

    public List<Room> getRoomList() {
        return this.roomList;
    }

    public int getShareflag() {
        return this.shareflag;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isManager() {
        return isShareManager() || isOwner();
    }

    public boolean isOwner() {
        return this.shareflag == 0;
    }

    public boolean isShareManager() {
        return this.permitLevel == 9;
    }

    public void merge(Home home) {
        mergeDids(home);
    }

    public void setAddr(String str) {
        this.addr = str;
    }

    public void setAutoPageBg(String str) {
        this.autoPageBg = str;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDids(List<String> list) {
        List<String> list2 = this.dids;
        if (list != list2) {
            list2.clear();
            this.dids.addAll(list);
        }
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLocationId(String str) {
        this.city_id = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwnerUid(long j) {
        this.ownerUid = j;
    }

    public void setRoomList(List<Room> list) {
        this.roomList = list;
    }

    public void setShareflag(int i) {
        this.shareflag = i;
    }

    public void setStatus(List<String> list) {
        this.status = list;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppStateModule.APP_STATE_BACKGROUND, this.background);
            jSONObject.put("smart_room_background", this.autoPageBg);
            jSONObject.put(DeviceTagInterface.ROUTER_BSSID, this.bssid);
            jSONObject.put(JSON_KEY_LOCATIONID, this.city_id);
            jSONObject.put("desc", this.desc);
            jSONObject.put("icon", this.icon);
            jSONObject.put("id", this.id);
            jSONObject.put("latitude", this.latitude);
            jSONObject.put("longitude", this.longitude);
            jSONObject.put(JSON_KEY_ADDRESS, this.addr);
            jSONObject.put("name", this.name);
            jSONObject.put("shareflag", this.shareflag);
            jSONObject.put("uid", this.ownerUid);
            jSONObject.put(MiuiCursorConstants.CREATE_TIME, this.create_time);
            jSONObject.put("permit_level", this.permitLevel);
            if (this.dids != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.dids.size(); i++) {
                    jSONArray.put(this.dids.get(i));
                }
                jSONObject.put("dids", jSONArray);
            }
            if (!TextUtils.isEmpty(this.statusFlag)) {
                jSONObject.put("status", this.statusFlag);
            }
            List<String> list = this.status;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < this.status.size(); i2++) {
                    jSONArray2.put(this.status.get(i2));
                }
                jSONObject.put("status_list", jSONArray2);
            }
            if (this.roomList != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i3 = 0; i3 < this.roomList.size(); i3++) {
                    jSONArray3.put(this.roomList.get(i3).toJSON());
                }
                jSONObject.put("roomlist", jSONArray3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "Home:" + this.id + ":" + this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bssid);
        parcel.writeString(this.desc);
        parcel.writeString(this.icon);
        parcel.writeStringList(this.status);
        parcel.writeString(this.statusFlag);
        parcel.writeString(this.background);
        parcel.writeString(this.autoPageBg);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.shareflag);
        parcel.writeStringList(this.dids);
        parcel.writeTypedList(this.roomList);
        parcel.writeString(this.latitude);
        parcel.writeString(this.longitude);
        parcel.writeString(this.city_id);
        parcel.writeLong(this.ownerUid);
        parcel.writeLong(this.create_time);
        parcel.writeInt(this.permitLevel);
    }

    private Home(Builder builder) {
        this.latitude = "0";
        this.longitude = "0";
        this.city_id = "0";
        this.addr = "";
        this.ownerUid = 0L;
        this.bssid = builder.bssid;
        this.desc = builder.desc;
        this.icon = builder.icon;
        String str = builder.status;
        this.statusFlag = str;
        this.status = "1".equals(str) ? new ArrayList() : null;
        this.background = builder.background;
        this.autoPageBg = builder.autoPageBg;
        this.id = builder.id;
        this.name = builder.name;
        this.shareflag = builder.shareflag;
        this.dids = builder.dids;
        this.roomList = builder.roomList;
        this.city_id = builder.city_id;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.addr = builder.addr;
        this.ownerUid = builder.ownerUid;
        this.create_time = builder.create_time;
        this.permitLevel = builder.permit_level;
    }

    public Home(Parcel parcel) {
        this.latitude = "0";
        this.longitude = "0";
        this.city_id = "0";
        this.addr = "";
        this.ownerUid = 0L;
        this.bssid = parcel.readString();
        this.desc = parcel.readString();
        this.icon = parcel.readString();
        this.status = parcel.createStringArrayList();
        this.statusFlag = parcel.readString();
        this.background = parcel.readString();
        this.autoPageBg = parcel.readString();
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.shareflag = parcel.readInt();
        this.dids = parcel.createStringArrayList();
        this.roomList = parcel.createTypedArrayList(Room.CREATOR);
        this.latitude = parcel.readString();
        this.longitude = parcel.readString();
        this.city_id = parcel.readString();
        this.ownerUid = parcel.readLong();
        this.create_time = parcel.readLong();
        this.permitLevel = parcel.readInt();
    }
}
