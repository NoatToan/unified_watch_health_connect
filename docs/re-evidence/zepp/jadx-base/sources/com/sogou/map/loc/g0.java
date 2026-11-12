package com.sogou.map.loc;

import android.util.Log;
import com.loopj.android.http.AsyncHttpClient;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.util.EntityUtils;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
final class g0 implements o0 {
    private Integer a = null;
    private final /* synthetic */ HttpResponse b;

    public g0(n0 n0Var, HttpResponse httpResponse) {
        this.b = httpResponse;
    }

    @Override // com.sogou.map.loc.o0
    public final int a() {
        if (this.a == null) {
            HttpResponse httpResponse = this.b;
            this.a = Integer.valueOf((httpResponse == null || httpResponse.getStatusLine() == null) ? -1 : this.b.getStatusLine().getStatusCode());
        }
        return this.a.intValue();
    }

    @Override // com.sogou.map.loc.o0
    public final String b() {
        String str;
        if (a() != 200) {
            return null;
        }
        try {
            HttpEntity entity = this.b.getEntity();
            if (entity != null) {
                Header contentType = entity.getContentType();
                String value = contentType != null ? contentType.getValue() : null;
                if (value != null) {
                    str = null;
                    for (String str2 : value.split(";")) {
                        String[] strArrSplit = str2.split(SearchCriteria.EQ);
                        if (strArrSplit.length == 2 && strArrSplit[0].indexOf("charset") >= 0 && !j0.o(strArrSplit[1])) {
                            str = strArrSplit[1];
                        }
                    }
                } else {
                    str = null;
                }
                InputStream content = entity.getContent();
                if (entity.getContentEncoding() != null && entity.getContentEncoding().getValue() != null && entity.getContentEncoding().getValue().contains(AsyncHttpClient.ENCODING_GZIP)) {
                    content = new GZIPInputStream(content);
                }
                if (content != null) {
                    InputStreamEntity inputStreamEntity = new InputStreamEntity(content, -1L);
                    return str != null ? EntityUtils.toString(inputStreamEntity, str) : EntityUtils.toString(inputStreamEntity);
                }
            }
        } catch (Exception e) {
            Log.e("locate", "error: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
