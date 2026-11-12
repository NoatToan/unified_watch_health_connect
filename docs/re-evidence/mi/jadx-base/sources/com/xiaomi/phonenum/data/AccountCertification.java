package com.xiaomi.phonenum.data;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.phonenum.procedure.AccountPhoneNumberSourceFlag;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class AccountCertification implements Parcelable {
    public static final Parcelable.Creator<AccountCertification> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14011b;
    public final String c;
    public final Source d;

    public interface Getter {
        AccountCertification[] a(Context context, AccountPhoneNumberSourceFlag accountPhoneNumberSourceFlag);
    }

    public class a implements Parcelable.Creator<AccountCertification> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountCertification createFromParcel(Parcel parcel) {
            return new AccountCertification(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccountCertification[] newArray(int i) {
            return new AccountCertification[i];
        }
    }

    public AccountCertification(Parcel parcel) {
        this.f14010a = parcel.readInt();
        this.f14011b = parcel.readString();
        this.c = parcel.readString();
        this.d = (Source) parcel.readParcelable(Source.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccountCertification)) {
            return false;
        }
        AccountCertification accountCertification = (AccountCertification) obj;
        return this.f14010a == accountCertification.f14010a && TextUtils.equals(this.c, accountCertification.c) && TextUtils.equals(this.f14011b, accountCertification.f14011b);
    }

    public String toString() {
        return "AccountCertification{subId=" + this.f14010a + ", hashedPhoneNumber='" + this.f14011b + "', activatorToken=@TOKEN, source=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14010a);
        parcel.writeString(this.f14011b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }

    public static class Source implements Parcelable {
        public static final Parcelable.Creator<Source> CREATOR = new a();
        public static final String SOURCE_TYPE_ACTIVATION = "ACTIVATION";
        public static final String SOURCE_TYPE_CACHE = "CACHE";
        public static final String SOURCE_TYPE_OPERATOR_MOBILE = "MOBILE";
        public static final String SOURCE_TYPE_OPERATOR_TELECOM = "TELECOM";
        public static final String SOURCE_TYPE_OPERATOR_UNICOM = "UNICOM";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14013b;

        public class a implements Parcelable.Creator<Source> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Source createFromParcel(Parcel parcel) {
                return new Source(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Source[] newArray(int i) {
                return new Source[i];
            }
        }

        public Source(String str, String str2) {
            this.f14012a = str;
            this.f14013b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Source{type='" + this.f14012a + "', link='" + this.f14013b + '\'' + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f14012a);
            parcel.writeString(this.f14013b);
        }

        public Source(Parcel parcel) {
            this.f14012a = parcel.readString();
            this.f14013b = parcel.readString();
        }
    }

    public AccountCertification(int i, String str, String str2, Source source) {
        this.f14010a = i;
        this.f14011b = str;
        this.c = str2;
        this.d = source;
    }
}
