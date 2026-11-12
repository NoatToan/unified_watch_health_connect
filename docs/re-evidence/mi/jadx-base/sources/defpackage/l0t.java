package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.la;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l0t extends la {
    @Override // com.amap.api.col.p0003sl.la
    public String getIPV6URL() {
        if (TextUtils.isEmpty(getURL())) {
            return getURL();
        }
        String url = getURL();
        Uri uri = Uri.parse(url);
        if (uri.getAuthority().startsWith("dualstack-")) {
            return url;
        }
        if (uri.getAuthority().startsWith("restsdk.amap.com")) {
            return uri.buildUpon().authority("dualstack-arestapi.amap.com").build().toString();
        }
        return uri.buildUpon().authority("dualstack-" + uri.getAuthority()).build().toString();
    }

    @Override // com.amap.api.col.p0003sl.la
    public boolean isSupportIPV6() {
        return true;
    }
}
