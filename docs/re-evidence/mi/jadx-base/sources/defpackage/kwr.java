package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.xiaomi.yrn.view.defaultui.YRNDowngradeWebView;
import com.xiaomi.yrn.view.defaultui.YRNLoadingOrRetryView;

/* JADX INFO: loaded from: classes2.dex */
public class kwr implements h1d {
    @Override // defpackage.h1d
    public View getDowngradeView(Context context, Bundle bundle) {
        YRNDowngradeWebView yRNDowngradeWebView = new YRNDowngradeWebView(context, null);
        if (bundle == null || TextUtils.isEmpty(bundle.getString("url"))) {
            zxr.b("YRN_YRNV3_SDK", "YRNContainerDefaultImpl.getDowngradeView: url is Empty! please check!");
        } else {
            yRNDowngradeWebView.loadUrl(bundle.getString("url"));
        }
        return yRNDowngradeWebView;
    }

    @Override // defpackage.h1d
    public o1d getLoadingOrRetryViewProvider(Context context, Bundle bundle) {
        return new YRNLoadingOrRetryView(context);
    }

    @Override // defpackage.h1d
    public v1d getReactRootViewProvider(Context context, Bundle bundle) {
        return null;
    }
}
