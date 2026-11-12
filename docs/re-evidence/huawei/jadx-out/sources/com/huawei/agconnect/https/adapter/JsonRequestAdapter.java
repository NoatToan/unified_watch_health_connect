package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class JsonRequestAdapter<Request> implements Adapter<Request, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f5034a = MediaType.parse("application/json; charset=UTF-8");

    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody adapter(Request request) throws IOException {
        try {
            return RequestBody.create(f5034a, new JSONEncodeUtil().toJson(request));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
