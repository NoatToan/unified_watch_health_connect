package com.garmin.realtimesettings.app.presentationlayer;

import a42.q;
import ab.j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.core.view.s;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.realtimesettings.app.initialization.RealTimeSettingsInitializerActivity;
import cx2.h;
import e23.l;
import e23.p;
import ew1.r1;
import gw2.g;
import iw2.i1;
import iw2.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.c0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p13.a1;
import p13.h0;
import p13.k0;
import tr2.y;
import v13.i;
import yc.l2;
import yw2.e;
import yw2.k;
import zb0.u0;
import zw2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/c;", "Lyw2/d;", "", "Lyw2/e;", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends yw2.d implements e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f52641v = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rw2.a f52644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dx2.c f52645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.realtimesettings.app.presentationlayer.b f52646f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f52648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ComposeView f52649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NestedScrollView f52650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SwipeRefreshLayout f52651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public av2.b f52652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public av2.a f52653m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f52655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f52656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f52657q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.c<Intent> f52659t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f52642b = new h("SettingsDeviceFragment", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Integer> f52643c = a1.b(Integer.valueOf(GDIRealtimeSettingsProto.WellKnownCompositionId.COLOR_SETTINGS_VALUE));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<Unit> f52647g = new y0<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f52654n = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReference<Map<String, Object>> f52658r = new AtomicReference<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceFragment$onSettingsNeedsRestart$1$1", f = "SettingsDeviceFragment.kt", l = {629}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52660a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SettingsDeviceActivity f52662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SettingsDeviceActivity settingsDeviceActivity, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f52662c = settingsDeviceActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f52662c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52660a;
            if (i14 == 0) {
                r.b(obj);
                c.this.f52642b.getClass();
                w wVar = w.f95547a;
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                long j8 = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a;
                this.f52660a = 1;
                wVar.getClass();
                if (w.e(this.f52662c, j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.realtimesettings.app.presentationlayer.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/realtimesettings/app/presentationlayer/c$c", "Landroidx/core/view/s;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1129c implements s {
        public C1129c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            int i14;
            boolean z14;
            gw2.a aVar;
            Boolean bool;
            String str;
            g[] gVarArrValues;
            int length;
            int i15;
            g gVar;
            Drawable drawable;
            String str2;
            menu.getClass();
            menuInflater.getClass();
            a aVar2 = c.f52641v;
            c cVar = c.this;
            m mVarU6 = cVar.u6();
            if (mVarU6 != null) {
                av2.a aVar3 = cVar.f52653m;
                if (aVar3 != null) {
                    h hVar = aVar3.f13292a;
                    rw2.a aVar4 = cVar.f52644d;
                    if (aVar4 == null) {
                        p005kotlin.jvm.internal.s.m("settingsDataModel");
                        throw null;
                    }
                    dx2.c cVar2 = cVar.f52645e;
                    if (cVar2 == null) {
                        p005kotlin.jvm.internal.s.m("settingsViewModel");
                        throw null;
                    }
                    hVar.getClass();
                    menu.clear();
                    SparseArray<o13.p<String, Object>> sparseArray = aVar3.f13294c;
                    sparseArray.clear();
                    SparseArray<Map<String, Object>> sparseArray2 = aVar3.f13293b;
                    sparseArray2.clear();
                    List<Map<String, Object>> list = aVar4.f154868h;
                    if (list != null) {
                        Iterator it = list.iterator();
                        aVar = null;
                        z14 = false;
                        while (it.hasNext()) {
                            Map<String, ? extends Object> map = (Map) it.next();
                            String strA4 = dx2.c.A4(map);
                            if (strA4 == null) {
                                strA4 = "MENU_DEFAULT_VIEW";
                            }
                            hVar.getClass();
                            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                            f fVarD = com.garmin.realtimesettings.app.initialization.b.a().d(mVarU6, strA4);
                            if (fVarD == null) {
                                fVarD = new bx2.a(mVarU6);
                            }
                            bx2.c cVar3 = (bx2.c) fVarD;
                            if (cVar3.k(map)) {
                                int iGenerateViewId = View.generateViewId();
                                Object obj = map.get(gw2.i.SHOWN_ON_BAR.f79975a);
                                try {
                                    if (!(obj instanceof Boolean)) {
                                        obj = null;
                                    }
                                    bool = (Boolean) obj;
                                    while (true) {
                                        if (i15 >= length) {
                                            gVar = null;
                                            break;
                                        }
                                        int i16 = i15;
                                        gVar = gVarArrValues[i16];
                                        int i17 = length;
                                        if (str.equals(gVar.f79891a)) {
                                            break;
                                        }
                                        i15 = i16 + 1;
                                        length = i17;
                                    }
                                } catch (ClassCastException unused) {
                                    bool = null;
                                }
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                int i18 = zBooleanValue ? 2 : 0;
                                String strF = cVar3.f(cVar2, map);
                                if (zBooleanValue) {
                                    strF = sn.a.g(strF);
                                }
                                String str3 = strF;
                                Context context = cVar3.f207282a;
                                String strA5 = dx2.c.A4(map);
                                if (strA5 == null) {
                                    strA5 = "MENU_DEFAULT_VIEW";
                                }
                                str = strA5;
                                gVarArrValues = g.values();
                                length = gVarArrValues.length;
                                i15 = 0;
                                if (gVar == null) {
                                    drawable = null;
                                } else {
                                    Resources resources = context.getResources();
                                    int i19 = gVar.f79892b;
                                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                                    drawable = resources.getDrawable(i19, null);
                                    if (drawable == null) {
                                        drawable = null;
                                    } else {
                                        Integer num = gVar.f79893c;
                                        if (num != null) {
                                            drawable.setColorFilter(c7.a.a(context.getResources().getColor(num.intValue(), null), c7.b.SRC_IN));
                                        }
                                    }
                                }
                                Object obj2 = map.get(gw2.i.ITEM_POSITION.f79975a);
                                try {
                                    if (!(obj2 instanceof String)) {
                                        obj2 = null;
                                    }
                                    str2 = (String) obj2;
                                } catch (ClassCastException unused2) {
                                    str2 = null;
                                }
                                if (p005kotlin.jvm.internal.s.g(str2, gw2.i.LEFT.f79975a)) {
                                    aVar = new gw2.a(iGenerateViewId, str3);
                                } else {
                                    MenuItem menuItemAdd = menu.add(0, iGenerateViewId, 0, str3);
                                    menuItemAdd.setShowAsAction(i18);
                                    if (drawable != null) {
                                        menuItemAdd.setIcon(drawable);
                                    }
                                    z14 = true;
                                }
                                sparseArray2.put(iGenerateViewId, map);
                                sparseArray.put(iGenerateViewId, new o13.p<>(strA4, null));
                            }
                            hVar = hVar;
                            it = it;
                            cVar2 = cVar2;
                        }
                        i14 = 0;
                    } else {
                        i14 = 0;
                        Logger logger = h.f56678c;
                        z14 = false;
                        aVar = null;
                    }
                    if (aVar != null) {
                        SettingsDeviceActivity settingsDeviceActivity = mVarU6 instanceof SettingsDeviceActivity ? (SettingsDeviceActivity) mVarU6 : null;
                        if (settingsDeviceActivity != null) {
                            settingsDeviceActivity.T9(true, z14);
                            settingsDeviceActivity.O9().setText(aVar.f79870b);
                            settingsDeviceActivity.O9().setId(aVar.f79869a);
                        }
                    }
                    int size = menu.size();
                    for (int i24 = i14; i24 < size; i24++) {
                        MenuItem item = menu.getItem(i24);
                        if (cVar.getActivity() != null) {
                            av2.a aVar5 = cVar.f52653m;
                            if (aVar5 == null) {
                                p005kotlin.jvm.internal.s.m("menuController");
                                throw null;
                            }
                            h hVar2 = aVar5.f13292a;
                            item.getClass();
                            SparseArray<o13.p<String, Object>> sparseArray3 = aVar5.f13294c;
                            o13.p<String, Object> pVar = sparseArray3.get(item.getItemId());
                            if (pVar != null) {
                                String str4 = pVar.f128594a;
                                Context contextRequireContext = cVar.requireContext();
                                contextRequireContext.getClass();
                                hVar2.getClass();
                                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                                f fVarD2 = com.garmin.realtimesettings.app.initialization.b.a().d(contextRequireContext, str4);
                                if (fVarD2 == null) {
                                    fVarD2 = new bx2.a(contextRequireContext);
                                }
                                bx2.c cVar4 = (bx2.c) fVarD2;
                                if (!str4.equals("SYNC_DEVICE")) {
                                    hVar2.getClass();
                                } else if (cVar4 instanceof bx2.b) {
                                    bx2.b bVar = (bx2.b) cVar4;
                                    bv2.p pVar2 = new bv2.p(cVar, bVar, item);
                                    sparseArray3.put(item.getItemId(), new o13.p<>(str4, pVar2));
                                    new Handler(Looper.getMainLooper()).postDelayed(new j(14, bVar, pVar2), 1000L);
                                }
                            } else {
                                hVar2.getClass();
                            }
                        }
                    }
                }
                SettingsDeviceActivity settingsDeviceActivityW6 = cVar.w6();
                if (settingsDeviceActivityW6 != null) {
                    settingsDeviceActivityW6.O9().setOnClickListener(new xp0.d(cVar, 16));
                }
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            a aVar = c.f52641v;
            c.this.y6(itemId);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52664a;

        public d(l lVar) {
            lVar.getClass();
            this.f52664a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52664a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52664a.invoke(obj);
        }
    }

    public c() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new y(this, 17));
        cVarRegisterForActivityResult.getClass();
        this.f52659t = cVarRegisterForActivityResult;
    }

    public final void A6() {
        String string;
        this.f52642b.b("onViewCreated: building viewController with settingsDataModel");
        if (u6() == null) {
            Logger logger = h.f56678c;
            return;
        }
        this.f52652l = new av2.b(this);
        boolean zE6 = E6();
        av2.b bVar = this.f52652l;
        if (zE6) {
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("viewController");
                throw null;
            }
            c cVar = bVar.f13295a;
            rw2.a aVar = this.f52644d;
            if (aVar == null) {
                p005kotlin.jvm.internal.s.m("settingsDataModel");
                throw null;
            }
            dx2.c cVar2 = this.f52645e;
            if (cVar2 == null) {
                p005kotlin.jvm.internal.s.m("settingsViewModel");
                throw null;
            }
            h hVar = bVar.f13296b;
            try {
                bVar.d((Map) h0.b0(aVar.f154866f));
            } catch (NoSuchElementException unused) {
                hVar.getClass();
            }
            cVar.v6().removeAllViews();
            for (Map<String, ? extends Object> map : aVar.f154866f) {
                Objects.toString(map);
                hVar.getClass();
                if (cVar2.X4(map)) {
                    aVar.f154865e = dx2.c.b5(map);
                    List listR4 = dx2.c.R4(map);
                    if (listR4 != null) {
                        lv2.a.f115048a.getClass();
                        lv2.a.C2189a.a(cVar, listR4, cVar2, map, null);
                    }
                    bVar.c(cVar, cVar2, map);
                } else {
                    hVar.b("build: " + map.get(gw2.i.TITLE.f79975a) + " is not supported. skipping...");
                }
            }
        } else {
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("viewController");
                throw null;
            }
            rw2.a aVar2 = this.f52644d;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("settingsDataModel");
                throw null;
            }
            dx2.c cVar3 = this.f52645e;
            if (cVar3 == null) {
                p005kotlin.jvm.internal.s.m("settingsViewModel");
                throw null;
            }
            c cVar4 = bVar.f13295a;
            h hVar2 = bVar.f13296b;
            try {
                bVar.d((Map) h0.b0(aVar2.f154866f));
            } catch (NoSuchElementException unused2) {
                hVar2.getClass();
            }
            cVar4.v6().removeAllViews();
            for (Map<String, ? extends Object> map2 : aVar2.f154866f) {
                Objects.toString(map2);
                hVar2.getClass();
                if (cVar3.X4(map2)) {
                    bVar.c(cVar4, cVar3, map2);
                } else {
                    hVar2.b("build: " + map2.get(gw2.i.TITLE.f79975a) + " is not supported. skipping...");
                }
            }
        }
        SettingsDeviceActivity settingsDeviceActivityW6 = w6();
        if (settingsDeviceActivityW6 != null) {
            rw2.a aVar3 = this.f52644d;
            if (aVar3 == null) {
                p005kotlin.jvm.internal.s.m("settingsDataModel");
                throw null;
            }
            tv2.c cVar5 = aVar3.f154864d;
            if (cVar5 != null) {
                f fVar = this.f52656p;
                if (fVar == null) {
                    p005kotlin.jvm.internal.s.m("settingsTransform");
                    throw null;
                }
                string = fVar.b(cVar5);
            } else {
                string = settingsDeviceActivityW6.getString(R.string.lbl_settings);
                string.getClass();
            }
            settingsDeviceActivityW6.S9(string);
        }
        dx2.c cVar6 = this.f52645e;
        if (cVar6 == null) {
            p005kotlin.jvm.internal.s.m("settingsViewModel");
            throw null;
        }
        cVar6.f61485b.getClass();
        cVar6.f61486c.m(cVar6.f61484a.f154867g);
    }

    public final void C6() {
        v supportFragmentManager;
        m mVarU6 = u6();
        if (mVarU6 != null) {
            ew2.e.a aVar = ew2.e.f66901a;
            String string = getString(R.string.txt_something_went_wrong_try_again);
            string.getClass();
            ew2.e.a.d(aVar, mVarU6, string);
        }
        m activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.k(this);
        aVar2.e();
    }

    public final boolean E6() {
        rw2.a aVar = this.f52644d;
        if (aVar != null) {
            return this.f52643c.contains(Integer.valueOf(aVar.f154869i));
        }
        p005kotlin.jvm.internal.s.m("settingsDataModel");
        throw null;
    }

    public final void F6(boolean z14) {
        v supportFragmentManager;
        cx2.i.f56681a.getClass();
        if (cx2.i.a.a(this)) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            yv2.f fVar = new yv2.f(contextRequireContext);
            dx2.c cVar = this.f52645e;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("settingsViewModel");
                throw null;
            }
            AtomicReference<Map<String, Object>> atomicReference = this.f52658r;
            Map<String, Object> map = atomicReference.get();
            map.getClass();
            fVar.h(cVar, map, "");
            if (z14) {
                m activity = getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.Z();
                }
            } else {
                l2();
            }
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            atomicReference.set(k0Var);
        }
    }

    public final void G6(boolean z14, boolean z15) {
        h hVar = this.f52642b;
        if (z14) {
            hVar.getClass();
            com.garmin.realtimesettings.app.presentationlayer.b bVar = this.f52646f;
            if (bVar != null) {
                bVar.a();
                return;
            } else {
                p005kotlin.jvm.internal.s.m("settingsDeviceCoordinator");
                throw null;
            }
        }
        if (z15) {
            hVar.getClass();
            SettingsDeviceActivity settingsDeviceActivityW6 = w6();
            if (settingsDeviceActivityW6 != null) {
                settingsDeviceActivityW6.V9();
            }
        }
    }

    @Override // yw2.e
    public final void O3() {
        Boolean boolValueOf;
        bm2.c cVarB;
        rw2.a aVar = this.f52644d;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("settingsDataModel");
            throw null;
        }
        rw2.e eVar = aVar.f154871k;
        if (eVar != null) {
            zu2.a.f207132a.getClass();
            Boolean boolValueOf2 = zu2.a.f207133b != null ? Boolean.valueOf(s3.b()) : null;
            com.garmin.android.apps.connectmobile.devices.settings.realtime.b bVar = zu2.a.f207133b;
            if (bVar != null) {
                sd2.f fVar = bVar.f34360b;
                String strValueOf = String.valueOf(fVar != null ? fVar.getApplicationKey() : null);
                u0 u0Var = u0.f203733h;
                hv.h.f85764f.getClass();
                hv.h hVarA = hv.h.a.a();
                boolValueOf = Boolean.valueOf((hVarA == null || (cVarB = hVarA.b(strValueOf)) == null) ? false : cVarB.W0);
            } else {
                boolValueOf = null;
            }
            if (this.f52654n == GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME.getNumber() && p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE) && p005kotlin.jvm.internal.s.g(boolValueOf2, Boolean.FALSE)) {
                ComposeView composeView = this.f52649i;
                if (composeView == null) {
                    p005kotlin.jvm.internal.s.m("promotionalBannerView");
                    throw null;
                }
                composeView.setVisibility(0);
            } else {
                ComposeView composeView2 = this.f52649i;
                if (composeView2 == null) {
                    p005kotlin.jvm.internal.s.m("promotionalBannerView");
                    throw null;
                }
                composeView2.setVisibility(8);
            }
            sw2.d dVar = sw2.d.f161112a;
            sw2.e eVar2 = new sw2.e(this.f52654n, eVar);
            dVar.getClass();
            sw2.d.f161113b.add(eVar2);
        }
        A6();
        z6();
    }

    @Override // yw2.e
    public final void P0(boolean z14) {
        SettingsDeviceActivity settingsDeviceActivityW6 = w6();
        if (settingsDeviceActivityW6 != null) {
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(settingsDeviceActivityW6, null), 3);
            if (z14) {
                settingsDeviceActivityW6.f52610d.a(settingsDeviceActivityW6, ew2.e.a.a(ew2.e.f66901a, settingsDeviceActivityW6, getString(R.string.settings_updated_information), getString(R.string.refresh_device_settings_information), new o13.p(getString(R.string.lbl_ok), new yw2.j(this, 2)), null, 1008));
                return;
            }
            this.f52642b.getClass();
            RealTimeSettingsInitializerActivity.a aVar = RealTimeSettingsInitializerActivity.f52581r;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            RealTimeSettingsInitializerActivity.a.a(aVar, contextRequireContext, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, false, 12);
        }
    }

    @Override // yw2.e
    public final void P5() {
        Window window;
        SwipeRefreshLayout swipeRefreshLayout = this.f52651k;
        if (swipeRefreshLayout == null) {
            p005kotlin.jvm.internal.s.m("refreshProgressIndicator");
            throw null;
        }
        swipeRefreshLayout.setRefreshing(false);
        m mVarU6 = u6();
        if (mVarU6 == null || (window = mVarU6.getWindow()) == null) {
            return;
        }
        window.clearFlags(16);
    }

    @Override // yw2.e
    public final void W2() {
        Window window;
        SwipeRefreshLayout swipeRefreshLayout = this.f52651k;
        if (swipeRefreshLayout == null) {
            p005kotlin.jvm.internal.s.m("refreshProgressIndicator");
            throw null;
        }
        swipeRefreshLayout.setRefreshing(true);
        m mVarU6 = u6();
        if (mVarU6 == null || (window = mVarU6.getWindow()) == null) {
            return;
        }
        window.setFlags(16, 16);
    }

    @Override // yw2.e
    public final void g1() {
        SettingsDeviceActivity settingsDeviceActivityW6 = w6();
        if (settingsDeviceActivityW6 != null) {
            Logger logger = h.f56678c;
            this.f52642b.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            String str = com.garmin.realtimesettings.app.initialization.b.c().f192454b.f192462e;
            String str2 = com.garmin.realtimesettings.app.initialization.b.c().f192454b.f192463f;
            settingsDeviceActivityW6.f52610d.a(settingsDeviceActivityW6, (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? ew2.e.a.a(ew2.e.f66901a, settingsDeviceActivityW6, getString(R.string.unable_to_update_settings), getString(R.string.unable_to_update_settings_description), new o13.p(getString(R.string.lbl_ok), new yw2.j(this, 1)), null, 1008) : ew2.e.a.a(ew2.e.f66901a, settingsDeviceActivityW6, str, str2, new o13.p(getString(R.string.lbl_settings), new yw2.f(settingsDeviceActivityW6, 1)), new o13.p(getString(R.string.lbl_cancel), new yw2.j(this, 0)), 992));
        }
    }

    public final void l2() {
        m activity;
        v supportFragmentManager;
        if (E6()) {
            m activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        rw2.a aVar = this.f52644d;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("settingsDataModel");
            throw null;
        }
        if (aVar.f154865e || (activity = getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f52656p = new f(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        h hVar = this.f52642b;
        if (arguments != null) {
            rw2.a aVar = (rw2.a) arguments.getParcelable("SETTINGS_DATA_MODEL_BUNDLE");
            if (aVar != null) {
                this.f52644d = aVar;
            } else {
                Logger logger = h.f56678c;
                hVar.d(null, "Data model not received");
                C6();
            }
            this.f52654n = arguments.getInt("RealTimeSettingInitializer_Composition_Id");
            this.f52655o = arguments.getBoolean("IS_COMPOSITION_BAKED_TO_APP", false);
        } else {
            Logger logger2 = h.f56678c;
            hVar.getClass();
            C6();
        }
        m mVarU6 = u6();
        if (mVarU6 != null) {
            rw2.a aVar2 = this.f52644d;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("settingsDataModel");
                throw null;
            }
            this.f52645e = (dx2.c) new x1(mVarU6, new dx2.e(aVar2)).b(p005kotlin.jvm.internal.s0.f105811a.b(dx2.c.class));
        } else {
            Logger logger3 = h.f56678c;
            hVar.getClass();
            C6();
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        rw2.a aVar3 = this.f52644d;
        if (aVar3 != null) {
            this.f52646f = new com.garmin.realtimesettings.app.presentationlayer.b(contextRequireContext, this, aVar3, this.f52654n, this.f52655o);
        } else {
            p005kotlin.jvm.internal.s.m("settingsDataModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.rts_fragment_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        av2.b bVar = this.f52652l;
        if (bVar != null) {
            bVar.b();
        }
        av2.a aVar = this.f52653m;
        if (aVar != null) {
            SparseArray<o13.p<String, Object>> sparseArray = aVar.f13294c;
            int size = sparseArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                sparseArray.keyAt(i14);
                o13.p<String, Object> pVarValueAt = sparseArray.valueAt(i14);
                if (p005kotlin.jvm.internal.s.g(pVarValueAt.f128594a, "SYNC_DEVICE")) {
                    Object obj = pVarValueAt.f128595b;
                    bv2.p pVar = obj instanceof bv2.p ? (bv2.p) obj : null;
                    if (pVar == null) {
                        continue;
                    } else {
                        bx2.b bVar2 = pVar.f21558d;
                        if (bVar2 == null) {
                            p005kotlin.jvm.internal.s.m("transform");
                            throw null;
                        }
                        bVar2.p();
                    }
                }
            }
        }
        SettingsDeviceActivity settingsDeviceActivityW6 = w6();
        if (settingsDeviceActivityW6 != null) {
            settingsDeviceActivityW6.O9().setOnClickListener(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        rw2.a aVar = this.f52644d;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("settingsDataModel");
            throw null;
        }
        rw2.e eVar = aVar.f154871k;
        if (eVar != null) {
            sw2.d dVar = sw2.d.f161112a;
            sw2.e eVar2 = new sw2.e(this.f52654n, eVar);
            dVar.getClass();
            sw2.d.f161113b.remove(eVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f52642b.getClass();
        i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
        if (i1VarD != null) {
            y0<Unit> y0Var = this.f52647g;
            y0Var.getClass();
            i1VarD.f95448c.getClass();
            i1VarD.f95450e = y0Var;
        }
        com.garmin.realtimesettings.app.presentationlayer.b bVar = this.f52646f;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("settingsDeviceCoordinator");
            throw null;
        }
        bVar.a();
        dx2.c cVar = this.f52645e;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("settingsViewModel");
            throw null;
        }
        cVar.f61487d.f(getViewLifecycleOwner(), new d(new k(this, 0)));
        dx2.c cVar2 = this.f52645e;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("settingsViewModel");
            throw null;
        }
        cVar2.f61488e.f(getViewLifecycleOwner(), new d(new k(this, 1)));
        f0.k(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new k(this, 2), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.settings_linear_layout);
        viewFindViewById.getClass();
        this.f52648h = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.promotional_banner_compose_view);
        viewFindViewById2.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById2;
        this.f52649i = composeView;
        int i14 = 3;
        composeView.setContent(new z3.e(1357754512, true, new yw2.j(this, i14)));
        View viewFindViewById3 = view2.findViewById(R.id.settings_fragment_scroll_view);
        viewFindViewById3.getClass();
        this.f52650j = (NestedScrollView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.settings_refresh_indicator);
        viewFindViewById4.getClass();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById4;
        this.f52651k = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(false);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f52651k;
        if (swipeRefreshLayout2 == null) {
            p005kotlin.jvm.internal.s.m("refreshProgressIndicator");
            throw null;
        }
        swipeRefreshLayout2.setColorSchemeColors(getResources().getColor(R.color.rts_refresh_progress_indicator_color, null));
        rw2.a aVar = this.f52644d;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("settingsDataModel");
            throw null;
        }
        if (aVar.f154866f.isEmpty()) {
            com.garmin.realtimesettings.app.presentationlayer.b bVar = this.f52646f;
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("settingsDeviceCoordinator");
                throw null;
            }
            e eVar = bVar.f52622b;
            boolean z14 = bVar.f52632l;
            h hVar = bVar.f52626f;
            if (z14) {
                hVar.getClass();
                bVar.f52632l = false;
                eVar.W2();
                bVar.f52627g = 0;
                bVar.f52631k = false;
                if (bVar.f52625e) {
                    bVar.f();
                } else {
                    int i15 = bVar.f52624d;
                    if (i15 == 36352) {
                        com.garmin.realtimesettings.app.presentationlayer.b.b(bVar, false, false, false, false, false, 55);
                    } else if (i15 != 36356) {
                        com.garmin.realtimesettings.app.presentationlayer.b.b(bVar, false, false, false, false, false, 63);
                    } else {
                        bVar.f();
                    }
                }
            } else {
                hVar.b("initSettings: already a request is in progress, device is sending a second request. So, ignoring this request");
            }
        } else {
            this.f52642b.getClass();
            z6();
            A6();
        }
        this.f52647g.f(getViewLifecycleOwner(), new d(new k(this, i14)));
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ((dx2.a) new x1(mVarRequireActivity).b(p005kotlin.jvm.internal.s0.f105811a.b(dx2.a.class))).f61482a.f(getViewLifecycleOwner(), new d(new k(this, 4)));
        LinearLayout linearLayoutV6 = v6();
        l2 l2Var = new l2(11);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(linearLayoutV6, l2Var);
        m mVarRequireActivity2 = requireActivity();
        mVarRequireActivity2.getClass();
        mVarRequireActivity2.addMenuProvider(new C1129c(), getViewLifecycleOwner(), androidx.lifecycle.b0.b.RESUMED);
    }

    public final m u6() {
        if (!isAdded() || getActivity() == null) {
            return null;
        }
        return requireActivity();
    }

    public final LinearLayout v6() {
        LinearLayout linearLayout = this.f52648h;
        if (linearLayout != null) {
            return linearLayout;
        }
        p005kotlin.jvm.internal.s.m("linearLayout");
        throw null;
    }

    public final SettingsDeviceActivity w6() {
        if (u6() != null) {
            m activity = getActivity();
            SettingsDeviceActivity settingsDeviceActivity = activity instanceof SettingsDeviceActivity ? (SettingsDeviceActivity) activity : null;
            if (settingsDeviceActivity != null) {
                return settingsDeviceActivity;
            }
        }
        Logger logger = h.f56678c;
        this.f52642b.d(null, "parent(SettingsDeviceActivity) activity is not available, the user is in a bad state...");
        return null;
    }

    @Override // yw2.e
    public final void x4(String str) {
        str.getClass();
        if (str.equals(com.garmin.realtimesettings.app.presentationlayer.b.a.INVALID_COMPOSITION.f52638a)) {
            av2.b bVar = this.f52652l;
            if (bVar != null) {
                bVar.b();
            }
            z6();
            A6();
            return;
        }
        if (str.equals(com.garmin.realtimesettings.app.presentationlayer.b.a.OUTDATED_COMPOSITION_CACHE.f52638a)) {
            int i14 = this.f52654n;
            h hVar = this.f52642b;
            if (i14 == 36352) {
                hVar.getClass();
                P0(false);
                return;
            } else {
                hVar.getClass();
                P0(true);
                return;
            }
        }
        if (str.equals(com.garmin.realtimesettings.app.presentationlayer.b.a.VALID_COMPOSITION.f52638a)) {
            rw2.a aVar = this.f52644d;
            if (aVar == null) {
                p005kotlin.jvm.internal.s.m("settingsDataModel");
                throw null;
            }
            rw2.e eVar = aVar.f154871k;
            if (eVar != null) {
                sw2.d dVar = sw2.d.f161112a;
                sw2.e eVar2 = new sw2.e(this.f52654n, eVar);
                dVar.getClass();
                sw2.d.f161113b.add(eVar2);
            }
            dx2.c cVar = this.f52645e;
            if (cVar != null) {
                cVar.f61486c.j(cVar.f61484a.f154867g);
            } else {
                p005kotlin.jvm.internal.s.m("settingsViewModel");
                throw null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169 A[PHI: r3 r5
      0x0169: PHI (r3v10 dx2.c) = (r3v2 dx2.c), (r3v6 dx2.c), (r3v7 dx2.c), (r3v11 dx2.c) binds: [B:62:0x0167, B:51:0x0123, B:47:0x0108, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r5v5 java.util.Map<java.lang.String, java.lang.Object>) = 
      (r5v1 java.util.Map<java.lang.String, java.lang.Object>)
      (r5v3 java.util.Map<java.lang.String, java.lang.Object>)
      (r5v4 java.util.Map<java.lang.String, java.lang.Object>)
      (r5v6 java.util.Map<java.lang.String, java.lang.Object>)
     binds: [B:62:0x0167, B:51:0x0123, B:47:0x0108, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void y6(int i14) {
        Map<String, Object> map;
        dx2.c cVar;
        uv2.a aVar = new uv2.a();
        int i15 = this.f52654n;
        dx2.c cVar2 = this.f52645e;
        Unit unit = null;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("settingsViewModel");
            throw null;
        }
        av2.a aVar2 = this.f52653m;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("menuController");
            throw null;
        }
        Map<String, Object> map2 = aVar2.f13293b.get(i14);
        h hVar = uv2.a.f172960c;
        ew2.d.a aVar3 = ew2.d.f66899a;
        if (map2 != null) {
            String strA4 = dx2.c.A4(map2);
            if (strA4 != null) {
                switch (strA4.hashCode()) {
                    case -1939224975:
                        map = map2;
                        cVar = cVar2;
                        if (strA4.equals("REMOVE_DEVICE")) {
                            cx2.i.f56681a.getClass();
                            if (cx2.i.a.b(this)) {
                                ew2.g.f66907a.getClass();
                                ew2.g.f66908b.getClass();
                                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                                vw2.a aVarA = com.garmin.realtimesettings.app.initialization.b.a();
                                Context contextRequireContext = requireContext();
                                contextRequireContext.getClass();
                                f fVarD = aVarA.d(contextRequireContext, strA4);
                                if (fVarD == null || !(fVarD instanceof bx2.e)) {
                                    Objects.toString(fVarD);
                                    Logger logger = h.f56678c;
                                } else {
                                    bx2.e eVar = (bx2.e) fVarD;
                                    String f21683b = eVar.getF21683b();
                                    String strL = eVar.getF189940k();
                                    String str = eVar.f21684c;
                                    String str2 = eVar.f21685d;
                                    m activity = getActivity();
                                    if (activity == null || !cx2.g.e(activity)) {
                                        Logger logger2 = h.f56678c;
                                    } else {
                                        ew2.e.a aVar4 = ew2.e.f66901a;
                                        Context contextRequireContext2 = requireContext();
                                        contextRequireContext2.getClass();
                                        ew2.e.a.b(ew2.e.a.a(aVar4, contextRequireContext2, f21683b, strL, new o13.p(str, new r1(3, this, fVarD)), new o13.p(str2, new el1.a(21)), 992), activity);
                                    }
                                }
                            }
                        } else {
                            hVar.getClass();
                            aVar.a(this, cVar, map);
                        }
                        unit = Unit.INSTANCE;
                        break;
                    case -1779047261:
                        map = map2;
                        cVar = cVar2;
                        if (strA4.equals("ACTION_CANCEL")) {
                            Context context = getContext();
                            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                            if (cx2.g.d(context, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192450b)) {
                                int iF = fb1.c.f(map, gw2.i.MENU_ID.f79975a, cx2.b.f56665a);
                                Integer numValueOf = iF >= 0 ? Integer.valueOf(iF) : null;
                                if (numValueOf == null) {
                                    return;
                                } else {
                                    uv2.a.d(this, cVar, i15, numValueOf.intValue());
                                }
                            } else {
                                uv2.a.c(this, map, strA4);
                            }
                        } else {
                            hVar.getClass();
                            aVar.a(this, cVar, map);
                        }
                        unit = Unit.INSTANCE;
                        break;
                    case -1444616070:
                        map = map2;
                        cVar = cVar2;
                        if (strA4.equals("SYNC_DEVICE")) {
                            ug2.h hVar2 = new ug2.h(6, this, strA4);
                            aVar3.getClass();
                            ew2.d.a.a(hVar2, this);
                        } else {
                            hVar.getClass();
                            aVar.a(this, cVar, map);
                        }
                        unit = Unit.INSTANCE;
                        break;
                    case -528748058:
                        if (strA4.equals("ACTION_SAVE")) {
                            q qVar = new q(this, cVar2, map2, aVar, i15, 3);
                            aVar3.getClass();
                            ew2.d.a.a(qVar, this);
                        } else {
                            map = map2;
                            cVar = cVar2;
                            hVar.getClass();
                            aVar.a(this, cVar, map);
                        }
                        unit = Unit.INSTANCE;
                        break;
                    case -264797935:
                        if (strA4.equals("PULSE_OX_HELP")) {
                            ew2.g.f66907a.getClass();
                            ew2.g.a.c(strA4, map2, this);
                            unit = Unit.INSTANCE;
                        }
                        map = map2;
                        cVar = cVar2;
                        hVar.getClass();
                        aVar.a(this, cVar, map);
                        unit = Unit.INSTANCE;
                        break;
                    case 989283987:
                        if (strA4.equals("MANAGE_DEVICE_PRIORITY")) {
                            cx2.i.f56681a.getClass();
                            if (cx2.i.a.b(this)) {
                                ew2.g.f66907a.getClass();
                                ew2.g.f66908b.getClass();
                                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                                vw2.a aVarA2 = com.garmin.realtimesettings.app.initialization.b.a();
                                Context contextRequireContext3 = requireContext();
                                contextRequireContext3.getClass();
                                bx2.d dVar = (bx2.d) aVarA2.d(contextRequireContext3, strA4);
                                if (dVar != null) {
                                    dVar.l();
                                } else {
                                    Logger logger3 = h.f56678c;
                                }
                            }
                            unit = Unit.INSTANCE;
                        }
                        map = map2;
                        cVar = cVar2;
                        hVar.getClass();
                        aVar.a(this, cVar, map);
                        unit = Unit.INSTANCE;
                        break;
                    case 2089868996:
                        if (strA4.equals("CUSTOM_ACTION")) {
                            Context context2 = getContext();
                            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                            if (cx2.g.d(context2, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192450b)) {
                                int iF2 = fb1.c.f(map2, gw2.i.MENU_ID.f79975a, cx2.b.f56665a);
                                Integer numValueOf2 = iF2 >= 0 ? Integer.valueOf(iF2) : null;
                                if (numValueOf2 == null) {
                                    return;
                                }
                                int iIntValue = numValueOf2.intValue();
                                wu2.b bVarZ4 = dx2.c.z4(map2);
                                if (bVarZ4 != null) {
                                    wu2.i iVar = wu2.i.f187354a;
                                    uv2.c cVar3 = new uv2.c(aVar, i15, iIntValue);
                                    Context contextRequireContext4 = requireContext();
                                    contextRequireContext4.getClass();
                                    bx2.a aVar5 = new bx2.a(contextRequireContext4);
                                    iVar.getClass();
                                    wu2.i.a(this, cVar3, cVar2, aVar5, bVarZ4);
                                } else {
                                    uv2.a.d(this, cVar2, i15, iIntValue);
                                }
                            } else {
                                uv2.a.c(this, map2, strA4);
                            }
                            unit = Unit.INSTANCE;
                        }
                        map = map2;
                        cVar = cVar2;
                        hVar.getClass();
                        aVar.a(this, cVar, map);
                        unit = Unit.INSTANCE;
                        break;
                    default:
                        map = map2;
                        cVar = cVar2;
                        hVar.getClass();
                        aVar.a(this, cVar, map);
                        unit = Unit.INSTANCE;
                        break;
                }
            }
            if (unit != null) {
                return;
            }
        }
        hVar.getClass();
    }

    public final void z6() {
        if (this.f52644d == null) {
            p005kotlin.jvm.internal.s.m("settingsDataModel");
            throw null;
        }
        this.f52653m = new av2.a();
        m mVarU6 = u6();
        if (mVarU6 != null) {
            mVarU6.invalidateOptionsMenu();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/c$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(rw2.a aVar, int i14, boolean z14) {
            aVar.getClass();
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("SETTINGS_DATA_MODEL_BUNDLE", aVar);
            bundle.putInt("RealTimeSettingInitializer_Composition_Id", i14);
            bundle.putBoolean("IS_COMPOSITION_BAKED_TO_APP", z14);
            cVar.setArguments(bundle);
            return cVar;
        }

        private a() {
        }
    }
}
