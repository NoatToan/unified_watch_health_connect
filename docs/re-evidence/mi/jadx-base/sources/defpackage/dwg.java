package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.schema.export.PushConstants;
import com.xiaomi.fitness.webview.WebViewUtilKt;

/* JADX INFO: loaded from: classes8.dex */
public class dwg implements wfl {
    @Override // defpackage.wfl
    public boolean canHandle(Uri uri) {
        String scheme = uri.getScheme();
        return (PushConstants.getSSchemeWearable().equals(scheme) || PushConstants.getSSchemeWearableStrava().equals(scheme) || PushConstants.getSSchemeMihealth().equals(scheme)) ? false : true;
    }

    @Override // defpackage.wfl
    public void process(Context context, Uri uri, Object obj) {
        String scheme = uri.getScheme();
        if ("http".equals(scheme) || Constants.URI_SCHEME.equals(scheme)) {
            WebViewUtilKt.startWebView(uri.toString(), (String) null, true, true);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }
}
