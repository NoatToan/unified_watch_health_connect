package com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jer;
import defpackage.jxg;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class MarkerBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f10721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f10722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f10723c;
    private Context d;
    private e e;
    private int i;

    public enum KeyExerciseInfoType {
        HeartRate_Marker,
        Speed_Marker,
        Altitude_Marker,
        Base_Marker
    }

    public enum KeyInfoType {
        START_Marker,
        END_Marker,
        ADVANCE_Marker
    }

    public MarkerBuilder(Context context) {
        this.d = null;
        this.i = 17;
        this.f10723c = new d();
        this.f10721a = new c();
        this.e = new e();
        this.f10722b = new a();
        this.d = context;
        LogUtil.a("Track_MarkerBuilder", "MarkerBuilder: constructor has context");
    }

    public MarkerBuilder() {
        this.d = null;
        this.i = 17;
        this.f10723c = new d();
        this.f10721a = new c();
        this.e = new e();
        this.f10722b = new a();
        LogUtil.a("Track_MarkerBuilder", "MarkerBuilder: constructor has not context");
    }

    public Bitmap d(double d2) {
        return this.f10723c.d(d2);
    }

    public String e(double d2) {
        return this.f10723c.a(d2);
    }

    public Bitmap j() {
        return this.f10722b.b(InterfaceUpdateReTrack.MarkerType.Image_type, false);
    }

    public String b() {
        return jxg.a("marker_photo.gltf");
    }

    public Bitmap h() {
        return this.f10722b.b(InterfaceUpdateReTrack.MarkerType.Image_type, true);
    }

    public String e() {
        return jxg.a("marker_selected_photo.gltf");
    }

    public Bitmap o() {
        return this.f10722b.b(InterfaceUpdateReTrack.MarkerType.Text_type, false);
    }

    public String a() {
        return jxg.a("marker_text.gltf");
    }

    public Bitmap i() {
        return this.f10722b.b(InterfaceUpdateReTrack.MarkerType.Text_type, true);
    }

    public String d() {
        return jxg.a("marker_selected_text.gltf");
    }

    public Bitmap m() {
        return this.f10722b.b(InterfaceUpdateReTrack.MarkerType.Video_type, false);
    }

    public Bitmap g() {
        return this.f10722b.b(InterfaceUpdateReTrack.MarkerType.Video_type, true);
    }

    public String c() {
        return jxg.a("marker_video.gltf");
    }

    public String f() {
        return jxg.a("marker_selected_video.gltf");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(float f) {
        return jer.d(f);
    }

    public Bitmap a(KeyExerciseInfoType keyExerciseInfoType, int i) {
        this.i = i;
        int iOrdinal = keyExerciseInfoType.ordinal();
        if (iOrdinal == 0) {
            return this.e.j();
        }
        if (iOrdinal == 1) {
            return this.e.k();
        }
        if (iOrdinal == 2) {
            return this.e.c();
        }
        if (iOrdinal != 3) {
            return null;
        }
        return this.e.a();
    }

    public String e(KeyExerciseInfoType keyExerciseInfoType, int i) {
        this.i = i;
        int iOrdinal = keyExerciseInfoType.ordinal();
        if (iOrdinal == 0) {
            return this.e.b();
        }
        if (iOrdinal == 1) {
            return this.e.o();
        }
        if (iOrdinal == 2) {
            return this.e.e();
        }
        if (iOrdinal == 3) {
            return this.e.d();
        }
        return "";
    }

    public Bitmap c(KeyExerciseInfoType keyExerciseInfoType, int i) {
        this.i = i;
        int iOrdinal = keyExerciseInfoType.ordinal();
        if (iOrdinal == 0) {
            return this.e.f();
        }
        if (iOrdinal == 1) {
            return this.e.m();
        }
        if (iOrdinal != 2) {
            return null;
        }
        return this.e.h();
    }

    public String d(KeyExerciseInfoType keyExerciseInfoType, int i) {
        this.i = i;
        int iOrdinal = keyExerciseInfoType.ordinal();
        if (iOrdinal == 0) {
            return this.e.g();
        }
        if (iOrdinal == 1) {
            return this.e.n();
        }
        if (iOrdinal == 2) {
            return this.e.i();
        }
        return "";
    }

    public Bitmap b(KeyInfoType keyInfoType, int i, boolean z) {
        int iOrdinal = keyInfoType.ordinal();
        if (iOrdinal == 0) {
            return this.f10721a.b(i);
        }
        if (iOrdinal == 1) {
            return this.f10721a.e();
        }
        if (iOrdinal != 2) {
            return null;
        }
        return this.f10721a.e(z);
    }

    public String d(KeyInfoType keyInfoType, int i, boolean z) {
        int iOrdinal = keyInfoType.ordinal();
        if (iOrdinal == 0) {
            return this.f10721a.e(i);
        }
        if (iOrdinal == 1) {
            return this.f10721a.a();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap b(Bitmap bitmap, float f, float f2) {
        int iD = d(f);
        int iD2 = d(f2);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(iD / width, iD2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10731b;

        private d() {
            this.f10730a = 90;
            this.f10731b = 105;
        }

        public Bitmap d(double d) {
            LogUtil.a("Track_MarkerBuilder", "Go into createKmMarker");
            if (MarkerBuilder.this.d == null) {
                LogUtil.j("Track_MarkerBuilder", "Context is null");
                return null;
            }
            this.f10730a = MarkerBuilder.this.d(23.0f);
            this.f10731b = MarkerBuilder.this.d(26.0f);
            String strValueOf = String.valueOf((int) Math.round(e(d) / 1000.0d));
            TextPaint textPaintD = d(MarkerBuilder.this.d.getResources(), strValueOf.length());
            textPaintD.getTextBounds(strValueOf, 0, strValueOf.length(), new Rect());
            Bitmap bitmapC = c(MarkerBuilder.this.d.getResources());
            new Canvas(bitmapC).drawText(strValueOf, bitmapC.getWidth() / 2.0f, (((bitmapC.getHeight() - textPaintD.getFontMetrics().top) - textPaintD.getFontMetrics().bottom) / 2.0f) - MarkerBuilder.this.d(2.0f), textPaintD);
            LogUtil.a("Track_MarkerBuilder", "Go out createKmMarker");
            return bitmapC;
        }

        private double e(double d) {
            return UnitUtil.f() ? UnitUtil.e(d / 1000.0d, 3) * 1000.0d : d;
        }

        public String a(double d) {
            return String.valueOf((int) Math.round(e(d) / 1000.0d));
        }

        private TextPaint d(Resources resources, int i) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.CENTER);
            if (resources != null) {
                textPaint.setColor(resources.getColor(R.color.common_color_white));
                if (i == 1) {
                    textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.hw_show_font_size_10));
                    return textPaint;
                }
                if (i == 2) {
                    textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.hw_show_font_size_10));
                    return textPaint;
                }
                textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.hw_show_font_size_8));
            }
            return textPaint;
        }

        private Bitmap c(Resources resources) {
            if (resources != null) {
                Drawable drawable = resources.getDrawable(R.drawable.hw_show_map_tracking_km_img);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f10730a, this.f10731b, Bitmap.Config.ARGB_8888);
                if (drawable != null) {
                    drawable.setBounds(0, 0, this.f10730a, this.f10731b);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.draw(canvas);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
                }
                return bitmapCreateBitmap;
            }
            return Bitmap.createBitmap(this.f10730a, this.f10731b, Bitmap.Config.ARGB_8888);
        }
    }

    class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f10728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10729c;
        private Bitmap d;
        private String e;
        private Bitmap g;

        private c() {
            this.g = null;
            this.f10728b = null;
            this.d = null;
            this.e = null;
            this.f10729c = null;
        }

        public Bitmap b(int i) {
            if (this.g == null && MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                this.g = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), a(i)), 24.0f, 28.5f);
            }
            return this.g;
        }

        public String e(int i) {
            if (this.e == null && MarkerBuilder.this.d != null) {
                this.e = c(i);
            }
            return this.e;
        }

        public Bitmap e(boolean z) {
            int i;
            if (MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                Resources resources = markerBuilder.d.getResources();
                if (z) {
                    i = R.drawable.retrack_ic_move_marker_white;
                } else {
                    i = R.drawable.retrack_ic_move_marker_orange;
                }
                this.f10728b = markerBuilder.b(BitmapFactory.decodeResource(resources, i), 18.0f, 18.0f);
            }
            return this.f10728b;
        }

        public Bitmap e() {
            if (this.d == null && MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                this.d = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_show_map_ending), 24.0f, 28.5f);
            }
            return this.d;
        }

        public String a() {
            if (this.f10729c == null && MarkerBuilder.this.d != null) {
                this.f10729c = jxg.a("marker_end.gltf");
            }
            return this.f10729c;
        }

        private int a(int i) {
            if (i == 222) {
                return R.drawable.hw_show_map_tracking_start_exp_img;
            }
            if (i == 233) {
                return R.drawable.retrack_show_map_tracking_start_ski_mountaineering;
            }
            if (i == 280) {
                return R.drawable.retrack_show_map_tracking_start_cross_race_img;
            }
            if (i == 282) {
                return R.drawable.retrack_show_map_tracking_start_hiking_img;
            }
            switch (i) {
                case 257:
                    return R.drawable.retrack_show_map_tracking_start_walk_img;
                case 258:
                    return R.drawable.retrack_show_map_tracking_start_run_img;
                case 259:
                    return R.drawable.retrack_show_map_tracking_start_bike_img;
                case 260:
                    return R.drawable.retrack_show_map_tracking_start_climb_hill_img;
                default:
                    return R.drawable.retrack_show_map_tracking_start_run_img;
            }
        }

        private String c(int i) {
            if (i == 280) {
                return jxg.a("marker_trail_run.gltf");
            }
            switch (i) {
                case 257:
                    return jxg.a("marker_start_walk.gltf");
                case 258:
                    return jxg.a("marker_start_run.gltf");
                case 259:
                    return jxg.a("marker_start_bike.gltf");
                case 260:
                    return jxg.a("marker_start_climb_hill.gltf");
                default:
                    return jxg.a("marker_start_hiking.gltf");
            }
        }
    }

    class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10732a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10734c;
        private String d;
        private String e;
        private String f;
        private Bitmap g;
        private String h;
        private String i;
        private Bitmap j;
        private Bitmap k;
        private Bitmap l;
        private Bitmap m;
        private Bitmap n;
        private Bitmap o;

        private e() {
            this.g = null;
            this.l = null;
            this.k = null;
            this.j = null;
            this.n = null;
            this.m = null;
            this.o = null;
            this.f10734c = null;
            this.f10732a = null;
            this.h = null;
            this.e = null;
            this.d = null;
            this.f = null;
            this.i = null;
        }

        public Bitmap c() {
            if (this.g == null && MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                this.g = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_map_marker_altitude), 31.5f, 31.5f);
            }
            return this.g;
        }

        public String e() {
            if (this.f10734c == null && MarkerBuilder.this.d != null) {
                this.f10734c = jxg.a("marker_altitude.gltf");
            }
            return this.f10734c;
        }

        public Bitmap j() {
            if (this.l == null && MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                this.l = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_map_marker_heartrate), 31.5f, 31.5f);
            }
            return this.l;
        }

        public String b() {
            if (this.f10732a == null && MarkerBuilder.this.d != null) {
                this.f10732a = jxg.a("marker_heart_rate.gltf");
            }
            return this.f10732a;
        }

        public Bitmap k() {
            if (this.k == null && MarkerBuilder.this.d != null) {
                switch (MarkerBuilder.this.i) {
                    case 16:
                        MarkerBuilder markerBuilder = MarkerBuilder.this;
                        this.k = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_map_marker_pace), 31.5f, 31.5f);
                        break;
                    case 17:
                        MarkerBuilder markerBuilder2 = MarkerBuilder.this;
                        this.k = markerBuilder2.b(BitmapFactory.decodeResource(markerBuilder2.d.getResources(), R.drawable.retrack_map_marker_speed), 31.5f, 31.5f);
                        break;
                    case 18:
                        MarkerBuilder markerBuilder3 = MarkerBuilder.this;
                        this.k = markerBuilder3.b(BitmapFactory.decodeResource(markerBuilder3.d.getResources(), R.drawable.retrack_map_marker_step_rate), 31.5f, 31.5f);
                        break;
                    default:
                        MarkerBuilder markerBuilder4 = MarkerBuilder.this;
                        this.k = markerBuilder4.b(BitmapFactory.decodeResource(markerBuilder4.d.getResources(), R.drawable.retrack_map_marker_speed), 31.5f, 31.5f);
                        break;
                }
            }
            return this.k;
        }

        public String o() {
            if (this.h == null && MarkerBuilder.this.d != null) {
                int i = MarkerBuilder.this.i;
                if (i == 16) {
                    this.h = jxg.a("marker_pace.gltf");
                } else if (i == 18) {
                    this.h = jxg.a("marker_step_rate.gltf");
                } else {
                    this.h = jxg.a("marker_speed.gltf");
                }
            }
            return this.h;
        }

        public Bitmap a() {
            if (this.j == null && MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                this.j = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_map_marker_base), 44.0f, 26.0f);
            }
            return this.j;
        }

        public String d() {
            if (this.e == null && MarkerBuilder.this.d != null) {
                this.e = jxg.a("marker_trail_run.gltf");
            }
            return this.e;
        }

        public Bitmap h() {
            if (this.n == null && MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                this.n = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_map_marker_slope_altitude), 31.5f, 31.5f);
            }
            return this.n;
        }

        public String i() {
            if (this.d == null && MarkerBuilder.this.d != null) {
                this.d = jxg.a("marker_altitude.gltf");
            }
            return this.d;
        }

        public Bitmap f() {
            if (this.m == null && MarkerBuilder.this.d != null) {
                MarkerBuilder markerBuilder = MarkerBuilder.this;
                this.m = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_map_marker_slope_heartrate), 31.5f, 31.5f);
            }
            return this.m;
        }

        public String g() {
            if (this.f == null && MarkerBuilder.this.d != null) {
                this.f = jxg.a("marker_heart_rate.gltf");
            }
            return this.f;
        }

        public Bitmap m() {
            if (this.o == null && MarkerBuilder.this.d != null) {
                switch (MarkerBuilder.this.i) {
                    case 16:
                        MarkerBuilder markerBuilder = MarkerBuilder.this;
                        this.o = markerBuilder.b(BitmapFactory.decodeResource(markerBuilder.d.getResources(), R.drawable.retrack_map_marker_slope_pace), 31.5f, 31.5f);
                        break;
                    case 17:
                        MarkerBuilder markerBuilder2 = MarkerBuilder.this;
                        this.o = markerBuilder2.b(BitmapFactory.decodeResource(markerBuilder2.d.getResources(), R.drawable.retrack_map_marker_slope_speed), 31.5f, 31.5f);
                        break;
                    case 18:
                        MarkerBuilder markerBuilder3 = MarkerBuilder.this;
                        this.o = markerBuilder3.b(BitmapFactory.decodeResource(markerBuilder3.d.getResources(), R.drawable.retrack_map_marker_slope_step_rate), 31.5f, 31.5f);
                        break;
                    default:
                        MarkerBuilder markerBuilder4 = MarkerBuilder.this;
                        this.o = markerBuilder4.b(BitmapFactory.decodeResource(markerBuilder4.d.getResources(), R.drawable.retrack_map_marker_slope_speed), 31.5f, 31.5f);
                        break;
                }
            }
            return this.o;
        }

        public String n() {
            if (this.i == null && MarkerBuilder.this.d != null) {
                int i = MarkerBuilder.this.i;
                if (i == 16) {
                    this.i = jxg.a("marker_pace.gltf");
                } else if (i == 18) {
                    this.i = jxg.a("marker_step_rate.gltf");
                } else {
                    this.i = jxg.a("marker_speed.gltf");
                }
            }
            return this.i;
        }
    }

    class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10726b;
        private int e;

        private a() {
            this.f10726b = MarkerBuilder.this.d(30.0f);
            this.e = MarkerBuilder.this.d(30.0f);
        }

        public Bitmap b(InterfaceUpdateReTrack.MarkerType markerType, boolean z) {
            if (MarkerBuilder.this.d == null) {
                LogUtil.j("Track_MarkerBuilder", "createTextMarkerBackground: context is null");
                return Bitmap.createBitmap(this.f10726b, this.e, Bitmap.Config.ARGB_8888);
            }
            if (MarkerBuilder.this.d.getResources() != null) {
                Drawable drawableA = a(markerType, z);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f10726b, this.e, Bitmap.Config.ARGB_8888);
                if (drawableA != null) {
                    drawableA.setBounds(0, 0, this.f10726b, this.e);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableA.draw(canvas);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
                }
                return bitmapCreateBitmap;
            }
            return Bitmap.createBitmap(this.f10726b, this.e, Bitmap.Config.ARGB_8888);
        }

        private Drawable a(InterfaceUpdateReTrack.MarkerType markerType, boolean z) {
            int i;
            if (MarkerBuilder.this.d == null) {
                LogUtil.j("Track_MarkerBuilder", "getDrawableByType: context is null");
                return null;
            }
            Resources resources = MarkerBuilder.this.d.getResources();
            if (z) {
                int i2 = AnonymousClass1.f10724c[markerType.ordinal()];
                if (i2 == 1) {
                    i = R.drawable.trackalbum_slidebar_pic_selected;
                } else if (i2 == 2) {
                    i = R.drawable.trackalbum_slidebar_video_selected;
                } else {
                    i = R.drawable.trackalbum_slidebar_text_selected;
                }
            } else {
                int i3 = AnonymousClass1.f10724c[markerType.ordinal()];
                if (i3 == 1) {
                    i = R.drawable.trackalbum_slidebar_pic_unselected;
                } else if (i3 == 2) {
                    i = R.drawable.trackalbum_slidebar_video_unselected;
                } else {
                    i = R.drawable.trackalbum_slidebar_text_unselected;
                }
            }
            if (i != -1) {
                try {
                    return resources.getDrawable(i, null);
                } catch (Resources.NotFoundException e) {
                    LogUtil.j("Track_MarkerBuilder", "getDrawableByType: ", LogAnonymous.b(e));
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.MarkerBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f10724c;

        static {
            int[] iArr = new int[InterfaceUpdateReTrack.MarkerType.values().length];
            f10724c = iArr;
            try {
                iArr[InterfaceUpdateReTrack.MarkerType.Image_type.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10724c[InterfaceUpdateReTrack.MarkerType.Video_type.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
