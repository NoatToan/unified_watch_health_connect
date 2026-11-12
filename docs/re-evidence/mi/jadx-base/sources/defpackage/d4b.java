package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.xiaomi.passport.utils.HttpHeaders;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public final class d4b<T> implements dk4<T, RequestBody> {
    public static final MediaType c = MediaType.get(HttpHeaders.CONTENT_TYPE_JSON);
    public static final Charset d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f15068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f15069b;

    public d4b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f15068a = gson;
        this.f15069b = typeAdapter;
    }

    @Override // defpackage.dk4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.f15068a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), d));
        this.f15069b.write(jsonWriterNewJsonWriter, t);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(c, buffer.readByteString());
    }
}
