package ae2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lae2/c;", "", "", "autoStart", "courseSharingEnabled", "spectatorAudio", "spectatorText", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Boolean;", "getAutoStart", "()Ljava/lang/Boolean;", "b", "getCourseSharingEnabled", "c", "getSpectatorAudio", "d", "getSpectatorText", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("autoStart")
    private final Boolean autoStart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseSharingEnabled")
    private final Boolean courseSharingEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spectatorAudio")
    private final Boolean spectatorAudio;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spectatorText")
    private final Boolean spectatorText;

    public /* synthetic */ c(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : bool3, (i14 & 8) != 0 ? null : bool4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.autoStart, cVar.autoStart) && p005kotlin.jvm.internal.s.g(this.courseSharingEnabled, cVar.courseSharingEnabled) && p005kotlin.jvm.internal.s.g(this.spectatorAudio, cVar.spectatorAudio) && p005kotlin.jvm.internal.s.g(this.spectatorText, cVar.spectatorText);
    }

    public final int hashCode() {
        Boolean bool = this.autoStart;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.courseSharingEnabled;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.spectatorAudio;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.spectatorText;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSettingsDTO(autoStart=" + this.autoStart + ", courseSharingEnabled=" + this.courseSharingEnabled + ", spectatorAudio=" + this.spectatorAudio + ", spectatorText=" + this.spectatorText + ")";
    }

    public c(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.autoStart = bool;
        this.courseSharingEnabled = bool2;
        this.spectatorAudio = bool3;
        this.spectatorText = bool4;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}
