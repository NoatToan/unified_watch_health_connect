package us1;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 us1.i[], still in use, count: 1, list:
  (r0v4 us1.i[]) from 0x00c2: CONSTRUCTOR (r0v4 us1.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lus1/i;", "", "", Action.KEY_ATTRIBUTE, "", "labelStringRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    DOG_FRIENDLY("DOG_FRIENDLY", R.string.trail_feature_dog_friendly),
    /* JADX INFO: Fake field, exist only in values array */
    NO_DOGS("NO_DOGS", R.string.trail_feature_no_dogs),
    /* JADX INFO: Fake field, exist only in values array */
    WATERFALLS("WATERFALLS", R.string.trail_feature_waterfalls),
    /* JADX INFO: Fake field, exist only in values array */
    LAKES("LAKES", R.string.trail_feature_lakes),
    /* JADX INFO: Fake field, exist only in values array */
    RIVERS("RIVERS", R.string.trail_feature_rivers),
    OCEANS("OCEANS", R.string.trail_feature_oceans),
    MOUNTAINEERING("MOUNTAINEERING", R.string.lbl_mountaineering),
    /* JADX INFO: Fake field, exist only in values array */
    STEEP_SECTIONS("STEEP_SECTIONS", R.string.trail_feature_steep_sections),
    /* JADX INFO: Fake field, exist only in values array */
    FOREST("FOREST", R.string.trail_feature_forest),
    /* JADX INFO: Fake field, exist only in values array */
    FLOWERS("FLOWERS", R.string.trail_feature_flowers),
    /* JADX INFO: Fake field, exist only in values array */
    KID_FRIENDLY("KID_FRIENDLY", R.string.trail_feature_kid_friendly),
    /* JADX INFO: Fake field, exist only in values array */
    PERMIT_REQUIRED("PERMIT_REQUIRED", R.string.trail_feature_permit_required),
    /* JADX INFO: Fake field, exist only in values array */
    WATER_STATIONS("WATER_STATIONS", R.string.trail_feature_water_sources),
    /* JADX INFO: Fake field, exist only in values array */
    REACHES_PEAKS("REACHES_PEAKS", R.string.trail_feature_reaches_peaks),
    /* JADX INFO: Fake field, exist only in values array */
    ROUGH_ROADS("ROUGH_ROADS", R.string.trail_feature_rough_road);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f172411c = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172416h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172418b;

    static {
        f172416h = new w13.c(new i[]{r0, r1, r2, r3, r4, r5, r6, new i("STEEP_SECTIONS", R.string.trail_feature_steep_sections), new i("FOREST", R.string.trail_feature_forest), new i("FLOWERS", R.string.trail_feature_flowers), new i("KID_FRIENDLY", R.string.trail_feature_kid_friendly), new i("PERMIT_REQUIRED", R.string.trail_feature_permit_required), new i("WATER_STATIONS", R.string.trail_feature_water_sources), new i("REACHES_PEAKS", R.string.trail_feature_reaches_peaks), new i("ROUGH_ROADS", R.string.trail_feature_rough_road)});
    }

    private i(String str, int i14) {
        super(str, i);
        this.f172417a = str;
        this.f172418b = i14;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f172415g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus1/i$a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a(String str) {
            Object next;
            w13.c cVar = i.f172416h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((i) next).f172417a, str)) {
                    return (i) next;
                }
            }
            next = null;
            return (i) next;
        }

        public static i b(Context context, String str) {
            Object next;
            context.getClass();
            str.getClass();
            w13.c cVar = i.f172416h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(context.getString(((i) next).f172418b), str)) {
                    return (i) next;
                }
            }
            next = null;
            return (i) next;
        }

        private a() {
        }
    }
}
