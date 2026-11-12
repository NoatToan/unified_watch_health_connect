package e83;

import c83.h;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import w63.e;

/* JADX INFO: loaded from: classes11.dex */
public final class b<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MediaType f63466d = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f63467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f63468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63469c;

    public b(Gson gson, TypeAdapter<T> typeAdapter, boolean z14) {
        this.f63467a = gson;
        this.f63468b = typeAdapter;
        this.f63469c = z14;
    }

    @Override // c83.h
    public final RequestBody convert(Object obj) throws IOException {
        boolean z14 = this.f63469c;
        TypeAdapter<T> typeAdapter = this.f63468b;
        Gson gson = this.f63467a;
        if (z14) {
            return new d(gson, typeAdapter, obj);
        }
        e eVar = new e();
        JsonWriter jsonWriterNewJsonWriter = gson.newJsonWriter(new OutputStreamWriter(eVar.t4(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(f63466d, eVar.h0(eVar.f183349b));
    }
}
