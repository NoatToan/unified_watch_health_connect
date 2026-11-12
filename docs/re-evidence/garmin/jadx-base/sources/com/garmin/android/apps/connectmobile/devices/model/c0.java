package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB%\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/c0;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/devices/model/b0;", "dataTypeList", "", "watchFaceColorChoice", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends s1 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f34121d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends b0> f34122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34123b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(b0.valueOf(parcel.readString()));
                }
                arrayList = arrayList2;
            }
            return new c0(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        f34120c = "dataTypeList";
        f34121d = TtmlNode.ATTR_TTS_COLOR;
    }

    public /* synthetic */ c0(List list, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : str);
    }

    public final JSONObject C() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<? extends b0> list = this.f34122a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((b0) it.next()).name());
            }
        }
        jSONObject.put(f34120c, jSONArray);
        jSONObject.put(f34121d, this.f34123b);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(f34120c);
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    try {
                        String string = jSONArray.getString(i14);
                        string.getClass();
                        arrayList.add(b0.valueOf(string));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                this.f34122a = arrayList;
            }
            this.f34123b = jSONObject.optString(f34121d);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<? extends b0> list = this.f34122a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeString(((b0) itO.next()).name());
            }
        }
        parcel.writeString(this.f34123b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/c0$a;", "", "<init>", "()V", "", "DATA_TYPE_LIST", "Ljava/lang/String;", "COLOR", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public c0(List<? extends b0> list, String str) {
        this.f34122a = list;
        this.f34123b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
