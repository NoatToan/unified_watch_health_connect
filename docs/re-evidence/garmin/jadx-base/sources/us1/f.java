package us1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import f72.f7;
import f72.fe;
import f72.x4;
import p005kotlin.Metadata;
import u62.r1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF7' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lus1/f;", "", "", Action.KEY_ATTRIBUTE, "", "labelStringRes", "Lu4/d;", "iconVector", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILu4/d;)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f172388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f172389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f172390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172391g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f172394c;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    /* JADX INFO: Fake field, exist only in values array */
    f EF7;

    static {
        s62.a.f157643a.getClass();
        t62.c cVar = t62.c.f162799a;
        cVar.getClass();
        f fVar = new f("POINT_OF_INTEREST", 0, "POI", R.string.search_item_type_landmark, k72.a.a(fe.f69560a));
        f fVar2 = new f("CITY", 1, "CITY", R.string.search_item_type_city, x4.a(cVar));
        f fVar3 = new f("PARK", 2, "PARK", R.string.search_item_type_park, f7.a(cVar));
        f fVar4 = new f("GARMIN_TRAIL", 3, "GARMIN_TRAILS", R.string.search_item_type_garmin_trail, r1.a(t62.a.f162797a));
        f172389e = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f172390f = fVarArr;
        f172391g = new w13.c(fVarArr);
        f172388d = new a(null);
    }

    private f(String str, int i14, String str2, int i15, u4.d dVar) {
        super(str, i14);
        this.f172392a = str2;
        this.f172393b = i15;
        this.f172394c = dVar;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f172390f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus1/f$a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
