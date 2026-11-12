package v12;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv12/k;", "", "Lv12/a;", "navigationIcon", "", "screenTitle", "description", "", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyOptions", "selectedPrivacyOption", "", "confirmationDialogVisible", "<init>", "(Lv12/a;IILjava/util/List;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f174747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f174748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f174749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<PrivacyType> f174750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PrivacyType f174751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f174752f;

    public /* synthetic */ k(a aVar, int i14, int i15, List list, PrivacyType privacyType, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? a.CLOSE : aVar, i14, i15, list, (i16 & 16) != 0 ? null : privacyType, (i16 & 32) != 0 ? false : z14);
    }

    public static k a(k kVar, PrivacyType privacyType, boolean z14, int i14) {
        a aVar = kVar.f174747a;
        int i15 = kVar.f174748b;
        int i16 = kVar.f174749c;
        List<PrivacyType> list = kVar.f174750d;
        if ((i14 & 16) != 0) {
            privacyType = kVar.f174751e;
        }
        PrivacyType privacyType2 = privacyType;
        if ((i14 & 32) != 0) {
            z14 = kVar.f174752f;
        }
        kVar.getClass();
        aVar.getClass();
        list.getClass();
        return new k(aVar, i15, i16, list, privacyType2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f174747a == kVar.f174747a && this.f174748b == kVar.f174748b && this.f174749c == kVar.f174749c && p005kotlin.jvm.internal.s.g(this.f174750d, kVar.f174750d) && this.f174751e == kVar.f174751e && this.f174752f == kVar.f174752f;
    }

    public final int hashCode() {
        int iB = u0.b(q2.d(this.f174749c, q2.d(this.f174748b, this.f174747a.hashCode() * 31, 31), 31), 31, this.f174750d);
        PrivacyType privacyType = this.f174751e;
        return Boolean.hashCode(this.f174752f) + ((iB + (privacyType == null ? 0 : privacyType.hashCode())) * 31);
    }

    public final String toString() {
        return "State(navigationIcon=" + this.f174747a + ", screenTitle=" + this.f174748b + ", description=" + this.f174749c + ", privacyOptions=" + this.f174750d + ", selectedPrivacyOption=" + this.f174751e + ", confirmationDialogVisible=" + this.f174752f + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(a aVar, int i14, int i15, List<? extends PrivacyType> list, PrivacyType privacyType, boolean z14) {
        aVar.getClass();
        list.getClass();
        this.f174747a = aVar;
        this.f174748b = i14;
        this.f174749c = i15;
        this.f174750d = list;
        this.f174751e = privacyType;
        this.f174752f = z14;
    }
}
