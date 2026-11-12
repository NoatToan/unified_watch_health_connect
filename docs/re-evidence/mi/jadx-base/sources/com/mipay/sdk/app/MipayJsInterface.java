package com.mipay.sdk.app;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.mipay.sdk.MipayWebImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class MipayJsInterface {
    private static final String[] DOMAIN_LIST = {MipayWebImpl.URL_STAGING, MipayWebImpl.URL_ONLINE};
    public static final String MIPAY_WEB_INTERFACE = "Mipay";
    private static final String TAG = "MipayJsInterFace";
    private WeakReference<MipayWebActivity> mActivityRef;

    public MipayJsInterface(MipayWebActivity mipayWebActivity) {
        this.mActivityRef = new WeakReference<>(mipayWebActivity);
    }

    private boolean isValid() {
        Uri uri;
        if (this.mActivityRef.get() != null && (uri = parseUri(this.mActivityRef.get().getUrl())) != null) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (String str : DOMAIN_LIST) {
                Uri uri2 = Uri.parse(str);
                if (TextUtils.equals(uri2.getScheme(), scheme) && TextUtils.equals(uri2.getHost(), host)) {
                    return true;
                }
            }
        }
        return false;
    }

    private Uri parseUri(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @JavascriptInterface
    public void finish() {
        if (this.mActivityRef.get() == null || !isValid()) {
            return;
        }
        this.mActivityRef.get().finish();
    }

    @JavascriptInterface
    public void notify(String str) {
        if (this.mActivityRef.get() == null || !isValid()) {
            return;
        }
        this.mActivityRef.get().setResult(str);
        this.mActivityRef.get().finish();
    }

    @JavascriptInterface
    public void setResult(String str) {
        if (this.mActivityRef.get() == null || !isValid()) {
            return;
        }
        this.mActivityRef.get().setResult(str);
        StringBuilder sb = new StringBuilder();
        sb.append("interface set result is empty: ");
        sb.append(TextUtils.isEmpty(str));
    }
}
