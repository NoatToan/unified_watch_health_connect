package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class f4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f17384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gson f17385b;

    public class a extends c<Boolean> {
        public a() {
            super();
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Boolean read2(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i = b.f17386a[jsonTokenPeek.ordinal()];
            if (i == 1) {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
            if (i == 2) {
                jsonReader.nextNull();
                return null;
            }
            if (i == 3) {
                return Boolean.valueOf(jsonReader.nextInt() != 0);
            }
            if (i == 4) {
                String strNextString = jsonReader.nextString();
                return Boolean.valueOf((gh4.c(strNextString) || "0".equals(strNextString)) ? false : true);
            }
            throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + jsonTokenPeek);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17386a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f17386a = iArr;
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17386a[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17386a[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17386a[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static abstract class c<T> extends TypeAdapter<T> {
        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
        }

        public c() {
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Gson f17387a = new Gson();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Gson f17388b = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    static {
        a aVar = new a();
        f17384a = aVar;
        f17385b = new GsonBuilder().registerTypeAdapter(Boolean.TYPE, aVar).create();
    }

    public static <T> T a(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) b().fromJson(str, (Class) cls);
    }

    public static Gson b() {
        return d.f17387a;
    }

    public static String c(Object obj) {
        return b().toJson(obj);
    }
}
