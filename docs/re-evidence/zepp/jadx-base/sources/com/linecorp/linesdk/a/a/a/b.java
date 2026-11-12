package com.linecorp.linesdk.a.a.a;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class b implements c<JSONObject> {

    @NonNull
    private final d a = new d();

    @Override // com.linecorp.linesdk.a.a.a.c
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(@NonNull InputStream inputStream) throws IOException {
        try {
            return new JSONObject(this.a.a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
