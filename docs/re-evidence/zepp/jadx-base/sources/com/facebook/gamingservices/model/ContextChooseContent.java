package com.facebook.gamingservices.model;

import android.os.Parcel;
import androidx.annotation.Nullable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ContextChooseContent implements ShareModel {

    @Nullable
    private final List<String> a;

    @Nullable
    private final Integer b;

    @Nullable
    private final Integer c;

    public static class Builder implements ShareModelBuilder<ContextChooseContent, Builder> {

        @Nullable
        private List<String> a;

        @Nullable
        private Integer b;

        @Nullable
        private Integer c;

        public Builder d(Parcel parcel) {
            return readFrom((ContextChooseContent) parcel.readParcelable(ContextChooseContent.class.getClassLoader()));
        }

        public Builder setFilters(@Nullable List<String> list) {
            this.a = list;
            return this;
        }

        public Builder setMaxSize(@Nullable Integer num) {
            this.b = num;
            return this;
        }

        public Builder setMinSize(@Nullable Integer num) {
            this.c = num;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ContextChooseContent build() {
            return new ContextChooseContent(this);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextChooseContent contextChooseContent) {
            return contextChooseContent == null ? this : setFilters(contextChooseContent.getFilters()).setMaxSize(contextChooseContent.getMaxSize()).setMinSize(contextChooseContent.getMinSize());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public List<String> getFilters() {
        List<String> list = this.a;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    @Nullable
    public Integer getMaxSize() {
        return this.b;
    }

    @Nullable
    public Integer getMinSize() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b.intValue());
        parcel.writeInt(this.c.intValue());
    }

    private ContextChooseContent(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public ContextChooseContent(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = Integer.valueOf(parcel.readInt());
        this.c = Integer.valueOf(parcel.readInt());
    }
}
