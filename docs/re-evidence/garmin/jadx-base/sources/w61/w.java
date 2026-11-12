package w61;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO;
import com.garmin.android.apps.connectmobile.performance.trainingload.model.ExerciseLoadRecordDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183264b;

    public /* synthetic */ w(x xVar, int i14) {
        this.f183263a = i14;
        this.f183264b = xVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        ArrayList<ExerciseLoadRecordDto> arrayList;
        e71.g gVar;
        DateTime dateTimeNow;
        o13.t tVar;
        int i14;
        fw.m mVar = (fw.m) obj;
        fw.m mVar2 = (fw.m) obj2;
        int i15 = x.O0;
        mVar2.getClass();
        mVar.getClass();
        int i16 = x.b.f183290a[o53.f0.p(mVar, mVar2).ordinal()];
        int i17 = 1;
        if (i16 == 1) {
            return new fw.m(null, fw.p.LOADING, null, null, 9, null);
        }
        if (i16 == 2) {
            fw.p pVar = fw.p.ERROR;
            fw.c rVar = mVar.f73771d;
            if (rVar == null && (rVar = mVar2.f73771d) == null) {
                rVar = new fw.r();
            }
            return new fw.m(null, pVar, null, rVar, 1, null);
        }
        if (i16 != 3) {
            u0.r();
            return null;
        }
        fw.m.a aVar = fw.m.f73767e;
        x61.k kVar = this.f183264b.f183267c;
        List list = (List) mVar2.f73770c;
        gg1.o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
        Resources resources = kVar.f189262c;
        o13.t tVar2 = kVar.f189263d;
        o0VarG.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                Long l14 = ((ExerciseLoadRecordDto) obj4).f40251f;
                if (l14 != null && l14.longValue() == -1) {
                    arrayList.add(obj4);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (ExerciseLoadRecordDto exerciseLoadRecordDto : arrayList) {
                String str = exerciseLoadRecordDto.f40248c;
                if (str == null || (dateTimeNow = c22.j0.K(str, "yyyy-MM-dd'T'HH:mm:ss")) == null) {
                    dateTimeNow = DateTime.now();
                    dateTimeNow.getClass();
                }
                Double d14 = exerciseLoadRecordDto.f40252g;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = exerciseLoadRecordDto.f40253h;
                double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                if (dDoubleValue > 0.0d) {
                    Long l15 = exerciseLoadRecordDto.f40246a;
                    long jLongValue = l15 != null ? l15.longValue() : 0L;
                    String str2 = exerciseLoadRecordDto.f40250e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    e71.l.c cVar = e71.l.f63316d;
                    String str3 = exerciseLoadRecordDto.f40247b;
                    cVar.getClass();
                    int i18 = e71.l.c.a(str3).f63318b;
                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                    arrayList2.add(new e71.f(jLongValue, str2, dDoubleValue, dateTimeNow, resources.getColor(i18, null), ((pi0.e) tVar2.getValue()).a(dateTimeNow, qi0.a.YEAR_ABBREV_MONTH_DAY), kVar.f(exerciseLoadRecordDto, o0VarG), kVar.g(dDoubleValue, false), kVar.e(exerciseLoadRecordDto.f40247b), kVar.d(exerciseLoadRecordDto, false)));
                } else {
                    double d16 = dDoubleValue2;
                    if (d16 > 0.0d) {
                        Long l16 = exerciseLoadRecordDto.f40246a;
                        long jLongValue2 = l16 != null ? l16.longValue() : 0L;
                        String str4 = exerciseLoadRecordDto.f40250e;
                        String str5 = str4 == null ? "" : str4;
                        e71.l.c cVar2 = e71.l.f63316d;
                        String str6 = exerciseLoadRecordDto.f40254i;
                        cVar2.getClass();
                        int i19 = e71.l.c.a(str6).f63318b;
                        ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                        tVar = tVar2;
                        i14 = 1;
                        arrayList2.add(new e71.f(jLongValue2, str5, d16, dateTimeNow, resources.getColor(i19, null), ((pi0.e) tVar.getValue()).a(dateTimeNow, qi0.a.YEAR_ABBREV_MONTH_DAY), kVar.f(exerciseLoadRecordDto, o0VarG), kVar.g(d16, false), kVar.e(exerciseLoadRecordDto.f40254i), kVar.d(exerciseLoadRecordDto, true)));
                    }
                    i17 = i14;
                    tVar2 = tVar;
                }
                tVar = tVar2;
                i14 = 1;
                i17 = i14;
                tVar2 = tVar;
            }
        }
        int i24 = i17;
        if (arrayList2.isEmpty()) {
            gVar = new e71.g(p13.j0.f134944a, kVar.f189261b.getString(R.string.msg_exercise_load_no_content));
        } else {
            if (arrayList2.size() > i24) {
                p13.c0.u(arrayList2, new x61.m());
            }
            gVar = new e71.g(arrayList2, "");
        }
        return fw.m.a.g(aVar, gVar, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:184:0x0332  */
    /* JADX WARN: Code duplicated, block: B:185:0x0337  */
    /* JADX WARN: Code duplicated, block: B:188:0x033c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x033e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0343  */
    /* JADX WARN: Code duplicated, block: B:192:0x0346  */
    /* JADX WARN: Code duplicated, block: B:193:0x0349  */
    /* JADX WARN: Code duplicated, block: B:198:0x035b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0362  */
    /* JADX WARN: Code duplicated, block: B:203:0x036c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0370 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x0372  */
    /* JADX WARN: Code duplicated, block: B:207:0x0377  */
    /* JADX WARN: Code duplicated, block: B:210:0x0382  */
    /* JADX WARN: Code duplicated, block: B:211:0x0389  */
    /* JADX WARN: Code duplicated, block: B:213:0x038c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0395  */
    /* JADX WARN: Code duplicated, block: B:217:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:218:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:220:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:221:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:224:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:228:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:232:0x0420  */
    /* JADX WARN: Code duplicated, block: B:242:0x0450  */
    /* JADX WARN: Code duplicated, block: B:248:0x0461  */
    /* JADX WARN: Code duplicated, block: B:249:0x0468  */
    /* JADX WARN: Code duplicated, block: B:251:0x046b  */
    /* JADX WARN: Code duplicated, block: B:254:0x047d  */
    /* JADX WARN: Code duplicated, block: B:256:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:257:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:259:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:261:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:264:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:266:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:268:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:269:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:271:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:273:0x04da  */
    /* JADX WARN: Code duplicated, block: B:279:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:281:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:286:0x0508  */
    /* JADX WARN: Code duplicated, block: B:291:0x0515  */
    /* JADX WARN: Code duplicated, block: B:297:0x0532  */
    /* JADX WARN: Code duplicated, block: B:299:0x0536  */
    /* JADX WARN: Code duplicated, block: B:300:0x053b  */
    /* JADX WARN: Code duplicated, block: B:303:0x055a  */
    /* JADX WARN: Code duplicated, block: B:305:0x0570  */
    /* JADX WARN: Code duplicated, block: B:306:0x0575  */
    /* JADX WARN: Code duplicated, block: B:309:0x0582  */
    /* JADX WARN: Code duplicated, block: B:310:0x0584  */
    /* JADX WARN: Code duplicated, block: B:314:0x0594  */
    /* JADX WARN: Code duplicated, block: B:322:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:330:0x0606  */
    /* JADX WARN: Code duplicated, block: B:332:0x060f  */
    /* JADX WARN: Code duplicated, block: B:334:0x0612  */
    /* JADX WARN: Code duplicated, block: B:336:0x0620  */
    /* JADX WARN: Code duplicated, block: B:338:0x0625  */
    /* JADX WARN: Code duplicated, block: B:339:0x0628  */
    /* JADX WARN: Code duplicated, block: B:363:0x0671  */
    /* JADX WARN: Code duplicated, block: B:365:0x0676  */
    /* JADX WARN: Code duplicated, block: B:366:0x0679  */
    /* JADX WARN: Code duplicated, block: B:368:0x067c  */
    /* JADX WARN: Code duplicated, block: B:370:0x0680  */
    /* JADX WARN: Code duplicated, block: B:376:0x0691  */
    /* JADX WARN: Code duplicated, block: B:378:0x0694  */
    /* JADX WARN: Code duplicated, block: B:383:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:388:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:394:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:396:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:398:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:400:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:401:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:403:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:405:0x0702  */
    /* JADX WARN: Code duplicated, block: B:408:0x070c  */
    /* JADX WARN: Code duplicated, block: B:409:0x0716  */
    /* JADX WARN: Code duplicated, block: B:411:0x071a  */
    /* JADX WARN: Code duplicated, block: B:412:0x071d  */
    /* JADX WARN: Code duplicated, block: B:414:0x0721  */
    /* JADX WARN: Code duplicated, block: B:415:0x072a  */
    /* JADX WARN: Code duplicated, block: B:417:0x072e  */
    /* JADX WARN: Code duplicated, block: B:418:0x0733  */
    /* JADX WARN: Code duplicated, block: B:447:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:469:0x0857  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:546:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:597:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:617:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:618:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:649:0x0b9b A[PHI: r5
      0x0b9b: PHI (r5v11 com.garmin.android.apps.connectmobile.performance.model.a) = 
      (r5v5 com.garmin.android.apps.connectmobile.performance.model.a)
      (r5v15 com.garmin.android.apps.connectmobile.performance.model.a)
     binds: [B:670:0x0bd4, B:647:0x0b98] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:650:0x0b9d  */
    /* JADX WARN: Code duplicated, block: B:669:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:671:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:675:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:710:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v84, types: [java.lang.Object, java.util.Collection] */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        com.garmin.android.apps.connectmobile.performance.model.a aVar;
        com.garmin.android.apps.connectmobile.performance.model.a aVar2;
        ?? r14;
        ?? r15;
        Object next;
        com.garmin.android.apps.connectmobile.performance.model.b.a aVar3;
        com.garmin.android.apps.connectmobile.performance.model.c cVarD;
        ?? r16;
        Object next2;
        String str;
        ?? r17;
        Object next3;
        com.garmin.android.apps.connectmobile.performance.model.a aVar4;
        com.garmin.android.apps.connectmobile.performance.model.a aVar5;
        String str2;
        ?? r18;
        Object next4;
        com.garmin.android.apps.connectmobile.performance.model.a aVar6;
        com.garmin.android.apps.connectmobile.performance.model.a aVar7;
        String str3;
        x61.f fVar;
        boolean z14;
        x61.b nVar;
        boolean z15;
        String str4;
        sd2.f fVar2;
        boolean z16;
        boolean z17;
        Iterable iterableK;
        List listN0;
        x61.r rVar;
        x61.k kVar;
        boolean zS;
        boolean zE;
        l22.b bVar;
        l22.b bVar2;
        com.garmin.android.apps.connectmobile.performance.model.c cVarD2;
        boolean z18;
        boolean z19;
        x61.i iVar;
        boolean z24;
        com.garmin.android.apps.connectmobile.performance.model.b bVarB;
        x61.r rVar2;
        Resources resources;
        String trainingBalanceFeedbackPhraseKey;
        Integer num;
        String strA;
        Integer numValueOf;
        String string;
        String str5;
        String str6;
        Double d14;
        Double d15;
        Integer altitudeAcclimationMeters;
        String strB;
        Integer heatAcclimationPercentage;
        String strA2;
        String string2;
        Double dValueOf;
        e71.m mVarG;
        com.garmin.android.apps.connectmobile.performance.model.b bVar3;
        String string3;
        boolean z25;
        DateTime dateTimeK;
        boolean z26;
        x61.d dVar;
        x61.e eVar;
        x61.e eVar2;
        String string4;
        int iH;
        Double d16;
        Double d17;
        String string5;
        Double dValueOf2;
        e71.m mVarG2;
        Integer altitudeAcclimationMeters2;
        String strB2;
        Integer heatAcclimationPercentage2;
        String strA3;
        boolean z27;
        x61.e eVar3;
        x61.e eVar4;
        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736cF;
        HashMap<String, o61.q> map;
        o61.q qVar;
        DateTime dateTimeK2;
        HashMap<String, o61.q> map2;
        o61.q qVar2;
        DateTime dateTimeK3;
        HashMap<String, o61.q> map3;
        o61.q qVar3;
        DateTime dateTimeK4;
        List listN1;
        Iterator it;
        Object next5;
        x61.r rVar3;
        x61.r rVar4;
        x61.r rVar5;
        Double d18;
        x61.r rVar6;
        Double d19;
        com.garmin.android.apps.connectmobile.performance.model.c cVarD3;
        Object next6;
        HashMap<String, com.garmin.android.apps.connectmobile.performance.model.c> map4;
        Set<String> setKeySet;
        Stream<String> stream;
        Optional<String> optionalFindFirst;
        String displayName;
        gj1.d primaryTrainingDeviceDTO;
        Long deviceId;
        List<gj1.a> listF;
        gj1.a aVarT;
        gj1.e primaryTrainingDevices;
        Integer primaryTrainingDeviceCount;
        Integer primaryTrainingDeviceCount2;
        CurrentTrainingStatusDTO currentTrainingStatusDTO;
        ?? r19;
        com.garmin.android.apps.connectmobile.performance.model.a[] aVarArr;
        com.garmin.android.apps.connectmobile.performance.model.a aVar8;
        int i14 = this.f183263a;
        x xVar = this.f183264b;
        switch (i14) {
            case 0:
                fw.m mVar = (fw.m) obj;
                fw.m mVar2 = (fw.m) obj2;
                int i15 = x.O0;
                mVar.getClass();
                mVar2.getClass();
                int i16 = x.b.f183290a[o53.f0.p(mVar, mVar2).ordinal()];
                if (i16 == 1) {
                    return new fw.m(null, fw.p.LOADING, null, null, 9, null);
                }
                if (i16 == 2) {
                    fw.p pVar = fw.p.ERROR;
                    fw.c rVar7 = mVar2.f73771d;
                    if (rVar7 == null) {
                        rVar7 = new fw.r();
                    }
                    return new fw.m(null, pVar, null, rVar7, 1, null);
                }
                if (i16 != 3) {
                    u0.r();
                    return null;
                }
                fw.m.a aVar9 = fw.m.f73767e;
                x61.k kVar2 = xVar.f183267c;
                com.garmin.android.apps.connectmobile.performance.model.a aVar10 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c;
                CurrentTrainingStatusDTO currentTrainingStatusDTO2 = (CurrentTrainingStatusDTO) mVar2.f73770c;
                kVar2.getClass();
                if (aVar10 != null && (!TextUtils.isEmpty(aVar10.f39917a))) {
                    if (aVar10.f39918b == null) {
                        if (currentTrainingStatusDTO2 == null || (r18 = currentTrainingStatusDTO2.f39897b) == 0) {
                            str2 = null;
                        } else {
                            Iterator it3 = r18.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next4 = it3.next();
                                    aVar7 = (com.garmin.android.apps.connectmobile.performance.model.a) next4;
                                } else {
                                    next4 = null;
                                }
                                aVar6 = (com.garmin.android.apps.connectmobile.performance.model.a) next4;
                                if (aVar6 != null) {
                                    str2 = aVar6.f39918b;
                                } else {
                                    str2 = null;
                                }
                            } while (!p005kotlin.jvm.internal.s.g(aVar7 != null ? aVar7.f39917a : null, aVar10.f39917a));
                            aVar6 = (com.garmin.android.apps.connectmobile.performance.model.a) next4;
                            if (aVar6 != null) {
                                str2 = aVar6.f39918b;
                            } else {
                                str2 = null;
                            }
                        }
                        aVar10.f39918b = str2;
                    }
                    if (aVar10.f39919c == null) {
                        if (currentTrainingStatusDTO2 == null || (r17 = currentTrainingStatusDTO2.f39897b) == 0) {
                            str = null;
                        } else {
                            Iterator it4 = r17.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next3 = it4.next();
                                    aVar5 = (com.garmin.android.apps.connectmobile.performance.model.a) next3;
                                } else {
                                    next3 = null;
                                }
                                aVar4 = (com.garmin.android.apps.connectmobile.performance.model.a) next3;
                                if (aVar4 != null) {
                                    str = aVar4.f39919c;
                                } else {
                                    str = null;
                                }
                            } while (!p005kotlin.jvm.internal.s.g(aVar5 != null ? aVar5.f39917a : null, aVar10.f39917a));
                            aVar4 = (com.garmin.android.apps.connectmobile.performance.model.a) next3;
                            if (aVar4 != null) {
                                str = aVar4.f39919c;
                            } else {
                                str = null;
                            }
                        }
                        aVar10.f39919c = str;
                    }
                    aVar2 = aVar10;
                } else if (currentTrainingStatusDTO2 == null || (r16 = currentTrainingStatusDTO2.f39897b) == 0) {
                    if (currentTrainingStatusDTO2 != null || (r15 = currentTrainingStatusDTO2.f39897b) == 0) {
                        aVar = null;
                    } else {
                        Iterator it5 = r15.iterator();
                        do {
                            if (it5.hasNext()) {
                                next = it5.next();
                                com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) next;
                                aVar3 = com.garmin.android.apps.connectmobile.performance.model.b.f39921h;
                                cVarD = currentTrainingStatusDTO2.D(aVar11 != null ? aVar11.f39917a : null);
                            } else {
                                next = null;
                            }
                            aVar = (com.garmin.android.apps.connectmobile.performance.model.a) next;
                        } while (com.garmin.android.apps.connectmobile.performance.model.b.a.b(aVar3, cVarD != null ? cVarD.f39950i : 0.0d) == com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN);
                        aVar = (com.garmin.android.apps.connectmobile.performance.model.a) next;
                    }
                    if (aVar == null) {
                        aVar2 = aVar;
                    } else if (currentTrainingStatusDTO2 != null || (r14 = currentTrainingStatusDTO2.f39897b) == 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) p13.h0.d0(r14);
                    }
                } else {
                    Iterator it6 = r16.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            next2 = it6.next();
                            com.garmin.android.apps.connectmobile.performance.model.a aVar12 = (com.garmin.android.apps.connectmobile.performance.model.a) next2;
                            String str7 = aVar12 != null ? aVar12.f39917a : null;
                            f12.l.f68084a.getClass();
                            if (d53.u.q(str7, String.valueOf(f12.l.a.a().s4()), false)) {
                                com.garmin.android.apps.connectmobile.performance.model.b.a aVar13 = com.garmin.android.apps.connectmobile.performance.model.b.f39921h;
                                com.garmin.android.apps.connectmobile.performance.model.c cVarD4 = currentTrainingStatusDTO2.D(aVar12 != null ? aVar12.f39917a : null);
                                if (com.garmin.android.apps.connectmobile.performance.model.b.a.b(aVar13, cVarD4 != null ? cVarD4.f39950i : 0.0d) != com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN) {
                                }
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    aVar = (com.garmin.android.apps.connectmobile.performance.model.a) next2;
                    if (aVar == null) {
                        if (currentTrainingStatusDTO2 != null) {
                            aVar = null;
                        } else {
                            aVar = null;
                        }
                        if (aVar == null) {
                            aVar2 = aVar;
                        } else if (currentTrainingStatusDTO2 != null) {
                            aVar2 = null;
                        } else {
                            aVar2 = null;
                        }
                    } else {
                        aVar2 = aVar;
                    }
                }
                return fw.m.a.g(aVar9, aVar2, 1);
            case 1:
                fw.m mVar3 = (fw.m) obj;
                fw.m mVar4 = (fw.m) obj2;
                int i17 = x.O0;
                mVar4.getClass();
                mVar3.getClass();
                int i18 = x.b.f183290a[o53.f0.p(mVar3, mVar4).ordinal()];
                if (i18 == 1) {
                    return new fw.m(null, fw.p.LOADING, null, null, 9, null);
                }
                if (i18 == 2) {
                    fw.p pVar2 = fw.p.ERROR;
                    fw.c rVar8 = mVar3.f73771d;
                    if (rVar8 == null && (rVar8 = mVar4.f73771d) == null) {
                        rVar8 = new fw.r();
                    }
                    return new fw.m(null, pVar2, null, rVar8, 1, null);
                }
                if (i18 != 3) {
                    u0.r();
                    return null;
                }
                fw.m.a aVar14 = fw.m.f73767e;
                com.garmin.android.apps.connectmobile.performance.model.a aVar15 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar3.f73770c;
                CurrentTrainingStatusDTO currentTrainingStatusDTO3 = (CurrentTrainingStatusDTO) mVar4.f73770c;
                xVar.getClass();
                if (currentTrainingStatusDTO3 == null || currentTrainingStatusDTO3.f39899d) {
                    if (aVar15 != null) {
                        str3 = aVar15.f39917a;
                    } else {
                        str3 = null;
                    }
                } else if (currentTrainingStatusDTO3.f39902g.isEmpty()) {
                    str3 = null;
                } else {
                    str3 = currentTrainingStatusDTO3.f39902g.keySet().stream().findFirst().get();
                }
                x61.k kVar3 = xVar.f183267c;
                l22.b bVar4 = kVar3.f189261b;
                f12.l.f68084a.getClass();
                String strV0 = f12.l.a.a().V0();
                String strC = (strV0 == null || strV0.length() == 0) ? null : kVar3.c(f12.l.a.a().V0(), com.garmin.android.apps.connectmobile.performance.model.b.PAUSE);
                x61.i iVar2 = (currentTrainingStatusDTO3 == null || TextUtils.isEmpty(str3)) ? null : currentTrainingStatusDTO3.f39902g.get(str3);
                if (iVar2 != null) {
                    Double monthlyLoadAerobicLow = iVar2.getMonthlyLoadAerobicLow();
                    monthlyLoadAerobicLow.getClass();
                    if (monthlyLoadAerobicLow.doubleValue() <= 0.0d) {
                        Double monthlyLoadAerobicHigh = iVar2.getMonthlyLoadAerobicHigh();
                        monthlyLoadAerobicHigh.getClass();
                        if (monthlyLoadAerobicHigh.doubleValue() <= 0.0d) {
                            Double monthlyLoadAnaerobic = iVar2.getMonthlyLoadAnaerobic();
                            monthlyLoadAnaerobic.getClass();
                            if (monthlyLoadAnaerobic.doubleValue() > 0.0d) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = true;
                        }
                    } else {
                        z14 = true;
                    }
                    DateTime dateTimeNow = DateTime.now();
                    DateTime dateTimeMinusDays = dateTimeNow.minusDays(27);
                    c22.j0.f23099a.getClass();
                    String strA4 = (c22.j0.H(dateTimeMinusDays, dateTimeNow) && c22.j0.G(dateTimeMinusDays, dateTimeNow)) ? bVar4.a(R.string.string_line_string_pattern, com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d", new DateTime(dateTimeMinusDays)), com.nimbusds.jose.shaded.gson.internal.a.i("d", new DateTime(dateTimeNow))) : (!c22.j0.H(dateTimeMinusDays, dateTimeNow) || c22.j0.G(dateTimeMinusDays, dateTimeNow)) ? bVar4.a(R.string.string_line_string_pattern, com.nimbusds.jose.shaded.gson.internal.a.i("MMM d, yyyy", new DateTime(dateTimeMinusDays)), com.nimbusds.jose.shaded.gson.internal.a.i("MMM d, yyyy", new DateTime(dateTimeNow))) : bVar4.a(R.string.string_line_string_pattern, com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d", new DateTime(dateTimeMinusDays)), com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d", new DateTime(dateTimeNow)));
                    x61.c.m mVar5 = x61.c.f189186c;
                    String trainingBalanceFeedbackPhraseKey2 = iVar2.getTrainingBalanceFeedbackPhraseKey();
                    mVar5.getClass();
                    Integer num2 = x61.c.m.a(trainingBalanceFeedbackPhraseKey2).f189188b;
                    String string6 = num2 != null ? bVar4.getString(num2 != null ? num2.intValue() : R.string.no_value) : null;
                    x61.b.k kVar4 = x61.b.f189184b;
                    String trainingBalanceFeedbackPhraseKey3 = iVar2.getTrainingBalanceFeedbackPhraseKey();
                    kVar4.getClass();
                    if (trainingBalanceFeedbackPhraseKey3 != null) {
                        switch (trainingBalanceFeedbackPhraseKey3) {
                            case "ON_TARGET":
                                nVar = new x61.b.o();
                                break;
                            case "LOW_AEROBIC_OVERAGE":
                                nVar = new x61.b.m();
                                break;
                            case "ANAEROBIC_FOCUS":
                                nVar = new x61.b.f();
                                break;
                            case "BALANCED":
                                nVar = new x61.b.i();
                                break;
                            case "AEROBIC_LOW_FOCUS":
                                nVar = new x61.b.d();
                                break;
                            case "ABOVE_TARGETS":
                                nVar = new x61.b.a();
                                break;
                            case "AEROBIC_LOW_SHORTAGE":
                                nVar = new x61.b.e();
                                break;
                            case "BELOW_TARGETS":
                                nVar = new x61.b.j();
                                break;
                            case "ANAEROBIC_OVERAGE":
                                nVar = new x61.b.g();
                                break;
                            case "AEROBIC_HIGH_SHORTAGE":
                                nVar = new x61.b.c();
                                break;
                            case "ANAEROBIC_SHORTAGE":
                                nVar = new x61.b.h();
                                break;
                            case "AEROBIC_HIGH_FOCUS":
                                nVar = new x61.b.C3519b();
                                break;
                            case "HIGH_AEROBIC_OVERAGE":
                                nVar = new x61.b.l();
                                break;
                            default:
                                nVar = new x61.b.n();
                                break;
                        }
                    } else {
                        nVar = new x61.b.n();
                    }
                    Integer num3 = nVar.f189185a;
                    fVar = new x61.f(z14, strA4, string6, num3 != null ? bVar4.getString(num3.intValue()) : null, iVar2.getMonthlyLoadAerobicLow(), iVar2.getMonthlyLoadAerobicLowTargetMin(), iVar2.getMonthlyLoadAerobicLowTargetMax(), iVar2.getMonthlyLoadAerobicHigh(), iVar2.getMonthlyLoadAerobicHighTargetMin(), iVar2.getMonthlyLoadAerobicHighTargetMax(), iVar2.getMonthlyLoadAnaerobic(), iVar2.getMonthlyLoadAnaerobicTargetMin(), iVar2.getMonthlyLoadAnaerobicTargetMax(), strC, currentTrainingStatusDTO3.f39899d);
                } else {
                    fVar = new x61.f(false, null, null, null, null, null, null, null, null, null, null, null, null, strC, currentTrainingStatusDTO3 != null ? currentTrainingStatusDTO3.f39899d : true, 8191, null);
                }
                return fw.m.a.g(aVar14, fVar, 1);
            case 2:
                return a(obj, obj2, obj3);
            default:
                o13.t tVar = xVar.F;
                fw.m mVar6 = (fw.m) obj;
                fw.m mVar7 = (fw.m) obj2;
                Boolean bool = (Boolean) obj3;
                int i19 = x.O0;
                mVar7.getClass();
                mVar6.getClass();
                int i24 = x.b.f183290a[o53.f0.p(mVar6, mVar7).ordinal()];
                if (i24 == 1) {
                    return new fw.m(null, fw.p.LOADING, null, null, 9, null);
                }
                if (i24 == 2) {
                    fw.p pVar3 = fw.p.ERROR;
                    fw.c rVar9 = mVar6.f73771d;
                    if (rVar9 == null && (rVar9 = mVar7.f73771d) == null) {
                        rVar9 = new fw.r();
                    }
                    return new fw.m(null, pVar3, null, rVar9, 1, null);
                }
                if (i24 != 3) {
                    u0.r();
                    return null;
                }
                fw.m.a aVar16 = fw.m.f73767e;
                com.garmin.android.apps.connectmobile.performance.model.a aVar17 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar6.f73770c;
                CurrentTrainingStatusDTO currentTrainingStatusDTO4 = (CurrentTrainingStatusDTO) mVar7.f73770c;
                y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var = xVar.f183272h;
                Set<com.garmin.android.apps.connectmobile.performance.model.a> setD = y0Var.d();
                if (setD == null) {
                    setD = p13.l0.f134950a;
                }
                Set<com.garmin.android.apps.connectmobile.performance.model.a> setF1 = p13.h0.f1(setD);
                fw.m mVar8 = (fw.m) xVar.f183271g.d();
                if (mVar8 != null && (aVar8 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar8.f73770c) != null && (!TextUtils.isEmpty(aVar8.f39917a))) {
                    fw.m mVar9 = (fw.m) xVar.f183271g.d();
                    com.garmin.android.apps.connectmobile.performance.model.a aVar18 = mVar9 != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar9.f73770c : null;
                    aVar18.getClass();
                    setF1.add(aVar18);
                }
                fw.m mVar10 = (fw.m) xVar.f183280o.d();
                Collection<? extends com.garmin.android.apps.connectmobile.performance.model.a> collectionC = (mVar10 == null || (currentTrainingStatusDTO = (CurrentTrainingStatusDTO) mVar10.f73770c) == null || (r19 = currentTrainingStatusDTO.f39897b) == 0 || (aVarArr = (com.garmin.android.apps.connectmobile.performance.model.a[]) r19.toArray(new com.garmin.android.apps.connectmobile.performance.model.a[0])) == null) ? null : p13.u.C(aVarArr);
                if (collectionC == null) {
                    collectionC = p13.j0.f134944a;
                }
                setF1.addAll(collectionC);
                y0Var.m(setF1);
                gj1.f fVar3 = xVar.J0;
                if (fVar3 == null) {
                    z15 = false;
                } else {
                    DateTime dateTimeK5 = currentTrainingStatusDTO4 != null ? c22.j0.K(currentTrainingStatusDTO4.f39900e, "yyyy-MM-dd") : null;
                    gj1.e primaryTrainingDevices2 = fVar3.getPrimaryTrainingDevices();
                    int iIntValue = (primaryTrainingDevices2 == null || (primaryTrainingDeviceCount2 = primaryTrainingDevices2.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount2.intValue();
                    boolean zK = dateTimeK5 != null ? g22.k.k(dateTimeK5) : false;
                    if (iIntValue <= 0 || zK) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                }
                DateTime dateTimeK6 = currentTrainingStatusDTO4 != null ? c22.j0.K(currentTrainingStatusDTO4.f39900e, "yyyy-MM-dd") : null;
                if (z15 && dateTimeK6 != null && Days.daysBetween(dateTimeK6.withTimeAtStartOfDay(), DateTime.now().withTimeAtStartOfDay()).getDays() >= Days.SEVEN.getDays()) {
                    gj1.f fVar4 = xVar.J0;
                    int iIntValue2 = (fVar4 == null || (primaryTrainingDevices = fVar4.getPrimaryTrainingDevices()) == null || (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount.intValue();
                    gj1.f fVar5 = xVar.J0;
                    if (fVar5 == null || (primaryTrainingDeviceDTO = fVar5.getPrimaryTrainingDeviceDTO()) == null || (deviceId = primaryTrainingDeviceDTO.getDeviceId()) == null) {
                        displayName = null;
                    } else {
                        long jLongValue = deviceId.longValue();
                        gj1.f fVar6 = xVar.J0;
                        if (fVar6 == null || (listF = fVar6.f()) == null || (aVarT = gl.b.t(Long.valueOf(jLongValue), listF)) == null) {
                            displayName = null;
                        } else {
                            displayName = aVarT.getDisplayName();
                        }
                    }
                    ((y0) tVar.getValue()).j(new f(new o13.p(displayName, Boolean.valueOf(iIntValue2 > 1))));
                } else {
                    ((y0) tVar.getValue()).j(new f(new o13.p(null, Boolean.FALSE)));
                }
                if (currentTrainingStatusDTO4 != null && !currentTrainingStatusDTO4.f39899d) {
                    HashMap<String, com.garmin.android.apps.connectmobile.performance.model.c> map5 = currentTrainingStatusDTO4.f39898c;
                    if (map5 == null || map5.isEmpty() || (map4 = currentTrainingStatusDTO4.f39898c) == null || (setKeySet = map4.keySet()) == null || (stream = setKeySet.stream()) == null || (optionalFindFirst = stream.findFirst()) == null) {
                        str4 = null;
                    } else {
                        str4 = optionalFindFirst.get();
                    }
                } else if (aVar17 != null) {
                    str4 = aVar17.f39917a;
                } else {
                    str4 = null;
                }
                ArrayList arrayList = xVar.f183278m;
                if (arrayList != null) {
                    Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            next6 = it7.next();
                            sd2.f fVar7 = (sd2.f) next6;
                            if (str4 != null) {
                                long unitID = fVar7.getUnitID();
                                Long lJ = d53.t.j(str4);
                                if (lJ != null && unitID == lJ.longValue()) {
                                }
                            }
                        } else {
                            next6 = null;
                        }
                    }
                    fVar2 = (sd2.f) next6;
                } else {
                    fVar2 = null;
                }
                boolean z28 = fVar2 != null && fVar2.p2() && p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE);
                com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736cF2 = (currentTrainingStatusDTO4 == null || (cVarD3 = currentTrainingStatusDTO4.D(str4)) == null) ? null : cVarD3.F();
                if (currentTrainingStatusDTO4 != null) {
                    com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.CYCLING;
                    HashMap<String, o61.q> map6 = currentTrainingStatusDTO4.f39896a;
                    o61.q qVar4 = map6 != null ? map6.get("cycling") : null;
                    z17 = true;
                    x61.r rVar10 = new x61.r(enumC0736c, qVar4 != null ? c22.j0.K(qVar4.getCalendarDate(), "yyyy-MM-dd") : null, Double.valueOf(currentTrainingStatusDTO4.F("cycling")), Double.valueOf(currentTrainingStatusDTO4.C("cycling")));
                    com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c2 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.ROWING;
                    HashMap<String, o61.q> map7 = currentTrainingStatusDTO4.f39896a;
                    o61.q qVar5 = map7 != null ? map7.get("rowing") : null;
                    x61.r rVar11 = new x61.r(enumC0736c2, qVar5 != null ? c22.j0.K(qVar5.getCalendarDate(), "yyyy-MM-dd") : null, Double.valueOf(currentTrainingStatusDTO4.F("rowing")), Double.valueOf(currentTrainingStatusDTO4.C("rowing")));
                    com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c3 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.RUNNING;
                    HashMap<String, o61.q> map8 = currentTrainingStatusDTO4.f39896a;
                    o61.q qVar6 = map8 != null ? map8.get("generic") : null;
                    z16 = z28;
                    iterableK = p13.x.k(rVar10, rVar11, new x61.r(enumC0736c3, qVar6 != null ? c22.j0.K(qVar6.getCalendarDate(), "yyyy-MM-dd") : null, Double.valueOf(currentTrainingStatusDTO4.F("generic")), Double.valueOf(currentTrainingStatusDTO4.C("generic"))));
                    if (iterableK == null) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : iterableK) {
                        rVar6 = (x61.r) obj4;
                        if (rVar6.f189277b == null && (d19 = rVar6.f189278c) != null && !Double.isNaN(d19.doubleValue())) {
                            arrayList2.add(obj4);
                        }
                    }
                    listN0 = p13.h0.N0(arrayList2, new q0());
                    if (enumC0736cF2 != null || enumC0736cF2 == com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.NONE) {
                        rVar = (x61.r) p13.h0.d0(listN0);
                        if (rVar != null) {
                            enumC0736cF2 = rVar.f189276a;
                        } else {
                            enumC0736cF2 = null;
                        }
                    }
                    xVar.f183273i.j(enumC0736cF2);
                    kVar = xVar.f183267c;
                    gg1.o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                    zS = bo1.a.a().c().S();
                    zE = bo1.a.a().c().e();
                    bVar = kVar.f189261b;
                    bVar2 = kVar.f189261b;
                    o0VarG.getClass();
                    if (currentTrainingStatusDTO4 != null) {
                        cVarD2 = currentTrainingStatusDTO4.D(str4);
                    } else {
                        cVarD2 = null;
                    }
                    if (!zE || zS) {
                        if (cVarD2 != null) {
                            z18 = !cVarD2.f39959r;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            z19 = z17;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z19 = false;
                    }
                    if (currentTrainingStatusDTO4 != null || TextUtils.isEmpty(str4)) {
                        iVar = null;
                    } else {
                        iVar = currentTrainingStatusDTO4.f39902g.get(str4);
                    }
                    z24 = z19;
                    if (cVarD2 != null) {
                        bVarB = com.garmin.android.apps.connectmobile.performance.model.b.a.b(com.garmin.android.apps.connectmobile.performance.model.b.f39921h, cVarD2.f39950i);
                        if (bVarB == null) {
                            bVarB = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                        }
                    } else {
                        bVarB = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                    }
                    if (currentTrainingStatusDTO4 != null) {
                        if (cVarD2 != null) {
                            enumC0736cF = cVarD2.F();
                        } else {
                            enumC0736cF = null;
                        }
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c4 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.CYCLING;
                        map = currentTrainingStatusDTO4.f39896a;
                        if (map != null) {
                            qVar = map.get("cycling");
                        } else {
                            qVar = null;
                        }
                        if (qVar != null) {
                            dateTimeK2 = c22.j0.K(qVar.getCalendarDate(), "yyyy-MM-dd");
                        } else {
                            dateTimeK2 = null;
                        }
                        x61.r rVar12 = new x61.r(enumC0736c4, dateTimeK2, Double.valueOf(currentTrainingStatusDTO4.F("cycling")), Double.valueOf(currentTrainingStatusDTO4.C("cycling")));
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c5 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.ROWING;
                        map2 = currentTrainingStatusDTO4.f39896a;
                        if (map2 != null) {
                            qVar2 = map2.get("rowing");
                        } else {
                            qVar2 = null;
                        }
                        if (qVar2 != null) {
                            dateTimeK3 = c22.j0.K(qVar2.getCalendarDate(), "yyyy-MM-dd");
                        } else {
                            dateTimeK3 = null;
                        }
                        x61.r rVar13 = new x61.r(enumC0736c5, dateTimeK3, Double.valueOf(currentTrainingStatusDTO4.F("rowing")), Double.valueOf(currentTrainingStatusDTO4.C("rowing")));
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c6 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.RUNNING;
                        map3 = currentTrainingStatusDTO4.f39896a;
                        if (map3 != null) {
                            qVar3 = map3.get("generic");
                        } else {
                            qVar3 = null;
                        }
                        if (qVar3 != null) {
                            dateTimeK4 = c22.j0.K(qVar3.getCalendarDate(), "yyyy-MM-dd");
                        } else {
                            dateTimeK4 = null;
                        }
                        List listK = p13.x.k(rVar12, rVar13, new x61.r(enumC0736c6, dateTimeK4, Double.valueOf(currentTrainingStatusDTO4.F("generic")), Double.valueOf(currentTrainingStatusDTO4.C("generic"))));
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : listK) {
                            rVar5 = (x61.r) obj5;
                            if (rVar5.f189277b == null && (d18 = rVar5.f189278c) != null && !Double.isNaN(d18.doubleValue())) {
                                arrayList3.add(obj5);
                            }
                        }
                        listN1 = p13.h0.N0(arrayList3, new x61.l());
                        it = listN1.iterator();
                        do {
                            if (it.hasNext()) {
                                next5 = it.next();
                            } else {
                                next5 = null;
                            }
                            rVar3 = (x61.r) next5;
                            if (rVar3 == null) {
                                rVar4 = (x61.r) p13.h0.d0(listN1);
                            } else {
                                rVar4 = rVar3;
                            }
                            rVar2 = rVar4;
                        } while (((x61.r) next5).f189276a != enumC0736cF);
                        rVar3 = (x61.r) next5;
                        if (rVar3 == null) {
                            rVar4 = (x61.r) p13.h0.d0(listN1);
                        } else {
                            rVar4 = rVar3;
                        }
                        rVar2 = rVar4;
                    } else {
                        rVar2 = null;
                    }
                    resources = kVar.f189262c;
                    if (z16) {
                        com.garmin.android.apps.connectmobile.performance.model.b bVar5 = com.garmin.android.apps.connectmobile.performance.model.b.PAUSE;
                        int i25 = bVar5.f39934a;
                        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                        Drawable drawable = resources.getDrawable(i25, null);
                        String string7 = bVar.getString(bVar5.f39938e);
                        f12.l.f68084a.getClass();
                        String strC2 = kVar.c(f12.l.a.a().V0(), bVar5);
                        String string8 = bVar.getString(bVar5.f39939f);
                        if (rVar2 != null) {
                            d16 = rVar2.f189278c;
                        } else {
                            d16 = null;
                        }
                        if (rVar2 != null) {
                            d17 = rVar2.f189279d;
                        } else {
                            d17 = null;
                        }
                        String strI = kVar.i(d16, d17, z17);
                        if (z24) {
                            string5 = bVar2.getString(R.string.lbl_training_status_load);
                        } else {
                            string5 = bVar2.getString(R.string.lbl_7day_training_load);
                        }
                        String str8 = string5;
                        if (cVarD2 != null) {
                            dValueOf2 = Double.valueOf(cVarD2.I());
                        } else {
                            dValueOf2 = null;
                        }
                        if (cVarD2 != null) {
                            mVarG2 = cVarD2.G();
                        } else {
                            mVarG2 = null;
                        }
                        String strH = kVar.h(dValueOf2, mVarG2, true);
                        if (currentTrainingStatusDTO4 != null || (eVar4 = currentTrainingStatusDTO4.f39903h) == null) {
                            altitudeAcclimationMeters2 = null;
                        } else {
                            altitudeAcclimationMeters2 = eVar4.getAltitudeAcclimationMeters();
                        }
                        if (zS) {
                            a61.e.f1563a.getClass();
                            if (altitudeAcclimationMeters2 != null || altitudeAcclimationMeters2.intValue() <= 0) {
                                strB2 = null;
                            } else {
                                b61.a.f16163a.getClass();
                                strB2 = b61.a.b(bVar2, altitudeAcclimationMeters2, o0VarG, true);
                            }
                        } else {
                            strB2 = null;
                        }
                        if (currentTrainingStatusDTO4 != null || (eVar3 = currentTrainingStatusDTO4.f39903h) == null) {
                            heatAcclimationPercentage2 = null;
                        } else {
                            heatAcclimationPercentage2 = eVar3.getHeatAcclimationPercentage();
                        }
                        a61.e.f1563a.getClass();
                        if (heatAcclimationPercentage2 != null || heatAcclimationPercentage2.intValue() <= 0) {
                            strA3 = null;
                        } else {
                            strA3 = bVar2.a(R.string.lbl_value_percent, String.valueOf(heatAcclimationPercentage2));
                        }
                        if (currentTrainingStatusDTO4 != null) {
                            z27 = currentTrainingStatusDTO4.f39899d;
                        } else {
                            z27 = true;
                        }
                        dVar = new x61.d(drawable, string7, null, string8, strC2, null, strI, strB2, strA3, str8, strH, null, false, true, false, null, z27, 55332, null);
                    } else {
                        int i26 = bVarB.f39934a;
                        ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                        Drawable drawable2 = resources.getDrawable(i26, null);
                        String string9 = bVar.getString(bVarB.f39938e);
                        x61.c.m mVar11 = x61.c.f189186c;
                        if (iVar != 0) {
                            trainingBalanceFeedbackPhraseKey = iVar.getTrainingBalanceFeedbackPhraseKey();
                        } else {
                            trainingBalanceFeedbackPhraseKey = null;
                        }
                        mVar11.getClass();
                        x61.c cVarA = x61.c.m.a(trainingBalanceFeedbackPhraseKey);
                        num = cVarA.f189188b;
                        if (!z24) {
                            strA = null;
                        } else if (num == null && !d53.u.q(cVarA.f189187a, "NO_RESULT", false)) {
                            strA = bVar.a(R.string.string_line_string_pattern, bVar.getString(R.string.lbl_load_focus_lf), bVar.getString(num != null ? num.intValue() : R.string.no_value));
                        }
                        if (cVarD2 != null) {
                            if (cVarD2.f39956o == null && bo1.a.a().c().e()) {
                                String str9 = cVarD2.f39956o;
                                str9.getClass();
                                x61.g gVar = new x61.g(str9);
                                LinkedHashMap linkedHashMap = gVar.f189239b;
                                String str10 = gVar.f189238a;
                                if (((Integer) linkedHashMap.get(str10)) == null) {
                                    iH = cVarD2.H();
                                } else {
                                    Integer num4 = (Integer) linkedHashMap.get(str10);
                                    num4.getClass();
                                    iH = num4.intValue();
                                }
                            } else {
                                iH = cVarD2.H();
                            }
                            numValueOf = Integer.valueOf(iH);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            string = bVar.getString(numValueOf.intValue());
                        } else {
                            string = null;
                        }
                        if (cVarD2 != null) {
                            str5 = cVarD2.f39944c;
                        } else {
                            str5 = null;
                        }
                        String strC3 = kVar.c(str5, bVarB);
                        if (zS || bVarB == com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN) {
                            str6 = null;
                        } else {
                            com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736cF3 = cVarD2 != null ? cVarD2.F() : null;
                            int i27 = enumC0736cF3 == null ? -1 : x61.k.b.f189266c[enumC0736cF3.ordinal()];
                            if (i27 == 1) {
                                string4 = bVar.getString(R.string.lbl_based_on_cycling_vo2_max_trend);
                            } else if (i27 != 2) {
                                string4 = i27 != 3 ? null : bVar.getString(R.string.lbl_based_on_rowing_vo2_max_trend);
                            } else {
                                string4 = bVar.getString(R.string.lbl_based_on_running_vo2_max_trend);
                            }
                            str6 = string4;
                        }
                        if (rVar2 != null) {
                            d14 = rVar2.f189278c;
                        } else {
                            d14 = null;
                        }
                        if (rVar2 != null) {
                            d15 = rVar2.f189279d;
                        } else {
                            d15 = null;
                        }
                        String strI2 = kVar.i(d14, d15, false);
                        if (currentTrainingStatusDTO4 != null || (eVar2 = currentTrainingStatusDTO4.f39903h) == null) {
                            altitudeAcclimationMeters = null;
                        } else {
                            altitudeAcclimationMeters = eVar2.getAltitudeAcclimationMeters();
                        }
                        if (zS) {
                            a61.e.f1563a.getClass();
                            if (altitudeAcclimationMeters != null || altitudeAcclimationMeters.intValue() <= 0) {
                                strB = null;
                            } else {
                                b61.a.f16163a.getClass();
                                strB = b61.a.b(bVar2, altitudeAcclimationMeters, o0VarG, true);
                            }
                        } else {
                            strB = null;
                        }
                        if (currentTrainingStatusDTO4 != null || (eVar = currentTrainingStatusDTO4.f39903h) == null) {
                            heatAcclimationPercentage = null;
                        } else {
                            heatAcclimationPercentage = eVar.getHeatAcclimationPercentage();
                        }
                        a61.e.f1563a.getClass();
                        if (heatAcclimationPercentage != null || heatAcclimationPercentage.intValue() <= 0) {
                            strA2 = null;
                        } else {
                            strA2 = bVar2.a(R.string.lbl_value_percent, String.valueOf(heatAcclimationPercentage));
                        }
                        if (z24) {
                            string2 = bVar2.getString(R.string.lbl_training_status_load);
                        } else {
                            string2 = bVar2.getString(R.string.lbl_7day_training_load);
                        }
                        String str11 = string2;
                        if (cVarD2 != null) {
                            dValueOf = Double.valueOf(cVarD2.I());
                        } else {
                            dValueOf = null;
                        }
                        if (cVarD2 != null) {
                            mVarG = cVarD2.G();
                        } else {
                            mVarG = null;
                        }
                        String strH2 = kVar.h(dValueOf, mVarG, false);
                        bVar3 = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                        if (bVarB == bVar3) {
                            string3 = bVar.getString(R.string.msg_no_status_message_ts2);
                        } else {
                            string3 = null;
                        }
                        if (bVarB == bVar3) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (currentTrainingStatusDTO4 != null) {
                            dateTimeK = c22.j0.K(currentTrainingStatusDTO4.f39900e, "yyyy-MM-dd");
                        } else {
                            dateTimeK = null;
                        }
                        if (currentTrainingStatusDTO4 != null) {
                            z26 = currentTrainingStatusDTO4.f39899d;
                        } else {
                            z26 = true;
                        }
                        dVar = new x61.d(drawable2, string9, strA, string, strC3, str6, strI2, strB, strA2, str11, strH2, string3, z25, false, z15, dateTimeK, z26, 8192, null);
                    }
                    return fw.m.a.g(aVar16, dVar, 1);
                }
                z16 = z28;
                z17 = true;
                iterableK = p13.j0.f134944a;
                ArrayList arrayList4 = new ArrayList();
                while (r0.hasNext()) {
                    rVar6 = (x61.r) obj4;
                    if (rVar6.f189277b == null) {
                    }
                }
                listN0 = p13.h0.N0(arrayList4, new q0());
                if (enumC0736cF2 != null) {
                    rVar = (x61.r) p13.h0.d0(listN0);
                    if (rVar != null) {
                        enumC0736cF2 = rVar.f189276a;
                    } else {
                        enumC0736cF2 = null;
                    }
                } else {
                    rVar = (x61.r) p13.h0.d0(listN0);
                    if (rVar != null) {
                        enumC0736cF2 = rVar.f189276a;
                    } else {
                        enumC0736cF2 = null;
                    }
                }
                xVar.f183273i.j(enumC0736cF2);
                kVar = xVar.f183267c;
                gg1.o0 o0VarG2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                zS = bo1.a.a().c().S();
                zE = bo1.a.a().c().e();
                bVar = kVar.f189261b;
                bVar2 = kVar.f189261b;
                o0VarG2.getClass();
                if (currentTrainingStatusDTO4 != null) {
                    cVarD2 = currentTrainingStatusDTO4.D(str4);
                } else {
                    cVarD2 = null;
                }
                if (zE) {
                    if (cVarD2 != null) {
                        z18 = !cVarD2.f39959r;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        z19 = z17;
                    } else {
                        z19 = false;
                    }
                } else {
                    if (cVarD2 != null) {
                        z18 = !cVarD2.f39959r;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        z19 = z17;
                    } else {
                        z19 = false;
                    }
                }
                if (currentTrainingStatusDTO4 != null) {
                    iVar = null;
                } else {
                    iVar = null;
                }
                z24 = z19;
                if (cVarD2 != null) {
                    bVarB = com.garmin.android.apps.connectmobile.performance.model.b.a.b(com.garmin.android.apps.connectmobile.performance.model.b.f39921h, cVarD2.f39950i);
                    if (bVarB == null) {
                        bVarB = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                    }
                } else {
                    bVarB = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                }
                if (currentTrainingStatusDTO4 != null) {
                    if (cVarD2 != null) {
                        enumC0736cF = cVarD2.F();
                    } else {
                        enumC0736cF = null;
                    }
                    com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c7 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.CYCLING;
                    map = currentTrainingStatusDTO4.f39896a;
                    if (map != null) {
                        qVar = map.get("cycling");
                    } else {
                        qVar = null;
                    }
                    if (qVar != null) {
                        dateTimeK2 = c22.j0.K(qVar.getCalendarDate(), "yyyy-MM-dd");
                    } else {
                        dateTimeK2 = null;
                    }
                    x61.r rVar14 = new x61.r(enumC0736c7, dateTimeK2, Double.valueOf(currentTrainingStatusDTO4.F("cycling")), Double.valueOf(currentTrainingStatusDTO4.C("cycling")));
                    com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c8 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.ROWING;
                    map2 = currentTrainingStatusDTO4.f39896a;
                    if (map2 != null) {
                        qVar2 = map2.get("rowing");
                    } else {
                        qVar2 = null;
                    }
                    if (qVar2 != null) {
                        dateTimeK3 = c22.j0.K(qVar2.getCalendarDate(), "yyyy-MM-dd");
                    } else {
                        dateTimeK3 = null;
                    }
                    x61.r rVar15 = new x61.r(enumC0736c8, dateTimeK3, Double.valueOf(currentTrainingStatusDTO4.F("rowing")), Double.valueOf(currentTrainingStatusDTO4.C("rowing")));
                    com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c9 = com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.RUNNING;
                    map3 = currentTrainingStatusDTO4.f39896a;
                    if (map3 != null) {
                        qVar3 = map3.get("generic");
                    } else {
                        qVar3 = null;
                    }
                    if (qVar3 != null) {
                        dateTimeK4 = c22.j0.K(qVar3.getCalendarDate(), "yyyy-MM-dd");
                    } else {
                        dateTimeK4 = null;
                    }
                    List listK2 = p13.x.k(rVar14, rVar15, new x61.r(enumC0736c9, dateTimeK4, Double.valueOf(currentTrainingStatusDTO4.F("generic")), Double.valueOf(currentTrainingStatusDTO4.C("generic"))));
                    ArrayList arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        rVar5 = (x61.r) obj5;
                        if (rVar5.f189277b == null) {
                        }
                    }
                    listN1 = p13.h0.N0(arrayList5, new x61.l());
                    it = listN1.iterator();
                    do {
                        if (it.hasNext()) {
                            next5 = it.next();
                        } else {
                            next5 = null;
                        }
                        rVar3 = (x61.r) next5;
                        if (rVar3 == null) {
                            rVar4 = (x61.r) p13.h0.d0(listN1);
                        } else {
                            rVar4 = rVar3;
                        }
                        rVar2 = rVar4;
                    } while (((x61.r) next5).f189276a != enumC0736cF);
                    rVar3 = (x61.r) next5;
                    if (rVar3 == null) {
                        rVar4 = (x61.r) p13.h0.d0(listN1);
                    } else {
                        rVar4 = rVar3;
                    }
                    rVar2 = rVar4;
                } else {
                    rVar2 = null;
                }
                resources = kVar.f189262c;
                if (z16) {
                    com.garmin.android.apps.connectmobile.performance.model.b bVar6 = com.garmin.android.apps.connectmobile.performance.model.b.PAUSE;
                    int i28 = bVar6.f39934a;
                    ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
                    Drawable drawable3 = resources.getDrawable(i28, null);
                    String string10 = bVar.getString(bVar6.f39938e);
                    f12.l.f68084a.getClass();
                    String strC4 = kVar.c(f12.l.a.a().V0(), bVar6);
                    String string11 = bVar.getString(bVar6.f39939f);
                    if (rVar2 != null) {
                        d16 = rVar2.f189278c;
                    } else {
                        d16 = null;
                    }
                    if (rVar2 != null) {
                        d17 = rVar2.f189279d;
                    } else {
                        d17 = null;
                    }
                    String strI3 = kVar.i(d16, d17, z17);
                    if (z24) {
                        string5 = bVar2.getString(R.string.lbl_training_status_load);
                    } else {
                        string5 = bVar2.getString(R.string.lbl_7day_training_load);
                    }
                    String str12 = string5;
                    if (cVarD2 != null) {
                        dValueOf2 = Double.valueOf(cVarD2.I());
                    } else {
                        dValueOf2 = null;
                    }
                    if (cVarD2 != null) {
                        mVarG2 = cVarD2.G();
                    } else {
                        mVarG2 = null;
                    }
                    String strH3 = kVar.h(dValueOf2, mVarG2, true);
                    if (currentTrainingStatusDTO4 != null) {
                        altitudeAcclimationMeters2 = null;
                    } else {
                        altitudeAcclimationMeters2 = null;
                    }
                    if (zS) {
                        a61.e.f1563a.getClass();
                        if (altitudeAcclimationMeters2 != null) {
                            strB2 = null;
                        } else {
                            strB2 = null;
                        }
                    } else {
                        strB2 = null;
                    }
                    if (currentTrainingStatusDTO4 != null) {
                        heatAcclimationPercentage2 = null;
                    } else {
                        heatAcclimationPercentage2 = null;
                    }
                    a61.e.f1563a.getClass();
                    if (heatAcclimationPercentage2 != null) {
                        strA3 = null;
                    } else {
                        strA3 = null;
                    }
                    if (currentTrainingStatusDTO4 != null) {
                        z27 = currentTrainingStatusDTO4.f39899d;
                    } else {
                        z27 = true;
                    }
                    dVar = new x61.d(drawable3, string10, null, string11, strC4, null, strI3, strB2, strA3, str12, strH3, null, false, true, false, null, z27, 55332, null);
                } else {
                    int i29 = bVarB.f39934a;
                    ThreadLocal<TypedValue> threadLocal4 = b7.g.f16255a;
                    Drawable drawable4 = resources.getDrawable(i29, null);
                    String string12 = bVar.getString(bVarB.f39938e);
                    x61.c.m mVar12 = x61.c.f189186c;
                    if (iVar != 0) {
                        trainingBalanceFeedbackPhraseKey = iVar.getTrainingBalanceFeedbackPhraseKey();
                    } else {
                        trainingBalanceFeedbackPhraseKey = null;
                    }
                    mVar12.getClass();
                    x61.c cVarA2 = x61.c.m.a(trainingBalanceFeedbackPhraseKey);
                    num = cVarA2.f189188b;
                    if (!z24) {
                        strA = null;
                    } else {
                        strA = num == null ? bVar.a(R.string.string_line_string_pattern, bVar.getString(R.string.lbl_load_focus_lf), bVar.getString(R.string.common_not_available)) : bVar.a(R.string.string_line_string_pattern, bVar.getString(R.string.lbl_load_focus_lf), bVar.getString(R.string.common_not_available));
                    }
                    if (cVarD2 != null) {
                        if (cVarD2.f39956o == null) {
                            iH = cVarD2.H();
                        } else {
                            iH = cVarD2.H();
                        }
                        numValueOf = Integer.valueOf(iH);
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        string = bVar.getString(numValueOf.intValue());
                    } else {
                        string = null;
                    }
                    if (cVarD2 != null) {
                        str5 = cVarD2.f39944c;
                    } else {
                        str5 = null;
                    }
                    String strC5 = kVar.c(str5, bVarB);
                    if (zS) {
                        str6 = null;
                    } else {
                        str6 = null;
                    }
                    if (rVar2 != null) {
                        d14 = rVar2.f189278c;
                    } else {
                        d14 = null;
                    }
                    if (rVar2 != null) {
                        d15 = rVar2.f189279d;
                    } else {
                        d15 = null;
                    }
                    String strI4 = kVar.i(d14, d15, false);
                    if (currentTrainingStatusDTO4 != null) {
                        altitudeAcclimationMeters = null;
                    } else {
                        altitudeAcclimationMeters = null;
                    }
                    if (zS) {
                        a61.e.f1563a.getClass();
                        if (altitudeAcclimationMeters != null) {
                            strB = null;
                        } else {
                            strB = null;
                        }
                    } else {
                        strB = null;
                    }
                    if (currentTrainingStatusDTO4 != null) {
                        heatAcclimationPercentage = null;
                    } else {
                        heatAcclimationPercentage = null;
                    }
                    a61.e.f1563a.getClass();
                    if (heatAcclimationPercentage != null) {
                        strA2 = null;
                    } else {
                        strA2 = null;
                    }
                    if (z24) {
                        string2 = bVar2.getString(R.string.lbl_training_status_load);
                    } else {
                        string2 = bVar2.getString(R.string.lbl_7day_training_load);
                    }
                    String str13 = string2;
                    if (cVarD2 != null) {
                        dValueOf = Double.valueOf(cVarD2.I());
                    } else {
                        dValueOf = null;
                    }
                    if (cVarD2 != null) {
                        mVarG = cVarD2.G();
                    } else {
                        mVarG = null;
                    }
                    String strH4 = kVar.h(dValueOf, mVarG, false);
                    bVar3 = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                    if (bVarB == bVar3) {
                        string3 = bVar.getString(R.string.msg_no_status_message_ts2);
                    } else {
                        string3 = null;
                    }
                    if (bVarB == bVar3) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (currentTrainingStatusDTO4 != null) {
                        dateTimeK = c22.j0.K(currentTrainingStatusDTO4.f39900e, "yyyy-MM-dd");
                    } else {
                        dateTimeK = null;
                    }
                    if (currentTrainingStatusDTO4 != null) {
                        z26 = currentTrainingStatusDTO4.f39899d;
                    } else {
                        z26 = true;
                    }
                    dVar = new x61.d(drawable4, string12, strA, string, strC5, str6, strI4, strB, strA2, str13, strH4, string3, z25, false, z15, dateTimeK, z26, 8192, null);
                }
                return fw.m.a.g(aVar16, dVar, 1);
        }
    }
}
