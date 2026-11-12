package com.garmin.androiddynamicsettings.app.util;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import d53.w;
import j20.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/util/GSONDeserializer;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GSONDeserializer extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50700b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GSONDeserializer$Companion$TYPE_ADAPTER_FACTORY$1 f50701c = new TypeAdapterFactory() { // from class: com.garmin.androiddynamicsettings.app.util.GSONDeserializer$Companion$TYPE_ADAPTER_FACTORY$1
        @Override // com.google.gson.TypeAdapterFactory
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            typeToken.getClass();
            if (Map.class.isAssignableFrom(typeToken.getRawType())) {
                return new GSONDeserializer();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeAdapter<Object> f50702a;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50703a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f50703a = iArr;
        }
    }

    public GSONDeserializer() {
        TypeAdapter<Object> adapter = new Gson().getAdapter(Object.class);
        adapter.getClass();
        this.f50702a = adapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Object read2(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = null;
        if (jsonReader != null) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            switch (jsonTokenPeek == null ? -1 : b.f50703a[jsonTokenPeek.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(read2(jsonReader));
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    HashMap map = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        strNextName.getClass();
                        map.put(strNextName, read2(jsonReader));
                    }
                    jsonReader.endObject();
                    return map;
                case 3:
                    return jsonReader.nextString();
                case 4:
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    return w.G('.', 0, 6, strNextString) != -1 ? Double.valueOf(Double.parseDouble(strNextString)) : Long.valueOf(Long.parseLong(strNextString));
                case 5:
                    return Boolean.valueOf(jsonReader.nextBoolean());
                case 6:
                    jsonReader.nextNull();
                    return null;
                default:
                    x.h();
                    return null;
            }
        }
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        this.f50702a.write(jsonWriter, obj);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/util/GSONDeserializer$a;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
