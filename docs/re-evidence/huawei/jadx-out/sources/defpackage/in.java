package defpackage;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.amap.api.col.p0003sl.jt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
class in {
    private static final JsonReader.d e = JsonReader.d.e("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f37849a = JsonReader.d.e("n", "v");

    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    static ShapeStroke c(JsonReader jsonReader, cx cxVar) throws IOException {
        byte b2;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        fu fuVar = null;
        fx fxVarE = null;
        fu fuVarB = null;
        gb gbVar = null;
        boolean zNextBoolean = false;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        while (true) {
            int i = 100;
            if (jsonReader.hasNext()) {
                int i2 = 1;
                switch (jsonReader.selectName(e)) {
                    case 0:
                        strNextString = jsonReader.nextString();
                        break;
                    case 1:
                        fxVarE = hl.e(jsonReader, cxVar);
                        break;
                    case 2:
                        fuVarB = hl.b(jsonReader, cxVar);
                        break;
                    case 3:
                        gbVar = hl.d(jsonReader, cxVar);
                        break;
                    case 4:
                        lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                        break;
                    case 5:
                        lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                        break;
                    case 6:
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    case 7:
                        zNextBoolean = jsonReader.nextBoolean();
                        break;
                    case 8:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            fu fuVarB2 = null;
                            String strNextString2 = null;
                            while (jsonReader.hasNext()) {
                                int iSelectName = jsonReader.selectName(f37849a);
                                if (iSelectName == 0) {
                                    strNextString2 = jsonReader.nextString();
                                } else if (iSelectName == i2) {
                                    fuVarB2 = hl.b(jsonReader, cxVar);
                                } else {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            strNextString2.hashCode();
                            int iHashCode = strNextString2.hashCode();
                            if (iHashCode != i) {
                                if (iHashCode != 103) {
                                    if (iHashCode == 111 && strNextString2.equals("o")) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strNextString2.equals(jt.f)) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strNextString2.equals("d")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                            if (b2 == 0 || b2 == 1) {
                                cxVar.b(true);
                                arrayList.add(fuVarB2);
                            } else if (b2 == 2) {
                                fuVar = fuVarB2;
                            }
                            i2 = 1;
                            i = 100;
                        }
                        int i3 = i2;
                        jsonReader.endArray();
                        if (arrayList.size() == i3) {
                            arrayList.add((fu) arrayList.get(0));
                        }
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                if (gbVar == null) {
                    gbVar = new gb(Collections.singletonList(new jb(100)));
                }
                if (lineCapType == null) {
                    lineCapType = ShapeStroke.LineCapType.BUTT;
                }
                if (lineJoinType == null) {
                    lineJoinType = ShapeStroke.LineJoinType.MITER;
                }
                return new ShapeStroke(strNextString, fuVar, arrayList, fxVarE, gbVar, fuVarB, lineCapType, lineJoinType, fNextDouble, zNextBoolean);
            }
        }
    }
}
