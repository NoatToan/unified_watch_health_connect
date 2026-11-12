package com.garmin.android.apps.connectmobile.incidentdetection.model;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import ds.e0;
import gt2.b;
import gt2.c;
import jq0.f;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/BaseStringTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "Ljq0/f;", "<init>", "()V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseStringTypeAdapter<T> extends TypeAdapter<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f36860a;

    static {
        new a(null);
    }

    public BaseStringTypeAdapter() {
        String strConcat = "ID# - ".concat("BaseStringTypeAdapter");
        int i14 = c.f79010a;
        this.f36860a = b.f79005a.h(strConcat);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final T read2(JsonReader jsonReader) {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            String strNextString = jsonReader.nextString();
            strNextString.getClass();
            return b(strNextString);
        } catch (Exception e4) {
            e0.v("Error reading next string from JsonReader: ", e4.getMessage(), this.f36860a);
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, T t7) {
        jsonWriter.getClass();
        if (t7 == null || jsonWriter.value(a(t7)) == null) {
            jsonWriter.nullValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/BaseStringTypeAdapter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
