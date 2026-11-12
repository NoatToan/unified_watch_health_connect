package com.huawei.harmonyos.interwork.base.bundle;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ApplicationInfo implements Parcelable {
    public static final Parcelable.Creator<ApplicationInfo> CREATOR = new Parcelable.Creator<ApplicationInfo>() { // from class: com.huawei.harmonyos.interwork.base.bundle.ApplicationInfo.4
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ApplicationInfo createFromParcel(Parcel parcel) {
            return new ApplicationInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ApplicationInfo[] newArray(int i) {
            return new ApplicationInfo[i];
        }
    };
    private static final int MAX_LIMIT_SIZE = 1024;
    private String description;
    private int descriptionId;
    private String icon;
    private int iconId;
    private String label;
    private int labelId;
    private List<dam> moduleInfos;
    private String name;
    private List<String> permissions;
    private int supportedModes;
    private Boolean systemApp;

    public ApplicationInfo() {
        this.name = "";
        this.icon = "";
        this.label = "";
        this.description = "";
        this.systemApp = Boolean.FALSE;
        this.supportedModes = 0;
        this.labelId = 0;
        this.iconId = 0;
        this.descriptionId = 0;
        this.permissions = new ArrayList(0);
        this.moduleInfos = new ArrayList(0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDescriptionId() {
        return this.descriptionId;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getIconId() {
        return this.iconId;
    }

    public String getLabel() {
        return this.label;
    }

    public int getLabelId() {
        return this.labelId;
    }

    public List<dam> getModuleInfos() {
        return this.moduleInfos;
    }

    public List<String> getModuleSourceDirs() {
        ArrayList arrayList = new ArrayList();
        Iterator<dam> it = this.moduleInfos.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }

    public int getSupportedModes() {
        return this.supportedModes;
    }

    public Boolean getSystemApp() {
        return this.systemApp;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        parcel.writeString(this.label);
        parcel.writeString(this.description);
        parcel.writeBoolean(this.systemApp.booleanValue());
        parcel.writeInt(this.supportedModes);
        parcel.writeInt(this.iconId);
        parcel.writeInt(this.descriptionId);
        parcel.writeInt(this.labelId);
        parcel.writeInt(this.permissions.size());
        Iterator<String> it = this.permissions.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        parcel.writeInt(this.moduleInfos.size());
        for (dam damVar : this.moduleInfos) {
            parcel.writeString(damVar.b());
            parcel.writeString(damVar.d());
        }
    }

    public ApplicationInfo(ApplicationInfo applicationInfo) {
        this.name = "";
        this.icon = "";
        this.label = "";
        this.description = "";
        this.systemApp = Boolean.FALSE;
        this.supportedModes = 0;
        this.labelId = 0;
        this.iconId = 0;
        this.descriptionId = 0;
        this.permissions = new ArrayList(0);
        this.moduleInfos = new ArrayList(0);
        this.name = applicationInfo.name;
        this.icon = applicationInfo.icon;
        this.label = applicationInfo.label;
        this.description = applicationInfo.description;
        this.permissions = applicationInfo.permissions;
        this.systemApp = applicationInfo.systemApp;
        this.moduleInfos = applicationInfo.moduleInfos;
        this.supportedModes = applicationInfo.supportedModes;
        this.labelId = applicationInfo.labelId;
        this.iconId = applicationInfo.iconId;
        this.descriptionId = applicationInfo.descriptionId;
    }

    public ApplicationInfo(Parcel parcel) {
        this.name = "";
        this.icon = "";
        this.label = "";
        this.description = "";
        this.systemApp = Boolean.FALSE;
        this.supportedModes = 0;
        this.labelId = 0;
        this.iconId = 0;
        this.descriptionId = 0;
        this.permissions = new ArrayList(0);
        this.moduleInfos = new ArrayList(0);
        this.name = parcel.readString();
        this.icon = parcel.readString();
        this.label = parcel.readString();
        this.description = parcel.readString();
        this.systemApp = Boolean.valueOf(parcel.readBoolean());
        this.supportedModes = parcel.readInt();
        this.iconId = parcel.readInt();
        this.descriptionId = parcel.readInt();
        this.labelId = parcel.readInt();
        int i = parcel.readInt();
        if (i > 1024) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.permissions.add(parcel.readString());
        }
        int i3 = parcel.readInt();
        if (i3 > 1024) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.moduleInfos.add(new dam(parcel.readString(), parcel.readString()));
        }
    }
}
