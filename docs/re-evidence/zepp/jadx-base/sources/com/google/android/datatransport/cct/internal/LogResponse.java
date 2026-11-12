package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class LogResponse {
    private static final String a = "LogResponseInternal";

    public static LogResponse a(long j) {
        return new f(j);
    }

    @NonNull
    public static LogResponse fromJson(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        LogResponse logResponseA = a(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return logResponseA;
                    }
                    LogResponse logResponseA2 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return logResponseA2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long getNextRequestWaitMillis();
}
