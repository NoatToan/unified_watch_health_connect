package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.circulate.device.api.DeviceInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class t6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f34368a = JsonReader.a.a("nm", "ind", TSMAuthContants.PARAM_REFID, "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", DeviceTagInterface.CUSTOM_TAG_TYPE, "ef", "sr", "st", Constants.DEVICE_TYPE_WEAR, "h", DeviceInfo.Builder.PrivateDataKey.IP, "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f34369b = JsonReader.a.a(PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FMODEL);
    public static final JsonReader.a c = JsonReader.a.a("ty", "nm");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34370a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f34370a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34370a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Layer a(lse lseVar) {
        Rect rectB = lseVar.b();
        return new Layer(Collections.emptyList(), lseVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new qb1(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer b(JsonReader jsonReader, lse lseVar) throws IOException {
        ArrayList arrayList;
        float f;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Layer.MatteType matteType2 = matteType;
        Layer.LayerType layerType = null;
        String strNextString = null;
        qb1 qb1VarG = null;
        nb1 nb1VarD = null;
        ob1 ob1VarA = null;
        eb1 eb1VarF = null;
        v33 v33VarB = null;
        f67 f67VarB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zL = false;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float f2 = 0.0f;
        long jNextInt2 = -1;
        float fNextDouble4 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        float fNextDouble5 = 0.0f;
        while (jsonReader.d()) {
            switch (jsonReader.p(f34368a)) {
                case 0:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 1:
                    jNextInt = jsonReader.nextInt();
                    break;
                case 2:
                    strNextString = jsonReader.nextString();
                    break;
                case 3:
                    int iNextInt3 = jsonReader.nextInt();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iNextInt3 < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iNextInt3];
                    }
                    break;
                case 4:
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case 5:
                    iNextInt = (int) (jsonReader.nextInt() * emq.e());
                    break;
                case 6:
                    iNextInt2 = (int) (jsonReader.nextInt() * emq.e());
                    break;
                case 7:
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case 8:
                    qb1VarG = rb1.g(jsonReader, lseVar);
                    break;
                case 9:
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[iNextInt4];
                        int i = a.f34370a[matteType2.ordinal()];
                        if (i == 1) {
                            lseVar.a("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            lseVar.a("Unsupported matte type: Luma Inverted");
                        }
                        lseVar.r(1);
                    } else {
                        lseVar.a("Unsupported matte type: " + iNextInt4);
                    }
                    break;
                case 10:
                    jsonReader.b();
                    while (jsonReader.d()) {
                        arrayList2.add(q5f.a(jsonReader, lseVar));
                    }
                    lseVar.r(arrayList2.size());
                    jsonReader.c();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.d()) {
                        fi4 fi4VarA = gi4.a(jsonReader, lseVar);
                        if (fi4VarA != null) {
                            arrayList3.add(fi4VarA);
                        }
                    }
                    jsonReader.c();
                    break;
                case 12:
                    jsonReader.beginObject();
                    while (jsonReader.d()) {
                        int iP = jsonReader.p(f34369b);
                        if (iP == 0) {
                            nb1VarD = tb1.d(jsonReader, lseVar);
                        } else if (iP != 1) {
                            jsonReader.s();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.b();
                            if (jsonReader.d()) {
                                ob1VarA = pb1.a(jsonReader, lseVar);
                            }
                            while (jsonReader.d()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.c();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 13:
                    jsonReader.b();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.d()) {
                        jsonReader.beginObject();
                        while (jsonReader.d()) {
                            int iP2 = jsonReader.p(c);
                            if (iP2 == 0) {
                                int iNextInt5 = jsonReader.nextInt();
                                if (iNextInt5 == 29) {
                                    v33VarB = w33.b(jsonReader, lseVar);
                                } else if (iNextInt5 == 25) {
                                    f67VarB = new g67().b(jsonReader, lseVar);
                                }
                            } else if (iP2 != 1) {
                                jsonReader.s();
                                jsonReader.skipValue();
                            } else {
                                arrayList4.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.c();
                    lseVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) emq.e()));
                    break;
                case 17:
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) emq.e()));
                    break;
                case 18:
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    eb1VarF = tb1.f(jsonReader, lseVar, false);
                    break;
                case 21:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 22:
                    zL = jsonReader.l();
                    break;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList5 = new ArrayList();
        if (fNextDouble5 > 0.0f) {
            arrayList = arrayList5;
            arrayList.add(new e1e(lseVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble5)));
            f = 0.0f;
        } else {
            arrayList = arrayList5;
            f = 0.0f;
        }
        if (f2 <= f) {
            f2 = lseVar.f();
        }
        arrayList.add(new e1e(lseVar, fValueOf2, fValueOf2, null, fNextDouble5, Float.valueOf(f2)));
        arrayList.add(new e1e(lseVar, fValueOf, fValueOf, null, f2, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            lseVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList3, lseVar, strNextString2, jNextInt, layerType, jNextInt2, strNextString, arrayList2, qb1VarG, iNextInt, iNextInt2, color, fNextDouble4, fNextDouble, fNextDouble2, fNextDouble3, nb1VarD, ob1VarA, arrayList, matteType2, eb1VarF, zL, v33VarB, f67VarB);
    }
}
