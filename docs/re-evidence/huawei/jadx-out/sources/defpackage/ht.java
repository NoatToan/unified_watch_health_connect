package defpackage;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.amap.api.col.p0003sl.jt;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
class ht {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.d f37124c = JsonReader.d.e("nm", jt.f, "o", FitRunPlayAudio.PLAY_TYPE_T, "s", FitRunPlayAudio.OPPORTUNITY_E, "w", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.d e = JsonReader.d.e("p", "k");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f37123a = JsonReader.d.e("n", "v");

    static gm e(JsonReader jsonReader, cx cxVar) throws IOException {
        ft ftVarE;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        GradientType gradientType = null;
        ft ftVar = null;
        fz fzVarC = null;
        fz fzVarC2 = null;
        fu fuVarB = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        fu fuVar = null;
        boolean zNextBoolean = false;
        gb gbVar = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f37124c)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    continue;
                case 1:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        int iSelectName = jsonReader.selectName(e);
                        if (iSelectName != 0) {
                            ftVarE = ftVar;
                            if (iSelectName == 1) {
                                ftVarE = hl.e(jsonReader, cxVar, iNextInt);
                            } else {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            }
                        } else {
                            ftVarE = ftVar;
                            iNextInt = jsonReader.nextInt();
                        }
                        ftVar = ftVarE;
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    gbVar = hl.d(jsonReader, cxVar);
                    continue;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fzVarC = hl.c(jsonReader, cxVar);
                    continue;
                case 5:
                    fzVarC2 = hl.c(jsonReader, cxVar);
                    continue;
                case 6:
                    fuVarB = hl.b(jsonReader, cxVar);
                    continue;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        fu fuVarB2 = null;
                        while (jsonReader.hasNext()) {
                            int iSelectName2 = jsonReader.selectName(f37123a);
                            if (iSelectName2 != 0) {
                                fu fuVar2 = fuVar;
                                if (iSelectName2 == 1) {
                                    fuVarB2 = hl.b(jsonReader, cxVar);
                                } else {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                }
                                fuVar = fuVar2;
                            } else {
                                strNextString2 = jsonReader.nextString();
                            }
                        }
                        fu fuVar3 = fuVar;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            fuVar = fuVarB2;
                        } else if (strNextString2.equals("d") || strNextString2.equals(jt.f)) {
                            cxVar.b(true);
                            arrayList.add(fuVarB2);
                            fuVar = fuVar3;
                        } else {
                            fuVar = fuVar3;
                        }
                    }
                    fu fuVar4 = fuVar;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((fu) arrayList.get(0));
                    }
                    fuVar = fuVar4;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
            }
            strNextString = strNextString;
        }
        String str = strNextString;
        if (gbVar == null) {
            gbVar = new gb(Collections.singletonList(new jb(100)));
        }
        return new gm(str, gradientType, ftVar, gbVar, fzVarC, fzVarC2, fuVarB, lineCapType, lineJoinType, fNextDouble, arrayList, fuVar, zNextBoolean);
    }
}
