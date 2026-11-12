package tf0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ltf0/l;", "", "", "completed", "loading", "", "messageRes", "Ltf0/l$a;", "errorMessage", "", "Luf0/a;", "epochDevices", "dataRefreshRequired", "<init>", "(ZZLjava/lang/Integer;Ltf0/l$a;Ljava/util/List;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f164453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f164454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<uf0.a> f164455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f164456f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltf0/l$a;", "", "", "title", "message", "<init>", "(II)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f164457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f164458b;

        public a(int i14, int i15) {
            this.f164457a = i14;
            this.f164458b = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f164457a == aVar.f164457a && this.f164458b == aVar.f164458b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f164458b) + (Integer.hashCode(this.f164457a) * 31);
        }

        public final String toString() {
            return am.j.g(this.f164457a, this.f164458b, "ErrorMessage(title=", ", message=", ")");
        }
    }

    public /* synthetic */ l(boolean z14, boolean z15, Integer num, a aVar, List list, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? false : z16);
    }

    public static l a(l lVar, int i14) {
        boolean z14 = lVar.f164451a;
        boolean z15 = lVar.f164452b;
        Integer num = lVar.f164453c;
        a aVar = (i14 & 8) != 0 ? lVar.f164454d : null;
        List<uf0.a> list = (i14 & 16) != 0 ? lVar.f164455e : null;
        boolean z16 = (i14 & 32) != 0 ? lVar.f164456f : false;
        lVar.getClass();
        return new l(z14, z15, num, aVar, list, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f164451a == lVar.f164451a && this.f164452b == lVar.f164452b && s.g(this.f164453c, lVar.f164453c) && s.g(this.f164454d, lVar.f164454d) && s.g(this.f164455e, lVar.f164455e) && this.f164456f == lVar.f164456f;
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f164451a) * 31, 31, this.f164452b);
        Integer num = this.f164453c;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.f164454d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<uf0.a> list = this.f164455e;
        return Boolean.hashCode(this.f164456f) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("EpochReloadUiState(completed=", ", loading=", ", messageRes=", this.f164451a, this.f164452b);
        sbM.append(this.f164453c);
        sbM.append(", errorMessage=");
        sbM.append(this.f164454d);
        sbM.append(", epochDevices=");
        sbM.append(this.f164455e);
        sbM.append(", dataRefreshRequired=");
        sbM.append(this.f164456f);
        sbM.append(")");
        return sbM.toString();
    }

    public l(boolean z14, boolean z15, Integer num, a aVar, List<uf0.a> list, boolean z16) {
        this.f164451a = z14;
        this.f164452b = z15;
        this.f164453c = num;
        this.f164454d = aVar;
        this.f164455e = list;
        this.f164456f = z16;
    }

    public l() {
        this(false, false, null, null, null, false, 63, null);
    }
}
