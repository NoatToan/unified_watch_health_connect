package a0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.q;
import androidx.camera.core.impl.s0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h0;
import androidx.fragment.app.v;
import androidx.lifecycle.b0;
import androidx.lifecycle.e1;
import androidx.lifecycle.o0;
import androidx.lifecycle.y0;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.z;
import androidx.room.m0;
import androidx.room.n0;
import b0.w0;
import c7.n;
import c7.p;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.ui.common.PasscodeControlView;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.highlight.Highlight;
import fa.k;
import h7.j;
import i7.l;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o53.c0;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableRunnable;
import org.slf4j.Logger;
import p005kotlin.Unit;
import u53.o;
import v.s;
import z0.a0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21b;

    public /* synthetic */ c(z zVar, r0 r0Var) {
        this.f20a = 14;
        this.f21b = r0Var;
    }

    private final void a() {
        r0 r0Var = (r0) this.f21b;
        int i14 = z.W0;
        try {
            synchronized (r0Var) {
            }
            try {
                r0Var.f9345a.handleMessage(r0Var.f9349e, r0Var.f9350f);
            } finally {
                r0Var.b(true);
            }
        } catch (ExoPlaybackException e4) {
            k.d("Unexpected error delivering message on external thread.", e4);
            o2.c.p(e4);
        }
    }

    private final void b() {
        androidx.camera.core.c cVar = (androidx.camera.core.c) this.f21b;
        synchronized (cVar.f5435y) {
            try {
                cVar.A = null;
                androidx.camera.core.e eVar = cVar.f5436z;
                if (eVar != null) {
                    cVar.f5436z = null;
                    cVar.f(eVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = 3;
        int i15 = 4;
        int i16 = 2;
        switch (this.f20a) {
            case 0:
                d dVar = (d) this.f21b;
                androidx.concurrent.futures.b.a<Void> aVar = dVar.f28g;
                if (aVar != null) {
                    aVar.b(null);
                    dVar.f28g = null;
                    return;
                }
                return;
            case 1:
                Failable.run((FailableRunnable) this.f21b);
                return;
            case 2:
                androidx.emoji2.text.g.b bVar = (androidx.emoji2.text.g.b) this.f21b;
                synchronized (bVar.f7074d) {
                    try {
                        if (bVar.f7078h == null) {
                            return;
                        }
                        try {
                            l lVarC = bVar.c();
                            int i17 = lVarC.f91942f;
                            if (i17 == 2) {
                                synchronized (bVar.f7074d) {
                                }
                            }
                            if (i17 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i17 + ")");
                            }
                            try {
                                int i18 = j.f82330a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                androidx.emoji2.text.g.a aVar2 = bVar.f7073c;
                                Context context = bVar.f7071a;
                                aVar2.getClass();
                                l[] lVarArr = {lVarC};
                                n nVar = c7.h.f25197a;
                                Trace.beginSection(ce.a.d("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceB = c7.h.f25197a.b(context, lVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferD = p.d(bVar.f7071a, lVarC.f91937a);
                                    if (mappedByteBufferD == null || typefaceB == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    androidx.emoji2.text.h hVarA = androidx.emoji2.text.h.a(typefaceB, mappedByteBufferD);
                                    Trace.endSection();
                                    synchronized (bVar.f7074d) {
                                        try {
                                            androidx.emoji2.text.d.i iVar = bVar.f7078h;
                                            if (iVar != null) {
                                                iVar.b(hVarA);
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                        break;
                                    }
                                    bVar.b();
                                    return;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                int i19 = j.f82330a;
                                Trace.endSection();
                                throw th5;
                            }
                            break;
                        } catch (Throwable th6) {
                            synchronized (bVar.f7074d) {
                                try {
                                    androidx.emoji2.text.d.i iVar2 = bVar.f7078h;
                                    if (iVar2 != null) {
                                        iVar2.a(th6);
                                    }
                                    bVar.b();
                                    return;
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
            case 3:
                ab.k kVar = (ab.k) this.f21b;
                Surface surface = kVar.f2486h;
                if (surface != null) {
                    Iterator<ab.k.b> it = kVar.f2479a.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
                SurfaceTexture surfaceTexture = kVar.f2485g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.f2485g = null;
                kVar.f2486h = null;
                return;
            case 4:
                ((q.a) this.f21b).f5371b.onCameraAccessPrioritiesChanged();
                return;
            case 5:
                s.c cVar = (s.c) ((s0.c) this.f21b);
                if (s.this.f174010e == s.g.PENDING_OPEN || s.this.f174010e == s.g.OPENING_WITH_ERROR) {
                    s.this.I(false);
                    return;
                }
                return;
            case 6:
                s.d dVar2 = (s.d) ((s0.b) this.f21b);
                if (s.this.f174010e == s.g.OPENED) {
                    s.this.B();
                    return;
                }
                return;
            case 7:
                ((androidx.concurrent.futures.b.d) this.f21b).cancel(true);
                return;
            case 8:
                e23.a aVar3 = (e23.a) ((p005kotlin.jvm.internal.r0) this.f21b).f105810a;
                if (aVar3 != null) {
                    aVar3.invoke();
                    return;
                }
                return;
            case 9:
                h0.c(4, (ArrayList) this.f21b);
                return;
            case 10:
                androidx.fragment.app.e.g gVar = (androidx.fragment.app.e.g) this.f21b;
                gVar.getClass();
                Iterator<T> it3 = gVar.f7190c.iterator();
                while (it3.hasNext()) {
                    ((androidx.fragment.app.e.h) it3.next()).f7189a.c(gVar);
                }
                return;
            case 11:
                ((Fragment) this.f21b).lambda$performCreateView$0();
                return;
            case 12:
                Iterator<v.p> it4 = ((v) this.f21b).f7384o.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
                return;
            case 13:
                e1 e1Var = (e1) this.f21b;
                o0 o0Var = e1Var.f7881f;
                if (e1Var.f7877b == 0) {
                    e1Var.f7878c = true;
                    o0Var.g(b0.a.ON_PAUSE);
                }
                if (e1Var.f7876a == 0 && e1Var.f7878c) {
                    o0Var.g(b0.a.ON_STOP);
                    e1Var.f7879d = true;
                    return;
                }
                return;
            case 14:
                a();
                return;
            case 15:
                n0 n0Var = (n0) this.f21b;
                boolean zE = n0Var.e();
                if (n0Var.f10904p.compareAndSet(false, true) && zE) {
                    ge1.b.T(n0Var.f10900l.getCoroutineScope(), n0Var.f10907s, null, new m0(n0Var, null), 2);
                    return;
                }
                return;
            case 16:
                FitPayAddCardActivity fitPayAddCardActivity = (FitPayAddCardActivity) this.f21b;
                if (fitPayAddCardActivity.f51383l && (fitPayAddCardActivity.f51391v || fitPayAddCardActivity.isFinishing() || fitPayAddCardActivity.isDestroyed())) {
                    return;
                }
                fitPayAddCardActivity.f51391v = true;
                fitPayAddCardActivity.f51389r.removeCallbacks(fitPayAddCardActivity.f51390t);
                FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("handleInactivityTimeout");
                x53.c cVar2 = o53.s0.f129406a;
                ge1.b.T(c0.a(o.f168762a), null, null, new ap2.g(fitPayAddCardActivity, null), 3);
                return;
            case 17:
                b.g.e eVar = (b.g.e) this.f21b;
                Runnable runnable = eVar.f13802b;
                if (runnable != null) {
                    runnable.run();
                    eVar.f13802b = null;
                    return;
                }
                return;
            case 18:
                super/*android.app.Dialog*/.onBackPressed();
                return;
            case 19:
                b();
                return;
            case 20:
                ((w0) this.f21b).q();
                return;
            case 21:
                BLEScanningActivity bLEScanningActivity = (BLEScanningActivity) this.f21b;
                int i24 = BLEScanningActivity.A;
                i2.a(a2.DEVICES, "BLEScanningActivity", "Timeout scanning to associate device");
                bLEScanningActivity.ha();
                bLEScanningActivity.f34422l.clear();
                bLEScanningActivity.ea(bLEScanningActivity.f34425o);
                return;
            case 22:
                bm.q qVar = (bm.q) this.f21b;
                MotionEvent motionEvent = qVar.f18853q;
                LineChart lineChart = qVar.f134442b;
                if (lineChart != null) {
                    lineChart.setDragEnabled(false);
                    qVar.f134442b.setHighlightPerDragEnabled(true);
                    qVar.f134442b.setScaleEnabled(false);
                    qVar.f18854r.setDoubleLongPress(false);
                    Highlight highlightByTouchPoint = qVar.f134442b.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
                    if (highlightByTouchPoint != null) {
                        qVar.f134442b.highlightValues(new Highlight[]{new Highlight(highlightByTouchPoint.getXIndex(), 0)});
                    }
                    qVar.f134442b.getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case 23:
                PasscodeControlView passcodeControlView = (PasscodeControlView) this.f21b;
                passcodeControlView.f51873g.setImageResource(R.drawable.empty_dot);
                passcodeControlView.f51874h.setImageResource(R.drawable.empty_dot);
                passcodeControlView.f51875i.setImageResource(R.drawable.empty_dot);
                passcodeControlView.f51876j.setImageResource(R.drawable.empty_dot);
                PasscodeEntryActivity passcodeEntryActivity = passcodeControlView.f51883q;
                if (passcodeEntryActivity != null) {
                    String string = passcodeControlView.f51882p.toString();
                    qr2.d dVar3 = passcodeEntryActivity.f52126j;
                    if (dVar3 == null) {
                        p005kotlin.jvm.internal.s.m("passcodeViewModel");
                        throw null;
                    }
                    qr2.d.c cVarD = dVar3.f146946k.d();
                    int i25 = cVarD == null ? -1 : PasscodeEntryActivity.b.f52130a[cVarD.ordinal()];
                    int i26 = 25;
                    if (i25 == 1) {
                        qr2.d dVar4 = passcodeEntryActivity.f52126j;
                        if (dVar4 == null) {
                            p005kotlin.jvm.internal.s.m("passcodeViewModel");
                            throw null;
                        }
                        ps2.n nVar2 = dVar4.f146940e;
                        y0<Boolean> y0Var = dVar4.f146947l;
                        Logger logger = qr2.d.f146935v;
                        String str = dVar4.f146941f;
                        if (str != null ? str.equals(string) : false) {
                            y0Var.m(Boolean.TRUE);
                            if (dVar4.f146945j) {
                                logger.debug("Attempting change passcode");
                                if (nVar2 != null) {
                                    try {
                                        if (nVar2.h() != hs2.b.READY) {
                                            logger.error("Cannot change passcode. Device is not in READY (connected) state.");
                                            dVar4.y4();
                                        } else {
                                            String str2 = dVar4.f146942g;
                                            if (str2 == null) {
                                                logger.error("Cannot change passcode. Old passcode is missing.");
                                                dVar4.y4();
                                            } else {
                                                p62.e eVar2 = new p62.e(nVar2, 8, str2, string);
                                                int i27 = w03.b.f181178a;
                                                new e13.a(eVar2).j(l13.a.f108327b).g(r03.a.a()).h(new ps2.d(new qr2.c(dVar4, i15), 24), new ps2.d(new qr2.c(dVar4, 5), i26));
                                            }
                                        }
                                    } catch (Exception e4) {
                                        com.airbnb.lottie.animation.keyframe.a.z("Something went wrong when trying to update the passcode (", e4.getMessage(), ")", logger);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            } else {
                                logger.debug("Attempting create passcode");
                                if (nVar2 != null) {
                                    try {
                                        if (nVar2.h() != hs2.b.READY) {
                                            logger.error("Cannot confirm new passcode. Device is not in READY (connected) state.");
                                            y0Var.m(Boolean.FALSE);
                                        } else {
                                            ps2.k kVar2 = new ps2.k(nVar2, string);
                                            int i28 = w03.b.f181178a;
                                            new z03.c(kVar2).k(l13.a.f108327b).h(r03.a.a()).i(new ps2.d(new qr2.c(dVar4, 6), 26), new qr2.b(dVar4, i16));
                                        }
                                    } catch (Exception e14) {
                                        com.airbnb.lottie.animation.keyframe.a.z("Something went wrong when trying to create the passcode (", e14.getMessage(), ")", logger);
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                }
                            }
                        } else {
                            dVar4.A4(qr2.d.c.PASSCODE_NOT_CONFIRMED, null);
                        }
                        break;
                    } else if (i25 == 2) {
                        qr2.d dVar5 = passcodeEntryActivity.f52126j;
                        if (dVar5 == null) {
                            p005kotlin.jvm.internal.s.m("passcodeViewModel");
                            throw null;
                        }
                        dVar5.A4(qr2.d.c.CONFIRM_PASSCODE, null);
                        dVar5.f146941f = string;
                    } else if (i25 == 3) {
                        qr2.d dVar6 = passcodeEntryActivity.f52126j;
                        if (dVar6 == null) {
                            p005kotlin.jvm.internal.s.m("passcodeViewModel");
                            throw null;
                        }
                        dVar6.f146947l.m(Boolean.TRUE);
                        jn2.g gVar2 = new jn2.g(i15, dVar6, string);
                        qr2.d.f146935v.debug("Attempting verify passcode");
                        ps2.n nVar3 = dVar6.f146940e;
                        if (nVar3 != null) {
                            ps2.k kVar3 = new ps2.k(nVar3, string);
                            int i29 = w03.b.f181178a;
                            new e13.a(kVar3).j(l13.a.f108327b).g(r03.a.a()).h(new ps2.d(new qd0.a(gVar2, i26), 21), new ps2.d(new qr2.c(dVar6, i14), 22));
                        }
                    } else if (i25 == 4) {
                        qr2.d dVar7 = passcodeEntryActivity.f52126j;
                        if (dVar7 == null) {
                            p005kotlin.jvm.internal.s.m("passcodeViewModel");
                            throw null;
                        }
                        dVar7.f146942g = string;
                        dVar7.A4(qr2.d.c.CREATE_NEW_PASSCODE, null);
                    }
                }
                passcodeControlView.f51882p = new StringBuilder();
                passcodeControlView.f51877k.setEnabled(true);
                passcodeControlView.invalidate();
                return;
            case 24:
                cx2.h hVar = ((bv2.h) this.f21b).f21493g;
                Logger logger2 = cx2.h.f56678c;
                hVar.getClass();
                return;
            case 25:
                androidx.camera.video.internal.audio.b bVar2 = (androidx.camera.video.internal.audio.b) this.f21b;
                if (bVar2.f5935g.ordinal() != 1) {
                    return;
                }
                androidx.camera.video.internal.audio.b.c cVar3 = androidx.camera.video.internal.audio.b.c.CONFIGURED;
                Objects.toString(bVar2.f5935g);
                Objects.toString(cVar3);
                bVar2.f5935g = cVar3;
                bVar2.c();
                return;
            case 26:
                ((androidx.camera.video.internal.audio.b.a) this.f21b).getClass();
                return;
            case 27:
                androidx.camera.video.internal.audio.b bVar3 = androidx.camera.video.internal.audio.b.this;
                bVar3.f5945q = true;
                if (bVar3.f5935g == androidx.camera.video.internal.audio.b.c.STARTED) {
                    bVar3.a();
                    return;
                }
                return;
            case 28:
                InlineUnitsTextFieldView inlineUnitsTextFieldView = (InlineUnitsTextFieldView) this.f21b;
                int i30 = InlineUnitsTextFieldView.T0;
                inlineUnitsTextFieldView.getEditText().getText().clear();
                return;
            default:
                cd0.p.b(((cd0.l) this.f21b).f26815c, "BaseHybridDeviceSetupStrategy");
                return;
        }
    }

    public /* synthetic */ c(Object obj, int i14) {
        this.f20a = i14;
        this.f21b = obj;
    }

    public /* synthetic */ c(a0.c cVar, boolean z14) {
        this.f20a = 26;
        this.f21b = cVar;
    }
}
