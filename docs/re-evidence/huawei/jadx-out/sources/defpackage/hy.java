package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.network.embedded.c0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public class hy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f37321a = JsonReader.d.e("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", FitRunPlayAudio.PLAY_TYPE_T, "ef", "sr", CmcdConfiguration.KEY_STREAM_TYPE, "w", "h", c0.h, "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.d f37323c = JsonReader.d.e("d", "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37322b = JsonReader.d.e("ty", "nm");

    public static Layer c(cx cxVar) {
        Rect rectC = cxVar.c();
        return new Layer(Collections.EMPTY_LIST, cxVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.EMPTY_LIST, new gf(), 0, 0, 0, 0.0f, 0.0f, rectC.width(), rectC.height(), null, null, Collections.EMPTY_LIST, Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }

    public static Layer c(JsonReader jsonReader, cx cxVar) throws IOException {
        ArrayList arrayList;
        float f;
        Layer.LayerType layerType;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Layer.MatteType matteType2 = matteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float fNextDouble = 1.0f;
        Layer.LayerType layerType2 = null;
        String strNextString = null;
        gd gdVarA = null;
        gg ggVarB = null;
        fu fuVarE = null;
        ge geVarE = null;
        ho hoVarD = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        float fNextDouble5 = 0.0f;
        float fB = 0.0f;
        long jNextInt = -1;
        gf gfVar = null;
        long jNextInt2 = 0;
        String strNextString2 = null;
        String strNextString3 = "UNSET";
        boolean z = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f37321a)) {
                case 0:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 1:
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case 2:
                    strNextString = jsonReader.nextString();
                    break;
                case 3:
                    int iNextInt3 = jsonReader.nextInt();
                    if (iNextInt3 < Layer.LayerType.UNKNOWN.ordinal()) {
                        layerType = Layer.LayerType.values()[iNextInt3];
                    } else {
                        layerType = Layer.LayerType.UNKNOWN;
                    }
                    layerType2 = layerType;
                    break;
                case 4:
                    jNextInt = jsonReader.nextInt();
                    break;
                case 5:
                    iNextInt = (int) (jsonReader.nextInt() * je.e());
                    break;
                case 6:
                    iNextInt2 = (int) (jsonReader.nextInt() * je.e());
                    break;
                case 7:
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case 8:
                    gfVar = he.e(jsonReader, cxVar);
                    break;
                case 9:
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 >= Layer.MatteType.values().length) {
                        cxVar.d("Unsupported matte type: " + iNextInt4);
                    } else {
                        matteType2 = Layer.MatteType.values()[iNextInt4];
                        int i = AnonymousClass4.e[matteType2.ordinal()];
                        if (i == 1) {
                            cxVar.d("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            cxVar.d("Unsupported matte type: Luma Inverted");
                        }
                        cxVar.e(1);
                    }
                    break;
                case 10:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(ib.a(jsonReader, cxVar));
                    }
                    cxVar.e(arrayList2.size());
                    jsonReader.endArray();
                    break;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ContentModel contentModelA = hi.a(jsonReader, cxVar);
                        if (contentModelA != null) {
                            arrayList3.add(contentModelA);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 12:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int iSelectName = jsonReader.selectName(f37323c);
                        if (iSelectName == 0) {
                            gdVarA = hl.a(jsonReader, cxVar);
                        } else if (iSelectName == 1) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                ggVarB = hc.b(jsonReader, cxVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 13:
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            int iSelectName2 = jsonReader.selectName(f37322b);
                            if (iSelectName2 == 0) {
                                int iNextInt5 = jsonReader.nextInt();
                                if (iNextInt5 == 29) {
                                    geVarE = hk.e(jsonReader, cxVar);
                                } else if (iNextInt5 == 25) {
                                    hoVarD = new hn().d(jsonReader, cxVar);
                                }
                            } else if (iSelectName2 == 1) {
                                arrayList4.add(jsonReader.nextString());
                            } else {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    cxVar.d("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    fNextDouble4 = (float) (jsonReader.nextDouble() * ((double) je.e()));
                    break;
                case 17:
                    fNextDouble5 = (float) (jsonReader.nextDouble() * ((double) je.e()));
                    break;
                case 18:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    fB = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    fuVarE = hl.e(jsonReader, cxVar, false);
                    break;
                case 21:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 22:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 23:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 24:
                    int iNextInt6 = jsonReader.nextInt();
                    if (iNextInt6 >= LBlendMode.values().length) {
                        cxVar.d("Unsupported Blend Mode: " + iNextInt6);
                        lBlendMode2 = LBlendMode.NORMAL;
                    } else {
                        lBlendMode2 = LBlendMode.values()[iNextInt6];
                    }
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList5 = new ArrayList();
        if (fNextDouble2 > 0.0f) {
            arrayList = arrayList5;
            arrayList.add(new jb(cxVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble2)));
            f = 0.0f;
        } else {
            arrayList = arrayList5;
            f = 0.0f;
        }
        if (fB <= f) {
            fB = cxVar.b();
        }
        ArrayList arrayList6 = arrayList;
        arrayList6.add(new jb(cxVar, fValueOf2, fValueOf2, null, fNextDouble2, Float.valueOf(fB)));
        arrayList6.add(new jb(cxVar, fValueOf, fValueOf, null, fB, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString3.endsWith(".ai") || "ai".equals(strNextString2)) {
            cxVar.d("Convert your Illustrator layers to shape layers.");
        }
        if (z != 0) {
            if (gfVar == null) {
                gfVar = new gf();
            }
            gfVar.c(z);
        }
        return new Layer(arrayList3, cxVar, strNextString3, jNextInt2, layerType2, jNextInt, strNextString, arrayList2, gfVar, iNextInt, iNextInt2, color, fNextDouble, fNextDouble3, fNextDouble4, fNextDouble5, gdVarA, ggVarB, arrayList6, matteType2, fuVarE, zNextBoolean, geVarE, hoVarD, lBlendMode2);
    }

    /* JADX INFO: renamed from: hy$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            e = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
