package hk1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lhk1/d;", "", "", Action.KEY_ATTRIBUTE, "Lhk1/f;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "nameResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lhk1/f;I)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f84132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f84133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f84134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f84135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f84136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f84137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d[] f84138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f84139k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f84141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84142c;

    static {
        f fVar = f.IMPORT;
        d dVar = new d("WORKOUT_IMPORT", 0, "WORKOUT_IMPORT", fVar, R.string.lbl_training);
        f84133e = dVar;
        f fVar2 = f.EXPORT;
        d dVar2 = new d("ACTIVITY_EXPORT", 1, "ACTIVITY_EXPORT", fVar2, R.string.concept_activities);
        f84134f = dVar2;
        d dVar3 = new d("ACTIVITY_IMPORT", 2, "ACTIVITY_IMPORT", fVar, R.string.concept_activities);
        f84135g = dVar3;
        d dVar4 = new d("MCT_EXPORT", 3, "MCT_EXPORT", fVar2, R.string.pregnancy_womens_health);
        d dVar5 = new d("COURSE_IMPORT", 4, "COURSE_IMPORT", fVar, R.string.concept_courses);
        f84136h = dVar5;
        d dVar6 = new d("HEALTH_EXPORT", 5, "HEALTH_EXPORT", fVar2, R.string.lbl_daily_health_stats);
        d dVar7 = new d("GOLF_EXPORT", 6, "GOLF_EXPORT", fVar2, R.string.golf_data);
        d dVar8 = new d("HISTORICAL_DATA_EXPORT", 7, "HISTORICAL_DATA_EXPORT", fVar2, R.string.historical_data);
        f84137i = dVar8;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        f84138j = dVarArr;
        f84139k = new w13.c(dVarArr);
        f84132d = new a(null);
    }

    private d(String str, int i14, String str2, f fVar, int i15) {
        super(str, i14);
        this.f84140a = str2;
        this.f84141b = fVar;
        this.f84142c = i15;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f84138j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk1/d$a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
