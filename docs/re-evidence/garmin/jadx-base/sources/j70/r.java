package j70;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.stats.CodePackage;
import f72.b2;
import f72.hd;
import f72.id;
import f72.j2;
import f72.kb;
import f72.rb;
import java.util.List;
import p005kotlin.Metadata;
import v62.d1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lj70/r;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "nameRes", "descriptionRes", "", "Lj70/t;", "interestsRes", "", "canReset", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/util/List;Z)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f97623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f97624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f97625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f97626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f97627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f97628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f97629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f97630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r f97631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r f97632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r f97633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ r[] f97634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w13.c f97635r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<t> f97639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f97640e;

    static {
        s62.a.f157643a.getClass();
        t62.c cVar = t62.c.f162799a;
        r rVar = new r("HEALTH", 0, "HEALTH", R.string.lbl_be_healthy, R.string.lbl_focus_be_healthy_description, p13.x.k(new t(R.string.sleep_lbl_sleep, kb.a(cVar)), new t(R.string.gcm_body_battery_lbl_body_battery, f72.k.a(cVar)), new t(R.string.lbl_steps, rb.a(cVar))), false, 16, null);
        f97624g = rVar;
        int i14 = 16;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = false;
        r rVar2 = new r(CodePackage.FITNESS, 1, CodePackage.FITNESS, R.string.lbl_stay_active, R.string.lbl_focus_stay_active_description, p13.x.k(new t(R.string.sleep_lbl_sleep, kb.a(cVar)), new t(R.string.gcm_body_battery_lbl_body_battery, f72.k.a(cVar)), new t(R.string.lbl_exercise_trends, d1.a(t62.b.f162798a))), z14, i14, jVar);
        f97625h = rVar2;
        r rVar3 = new r("PERFORMANCE", 2, "PERFORMANCE", R.string.lbl_track_my_training, R.string.lbl_focus_track_my_training_description, p13.x.k(new t(R.string.training_readiness, hd.a(cVar)), new t(R.string.lbl_training_status_sentence_case, id.a(cVar))), z14, i14, jVar);
        f97626i = rVar3;
        int i15 = 8;
        List list = null;
        r rVar4 = new r("UNFOCUSED", 3, "UNFOCUSED", R.string.lbl_no_focus, R.string.lbl_focus_unfocused_description, list, z14, i15, jVar);
        f97627j = rVar4;
        r rVar5 = new r("UNFOCUSED_CYCLING", 4, "UNFOCUSED_CYCLING", R.string.lbl_track_my_training, R.string.lbl_focus_track_my_training_description, list, z14, i15, jVar);
        f97628k = rVar5;
        r rVar6 = new r("UNSET", 5, "UNSET", R.string.lbl_focus_unset, 0, list, z14, i15, jVar);
        f97629l = rVar6;
        int i16 = 16;
        p005kotlin.jvm.internal.j jVar2 = null;
        boolean z15 = false;
        r rVar7 = new r("HEALTH_ESSENTIALS", 6, "HEALTH_ESSENTIALS", R.string.lbl_be_healthy, R.string.lbl_focus_be_healthy_description, p13.x.k(new t(R.string.sleep_lbl_sleep, kb.a(cVar)), new t(R.string.gcm_body_battery_lbl_body_battery, f72.k.a(cVar)), new t(R.string.lbl_steps, rb.a(cVar)), new t(R.string.lbl_health_status, b2.a(cVar))), z15, i16, jVar2);
        f97630m = rVar7;
        r rVar8 = new r("FITNESS_ESSENTIALS", 7, "FITNESS_ESSENTIALS", R.string.lbl_stay_active, R.string.lbl_focus_stay_active_description, p13.x.k(new t(R.string.sleep_lbl_sleep, kb.a(cVar)), new t(R.string.gcm_body_battery_lbl_body_battery, f72.k.a(cVar)), new t(R.string.training_readiness, hd.a(cVar)), new t(R.string.lbl_health_status, b2.a(cVar))), z15, i16, jVar2);
        f97631n = rVar8;
        r rVar9 = new r("PERFORMANCE_ESSENTIALS", 8, "PERFORMANCE_ESSENTIALS", R.string.lbl_track_my_training, R.string.lbl_focus_track_my_training_description, p13.x.k(new t(R.string.sleep_lbl_sleep, kb.a(cVar)), new t(R.string.gcm_body_battery_lbl_body_battery, f72.k.a(cVar)), new t(R.string.training_readiness, hd.a(cVar)), new t(R.string.ohrv_status, j2.a(cVar))), z15, i16, jVar2);
        f97632o = rVar9;
        r rVar10 = new r("UNFOCUSED_ESSENTIALS", 9, "UNFOCUSED_ESSENTIALS", R.string.lbl_no_focus, R.string.lbl_focus_unfocused_description, null, z15, 8, jVar2);
        f97633p = rVar10;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10};
        f97634q = rVarArr;
        f97635r = new w13.c(rVarArr);
        f97623f = new a(null);
    }

    public /* synthetic */ r(String str, int i14, String str2, int i15, int i16, List list, boolean z14, int i17, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, i15, i16, (i17 & 8) != 0 ? null : list, (i17 & 16) != 0 ? true : z14);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f97634q.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj70/r$a;", "", "<init>", "()V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static r a(String str) {
            Object next;
            w13.c cVar = r.f97635r;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((r) next).f97636a, str)) {
                    return (r) next;
                }
            }
            next = null;
            return (r) next;
        }

        private a() {
        }
    }

    private r(String str, int i14, String str2, int i15, int i16, List list, boolean z14) {
        super(str, i14);
        this.f97636a = str2;
        this.f97637b = i15;
        this.f97638c = i16;
        this.f97639d = list;
        this.f97640e = z14;
    }
}
