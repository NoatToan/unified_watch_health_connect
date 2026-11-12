package x52;

import com.google.firebase.analytics.FirebaseAnalytics;
import f62.i;
import m52.j;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx52/h;", "", "Lf62/i;", "poolSize", "", FirebaseAnalytics.Param.INDEX, "", "isDefault", "<init>", "(Ljava/lang/String;ILf62/i;IZ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f189116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f189117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f189118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f189119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f189120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f189121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h[] f189122i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f189123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f189124b;

    static {
        Double dValueOf = Double.valueOf(25.0d);
        j jVar = j.f116747g;
        h hVar = new h("TWENTY_FIVE_METERS", 0, new i(dValueOf, jVar), 0, true);
        f189116c = hVar;
        j jVar2 = j.f116748h;
        h hVar2 = new h("TWENTY_FIVE_YARDS", 1, new i(dValueOf, jVar2), 1, false);
        f189117d = hVar2;
        h hVar3 = new h("FIFTY_METERS", 2, new i(Double.valueOf(50.0d), jVar), 2, false);
        f189118e = hVar3;
        Double dValueOf2 = Double.valueOf(33.333333333333336d);
        h hVar4 = new h("THIRTY_THREE_METERS", 3, new i(dValueOf2, jVar), 3, false);
        f189119f = hVar4;
        h hVar5 = new h("THIRTY_THREE_YARDS", 4, new i(dValueOf2, jVar2), 4, false);
        f189120g = hVar5;
        h hVar6 = new h("UNSPECIFIED", 5, new i(null, null), 5, false);
        f189121h = hVar6;
        f189122i = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    private h(String str, int i14, i iVar, int i15, boolean z14) {
        super(str, i14);
        this.f189123a = iVar;
        this.f189124b = z14;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f189122i.clone();
    }
}
