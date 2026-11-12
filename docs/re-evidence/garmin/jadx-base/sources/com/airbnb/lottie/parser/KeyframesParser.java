package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class KeyframesParser {
    static JsonReader.Options NAMES = JsonReader.Options.of(JWKParameterNames.OCT_KEY_VALUE);

    private KeyframesParser() {
    }

    public static <T> List<Keyframe<T>> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f14, ValueParser<T> valueParser, boolean z14) {
        JsonReader jsonReader2;
        LottieComposition lottieComposition2;
        float f15;
        ValueParser<T> valueParser2;
        boolean z15;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.STRING) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(NAMES) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    LottieComposition lottieComposition3 = lottieComposition;
                    float f16 = f14;
                    ValueParser<T> valueParser3 = valueParser;
                    boolean z16 = z14;
                    Keyframe keyframe = KeyframeParser.parse(jsonReader3, lottieComposition3, f16, valueParser3, false, z16);
                    jsonReader2 = jsonReader3;
                    lottieComposition2 = lottieComposition3;
                    f15 = f16;
                    valueParser2 = valueParser3;
                    z15 = z16;
                    arrayList.add(keyframe);
                } else {
                    jsonReader2 = jsonReader;
                    lottieComposition2 = lottieComposition;
                    f15 = f14;
                    valueParser2 = valueParser;
                    z15 = z14;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(KeyframeParser.parse(jsonReader2, lottieComposition2, f15, valueParser2, true, z15));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                lottieComposition = lottieComposition2;
                f14 = f15;
                valueParser = valueParser2;
                z14 = z15;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(KeyframeParser.parse(jsonReader4, lottieComposition, f14, valueParser, false, z14));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        setEndFrames(arrayList);
        return arrayList;
    }

    public static <T> void setEndFrames(List<? extends Keyframe<T>> list) {
        int i14;
        T t7;
        int size = list.size();
        int i15 = 0;
        while (true) {
            i14 = size - 1;
            if (i15 >= i14) {
                break;
            }
            Keyframe<T> keyframe = list.get(i15);
            i15++;
            Keyframe<T> keyframe2 = list.get(i15);
            keyframe.endFrame = Float.valueOf(keyframe2.startFrame);
            if (keyframe.endValue == null && (t7 = keyframe2.startValue) != null) {
                keyframe.endValue = t7;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).createPath();
                }
            }
        }
        Keyframe<T> keyframe3 = list.get(i14);
        if ((keyframe3.startValue == null || keyframe3.endValue == null) && list.size() > 1) {
            list.remove(keyframe3);
        }
    }
}
