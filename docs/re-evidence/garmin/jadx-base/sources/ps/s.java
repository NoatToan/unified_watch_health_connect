package ps;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lps/s;", "", "", "videoUrl", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getVideoUrl", "()Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videoUrl")
    private final String videoUrl;

    public /* synthetic */ s(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && p005kotlin.jvm.internal.s.g(this.videoUrl, ((s) obj).videoUrl);
    }

    public final int hashCode() {
        String str = this.videoUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return am.j.m("ActivityVideoMetadataDTO(videoUrl=", this.videoUrl, ")");
    }

    public s(String str) {
        this.videoUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
