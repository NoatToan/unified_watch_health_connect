package kw1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import u62.c5;
import u62.f3;
import u62.q4;
import u62.t;
import vt1.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB?\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkw1/h;", "", "", "imageResId", "Lu4/d;", "thumbnail", "nameResId", "Lvt1/o;", "trainingType", "displayOrder", "", "analyticsEvent", "<init>", "(Ljava/lang/String;IILu4/d;ILvt1/o;ILjava/lang/String;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f106969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f106970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f106971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f106972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f106973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f106974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h[] f106975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f106976n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.d f106978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f106979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f106980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f106981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f106982f;

    static {
        s62.a.f157643a.getClass();
        t62.a aVar = t62.a.f162797a;
        h hVar = new h("RUNNING", 0, 2131233204, f3.a(aVar), R.string.lbl_running, o.f180175f, 0, "GarminCoachRunningFocusSelected");
        f106970h = hVar;
        h hVar2 = new h("CYCLING", 1, 2131233202, t.a(aVar), R.string.lbl_cycling, o.f180176g, 1, "GarminCoachCyclingFocusSelected");
        f106971i = hVar2;
        h hVar3 = new h("TRIATHLON", 2, 2131233206, c5.a(aVar), R.string.lbl_triathlon, o.f180178i, 2, "GarminCoachTriathlonFocusSelected");
        f106972j = hVar3;
        h hVar4 = new h("STRENGTH", 3, 2131233205, q4.a(aVar), R.string.lbl_strength, o.f180177h, 4, "GarminCoachStrengthFocusSelected");
        f106973k = hVar4;
        h hVar5 = new h("HEALTH_FITNESS", 4, 2131233203, u62.a.a(aVar), R.string.device_cat_wellness, o.f180181l, 3, "GarminCoachHealthAndFitnessFocusSelected");
        f106974l = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        f106975m = hVarArr;
        f106976n = new w13.c(hVarArr);
        f106969g = new a(null);
    }

    private h(String str, int i14, int i15, u4.d dVar, int i16, o oVar, int i17, String str2) {
        super(str, i14);
        this.f106977a = i15;
        this.f106978b = dVar;
        this.f106979c = i16;
        this.f106980d = oVar;
        this.f106981e = i17;
        this.f106982f = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f106975m.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkw1/h$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
