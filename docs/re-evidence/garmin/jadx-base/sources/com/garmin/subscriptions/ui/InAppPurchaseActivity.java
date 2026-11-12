package com.garmin.subscriptions.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.core.view.o1;
import androidx.core.view.s0;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.x;
import cy2.g;
import cy2.i;
import cy2.j;
import d53.w;
import ds.e0;
import e23.p;
import h4.r;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import lc.u0;
import o13.o;
import o4.d0;
import o4.f0;
import o53.b0;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.m;
import p3.n;
import p3.x1;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/subscriptions/ui/InAppPurchaseActivity;", "Li/c;", "<init>", "()V", "a", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InAppPurchaseActivity extends i.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f52722l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f52723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ve2.e f52724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f52725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f52726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cy2.c f52727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f52728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.appcompat.app.e f52729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InAppPurchaseWebView f52730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Toolbar f52731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ComposeView f52732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f52733k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/subscriptions/ui/InAppPurchaseActivity$b", "Lb/s;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = InAppPurchaseActivity.f52722l;
            InAppPurchaseActivity.this.P9();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p<m, Integer, Unit> {
        public c() {
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            if ((num.intValue() & 3) == 2 && mVar2.b()) {
                mVar2.e();
            } else {
                x1 x1Var = n.f135158a;
                g gVar = InAppPurchaseActivity.this.f52728f;
                if (gVar == null) {
                    p005kotlin.jvm.internal.s.m("webViewConfig");
                    throw null;
                }
                gVar.f56834a.U0(r.S, mVar2, 6);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.subscriptions.ui.InAppPurchaseActivity$onCreate$8", f = "InAppPurchaseActivity.kt", l = {298}, m = "invokeSuspend")
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f52737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f52738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InAppPurchaseActivity f52739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, InAppPurchaseActivity inAppPurchaseActivity, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f52737b = str;
            this.f52738c = str2;
            this.f52739d = inAppPurchaseActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f52737b, this.f52738c, this.f52739d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52736a;
            InAppPurchaseActivity inAppPurchaseActivity = this.f52739d;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    ey2.c cVar = ey2.c.f67454a;
                    String str = this.f52737b;
                    String str2 = this.f52738c;
                    ve2.e eVar = inAppPurchaseActivity.f52724b;
                    if (eVar == null) {
                        p005kotlin.jvm.internal.s.m("environment");
                        throw null;
                    }
                    i iVar = inAppPurchaseActivity.f52725c;
                    if (iVar == null) {
                        p005kotlin.jvm.internal.s.m("purchaseDelegate");
                        throw null;
                    }
                    j jVar = inAppPurchaseActivity.f52726d;
                    if (jVar == null) {
                        p005kotlin.jvm.internal.s.m("activationFlow");
                        throw null;
                    }
                    cy2.c cVar2 = inAppPurchaseActivity.f52727e;
                    this.f52736a = 1;
                    cVar.getClass();
                    obj = ey2.c.a(str, str2, eVar, iVar, jVar, cVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                Uri uri = (Uri) obj;
                String string = uri.toString();
                string.getClass();
                if (!w.z(string, ".garmin.com", false) && !w.z(string, ".garmin.cn", false)) {
                    inAppPurchaseActivity.f52723a.error("Auto login URL is not Garmin website.");
                    inAppPurchaseActivity.finish();
                    return Unit.INSTANCE;
                }
                InAppPurchaseWebView inAppPurchaseWebView = inAppPurchaseActivity.f52730h;
                if (inAppPurchaseWebView != null) {
                    inAppPurchaseWebView.clearHistory();
                    inAppPurchaseWebView.clearFormData();
                    inAppPurchaseWebView.clearCache(true);
                    f fVar = inAppPurchaseActivity.f52733k;
                    fVar.getClass();
                    inAppPurchaseWebView.f52776a = fVar;
                    String host = uri.getHost();
                    if (host != null && (w.z(host, ".garmin.com", false) || w.z(host, ".garmin.cn", false))) {
                        inAppPurchaseWebView.loadUrl(uri.toString());
                    }
                }
                return Unit.INSTANCE;
            } catch (o e4) {
                inAppPurchaseActivity.f52723a.error("Failed to generate purchase URL", (Throwable) e4);
                inAppPurchaseActivity.finish();
                return Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.subscriptions.ui.InAppPurchaseActivity$onResume$1$1", f = "InAppPurchaseActivity.kt", l = {338}, m = "invokeSuspend")
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InAppPurchaseActivity f52740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InAppPurchaseWebView f52741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f52743d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InAppPurchaseWebView f52745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InAppPurchaseWebView f52746g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InAppPurchaseWebView inAppPurchaseWebView, InAppPurchaseWebView inAppPurchaseWebView2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f52745f = inAppPurchaseWebView;
            this.f52746g = inAppPurchaseWebView2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = InAppPurchaseActivity.this.new e(this.f52745f, this.f52746g, dVar);
            eVar.f52743d = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InAppPurchaseActivity inAppPurchaseActivity;
            b0 b0Var;
            InAppPurchaseWebView inAppPurchaseWebView;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52742c;
            if (i14 == 0) {
                o13.r.b(obj);
                b0 b0Var2 = (b0) this.f52743d;
                inAppPurchaseActivity = InAppPurchaseActivity.this;
                i iVar = inAppPurchaseActivity.f52725c;
                Logger logger = inAppPurchaseActivity.f52723a;
                if (iVar == null) {
                    p005kotlin.jvm.internal.s.m("purchaseDelegate");
                    throw null;
                }
                Uri uriB3 = iVar.B3();
                if (uriB3 != null) {
                    logger.debug("Received deep link request");
                    ey2.c cVar = ey2.c.f67454a;
                    this.f52743d = b0Var2;
                    this.f52740a = inAppPurchaseActivity;
                    InAppPurchaseWebView inAppPurchaseWebView2 = this.f52745f;
                    this.f52741b = inAppPurchaseWebView2;
                    this.f52742c = 1;
                    Comparable comparableB = cVar.b(uriB3, this);
                    if (comparableB == aVar) {
                        return aVar;
                    }
                    b0Var = b0Var2;
                    obj = comparableB;
                    inAppPurchaseWebView = inAppPurchaseWebView2;
                } else {
                    InAppPurchaseWebView inAppPurchaseWebView3 = this.f52746g;
                    if (inAppPurchaseWebView3.getUrl() != null) {
                        inAppPurchaseWebView3.reload();
                    } else {
                        logger.debug("WebView URL is null, not reloading");
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            inAppPurchaseWebView = this.f52741b;
            inAppPurchaseActivity = this.f52740a;
            b0Var = (b0) this.f52743d;
            o13.r.b(obj);
            Uri uri = (Uri) obj;
            if (uri == null) {
                inAppPurchaseActivity.f52723a.debug("Failed to process the redirect URL");
            } else if (c0.g(b0Var)) {
                inAppPurchaseWebView.getClass();
                inAppPurchaseWebView.loadUrl(uri.toString());
                i iVar2 = inAppPurchaseActivity.f52725c;
                if (iVar2 == null) {
                    p005kotlin.jvm.internal.s.m("purchaseDelegate");
                    throw null;
                }
                iVar2.m3(null);
            } else {
                inAppPurchaseActivity.f52723a.debug("Coroutine scope is no longer active, cannot load the redirect URL");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/subscriptions/ui/InAppPurchaseActivity$f", "Ley2/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements ey2.e {
        public f() {
        }

        @Override // ey2.e
        public final void a() {
            InAppPurchaseActivity inAppPurchaseActivity = InAppPurchaseActivity.this;
            inAppPurchaseActivity.setResult(9);
            inAppPurchaseActivity.finish();
        }

        @Override // ey2.e
        @SuppressLint({"QueryPermissionsNeeded"})
        public final void b(Uri uri) {
            Uri uriNormalizeScheme = uri.normalizeScheme();
            Intent intent = new Intent("android.intent.action.VIEW", uriNormalizeScheme);
            InAppPurchaseActivity inAppPurchaseActivity = InAppPurchaseActivity.this;
            if (intent.resolveActivity(inAppPurchaseActivity.getPackageManager()) != null) {
                inAppPurchaseActivity.startActivity(intent);
                return;
            }
            Logger logger = inAppPurchaseActivity.f52723a;
            StringBuilder sbI = p6.b.i("Tried to open ", uriNormalizeScheme.getScheme(), "://", uriNormalizeScheme.getHost(), uriNormalizeScheme.getPath());
            sbI.append(" externally and the user had no browser apps installed.");
            logger.error(sbI.toString());
        }

        @Override // ey2.e
        public final void c(com.garmin.subscriptions.ui.a aVar) {
            InAppPurchaseActivity inAppPurchaseActivity = InAppPurchaseActivity.this;
            String str = aVar.f52780b;
            try {
                inAppPurchaseActivity.startActivity(new Intent("android.intent.action.VIEW", aVar.getF52779a().normalizeScheme()));
            } catch (ActivityNotFoundException e4) {
                Logger logger = inAppPurchaseActivity.f52723a;
                Logger logger2 = inAppPurchaseActivity.f52723a;
                logger.debug("Payconiq app not installed; use market:// url to open the appropriate store", (Throwable) e4);
                try {
                    inAppPurchaseActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                } catch (ActivityNotFoundException e14) {
                    logger2.warn("Failed to open the app " + str + " via url " + aVar.getF52779a() + " or in the Play Store via the market:// url", (Throwable) e14);
                    try {
                        inAppPurchaseActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
                    } catch (ActivityNotFoundException e15) {
                        logger2.error("Tried to open the Google Play store externally and the user had no browser apps installed", (Throwable) e15);
                    }
                }
            }
        }

        @Override // ey2.e
        public final void d() {
            InAppPurchaseActivity.this.R9();
        }

        @Override // ey2.e
        public final void e() {
            InAppPurchaseWebView inAppPurchaseWebView;
            cy2.d dVar;
            cy2.d dVar2;
            InAppPurchaseActivity inAppPurchaseActivity = InAppPurchaseActivity.this;
            ComposeView composeView = inAppPurchaseActivity.f52732j;
            if (composeView == null) {
                p005kotlin.jvm.internal.s.m("loadingComposeView");
                throw null;
            }
            composeView.setVisibility(8);
            cy2.c cVar = inAppPurchaseActivity.f52727e;
            oy2.a aVarM = (cVar == null || (dVar2 = cVar.f56812e) == null) ? null : xy2.b.M(dVar2);
            cy2.c cVar2 = inAppPurchaseActivity.f52727e;
            oy2.a aVarM2 = (cVar2 == null || (dVar = cVar2.f56813f) == null) ? null : xy2.b.M(dVar);
            if (aVarM == null || aVarM2 == null || (inAppPurchaseWebView = inAppPurchaseActivity.f52730h) == null) {
                return;
            }
            Map<py2.e, py2.a> mapA = py2.c.a(aVarM);
            ArrayList arrayList = new ArrayList(mapA.size());
            for (Map.Entry<py2.e, py2.a> entry : mapA.entrySet()) {
                arrayList.add(oe2.f.N(py2.d.LIGHT, entry.getKey(), entry.getValue()));
            }
            Map<py2.e, py2.a> mapA2 = py2.c.a(aVarM2);
            ArrayList arrayList2 = new ArrayList(mapA2.size());
            for (Map.Entry<py2.e, py2.a> entry2 : mapA2.entrySet()) {
                arrayList2.add(oe2.f.N(py2.d.DARK, entry2.getKey(), entry2.getValue()));
            }
            String strK0 = h0.k0(h0.C0(arrayList, arrayList2), "\n", null, null, null, 62);
            inAppPurchaseWebView.getSettings().setJavaScriptEnabled(true);
            inAppPurchaseWebView.evaluateJavascript(strK0, null);
            Map<py2.e, py2.a> mapA3 = py2.c.a(aVarM);
            ArrayList arrayList3 = new ArrayList(mapA3.size());
            for (Map.Entry<py2.e, py2.a> entry3 : mapA3.entrySet()) {
                arrayList3.add(og.a.S(py2.d.LIGHT, entry3.getKey(), entry3.getValue()));
            }
            Map<py2.e, py2.a> mapA4 = py2.c.a(aVarM2);
            ArrayList arrayList4 = new ArrayList(mapA4.size());
            for (Map.Entry<py2.e, py2.a> entry4 : mapA4.entrySet()) {
                arrayList4.add(og.a.S(py2.d.DARK, entry4.getKey(), entry4.getValue()));
            }
            String strC = d53.n.c("\n        new MutationObserver(() => {\n            if (document.getElementById('upc-frame')) {\n                document.getElementById('upc-frame').onload = () => {\n                    " + h0.k0(h0.C0(arrayList3, arrayList4), "\n", null, null, null, 62) + "\n                }\n            }\n        }).observe(document.body, { childList: true, subtree: true });\n    ");
            inAppPurchaseWebView.getSettings().setJavaScriptEnabled(true);
            inAppPurchaseWebView.evaluateJavascript(strC, null);
        }

        @Override // ey2.e
        public final void f() {
            InAppPurchaseActivity inAppPurchaseActivity = InAppPurchaseActivity.this;
            inAppPurchaseActivity.setResult(0);
            inAppPurchaseActivity.finish();
        }

        @Override // ey2.e
        public final void onSuccess() {
            InAppPurchaseActivity inAppPurchaseActivity = InAppPurchaseActivity.this;
            inAppPurchaseActivity.setResult(-1);
            inAppPurchaseActivity.finish();
        }
    }

    public InAppPurchaseActivity() {
        Logger logger = LoggerFactory.getLogger("SUB#InAppPurchaseActivity");
        logger.getClass();
        this.f52723a = logger;
        this.f52733k = new f();
    }

    public final boolean O9() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    public final void P9() {
        cy2.b bVar;
        g gVar = this.f52728f;
        if (gVar == null) {
            p005kotlin.jvm.internal.s.m("webViewConfig");
            throw null;
        }
        cy2.f fVar = gVar.f56836c;
        if (fVar == null || (bVar = fVar.f56833e) == null) {
            setResult(0);
            finish();
            return;
        }
        androidx.appcompat.app.e eVar = this.f52729g;
        if (eVar == null || !eVar.isShowing()) {
            ey2.c cVar = ey2.c.f67454a;
            e40.d dVar = new e40.d(this, 21);
            ey0.a aVar = new ey0.a(9);
            cVar.getClass();
            this.f52729g = ey2.c.c(this, bVar, dVar, aVar);
        }
    }

    public final void Q9(cy2.d dVar, cy2.d dVar2) {
        d0 d0Var;
        d0 d0Var2;
        boolean zO9 = O9();
        if (!zO9) {
            d0Var = dVar.f56819c;
            if (d0Var == null) {
                oy2.a.f134421m.getClass();
                d0Var = oy2.a.f134422n.f134426c;
            }
        } else {
            if (!zO9) {
                u0.r();
                return;
            }
            d0Var = dVar2.f56819c;
            if (d0Var == null) {
                oy2.a.f134421m.getClass();
                d0Var = oy2.a.f134423o.f134426c;
            }
        }
        if (d0Var != null) {
            int iJ = f0.j(d0Var.f128833a);
            getWindow().setStatusBarColor(iJ);
            getWindow().setNavigationBarColor(iJ);
            InAppPurchaseWebView inAppPurchaseWebView = this.f52730h;
            if (inAppPurchaseWebView != null) {
                inAppPurchaseWebView.setBackgroundColor(iJ);
            }
            Toolbar toolbar = this.f52731i;
            if (toolbar == null) {
                p005kotlin.jvm.internal.s.m("toolbar");
                throw null;
            }
            toolbar.setBackgroundColor(iJ);
        }
        boolean zO10 = O9();
        if (!zO10) {
            d0Var2 = dVar.f56820d;
            if (d0Var2 == null) {
                oy2.a.f134421m.getClass();
                d0Var2 = oy2.a.f134422n.f134427d;
            }
        } else {
            if (!zO10) {
                u0.r();
                return;
            }
            d0Var2 = dVar2.f56820d;
            if (d0Var2 == null) {
                oy2.a.f134421m.getClass();
                d0Var2 = oy2.a.f134423o.f134427d;
            }
        }
        if (d0Var2 != null) {
            int iJ2 = f0.j(d0Var2.f128833a);
            Toolbar toolbar2 = this.f52731i;
            if (toolbar2 == null) {
                p005kotlin.jvm.internal.s.m("toolbar");
                throw null;
            }
            Drawable navigationIcon = toolbar2.getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon.setTint(iJ2);
            }
            Toolbar toolbar3 = this.f52731i;
            if (toolbar3 == null) {
                p005kotlin.jvm.internal.s.m("toolbar");
                throw null;
            }
            ((TextView) toolbar3.findViewById(R.id.toolbar_title)).setTextColor(iJ2);
        }
        o1 o1Var = new o1(getWindow(), getWindow().getDecorView());
        o1Var.b(!O9());
        o1Var.a(!O9());
    }

    public final void R9() {
        ComposeView composeView = this.f52732j;
        if (composeView != null) {
            composeView.setVisibility(0);
        } else {
            p005kotlin.jvm.internal.s.m("loadingComposeView");
            throw null;
        }
    }

    @Override // i.c, b.g, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        cy2.c cVar = this.f52727e;
        cy2.d dVar = cVar != null ? cVar.f56812e : null;
        cy2.d dVar2 = cVar != null ? cVar.f56813f : null;
        if (dVar == null || dVar2 == null) {
            return;
        }
        Q9(dVar, dVar2);
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Unit unit;
        super.onCreate(bundle);
        getOnBackPressedDispatcher().b(new b(), this);
        Bundle extras = getIntent().getExtras();
        Logger logger = this.f52723a;
        if (extras != null) {
            ve2.e eVar = (ve2.e) h7.b.b(extras, ve2.e.class, "GARMIN_ENVIRONMENT");
            if (eVar == null) {
                logger.error("Garmin environment was null");
                finish();
                return;
            }
            this.f52724b = eVar;
            i iVar = (i) h7.b.a(extras, i.class, "PURCHASE_DELEGATE");
            if (iVar == null) {
                logger.error("Purchase delegate was null");
                finish();
                return;
            }
            this.f52725c = iVar;
            j jVar = (j) h7.b.a(extras, j.class, "ACTIVATION_FLOW");
            if (jVar == null) {
                logger.error("Activation flow was null");
                finish();
                return;
            }
            this.f52726d = jVar;
            g gVar = (g) h7.b.a(extras, g.class, "WEB_VIEW_CONFIG");
            if (gVar == null) {
                logger.error("Web view config was null");
                finish();
                return;
            }
            this.f52728f = gVar;
            cy2.c cVar = (cy2.c) h7.b.a(extras, cy2.c.class, "GARMIN_STORE_CONFIG");
            if (cVar != null) {
                this.f52727e = cVar;
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                xx2.b.f192586a.getClass();
                by2.d dVar = xx2.b.f192587b;
                if (dVar == null) {
                    logger.error("SubscriptionManager was not initialized");
                    finish();
                    return;
                }
                String str = dVar.f22257d;
                str.getClass();
                String str2 = dVar.f22258e;
                setContentView(R.layout.activity_web_view);
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root_web_view);
                e0 e0Var = new e0(17);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                s0.d.c(relativeLayout, e0Var);
                this.f52730h = (InAppPurchaseWebView) findViewById(R.id.purchase_web_view);
                g gVar2 = this.f52728f;
                if (gVar2 == null) {
                    p005kotlin.jvm.internal.s.m("webViewConfig");
                    throw null;
                }
                Integer num = gVar2.f56835b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    InAppPurchaseWebView inAppPurchaseWebView = this.f52730h;
                    if (inAppPurchaseWebView != null) {
                        inAppPurchaseWebView.setBackgroundColor(iIntValue);
                    }
                }
                g gVar3 = this.f52728f;
                if (gVar3 == null) {
                    p005kotlin.jvm.internal.s.m("webViewConfig");
                    throw null;
                }
                cy2.f fVar = gVar3.f56836c;
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                this.f52731i = toolbar;
                if (fVar != null) {
                    int i14 = fVar.f56829a;
                    if (toolbar == null) {
                        p005kotlin.jvm.internal.s.m("toolbar");
                        throw null;
                    }
                    ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(fVar.f56832d);
                    Integer num2 = fVar.f56831c;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        ((TextView) toolbar.findViewById(R.id.toolbar_title)).setTextColor(iIntValue2);
                        Drawable drawable = a7.b.getDrawable(toolbar.getContext(), i14);
                        drawable.getClass();
                        drawable.setTint(iIntValue2);
                    }
                    toolbar.setNavigationIcon(i14);
                    toolbar.setNavigationContentDescription(fVar.f56830b);
                    g gVar4 = this.f52728f;
                    if (gVar4 == null) {
                        p005kotlin.jvm.internal.s.m("webViewConfig");
                        throw null;
                    }
                    Integer num3 = gVar4.f56835b;
                    if (num3 != null) {
                        toolbar.setBackgroundColor(num3.intValue());
                    }
                    toolbar.setNavigationOnClickListener(new x(this, 22));
                } else {
                    if (toolbar == null) {
                        p005kotlin.jvm.internal.s.m("toolbar");
                        throw null;
                    }
                    toolbar.setVisibility(8);
                }
                cy2.c cVar2 = this.f52727e;
                cy2.d dVar2 = cVar2 != null ? cVar2.f56812e : null;
                cy2.d dVar3 = cVar2 != null ? cVar2.f56813f : null;
                if (dVar2 != null && dVar3 != null) {
                    Q9(dVar2, dVar3);
                }
                ComposeView composeView = (ComposeView) findViewById(R.id.loading_compose_view);
                this.f52732j = composeView;
                if (composeView == null) {
                    p005kotlin.jvm.internal.s.m("loadingComposeView");
                    throw null;
                }
                composeView.setContent(new z3.e(1477843456, true, new c()));
                R9();
                ge1.b.T(o53.f0.w(this), null, null, new d(str, str2, this, null), 3);
                return;
            }
        }
        logger.error("Extras was null.");
        finish();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        InAppPurchaseWebView inAppPurchaseWebView = this.f52730h;
        if (inAppPurchaseWebView != null) {
            ViewParent parent = inAppPurchaseWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(inAppPurchaseWebView);
            }
            inAppPurchaseWebView.removeAllViews();
            inAppPurchaseWebView.destroy();
        }
        xx2.d.f192590a.getClass();
        xx2.d.f192592c.set(false);
        androidx.appcompat.app.e eVar = this.f52729g;
        if (eVar != null) {
            eVar.dismiss();
        }
        this.f52729g = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        InAppPurchaseWebView inAppPurchaseWebView = this.f52730h;
        if (inAppPurchaseWebView != null) {
            inAppPurchaseWebView.onPause();
        }
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        InAppPurchaseWebView inAppPurchaseWebView = this.f52730h;
        if (inAppPurchaseWebView == null) {
            return;
        }
        ge1.b.T(o53.f0.w(this), null, null, new e(inAppPurchaseWebView, inAppPurchaseWebView, null), 3);
        inAppPurchaseWebView.onResume();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        InAppPurchaseWebView inAppPurchaseWebView = this.f52730h;
        if (inAppPurchaseWebView != null) {
            inAppPurchaseWebView.stopLoading();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/subscriptions/ui/InAppPurchaseActivity$a;", "", "<init>", "()V", "", "GARMIN_ENVIRONMENT", "Ljava/lang/String;", "PURCHASE_DELEGATE", "ACTIVATION_FLOW", "WEB_VIEW_CONFIG", "GARMIN_STORE_CONFIG", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Activity activity, ve2.e eVar, i iVar, j jVar, g gVar, cy2.c cVar) {
            activity.getClass();
            Intent intent = new Intent(activity, (Class<?>) InAppPurchaseActivity.class);
            intent.putExtra("GARMIN_ENVIRONMENT", eVar);
            intent.putExtra("PURCHASE_DELEGATE", iVar);
            intent.putExtra("ACTIVATION_FLOW", jVar);
            intent.putExtra("GARMIN_STORE_CONFIG", cVar);
            intent.putExtra("WEB_VIEW_CONFIG", gVar);
            return intent;
        }

        private a() {
        }
    }
}
