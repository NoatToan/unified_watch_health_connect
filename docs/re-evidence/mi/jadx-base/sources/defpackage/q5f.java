package defpackage;

import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class q5f {
    public static Mask a(JsonReader jsonReader, lse lseVar) throws IOException {
        jsonReader.beginObject();
        Mask.MaskMode maskMode = null;
        lb1 lb1VarK = null;
        gb1 gb1VarH = null;
        boolean zL = false;
        while (jsonReader.d()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "o":
                    gb1VarH = tb1.h(jsonReader, lseVar);
                    break;
                case "pt":
                    lb1VarK = tb1.k(jsonReader, lseVar);
                    break;
                case "inv":
                    zL = jsonReader.l();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.hashCode();
                    switch (strNextString) {
                        case "a":
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case "i":
                            lseVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case "s":
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            rpe.c("Unknown mask mode " + strNextName + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, lb1VarK, gb1VarH, zL);
    }
}
