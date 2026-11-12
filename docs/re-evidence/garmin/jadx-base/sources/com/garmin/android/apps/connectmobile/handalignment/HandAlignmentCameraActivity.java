package com.garmin.android.apps.connectmobile.handalignment;

import am.j;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Arrays;
import java.util.Iterator;
import lc.u0;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;
import vd2.g;
import vd2.h;
import vd2.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandAlignmentCameraActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lvd2/h;", "Lla2/a;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClickTryManual", "(Landroid/view/View;)V", "b", "a", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HandAlignmentCameraActivity extends com.garmin.android.apps.connectmobile.c implements h, la2.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f36526q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f36527r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd2.b f36528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CircleOverlayView f36529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f36530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f36531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f36532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f36533f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vd2.e f36536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f36537j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f36539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f36540m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f36542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f36543p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f36534g = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s03.a f36538k = new s03.a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f36541n = a.Searching;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandAlignmentCameraActivity$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Searching,
        Aligning,
        Aligned
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f36550c;

        static {
            int[] iArr = new int[i.b.values().length];
            try {
                iArr[i.b.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.b.HandTooClose.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.b.HandOverlap.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.b.HandTooCloseInv.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.b.HandOverlapInv.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.b.NumberOverlap.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.b.NumberOverlapInv.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f36548a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.Searching.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[a.Aligning.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[a.Aligned.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f36549b = iArr2;
            int[] iArr3 = new int[vd2.e.values().length];
            try {
                iArr3[vd2.e.Quartz.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            f36550c = iArr3;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f36527r = gt2.b.f79005a.h("HandAlignment");
    }

    public HandAlignmentCameraActivity() {
        g gVar = new g();
        gVar.f177512e.set(this);
        this.f36543p = gVar;
    }

    @Override // vd2.h
    public final void W4(Size size, float f14) {
        size.getClass();
        float f15 = (Resources.getSystem().getDisplayMetrics().widthPixels * 0.82857144f) / f14;
        float width = f15 / size.getWidth();
        float height = f15 / size.getHeight();
        z.i("Watch detecting rect = ", (int) f15, f36527r);
        this.f36543p.f177514g.setCropRegionSizeRatio(width, height);
    }

    public final void ca() {
        f36527r.debug("abortHandAlignment");
        g gVar = this.f36543p;
        gVar.f177513f.set(false);
        gVar.f177514g.clearRecordingData();
        this.f36539l = false;
        s03.a aVar = this.f36538k;
        aVar.e();
        f fVar = this.f36537j;
        if (fVar == null) {
            s.m("watchHandController");
            throw null;
        }
        aVar.a(fVar.a().k(r03.a.a()).h(r03.a.a()).i(new com.mapbox.maps.renderer.e(new en0.d(this, 8), 20), new en0.f(this, 1)));
    }

    public final void da(float f14, float f15) {
        f36527r.debug(j.l("restartDetection: rotateDegrees(", f14, ", ", f15, ")"));
        g gVar = this.f36543p;
        gVar.f177513f.set(false);
        gVar.f177514g.clearRecordingData();
        f fVar = this.f36537j;
        if (fVar == null) {
            s.m("watchHandController");
            throw null;
        }
        this.f36538k.a(fVar.b(f14, f15).j(r03.a.a()).g(r03.a.a()).h(new com.mapbox.maps.renderer.e(new en0.d(this, 2), 13), new com.mapbox.maps.renderer.e(new en0.d(this, 3), 14)));
    }

    public final void ea() {
        if (isFinishing()) {
            return;
        }
        HandsCalibrationActivity.a aVar = HandsCalibrationActivity.f36565z;
        ai1.a aVar2 = new ai1.a(this, 29);
        aVar.getClass();
        HandsCalibrationActivity.a.a(this, aVar2);
    }

    public final void fa(a aVar) {
        aVar.getClass();
        this.f36541n = aVar;
        int i14 = c.f36549b[aVar.ordinal()];
        if (i14 == 1) {
            TextView textView = this.f36530c;
            if (textView == null) {
                s.m("statusTitle");
                throw null;
            }
            textView.setVisibility(8);
            TextView textView2 = this.f36531d;
            if (textView2 == null) {
                s.m("statusText");
                throw null;
            }
            textView2.setText(getString(R.string.hand_alignment_align_hands_tutorial, this.f36535h));
            ImageView imageView = this.f36532e;
            if (imageView != null) {
                imageView.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_gray));
                return;
            } else {
                s.m("watchFaceCircle");
                throw null;
            }
        }
        if (i14 == 2) {
            TextView textView3 = this.f36530c;
            if (textView3 == null) {
                s.m("statusTitle");
                throw null;
            }
            textView3.setVisibility(8);
            TextView textView4 = this.f36531d;
            if (textView4 == null) {
                s.m("statusText");
                throw null;
            }
            textView4.setText(getString(R.string.hand_alignment_align_hands_in_progress));
            ImageView imageView2 = this.f36532e;
            if (imageView2 != null) {
                imageView2.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_gray));
                return;
            } else {
                s.m("watchFaceCircle");
                throw null;
            }
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        TextView textView5 = this.f36530c;
        if (textView5 == null) {
            s.m("statusTitle");
            throw null;
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f36531d;
        if (textView6 == null) {
            s.m("statusText");
            throw null;
        }
        textView6.setText(getString(R.string.hand_alignment_align_hands_success_message));
        ImageView imageView3 = this.f36532e;
        if (imageView3 != null) {
            imageView3.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_green));
        } else {
            s.m("watchFaceCircle");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vd2.h
    public final void k4(i iVar) {
        i.a aVar = iVar.f177517a;
        i.b bVar = aVar.f177519a;
        i.c cVar = iVar.f177518b;
        i.b bVar2 = cVar.f177535a;
        Float fValueOf = Float.valueOf(aVar.f177520b);
        Float fValueOf2 = Float.valueOf(aVar.f177521c);
        float f14 = cVar.f177536b;
        Float fValueOf3 = Float.valueOf(f14);
        float f15 = cVar.f177537c;
        String str = String.format("onFrameProcessed: frame: (" + bVar + ", %.1f, %.1f); vote: (" + bVar2 + ", %.1f, %.1f)", Arrays.copyOf(new Object[]{fValueOf, fValueOf2, fValueOf3, Float.valueOf(f15)}, 4));
        Logger logger = f36527r;
        logger.debug(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        i.b bVar3 = i.b.Success;
        a aVar2 = this.f36541n;
        if (bVar == bVar3) {
            a aVar3 = a.Aligning;
            if (aVar2 == aVar3) {
                this.f36542o = jCurrentTimeMillis + ((long) 500);
            } else if (this.f36542o < jCurrentTimeMillis) {
                fa(aVar3);
                this.f36542o = jCurrentTimeMillis + ((long) 1000);
            }
        } else {
            a aVar4 = a.Searching;
            if (aVar2 != aVar4 && this.f36542o < jCurrentTimeMillis) {
                fa(aVar4);
                this.f36542o = jCurrentTimeMillis + ((long) 1000);
            }
        }
        switch (c.f36548a[bVar2.ordinal()]) {
            case 1:
                g gVar = this.f36543p;
                gVar.f177513f.set(false);
                gVar.f177514g.clearRecordingData();
                logger.debug(String.format("apply offset: %.1f, %.1f", Arrays.copyOf(new Object[]{Float.valueOf(f14), Float.valueOf(f15)}, 2)));
                vd2.e eVar = this.f36536i;
                if (eVar == null) {
                    s.m("deviceType");
                    throw null;
                }
                Float fValueOf4 = Float.valueOf(90.0f);
                p pVar = c.f36550c[eVar.ordinal()] == 1 ? new p(fValueOf4, Float.valueOf(-90.0f)) : new p(fValueOf4, Float.valueOf(0.0f));
                f fVar = this.f36537j;
                if (fVar != null) {
                    this.f36538k.a(fVar.b((-f14) - ((Number) pVar.f128594a).floatValue(), (-f15) - ((Number) pVar.f128595b).floatValue()).j(r03.a.a()).g(r03.a.a()).h(new com.mapbox.maps.renderer.e(new en0.d(this, 4), 15), new com.mapbox.maps.renderer.e(new en0.d(this, 5), 17)));
                    return;
                } else {
                    s.m("watchHandController");
                    throw null;
                }
            case 2:
            case 3:
                da(60.0f, 0.0f);
                return;
            case 4:
            case 5:
                da(-60.0f, 0.0f);
                return;
            case 6:
                da(0.0f, 30.0f);
                return;
            case 7:
                da(0.0f, -30.0f);
                return;
            default:
                return;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (!this.f36539l) {
            finish();
        } else {
            ca();
            finish();
        }
    }

    public final void onClickTryManual(View view2) {
        view2.getClass();
        f fVar = this.f36537j;
        if (fVar == null) {
            s.m("watchHandController");
            throw null;
        }
        this.f36538k.a(fVar.f().j(r03.a.a()).g(r03.a.a()).h(new com.mapbox.maps.renderer.e(new en0.d(this, 9), 21), new com.mapbox.maps.renderer.e(new en0.d(this, 1), 12)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        super.onCreate(bundle);
        setContentView(R.layout.activity_hand_alignment_camera);
        initActionBar(R.string.device_settings_hands_calibration, 3);
        this.f36534g = getIntent() != null ? getIntent().getLongExtra("GCM_deviceUnitID", -1L) : -1L;
        this.f36535h = getIntent() != null ? getIntent().getStringExtra("GCM_deviceName") : null;
        long j8 = this.f36534g;
        Logger logger = f36527r;
        if (j8 == -1) {
            logger.debug("finish(). Invalid device unit ID.");
            finish();
            return;
        }
        Iterator it = da2.d.b().f58886a.f111646e.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DeviceProfile) next).getF92746j() != this.f36534g);
        DeviceProfile deviceProfile = (DeviceProfile) next;
        if (deviceProfile == null) {
            logger.debug("finish(). Device is not connected.");
            finish();
            return;
        }
        vd2.e eVarA = en0.h.a(deviceProfile.getF92744h());
        this.f36536i = eVarA;
        if (eVarA == null) {
            s.m("deviceType");
            throw null;
        }
        g gVar = this.f36543p;
        gVar.getClass();
        gVar.f177511d = eVarA;
        if (a7.b.checkSelfPermission(this, "android.permission.CAMERA") == -1) {
            logger.debug("Camera permission is not granted.");
            finish();
            return;
        }
        f.a aVar = f.f36613h;
        long j14 = this.f36534g;
        String str = this.f36535h;
        aVar.getClass();
        this.f36537j = f.a.a(j14, str);
        this.f36528a = vd2.b.a.a(vd2.b.f177472p, gVar);
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        vd2.b bVar = this.f36528a;
        if (bVar == null) {
            s.m("fragment");
            throw null;
        }
        aVarB.l(R.id.fragment_container, bVar, null);
        aVarB.e();
        float f14 = (Resources.getSystem().getDisplayMetrics().widthPixels * 0.58f) / 2;
        View viewFindViewById = findViewById(R.id.circle_overlay);
        viewFindViewById.getClass();
        CircleOverlayView circleOverlayView = (CircleOverlayView) viewFindViewById;
        this.f36529b = circleOverlayView;
        circleOverlayView.setCircleRadius(f14);
        CircleOverlayView circleOverlayView2 = this.f36529b;
        if (circleOverlayView2 == null) {
            s.m("circleOverlay");
            throw null;
        }
        if (circleOverlayView2.f36520d > 0 && circleOverlayView2.f36521e > 0) {
            circleOverlayView2.a();
            circleOverlayView2.requestLayout();
        }
        View viewFindViewById2 = findViewById(R.id.status_title);
        viewFindViewById2.getClass();
        this.f36530c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.status_text);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f36531d = textView;
        textView.setText(getString(R.string.hand_alignment_align_hands_tutorial, this.f36535h));
        View viewFindViewById4 = findViewById(R.id.watch_face_circle);
        viewFindViewById4.getClass();
        this.f36532e = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.try_manual);
        viewFindViewById5.getClass();
        Button button = (Button) viewFindViewById5;
        this.f36533f = button;
        button.postDelayed(new en0.e(this, 2), 120000L);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        this.f36543p.f177503a.quitSafely();
        this.f36538k.e();
        super.onDestroy();
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (hVar.f111673a.getF92746j() == this.f36534g) {
            ea();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        f36527r.debug("startHandAlignment");
        this.f36539l = true;
        f fVar = this.f36537j;
        if (fVar == null) {
            s.m("watchHandController");
            throw null;
        }
        this.f36538k.a(fVar.e().j(r03.a.a()).g(r03.a.a()).h(new com.mapbox.maps.renderer.e(new en0.d(this, 0), 16), new com.mapbox.maps.renderer.e(new en0.d(this, 7), 19)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        da2.d.b().f58886a.b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        da2.d.b().f58886a.i(this);
        if (!this.f36539l || this.f36540m) {
            return;
        }
        ca();
    }

    @Override // vd2.h
    public final void x0(Throwable th3) {
        Toast.makeText(this, getString(R.string.txt_error_occurred), 0).show();
        finish();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandAlignmentCameraActivity$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "INVALID_UNIT_ID", "J", "HAND_ALIGNMENT_START_DELAY", "HAND_ALIGNMENT_SUCCESS_DELAY", "MANUAL_BUTTON_APPEAR_DELAY", "", "WATCH_DETECT_CIRCLE_RATIO", "F", "WATCH_DETECT_RECT_RATIO", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
