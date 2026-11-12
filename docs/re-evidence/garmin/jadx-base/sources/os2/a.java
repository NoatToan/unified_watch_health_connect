package os2;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import o2.c;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("productNumber")
    @Expose
    public Integer f133554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("minAndroidVersionCode")
    @Expose
    public Integer f133555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("minFirmwareVersion")
    @Expose
    public Integer f133556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("unapprovedCardNetworks")
    @Expose
    public List<String> f133557d = null;

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RestrictedDevice{productNumber=");
        sb3.append(this.f133554a);
        sb3.append(", minAndroidVersionCode=");
        sb3.append(this.f133555b);
        sb3.append(", minFirmwareVersion=");
        sb3.append(this.f133556c);
        sb3.append(", unapprovedCardNetworks=");
        return c.d(CoreConstants.CURLY_RIGHT, this.f133557d, sb3);
    }
}
