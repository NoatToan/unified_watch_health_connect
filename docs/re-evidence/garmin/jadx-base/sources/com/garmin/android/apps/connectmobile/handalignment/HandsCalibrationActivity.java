package com.garmin.android.apps.connectmobile.handalignment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Bundle;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b00.g;
import c22.l1;
import com.airbnb.lottie.LottieAnimationView;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIHandCalibration;
import com.google.android.material.tabs.TabLayout;
import com.nimbusds.jose.jwk.JWKParameterNames;
import en0.h;
import en0.j;
import en0.k;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandsCalibrationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lla2/a;", "<init>", "()V", "a", "b", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HandsCalibrationActivity extends com.garmin.android.apps.connectmobile.c implements la2.a {
    public static final Logger A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f36565z = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f36566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f36567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y03.e f36569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f36571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GDIHandCalibration.HandType f36572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f36573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<View> f36574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BubbleLayout f36575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f36576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f36577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f36578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f36579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f36580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LottieAnimationView f36581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TabLayout f36582q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f36584t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DeviceProfile f36585v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f36586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f36587x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f36583r = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f36588y = m.b(new e40.d(this, 4));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandsCalibrationActivity$b;", "T", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f36589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f36590b;

        public b(T t7, T t14) {
            this.f36589a = t7;
            this.f36590b = t14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f36589a, bVar.f36589a) && s.g(this.f36590b, bVar.f36590b);
        }

        public final int hashCode() {
            T t7 = this.f36589a;
            int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
            T t14 = this.f36590b;
            return iHashCode + (t14 != null ? t14.hashCode() : 0);
        }

        public final String toString() {
            return "Point(x=" + this.f36589a + ", y=" + this.f36590b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/HandsCalibrationActivity$c", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements TabLayout.OnTabSelectedListener {
        public c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            int position = tab.getPosition();
            HandsCalibrationActivity handsCalibrationActivity = HandsCalibrationActivity.this;
            if (position == 0) {
                TextView textView = handsCalibrationActivity.f36577l;
                if (textView == null) {
                    s.m("hint");
                    throw null;
                }
                String string = handsCalibrationActivity.getString(R.string.message_teach_hands_calibration_minute);
                string.getClass();
                textView.setText(l1.a(string));
                handsCalibrationActivity.f36572g = GDIHandCalibration.HandType.MINUTE;
            } else {
                if (position != 1) {
                    HandsCalibrationActivity.A.error("Invalid tab position.");
                    return;
                }
                TextView textView2 = handsCalibrationActivity.f36577l;
                if (textView2 == null) {
                    s.m("hint");
                    throw null;
                }
                String string2 = handsCalibrationActivity.getString(R.string.message_teach_hands_calibration_hour);
                string2.getClass();
                textView2.setText(l1.a(string2));
                handsCalibrationActivity.f36572g = GDIHandCalibration.HandType.HOUR;
            }
            handsCalibrationActivity.f36566a = null;
            handsCalibrationActivity.f36567b = 0.0d;
            handsCalibrationActivity.f36568c = 0;
            handsCalibrationActivity.f36569d = null;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/HandsCalibrationActivity$d", "Landroid/animation/AnimatorListenerAdapter;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f36592d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set<String> f36593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HandsCalibrationActivity f36594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f36595c;

        public d(Set<String> set, HandsCalibrationActivity handsCalibrationActivity, LottieAnimationView lottieAnimationView) {
            this.f36593a = set;
            this.f36594b = handsCalibrationActivity;
            this.f36595c = lottieAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            l.f68084a.getClass();
            l lVarA = l.a.a();
            HandsCalibrationActivity handsCalibrationActivity = this.f36594b;
            String strValueOf = String.valueOf(handsCalibrationActivity.f36583r);
            Set<String> set = this.f36593a;
            set.add(strValueOf);
            lVarA.T(set);
            if (handsCalibrationActivity.f36586w) {
                LottieAnimationView lottieAnimationView = this.f36595c;
                lottieAnimationView.postDelayed(new df.d(4, handsCalibrationActivity, lottieAnimationView), 500L);
            }
            handsCalibrationActivity.da();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        A = gt2.b.f79005a.h("HandsCalibrationActivity");
    }

    public final void ca() {
        f fVar = this.f36571f;
        if (fVar == null) {
            s.m("watchHandController");
            throw null;
        }
        fVar.a().k(r03.a.a()).i(new com.mapbox.maps.renderer.e(new en0.l(this, 0), 26), new j(this, 1));
    }

    public final void da() {
        ArrayList<View> arrayList = this.f36574i;
        if (arrayList == null) {
            s.m("tabTouchables");
            throw null;
        }
        Iterator<View> it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            View next = it.next();
            next.getClass();
            next.setClickable(true);
        }
        TabLayout tabLayout = this.f36582q;
        if (tabLayout == null) {
            s.m("handTypeTab");
            throw null;
        }
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new c());
        ImageView imageView = this.f36576k;
        if (imageView == null) {
            s.m("wheel");
            throw null;
        }
        imageView.setEnabled(true);
        ImageView imageView2 = this.f36576k;
        if (imageView2 == null) {
            s.m("wheel");
            throw null;
        }
        imageView2.setOnTouchListener(new g(this, 3));
        ImageView imageView3 = this.f36578m;
        if (imageView3 == null) {
            s.m("plus");
            throw null;
        }
        imageView3.setEnabled(true);
        ImageView imageView4 = this.f36578m;
        if (imageView4 == null) {
            s.m("plus");
            throw null;
        }
        final int i14 = 1;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: en0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HandsCalibrationActivity f64703b;

            {
                this.f64703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                HandsCalibrationActivity handsCalibrationActivity = this.f64703b;
                switch (i15) {
                    case 0:
                        MenuItem menuItem = handsCalibrationActivity.f36573h;
                        if (menuItem == null) {
                            p005kotlin.jvm.internal.s.m("saveMenuItem");
                            throw null;
                        }
                        if (menuItem.isEnabled()) {
                            new androidx.appcompat.app.e.a(handsCalibrationActivity).setTitle(R.string.hand_alignment_camera_mode_dialog_title).setMessage(R.string.hand_alignment_camera_mode_dialog_message).setPositiveButton(R.string.lbl_common_continue, new k(handsCalibrationActivity, 2)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
                            return;
                        } else if (handsCalibrationActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
                            handsCalibrationActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 232);
                            return;
                        } else {
                            handsCalibrationActivity.fa();
                            return;
                        }
                    case 1:
                        HandsCalibrationActivity.a aVar = HandsCalibrationActivity.f36565z;
                        handsCalibrationActivity.f36568c++;
                        handsCalibrationActivity.ea();
                        return;
                    default:
                        HandsCalibrationActivity.a aVar2 = HandsCalibrationActivity.f36565z;
                        handsCalibrationActivity.f36568c--;
                        handsCalibrationActivity.ea();
                        return;
                }
            }
        });
        ImageView imageView5 = this.f36579n;
        if (imageView5 == null) {
            s.m("minus");
            throw null;
        }
        imageView5.setEnabled(true);
        ImageView imageView6 = this.f36579n;
        if (imageView6 == null) {
            s.m("minus");
            throw null;
        }
        final int i15 = 2;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: en0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HandsCalibrationActivity f64703b;

            {
                this.f64703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                HandsCalibrationActivity handsCalibrationActivity = this.f64703b;
                switch (i16) {
                    case 0:
                        MenuItem menuItem = handsCalibrationActivity.f36573h;
                        if (menuItem == null) {
                            p005kotlin.jvm.internal.s.m("saveMenuItem");
                            throw null;
                        }
                        if (menuItem.isEnabled()) {
                            new androidx.appcompat.app.e.a(handsCalibrationActivity).setTitle(R.string.hand_alignment_camera_mode_dialog_title).setMessage(R.string.hand_alignment_camera_mode_dialog_message).setPositiveButton(R.string.lbl_common_continue, new k(handsCalibrationActivity, 2)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
                            return;
                        } else if (handsCalibrationActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
                            handsCalibrationActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 232);
                            return;
                        } else {
                            handsCalibrationActivity.fa();
                            return;
                        }
                    case 1:
                        HandsCalibrationActivity.a aVar = HandsCalibrationActivity.f36565z;
                        handsCalibrationActivity.f36568c++;
                        handsCalibrationActivity.ea();
                        return;
                    default:
                        HandsCalibrationActivity.a aVar2 = HandsCalibrationActivity.f36565z;
                        handsCalibrationActivity.f36568c--;
                        handsCalibrationActivity.ea();
                        return;
                }
            }
        });
        ImageView imageView7 = this.f36580o;
        if (imageView7 == null) {
            s.m("camera");
            throw null;
        }
        imageView7.setEnabled(true);
        ImageView imageView8 = this.f36580o;
        if (imageView8 == null) {
            s.m("camera");
            throw null;
        }
        final int i16 = 0;
        imageView8.setOnClickListener(new View.OnClickListener(this) { // from class: en0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HandsCalibrationActivity f64703b;

            {
                this.f64703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                HandsCalibrationActivity handsCalibrationActivity = this.f64703b;
                switch (i17) {
                    case 0:
                        MenuItem menuItem = handsCalibrationActivity.f36573h;
                        if (menuItem == null) {
                            p005kotlin.jvm.internal.s.m("saveMenuItem");
                            throw null;
                        }
                        if (menuItem.isEnabled()) {
                            new androidx.appcompat.app.e.a(handsCalibrationActivity).setTitle(R.string.hand_alignment_camera_mode_dialog_title).setMessage(R.string.hand_alignment_camera_mode_dialog_message).setPositiveButton(R.string.lbl_common_continue, new k(handsCalibrationActivity, 2)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
                            return;
                        } else if (handsCalibrationActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
                            handsCalibrationActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 232);
                            return;
                        } else {
                            handsCalibrationActivity.fa();
                            return;
                        }
                    case 1:
                        HandsCalibrationActivity.a aVar = HandsCalibrationActivity.f36565z;
                        handsCalibrationActivity.f36568c++;
                        handsCalibrationActivity.ea();
                        return;
                    default:
                        HandsCalibrationActivity.a aVar2 = HandsCalibrationActivity.f36565z;
                        handsCalibrationActivity.f36568c--;
                        handsCalibrationActivity.ea();
                        return;
                }
            }
        });
    }

    public final void ea() {
        int i14 = this.f36568c;
        if (this.f36569d != null || i14 == 0) {
            return;
        }
        this.f36568c = 0;
        MenuItem menuItem = this.f36573h;
        if (menuItem == null) {
            s.m("saveMenuItem");
            throw null;
        }
        menuItem.setEnabled(true);
        f fVar = this.f36571f;
        if (fVar == null) {
            s.m("watchHandController");
            throw null;
        }
        GDIHandCalibration.HandType handType = this.f36572g;
        if (handType != null) {
            this.f36569d = fVar.g(handType, i14).j(r03.a.a()).g(r03.a.a()).h(new com.mapbox.maps.renderer.e(new en0.l(this, 1), 27), new com.mapbox.maps.renderer.e(new en0.l(this, 2), 28));
        } else {
            s.m("handType");
            throw null;
        }
    }

    public final void fa() {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        DeviceProfile deviceProfile = this.f36585v;
        if (deviceProfile == null) {
            s.m("deviceProfile");
            throw null;
        }
        Size sizeA = vd2.f.a(h.a(deviceProfile.getF92744h()));
        Object systemService = getSystemService("camera");
        systemService.getClass();
        CameraManager cameraManager = (CameraManager) systemService;
        String[] cameraIdList = cameraManager.getCameraIdList();
        cameraIdList.getClass();
        for (String str : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            cameraCharacteristics.getClass();
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null) {
                A.debug("checkMinCameraResolution: ".concat(u.P(outputSizes, null, null, null, null, 63)));
                for (Size size : outputSizes) {
                    if (size.getHeight() >= sizeA.getHeight()) {
                        this.f36587x = true;
                        HandAlignmentCameraActivity.b bVar = HandAlignmentCameraActivity.f36526q;
                        long j8 = this.f36583r;
                        String str2 = this.f36584t;
                        bVar.getClass();
                        Intent intent = new Intent(this, (Class<?>) HandAlignmentCameraActivity.class);
                        intent.putExtra("GCM_deviceUnitID", j8);
                        intent.putExtra("GCM_deviceName", str2);
                        startActivity(intent);
                        finish();
                        return;
                    }
                }
            }
        }
        new androidx.appcompat.app.e.a(this).setTitle(R.string.hand_alignment_camera_low_resolution_dialog_title).setMessage(R.string.hand_alignment_camera_low_resolution_dialog_message).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).create().show();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        MenuItem menuItem = this.f36573h;
        if (menuItem == null) {
            s.m("saveMenuItem");
            throw null;
        }
        if (menuItem.isEnabled()) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.message_common_confirm_leaving_screen).setPositiveButton(R.string.lbl_yes, new k(this, 3)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
        } else {
            ca();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        super.onCreate(bundle);
        setContentView(R.layout.activity_hands_calibration);
        initActionBar(R.string.device_settings_hands_calibration, 3);
        View viewFindViewById = findViewById(R.id.wheel);
        viewFindViewById.getClass();
        this.f36576k = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.hint);
        viewFindViewById2.getClass();
        this.f36577l = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.plus);
        viewFindViewById3.getClass();
        this.f36578m = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.minus);
        viewFindViewById4.getClass();
        this.f36579n = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.camera);
        viewFindViewById5.getClass();
        this.f36580o = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.animation_hint);
        viewFindViewById6.getClass();
        this.f36581p = (LottieAnimationView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.hand_type_tab);
        viewFindViewById7.getClass();
        this.f36582q = (TabLayout) viewFindViewById7;
        TextView textView = this.f36577l;
        if (textView == null) {
            s.m("hint");
            throw null;
        }
        String string = getString(R.string.message_teach_hands_calibration_minute);
        string.getClass();
        textView.setText(l1.a(string));
        this.f36572g = GDIHandCalibration.HandType.MINUTE;
        View viewFindViewById8 = findViewById(R.id.tooltip_container);
        viewFindViewById8.getClass();
        this.f36575j = (BubbleLayout) viewFindViewById8;
        TabLayout tabLayout = this.f36582q;
        if (tabLayout == null) {
            s.m("handTypeTab");
            throw null;
        }
        ArrayList<View> touchables = tabLayout.getTouchables();
        touchables.getClass();
        this.f36574i = touchables;
        Iterator<View> it = touchables.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next2 = it.next();
            next2.getClass();
            next2.setClickable(false);
        }
        ImageView imageView = this.f36576k;
        if (imageView == null) {
            s.m("wheel");
            throw null;
        }
        imageView.setEnabled(false);
        ImageView imageView2 = this.f36578m;
        if (imageView2 == null) {
            s.m("plus");
            throw null;
        }
        imageView2.setEnabled(false);
        ImageView imageView3 = this.f36579n;
        if (imageView3 == null) {
            s.m("minus");
            throw null;
        }
        imageView3.setEnabled(false);
        ImageView imageView4 = this.f36580o;
        if (imageView4 == null) {
            s.m("camera");
            throw null;
        }
        imageView4.setEnabled(false);
        long longExtra = getIntent() != null ? getIntent().getLongExtra("GCM_deviceUnitID", -1L) : -1L;
        this.f36583r = longExtra;
        Logger logger = A;
        if (longExtra == -1) {
            logger.debug("finish(). Invalid device unit ID.");
            finish();
            return;
        }
        Iterator it3 = da2.d.b().f58886a.f111646e.e().iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((DeviceProfile) next).getF92746j() != this.f36583r);
        DeviceProfile deviceProfile = (DeviceProfile) next;
        if (deviceProfile == null) {
            logger.debug("finish(). Device is not connected.");
            finish();
            return;
        }
        this.f36585v = deviceProfile;
        boolean zQ = l2.q(SupportedCapability.HAND_CALIBRATION_IMG_DETECT, deviceProfile.getConfigurationFlags());
        this.f36586w = zQ;
        ImageView imageView5 = this.f36580o;
        if (imageView5 == null) {
            s.m("camera");
            throw null;
        }
        imageView5.setVisibility(zQ ? 0 : 4);
        BubbleLayout bubbleLayout = this.f36575j;
        if (bubbleLayout == null) {
            s.m("cameraTooltip");
            throw null;
        }
        String string2 = getString(R.string.hand_alignment_camera_icon_hint);
        string2.getClass();
        og.a.Y(bubbleLayout, string2);
        l.f68084a.getClass();
        Set setF1 = h0.f1(l.a.a().S1());
        if (setF1.contains(String.valueOf(this.f36583r))) {
            da();
        } else {
            LottieAnimationView lottieAnimationView = this.f36581p;
            if (lottieAnimationView == null) {
                s.m("animationHint");
                throw null;
            }
            lottieAnimationView.addAnimatorListener(new d(setF1, this, lottieAnimationView));
            lottieAnimationView.playAnimation();
        }
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("GCM_deviceName") : null;
        this.f36584t = stringExtra;
        f.a aVar = f.f36613h;
        long j8 = this.f36583r;
        aVar.getClass();
        this.f36571f = f.a.a(j8, stringExtra);
        xy2.b.D("HandAlignmentStart", this.f36584t);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        menuItemFindItem.getClass();
        this.f36573h = menuItemFindItem;
        menuItemFindItem.setEnabled(false);
        return true;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (hVar.f111673a.getF92746j() != this.f36583r || isFinishing()) {
            return;
        }
        k kVar = new k(this, 5);
        f36565z.getClass();
        a.a(this, kVar);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.save_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        f fVar = this.f36571f;
        if (fVar == null) {
            s.m("watchHandController");
            throw null;
        }
        fVar.c().k(r03.a.a()).i(new com.mapbox.maps.renderer.e(new en0.l(this, 3), 29), new j(this, 2));
        return true;
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 != 232) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        if (iArr[0] == 0) {
            fa();
        } else if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            new androidx.appcompat.app.e.a(this).setTitle(R.string.hand_alignment_camera_permission_title).setMessage(R.string.hand_alignment_camera_permission_reason).setPositiveButton(R.string.lbl_ok, new k(this, 1)).setNegativeButton(R.string.common_do_not_allow, (DialogInterface.OnClickListener) null).create().show();
        } else {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.hand_alignment_camera_permission_rejected).setPositiveButton(R.string.lbl_settings, new k(this, 0)).setNegativeButton(R.string.lbl_close, (DialogInterface.OnClickListener) null).create().show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        da2.d.b().f58886a.b(this);
        if (this.f36570e) {
            k kVar = new k(this, 7);
            f36565z.getClass();
            a.a(this, kVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        da2.d.b().f58886a.i(this);
        if (!this.f36587x && !this.f36570e) {
            f fVar = this.f36571f;
            if (fVar == null) {
                s.m("watchHandController");
                throw null;
            }
            fVar.a().i(new com.mapbox.maps.renderer.e(new e70.a(11), 25), new j(this, 0));
        }
        y03.e eVar = this.f36569d;
        if (eVar != null) {
            v03.c.a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandsCalibrationActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "REQUEST_CAMERA_PERMISSION", "I", "", "CALIBRATION_COEFFICIENT", "D", "", "OUTER_RING_RATIO", "F", "INNER_RING_RATIO", "", "INVALID_UNIT_ID", "J", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, DialogInterface.OnClickListener onClickListener) {
            context.getClass();
            new androidx.appcompat.app.e.a(context).setTitle(R.string.connect_iq_device_not_connected_title).setMessage(R.string.message_hands_carlibation_device_not_connected).setPositiveButton(R.string.lbl_ok, onClickListener).setOnCancelListener(new en0.m(onClickListener, 0)).create().show();
        }

        private a() {
        }
    }
}
