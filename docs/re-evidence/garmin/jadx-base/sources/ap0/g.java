package ap0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import v62.a3;
import v62.c7;
import v62.ka;
import v62.v6;
import v62.y2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lap0/g;", "", "Lu4/d;", "icon", "", "nameResourceId", "<init>", "(Ljava/lang/String;ILu4/d;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f11670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f11671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f11672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f11673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f11674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f11675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f11676i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f11677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11678b;

    static {
        s62.a.f157643a.getClass();
        t62.b bVar = t62.b.f162798a;
        g gVar = new g("PAIR_DEVICES", 0, a3.a(bVar), R.string.lbl_pair_devices);
        f11670c = gVar;
        g gVar2 = new g("CALIBRATION", 1, ka.a(bVar), R.string.lbl_calibration);
        f11671d = gVar2;
        g gVar3 = new g("CONNECTION_TYPE", 2, c7.a(bVar), R.string.connection_type_title);
        f11672e = gVar3;
        g gVar4 = new g("TRAVEL_MODE", 3, v6.a(bVar), R.string.lbl_travel_mode);
        f11673f = gVar4;
        g gVar5 = new g("SOFTWARE_UPDATE", 4, y2.a(bVar), R.string.android_notification_title_softwareupdate_failure);
        f11674g = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f11675h = gVarArr;
        f11676i = new w13.c(gVarArr);
    }

    private g(String str, int i14, u4.d dVar, int i15) {
        super(str, i14);
        this.f11677a = dVar;
        this.f11678b = i15;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f11675h.clone();
    }
}
