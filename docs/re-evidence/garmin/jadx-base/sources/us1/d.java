package us1;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lus1/d;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "Lus1/l;", "trailSuggestionType", "<init>", "(Ljava/lang/String;IILus1/l;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f172374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f172375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f172376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f172377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d[] f172378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172379h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f172380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f172381b;

    /* JADX INFO: Fake field, exist only in values array */
    d EF2;

    /* JADX INFO: Fake field, exist only in values array */
    d EF3;

    static {
        d dVar = new d("DESCRIPTION_MISSING_INFO", 0, R.string.trails_report_issue_selection_description_option, null, 2, null);
        f172374c = dVar;
        d dVar2 = new d("FEATURES_INCORRECT_MISSING", 1, R.string.trails_report_issue_selection_features_incorrect, null, 2, null);
        f172375d = dVar2;
        d dVar3 = new d("NAME_IMPROVEMENT", 2, R.string.trails_report_issue_selection_name_improvement, l.NAME);
        d dVar4 = new d("MAPPING_CORRECTION", 3, R.string.trails_report_issue_selection_mapping_issue, l.MAPPING);
        l lVar = l.CLOSURE;
        d dVar5 = new d("TRAIL_CLOSED", 4, R.string.trail_report_issue_selection_closure, lVar);
        f172376e = dVar5;
        d dVar6 = new d("TRAIL_NO_LONGER_CLOSED", 5, R.string.trails_report_issue_selection_no_longer_closed, lVar);
        f172377f = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, new d("OTHER", 6, R.string.lbl_other, l.OTHER)};
        f172378g = dVarArr;
        f172379h = new w13.c(dVarArr);
    }

    public /* synthetic */ d(String str, int i14, int i15, l lVar, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, (i16 & 2) != 0 ? null : lVar);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f172378g.clone();
    }

    private d(String str, int i14, int i15, l lVar) {
        super(str, i14);
        this.f172380a = i15;
        this.f172381b = lVar;
    }
}
