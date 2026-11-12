package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class LogResponse {
    private static final String LOG_TAG = "LogResponseInternal";

    public static LogResponse create(long j8) {
        return new AutoValue_LogResponse(j8);
    }

    public static LogResponse fromJson(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        LogResponse logResponseCreate = create(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return logResponseCreate;
                    }
                    LogResponse logResponseCreate2 = create(jsonReader.nextLong());
                    jsonReader.close();
                    return logResponseCreate2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th3) {
            jsonReader.close();
            throw th3;
        }
    }

    public abstract long getNextRequestWaitMillis();
}
