package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class hw {
    private static final JsonReader.d d = JsonReader.d.e("x", "y");

    static int c(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static List<PointF> a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(b(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: hw$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            d = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static PointF b(JsonReader jsonReader, float f) throws IOException {
        int i = AnonymousClass5.d[jsonReader.peek().ordinal()];
        if (i == 1) {
            return e(jsonReader, f);
        }
        if (i == 2) {
            return d(jsonReader, f);
        }
        if (i == 3) {
            return c(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    private static PointF e(JsonReader jsonReader, float f) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF d(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonReader.Token.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF c(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float fE = 0.0f;
        float fE2 = 0.0f;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(d);
            if (iSelectName == 0) {
                fE = e(jsonReader);
            } else if (iSelectName == 1) {
                fE2 = e(jsonReader);
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(fE * f, fE2 * f);
    }

    static float e(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenPeek = jsonReader.peek();
        int i = AnonymousClass5.d[tokenPeek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i == 2) {
            jsonReader.beginArray();
            float fNextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return fNextDouble;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + tokenPeek);
    }
}
