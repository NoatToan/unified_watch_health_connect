package com.garmin.android.apps.connectmobile.settings.devices.vivomove3;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.m;
import androidx.lifecycle.t1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import bi1.q;
import bi1.r;
import bi1.t;
import bi1.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.a0;
import com.garmin.android.apps.connectmobile.devices.model.b0;
import com.garmin.android.apps.connectmobile.devices.model.c0;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSlidingTabLayout;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.h;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.u0;
import p13.w;
import p13.x;
import p13.y;
import rd2.f;
import rd2.j;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3ClassicWatchFaceSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Vivomove3ClassicWatchFaceSettingsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f43192h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f43193a = new w1(s0.f105811a.b(r.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f43194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f43195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeViewPager f43196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMSlidingTabLayout f43197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f43198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f43199g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43200a;

        public b(l lVar) {
            lVar.getClass();
            this.f43200a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43200a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43200a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43201a;

        public c(g gVar) {
            this.f43201a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43201a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43202a;

        public d(g gVar) {
            this.f43202a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43202a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43204b;

        public e(e23.a aVar, g gVar) {
            this.f43203a = aVar;
            this.f43204b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43203a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43204b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void ca() {
        r rVar = (r) this.f43193a.getValue();
        DeviceSettingsDTO deviceSettingsDTO = this.f43194b;
        if (deviceSettingsDTO == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        v vVarD = rVar.f18064a.d();
        vVarD.getClass();
        bi1.a aVarX4 = rVar.x4();
        aVarX4.getClass();
        deviceSettingsDTO.J1(vVarD.f18096a);
        List<b0> list = aVarX4.f18013b;
        List listC = w.c(list.get(0));
        t tVar = aVarX4.f18014c;
        List listK = x.k(new c0(listC, tVar.f18080a), new c0(w.c(list.get(1)), tVar.f18080a));
        if (listK != null) {
            deviceSettingsDTO.P0 = new ArrayList(listK);
            deviceSettingsDTO.S1("watchFaceItemList");
        }
        Intent intent = new Intent();
        DeviceSettingsDTO deviceSettingsDTO2 = this.f43194b;
        if (deviceSettingsDTO2 == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        setResult(-1, intent.putExtra("GCM_deviceSettings", deviceSettingsDTO2));
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca();
        super.onBackPressed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x0238  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f1  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 int, still in use, count: 1, list:
      (r14v2 int) from 0x01b5: IF  (r14v2 int) != (153831579 int)  -> B:74:0x01b7 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DeviceSettingsDTO deviceSettingsDTO;
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        b0 b0Var4;
        bi1.a aVar;
        Object next;
        a0 a0Var;
        a0 a0Var2;
        Object next2;
        a0 a0Var3;
        a0 a0Var4;
        t tVar;
        List<? extends b0> list;
        List<? extends b0> list2;
        Map<String, ? extends List<a0>> map;
        Bundle extras;
        Bundle extras2;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dual_watch_faces);
        Intent intent = getIntent();
        if (intent == null || (extras2 = intent.getExtras()) == null) {
            deviceSettingsDTO = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("GCM_deviceSettings", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelable2 = extras2.getParcelable("GCM_deviceSettings");
                if (!(parcelable2 instanceof DeviceSettingsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (DeviceSettingsDTO) parcelable2;
            }
            deviceSettingsDTO = (DeviceSettingsDTO) parcelable;
        }
        if (deviceSettingsDTO == null) {
            finish();
            return;
        }
        this.f43194b = deviceSettingsDTO;
        View viewFindViewById = findViewById(R.id.device_frame);
        viewFindViewById.getClass();
        this.f43195c = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.watch_face_settings_view_pager);
        viewFindViewById2.getClass();
        this.f43196d = (SwipeViewPager) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.watch_face_settings_sliding_tabs);
        viewFindViewById3.getClass();
        this.f43197e = (GCMSlidingTabLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.watch_face_top);
        viewFindViewById4.getClass();
        this.f43198f = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.watch_face_bottom);
        viewFindViewById5.getClass();
        this.f43199g = (ImageView) viewFindViewById5;
        Intent intent2 = getIntent();
        if (intent2 != null && (extras = intent2.getExtras()) != null) {
            long j8 = extras.getLong("GCM_deviceUnitID");
            f.a().f152045a.getClass();
            sd2.f fVarI = j.i(j8, null);
            if (fVarI != null) {
                ImageView imageView = this.f43195c;
                if (imageView == null) {
                    s.m("deviceFrame");
                    throw null;
                }
                imageView.setVisibility(4);
                showProgressOverlay();
                zp0.c.f206560v.getClass();
                zp0.c cVar = new zp0.c((m) this);
                cVar.f206565e = zb0.t.d(fVarI);
                cVar.f206570j = 2131232354;
                cVar.f206575o = new bi1.e(this);
                ImageView imageView2 = this.f43195c;
                if (imageView2 == null) {
                    s.m("deviceFrame");
                    throw null;
                }
                cVar.h(imageView2);
            }
        }
        w1 w1Var = this.f43193a;
        r rVar = (r) w1Var.getValue();
        DeviceSettingsDTO deviceSettingsDTO2 = this.f43194b;
        if (deviceSettingsDTO2 == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        LinkedHashMap linkedHashMap = rVar.f18066c;
        y0<v> y0Var = rVar.f18064a;
        y0Var.m(deviceSettingsDTO2.N0 != null ? bi1.s.a(deviceSettingsDTO2.i0()) : v.VVM3_DIGITAL_SUB_EYE);
        com.garmin.android.apps.connectmobile.devices.model.x xVar = deviceSettingsDTO2.Q0;
        if (xVar != null) {
            Map<String, ? extends List<a0>> map2 = xVar.f34327a;
            map2.getClass();
            if (!map2.isEmpty()) {
                com.garmin.android.apps.connectmobile.devices.model.x xVar2 = deviceSettingsDTO2.Q0;
                if (xVar2 != null && (map = xVar2.f34327a) != null) {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, ? extends List<a0>> entry : map.entrySet()) {
                        DeviceSettingsDTO.q.a aVar2 = DeviceSettingsDTO.q.f34018b;
                        String key = entry.getKey();
                        aVar2.getClass();
                        arrayList.add(new p(bi1.s.a(DeviceSettingsDTO.q.a.a(key)), entry.getValue()));
                    }
                    linkedHashMap.putAll(u0.l(arrayList));
                }
                List list3 = deviceSettingsDTO2.P0;
                if (list3 == null) {
                    list3 = j0.f134944a;
                }
                c0 c0Var = (c0) h0.e0(0, list3);
                if (c0Var == null || (list2 = c0Var.f34122a) == null || (b0Var = list2.get(0)) == null) {
                    b0Var = b0.STEPS;
                }
                c0 c0Var2 = (c0) h0.e0(1, list3);
                if (c0Var2 == null || (list = c0Var2.f34122a) == null || (b0Var2 = list.get(0)) == null) {
                    b0Var2 = b0.ALTERNATE_DATE;
                }
                ArrayList arrayList2 = new ArrayList(y.r(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    String str = ((c0) it.next()).f34123b;
                    if (str == null) {
                        tVar = t.VVM3_COLOR_1;
                    } else {
                        if (str.hashCode() != 153831579) {
                            switch (str) {
                                case "COLOR_1":
                                    tVar = t.VVM3_COLOR_1;
                                    break;
                                case "COLOR_2":
                                    tVar = t.VVM3_COLOR_2;
                                    break;
                                case "COLOR_3":
                                    tVar = t.VVM3_COLOR_3;
                                    break;
                                case "COLOR_4":
                                    tVar = t.VVM3_COLOR_4;
                                    break;
                                case "COLOR_5":
                                    tVar = t.VVM3_COLOR_5;
                                    break;
                                case "COLOR_6":
                                    tVar = t.VVM3_COLOR_6;
                                    break;
                                case "COLOR_7":
                                    tVar = t.VVM3_COLOR_7;
                                    break;
                                case "COLOR_8":
                                    tVar = t.VVM3_COLOR_8;
                                    break;
                                case "COLOR_9":
                                    tVar = t.VVM3_COLOR_9;
                                    break;
                                default:
                                    tVar = t.VVM3_COLOR_1;
                                    break;
                            }
                        } else if (str.equals("COLOR_10")) {
                            tVar = t.VVM3_COLOR_10;
                        } else {
                            tVar = t.VVM3_COLOR_1;
                        }
                    }
                    arrayList2.add(tVar);
                }
                Object obj = arrayList2.size() > 0 ? arrayList2.get(0) : t.VVM3_COLOR_1;
                v vVarD = y0Var.d();
                vVarD.getClass();
                bi1.a aVar3 = new bi1.a(vVarD, x.k(b0Var, b0Var2), (t) obj);
                for (Map.Entry<v, y0<bi1.a>> entry2 : rVar.f18065b.entrySet()) {
                    v key2 = entry2.getKey();
                    y0<bi1.a> value = entry2.getValue();
                    if (key2 == aVar3.f18012a) {
                        aVar = aVar3;
                    } else {
                        List list4 = (List) linkedHashMap.get(key2);
                        if (list4 != null) {
                            Iterator it3 = list4.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    a0Var4 = (a0) next2;
                                    a0Var4.getClass();
                                } else {
                                    next2 = null;
                                }
                                a0Var3 = (a0) next2;
                                if (a0Var3 != null) {
                                    b0Var3 = a0Var3.f34093a;
                                } else {
                                    b0Var3 = null;
                                }
                            } while (!s.g(a0Var4.f34096d, Boolean.TRUE));
                            a0Var3 = (a0) next2;
                            if (a0Var3 != null) {
                                b0Var3 = a0Var3.f34093a;
                            } else {
                                b0Var3 = null;
                            }
                        } else {
                            b0Var3 = null;
                        }
                        if (b0Var3 == null) {
                            b0Var3 = b0.STEPS;
                        }
                        List list5 = (List) linkedHashMap.get(key2);
                        if (list5 != null) {
                            Iterator it4 = list5.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next = it4.next();
                                    a0Var2 = (a0) next;
                                    a0Var2.getClass();
                                } else {
                                    next = null;
                                }
                                a0Var = (a0) next;
                                if (a0Var != null) {
                                    b0Var4 = a0Var.f34093a;
                                } else {
                                    b0Var4 = null;
                                }
                            } while (!s.g(a0Var2.f34097e, Boolean.TRUE));
                            a0Var = (a0) next;
                            if (a0Var != null) {
                                b0Var4 = a0Var.f34093a;
                            } else {
                                b0Var4 = null;
                            }
                        } else {
                            b0Var4 = null;
                        }
                        if (b0Var4 == null) {
                            b0Var4 = b0.ALTERNATE_DATE;
                        }
                        aVar = new bi1.a(key2, x.k(b0Var3, b0Var4), null, 4, null);
                    }
                    value.m(aVar);
                }
                Bundle extras3 = getIntent().getExtras();
                initActionBar(true, extras3 != null ? extras3.getString("GCM_deviceSettingsTitle") : null);
                SwipeViewPager swipeViewPager = this.f43196d;
                if (swipeViewPager == null) {
                    s.m("watchFaceSettingsViewPager");
                    throw null;
                }
                swipeViewPager.setOffscreenPageLimit(2);
                SwipeViewPager swipeViewPager2 = this.f43196d;
                if (swipeViewPager2 == null) {
                    s.m("watchFaceSettingsViewPager");
                    throw null;
                }
                androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                swipeViewPager2.setAdapter(new bi1.f(supportFragmentManager));
                GCMSlidingTabLayout gCMSlidingTabLayout = this.f43197e;
                if (gCMSlidingTabLayout == null) {
                    s.m("watchFaceSettingsSlidingTabs");
                    throw null;
                }
                gCMSlidingTabLayout.f47853b = R.layout.user_profile_tab;
                gCMSlidingTabLayout.f47854c = R.id.tab_title;
                gCMSlidingTabLayout.f47842h = R.id.tab_icon;
                if (gCMSlidingTabLayout == null) {
                    s.m("watchFaceSettingsSlidingTabs");
                    throw null;
                }
                SwipeViewPager swipeViewPager3 = this.f43196d;
                if (swipeViewPager3 == null) {
                    s.m("watchFaceSettingsViewPager");
                    throw null;
                }
                gCMSlidingTabLayout.setViewPager(swipeViewPager3);
                r rVar2 = (r) w1Var.getValue();
                t1.b(rVar2.f18064a, new q(rVar2, 1)).f(this, new b(new b41.a(this, 3)));
                DeviceSettingsDTO deviceSettingsDTO3 = this.f43194b;
                if (deviceSettingsDTO3 != null) {
                    ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).R(deviceSettingsDTO3.f33860a);
                    return;
                } else {
                    s.m("deviceSettingsDTO");
                    throw null;
                }
            }
        }
        vb.h.s("Required MultipleSupportedWatchFace");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        ca();
        return super.onNavigateUp();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3ClassicWatchFaceSettingsActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
