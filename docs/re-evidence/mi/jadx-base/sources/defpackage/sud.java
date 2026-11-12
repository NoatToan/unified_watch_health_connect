package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class sud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f33993a = JsonReader.a.a("x", "y");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33994a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f33994a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33994a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33994a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(JsonReader jsonReader, float f) throws IOException {
        jsonReader.b();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.n() != JsonReader.Token.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.c();
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    public static PointF b(JsonReader jsonReader, float f) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.d()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    public static PointF c(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f33993a);
            if (iP == 0) {
                fG = g(jsonReader);
            } else if (iP != 1) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                fG2 = g(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(fG * f, fG2 * f);
    }

    public static int d(JsonReader jsonReader) throws IOException {
        jsonReader.b();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.d()) {
            jsonReader.skipValue();
        }
        jsonReader.c();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF e(JsonReader jsonReader, float f) throws IOException {
        int i = a.f33994a[jsonReader.n().ordinal()];
        if (i == 1) {
            return b(jsonReader, f);
        }
        if (i == 2) {
            return a(jsonReader, f);
        }
        if (i == 3) {
            return c(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.n());
    }

    public static List<PointF> f(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.b();
        while (jsonReader.n() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            arrayList.add(e(jsonReader, f));
            jsonReader.c();
        }
        jsonReader.c();
        return arrayList;
    }

    public static float g(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenN = jsonReader.n();
        int i = a.f33994a[tokenN.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenN);
        }
        jsonReader.b();
        float fNextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.d()) {
            jsonReader.skipValue();
        }
        jsonReader.c();
        return fNextDouble;
    }
}
