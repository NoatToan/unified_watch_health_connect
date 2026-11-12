package d31;

import b63.u;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.e0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ld31/a;", "", "", "deviceId", "", "deviceRegistrationSortOrder", "", "deviceName", "deviceProductNumber", "sortOrder", "Ld31/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "Ld31/b;", "associationType", "Ld31/c;", "status", "", "coreItem", "Lb63/u;", "reminderDate", "deviceImageUrl", "<init>", "(JILjava/lang/String;Ljava/lang/String;ILd31/d;Ld31/b;Ld31/c;ZLb63/u;Ljava/lang/String;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f57326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f57327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f57328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f57329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f57330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f57331k;

    public a(long j8, int i14, String str, String str2, int i15, d dVar, b bVar, c cVar, boolean z14, u uVar, String str3) {
        dVar.getClass();
        bVar.getClass();
        cVar.getClass();
        this.f57321a = j8;
        this.f57322b = i14;
        this.f57323c = str;
        this.f57324d = str2;
        this.f57325e = i15;
        this.f57326f = dVar;
        this.f57327g = bVar;
        this.f57328h = cVar;
        this.f57329i = z14;
        this.f57330j = uVar;
        this.f57331k = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f57321a == aVar.f57321a && this.f57322b == aVar.f57322b && s.g(this.f57323c, aVar.f57323c) && s.g(this.f57324d, aVar.f57324d) && this.f57325e == aVar.f57325e && this.f57326f == aVar.f57326f && this.f57327g == aVar.f57327g && this.f57328h == aVar.f57328h && this.f57329i == aVar.f57329i && s.g(this.f57330j, aVar.f57330j) && s.g(this.f57331k, aVar.f57331k);
    }

    public final int hashCode() {
        int iD = q2.d(this.f57322b, Long.hashCode(this.f57321a) * 31, 31);
        String str = this.f57323c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57324d;
        int iG = q6.f.g((this.f57328h.hashCode() + ((this.f57327g.hashCode() + ((this.f57326f.hashCode() + q2.d(this.f57325e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31)) * 31)) * 31, 31, this.f57329i);
        u uVar = this.f57330j;
        int iHashCode2 = (iG + (uVar == null ? 0 : uVar.f16216a.hashCode())) * 31;
        String str3 = this.f57331k;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbW = h.w(this.f57322b, "DeviceOnboardingItem(deviceId=", ", deviceRegistrationSortOrder=", this.f57321a);
        sn.a.t(sbW, ", deviceName=", this.f57323c, ", deviceProductNumber=", this.f57324d);
        sbW.append(", sortOrder=");
        sbW.append(this.f57325e);
        sbW.append(", type=");
        sbW.append(this.f57326f);
        sbW.append(", associationType=");
        sbW.append(this.f57327g);
        sbW.append(", status=");
        sbW.append(this.f57328h);
        sbW.append(", coreItem=");
        sbW.append(this.f57329i);
        sbW.append(", reminderDate=");
        sbW.append(this.f57330j);
        return e0.h(sbW, ", deviceImageUrl=", this.f57331k, ")");
    }

    public /* synthetic */ a(long j8, int i14, String str, String str2, int i15, d dVar, b bVar, c cVar, boolean z14, u uVar, String str3, int i16, j jVar) {
        this(j8, i14, str, str2, i15, dVar, bVar, cVar, z14, (i16 & 512) != 0 ? null : uVar, (i16 & 1024) != 0 ? null : str3);
    }
}
