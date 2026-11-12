package xg2;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxg2/i;", "", "", "text", "Lkotlin/Function0;", "", "onClick", "Lxg2/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "loading", "visible", "enabled", "<init>", "(Ljava/lang/String;Le23/a;Lxg2/a;ZZZ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f190968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f190969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f190970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f190971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f190972f;

    public /* synthetic */ i(String str, e23.a aVar, a aVar2, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, aVar, (i14 & 4) != 0 ? a.Secondary : aVar2, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? true : z15, (i14 & 32) != 0 ? true : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f190967a, iVar.f190967a) && s.g(this.f190968b, iVar.f190968b) && this.f190969c == iVar.f190969c && this.f190970d == iVar.f190970d && this.f190971e == iVar.f190971e && this.f190972f == iVar.f190972f;
    }

    public final int hashCode() {
        int iHashCode = this.f190967a.hashCode() * 31;
        e23.a<Unit> aVar = this.f190968b;
        return Boolean.hashCode(this.f190972f) + q6.f.g(q6.f.g((this.f190969c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.f190970d), 31, this.f190971e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverlayButtonConfig(text=");
        sb3.append(this.f190967a);
        sb3.append(", onClick=");
        sb3.append(this.f190968b);
        sb3.append(", type=");
        sb3.append(this.f190969c);
        sb3.append(", loading=");
        sb3.append(this.f190970d);
        sb3.append(", visible=");
        return com.airbnb.lottie.animation.keyframe.a.f(", enabled=", ")", sb3, this.f190971e, this.f190972f);
    }

    public i(String str, e23.a<Unit> aVar, a aVar2, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        aVar2.getClass();
        this.f190967a = str;
        this.f190968b = aVar;
        this.f190969c = aVar2;
        this.f190970d = z14;
        this.f190971e = z15;
        this.f190972f = z16;
    }
}
