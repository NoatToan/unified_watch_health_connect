package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class ib {
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    static Mask a(JsonReader jsonReader, cx cxVar) throws IOException {
        byte b2;
        jsonReader.beginObject();
        Mask.MaskMode maskMode = null;
        fy fyVarJ = null;
        gb gbVarD = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iHashCode = strNextName.hashCode();
            byte b3 = -1;
            if (iHashCode != 111) {
                if (iHashCode != 3588) {
                    if (iHashCode != 104433) {
                        if (iHashCode == 3357091 && strNextName.equals(Wpt.MODE)) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                    } else if (strNextName.equals("inv")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (strNextName.equals("pt")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (strNextName.equals("o")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                gbVarD = hl.d(jsonReader, cxVar);
            } else if (b2 == 1) {
                fyVarJ = hl.j(jsonReader, cxVar);
            } else if (b2 == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (b2 == 3) {
                String strNextString = jsonReader.nextString();
                strNextString.hashCode();
                int iHashCode2 = strNextString.hashCode();
                if (iHashCode2 != 97) {
                    if (iHashCode2 != 105) {
                        if (iHashCode2 != 110) {
                            if (iHashCode2 == 115 && strNextString.equals("s")) {
                                b3 = 3;
                            }
                        } else if (strNextString.equals("n")) {
                            b3 = 2;
                        }
                    } else if (strNextString.equals(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                        b3 = 1;
                    }
                } else if (strNextString.equals("a")) {
                    b3 = 0;
                }
                if (b3 == 0) {
                    maskMode = Mask.MaskMode.MASK_MODE_ADD;
                } else if (b3 == 1) {
                    cxVar.d("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                    maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                } else if (b3 == 2) {
                    maskMode = Mask.MaskMode.MASK_MODE_NONE;
                } else if (b3 == 3) {
                    maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                } else {
                    iy.d("Unknown mask mode " + strNextName + ". Defaulting to Add.");
                    maskMode = Mask.MaskMode.MASK_MODE_ADD;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, fyVarJ, gbVarD, zNextBoolean);
    }
}
