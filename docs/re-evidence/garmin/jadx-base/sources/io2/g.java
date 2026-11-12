package io2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lio2/g;", "Landroid/os/Parcelable;", "", "locale", "deviceIpAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getLocale", "()Ljava/lang/String;", "b", "getDeviceIpAddress", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceIpAddress")
    private final String deviceIpAddress;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(String str, String str2, int i14, j jVar) {
        str = (i14 & 1) != 0 ? e5.g(Locale.getDefault().getLanguage(), "-", Locale.getDefault().getCountry()) : str;
        if ((i14 & 2) != 0) {
            wr2.b.f186831a.getClass();
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (inetAddressNextElement.isLoopbackAddress() || (!(inetAddressNextElement instanceof Inet4Address) && !(inetAddressNextElement instanceof Inet6Address))) {
                        }
                        str2 = inetAddressNextElement.getHostAddress();
                    }
                }
            } catch (SocketException e4) {
                e4.printStackTrace();
            }
            str2 = null;
        }
        this(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.locale, gVar.locale) && s.g(this.deviceIpAddress, gVar.deviceIpAddress);
    }

    public final int hashCode() {
        int iHashCode = this.locale.hashCode() * 31;
        String str = this.deviceIpAddress;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("PushProvRiskData(locale=", this.locale, ", deviceIpAddress=", this.deviceIpAddress, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.locale);
        parcel.writeString(this.deviceIpAddress);
    }

    public g(String str, String str2) {
        str.getClass();
        this.locale = str;
        this.deviceIpAddress = str2;
    }

    public g() {
        this(null, null, 3, null);
    }
}
