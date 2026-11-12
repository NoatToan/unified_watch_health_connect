package com.huawei.hihealth;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hihealth.util.HiJsonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HiSyncOption implements Parcelable {
    public static final Parcelable.Creator<HiSyncOption> CREATOR = new Parcelable.Creator<HiSyncOption>() { // from class: com.huawei.hihealth.HiSyncOption.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HiSyncOption createFromParcel(Parcel parcel) {
            return new HiSyncOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public HiSyncOption[] newArray(int i) {
            return new HiSyncOption[i];
        }
    };
    private String data;
    private boolean isForceSync;
    private int pushAction;
    private String stackTrace;
    private int syncAction;
    private int syncDataArea;
    private int syncDataType;
    private List<Integer> syncDataTypes;
    private long syncEndTime;
    private long syncId;
    private int syncLevel;
    private int syncManual;
    private int syncMethod;
    private int syncModel;
    private int syncScope;
    private long syncStartTime;
    private int syncType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HiSyncOption() {
        this.syncLevel = -1;
    }

    public HiSyncOption(HiSyncOption hiSyncOption, int i) {
        this.syncLevel = -1;
        initData(hiSyncOption, i);
    }

    protected HiSyncOption(Parcel parcel) {
        this.syncLevel = -1;
        this.syncAction = parcel.readInt();
        this.syncMethod = parcel.readInt();
        this.syncScope = parcel.readInt();
        this.syncDataType = parcel.readInt();
        this.syncModel = parcel.readInt();
        this.pushAction = parcel.readInt();
        this.syncManual = parcel.readInt();
        this.syncDataArea = parcel.readInt();
        this.syncStartTime = parcel.readLong();
        this.syncType = parcel.readInt();
        this.data = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.syncDataTypes = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        if (Build.VERSION.SDK_INT >= 29) {
            this.isForceSync = parcel.readBoolean();
        } else {
            this.isForceSync = parcel.readInt() != 0;
        }
        this.syncId = parcel.readLong();
        this.stackTrace = parcel.readString();
        this.syncEndTime = parcel.readLong();
        this.syncLevel = parcel.readInt();
    }

    public long getSyncStartTime() {
        return this.syncStartTime;
    }

    public void setSyncStartTime(long j) {
        this.syncStartTime = j;
    }

    public int getSyncType() {
        return this.syncType;
    }

    public void setSyncType(int i) {
        this.syncType = i;
    }

    public int getSyncAction() {
        return this.syncAction;
    }

    public void setSyncAction(int i) {
        this.syncAction = i;
    }

    public int getSyncMethod() {
        return this.syncMethod;
    }

    public void setSyncMethod(int i) {
        this.syncMethod = i;
    }

    public int getSyncScope() {
        return this.syncScope;
    }

    public void setSyncScope(int i) {
        this.syncScope = i;
    }

    public int getSyncDataType() {
        return this.syncDataType;
    }

    public void setSyncDataType(int i) {
        this.syncDataType = i;
    }

    public int getPushAction() {
        return this.pushAction;
    }

    public void setPushAction(int i) {
        this.pushAction = i;
    }

    public HiUserInfo getUserInfo() {
        String str = this.data;
        if (str == null) {
            return null;
        }
        return (HiUserInfo) HiJsonUtil.d(str, HiUserInfo.class);
    }

    public void setUserInfo(HiUserInfo hiUserInfo) {
        if (hiUserInfo == null) {
            return;
        }
        this.data = HiJsonUtil.d(hiUserInfo);
    }

    public int getSyncModel() {
        return this.syncModel;
    }

    public void setSyncModel(int i) {
        this.syncModel = i;
    }

    public int getSyncManual() {
        return this.syncManual;
    }

    public void setSyncManual(int i) {
        this.syncManual = i;
    }

    public int getSyncDataArea() {
        return this.syncDataArea;
    }

    public void setSyncDataArea(int i) {
        this.syncDataArea = i;
    }

    public List<Integer> getSyncDataTypes() {
        return this.syncDataTypes;
    }

    public void setSyncDataTypes(List<Integer> list) {
        this.syncDataTypes = list;
    }

    public boolean isForceSync() {
        return this.isForceSync;
    }

    public void setForceSync(boolean z) {
        this.isForceSync = z;
    }

    public long getSyncId() {
        return this.syncId;
    }

    public void setSyncId(long j) {
        this.syncId = j;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }

    public void setStackTrace(String str) {
        this.stackTrace = str;
    }

    public long getSyncEndTime() {
        return this.syncEndTime;
    }

    public void setSyncEndTime(long j) {
        this.syncEndTime = j;
    }

    public int getSyncLevel() {
        return this.syncLevel;
    }

    public void setSyncLevel(int i) {
        this.syncLevel = i;
    }

    private void initData(HiSyncOption hiSyncOption, int i) {
        setSyncModel(hiSyncOption.getSyncModel());
        setSyncMethod(hiSyncOption.getSyncMethod());
        setSyncAction(hiSyncOption.getSyncAction());
        setSyncDataType(i);
        setSyncScope(hiSyncOption.getSyncScope());
        setPushAction(hiSyncOption.getPushAction());
        setSyncManual(hiSyncOption.getSyncManual());
        setSyncDataArea(hiSyncOption.getSyncDataArea());
        setSyncType(hiSyncOption.getSyncType());
        setSyncStartTime(hiSyncOption.getSyncStartTime());
        setSyncEndTime(hiSyncOption.getSyncEndTime());
        setSyncLevel(hiSyncOption.getSyncLevel());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.syncAction);
        parcel.writeInt(this.syncMethod);
        parcel.writeInt(this.syncScope);
        parcel.writeInt(this.syncDataType);
        parcel.writeInt(this.syncModel);
        parcel.writeInt(this.pushAction);
        parcel.writeInt(this.syncManual);
        parcel.writeInt(this.syncDataArea);
        parcel.writeLong(this.syncStartTime);
        parcel.writeInt(this.syncType);
        parcel.writeString(this.data);
        List<Integer> list = this.syncDataTypes;
        if (list == null) {
            parcel.writeList(new ArrayList());
        } else {
            parcel.writeList(list);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeBoolean(this.isForceSync);
        } else {
            parcel.writeInt(this.isForceSync ? 1 : 0);
        }
        parcel.writeLong(this.syncId);
        parcel.writeString(this.stackTrace);
        parcel.writeLong(this.syncEndTime);
        parcel.writeInt(this.syncLevel);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HiSyncOption{sAct=");
        stringBuffer.append(this.syncAction);
        stringBuffer.append(",sMtd=").append(this.syncMethod);
        stringBuffer.append(",sScp=").append(this.syncScope);
        stringBuffer.append(",sDtTp=").append(this.syncDataType);
        stringBuffer.append(",sMod=").append(this.syncModel);
        stringBuffer.append(",pushAct=").append(this.pushAction);
        stringBuffer.append(",sStart=").append(this.syncStartTime);
        stringBuffer.append(",sEnd=").append(this.syncEndTime);
        stringBuffer.append(",sTp=").append(this.syncType);
        stringBuffer.append(",sMnl=").append(this.syncManual);
        stringBuffer.append(",sDtArea=").append(this.syncDataArea);
        stringBuffer.append(",sDtTps=").append(this.syncDataTypes);
        stringBuffer.append(",IfSync=").append(this.isForceSync);
        stringBuffer.append(",sId=").append(this.syncId);
        stringBuffer.append(",sLv=").append(this.syncLevel);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public static HiSyncOption getDefaultAutoSyncOption() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(1);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        return hiSyncOption;
    }

    public static HiSyncOption getAutoSyncOption(int i) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(1);
        hiSyncOption.setSyncDataType(i);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        return hiSyncOption;
    }

    public static HiSyncOption getDefaultHealthSyncOption() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(1);
        hiSyncOption.setSyncDataType(10001);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        return hiSyncOption;
    }

    public static HiSyncOption getSyncOption(int i, int i2) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncAction(i);
        hiSyncOption.setSyncDataType(i2);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        return hiSyncOption;
    }
}
