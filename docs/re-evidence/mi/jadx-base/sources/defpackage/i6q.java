package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.nfc.pay.WebActivity;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class i6q extends h6q {
    @Override // defpackage.h6q
    public void b(Activity activity, String str, Bundle bundle) {
        if (activity == null) {
            throw new IllegalArgumentException("activity should not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("order cannot be empty");
        }
        activity.startActivityForResult(c(activity, str), 810);
    }

    public final Intent c(Context context, String str) {
        return f(context, str);
    }

    public final String d(String str) {
        TreeMap<String, String> treeMapE = e(str);
        if (treeMapE.isEmpty()) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        if (yhq.c.b()) {
            builder.authority("staging.api.ucashier.mipay.com");
            builder.scheme("http");
        } else {
            builder.authority("api.ucashier.mipay.com");
            builder.scheme(Constants.URI_SCHEME);
        }
        builder.appendEncodedPath("wap/v2/trade/create");
        for (String str2 : treeMapE.keySet()) {
            builder.appendQueryParameter(str2, treeMapE.get(str2));
        }
        return builder.toString();
    }

    public final TreeMap<String, String> e(String str) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                treeMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return treeMap;
    }

    public final Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        intent.putExtra(pf4.f30343b, d(str));
        intent.setPackage(context.getPackageName());
        return intent;
    }
}
