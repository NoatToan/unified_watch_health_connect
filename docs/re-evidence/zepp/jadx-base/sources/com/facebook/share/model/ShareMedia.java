package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ShareMedia implements ShareModel {
    private final Bundle a;

    public static abstract class Builder<M extends ShareMedia, B extends Builder> implements ShareModelBuilder<M, B> {
        private Bundle a = new Bundle();

        public static List<ShareMedia> b(Parcel parcel) {
            Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }

        public static void c(Parcel parcel, int i, List<ShareMedia> list) {
            parcel.writeParcelableArray((ShareMedia[]) list.toArray(), i);
        }

        @Deprecated
        public B setParameter(String str, String str2) {
            this.a.putString(str, str2);
            return this;
        }

        @Deprecated
        public B setParameters(Bundle bundle) {
            this.a.putAll(bundle);
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public B readFrom(M m) {
            return m == null ? this : (B) setParameters(m.getParameters());
        }
    }

    public enum Type {
        PHOTO,
        VIDEO
    }

    public ShareMedia(Builder builder) {
        this.a = new Bundle(builder.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract Type getMediaType();

    @Deprecated
    public Bundle getParameters() {
        return new Bundle(this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public ShareMedia(Parcel parcel) {
        this.a = parcel.readBundle();
    }
}
