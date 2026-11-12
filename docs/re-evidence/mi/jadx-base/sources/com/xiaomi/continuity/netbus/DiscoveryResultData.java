package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DiscoveryResultData implements Parcelable {
    public static final Parcelable.Creator<DiscoveryResultData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f11213a;

    public class a implements Parcelable.Creator<DiscoveryResultData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DiscoveryResultData createFromParcel(Parcel parcel) {
            return new DiscoveryResultData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DiscoveryResultData[] newArray(int i) {
            return new DiscoveryResultData[i];
        }
    }

    public DiscoveryResultData() {
        this.f11213a = new HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("DiscoveryResultData{mDiscResult=");
        sbA.append(this.f11213a);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f11213a);
    }

    public DiscoveryResultData(Parcel parcel) {
        this.f11213a = new HashMap();
        this.f11213a = parcel.readHashMap(DiscoveryResultData.class.getClassLoader());
    }

    public /* synthetic */ DiscoveryResultData(Parcel parcel, a aVar) {
        this(parcel);
    }
}
