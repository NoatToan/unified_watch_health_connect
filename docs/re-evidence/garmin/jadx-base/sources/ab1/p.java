package ab1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lab1/p;", "", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "iconResId", "labelResId", "<init>", "(Ljava/lang/String;IILjava/lang/String;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum p {
    ROAD(3, "ROAD", R.drawable.bike, R.string.lbl_road),
    GRAVEL(2, "GRAVEL", R.drawable.gravel_bike, R.string.lbl_surface_type_gravel_unpaved),
    OFF_ROAD(1, "MOUNTAIN", R.drawable.mountain_bike, R.string.lbl_off_road_trails);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2628e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2636d;

    p(int i14, String str, int i15, int i16) {
        this.f2633a = i14;
        this.f2634b = str;
        this.f2635c = i15;
        this.f2636d = i16;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lab1/p$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: ab1.p$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0035a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2637a;

            static {
                int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.i.values().length];
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.i.ROAD_CYCLING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.i.GRAVEL_CYCLING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.i.MOUNTAIN_BIKING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2637a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static p a(com.garmin.android.apps.connectmobile.courses.model.i iVar) {
            iVar.getClass();
            int i14 = C0035a.f2637a[iVar.ordinal()];
            if (i14 == 1) {
                return p.ROAD;
            }
            if (i14 != 2) {
                return i14 != 3 ? p.ROAD : p.OFF_ROAD;
            }
            return p.GRAVEL;
        }

        private a() {
        }
    }
}
