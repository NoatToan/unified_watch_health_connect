package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new a();
    private final Bundle a;

    public static class Builder implements ShareModelBuilder<CameraEffectArguments, Builder> {
        private Bundle a = new Bundle();

        public Builder putArgument(String str, String str2) {
            this.a.putString(str, str2);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public CameraEffectArguments build() {
            return new CameraEffectArguments(this, null);
        }

        public Builder putArgument(String str, String[] strArr) {
            this.a.putStringArray(str, strArr);
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.a.putAll(cameraEffectArguments.a);
            }
            return this;
        }

        public Builder readFrom(Parcel parcel) {
            return readFrom((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }
    }

    public static class a implements Parcelable.Creator<CameraEffectArguments> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    public /* synthetic */ CameraEffectArguments(Builder builder, a aVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Object get(String str) {
        return this.a.get(str);
    }

    @Nullable
    public String getString(String str) {
        return this.a.getString(str);
    }

    @Nullable
    public String[] getStringArray(String str) {
        return this.a.getStringArray(str);
    }

    public Set<String> keySet() {
        return this.a.keySet();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    private CameraEffectArguments(Builder builder) {
        this.a = builder.a;
    }

    public CameraEffectArguments(Parcel parcel) {
        this.a = parcel.readBundle(getClass().getClassLoader());
    }
}
