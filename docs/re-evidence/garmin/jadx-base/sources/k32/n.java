package k32;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.os.RemoteException;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.NumberPicker;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.ui.PlayerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.l3;
import c22.q3;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.map.ActivityMapActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.a0;
import com.garmin.android.apps.connectmobile.util.simplecropimage.CropImage;
import com.garmin.android.apps.connectmobile.util.simplecropimage.CropImageView;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import ml2.i0;
import mt0.i2;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.concurrent.TimedSemaphore;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102714b;

    public /* synthetic */ n(Object obj, int i14) {
        this.f102713a = i14;
        this.f102714b = obj;
    }

    private final void a() {
        pa.c cVar = (pa.c) this.f102714b;
        synchronized (cVar.f136683a) {
            try {
                if (cVar.f136695m) {
                    return;
                }
                long j8 = cVar.f136694l - 1;
                cVar.f136694l = j8;
                if (j8 > 0) {
                    return;
                }
                if (j8 >= 0) {
                    cVar.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (cVar.f136683a) {
                    cVar.f136696n = illegalStateException;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:261:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0139 A[Catch: all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00c3, blocks: (B:35:0x0095, B:36:0x00a4, B:39:0x00a8, B:41:0x00ae, B:44:0x00bd, B:51:0x00ca, B:52:0x00e0, B:56:0x00e6, B:58:0x00f7, B:62:0x0122, B:66:0x0130, B:67:0x0131, B:68:0x0133, B:72:0x0139, B:77:0x0142, B:69:0x0134, B:70:0x0136), top: B:269:0x0075, inners: #0 }] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z14;
        int i14;
        int i15;
        na2.a.InterfaceC2413a interfaceC2413a;
        na2.a.InterfaceC2413a interfaceC2413a2;
        na2.a.InterfaceC2413a interfaceC2413a3;
        qe2.h hVar;
        boolean z15 = true;
        switch (this.f102713a) {
            case 0:
                ((NestedScrollView) this.f102714b).f(130);
                return;
            case 1:
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f102714b;
                if (defaultAudioSink.f8692h0 >= 300000) {
                    androidx.media3.exoplayer.audio.f.this.L1 = true;
                    defaultAudioSink.f8692h0 = 0L;
                    return;
                }
                return;
            case 2:
                androidx.media3.ui.b bVar = (androidx.media3.ui.b) this.f102714b;
                int i16 = androidx.media3.ui.b.O0;
                bVar.e(false);
                return;
            case 3:
                androidx.media3.ui.c cVar = (androidx.media3.ui.c) this.f102714b;
                float[] fArr = androidx.media3.ui.c.f10036w1;
                cVar.o();
                return;
            case 4:
                ((PlayerView) this.f102714b).invalidate();
                return;
            case 5:
                ScrollView scrollView = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a) this.f102714b).D;
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("mScrollView");
                    throw null;
                }
            case 6:
                DefaultDrmSessionManager.e eVar = (DefaultDrmSessionManager.e) this.f102714b;
                if (eVar.f8886c) {
                    return;
                }
                DrmSession drmSession = eVar.f8885b;
                if (drmSession != null) {
                    drmSession.a(eVar.f8884a);
                }
                DefaultDrmSessionManager.this.f8864n.remove(eVar);
                eVar.f8886c = true;
                return;
            case 7:
                ((DefaultDrmSession) this.f102714b).a(null);
                return;
            case 8:
                lh2.d dVar = (lh2.d) this.f102714b;
                lh2.d.c cVar2 = lh2.d.f112457i;
                hi2.d dVar2 = dVar.f112465g;
                Logger logger = hi2.d.f83889c;
                dVar2.getClass();
                return;
            case 9:
                ni2.a aVar = (ni2.a) this.f102714b;
                aVar.getClass();
                aVar.a();
                return;
            case 10:
                lo.t tVar = (lo.t) this.f102714b;
                tVar.f113951c.smoothScrollTo(0, tVar.f113952d.getBottom());
                return;
            case 11:
                m9.d dVar3 = (m9.d) this.f102714b;
                int i17 = m9.b.f117215c;
                try {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i18 = runningAppProcessInfo.importance;
                    if (i18 != 100 && i18 != 125 && i18 != 200) {
                        z15 = false;
                    }
                    dVar3.D(z15);
                    return;
                } catch (RemoteException e4) {
                    e4.getMessage();
                    return;
                }
            case 12:
                ((ma.l.b) ((ma.o.b) this.f102714b)).c();
                return;
            case 13:
                ((nl2.d) this.f102714b).close();
                return;
            case 14:
                i0 i0Var = (i0) this.f102714b;
                ReentrantLock reentrantLock = i0Var.f119362b;
                while (i0Var.f119361a.get() == 1) {
                    reentrantLock.lock();
                    while (!i0Var.f119368h) {
                        try {
                            try {
                                i0Var.f119363c.await();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                reentrantLock.unlock();
                                return;
                            }
                        } catch (Throwable th3) {
                            reentrantLock.unlock();
                            throw th3;
                        }
                        break;
                    }
                    i0Var.f119368h = false;
                    reentrantLock.unlock();
                    do {
                        reentrantLock.lock();
                        try {
                            z14 = false;
                            for (Queue<i0.a> queue : i0Var.f119364d.values()) {
                                i0.a aVarPoll = queue.poll();
                                if (aVarPoll != null) {
                                    z14 = z14 || !queue.isEmpty();
                                    aVarPoll.f119370b.setFuture(i0Var.f119365e.j(ml2.m.f119394a, i0Var.f119366f, aVarPoll.f119369a));
                                }
                            }
                            reentrantLock.unlock();
                        } catch (Throwable th4) {
                            reentrantLock.unlock();
                            throw th4;
                        }
                    } while (z14);
                }
                return;
            case 15:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) this.f102714b;
                View view2 = fVar.J0;
                if (view2 == null) {
                    p005kotlin.jvm.internal.s.m("mSyncNowButton");
                    throw null;
                }
                view2.setEnabled(true);
                if (fVar.f120643x) {
                    return;
                }
                fVar.S6();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar2 = fVar.N0;
                if (bVar2 != null) {
                    bVar2.A6(false);
                    return;
                }
                return;
            case 16:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.g) this.f102714b;
                SwipeRefreshLayout swipeRefreshLayout = gVar.f37540l;
                if (swipeRefreshLayout == null) {
                    p005kotlin.jvm.internal.s.m("refreshView");
                    throw null;
                }
                swipeRefreshLayout.setRefreshing(true);
                gVar.y6();
                return;
            case 17:
                a0 a0Var = (a0) this.f102714b;
                i2 i2Var = a0Var.f37302q;
                if (i2Var != null) {
                    i2Var.C(true);
                }
                a0Var.T6(false);
                return;
            case 18:
                com.garmin.android.apps.connectmobile.audioprompts.test.f fVar2 = (com.garmin.android.apps.connectmobile.audioprompts.test.f) this.f102714b;
                NumberPicker numberPicker = fVar2.f30246c;
                numberPicker.getClass();
                int value = numberPicker.getValue();
                NumberPicker numberPicker2 = fVar2.f30247d;
                numberPicker2.getClass();
                int value2 = numberPicker2.getValue();
                NumberPicker numberPicker3 = fVar2.f30248e;
                numberPicker3.getClass();
                double d14 = Double.parseDouble(value + "." + value2 + numberPicker3.getValue());
                l3.a aVar2 = l3.f23124b;
                q3 q3Var = q3.MILE_PER_HOUR;
                aVar2.getClass();
                double dX = l3.a.x(d14, q3Var);
                fVar2.f30245b = (float) dX;
                double dI = l3.a.i(dX, q3.KILOMETER_PER_HOUR);
                float f14 = (float) dI;
                float f15 = fVar2.f30245b;
                StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("mUpdateMetersPerSecond: mph[", d14, "], kmph[");
                sbA.append(dI);
                sbA.append("], kmphFloat[");
                sbA.append(f14);
                am.j.x(sbA, "], mps[", dX, "], mpsFloat[");
                String strE = e0.e(f15, "]", sbA);
                com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TestSpeedFragment", strE);
                String str = fVar2.f30245b + " meters/second<br/>" + f14 + " kilometers/hour";
                TextView textView = fVar2.f30250g;
                textView.getClass();
                textView.setText(Html.fromHtml(str));
                return;
            case 19:
                ScrollView scrollView2 = ((com.garmin.android.apps.connectmobile.liveeventsharing.ui.d) this.f102714b).f38592l;
                if (scrollView2 != null) {
                    scrollView2.fullScroll(130);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("scrollView");
                    throw null;
                }
            case 20:
                com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar3 = (com.garmin.android.apps.connectmobile.userprofile.editimage.c) this.f102714b;
                int i19 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
                cVar3.c();
                return;
            case 21:
                CropImage cropImage = (CropImage) this.f102714b;
                int i24 = CropImage.f47290w;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                cropImage.f47294e.post(new l0.e(13, cropImage, countDownLatch));
                try {
                    countDownLatch.await();
                    cropImage.f47309v.run();
                    return;
                } catch (InterruptedException e14) {
                    Thread.currentThread().interrupt();
                    o2.c.p(e14);
                    return;
                }
            case 22:
                CropImage.a aVar4 = (CropImage.a) this.f102714b;
                CropImage cropImage2 = CropImage.this;
                int i25 = aVar4.f47313d;
                cropImage2.f47304o = i25 > 1;
                if (i25 > 0) {
                    for (int i26 = 0; i26 < aVar4.f47313d; i26++) {
                        FaceDetector.Face face = aVar4.f47312c[i26];
                        PointF pointF = new PointF();
                        int iEyesDistance = ((int) (face.eyesDistance() * aVar4.f47310a)) * 2;
                        face.getMidPoint(pointF);
                        float f16 = pointF.x;
                        float f17 = aVar4.f47310a;
                        float f18 = f16 * f17;
                        pointF.x = f18;
                        float f19 = pointF.y * f17;
                        pointF.y = f19;
                        com.garmin.android.apps.connectmobile.util.simplecropimage.b bVar3 = new com.garmin.android.apps.connectmobile.util.simplecropimage.b(cropImage2.f47300k);
                        Rect rect = new Rect(0, 0, cropImage2.f47302m.getWidth(), cropImage2.f47302m.getHeight());
                        float f22 = (int) f18;
                        float f24 = (int) f19;
                        RectF rectF = new RectF(f22, f24, f22, f24);
                        float f25 = -iEyesDistance;
                        rectF.inset(f25, f25);
                        float f26 = rectF.left;
                        if (f26 < 0.0f) {
                            float f27 = -f26;
                            rectF.inset(f27, f27);
                        }
                        float f28 = rectF.top;
                        if (f28 < 0.0f) {
                            float f29 = -f28;
                            rectF.inset(f29, f29);
                        }
                        float f34 = rectF.right;
                        float f35 = rect.right;
                        if (f34 > f35) {
                            float f36 = f34 - f35;
                            rectF.inset(f36, f36);
                        }
                        float f37 = rectF.bottom;
                        float f38 = rect.bottom;
                        if (f37 > f38) {
                            float f39 = f37 - f38;
                            rectF.inset(f39, f39);
                        }
                        bVar3.c(aVar4.f47311b, rect, rectF, cropImage2.f47293d, (cropImage2.f47295f == 0 || cropImage2.f47296g == 0) ? false : true);
                        CropImageView cropImageView = cropImage2.f47300k;
                        cropImageView.f47315p.add(bVar3);
                        cropImageView.invalidate();
                    }
                } else {
                    com.garmin.android.apps.connectmobile.util.simplecropimage.b bVar4 = new com.garmin.android.apps.connectmobile.util.simplecropimage.b(cropImage2.f47300k);
                    int width = cropImage2.f47302m.getWidth();
                    int height = cropImage2.f47302m.getHeight();
                    Rect rect2 = new Rect(0, 0, width, height);
                    int iMin = (Math.min(width, height) * 4) / 5;
                    int i27 = cropImage2.f47295f;
                    if (i27 == 0 || (i15 = cropImage2.f47296g) == 0) {
                        i14 = iMin;
                    } else if (i27 > i15) {
                        i14 = (i15 * iMin) / i27;
                    } else {
                        int i28 = (i27 * iMin) / i15;
                        i14 = iMin;
                        iMin = i28;
                    }
                    int i29 = (width - iMin) / 2;
                    int i30 = (height - i14) / 2;
                    bVar4.c(aVar4.f47311b, rect2, new RectF(i29, i30, i29 + iMin, i30 + i14), cropImage2.f47293d, (cropImage2.f47295f == 0 || cropImage2.f47296g == 0) ? false : true);
                    cropImage2.f47300k.f47315p.clear();
                    CropImageView cropImageView2 = cropImage2.f47300k;
                    cropImageView2.f47315p.add(bVar4);
                    cropImageView2.invalidate();
                }
                cropImage2.f47300k.invalidate();
                if (cropImage2.f47300k.f47315p.size() == 1) {
                    com.garmin.android.apps.connectmobile.util.simplecropimage.b bVar5 = cropImage2.f47300k.f47315p.get(0);
                    cropImage2.f47306q = bVar5;
                    bVar5.f47329b = true;
                }
                if (aVar4.f47313d > 1) {
                    Toast.makeText(cropImage2, "Multi face crop help", 0).show();
                    return;
                }
                return;
            case 23:
                n7.f.a aVar5 = ((n7.f) this.f102714b).f123984a;
                ViewParent parent = aVar5.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(aVar5);
                    return;
                }
                return;
            case 24:
                na2.a aVar6 = (na2.a) this.f102714b;
                aVar6.f125207a.debug("BluetoothClassicAcceptor => Accepting Connections START");
                BluetoothAdapter bluetoothAdapterA = oa2.a.a(aVar6.f125208b);
                org.slf4j.Logger logger2 = aVar6.f125207a;
                try {
                    if (bluetoothAdapterA == null) {
                        logger2.error("Bluetooth not supported on this platform. Aborting search.");
                        synchronized (aVar6.f125210d) {
                            interfaceC2413a3 = aVar6.f125213g;
                            break;
                        }
                        if (interfaceC2413a3 != null) {
                            ((na2.d) interfaceC2413a3).c(new Exception("Bluetooth not supported on this platform"));
                            return;
                        }
                        return;
                    }
                    try {
                        logger2.debug("BluetoothClassicAcceptor => Opening Server Socket");
                        BluetoothServerSocket bluetoothServerSocketListenUsingRfcommWithServiceRecord = bluetoothAdapterA.listenUsingRfcommWithServiceRecord("Garmin SPP", aVar6.f125209c);
                        synchronized (aVar6.f125210d) {
                            aVar6.f125214h = bluetoothServerSocketListenUsingRfcommWithServiceRecord;
                            break;
                        }
                        while (aVar6.a()) {
                            aVar6.f125207a.debug("BluetoothClassicAcceptor => Calling serverSocket.accept()");
                            BluetoothSocket bluetoothSocketAccept = bluetoothServerSocketListenUsingRfcommWithServiceRecord.accept();
                            org.slf4j.Logger logger3 = aVar6.f125207a;
                            if (bluetoothSocketAccept == null) {
                                logger3.debug("Socket is null , continuing ");
                            } else {
                                logger3.debug("BluetoothClassicAcceptor => BluetoothSocket is obtained  " + bluetoothSocketAccept);
                                synchronized (aVar6.f125210d) {
                                    interfaceC2413a2 = aVar6.f125213g;
                                    break;
                                }
                                if (interfaceC2413a2 != null && !((na2.d) interfaceC2413a2).b(bluetoothSocketAccept.getRemoteDevice().getAddress(), bluetoothSocketAccept)) {
                                    aVar6.f125207a.debug("delegate.onDeviceConnected(macAddress, socket) is false closing socket  ---");
                                    na2.e.a(bluetoothSocketAccept);
                                    aVar6.f125211e.postDelayed(new l0.e(16, aVar6, interfaceC2413a2), ((long) (Math.random() * 5000.0d)) + 15000);
                                    aVar6.f125207a.debug("Finally stopping ");
                                    aVar6.c(false);
                                    return;
                                }
                            }
                        }
                    } catch (IOException e15) {
                        e = e15;
                        synchronized (aVar6.f125210d) {
                            interfaceC2413a = aVar6.f125213g;
                            break;
                        }
                        if (interfaceC2413a != null) {
                            ((na2.d) interfaceC2413a).c(e);
                        }
                    } catch (SecurityException e16) {
                        e = e16;
                        synchronized (aVar6.f125210d) {
                            interfaceC2413a = aVar6.f125213g;
                            if (interfaceC2413a != null) {
                                ((na2.d) interfaceC2413a).c(e);
                            }
                        }
                    }
                    aVar6.f125207a.debug("Finally stopping ");
                    aVar6.c(false);
                    return;
                } catch (Throwable th5) {
                    aVar6.f125207a.debug("Finally stopping ");
                    aVar6.c(false);
                    throw th5;
                }
            case 25:
                Functions.run((Functions.FailableRunnable) this.f102714b);
                return;
            case 26:
                ((TimedSemaphore) this.f102714b).endOfPeriod();
                return;
            case 27:
                a();
                return;
            case 28:
                pj2.j jVar = (pj2.j) this.f102714b;
                ConcurrentHashMap<String, Boolean> concurrentHashMap = pj2.j.f138066t;
                org.slf4j.Logger logger4 = jVar.f138068b;
                logger4.trace("doAutoReconnect");
                try {
                    jVar.c(jVar.f138083q.nextInt(250) + 450, false, false);
                    return;
                } catch (Throwable th6) {
                    logger4.warn("failed automatic reconnect after {}", "133", th6);
                    return;
                }
            default:
                ActivityMapActivity activityMapActivity = (ActivityMapActivity) this.f102714b;
                int i34 = ActivityMapActivity.f29218k0;
                po.h hVar2 = (po.h) activityMapActivity.f190646l;
                if (hVar2 == null || (hVar = hVar2.f148294e) == null || hVar.f144584a.getF50264r() != com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
                    return;
                }
                activityMapActivity.invalidateOptionsMenu();
                return;
        }
    }
}
