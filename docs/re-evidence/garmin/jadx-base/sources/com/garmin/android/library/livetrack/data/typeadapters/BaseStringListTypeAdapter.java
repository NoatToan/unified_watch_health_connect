package com.garmin.android.library.livetrack.data.typeadapters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringListTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "", "Lce2/a;", "<init>", "()V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseStringListTypeAdapter<T> extends TypeAdapter<List<? extends T>> implements ce2.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f50205a = i2.a("BaseStringListTypeAdapter");

    static {
        new a(null);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                String strNextString = jsonReader.nextString();
                strNextString.getClass();
                Object objB = ((LtEventTypeListAdapter) this).b(strNextString);
                if (objB != null) {
                    arrayList.add(objB);
                }
            }
            jsonReader.endArray();
            return arrayList;
        } catch (Exception e4) {
            e0.v("Error reading list from JsonReader: ", e4.getMessage(), this.f50205a);
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        List list = (List) obj;
        jsonWriter.getClass();
        if (list != null) {
            jsonWriter.beginArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jsonWriter.value(((LtEventTypeListAdapter) this).a(it.next()));
            }
            if (jsonWriter.endArray() != null) {
                return;
            }
        }
        jsonWriter.nullValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringListTypeAdapter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
