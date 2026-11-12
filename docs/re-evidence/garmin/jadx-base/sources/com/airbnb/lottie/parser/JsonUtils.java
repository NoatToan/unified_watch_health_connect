package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.messaging.l;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import n23.j;

/* JADX INFO: loaded from: classes7.dex */
class JsonUtils {
    private static final JsonReader.Options POINT_NAMES = JsonReader.Options.of("x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.JsonUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private JsonUtils() {
    }

    private static PointF jsonArrayToPoint(JsonReader jsonReader, float f14) {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonReader.Token.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f14, fNextDouble2 * f14);
    }

    private static PointF jsonNumbersToPoint(JsonReader jsonReader, float f14) {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f14, fNextDouble2 * f14);
    }

    private static PointF jsonObjectToPoint(JsonReader jsonReader, float f14) {
        jsonReader.beginObject();
        float fValueFromObject = 0.0f;
        float fValueFromObject2 = 0.0f;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(POINT_NAMES);
            if (iSelectName == 0) {
                fValueFromObject = valueFromObject(jsonReader);
            } else if (iSelectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                fValueFromObject2 = valueFromObject(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(fValueFromObject * f14, fValueFromObject2 * f14);
    }

    public static int jsonToColor(JsonReader jsonReader) {
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

    public static PointF jsonToPoint(JsonReader jsonReader, float f14) {
        int i14 = AnonymousClass1.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[jsonReader.peek().ordinal()];
        if (i14 == 1) {
            return jsonNumbersToPoint(jsonReader, f14);
        }
        if (i14 == 2) {
            return jsonArrayToPoint(jsonReader, f14);
        }
        if (i14 == 3) {
            return jsonObjectToPoint(jsonReader, f14);
        }
        j.A(jsonReader.peek(), "Unknown point starts with ");
        return null;
    }

    public static List<PointF> jsonToPoints(JsonReader jsonReader, float f14) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(jsonToPoint(jsonReader, f14));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static float valueFromObject(JsonReader jsonReader) {
        JsonReader.Token tokenPeek = jsonReader.peek();
        int i14 = AnonymousClass1.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[tokenPeek.ordinal()];
        if (i14 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i14 != 2) {
            l.j(tokenPeek, "Unknown value for token of type ");
            return 0.0f;
        }
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return fNextDouble;
    }
}
