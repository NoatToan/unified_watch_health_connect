package com.huawei.health.h5pro.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.exg;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class H5ProBundle extends exg implements Parcelable {
    public static final Parcelable.Creator<H5ProBundle> CREATOR = new Parcelable.Creator<H5ProBundle>() { // from class: com.huawei.health.h5pro.core.H5ProBundle.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public H5ProBundle[] newArray(int i) {
            return new H5ProBundle[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public H5ProBundle createFromParcel(Parcel parcel) {
            return new H5ProBundle(parcel);
        }
    };
    private static final String MODULE_NAME_DEF = "option";
    private final String moduleName;

    public H5ProBundle() {
        this("option");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ boolean getBoolean(String str) {
        return super.getBoolean(str);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ Map getData() {
        return super.getData();
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ double getDouble(String str) {
        return super.getDouble(str);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ float getFloat(String str) {
        return super.getFloat(str);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ int getInt(String str) {
        return super.getInt(str);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ long getLong(String str) {
        return super.getLong(str);
    }

    public String getModuleName() {
        return this.moduleName;
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ String getString(String str) {
        return super.getString(str);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ void putAll(exg exgVar) {
        super.putAll(exgVar);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ void putBoolean(String str, boolean z) {
        super.putBoolean(str, z);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ void putDouble(String str, double d) {
        super.putDouble(str, d);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ void putFloat(String str, float f) {
        super.putFloat(str, f);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ void putInt(String str, int i) {
        super.putInt(str, i);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ void putLong(String str, long j) {
        super.putLong(str, j);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ void putString(String str, String str2) {
        super.putString(str, str2);
    }

    @Override // defpackage.exg, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.moduleName);
        super.writeToParcel(parcel, i);
    }

    public H5ProBundle(String str) {
        this.moduleName = TextUtils.isEmpty(str) ? "option" : str;
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ boolean getBoolean(String str, boolean z) {
        return super.getBoolean(str, z);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ double getDouble(String str, double d) {
        return super.getDouble(str, d);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ float getFloat(String str, float f) {
        return super.getFloat(str, f);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ int getInt(String str, int i) {
        return super.getInt(str, i);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ long getLong(String str, long j) {
        return super.getLong(str, j);
    }

    @Override // defpackage.exg
    public /* bridge */ /* synthetic */ String getString(String str, String str2) {
        return super.getString(str, str2);
    }

    public H5ProBundle(Parcel parcel) {
        this.moduleName = parcel.readString();
        super.readFromParcel(parcel, H5ProBundle.class.getClassLoader());
    }
}
