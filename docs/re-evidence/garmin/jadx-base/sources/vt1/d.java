package vt1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvt1/d;", "", "", "displayResId", "", "jsonVal", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f180090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f180091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f180092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f180093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d[] f180094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180095h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180097b;

    static {
        gg0.f fVar = gg0.f.f77132h;
        d dVar = new d("ANY", 0, R.string.lbl_any, fVar.f77147a);
        f180090c = dVar;
        d dVar2 = new d("ROAD_CYCLING", 1, R.string.lbl_road_biking, fVar.f77147a);
        f180091d = dVar2;
        d dVar3 = new d("MOUNTAIN_BIKING", 2, R.string.lbl_mountain_biking, gg0.f.f77134j.f77147a);
        f180092e = dVar3;
        d dVar4 = new d("GRAVEL_CYCLING", 3, R.string.lbl_gravel_cycling, gg0.f.f77133i.f77147a);
        f180093f = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f180094g = dVarArr;
        f180095h = new w13.c(dVarArr);
        new a(null);
    }

    private d(String str, int i14, int i15, String str2) {
        super(str, i14);
        this.f180096a = i15;
        this.f180097b = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f180094g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvt1/d$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
