package eh2;

import android.location.Location;
import android.os.Message;
import android.os.Trace;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.strictmode.Violation;
import androidx.recyclerview.widget.RecyclerView;
import b0.l0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import com.garmin.android.apps.connectmobile.developer.ManageCampaignsDeveloperActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSlidingTabLayout;
import com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationDeveloperActivity;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import com.garmin.proto.generated.GDIHandCalibration;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import en0.n;
import f12.l;
import g1.r;
import h0.j0;
import h0.k0;
import h5.o1;
import hd1.m;
import hd1.t;
import j1.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.j3;
import kotlin.u;
import lc.u0;
import o13.p;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p1.h0;
import p1.i0;
import p13.d0;
import pj2.k;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f64045b;

    public /* synthetic */ b(String str, Violation violation) {
        this.f64044a = 4;
        this.f64045b = violation;
    }

    private final void a() {
        j1.b.C1840b c1840b = (j1.b.C1840b) this.f64045b;
        synchronized (c1840b.f96231d) {
            try {
                if (c1840b.f96228a) {
                    return;
                }
                c1840b.f96230c.j(new x(0, null));
                c1840b.f96228a = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x035c  */
    /* JADX WARN: Code duplicated, block: B:136:0x036d A[Catch: all -> 0x0399, LOOP:0: B:121:0x030e->B:136:0x036d, LOOP_END, TryCatch #5 {all -> 0x0399, blocks: (B:118:0x02fe, B:121:0x030e, B:123:0x031e, B:125:0x0328, B:127:0x0331, B:129:0x0340, B:131:0x035e, B:136:0x036d, B:137:0x0371, B:139:0x0385, B:145:0x039c, B:146:0x039f, B:138:0x0376), top: B:266:0x02fe, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0495 A[Catch: InterruptedException -> 0x04b4, TryCatch #1 {InterruptedException -> 0x04b4, blocks: (B:186:0x0443, B:187:0x0453, B:189:0x0457, B:191:0x045b, B:193:0x0461, B:195:0x0465, B:196:0x046b, B:197:0x046e, B:198:0x046f, B:200:0x0495, B:201:0x0498, B:203:0x04ab, B:206:0x04b6, B:207:0x04b9), top: B:260:0x0443 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x04ab A[Catch: InterruptedException -> 0x04b4, LOOP:2: B:184:0x043f->B:203:0x04ab, LOOP_END, TryCatch #1 {InterruptedException -> 0x04b4, blocks: (B:186:0x0443, B:187:0x0453, B:189:0x0457, B:191:0x045b, B:193:0x0461, B:195:0x0465, B:196:0x046b, B:197:0x046e, B:198:0x046f, B:200:0x0495, B:201:0x0498, B:203:0x04ab, B:206:0x04b6, B:207:0x04b9), top: B:260:0x0443 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x04b6 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Message messageObtain;
        com.garmin.android.apps.connectmobile.audioprompts.a aVar;
        nu.h hVar;
        int i14 = 2;
        int i15 = 8;
        int i16 = 12;
        androidx.appcompat.app.e eVar = null;
        int i17 = 0;
        int i18 = 1;
        switch (this.f64044a) {
            case 0:
                f fVar = (f) this.f64045b;
                Logger logger = fVar.f64064a;
                k kVar = fVar.f64067d;
                logger.warn("MLRWatchDog Reset Attempt on " + kVar.getMacAddress());
                la2.e eVar2 = da2.d.b().f58886a;
                String macAddress = kVar.getMacAddress();
                macAddress.getClass();
                eVar2.k(macAddress);
                return;
            case 1:
                ((com.garmin.android.apps.connectmobile.handalignment.b.a) this.f64045b).a(new IOException("Low level error."));
                return;
            case 2:
                com.garmin.android.apps.connectmobile.handalignment.f fVar2 = (com.garmin.android.apps.connectmobile.handalignment.f) this.f64045b;
                com.garmin.android.apps.connectmobile.handalignment.f.b bVar = fVar2.f36618d;
                if (bVar == com.garmin.android.apps.connectmobile.handalignment.f.b.Manual) {
                    fVar2.g(GDIHandCalibration.HandType.HOUR, 0).h(new n(new e70.a(14), 11), new n(new e70.a(15), i16));
                    return;
                } else {
                    if (bVar == com.garmin.android.apps.connectmobile.handalignment.f.b.Camera) {
                        fVar2.b(0.0f, 0.0f).h(new n(new e70.a(16), 13), new n(new e70.a(i16), i14));
                        return;
                    }
                    return;
                }
            case 3:
                f7.b.C1430b c1430b = (f7.b.C1430b) this.f64045b;
                c1430b.f69404f = null;
                c1430b.onLocationChanged((Location) null);
                return;
            case 4:
                Violation violation = (Violation) this.f64045b;
                f8.a aVar2 = f8.a.f69927a;
                throw violation;
            case 5:
                NestedScrollView nestedScrollView = ((q) this.f64045b).f40796i;
                if (nestedScrollView != null) {
                    nestedScrollView.f(130);
                    return;
                } else {
                    s.m("mScrollView");
                    throw null;
                }
            case 6:
                fm2.a aVar3 = (fm2.a) this.f64045b;
                aVar3.c(true);
                aVar3.f72109g = null;
                return;
            case 7:
                ((l) this.f64045b).T3(true);
                return;
            case 8:
                ((r.d) this.f64045b).a();
                return;
            case 9:
                com.garmin.android.apps.connectmobile.userprofile.f fVar3 = (com.garmin.android.apps.connectmobile.userprofile.f) this.f64045b;
                com.garmin.android.apps.connectmobile.userprofile.f.a aVar4 = com.garmin.android.apps.connectmobile.userprofile.f.f46715v;
                fVar3.f33121i.scrollToPosition(0);
                return;
            case 10:
                Toast.makeText((WeatherLocationDeveloperActivity) this.f64045b, "Save Complete", 1).show();
                return;
            case 11:
                NestedScrollView nestedScrollView2 = ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a) this.f64045b).f49099e;
                if (nestedScrollView2 != null) {
                    nestedScrollView2.f(130);
                    return;
                } else {
                    s.m("scrollView");
                    throw null;
                }
            case 12:
                NestedScrollView nestedScrollView3 = ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b) this.f64045b).f49119l;
                if (nestedScrollView3 != null) {
                    nestedScrollView3.f(130);
                    return;
                } else {
                    s.m("scrollView");
                    throw null;
                }
            case 13:
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = (ManageCampaignsDeveloperActivity) this.f64045b;
                RecyclerView recyclerView = manageCampaignsDeveloperActivity.f33621c;
                if (recyclerView == null) {
                    s.m("campaignsRecyclerView");
                    throw null;
                }
                recyclerView.setAdapter(new g80.b(manageCampaignsDeveloperActivity.f33620b));
                manageCampaignsDeveloperActivity.hideProgressOverlay();
                return;
            case 14:
                AudioPromptsService audioPromptsService = (AudioPromptsService) this.f64045b;
                while (audioPromptsService.f30207n) {
                    try {
                        iu.a.f94990a.getClass();
                        iu.b bVarTake = iu.a.f94991b.take();
                        bVarTake.getClass();
                        iu.b bVar2 = bVarTake;
                        while (audioPromptsService.f30207n) {
                            nu.h hVar2 = audioPromptsService.f30197d;
                            if (hVar2 == null) {
                                s.m("tts");
                                throw null;
                            }
                            if (!hVar2.getF127875c() || audioPromptsService.f30200g == null) {
                                Thread.sleep(10L);
                            } else {
                                audioPromptsService.d();
                                audioPromptsService.f30208o = bVar2;
                                messageObtain = Message.obtain(audioPromptsService.f30200g, 1, new AudioPromptsService.a(bVar2.f94998e, bVar2.f94994a, bVar2.f94999f));
                                i2.a aVar5 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar5.getClass();
                                i2.a.b(a2Var, "AudioPromptsService", "queueAudio: added to the queue");
                                aVar = audioPromptsService.f30200g;
                                if (aVar != null) {
                                    aVar.sendMessage(messageObtain);
                                }
                                audioPromptsService.f30209p.take();
                                iu.a aVar6 = iu.a.f94990a;
                                iu.b bVar3 = audioPromptsService.f30208o;
                                aVar6.getClass();
                                iu.a.a(bVar3);
                                hVar = audioPromptsService.f30197d;
                                if (hVar != null) {
                                    s.m("tts");
                                    throw null;
                                }
                                hVar.c();
                                audioPromptsService.f30208o = null;
                                audioPromptsService.a();
                            }
                        }
                        audioPromptsService.d();
                        audioPromptsService.f30208o = bVar2;
                        messageObtain = Message.obtain(audioPromptsService.f30200g, 1, new AudioPromptsService.a(bVar2.f94998e, bVar2.f94994a, bVar2.f94999f));
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.b(a2Var2, "AudioPromptsService", "queueAudio: added to the queue");
                        aVar = audioPromptsService.f30200g;
                        if (aVar != null) {
                            aVar.sendMessage(messageObtain);
                        }
                        audioPromptsService.f30209p.take();
                        iu.a aVar8 = iu.a.f94990a;
                        iu.b bVar4 = audioPromptsService.f30208o;
                        aVar8.getClass();
                        iu.a.a(bVar4);
                        hVar = audioPromptsService.f30197d;
                        if (hVar != null) {
                            s.m("tts");
                            throw null;
                        }
                        hVar.c();
                        audioPromptsService.f30208o = null;
                        audioPromptsService.a();
                    } catch (InterruptedException e4) {
                        String strN = fb1.c.n("AudioPromptConsumer interrupted ", e4.getMessage());
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.f(a2Var3, "AudioPromptsService", strN);
                        return;
                    }
                }
                return;
            case 15:
                j0 j0Var = ((h0.r) this.f64045b).f80552a.f80556a;
                if (j0Var != null) {
                    ((k0) j0Var.f80516i).b();
                    return;
                }
                return;
            case 16:
                h3.g.setRippleState$lambda$1((h3.g) this.f64045b);
                return;
            case 17:
                TextView textView = (TextView) this.f64045b;
                int i19 = GCMSlidingTabLayout.f47841k;
                if (textView.getLineCount() == 1) {
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    return;
                }
                return;
            case 18:
                ((hd1.d) this.f64045b).a(new m(0, 1, null));
                return;
            case 19:
                ((hd1.l) this.f64045b).a(t.C);
                return;
            case 20:
                ((kotlin.a) this.f64045b).attachedToWindow();
                return;
            case 21:
                u uVar = (u) this.f64045b;
                h0 h0Var = u.H0;
                Trace.beginSection("measureAndLayout");
                try {
                    kotlin.m mVar = uVar.f91542a;
                    o1.a aVar10 = o1.W;
                    mVar.c(true);
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        uVar.e();
                        Trace.endSection();
                        uVar.T = false;
                        return;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 22:
                a();
                return;
            case 23:
                ((l0.k) this.f64045b).a();
                return;
            case 24:
                ((a73.f) this.f64045b).a();
                return;
            case 25:
                j4.a aVar11 = (j4.a) this.f64045b;
                int i24 = j4.a.f96962p;
                boolean zE = aVar11.e();
                kotlin.m mVar2 = aVar11.f96963a;
                if (zE) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        o1.a aVar12 = o1.W;
                        mVar2.c(true);
                        i0<j3> i0Var = aVar11.f96974l;
                        int[] iArr = i0Var.f134773b;
                        long[] jArr = i0Var.f134772a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i25 = 0;
                            while (true) {
                                long j8 = jArr[i25];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i26 = 8 - ((~(i25 - length)) >>> 31);
                                    int i27 = i17;
                                    while (i27 < i26) {
                                        if ((255 & j8) < 128) {
                                            int i28 = iArr[(i25 << 3) + i27];
                                            if (!aVar11.d().a(i28)) {
                                                aVar11.f96966d.add(new j4.d(i28, aVar11.f96973k, j4.e.VIEW_DISAPPEAR, null));
                                                aVar11.f96970h.i(Unit.INSTANCE);
                                            }
                                        }
                                        j8 >>= 8;
                                        i27++;
                                        length = length;
                                    }
                                    int i29 = length;
                                    if (i26 == 8) {
                                        length = i29;
                                        if (i25 != length) {
                                            i25++;
                                            i17 = 0;
                                        }
                                    }
                                } else if (i25 != length) {
                                    i25++;
                                    i17 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            aVar11.g(mVar2.getSemanticsOwner().a(), aVar11.f96975m);
                            Unit unit2 = Unit.INSTANCE;
                            Trace.endSection();
                            aVar11.b(aVar11.d());
                            aVar11.k();
                            aVar11.f96976n = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 26:
                ja.m mVar3 = (ja.m) this.f64045b;
                ja.b.a aVarO = mVar3.o();
                mVar3.u(aVarO, 1028, new j20.x(aVarO, i15));
                mVar3.f97989f.e();
                return;
            case 27:
                CustomerManagementLibMainActivity customerManagementLibMainActivity = (CustomerManagementLibMainActivity) this.f64045b;
                if (customerManagementLibMainActivity.f50713d && (customerManagementLibMainActivity.f50716g || customerManagementLibMainActivity.isFinishing() || customerManagementLibMainActivity.isDestroyed())) {
                    return;
                }
                customerManagementLibMainActivity.f50716g = true;
                customerManagementLibMainActivity.f50714e.removeCallbacks(customerManagementLibMainActivity.f50715f);
                CustomerManagementLibMainActivity.f50711h.getClass();
                o13.t tVar = CustomerManagementLibMainActivity.f50712i;
                ((ch.qos.logback.classic.Logger) tVar.getValue()).debug("handleInactivityTimeout");
                x53.c cVar = s0.f129406a;
                c0.a(o.f168762a);
                if (!customerManagementLibMainActivity.f50716g || customerManagementLibMainActivity.isFinishing() || customerManagementLibMainActivity.isDestroyed()) {
                    return;
                }
                ((ch.qos.logback.classic.Logger) tVar.getValue()).debug("showRetryTimeoutDialog");
                String string = customerManagementLibMainActivity.getString(R.string.time_expired_title);
                string.getClass();
                String string2 = customerManagementLibMainActivity.getString(R.string.time_expired_message);
                string2.getClass();
                String string3 = customerManagementLibMainActivity.getString(R.string.lbl_start_over);
                string3.getClass();
                mj2.a aVar13 = mj2.a.f119088a;
                p pVar = new p(string3, new jj2.b(customerManagementLibMainActivity, i18));
                aVar13.getClass();
                if (!customerManagementLibMainActivity.isFinishing() && !customerManagementLibMainActivity.isDestroyed()) {
                    androidx.appcompat.app.e.a aVar14 = new androidx.appcompat.app.e.a(new ContextThemeWrapper(customerManagementLibMainActivity, R.style.AlertDialogTheme));
                    aVar14.setTitle(string);
                    aVar14.setMessage(string2);
                    aVar14.setPositiveButton((CharSequence) pVar.f128594a, new br2.b((e23.p) pVar.f128595b, 12));
                    androidx.appcompat.app.e eVarCreate = aVar14.create();
                    eVarCreate.getClass();
                    eVarCreate.setOnDismissListener(null);
                    eVarCreate.setCanceledOnTouchOutside(false);
                    eVar = eVarCreate;
                }
                if (eVar != null) {
                    eVar.show();
                    return;
                }
                return;
            case 28:
                jn2.m mVar4 = (jn2.m) this.f64045b;
                ListeningScheduledExecutorService listeningScheduledExecutorService = jn2.m.f99646l;
                mVar4.b(hs2.g.SENDING_NFC_MESSAGES, hs2.g.IDLE);
                return;
            default:
                ql2.a aVar15 = (ql2.a) this.f64045b;
                jn2.c cVar2 = jn2.u.f99686g;
                cVar2.getClass();
                com.airbnb.lottie.animation.keyframe.a.w("handleNfcActionEvent: received ", aVar15.getEventName(), cVar2.a());
                if (aVar15 instanceof ql2.a.d) {
                    ql2.a.d dVar = (ql2.a.d) aVar15;
                    wr.g.v("handleNfcStartedEvent(", dVar.f145243b, ")", cVar2.a());
                    long j14 = dVar.f145243b;
                    synchronized (cVar2.f99618c) {
                        try {
                            boolean zContainsKey = cVar2.f99618c.containsKey(Long.valueOf(j14));
                            HashMap<Long, List<ql2.a>> map = cVar2.f99618c;
                            if (zContainsKey) {
                                List<ql2.a> list = map.get(Long.valueOf(j14));
                                if (list != null) {
                                    d0.A(list, new j02.r(29), true);
                                    if (!dVar.f145244c) {
                                        d0.A(list, new jn2.b(i17), true);
                                    }
                                    list.add(dVar);
                                } else {
                                    cVar2.a().error("Could not get entry from structure for unit ID " + j14);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            } else {
                                map.put(Long.valueOf(j14), p13.x.m(dVar));
                                Unit unit4 = Unit.INSTANCE;
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                } else if (aVar15 instanceof ql2.a.C2739a) {
                    ql2.a.C2739a c2739a = (ql2.a.C2739a) aVar15;
                    wr.g.v("handleNfcDisconnectedEvent(", c2739a.f145237a, ")", cVar2.a());
                    long j15 = c2739a.f145237a;
                    synchronized (cVar2.f99618c) {
                        try {
                            boolean zContainsKey2 = cVar2.f99618c.containsKey(Long.valueOf(j15));
                            HashMap<Long, List<ql2.a>> map2 = cVar2.f99618c;
                            if (zContainsKey2) {
                                List<ql2.a> list2 = map2.get(Long.valueOf(j15));
                                if (list2 != null) {
                                    list2.clear();
                                    list2.add(c2739a);
                                } else {
                                    cVar2.a().error("Could not get entry from structure for unit ID " + j15);
                                    Unit unit5 = Unit.INSTANCE;
                                }
                            } else {
                                map2.put(Long.valueOf(j15), p13.x.m(c2739a));
                                Unit unit6 = Unit.INSTANCE;
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                } else if (aVar15 instanceof ql2.a.b) {
                    ql2.a.b bVar5 = (ql2.a.b) aVar15;
                    wr.g.v("handleDeviceAddedOrRemoved(", bVar5.f145238a, ")", cVar2.a());
                    long j16 = bVar5.f145238a;
                    synchronized (cVar2.f99618c) {
                        try {
                            boolean z14 = bVar5.f145239b;
                            HashMap<Long, List<ql2.a>> map3 = cVar2.f99618c;
                            if (z14) {
                                List<ql2.a> list3 = map3.get(Long.valueOf(j16));
                                if (list3 != null) {
                                    d0.A(list3, new jn2.b(i18), true);
                                } else {
                                    cVar2.f99618c.put(Long.valueOf(j16), p13.x.m(bVar5));
                                    Unit unit7 = Unit.INSTANCE;
                                }
                            } else {
                                List<ql2.a> list4 = map3.get(Long.valueOf(j16));
                                if (list4 != null) {
                                    list4.clear();
                                }
                                List<ql2.a> list5 = cVar2.f99618c.get(Long.valueOf(j16));
                                if (list5 != null) {
                                    list5.add(bVar5);
                                } else {
                                    cVar2.f99618c.put(Long.valueOf(j16), p13.x.m(bVar5));
                                    Unit unit8 = Unit.INSTANCE;
                                }
                            }
                        } catch (Throwable th8) {
                            throw th8;
                        }
                    }
                } else {
                    if (!(aVar15 instanceof ql2.a.c)) {
                        u0.r();
                        return;
                    }
                    ql2.a.c cVar3 = (ql2.a.c) aVar15;
                    wr.g.v("handleNfcFailed(", cVar3.f145240a, ")", cVar2.a());
                    long j17 = cVar3.f145240a;
                    synchronized (cVar2.f99618c) {
                        try {
                            List<ql2.a> list6 = cVar2.f99618c.get(Long.valueOf(j17));
                            if (list6 != null) {
                                list6.clear();
                                list6.add(cVar3);
                            } else {
                                cVar2.a().error("Could not get entry from structure for unit ID " + j17);
                                Unit unit9 = Unit.INSTANCE;
                            }
                        } catch (Throwable th9) {
                            throw th9;
                        }
                    }
                }
                try {
                    jn2.u.f99680a.getClass();
                    j20.x xVar = new j20.x(23);
                    int i30 = w03.b.f181178a;
                    new z03.h(xVar).e();
                    return;
                } catch (Exception e14) {
                    jn2.u.f99681b.error("Error while executing queue items", (Throwable) e14);
                    return;
                }
        }
    }

    public /* synthetic */ b(Object obj, int i14) {
        this.f64044a = i14;
        this.f64045b = obj;
    }
}
