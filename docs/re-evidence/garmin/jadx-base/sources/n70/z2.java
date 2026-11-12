package n70;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Ln70/z2;", "", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lf12/l;", "userSettings", "Lpc0/j;", "deviceRepo", "Lic0/b;", "deviceInfoRepository", "Lc22/k;", "appConfigurationDelegate", "Lzd0/i;", "getDeviceConnectionStateUseCase", "Lzd0/b0;", "isStartActivityCapableDevice", "Lda2/i;", "connectedDeviceRegistry", "<init>", "(Lo53/b0;Lf12/l;Lpc0/j;Lic0/b;Lc22/k;Lzd0/i;Lzd0/b0;Lda2/i;)V", "b", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f124801j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f124802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f124803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc0.j f124804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic0.b f124805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c22.k f124806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zd0.i f124807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zd0.b0 f124808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final da2.i f124809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f124810i;

    static {
        new a(null);
    }

    public z2(o53.b0 b0Var, f12.l lVar, pc0.j jVar, ic0.b bVar, c22.k kVar, zd0.i iVar, zd0.b0 b0Var2, da2.i iVar2) {
        b0Var.getClass();
        lVar.getClass();
        jVar.getClass();
        bVar.getClass();
        kVar.getClass();
        iVar.getClass();
        b0Var2.getClass();
        iVar2.getClass();
        this.f124802a = b0Var;
        this.f124803b = lVar;
        this.f124804c = jVar;
        this.f124805d = bVar;
        this.f124806e = kVar;
        this.f124807f = iVar;
        this.f124808g = b0Var2;
        this.f124809h = iVar2;
        this.f124810i = o13.m.b(new y2(this, 0));
    }

    public static final b a(z2 z2Var, sd2.f fVar, ArrayList arrayList, Map map) {
        z2Var.getClass();
        long unitID = fVar.getUnitID();
        String strC = z2Var.f124805d.c(fVar.getApplicationKey());
        if (strC == null && (strC = fVar.getDisplayName()) == null) {
            strC = fVar.getProductDisplayName();
            strC.getClass();
        }
        return new b(unitID, strC, fVar.getImageURL(), arrayList.contains(Long.valueOf(fVar.getUnitID())), (jc0.c) map.get(Long.valueOf(fVar.getUnitID())), z2Var.f124808g.a(fVar));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln70/z2$a;", "", "<init>", "()V", "", "LAST_CONNECTED_RECENT_DAYS_AGO", "I", "DEFAULT_MAX_DEVICES", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln70/z2$b;", "", "", "unitID", "", "name", "imageUrl", "", "connected", "Ljc0/c;", "batteryInfo", "isStartActivityCapable", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLjc0/c;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f124811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f124812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f124813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f124814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final jc0.c f124815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f124816f;

        public /* synthetic */ b(long j8, String str, String str2, boolean z14, jc0.c cVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, str, str2, z14, cVar, (i14 & 32) != 0 ? false : z15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f124811a == bVar.f124811a && p005kotlin.jvm.internal.s.g(this.f124812b, bVar.f124812b) && p005kotlin.jvm.internal.s.g(this.f124813c, bVar.f124813c) && this.f124814d == bVar.f124814d && p005kotlin.jvm.internal.s.g(this.f124815e, bVar.f124815e) && this.f124816f == bVar.f124816f;
        }

        public final int hashCode() {
            int iJ = wr.g.j(Long.hashCode(this.f124811a) * 31, 31, this.f124812b);
            String str = this.f124813c;
            int iG = q6.f.g((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f124814d);
            jc0.c cVar = this.f124815e;
            return Boolean.hashCode(this.f124816f) + ((iG + (cVar != null ? cVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f124811a, "DeviceItem(unitID=", ", name=", this.f124812b);
            com.airbnb.lottie.animation.keyframe.a.t(", imageUrl=", this.f124813c, ", connected=", sbK, this.f124814d);
            sbK.append(", batteryInfo=");
            sbK.append(this.f124815e);
            sbK.append(", isStartActivityCapable=");
            sbK.append(this.f124816f);
            sbK.append(")");
            return sbK.toString();
        }

        public b(long j8, String str, String str2, boolean z14, jc0.c cVar, boolean z15) {
            str.getClass();
            this.f124811a = j8;
            this.f124812b = str;
            this.f124813c = str2;
            this.f124814d = z14;
            this.f124815e = cVar;
            this.f124816f = z15;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z2(o53.b0 b0Var, f12.l lVar, pc0.j jVar, ic0.b bVar, c22.k kVar, zd0.i iVar, zd0.b0 b0Var2, da2.i iVar2, int i14, p005kotlin.jvm.internal.j jVar2) {
        da2.i iVar3;
        if ((i14 & 128) != 0) {
            da2.b bVar2 = da2.d.b().f58886a.f111646e;
            bVar2.getClass();
            iVar3 = bVar2;
        } else {
            iVar3 = iVar2;
        }
        this(b0Var, lVar, jVar, bVar, kVar, iVar, b0Var2, iVar3);
    }
}
