package com.huami.http;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/http/GsonConverter;", "Lcom/huami/http/ResponseBodyConverter;", ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/ResponseBody;", AbstractJSONTokenResponse.RESPONSE, "Ljava/lang/reflect/Type;", "type", "convert", "(Lokhttp3/ResponseBody;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lcom/google/gson/Gson;", "a", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/google/gson/Gson;)V", "Companion", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class GsonConverter implements ResponseBodyConverter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/http/GsonConverter$Companion;", "", "Lcom/google/gson/Gson;", "gson", "Lcom/huami/http/GsonConverter;", "create", "<init>", "()V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ GsonConverter create$default(Companion companion, Gson gson, int i, Object obj) {
            if ((i & 1) != 0) {
                gson = new Gson();
            }
            return companion.create(gson);
        }

        @JvmStatic
        @NotNull
        public final GsonConverter create(@NotNull Gson gson) {
            return new GsonConverter(gson);
        }
    }

    public GsonConverter(@NotNull Gson gson) {
        this.gson = gson;
    }

    @JvmStatic
    @NotNull
    public static final GsonConverter create(@NotNull Gson gson) {
        return INSTANCE.create(gson);
    }

    @Override // com.huami.http.ResponseBodyConverter
    public <T> T convert(@NotNull ResponseBody response, @NotNull Type type) {
        TypeAdapter<T> adapter = this.gson.getAdapter(TypeToken.get(type));
        JsonReader jsonReaderNewJsonReader = this.gson.newJsonReader(response.charStream());
        try {
            T t = adapter.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            CloseableKt.closeFinally(response, null);
            return t;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(response, th);
                throw th2;
            }
        }
    }
}
