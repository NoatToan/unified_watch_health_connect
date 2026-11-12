package com.garmin.android.apps.connectmobile.courses.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.courses.model.b[], still in use, count: 1, list:
  (r0v1 com.garmin.android.apps.connectmobile.courses.model.b[]) from 0x0078: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.courses.model.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/b;", "", "", Action.KEY_ATTRIBUTE, "", "colorResId", "categoryNumber", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    NONE("NONE", R.color.lime_20_static, 5),
    FOURTH_CATEGORY("FOURTH_CATEGORY", R.color.lime_20_static, 4),
    THIRD_CATEGORY("THIRD_CATEGORY", R.color.yellow_50_static, 3),
    SECOND_CATEGORY("SECOND_CATEGORY", R.color.orange_30_static, 2),
    FIRST_CATEGORY("FIRST_CATEGORY", R.color.red_30_static, 1),
    HORS_CATEGORY("HORS_CATEGORY", R.color.red_70_static, 0),
    INVALID("INVALID", R.color.gcm_system_static_black, -1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32818d = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f32827m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32830c;

    static {
        f32827m = new w13.c(new b[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private b(String str, int i14, int i15) {
        super(str, i);
        this.f32828a = str;
        this.f32829b = i14;
        this.f32830c = i15;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f32826l.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/b$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
