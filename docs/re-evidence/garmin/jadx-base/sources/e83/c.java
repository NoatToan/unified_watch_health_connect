package e83;

import c83.h;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class c<T> implements h<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f63470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f63471b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f63470a = gson;
        this.f63471b = typeAdapter;
    }

    @Override // c83.h
    public final Object convert(ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        JsonReader jsonReaderNewJsonReader = this.f63470a.newJsonReader(responseBody2.charStream());
        try {
            T t7 = this.f63471b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody2.close();
            return t7;
        } catch (Throwable th3) {
            responseBody2.close();
            throw th3;
        }
    }
}
