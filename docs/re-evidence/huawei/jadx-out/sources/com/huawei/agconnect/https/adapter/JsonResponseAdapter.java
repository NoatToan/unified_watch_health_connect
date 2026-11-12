package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class JsonResponseAdapter<T> implements Adapter<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f5035a;

    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T adapter(ResponseBody responseBody) throws IOException {
        if (responseBody == null) {
            throw new IOException("responseBody is null");
        }
        try {
            return (T) JSONDecodeUtil.getObject(responseBody.string(), this.f5035a);
        } catch (IllegalAccessException e) {
            throw new IOException("IllegalAccessException:", e);
        } catch (InstantiationException e2) {
            throw new IOException("InstantiationException", e2);
        } catch (JSONException unused) {
            throw new IOException("the response is not json");
        }
    }

    public JsonResponseAdapter(Class<T> cls) {
        this.f5035a = cls;
    }
}
