package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.amap.api.mapcore.util.hl;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatablePathValueParser {
    private static final JsonReader.Options a = JsonReader.Options.of(hl.k, "x", "y");

    private AnimatablePathValueParser() {
    }

    public static AnimatableValue<PointF, PointF> a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        AnimatablePathValue animatablePathValue = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonReader.Token.END_OBJECT) {
            int iSelectName = jsonReader.selectName(a);
            if (iSelectName == 0) {
                animatablePathValue = parse(jsonReader, lottieComposition);
            } else if (iSelectName != 1) {
                if (iSelectName != 2) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonReader.Token.STRING) {
                    jsonReader.skipValue();
                    z = true;
                } else {
                    animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                }
            } else if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                z = true;
            } else {
                animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
            }
        }
        jsonReader.endObject();
        if (z) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
        }
        return animatablePathValue != null ? animatablePathValue : new AnimatableSplitDimensionPathValue(animatableFloatValue, animatableFloatValue2);
    }

    public static AnimatablePathValue parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(m.a(jsonReader, lottieComposition));
            }
            jsonReader.endArray();
            j.b(arrayList);
        } else {
            arrayList.add(new Keyframe(h.e(jsonReader, Utils.dpScale())));
        }
        return new AnimatablePathValue(arrayList);
    }
}
