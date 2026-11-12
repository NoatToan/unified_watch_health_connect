package com.xiaomi.smarthome.homeroom.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.facebook.react.modules.appstate.AppStateModule;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class Room implements Parcelable {
    public static final Parcelable.Creator<Room> CREATOR = new Parcelable.Creator<Room>() { // from class: com.xiaomi.smarthome.homeroom.model.Room.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Room createFromParcel(Parcel parcel) {
            return new Room(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Room[] newArray(int i) {
            return new Room[i];
        }
    };
    private String background;
    private String bssid;
    private String createTime;
    private String desc;
    private volatile List<String> dids;
    private String icon;
    private String id;
    private String name;
    private String parentid;
    private int shareflag;

    public Room() {
        this.createTime = "";
    }

    private void mergeDids(Room room) {
        if (room == null || room.dids == null || room.dids.isEmpty()) {
            return;
        }
        if (this.dids == null) {
            this.dids = room.dids;
        } else {
            this.dids.addAll(room.dids);
        }
    }

    public static Room parse(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        Room room = new Room();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(DeviceTagInterface.ROUTER_BSSID)) {
                    room.bssid = jSONObject.optString(DeviceTagInterface.ROUTER_BSSID);
                }
                if (!jSONObject.isNull("desc")) {
                    room.desc = jSONObject.optString("desc");
                }
                if (!jSONObject.isNull("id")) {
                    room.id = jSONObject.optString("id");
                }
                if (!jSONObject.isNull("name")) {
                    room.name = jSONObject.optString("name");
                }
                if (!jSONObject.isNull("parentid")) {
                    room.parentid = jSONObject.optString("parentid");
                }
                if (!jSONObject.isNull("shareflag")) {
                    room.shareflag = jSONObject.optInt("shareflag");
                }
                if (!jSONObject.isNull(MiuiCursorConstants.CREATE_TIME)) {
                    room.createTime = jSONObject.optString(MiuiCursorConstants.CREATE_TIME);
                }
                if (!jSONObject.isNull("icon")) {
                    room.icon = jSONObject.optString("icon");
                }
                if (!jSONObject.isNull(AppStateModule.APP_STATE_BACKGROUND)) {
                    room.background = jSONObject.optString(AppStateModule.APP_STATE_BACKGROUND);
                }
                if (!jSONObject.isNull("dids") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("dids")) != null) {
                    room.dids = new UnduplicateList(new CopyOnWriteArrayList());
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        if (!TextUtils.isEmpty(jSONArrayOptJSONArray.optString(i))) {
                            room.dids.add(jSONArrayOptJSONArray.optString(i));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return room;
    }

    public void copyFrom(Room room) {
        this.bssid = room.bssid;
        this.desc = room.desc;
        this.name = room.name;
        this.parentid = room.parentid;
        this.shareflag = room.shareflag;
        this.dids = room.dids;
        this.icon = room.icon;
        this.createTime = room.createTime;
        this.background = room.background;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Room room = (Room) obj;
        return (room.getId() == null || (str = this.id) == null || !str.equalsIgnoreCase(room.getId())) ? false : true;
    }

    public String getBackground() {
        return this.background;
    }

    public String getBssid() {
        return this.bssid;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<String> getDids() {
        if (this.dids == null) {
            this.dids = new UnduplicateList(new CopyOnWriteArrayList());
        }
        return this.dids;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getParentid() {
        return this.parentid;
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

    public void merge(Room room) {
        mergeDids(room);
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDids(List<String> list) {
        if (this.dids == null) {
            this.dids = new UnduplicateList(new CopyOnWriteArrayList());
        }
        if (this.dids != list) {
            this.dids.clear();
            this.dids.addAll(list);
        }
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentid(String str) {
        this.parentid = str;
    }

    public void setShareflag(int i) {
        this.shareflag = i;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeviceTagInterface.ROUTER_BSSID, this.bssid);
            jSONObject.put("desc", this.desc);
            jSONObject.put("id", this.id);
            jSONObject.put("name", this.name);
            jSONObject.put("parentid", this.parentid);
            jSONObject.put("shareflag", this.shareflag);
            jSONObject.put("icon", this.icon);
            jSONObject.put(MiuiCursorConstants.CREATE_TIME, this.createTime);
            jSONObject.put(AppStateModule.APP_STATE_BACKGROUND, this.background);
            if (this.dids != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.dids.size(); i++) {
                    jSONArray.put(this.dids.get(i));
                }
                jSONObject.put("dids", jSONArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bssid);
        parcel.writeString(this.desc);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.parentid);
        parcel.writeInt(this.shareflag);
        parcel.writeStringList(this.dids);
        parcel.writeString(this.icon);
        parcel.writeString(this.createTime);
        parcel.writeString(this.background);
    }

    public Room(String str) {
        this.createTime = "";
        this.name = str;
    }

    public Room(Parcel parcel) {
        this.createTime = "";
        this.bssid = parcel.readString();
        this.desc = parcel.readString();
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.parentid = parcel.readString();
        this.shareflag = parcel.readInt();
        this.dids = parcel.createStringArrayList();
        this.icon = parcel.readString();
        this.createTime = parcel.readString();
        this.background = parcel.readString();
    }
}
