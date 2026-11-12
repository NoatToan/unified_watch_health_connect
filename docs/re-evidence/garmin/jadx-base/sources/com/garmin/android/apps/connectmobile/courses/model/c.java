package com.garmin.android.apps.connectmobile.courses.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.courses.model.c[], still in use, count: 1, list:
  (r0v1 com.garmin.android.apps.connectmobile.courses.model.c[]) from 0x0031: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.courses.model.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/c;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    PAVED("PAVED", R.string.paved),
    MIXED("MIXED_FAVOR_UNPAVED", R.string.lbl_surface_type_mixed),
    UNPAVED("UNPAVED", R.string.unpaved);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32831c = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f32836h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32838b;

    static {
        f32836h = new w13.c(new c[]{r0, r1, r2});
    }

    private c(String str, int i14) {
        super(str, i);
        this.f32837a = str;
        this.f32838b = i14;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32835g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/c$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0540a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32839a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.ROAD_CYCLING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.GRAVEL_CYCLING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i.MOUNTAIN_BIKING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f32839a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
