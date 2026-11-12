package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class AppInviteContent implements ShareModel {

    @Deprecated
    public static final Parcelable.Creator<AppInviteContent> CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Builder.Destination e;

    @Deprecated
    public static class Builder implements ShareModelBuilder<AppInviteContent, Builder> {
        private String a;
        private String b;
        private String c;
        private String d;
        private Destination e;

        @Deprecated
        public enum Destination {
            FACEBOOK("facebook"),
            MESSENGER("messenger");

            private final String name;

            Destination(String str) {
                this.name = str;
            }

            public boolean equalsName(String str) {
                if (str == null) {
                    return false;
                }
                return this.name.equals(str);
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.name;
            }
        }

        private boolean f(String str) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!Character.isDigit(cCharAt) && !Character.isLetter(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    return false;
                }
            }
            return true;
        }

        @Deprecated
        public Builder setApplinkUrl(String str) {
            this.a = str;
            return this;
        }

        @Deprecated
        public Builder setDestination(Destination destination) {
            this.e = destination;
            return this;
        }

        @Deprecated
        public Builder setPreviewImageUrl(String str) {
            this.b = str;
            return this;
        }

        @Deprecated
        public Builder setPromotionDetails(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    throw new IllegalArgumentException("promotionCode cannot be specified without a valid promotionText");
                }
            } else {
                if (str.length() > 80) {
                    throw new IllegalArgumentException("Invalid promotion text, promotionText needs to be between1 and 80 characters long");
                }
                if (!f(str)) {
                    throw new IllegalArgumentException("Invalid promotion text, promotionText can only contain alphanumericcharacters and spaces.");
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.length() > 10) {
                        throw new IllegalArgumentException("Invalid promotion code, promotionCode can be between1 and 10 characters long");
                    }
                    if (!f(str2)) {
                        throw new IllegalArgumentException("Invalid promotion code, promotionCode can only contain alphanumeric characters and spaces.");
                    }
                }
            }
            this.c = str2;
            this.d = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @Deprecated
        public AppInviteContent build() {
            return new AppInviteContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @Deprecated
        public Builder readFrom(AppInviteContent appInviteContent) {
            return appInviteContent == null ? this : setApplinkUrl(appInviteContent.getApplinkUrl()).setPreviewImageUrl(appInviteContent.getPreviewImageUrl()).setPromotionDetails(appInviteContent.getPromotionText(), appInviteContent.getPromotionCode()).setDestination(appInviteContent.getDestination());
        }
    }

    public static class a implements Parcelable.Creator<AppInviteContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppInviteContent createFromParcel(Parcel parcel) {
            return new AppInviteContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppInviteContent[] newArray(int i) {
            return new AppInviteContent[i];
        }
    }

    public /* synthetic */ AppInviteContent(Builder builder, a aVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getApplinkUrl() {
        return this.a;
    }

    @Deprecated
    public Builder.Destination getDestination() {
        Builder.Destination destination = this.e;
        return destination != null ? destination : Builder.Destination.FACEBOOK;
    }

    @Deprecated
    public String getPreviewImageUrl() {
        return this.b;
    }

    @Deprecated
    public String getPromotionCode() {
        return this.c;
    }

    @Deprecated
    public String getPromotionText() {
        return this.d;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeString(this.c);
        parcel.writeString(this.e.toString());
    }

    private AppInviteContent(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    @Deprecated
    public AppInviteContent(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.d = parcel.readString();
        this.c = parcel.readString();
        String string = parcel.readString();
        if (string.length() > 0) {
            this.e = Builder.Destination.valueOf(string);
        } else {
            this.e = Builder.Destination.FACEBOOK;
        }
    }
}
