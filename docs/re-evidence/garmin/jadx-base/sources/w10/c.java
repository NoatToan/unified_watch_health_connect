package w10;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lw10/c;", "Landroid/os/Parcelable;", "", "url", "", "params", "appName", "", "dateReceived", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V", "Lxj2/a;", "libraryRequest", "(Lxj2/a;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "b", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "c", "setAppName", "d", "J", "()J", "setDateReceived", "(J)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("params")
    private Map<String, String> params;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appName")
    private String appName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateReceived")
    private long dateReceived;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw10/c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new c(string, linkedHashMap, parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, Map<String, String> map, String str2, long j8) {
        str.getClass();
        map.getClass();
        this.url = str;
        this.params = map;
        this.appName = str2;
        this.dateReceived = j8;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDateReceived() {
        return this.dateReceived;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.url, cVar.url) && s.g(this.params, cVar.params) && s.g(this.appName, cVar.appName) && this.dateReceived == cVar.dateReceived;
    }

    public final Map<String, String> f() {
        return this.params;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final sz0.a h(Context context) {
        context.getClass();
        Uri.Builder builderBuildUpon = Uri.parse(this.url).buildUpon();
        for (Map.Entry<String, String> entry : this.params.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Uri uriBuild = builderBuildUpon.build();
        uriBuild.getClass();
        return new sz0.a(this.dateReceived, sz0.b.a.CONNECT_IQ_OPEN_WEBPAGE_REQUEST, false, context.getString(R.string.connect_iq_open_webpage_request, this.appName, uriBuild.toString()), 2131232004, new Intent("android.intent.action.VIEW", uriBuild));
    }

    public final int hashCode() {
        int iB = j.b(this.params, this.url.hashCode() * 31, 31);
        String str = this.appName;
        return Long.hashCode(this.dateReceived) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.url;
        Map<String, String> map = this.params;
        String str2 = this.appName;
        long j8 = this.dateReceived;
        StringBuilder sb3 = new StringBuilder("OpenWebPageRequest(url=");
        sb3.append(str);
        sb3.append(", params=");
        sb3.append(map);
        sb3.append(", appName=");
        e5.s(j8, str2, ", dateReceived=", sb3);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.url);
        Iterator itU = j.u(this.params, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.appName);
        parcel.writeLong(this.dateReceived);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(xj2.a aVar) {
        this(aVar.f191179a, aVar.f191180b, aVar.f191181c, aVar.f191182d);
        aVar.getClass();
    }
}
