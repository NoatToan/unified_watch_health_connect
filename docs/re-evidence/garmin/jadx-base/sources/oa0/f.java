package oa0;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j90.o;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Loa0/f;", "", "Loa0/e$b;", "title", "Loa0/e$a;", TtmlNode.LEFT, TtmlNode.RIGHT, "Lc22/c3;", "actionLabel", "<init>", "(Ljava/lang/String;ILoa0/e$b;Loa0/e$a;Loa0/e$a;Lc22/c3;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f131056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f131057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f131058g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.b f131059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.a f131060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.a f131061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3 f131062d;

    static {
        e.b bVar = new e.b(c22.i.b(R.string.device_wear_wrist));
        o oVar = o.LEFT_WRIST;
        e.a aVar = new e.a(oVar.f97855b, oVar, null);
        o oVar2 = o.RIGHT_WRIST;
        f fVar = new f("WRIST", 0, bVar, aVar, new e.a(oVar2.f97855b, oVar2, null), c22.i.b(R.string.msg_plan_to_wear_on_arm));
        f131056e = fVar;
        e.b bVar2 = new e.b(c22.i.b(R.string.device_wear_arm));
        o oVar3 = o.LEFT_UPPER_ARM;
        e.a aVar2 = new e.a(oVar3.f97855b, oVar3, null);
        o oVar4 = o.RIGHT_UPPER_ARM;
        f fVar2 = new f("ARM", 1, bVar2, aVar2, new e.a(oVar4.f97855b, oVar4, null), c22.i.b(R.string.msg_plan_to_wear_on_wrist));
        f131057f = fVar2;
        f131058g = new f[]{fVar, fVar2};
    }

    private f(String str, int i14, e.b bVar, e.a aVar, e.a aVar2, c3 c3Var) {
        super(str, i14);
        this.f131059a = bVar;
        this.f131060b = aVar;
        this.f131061c = aVar2;
        this.f131062d = c3Var;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f131058g.clone();
    }
}
