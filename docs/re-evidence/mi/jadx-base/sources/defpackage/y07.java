package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class y07 implements snq<DocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y07 f39640a = new y07();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f39641b = JsonReader.a.a(DeviceTagInterface.CUSTOM_TAG_TYPE, PluginDeviceInfo.FBLUETOOTHPAIR, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.snq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentData a(JsonReader jsonReader, float f) throws IOException {
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
        int iD = 0;
        int iD2 = 0;
        boolean zL = true;
        while (jsonReader.d()) {
            switch (jsonReader.p(f39641b)) {
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
                    justification2 = DocumentData.Justification.CENTER;
                    if (iNextInt2 <= justification2.ordinal() && iNextInt2 >= 0) {
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
                    iD = sud.d(jsonReader);
                    break;
                case 8:
                    iD2 = sud.d(jsonReader);
                    break;
                case 9:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    zL = jsonReader.l();
                    break;
                case 11:
                    jsonReader.b();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.c();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.b();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.c();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new DocumentData(strNextString, strNextString2, fNextDouble, justification2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zL, pointF, pointF2);
    }
}
