package s00;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/u;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends j {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls00/u$a;", "", "", "title", "message", "", "notificationId", "displayName", "fullName", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f155421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f155422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f155423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f155424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f155425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f155426f;

        public a(String str, String str2, int i14, String str3, String str4, String str5) {
            str.getClass();
            str2.getClass();
            this.f155421a = str;
            this.f155422b = str2;
            this.f155423c = i14;
            this.f155424d = str3;
            this.f155425e = str4;
            this.f155426f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f155421a.equals(aVar.f155421a) && this.f155422b.equals(aVar.f155422b) && this.f155423c == aVar.f155423c && p005kotlin.jvm.internal.s.g(this.f155424d, aVar.f155424d) && p005kotlin.jvm.internal.s.g(this.f155425e, aVar.f155425e) && p005kotlin.jvm.internal.s.g(this.f155426f, aVar.f155426f);
        }

        public final int hashCode() {
            int iD = q2.d(this.f155423c, wr.g.j(this.f155421a.hashCode() * 31, 31, this.f155422b), 31);
            String str = this.f155424d;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f155425e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f155426f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("NotificationData(title=", this.f155421a, ", message=", this.f155422b, ", notificationId=");
            wr.g.t(this.f155423c, ", displayName=", this.f155424d, ", fullName=", sbI);
            return e5.h(sbI, this.f155425e, ", imageUrl=", this.f155426f, ")");
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155427a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.FOLLOW_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.FOLLOW_REQUEST_ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155427a = iArr;
        }
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        a aVar;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        int i14 = b.f155427a[cVar.ordinal()];
        if (i14 == 1) {
            String string = bundle.getString("requestor-name");
            String string2 = garminConnectMobileApp.getString(R.string.follow_request_title);
            string2.getClass();
            String string3 = garminConnectMobileApp.getString(R.string.follow_request_message, string);
            string3.getClass();
            int iD = d(n00.c.FOLLOW_REQUEST);
            String string4 = bundle.getString("requestor-display-name");
            String string5 = bundle.getString("framedProfileImage-url");
            if (string5 == null) {
                string5 = bundle.getString("profileImage-url");
            }
            aVar = new a(string2, string3, iD, string4, string, string5);
        } else {
            if (i14 != 2) {
                return;
            }
            String string6 = bundle.getString("approver-name");
            String string7 = garminConnectMobileApp.getString(R.string.follow_request_accepted_title);
            string7.getClass();
            String string8 = garminConnectMobileApp.getString(R.string.follow_request_accepted_message, string6);
            string8.getClass();
            int iD2 = d(n00.c.FOLLOW_REQUEST_ACCEPTED);
            String string9 = bundle.getString("approver-display-name");
            String string10 = bundle.getString("framedProfileImage-url");
            if (string10 == null) {
                string10 = bundle.getString("profileImage-url");
            }
            aVar = new a(string7, string8, iD2, string9, string6, string10);
        }
        og2.k.z(garminConnectMobileApp, new rk0.g(9, garminConnectMobileApp, aVar), aVar.f155426f);
        ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.FOLLOW_REQUEST, n00.c.FOLLOW_REQUEST_ACCEPTED};
    }
}
