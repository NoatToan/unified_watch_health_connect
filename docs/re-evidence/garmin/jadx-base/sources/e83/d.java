package e83;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import w63.f;

/* JADX INFO: loaded from: classes11.dex */
public final class d<T> extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f63472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f63473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f63474c;

    public d(Gson gson, TypeAdapter<T> typeAdapter, T t7) {
        this.f63472a = gson;
        this.f63473b = typeAdapter;
        this.f63474c = t7;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getContentType() {
        return b.f63466d;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(f fVar) throws IOException {
        MediaType mediaType = b.f63466d;
        JsonWriter jsonWriterNewJsonWriter = this.f63472a.newJsonWriter(new OutputStreamWriter(fVar.t4(), StandardCharsets.UTF_8));
        this.f63473b.write(jsonWriterNewJsonWriter, this.f63474c);
        jsonWriterNewJsonWriter.close();
    }
}
