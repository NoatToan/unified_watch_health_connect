package com.garmin.android.apps.connectmobile.courses.model;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.LayerDrawable;
import c22.r0;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.courses.model.i[], still in use, count: 1, list:
  (r0v1 com.garmin.android.apps.connectmobile.courses.model.i[]) from 0x00e8: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.courses.model.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/i;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "typeLabel", "typeIcon", "markerBackground", "", "surfaceKey", "activityTypeKey", "<init>", "(Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    RUNNING(R.string.lbl_running, R.string.lbl_running, R.drawable.run, 2131231998, "RUNNING", x0.f4308n.f4358a),
    TRAIL_RUNNING(R.string.lbl_trail_running, R.string.lbl_running, R.drawable.run_trail, 2131231998, "TRAIL_RUNNING", x0.J0.f4358a),
    OBSTACLE_COURSE_RACING(R.string.activities_obstacle_course_racing, R.string.lbl_running, R.drawable.obstacle_course_racing, 2131231998, "RUNNING", x0.O0.f4358a),
    ROAD_CYCLING(R.string.lbl_road_biking, R.string.lbl_cycling, R.drawable.bike, 2131231998, "ROAD_CYCLING", x0.X0.f4358a),
    GRAVEL_CYCLING(R.string.lbl_gravel_unpaved_cycling, R.string.lbl_cycling, R.drawable.gravel_bike, 2131231998, "GRAVEL_BIKING", x0.Z0.f4358a),
    MOUNTAIN_BIKING(R.string.lbl_mountain_biking, R.string.lbl_cycling, R.drawable.mountain_bike, 2131231998, "MOUNTAIN_BIKING", x0.V0.f4358a),
    HIKING(R.string.lbl_hiking, R.string.lbl_hiking, R.drawable.hike, 2131231998, "HIKING", x0.f4320q.f4358a),
    OTHER(R.string.lbl_other, R.string.lbl_other, R.drawable.other_activity, 2131231998, "MIXED_SURFACE", x0.f4346x.f4358a);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f32968g = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w13.c f32978q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f32984f;

    static {
        f32978q = new w13.c(new i[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private i(int i14, int i15, int i16, int i17, String str, String str2) {
        super(str, i);
        this.f32979a = i14;
        this.f32980b = i15;
        this.f32981c = i16;
        this.f32982d = i17;
        this.f32983e = str;
        this.f32984f = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f32977p.clone();
    }

    public final String a(Context context) {
        context.getClass();
        int i14 = this.f32980b;
        if (i14 == R.string.lbl_cycling) {
            String string = context.getString(R.string.courses_send_to_device_title_cycling);
            string.getClass();
            return string;
        }
        if (i14 == R.string.lbl_running) {
            String string2 = context.getString(R.string.courses_send_to_device_title_running);
            string2.getClass();
            return string2;
        }
        if (i14 == R.string.lbl_hiking) {
            String string3 = context.getString(R.string.courses_send_to_device_title_hiking);
            string3.getClass();
            return string3;
        }
        String string4 = context.getString(R.string.courses_send_to_device_title_generic);
        string4.getClass();
        return string4;
    }

    public final Bitmap b(Context context, boolean z14) {
        int i14 = z14 ? 2 : 1;
        Resources resources = context.getResources();
        resources.getClass();
        LayerDrawable layerDrawableA = r0.a(context, this.f32981c, R.color.gcm_icon_primary_action, R.color.gcm_icon_on_color, (int) xy2.b.n(resources, i14), R.color.gcm_icon_on_color, r0.a.DEFAULT);
        if (layerDrawableA == null) {
            return null;
        }
        Resources resources2 = context.getResources();
        resources2.getClass();
        int iN = (int) xy2.b.n(resources2, 24.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iN, iN, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        layerDrawableA.setBounds(0, 0, iN, iN);
        layerDrawableA.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final boolean c() {
        return this == ROAD_CYCLING || this == GRAVEL_CYCLING || this == MOUNTAIN_BIKING;
    }

    public final boolean d() {
        return this == RUNNING || this == TRAIL_RUNNING || this == OBSTACLE_COURSE_RACING;
    }

    public final boolean e() {
        return this == RUNNING || this == HIKING || this == TRAIL_RUNNING || this == OBSTACLE_COURSE_RACING || this == OTHER;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/i$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0541a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32985a;

            static {
                int[] iArr = new int[x0.values().length];
                try {
                    iArr[x0.f4308n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x0.J0.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x0.O0.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[x0.f4320q.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[x0.f4312o.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[x0.Y0.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[x0.X0.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[x0.V0.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[x0.R0.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[x0.Z0.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f32985a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a(x0 x0Var) {
            if (x0Var == null) {
                return i.OTHER;
            }
            switch (C0541a.f32985a[x0Var.ordinal()]) {
                case 1:
                    return i.RUNNING;
                case 2:
                    return i.TRAIL_RUNNING;
                case 3:
                    return i.OBSTACLE_COURSE_RACING;
                case 4:
                    return i.HIKING;
                case 5:
                case 6:
                case 7:
                    return i.ROAD_CYCLING;
                case 8:
                case 9:
                    return i.MOUNTAIN_BIKING;
                case 10:
                    return i.GRAVEL_CYCLING;
                default:
                    return i.OTHER;
            }
        }

        private a() {
        }
    }
}
