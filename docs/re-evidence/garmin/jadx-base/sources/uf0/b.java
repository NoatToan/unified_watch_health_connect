package uf0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\u0019\u0010\u0017R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\f\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Luf0/b;", "", "", "userProfilePk", "", "calendarDate", "status", "", "Luf0/a;", "devices", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "J", "getUserProfilePk", "()J", "setUserProfilePk", "(J)V", "b", "Ljava/lang/String;", "getCalendarDate", "()Ljava/lang/String;", "setCalendarDate", "(Ljava/lang/String;)V", "c", "setStatus", "d", "Ljava/util/List;", "()Ljava/util/List;", "setDevices", "(Ljava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private String calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private String status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceList")
    private List<uf0.a> devices;

    static {
        new a(null);
    }

    public b(long j8, String str, String str2, List<uf0.a> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.userProfilePk = j8;
        this.calendarDate = str;
        this.status = str2;
        this.devices = list;
    }

    public final List<uf0.a> a() {
        return this.devices;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.userProfilePk == bVar.userProfilePk && s.g(this.calendarDate, bVar.calendarDate) && s.g(this.status, bVar.status) && s.g(this.devices, bVar.devices);
    }

    public final int hashCode() {
        return this.devices.hashCode() + g.j(g.j(Long.hashCode(this.userProfilePk) * 31, 31, this.calendarDate), 31, this.status);
    }

    public final String toString() {
        long j8 = this.userProfilePk;
        String str = this.calendarDate;
        String str2 = this.status;
        List<uf0.a> list = this.devices;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "EpochRequestDTO(userProfilePk=", ", calendarDate=", str);
        sbK.append(", status=");
        sbK.append(str2);
        sbK.append(", devices=");
        sbK.append(list);
        sbK.append(")");
        return sbK.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Luf0/b$a;", "", "<init>", "()V", "", "USER_PROFILE_PK", "Ljava/lang/String;", "CALENDAR_DATE", "STATUS", "DEVICE_LIST", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
