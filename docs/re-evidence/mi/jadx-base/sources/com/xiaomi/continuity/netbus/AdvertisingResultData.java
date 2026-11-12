package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvertisingResultData implements Parcelable {
    public static final Parcelable.Creator<AdvertisingResultData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f11192a;

    public class a implements Parcelable.Creator<AdvertisingResultData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AdvertisingResultData createFromParcel(Parcel parcel) {
            return new AdvertisingResultData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AdvertisingResultData[] newArray(int i) {
            return new AdvertisingResultData[i];
        }
    }

    public AdvertisingResultData() {
        this.f11192a = new HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("AdvertisingResultData{mAdvResult=");
        sbA.append(this.f11192a);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f11192a);
    }

    public AdvertisingResultData(Parcel parcel) {
        this.f11192a = new HashMap();
        this.f11192a = parcel.readHashMap(AdvertisingResultData.class.getClassLoader());
    }

    public /* synthetic */ AdvertisingResultData(Parcel parcel, a aVar) {
        this(parcel);
    }
}
