package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class hm implements ValueParser<DocumentData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hm f36889c = new hm();
    private static final JsonReader.d e = JsonReader.d.e(FitRunPlayAudio.PLAY_TYPE_T, "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private hm() {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DocumentData parse(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        DocumentData.Justification justification2 = justification;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iC = 0;
        int iC2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(e)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 > DocumentData.Justification.CENTER.ordinal() || iNextInt2 < 0) {
                        justification2 = DocumentData.Justification.CENTER;
                    } else {
                        justification2 = DocumentData.Justification.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    iC = hw.c(jsonReader);
                    break;
                case 8:
                    iC2 = hw.c(jsonReader);
                    break;
                case 9:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new DocumentData(strNextString, strNextString2, fNextDouble, justification2, iNextInt, fNextDouble2, fNextDouble3, iC, iC2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
