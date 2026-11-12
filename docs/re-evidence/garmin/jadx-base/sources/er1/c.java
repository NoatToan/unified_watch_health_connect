package er1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, d2 = {"Ler1/c;", "", "", "topDescription", "deviceBackgroundImage", "", "showTime", "description", "deviceFaceImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getTopDescription", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("topDescription")
    private final String topDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceBackgroundImage")
    private final String deviceBackgroundImage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showTime")
    private final Integer showTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceFaceImage")
    private final String deviceFaceImage;

    public /* synthetic */ c(String str, String str2, Integer num, String str3, String str4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceBackgroundImage() {
        return this.deviceBackgroundImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceFaceImage() {
        return this.deviceFaceImage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getShowTime() {
        return this.showTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.topDescription, cVar.topDescription) && s.g(this.deviceBackgroundImage, cVar.deviceBackgroundImage) && s.g(this.showTime, cVar.showTime) && s.g(this.description, cVar.description) && s.g(this.deviceFaceImage, cVar.deviceFaceImage);
    }

    public final int hashCode() {
        String str = this.topDescription;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceBackgroundImage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.showTime;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceFaceImage;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.topDescription;
        String str2 = this.deviceBackgroundImage;
        Integer num = this.showTime;
        String str3 = this.description;
        String str4 = this.deviceFaceImage;
        StringBuilder sbI = p6.b.i("TutorialItem(topDescription=", str, ", deviceBackgroundImage=", str2, ", showTime=");
        p6.b.l(num, ", description=", str3, ", deviceFaceImage=", sbI);
        return am.j.o(str4, ")", sbI);
    }

    public c(String str, String str2, Integer num, String str3, String str4) {
        this.topDescription = str;
        this.deviceBackgroundImage = str2;
        this.showTime = num;
        this.description = str3;
        this.deviceFaceImage = str4;
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }
}
