package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class h extends s1 implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f48181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48182b;

    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        EN(1, "en"),
        /* JADX INFO: Fake field, exist only in values array */
        FR(2, "fr"),
        /* JADX INFO: Fake field, exist only in values array */
        DE(35, "de"),
        /* JADX INFO: Fake field, exist only in values array */
        IT(74, "it"),
        /* JADX INFO: Fake field, exist only in values array */
        JA(76, "ja"),
        /* JADX INFO: Fake field, exist only in values array */
        ES(149, "es"),
        /* JADX INFO: Fake field, exist only in values array */
        ZH_CN(186, "zh_CN"),
        /* JADX INFO: Fake field, exist only in values array */
        ZH_TW(187, "zh_TW");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48184a;

        b(long j8, String str) {
            this.f48184a = j8;
        }
    }

    public h(Parcel parcel) {
        b bVar;
        long j8 = parcel.readLong();
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i14];
            if (j8 == bVar.f48184a) {
                break;
            } else {
                i14++;
            }
        }
        this.f48181a = bVar;
        this.f48182b = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong(TtmlNode.ATTR_ID);
        for (b bVar : b.values()) {
            if (jOptLong == bVar.f48184a) {
                this.f48181a = bVar;
                this.f48182b = jSONObject.optBoolean("isSupported");
            }
        }
        bVar = null;
        this.f48181a = bVar;
        this.f48182b = jSONObject.optBoolean("isSupported");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        b bVar = this.f48181a;
        parcel.writeLong(bVar == null ? -1L : bVar.f48184a);
        parcel.writeByte(this.f48182b ? (byte) 1 : (byte) 0);
    }

    public h() {
    }
}
