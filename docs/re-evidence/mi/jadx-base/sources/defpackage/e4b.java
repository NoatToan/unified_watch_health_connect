package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class e4b<T> implements dk4<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f16247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f16248b;

    public e4b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f16247a = gson;
        this.f16248b = typeAdapter;
    }

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.f16247a.newJsonReader(responseBody.charStream());
        try {
            T t = this.f16248b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return t;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
