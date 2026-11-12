package com.garmin.android.apps.connectmobile.settings.lte;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.z1;
import d53.u;
import d53.w;
import e23.l;
import fw.p;
import ng1.c1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import qh1.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43491d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f43492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0806c f43494c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43495a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43495a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.lte.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/lte/c$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0806c extends s {
        public C0806c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            boolean z14 = this.f13818b;
            c cVar = c.this;
            if (!z14) {
                f(false);
                cVar.requireActivity().onBackPressed();
                return;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(cVar.requireContext());
            aVar.setTitle(cVar.getString(R.string.lte_set_up_dialog_title));
            aVar.setMessage(cVar.getString(R.string.lte_set_up_dialog_descr));
            aVar.setCancelable(false);
            aVar.setPositiveButton(cVar.getString(R.string.activity_details_apnea_lap_map_popup_exit_location), new c1(cVar, 19));
            aVar.setNegativeButton(cVar.getString(R.string.lbl_cancel), new j(2));
            aVar.create().show();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/lte/c$d", "Landroid/webkit/WebViewClient;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends WebViewClient {
        public d() {
        }

        public static boolean a(String str, String str2) {
            return w.z(str, str2, false);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            Uri uriNormalizeScheme;
            String host;
            String string;
            String path;
            String path2;
            String path3;
            String strJ = am.j.j(webResourceRequest != null ? webResourceRequest.getUrl() : null, "shouldOverrideUrlLoading, ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LTESubscriptionWebViewFragment", strJ);
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (uriNormalizeScheme = url.normalizeScheme()) != null) {
                String string2 = uriNormalizeScheme.toString();
                string2.getClass();
                boolean zG = p005kotlin.jvm.internal.s.g(uriNormalizeScheme.getScheme(), "bepgenapp");
                c cVar = c.this;
                if (zG || p005kotlin.jvm.internal.s.g(uriNormalizeScheme.getScheme(), "bepgenapp11")) {
                    cVar.getClass();
                    try {
                        cVar.startActivity(new Intent("android.intent.action.VIEW", uriNormalizeScheme));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var2, "LTESubscriptionWebViewFragment", "Payconiq app not installed; use market:// url to open the appropriate store");
                        try {
                            cVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=mobi.inthepocket.bcmc.bancontact")));
                        } catch (ActivityNotFoundException unused2) {
                            String str = "Failed to open the app mobi.inthepocket.bcmc.bancontact via url " + uriNormalizeScheme + " or in the Play Store via the market:// url";
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.p(a2Var3, "LTESubscriptionWebViewFragment", str);
                            try {
                                cVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=mobi.inthepocket.bcmc.bancontact")));
                            } catch (ActivityNotFoundException e4) {
                                i2.a aVar4 = i2.f36769a;
                                a2 a2Var4 = a2.GENERAL;
                                aVar4.getClass();
                                i2.a.b(a2Var4, "LTESubscriptionWebViewFragment", "Tried to open the Google Play store externally and the user had no browser apps installed");
                                i2.a.g(a2Var4, "LTESubscriptionWebViewFragment", e4);
                            }
                        }
                        return true;
                    }
                }
                String host2 = uriNormalizeScheme.getHost();
                boolean z14 = (host2 != null && a(host2, "support.garmin.com")) || ((host = uriNormalizeScheme.getHost()) != null && a(host, "discover.garmin.com"));
                String host3 = uriNormalizeScheme.getHost();
                boolean z15 = host3 != null && a(host3, "garmin.com") && (((path = uriNormalizeScheme.getPath()) != null && a(path, "privacy")) || (((path2 = uriNormalizeScheme.getPath()) != null && a(path2, "legal")) || ((path3 = uriNormalizeScheme.getPath()) != null && a(path3, "account"))));
                String string3 = uriNormalizeScheme.toString();
                boolean z16 = (string3 != null && u.y(string3, "mailto:", false)) || ((string = uriNormalizeScheme.toString()) != null && u.y(string, "tel:", false));
                boolean zEquals = String.valueOf(uriNormalizeScheme).equals("http://ec.europa.eu/consumers/odr/");
                if (z14 || z15 || z16 || zEquals) {
                    g22.e.i(cVar, uriNormalizeScheme);
                    return true;
                }
                a aVar5 = c.f43491d;
                if (cVar.u6().f144860b.getString(R.string.lte_activation_ended_callback).equals(string2)) {
                    i2.a.b(a2Var, "LTESubscriptionWebViewFragment", "shouldOverrideUrlLoading - successful call back ".concat(string2));
                    qi1.f fVarU6 = cVar.u6();
                    ge1.b.T(v1.a(fVarU6), null, null, new qi1.j(fVarU6, null), 3);
                    return true;
                }
                if (cVar.u6().f144860b.getString(R.string.lte_activation_error_callback).equals(string2)) {
                    i2.a.f(a2Var, "LTESubscriptionWebViewFragment", "shouldOverrideUrlLoading - error call back came from the webview ".concat(string2));
                    cVar.u6().f144861c.m("LTESubscriptionStatusFragment");
                    return true;
                }
                if (cVar.u6().f144860b.getString(R.string.lte_activation_exit_flow_callback).equals(string2)) {
                    i2.a.f(a2Var, "LTESubscriptionWebViewFragment", "shouldOverrideUrlLoading - Exit call back came from the webview ".concat(string2));
                    cVar.u6().f144861c.m("LTESubscriptionStatusFragment");
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43498a;

        public e(l lVar) {
            lVar.getClass();
            this.f43498a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f43498a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43498a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43499a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43499a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43499a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43500a = aVar;
            this.f43501b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43500a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43501b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f43502a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43502a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.gcm3_web_view_activity_layout);
        this.f43493b = new w1(s0.f105811a.b(qi1.f.class), new f(this), new h(this), new g(null, this));
        this.f43494c = new C0806c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(getString(R.string.lte_set_up_title), 3);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f43494c, viewLifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.web_view);
        viewFindViewById.getClass();
        WebView webView = (WebView) viewFindViewById;
        this.f43492a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView2 = this.f43492a;
        if (webView2 == null) {
            p005kotlin.jvm.internal.s.m("webView");
            throw null;
        }
        webView2.getSettings().setBuiltInZoomControls(true);
        WebView webView3 = this.f43492a;
        if (webView3 == null) {
            p005kotlin.jvm.internal.s.m("webView");
            throw null;
        }
        webView3.getSettings().setDisplayZoomControls(false);
        WebView webView4 = this.f43492a;
        if (webView4 == null) {
            p005kotlin.jvm.internal.s.m("webView");
            throw null;
        }
        webView4.getSettings().setCacheMode(2);
        int color = a7.b.getColor(requireContext(), R.color.gcm_background_hero);
        WebView webView5 = this.f43492a;
        if (webView5 == null) {
            p005kotlin.jvm.internal.s.m("webView");
            throw null;
        }
        webView5.setBackgroundColor(color);
        u6().f144864f.f(getViewLifecycleOwner(), new e(new qd0.a(this, 18)));
        WebView webView6 = this.f43492a;
        if (webView6 != null) {
            webView6.setWebViewClient(new d());
        } else {
            p005kotlin.jvm.internal.s.m("webView");
            throw null;
        }
    }

    public final qi1.f u6() {
        return (qi1.f) this.f43493b.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PAYCONIQ_PACKAGE_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
