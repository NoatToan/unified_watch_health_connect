package fh2;

import a73.f;
import android.app.Activity;
import android.content.Context;
import android.media.MediaCodec;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Size;
import android.view.ActionMode;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.window.SurfaceSyncGroup;
import androidx.camera.core.impl.z1;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.fragment.app.Fragment;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import b0.g1;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.RangeCalendar;
import com.garmin.androiddynamicsettings.networklayer.util.DynamicSettingsException;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import fa.z;
import g1.r;
import g1.v;
import hd1.a0;
import hd1.g;
import i80.e;
import j1.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ji2.k;
import ji2.l;
import ji2.m;
import ji2.n;
import ji2.o;
import ji2.q;
import ji2.t;
import ji2.u;
import ki2.i;
import ki2.j;
import ma2.h;
import ml2.f0;
import ml2.h0;
import ml2.y;
import o13.p;
import org.joda.time.LocalDate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import ue.i0;
import ue.x;
import ve.c0;
import ve.t0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f71620d;

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f71617a = i14;
        this.f71618b = obj;
        this.f71619c = obj2;
        this.f71620d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0405  */
    /* JADX WARN: Code duplicated, block: B:164:0x0476 A[Catch: Exception -> 0x04a6, TryCatch #16 {Exception -> 0x04a6, blocks: (B:161:0x0448, B:162:0x0470, B:164:0x0476, B:166:0x0484, B:169:0x04a8, B:171:0x04b5, B:172:0x04c8), top: B:443:0x0448 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x04b5 A[Catch: Exception -> 0x04a6, TryCatch #16 {Exception -> 0x04a6, blocks: (B:161:0x0448, B:162:0x0470, B:164:0x0476, B:166:0x0484, B:169:0x04a8, B:171:0x04b5, B:172:0x04c8), top: B:443:0x0448 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:? A[LOOP:1: B:155:0x03ff->B:460:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x0470 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        f fVar;
        String strDecode;
        String str;
        mi2.b bVar;
        String str2;
        String string;
        String strDecode2;
        String str3;
        ni2.a aVar;
        String str4;
        String str5;
        String str6;
        String str7;
        Iterator it;
        mi2.b bVar2;
        String str8;
        String str9;
        String string2;
        j jVar;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        Object obj;
        String str10;
        String str11;
        JSONObject jSONObject;
        String string9;
        String str12;
        String imei;
        String iccid;
        GDILTEProto.LTEDeviceInfoResponse.ResponseStatus responseStatus;
        GDILTEProto.LTEDeviceInfo lteDeviceInfo;
        GDILTEProto.LTEDeviceInfo lteDeviceInfo2;
        boolean zEquals = false;
        String strName = null;
        switch (this.f71617a) {
            case 0:
                ((d) this.f71618b).f71631d.j(h.f117687o, (UUID) this.f71619c, (byte[]) this.f71620d);
                break;
            case 1:
                r rVar = (r) this.f71618b;
                ArrayList arrayList = (ArrayList) this.f71619c;
                Runnable runnable = (Runnable) this.f71620d;
                if (rVar.f74749w != r.c.ERROR) {
                    arrayList.isEmpty();
                    if ((rVar.f74733g instanceof r.e) && !rVar.E && e1.a.f61851a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        boolean z14 = rVar.f74746t;
                        MediaCodec mediaCodec = rVar.f74732f;
                        if (z14) {
                            mediaCodec.stop();
                        } else {
                            mediaCodec.flush();
                        }
                        rVar.D = true;
                    } else {
                        rVar.f74732f.stop();
                    }
                }
                runnable.run();
                r.c cVar = rVar.f74749w;
                if (cVar == r.c.PENDING_RELEASE) {
                    rVar.h();
                } else {
                    if (!rVar.D) {
                        rVar.j();
                    }
                    rVar.l(r.c.CONFIGURED);
                    if (cVar == r.c.PENDING_START || cVar == r.c.PENDING_START_PAUSED) {
                        rVar.n();
                        if (cVar == r.c.PENDING_START_PAUSED) {
                            rVar.f();
                        }
                    }
                }
                break;
            case 2:
                r.b bVar3 = (r.b) this.f71618b;
                z1.a aVar2 = (z1.a) this.f71619c;
                Executor executor = (Executor) this.f71620d;
                LinkedHashMap linkedHashMap = bVar3.f74754a;
                aVar2.getClass();
                executor.getClass();
                linkedHashMap.put(aVar2, executor);
                executor.execute(new df.d(15, aVar2, bVar3.f74755b));
                break;
            case 3:
                r.d dVar = (r.d) this.f71618b;
                Executor executor2 = (Executor) this.f71619c;
                g1.j jVar2 = (g1.j) this.f71620d;
                if (r.this.f74749w != r.c.ERROR) {
                    try {
                        Objects.requireNonNull(jVar2);
                        executor2.execute(new v(jVar2, 1));
                    } catch (RejectedExecutionException unused) {
                        return;
                    }
                    break;
                }
                break;
            case 4:
                BubbleLayout bubbleLayout = (BubbleLayout) this.f71618b;
                m0 m0Var = (m0) this.f71619c;
                e23.a aVar3 = (e23.a) this.f71620d;
                Context context = bubbleLayout.getContext();
                context.getClass();
                if (!((Activity) context).isFinishing()) {
                    bubbleLayout.setVisibility(8);
                    if (!m0Var.f105804a) {
                        m0Var.f105804a = true;
                        aVar3.invoke();
                    }
                }
                break;
            case 5:
                ((g) this.f71618b).a((a0) this.f71619c, (Long) this.f71620d);
                break;
            case 6:
                RangeCalendar.i((RangeCalendar) this.f71618b, (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b.a) this.f71619c, (LocalDate) this.f71620d);
                break;
            case 7:
                e eVar = (e) this.f71618b;
                View view2 = (View) this.f71619c;
                List<i80.f> list = (List) this.f71620d;
                eVar.u6("Sandbox: " + ((int) eVar.f92233d) + ", Public: " + ((int) eVar.f92234e));
                RecyclerView.h adapter = ((RecyclerView) view2).getAdapter();
                adapter.getClass();
                i80.h hVar = (i80.h) adapter;
                list.getClass();
                hVar.f92244c = list;
                hVar.notifyDataSetChanged();
                break;
            case 8:
                w wVar = (w) this.f71618b;
                g1 g1Var = (g1) this.f71619c;
                f fVar2 = (f) this.f71620d;
                w.a aVar4 = wVar.f96318f;
                g1 g1Var2 = aVar4.f96320b;
                if (g1Var2 != null) {
                    Objects.toString(g1Var2);
                    if (aVar4.f96320b.d() && (fVar = aVar4.f96322d) != null) {
                        fVar.a();
                    }
                }
                if (aVar4.f96325g) {
                    aVar4.f96325g = false;
                    g1Var.d();
                    g1Var.f13915k.b(null);
                } else {
                    aVar4.f96320b = g1Var;
                    aVar4.f96322d = fVar2;
                    Size size = g1Var.f13906b;
                    aVar4.f96319a = size;
                    aVar4.f96324f = false;
                    if (!aVar4.a()) {
                        w.this.f96317e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    }
                }
                break;
            case 9:
                String str13 = (String) this.f71618b;
                ji2.j jVar3 = (ji2.j) this.f71619c;
                mi2.b bVar4 = jVar3.f98863c;
                li2.b bVar5 = (li2.b) this.f71620d;
                hi2.d dVar2 = ji2.j.f98861f;
                li2.a aVar5 = jVar3.f98862b;
                String str14 = aVar5.f112906g;
                String str15 = aVar5.f112903d;
                JSONObject jSONObject2 = new JSONObject(str13);
                ArrayList arrayList2 = new ArrayList();
                String strDecode3 = "";
                try {
                    Object objRemove = jSONObject2.remove("goals");
                    if (objRemove == null || (string8 = objRemove.toString()) == null) {
                        string8 = "";
                    }
                    ki2.f.f104922a.getClass();
                    strDecode = ki2.f.a.a(aVar5, "goals").decode(string8);
                } catch (Exception e4) {
                    dVar2.b("getUpdatedGoalsData: failed " + e4 + ".");
                    strDecode = "";
                }
                String str16 = "FLOORS_CLIMBED";
                String str17 = "INTENSITY_MINUTES";
                if (TextUtils.isEmpty(strDecode)) {
                    str = "device";
                    bVar = bVar4;
                    str2 = str15;
                } else {
                    ki2.f.f104922a.getClass();
                    JSONArray jSONArray = new JSONArray(strDecode);
                    str2 = str15;
                    int length = jSONArray.length();
                    str = "device";
                    bVar = bVar4;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            int i15 = length;
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i14);
                            JSONArray jSONArray2 = jSONArray;
                            if (s.g(jSONObject3.getString("goalType"), "INTENSITY_MINUTES")) {
                                string6 = jSONObject3.toString();
                                string6.getClass();
                            } else {
                                i14++;
                                length = i15;
                                jSONArray = jSONArray2;
                            }
                        } else {
                            i.f104927a.getClass();
                            string6 = "";
                        }
                    }
                    JSONArray jSONArray3 = new JSONArray(strDecode);
                    int length2 = jSONArray3.length();
                    int i16 = 0;
                    while (true) {
                        if (i16 < length2) {
                            int i17 = length2;
                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i16);
                            JSONArray jSONArray4 = jSONArray3;
                            if (s.g(jSONObject4.getString("goalType"), "FLOORS_CLIMBED")) {
                                string7 = jSONObject4.toString();
                                string7.getClass();
                            } else {
                                i16++;
                                length2 = i17;
                                jSONArray3 = jSONArray4;
                            }
                        } else {
                            i.f104927a.getClass();
                            string7 = "";
                        }
                    }
                    if (!TextUtils.isEmpty(string6)) {
                        com.nimbusds.jose.shaded.gson.internal.a.u("INTENSITY_MINUTES", string6, arrayList2);
                    }
                    if (!TextUtils.isEmpty(string7)) {
                        com.nimbusds.jose.shaded.gson.internal.a.u("FLOORS_CLIMBED", string7, arrayList2);
                    }
                }
                try {
                    JSONObject jSONObject5 = new JSONObject();
                    JSONObject jSONObject6 = new JSONObject();
                    if (jSONObject2.has("moderateIntensityMinutesHrZone")) {
                        Object objRemove2 = jSONObject2.remove("moderateIntensityMinutesHrZone");
                        try {
                            jSONObject6.put("moderateIntensityMinutesHrZone", (objRemove2 == null || (string5 = objRemove2.toString()) == null) ? "" : string5);
                        } catch (Exception e14) {
                            e = e14;
                            dVar2.b("getUpdatedIntensityMinutesCalcMethodData: failed " + e + ".");
                            string = "";
                        }
                    } else {
                        str16 = "FLOORS_CLIMBED";
                    }
                    if (jSONObject2.has("vigorousIntensityMinutesHrZone")) {
                        Object objRemove3 = jSONObject2.remove("vigorousIntensityMinutesHrZone");
                        if (objRemove3 == null || (string4 = objRemove3.toString()) == null) {
                            string4 = "";
                        }
                        jSONObject6.put("vigorousIntensityMinutesHrZone", string4);
                    }
                    if (jSONObject2.has("intensityMinutesCalcMethod")) {
                        Object objRemove4 = jSONObject2.remove("intensityMinutesCalcMethod");
                        if (objRemove4 == null || (string3 = objRemove4.toString()) == null) {
                            string3 = "";
                        }
                        jSONObject6.put("intensityMinutesCalcMethod", string3);
                    }
                    if (jSONObject6.length() > 0) {
                        jSONObject5.put("userData", jSONObject6);
                        string = jSONObject5.toString();
                    } else {
                        string = "";
                    }
                    string.getClass();
                } catch (Exception e15) {
                    e = e15;
                    str16 = "FLOORS_CLIMBED";
                }
                String str18 = "INTENSITY_MINUTES_CALC_METHOD";
                if (!TextUtils.isEmpty(string)) {
                    com.nimbusds.jose.shaded.gson.internal.a.u("INTENSITY_MINUTES_CALC_METHOD", string, arrayList2);
                }
                try {
                    Object objRemove5 = jSONObject2.remove("steps");
                    if (objRemove5 == null || (string2 = objRemove5.toString()) == null) {
                        string2 = "";
                    }
                    ki2.f.f104922a.getClass();
                    try {
                        jVar = (j) ki2.f.a.a(aVar5, "steps");
                    } catch (ClassCastException unused2) {
                        jVar = null;
                    }
                    strDecode2 = jVar != null ? jVar.decode(string2) : "";
                } catch (Exception e16) {
                    dVar2.b("getUpdatedStepsData: failed " + e16 + ".");
                }
                if (!TextUtils.isEmpty(strDecode2)) {
                    com.nimbusds.jose.shaded.gson.internal.a.u("steps", strDecode2, arrayList2);
                }
                String strC = jVar3.c(jSONObject2, "runOptions");
                if (!d53.w.J(strC)) {
                    com.nimbusds.jose.shaded.gson.internal.a.u("runOptions", strC, arrayList2);
                }
                String strC2 = jVar3.c(jSONObject2, "walkOptions");
                if (!d53.w.J(strC2)) {
                    com.nimbusds.jose.shaded.gson.internal.a.u("walkOptions", strC2, arrayList2);
                }
                try {
                    ki2.f.f104922a.getClass();
                    str3 = str;
                    try {
                        ki2.e eVarA = ki2.f.a.a(aVar5, str3);
                        String string10 = jSONObject2.toString();
                        string10.getClass();
                        strDecode3 = eVarA.decode(string10);
                    } catch (Exception e17) {
                        e = e17;
                        dVar2.b("getUpdatedDeviceSettingsData: failed " + e + ".");
                    }
                } catch (Exception e18) {
                    e = e18;
                    str3 = str;
                }
                String str19 = strDecode3;
                if (new JSONObject(str19).length() > 0) {
                    com.nimbusds.jose.shaded.gson.internal.a.u(str3, str19, arrayList2);
                }
                if (arrayList2.size() > 0) {
                    String str20 = jVar3.f98865e;
                    CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        p pVar = (p) it3.next();
                        A a14 = pVar.f128594a;
                        B b14 = pVar.f128595b;
                        String str21 = (String) a14;
                        switch (str21.hashCode()) {
                            case -1335157162:
                                String str22 = str2;
                                str5 = str18;
                                str6 = str16;
                                str7 = str22;
                                it = it3;
                                bVar2 = bVar;
                                str20 = str20;
                                str8 = str17;
                                if (str21.equals(str3)) {
                                    long j8 = aVar5.f112900a;
                                    String str23 = (String) b14;
                                    bVar2.getClass();
                                    str23.getClass();
                                    bVar2.f118990a.m(j8, str23).q0(new ji2.p(countDownLatch, arrayList2, pVar));
                                } else {
                                    arrayList2.remove(pVar);
                                    countDownLatch.countDown();
                                    dVar2.b("Did not find save functionality");
                                }
                                break;
                            case -690050923:
                                it = it3;
                                bVar2 = bVar;
                                str8 = str17;
                                str9 = str2;
                                str5 = str18;
                                str6 = str16;
                                if (str21.equals("walkOptions")) {
                                    str20 = str20;
                                    str7 = str9;
                                    long j14 = aVar5.f112900a;
                                    String str24 = aVar5.f112905f;
                                    String str25 = (String) b14;
                                    bVar2.getClass();
                                    str24.getClass();
                                    str14.getClass();
                                    str25.getClass();
                                    bVar2.f118990a.b(j14, str24, str14, str25).q0(new ji2.v(countDownLatch, arrayList2, pVar));
                                } else {
                                    str20 = str20;
                                    str7 = str9;
                                    arrayList2.remove(pVar);
                                    countDownLatch.countDown();
                                    dVar2.b("Did not find save functionality");
                                }
                                break;
                            case 109761319:
                                it = it3;
                                bVar2 = bVar;
                                str8 = str17;
                                str9 = str2;
                                str5 = str18;
                                str6 = str16;
                                if (str21.equals("steps")) {
                                    str20.getClass();
                                    String str26 = (String) b14;
                                    bVar2.getClass();
                                    str9.getClass();
                                    str26.getClass();
                                    bVar2.f118990a.i(str20, str9, str26).q0(new t(countDownLatch, arrayList2, pVar));
                                    str7 = str9;
                                }
                                str20 = str20;
                                str7 = str9;
                                arrayList2.remove(pVar);
                                countDownLatch.countDown();
                                dVar2.b("Did not find save functionality");
                                break;
                            case 542156700:
                                it = it3;
                                bVar2 = bVar;
                                str8 = str17;
                                str9 = str2;
                                str5 = str18;
                                str6 = str16;
                                if (str21.equals(str6)) {
                                    str20.getClass();
                                    String str27 = (String) b14;
                                    bVar2.getClass();
                                    str9.getClass();
                                    str27.getClass();
                                    bVar2.f118990a.c(str20, str9, str27).q0(new ji2.s(countDownLatch, arrayList2, pVar));
                                    str7 = str9;
                                }
                                str20 = str20;
                                str7 = str9;
                                arrayList2.remove(pVar);
                                countDownLatch.countDown();
                                dVar2.b("Did not find save functionality");
                                break;
                            case 1199276435:
                                bVar2 = bVar;
                                str8 = str17;
                                str9 = str2;
                                if (str21.equals("runOptions")) {
                                    str5 = str18;
                                    it = it3;
                                    long j15 = aVar5.f112900a;
                                    String str28 = aVar5.f112904e;
                                    String str29 = (String) b14;
                                    bVar2.getClass();
                                    str28.getClass();
                                    str14.getClass();
                                    str29.getClass();
                                    bVar2.f118990a.b(j15, str28, str14, str29).q0(new u(countDownLatch, arrayList2, pVar));
                                    str6 = str16;
                                    str7 = str9;
                                }
                                str5 = str18;
                                it = it3;
                                str6 = str16;
                                str20 = str20;
                                str7 = str9;
                                arrayList2.remove(pVar);
                                countDownLatch.countDown();
                                dVar2.b("Did not find save functionality");
                                break;
                            case 1574945887:
                                bVar2 = bVar;
                                str8 = str17;
                                str9 = str2;
                                if (str21.equals(str18)) {
                                    String str30 = (String) b14;
                                    bVar2.getClass();
                                    str30.getClass();
                                    bVar2.f118990a.o(str30).q0(new ji2.r(countDownLatch, arrayList2, pVar));
                                    str5 = str18;
                                    it = it3;
                                    str6 = str16;
                                    str7 = str9;
                                }
                                str5 = str18;
                                it = it3;
                                str6 = str16;
                                str20 = str20;
                                str7 = str9;
                                arrayList2.remove(pVar);
                                countDownLatch.countDown();
                                dVar2.b("Did not find save functionality");
                                break;
                            case 1645982867:
                                if (str21.equals(str17)) {
                                    str20.getClass();
                                    String str31 = (String) b14;
                                    bVar.getClass();
                                    str2.getClass();
                                    str31.getClass();
                                    bVar2 = bVar;
                                    str8 = str17;
                                    str9 = str2;
                                    bVar2.f118990a.n(str20, str9, str31).q0(new q(countDownLatch, arrayList2, pVar));
                                    str5 = str18;
                                    it = it3;
                                    str6 = str16;
                                    str7 = str9;
                                    break;
                                }
                            default:
                                String str32 = str2;
                                str5 = str18;
                                str6 = str16;
                                str7 = str32;
                                it = it3;
                                bVar2 = bVar;
                                str20 = str20;
                                str8 = str17;
                                arrayList2.remove(pVar);
                                countDownLatch.countDown();
                                dVar2.b("Did not find save functionality");
                                break;
                        }
                        String str33 = str7;
                        str16 = str6;
                        str18 = str5;
                        str2 = str33;
                        str20 = str20;
                        str17 = str8;
                        it3 = it;
                        bVar = bVar2;
                    }
                    try {
                        countDownLatch.await();
                        aVar = bVar5;
                        str4 = null;
                    } catch (InterruptedException e19) {
                        dVar2.b("Interrupted exception for save.");
                        aVar = bVar5;
                        str4 = null;
                        aVar.b(null, e19);
                    }
                    if (arrayList2.size() > 0) {
                        aVar.b(str4, new IOException("Failed to save device settings..."));
                    } else {
                        aVar.onSuccess(Unit.INSTANCE);
                    }
                } else {
                    bVar5.a();
                }
                break;
            case 10:
                ji2.j jVar4 = (ji2.j) this.f71618b;
                String str34 = (String) this.f71619c;
                ai2.e.a aVar6 = (ai2.e.a) this.f71620d;
                hi2.d dVar3 = ji2.j.f98861f;
                String str35 = jVar4.f98865e;
                li2.a aVar7 = jVar4.f98862b;
                String str36 = aVar7.f112906g;
                String str37 = aVar7.f112903d;
                long j16 = aVar7.f112900a;
                mi2.b bVar6 = jVar4.f98863c;
                hi2.d dVar4 = ji2.j.f98861f;
                CountDownLatch countDownLatch2 = new CountDownLatch(5);
                HashMap map = new HashMap();
                try {
                    obj = "walkOptions";
                    try {
                        bVar6.f118990a.a(j16).q0(new k(map, countDownLatch2));
                    } catch (Exception unused3) {
                        dVar4.b("onDataLoaded: Exception");
                        map.put("device", null);
                        countDownLatch2.countDown();
                    }
                } catch (Exception unused4) {
                    obj = "walkOptions";
                }
                try {
                    str35.getClass();
                    bVar6.getClass();
                    str37.getClass();
                    str10 = str35;
                    try {
                        str11 = "device";
                        try {
                            bVar6.f118990a.h(str10, str37).q0(new l(map, countDownLatch2));
                        } catch (Exception unused5) {
                            dVar4.b("onDataLoaded: Exception");
                            map.put("goals", null);
                            countDownLatch2.countDown();
                        }
                    } catch (Exception unused6) {
                        str11 = "device";
                        dVar4.b("onDataLoaded: Exception");
                        map.put("goals", null);
                        countDownLatch2.countDown();
                        str10.getClass();
                        bVar6.getClass();
                        str37.getClass();
                        bVar6.f118990a.f(str10, str37).q0(new m(map, countDownLatch2));
                        String str38 = aVar7.f112904e;
                        bVar6.getClass();
                        str38.getClass();
                        str36.getClass();
                        bVar6.f118990a.p(j16, str38, str36).q0(new n(map, countDownLatch2));
                        String str39 = aVar7.f112905f;
                        bVar6.getClass();
                        str39.getClass();
                        str36.getClass();
                        bVar6.f118990a.p(j16, str39, str36).q0(new o(map, countDownLatch2));
                        countDownLatch2.await();
                        for (Map.Entry entry : map.entrySet()) {
                            if (entry.getValue() == null) {
                                dVar4.b("fetchData: Failed to fetch " + entry.getKey() + ".");
                                aVar6.b(null, new DynamicSettingsException(org.apache.commons.lang3.e.f("Failed to fetch ", " settings", entry.getKey())));
                                return;
                            }
                        }
                        ki2.f.f104922a.getClass();
                        jSONObject = new JSONObject(ki2.f.a.a(aVar7, str11).encode(String.valueOf(map.remove(ni2.b.DEVICE.f126214a))));
                        for (Map.Entry entry2 : map.entrySet()) {
                            str12 = (String) entry2.getValue();
                            if (str12 != null) {
                                String str40 = (String) entry2.getKey();
                                ki2.f.a aVar8 = ki2.f.f104922a;
                                String str41 = (String) entry2.getKey();
                                aVar8.getClass();
                                jSONObject.put(str40, new JSONObject(ki2.f.a.a(aVar7, str41).encode(str12)));
                            }
                        }
                        string9 = jSONObject.toString();
                        string9.getClass();
                        if (string9.length() > 0) {
                            dVar4.getClass();
                            ji2.h.f98854a.getClass();
                            ji2.h.a.f98857c.put(str34, jSONObject.toString());
                        }
                        String string11 = jSONObject.toString();
                        string11.getClass();
                        aVar6.onSuccess(string11);
                        return;
                    }
                } catch (Exception unused7) {
                    str10 = str35;
                }
                try {
                    str10.getClass();
                    bVar6.getClass();
                    str37.getClass();
                    bVar6.f118990a.f(str10, str37).q0(new m(map, countDownLatch2));
                } catch (Exception unused8) {
                    dVar4.b("onDataLoaded: Exception");
                    map.put("steps", null);
                    countDownLatch2.countDown();
                }
                try {
                    String str310 = aVar7.f112904e;
                    bVar6.getClass();
                    str310.getClass();
                    str36.getClass();
                    bVar6.f118990a.p(j16, str310, str36).q0(new n(map, countDownLatch2));
                } catch (Exception unused9) {
                    dVar4.b("onDataLoaded: Exception");
                    map.put("runOptions", null);
                    countDownLatch2.countDown();
                }
                try {
                    String str311 = aVar7.f112905f;
                    bVar6.getClass();
                    str311.getClass();
                    str36.getClass();
                    bVar6.f118990a.p(j16, str311, str36).q0(new o(map, countDownLatch2));
                } catch (Exception unused10) {
                    dVar4.b("onDataLoaded: Exception");
                    map.put(obj, null);
                    countDownLatch2.countDown();
                }
                try {
                    countDownLatch2.await();
                } catch (InterruptedException unused11) {
                    dVar4.b("Interrupted exception.");
                }
                while (r0.hasNext()) {
                    if (entry.getValue() == null) {
                        dVar4.b("fetchData: Failed to fetch " + entry.getKey() + ".");
                        aVar6.b(null, new DynamicSettingsException(org.apache.commons.lang3.e.f("Failed to fetch ", " settings", entry.getKey())));
                    }
                }
                try {
                    ki2.f.f104922a.getClass();
                    jSONObject = new JSONObject(ki2.f.a.a(aVar7, str11).encode(String.valueOf(map.remove(ni2.b.DEVICE.f126214a))));
                    while (r3.hasNext()) {
                        str12 = (String) entry2.getValue();
                        if (str12 != null) {
                            String str42 = (String) entry2.getKey();
                            ki2.f.a aVar9 = ki2.f.f104922a;
                            String str43 = (String) entry2.getKey();
                            aVar9.getClass();
                            jSONObject.put(str42, new JSONObject(ki2.f.a.a(aVar7, str43).encode(str12)));
                        }
                    }
                    string9 = jSONObject.toString();
                    string9.getClass();
                    if (string9.length() > 0) {
                        dVar4.getClass();
                        ji2.h.f98854a.getClass();
                        ji2.h.a.f98857c.put(str34, jSONObject.toString());
                    }
                    String string12 = jSONObject.toString();
                    string12.getClass();
                    aVar6.onSuccess(string12);
                } catch (Exception e24) {
                    dVar4.b("fetchData: Failed to fetch data with exception " + e24 + ".");
                    aVar6.b(null, e24);
                    return;
                }
                break;
            case 11:
                androidx.media3.exoplayer.audio.b.a aVar10 = (androidx.media3.exoplayer.audio.b.a) this.f71618b;
                androidx.media3.common.q qVar = (androidx.media3.common.q) this.f71619c;
                androidx.media3.exoplayer.h hVar2 = (androidx.media3.exoplayer.h) this.f71620d;
                androidx.media3.exoplayer.audio.b bVar7 = aVar10.f8767b;
                int i18 = z.f70071a;
                bVar7.G(qVar, hVar2);
                break;
            case 12:
                PlayerView.e eVar2 = (PlayerView.e) this.f71618b;
                SurfaceView surfaceView = (SurfaceView) this.f71619c;
                k32.n nVar = (k32.n) this.f71620d;
                eVar2.getClass();
                AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
                if (rootSurfaceControl != null) {
                    SurfaceSyncGroup surfaceSyncGroupQ = fd.i.q();
                    eVar2.f9981a = surfaceSyncGroupQ;
                    fa.a.d(surfaceSyncGroupQ.add(rootSurfaceControl, new ab2.a(9)));
                    nVar.run();
                    rootSurfaceControl.applyTransactionOnDraw(cq0.d.c());
                    break;
                }
                break;
            case 13:
                androidx.media3.exoplayer.drm.b.a aVar11 = (androidx.media3.exoplayer.drm.b.a) this.f71618b;
                ((androidx.media3.exoplayer.drm.b) this.f71619c).m(aVar11.f8894a, aVar11.f8895b, (Exception) this.f71620d);
                break;
            case 14:
                la2.e.c cVar2 = (la2.e.c) this.f71618b;
                ma2.j jVar5 = (ma2.j) this.f71619c;
                DeviceProfile deviceProfile = (DeviceProfile) this.f71620d;
                try {
                    jVar5.d(deviceProfile);
                } catch (Throwable th3) {
                    la2.e.this.f111648g.error("onGarminDevice callback failed: " + deviceProfile, th3);
                    return;
                }
                break;
            case 15:
                ni2.a aVar12 = (ni2.a) this.f71618b;
                Throwable th4 = (Throwable) this.f71619c;
                String str44 = (String) this.f71620d;
                aVar12.getClass();
                th4.getClass();
                aVar12.b(str44, th4);
                break;
            case 16:
                m9.b bVar8 = (m9.b) this.f71618b;
                String str45 = (String) this.f71619c;
                m9.i iVar = (m9.i) this.f71620d;
                bVar8.f117216a.getSharedPreferences("PermissionTokenManager.healthdata", 0).edit().putString("token", str45).commit();
                try {
                    iVar.onSuccess();
                } catch (RemoteException e25) {
                    e25.getMessage();
                    return;
                }
                break;
            case 17:
                ma2.a aVar13 = (ma2.a) this.f71618b;
                String str46 = (String) this.f71619c;
                da2.e eVar3 = (da2.e) this.f71620d;
                AtomicReference<Timer> atomicReference = ma2.a.f117631h;
                aVar13.getClass();
                aVar13.d(str46, false, ma2.i.PERSISTENT, aVar13.f117635c, eVar3);
                break;
            case 18:
                y yVar = (y) this.f71618b;
                ml2.s sVar = (ml2.s) this.f71619c;
                byte[] bArr = (byte[]) this.f71620d;
                int i19 = ml2.s.f119441m;
                yVar.getClass();
                bArr.getClass();
                yVar.a(sVar.f119442a.f119488a, bArr);
                break;
            case 19:
                r0 r0Var = (r0) this.f71618b;
                y yVar2 = (y) this.f71619c;
                ml2.s sVar2 = (ml2.s) this.f71620d;
                int i24 = ml2.s.f119441m;
                yVar2.getClass();
                List list2 = (List) r0Var.f105810a;
                if (list2 != null) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        yVar2.a(sVar2.f119442a.f119488a, (byte[]) it4.next());
                    }
                }
                break;
            case 20:
                h0 h0Var = (h0) this.f71618b;
                f0 f0Var = (f0) this.f71619c;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f71620d;
                h0Var.f119353f.w(f0Var);
                scheduledExecutorService.shutdown();
                break;
            case 21:
                GDISmartProto.Smart smart = (GDISmartProto.Smart) this.f71618b;
                com.garmin.android.apps.connectmobile.lteconnect.a aVar14 = (com.garmin.android.apps.connectmobile.lteconnect.a) this.f71619c;
                com.garmin.android.apps.connectmobile.lteconnect.a.b bVar9 = (com.garmin.android.apps.connectmobile.lteconnect.a.b) this.f71620d;
                smart.getClass();
                GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILTEProto.LTEService> generatedExtension = GDILTEExtension.lteService;
                if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                    Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
                    extension.getClass();
                    GDILTEProto.LTEDeviceInfoResponse lteDeviceInfoResponse = ((GDILTEProto.LTEService) extension).getLteDeviceInfoResponse();
                    imei = (lteDeviceInfoResponse == null || (lteDeviceInfo2 = lteDeviceInfoResponse.getLteDeviceInfo()) == null) ? null : lteDeviceInfo2.getImei();
                    iccid = (lteDeviceInfoResponse == null || (lteDeviceInfo = lteDeviceInfoResponse.getLteDeviceInfo()) == null) ? null : lteDeviceInfo.getIccid();
                    String strName2 = (lteDeviceInfoResponse == null || (responseStatus = lteDeviceInfoResponse.getResponseStatus()) == null) ? null : responseStatus.name();
                    Boolean boolValueOf = lteDeviceInfoResponse != null ? Boolean.valueOf(lteDeviceInfoResponse.hasModemStatus()) : null;
                    boolValueOf.getClass();
                    if (boolValueOf.booleanValue()) {
                        GDILTEProto.LTEModemStatus modemStatus = lteDeviceInfoResponse.getModemStatus();
                        strName = modemStatus != null ? modemStatus.name() : null;
                        strName.getClass();
                        com.garmin.android.apps.connectmobile.lteconnect.a.C0686a c0686a = com.garmin.android.apps.connectmobile.lteconnect.a.f38717b;
                        aVar14.getClass();
                        zEquals = strName.equals("ON");
                    }
                    strName = strName2;
                } else {
                    imei = null;
                    iccid = null;
                }
                if (strName == null || com.garmin.android.apps.connectmobile.lteconnect.a.c.valueOf(strName) != com.garmin.android.apps.connectmobile.lteconnect.a.c.OK) {
                    bVar9.a();
                } else {
                    bVar9.b(imei, iccid, zEquals);
                }
                break;
            case 22:
                q2.d dVar5 = (q2.d) this.f71618b;
                q2.n nVar2 = (q2.n) this.f71619c;
                q2.d.b bVar10 = (q2.d.b) this.f71620d;
                q2.v vVar = q2.v.f142196a;
                View view3 = dVar5.f142154a;
                vVar.getClass();
                q2.w wVar2 = q2.w.f142197a;
                q2.k kVar = new q2.k(nVar2);
                wVar2.getClass();
                ActionMode actionModeStartActionMode = view3.startActionMode(kVar, 1);
                s.g(dVar5.f142161h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    bVar10.close();
                }
                break;
            case 23:
                r0.e eVar4 = (r0.e) this.f71618b;
                Runnable runnable2 = (Runnable) this.f71619c;
                Runnable runnable3 = (Runnable) this.f71620d;
                if (eVar4.f148716j) {
                    runnable2.run();
                } else {
                    runnable3.run();
                }
                break;
            case 24:
                ((r0.r) this.f71618b).a((r0.o) this.f71619c, (Map.Entry) this.f71620d);
                break;
            case 25:
                Context context2 = (Context) this.f71618b;
                x xVar = (x) this.f71619c;
                x xVar2 = (x) this.f71620d;
                Context applicationContext = context2.getApplicationContext();
                i0.f170088a.getClass();
                t0 t0VarA = i0.a.a(applicationContext);
                List listC = p13.w.c(xVar);
                if (listC.isEmpty()) {
                    vb.h.s("beginWith needs at least one OneTimeWorkRequest.");
                } else {
                    c0 c0Var = new c0(t0VarA, listC);
                    List listSingletonList = Collections.singletonList(xVar2);
                    if (!listSingletonList.isEmpty()) {
                        c0Var = new c0(c0Var.f177551a, c0Var.f177552b, ue.l.KEEP, listSingletonList, Collections.singletonList(c0Var));
                    }
                    c0Var.a();
                }
                break;
            case 26:
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) this.f71618b;
                Fragment fragment = (Fragment) this.f71619c;
                e23.a aVar15 = (e23.a) this.f71620d;
                if (!mVar.isDestroyed() && !mVar.isFinishing() && fragment.isAdded() && !fragment.isRemoving()) {
                    aVar15.invoke();
                    break;
                }
                break;
            case 27:
                s0.e eVar5 = (s0.e) this.f71618b;
                Runnable runnable4 = (Runnable) this.f71619c;
                Runnable runnable5 = (Runnable) this.f71620d;
                if (eVar5.f155265f) {
                    runnable4.run();
                } else {
                    runnable5.run();
                }
                break;
            case 28:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f71618b;
                androidx.concurrent.futures.b.a aVar16 = (androidx.concurrent.futures.b.a) this.f71619c;
                af0.e eVar6 = (af0.e) this.f71620d;
                if (!atomicBoolean.get()) {
                    try {
                        eVar6.invoke();
                        aVar16.b(null);
                    } catch (Throwable th5) {
                        aVar16.d(th5);
                        return;
                    }
                    break;
                }
                break;
            default:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f71618b;
                androidx.concurrent.futures.b.a aVar17 = (androidx.concurrent.futures.b.a) this.f71619c;
                e23.a aVar18 = (e23.a) this.f71620d;
                if (!atomicBoolean2.get()) {
                    try {
                        aVar17.b(aVar18.invoke());
                    } catch (Throwable th6) {
                        aVar17.d(th6);
                    }
                    break;
                }
                break;
        }
    }
}
