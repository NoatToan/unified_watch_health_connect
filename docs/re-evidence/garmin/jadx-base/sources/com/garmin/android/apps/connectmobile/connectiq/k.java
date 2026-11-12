package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Menu;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes7.dex */
public class k extends WebViewClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31884b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectIQAppStoreActivity f31885a;

    public k(ConnectIQAppStoreActivity connectIQAppStoreActivity) {
        this.f31885a = connectIQAppStoreActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Menu menu;
        ConnectIQAppStoreActivity connectIQAppStoreActivity = this.f31885a;
        connectIQAppStoreActivity.hideProgressOverlay();
        if (connectIQAppStoreActivity.f31753k) {
            WebView webView2 = connectIQAppStoreActivity.f31752j;
            if (webView2 != null) {
                webView2.clearHistory();
            }
            connectIQAppStoreActivity.f31753k = false;
        }
        CookieSyncManager.getInstance().sync();
        if (connectIQAppStoreActivity.isFinishing() || (menu = connectIQAppStoreActivity.f31747e) == null || menu.findItem(R.id.menu_item_forward) == null) {
            return;
        }
        if (webView.copyBackForwardList().getSize() <= 0 || webView.copyBackForwardList().getCurrentIndex() >= webView.copyBackForwardList().getSize() - 1) {
            connectIQAppStoreActivity.f31747e.findItem(R.id.menu_item_forward).setEnabled(false);
        } else {
            connectIQAppStoreActivity.f31747e.findItem(R.id.menu_item_forward).setEnabled(true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f31885a.showProgressOverlay();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        i2.i("ConnectIQAppStoreActivity", "Received SSL Error, cancelling request : " + String.valueOf(sslError.getPrimaryError()));
        i2.i("ConnectIQAppStoreActivity", sslError.getCertificate().toString());
        ConnectIQAppStoreActivity connectIQAppStoreActivity = this.f31885a;
        new androidx.appcompat.app.e.a(connectIQAppStoreActivity.f31750h).setTitle(connectIQAppStoreActivity.getResources().getString(R.string.dialog_title_error)).setMessage(connectIQAppStoreActivity.getResources().getString(R.string.connect_iq_it_error)).setPositiveButton(android.R.string.ok, new i(1)).setIcon(android.R.drawable.ic_dialog_alert).show();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean zContains = str.contains("connectagent://launch");
        ConnectIQAppStoreActivity connectIQAppStoreActivity = this.f31885a;
        if (zContains) {
            sd2.f fVar = connectIQAppStoreActivity.f31757o;
            if (fVar != null && hk0.p.k(fVar.getUnitID())) {
                connectIQAppStoreActivity.f31756n = true;
                yr1.e.g(connectIQAppStoreActivity.f31757o.getUnitID(), PlaybackStateCompat.ACTION_PREPARE_FROM_URI, connectIQAppStoreActivity.getApplicationContext(), "ConnectIQAppStoreActivity");
            }
            return true;
        }
        if (!str.startsWith("mailto:")) {
            return false;
        }
        String strTrim = str.replaceFirst("mailto:", "").trim();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.setType("plain/text").putExtra("android.intent.extra.EMAIL", new String[]{strTrim});
        connectIQAppStoreActivity.f31750h.startActivity(intent);
        return true;
    }
}
