package av2;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.x0;
import androidx.core.view.z0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import bv2.k;
import bv2.l;
import bv2.m;
import com.garmin.realtimesettings.app.baseviews.reorderable.ReorderableListView;
import com.garmin.realtimesettings.app.presentationlayer.c;
import com.google.firebase.perf.FirebasePerformance;
import cx2.g;
import cx2.h;
import e23.p;
import gw2.j;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import mt0.e0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s;
import t13.d;
import u53.o;
import v13.e;
import v13.i;
import zw2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lav2/b;", "", "Lcom/garmin/realtimesettings/app/presentationlayer/c;", "settingsDeviceFragment", "<init>", "(Lcom/garmin/realtimesettings/app/presentationlayer/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f13296b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @e(c = "com.garmin.realtimesettings.app.baseviews.controller.ViewController$frameView$1", f = "ViewController.kt", l = {446}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f13298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f13299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Fragment f13301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ dx2.c f13302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f f13303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f13304h;

        /* JADX INFO: renamed from: av2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
        @e(c = "com.garmin.realtimesettings.app.baseviews.controller.ViewController$frameView$1$1", f = "ViewController.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0185a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m0 f13305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Fragment f13306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ dx2.c f13307c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f13308d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Map<String, Object> f13309e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f13310f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0185a(m0 m0Var, Fragment fragment, dx2.c cVar, f fVar, Map<String, ? extends Object> map, b bVar, d<? super C0185a> dVar) {
                super(2, dVar);
                this.f13305a = m0Var;
                this.f13306b = fragment;
                this.f13307c = cVar;
                this.f13308d = fVar;
                this.f13309e = map;
                this.f13310f = bVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C0185a(this.f13305a, this.f13306b, this.f13307c, this.f13308d, this.f13309e, this.f13310f, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((C0185a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                boolean zF = com.garmin.realtimesettings.app.initialization.b.a().f();
                Map<String, Object> map = this.f13309e;
                b bVar = this.f13310f;
                if (zF && this.f13305a.f105804a) {
                    Fragment fragment = this.f13306b;
                    if (g.c(fragment)) {
                        f fVar = this.f13308d;
                        dx2.c cVar = this.f13307c;
                        zv2.c cVar2 = new zv2.c(fragment, cVar, (zv2.b) fVar, (Map<String, ? extends Object>) map);
                        bv2.d.f21472a.getClass();
                        bv2.d.a.a(fragment, cVar2, fVar, cVar, map);
                        bVar.f13295a.v6().addView(cVar2);
                    } else {
                        bVar.f13296b.getClass();
                    }
                } else {
                    h hVar = bVar.f13296b;
                    Objects.toString(map.get(gw2.i.TYPE.f79975a));
                    hVar.getClass();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var, b bVar, String str, Fragment fragment, dx2.c cVar, f fVar, Map<String, ? extends Object> map, d<? super a> dVar) {
            super(2, dVar);
            this.f13298b = m0Var;
            this.f13299c = bVar;
            this.f13300d = str;
            this.f13301e = fragment;
            this.f13302f = cVar;
            this.f13303g = fVar;
            this.f13304h = map;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f13298b, this.f13299c, this.f13300d, this.f13301e, this.f13302f, this.f13303g, this.f13304h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13297a;
            if (i14 == 0) {
                r.b(obj);
                this.f13299c.getClass();
                String str = this.f13300d;
                str.getClass();
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                    z14 = responseCode == 404;
                } catch (Exception unused) {
                }
                this.f13298b.f105804a = !z14;
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                C0185a c0185a = new C0185a(this.f13298b, this.f13301e, this.f13302f, this.f13303g, this.f13304h, this.f13299c, null);
                this.f13297a = 1;
                if (ge1.b.e0(t1Var, c0185a, this) == aVar) {
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

    public b(c cVar) {
        cVar.getClass();
        this.f13295a = cVar;
        this.f13296b = new h("ViewController", null, 2, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ev2.e a(Context context, Map map) {
        Map map2;
        Object obj = map.get(gw2.i.LINK_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        String strValueOf = String.valueOf(map2 != null ? map2.get(gw2.i.LINK_TYPE.f79975a) : null);
        switch (strValueOf.hashCode()) {
            case -1703078927:
                if (strValueOf.equals("FLOAT_PICKER")) {
                    return new gv2.e(context);
                }
                break;
            case -1356905372:
                if (strValueOf.equals("TOD_PICKER")) {
                    return new nv2.e(context);
                }
                break;
            case -1222931002:
                if (strValueOf.equals("MULTI_SELECTION")) {
                    return new kv2.e(context);
                }
                break;
            case -989593271:
                if (strValueOf.equals("INTEGER_INPUT")) {
                    return new iv2.e(context);
                }
                break;
            case -417231153:
                if (strValueOf.equals("INTEGER_PICKER")) {
                    return new jv2.e(context);
                }
                break;
            case 1070629228:
                if (strValueOf.equals("SELECTION")) {
                    return new lv2.d(context);
                }
                break;
            case 1247436352:
                if (strValueOf.equals("TIME_PICKER")) {
                    return new mv2.f(context);
                }
                break;
            case 1418373798:
                if (strValueOf.equals("HEIGHT_PICKER")) {
                    return new hv2.e(context);
                }
                break;
            case 1738715711:
                if (strValueOf.equals("DATE_PICKER")) {
                    return new fv2.g(context);
                }
                break;
        }
        return new ev2.e(context);
    }

    public final void b() {
        Iterator<View> it = new x0(this.f13295a.v6()).iterator();
        while (true) {
            z0 z0Var = (z0) it;
            if (!z0Var.hasNext()) {
                return;
            }
            KeyEvent.Callback callback = (View) z0Var.next();
            if (callback instanceof vw2.b) {
                ((vw2.b) callback).a();
            }
        }
    }

    public final void c(Fragment fragment, dx2.c cVar, Map<String, ? extends Object> map) {
        Map map2;
        cVar.getClass();
        String strA4 = dx2.c.A4(map);
        if (strA4 == null) {
            strA4 = j.NONE.f80000a;
        }
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        h hVar = this.f13296b;
        hVar.getClass();
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        f fVarD = com.garmin.realtimesettings.app.initialization.b.a().d(contextRequireContext, strA4);
        if (fVarD == null) {
            fVarD = (strA4.equals(j.SINGLE_LABEL.f80000a) || strA4.equals(j.HELP_AND_INFO.f80000a) || strA4.equals(j.AVAILABLE_ACCESSORIES.f80000a) || strA4.equals(j.SINGLE_LABEL_WITH_ACTION_ICON.f80000a)) ? new zv2.b(contextRequireContext) : new f(contextRequireContext);
        }
        f fVar = fVarD;
        gw2.i iVar = gw2.i.TYPE;
        String str = iVar.f79975a;
        String str2 = iVar.f79975a;
        Object obj = map.get(str);
        boolean zG = s.g(obj, j.ACTION.f80000a);
        c cVar2 = this.f13295a;
        if (zG) {
            if (g.c(fragment)) {
                Context contextRequireContext2 = fragment.requireContext();
                contextRequireContext2.getClass();
                wu2.f fVar2 = new wu2.f(fragment, cVar, new wu2.g(contextRequireContext2), map);
                wu2.a.f187327a.getClass();
                wu2.a.b(fragment, fVar2, fVar, cVar, map);
                cVar2.v6().addView(fVar2);
                return;
            }
            return;
        }
        if (s.g(obj, j.BATTERY_STATUS.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext3 = fragment.requireContext();
                contextRequireContext3.getClass();
                cVar2.v6().addView(new xu2.c(fragment, new xu2.d(contextRequireContext3), cVar, map));
                return;
            }
            return;
        }
        if (s.g(obj, j.DEVICE_VIEW.f80000a)) {
            if (fVar instanceof zw2.d) {
                if (g.c(fragment)) {
                    cVar2.v6().addView(new k(fragment, (zw2.d) fVar, cVar, map));
                    return;
                }
                return;
            } else {
                hVar.d(null, "frameView: required DeviceTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
        }
        if (s.g(obj, j.DEVICE_ERROR_STATUS_VIEW.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext4 = fragment.requireContext();
                contextRequireContext4.getClass();
                cVar2.v6().addView(new bv2.e(fragment, new zw2.b(contextRequireContext4), cVar, map));
                return;
            }
            return;
        }
        if (s.g(obj, j.DOUBLE_LABEL.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext5 = fragment.requireContext();
                contextRequireContext5.getClass();
                ev2.e eVarA = a(contextRequireContext5, map);
                ev2.g gVar = new ev2.g(fragment, eVarA, cVar, map);
                new ev2.a().c(fragment, gVar, eVarA, cVar, map);
                cVar2.v6().addView(gVar);
                return;
            }
            return;
        }
        if (s.g(obj, j.DOUBLE_LABEL_WITH_ACTION_ICON.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext6 = fragment.requireContext();
                contextRequireContext6.getClass();
                ev2.e eVarA2 = a(contextRequireContext6, map);
                ev2.g gVar2 = new ev2.g(fragment, eVarA2, cVar, map);
                AppCompatImageView leftIconImageView = gVar2.getLeftIconImageView();
                AppCompatImageView iconImageView = gVar2.getIconImageView();
                new ev2.a().c(fragment, gVar2, eVarA2, cVar, map);
                String str3 = f.d(cVar, map).f207295b;
                if (str3 == null || str3.length() == 0) {
                    wu2.a.f187327a.getClass();
                    wu2.a.b(fragment, iconImageView, fVar, cVar, map);
                } else {
                    wu2.a.f187327a.getClass();
                    wu2.a.b(fragment, leftIconImageView, fVar, cVar, map);
                }
                cVar2.v6().addView(gVar2);
                return;
            }
            return;
        }
        if (s.g(obj, j.EDIT_TEXT.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext7 = fragment.requireContext();
                contextRequireContext7.getClass();
                ov2.e eVar = new ov2.e(contextRequireContext7);
                ov2.f fVar3 = new ov2.f(fragment, eVar, cVar, map);
                ov2.a.f134257a.getClass();
                fVar3.getEditTextView().f141654g = new e0((c) fragment, eVar, cVar, map, 12);
                cVar2.v6().addView(fVar3);
                return;
            }
            return;
        }
        if (s.g(obj, j.EMPTY_STATE_VIEW.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext8 = fragment.requireContext();
                contextRequireContext8.getClass();
                qv2.a aVar = new qv2.a(fragment, new qv2.d(contextRequireContext8), cVar, map);
                new qv2.b().b(fragment, aVar.getEmptyStateAction(), cVar, map);
                cVar2.v6().addView(aVar);
                return;
            }
            return;
        }
        if (s.g(obj, j.FEATURE_SETUP.f80000a)) {
            if (!(fVar instanceof zw2.e)) {
                hVar.d(null, "frameView: required DeviceTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            if (g.c(fragment)) {
                l lVar = new l(fragment, cVar, (zw2.e) fVar, map);
                bv2.d.f21472a.getClass();
                bv2.d.a.a(fragment, lVar, fVar, cVar, map);
                cVar2.v6().addView(lVar);
                return;
            }
            return;
        }
        if (s.g(obj, j.HEADER.f80000a)) {
            if (g.c(fragment)) {
                cVar2.v6().addView(new cw2.a(fragment, cVar, fVar, map));
                return;
            }
            return;
        }
        if (s.g(obj, j.HELP_AND_INFO.f80000a)) {
            Objects.toString(map.get(str2));
            if (!(fVar instanceof zv2.b)) {
                hVar.d(null, "frameView: required SingleLabelTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            if (g.c(fragment)) {
                zv2.c cVar3 = new zv2.c(fragment, cVar, (zv2.b) fVar, map);
                bv2.d.f21472a.getClass();
                bv2.d.a.a(fragment, cVar3, fVar, cVar, map);
                cVar2.v6().addView(cVar3);
                return;
            }
            return;
        }
        if (s.g(obj, j.AVAILABLE_ACCESSORIES.f80000a)) {
            Objects.toString(map.get(str2));
            if (!(fVar instanceof zv2.b)) {
                hVar.d(null, "frameView: required SingleLabelTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            Object obj2 = map.get(gw2.i.TITLE.f79975a);
            try {
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                map2 = (Map) obj2;
            } catch (ClassCastException unused) {
                map2 = null;
            }
            String.valueOf(map2 != null ? map2.get(gw2.i.TEXT.f79975a) : null);
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            vw2.a aVarA = com.garmin.realtimesettings.app.initialization.b.a();
            Context contextRequireContext9 = fragment.requireContext();
            contextRequireContext9.getClass();
            Intent intentG = aVarA.g(contextRequireContext9, "AVAILABLE_ACCESSORIES");
            String dataString = intentG != null ? intentG.getDataString() : null;
            m0 m0Var = new m0();
            if (dataString != null) {
                x53.c cVar4 = s0.f129406a;
                ge1.b.T(c0.a(x53.b.f189152a), null, null, new a(m0Var, this, dataString, fragment, cVar, fVar, map, null), 3);
                return;
            }
            return;
        }
        if (s.g(obj, j.IMAGE_CENTER_ALIGNED.f80000a)) {
            if (g.c(fragment)) {
                cVar2.v6().addView(new bv2.a(fragment, fVar, cVar, map));
                return;
            }
            return;
        }
        if (s.g(obj, j.MULTI_SELECTION_ITEM.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext10 = fragment.requireContext();
                contextRequireContext10.getClass();
                vv2.d dVar = new vv2.d(contextRequireContext10);
                vv2.e eVar2 = new vv2.e(fragment, dVar, cVar, map);
                vv2.a.f180545a.getClass();
                eVar2.setOnClickListener(new ew2.c((c) fragment, dVar, cVar, map, 22));
                cVar2.v6().addView(eVar2);
                return;
            }
            return;
        }
        if (s.g(obj, j.PREFERRED_ACTIVITY_TRACKER.f80000a)) {
            if (!(fVar instanceof zw2.h)) {
                hVar.d(null, "frameView: required ViewAccessoryStateTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            if (g.c(fragment)) {
                m mVar = new m(fragment, cVar, (zw2.h) fVar, map);
                bv2.d.f21472a.getClass();
                bv2.d.a.a(fragment, mVar, fVar, cVar, map);
                cVar2.v6().addView(mVar);
                return;
            }
            return;
        }
        if (s.g(obj, j.PULSE_OX_RANGE.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext11 = fragment.requireContext();
                contextRequireContext11.getClass();
                cVar2.v6().addView(new bv2.o(contextRequireContext11, null, 2, null));
                return;
            }
            return;
        }
        if (s.g(obj, j.REORDERABLE_LIST.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext12 = fragment.requireContext();
                contextRequireContext12.getClass();
                wv2.k kVar = new wv2.k(contextRequireContext12);
                ReorderableListView reorderableListView = new ReorderableListView(fragment, kVar, cVar, map);
                wv2.f.f187482a.getClass();
                reorderableListView.setActionListener(new wv2.e(fragment, kVar, cVar, map));
                cVar2.v6().addView(reorderableListView);
                return;
            }
            return;
        }
        if (s.g(obj, j.SELECTION_ITEM.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext13 = fragment.requireContext();
                contextRequireContext13.getClass();
                yv2.f fVar4 = new yv2.f(contextRequireContext13);
                yv2.g gVar3 = new yv2.g(fragment, fVar4, cVar, map);
                yv2.c.f199858a.getClass();
                gVar3.setOnClickListener(new ew2.c((Object) fVar4, cVar, (Map) map, fragment, 24));
                cVar2.v6().addView(gVar3);
                return;
            }
            return;
        }
        if (s.g(obj, j.SINGLE_LABEL.f80000a)) {
            if (!(fVar instanceof zv2.b)) {
                hVar.d(null, "frameView: required SingleLabelTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            if (g.c(fragment)) {
                zv2.c cVar5 = new zv2.c(fragment, cVar, (zv2.b) fVar, map);
                new zv2.a().c(fragment, cVar5, cVar, map);
                cVar2.v6().addView(cVar5);
                return;
            }
            return;
        }
        if (s.g(obj, j.SINGLE_LABEL_WITH_ACTION_ICON.f80000a)) {
            if (!(fVar instanceof zv2.b)) {
                hVar.d(null, "frameView: required SingleLabelTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            if (g.c(fragment)) {
                zv2.c cVar6 = new zv2.c(fragment, cVar, (zv2.b) fVar, map);
                AppCompatImageView leftIconImageView2 = cVar6.getLeftIconImageView();
                AppCompatImageView iconImageView2 = cVar6.getIconImageView();
                new zv2.a().c(fragment, cVar6, cVar, map);
                String str4 = f.d(cVar, map).f207295b;
                if (str4 == null || str4.length() == 0) {
                    wu2.a.f187327a.getClass();
                    wu2.a.b(fragment, iconImageView2, fVar, cVar, map);
                } else {
                    wu2.a.f187327a.getClass();
                    wu2.a.b(fragment, leftIconImageView2, fVar, cVar, map);
                }
                cVar2.v6().addView(cVar6);
                return;
            }
            return;
        }
        if (s.g(obj, j.FIND_MY_DEVICE.f80000a) || s.g(obj, j.HAND_ALIGNMENT.f80000a)) {
            if (!(fVar instanceof zw2.h)) {
                hVar.d(null, "frameView: required ViewAccessoryStateTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            if (g.c(fragment)) {
                zw2.h hVar2 = (zw2.h) fVar;
                zv2.d dVar2 = new zv2.d(fragment, cVar, hVar2, map);
                new zv2.a();
                zv2.a.f207178c.getClass();
                dVar2.setOnClickListener(new ty0.a(fragment, 16, hVar2, dVar2));
                cVar2.v6().addView(dVar2);
                return;
            }
            return;
        }
        if (s.g(obj, j.ALERT_VOLUME.f80000a)) {
            if (!(fVar instanceof zw2.a)) {
                hVar.d(null, "frameView: required AlertVolumeTransform and found " + p005kotlin.jvm.internal.s0.f105811a.b(fVar.getClass()).D());
                return;
            }
            if (g.c(fragment)) {
                zv2.d dVar3 = new zv2.d(fragment, cVar, (zw2.h) fVar, map);
                new zv2.a();
                zv2.a.f207178c.getClass();
                dVar3.setOnClickListener(new bv2.c(fragment, (zw2.a) fVar, dVar3, cVar, map));
                cVar2.v6().addView(dVar3);
                return;
            }
            return;
        }
        if (s.g(obj, j.SPACER.f80000a)) {
            if (g.c(fragment)) {
                cVar2.v6().addView(new aw2.a(fragment, cVar, map, fVar));
                return;
            }
            return;
        }
        if (s.g(obj, j.SWITCH.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext14 = fragment.requireContext();
                contextRequireContext14.getClass();
                bw2.i iVar2 = new bw2.i(contextRequireContext14);
                bw2.h hVar3 = new bw2.h(fragment, iVar2, cVar, map);
                bw2.d dVar4 = bw2.d.f21586a;
                ConstraintLayout rowContainerView = hVar3.getRowContainerView();
                SwitchCompat switchView = hVar3.getSwitchView();
                dVar4.getClass();
                rowContainerView.getClass();
                switchView.getClass();
                rowContainerView.setOnClickListener(new bw2.a(fragment, switchView, map, cVar, iVar2, rowContainerView, 0));
                cVar2.v6().addView(hVar3);
                return;
            }
            return;
        }
        if (s.g(obj, j.TEXT.f80000a)) {
            if (g.c(fragment)) {
                Context contextRequireContext15 = fragment.requireContext();
                contextRequireContext15.getClass();
                cVar2.v6().addView(new cw2.c(fragment, cVar, new cw2.f(contextRequireContext15), map));
                return;
            }
            return;
        }
        if (s.g(obj, j.WATCH_FACE_GRID.f80000a) && g.c(fragment)) {
            NestedScrollView nestedScrollView = cVar2.f52650j;
            if (nestedScrollView != null) {
                cVar2.v6().addView(new rv2.e(fragment, nestedScrollView, cVar, map));
            } else {
                s.m("nestedScrollView");
                throw null;
            }
        }
    }

    public final void d(Map<String, ? extends Object> map) {
        gw2.i iVar = gw2.i.TYPE;
        String str = iVar.f79975a;
        String str2 = iVar.f79975a;
        Object obj = map.get(str);
        if (!s.g(obj != null ? obj.toString() : null, j.HEADER.f80000a)) {
            Object obj2 = map.get(str2);
            if (!s.g(obj2 != null ? obj2.toString() : null, j.SPACER.f80000a)) {
                Object obj3 = map.get(str2);
                if (!s.g(obj3 != null ? obj3.toString() : null, j.DEVICE_VIEW.f80000a)) {
                    Object obj4 = map.get(str2);
                    if (!s.g(obj4 != null ? obj4.toString() : null, j.IMAGE_CENTER_ALIGNED.f80000a)) {
                        return;
                    }
                }
            }
        }
        this.f13295a.v6().setPadding(0, 0, 0, 0);
    }
}
