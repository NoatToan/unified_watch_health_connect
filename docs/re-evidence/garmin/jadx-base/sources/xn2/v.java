package xn2;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxn2/v;", "Lxn2/a;", "Lxn2/k0;", "Lnn2/a$b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends xn2.a<k0> implements nn2.a.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f191738e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nn2.a f191739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xj1.b f191740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeRefreshLayout f191741d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xn2/v$b", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.core.view.s {
        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            menu.findItem(R.id.menu_item_edit).setVisible(false);
            menu.findItem(R.id.menu_item_save).setVisible(false);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xn2/v$c", "Landroid/webkit/WebViewClient;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            webView.getClass();
            str.getClass();
            v.this.b().t(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            SwipeRefreshLayout swipeRefreshLayout = v.this.f191741d;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            } else {
                p005kotlin.jvm.internal.s.m("refreshLayout");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g22.e.j(this, new b());
        return layoutInflater.inflate(R.layout.fragment_felica_user_verification, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        nn2.a aVar = this.f191739b;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("connectivityReceiver");
            throw null;
        }
        aVar.f126705a = this;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        nn2.a aVar2 = this.f191739b;
        if (aVar2 != null) {
            mVarRequireActivity.registerReceiver(aVar2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } else {
            p005kotlin.jvm.internal.s.m("connectivityReceiver");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        nn2.a aVar = this.f191739b;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("connectivityReceiver");
            throw null;
        }
        aVar.f126705a = null;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        nn2.a aVar2 = this.f191739b;
        if (aVar2 != null) {
            mVarRequireActivity.unregisterReceiver(aVar2);
        } else {
            p005kotlin.jvm.internal.s.m("connectivityReceiver");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        this.f191739b = new nn2.a();
        String string = requireArguments().getString("extra.url");
        string.getClass();
        WebView webView = (WebView) view2.findViewById(R.id.web_view);
        webView.setBackgroundColor(a7.b.getColor(requireContext(), android.R.color.transparent));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new c());
        View viewFindViewById = view2.findViewById(R.id.refresh_layout);
        xj1.b bVar = new xj1.b(1, webView, string);
        this.f191740c = bVar;
        ((SwipeRefreshLayout) viewFindViewById).setOnRefreshListener(bVar);
        viewFindViewById.getClass();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f191741d = swipeRefreshLayout;
        swipeRefreshLayout.setRefreshing(true);
        xj1.b bVar2 = this.f191740c;
        if (bVar2 != null) {
            bVar2.M7();
        } else {
            p005kotlin.jvm.internal.s.m("refreshListener");
            throw null;
        }
    }

    @Override // br2.h
    public final void v6() {
        hn2.c cVarU6 = u6();
        String string = getString(R.string.settings_sign_in);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.UP);
        u6().invalidateOptionsMenu();
    }

    @Override // nn2.a.b
    public final void z8(boolean z14) {
        if (z14) {
            SwipeRefreshLayout swipeRefreshLayout = this.f191741d;
            if (swipeRefreshLayout == null) {
                p005kotlin.jvm.internal.s.m("refreshLayout");
                throw null;
            }
            swipeRefreshLayout.setRefreshing(true);
            xj1.b bVar = this.f191740c;
            if (bVar != null) {
                bVar.M7();
            } else {
                p005kotlin.jvm.internal.s.m("refreshListener");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxn2/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_URL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
