package pu0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpu0/j;", "", "", "jsonValue", "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f141276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f141277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f141278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f141279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f141280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f141281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j[] f141282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f141283j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f141285b;

    static {
        j jVar = new j("Unknown", 0, "UNKNOWN", null, 2, null);
        f141277d = jVar;
        j jVar2 = new j("OptIn", 1, "OPTIN", null, 2, null);
        f141278e = jVar2;
        Integer numValueOf = Integer.valueOf(R.string.lbl_opted_out);
        j jVar3 = new j("OptOut", 2, "OPTOUT", numValueOf);
        f141279f = jVar3;
        j jVar4 = new j("OptOutSms", 3, "OPTOUTSMS", numValueOf);
        f141280g = jVar4;
        j jVar5 = new j("AdminOptOut", 4, "ADMINOPTOUT", numValueOf);
        f141281h = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        f141282i = jVarArr;
        f141283j = new w13.c(jVarArr);
        f141276c = new a(null);
    }

    public /* synthetic */ j(String str, int i14, String str2, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, (i15 & 2) != 0 ? null : num);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f141282i.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpu0/j$a;", "", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private j(String str, int i14, String str2, Integer num) {
        super(str, i14);
        this.f141284a = str2;
        this.f141285b = num;
    }
}
