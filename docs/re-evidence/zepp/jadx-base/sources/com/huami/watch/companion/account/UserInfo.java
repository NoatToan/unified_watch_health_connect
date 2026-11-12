package com.huami.watch.companion.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.common.SyncState;
import com.huami.watch.transport.SafeParcelable;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Calendar;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class UserInfo implements SafeParcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() { // from class: com.huami.watch.companion.account.UserInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    };
    private static final String TAG = "UserInfo";

    @SerializedName(WebAPI.PARAM_SHARE_INVITE_AVATAR)
    private String avatar;

    @SerializedName("avatarLocalUri")
    private String avatarLocalUri;

    @SerializedName("birthday")
    private Birthday birthday;

    @SerializedName("cloudSyncState")
    private SyncState cloudSyncState;

    @SerializedName("country")
    private String country;

    @SerializedName("gender")
    private int gender;

    @SerializedName("height")
    private int height;
    private long lastUpdateTime;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("watchSyncState")
    private SyncState watchSyncState;

    @SerializedName("weight")
    private float weight;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarLocalUri() {
        return this.avatarLocalUri;
    }

    public Birthday getBirthday() {
        return this.birthday;
    }

    public String getCountry() {
        return this.country;
    }

    public int getGender() {
        return this.gender;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getNickname() {
        return this.nickname;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean isCloudNeedSync() {
        return this.cloudSyncState.isNeedSync();
    }

    public boolean isCloudSynced() {
        return this.cloudSyncState.isSynced();
    }

    public boolean isWatchNeedSync() {
        return this.watchSyncState.isNeedSync();
    }

    public boolean isWatchSynced() {
        return this.watchSyncState.isSynced();
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarLocalUri(String str) {
        this.avatarLocalUri = str;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public void setCloudNeedSync() {
        this.cloudSyncState.setNeedSync();
    }

    public void setCloudSynced() {
        this.cloudSyncState.setSynced();
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setWatchNeedSync() {
        this.watchSyncState.setNeedSync();
    }

    public void setWatchSynced() {
        this.watchSyncState.setSynced();
    }

    public void setWeight(float f) {
        this.weight = f;
    }

    public String toString() {
        return super.toString() + " : <Nickname : " + this.nickname + ", Avatar : " + this.avatar + ", AvatarLocalUri : " + this.avatarLocalUri + ", Gender : " + this.gender + ", Height : " + this.height + ", Weight : " + this.weight + ", Birthday : " + this.birthday + ", Country : " + this.country + ", LastUpdateTime : " + this.lastUpdateTime + ", CloudSyncState : " + this.cloudSyncState + ", WatchSyncState : " + this.watchSyncState + SearchCriteria.GT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gender);
        parcel.writeString(this.nickname);
        parcel.writeInt(this.birthday.getYear());
        parcel.writeInt(this.birthday.getMonth());
        parcel.writeInt(this.height);
        parcel.writeFloat(this.weight);
    }

    public UserInfo() {
        this.gender = -1;
        this.nickname = null;
        this.birthday = new Birthday();
        this.height = -1;
        this.weight = -1.0f;
        this.cloudSyncState = new SyncState();
        this.watchSyncState = new SyncState();
    }

    public static class Birthday {

        @SerializedName("month")
        private int month;

        @SerializedName("year")
        private int year;

        public Birthday() {
            this.year = -1;
            this.month = -1;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Birthday)) {
                return false;
            }
            Birthday birthday = (Birthday) obj;
            return birthday.getYear() == this.year && birthday.getMonth() == this.month;
        }

        public String format() {
            return this.year + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.month;
        }

        public int getAge() {
            if (this.year == -1) {
                return 0;
            }
            Calendar calendar = Calendar.getInstance();
            return (calendar.get(1) - this.year) + ((calendar.get(2) + 1) - this.month <= 0 ? -1 : 0);
        }

        public int getMonth() {
            return this.month;
        }

        public int getYear() {
            return this.year;
        }

        public boolean isEmpty() {
            return this.year == -1 || this.month == -1;
        }

        public void setMonth(int i) {
            this.month = i;
        }

        public void setYear(int i) {
            this.year = i;
        }

        public String toString() {
            return "<Year : " + this.year + ", Month : " + this.month + SearchCriteria.GT;
        }

        public Birthday(String str) {
            this();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            Log.d("UserInfo", "Split Birthday : " + Arrays.toString(strArrSplit), new Object[0]);
            try {
                this.year = Integer.valueOf(strArrSplit[0]).intValue();
                this.month = Integer.valueOf(strArrSplit[1]).intValue();
            } catch (Exception e) {
                Log.w("UserInfo", "Parse Birthday Error!!", e, new Object[0]);
                this.year = -1;
                this.month = -1;
            }
        }
    }

    private UserInfo(Parcel parcel) {
        this.gender = parcel.readInt();
        this.nickname = parcel.readString();
        Birthday birthday = new Birthday();
        this.birthday = birthday;
        birthday.setYear(parcel.readInt());
        this.birthday.setMonth(parcel.readInt());
        this.height = parcel.readInt();
        this.weight = parcel.readFloat();
    }
}
