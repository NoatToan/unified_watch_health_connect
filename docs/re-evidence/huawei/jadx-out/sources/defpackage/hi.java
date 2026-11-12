package defpackage;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f36757a = JsonReader.d.e("ty", "d");

    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    static ContentModel a(JsonReader jsonReader, cx cxVar) throws IOException {
        ContentModel contentModelD;
        String strNextString;
        jsonReader.beginObject();
        byte b2 = 2;
        int iNextInt = 2;
        while (true) {
            contentModelD = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            int iSelectName = jsonReader.selectName(f36757a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
                break;
            }
            if (iSelectName == 1) {
                iNextInt = jsonReader.nextInt();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        if (strNextString == null) {
            return null;
        }
        strNextString.hashCode();
        int iHashCode = strNextString.hashCode();
        if (iHashCode != 3239) {
            if (iHashCode != 3270) {
                if (iHashCode != 3295) {
                    if (iHashCode != 3488) {
                        if (iHashCode != 3646) {
                            if (iHashCode != 3669) {
                                if (iHashCode != 3679) {
                                    if (iHashCode != 3681) {
                                        if (iHashCode != 3705) {
                                            if (iHashCode != 3710) {
                                                if (iHashCode != 3307) {
                                                    if (iHashCode != 3308) {
                                                        if (iHashCode != 3633) {
                                                            if (iHashCode == 3634 && strNextString.equals("rd")) {
                                                                b2 = 7;
                                                            } else {
                                                                b2 = -1;
                                                            }
                                                        } else if (strNextString.equals("rc")) {
                                                            b2 = 6;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                    } else if (strNextString.equals("gs")) {
                                                        b2 = 4;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                } else if (strNextString.equals("gr")) {
                                                    b2 = 3;
                                                } else {
                                                    b2 = -1;
                                                }
                                            } else if (strNextString.equals("tr")) {
                                                b2 = 13;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strNextString.equals("tm")) {
                                            b2 = 12;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strNextString.equals(CmcdConfiguration.KEY_STREAM_TYPE)) {
                                        b2 = 11;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strNextString.equals("sr")) {
                                    b2 = 10;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strNextString.equals("sh")) {
                                b2 = 9;
                            } else {
                                b2 = -1;
                            }
                        } else if (strNextString.equals("rp")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                    } else if (strNextString.equals("mm")) {
                        b2 = 5;
                    } else {
                        b2 = -1;
                    }
                } else if (!strNextString.equals("gf")) {
                    b2 = -1;
                }
            } else if (strNextString.equals("fl")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strNextString.equals("el")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                contentModelD = hj.d(jsonReader, cxVar, iNextInt);
                break;
            case 1:
                contentModelD = io.a(jsonReader, cxVar);
                break;
            case 2:
                contentModelD = hv.a(jsonReader, cxVar);
                break;
            case 3:
                contentModelD = im.a(jsonReader, cxVar);
                break;
            case 4:
                contentModelD = ht.e(jsonReader, cxVar);
                break;
            case 5:
                contentModelD = id.e(jsonReader);
                cxVar.d("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModelD = ig.b(jsonReader, cxVar);
                break;
            case 7:
                contentModelD = ij.b(jsonReader, cxVar);
                break;
            case 8:
                contentModelD = ih.e(jsonReader, cxVar);
                break;
            case 9:
                contentModelD = il.a(jsonReader, cxVar);
                break;
            case 10:
                contentModelD = ik.c(jsonReader, cxVar, iNextInt);
                break;
            case 11:
                contentModelD = in.c(jsonReader, cxVar);
                break;
            case 12:
                contentModelD = ir.c(jsonReader, cxVar);
                break;
            case 13:
                contentModelD = he.e(jsonReader, cxVar);
                break;
            default:
                iy.d("Unknown shape type " + strNextString);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModelD;
    }
}
