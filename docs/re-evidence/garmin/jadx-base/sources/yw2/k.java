package yw2;

import android.content.res.Resources;
import android.widget.FrameLayout;
import androidx.fragment.app.m;
import androidx.lifecycle.y0;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import e23.l;
import iw2.i1;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import yr.o0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.c f200008b;

    public /* synthetic */ k(com.garmin.realtimesettings.app.presentationlayer.c cVar, int i14) {
        this.f200007a = i14;
        this.f200008b = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f200007a;
        com.garmin.realtimesettings.app.presentationlayer.c cVar = this.f200008b;
        switch (i14) {
            case 0:
                jw2.a aVar = (jw2.a) obj;
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar2 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                SettingsDeviceActivity settingsDeviceActivityW6 = cVar.w6();
                if (settingsDeviceActivityW6 != null) {
                    tv2.b bVar = aVar.f101366d;
                    if (bVar != null) {
                        zw2.f fVar = cVar.f52656p;
                        if (fVar == null) {
                            s.m("settingsTransform");
                            throw null;
                        }
                        xr.a aVar3 = new xr.a(29, cVar, aVar);
                        if (cx2.g.e(settingsDeviceActivityW6)) {
                            tv2.a.C3135a c3135a = tv2.a.f166658a;
                            o0 o0Var = new o0(aVar3, 4);
                            c3135a.getClass();
                            tv2.a.C3135a.a(settingsDeviceActivityW6, settingsDeviceActivityW6, fVar, bVar, o0Var);
                        } else {
                            settingsDeviceActivityW6.f52600p.getClass();
                        }
                    } else {
                        cVar.G6(aVar.f101364b, aVar.f101363a);
                        aVar.f101366d = null;
                        aVar.f101364b = false;
                        aVar.f101363a = false;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar4 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                if (((Boolean) obj).booleanValue()) {
                    SettingsDeviceActivity settingsDeviceActivityW7 = cVar.w6();
                    if (settingsDeviceActivityW7 != null) {
                        cx2.h hVar = settingsDeviceActivityW7.f52607a;
                        if (settingsDeviceActivityW7.isFinishing()) {
                            Logger logger = cx2.h.f56678c;
                            hVar.getClass();
                        } else {
                            settingsDeviceActivityW7.f52620n = false;
                            a aVar5 = settingsDeviceActivityW7.f52610d;
                            try {
                                androidx.appcompat.app.e eVar = settingsDeviceActivityW7.f52608b;
                                if (eVar != null) {
                                    eVar.setCancelable(false);
                                    androidx.appcompat.app.e eVar2 = settingsDeviceActivityW7.f52608b;
                                    if (eVar2 == null) {
                                        s.m("progressDialog");
                                        throw null;
                                    }
                                    aVar5.a(settingsDeviceActivityW7, eVar2);
                                    hVar.getClass();
                                } else {
                                    settingsDeviceActivityW7.Q9();
                                    androidx.appcompat.app.e eVar3 = settingsDeviceActivityW7.f52608b;
                                    if (eVar3 == null) {
                                        s.m("progressDialog");
                                        throw null;
                                    }
                                    aVar5.a(settingsDeviceActivityW7, eVar3);
                                }
                                i.a supportActionBar = settingsDeviceActivityW7.getSupportActionBar();
                                if (supportActionBar != null) {
                                    supportActionBar.E();
                                }
                            } catch (Resources.NotFoundException unused) {
                                Logger logger2 = cx2.h.f56678c;
                                hVar.getClass();
                            }
                            FrameLayout frameLayout = settingsDeviceActivityW7.f52609c;
                            if (frameLayout == null) {
                                s.m("contentFrame");
                                throw null;
                            }
                            frameLayout.setVisibility(0);
                        }
                    }
                } else {
                    SettingsDeviceActivity settingsDeviceActivityW8 = cVar.w6();
                    if (settingsDeviceActivityW8 != null) {
                        boolean zIsFinishing = settingsDeviceActivityW8.isFinishing();
                        cx2.h hVar2 = settingsDeviceActivityW8.f52607a;
                        if (zIsFinishing) {
                            Logger logger3 = cx2.h.f56678c;
                            hVar2.getClass();
                        } else {
                            if (settingsDeviceActivityW8.isFinishing()) {
                                Logger logger4 = cx2.h.f56678c;
                                hVar2.getClass();
                            } else {
                                if (settingsDeviceActivityW8.f52608b != null) {
                                    hVar2.getClass();
                                    androidx.appcompat.app.e eVar4 = settingsDeviceActivityW8.f52608b;
                                    if (eVar4 == null) {
                                        s.m("progressDialog");
                                        throw null;
                                    }
                                    eVar4.cancel();
                                }
                                i.a supportActionBar2 = settingsDeviceActivityW8.getSupportActionBar();
                                if (supportActionBar2 != null) {
                                    supportActionBar2.E();
                                }
                            }
                            FrameLayout frameLayout2 = settingsDeviceActivityW8.f52609c;
                            if (frameLayout2 == null) {
                                s.m("contentFrame");
                                throw null;
                            }
                            frameLayout2.setVisibility(0);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar6 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                ((b.s) obj).getClass();
                if (cVar.E6()) {
                    m activity = cVar.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    m activity2 = cVar.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                cVar.f52642b.getClass();
                com.garmin.realtimesettings.app.presentationlayer.b bVar2 = cVar.f52646f;
                if (bVar2 != null) {
                    bVar2.a();
                    return Unit.INSTANCE;
                }
                s.m("settingsDeviceCoordinator");
                throw null;
            default:
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar7 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                if (((Boolean) obj).booleanValue()) {
                    cVar.f52642b.getClass();
                    i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                    if (i1VarD != null) {
                        y0<Unit> y0Var = cVar.f52647g;
                        y0Var.getClass();
                        i1VarD.f95448c.getClass();
                        i1VarD.f95450e = y0Var;
                    }
                    com.garmin.realtimesettings.app.presentationlayer.b bVar3 = cVar.f52646f;
                    if (bVar3 == null) {
                        s.m("settingsDeviceCoordinator");
                        throw null;
                    }
                    bVar3.a();
                }
                return Unit.INSTANCE;
        }
    }
}
