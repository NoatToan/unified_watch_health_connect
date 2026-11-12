package l0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.ImageWriter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.media3.common.q;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b0.c1;
import b0.g1;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.ImportantThingsFragment;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailFragment;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.simplecropimage.CropImage;
import com.garmin.android.apps.connectmobile.util.simplecropimage.CropImageView;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.yalantis.ucrop.view.GestureCropImageView;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import n12.c0;
import nf0.z;
import o62.b0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;
import ps2.r;
import ps2.u;
import ps2.w;
import v.r2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107800c;

    public /* synthetic */ e(u uVar, long j8, hs2.e.a aVar) {
        this.f107798a = 25;
        this.f107799b = uVar;
        this.f107800c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        GoogleMap googleMap;
        int i14 = this.f107798a;
        int i15 = 2;
        outputStreamOpenOutputStream = null;
        outputStreamOpenOutputStream = null;
        OutputStream outputStreamOpenOutputStream = null;
        char c14 = 1;
        int i16 = 0;
        Object obj = this.f107800c;
        Object obj2 = this.f107799b;
        switch (i14) {
            case 0:
                j.a aVar = j.f107810a;
                ((androidx.concurrent.futures.b.a) obj2).b(null);
                ((androidx.concurrent.futures.b.d) obj).cancel(true);
                return;
            case 1:
                DefaultDrmSessionManager.e eVar = (DefaultDrmSessionManager.e) obj2;
                q qVar = (q) obj;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f8866p == 0 || eVar.f8886c) {
                    return;
                }
                Looper looper = defaultDrmSessionManager.f8870t;
                looper.getClass();
                eVar.f8885b = defaultDrmSessionManager.e(looper, eVar.f8884a, qVar, false);
                defaultDrmSessionManager.f8864n.add(eVar);
                return;
            case 2:
                ((cq0.j) obj2).q((lq0.c.C2177c) obj);
                return;
            case 3:
                ((lv.a) obj2).f115021b.Z3((dk2.d) obj);
                return;
            case 4:
                m9.b bVar = (m9.b) obj2;
                m9.f fVar = (m9.f) obj;
                int i17 = m9.b.f117215c;
                bVar.getClass();
                try {
                    String string = bVar.f117216a.getSharedPreferences("PermissionTokenManager.healthdata", 0).getString("token", null);
                    if (string == null) {
                        string = "";
                    }
                    fVar.c(string);
                    return;
                } catch (RemoteException e4) {
                    e4.getMessage();
                    return;
                }
            case 5:
                ma.l.this.f117530b.n(((ma.j) obj).f117515m);
                return;
            case 6:
                me2.l lVar = (me2.l) obj2;
                CameraUpdate cameraUpdate = (CameraUpdate) obj;
                MapView mapView = lVar.f118186t;
                Context context = mapView != null ? mapView.getContext() : null;
                if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                    return;
                }
                if (lVar.f50240a && (googleMap = lVar.f118187v) != null) {
                    googleMap.setOnMapLoadedCallback(new com.google.maps.android.compose.o(lVar, c14 == true ? 1 : 0));
                }
                GoogleMap googleMap2 = lVar.f118187v;
                if (googleMap2 != null) {
                    googleMap2.moveCamera(cameraUpdate);
                    return;
                }
                return;
            case 7:
                GroupDetailFragment groupDetailFragment = (GroupDetailFragment) obj2;
                com.garmin.android.apps.connectmobile.group.details.b bVar2 = new com.garmin.android.apps.connectmobile.group.details.b(groupDetailFragment, (GroupDetailsDTO) obj);
                groupDetailFragment.f36158a = bVar2;
                ViewPager2 viewPager2 = groupDetailFragment.f36159b;
                if (viewPager2 == null) {
                    s.m("viewPager");
                    throw null;
                }
                viewPager2.setAdapter(bVar2);
                ViewPager2 viewPager3 = groupDetailFragment.f36159b;
                if (viewPager3 == null) {
                    s.m("viewPager");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.group.details.b bVar3 = groupDetailFragment.f36158a;
                if (bVar3 == null) {
                    s.m("adapter");
                    throw null;
                }
                viewPager3.setOffscreenPageLimit(bVar3.f36267k.size());
                TabLayout tabLayout = groupDetailFragment.f36160c;
                if (tabLayout == null) {
                    s.m("tabLayout");
                    throw null;
                }
                ViewPager2 viewPager4 = groupDetailFragment.f36159b;
                if (viewPager4 != null) {
                    new TabLayoutMediator(tabLayout, viewPager4, new lp2.h(groupDetailFragment, 25)).attach();
                    return;
                } else {
                    s.m("viewPager");
                    throw null;
                }
            case 8:
                ((r2) obj2).onImageReleased((ImageWriter) obj);
                return;
            case 9:
                Toast.makeText(((n00.e) obj2).f122101b, "received push notification: " + ((String) obj), 1).show();
                return;
            case 10:
                int i18 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
                ((com.garmin.android.apps.connectmobile.userprofile.editimage.c) obj2).b((Uri) obj);
                return;
            case 11:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) obj2;
                com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.c) obj;
                gestureCropImageView.zoomInImage(gestureCropImageView.getMinScale());
                gestureCropImageView.setImageToWrapCropBounds(false);
                cVar.f46659b.b();
                ge1.b.T(cVar, null, null, new c0(cVar, null), 3);
                return;
            case 12:
                CropImage cropImage = (CropImage) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Uri uri = cropImage.f47292c;
                try {
                    if (uri != null) {
                        try {
                            outputStreamOpenOutputStream = cropImage.f47301l.openOutputStream(uri);
                            if (outputStreamOpenOutputStream != null) {
                                bitmap.compress(cropImage.f47291b, 90, outputStreamOpenOutputStream);
                            }
                            if (outputStreamOpenOutputStream != null) {
                                try {
                                    outputStreamOpenOutputStream.close();
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                            Bundle bundle = new Bundle();
                            Intent intent = new Intent(cropImage.f47292c.toString());
                            intent.putExtras(bundle);
                            intent.putExtra("image-path", cropImage.f47303n);
                            int rotation = cropImage.getWindowManager().getDefaultDisplay().getRotation();
                            if (rotation != 0) {
                                if (rotation == 1) {
                                    i16 = 90;
                                } else if (rotation == 2) {
                                    i16 = 180;
                                } else if (rotation == 3) {
                                    i16 = 270;
                                }
                            }
                            intent.putExtra("orientation_in_degrees", i16);
                            cropImage.setResult(-1, intent);
                            break;
                        } catch (IOException e14) {
                            i2.i("CropImage", "Cannot open file: " + cropImage.f47292c + " : " + e14.getMessage());
                            cropImage.setResult(0);
                            cropImage.finish();
                            if (outputStreamOpenOutputStream == null) {
                                return;
                            }
                            try {
                                outputStreamOpenOutputStream.close();
                                return;
                            } catch (Throwable unused2) {
                                return;
                            }
                        }
                    } else {
                        i2.i("CropImage", "not defined image url");
                    }
                    bitmap.recycle();
                    cropImage.finish();
                    return;
                } catch (Throwable th3) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                            break;
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th3;
                }
            case 13:
                CropImage cropImage2 = (CropImage) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                Bitmap bitmap2 = cropImage2.f47302m;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    CropImageView cropImageView = cropImage2.f47300k;
                    Bitmap bitmap3 = cropImage2.f47302m;
                    cropImageView.getClass();
                    cropImageView.f(new n22.d(bitmap3));
                }
                if (cropImage2.f47300k.getScale() == 1.0f) {
                    cropImage2.f47300k.c();
                }
                countDownLatch.countDown();
                return;
            case 14:
                int i19 = com.garmin.android.apps.connectmobile.util.simplecropimage.c.f47349o;
                ((com.garmin.android.apps.connectmobile.util.simplecropimage.c) obj2).f((n22.d) obj);
                return;
            case 15:
                androidx.media3.exoplayer.hls.playlist.a.c cVar2 = (androidx.media3.exoplayer.hls.playlist.a.c) obj2;
                cVar2.f9082i = false;
                cVar2.d((Uri) obj);
                return;
            case 16:
                ((na2.a) obj2).b((na2.a.InterfaceC2413a) obj);
                return;
            case 17:
                z zVar = (z) obj2;
                int i24 = z.f125870h;
                zVar.w6().setEnabled(zVar.y6().getHeight() >= ((LinearLayout) obj).getHeight());
                return;
            case 18:
                int i25 = ImportantThingsFragment.f34805k;
                ((ImportantThingsFragment) obj2).y6().scrollTo(0, ((View) obj).getTop());
                return;
            case 19:
                int i26 = p53.b.f136184e;
                ((o53.k) obj2).F((p53.b) obj, Unit.INSTANCE);
                return;
            case 20:
                ie2.c cVar3 = (ie2.c) obj;
                int i27 = po.h.E1;
                ((qe2.h) obj2).V(cVar3.f93111a, (float) cVar3.f93114d, 2000);
                return;
            case 21:
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                po.h.a aVar2 = ((po.k) obj2).f138918g;
                if (aVar2 != null) {
                    aVar2.b(dVar);
                    return;
                }
                return;
            case 22:
                ((RecyclerView) obj2).scrollToPosition(((p0) obj).f105807a);
                return;
            case 23:
                ((r) obj2).k4((hs2.b) obj);
                return;
            case 24:
                ps2.n nVar = (ps2.n) obj2;
                hs2.a aVar3 = (hs2.a) obj;
                if (s.g(nVar.f140498a, aVar3)) {
                    return;
                }
                nVar.f140498a = aVar3;
                nVar.k();
                HashSet<ms2.d> hashSetC = nVar.c();
                if (hashSetC.isEmpty()) {
                    return;
                }
                nVar.o(hs2.b.CONNECTING);
                CountDownLatch countDownLatch2 = new CountDownLatch(hashSetC.size());
                for (ms2.d dVar2 : hashSetC) {
                    nVar.f140508k.put(dVar2.getF205815a(), dVar2);
                    dVar2.c(nVar.f140507j, new ps2.b(nVar, dVar2, countDownLatch2, i15));
                }
                countDownLatch2.await();
                return;
            case 25:
                w wVar = w.f140538a;
                ((u) obj2).getClass();
                ((hs2.e.a) obj).getClass();
                return;
            case 26:
                ((qm2.b) obj2).f145657b.K((bm2.d) obj);
                return;
            case 27:
                r0.e eVar2 = (r0.e) obj2;
                c1 c1Var = (c1) obj;
                Surface surfaceV0 = c1Var.V0(eVar2.f148709c, new m0.c(i15, eVar2, c1Var));
                eVar2.f148707a.g(surfaceV0);
                eVar2.f148714h.put(c1Var, surfaceV0);
                return;
            case 28:
                ((r0.e) obj2).f148717k.add((r0.a) obj);
                return;
            default:
                r0.e eVar3 = (r0.e) obj2;
                g1 g1Var = (g1) obj;
                eVar3.f148715i++;
                r0.j jVar = eVar3.f148707a;
                t0.d.d(true, jVar.f148726a);
                t0.d.c(jVar.f148728c);
                SurfaceTexture surfaceTexture = new SurfaceTexture(jVar.f148738m);
                Size size = g1Var.f13906b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                k0.d dVar3 = eVar3.f148709c;
                g1Var.c(dVar3, new b0(9, eVar3, g1Var));
                g1Var.b(surface, dVar3, new r0.d(eVar3, g1Var, surfaceTexture, surface, 0));
                surfaceTexture.setOnFrameAvailableListener(eVar3, eVar3.f148710d);
                return;
        }
    }

    public /* synthetic */ e(int i14, Object obj, Object obj2) {
        this.f107798a = i14;
        this.f107799b = obj;
        this.f107800c = obj2;
    }
}
