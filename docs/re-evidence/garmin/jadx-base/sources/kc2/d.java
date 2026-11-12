package kc2;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import i3.e5;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lkc2/d;", "Landroid/os/Parcelable;", "", "localeCode", ModelSourceWrapper.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getLocaleCode", "()Ljava/lang/String;", "setLocaleCode", "(Ljava/lang/String;)V", "b", "getModel", "setModel", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("LocaleCode")
    private String localeCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Model")
    private String model;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(String str, String str2, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            String language = Locale.getDefault().getLanguage();
            String country = Locale.getDefault().getCountry();
            country.getClass();
            String upperCase = country.toUpperCase(Locale.ROOT);
            str = zl.a.c(upperCase, language, "_", upperCase);
        }
        if ((i14 & 2) != 0) {
            String str3 = Build.BRAND;
            str3.getClass();
            Locale locale = Locale.ROOT;
            String upperCase2 = str3.toUpperCase(locale);
            upperCase2.getClass();
            String str4 = Build.MODEL;
            str4.getClass();
            String upperCase3 = str4.toUpperCase(locale);
            upperCase3.getClass();
            str2 = e5.g(upperCase2, StringUtils.SPACE, upperCase3);
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.localeCode, dVar.localeCode) && s.g(this.model, dVar.model);
    }

    public final int hashCode() {
        return this.model.hashCode() + (this.localeCode.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("MobileDeviceInfo(localeCode=", this.localeCode, ", model=", this.model, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.localeCode);
        parcel.writeString(this.model);
    }

    public d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.localeCode = str;
        this.model = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
