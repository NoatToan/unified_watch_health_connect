package vz2;

import android.R;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.room.a0;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.messaging.Constants;
import com.myfitnesspal.android.sdk.MfpAuthError;

/* JADX INFO: loaded from: classes3.dex */
public class f extends Dialog {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FrameLayout.LayoutParams f180935h = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f180938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressDialog f180939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f180940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f180941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f180942g;

    public f(Context context, String str, b bVar, Bundle bundle, d dVar) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        bundle.putAll(bVar.a());
        this.f180936a = a0.j("https://www.myfitnesspal.com/oauth2/", str, CallerData.NA, wz2.b.b(bundle));
        this.f180937b = bVar.f180931c;
        this.f180938c = dVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        this.f180938c.b(null);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f180939d = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f180939d.setMessage("Loading...");
        requestWindowFeature(1);
        this.f180942g = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        this.f180940e = imageView;
        imageView.setOnClickListener(new e(this));
        this.f180940e.setImageDrawable(getContext().getResources().getDrawable(com.garmin.android.apps.connectmobile.R.animator.design_appbar_state_list_animator));
        this.f180940e.setVisibility(4);
        int intrinsicWidth = this.f180940e.getDrawable().getIntrinsicWidth() / 2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        WebView webView = new WebView(getContext());
        this.f180941f = webView;
        webView.setVerticalScrollBarEnabled(false);
        this.f180941f.setHorizontalScrollBarEnabled(false);
        this.f180941f.setWebViewClient(new a(this, null));
        this.f180941f.getSettings().setJavaScriptEnabled(true);
        this.f180941f.loadUrl(this.f180936a);
        this.f180941f.setLayoutParams(f180935h);
        this.f180941f.setVisibility(4);
        this.f180941f.getSettings().setSavePassword(false);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.f180941f);
        this.f180942g.addView(linearLayout);
        this.f180942g.addView(this.f180940e, new ViewGroup.LayoutParams(-2, -2));
        addContentView(this.f180942g, new ViewGroup.LayoutParams(-1, -1));
    }

    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            f fVar = f.this;
            fVar.f180939d.dismiss();
            fVar.f180942g.setBackgroundColor(0);
            fVar.f180941f.setVisibility(0);
            fVar.f180940e.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            wz2.a.a(fb1.c.n("Webview loading URL: ", str), new Object[0]);
            super.onPageStarted(webView, str, bitmap);
            f.this.f180939d.show();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i14, String str, String str2) {
            super.onReceivedError(webView, i14, str, str2);
            f fVar = f.this;
            fVar.f180938c.d(new g(str, i14, str2));
            fVar.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Bundle bundle;
            wz2.a.a(fb1.c.n("Redirect URL: ", str), new Object[0]);
            f fVar = f.this;
            String str2 = fVar.f180937b;
            d dVar = fVar.f180938c;
            if (!str.startsWith(str2)) {
                if (str.startsWith("https://www.myfitnesspal.com/oauth2")) {
                    return false;
                }
                fVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            Uri uri = Uri.parse(str.replaceFirst(".*:\\/\\/", "http://"));
            if (uri != null) {
                bundle = wz2.b.a(uri.getQuery());
                bundle.putAll(wz2.b.a(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            String string = bundle.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (string == null) {
                dVar.a(bundle);
            } else if (string.equals("access_denied") || string.equals("OAuthAccessDeniedException")) {
                dVar.b(bundle);
            } else {
                dVar.c(new MfpAuthError(string));
            }
            fVar.dismiss();
            return true;
        }

        public /* synthetic */ a(f fVar, e eVar) {
            this();
        }
    }
}
