package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.baseutil.Language;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class c {
    private static JsonReader.Options a = JsonReader.Options.of(com.alipay.sdk.m.s.a.q, GoogleApiAvailabilityLight.a);

    private c() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Nullable
    public static ContentModel a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ContentModel contentModelA;
        String strNextString;
        jsonReader.beginObject();
        byte b = 2;
        int iNextInt = 2;
        while (true) {
            contentModelA = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            int iSelectName = jsonReader.selectName(a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
                break;
            }
            if (iSelectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                if (!strNextString.equals(Language.EL)) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3270:
                if (!strNextString.equals("fl")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                if (!strNextString.equals("gr")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3308:
                if (!strNextString.equals("gs")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3488:
                if (!strNextString.equals(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES)) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 3633:
                if (!strNextString.equals("rc")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 3646:
                if (!strNextString.equals("rp")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 3669:
                if (!strNextString.equals("sh")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 3679:
                if (!strNextString.equals("sr")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 3681:
                if (!strNextString.equals(UserDataStore.STATE)) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 3705:
                if (!strNextString.equals("tm")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 3710:
                if (!strNextString.equals("tr")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                contentModelA = b.a(jsonReader, lottieComposition, iNextInt);
                break;
            case 1:
                contentModelA = q.a(jsonReader, lottieComposition);
                break;
            case 2:
                contentModelA = f.a(jsonReader, lottieComposition);
                break;
            case 3:
                contentModelA = r.a(jsonReader, lottieComposition);
                break;
            case 4:
                contentModelA = g.a(jsonReader, lottieComposition);
                break;
            case 5:
                contentModelA = l.a(jsonReader);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModelA = o.a(jsonReader, lottieComposition);
                break;
            case 7:
                contentModelA = p.a(jsonReader, lottieComposition);
                break;
            case 8:
                contentModelA = s.a(jsonReader, lottieComposition);
                break;
            case 9:
                contentModelA = n.a(jsonReader, lottieComposition);
                break;
            case 10:
                contentModelA = t.a(jsonReader, lottieComposition);
                break;
            case 11:
                contentModelA = u.a(jsonReader, lottieComposition);
                break;
            case 12:
                contentModelA = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                Logger.warning("Unknown shape type " + strNextString);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModelA;
    }
}
