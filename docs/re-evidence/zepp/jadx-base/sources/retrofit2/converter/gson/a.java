package retrofit2.converter.gson;

import com.amazon.alexa.avs.http.ContentTypes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes23.dex */
final class a<T> implements Converter<T, RequestBody> {
    private static final MediaType c = MediaType.parse(ContentTypes.JSON_UTF8);
    private static final Charset d = Charset.forName("UTF-8");
    private final Gson a;
    private final TypeAdapter<T> b;

    public a(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), d));
        this.b.write(jsonWriterNewJsonWriter, t);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(c, buffer.readByteString());
    }
}
