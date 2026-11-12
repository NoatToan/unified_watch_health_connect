package com.garmin.android.apps.connectmobile.util;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import c22.j0;
import com.garmin.android.apps.connectmobile.util.gson.GCMEnumTypeAdapterFactory;
import com.garmin.android.apps.connectmobile.util.gson.a;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import fb1.c;
import g22.k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil;", "", "<init>", "()V", "UtcDateTimeTypeAdapter", "LocalDateTimeTypeAdapter", "IsoDateTimeTypeAdapter", "BundleTypeAdapterFactory", "DateTimeTypeAdapterWithMilliSeconds", "StringTrimJsonDeserializer", "BundleTypeAdapter", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GsonUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GsonUtil f47252a = new GsonUtil();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gson f47253b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil$BundleTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Landroid/os/Bundle;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class BundleTypeAdapter extends TypeAdapter<Bundle> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47254a;

            static {
                int[] iArr = new int[JsonToken.values().length];
                try {
                    iArr[JsonToken.NULL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[JsonToken.NAME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[JsonToken.END_OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[JsonToken.BOOLEAN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[JsonToken.NUMBER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[JsonToken.STRING.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f47254a = iArr;
            }
        }

        public static ArrayList c(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i14 = jsonTokenPeek == null ? -1 : a.f47254a[jsonTokenPeek.ordinal()];
                if (i14 == 3) {
                    arrayList.add(new Pair(jsonReader.nextName(), d(jsonReader)));
                } else if (i14 != 4) {
                    h.C(c.n("expecting object: ", jsonReader.getPath()));
                    return null;
                }
            }
            jsonReader.endObject();
            return arrayList;
        }

        public static Object d(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i14 = jsonTokenPeek == null ? -1 : a.f47254a[jsonTokenPeek.ordinal()];
            if (i14 == 1) {
                jsonReader.nextNull();
                return null;
            }
            if (i14 == 2) {
                return c(jsonReader);
            }
            if (i14 == 5) {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList.add(d(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            }
            if (i14 == 6) {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
            if (i14 != 7) {
                if (i14 == 8) {
                    return jsonReader.nextString();
                }
                h.C(c.n("expecting value: ", jsonReader.getPath()));
                return null;
            }
            double dNextDouble = jsonReader.nextDouble();
            if (dNextDouble - Math.ceil(dNextDouble) != 0.0d) {
                return Double.valueOf(dNextDouble);
            }
            long j8 = (long) dNextDouble;
            return (j8 < -2147483648L || j8 > 2147483647L) ? Long.valueOf(j8) : Integer.valueOf((int) j8);
        }

        public static Bundle e(List list) throws IOException {
            Bundle bundle = new Bundle();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.first;
                Object obj = pair.second;
                if (obj != null) {
                    if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str, (Parcelable) obj);
                    } else {
                        if (!(obj instanceof List)) {
                            h.t("Unparcelable value for key [", str, "]: ", obj);
                            return null;
                        }
                        bundle.putParcelable(str, e((List) obj));
                    }
                }
            }
            return bundle;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final Bundle read2(JsonReader jsonReader) throws IOException {
            jsonReader.getClass();
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i14 = jsonTokenPeek == null ? -1 : a.f47254a[jsonTokenPeek.ordinal()];
            if (i14 == 1) {
                jsonReader.nextNull();
                return null;
            }
            if (i14 == 2) {
                return e(c(jsonReader));
            }
            h.C(c.n("expecting object: ", jsonReader.getPath()));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Bundle bundle) {
            Bundle bundle2 = bundle;
            jsonWriter.getClass();
            if (bundle2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            for (String str : bundle2.keySet()) {
                jsonWriter.name(str);
                Object obj = bundle2.get(str);
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    GsonUtil.f47253b.toJson(obj, obj.getClass(), jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil$BundleTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BundleTypeAdapterFactory implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            gson.getClass();
            typeToken.getClass();
            if (Bundle.class.isAssignableFrom(typeToken.getRawType())) {
                return new BundleTypeAdapter();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil$DateTimeTypeAdapterWithMilliSeconds;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DateTimeTypeAdapterWithMilliSeconds implements JsonDeserializer<DateTime>, JsonSerializer<DateTime> {
        @Override // com.google.gson.JsonDeserializer
        public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            String asString = jsonElement.getAsString();
            asString.getClass();
            if (asString.length() == 0) {
                return null;
            }
            return new DateTime(jsonElement.getAsLong());
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
            String strValueOf;
            DateTime dateTime2 = dateTime;
            type.getClass();
            jsonSerializationContext.getClass();
            if (dateTime2 == null || (strValueOf = String.valueOf(dateTime2.getMillis())) == null) {
                strValueOf = "";
            }
            return new JsonPrimitive(strValueOf);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil$IsoDateTimeTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IsoDateTimeTypeAdapter implements JsonDeserializer<DateTime>, JsonSerializer<DateTime> {
        @Override // com.google.gson.JsonDeserializer
        public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            String asString = jsonElement.getAsString();
            asString.getClass();
            if (asString.length() == 0) {
                return null;
            }
            return ISODateTimeFormat.dateTimeParser().parseDateTime(jsonElement.getAsString());
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
            DateTime dateTime2 = dateTime;
            type.getClass();
            jsonSerializationContext.getClass();
            return new JsonPrimitive(dateTime2 == null ? "" : ISODateTimeFormat.dateTime().print(dateTime2));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil$LocalDateTimeTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LocalDateTimeTypeAdapter implements JsonDeserializer<DateTime>, JsonSerializer<DateTime> {
        @Override // com.google.gson.JsonDeserializer
        public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            String asString = jsonElement.getAsString();
            asString.getClass();
            if (asString.length() == 0) {
                return null;
            }
            return k.p(asString, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
            DateTime dateTime2 = dateTime;
            type.getClass();
            jsonSerializationContext.getClass();
            return new JsonPrimitive(dateTime2 == null ? "" : j0.f23102d.print(dateTime2));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil$StringTrimJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StringTrimJsonDeserializer implements JsonDeserializer<String>, JsonSerializer<String> {
        @Override // com.google.gson.JsonDeserializer
        public final String deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            String asString = jsonElement.getAsString();
            if (asString == null) {
                return null;
            }
            int length = asString.length() - 1;
            int i14 = 0;
            boolean z14 = false;
            while (i14 <= length) {
                boolean z15 = s.h(asString.charAt(!z14 ? i14 : length), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length--;
                } else if (z15) {
                    i14++;
                } else {
                    z14 = true;
                }
            }
            return asString.subSequence(i14, length + 1).toString();
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0043  */
        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(String str, Type type, JsonSerializationContext jsonSerializationContext) {
            String string;
            String str2 = str;
            type.getClass();
            jsonSerializationContext.getClass();
            if (str2 != null) {
                int length = str2.length() - 1;
                int i14 = 0;
                boolean z14 = false;
                while (i14 <= length) {
                    boolean z15 = s.h(str2.charAt(!z14 ? i14 : length), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            break;
                        }
                        length--;
                    } else if (z15) {
                        i14++;
                    } else {
                        z14 = true;
                    }
                }
                string = str2.subSequence(i14, length + 1).toString();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            return new JsonPrimitive(string);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/GsonUtil$UtcDateTimeTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UtcDateTimeTypeAdapter implements JsonDeserializer<DateTime>, JsonSerializer<DateTime> {
        @Override // com.google.gson.JsonDeserializer
        public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            String asString = jsonElement.getAsString();
            asString.getClass();
            if (asString.length() == 0) {
                return null;
            }
            return j0.f23101c.parseDateTime(jsonElement.getAsString());
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
            DateTime dateTime2 = dateTime;
            type.getClass();
            jsonSerializationContext.getClass();
            return new JsonPrimitive(dateTime2 == null ? "" : j0.f23101c.print(dateTime2));
        }
    }

    static {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new GCMEnumTypeAdapterFactory()).registerTypeAdapterFactory(new BundleTypeAdapterFactory()).setExclusionStrategies(new a()).serializeSpecialFloatingPointValues().create();
        gsonCreate.getClass();
        f47253b = gsonCreate;
    }

    private GsonUtil() {
    }

    public static final <T> String a(T t7) {
        String json = f47253b.toJson(t7);
        json.getClass();
        return json;
    }
}
