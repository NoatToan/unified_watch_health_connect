package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdw implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("thumbnailForDevice")
    private String f34955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("alternateDomainName")
    private List<String> f34956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("thumbnailBackground")
    private String f34957c;

    @SerializedName("thumbnailForDeviceSmall")
    private String d;

    @SerializedName("landscapeImages")
    private List<String> e;

    @SerializedName("thumbnailImage")
    private String j;

    public String c() {
        String str;
        if (njy.e(this.f34956b)) {
            str = "";
        } else {
            str = this.f34956b.get(0);
        }
        return str + "/" + this.j;
    }

    public String e() {
        if (TextUtils.isEmpty(this.f34955a)) {
            return "";
        }
        return (njy.e(this.f34956b) ? "" : this.f34956b.get(0)) + "/" + this.f34955a;
    }

    public String a() {
        if (TextUtils.isEmpty(this.d)) {
            return "";
        }
        return (njy.e(this.f34956b) ? "" : this.f34956b.get(0)) + "/" + this.d;
    }

    public String d() {
        if (TextUtils.isEmpty(this.f34957c)) {
            return "";
        }
        return (njy.e(this.f34956b) ? "" : this.f34956b.get(0)) + "/" + this.f34957c;
    }

    public List<String> b() {
        return this.e;
    }

    public String toString() {
        return "PathImageInfo{thumbnailImage='" + this.j + "', thumbnailForDevice=" + this.f34955a + ", thumbnailForDeviceSmall=" + this.d + ", landscapeImage=" + this.e + ", alternateDomainName=" + this.f34956b + ", thumbnailBackground=" + this.f34957c + '}';
    }
}
