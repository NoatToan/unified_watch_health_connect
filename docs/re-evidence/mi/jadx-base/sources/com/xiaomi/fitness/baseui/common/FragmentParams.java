package com.xiaomi.fitness.baseui.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class FragmentParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<FragmentParams> CREATOR = new a();
    private boolean backAble;
    private Bundle bundle;
    private String className;
    private boolean isResizeMode;

    public class a implements Parcelable.Creator<FragmentParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentParams createFromParcel(Parcel parcel) {
            return new FragmentParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentParams[] newArray(int i) {
            return new FragmentParams[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f11641a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11642b = true;
        public String c = null;
        public boolean d;

        public b a(boolean z) {
            this.f11642b = z;
            return this;
        }

        public FragmentParams b() {
            return new FragmentParams(this.c, this.f11641a, this.f11642b, this.d);
        }

        public b c(Bundle bundle) {
            this.f11641a = bundle;
            if (bundle != null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }

        public b e(@NotNull Class cls) {
            this.c = cls.getName();
            return this;
        }

        public b f(boolean z) {
            this.d = z;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public String getClassName() {
        return this.className;
    }

    public boolean isBackAble() {
        return this.backAble;
    }

    public boolean isResizeMode() {
        return this.isResizeMode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.backAble ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.bundle);
        parcel.writeString(this.className);
        parcel.writeByte(this.isResizeMode ? (byte) 1 : (byte) 0);
    }

    private FragmentParams(String str, Bundle bundle, boolean z, boolean z2) {
        this.className = str;
        this.bundle = bundle;
        this.backAble = z;
        this.isResizeMode = z2;
    }

    private FragmentParams(Parcel parcel) {
        this.backAble = parcel.readByte() != 0;
        this.bundle = parcel.readBundle(getClass().getClassLoader());
        this.className = parcel.readString();
        this.isResizeMode = parcel.readByte() != 0;
    }
}
