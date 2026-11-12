package com.garmin.android.apps.connectmobile.consent;

import c22.c3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q92.x;

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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB7\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/d;", "", "", Action.KEY_ATTRIBUTE, "", "titleResId", "Lc22/c3;", "onDemandTitleResId", "Lq92/x;", "consentTypeId", "priority", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILc22/c3;Lq92/x;I)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f32265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f32266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f32267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f32268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f32269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f32270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f32271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f32272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f32273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f32274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ d[] f32275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w13.c f32276r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f32279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f32280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32281e;

    static {
        x xVar = x.DI_CONNECT_UPLOAD;
        d dVar = new d("STORAGE_PROCESSING_CONSENT", 0, "storage_processing_consent", R.string.golf_lbl_storage_processing_consent_title, null, xVar, 0, 4, null);
        f32265g = dVar;
        d dVar2 = new d("DEVICE_UPLOAD", 1, "device_upload_consent", R.string.golf_lbl_device_upload, null, xVar, 1, 4, null);
        f32266h = dVar2;
        d dVar3 = new d("GARMIN_COACH_ADAPTIVE_TRAINING_PLAN", 2, "garmin_coach_adaptive_training_plan_consent", R.string.lbl_adaptive_training_plan, null, x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN, 5, 4, null);
        f32267i = dVar3;
        d dVar4 = new d("INSIGHTS_CONSENT", 3, "insights_consent", R.string.title_insights, null, x.DI_CONNECT_INSIGHTS, 6, 4, null);
        f32268j = dVar4;
        d dVar5 = new d("LIVETRACK_CONSENT", 4, "livetrack_consent", R.string.title_live_track, null, x.DI_CONNECT_LIVETRACK, 7, 4, null);
        f32269k = dVar5;
        d dVar6 = new d("LIVETRACK_STRAVA_BEACON_CONSENT", 5, "livetrack_strava_beacon_consent", R.string.key_strava_beacon, null, x.DI_CONNECT_LIVETRACK_STRAVA_BEACON, 9, 4, null);
        f32270l = dVar6;
        d dVar7 = new d("POPULARITY_ROUTING", 6, "popularity_routing_consent", R.string.popularity_routing, null, x.DI_CONNECT_POPULARITY_ROUTING, 2, 4, null);
        f32271m = dVar7;
        d dVar8 = new d("PRODUCT_IMPROVEMENT_DATA_USAGE", 7, "product_improvement_data_usage_consent", R.string.gdpr_product_improvement, null, x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE, 8, 4, null);
        f32272n = dVar8;
        int i14 = 4;
        d dVar9 = new d("ACTIVE_INTELLIGENCE", 8, "active_intelligence_consent", R.string.active_intelligence, null, x.DI_CONNECT_AI, 3, i14, null);
        f32273o = dVar9;
        d dVar10 = new d("AUTO_DETECT_ACTIVITY", 9, "auto_detect_activity", R.string.lbl_auto_activity_detection, null, x.DI_CONNECT_AUTO_ACTIVITY_DETECTION, i14, 4, null);
        f32274p = dVar10;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
        f32275q = dVarArr;
        f32276r = new w13.c(dVarArr);
        f32264f = new a(null);
    }

    public /* synthetic */ d(String str, int i14, String str2, int i15, c3 c3Var, x xVar, int i16, int i17, j jVar) {
        this(str, i14, str2, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? null : c3Var, xVar, i16);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f32275q.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/d$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private d(String str, int i14, String str2, int i15, c3 c3Var, x xVar, int i16) {
        super(str, i14);
        this.f32277a = str2;
        this.f32278b = i15;
        this.f32279c = c3Var;
        this.f32280d = xVar;
        this.f32281e = i16;
    }
}
