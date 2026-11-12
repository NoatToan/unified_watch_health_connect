package com.garmin.android.apps.connectmobile.handalignment;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import ds.e0;
import java.util.Arrays;
import java.util.Iterator;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import vd2.g;
import vd2.h;
import vd2.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandAlignmentCameraDebugActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lvd2/h;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClickStartDetection", "(Landroid/view/View;)V", "a", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"SetTextI18n"})
public final class HandAlignmentCameraDebugActivity extends com.garmin.android.apps.connectmobile.c implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f36551n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd2.b f36552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f36553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f36554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f36555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f36556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f36557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f36558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f36559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListView f36560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayAdapter<String> f36561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f36563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f36564m;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f36551n = gt2.b.f79005a.h("HandAlignment");
    }

    public HandAlignmentCameraDebugActivity() {
        g gVar = new g();
        gVar.f177512e.set(this);
        this.f36564m = gVar;
        new Handler();
    }

    @Override // vd2.h
    public final void W4(Size size, float f14) {
        size.getClass();
        float f15 = (Resources.getSystem().getDisplayMetrics().widthPixels * 0.82857144f) / f14;
        float width = f15 / size.getWidth();
        float height = f15 / size.getHeight();
        ca("Watch detecting rect = " + ((int) f15));
        this.f36564m.f177514g.setCropRegionSizeRatio(width, height);
        TextView textView = this.f36553b;
        if (textView == null) {
            s.m("frameSizeText");
            throw null;
        }
        textView.setText("Frame Size: " + size.getWidth() + "x" + size.getHeight());
    }

    public final void ca(String str) {
        f36551n.debug("HandAlignment", str);
        ArrayAdapter<String> arrayAdapter = this.f36561j;
        if (arrayAdapter != null) {
            arrayAdapter.add(String.format("%s %s", Arrays.copyOf(new Object[]{DateTime.now().toString("HH:mm:ss.SSS"), str}, 2)));
        } else {
            s.m("logAdapter");
            throw null;
        }
    }

    public final void da(boolean z14) {
        if (this.f36562k != z14) {
            g gVar = this.f36564m;
            if (!z14) {
                this.f36562k = false;
                gVar.f177513f.set(false);
                gVar.f177514g.clearRecordingData();
                TextView textView = this.f36557f;
                if (textView == null) {
                    s.m("buttonStart");
                    throw null;
                }
                textView.setText("Start");
                ca("Stop");
                return;
            }
            ArrayAdapter<String> arrayAdapter = this.f36561j;
            if (arrayAdapter == null) {
                s.m("logAdapter");
                throw null;
            }
            arrayAdapter.clear();
            this.f36562k = true;
            this.f36563l = 0L;
            gVar.f177514g.initialize(gVar.f177511d.ordinal());
            gVar.f177513f.set(true);
            TextView textView2 = this.f36557f;
            if (textView2 == null) {
                s.m("buttonStart");
                throw null;
            }
            textView2.setText("Stop");
            Size size = gVar.f177510c;
            String strD = size != null ? j.d(size.getWidth(), size.getHeight(), "x") : null;
            TextView textView3 = this.f36553b;
            if (textView3 == null) {
                s.m("frameSizeText");
                throw null;
            }
            textView3.setText("Frame Size: " + strD);
            ca("Start");
        }
    }

    @Override // vd2.h
    public final void k4(i iVar) {
        i.c cVar = iVar.f177518b;
        float f14 = cVar.f177537c;
        float f15 = cVar.f177536b;
        i.b bVar = cVar.f177535a;
        i.a aVar = iVar.f177517a;
        i.b bVar2 = aVar.f177519a;
        if (isFinishing()) {
            return;
        }
        ImageView imageView = this.f36558g;
        if (imageView == null) {
            s.m("debugImage");
            throw null;
        }
        imageView.setImageBitmap(aVar.f177523e);
        long j8 = aVar.f177522d;
        long j14 = this.f36563l + j8;
        this.f36563l = j14;
        String strI = am.j.i(j14, " ms)", e0.k(j8, "Time: ", " ms (total: "));
        TextView textView = this.f36554c;
        if (textView == null) {
            s.m("timeSpentText");
            throw null;
        }
        textView.setText(strI);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strI);
        x0 x0Var = x0.f105818a;
        sb3.append(String.format("\n[Frame] code: %12s, hour: %5.1f, minute: %5.1f", Arrays.copyOf(new Object[]{bVar2.name(), Float.valueOf(aVar.f177520b), Float.valueOf(aVar.f177521c)}, 3)));
        sb3.append(String.format("\n[vote]  code: %12s, hour: %5.1f, minute: %5.1f", Arrays.copyOf(new Object[]{bVar.name(), Float.valueOf(f15), Float.valueOf(f14)}, 3)));
        ca(sb3.toString());
        TextView textView2 = this.f36555d;
        if (textView2 == null) {
            s.m("statusText");
            throw null;
        }
        textView2.setText(bVar2.toString());
        i.b bVar3 = i.b.Success;
        if (bVar2 == bVar3) {
            ImageView imageView2 = this.f36556e;
            if (imageView2 == null) {
                s.m("watchFaceCircle");
                throw null;
            }
            imageView2.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_green));
        } else {
            int iOrdinal = bVar2.ordinal();
            int iOrdinal2 = i.b.NoFaceCircle.ordinal();
            ImageView imageView3 = this.f36556e;
            if (iOrdinal > iOrdinal2) {
                if (imageView3 == null) {
                    s.m("watchFaceCircle");
                    throw null;
                }
                imageView3.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_yellow));
            } else {
                if (imageView3 == null) {
                    s.m("watchFaceCircle");
                    throw null;
                }
                imageView3.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_gray));
            }
        }
        if (bVar == bVar3) {
            TextView textView3 = this.f36555d;
            if (textView3 == null) {
                s.m("statusText");
                throw null;
            }
            q6.f.y(new Object[]{Float.valueOf(f15), Float.valueOf(f14)}, 2, "Finished\nhour = %.1f, minute = %.1f", textView3);
            ImageView imageView4 = this.f36556e;
            if (imageView4 == null) {
                s.m("watchFaceCircle");
                throw null;
            }
            imageView4.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_green));
            da(false);
            return;
        }
        if (bVar == i.b.HandTooClose || bVar == i.b.HandTooCloseInv || bVar == i.b.HandOverlap || bVar == i.b.HandOverlapInv) {
            TextView textView4 = this.f36555d;
            if (textView4 == null) {
                s.m("statusText");
                throw null;
            }
            textView4.setText(bVar.toString());
            ImageView imageView5 = this.f36556e;
            if (imageView5 == null) {
                s.m("watchFaceCircle");
                throw null;
            }
            imageView5.setImageDrawable(a7.b.getDrawable(this, R.drawable.hand_alignment_circle_contour_green));
            da(false);
        }
    }

    public final void onClickStartDetection(View view2) {
        view2.getClass();
        da(!this.f36562k);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        da2.b bVar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_hand_alignment_camera_debug);
        Iterator it = da2.d.c(this).f58886a.f111646e.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                bVar = da2.d.b().f58886a.f111646e;
                bVar.getClass();
            }
        } while (!zf.b.C(bVar, ((DeviceProfile) next).getF92746j(), SupportedCapability.HAND_CALIBRATION_IMG_DETECT));
        DeviceProfile deviceProfile = (DeviceProfile) next;
        g gVar = this.f36564m;
        if (deviceProfile != null) {
            f.a aVar = f.f36613h;
            long f92746j = deviceProfile.getF92746j();
            String deviceFullName = deviceProfile.getDeviceFullName();
            aVar.getClass();
            this.f36559h = f.a.a(f92746j, deviceFullName);
            vd2.e eVarA = en0.h.a(deviceProfile.getF92744h());
            gVar.getClass();
            eVarA.getClass();
            gVar.f177511d = eVarA;
        } else {
            Toast.makeText(this, "No supported device found.", 1).show();
        }
        View viewFindViewById = findViewById(R.id.button_start);
        viewFindViewById.getClass();
        this.f36557f = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.frame_size);
        viewFindViewById2.getClass();
        this.f36553b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.time_spent);
        viewFindViewById3.getClass();
        this.f36554c = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.status_text);
        viewFindViewById4.getClass();
        this.f36555d = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.watch_face_circle);
        viewFindViewById5.getClass();
        this.f36556e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.debug_image);
        viewFindViewById6.getClass();
        this.f36558g = (ImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.hand_alignment_log);
        viewFindViewById7.getClass();
        this.f36560i = (ListView) viewFindViewById7;
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.hand_alignment_log_item);
        this.f36561j = arrayAdapter;
        ListView listView = this.f36560i;
        if (listView == null) {
            s.m("statusView");
            throw null;
        }
        listView.setAdapter((ListAdapter) arrayAdapter);
        if (a7.b.checkSelfPermission(this, "android.permission.CAMERA") == -1) {
            z6.a.a(this, new String[]{"android.permission.CAMERA"}, 232);
        } else if (bundle == null) {
            vd2.b bVarA = vd2.b.a.a(vd2.b.f177472p, gVar);
            bVarA.f177478c = new Size(-1, -1);
            this.f36552a = bVarA;
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            vd2.b bVar2 = this.f36552a;
            if (bVar2 == null) {
                s.m("fragment");
                throw null;
            }
            aVarB.l(R.id.container, bVar2, null);
            aVarB.e();
        }
        f fVar = this.f36559h;
        if (fVar != null) {
            ca("Enter hand alignment mode");
            fVar.e().j(r03.a.a()).g(r03.a.a()).h(new com.mapbox.maps.renderer.e(new en0.g(this, 0), 23), new com.mapbox.maps.renderer.e(new en0.g(this, 1), 24));
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        this.f36564m.f177503a.quitSafely();
        f fVar = this.f36559h;
        if (fVar != null) {
            fVar.a().k(r03.a.a()).i(new com.mapbox.maps.renderer.e(new e70.a(10), 22), new e0(9));
        }
        super.onDestroy();
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
            this.f36552a = vd2.b.a.a(vd2.b.f177472p, this.f36564m);
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            vd2.b bVar = this.f36552a;
            if (bVar == null) {
                s.m("fragment");
                throw null;
            }
            aVarB.l(R.id.container, bVar, null);
            aVarB.e();
        }
    }

    @Override // vd2.h
    public final void x0(Throwable th3) {
        String message = th3.getMessage();
        if (message == null) {
            message = getString(R.string.txt_error_occurred);
            message.getClass();
        }
        Toast.makeText(this, message, 1).show();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/HandAlignmentCameraDebugActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CAMERA_PERMISSION", "I", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
