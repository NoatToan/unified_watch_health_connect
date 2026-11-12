package com.garmin.device.ciq.http.requests.oauth;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d53.u;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 42\u00020\u0001:\u00015Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012By\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010 R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/garmin/device/ciq/http/requests/oauth/ConnectIQOAuthRequest;", "Landroid/os/Parcelable;", "", "deviceId", "", "macAddress", "dateReceived", "appName", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "storeId", "url", "resultUrl", "", "resultType", "", "resultKeys", "<init>", "(JLjava/lang/String;JLjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "initialUrl", "initialQueryParams", "(JLjava/lang/String;JLjava/lang/String;[B[BLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/util/Map;)V", "", "isResultUrl", "(Ljava/lang/String;)Z", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "J", "getDeviceId", "()J", "Ljava/lang/String;", "getMacAddress", "()Ljava/lang/String;", "getDateReceived", "getAppName", "[B", "getAppId", "()[B", "getStoreId", "getUrl", "getResultUrl", "I", "getResultType", "Ljava/util/Map;", "getResultKeys", "()Ljava/util/Map;", "Companion", "a", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectIQOAuthRequest implements Parcelable {
    private final byte[] appId;
    private final String appName;
    private final long dateReceived;
    private final long deviceId;
    private final String macAddress;
    private final Map<String, String> resultKeys;
    private final int resultType;
    private final String resultUrl;
    private final byte[] storeId;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConnectIQOAuthRequest> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ConnectIQOAuthRequest> {
        @Override // android.os.Parcelable.Creator
        public final ConnectIQOAuthRequest createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            long j14 = parcel.readLong();
            String string2 = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new ConnectIQOAuthRequest(j8, string, j14, string2, bArrCreateByteArray, bArrCreateByteArray2, string3, string4, i14, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ConnectIQOAuthRequest[] newArray(int i14) {
            return new ConnectIQOAuthRequest[i14];
        }
    }

    public ConnectIQOAuthRequest(long j8, String str, long j14, String str2, byte[] bArr, byte[] bArr2, String str3, Map<String, String> map, String str4, int i14, Map<String, String> map2) {
        String string;
        str.getClass();
        str2.getClass();
        bArr.getClass();
        bArr2.getClass();
        str3.getClass();
        map.getClass();
        str4.getClass();
        map2.getClass();
        INSTANCE.getClass();
        try {
            StringBuilder sb3 = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (sb3.length() == 0) {
                    sb3.append(CallerData.NA);
                } else {
                    sb3.append("&");
                }
                sb3.append(URLEncoder.encode(key, "UTF-8"));
                sb3.append("=");
                sb3.append(URLEncoder.encode(value, "UTF-8"));
            }
            string = sb3.toString();
        } catch (Exception unused) {
            string = "";
        }
        this(j8, str, j14, str2, bArr, bArr2, str3.concat(string), str4, i14, map2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final byte[] getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final long getDateReceived() {
        return this.dateReceived;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final Map<String, String> getResultKeys() {
        return this.resultKeys;
    }

    public final int getResultType() {
        return this.resultType;
    }

    public final String getResultUrl() {
        return this.resultUrl;
    }

    public final byte[] getStoreId() {
        return this.storeId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isResultUrl(String url) {
        url.getClass();
        return u.y(url, this.resultUrl, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.deviceId);
        dest.writeString(this.macAddress);
        dest.writeLong(this.dateReceived);
        dest.writeString(this.appName);
        dest.writeByteArray(this.appId);
        dest.writeByteArray(this.storeId);
        dest.writeString(this.url);
        dest.writeString(this.resultUrl);
        dest.writeInt(this.resultType);
        Iterator itU = j.u(this.resultKeys, dest);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/ciq/http/requests/oauth/ConnectIQOAuthRequest$a;", "", "<init>", "()V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public ConnectIQOAuthRequest(long j8, String str, long j14, String str2, byte[] bArr, byte[] bArr2, String str3, String str4, int i14, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        bArr.getClass();
        bArr2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        this.deviceId = j8;
        this.macAddress = str;
        this.dateReceived = j14;
        this.appName = str2;
        this.appId = bArr;
        this.storeId = bArr2;
        this.url = str3;
        this.resultUrl = str4;
        this.resultType = i14;
        this.resultKeys = map;
    }
}
