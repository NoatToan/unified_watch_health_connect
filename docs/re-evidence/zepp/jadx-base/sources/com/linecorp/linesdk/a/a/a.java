package com.linecorp.linesdk.a.a;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
abstract class a<T> implements com.linecorp.linesdk.a.a.a.c<T> {

    @NonNull
    private final com.linecorp.linesdk.a.a.a.b a;

    public a() {
        this(new com.linecorp.linesdk.a.a.a.b());
    }

    @Override // com.linecorp.linesdk.a.a.a.c
    @NonNull
    public final T a(@NonNull InputStream inputStream) throws IOException {
        try {
            return b(this.a.a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    @NonNull
    public abstract T b(@NonNull JSONObject jSONObject);

    @VisibleForTesting
    private a(@NonNull com.linecorp.linesdk.a.a.a.b bVar) {
        this.a = bVar;
    }
}
