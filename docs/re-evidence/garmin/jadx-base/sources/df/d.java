package df;

import android.graphics.Bitmap;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.telephony.SignalStrength;
import android.util.Range;
import android.view.Surface;
import android.widget.TextView;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.z1;
import androidx.lifecycle.w0;
import androidx.room.a0;
import b0.l0;
import com.airbnb.lottie.LottieAnimationView;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import com.garmin.android.apps.connectmobile.developer.NetworkDebugActivity;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDIHandCalibrationExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import g1.d0;
import h0.k0;
import h0.r0;
import h0.u0;
import h0.v0;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p13.c0;
import p13.h0;
import p13.j0;
import ve.t0;
import wn1.i0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59400c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f59398a = i14;
        this.f59399b = obj;
        this.f59400c = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        g1.j jVar;
        Executor executor;
        Collection collectionS0;
        int i14 = 1;
        ArrayList arrayList = null;
        switch (this.f59398a) {
            case 0:
                t0 t0Var = (t0) this.f59399b;
                String string = ((UUID) this.f59400c).toString();
                string.getClass();
                e.a(string, t0Var);
                return;
            case 1:
                Object obj = this.f59399b;
                DisplayWiFiNetworksActivity displayWiFiNetworksActivity = (DisplayWiFiNetworksActivity) this.f59400c;
                obj.getClass();
                di1.r rVar = (di1.r) obj;
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.SETTINGS;
                aVar.getClass();
                i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "retrieveWiFiNetworks.onResults: NetworkList=" + rVar);
                if (rVar.f59774b.size() <= 0) {
                    DisplayWiFiNetworksActivity.ca(displayWiFiNetworksActivity, rVar.f59773a, null);
                    return;
                }
                DisplayWiFiNetworksActivity.a aVar2 = DisplayWiFiNetworksActivity.f43230m;
                displayWiFiNetworksActivity.getClass();
                i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "verifyWiFiNetwork: " + rVar);
                displayWiFiNetworksActivity.f43239i = new di1.c(displayWiFiNetworksActivity, rVar);
                i0 i0VarM = i0.M();
                long j8 = displayWiFiNetworksActivity.f43231a;
                di1.c cVar = displayWiFiNetworksActivity.f43239i;
                i0VarM.getClass();
                com.garmin.android.library.backgroundtaskmanagement.c.d(new di1.o(j8, i0VarM), cVar);
                return;
            case 2:
                DisplayWiFiNetworksActivity displayWiFiNetworksActivity2 = (DisplayWiFiNetworksActivity) this.f59399b;
                di1.r rVar2 = (di1.r) this.f59400c;
                displayWiFiNetworksActivity2.f43234d = false;
                DisplayWiFiNetworksActivity.ca(displayWiFiNetworksActivity2, rVar2.f59773a, null);
                return;
            case 3:
                Object obj2 = this.f59399b;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar = (com.garmin.android.apps.connectmobile.settings.devices.wifi.b) this.f59400c;
                obj2.getClass();
                di1.r rVar3 = (di1.r) obj2;
                i2.f36769a.getClass();
                i2.a.b(a2.SETTINGS, "DisplayWiFiNetworksFragment", "retrieveWiFiNetworks.onResults: NetworkList=" + rVar3);
                if (bVar.f43270k.get()) {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.m mVar = bVar.f43263d;
                    mVar.getClass();
                    mVar.a(rVar3.f59773a);
                    return;
                }
                return;
            case 4:
                HandsCalibrationActivity handsCalibrationActivity = (HandsCalibrationActivity) this.f59399b;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f59400c;
                int i15 = HandsCalibrationActivity.d.f36592d;
                BubbleLayout bubbleLayout = handsCalibrationActivity.f36575j;
                if (bubbleLayout == null) {
                    p005kotlin.jvm.internal.s.m("cameraTooltip");
                    throw null;
                }
                String string2 = lottieAnimationView.getContext().getString(R.string.key_tooltip_hand_alignment_with_camera);
                string2.getClass();
                g22.o.a(bubbleLayout, string2);
                return;
            case 5:
                GDISmartProto.Smart smart = (GDISmartProto.Smart) this.f59399b;
                com.garmin.android.apps.connectmobile.handalignment.b.a aVar3 = (com.garmin.android.apps.connectmobile.handalignment.b.a) this.f59400c;
                smart.getClass();
                if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIHandCalibrationExtension.handCalibrationService)) {
                    aVar3.a(new IllegalStateException("No handCalibrationService passed."));
                    return;
                }
                GDIHandCalibration.HandCalibrationService handCalibrationServiceA = en0.o.a(smart);
                if (!handCalibrationServiceA.hasCommandResponse()) {
                    aVar3.a(new IllegalStateException("No handCalibrationCommandResponse passed."));
                    return;
                }
                GDIHandCalibration.CommandResponse commandResponse = handCalibrationServiceA.getCommandResponse();
                if (!commandResponse.hasStatus()) {
                    aVar3.a(new IllegalStateException("No status passed."));
                    return;
                }
                GDIHandCalibration.CommandResponse.Status status = commandResponse.getStatus();
                status.getClass();
                aVar3.b(status);
                return;
            case 6:
                mv0.b.a aVar4 = (mv0.b.a) this.f59399b;
                Location location = (Location) this.f59400c;
                int i16 = f7.b.f69398a;
                aVar4.accept(location);
                return;
            case 7:
                ((k7.b) this.f59399b).accept((Location) this.f59400c);
                return;
            case 8:
                ((xa.g) this.f59400c).onNetworkTypeChanged(((fa.o) this.f59399b).c());
                return;
            case 9:
                fw.e eVar = (fw.e) this.f59399b;
                com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = (com.garmin.android.library.backgroundtaskmanagement.b.c) this.f59400c;
                w0<fw.m<T>> w0Var = eVar.f73764l;
                fw.m.a aVar5 = fw.m.f73767e;
                Long lValueOf = Long.valueOf(eVar.f50096f);
                cVar2.getClass();
                w0Var.m((fw.m<T>) fw.m.a.c(aVar5, lValueOf, cVar2, 4));
                return;
            case 10:
                com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b = (com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b) this.f59399b;
                com.garmin.android.library.backgroundtaskmanagement.b bVar2 = (com.garmin.android.library.backgroundtaskmanagement.b) this.f59400c;
                interfaceC0995b.onComplete(bVar2.f50096f, bVar2.f());
                return;
            case 11:
                ((g1.r) this.f59399b).f74740n.remove((g1.r.a) this.f59400c);
                return;
            case 12:
                Executor executor2 = (Executor) this.f59399b;
                g1.r.d dVar = (g1.r.d) this.f59400c;
                Range<Long> range = g1.r.H;
                Objects.requireNonNull(dVar);
                executor2.execute(new eh2.b(dVar, 8));
                return;
            case 13:
                ((g1.r) this.f59399b).f74739m.remove((androidx.concurrent.futures.b.a) this.f59400c);
                return;
            case 14:
                g1.r.b bVar3 = (g1.r.b) this.f59399b;
                z1.a aVar6 = (z1.a) this.f59400c;
                LinkedHashMap linkedHashMap = bVar3.f74754a;
                aVar6.getClass();
                linkedHashMap.remove(aVar6);
                return;
            case 15:
                ((z1.a) this.f59399b).a((b1.c.a) this.f59400c);
                return;
            case 16:
                ((z1.a) ((Map.Entry) this.f59399b).getKey()).a((b1.c.a) this.f59400c);
                return;
            case 17:
                g1.r.d dVar2 = (g1.r.d) this.f59399b;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f59400c;
                g1.r rVar4 = g1.r.this;
                switch (rVar4.f74749w.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        rVar4.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        a0.s(rVar4.f74749w, "Unknown state: ");
                        return;
                }
            case 18:
                g1.r.d dVar3 = (g1.r.d) this.f59399b;
                MediaFormat mediaFormat = (MediaFormat) this.f59400c;
                boolean z14 = dVar3.f74778j;
                g1.r rVar5 = g1.r.this;
                if (z14) {
                    String str = rVar5.f74727a;
                    return;
                }
                switch (rVar5.f74749w.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        g1.r rVar6 = g1.r.this;
                        if (rVar6.f74729c && rVar6.c()) {
                            mediaFormat.setInteger("time-lapse-enable", 1);
                            mediaFormat.setInteger("time-lapse-fps", ((d0) g1.r.this.f74730d).f());
                        }
                        synchronized (g1.r.this.f74728b) {
                            g1.r rVar7 = g1.r.this;
                            jVar = rVar7.f74747u;
                            executor = rVar7.f74748v;
                            break;
                        }
                        try {
                            executor.execute(new d(19, jVar, mediaFormat));
                            return;
                        } catch (RejectedExecutionException unused) {
                            String str2 = g1.r.this.f74727a;
                            return;
                        }
                    default:
                        a0.s(g1.r.this.f74749w, "Unknown state: ");
                        return;
                }
            case 19:
                g1.j jVar2 = (g1.j) this.f59399b;
                MediaFormat mediaFormat2 = (MediaFormat) this.f59400c;
                int i17 = g1.r.d.f74768m;
                jVar2.a(new en0.n(mediaFormat2, 20));
                return;
            case 20:
                g1.j jVar3 = (g1.j) this.f59399b;
                g1.h hVar = (g1.h) this.f59400c;
                int i18 = g1.r.d.f74768m;
                jVar3.d(hVar);
                return;
            case 21:
                ((g1.i.c.a) this.f59399b).b((Surface) this.f59400c);
                return;
            case 22:
                NetworkDebugActivity networkDebugActivity = (NetworkDebugActivity) this.f59399b;
                String str3 = (String) this.f59400c;
                if (networkDebugActivity.f33625b >= 300) {
                    TextView textView = networkDebugActivity.f33624a;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("tv");
                        throw null;
                    }
                    textView.setText("*** buffer cleared ***");
                    networkDebugActivity.f33625b = 0;
                }
                TextView textView2 = networkDebugActivity.f33624a;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("tv");
                    throw null;
                }
                textView2.append("\n" + str3);
                networkDebugActivity.f33625b = networkDebugActivity.f33625b + 1;
                return;
            case 23:
                NetworkDebugActivity networkDebugActivity2 = (NetworkDebugActivity) this.f59399b;
                SignalStrength signalStrength = (SignalStrength) this.f59400c;
                int i19 = NetworkDebugActivity.c.f33644b;
                networkDebugActivity2.f33634k = signalStrength.getLevel();
                networkDebugActivity2.a();
                return;
            case 24:
                com.garmin.android.apps.connectmobile.audioprompts.b bVar4 = (com.garmin.android.apps.connectmobile.audioprompts.b) this.f59399b;
                gu.e eVar2 = (gu.e) this.f59400c;
                AudioPromptsService.e eVar3 = bVar4.f30224b;
                if (eVar3 != null) {
                    AudioPromptsService audioPromptsService = AudioPromptsService.this;
                    d dVar4 = new d(25, eVar2, eVar3);
                    nu.h hVar2 = audioPromptsService.f30197d;
                    if (hVar2 == null) {
                        p005kotlin.jvm.internal.s.m("tts");
                        throw null;
                    }
                    if (hVar2.getF127875c()) {
                        dVar4.run();
                        return;
                    } else {
                        audioPromptsService.f30201h.add(dVar4);
                        return;
                    }
                }
                return;
            case 25:
                gu.e eVar4 = (gu.e) this.f59399b;
                nu.h hVar3 = AudioPromptsService.this.f30197d;
                if (hVar3 == null) {
                    p005kotlin.jvm.internal.s.m("tts");
                    throw null;
                }
                LinkedHashSet linkedHashSetH = hVar3.h();
                Locale[] localeArr = linkedHashSetH.isEmpty() ? null : (Locale[]) linkedHashSetH.toArray(new Locale[0]);
                if (localeArr != null && localeArr.length != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Locale locale : localeArr) {
                        String language = locale.getLanguage();
                        language.getClass();
                        if (language.length() > 0) {
                            String country = locale.getCountry();
                            country.getClass();
                            if (country.length() > 0) {
                                String strG = e5.g(locale.getLanguage(), "-", locale.getCountry());
                                if (!arrayList2.contains(strG)) {
                                    arrayList2.add(strG);
                                }
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        c0.t(arrayList2);
                        arrayList = new ArrayList(arrayList2.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            List listG = new d53.k("-").g(0, (String) it.next());
                            if (listG.isEmpty()) {
                                collectionS0 = j0.f134944a;
                            }
                            ListIterator listIterator = listG.listIterator(listG.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (((String) listIterator.previous()).length() != 0) {
                                        collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                                    }
                                } else {
                                    collectionS0 = j0.f134944a;
                                }
                                break;
                            }
                            break;
                            String[] strArr = (String[]) collectionS0.toArray(new String[0]);
                            arrayList.add(new Locale(strArr[0], strArr[1]));
                        }
                    }
                }
                eVar4.f(arrayList);
                return;
            case 26:
                h0.j0 j0Var = (h0.j0) this.f59399b;
                androidx.camera.core.e eVar5 = (androidx.camera.core.e) this.f59400c;
                k0 k0Var = (k0) j0Var.f80516i;
                k0Var.getClass();
                j0.u.a();
                if (k0Var.f80527g) {
                    eVar5.close();
                    return;
                }
                k7.h.f(k0Var.f80523c.f6084b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                k0Var.a();
                v0 v0Var = k0Var.f80521a;
                v0Var.a().execute(new r0(2, v0Var, eVar5));
                return;
            case 27:
                h0.j0 j0Var2 = (h0.j0) this.f59399b;
                l0.i iVar = (l0.i) this.f59400c;
                k0 k0Var2 = (k0) j0Var2.f80516i;
                k0Var2.getClass();
                j0.u.a();
                if (k0Var2.f80527g) {
                    return;
                }
                k7.h.f(k0Var2.f80523c.f6084b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                k0Var2.a();
                v0 v0Var2 = k0Var2.f80521a;
                v0Var2.a().execute(new r0(3, v0Var2, iVar));
                return;
            case 28:
                h0.j0 j0Var3 = (h0.j0) this.f59399b;
                Bitmap bitmap = (Bitmap) this.f59400c;
                k0 k0Var3 = (k0) j0Var3.f80516i;
                k0Var3.getClass();
                j0.u.a();
                if (k0Var3.f80527g) {
                    return;
                }
                v0 v0Var3 = k0Var3.f80521a;
                v0Var3.a().execute(new u0(v0Var3, bitmap));
                return;
            default:
                h0.j0 j0Var4 = (h0.j0) this.f59399b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.f59400c;
                k0 k0Var4 = (k0) j0Var4.f80516i;
                k0Var4.getClass();
                j0.u.a();
                if (k0Var4.f80527g) {
                    return;
                }
                k7.h.f(k0Var4.f80523c.f6084b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                k0Var4.a();
                j0.u.a();
                v0 v0Var4 = k0Var4.f80521a;
                v0Var4.a().execute(new r0(i14, v0Var4, imageCaptureException));
                return;
        }
    }
}
