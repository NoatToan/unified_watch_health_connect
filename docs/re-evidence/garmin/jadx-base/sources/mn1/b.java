package mn1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmn1/b;", "", "", "cardTitleResId", "detailsTitleResId", "<init>", "(Ljava/lang/String;III)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f119758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f119759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f119760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f119761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f119762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f119763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f119764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f119765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b[] f119766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f119767k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119768a;

    static {
        b bVar = new b("DURATION", 0, R.string.txt_duration, 0, 2, null);
        f119758b = bVar;
        b bVar2 = new b("STRESS", 1, R.string.title_stress, R.string.lbl_sleep_time_stress);
        f119759c = bVar2;
        j jVar = null;
        int i14 = 2;
        b bVar3 = new b("DEEP", i14, R.string.sleep_lbl_deep, 0, 2, jVar);
        f119760d = bVar3;
        b bVar4 = new b("LIGHT", 3, R.string.sleep_lbl_light, 0, i14, null);
        f119761e = bVar4;
        b bVar5 = new b("REM", 4, R.string.sleep_lbl_rem, 0, 2, null);
        f119762f = bVar5;
        b bVar6 = new b("AWAKE", 5, R.string.lbl_awake_time, 0, 2, null);
        f119763g = bVar6;
        b bVar7 = new b("RESTLESSNESS", 6, R.string.lbl_restlessness, 0, 2, jVar);
        f119764h = bVar7;
        b bVar8 = new b("AWAKE_RESTLESSNESS", 7, R.string.lbl_awake_restlessness, 0, 2, null);
        f119765i = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        f119766j = bVarArr;
        f119767k = new w13.c(bVarArr);
    }

    public /* synthetic */ b(String str, int i14, int i15, int i16, int i17, j jVar) {
        this(str, i14, i15, (i17 & 2) != 0 ? i15 : i16);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f119766j.clone();
    }

    private b(String str, int i14, int i15, int i16) {
        super(str, i14);
        this.f119768a = i15;
    }
}
