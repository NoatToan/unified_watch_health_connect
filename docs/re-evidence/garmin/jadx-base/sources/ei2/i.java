package ei2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lei2/i;", "", "<init>", "()V", "a", "Lei2/i$a;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class i {
    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private i() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lei2/i$a;", "Lei2/i;", "", "deviceName", "deviceImageUrl", "Lmh2/e;", "deviceConnectionStatus", "macAddress", "deviceCallingAppName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmh2/e;Ljava/lang/String;Ljava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mh2.e f64392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f64393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f64394e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, mh2.e eVar, String str3, String str4) {
            super(null);
            str.getClass();
            str2.getClass();
            eVar.getClass();
            str3.getClass();
            this.f64390a = str;
            this.f64391b = str2;
            this.f64392c = eVar;
            this.f64393d = str3;
            this.f64394e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f64390a, aVar.f64390a) && s.g(this.f64391b, aVar.f64391b) && this.f64392c == aVar.f64392c && s.g(this.f64393d, aVar.f64393d) && s.g(this.f64394e, aVar.f64394e);
        }

        public final int hashCode() {
            int iJ = wr.g.j((this.f64392c.hashCode() + wr.g.j(this.f64390a.hashCode() * 31, 31, this.f64391b)) * 31, 31, this.f64393d);
            String str = this.f64394e;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("DeviceValue(deviceName=", this.f64390a, ", deviceImageUrl=", this.f64391b, ", deviceConnectionStatus=");
            sbI.append(this.f64392c);
            sbI.append(", macAddress=");
            sbI.append(this.f64393d);
            sbI.append(", deviceCallingAppName=");
            return am.j.o(this.f64394e, ")", sbI);
        }

        public /* synthetic */ a(String str, String str2, mh2.e eVar, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, eVar, str3, (i14 & 16) != 0 ? null : str4);
        }
    }
}
