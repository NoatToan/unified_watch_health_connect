package uf2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import of2.z0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import u1.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Luf2/d;", "Luf2/t;", "Lsf2/f;", "Lvf2/q;", "workoutDataSource", "Luf2/y0;", "metricsConfigRepeatTimer", "Lof2/z0;", "metricsDefinitionProvider", "<init>", "(Lvf2/q;Luf2/y0;Lof2/z0;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends t<sf2.f> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f170313j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf2.q f170314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f170315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0 f170316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f170317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f170318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f170319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f170320i;

    static {
        new a(null);
    }

    public d(vf2.q qVar, y0 y0Var, z0 z0Var) {
        qVar.getClass();
        y0Var.getClass();
        z0Var.getClass();
        this.f170314c = qVar;
        this.f170315d = y0Var;
        this.f170316e = z0Var;
        this.f170317f = o13.m.b(new p1(18));
        this.f170318g = o13.m.b(new p1(19));
        this.f170319h = o13.m.b(new p1(20));
        this.f170320i = o13.m.b(new p1(21));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00eb A[LOOP:2: B:36:0x00e5->B:38:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(GDILiveSessionProto.ActivityStartRequest activityStartRequest, String str, v13.c cVar) {
        e eVar;
        String str2;
        GDILiveSessionProto.ActivityStartRequest activityStartRequest2;
        Integer num;
        List<GDILiveSessionProto.PowerCurveEntry> powerCurveEntriesList;
        Iterator<T> it;
        GDILiveSessionProto.PowerCurveEntry powerCurveEntry;
        ArrayList arrayList;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f170328f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f170328f = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objB = eVar.f170326d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f170328f;
        o13.t tVar = this.f170318g;
        if (i15 != 0) {
            if (i15 == 1) {
                str = eVar.f170324b;
                activityStartRequest = eVar.f170323a;
                o13.r.b(objB);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                num = eVar.f170325c;
                o13.r.b(objB);
            }
            List<o13.p> list = (List) objB;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                for (o13.p pVar : list) {
                    arrayList2.add(new lt2.c(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionStartInteractor", "getPowerData powerCurveData: " + arrayList);
            if (num != null || arrayList == null) {
                return null;
            }
            return new zf2.g(num.intValue(), arrayList);
        }
        o13.r.b(objB);
        if (activityStartRequest.hasFtp()) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionStartInteractor", "getPowerData Ftp - source: activityStartRequest");
            str2 = str;
            activityStartRequest2 = activityStartRequest;
            num = new Integer(activityStartRequest.getFtp());
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionStartInteractor", "getPowerData Ftp: " + num);
            if (activityStartRequest2.getPowerCurveEntriesCount() > 0) {
                powerCurveEntriesList = activityStartRequest2.getPowerCurveEntriesList();
                powerCurveEntriesList.getClass();
                if (!powerCurveEntriesList.isEmpty()) {
                    it = powerCurveEntriesList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            powerCurveEntry = (GDILiveSessionProto.PowerCurveEntry) it.next();
                            if (powerCurveEntry.getPower() <= 0 || powerCurveEntry.getDuration() > 0) {
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LSVSessionStartInteractor", "getPowerData powerCurveData - source: activityStartRequest");
                                List<GDILiveSessionProto.PowerCurveEntry> powerCurveEntriesList2 = activityStartRequest2.getPowerCurveEntriesList();
                                powerCurveEntriesList2.getClass();
                                arrayList = new ArrayList();
                                for (GDILiveSessionProto.PowerCurveEntry powerCurveEntry2 : powerCurveEntriesList2) {
                                    arrayList.add(new lt2.c(powerCurveEntry2.getDuration(), powerCurveEntry2.getPower()));
                                }
                            }
                        }
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LSVSessionStartInteractor", "getPowerData powerCurveData: " + arrayList);
                        if (num != null) {
                        }
                        return null;
                    }
                }
            }
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionStartInteractor", "getPowerData powerCurveData - source: powerDataProvider");
            tf2.i iVar = (tf2.i) tVar.getValue();
            eVar.f170323a = null;
            eVar.f170324b = null;
            eVar.f170325c = num;
            eVar.f170328f = 2;
            objB = iVar.a(str2, eVar);
        } else {
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionStartInteractor", "getPowerData Ftp - source: powerDataProvider");
            tf2.i iVar2 = (tf2.i) tVar.getValue();
            eVar.f170323a = activityStartRequest;
            eVar.f170324b = str;
            eVar.f170328f = 1;
            objB = iVar2.b(str, eVar);
        }
        return aVar;
        String str3 = str;
        activityStartRequest2 = activityStartRequest;
        num = (Integer) objB;
        str2 = str3;
        zg2.c.f204692a.getClass();
        zg2.c.a("LSVSessionStartInteractor", "getPowerData Ftp: " + num);
        if (activityStartRequest2.getPowerCurveEntriesCount() > 0) {
            powerCurveEntriesList = activityStartRequest2.getPowerCurveEntriesList();
            powerCurveEntriesList.getClass();
            if (!powerCurveEntriesList.isEmpty()) {
                it = powerCurveEntriesList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        powerCurveEntry = (GDILiveSessionProto.PowerCurveEntry) it.next();
                        if (powerCurveEntry.getPower() <= 0) {
                        }
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LSVSessionStartInteractor", "getPowerData powerCurveData - source: activityStartRequest");
                        List<GDILiveSessionProto.PowerCurveEntry> powerCurveEntriesList3 = activityStartRequest2.getPowerCurveEntriesList();
                        powerCurveEntriesList3.getClass();
                        arrayList = new ArrayList();
                        while (r12.hasNext()) {
                            arrayList.add(new lt2.c(powerCurveEntry2.getDuration(), powerCurveEntry2.getPower()));
                        }
                    }
                    zg2.c.f204692a.getClass();
                    zg2.c.a("LSVSessionStartInteractor", "getPowerData powerCurveData: " + arrayList);
                    if (num != null) {
                    }
                    return null;
                }
            }
        }
        zg2.c.f204692a.getClass();
        zg2.c.a("LSVSessionStartInteractor", "getPowerData powerCurveData - source: powerDataProvider");
        tf2.i iVar3 = (tf2.i) tVar.getValue();
        eVar.f170323a = null;
        eVar.f170324b = null;
        eVar.f170325c = num;
        eVar.f170328f = 2;
        objB = iVar3.a(str2, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x048c  */
    /* JADX WARN: Code duplicated, block: B:101:0x0492  */
    /* JADX WARN: Code duplicated, block: B:102:0x04af  */
    /* JADX WARN: Code duplicated, block: B:104:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:109:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:114:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x050f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0511  */
    /* JADX WARN: Code duplicated, block: B:124:0x0518  */
    /* JADX WARN: Code duplicated, block: B:126:0x0525  */
    /* JADX WARN: Code duplicated, block: B:133:0x0564  */
    /* JADX WARN: Code duplicated, block: B:136:0x0575 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0577  */
    /* JADX WARN: Code duplicated, block: B:138:0x0584  */
    /* JADX WARN: Code duplicated, block: B:139:0x0587  */
    /* JADX WARN: Code duplicated, block: B:145:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:147:0x05de  */
    /* JADX WARN: Code duplicated, block: B:150:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:151:0x0604  */
    /* JADX WARN: Code duplicated, block: B:154:0x060b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0666  */
    /* JADX WARN: Code duplicated, block: B:182:0x0680  */
    /* JADX WARN: Code duplicated, block: B:185:0x0692  */
    /* JADX WARN: Code duplicated, block: B:187:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:189:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:193:0x06be  */
    /* JADX WARN: Code duplicated, block: B:197:0x06d6 A[LOOP:2: B:195:0x06d0->B:197:0x06d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:202:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:203:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:206:0x070d  */
    /* JADX WARN: Code duplicated, block: B:208:0x071d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0727  */
    /* JADX WARN: Code duplicated, block: B:214:0x0735  */
    /* JADX WARN: Code duplicated, block: B:218:0x0749 A[LOOP:4: B:216:0x0743->B:218:0x0749, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x0769  */
    /* JADX WARN: Code duplicated, block: B:227:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:230:0x081c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0822  */
    /* JADX WARN: Code duplicated, block: B:233:0x0833  */
    /* JADX WARN: Code duplicated, block: B:236:0x083d  */
    /* JADX WARN: Code duplicated, block: B:239:0x084f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0861  */
    /* JADX WARN: Code duplicated, block: B:243:0x086e  */
    /* JADX WARN: Code duplicated, block: B:246:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:247:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:250:0x095d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0960  */
    /* JADX WARN: Code duplicated, block: B:255:0x098f A[LOOP:0: B:253:0x0989->B:255:0x098f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:278:0x0a7d A[Catch: ProtobufException -> 0x0b87, TryCatch #14 {ProtobufException -> 0x0b87, blocks: (B:276:0x0a47, B:278:0x0a7d, B:280:0x0a89, B:282:0x0ab7), top: B:370:0x0a47 }] */
    /* JADX WARN: Code duplicated, block: B:282:0x0ab7 A[Catch: ProtobufException -> 0x0b87, TRY_LEAVE, TryCatch #14 {ProtobufException -> 0x0b87, blocks: (B:276:0x0a47, B:278:0x0a7d, B:280:0x0a89, B:282:0x0ab7), top: B:370:0x0a47 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x0ad7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:288:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:295:0x0b32  */
    /* JADX WARN: Code duplicated, block: B:338:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:375:0x06b7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0730 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x030f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0315  */
    /* JADX WARN: Code duplicated, block: B:64:0x0323  */
    /* JADX WARN: Code duplicated, block: B:69:0x036d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0378  */
    /* JADX WARN: Code duplicated, block: B:76:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:78:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0415  */
    /* JADX WARN: Code duplicated, block: B:86:0x0424  */
    /* JADX WARN: Code duplicated, block: B:89:0x0462  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x046b  */
    /* JADX WARN: Code duplicated, block: B:92:0x046d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0474  */
    /* JADX WARN: Code duplicated, block: B:99:0x0482  */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x05d2, code lost:
    
        if (r2.emit(r3, r9) == r11) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0308, code lost:
    
        if (r3.emit(r18, r9) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0366, code lost:
    
        if (r3.emit(r18, r9) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03ac, code lost:
    
        if (r3.emit(r18, r9) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03f2, code lost:
    
        if (r3.emit(r18, r9) == r2) goto L43;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x0492, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x04af, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0055: MOVE (r17 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:18:0x0054 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(GDILiveSessionProto.ActivityStartRequest activityStartRequest, rs2.c cVar, dt2.g gVar, int i14, fg2.d dVar, v13.c cVar2) {
        f fVar;
        rs2.c cVar3;
        rs2.c cVar4;
        ?? r14;
        ProtobufException protobufException;
        int i15;
        boolean z14;
        boolean z15;
        int i16;
        e2 e2VarA;
        sf2.f.b bVar;
        GDILiveSessionProto.ActivityStartRequest activityStartRequest2;
        rs2.c cVar5;
        dt2.g gVar2;
        fg2.d dVar2;
        int i17;
        Object objA;
        boolean zBooleanValue;
        Object objD;
        rs2.c cVar6;
        fg2.d dVar3;
        int i18;
        GDILiveSessionProto.ActivityStartRequest activityStartRequest3;
        dt2.g gVar3;
        boolean z16;
        Object obj;
        boolean zBooleanValue2;
        e2 e2VarA2;
        sf2.f.b bVar2;
        UUID uuidC;
        rs2.c cVar7;
        int sportFitType;
        int sportFitSubType;
        String strD;
        fg2.d dVar4;
        zf2.d dVarA;
        dt2.g gVar4;
        zg2.i iVar;
        u13.a aVar;
        GDILiveSessionProto.ActivityStartRequest activityStartRequest4;
        int i19;
        u13.a aVar2;
        String str;
        GDIDataTypes.UUID workoutFileUid;
        u13.a aVar3;
        rf2.l bVar3;
        int i24;
        String str2;
        List listZ;
        Iterator it;
        int i25;
        ArrayList arrayList;
        Iterator it3;
        ArrayList arrayListZ;
        zf2.f fVar2;
        GDILiveSessionProto.Zones zones;
        int i26;
        GDILiveSessionProto.ActivityStartRequest activityStartRequest5;
        dt2.g gVar5;
        int i27;
        List list;
        GDIDataTypes.UUID uuid;
        Object objB;
        boolean z17;
        int i28;
        boolean z18;
        zf2.d dVar5;
        int i29;
        u13.a aVar4;
        Object obj2;
        List list2;
        String str3;
        int i30;
        GDILiveSessionProto.ActivityStartRequest activityStartRequest6;
        zf2.f fVar3;
        UUID uuid2;
        int i34;
        String str4;
        rf2.l lVar;
        rs2.c cVar8;
        Iterator it4;
        ArrayList arrayList2;
        Iterator it5;
        GDILiveSessionProto.Zones zones2;
        int i35;
        String str5;
        Object objB2;
        Object obj3;
        boolean z19;
        Object obj4;
        String str6;
        UUID uuid3;
        int i36;
        int i37;
        String str7;
        int i38;
        int i39;
        boolean z24;
        boolean z25;
        boolean z26;
        o13.t tVar;
        String strA;
        o13.t tVar2;
        zf2.g gVar6;
        GDILiveSessionProto.Target target;
        int i44;
        ArrayList arrayList3;
        List listB1;
        int i45;
        int i46;
        int i47;
        boolean z27;
        boolean z28;
        rf2.l lVar2;
        Object objC;
        u13.a aVar5;
        List list3;
        Object obj5;
        u13.a aVar6;
        rs2.c cVar9;
        zf2.d dVar6;
        boolean z29;
        boolean z34;
        int i48;
        int i49;
        int i54;
        int i55;
        List list4;
        zf2.g gVar7;
        rf2.l lVar3;
        zf2.f fVar4;
        vf2.p pVar;
        int i56;
        zf2.f fVar5;
        List list5;
        u13.a aVar7;
        boolean z35;
        zf2.g gVar8;
        boolean z36;
        int i57;
        List list6;
        rf2.l lVar4;
        Object objB3;
        Object obj6;
        int i58;
        zf2.f fVar6;
        boolean z37;
        rs2.c cVar10;
        List list7;
        vf2.p pVar2;
        zf2.g gVar9;
        boolean z38;
        int i59;
        boolean z39;
        ArrayList arrayList4;
        boolean z44;
        Iterator it6;
        GDISmartProto.Smart smartBuild;
        boolean z45;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        vf2.p pVar3;
        Object objB4;
        List list8;
        String str8;
        int i69;
        int i74;
        boolean z46;
        zf2.g gVar10;
        UUID uuid4;
        int i75;
        GDISmartProto.Smart smart;
        int i76;
        int i77;
        int i78;
        GDISmartProto.Smart smart2;
        rf2.l lVar5;
        y0 y0Var;
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveSessionProto.LiveSessionService> generatedExtension;
        List<Integer> typesList;
        sf2.f.c cVar11;
        zf2.d dVar7;
        String str9;
        rs2.c cVar12;
        e2 e2VarA3;
        int i79;
        if (cVar2 instanceof f) {
            fVar = (f) cVar2;
            int i84 = fVar.C;
            if ((i84 & Integer.MIN_VALUE) != 0) {
                fVar.C = i84 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar2);
            }
        } else {
            fVar = new f(this, cVar2);
        }
        f fVar7 = fVar;
        Object obj7 = fVar7.A;
        u13.a aVar8 = u13.a.COROUTINE_SUSPENDED;
        int i85 = fVar7.C;
        o13.t tVar3 = this.f170317f;
        y0 y0Var2 = this.f170315d;
        int i86 = 1;
        String str10 = "LSVSessionStartInteractor";
        try {
            switch (i85) {
                case 0:
                    o13.r.b(obj7);
                    fg2.z zVar = (fg2.z) this.f170319h.getValue();
                    activityStartRequest2 = activityStartRequest;
                    fVar7.f170332a = activityStartRequest2;
                    cVar5 = cVar;
                    fVar7.f170333b = cVar5;
                    gVar2 = gVar;
                    fVar7.f170334c = gVar2;
                    dVar2 = dVar;
                    fVar7.f170335d = dVar2;
                    i17 = i14;
                    fVar7.f170350t = i17;
                    fVar7.C = 1;
                    objA = zVar.a(fVar7);
                    if (objA != aVar8) {
                        zBooleanValue = ((Boolean) objA).booleanValue();
                        fg2.c cVar13 = (fg2.c) this.f170320i.getValue();
                        long f172494b = cVar5.getF92746j();
                        fVar7.f170332a = activityStartRequest2;
                        fVar7.f170333b = cVar5;
                        fVar7.f170334c = gVar2;
                        fVar7.f170335d = dVar2;
                        fVar7.f170350t = i17;
                        fVar7.f170354y = zBooleanValue;
                        fVar7.C = 2;
                        objD = cVar13.d(f172494b, fVar7);
                        if (objD != aVar8) {
                            cVar6 = cVar5;
                            dVar3 = dVar2;
                            i18 = i17;
                            activityStartRequest3 = activityStartRequest2;
                            gVar3 = gVar2;
                            z16 = zBooleanValue;
                            obj = objD;
                            zBooleanValue2 = ((Boolean) obj).booleanValue();
                            if (z16 && !zBooleanValue2) {
                                zg2.c.f204692a.getClass();
                                zg2.c.d("LSVSessionStartInteractor", "Device is not a manual device and user doesn't have access to Live Activity.");
                                return Unit.INSTANCE;
                            }
                            if (activityStartRequest3.hasSportProfile()) {
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LSVSessionStartInteractor", "Missing sport profile");
                                e2 e2VarA4 = getF170500a();
                                sf2.f.b bVar4 = new sf2.f.b(null, sf2.f.b.a.C3008f.f159003a, cVar6, 1, null);
                                fVar7.f170332a = null;
                                fVar7.f170333b = null;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.C = 3;
                            } else {
                                if (!activityStartRequest3.hasUuid()) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LSVSessionStartInteractor", "Missing UUID.");
                                    e2VarA2 = getF170500a();
                                    bVar2 = new sf2.f.b(null, sf2.f.b.a.c.f159000a, cVar6, 1, null);
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = null;
                                    fVar7.f170334c = null;
                                    fVar7.f170335d = null;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.C = 5;
                                    if (e2VarA2.emit(bVar2, fVar7) == aVar8) {
                                        return aVar8;
                                    }
                                    return Unit.INSTANCE;
                                }
                                GDIDataTypes.UUID uuid5 = activityStartRequest3.getUuid();
                                uuid5.getClass();
                                uuidC = lk2.y.c(uuid5);
                                if (uuidC == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LSVSessionStartInteractor", "Missing UUID - Error converting UUID to java.util.UUID");
                                    e2 e2VarA5 = getF170500a();
                                    GDIDataTypes.UUID uuid6 = activityStartRequest3.getUuid();
                                    uuid6.getClass();
                                    sf2.f.b bVar5 = new sf2.f.b(null, new sf2.f.b.a.C3006a(uuid6), cVar6, 1, null);
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = null;
                                    fVar7.f170334c = null;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = null;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = 0;
                                    fVar7.C = 4;
                                } else if (!activityStartRequest3.getSportProfile().hasSportFitType()) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("LSVSessionStartInteractor", "Missing sport type");
                                    e2 e2VarA6 = getF170500a();
                                    sf2.f.b bVar6 = new sf2.f.b(null, sf2.f.b.a.e.f159002a, cVar6, 1, null);
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = null;
                                    fVar7.f170334c = null;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = null;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.C = 6;
                                } else if (!activityStartRequest3.getSportProfile().hasSportFitSubType()) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("LSVSessionStartInteractor", "Missing sub sport type");
                                    e2 e2VarA7 = getF170500a();
                                    sf2.f.b bVar7 = new sf2.f.b(null, sf2.f.b.a.d.f159001a, cVar6, 1, null);
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = null;
                                    fVar7.f170334c = null;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = null;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.C = 7;
                                } else {
                                    cVar7 = cVar6;
                                    sportFitType = activityStartRequest3.getSportProfile().getSportFitType();
                                    sportFitSubType = activityStartRequest3.getSportProfile().getSportFitSubType();
                                    if (activityStartRequest3.getSportProfile().hasName()) {
                                        strD = activityStartRequest3.getSportProfile().getName();
                                    } else {
                                        strD = null;
                                    }
                                    dVar4 = dVar3;
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LSVSessionStartInteractor", "sportType " + sportFitType + ", subSportType: " + sportFitSubType);
                                    zf2.d.f204601l.getClass();
                                    dVarA = zf2.d.a.a(sportFitType, sportFitSubType);
                                    gVar4 = gVar3;
                                    iVar = (zg2.i) KoinJavaComponent.get$default(zg2.i.class, null, null, 6, null);
                                    if (dVarA != null) {
                                        iVar.getClass();
                                        dVar4.getClass();
                                        if (i18 >= 2) {
                                            z24 = true;
                                        } else {
                                            z24 = false;
                                        }
                                        if (zBooleanValue2 || !z24) {
                                            z25 = false;
                                        } else {
                                            z25 = true;
                                        }
                                        switch (zg2.i.b.f204716a[dVarA.ordinal()]) {
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                            case 16:
                                            case 17:
                                            case 18:
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                            case 23:
                                            case 24:
                                            case 25:
                                            case 26:
                                            case 27:
                                            case 28:
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                            case 33:
                                            case 34:
                                            case 35:
                                            case 36:
                                            case 37:
                                            case 38:
                                            case 39:
                                            case 40:
                                            case 41:
                                            case 42:
                                            case 43:
                                            case 44:
                                            case 45:
                                            case 46:
                                            case 47:
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                                activityStartRequest4 = activityStartRequest3;
                                                if (z16 || !z24) {
                                                    z26 = false;
                                                } else {
                                                    z26 = true;
                                                }
                                                aVar = aVar8;
                                                zg2.c.f204692a.getClass();
                                                zg2.c.a("ValidateActivityTypeUseCase", "canShowGCPlusLiveActivity: " + z26 + ", canShowManualStart: " + z25);
                                                z25 = !z26 || z25;
                                                break;
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 67:
                                            case 68:
                                            case 69:
                                            case 70:
                                            case 71:
                                            case 72:
                                            case 73:
                                                activityStartRequest4 = activityStartRequest3;
                                                zg2.c.f204692a.getClass();
                                                zg2.c.a("ValidateActivityTypeUseCase", "hasGCPlus: " + z16 + ", isManualStart: " + zBooleanValue2);
                                                if (z16 && !zBooleanValue2) {
                                                    aVar = aVar8;
                                                } else {
                                                    aVar = aVar8;
                                                }
                                                break;
                                            case 74:
                                            case 75:
                                            case 76:
                                            case 77:
                                            case 78:
                                            case 79:
                                            case 80:
                                            case 81:
                                            case 82:
                                            case 83:
                                            case 84:
                                            case 85:
                                            case 86:
                                            case 87:
                                            case 88:
                                            case 89:
                                            case 90:
                                            case 91:
                                            case 92:
                                            case 93:
                                            case 94:
                                            case 95:
                                            case 96:
                                            case 97:
                                                activityStartRequest4 = activityStartRequest3;
                                                zg2.c.f204692a.getClass();
                                                zg2.c.a("ValidateActivityTypeUseCase", "canShowManualStart: " + z25);
                                                aVar = aVar8;
                                                break;
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                            case 102:
                                            case 103:
                                                aVar = aVar8;
                                                activityStartRequest4 = activityStartRequest3;
                                                break;
                                            default:
                                                lc.u0.r();
                                                z25 = false;
                                                aVar = aVar8;
                                                activityStartRequest4 = activityStartRequest3;
                                                break;
                                        }
                                        if (z25) {
                                            i19 = 0;
                                        }
                                        if (i19 != 0) {
                                            zg2.c.d("LSVSessionStartInteractor", am.j.g(sportFitType, sportFitSubType, "Unsupported activity type (sportType: ", ", subSportType: ", ")"));
                                            if (dVarA != null || (str7 = dVarA.f204629a) == null) {
                                                tf2.g gVar11 = (tf2.g) tVar3.getValue();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = null;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuidC;
                                                fVar7.f170337f = strD;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170350t = i18;
                                                fVar7.f170354y = z16;
                                                fVar7.f170355z = zBooleanValue2;
                                                fVar7.f170351v = sportFitType;
                                                fVar7.f170352w = sportFitSubType;
                                                fVar7.f170353x = i19;
                                                fVar7.C = 8;
                                                objB2 = gVar11.b(sportFitType, sportFitSubType, fVar7);
                                                obj3 = aVar;
                                                if (objB2 != obj3) {
                                                    z19 = zBooleanValue2;
                                                    obj4 = objB2;
                                                    str6 = strD;
                                                    uuid3 = uuidC;
                                                    i36 = sportFitType;
                                                    i37 = sportFitSubType;
                                                    tVar2 = tVar3;
                                                    i39 = i37;
                                                    i38 = i36;
                                                    uuidC = uuid3;
                                                    str7 = (String) obj4;
                                                    zBooleanValue2 = z19;
                                                    tVar = tVar2;
                                                    if (str6 == null) {
                                                        tVar = tVar3;
                                                        strA = str6;
                                                    } else if (str7 != null) {
                                                        strA = ((tf2.g) tVar.getValue()).a(str7);
                                                    } else {
                                                        strA = null;
                                                    }
                                                    sf2.f.d dVar8 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                                                    e2 e2VarA8 = getF170500a();
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = null;
                                                    fVar7.f170334c = null;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = null;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = null;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = null;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170350t = i18;
                                                    fVar7.f170354y = z16;
                                                    fVar7.f170355z = zBooleanValue2;
                                                    fVar7.f170351v = i38;
                                                    fVar7.f170352w = i39;
                                                    fVar7.f170353x = i19;
                                                    fVar7.C = 9;
                                                }
                                                break;
                                            } else {
                                                str6 = strD;
                                                i38 = sportFitType;
                                                i39 = sportFitSubType;
                                                obj3 = aVar;
                                                if (str6 == null) {
                                                    tVar = tVar3;
                                                    strA = str6;
                                                } else if (str7 != null) {
                                                    strA = ((tf2.g) tVar.getValue()).a(str7);
                                                } else {
                                                    strA = null;
                                                }
                                                sf2.f.d dVar9 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                                                e2 e2VarA9 = getF170500a();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = null;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170350t = i18;
                                                fVar7.f170354y = z16;
                                                fVar7.f170355z = zBooleanValue2;
                                                fVar7.f170351v = i38;
                                                fVar7.f170352w = i39;
                                                fVar7.f170353x = i19;
                                                fVar7.C = 9;
                                                break;
                                            }
                                            return obj3;
                                        }
                                        aVar2 = aVar;
                                        str = dVarA.f204629a;
                                        if (strD == null) {
                                            strD = ((tf2.g) tVar3.getValue()).d(dVarA);
                                        }
                                        zg2.c.a("LSVSessionStartInteractor", "Activity type " + dVarA);
                                        if (activityStartRequest4.hasWorkoutFileUid()) {
                                            workoutFileUid = activityStartRequest4.getWorkoutFileUid();
                                        } else {
                                            workoutFileUid = null;
                                        }
                                        if (activityStartRequest4.hasWorkoutSession() || !activityStartRequest4.getWorkoutSession().hasType()) {
                                            aVar3 = aVar2;
                                        } else {
                                            GDILiveSessionProto.WorkoutSession.Type type = activityStartRequest4.getWorkoutSession().getType();
                                            type.getClass();
                                            boolean z47 = activityStartRequest4.getWorkoutSession().hasHasWarmupStart() && activityStartRequest4.getWorkoutSession().getHasWarmupStart();
                                            int i87 = zg2.f.a.f204699f[type.ordinal()];
                                            aVar3 = aVar2;
                                            if (i87 == 1) {
                                                bVar3 = new rf2.l.b(z47);
                                            } else if (i87 == 2) {
                                                bVar3 = rf2.l.c.f152498a;
                                            } else if (i87 == 3) {
                                                bVar3 = rf2.l.e.f152500a;
                                            } else if (i87 == 4) {
                                                bVar3 = rf2.l.d.f152499a;
                                            } else if (i87 == 5) {
                                                bVar3 = rf2.l.a.f152496a;
                                            } else {
                                                lc.u0.r();
                                            }
                                            zg2.c.a("LSVSessionStartInteractor", "workout Session Type " + bVar3);
                                            if (activityStartRequest4.getZonesCount() > 0) {
                                                List<GDILiveSessionProto.Zones> zonesList = activityStartRequest4.getZonesList();
                                                ArrayList arrayListL = androidx.core.view.j.l(zonesList);
                                                it4 = zonesList.iterator();
                                                while (it4.hasNext()) {
                                                    Iterator it7 = it4;
                                                    Object next = it7.next();
                                                    zones2 = (GDILiveSessionProto.Zones) next;
                                                    if (zones2.hasType()) {
                                                        str5 = str10;
                                                        i35 = i19;
                                                        if (zones2.getType() != GDILiveSessionProto.Zones.Type.POWER && zones2.getHighValuesCount() > 0) {
                                                            arrayListL.add(next);
                                                        }
                                                    } else {
                                                        i35 = i19;
                                                        str5 = str10;
                                                    }
                                                    it4 = it7;
                                                    i19 = i35;
                                                    str10 = str5;
                                                }
                                                i24 = i19;
                                                str2 = str10;
                                                arrayList2 = new ArrayList();
                                                it5 = arrayListL.iterator();
                                                while (it5.hasNext()) {
                                                    List<Integer> highValuesList = ((GDILiveSessionProto.Zones) it5.next()).getHighValuesList();
                                                    highValuesList.getClass();
                                                    p13.d0.v(arrayList2, highValuesList);
                                                }
                                                listZ = p13.h0.Z(arrayList2);
                                            } else {
                                                i24 = i19;
                                                str2 = "LSVSessionStartInteractor";
                                                listZ = p13.j0.f134944a;
                                            }
                                            if (activityStartRequest4.getZonesCount() <= 0) {
                                                i25 = sportFitSubType;
                                            } else {
                                                List<GDILiveSessionProto.Zones> zonesList2 = activityStartRequest4.getZonesList();
                                                ArrayList arrayListL2 = androidx.core.view.j.l(zonesList2);
                                                it = zonesList2.iterator();
                                                while (it.hasNext()) {
                                                    Object next2 = it.next();
                                                    zones = (GDILiveSessionProto.Zones) next2;
                                                    Iterator it8 = it;
                                                    if (zones.hasType()) {
                                                        i26 = sportFitSubType;
                                                        if (zones.getType() != GDILiveSessionProto.Zones.Type.HR && zones.getHighValuesCount() > 0) {
                                                            arrayListL2.add(next2);
                                                        }
                                                    } else {
                                                        i26 = sportFitSubType;
                                                    }
                                                    it = it8;
                                                    sportFitSubType = i26;
                                                }
                                                i25 = sportFitSubType;
                                                arrayList = new ArrayList();
                                                it3 = arrayListL2.iterator();
                                                while (it3.hasNext()) {
                                                    List<Integer> highValuesList2 = ((GDILiveSessionProto.Zones) it3.next()).getHighValuesList();
                                                    highValuesList2.getClass();
                                                    p13.d0.v(arrayList, highValuesList2);
                                                }
                                                arrayListZ = p13.h0.Z(arrayList);
                                                if (arrayListZ.size() >= 5) {
                                                    fVar2 = new zf2.f(((Number) arrayListZ.get(0)).intValue(), ((Number) arrayListZ.get(1)).intValue(), ((Number) arrayListZ.get(2)).intValue(), ((Number) arrayListZ.get(3)).intValue(), ((Number) arrayListZ.get(4)).intValue());
                                                }
                                                activityStartRequest5 = activityStartRequest4;
                                                fVar7.f170332a = activityStartRequest5;
                                                fVar7.f170333b = cVar7;
                                                gVar5 = gVar4;
                                                fVar7.f170334c = gVar5;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuidC;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = dVarA;
                                                fVar7.f170339h = str;
                                                fVar7.f170340i = strD;
                                                fVar7.f170341j = workoutFileUid;
                                                fVar7.f170342k = bVar3;
                                                fVar7.f170343l = listZ;
                                                fVar7.f170344m = fVar2;
                                                fVar7.f170350t = i18;
                                                fVar7.f170354y = z16;
                                                fVar7.f170355z = zBooleanValue2;
                                                fVar7.f170351v = sportFitType;
                                                i27 = i25;
                                                fVar7.f170352w = i27;
                                                list = listZ;
                                                fVar7.f170353x = i24;
                                                fVar7.C = 10;
                                                uuid = workoutFileUid;
                                                objB = b(activityStartRequest5, str, fVar7);
                                                aVar8 = aVar3;
                                                if (objB != aVar8) {
                                                    boolean z48 = z16;
                                                    z17 = zBooleanValue2;
                                                    i28 = i18;
                                                    z18 = z48;
                                                    dVar5 = dVarA;
                                                    i29 = sportFitType;
                                                    aVar4 = aVar8;
                                                    obj2 = objB;
                                                    list2 = list;
                                                    str3 = str;
                                                    i30 = i24;
                                                    activityStartRequest6 = activityStartRequest5;
                                                    fVar3 = fVar2;
                                                    uuid2 = uuidC;
                                                    i34 = i27;
                                                    str4 = strD;
                                                    lVar = bVar3;
                                                    cVar8 = cVar7;
                                                    gVar6 = (zf2.g) obj2;
                                                    target = activityStartRequest6.getTarget();
                                                    i44 = i30;
                                                    arrayList3 = new ArrayList();
                                                    if (target != null) {
                                                        if (target.hasDistance()) {
                                                            arrayList3.add(new zf2.c.a(target.getDistance()));
                                                        }
                                                        if (target.hasTime()) {
                                                            arrayList3.add(new zf2.c.d(target.getTime()));
                                                        }
                                                        if (target.hasSpeed()) {
                                                            arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                                        }
                                                        if (target.hasReps()) {
                                                            arrayList3.add(new zf2.c.b(target.getReps()));
                                                        }
                                                    } else {
                                                        i34 = i34;
                                                        i29 = i29;
                                                    }
                                                    listB1 = p13.h0.b1(arrayList3);
                                                    long f172494b2 = cVar8.getF92746j();
                                                    String f172493a = cVar8.getF92741e();
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar8;
                                                    fVar7.f170334c = gVar5;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = uuid2;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = dVar5;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = str4;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = lVar;
                                                    fVar7.f170343l = list2;
                                                    fVar7.f170344m = fVar3;
                                                    fVar7.f170345n = gVar6;
                                                    fVar7.f170346o = listB1;
                                                    fVar7.f170350t = i28;
                                                    fVar7.f170354y = z18;
                                                    fVar7.f170355z = z17;
                                                    i45 = i29;
                                                    fVar7.f170351v = i45;
                                                    i46 = i34;
                                                    fVar7.f170352w = i46;
                                                    i47 = i28;
                                                    fVar7.f170353x = i44;
                                                    fVar7.C = 11;
                                                    GDIDataTypes.UUID uuid7 = uuid;
                                                    z27 = z17;
                                                    z28 = z18;
                                                    lVar2 = lVar;
                                                    objC = this.f170314c.c(str3, f172494b2, f172493a, uuid7, fVar7);
                                                    aVar5 = aVar4;
                                                    if (objC == aVar5) {
                                                        return aVar5;
                                                    }
                                                    list3 = list2;
                                                    obj5 = objC;
                                                    aVar6 = aVar5;
                                                    cVar9 = cVar8;
                                                    dVar6 = dVar5;
                                                    z29 = z28;
                                                    z34 = z27;
                                                    i48 = i46;
                                                    i49 = i47;
                                                    i54 = i45;
                                                    i55 = i44;
                                                    list4 = listB1;
                                                    gVar7 = gVar6;
                                                    lVar3 = lVar2;
                                                    fVar4 = fVar3;
                                                    pVar = (vf2.p) obj5;
                                                    long f172494b3 = cVar9.getF92746j();
                                                    i56 = i54;
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar9;
                                                    fVar7.f170334c = gVar5;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = uuid2;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = dVar6;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = str4;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = lVar3;
                                                    fVar7.f170343l = list3;
                                                    fVar7.f170344m = fVar4;
                                                    fVar7.f170345n = gVar7;
                                                    fVar7.f170346o = list4;
                                                    fVar7.f170347p = pVar;
                                                    fVar7.f170350t = i49;
                                                    fVar7.f170354y = z29;
                                                    fVar7.f170355z = z34;
                                                    fVar7.f170351v = i56;
                                                    fVar5 = fVar4;
                                                    fVar7.f170352w = i48;
                                                    fVar7.f170353x = i55;
                                                    fVar7.C = 12;
                                                    list5 = list3;
                                                    aVar7 = aVar6;
                                                    z35 = z34;
                                                    gVar8 = gVar7;
                                                    z36 = z29;
                                                    i57 = i49;
                                                    list6 = list4;
                                                    lVar4 = lVar3;
                                                    objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b3, fVar7);
                                                    fVar7 = fVar7;
                                                    if (objB3 == aVar7) {
                                                        return aVar7;
                                                    }
                                                    obj6 = objB3;
                                                    i58 = i57;
                                                    fVar6 = fVar5;
                                                    z37 = z35;
                                                    aVar8 = aVar7;
                                                    cVar10 = cVar9;
                                                    list7 = list5;
                                                    pVar2 = pVar;
                                                    gVar9 = gVar8;
                                                    z38 = z36;
                                                    i59 = i56;
                                                    Iterable iterable = (Iterable) obj6;
                                                    z39 = z37;
                                                    z44 = z38;
                                                    arrayList4 = new ArrayList(p13.y.r(iterable, 10));
                                                    it6 = iterable.iterator();
                                                    while (it6.hasNext()) {
                                                        arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                                    }
                                                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                                    builderNewBuilder.addAllRequestedTypes(arrayList4);
                                                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder2 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                                    builderNewBuilder2.setMetricConfigurationRequest(builderNewBuilder.build());
                                                    GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                                                    builderNewBuilder3.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder2.build());
                                                    smartBuild = builderNewBuilder3.build();
                                                    try {
                                                        String str11 = "activityStartRequest smart " + smartBuild;
                                                        try {
                                                            zg2.c.f204692a.getClass();
                                                            str10 = str2;
                                                            try {
                                                                zg2.c.a(str10, str11);
                                                                try {
                                                                    smartBuild.getClass();
                                                                    fVar7.f170332a = null;
                                                                    fVar7.f170333b = cVar10;
                                                                    fVar7.f170334c = gVar5;
                                                                    fVar7.f170335d = null;
                                                                    fVar7.f170336e = uuid2;
                                                                    fVar7.f170337f = null;
                                                                    fVar7.f170338g = dVar6;
                                                                    fVar7.f170339h = null;
                                                                    fVar7.f170340i = str4;
                                                                    fVar7.f170341j = null;
                                                                    fVar7.f170342k = lVar4;
                                                                    fVar7.f170343l = list7;
                                                                    fVar7.f170344m = fVar6;
                                                                    fVar7.f170345n = gVar9;
                                                                    fVar7.f170346o = list6;
                                                                    fVar7.f170347p = pVar2;
                                                                    fVar7.f170348q = smartBuild;
                                                                    fVar7.f170350t = i58;
                                                                    z45 = z44;
                                                                    try {
                                                                        fVar7.f170354y = z45;
                                                                        i58 = i58;
                                                                        try {
                                                                            fVar7.f170355z = z39;
                                                                            z39 = z39;
                                                                            i66 = i59;
                                                                            try {
                                                                                fVar7.f170351v = i66;
                                                                                i59 = i66;
                                                                                i67 = i48;
                                                                                try {
                                                                                    fVar7.f170352w = i67;
                                                                                    i48 = i67;
                                                                                    i68 = i55;
                                                                                    try {
                                                                                        fVar7.f170353x = i68;
                                                                                        pVar3 = pVar2;
                                                                                        fVar7.C = 13;
                                                                                        objB4 = gVar5.b(smartBuild, fVar7);
                                                                                        aVar8 = aVar8;
                                                                                        if (objB4 == aVar8) {
                                                                                            return aVar8;
                                                                                        }
                                                                                        list8 = list6;
                                                                                        str8 = str4;
                                                                                        i69 = i59;
                                                                                        i74 = i48;
                                                                                        z46 = z39;
                                                                                        gVar10 = gVar9;
                                                                                        uuid4 = uuid2;
                                                                                        i75 = i68;
                                                                                        smart = smartBuild;
                                                                                        i76 = i58;
                                                                                        try {
                                                                                            smart2 = (GDISmartProto.Smart) objB4;
                                                                                            smart.getClass();
                                                                                            y0Var2.getClass();
                                                                                            gVar5.getClass();
                                                                                            lVar5 = lVar4;
                                                                                            y0Var = y0Var2;
                                                                                            y0Var.f170541b = gVar5;
                                                                                            y0Var.f170540a = smart;
                                                                                            zg2.c.f204692a.getClass();
                                                                                            zg2.c.a(str10, "activityStartRequest response " + smart2);
                                                                                            generatedExtension = GDILiveSessionExtension.liveSessionService;
                                                                                            if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) && ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).hasMetricConfigurationResponse()) {
                                                                                                typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                                                                                zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                                                                                if (!typesList.isEmpty()) {
                                                                                                    dVar7 = dVar6;
                                                                                                    zf2.a aVar9 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                                                                    i77 = i69;
                                                                                                    i78 = i74;
                                                                                                    try {
                                                                                                        zf2.h hVar = new zf2.h(fVar6, list7);
                                                                                                        if (dVar7 == zf2.d.f204583b2 || z45) {
                                                                                                            str9 = null;
                                                                                                        } else {
                                                                                                            str9 = str8;
                                                                                                        }
                                                                                                        cVar12 = cVar10;
                                                                                                        try {
                                                                                                            cVar11 = new sf2.f.c(uuid4, cVar12, aVar9, lVar5, pVar3, hVar, gVar10, false, str9);
                                                                                                            e2VarA3 = getF170500a();
                                                                                                            fVar7.f170332a = null;
                                                                                                            fVar7.f170333b = cVar10;
                                                                                                            fVar7.f170334c = null;
                                                                                                            fVar7.f170335d = null;
                                                                                                            fVar7.f170336e = null;
                                                                                                            fVar7.f170337f = null;
                                                                                                            fVar7.f170338g = null;
                                                                                                            fVar7.f170339h = null;
                                                                                                            fVar7.f170340i = null;
                                                                                                            fVar7.f170341j = null;
                                                                                                            fVar7.f170342k = null;
                                                                                                            fVar7.f170343l = null;
                                                                                                            fVar7.f170344m = null;
                                                                                                            fVar7.f170345n = null;
                                                                                                            fVar7.f170346o = null;
                                                                                                            fVar7.f170347p = null;
                                                                                                            fVar7.f170348q = null;
                                                                                                            fVar7.f170349r = null;
                                                                                                            fVar7.f170350t = i76;
                                                                                                            fVar7.f170354y = z45;
                                                                                                            fVar7.f170355z = z46;
                                                                                                            fVar7.f170351v = i77;
                                                                                                            fVar7.f170352w = i78;
                                                                                                            fVar7.f170353x = i75;
                                                                                                            fVar7.C = 14;
                                                                                                            if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                                                                                return aVar8;
                                                                                                            }
                                                                                                            i85 = i75;
                                                                                                            i86 = i77;
                                                                                                            i79 = i78;
                                                                                                            try {
                                                                                                                fVar7.f170332a = null;
                                                                                                                fVar7.f170333b = cVar10;
                                                                                                                fVar7.f170334c = null;
                                                                                                                fVar7.f170335d = null;
                                                                                                                fVar7.f170336e = null;
                                                                                                                fVar7.f170337f = null;
                                                                                                                fVar7.f170338g = null;
                                                                                                                fVar7.f170339h = null;
                                                                                                                fVar7.f170340i = null;
                                                                                                                fVar7.f170341j = null;
                                                                                                                fVar7.f170342k = null;
                                                                                                                fVar7.f170343l = null;
                                                                                                                fVar7.f170344m = null;
                                                                                                                fVar7.f170345n = null;
                                                                                                                fVar7.f170346o = null;
                                                                                                                fVar7.f170347p = null;
                                                                                                                fVar7.f170348q = null;
                                                                                                                fVar7.f170349r = null;
                                                                                                                fVar7.f170350t = i76;
                                                                                                                fVar7.f170354y = z45;
                                                                                                                fVar7.f170355z = z46;
                                                                                                                fVar7.f170351v = i86;
                                                                                                                fVar7.f170352w = i79 == true ? 1 : 0;
                                                                                                                fVar7.f170353x = i85;
                                                                                                                fVar7.C = 15;
                                                                                                                if (y0Var.b(fVar7) == aVar8) {
                                                                                                                    return aVar8;
                                                                                                                }
                                                                                                            } catch (ProtobufException e4) {
                                                                                                                protobufException = e4;
                                                                                                                z15 = z46;
                                                                                                                z14 = z45;
                                                                                                                i15 = i76;
                                                                                                                i65 = i79;
                                                                                                                cVar4 = cVar10;
                                                                                                                i16 = i65;
                                                                                                                e2VarA = getF170500a();
                                                                                                                bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                                                                                                                fVar7.f170332a = null;
                                                                                                                fVar7.f170333b = null;
                                                                                                                fVar7.f170334c = null;
                                                                                                                fVar7.f170335d = null;
                                                                                                                fVar7.f170336e = null;
                                                                                                                fVar7.f170337f = null;
                                                                                                                fVar7.f170338g = null;
                                                                                                                fVar7.f170339h = null;
                                                                                                                fVar7.f170340i = null;
                                                                                                                fVar7.f170341j = null;
                                                                                                                fVar7.f170342k = null;
                                                                                                                fVar7.f170343l = null;
                                                                                                                fVar7.f170344m = null;
                                                                                                                fVar7.f170345n = null;
                                                                                                                fVar7.f170346o = null;
                                                                                                                fVar7.f170347p = null;
                                                                                                                fVar7.f170348q = null;
                                                                                                                fVar7.f170349r = protobufException;
                                                                                                                fVar7.f170350t = i15;
                                                                                                                fVar7.f170354y = z14;
                                                                                                                fVar7.f170355z = z15;
                                                                                                                fVar7.f170351v = i86;
                                                                                                                fVar7.f170352w = i16;
                                                                                                                fVar7.f170353x = i85;
                                                                                                                fVar7.C = 16;
                                                                                                                if (e2VarA.emit(bVar, fVar7) == aVar8) {
                                                                                                                    return aVar8;
                                                                                                                }
                                                                                                                zg2.c.f204692a.getClass();
                                                                                                                zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                                                                                                            }
                                                                                                        } catch (ProtobufException e14) {
                                                                                                            e = e14;
                                                                                                            cVar10 = cVar12;
                                                                                                            protobufException = e;
                                                                                                            i85 = i75;
                                                                                                            z15 = z46;
                                                                                                            z14 = z45;
                                                                                                            i15 = i76;
                                                                                                            i86 = i77;
                                                                                                            i65 = i78;
                                                                                                            cVar4 = cVar10;
                                                                                                            i16 = i65;
                                                                                                            e2VarA = getF170500a();
                                                                                                            bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                                                                                                            fVar7.f170332a = null;
                                                                                                            fVar7.f170333b = null;
                                                                                                            fVar7.f170334c = null;
                                                                                                            fVar7.f170335d = null;
                                                                                                            fVar7.f170336e = null;
                                                                                                            fVar7.f170337f = null;
                                                                                                            fVar7.f170338g = null;
                                                                                                            fVar7.f170339h = null;
                                                                                                            fVar7.f170340i = null;
                                                                                                            fVar7.f170341j = null;
                                                                                                            fVar7.f170342k = null;
                                                                                                            fVar7.f170343l = null;
                                                                                                            fVar7.f170344m = null;
                                                                                                            fVar7.f170345n = null;
                                                                                                            fVar7.f170346o = null;
                                                                                                            fVar7.f170347p = null;
                                                                                                            fVar7.f170348q = null;
                                                                                                            fVar7.f170349r = protobufException;
                                                                                                            fVar7.f170350t = i15;
                                                                                                            fVar7.f170354y = z14;
                                                                                                            fVar7.f170355z = z15;
                                                                                                            fVar7.f170351v = i86;
                                                                                                            fVar7.f170352w = i16;
                                                                                                            fVar7.f170353x = i85;
                                                                                                            fVar7.C = 16;
                                                                                                            if (e2VarA.emit(bVar, fVar7) == aVar8) {
                                                                                                                return aVar8;
                                                                                                            }
                                                                                                            zg2.c.f204692a.getClass();
                                                                                                            zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                                                                                                            return Unit.INSTANCE;
                                                                                                        }
                                                                                                    } catch (ProtobufException e15) {
                                                                                                        e = e15;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } catch (ProtobufException e16) {
                                                                                            e = e16;
                                                                                            i77 = i69;
                                                                                            i78 = i74;
                                                                                        }
                                                                                        return Unit.INSTANCE;
                                                                                    } catch (ProtobufException e17) {
                                                                                        e = e17;
                                                                                        i64 = i68;
                                                                                        protobufException = e;
                                                                                        z14 = z45;
                                                                                        i15 = i58;
                                                                                        i86 = i59;
                                                                                        i65 = i48;
                                                                                        i85 = i64;
                                                                                        z15 = z39;
                                                                                        cVar4 = cVar10;
                                                                                        i16 = i65;
                                                                                        e2VarA = getF170500a();
                                                                                        bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                                                                                        fVar7.f170332a = null;
                                                                                        fVar7.f170333b = null;
                                                                                        fVar7.f170334c = null;
                                                                                        fVar7.f170335d = null;
                                                                                        fVar7.f170336e = null;
                                                                                        fVar7.f170337f = null;
                                                                                        fVar7.f170338g = null;
                                                                                        fVar7.f170339h = null;
                                                                                        fVar7.f170340i = null;
                                                                                        fVar7.f170341j = null;
                                                                                        fVar7.f170342k = null;
                                                                                        fVar7.f170343l = null;
                                                                                        fVar7.f170344m = null;
                                                                                        fVar7.f170345n = null;
                                                                                        fVar7.f170346o = null;
                                                                                        fVar7.f170347p = null;
                                                                                        fVar7.f170348q = null;
                                                                                        fVar7.f170349r = protobufException;
                                                                                        fVar7.f170350t = i15;
                                                                                        fVar7.f170354y = z14;
                                                                                        fVar7.f170355z = z15;
                                                                                        fVar7.f170351v = i86;
                                                                                        fVar7.f170352w = i16;
                                                                                        fVar7.f170353x = i85;
                                                                                        fVar7.C = 16;
                                                                                        if (e2VarA.emit(bVar, fVar7) == aVar8) {
                                                                                            return aVar8;
                                                                                        }
                                                                                        zg2.c.f204692a.getClass();
                                                                                        zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                                                                                        return Unit.INSTANCE;
                                                                                    }
                                                                                } catch (ProtobufException e18) {
                                                                                    e = e18;
                                                                                    i48 = i67;
                                                                                    i64 = i55;
                                                                                    protobufException = e;
                                                                                    z14 = z45;
                                                                                    i15 = i58;
                                                                                    i86 = i59;
                                                                                    i65 = i48;
                                                                                    i85 = i64;
                                                                                    z15 = z39;
                                                                                    cVar4 = cVar10;
                                                                                    i16 = i65;
                                                                                    e2VarA = getF170500a();
                                                                                    bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                                                                                    fVar7.f170332a = null;
                                                                                    fVar7.f170333b = null;
                                                                                    fVar7.f170334c = null;
                                                                                    fVar7.f170335d = null;
                                                                                    fVar7.f170336e = null;
                                                                                    fVar7.f170337f = null;
                                                                                    fVar7.f170338g = null;
                                                                                    fVar7.f170339h = null;
                                                                                    fVar7.f170340i = null;
                                                                                    fVar7.f170341j = null;
                                                                                    fVar7.f170342k = null;
                                                                                    fVar7.f170343l = null;
                                                                                    fVar7.f170344m = null;
                                                                                    fVar7.f170345n = null;
                                                                                    fVar7.f170346o = null;
                                                                                    fVar7.f170347p = null;
                                                                                    fVar7.f170348q = null;
                                                                                    fVar7.f170349r = protobufException;
                                                                                    fVar7.f170350t = i15;
                                                                                    fVar7.f170354y = z14;
                                                                                    fVar7.f170355z = z15;
                                                                                    fVar7.f170351v = i86;
                                                                                    fVar7.f170352w = i16;
                                                                                    fVar7.f170353x = i85;
                                                                                    fVar7.C = 16;
                                                                                    if (e2VarA.emit(bVar, fVar7) == aVar8) {
                                                                                        return aVar8;
                                                                                    }
                                                                                    zg2.c.f204692a.getClass();
                                                                                    zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                            } catch (ProtobufException e19) {
                                                                                e = e19;
                                                                                i59 = i66;
                                                                            }
                                                                        } catch (ProtobufException e24) {
                                                                            e = e24;
                                                                            z39 = z39;
                                                                            i64 = i55;
                                                                            protobufException = e;
                                                                            z14 = z45;
                                                                            i15 = i58;
                                                                            i86 = i59;
                                                                            i65 = i48;
                                                                            i85 = i64;
                                                                            z15 = z39;
                                                                            cVar4 = cVar10;
                                                                            i16 = i65;
                                                                            e2VarA = getF170500a();
                                                                            bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                                                                            fVar7.f170332a = null;
                                                                            fVar7.f170333b = null;
                                                                            fVar7.f170334c = null;
                                                                            fVar7.f170335d = null;
                                                                            fVar7.f170336e = null;
                                                                            fVar7.f170337f = null;
                                                                            fVar7.f170338g = null;
                                                                            fVar7.f170339h = null;
                                                                            fVar7.f170340i = null;
                                                                            fVar7.f170341j = null;
                                                                            fVar7.f170342k = null;
                                                                            fVar7.f170343l = null;
                                                                            fVar7.f170344m = null;
                                                                            fVar7.f170345n = null;
                                                                            fVar7.f170346o = null;
                                                                            fVar7.f170347p = null;
                                                                            fVar7.f170348q = null;
                                                                            fVar7.f170349r = protobufException;
                                                                            fVar7.f170350t = i15;
                                                                            fVar7.f170354y = z14;
                                                                            fVar7.f170355z = z15;
                                                                            fVar7.f170351v = i86;
                                                                            fVar7.f170352w = i16;
                                                                            fVar7.f170353x = i85;
                                                                            fVar7.C = 16;
                                                                            if (e2VarA.emit(bVar, fVar7) == aVar8) {
                                                                                return aVar8;
                                                                            }
                                                                            zg2.c.f204692a.getClass();
                                                                            zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    } catch (ProtobufException e25) {
                                                                        e = e25;
                                                                        i58 = i58;
                                                                    }
                                                                } catch (ProtobufException e26) {
                                                                    e = e26;
                                                                    z45 = z44;
                                                                    i64 = i55;
                                                                    protobufException = e;
                                                                    z14 = z45;
                                                                    i15 = i58;
                                                                    i86 = i59;
                                                                    i65 = i48;
                                                                    i85 = i64;
                                                                    z15 = z39;
                                                                    cVar4 = cVar10;
                                                                    i16 = i65;
                                                                    e2VarA = getF170500a();
                                                                    bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                                                                    fVar7.f170332a = null;
                                                                    fVar7.f170333b = null;
                                                                    fVar7.f170334c = null;
                                                                    fVar7.f170335d = null;
                                                                    fVar7.f170336e = null;
                                                                    fVar7.f170337f = null;
                                                                    fVar7.f170338g = null;
                                                                    fVar7.f170339h = null;
                                                                    fVar7.f170340i = null;
                                                                    fVar7.f170341j = null;
                                                                    fVar7.f170342k = null;
                                                                    fVar7.f170343l = null;
                                                                    fVar7.f170344m = null;
                                                                    fVar7.f170345n = null;
                                                                    fVar7.f170346o = null;
                                                                    fVar7.f170347p = null;
                                                                    fVar7.f170348q = null;
                                                                    fVar7.f170349r = protobufException;
                                                                    fVar7.f170350t = i15;
                                                                    fVar7.f170354y = z14;
                                                                    fVar7.f170355z = z15;
                                                                    fVar7.f170351v = i86;
                                                                    fVar7.f170352w = i16;
                                                                    fVar7.f170353x = i85;
                                                                    fVar7.C = 16;
                                                                    if (e2VarA.emit(bVar, fVar7) == aVar8) {
                                                                        return aVar8;
                                                                    }
                                                                    zg2.c.f204692a.getClass();
                                                                    zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            } catch (ProtobufException e27) {
                                                                e = e27;
                                                                i58 = i58;
                                                                z45 = z44;
                                                                i64 = i55;
                                                                protobufException = e;
                                                                z14 = z45;
                                                                i15 = i58;
                                                                i86 = i59;
                                                                i65 = i48;
                                                                i85 = i64;
                                                                z15 = z39;
                                                                cVar4 = cVar10;
                                                                i16 = i65;
                                                                e2VarA = getF170500a();
                                                                bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                                                                fVar7.f170332a = null;
                                                                fVar7.f170333b = null;
                                                                fVar7.f170334c = null;
                                                                fVar7.f170335d = null;
                                                                fVar7.f170336e = null;
                                                                fVar7.f170337f = null;
                                                                fVar7.f170338g = null;
                                                                fVar7.f170339h = null;
                                                                fVar7.f170340i = null;
                                                                fVar7.f170341j = null;
                                                                fVar7.f170342k = null;
                                                                fVar7.f170343l = null;
                                                                fVar7.f170344m = null;
                                                                fVar7.f170345n = null;
                                                                fVar7.f170346o = null;
                                                                fVar7.f170347p = null;
                                                                fVar7.f170348q = null;
                                                                fVar7.f170349r = protobufException;
                                                                fVar7.f170350t = i15;
                                                                fVar7.f170354y = z14;
                                                                fVar7.f170355z = z15;
                                                                fVar7.f170351v = i86;
                                                                fVar7.f170352w = i16;
                                                                fVar7.f170353x = i85;
                                                                fVar7.C = 16;
                                                                if (e2VarA.emit(bVar, fVar7) == aVar8) {
                                                                    return aVar8;
                                                                }
                                                                zg2.c.f204692a.getClass();
                                                                zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                                                                return Unit.INSTANCE;
                                                            }
                                                        } catch (ProtobufException e28) {
                                                            e = e28;
                                                            str10 = str2;
                                                        }
                                                    } catch (ProtobufException e29) {
                                                        e = e29;
                                                        str10 = str2;
                                                    }
                                                }
                                            }
                                            fVar2 = null;
                                            activityStartRequest5 = activityStartRequest4;
                                            fVar7.f170332a = activityStartRequest5;
                                            fVar7.f170333b = cVar7;
                                            gVar5 = gVar4;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuidC;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVarA;
                                            fVar7.f170339h = str;
                                            fVar7.f170340i = strD;
                                            fVar7.f170341j = workoutFileUid;
                                            fVar7.f170342k = bVar3;
                                            fVar7.f170343l = listZ;
                                            fVar7.f170344m = fVar2;
                                            fVar7.f170350t = i18;
                                            fVar7.f170354y = z16;
                                            fVar7.f170355z = zBooleanValue2;
                                            fVar7.f170351v = sportFitType;
                                            i27 = i25;
                                            fVar7.f170352w = i27;
                                            list = listZ;
                                            fVar7.f170353x = i24;
                                            fVar7.C = 10;
                                            uuid = workoutFileUid;
                                            objB = b(activityStartRequest5, str, fVar7);
                                            aVar8 = aVar3;
                                            if (objB != aVar8) {
                                                boolean z49 = z16;
                                                z17 = zBooleanValue2;
                                                i28 = i18;
                                                z18 = z49;
                                                dVar5 = dVarA;
                                                i29 = sportFitType;
                                                aVar4 = aVar8;
                                                obj2 = objB;
                                                list2 = list;
                                                str3 = str;
                                                i30 = i24;
                                                activityStartRequest6 = activityStartRequest5;
                                                fVar3 = fVar2;
                                                uuid2 = uuidC;
                                                i34 = i27;
                                                str4 = strD;
                                                lVar = bVar3;
                                                cVar8 = cVar7;
                                                gVar6 = (zf2.g) obj2;
                                                target = activityStartRequest6.getTarget();
                                                i44 = i30;
                                                arrayList3 = new ArrayList();
                                                if (target != null) {
                                                    if (target.hasDistance()) {
                                                        arrayList3.add(new zf2.c.a(target.getDistance()));
                                                    }
                                                    if (target.hasTime()) {
                                                        arrayList3.add(new zf2.c.d(target.getTime()));
                                                    }
                                                    if (target.hasSpeed()) {
                                                        arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                                    }
                                                    if (target.hasReps()) {
                                                        arrayList3.add(new zf2.c.b(target.getReps()));
                                                    }
                                                } else {
                                                    i34 = i34;
                                                    i29 = i29;
                                                }
                                                listB1 = p13.h0.b1(arrayList3);
                                                long f172494b4 = cVar8.getF92746j();
                                                String f172493a2 = cVar8.getF92741e();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar8;
                                                fVar7.f170334c = gVar5;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuid2;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = dVar5;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = str4;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = lVar;
                                                fVar7.f170343l = list2;
                                                fVar7.f170344m = fVar3;
                                                fVar7.f170345n = gVar6;
                                                fVar7.f170346o = listB1;
                                                fVar7.f170350t = i28;
                                                fVar7.f170354y = z18;
                                                fVar7.f170355z = z17;
                                                i45 = i29;
                                                fVar7.f170351v = i45;
                                                i46 = i34;
                                                fVar7.f170352w = i46;
                                                i47 = i28;
                                                fVar7.f170353x = i44;
                                                fVar7.C = 11;
                                                GDIDataTypes.UUID uuid8 = uuid;
                                                z27 = z17;
                                                z28 = z18;
                                                lVar2 = lVar;
                                                objC = this.f170314c.c(str3, f172494b4, f172493a2, uuid8, fVar7);
                                                aVar5 = aVar4;
                                                if (objC == aVar5) {
                                                    return aVar5;
                                                }
                                                list3 = list2;
                                                obj5 = objC;
                                                aVar6 = aVar5;
                                                cVar9 = cVar8;
                                                dVar6 = dVar5;
                                                z29 = z28;
                                                z34 = z27;
                                                i48 = i46;
                                                i49 = i47;
                                                i54 = i45;
                                                i55 = i44;
                                                list4 = listB1;
                                                gVar7 = gVar6;
                                                lVar3 = lVar2;
                                                fVar4 = fVar3;
                                                pVar = (vf2.p) obj5;
                                                long f172494b5 = cVar9.getF92746j();
                                                i56 = i54;
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar9;
                                                fVar7.f170334c = gVar5;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuid2;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = dVar6;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = str4;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = lVar3;
                                                fVar7.f170343l = list3;
                                                fVar7.f170344m = fVar4;
                                                fVar7.f170345n = gVar7;
                                                fVar7.f170346o = list4;
                                                fVar7.f170347p = pVar;
                                                fVar7.f170350t = i49;
                                                fVar7.f170354y = z29;
                                                fVar7.f170355z = z34;
                                                fVar7.f170351v = i56;
                                                fVar5 = fVar4;
                                                fVar7.f170352w = i48;
                                                fVar7.f170353x = i55;
                                                fVar7.C = 12;
                                                list5 = list3;
                                                aVar7 = aVar6;
                                                z35 = z34;
                                                gVar8 = gVar7;
                                                z36 = z29;
                                                i57 = i49;
                                                list6 = list4;
                                                lVar4 = lVar3;
                                                objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b5, fVar7);
                                                fVar7 = fVar7;
                                                if (objB3 == aVar7) {
                                                    return aVar7;
                                                }
                                                obj6 = objB3;
                                                i58 = i57;
                                                fVar6 = fVar5;
                                                z37 = z35;
                                                aVar8 = aVar7;
                                                cVar10 = cVar9;
                                                list7 = list5;
                                                pVar2 = pVar;
                                                gVar9 = gVar8;
                                                z38 = z36;
                                                i59 = i56;
                                                Iterable iterable2 = (Iterable) obj6;
                                                z39 = z37;
                                                z44 = z38;
                                                arrayList4 = new ArrayList(p13.y.r(iterable2, 10));
                                                it6 = iterable2.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                                }
                                                GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder4 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                                builderNewBuilder4.addAllRequestedTypes(arrayList4);
                                                GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder5 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                                builderNewBuilder5.setMetricConfigurationRequest(builderNewBuilder4.build());
                                                GDISmartProto.Smart.Builder builderNewBuilder6 = GDISmartProto.Smart.newBuilder();
                                                builderNewBuilder6.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder5.build());
                                                smartBuild = builderNewBuilder6.build();
                                                String str12 = "activityStartRequest smart " + smartBuild;
                                                zg2.c.f204692a.getClass();
                                                str10 = str2;
                                                zg2.c.a(str10, str12);
                                                smartBuild.getClass();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = gVar5;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuid2;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = dVar6;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = str4;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = lVar4;
                                                fVar7.f170343l = list7;
                                                fVar7.f170344m = fVar6;
                                                fVar7.f170345n = gVar9;
                                                fVar7.f170346o = list6;
                                                fVar7.f170347p = pVar2;
                                                fVar7.f170348q = smartBuild;
                                                fVar7.f170350t = i58;
                                                z45 = z44;
                                                fVar7.f170354y = z45;
                                                i58 = i58;
                                                fVar7.f170355z = z39;
                                                z39 = z39;
                                                i66 = i59;
                                                fVar7.f170351v = i66;
                                                i59 = i66;
                                                i67 = i48;
                                                fVar7.f170352w = i67;
                                                i48 = i67;
                                                i68 = i55;
                                                fVar7.f170353x = i68;
                                                pVar3 = pVar2;
                                                fVar7.C = 13;
                                                objB4 = gVar5.b(smartBuild, fVar7);
                                                aVar8 = aVar8;
                                                if (objB4 == aVar8) {
                                                    return aVar8;
                                                }
                                                list8 = list6;
                                                str8 = str4;
                                                i69 = i59;
                                                i74 = i48;
                                                z46 = z39;
                                                gVar10 = gVar9;
                                                uuid4 = uuid2;
                                                i75 = i68;
                                                smart = smartBuild;
                                                i76 = i58;
                                                smart2 = (GDISmartProto.Smart) objB4;
                                                smart.getClass();
                                                y0Var2.getClass();
                                                gVar5.getClass();
                                                lVar5 = lVar4;
                                                y0Var = y0Var2;
                                                y0Var.f170541b = gVar5;
                                                y0Var.f170540a = smart;
                                                zg2.c.f204692a.getClass();
                                                zg2.c.a(str10, "activityStartRequest response " + smart2);
                                                generatedExtension = GDILiveSessionExtension.liveSessionService;
                                                if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                                    typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                                    zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                                    if (!typesList.isEmpty()) {
                                                        dVar7 = dVar6;
                                                        zf2.a aVar10 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                        i77 = i69;
                                                        i78 = i74;
                                                        zf2.h hVar2 = new zf2.h(fVar6, list7);
                                                        if (dVar7 == zf2.d.f204583b2) {
                                                            str9 = null;
                                                        } else {
                                                            str9 = null;
                                                        }
                                                        cVar12 = cVar10;
                                                        cVar11 = new sf2.f.c(uuid4, cVar12, aVar10, lVar5, pVar3, hVar2, gVar10, false, str9);
                                                        e2VarA3 = getF170500a();
                                                        fVar7.f170332a = null;
                                                        fVar7.f170333b = cVar10;
                                                        fVar7.f170334c = null;
                                                        fVar7.f170335d = null;
                                                        fVar7.f170336e = null;
                                                        fVar7.f170337f = null;
                                                        fVar7.f170338g = null;
                                                        fVar7.f170339h = null;
                                                        fVar7.f170340i = null;
                                                        fVar7.f170341j = null;
                                                        fVar7.f170342k = null;
                                                        fVar7.f170343l = null;
                                                        fVar7.f170344m = null;
                                                        fVar7.f170345n = null;
                                                        fVar7.f170346o = null;
                                                        fVar7.f170347p = null;
                                                        fVar7.f170348q = null;
                                                        fVar7.f170349r = null;
                                                        fVar7.f170350t = i76;
                                                        fVar7.f170354y = z45;
                                                        fVar7.f170355z = z46;
                                                        fVar7.f170351v = i77;
                                                        fVar7.f170352w = i78;
                                                        fVar7.f170353x = i75;
                                                        fVar7.C = 14;
                                                        if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                            return aVar8;
                                                        }
                                                        i85 = i75;
                                                        i86 = i77;
                                                        i79 = i78;
                                                        fVar7.f170332a = null;
                                                        fVar7.f170333b = cVar10;
                                                        fVar7.f170334c = null;
                                                        fVar7.f170335d = null;
                                                        fVar7.f170336e = null;
                                                        fVar7.f170337f = null;
                                                        fVar7.f170338g = null;
                                                        fVar7.f170339h = null;
                                                        fVar7.f170340i = null;
                                                        fVar7.f170341j = null;
                                                        fVar7.f170342k = null;
                                                        fVar7.f170343l = null;
                                                        fVar7.f170344m = null;
                                                        fVar7.f170345n = null;
                                                        fVar7.f170346o = null;
                                                        fVar7.f170347p = null;
                                                        fVar7.f170348q = null;
                                                        fVar7.f170349r = null;
                                                        fVar7.f170350t = i76;
                                                        fVar7.f170354y = z45;
                                                        fVar7.f170355z = z46;
                                                        fVar7.f170351v = i86;
                                                        fVar7.f170352w = i79 == true ? 1 : 0;
                                                        fVar7.f170353x = i85;
                                                        fVar7.C = 15;
                                                        if (y0Var.b(fVar7) == aVar8) {
                                                            return aVar8;
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        bVar3 = null;
                                        zg2.c.a("LSVSessionStartInteractor", "workout Session Type " + bVar3);
                                        if (activityStartRequest4.getZonesCount() > 0) {
                                            List<GDILiveSessionProto.Zones> zonesList3 = activityStartRequest4.getZonesList();
                                            ArrayList arrayListL3 = androidx.core.view.j.l(zonesList3);
                                            it4 = zonesList3.iterator();
                                            while (it4.hasNext()) {
                                                Iterator it9 = it4;
                                                Object next3 = it9.next();
                                                zones2 = (GDILiveSessionProto.Zones) next3;
                                                if (zones2.hasType()) {
                                                    str5 = str10;
                                                    i35 = i19;
                                                    if (zones2.getType() != GDILiveSessionProto.Zones.Type.POWER) {
                                                    }
                                                } else {
                                                    i35 = i19;
                                                    str5 = str10;
                                                }
                                                it4 = it9;
                                                i19 = i35;
                                                str10 = str5;
                                            }
                                            i24 = i19;
                                            str2 = str10;
                                            arrayList2 = new ArrayList();
                                            it5 = arrayListL3.iterator();
                                            while (it5.hasNext()) {
                                                List<Integer> highValuesList3 = ((GDILiveSessionProto.Zones) it5.next()).getHighValuesList();
                                                highValuesList3.getClass();
                                                p13.d0.v(arrayList2, highValuesList3);
                                            }
                                            listZ = p13.h0.Z(arrayList2);
                                        } else {
                                            i24 = i19;
                                            str2 = "LSVSessionStartInteractor";
                                            listZ = p13.j0.f134944a;
                                        }
                                        if (activityStartRequest4.getZonesCount() <= 0) {
                                            i25 = sportFitSubType;
                                        } else {
                                            List<GDILiveSessionProto.Zones> zonesList4 = activityStartRequest4.getZonesList();
                                            ArrayList arrayListL4 = androidx.core.view.j.l(zonesList4);
                                            it = zonesList4.iterator();
                                            while (it.hasNext()) {
                                                Object next4 = it.next();
                                                zones = (GDILiveSessionProto.Zones) next4;
                                                Iterator it10 = it;
                                                if (zones.hasType()) {
                                                    i26 = sportFitSubType;
                                                    if (zones.getType() != GDILiveSessionProto.Zones.Type.HR) {
                                                    }
                                                } else {
                                                    i26 = sportFitSubType;
                                                }
                                                it = it10;
                                                sportFitSubType = i26;
                                            }
                                            i25 = sportFitSubType;
                                            arrayList = new ArrayList();
                                            it3 = arrayListL4.iterator();
                                            while (it3.hasNext()) {
                                                List<Integer> highValuesList4 = ((GDILiveSessionProto.Zones) it3.next()).getHighValuesList();
                                                highValuesList4.getClass();
                                                p13.d0.v(arrayList, highValuesList4);
                                            }
                                            arrayListZ = p13.h0.Z(arrayList);
                                            if (arrayListZ.size() >= 5) {
                                                fVar2 = new zf2.f(((Number) arrayListZ.get(0)).intValue(), ((Number) arrayListZ.get(1)).intValue(), ((Number) arrayListZ.get(2)).intValue(), ((Number) arrayListZ.get(3)).intValue(), ((Number) arrayListZ.get(4)).intValue());
                                            }
                                            activityStartRequest5 = activityStartRequest4;
                                            fVar7.f170332a = activityStartRequest5;
                                            fVar7.f170333b = cVar7;
                                            gVar5 = gVar4;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuidC;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVarA;
                                            fVar7.f170339h = str;
                                            fVar7.f170340i = strD;
                                            fVar7.f170341j = workoutFileUid;
                                            fVar7.f170342k = bVar3;
                                            fVar7.f170343l = listZ;
                                            fVar7.f170344m = fVar2;
                                            fVar7.f170350t = i18;
                                            fVar7.f170354y = z16;
                                            fVar7.f170355z = zBooleanValue2;
                                            fVar7.f170351v = sportFitType;
                                            i27 = i25;
                                            fVar7.f170352w = i27;
                                            list = listZ;
                                            fVar7.f170353x = i24;
                                            fVar7.C = 10;
                                            uuid = workoutFileUid;
                                            objB = b(activityStartRequest5, str, fVar7);
                                            aVar8 = aVar3;
                                            if (objB != aVar8) {
                                                boolean z410 = z16;
                                                z17 = zBooleanValue2;
                                                i28 = i18;
                                                z18 = z410;
                                                dVar5 = dVarA;
                                                i29 = sportFitType;
                                                aVar4 = aVar8;
                                                obj2 = objB;
                                                list2 = list;
                                                str3 = str;
                                                i30 = i24;
                                                activityStartRequest6 = activityStartRequest5;
                                                fVar3 = fVar2;
                                                uuid2 = uuidC;
                                                i34 = i27;
                                                str4 = strD;
                                                lVar = bVar3;
                                                cVar8 = cVar7;
                                                gVar6 = (zf2.g) obj2;
                                                target = activityStartRequest6.getTarget();
                                                i44 = i30;
                                                arrayList3 = new ArrayList();
                                                if (target != null) {
                                                    if (target.hasDistance()) {
                                                        arrayList3.add(new zf2.c.a(target.getDistance()));
                                                    }
                                                    if (target.hasTime()) {
                                                        arrayList3.add(new zf2.c.d(target.getTime()));
                                                    }
                                                    if (target.hasSpeed()) {
                                                        arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                                    }
                                                    if (target.hasReps()) {
                                                        arrayList3.add(new zf2.c.b(target.getReps()));
                                                    }
                                                } else {
                                                    i34 = i34;
                                                    i29 = i29;
                                                }
                                                listB1 = p13.h0.b1(arrayList3);
                                                long f172494b6 = cVar8.getF92746j();
                                                String f172493a3 = cVar8.getF92741e();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar8;
                                                fVar7.f170334c = gVar5;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuid2;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = dVar5;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = str4;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = lVar;
                                                fVar7.f170343l = list2;
                                                fVar7.f170344m = fVar3;
                                                fVar7.f170345n = gVar6;
                                                fVar7.f170346o = listB1;
                                                fVar7.f170350t = i28;
                                                fVar7.f170354y = z18;
                                                fVar7.f170355z = z17;
                                                i45 = i29;
                                                fVar7.f170351v = i45;
                                                i46 = i34;
                                                fVar7.f170352w = i46;
                                                i47 = i28;
                                                fVar7.f170353x = i44;
                                                fVar7.C = 11;
                                                GDIDataTypes.UUID uuid9 = uuid;
                                                z27 = z17;
                                                z28 = z18;
                                                lVar2 = lVar;
                                                objC = this.f170314c.c(str3, f172494b6, f172493a3, uuid9, fVar7);
                                                aVar5 = aVar4;
                                                if (objC == aVar5) {
                                                    return aVar5;
                                                }
                                                list3 = list2;
                                                obj5 = objC;
                                                aVar6 = aVar5;
                                                cVar9 = cVar8;
                                                dVar6 = dVar5;
                                                z29 = z28;
                                                z34 = z27;
                                                i48 = i46;
                                                i49 = i47;
                                                i54 = i45;
                                                i55 = i44;
                                                list4 = listB1;
                                                gVar7 = gVar6;
                                                lVar3 = lVar2;
                                                fVar4 = fVar3;
                                                pVar = (vf2.p) obj5;
                                                long f172494b7 = cVar9.getF92746j();
                                                i56 = i54;
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar9;
                                                fVar7.f170334c = gVar5;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuid2;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = dVar6;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = str4;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = lVar3;
                                                fVar7.f170343l = list3;
                                                fVar7.f170344m = fVar4;
                                                fVar7.f170345n = gVar7;
                                                fVar7.f170346o = list4;
                                                fVar7.f170347p = pVar;
                                                fVar7.f170350t = i49;
                                                fVar7.f170354y = z29;
                                                fVar7.f170355z = z34;
                                                fVar7.f170351v = i56;
                                                fVar5 = fVar4;
                                                fVar7.f170352w = i48;
                                                fVar7.f170353x = i55;
                                                fVar7.C = 12;
                                                list5 = list3;
                                                aVar7 = aVar6;
                                                z35 = z34;
                                                gVar8 = gVar7;
                                                z36 = z29;
                                                i57 = i49;
                                                list6 = list4;
                                                lVar4 = lVar3;
                                                objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b7, fVar7);
                                                fVar7 = fVar7;
                                                if (objB3 == aVar7) {
                                                    return aVar7;
                                                }
                                                obj6 = objB3;
                                                i58 = i57;
                                                fVar6 = fVar5;
                                                z37 = z35;
                                                aVar8 = aVar7;
                                                cVar10 = cVar9;
                                                list7 = list5;
                                                pVar2 = pVar;
                                                gVar9 = gVar8;
                                                z38 = z36;
                                                i59 = i56;
                                                Iterable iterable3 = (Iterable) obj6;
                                                z39 = z37;
                                                z44 = z38;
                                                arrayList4 = new ArrayList(p13.y.r(iterable3, 10));
                                                it6 = iterable3.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                                }
                                                GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder7 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                                builderNewBuilder7.addAllRequestedTypes(arrayList4);
                                                GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder8 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                                builderNewBuilder8.setMetricConfigurationRequest(builderNewBuilder7.build());
                                                GDISmartProto.Smart.Builder builderNewBuilder9 = GDISmartProto.Smart.newBuilder();
                                                builderNewBuilder9.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder8.build());
                                                smartBuild = builderNewBuilder9.build();
                                                String str13 = "activityStartRequest smart " + smartBuild;
                                                zg2.c.f204692a.getClass();
                                                str10 = str2;
                                                zg2.c.a(str10, str13);
                                                smartBuild.getClass();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = gVar5;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = uuid2;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = dVar6;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = str4;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = lVar4;
                                                fVar7.f170343l = list7;
                                                fVar7.f170344m = fVar6;
                                                fVar7.f170345n = gVar9;
                                                fVar7.f170346o = list6;
                                                fVar7.f170347p = pVar2;
                                                fVar7.f170348q = smartBuild;
                                                fVar7.f170350t = i58;
                                                z45 = z44;
                                                fVar7.f170354y = z45;
                                                i58 = i58;
                                                fVar7.f170355z = z39;
                                                z39 = z39;
                                                i66 = i59;
                                                fVar7.f170351v = i66;
                                                i59 = i66;
                                                i67 = i48;
                                                fVar7.f170352w = i67;
                                                i48 = i67;
                                                i68 = i55;
                                                fVar7.f170353x = i68;
                                                pVar3 = pVar2;
                                                fVar7.C = 13;
                                                objB4 = gVar5.b(smartBuild, fVar7);
                                                aVar8 = aVar8;
                                                if (objB4 == aVar8) {
                                                    return aVar8;
                                                }
                                                list8 = list6;
                                                str8 = str4;
                                                i69 = i59;
                                                i74 = i48;
                                                z46 = z39;
                                                gVar10 = gVar9;
                                                uuid4 = uuid2;
                                                i75 = i68;
                                                smart = smartBuild;
                                                i76 = i58;
                                                smart2 = (GDISmartProto.Smart) objB4;
                                                smart.getClass();
                                                y0Var2.getClass();
                                                gVar5.getClass();
                                                lVar5 = lVar4;
                                                y0Var = y0Var2;
                                                y0Var.f170541b = gVar5;
                                                y0Var.f170540a = smart;
                                                zg2.c.f204692a.getClass();
                                                zg2.c.a(str10, "activityStartRequest response " + smart2);
                                                generatedExtension = GDILiveSessionExtension.liveSessionService;
                                                if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                                    typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                                    zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                                    if (!typesList.isEmpty()) {
                                                        dVar7 = dVar6;
                                                        zf2.a aVar11 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                        i77 = i69;
                                                        i78 = i74;
                                                        zf2.h hVar3 = new zf2.h(fVar6, list7);
                                                        if (dVar7 == zf2.d.f204583b2) {
                                                            str9 = null;
                                                        } else {
                                                            str9 = null;
                                                        }
                                                        cVar12 = cVar10;
                                                        cVar11 = new sf2.f.c(uuid4, cVar12, aVar11, lVar5, pVar3, hVar3, gVar10, false, str9);
                                                        e2VarA3 = getF170500a();
                                                        fVar7.f170332a = null;
                                                        fVar7.f170333b = cVar10;
                                                        fVar7.f170334c = null;
                                                        fVar7.f170335d = null;
                                                        fVar7.f170336e = null;
                                                        fVar7.f170337f = null;
                                                        fVar7.f170338g = null;
                                                        fVar7.f170339h = null;
                                                        fVar7.f170340i = null;
                                                        fVar7.f170341j = null;
                                                        fVar7.f170342k = null;
                                                        fVar7.f170343l = null;
                                                        fVar7.f170344m = null;
                                                        fVar7.f170345n = null;
                                                        fVar7.f170346o = null;
                                                        fVar7.f170347p = null;
                                                        fVar7.f170348q = null;
                                                        fVar7.f170349r = null;
                                                        fVar7.f170350t = i76;
                                                        fVar7.f170354y = z45;
                                                        fVar7.f170355z = z46;
                                                        fVar7.f170351v = i77;
                                                        fVar7.f170352w = i78;
                                                        fVar7.f170353x = i75;
                                                        fVar7.C = 14;
                                                        if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                            return aVar8;
                                                        }
                                                        i85 = i75;
                                                        i86 = i77;
                                                        i79 = i78;
                                                        fVar7.f170332a = null;
                                                        fVar7.f170333b = cVar10;
                                                        fVar7.f170334c = null;
                                                        fVar7.f170335d = null;
                                                        fVar7.f170336e = null;
                                                        fVar7.f170337f = null;
                                                        fVar7.f170338g = null;
                                                        fVar7.f170339h = null;
                                                        fVar7.f170340i = null;
                                                        fVar7.f170341j = null;
                                                        fVar7.f170342k = null;
                                                        fVar7.f170343l = null;
                                                        fVar7.f170344m = null;
                                                        fVar7.f170345n = null;
                                                        fVar7.f170346o = null;
                                                        fVar7.f170347p = null;
                                                        fVar7.f170348q = null;
                                                        fVar7.f170349r = null;
                                                        fVar7.f170350t = i76;
                                                        fVar7.f170354y = z45;
                                                        fVar7.f170355z = z46;
                                                        fVar7.f170351v = i86;
                                                        fVar7.f170352w = i79 == true ? 1 : 0;
                                                        fVar7.f170353x = i85;
                                                        fVar7.C = 15;
                                                        if (y0Var.b(fVar7) == aVar8) {
                                                            return aVar8;
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        fVar2 = null;
                                        activityStartRequest5 = activityStartRequest4;
                                        fVar7.f170332a = activityStartRequest5;
                                        fVar7.f170333b = cVar7;
                                        gVar5 = gVar4;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuidC;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVarA;
                                        fVar7.f170339h = str;
                                        fVar7.f170340i = strD;
                                        fVar7.f170341j = workoutFileUid;
                                        fVar7.f170342k = bVar3;
                                        fVar7.f170343l = listZ;
                                        fVar7.f170344m = fVar2;
                                        fVar7.f170350t = i18;
                                        fVar7.f170354y = z16;
                                        fVar7.f170355z = zBooleanValue2;
                                        fVar7.f170351v = sportFitType;
                                        i27 = i25;
                                        fVar7.f170352w = i27;
                                        list = listZ;
                                        fVar7.f170353x = i24;
                                        fVar7.C = 10;
                                        uuid = workoutFileUid;
                                        objB = b(activityStartRequest5, str, fVar7);
                                        aVar8 = aVar3;
                                        if (objB != aVar8) {
                                            boolean z411 = z16;
                                            z17 = zBooleanValue2;
                                            i28 = i18;
                                            z18 = z411;
                                            dVar5 = dVarA;
                                            i29 = sportFitType;
                                            aVar4 = aVar8;
                                            obj2 = objB;
                                            list2 = list;
                                            str3 = str;
                                            i30 = i24;
                                            activityStartRequest6 = activityStartRequest5;
                                            fVar3 = fVar2;
                                            uuid2 = uuidC;
                                            i34 = i27;
                                            str4 = strD;
                                            lVar = bVar3;
                                            cVar8 = cVar7;
                                            gVar6 = (zf2.g) obj2;
                                            target = activityStartRequest6.getTarget();
                                            i44 = i30;
                                            arrayList3 = new ArrayList();
                                            if (target != null) {
                                                if (target.hasDistance()) {
                                                    arrayList3.add(new zf2.c.a(target.getDistance()));
                                                }
                                                if (target.hasTime()) {
                                                    arrayList3.add(new zf2.c.d(target.getTime()));
                                                }
                                                if (target.hasSpeed()) {
                                                    arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                                }
                                                if (target.hasReps()) {
                                                    arrayList3.add(new zf2.c.b(target.getReps()));
                                                }
                                            } else {
                                                i34 = i34;
                                                i29 = i29;
                                            }
                                            listB1 = p13.h0.b1(arrayList3);
                                            long f172494b8 = cVar8.getF92746j();
                                            String f172493a4 = cVar8.getF92741e();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar8;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar5;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar;
                                            fVar7.f170343l = list2;
                                            fVar7.f170344m = fVar3;
                                            fVar7.f170345n = gVar6;
                                            fVar7.f170346o = listB1;
                                            fVar7.f170350t = i28;
                                            fVar7.f170354y = z18;
                                            fVar7.f170355z = z17;
                                            i45 = i29;
                                            fVar7.f170351v = i45;
                                            i46 = i34;
                                            fVar7.f170352w = i46;
                                            i47 = i28;
                                            fVar7.f170353x = i44;
                                            fVar7.C = 11;
                                            GDIDataTypes.UUID uuid10 = uuid;
                                            z27 = z17;
                                            z28 = z18;
                                            lVar2 = lVar;
                                            objC = this.f170314c.c(str3, f172494b8, f172493a4, uuid10, fVar7);
                                            aVar5 = aVar4;
                                            if (objC == aVar5) {
                                                return aVar5;
                                            }
                                            list3 = list2;
                                            obj5 = objC;
                                            aVar6 = aVar5;
                                            cVar9 = cVar8;
                                            dVar6 = dVar5;
                                            z29 = z28;
                                            z34 = z27;
                                            i48 = i46;
                                            i49 = i47;
                                            i54 = i45;
                                            i55 = i44;
                                            list4 = listB1;
                                            gVar7 = gVar6;
                                            lVar3 = lVar2;
                                            fVar4 = fVar3;
                                            pVar = (vf2.p) obj5;
                                            long f172494b9 = cVar9.getF92746j();
                                            i56 = i54;
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar9;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar6;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar3;
                                            fVar7.f170343l = list3;
                                            fVar7.f170344m = fVar4;
                                            fVar7.f170345n = gVar7;
                                            fVar7.f170346o = list4;
                                            fVar7.f170347p = pVar;
                                            fVar7.f170350t = i49;
                                            fVar7.f170354y = z29;
                                            fVar7.f170355z = z34;
                                            fVar7.f170351v = i56;
                                            fVar5 = fVar4;
                                            fVar7.f170352w = i48;
                                            fVar7.f170353x = i55;
                                            fVar7.C = 12;
                                            list5 = list3;
                                            aVar7 = aVar6;
                                            z35 = z34;
                                            gVar8 = gVar7;
                                            z36 = z29;
                                            i57 = i49;
                                            list6 = list4;
                                            lVar4 = lVar3;
                                            objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b9, fVar7);
                                            fVar7 = fVar7;
                                            if (objB3 == aVar7) {
                                                return aVar7;
                                            }
                                            obj6 = objB3;
                                            i58 = i57;
                                            fVar6 = fVar5;
                                            z37 = z35;
                                            aVar8 = aVar7;
                                            cVar10 = cVar9;
                                            list7 = list5;
                                            pVar2 = pVar;
                                            gVar9 = gVar8;
                                            z38 = z36;
                                            i59 = i56;
                                            Iterable iterable4 = (Iterable) obj6;
                                            z39 = z37;
                                            z44 = z38;
                                            arrayList4 = new ArrayList(p13.y.r(iterable4, 10));
                                            it6 = iterable4.iterator();
                                            while (it6.hasNext()) {
                                                arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                            }
                                            GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder10 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                            builderNewBuilder10.addAllRequestedTypes(arrayList4);
                                            GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder11 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                            builderNewBuilder11.setMetricConfigurationRequest(builderNewBuilder10.build());
                                            GDISmartProto.Smart.Builder builderNewBuilder12 = GDISmartProto.Smart.newBuilder();
                                            builderNewBuilder12.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder11.build());
                                            smartBuild = builderNewBuilder12.build();
                                            String str14 = "activityStartRequest smart " + smartBuild;
                                            zg2.c.f204692a.getClass();
                                            str10 = str2;
                                            zg2.c.a(str10, str14);
                                            smartBuild.getClass();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar6;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar4;
                                            fVar7.f170343l = list7;
                                            fVar7.f170344m = fVar6;
                                            fVar7.f170345n = gVar9;
                                            fVar7.f170346o = list6;
                                            fVar7.f170347p = pVar2;
                                            fVar7.f170348q = smartBuild;
                                            fVar7.f170350t = i58;
                                            z45 = z44;
                                            fVar7.f170354y = z45;
                                            i58 = i58;
                                            fVar7.f170355z = z39;
                                            z39 = z39;
                                            i66 = i59;
                                            fVar7.f170351v = i66;
                                            i59 = i66;
                                            i67 = i48;
                                            fVar7.f170352w = i67;
                                            i48 = i67;
                                            i68 = i55;
                                            fVar7.f170353x = i68;
                                            pVar3 = pVar2;
                                            fVar7.C = 13;
                                            objB4 = gVar5.b(smartBuild, fVar7);
                                            aVar8 = aVar8;
                                            if (objB4 == aVar8) {
                                                return aVar8;
                                            }
                                            list8 = list6;
                                            str8 = str4;
                                            i69 = i59;
                                            i74 = i48;
                                            z46 = z39;
                                            gVar10 = gVar9;
                                            uuid4 = uuid2;
                                            i75 = i68;
                                            smart = smartBuild;
                                            i76 = i58;
                                            smart2 = (GDISmartProto.Smart) objB4;
                                            smart.getClass();
                                            y0Var2.getClass();
                                            gVar5.getClass();
                                            lVar5 = lVar4;
                                            y0Var = y0Var2;
                                            y0Var.f170541b = gVar5;
                                            y0Var.f170540a = smart;
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a(str10, "activityStartRequest response " + smart2);
                                            generatedExtension = GDILiveSessionExtension.liveSessionService;
                                            if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                                typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                                zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                                if (!typesList.isEmpty()) {
                                                    dVar7 = dVar6;
                                                    zf2.a aVar12 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                    i77 = i69;
                                                    i78 = i74;
                                                    zf2.h hVar4 = new zf2.h(fVar6, list7);
                                                    if (dVar7 == zf2.d.f204583b2) {
                                                        str9 = null;
                                                    } else {
                                                        str9 = null;
                                                    }
                                                    cVar12 = cVar10;
                                                    cVar11 = new sf2.f.c(uuid4, cVar12, aVar12, lVar5, pVar3, hVar4, gVar10, false, str9);
                                                    e2VarA3 = getF170500a();
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar10;
                                                    fVar7.f170334c = null;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = null;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = null;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = null;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = null;
                                                    fVar7.f170343l = null;
                                                    fVar7.f170344m = null;
                                                    fVar7.f170345n = null;
                                                    fVar7.f170346o = null;
                                                    fVar7.f170347p = null;
                                                    fVar7.f170348q = null;
                                                    fVar7.f170349r = null;
                                                    fVar7.f170350t = i76;
                                                    fVar7.f170354y = z45;
                                                    fVar7.f170355z = z46;
                                                    fVar7.f170351v = i77;
                                                    fVar7.f170352w = i78;
                                                    fVar7.f170353x = i75;
                                                    fVar7.C = 14;
                                                    if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                        return aVar8;
                                                    }
                                                    i85 = i75;
                                                    i86 = i77;
                                                    i79 = i78;
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar10;
                                                    fVar7.f170334c = null;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = null;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = null;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = null;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = null;
                                                    fVar7.f170343l = null;
                                                    fVar7.f170344m = null;
                                                    fVar7.f170345n = null;
                                                    fVar7.f170346o = null;
                                                    fVar7.f170347p = null;
                                                    fVar7.f170348q = null;
                                                    fVar7.f170349r = null;
                                                    fVar7.f170350t = i76;
                                                    fVar7.f170354y = z45;
                                                    fVar7.f170355z = z46;
                                                    fVar7.f170351v = i86;
                                                    fVar7.f170352w = i79 == true ? 1 : 0;
                                                    fVar7.f170353x = i85;
                                                    fVar7.C = 15;
                                                    if (y0Var.b(fVar7) == aVar8) {
                                                        return aVar8;
                                                    }
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        aVar = aVar8;
                                        activityStartRequest4 = activityStartRequest3;
                                    }
                                    i19 = 1;
                                    if (i19 != 0) {
                                        zg2.c.d("LSVSessionStartInteractor", am.j.g(sportFitType, sportFitSubType, "Unsupported activity type (sportType: ", ", subSportType: ", ")"));
                                        if (dVarA != null) {
                                        }
                                        tf2.g gVar12 = (tf2.g) tVar3.getValue();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = null;
                                        fVar7.f170334c = null;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuidC;
                                        fVar7.f170337f = strD;
                                        fVar7.f170338g = null;
                                        fVar7.f170339h = null;
                                        fVar7.f170350t = i18;
                                        fVar7.f170354y = z16;
                                        fVar7.f170355z = zBooleanValue2;
                                        fVar7.f170351v = sportFitType;
                                        fVar7.f170352w = sportFitSubType;
                                        fVar7.f170353x = i19;
                                        fVar7.C = 8;
                                        objB2 = gVar12.b(sportFitType, sportFitSubType, fVar7);
                                        obj3 = aVar;
                                        if (objB2 != obj3) {
                                            z19 = zBooleanValue2;
                                            obj4 = objB2;
                                            str6 = strD;
                                            uuid3 = uuidC;
                                            i36 = sportFitType;
                                            i37 = sportFitSubType;
                                            tVar2 = tVar3;
                                            i39 = i37;
                                            i38 = i36;
                                            uuidC = uuid3;
                                            str7 = (String) obj4;
                                            zBooleanValue2 = z19;
                                            tVar = tVar2;
                                            if (str6 == null) {
                                                tVar = tVar3;
                                                strA = str6;
                                            } else if (str7 != null) {
                                                strA = ((tf2.g) tVar.getValue()).a(str7);
                                            } else {
                                                strA = null;
                                            }
                                            sf2.f.d dVar10 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                                            e2 e2VarA10 = getF170500a();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = null;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170350t = i18;
                                            fVar7.f170354y = z16;
                                            fVar7.f170355z = zBooleanValue2;
                                            fVar7.f170351v = i38;
                                            fVar7.f170352w = i39;
                                            fVar7.f170353x = i19;
                                            fVar7.C = 9;
                                            break;
                                        }
                                        return obj3;
                                    }
                                    aVar2 = aVar;
                                    str = dVarA.f204629a;
                                    if (strD == null) {
                                        strD = ((tf2.g) tVar3.getValue()).d(dVarA);
                                    }
                                    zg2.c.a("LSVSessionStartInteractor", "Activity type " + dVarA);
                                    if (activityStartRequest4.hasWorkoutFileUid()) {
                                        workoutFileUid = activityStartRequest4.getWorkoutFileUid();
                                    } else {
                                        workoutFileUid = null;
                                    }
                                    if (activityStartRequest4.hasWorkoutSession()) {
                                        aVar3 = aVar2;
                                        bVar3 = null;
                                    } else {
                                        aVar3 = aVar2;
                                        bVar3 = null;
                                    }
                                    zg2.c.a("LSVSessionStartInteractor", "workout Session Type " + bVar3);
                                    if (activityStartRequest4.getZonesCount() > 0) {
                                        List<GDILiveSessionProto.Zones> zonesList5 = activityStartRequest4.getZonesList();
                                        ArrayList arrayListL5 = androidx.core.view.j.l(zonesList5);
                                        it4 = zonesList5.iterator();
                                        while (it4.hasNext()) {
                                            Iterator it11 = it4;
                                            Object next5 = it11.next();
                                            zones2 = (GDILiveSessionProto.Zones) next5;
                                            if (zones2.hasType()) {
                                                str5 = str10;
                                                i35 = i19;
                                                if (zones2.getType() != GDILiveSessionProto.Zones.Type.POWER) {
                                                }
                                            } else {
                                                i35 = i19;
                                                str5 = str10;
                                            }
                                            it4 = it11;
                                            i19 = i35;
                                            str10 = str5;
                                        }
                                        i24 = i19;
                                        str2 = str10;
                                        arrayList2 = new ArrayList();
                                        it5 = arrayListL5.iterator();
                                        while (it5.hasNext()) {
                                            List<Integer> highValuesList5 = ((GDILiveSessionProto.Zones) it5.next()).getHighValuesList();
                                            highValuesList5.getClass();
                                            p13.d0.v(arrayList2, highValuesList5);
                                        }
                                        listZ = p13.h0.Z(arrayList2);
                                    } else {
                                        i24 = i19;
                                        str2 = "LSVSessionStartInteractor";
                                        listZ = p13.j0.f134944a;
                                    }
                                    if (activityStartRequest4.getZonesCount() <= 0) {
                                        i25 = sportFitSubType;
                                    } else {
                                        List<GDILiveSessionProto.Zones> zonesList6 = activityStartRequest4.getZonesList();
                                        ArrayList arrayListL6 = androidx.core.view.j.l(zonesList6);
                                        it = zonesList6.iterator();
                                        while (it.hasNext()) {
                                            Object next6 = it.next();
                                            zones = (GDILiveSessionProto.Zones) next6;
                                            Iterator it12 = it;
                                            if (zones.hasType()) {
                                                i26 = sportFitSubType;
                                                if (zones.getType() != GDILiveSessionProto.Zones.Type.HR) {
                                                }
                                            } else {
                                                i26 = sportFitSubType;
                                            }
                                            it = it12;
                                            sportFitSubType = i26;
                                        }
                                        i25 = sportFitSubType;
                                        arrayList = new ArrayList();
                                        it3 = arrayListL6.iterator();
                                        while (it3.hasNext()) {
                                            List<Integer> highValuesList6 = ((GDILiveSessionProto.Zones) it3.next()).getHighValuesList();
                                            highValuesList6.getClass();
                                            p13.d0.v(arrayList, highValuesList6);
                                        }
                                        arrayListZ = p13.h0.Z(arrayList);
                                        if (arrayListZ.size() >= 5) {
                                            fVar2 = new zf2.f(((Number) arrayListZ.get(0)).intValue(), ((Number) arrayListZ.get(1)).intValue(), ((Number) arrayListZ.get(2)).intValue(), ((Number) arrayListZ.get(3)).intValue(), ((Number) arrayListZ.get(4)).intValue());
                                        }
                                        activityStartRequest5 = activityStartRequest4;
                                        fVar7.f170332a = activityStartRequest5;
                                        fVar7.f170333b = cVar7;
                                        gVar5 = gVar4;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuidC;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVarA;
                                        fVar7.f170339h = str;
                                        fVar7.f170340i = strD;
                                        fVar7.f170341j = workoutFileUid;
                                        fVar7.f170342k = bVar3;
                                        fVar7.f170343l = listZ;
                                        fVar7.f170344m = fVar2;
                                        fVar7.f170350t = i18;
                                        fVar7.f170354y = z16;
                                        fVar7.f170355z = zBooleanValue2;
                                        fVar7.f170351v = sportFitType;
                                        i27 = i25;
                                        fVar7.f170352w = i27;
                                        list = listZ;
                                        fVar7.f170353x = i24;
                                        fVar7.C = 10;
                                        uuid = workoutFileUid;
                                        objB = b(activityStartRequest5, str, fVar7);
                                        aVar8 = aVar3;
                                        if (objB != aVar8) {
                                            boolean z412 = z16;
                                            z17 = zBooleanValue2;
                                            i28 = i18;
                                            z18 = z412;
                                            dVar5 = dVarA;
                                            i29 = sportFitType;
                                            aVar4 = aVar8;
                                            obj2 = objB;
                                            list2 = list;
                                            str3 = str;
                                            i30 = i24;
                                            activityStartRequest6 = activityStartRequest5;
                                            fVar3 = fVar2;
                                            uuid2 = uuidC;
                                            i34 = i27;
                                            str4 = strD;
                                            lVar = bVar3;
                                            cVar8 = cVar7;
                                            gVar6 = (zf2.g) obj2;
                                            target = activityStartRequest6.getTarget();
                                            i44 = i30;
                                            arrayList3 = new ArrayList();
                                            if (target != null) {
                                                if (target.hasDistance()) {
                                                    arrayList3.add(new zf2.c.a(target.getDistance()));
                                                }
                                                if (target.hasTime()) {
                                                    arrayList3.add(new zf2.c.d(target.getTime()));
                                                }
                                                if (target.hasSpeed()) {
                                                    arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                                }
                                                if (target.hasReps()) {
                                                    arrayList3.add(new zf2.c.b(target.getReps()));
                                                }
                                            } else {
                                                i34 = i34;
                                                i29 = i29;
                                            }
                                            listB1 = p13.h0.b1(arrayList3);
                                            long f172494b10 = cVar8.getF92746j();
                                            String f172493a5 = cVar8.getF92741e();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar8;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar5;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar;
                                            fVar7.f170343l = list2;
                                            fVar7.f170344m = fVar3;
                                            fVar7.f170345n = gVar6;
                                            fVar7.f170346o = listB1;
                                            fVar7.f170350t = i28;
                                            fVar7.f170354y = z18;
                                            fVar7.f170355z = z17;
                                            i45 = i29;
                                            fVar7.f170351v = i45;
                                            i46 = i34;
                                            fVar7.f170352w = i46;
                                            i47 = i28;
                                            fVar7.f170353x = i44;
                                            fVar7.C = 11;
                                            GDIDataTypes.UUID uuid11 = uuid;
                                            z27 = z17;
                                            z28 = z18;
                                            lVar2 = lVar;
                                            objC = this.f170314c.c(str3, f172494b10, f172493a5, uuid11, fVar7);
                                            aVar5 = aVar4;
                                            if (objC == aVar5) {
                                                return aVar5;
                                            }
                                            list3 = list2;
                                            obj5 = objC;
                                            aVar6 = aVar5;
                                            cVar9 = cVar8;
                                            dVar6 = dVar5;
                                            z29 = z28;
                                            z34 = z27;
                                            i48 = i46;
                                            i49 = i47;
                                            i54 = i45;
                                            i55 = i44;
                                            list4 = listB1;
                                            gVar7 = gVar6;
                                            lVar3 = lVar2;
                                            fVar4 = fVar3;
                                            pVar = (vf2.p) obj5;
                                            long f172494b11 = cVar9.getF92746j();
                                            i56 = i54;
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar9;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar6;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar3;
                                            fVar7.f170343l = list3;
                                            fVar7.f170344m = fVar4;
                                            fVar7.f170345n = gVar7;
                                            fVar7.f170346o = list4;
                                            fVar7.f170347p = pVar;
                                            fVar7.f170350t = i49;
                                            fVar7.f170354y = z29;
                                            fVar7.f170355z = z34;
                                            fVar7.f170351v = i56;
                                            fVar5 = fVar4;
                                            fVar7.f170352w = i48;
                                            fVar7.f170353x = i55;
                                            fVar7.C = 12;
                                            list5 = list3;
                                            aVar7 = aVar6;
                                            z35 = z34;
                                            gVar8 = gVar7;
                                            z36 = z29;
                                            i57 = i49;
                                            list6 = list4;
                                            lVar4 = lVar3;
                                            objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b11, fVar7);
                                            fVar7 = fVar7;
                                            if (objB3 == aVar7) {
                                                return aVar7;
                                            }
                                            obj6 = objB3;
                                            i58 = i57;
                                            fVar6 = fVar5;
                                            z37 = z35;
                                            aVar8 = aVar7;
                                            cVar10 = cVar9;
                                            list7 = list5;
                                            pVar2 = pVar;
                                            gVar9 = gVar8;
                                            z38 = z36;
                                            i59 = i56;
                                            Iterable iterable5 = (Iterable) obj6;
                                            z39 = z37;
                                            z44 = z38;
                                            arrayList4 = new ArrayList(p13.y.r(iterable5, 10));
                                            it6 = iterable5.iterator();
                                            while (it6.hasNext()) {
                                                arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                            }
                                            GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder13 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                            builderNewBuilder13.addAllRequestedTypes(arrayList4);
                                            GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder14 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                            builderNewBuilder14.setMetricConfigurationRequest(builderNewBuilder13.build());
                                            GDISmartProto.Smart.Builder builderNewBuilder15 = GDISmartProto.Smart.newBuilder();
                                            builderNewBuilder15.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder14.build());
                                            smartBuild = builderNewBuilder15.build();
                                            String str15 = "activityStartRequest smart " + smartBuild;
                                            zg2.c.f204692a.getClass();
                                            str10 = str2;
                                            zg2.c.a(str10, str15);
                                            smartBuild.getClass();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar6;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar4;
                                            fVar7.f170343l = list7;
                                            fVar7.f170344m = fVar6;
                                            fVar7.f170345n = gVar9;
                                            fVar7.f170346o = list6;
                                            fVar7.f170347p = pVar2;
                                            fVar7.f170348q = smartBuild;
                                            fVar7.f170350t = i58;
                                            z45 = z44;
                                            fVar7.f170354y = z45;
                                            i58 = i58;
                                            fVar7.f170355z = z39;
                                            z39 = z39;
                                            i66 = i59;
                                            fVar7.f170351v = i66;
                                            i59 = i66;
                                            i67 = i48;
                                            fVar7.f170352w = i67;
                                            i48 = i67;
                                            i68 = i55;
                                            fVar7.f170353x = i68;
                                            pVar3 = pVar2;
                                            fVar7.C = 13;
                                            objB4 = gVar5.b(smartBuild, fVar7);
                                            aVar8 = aVar8;
                                            if (objB4 == aVar8) {
                                                return aVar8;
                                            }
                                            list8 = list6;
                                            str8 = str4;
                                            i69 = i59;
                                            i74 = i48;
                                            z46 = z39;
                                            gVar10 = gVar9;
                                            uuid4 = uuid2;
                                            i75 = i68;
                                            smart = smartBuild;
                                            i76 = i58;
                                            smart2 = (GDISmartProto.Smart) objB4;
                                            smart.getClass();
                                            y0Var2.getClass();
                                            gVar5.getClass();
                                            lVar5 = lVar4;
                                            y0Var = y0Var2;
                                            y0Var.f170541b = gVar5;
                                            y0Var.f170540a = smart;
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a(str10, "activityStartRequest response " + smart2);
                                            generatedExtension = GDILiveSessionExtension.liveSessionService;
                                            if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                                typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                                zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                                if (!typesList.isEmpty()) {
                                                    dVar7 = dVar6;
                                                    zf2.a aVar13 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                    i77 = i69;
                                                    i78 = i74;
                                                    zf2.h hVar5 = new zf2.h(fVar6, list7);
                                                    if (dVar7 == zf2.d.f204583b2) {
                                                        str9 = null;
                                                    } else {
                                                        str9 = null;
                                                    }
                                                    cVar12 = cVar10;
                                                    cVar11 = new sf2.f.c(uuid4, cVar12, aVar13, lVar5, pVar3, hVar5, gVar10, false, str9);
                                                    e2VarA3 = getF170500a();
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar10;
                                                    fVar7.f170334c = null;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = null;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = null;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = null;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = null;
                                                    fVar7.f170343l = null;
                                                    fVar7.f170344m = null;
                                                    fVar7.f170345n = null;
                                                    fVar7.f170346o = null;
                                                    fVar7.f170347p = null;
                                                    fVar7.f170348q = null;
                                                    fVar7.f170349r = null;
                                                    fVar7.f170350t = i76;
                                                    fVar7.f170354y = z45;
                                                    fVar7.f170355z = z46;
                                                    fVar7.f170351v = i77;
                                                    fVar7.f170352w = i78;
                                                    fVar7.f170353x = i75;
                                                    fVar7.C = 14;
                                                    if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                        return aVar8;
                                                    }
                                                    i85 = i75;
                                                    i86 = i77;
                                                    i79 = i78;
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar10;
                                                    fVar7.f170334c = null;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = null;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = null;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = null;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = null;
                                                    fVar7.f170343l = null;
                                                    fVar7.f170344m = null;
                                                    fVar7.f170345n = null;
                                                    fVar7.f170346o = null;
                                                    fVar7.f170347p = null;
                                                    fVar7.f170348q = null;
                                                    fVar7.f170349r = null;
                                                    fVar7.f170350t = i76;
                                                    fVar7.f170354y = z45;
                                                    fVar7.f170355z = z46;
                                                    fVar7.f170351v = i86;
                                                    fVar7.f170352w = i79 == true ? 1 : 0;
                                                    fVar7.f170353x = i85;
                                                    fVar7.C = 15;
                                                    if (y0Var.b(fVar7) == aVar8) {
                                                        return aVar8;
                                                    }
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    fVar2 = null;
                                    activityStartRequest5 = activityStartRequest4;
                                    fVar7.f170332a = activityStartRequest5;
                                    fVar7.f170333b = cVar7;
                                    gVar5 = gVar4;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuidC;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVarA;
                                    fVar7.f170339h = str;
                                    fVar7.f170340i = strD;
                                    fVar7.f170341j = workoutFileUid;
                                    fVar7.f170342k = bVar3;
                                    fVar7.f170343l = listZ;
                                    fVar7.f170344m = fVar2;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = sportFitType;
                                    i27 = i25;
                                    fVar7.f170352w = i27;
                                    list = listZ;
                                    fVar7.f170353x = i24;
                                    fVar7.C = 10;
                                    uuid = workoutFileUid;
                                    objB = b(activityStartRequest5, str, fVar7);
                                    aVar8 = aVar3;
                                    if (objB != aVar8) {
                                        boolean z413 = z16;
                                        z17 = zBooleanValue2;
                                        i28 = i18;
                                        z18 = z413;
                                        dVar5 = dVarA;
                                        i29 = sportFitType;
                                        aVar4 = aVar8;
                                        obj2 = objB;
                                        list2 = list;
                                        str3 = str;
                                        i30 = i24;
                                        activityStartRequest6 = activityStartRequest5;
                                        fVar3 = fVar2;
                                        uuid2 = uuidC;
                                        i34 = i27;
                                        str4 = strD;
                                        lVar = bVar3;
                                        cVar8 = cVar7;
                                        gVar6 = (zf2.g) obj2;
                                        target = activityStartRequest6.getTarget();
                                        i44 = i30;
                                        arrayList3 = new ArrayList();
                                        if (target != null) {
                                            if (target.hasDistance()) {
                                                arrayList3.add(new zf2.c.a(target.getDistance()));
                                            }
                                            if (target.hasTime()) {
                                                arrayList3.add(new zf2.c.d(target.getTime()));
                                            }
                                            if (target.hasSpeed()) {
                                                arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                            }
                                            if (target.hasReps()) {
                                                arrayList3.add(new zf2.c.b(target.getReps()));
                                            }
                                        } else {
                                            i34 = i34;
                                            i29 = i29;
                                        }
                                        listB1 = p13.h0.b1(arrayList3);
                                        long f172494b12 = cVar8.getF92746j();
                                        String f172493a6 = cVar8.getF92741e();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar8;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar5;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar;
                                        fVar7.f170343l = list2;
                                        fVar7.f170344m = fVar3;
                                        fVar7.f170345n = gVar6;
                                        fVar7.f170346o = listB1;
                                        fVar7.f170350t = i28;
                                        fVar7.f170354y = z18;
                                        fVar7.f170355z = z17;
                                        i45 = i29;
                                        fVar7.f170351v = i45;
                                        i46 = i34;
                                        fVar7.f170352w = i46;
                                        i47 = i28;
                                        fVar7.f170353x = i44;
                                        fVar7.C = 11;
                                        GDIDataTypes.UUID uuid12 = uuid;
                                        z27 = z17;
                                        z28 = z18;
                                        lVar2 = lVar;
                                        objC = this.f170314c.c(str3, f172494b12, f172493a6, uuid12, fVar7);
                                        aVar5 = aVar4;
                                        if (objC == aVar5) {
                                            return aVar5;
                                        }
                                        list3 = list2;
                                        obj5 = objC;
                                        aVar6 = aVar5;
                                        cVar9 = cVar8;
                                        dVar6 = dVar5;
                                        z29 = z28;
                                        z34 = z27;
                                        i48 = i46;
                                        i49 = i47;
                                        i54 = i45;
                                        i55 = i44;
                                        list4 = listB1;
                                        gVar7 = gVar6;
                                        lVar3 = lVar2;
                                        fVar4 = fVar3;
                                        pVar = (vf2.p) obj5;
                                        long f172494b13 = cVar9.getF92746j();
                                        i56 = i54;
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar9;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar3;
                                        fVar7.f170343l = list3;
                                        fVar7.f170344m = fVar4;
                                        fVar7.f170345n = gVar7;
                                        fVar7.f170346o = list4;
                                        fVar7.f170347p = pVar;
                                        fVar7.f170350t = i49;
                                        fVar7.f170354y = z29;
                                        fVar7.f170355z = z34;
                                        fVar7.f170351v = i56;
                                        fVar5 = fVar4;
                                        fVar7.f170352w = i48;
                                        fVar7.f170353x = i55;
                                        fVar7.C = 12;
                                        list5 = list3;
                                        aVar7 = aVar6;
                                        z35 = z34;
                                        gVar8 = gVar7;
                                        z36 = z29;
                                        i57 = i49;
                                        list6 = list4;
                                        lVar4 = lVar3;
                                        objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b13, fVar7);
                                        fVar7 = fVar7;
                                        if (objB3 == aVar7) {
                                            return aVar7;
                                        }
                                        obj6 = objB3;
                                        i58 = i57;
                                        fVar6 = fVar5;
                                        z37 = z35;
                                        aVar8 = aVar7;
                                        cVar10 = cVar9;
                                        list7 = list5;
                                        pVar2 = pVar;
                                        gVar9 = gVar8;
                                        z38 = z36;
                                        i59 = i56;
                                        Iterable iterable6 = (Iterable) obj6;
                                        z39 = z37;
                                        z44 = z38;
                                        arrayList4 = new ArrayList(p13.y.r(iterable6, 10));
                                        it6 = iterable6.iterator();
                                        while (it6.hasNext()) {
                                            arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                        }
                                        GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder16 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                        builderNewBuilder16.addAllRequestedTypes(arrayList4);
                                        GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder17 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                        builderNewBuilder17.setMetricConfigurationRequest(builderNewBuilder16.build());
                                        GDISmartProto.Smart.Builder builderNewBuilder18 = GDISmartProto.Smart.newBuilder();
                                        builderNewBuilder18.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder17.build());
                                        smartBuild = builderNewBuilder18.build();
                                        String str16 = "activityStartRequest smart " + smartBuild;
                                        zg2.c.f204692a.getClass();
                                        str10 = str2;
                                        zg2.c.a(str10, str16);
                                        smartBuild.getClass();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar10;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar4;
                                        fVar7.f170343l = list7;
                                        fVar7.f170344m = fVar6;
                                        fVar7.f170345n = gVar9;
                                        fVar7.f170346o = list6;
                                        fVar7.f170347p = pVar2;
                                        fVar7.f170348q = smartBuild;
                                        fVar7.f170350t = i58;
                                        z45 = z44;
                                        fVar7.f170354y = z45;
                                        i58 = i58;
                                        fVar7.f170355z = z39;
                                        z39 = z39;
                                        i66 = i59;
                                        fVar7.f170351v = i66;
                                        i59 = i66;
                                        i67 = i48;
                                        fVar7.f170352w = i67;
                                        i48 = i67;
                                        i68 = i55;
                                        fVar7.f170353x = i68;
                                        pVar3 = pVar2;
                                        fVar7.C = 13;
                                        objB4 = gVar5.b(smartBuild, fVar7);
                                        aVar8 = aVar8;
                                        if (objB4 == aVar8) {
                                            return aVar8;
                                        }
                                        list8 = list6;
                                        str8 = str4;
                                        i69 = i59;
                                        i74 = i48;
                                        z46 = z39;
                                        gVar10 = gVar9;
                                        uuid4 = uuid2;
                                        i75 = i68;
                                        smart = smartBuild;
                                        i76 = i58;
                                        smart2 = (GDISmartProto.Smart) objB4;
                                        smart.getClass();
                                        y0Var2.getClass();
                                        gVar5.getClass();
                                        lVar5 = lVar4;
                                        y0Var = y0Var2;
                                        y0Var.f170541b = gVar5;
                                        y0Var.f170540a = smart;
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a(str10, "activityStartRequest response " + smart2);
                                        generatedExtension = GDILiveSessionExtension.liveSessionService;
                                        if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                            typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                            zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                            if (!typesList.isEmpty()) {
                                                dVar7 = dVar6;
                                                zf2.a aVar14 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                i77 = i69;
                                                i78 = i74;
                                                zf2.h hVar6 = new zf2.h(fVar6, list7);
                                                if (dVar7 == zf2.d.f204583b2) {
                                                    str9 = null;
                                                } else {
                                                    str9 = null;
                                                }
                                                cVar12 = cVar10;
                                                cVar11 = new sf2.f.c(uuid4, cVar12, aVar14, lVar5, pVar3, hVar6, gVar10, false, str9);
                                                e2VarA3 = getF170500a();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i77;
                                                fVar7.f170352w = i78;
                                                fVar7.f170353x = i75;
                                                fVar7.C = 14;
                                                if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                                i85 = i75;
                                                i86 = i77;
                                                i79 = i78;
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i86;
                                                fVar7.f170352w = i79 == true ? 1 : 0;
                                                fVar7.f170353x = i85;
                                                fVar7.C = 15;
                                                if (y0Var.b(fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return aVar8;
                case 1:
                    int i88 = fVar7.f170350t;
                    fg2.d dVar11 = fVar7.f170335d;
                    dt2.g gVar13 = fVar7.f170334c;
                    rs2.c cVar14 = fVar7.f170333b;
                    GDILiveSessionProto.ActivityStartRequest activityStartRequest7 = fVar7.f170332a;
                    o13.r.b(obj7);
                    dVar2 = dVar11;
                    activityStartRequest2 = activityStartRequest7;
                    gVar2 = gVar13;
                    cVar5 = cVar14;
                    i17 = i88;
                    objA = obj7;
                    zBooleanValue = ((Boolean) objA).booleanValue();
                    fg2.c cVar15 = (fg2.c) this.f170320i.getValue();
                    long f172494b14 = cVar5.getF92746j();
                    fVar7.f170332a = activityStartRequest2;
                    fVar7.f170333b = cVar5;
                    fVar7.f170334c = gVar2;
                    fVar7.f170335d = dVar2;
                    fVar7.f170350t = i17;
                    fVar7.f170354y = zBooleanValue;
                    fVar7.C = 2;
                    objD = cVar15.d(f172494b14, fVar7);
                    if (objD != aVar8) {
                        cVar6 = cVar5;
                        dVar3 = dVar2;
                        i18 = i17;
                        activityStartRequest3 = activityStartRequest2;
                        gVar3 = gVar2;
                        z16 = zBooleanValue;
                        obj = objD;
                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (z16) {
                        }
                        if (activityStartRequest3.hasSportProfile()) {
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LSVSessionStartInteractor", "Missing sport profile");
                            e2 e2VarA11 = getF170500a();
                            sf2.f.b bVar8 = new sf2.f.b(null, sf2.f.b.a.C3008f.f159003a, cVar6, 1, null);
                            fVar7.f170332a = null;
                            fVar7.f170333b = null;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170350t = i18;
                            fVar7.f170354y = z16;
                            fVar7.f170355z = zBooleanValue2;
                            fVar7.C = 3;
                        } else {
                            if (!activityStartRequest3.hasUuid()) {
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LSVSessionStartInteractor", "Missing UUID.");
                                e2VarA2 = getF170500a();
                                bVar2 = new sf2.f.b(null, sf2.f.b.a.c.f159000a, cVar6, 1, null);
                                fVar7.f170332a = null;
                                fVar7.f170333b = null;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.C = 5;
                                if (e2VarA2.emit(bVar2, fVar7) == aVar8) {
                                    return aVar8;
                                }
                                return Unit.INSTANCE;
                            }
                            GDIDataTypes.UUID uuid13 = activityStartRequest3.getUuid();
                            uuid13.getClass();
                            uuidC = lk2.y.c(uuid13);
                            if (uuidC == null) {
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LSVSessionStartInteractor", "Missing UUID - Error converting UUID to java.util.UUID");
                                e2 e2VarA12 = getF170500a();
                                GDIDataTypes.UUID uuid14 = activityStartRequest3.getUuid();
                                uuid14.getClass();
                                sf2.f.b bVar9 = new sf2.f.b(null, new sf2.f.b.a.C3006a(uuid14), cVar6, 1, null);
                                fVar7.f170332a = null;
                                fVar7.f170333b = null;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170336e = null;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.f170351v = 0;
                                fVar7.C = 4;
                            } else if (!activityStartRequest3.getSportProfile().hasSportFitType()) {
                                zg2.c.f204692a.getClass();
                                zg2.c.b("LSVSessionStartInteractor", "Missing sport type");
                                e2 e2VarA13 = getF170500a();
                                sf2.f.b bVar10 = new sf2.f.b(null, sf2.f.b.a.e.f159002a, cVar6, 1, null);
                                fVar7.f170332a = null;
                                fVar7.f170333b = null;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170336e = null;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.C = 6;
                            } else if (!activityStartRequest3.getSportProfile().hasSportFitSubType()) {
                                zg2.c.f204692a.getClass();
                                zg2.c.b("LSVSessionStartInteractor", "Missing sub sport type");
                                e2 e2VarA14 = getF170500a();
                                sf2.f.b bVar11 = new sf2.f.b(null, sf2.f.b.a.d.f159001a, cVar6, 1, null);
                                fVar7.f170332a = null;
                                fVar7.f170333b = null;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170336e = null;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.C = 7;
                            } else {
                                cVar7 = cVar6;
                                sportFitType = activityStartRequest3.getSportProfile().getSportFitType();
                                sportFitSubType = activityStartRequest3.getSportProfile().getSportFitSubType();
                                if (activityStartRequest3.getSportProfile().hasName()) {
                                    strD = activityStartRequest3.getSportProfile().getName();
                                } else {
                                    strD = null;
                                }
                                dVar4 = dVar3;
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LSVSessionStartInteractor", "sportType " + sportFitType + ", subSportType: " + sportFitSubType);
                                zf2.d.f204601l.getClass();
                                dVarA = zf2.d.a.a(sportFitType, sportFitSubType);
                                gVar4 = gVar3;
                                iVar = (zg2.i) KoinJavaComponent.get$default(zg2.i.class, null, null, 6, null);
                                if (dVarA != null) {
                                    iVar.getClass();
                                    dVar4.getClass();
                                    if (i18 >= 2) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    if (zBooleanValue2) {
                                        z25 = false;
                                    } else {
                                        z25 = false;
                                    }
                                    switch (zg2.i.b.f204716a[dVarA.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                            activityStartRequest4 = activityStartRequest3;
                                            if (z16) {
                                                z26 = false;
                                            } else {
                                                z26 = false;
                                            }
                                            aVar = aVar8;
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a("ValidateActivityTypeUseCase", "canShowGCPlusLiveActivity: " + z26 + ", canShowManualStart: " + z25);
                                            if (!z26) {
                                            }
                                            break;
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                            activityStartRequest4 = activityStartRequest3;
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a("ValidateActivityTypeUseCase", "hasGCPlus: " + z16 + ", isManualStart: " + zBooleanValue2);
                                            if (z16) {
                                            }
                                            aVar = aVar8;
                                            break;
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                            activityStartRequest4 = activityStartRequest3;
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a("ValidateActivityTypeUseCase", "canShowManualStart: " + z25);
                                            aVar = aVar8;
                                            break;
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                            aVar = aVar8;
                                            activityStartRequest4 = activityStartRequest3;
                                            break;
                                        default:
                                            lc.u0.r();
                                            z25 = false;
                                            aVar = aVar8;
                                            activityStartRequest4 = activityStartRequest3;
                                            break;
                                    }
                                    if (z25) {
                                        i19 = 0;
                                    }
                                    if (i19 != 0) {
                                        zg2.c.d("LSVSessionStartInteractor", am.j.g(sportFitType, sportFitSubType, "Unsupported activity type (sportType: ", ", subSportType: ", ")"));
                                        if (dVarA != null) {
                                            break;
                                        }
                                        tf2.g gVar14 = (tf2.g) tVar3.getValue();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = null;
                                        fVar7.f170334c = null;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuidC;
                                        fVar7.f170337f = strD;
                                        fVar7.f170338g = null;
                                        fVar7.f170339h = null;
                                        fVar7.f170350t = i18;
                                        fVar7.f170354y = z16;
                                        fVar7.f170355z = zBooleanValue2;
                                        fVar7.f170351v = sportFitType;
                                        fVar7.f170352w = sportFitSubType;
                                        fVar7.f170353x = i19;
                                        fVar7.C = 8;
                                        objB2 = gVar14.b(sportFitType, sportFitSubType, fVar7);
                                        obj3 = aVar;
                                        if (objB2 != obj3) {
                                            z19 = zBooleanValue2;
                                            obj4 = objB2;
                                            str6 = strD;
                                            uuid3 = uuidC;
                                            i36 = sportFitType;
                                            i37 = sportFitSubType;
                                            tVar2 = tVar3;
                                            i39 = i37;
                                            i38 = i36;
                                            uuidC = uuid3;
                                            str7 = (String) obj4;
                                            zBooleanValue2 = z19;
                                            tVar = tVar2;
                                            if (str6 == null) {
                                                tVar = tVar3;
                                                strA = str6;
                                            } else if (str7 != null) {
                                                strA = ((tf2.g) tVar.getValue()).a(str7);
                                            } else {
                                                strA = null;
                                            }
                                            sf2.f.d dVar12 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                                            e2 e2VarA15 = getF170500a();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = null;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170350t = i18;
                                            fVar7.f170354y = z16;
                                            fVar7.f170355z = zBooleanValue2;
                                            fVar7.f170351v = i38;
                                            fVar7.f170352w = i39;
                                            fVar7.f170353x = i19;
                                            fVar7.C = 9;
                                            break;
                                        }
                                        return obj3;
                                    }
                                    aVar2 = aVar;
                                    str = dVarA.f204629a;
                                    if (strD == null) {
                                        strD = ((tf2.g) tVar3.getValue()).d(dVarA);
                                    }
                                    zg2.c.a("LSVSessionStartInteractor", "Activity type " + dVarA);
                                    if (activityStartRequest4.hasWorkoutFileUid()) {
                                        workoutFileUid = activityStartRequest4.getWorkoutFileUid();
                                    } else {
                                        workoutFileUid = null;
                                    }
                                    if (activityStartRequest4.hasWorkoutSession()) {
                                        aVar3 = aVar2;
                                        bVar3 = null;
                                    } else {
                                        aVar3 = aVar2;
                                        bVar3 = null;
                                    }
                                    zg2.c.a("LSVSessionStartInteractor", "workout Session Type " + bVar3);
                                    if (activityStartRequest4.getZonesCount() > 0) {
                                        List<GDILiveSessionProto.Zones> zonesList7 = activityStartRequest4.getZonesList();
                                        ArrayList arrayListL7 = androidx.core.view.j.l(zonesList7);
                                        it4 = zonesList7.iterator();
                                        while (it4.hasNext()) {
                                            Iterator it13 = it4;
                                            Object next7 = it13.next();
                                            zones2 = (GDILiveSessionProto.Zones) next7;
                                            if (zones2.hasType()) {
                                                str5 = str10;
                                                i35 = i19;
                                                if (zones2.getType() != GDILiveSessionProto.Zones.Type.POWER) {
                                                }
                                            } else {
                                                i35 = i19;
                                                str5 = str10;
                                            }
                                            it4 = it13;
                                            i19 = i35;
                                            str10 = str5;
                                        }
                                        i24 = i19;
                                        str2 = str10;
                                        arrayList2 = new ArrayList();
                                        it5 = arrayListL7.iterator();
                                        while (it5.hasNext()) {
                                            List<Integer> highValuesList7 = ((GDILiveSessionProto.Zones) it5.next()).getHighValuesList();
                                            highValuesList7.getClass();
                                            p13.d0.v(arrayList2, highValuesList7);
                                        }
                                        listZ = p13.h0.Z(arrayList2);
                                    } else {
                                        i24 = i19;
                                        str2 = "LSVSessionStartInteractor";
                                        listZ = p13.j0.f134944a;
                                    }
                                    if (activityStartRequest4.getZonesCount() <= 0) {
                                        i25 = sportFitSubType;
                                    } else {
                                        List<GDILiveSessionProto.Zones> zonesList8 = activityStartRequest4.getZonesList();
                                        ArrayList arrayListL8 = androidx.core.view.j.l(zonesList8);
                                        it = zonesList8.iterator();
                                        while (it.hasNext()) {
                                            Object next8 = it.next();
                                            zones = (GDILiveSessionProto.Zones) next8;
                                            Iterator it14 = it;
                                            if (zones.hasType()) {
                                                i26 = sportFitSubType;
                                                if (zones.getType() != GDILiveSessionProto.Zones.Type.HR) {
                                                }
                                            } else {
                                                i26 = sportFitSubType;
                                            }
                                            it = it14;
                                            sportFitSubType = i26;
                                        }
                                        i25 = sportFitSubType;
                                        arrayList = new ArrayList();
                                        it3 = arrayListL8.iterator();
                                        while (it3.hasNext()) {
                                            List<Integer> highValuesList8 = ((GDILiveSessionProto.Zones) it3.next()).getHighValuesList();
                                            highValuesList8.getClass();
                                            p13.d0.v(arrayList, highValuesList8);
                                        }
                                        arrayListZ = p13.h0.Z(arrayList);
                                        if (arrayListZ.size() >= 5) {
                                            fVar2 = new zf2.f(((Number) arrayListZ.get(0)).intValue(), ((Number) arrayListZ.get(1)).intValue(), ((Number) arrayListZ.get(2)).intValue(), ((Number) arrayListZ.get(3)).intValue(), ((Number) arrayListZ.get(4)).intValue());
                                        }
                                        activityStartRequest5 = activityStartRequest4;
                                        fVar7.f170332a = activityStartRequest5;
                                        fVar7.f170333b = cVar7;
                                        gVar5 = gVar4;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuidC;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVarA;
                                        fVar7.f170339h = str;
                                        fVar7.f170340i = strD;
                                        fVar7.f170341j = workoutFileUid;
                                        fVar7.f170342k = bVar3;
                                        fVar7.f170343l = listZ;
                                        fVar7.f170344m = fVar2;
                                        fVar7.f170350t = i18;
                                        fVar7.f170354y = z16;
                                        fVar7.f170355z = zBooleanValue2;
                                        fVar7.f170351v = sportFitType;
                                        i27 = i25;
                                        fVar7.f170352w = i27;
                                        list = listZ;
                                        fVar7.f170353x = i24;
                                        fVar7.C = 10;
                                        uuid = workoutFileUid;
                                        objB = b(activityStartRequest5, str, fVar7);
                                        aVar8 = aVar3;
                                        if (objB != aVar8) {
                                            boolean z414 = z16;
                                            z17 = zBooleanValue2;
                                            i28 = i18;
                                            z18 = z414;
                                            dVar5 = dVarA;
                                            i29 = sportFitType;
                                            aVar4 = aVar8;
                                            obj2 = objB;
                                            list2 = list;
                                            str3 = str;
                                            i30 = i24;
                                            activityStartRequest6 = activityStartRequest5;
                                            fVar3 = fVar2;
                                            uuid2 = uuidC;
                                            i34 = i27;
                                            str4 = strD;
                                            lVar = bVar3;
                                            cVar8 = cVar7;
                                            gVar6 = (zf2.g) obj2;
                                            target = activityStartRequest6.getTarget();
                                            i44 = i30;
                                            arrayList3 = new ArrayList();
                                            if (target != null) {
                                                if (target.hasDistance()) {
                                                    arrayList3.add(new zf2.c.a(target.getDistance()));
                                                }
                                                if (target.hasTime()) {
                                                    arrayList3.add(new zf2.c.d(target.getTime()));
                                                }
                                                if (target.hasSpeed()) {
                                                    arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                                }
                                                if (target.hasReps()) {
                                                    arrayList3.add(new zf2.c.b(target.getReps()));
                                                }
                                            } else {
                                                i34 = i34;
                                                i29 = i29;
                                            }
                                            listB1 = p13.h0.b1(arrayList3);
                                            long f172494b15 = cVar8.getF92746j();
                                            String f172493a7 = cVar8.getF92741e();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar8;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar5;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar;
                                            fVar7.f170343l = list2;
                                            fVar7.f170344m = fVar3;
                                            fVar7.f170345n = gVar6;
                                            fVar7.f170346o = listB1;
                                            fVar7.f170350t = i28;
                                            fVar7.f170354y = z18;
                                            fVar7.f170355z = z17;
                                            i45 = i29;
                                            fVar7.f170351v = i45;
                                            i46 = i34;
                                            fVar7.f170352w = i46;
                                            i47 = i28;
                                            fVar7.f170353x = i44;
                                            fVar7.C = 11;
                                            GDIDataTypes.UUID uuid15 = uuid;
                                            z27 = z17;
                                            z28 = z18;
                                            lVar2 = lVar;
                                            objC = this.f170314c.c(str3, f172494b15, f172493a7, uuid15, fVar7);
                                            aVar5 = aVar4;
                                            if (objC == aVar5) {
                                                return aVar5;
                                            }
                                            list3 = list2;
                                            obj5 = objC;
                                            aVar6 = aVar5;
                                            cVar9 = cVar8;
                                            dVar6 = dVar5;
                                            z29 = z28;
                                            z34 = z27;
                                            i48 = i46;
                                            i49 = i47;
                                            i54 = i45;
                                            i55 = i44;
                                            list4 = listB1;
                                            gVar7 = gVar6;
                                            lVar3 = lVar2;
                                            fVar4 = fVar3;
                                            pVar = (vf2.p) obj5;
                                            long f172494b16 = cVar9.getF92746j();
                                            i56 = i54;
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar9;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar6;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar3;
                                            fVar7.f170343l = list3;
                                            fVar7.f170344m = fVar4;
                                            fVar7.f170345n = gVar7;
                                            fVar7.f170346o = list4;
                                            fVar7.f170347p = pVar;
                                            fVar7.f170350t = i49;
                                            fVar7.f170354y = z29;
                                            fVar7.f170355z = z34;
                                            fVar7.f170351v = i56;
                                            fVar5 = fVar4;
                                            fVar7.f170352w = i48;
                                            fVar7.f170353x = i55;
                                            fVar7.C = 12;
                                            list5 = list3;
                                            aVar7 = aVar6;
                                            z35 = z34;
                                            gVar8 = gVar7;
                                            z36 = z29;
                                            i57 = i49;
                                            list6 = list4;
                                            lVar4 = lVar3;
                                            objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b16, fVar7);
                                            fVar7 = fVar7;
                                            if (objB3 == aVar7) {
                                                return aVar7;
                                            }
                                            obj6 = objB3;
                                            i58 = i57;
                                            fVar6 = fVar5;
                                            z37 = z35;
                                            aVar8 = aVar7;
                                            cVar10 = cVar9;
                                            list7 = list5;
                                            pVar2 = pVar;
                                            gVar9 = gVar8;
                                            z38 = z36;
                                            i59 = i56;
                                            Iterable iterable7 = (Iterable) obj6;
                                            z39 = z37;
                                            z44 = z38;
                                            arrayList4 = new ArrayList(p13.y.r(iterable7, 10));
                                            it6 = iterable7.iterator();
                                            while (it6.hasNext()) {
                                                arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                            }
                                            GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder19 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                            builderNewBuilder19.addAllRequestedTypes(arrayList4);
                                            GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder110 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                            builderNewBuilder110.setMetricConfigurationRequest(builderNewBuilder19.build());
                                            GDISmartProto.Smart.Builder builderNewBuilder111 = GDISmartProto.Smart.newBuilder();
                                            builderNewBuilder111.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder110.build());
                                            smartBuild = builderNewBuilder111.build();
                                            String str17 = "activityStartRequest smart " + smartBuild;
                                            zg2.c.f204692a.getClass();
                                            str10 = str2;
                                            zg2.c.a(str10, str17);
                                            smartBuild.getClass();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = gVar5;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = uuid2;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = dVar6;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = str4;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = lVar4;
                                            fVar7.f170343l = list7;
                                            fVar7.f170344m = fVar6;
                                            fVar7.f170345n = gVar9;
                                            fVar7.f170346o = list6;
                                            fVar7.f170347p = pVar2;
                                            fVar7.f170348q = smartBuild;
                                            fVar7.f170350t = i58;
                                            z45 = z44;
                                            fVar7.f170354y = z45;
                                            i58 = i58;
                                            fVar7.f170355z = z39;
                                            z39 = z39;
                                            i66 = i59;
                                            fVar7.f170351v = i66;
                                            i59 = i66;
                                            i67 = i48;
                                            fVar7.f170352w = i67;
                                            i48 = i67;
                                            i68 = i55;
                                            fVar7.f170353x = i68;
                                            pVar3 = pVar2;
                                            fVar7.C = 13;
                                            objB4 = gVar5.b(smartBuild, fVar7);
                                            aVar8 = aVar8;
                                            if (objB4 == aVar8) {
                                                return aVar8;
                                            }
                                            list8 = list6;
                                            str8 = str4;
                                            i69 = i59;
                                            i74 = i48;
                                            z46 = z39;
                                            gVar10 = gVar9;
                                            uuid4 = uuid2;
                                            i75 = i68;
                                            smart = smartBuild;
                                            i76 = i58;
                                            smart2 = (GDISmartProto.Smart) objB4;
                                            smart.getClass();
                                            y0Var2.getClass();
                                            gVar5.getClass();
                                            lVar5 = lVar4;
                                            y0Var = y0Var2;
                                            y0Var.f170541b = gVar5;
                                            y0Var.f170540a = smart;
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a(str10, "activityStartRequest response " + smart2);
                                            generatedExtension = GDILiveSessionExtension.liveSessionService;
                                            if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                                typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                                zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                                if (!typesList.isEmpty()) {
                                                    dVar7 = dVar6;
                                                    zf2.a aVar15 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                    i77 = i69;
                                                    i78 = i74;
                                                    zf2.h hVar7 = new zf2.h(fVar6, list7);
                                                    if (dVar7 == zf2.d.f204583b2) {
                                                        str9 = null;
                                                    } else {
                                                        str9 = null;
                                                    }
                                                    cVar12 = cVar10;
                                                    cVar11 = new sf2.f.c(uuid4, cVar12, aVar15, lVar5, pVar3, hVar7, gVar10, false, str9);
                                                    e2VarA3 = getF170500a();
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar10;
                                                    fVar7.f170334c = null;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = null;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = null;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = null;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = null;
                                                    fVar7.f170343l = null;
                                                    fVar7.f170344m = null;
                                                    fVar7.f170345n = null;
                                                    fVar7.f170346o = null;
                                                    fVar7.f170347p = null;
                                                    fVar7.f170348q = null;
                                                    fVar7.f170349r = null;
                                                    fVar7.f170350t = i76;
                                                    fVar7.f170354y = z45;
                                                    fVar7.f170355z = z46;
                                                    fVar7.f170351v = i77;
                                                    fVar7.f170352w = i78;
                                                    fVar7.f170353x = i75;
                                                    fVar7.C = 14;
                                                    if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                        return aVar8;
                                                    }
                                                    i85 = i75;
                                                    i86 = i77;
                                                    i79 = i78;
                                                    fVar7.f170332a = null;
                                                    fVar7.f170333b = cVar10;
                                                    fVar7.f170334c = null;
                                                    fVar7.f170335d = null;
                                                    fVar7.f170336e = null;
                                                    fVar7.f170337f = null;
                                                    fVar7.f170338g = null;
                                                    fVar7.f170339h = null;
                                                    fVar7.f170340i = null;
                                                    fVar7.f170341j = null;
                                                    fVar7.f170342k = null;
                                                    fVar7.f170343l = null;
                                                    fVar7.f170344m = null;
                                                    fVar7.f170345n = null;
                                                    fVar7.f170346o = null;
                                                    fVar7.f170347p = null;
                                                    fVar7.f170348q = null;
                                                    fVar7.f170349r = null;
                                                    fVar7.f170350t = i76;
                                                    fVar7.f170354y = z45;
                                                    fVar7.f170355z = z46;
                                                    fVar7.f170351v = i86;
                                                    fVar7.f170352w = i79 == true ? 1 : 0;
                                                    fVar7.f170353x = i85;
                                                    fVar7.C = 15;
                                                    if (y0Var.b(fVar7) == aVar8) {
                                                        return aVar8;
                                                    }
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    fVar2 = null;
                                    activityStartRequest5 = activityStartRequest4;
                                    fVar7.f170332a = activityStartRequest5;
                                    fVar7.f170333b = cVar7;
                                    gVar5 = gVar4;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuidC;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVarA;
                                    fVar7.f170339h = str;
                                    fVar7.f170340i = strD;
                                    fVar7.f170341j = workoutFileUid;
                                    fVar7.f170342k = bVar3;
                                    fVar7.f170343l = listZ;
                                    fVar7.f170344m = fVar2;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = sportFitType;
                                    i27 = i25;
                                    fVar7.f170352w = i27;
                                    list = listZ;
                                    fVar7.f170353x = i24;
                                    fVar7.C = 10;
                                    uuid = workoutFileUid;
                                    objB = b(activityStartRequest5, str, fVar7);
                                    aVar8 = aVar3;
                                    if (objB != aVar8) {
                                        boolean z415 = z16;
                                        z17 = zBooleanValue2;
                                        i28 = i18;
                                        z18 = z415;
                                        dVar5 = dVarA;
                                        i29 = sportFitType;
                                        aVar4 = aVar8;
                                        obj2 = objB;
                                        list2 = list;
                                        str3 = str;
                                        i30 = i24;
                                        activityStartRequest6 = activityStartRequest5;
                                        fVar3 = fVar2;
                                        uuid2 = uuidC;
                                        i34 = i27;
                                        str4 = strD;
                                        lVar = bVar3;
                                        cVar8 = cVar7;
                                        gVar6 = (zf2.g) obj2;
                                        target = activityStartRequest6.getTarget();
                                        i44 = i30;
                                        arrayList3 = new ArrayList();
                                        if (target != null) {
                                            if (target.hasDistance()) {
                                                arrayList3.add(new zf2.c.a(target.getDistance()));
                                            }
                                            if (target.hasTime()) {
                                                arrayList3.add(new zf2.c.d(target.getTime()));
                                            }
                                            if (target.hasSpeed()) {
                                                arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                            }
                                            if (target.hasReps()) {
                                                arrayList3.add(new zf2.c.b(target.getReps()));
                                            }
                                        } else {
                                            i34 = i34;
                                            i29 = i29;
                                        }
                                        listB1 = p13.h0.b1(arrayList3);
                                        long f172494b17 = cVar8.getF92746j();
                                        String f172493a8 = cVar8.getF92741e();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar8;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar5;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar;
                                        fVar7.f170343l = list2;
                                        fVar7.f170344m = fVar3;
                                        fVar7.f170345n = gVar6;
                                        fVar7.f170346o = listB1;
                                        fVar7.f170350t = i28;
                                        fVar7.f170354y = z18;
                                        fVar7.f170355z = z17;
                                        i45 = i29;
                                        fVar7.f170351v = i45;
                                        i46 = i34;
                                        fVar7.f170352w = i46;
                                        i47 = i28;
                                        fVar7.f170353x = i44;
                                        fVar7.C = 11;
                                        GDIDataTypes.UUID uuid16 = uuid;
                                        z27 = z17;
                                        z28 = z18;
                                        lVar2 = lVar;
                                        objC = this.f170314c.c(str3, f172494b17, f172493a8, uuid16, fVar7);
                                        aVar5 = aVar4;
                                        if (objC == aVar5) {
                                            return aVar5;
                                        }
                                        list3 = list2;
                                        obj5 = objC;
                                        aVar6 = aVar5;
                                        cVar9 = cVar8;
                                        dVar6 = dVar5;
                                        z29 = z28;
                                        z34 = z27;
                                        i48 = i46;
                                        i49 = i47;
                                        i54 = i45;
                                        i55 = i44;
                                        list4 = listB1;
                                        gVar7 = gVar6;
                                        lVar3 = lVar2;
                                        fVar4 = fVar3;
                                        pVar = (vf2.p) obj5;
                                        long f172494b18 = cVar9.getF92746j();
                                        i56 = i54;
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar9;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar3;
                                        fVar7.f170343l = list3;
                                        fVar7.f170344m = fVar4;
                                        fVar7.f170345n = gVar7;
                                        fVar7.f170346o = list4;
                                        fVar7.f170347p = pVar;
                                        fVar7.f170350t = i49;
                                        fVar7.f170354y = z29;
                                        fVar7.f170355z = z34;
                                        fVar7.f170351v = i56;
                                        fVar5 = fVar4;
                                        fVar7.f170352w = i48;
                                        fVar7.f170353x = i55;
                                        fVar7.C = 12;
                                        list5 = list3;
                                        aVar7 = aVar6;
                                        z35 = z34;
                                        gVar8 = gVar7;
                                        z36 = z29;
                                        i57 = i49;
                                        list6 = list4;
                                        lVar4 = lVar3;
                                        objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b18, fVar7);
                                        fVar7 = fVar7;
                                        if (objB3 == aVar7) {
                                            return aVar7;
                                        }
                                        obj6 = objB3;
                                        i58 = i57;
                                        fVar6 = fVar5;
                                        z37 = z35;
                                        aVar8 = aVar7;
                                        cVar10 = cVar9;
                                        list7 = list5;
                                        pVar2 = pVar;
                                        gVar9 = gVar8;
                                        z38 = z36;
                                        i59 = i56;
                                        Iterable iterable8 = (Iterable) obj6;
                                        z39 = z37;
                                        z44 = z38;
                                        arrayList4 = new ArrayList(p13.y.r(iterable8, 10));
                                        it6 = iterable8.iterator();
                                        while (it6.hasNext()) {
                                            arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                        }
                                        GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder112 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                        builderNewBuilder112.addAllRequestedTypes(arrayList4);
                                        GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder113 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                        builderNewBuilder113.setMetricConfigurationRequest(builderNewBuilder112.build());
                                        GDISmartProto.Smart.Builder builderNewBuilder114 = GDISmartProto.Smart.newBuilder();
                                        builderNewBuilder114.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder113.build());
                                        smartBuild = builderNewBuilder114.build();
                                        String str18 = "activityStartRequest smart " + smartBuild;
                                        zg2.c.f204692a.getClass();
                                        str10 = str2;
                                        zg2.c.a(str10, str18);
                                        smartBuild.getClass();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar10;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar4;
                                        fVar7.f170343l = list7;
                                        fVar7.f170344m = fVar6;
                                        fVar7.f170345n = gVar9;
                                        fVar7.f170346o = list6;
                                        fVar7.f170347p = pVar2;
                                        fVar7.f170348q = smartBuild;
                                        fVar7.f170350t = i58;
                                        z45 = z44;
                                        fVar7.f170354y = z45;
                                        i58 = i58;
                                        fVar7.f170355z = z39;
                                        z39 = z39;
                                        i66 = i59;
                                        fVar7.f170351v = i66;
                                        i59 = i66;
                                        i67 = i48;
                                        fVar7.f170352w = i67;
                                        i48 = i67;
                                        i68 = i55;
                                        fVar7.f170353x = i68;
                                        pVar3 = pVar2;
                                        fVar7.C = 13;
                                        objB4 = gVar5.b(smartBuild, fVar7);
                                        aVar8 = aVar8;
                                        if (objB4 == aVar8) {
                                            return aVar8;
                                        }
                                        list8 = list6;
                                        str8 = str4;
                                        i69 = i59;
                                        i74 = i48;
                                        z46 = z39;
                                        gVar10 = gVar9;
                                        uuid4 = uuid2;
                                        i75 = i68;
                                        smart = smartBuild;
                                        i76 = i58;
                                        smart2 = (GDISmartProto.Smart) objB4;
                                        smart.getClass();
                                        y0Var2.getClass();
                                        gVar5.getClass();
                                        lVar5 = lVar4;
                                        y0Var = y0Var2;
                                        y0Var.f170541b = gVar5;
                                        y0Var.f170540a = smart;
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a(str10, "activityStartRequest response " + smart2);
                                        generatedExtension = GDILiveSessionExtension.liveSessionService;
                                        if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                            typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                            zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                            if (!typesList.isEmpty()) {
                                                dVar7 = dVar6;
                                                zf2.a aVar16 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                i77 = i69;
                                                i78 = i74;
                                                zf2.h hVar8 = new zf2.h(fVar6, list7);
                                                if (dVar7 == zf2.d.f204583b2) {
                                                    str9 = null;
                                                } else {
                                                    str9 = null;
                                                }
                                                cVar12 = cVar10;
                                                cVar11 = new sf2.f.c(uuid4, cVar12, aVar16, lVar5, pVar3, hVar8, gVar10, false, str9);
                                                e2VarA3 = getF170500a();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i77;
                                                fVar7.f170352w = i78;
                                                fVar7.f170353x = i75;
                                                fVar7.C = 14;
                                                if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                                i85 = i75;
                                                i86 = i77;
                                                i79 = i78;
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i86;
                                                fVar7.f170352w = i79 == true ? 1 : 0;
                                                fVar7.f170353x = i85;
                                                fVar7.C = 15;
                                                if (y0Var.b(fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    aVar = aVar8;
                                    activityStartRequest4 = activityStartRequest3;
                                }
                                i19 = 1;
                                if (i19 != 0) {
                                    zg2.c.d("LSVSessionStartInteractor", am.j.g(sportFitType, sportFitSubType, "Unsupported activity type (sportType: ", ", subSportType: ", ")"));
                                    if (dVarA != null) {
                                        break;
                                    }
                                    tf2.g gVar15 = (tf2.g) tVar3.getValue();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = null;
                                    fVar7.f170334c = null;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuidC;
                                    fVar7.f170337f = strD;
                                    fVar7.f170338g = null;
                                    fVar7.f170339h = null;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = sportFitType;
                                    fVar7.f170352w = sportFitSubType;
                                    fVar7.f170353x = i19;
                                    fVar7.C = 8;
                                    objB2 = gVar15.b(sportFitType, sportFitSubType, fVar7);
                                    obj3 = aVar;
                                    if (objB2 != obj3) {
                                        z19 = zBooleanValue2;
                                        obj4 = objB2;
                                        str6 = strD;
                                        uuid3 = uuidC;
                                        i36 = sportFitType;
                                        i37 = sportFitSubType;
                                        tVar2 = tVar3;
                                        i39 = i37;
                                        i38 = i36;
                                        uuidC = uuid3;
                                        str7 = (String) obj4;
                                        zBooleanValue2 = z19;
                                        tVar = tVar2;
                                        if (str6 == null) {
                                            tVar = tVar3;
                                            strA = str6;
                                        } else if (str7 != null) {
                                            strA = ((tf2.g) tVar.getValue()).a(str7);
                                        } else {
                                            strA = null;
                                        }
                                        sf2.f.d dVar13 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                                        e2 e2VarA16 = getF170500a();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = null;
                                        fVar7.f170334c = null;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = null;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = null;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = null;
                                        fVar7.f170341j = null;
                                        fVar7.f170350t = i18;
                                        fVar7.f170354y = z16;
                                        fVar7.f170355z = zBooleanValue2;
                                        fVar7.f170351v = i38;
                                        fVar7.f170352w = i39;
                                        fVar7.f170353x = i19;
                                        fVar7.C = 9;
                                        break;
                                    }
                                    return obj3;
                                }
                                aVar2 = aVar;
                                str = dVarA.f204629a;
                                if (strD == null) {
                                    strD = ((tf2.g) tVar3.getValue()).d(dVarA);
                                }
                                zg2.c.a("LSVSessionStartInteractor", "Activity type " + dVarA);
                                if (activityStartRequest4.hasWorkoutFileUid()) {
                                    workoutFileUid = activityStartRequest4.getWorkoutFileUid();
                                } else {
                                    workoutFileUid = null;
                                }
                                if (activityStartRequest4.hasWorkoutSession()) {
                                    aVar3 = aVar2;
                                    bVar3 = null;
                                } else {
                                    aVar3 = aVar2;
                                    bVar3 = null;
                                }
                                zg2.c.a("LSVSessionStartInteractor", "workout Session Type " + bVar3);
                                if (activityStartRequest4.getZonesCount() > 0) {
                                    List<GDILiveSessionProto.Zones> zonesList9 = activityStartRequest4.getZonesList();
                                    ArrayList arrayListL9 = androidx.core.view.j.l(zonesList9);
                                    it4 = zonesList9.iterator();
                                    while (it4.hasNext()) {
                                        Iterator it15 = it4;
                                        Object next9 = it15.next();
                                        zones2 = (GDILiveSessionProto.Zones) next9;
                                        if (zones2.hasType()) {
                                            str5 = str10;
                                            i35 = i19;
                                            if (zones2.getType() != GDILiveSessionProto.Zones.Type.POWER) {
                                            }
                                        } else {
                                            i35 = i19;
                                            str5 = str10;
                                        }
                                        it4 = it15;
                                        i19 = i35;
                                        str10 = str5;
                                    }
                                    i24 = i19;
                                    str2 = str10;
                                    arrayList2 = new ArrayList();
                                    it5 = arrayListL9.iterator();
                                    while (it5.hasNext()) {
                                        List<Integer> highValuesList9 = ((GDILiveSessionProto.Zones) it5.next()).getHighValuesList();
                                        highValuesList9.getClass();
                                        p13.d0.v(arrayList2, highValuesList9);
                                    }
                                    listZ = p13.h0.Z(arrayList2);
                                } else {
                                    i24 = i19;
                                    str2 = "LSVSessionStartInteractor";
                                    listZ = p13.j0.f134944a;
                                }
                                if (activityStartRequest4.getZonesCount() <= 0) {
                                    i25 = sportFitSubType;
                                } else {
                                    List<GDILiveSessionProto.Zones> zonesList10 = activityStartRequest4.getZonesList();
                                    ArrayList arrayListL10 = androidx.core.view.j.l(zonesList10);
                                    it = zonesList10.iterator();
                                    while (it.hasNext()) {
                                        Object next10 = it.next();
                                        zones = (GDILiveSessionProto.Zones) next10;
                                        Iterator it16 = it;
                                        if (zones.hasType()) {
                                            i26 = sportFitSubType;
                                            if (zones.getType() != GDILiveSessionProto.Zones.Type.HR) {
                                            }
                                        } else {
                                            i26 = sportFitSubType;
                                        }
                                        it = it16;
                                        sportFitSubType = i26;
                                    }
                                    i25 = sportFitSubType;
                                    arrayList = new ArrayList();
                                    it3 = arrayListL10.iterator();
                                    while (it3.hasNext()) {
                                        List<Integer> highValuesList10 = ((GDILiveSessionProto.Zones) it3.next()).getHighValuesList();
                                        highValuesList10.getClass();
                                        p13.d0.v(arrayList, highValuesList10);
                                    }
                                    arrayListZ = p13.h0.Z(arrayList);
                                    if (arrayListZ.size() >= 5) {
                                        fVar2 = new zf2.f(((Number) arrayListZ.get(0)).intValue(), ((Number) arrayListZ.get(1)).intValue(), ((Number) arrayListZ.get(2)).intValue(), ((Number) arrayListZ.get(3)).intValue(), ((Number) arrayListZ.get(4)).intValue());
                                    }
                                    activityStartRequest5 = activityStartRequest4;
                                    fVar7.f170332a = activityStartRequest5;
                                    fVar7.f170333b = cVar7;
                                    gVar5 = gVar4;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuidC;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVarA;
                                    fVar7.f170339h = str;
                                    fVar7.f170340i = strD;
                                    fVar7.f170341j = workoutFileUid;
                                    fVar7.f170342k = bVar3;
                                    fVar7.f170343l = listZ;
                                    fVar7.f170344m = fVar2;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = sportFitType;
                                    i27 = i25;
                                    fVar7.f170352w = i27;
                                    list = listZ;
                                    fVar7.f170353x = i24;
                                    fVar7.C = 10;
                                    uuid = workoutFileUid;
                                    objB = b(activityStartRequest5, str, fVar7);
                                    aVar8 = aVar3;
                                    if (objB != aVar8) {
                                        boolean z416 = z16;
                                        z17 = zBooleanValue2;
                                        i28 = i18;
                                        z18 = z416;
                                        dVar5 = dVarA;
                                        i29 = sportFitType;
                                        aVar4 = aVar8;
                                        obj2 = objB;
                                        list2 = list;
                                        str3 = str;
                                        i30 = i24;
                                        activityStartRequest6 = activityStartRequest5;
                                        fVar3 = fVar2;
                                        uuid2 = uuidC;
                                        i34 = i27;
                                        str4 = strD;
                                        lVar = bVar3;
                                        cVar8 = cVar7;
                                        gVar6 = (zf2.g) obj2;
                                        target = activityStartRequest6.getTarget();
                                        i44 = i30;
                                        arrayList3 = new ArrayList();
                                        if (target != null) {
                                            if (target.hasDistance()) {
                                                arrayList3.add(new zf2.c.a(target.getDistance()));
                                            }
                                            if (target.hasTime()) {
                                                arrayList3.add(new zf2.c.d(target.getTime()));
                                            }
                                            if (target.hasSpeed()) {
                                                arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                            }
                                            if (target.hasReps()) {
                                                arrayList3.add(new zf2.c.b(target.getReps()));
                                            }
                                        } else {
                                            i34 = i34;
                                            i29 = i29;
                                        }
                                        listB1 = p13.h0.b1(arrayList3);
                                        long f172494b19 = cVar8.getF92746j();
                                        String f172493a9 = cVar8.getF92741e();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar8;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar5;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar;
                                        fVar7.f170343l = list2;
                                        fVar7.f170344m = fVar3;
                                        fVar7.f170345n = gVar6;
                                        fVar7.f170346o = listB1;
                                        fVar7.f170350t = i28;
                                        fVar7.f170354y = z18;
                                        fVar7.f170355z = z17;
                                        i45 = i29;
                                        fVar7.f170351v = i45;
                                        i46 = i34;
                                        fVar7.f170352w = i46;
                                        i47 = i28;
                                        fVar7.f170353x = i44;
                                        fVar7.C = 11;
                                        GDIDataTypes.UUID uuid17 = uuid;
                                        z27 = z17;
                                        z28 = z18;
                                        lVar2 = lVar;
                                        objC = this.f170314c.c(str3, f172494b19, f172493a9, uuid17, fVar7);
                                        aVar5 = aVar4;
                                        if (objC == aVar5) {
                                            return aVar5;
                                        }
                                        list3 = list2;
                                        obj5 = objC;
                                        aVar6 = aVar5;
                                        cVar9 = cVar8;
                                        dVar6 = dVar5;
                                        z29 = z28;
                                        z34 = z27;
                                        i48 = i46;
                                        i49 = i47;
                                        i54 = i45;
                                        i55 = i44;
                                        list4 = listB1;
                                        gVar7 = gVar6;
                                        lVar3 = lVar2;
                                        fVar4 = fVar3;
                                        pVar = (vf2.p) obj5;
                                        long f172494b110 = cVar9.getF92746j();
                                        i56 = i54;
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar9;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar3;
                                        fVar7.f170343l = list3;
                                        fVar7.f170344m = fVar4;
                                        fVar7.f170345n = gVar7;
                                        fVar7.f170346o = list4;
                                        fVar7.f170347p = pVar;
                                        fVar7.f170350t = i49;
                                        fVar7.f170354y = z29;
                                        fVar7.f170355z = z34;
                                        fVar7.f170351v = i56;
                                        fVar5 = fVar4;
                                        fVar7.f170352w = i48;
                                        fVar7.f170353x = i55;
                                        fVar7.C = 12;
                                        list5 = list3;
                                        aVar7 = aVar6;
                                        z35 = z34;
                                        gVar8 = gVar7;
                                        z36 = z29;
                                        i57 = i49;
                                        list6 = list4;
                                        lVar4 = lVar3;
                                        objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b110, fVar7);
                                        fVar7 = fVar7;
                                        if (objB3 == aVar7) {
                                            return aVar7;
                                        }
                                        obj6 = objB3;
                                        i58 = i57;
                                        fVar6 = fVar5;
                                        z37 = z35;
                                        aVar8 = aVar7;
                                        cVar10 = cVar9;
                                        list7 = list5;
                                        pVar2 = pVar;
                                        gVar9 = gVar8;
                                        z38 = z36;
                                        i59 = i56;
                                        Iterable iterable9 = (Iterable) obj6;
                                        z39 = z37;
                                        z44 = z38;
                                        arrayList4 = new ArrayList(p13.y.r(iterable9, 10));
                                        it6 = iterable9.iterator();
                                        while (it6.hasNext()) {
                                            arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                        }
                                        GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder115 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                        builderNewBuilder115.addAllRequestedTypes(arrayList4);
                                        GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder116 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                        builderNewBuilder116.setMetricConfigurationRequest(builderNewBuilder115.build());
                                        GDISmartProto.Smart.Builder builderNewBuilder117 = GDISmartProto.Smart.newBuilder();
                                        builderNewBuilder117.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder116.build());
                                        smartBuild = builderNewBuilder117.build();
                                        String str19 = "activityStartRequest smart " + smartBuild;
                                        zg2.c.f204692a.getClass();
                                        str10 = str2;
                                        zg2.c.a(str10, str19);
                                        smartBuild.getClass();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar10;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar4;
                                        fVar7.f170343l = list7;
                                        fVar7.f170344m = fVar6;
                                        fVar7.f170345n = gVar9;
                                        fVar7.f170346o = list6;
                                        fVar7.f170347p = pVar2;
                                        fVar7.f170348q = smartBuild;
                                        fVar7.f170350t = i58;
                                        z45 = z44;
                                        fVar7.f170354y = z45;
                                        i58 = i58;
                                        fVar7.f170355z = z39;
                                        z39 = z39;
                                        i66 = i59;
                                        fVar7.f170351v = i66;
                                        i59 = i66;
                                        i67 = i48;
                                        fVar7.f170352w = i67;
                                        i48 = i67;
                                        i68 = i55;
                                        fVar7.f170353x = i68;
                                        pVar3 = pVar2;
                                        fVar7.C = 13;
                                        objB4 = gVar5.b(smartBuild, fVar7);
                                        aVar8 = aVar8;
                                        if (objB4 == aVar8) {
                                            return aVar8;
                                        }
                                        list8 = list6;
                                        str8 = str4;
                                        i69 = i59;
                                        i74 = i48;
                                        z46 = z39;
                                        gVar10 = gVar9;
                                        uuid4 = uuid2;
                                        i75 = i68;
                                        smart = smartBuild;
                                        i76 = i58;
                                        smart2 = (GDISmartProto.Smart) objB4;
                                        smart.getClass();
                                        y0Var2.getClass();
                                        gVar5.getClass();
                                        lVar5 = lVar4;
                                        y0Var = y0Var2;
                                        y0Var.f170541b = gVar5;
                                        y0Var.f170540a = smart;
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a(str10, "activityStartRequest response " + smart2);
                                        generatedExtension = GDILiveSessionExtension.liveSessionService;
                                        if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                            typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                            zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                            if (!typesList.isEmpty()) {
                                                dVar7 = dVar6;
                                                zf2.a aVar17 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                i77 = i69;
                                                i78 = i74;
                                                zf2.h hVar9 = new zf2.h(fVar6, list7);
                                                if (dVar7 == zf2.d.f204583b2) {
                                                    str9 = null;
                                                } else {
                                                    str9 = null;
                                                }
                                                cVar12 = cVar10;
                                                cVar11 = new sf2.f.c(uuid4, cVar12, aVar17, lVar5, pVar3, hVar9, gVar10, false, str9);
                                                e2VarA3 = getF170500a();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i77;
                                                fVar7.f170352w = i78;
                                                fVar7.f170353x = i75;
                                                fVar7.C = 14;
                                                if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                                i85 = i75;
                                                i86 = i77;
                                                i79 = i78;
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i86;
                                                fVar7.f170352w = i79 == true ? 1 : 0;
                                                fVar7.f170353x = i85;
                                                fVar7.C = 15;
                                                if (y0Var.b(fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                fVar2 = null;
                                activityStartRequest5 = activityStartRequest4;
                                fVar7.f170332a = activityStartRequest5;
                                fVar7.f170333b = cVar7;
                                gVar5 = gVar4;
                                fVar7.f170334c = gVar5;
                                fVar7.f170335d = null;
                                fVar7.f170336e = uuidC;
                                fVar7.f170337f = null;
                                fVar7.f170338g = dVarA;
                                fVar7.f170339h = str;
                                fVar7.f170340i = strD;
                                fVar7.f170341j = workoutFileUid;
                                fVar7.f170342k = bVar3;
                                fVar7.f170343l = listZ;
                                fVar7.f170344m = fVar2;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.f170351v = sportFitType;
                                i27 = i25;
                                fVar7.f170352w = i27;
                                list = listZ;
                                fVar7.f170353x = i24;
                                fVar7.C = 10;
                                uuid = workoutFileUid;
                                objB = b(activityStartRequest5, str, fVar7);
                                aVar8 = aVar3;
                                if (objB != aVar8) {
                                    boolean z417 = z16;
                                    z17 = zBooleanValue2;
                                    i28 = i18;
                                    z18 = z417;
                                    dVar5 = dVarA;
                                    i29 = sportFitType;
                                    aVar4 = aVar8;
                                    obj2 = objB;
                                    list2 = list;
                                    str3 = str;
                                    i30 = i24;
                                    activityStartRequest6 = activityStartRequest5;
                                    fVar3 = fVar2;
                                    uuid2 = uuidC;
                                    i34 = i27;
                                    str4 = strD;
                                    lVar = bVar3;
                                    cVar8 = cVar7;
                                    gVar6 = (zf2.g) obj2;
                                    target = activityStartRequest6.getTarget();
                                    i44 = i30;
                                    arrayList3 = new ArrayList();
                                    if (target != null) {
                                        if (target.hasDistance()) {
                                            arrayList3.add(new zf2.c.a(target.getDistance()));
                                        }
                                        if (target.hasTime()) {
                                            arrayList3.add(new zf2.c.d(target.getTime()));
                                        }
                                        if (target.hasSpeed()) {
                                            arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                        }
                                        if (target.hasReps()) {
                                            arrayList3.add(new zf2.c.b(target.getReps()));
                                        }
                                    } else {
                                        i34 = i34;
                                        i29 = i29;
                                    }
                                    listB1 = p13.h0.b1(arrayList3);
                                    long f172494b111 = cVar8.getF92746j();
                                    String f172493a10 = cVar8.getF92741e();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar8;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar5;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar;
                                    fVar7.f170343l = list2;
                                    fVar7.f170344m = fVar3;
                                    fVar7.f170345n = gVar6;
                                    fVar7.f170346o = listB1;
                                    fVar7.f170350t = i28;
                                    fVar7.f170354y = z18;
                                    fVar7.f170355z = z17;
                                    i45 = i29;
                                    fVar7.f170351v = i45;
                                    i46 = i34;
                                    fVar7.f170352w = i46;
                                    i47 = i28;
                                    fVar7.f170353x = i44;
                                    fVar7.C = 11;
                                    GDIDataTypes.UUID uuid18 = uuid;
                                    z27 = z17;
                                    z28 = z18;
                                    lVar2 = lVar;
                                    objC = this.f170314c.c(str3, f172494b111, f172493a10, uuid18, fVar7);
                                    aVar5 = aVar4;
                                    if (objC == aVar5) {
                                        return aVar5;
                                    }
                                    list3 = list2;
                                    obj5 = objC;
                                    aVar6 = aVar5;
                                    cVar9 = cVar8;
                                    dVar6 = dVar5;
                                    z29 = z28;
                                    z34 = z27;
                                    i48 = i46;
                                    i49 = i47;
                                    i54 = i45;
                                    i55 = i44;
                                    list4 = listB1;
                                    gVar7 = gVar6;
                                    lVar3 = lVar2;
                                    fVar4 = fVar3;
                                    pVar = (vf2.p) obj5;
                                    long f172494b112 = cVar9.getF92746j();
                                    i56 = i54;
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar9;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar6;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar3;
                                    fVar7.f170343l = list3;
                                    fVar7.f170344m = fVar4;
                                    fVar7.f170345n = gVar7;
                                    fVar7.f170346o = list4;
                                    fVar7.f170347p = pVar;
                                    fVar7.f170350t = i49;
                                    fVar7.f170354y = z29;
                                    fVar7.f170355z = z34;
                                    fVar7.f170351v = i56;
                                    fVar5 = fVar4;
                                    fVar7.f170352w = i48;
                                    fVar7.f170353x = i55;
                                    fVar7.C = 12;
                                    list5 = list3;
                                    aVar7 = aVar6;
                                    z35 = z34;
                                    gVar8 = gVar7;
                                    z36 = z29;
                                    i57 = i49;
                                    list6 = list4;
                                    lVar4 = lVar3;
                                    objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b112, fVar7);
                                    fVar7 = fVar7;
                                    if (objB3 == aVar7) {
                                        return aVar7;
                                    }
                                    obj6 = objB3;
                                    i58 = i57;
                                    fVar6 = fVar5;
                                    z37 = z35;
                                    aVar8 = aVar7;
                                    cVar10 = cVar9;
                                    list7 = list5;
                                    pVar2 = pVar;
                                    gVar9 = gVar8;
                                    z38 = z36;
                                    i59 = i56;
                                    Iterable iterable10 = (Iterable) obj6;
                                    z39 = z37;
                                    z44 = z38;
                                    arrayList4 = new ArrayList(p13.y.r(iterable10, 10));
                                    it6 = iterable10.iterator();
                                    while (it6.hasNext()) {
                                        arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                    }
                                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder118 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                    builderNewBuilder118.addAllRequestedTypes(arrayList4);
                                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder119 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                    builderNewBuilder119.setMetricConfigurationRequest(builderNewBuilder118.build());
                                    GDISmartProto.Smart.Builder builderNewBuilder1110 = GDISmartProto.Smart.newBuilder();
                                    builderNewBuilder1110.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder119.build());
                                    smartBuild = builderNewBuilder1110.build();
                                    String str110 = "activityStartRequest smart " + smartBuild;
                                    zg2.c.f204692a.getClass();
                                    str10 = str2;
                                    zg2.c.a(str10, str110);
                                    smartBuild.getClass();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar10;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar6;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar4;
                                    fVar7.f170343l = list7;
                                    fVar7.f170344m = fVar6;
                                    fVar7.f170345n = gVar9;
                                    fVar7.f170346o = list6;
                                    fVar7.f170347p = pVar2;
                                    fVar7.f170348q = smartBuild;
                                    fVar7.f170350t = i58;
                                    z45 = z44;
                                    fVar7.f170354y = z45;
                                    i58 = i58;
                                    fVar7.f170355z = z39;
                                    z39 = z39;
                                    i66 = i59;
                                    fVar7.f170351v = i66;
                                    i59 = i66;
                                    i67 = i48;
                                    fVar7.f170352w = i67;
                                    i48 = i67;
                                    i68 = i55;
                                    fVar7.f170353x = i68;
                                    pVar3 = pVar2;
                                    fVar7.C = 13;
                                    objB4 = gVar5.b(smartBuild, fVar7);
                                    aVar8 = aVar8;
                                    if (objB4 == aVar8) {
                                        return aVar8;
                                    }
                                    list8 = list6;
                                    str8 = str4;
                                    i69 = i59;
                                    i74 = i48;
                                    z46 = z39;
                                    gVar10 = gVar9;
                                    uuid4 = uuid2;
                                    i75 = i68;
                                    smart = smartBuild;
                                    i76 = i58;
                                    smart2 = (GDISmartProto.Smart) objB4;
                                    smart.getClass();
                                    y0Var2.getClass();
                                    gVar5.getClass();
                                    lVar5 = lVar4;
                                    y0Var = y0Var2;
                                    y0Var.f170541b = gVar5;
                                    y0Var.f170540a = smart;
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a(str10, "activityStartRequest response " + smart2);
                                    generatedExtension = GDILiveSessionExtension.liveSessionService;
                                    if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                        typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                        zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                        if (!typesList.isEmpty()) {
                                            dVar7 = dVar6;
                                            zf2.a aVar18 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                            i77 = i69;
                                            i78 = i74;
                                            zf2.h hVar10 = new zf2.h(fVar6, list7);
                                            if (dVar7 == zf2.d.f204583b2) {
                                                str9 = null;
                                            } else {
                                                str9 = null;
                                            }
                                            cVar12 = cVar10;
                                            cVar11 = new sf2.f.c(uuid4, cVar12, aVar18, lVar5, pVar3, hVar10, gVar10, false, str9);
                                            e2VarA3 = getF170500a();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = null;
                                            fVar7.f170343l = null;
                                            fVar7.f170344m = null;
                                            fVar7.f170345n = null;
                                            fVar7.f170346o = null;
                                            fVar7.f170347p = null;
                                            fVar7.f170348q = null;
                                            fVar7.f170349r = null;
                                            fVar7.f170350t = i76;
                                            fVar7.f170354y = z45;
                                            fVar7.f170355z = z46;
                                            fVar7.f170351v = i77;
                                            fVar7.f170352w = i78;
                                            fVar7.f170353x = i75;
                                            fVar7.C = 14;
                                            if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                return aVar8;
                                            }
                                            i85 = i75;
                                            i86 = i77;
                                            i79 = i78;
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = null;
                                            fVar7.f170343l = null;
                                            fVar7.f170344m = null;
                                            fVar7.f170345n = null;
                                            fVar7.f170346o = null;
                                            fVar7.f170347p = null;
                                            fVar7.f170348q = null;
                                            fVar7.f170349r = null;
                                            fVar7.f170350t = i76;
                                            fVar7.f170354y = z45;
                                            fVar7.f170355z = z46;
                                            fVar7.f170351v = i86;
                                            fVar7.f170352w = i79 == true ? 1 : 0;
                                            fVar7.f170353x = i85;
                                            fVar7.C = 15;
                                            if (y0Var.b(fVar7) == aVar8) {
                                                return aVar8;
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        break;
                    }
                    return aVar8;
                case 2:
                    boolean z54 = fVar7.f170354y;
                    int i89 = fVar7.f170350t;
                    dVar3 = fVar7.f170335d;
                    dt2.g gVar16 = fVar7.f170334c;
                    rs2.c cVar16 = fVar7.f170333b;
                    activityStartRequest3 = fVar7.f170332a;
                    o13.r.b(obj7);
                    cVar6 = cVar16;
                    i18 = i89;
                    gVar3 = gVar16;
                    z16 = z54;
                    obj = obj7;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    if (z16) {
                    }
                    if (activityStartRequest3.hasSportProfile()) {
                        if (!activityStartRequest3.hasUuid()) {
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LSVSessionStartInteractor", "Missing UUID.");
                            e2VarA2 = getF170500a();
                            bVar2 = new sf2.f.b(null, sf2.f.b.a.c.f159000a, cVar6, 1, null);
                            fVar7.f170332a = null;
                            fVar7.f170333b = null;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170350t = i18;
                            fVar7.f170354y = z16;
                            fVar7.f170355z = zBooleanValue2;
                            fVar7.C = 5;
                            if (e2VarA2.emit(bVar2, fVar7) == aVar8) {
                                return aVar8;
                            }
                            return Unit.INSTANCE;
                        }
                        GDIDataTypes.UUID uuid19 = activityStartRequest3.getUuid();
                        uuid19.getClass();
                        uuidC = lk2.y.c(uuid19);
                        if (uuidC == null) {
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LSVSessionStartInteractor", "Missing UUID - Error converting UUID to java.util.UUID");
                            e2 e2VarA17 = getF170500a();
                            GDIDataTypes.UUID uuid110 = activityStartRequest3.getUuid();
                            uuid110.getClass();
                            sf2.f.b bVar12 = new sf2.f.b(null, new sf2.f.b.a.C3006a(uuid110), cVar6, 1, null);
                            fVar7.f170332a = null;
                            fVar7.f170333b = null;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170350t = i18;
                            fVar7.f170354y = z16;
                            fVar7.f170355z = zBooleanValue2;
                            fVar7.f170351v = 0;
                            fVar7.C = 4;
                        } else if (!activityStartRequest3.getSportProfile().hasSportFitType()) {
                            zg2.c.f204692a.getClass();
                            zg2.c.b("LSVSessionStartInteractor", "Missing sport type");
                            e2 e2VarA18 = getF170500a();
                            sf2.f.b bVar13 = new sf2.f.b(null, sf2.f.b.a.e.f159002a, cVar6, 1, null);
                            fVar7.f170332a = null;
                            fVar7.f170333b = null;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170350t = i18;
                            fVar7.f170354y = z16;
                            fVar7.f170355z = zBooleanValue2;
                            fVar7.C = 6;
                        } else if (!activityStartRequest3.getSportProfile().hasSportFitSubType()) {
                            zg2.c.f204692a.getClass();
                            zg2.c.b("LSVSessionStartInteractor", "Missing sub sport type");
                            e2 e2VarA19 = getF170500a();
                            sf2.f.b bVar14 = new sf2.f.b(null, sf2.f.b.a.d.f159001a, cVar6, 1, null);
                            fVar7.f170332a = null;
                            fVar7.f170333b = null;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170350t = i18;
                            fVar7.f170354y = z16;
                            fVar7.f170355z = zBooleanValue2;
                            fVar7.C = 7;
                        } else {
                            cVar7 = cVar6;
                            sportFitType = activityStartRequest3.getSportProfile().getSportFitType();
                            sportFitSubType = activityStartRequest3.getSportProfile().getSportFitSubType();
                            if (activityStartRequest3.getSportProfile().hasName()) {
                                strD = activityStartRequest3.getSportProfile().getName();
                            } else {
                                strD = null;
                            }
                            dVar4 = dVar3;
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LSVSessionStartInteractor", "sportType " + sportFitType + ", subSportType: " + sportFitSubType);
                            zf2.d.f204601l.getClass();
                            dVarA = zf2.d.a.a(sportFitType, sportFitSubType);
                            gVar4 = gVar3;
                            iVar = (zg2.i) KoinJavaComponent.get$default(zg2.i.class, null, null, 6, null);
                            if (dVarA != null) {
                                iVar.getClass();
                                dVar4.getClass();
                                if (i18 >= 2) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (zBooleanValue2) {
                                    z25 = false;
                                } else {
                                    z25 = false;
                                }
                                switch (zg2.i.b.f204716a[dVarA.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                        activityStartRequest4 = activityStartRequest3;
                                        if (z16) {
                                            z26 = false;
                                        } else {
                                            z26 = false;
                                        }
                                        aVar = aVar8;
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("ValidateActivityTypeUseCase", "canShowGCPlusLiveActivity: " + z26 + ", canShowManualStart: " + z25);
                                        if (!z26) {
                                        }
                                        break;
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                        activityStartRequest4 = activityStartRequest3;
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("ValidateActivityTypeUseCase", "hasGCPlus: " + z16 + ", isManualStart: " + zBooleanValue2);
                                        if (z16) {
                                        }
                                        aVar = aVar8;
                                        break;
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                        activityStartRequest4 = activityStartRequest3;
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("ValidateActivityTypeUseCase", "canShowManualStart: " + z25);
                                        aVar = aVar8;
                                        break;
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                        aVar = aVar8;
                                        activityStartRequest4 = activityStartRequest3;
                                        break;
                                    default:
                                        lc.u0.r();
                                        z25 = false;
                                        aVar = aVar8;
                                        activityStartRequest4 = activityStartRequest3;
                                        break;
                                }
                                if (z25) {
                                    i19 = 0;
                                }
                                if (i19 != 0) {
                                    zg2.c.d("LSVSessionStartInteractor", am.j.g(sportFitType, sportFitSubType, "Unsupported activity type (sportType: ", ", subSportType: ", ")"));
                                    if (dVarA != null) {
                                        break;
                                    }
                                    tf2.g gVar17 = (tf2.g) tVar3.getValue();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = null;
                                    fVar7.f170334c = null;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuidC;
                                    fVar7.f170337f = strD;
                                    fVar7.f170338g = null;
                                    fVar7.f170339h = null;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = sportFitType;
                                    fVar7.f170352w = sportFitSubType;
                                    fVar7.f170353x = i19;
                                    fVar7.C = 8;
                                    objB2 = gVar17.b(sportFitType, sportFitSubType, fVar7);
                                    obj3 = aVar;
                                    if (objB2 != obj3) {
                                        z19 = zBooleanValue2;
                                        obj4 = objB2;
                                        str6 = strD;
                                        uuid3 = uuidC;
                                        i36 = sportFitType;
                                        i37 = sportFitSubType;
                                        tVar2 = tVar3;
                                        i39 = i37;
                                        i38 = i36;
                                        uuidC = uuid3;
                                        str7 = (String) obj4;
                                        zBooleanValue2 = z19;
                                        tVar = tVar2;
                                        if (str6 == null) {
                                            tVar = tVar3;
                                            strA = str6;
                                        } else if (str7 != null) {
                                            strA = ((tf2.g) tVar.getValue()).a(str7);
                                        } else {
                                            strA = null;
                                        }
                                        sf2.f.d dVar14 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                                        e2 e2VarA110 = getF170500a();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = null;
                                        fVar7.f170334c = null;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = null;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = null;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = null;
                                        fVar7.f170341j = null;
                                        fVar7.f170350t = i18;
                                        fVar7.f170354y = z16;
                                        fVar7.f170355z = zBooleanValue2;
                                        fVar7.f170351v = i38;
                                        fVar7.f170352w = i39;
                                        fVar7.f170353x = i19;
                                        fVar7.C = 9;
                                        break;
                                    }
                                    return obj3;
                                }
                                aVar2 = aVar;
                                str = dVarA.f204629a;
                                if (strD == null) {
                                    strD = ((tf2.g) tVar3.getValue()).d(dVarA);
                                }
                                zg2.c.a("LSVSessionStartInteractor", "Activity type " + dVarA);
                                if (activityStartRequest4.hasWorkoutFileUid()) {
                                    workoutFileUid = activityStartRequest4.getWorkoutFileUid();
                                } else {
                                    workoutFileUid = null;
                                }
                                if (activityStartRequest4.hasWorkoutSession()) {
                                    aVar3 = aVar2;
                                    bVar3 = null;
                                } else {
                                    aVar3 = aVar2;
                                    bVar3 = null;
                                }
                                zg2.c.a("LSVSessionStartInteractor", "workout Session Type " + bVar3);
                                if (activityStartRequest4.getZonesCount() > 0) {
                                    List<GDILiveSessionProto.Zones> zonesList11 = activityStartRequest4.getZonesList();
                                    ArrayList arrayListL11 = androidx.core.view.j.l(zonesList11);
                                    it4 = zonesList11.iterator();
                                    while (it4.hasNext()) {
                                        Iterator it17 = it4;
                                        Object next11 = it17.next();
                                        zones2 = (GDILiveSessionProto.Zones) next11;
                                        if (zones2.hasType()) {
                                            str5 = str10;
                                            i35 = i19;
                                            if (zones2.getType() != GDILiveSessionProto.Zones.Type.POWER) {
                                            }
                                        } else {
                                            i35 = i19;
                                            str5 = str10;
                                        }
                                        it4 = it17;
                                        i19 = i35;
                                        str10 = str5;
                                    }
                                    i24 = i19;
                                    str2 = str10;
                                    arrayList2 = new ArrayList();
                                    it5 = arrayListL11.iterator();
                                    while (it5.hasNext()) {
                                        List<Integer> highValuesList11 = ((GDILiveSessionProto.Zones) it5.next()).getHighValuesList();
                                        highValuesList11.getClass();
                                        p13.d0.v(arrayList2, highValuesList11);
                                    }
                                    listZ = p13.h0.Z(arrayList2);
                                } else {
                                    i24 = i19;
                                    str2 = "LSVSessionStartInteractor";
                                    listZ = p13.j0.f134944a;
                                }
                                if (activityStartRequest4.getZonesCount() <= 0) {
                                    i25 = sportFitSubType;
                                } else {
                                    List<GDILiveSessionProto.Zones> zonesList12 = activityStartRequest4.getZonesList();
                                    ArrayList arrayListL12 = androidx.core.view.j.l(zonesList12);
                                    it = zonesList12.iterator();
                                    while (it.hasNext()) {
                                        Object next12 = it.next();
                                        zones = (GDILiveSessionProto.Zones) next12;
                                        Iterator it18 = it;
                                        if (zones.hasType()) {
                                            i26 = sportFitSubType;
                                            if (zones.getType() != GDILiveSessionProto.Zones.Type.HR) {
                                            }
                                        } else {
                                            i26 = sportFitSubType;
                                        }
                                        it = it18;
                                        sportFitSubType = i26;
                                    }
                                    i25 = sportFitSubType;
                                    arrayList = new ArrayList();
                                    it3 = arrayListL12.iterator();
                                    while (it3.hasNext()) {
                                        List<Integer> highValuesList12 = ((GDILiveSessionProto.Zones) it3.next()).getHighValuesList();
                                        highValuesList12.getClass();
                                        p13.d0.v(arrayList, highValuesList12);
                                    }
                                    arrayListZ = p13.h0.Z(arrayList);
                                    if (arrayListZ.size() >= 5) {
                                        fVar2 = new zf2.f(((Number) arrayListZ.get(0)).intValue(), ((Number) arrayListZ.get(1)).intValue(), ((Number) arrayListZ.get(2)).intValue(), ((Number) arrayListZ.get(3)).intValue(), ((Number) arrayListZ.get(4)).intValue());
                                    }
                                    activityStartRequest5 = activityStartRequest4;
                                    fVar7.f170332a = activityStartRequest5;
                                    fVar7.f170333b = cVar7;
                                    gVar5 = gVar4;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuidC;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVarA;
                                    fVar7.f170339h = str;
                                    fVar7.f170340i = strD;
                                    fVar7.f170341j = workoutFileUid;
                                    fVar7.f170342k = bVar3;
                                    fVar7.f170343l = listZ;
                                    fVar7.f170344m = fVar2;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = sportFitType;
                                    i27 = i25;
                                    fVar7.f170352w = i27;
                                    list = listZ;
                                    fVar7.f170353x = i24;
                                    fVar7.C = 10;
                                    uuid = workoutFileUid;
                                    objB = b(activityStartRequest5, str, fVar7);
                                    aVar8 = aVar3;
                                    if (objB != aVar8) {
                                        boolean z418 = z16;
                                        z17 = zBooleanValue2;
                                        i28 = i18;
                                        z18 = z418;
                                        dVar5 = dVarA;
                                        i29 = sportFitType;
                                        aVar4 = aVar8;
                                        obj2 = objB;
                                        list2 = list;
                                        str3 = str;
                                        i30 = i24;
                                        activityStartRequest6 = activityStartRequest5;
                                        fVar3 = fVar2;
                                        uuid2 = uuidC;
                                        i34 = i27;
                                        str4 = strD;
                                        lVar = bVar3;
                                        cVar8 = cVar7;
                                        gVar6 = (zf2.g) obj2;
                                        target = activityStartRequest6.getTarget();
                                        i44 = i30;
                                        arrayList3 = new ArrayList();
                                        if (target != null) {
                                            if (target.hasDistance()) {
                                                arrayList3.add(new zf2.c.a(target.getDistance()));
                                            }
                                            if (target.hasTime()) {
                                                arrayList3.add(new zf2.c.d(target.getTime()));
                                            }
                                            if (target.hasSpeed()) {
                                                arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                            }
                                            if (target.hasReps()) {
                                                arrayList3.add(new zf2.c.b(target.getReps()));
                                            }
                                        } else {
                                            i34 = i34;
                                            i29 = i29;
                                        }
                                        listB1 = p13.h0.b1(arrayList3);
                                        long f172494b113 = cVar8.getF92746j();
                                        String f172493a11 = cVar8.getF92741e();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar8;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar5;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar;
                                        fVar7.f170343l = list2;
                                        fVar7.f170344m = fVar3;
                                        fVar7.f170345n = gVar6;
                                        fVar7.f170346o = listB1;
                                        fVar7.f170350t = i28;
                                        fVar7.f170354y = z18;
                                        fVar7.f170355z = z17;
                                        i45 = i29;
                                        fVar7.f170351v = i45;
                                        i46 = i34;
                                        fVar7.f170352w = i46;
                                        i47 = i28;
                                        fVar7.f170353x = i44;
                                        fVar7.C = 11;
                                        GDIDataTypes.UUID uuid111 = uuid;
                                        z27 = z17;
                                        z28 = z18;
                                        lVar2 = lVar;
                                        objC = this.f170314c.c(str3, f172494b113, f172493a11, uuid111, fVar7);
                                        aVar5 = aVar4;
                                        if (objC == aVar5) {
                                            return aVar5;
                                        }
                                        list3 = list2;
                                        obj5 = objC;
                                        aVar6 = aVar5;
                                        cVar9 = cVar8;
                                        dVar6 = dVar5;
                                        z29 = z28;
                                        z34 = z27;
                                        i48 = i46;
                                        i49 = i47;
                                        i54 = i45;
                                        i55 = i44;
                                        list4 = listB1;
                                        gVar7 = gVar6;
                                        lVar3 = lVar2;
                                        fVar4 = fVar3;
                                        pVar = (vf2.p) obj5;
                                        long f172494b114 = cVar9.getF92746j();
                                        i56 = i54;
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar9;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar3;
                                        fVar7.f170343l = list3;
                                        fVar7.f170344m = fVar4;
                                        fVar7.f170345n = gVar7;
                                        fVar7.f170346o = list4;
                                        fVar7.f170347p = pVar;
                                        fVar7.f170350t = i49;
                                        fVar7.f170354y = z29;
                                        fVar7.f170355z = z34;
                                        fVar7.f170351v = i56;
                                        fVar5 = fVar4;
                                        fVar7.f170352w = i48;
                                        fVar7.f170353x = i55;
                                        fVar7.C = 12;
                                        list5 = list3;
                                        aVar7 = aVar6;
                                        z35 = z34;
                                        gVar8 = gVar7;
                                        z36 = z29;
                                        i57 = i49;
                                        list6 = list4;
                                        lVar4 = lVar3;
                                        objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b114, fVar7);
                                        fVar7 = fVar7;
                                        if (objB3 == aVar7) {
                                            return aVar7;
                                        }
                                        obj6 = objB3;
                                        i58 = i57;
                                        fVar6 = fVar5;
                                        z37 = z35;
                                        aVar8 = aVar7;
                                        cVar10 = cVar9;
                                        list7 = list5;
                                        pVar2 = pVar;
                                        gVar9 = gVar8;
                                        z38 = z36;
                                        i59 = i56;
                                        Iterable iterable11 = (Iterable) obj6;
                                        z39 = z37;
                                        z44 = z38;
                                        arrayList4 = new ArrayList(p13.y.r(iterable11, 10));
                                        it6 = iterable11.iterator();
                                        while (it6.hasNext()) {
                                            arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                        }
                                        GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder1111 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                        builderNewBuilder1111.addAllRequestedTypes(arrayList4);
                                        GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder1112 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                        builderNewBuilder1112.setMetricConfigurationRequest(builderNewBuilder1111.build());
                                        GDISmartProto.Smart.Builder builderNewBuilder1113 = GDISmartProto.Smart.newBuilder();
                                        builderNewBuilder1113.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder1112.build());
                                        smartBuild = builderNewBuilder1113.build();
                                        String str111 = "activityStartRequest smart " + smartBuild;
                                        zg2.c.f204692a.getClass();
                                        str10 = str2;
                                        zg2.c.a(str10, str111);
                                        smartBuild.getClass();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar10;
                                        fVar7.f170334c = gVar5;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = uuid2;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = dVar6;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = str4;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = lVar4;
                                        fVar7.f170343l = list7;
                                        fVar7.f170344m = fVar6;
                                        fVar7.f170345n = gVar9;
                                        fVar7.f170346o = list6;
                                        fVar7.f170347p = pVar2;
                                        fVar7.f170348q = smartBuild;
                                        fVar7.f170350t = i58;
                                        z45 = z44;
                                        fVar7.f170354y = z45;
                                        i58 = i58;
                                        fVar7.f170355z = z39;
                                        z39 = z39;
                                        i66 = i59;
                                        fVar7.f170351v = i66;
                                        i59 = i66;
                                        i67 = i48;
                                        fVar7.f170352w = i67;
                                        i48 = i67;
                                        i68 = i55;
                                        fVar7.f170353x = i68;
                                        pVar3 = pVar2;
                                        fVar7.C = 13;
                                        objB4 = gVar5.b(smartBuild, fVar7);
                                        aVar8 = aVar8;
                                        if (objB4 == aVar8) {
                                            return aVar8;
                                        }
                                        list8 = list6;
                                        str8 = str4;
                                        i69 = i59;
                                        i74 = i48;
                                        z46 = z39;
                                        gVar10 = gVar9;
                                        uuid4 = uuid2;
                                        i75 = i68;
                                        smart = smartBuild;
                                        i76 = i58;
                                        smart2 = (GDISmartProto.Smart) objB4;
                                        smart.getClass();
                                        y0Var2.getClass();
                                        gVar5.getClass();
                                        lVar5 = lVar4;
                                        y0Var = y0Var2;
                                        y0Var.f170541b = gVar5;
                                        y0Var.f170540a = smart;
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a(str10, "activityStartRequest response " + smart2);
                                        generatedExtension = GDILiveSessionExtension.liveSessionService;
                                        if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                            typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                            zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                            if (!typesList.isEmpty()) {
                                                dVar7 = dVar6;
                                                zf2.a aVar19 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                                i77 = i69;
                                                i78 = i74;
                                                zf2.h hVar11 = new zf2.h(fVar6, list7);
                                                if (dVar7 == zf2.d.f204583b2) {
                                                    str9 = null;
                                                } else {
                                                    str9 = null;
                                                }
                                                cVar12 = cVar10;
                                                cVar11 = new sf2.f.c(uuid4, cVar12, aVar19, lVar5, pVar3, hVar11, gVar10, false, str9);
                                                e2VarA3 = getF170500a();
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i77;
                                                fVar7.f170352w = i78;
                                                fVar7.f170353x = i75;
                                                fVar7.C = 14;
                                                if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                                i85 = i75;
                                                i86 = i77;
                                                i79 = i78;
                                                fVar7.f170332a = null;
                                                fVar7.f170333b = cVar10;
                                                fVar7.f170334c = null;
                                                fVar7.f170335d = null;
                                                fVar7.f170336e = null;
                                                fVar7.f170337f = null;
                                                fVar7.f170338g = null;
                                                fVar7.f170339h = null;
                                                fVar7.f170340i = null;
                                                fVar7.f170341j = null;
                                                fVar7.f170342k = null;
                                                fVar7.f170343l = null;
                                                fVar7.f170344m = null;
                                                fVar7.f170345n = null;
                                                fVar7.f170346o = null;
                                                fVar7.f170347p = null;
                                                fVar7.f170348q = null;
                                                fVar7.f170349r = null;
                                                fVar7.f170350t = i76;
                                                fVar7.f170354y = z45;
                                                fVar7.f170355z = z46;
                                                fVar7.f170351v = i86;
                                                fVar7.f170352w = i79 == true ? 1 : 0;
                                                fVar7.f170353x = i85;
                                                fVar7.C = 15;
                                                if (y0Var.b(fVar7) == aVar8) {
                                                    return aVar8;
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                fVar2 = null;
                                activityStartRequest5 = activityStartRequest4;
                                fVar7.f170332a = activityStartRequest5;
                                fVar7.f170333b = cVar7;
                                gVar5 = gVar4;
                                fVar7.f170334c = gVar5;
                                fVar7.f170335d = null;
                                fVar7.f170336e = uuidC;
                                fVar7.f170337f = null;
                                fVar7.f170338g = dVarA;
                                fVar7.f170339h = str;
                                fVar7.f170340i = strD;
                                fVar7.f170341j = workoutFileUid;
                                fVar7.f170342k = bVar3;
                                fVar7.f170343l = listZ;
                                fVar7.f170344m = fVar2;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.f170351v = sportFitType;
                                i27 = i25;
                                fVar7.f170352w = i27;
                                list = listZ;
                                fVar7.f170353x = i24;
                                fVar7.C = 10;
                                uuid = workoutFileUid;
                                objB = b(activityStartRequest5, str, fVar7);
                                aVar8 = aVar3;
                                if (objB != aVar8) {
                                    boolean z419 = z16;
                                    z17 = zBooleanValue2;
                                    i28 = i18;
                                    z18 = z419;
                                    dVar5 = dVarA;
                                    i29 = sportFitType;
                                    aVar4 = aVar8;
                                    obj2 = objB;
                                    list2 = list;
                                    str3 = str;
                                    i30 = i24;
                                    activityStartRequest6 = activityStartRequest5;
                                    fVar3 = fVar2;
                                    uuid2 = uuidC;
                                    i34 = i27;
                                    str4 = strD;
                                    lVar = bVar3;
                                    cVar8 = cVar7;
                                    gVar6 = (zf2.g) obj2;
                                    target = activityStartRequest6.getTarget();
                                    i44 = i30;
                                    arrayList3 = new ArrayList();
                                    if (target != null) {
                                        if (target.hasDistance()) {
                                            arrayList3.add(new zf2.c.a(target.getDistance()));
                                        }
                                        if (target.hasTime()) {
                                            arrayList3.add(new zf2.c.d(target.getTime()));
                                        }
                                        if (target.hasSpeed()) {
                                            arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                        }
                                        if (target.hasReps()) {
                                            arrayList3.add(new zf2.c.b(target.getReps()));
                                        }
                                    } else {
                                        i34 = i34;
                                        i29 = i29;
                                    }
                                    listB1 = p13.h0.b1(arrayList3);
                                    long f172494b115 = cVar8.getF92746j();
                                    String f172493a12 = cVar8.getF92741e();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar8;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar5;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar;
                                    fVar7.f170343l = list2;
                                    fVar7.f170344m = fVar3;
                                    fVar7.f170345n = gVar6;
                                    fVar7.f170346o = listB1;
                                    fVar7.f170350t = i28;
                                    fVar7.f170354y = z18;
                                    fVar7.f170355z = z17;
                                    i45 = i29;
                                    fVar7.f170351v = i45;
                                    i46 = i34;
                                    fVar7.f170352w = i46;
                                    i47 = i28;
                                    fVar7.f170353x = i44;
                                    fVar7.C = 11;
                                    GDIDataTypes.UUID uuid112 = uuid;
                                    z27 = z17;
                                    z28 = z18;
                                    lVar2 = lVar;
                                    objC = this.f170314c.c(str3, f172494b115, f172493a12, uuid112, fVar7);
                                    aVar5 = aVar4;
                                    if (objC == aVar5) {
                                        return aVar5;
                                    }
                                    list3 = list2;
                                    obj5 = objC;
                                    aVar6 = aVar5;
                                    cVar9 = cVar8;
                                    dVar6 = dVar5;
                                    z29 = z28;
                                    z34 = z27;
                                    i48 = i46;
                                    i49 = i47;
                                    i54 = i45;
                                    i55 = i44;
                                    list4 = listB1;
                                    gVar7 = gVar6;
                                    lVar3 = lVar2;
                                    fVar4 = fVar3;
                                    pVar = (vf2.p) obj5;
                                    long f172494b116 = cVar9.getF92746j();
                                    i56 = i54;
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar9;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar6;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar3;
                                    fVar7.f170343l = list3;
                                    fVar7.f170344m = fVar4;
                                    fVar7.f170345n = gVar7;
                                    fVar7.f170346o = list4;
                                    fVar7.f170347p = pVar;
                                    fVar7.f170350t = i49;
                                    fVar7.f170354y = z29;
                                    fVar7.f170355z = z34;
                                    fVar7.f170351v = i56;
                                    fVar5 = fVar4;
                                    fVar7.f170352w = i48;
                                    fVar7.f170353x = i55;
                                    fVar7.C = 12;
                                    list5 = list3;
                                    aVar7 = aVar6;
                                    z35 = z34;
                                    gVar8 = gVar7;
                                    z36 = z29;
                                    i57 = i49;
                                    list6 = list4;
                                    lVar4 = lVar3;
                                    objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b116, fVar7);
                                    fVar7 = fVar7;
                                    if (objB3 == aVar7) {
                                        return aVar7;
                                    }
                                    obj6 = objB3;
                                    i58 = i57;
                                    fVar6 = fVar5;
                                    z37 = z35;
                                    aVar8 = aVar7;
                                    cVar10 = cVar9;
                                    list7 = list5;
                                    pVar2 = pVar;
                                    gVar9 = gVar8;
                                    z38 = z36;
                                    i59 = i56;
                                    Iterable iterable12 = (Iterable) obj6;
                                    z39 = z37;
                                    z44 = z38;
                                    arrayList4 = new ArrayList(p13.y.r(iterable12, 10));
                                    it6 = iterable12.iterator();
                                    while (it6.hasNext()) {
                                        arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                    }
                                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder1114 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                    builderNewBuilder1114.addAllRequestedTypes(arrayList4);
                                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder1115 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                    builderNewBuilder1115.setMetricConfigurationRequest(builderNewBuilder1114.build());
                                    GDISmartProto.Smart.Builder builderNewBuilder1116 = GDISmartProto.Smart.newBuilder();
                                    builderNewBuilder1116.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder1115.build());
                                    smartBuild = builderNewBuilder1116.build();
                                    String str112 = "activityStartRequest smart " + smartBuild;
                                    zg2.c.f204692a.getClass();
                                    str10 = str2;
                                    zg2.c.a(str10, str112);
                                    smartBuild.getClass();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar10;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar6;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar4;
                                    fVar7.f170343l = list7;
                                    fVar7.f170344m = fVar6;
                                    fVar7.f170345n = gVar9;
                                    fVar7.f170346o = list6;
                                    fVar7.f170347p = pVar2;
                                    fVar7.f170348q = smartBuild;
                                    fVar7.f170350t = i58;
                                    z45 = z44;
                                    fVar7.f170354y = z45;
                                    i58 = i58;
                                    fVar7.f170355z = z39;
                                    z39 = z39;
                                    i66 = i59;
                                    fVar7.f170351v = i66;
                                    i59 = i66;
                                    i67 = i48;
                                    fVar7.f170352w = i67;
                                    i48 = i67;
                                    i68 = i55;
                                    fVar7.f170353x = i68;
                                    pVar3 = pVar2;
                                    fVar7.C = 13;
                                    objB4 = gVar5.b(smartBuild, fVar7);
                                    aVar8 = aVar8;
                                    if (objB4 == aVar8) {
                                        return aVar8;
                                    }
                                    list8 = list6;
                                    str8 = str4;
                                    i69 = i59;
                                    i74 = i48;
                                    z46 = z39;
                                    gVar10 = gVar9;
                                    uuid4 = uuid2;
                                    i75 = i68;
                                    smart = smartBuild;
                                    i76 = i58;
                                    smart2 = (GDISmartProto.Smart) objB4;
                                    smart.getClass();
                                    y0Var2.getClass();
                                    gVar5.getClass();
                                    lVar5 = lVar4;
                                    y0Var = y0Var2;
                                    y0Var.f170541b = gVar5;
                                    y0Var.f170540a = smart;
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a(str10, "activityStartRequest response " + smart2);
                                    generatedExtension = GDILiveSessionExtension.liveSessionService;
                                    if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                        typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                        zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                        if (!typesList.isEmpty()) {
                                            dVar7 = dVar6;
                                            zf2.a aVar110 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                            i77 = i69;
                                            i78 = i74;
                                            zf2.h hVar12 = new zf2.h(fVar6, list7);
                                            if (dVar7 == zf2.d.f204583b2) {
                                                str9 = null;
                                            } else {
                                                str9 = null;
                                            }
                                            cVar12 = cVar10;
                                            cVar11 = new sf2.f.c(uuid4, cVar12, aVar110, lVar5, pVar3, hVar12, gVar10, false, str9);
                                            e2VarA3 = getF170500a();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = null;
                                            fVar7.f170343l = null;
                                            fVar7.f170344m = null;
                                            fVar7.f170345n = null;
                                            fVar7.f170346o = null;
                                            fVar7.f170347p = null;
                                            fVar7.f170348q = null;
                                            fVar7.f170349r = null;
                                            fVar7.f170350t = i76;
                                            fVar7.f170354y = z45;
                                            fVar7.f170355z = z46;
                                            fVar7.f170351v = i77;
                                            fVar7.f170352w = i78;
                                            fVar7.f170353x = i75;
                                            fVar7.C = 14;
                                            if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                return aVar8;
                                            }
                                            i85 = i75;
                                            i86 = i77;
                                            i79 = i78;
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = null;
                                            fVar7.f170343l = null;
                                            fVar7.f170344m = null;
                                            fVar7.f170345n = null;
                                            fVar7.f170346o = null;
                                            fVar7.f170347p = null;
                                            fVar7.f170348q = null;
                                            fVar7.f170349r = null;
                                            fVar7.f170350t = i76;
                                            fVar7.f170354y = z45;
                                            fVar7.f170355z = z46;
                                            fVar7.f170351v = i86;
                                            fVar7.f170352w = i79 == true ? 1 : 0;
                                            fVar7.f170353x = i85;
                                            fVar7.C = 15;
                                            if (y0Var.b(fVar7) == aVar8) {
                                                return aVar8;
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                aVar = aVar8;
                                activityStartRequest4 = activityStartRequest3;
                            }
                            i19 = 1;
                            if (i19 != 0) {
                                zg2.c.d("LSVSessionStartInteractor", am.j.g(sportFitType, sportFitSubType, "Unsupported activity type (sportType: ", ", subSportType: ", ")"));
                                if (dVarA != null) {
                                    break;
                                }
                                tf2.g gVar18 = (tf2.g) tVar3.getValue();
                                fVar7.f170332a = null;
                                fVar7.f170333b = null;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170336e = uuidC;
                                fVar7.f170337f = strD;
                                fVar7.f170338g = null;
                                fVar7.f170339h = null;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.f170351v = sportFitType;
                                fVar7.f170352w = sportFitSubType;
                                fVar7.f170353x = i19;
                                fVar7.C = 8;
                                objB2 = gVar18.b(sportFitType, sportFitSubType, fVar7);
                                obj3 = aVar;
                                if (objB2 != obj3) {
                                    z19 = zBooleanValue2;
                                    obj4 = objB2;
                                    str6 = strD;
                                    uuid3 = uuidC;
                                    i36 = sportFitType;
                                    i37 = sportFitSubType;
                                    tVar2 = tVar3;
                                    i39 = i37;
                                    i38 = i36;
                                    uuidC = uuid3;
                                    str7 = (String) obj4;
                                    zBooleanValue2 = z19;
                                    tVar = tVar2;
                                    if (str6 == null) {
                                        tVar = tVar3;
                                        strA = str6;
                                    } else if (str7 != null) {
                                        strA = ((tf2.g) tVar.getValue()).a(str7);
                                    } else {
                                        strA = null;
                                    }
                                    sf2.f.d dVar15 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                                    e2 e2VarA111 = getF170500a();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = null;
                                    fVar7.f170334c = null;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = null;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = null;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = null;
                                    fVar7.f170341j = null;
                                    fVar7.f170350t = i18;
                                    fVar7.f170354y = z16;
                                    fVar7.f170355z = zBooleanValue2;
                                    fVar7.f170351v = i38;
                                    fVar7.f170352w = i39;
                                    fVar7.f170353x = i19;
                                    fVar7.C = 9;
                                    break;
                                }
                                return obj3;
                            }
                            aVar2 = aVar;
                            str = dVarA.f204629a;
                            if (strD == null) {
                                strD = ((tf2.g) tVar3.getValue()).d(dVarA);
                            }
                            zg2.c.a("LSVSessionStartInteractor", "Activity type " + dVarA);
                            if (activityStartRequest4.hasWorkoutFileUid()) {
                                workoutFileUid = activityStartRequest4.getWorkoutFileUid();
                            } else {
                                workoutFileUid = null;
                            }
                            if (activityStartRequest4.hasWorkoutSession()) {
                                aVar3 = aVar2;
                                bVar3 = null;
                            } else {
                                aVar3 = aVar2;
                                bVar3 = null;
                            }
                            zg2.c.a("LSVSessionStartInteractor", "workout Session Type " + bVar3);
                            if (activityStartRequest4.getZonesCount() > 0) {
                                List<GDILiveSessionProto.Zones> zonesList13 = activityStartRequest4.getZonesList();
                                ArrayList arrayListL13 = androidx.core.view.j.l(zonesList13);
                                it4 = zonesList13.iterator();
                                while (it4.hasNext()) {
                                    Iterator it19 = it4;
                                    Object next13 = it19.next();
                                    zones2 = (GDILiveSessionProto.Zones) next13;
                                    if (zones2.hasType()) {
                                        str5 = str10;
                                        i35 = i19;
                                        if (zones2.getType() != GDILiveSessionProto.Zones.Type.POWER) {
                                        }
                                    } else {
                                        i35 = i19;
                                        str5 = str10;
                                    }
                                    it4 = it19;
                                    i19 = i35;
                                    str10 = str5;
                                }
                                i24 = i19;
                                str2 = str10;
                                arrayList2 = new ArrayList();
                                it5 = arrayListL13.iterator();
                                while (it5.hasNext()) {
                                    List<Integer> highValuesList13 = ((GDILiveSessionProto.Zones) it5.next()).getHighValuesList();
                                    highValuesList13.getClass();
                                    p13.d0.v(arrayList2, highValuesList13);
                                }
                                listZ = p13.h0.Z(arrayList2);
                            } else {
                                i24 = i19;
                                str2 = "LSVSessionStartInteractor";
                                listZ = p13.j0.f134944a;
                            }
                            if (activityStartRequest4.getZonesCount() <= 0) {
                                i25 = sportFitSubType;
                            } else {
                                List<GDILiveSessionProto.Zones> zonesList14 = activityStartRequest4.getZonesList();
                                ArrayList arrayListL14 = androidx.core.view.j.l(zonesList14);
                                it = zonesList14.iterator();
                                while (it.hasNext()) {
                                    Object next14 = it.next();
                                    zones = (GDILiveSessionProto.Zones) next14;
                                    Iterator it110 = it;
                                    if (zones.hasType()) {
                                        i26 = sportFitSubType;
                                        if (zones.getType() != GDILiveSessionProto.Zones.Type.HR) {
                                        }
                                    } else {
                                        i26 = sportFitSubType;
                                    }
                                    it = it110;
                                    sportFitSubType = i26;
                                }
                                i25 = sportFitSubType;
                                arrayList = new ArrayList();
                                it3 = arrayListL14.iterator();
                                while (it3.hasNext()) {
                                    List<Integer> highValuesList14 = ((GDILiveSessionProto.Zones) it3.next()).getHighValuesList();
                                    highValuesList14.getClass();
                                    p13.d0.v(arrayList, highValuesList14);
                                }
                                arrayListZ = p13.h0.Z(arrayList);
                                if (arrayListZ.size() >= 5) {
                                    fVar2 = new zf2.f(((Number) arrayListZ.get(0)).intValue(), ((Number) arrayListZ.get(1)).intValue(), ((Number) arrayListZ.get(2)).intValue(), ((Number) arrayListZ.get(3)).intValue(), ((Number) arrayListZ.get(4)).intValue());
                                }
                                activityStartRequest5 = activityStartRequest4;
                                fVar7.f170332a = activityStartRequest5;
                                fVar7.f170333b = cVar7;
                                gVar5 = gVar4;
                                fVar7.f170334c = gVar5;
                                fVar7.f170335d = null;
                                fVar7.f170336e = uuidC;
                                fVar7.f170337f = null;
                                fVar7.f170338g = dVarA;
                                fVar7.f170339h = str;
                                fVar7.f170340i = strD;
                                fVar7.f170341j = workoutFileUid;
                                fVar7.f170342k = bVar3;
                                fVar7.f170343l = listZ;
                                fVar7.f170344m = fVar2;
                                fVar7.f170350t = i18;
                                fVar7.f170354y = z16;
                                fVar7.f170355z = zBooleanValue2;
                                fVar7.f170351v = sportFitType;
                                i27 = i25;
                                fVar7.f170352w = i27;
                                list = listZ;
                                fVar7.f170353x = i24;
                                fVar7.C = 10;
                                uuid = workoutFileUid;
                                objB = b(activityStartRequest5, str, fVar7);
                                aVar8 = aVar3;
                                if (objB != aVar8) {
                                    boolean z4110 = z16;
                                    z17 = zBooleanValue2;
                                    i28 = i18;
                                    z18 = z4110;
                                    dVar5 = dVarA;
                                    i29 = sportFitType;
                                    aVar4 = aVar8;
                                    obj2 = objB;
                                    list2 = list;
                                    str3 = str;
                                    i30 = i24;
                                    activityStartRequest6 = activityStartRequest5;
                                    fVar3 = fVar2;
                                    uuid2 = uuidC;
                                    i34 = i27;
                                    str4 = strD;
                                    lVar = bVar3;
                                    cVar8 = cVar7;
                                    gVar6 = (zf2.g) obj2;
                                    target = activityStartRequest6.getTarget();
                                    i44 = i30;
                                    arrayList3 = new ArrayList();
                                    if (target != null) {
                                        if (target.hasDistance()) {
                                            arrayList3.add(new zf2.c.a(target.getDistance()));
                                        }
                                        if (target.hasTime()) {
                                            arrayList3.add(new zf2.c.d(target.getTime()));
                                        }
                                        if (target.hasSpeed()) {
                                            arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                        }
                                        if (target.hasReps()) {
                                            arrayList3.add(new zf2.c.b(target.getReps()));
                                        }
                                    } else {
                                        i34 = i34;
                                        i29 = i29;
                                    }
                                    listB1 = p13.h0.b1(arrayList3);
                                    long f172494b117 = cVar8.getF92746j();
                                    String f172493a13 = cVar8.getF92741e();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar8;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar5;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar;
                                    fVar7.f170343l = list2;
                                    fVar7.f170344m = fVar3;
                                    fVar7.f170345n = gVar6;
                                    fVar7.f170346o = listB1;
                                    fVar7.f170350t = i28;
                                    fVar7.f170354y = z18;
                                    fVar7.f170355z = z17;
                                    i45 = i29;
                                    fVar7.f170351v = i45;
                                    i46 = i34;
                                    fVar7.f170352w = i46;
                                    i47 = i28;
                                    fVar7.f170353x = i44;
                                    fVar7.C = 11;
                                    GDIDataTypes.UUID uuid113 = uuid;
                                    z27 = z17;
                                    z28 = z18;
                                    lVar2 = lVar;
                                    objC = this.f170314c.c(str3, f172494b117, f172493a13, uuid113, fVar7);
                                    aVar5 = aVar4;
                                    if (objC == aVar5) {
                                        return aVar5;
                                    }
                                    list3 = list2;
                                    obj5 = objC;
                                    aVar6 = aVar5;
                                    cVar9 = cVar8;
                                    dVar6 = dVar5;
                                    z29 = z28;
                                    z34 = z27;
                                    i48 = i46;
                                    i49 = i47;
                                    i54 = i45;
                                    i55 = i44;
                                    list4 = listB1;
                                    gVar7 = gVar6;
                                    lVar3 = lVar2;
                                    fVar4 = fVar3;
                                    pVar = (vf2.p) obj5;
                                    long f172494b118 = cVar9.getF92746j();
                                    i56 = i54;
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar9;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar6;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar3;
                                    fVar7.f170343l = list3;
                                    fVar7.f170344m = fVar4;
                                    fVar7.f170345n = gVar7;
                                    fVar7.f170346o = list4;
                                    fVar7.f170347p = pVar;
                                    fVar7.f170350t = i49;
                                    fVar7.f170354y = z29;
                                    fVar7.f170355z = z34;
                                    fVar7.f170351v = i56;
                                    fVar5 = fVar4;
                                    fVar7.f170352w = i48;
                                    fVar7.f170353x = i55;
                                    fVar7.C = 12;
                                    list5 = list3;
                                    aVar7 = aVar6;
                                    z35 = z34;
                                    gVar8 = gVar7;
                                    z36 = z29;
                                    i57 = i49;
                                    list6 = list4;
                                    lVar4 = lVar3;
                                    objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b118, fVar7);
                                    fVar7 = fVar7;
                                    if (objB3 == aVar7) {
                                        return aVar7;
                                    }
                                    obj6 = objB3;
                                    i58 = i57;
                                    fVar6 = fVar5;
                                    z37 = z35;
                                    aVar8 = aVar7;
                                    cVar10 = cVar9;
                                    list7 = list5;
                                    pVar2 = pVar;
                                    gVar9 = gVar8;
                                    z38 = z36;
                                    i59 = i56;
                                    Iterable iterable13 = (Iterable) obj6;
                                    z39 = z37;
                                    z44 = z38;
                                    arrayList4 = new ArrayList(p13.y.r(iterable13, 10));
                                    it6 = iterable13.iterator();
                                    while (it6.hasNext()) {
                                        arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                    }
                                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder1117 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                    builderNewBuilder1117.addAllRequestedTypes(arrayList4);
                                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder1118 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                    builderNewBuilder1118.setMetricConfigurationRequest(builderNewBuilder1117.build());
                                    GDISmartProto.Smart.Builder builderNewBuilder1119 = GDISmartProto.Smart.newBuilder();
                                    builderNewBuilder1119.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder1118.build());
                                    smartBuild = builderNewBuilder1119.build();
                                    String str113 = "activityStartRequest smart " + smartBuild;
                                    zg2.c.f204692a.getClass();
                                    str10 = str2;
                                    zg2.c.a(str10, str113);
                                    smartBuild.getClass();
                                    fVar7.f170332a = null;
                                    fVar7.f170333b = cVar10;
                                    fVar7.f170334c = gVar5;
                                    fVar7.f170335d = null;
                                    fVar7.f170336e = uuid2;
                                    fVar7.f170337f = null;
                                    fVar7.f170338g = dVar6;
                                    fVar7.f170339h = null;
                                    fVar7.f170340i = str4;
                                    fVar7.f170341j = null;
                                    fVar7.f170342k = lVar4;
                                    fVar7.f170343l = list7;
                                    fVar7.f170344m = fVar6;
                                    fVar7.f170345n = gVar9;
                                    fVar7.f170346o = list6;
                                    fVar7.f170347p = pVar2;
                                    fVar7.f170348q = smartBuild;
                                    fVar7.f170350t = i58;
                                    z45 = z44;
                                    fVar7.f170354y = z45;
                                    i58 = i58;
                                    fVar7.f170355z = z39;
                                    z39 = z39;
                                    i66 = i59;
                                    fVar7.f170351v = i66;
                                    i59 = i66;
                                    i67 = i48;
                                    fVar7.f170352w = i67;
                                    i48 = i67;
                                    i68 = i55;
                                    fVar7.f170353x = i68;
                                    pVar3 = pVar2;
                                    fVar7.C = 13;
                                    objB4 = gVar5.b(smartBuild, fVar7);
                                    aVar8 = aVar8;
                                    if (objB4 == aVar8) {
                                        return aVar8;
                                    }
                                    list8 = list6;
                                    str8 = str4;
                                    i69 = i59;
                                    i74 = i48;
                                    z46 = z39;
                                    gVar10 = gVar9;
                                    uuid4 = uuid2;
                                    i75 = i68;
                                    smart = smartBuild;
                                    i76 = i58;
                                    smart2 = (GDISmartProto.Smart) objB4;
                                    smart.getClass();
                                    y0Var2.getClass();
                                    gVar5.getClass();
                                    lVar5 = lVar4;
                                    y0Var = y0Var2;
                                    y0Var.f170541b = gVar5;
                                    y0Var.f170540a = smart;
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a(str10, "activityStartRequest response " + smart2);
                                    generatedExtension = GDILiveSessionExtension.liveSessionService;
                                    if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                        typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                        zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                        if (!typesList.isEmpty()) {
                                            dVar7 = dVar6;
                                            zf2.a aVar111 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                            i77 = i69;
                                            i78 = i74;
                                            zf2.h hVar13 = new zf2.h(fVar6, list7);
                                            if (dVar7 == zf2.d.f204583b2) {
                                                str9 = null;
                                            } else {
                                                str9 = null;
                                            }
                                            cVar12 = cVar10;
                                            cVar11 = new sf2.f.c(uuid4, cVar12, aVar111, lVar5, pVar3, hVar13, gVar10, false, str9);
                                            e2VarA3 = getF170500a();
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = null;
                                            fVar7.f170343l = null;
                                            fVar7.f170344m = null;
                                            fVar7.f170345n = null;
                                            fVar7.f170346o = null;
                                            fVar7.f170347p = null;
                                            fVar7.f170348q = null;
                                            fVar7.f170349r = null;
                                            fVar7.f170350t = i76;
                                            fVar7.f170354y = z45;
                                            fVar7.f170355z = z46;
                                            fVar7.f170351v = i77;
                                            fVar7.f170352w = i78;
                                            fVar7.f170353x = i75;
                                            fVar7.C = 14;
                                            if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                                return aVar8;
                                            }
                                            i85 = i75;
                                            i86 = i77;
                                            i79 = i78;
                                            fVar7.f170332a = null;
                                            fVar7.f170333b = cVar10;
                                            fVar7.f170334c = null;
                                            fVar7.f170335d = null;
                                            fVar7.f170336e = null;
                                            fVar7.f170337f = null;
                                            fVar7.f170338g = null;
                                            fVar7.f170339h = null;
                                            fVar7.f170340i = null;
                                            fVar7.f170341j = null;
                                            fVar7.f170342k = null;
                                            fVar7.f170343l = null;
                                            fVar7.f170344m = null;
                                            fVar7.f170345n = null;
                                            fVar7.f170346o = null;
                                            fVar7.f170347p = null;
                                            fVar7.f170348q = null;
                                            fVar7.f170349r = null;
                                            fVar7.f170350t = i76;
                                            fVar7.f170354y = z45;
                                            fVar7.f170355z = z46;
                                            fVar7.f170351v = i86;
                                            fVar7.f170352w = i79 == true ? 1 : 0;
                                            fVar7.f170353x = i85;
                                            fVar7.C = 15;
                                            if (y0Var.b(fVar7) == aVar8) {
                                                return aVar8;
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            fVar2 = null;
                            activityStartRequest5 = activityStartRequest4;
                            fVar7.f170332a = activityStartRequest5;
                            fVar7.f170333b = cVar7;
                            gVar5 = gVar4;
                            fVar7.f170334c = gVar5;
                            fVar7.f170335d = null;
                            fVar7.f170336e = uuidC;
                            fVar7.f170337f = null;
                            fVar7.f170338g = dVarA;
                            fVar7.f170339h = str;
                            fVar7.f170340i = strD;
                            fVar7.f170341j = workoutFileUid;
                            fVar7.f170342k = bVar3;
                            fVar7.f170343l = listZ;
                            fVar7.f170344m = fVar2;
                            fVar7.f170350t = i18;
                            fVar7.f170354y = z16;
                            fVar7.f170355z = zBooleanValue2;
                            fVar7.f170351v = sportFitType;
                            i27 = i25;
                            fVar7.f170352w = i27;
                            list = listZ;
                            fVar7.f170353x = i24;
                            fVar7.C = 10;
                            uuid = workoutFileUid;
                            objB = b(activityStartRequest5, str, fVar7);
                            aVar8 = aVar3;
                            if (objB != aVar8) {
                                boolean z4111 = z16;
                                z17 = zBooleanValue2;
                                i28 = i18;
                                z18 = z4111;
                                dVar5 = dVarA;
                                i29 = sportFitType;
                                aVar4 = aVar8;
                                obj2 = objB;
                                list2 = list;
                                str3 = str;
                                i30 = i24;
                                activityStartRequest6 = activityStartRequest5;
                                fVar3 = fVar2;
                                uuid2 = uuidC;
                                i34 = i27;
                                str4 = strD;
                                lVar = bVar3;
                                cVar8 = cVar7;
                                gVar6 = (zf2.g) obj2;
                                target = activityStartRequest6.getTarget();
                                i44 = i30;
                                arrayList3 = new ArrayList();
                                if (target != null) {
                                    if (target.hasDistance()) {
                                        arrayList3.add(new zf2.c.a(target.getDistance()));
                                    }
                                    if (target.hasTime()) {
                                        arrayList3.add(new zf2.c.d(target.getTime()));
                                    }
                                    if (target.hasSpeed()) {
                                        arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                                    }
                                    if (target.hasReps()) {
                                        arrayList3.add(new zf2.c.b(target.getReps()));
                                    }
                                } else {
                                    i34 = i34;
                                    i29 = i29;
                                }
                                listB1 = p13.h0.b1(arrayList3);
                                long f172494b119 = cVar8.getF92746j();
                                String f172493a14 = cVar8.getF92741e();
                                fVar7.f170332a = null;
                                fVar7.f170333b = cVar8;
                                fVar7.f170334c = gVar5;
                                fVar7.f170335d = null;
                                fVar7.f170336e = uuid2;
                                fVar7.f170337f = null;
                                fVar7.f170338g = dVar5;
                                fVar7.f170339h = null;
                                fVar7.f170340i = str4;
                                fVar7.f170341j = null;
                                fVar7.f170342k = lVar;
                                fVar7.f170343l = list2;
                                fVar7.f170344m = fVar3;
                                fVar7.f170345n = gVar6;
                                fVar7.f170346o = listB1;
                                fVar7.f170350t = i28;
                                fVar7.f170354y = z18;
                                fVar7.f170355z = z17;
                                i45 = i29;
                                fVar7.f170351v = i45;
                                i46 = i34;
                                fVar7.f170352w = i46;
                                i47 = i28;
                                fVar7.f170353x = i44;
                                fVar7.C = 11;
                                GDIDataTypes.UUID uuid114 = uuid;
                                z27 = z17;
                                z28 = z18;
                                lVar2 = lVar;
                                objC = this.f170314c.c(str3, f172494b119, f172493a14, uuid114, fVar7);
                                aVar5 = aVar4;
                                if (objC == aVar5) {
                                    return aVar5;
                                }
                                list3 = list2;
                                obj5 = objC;
                                aVar6 = aVar5;
                                cVar9 = cVar8;
                                dVar6 = dVar5;
                                z29 = z28;
                                z34 = z27;
                                i48 = i46;
                                i49 = i47;
                                i54 = i45;
                                i55 = i44;
                                list4 = listB1;
                                gVar7 = gVar6;
                                lVar3 = lVar2;
                                fVar4 = fVar3;
                                pVar = (vf2.p) obj5;
                                long f172494b1110 = cVar9.getF92746j();
                                i56 = i54;
                                fVar7.f170332a = null;
                                fVar7.f170333b = cVar9;
                                fVar7.f170334c = gVar5;
                                fVar7.f170335d = null;
                                fVar7.f170336e = uuid2;
                                fVar7.f170337f = null;
                                fVar7.f170338g = dVar6;
                                fVar7.f170339h = null;
                                fVar7.f170340i = str4;
                                fVar7.f170341j = null;
                                fVar7.f170342k = lVar3;
                                fVar7.f170343l = list3;
                                fVar7.f170344m = fVar4;
                                fVar7.f170345n = gVar7;
                                fVar7.f170346o = list4;
                                fVar7.f170347p = pVar;
                                fVar7.f170350t = i49;
                                fVar7.f170354y = z29;
                                fVar7.f170355z = z34;
                                fVar7.f170351v = i56;
                                fVar5 = fVar4;
                                fVar7.f170352w = i48;
                                fVar7.f170353x = i55;
                                fVar7.C = 12;
                                list5 = list3;
                                aVar7 = aVar6;
                                z35 = z34;
                                gVar8 = gVar7;
                                z36 = z29;
                                i57 = i49;
                                list6 = list4;
                                lVar4 = lVar3;
                                objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b1110, fVar7);
                                fVar7 = fVar7;
                                if (objB3 == aVar7) {
                                    return aVar7;
                                }
                                obj6 = objB3;
                                i58 = i57;
                                fVar6 = fVar5;
                                z37 = z35;
                                aVar8 = aVar7;
                                cVar10 = cVar9;
                                list7 = list5;
                                pVar2 = pVar;
                                gVar9 = gVar8;
                                z38 = z36;
                                i59 = i56;
                                Iterable iterable14 = (Iterable) obj6;
                                z39 = z37;
                                z44 = z38;
                                arrayList4 = new ArrayList(p13.y.r(iterable14, 10));
                                it6 = iterable14.iterator();
                                while (it6.hasNext()) {
                                    arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                                }
                                GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder11110 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                                builderNewBuilder11110.addAllRequestedTypes(arrayList4);
                                GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder11111 = GDILiveSessionProto.LiveSessionService.newBuilder();
                                builderNewBuilder11111.setMetricConfigurationRequest(builderNewBuilder11110.build());
                                GDISmartProto.Smart.Builder builderNewBuilder11112 = GDISmartProto.Smart.newBuilder();
                                builderNewBuilder11112.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder11111.build());
                                smartBuild = builderNewBuilder11112.build();
                                String str114 = "activityStartRequest smart " + smartBuild;
                                zg2.c.f204692a.getClass();
                                str10 = str2;
                                zg2.c.a(str10, str114);
                                smartBuild.getClass();
                                fVar7.f170332a = null;
                                fVar7.f170333b = cVar10;
                                fVar7.f170334c = gVar5;
                                fVar7.f170335d = null;
                                fVar7.f170336e = uuid2;
                                fVar7.f170337f = null;
                                fVar7.f170338g = dVar6;
                                fVar7.f170339h = null;
                                fVar7.f170340i = str4;
                                fVar7.f170341j = null;
                                fVar7.f170342k = lVar4;
                                fVar7.f170343l = list7;
                                fVar7.f170344m = fVar6;
                                fVar7.f170345n = gVar9;
                                fVar7.f170346o = list6;
                                fVar7.f170347p = pVar2;
                                fVar7.f170348q = smartBuild;
                                fVar7.f170350t = i58;
                                z45 = z44;
                                fVar7.f170354y = z45;
                                i58 = i58;
                                fVar7.f170355z = z39;
                                z39 = z39;
                                i66 = i59;
                                fVar7.f170351v = i66;
                                i59 = i66;
                                i67 = i48;
                                fVar7.f170352w = i67;
                                i48 = i67;
                                i68 = i55;
                                fVar7.f170353x = i68;
                                pVar3 = pVar2;
                                fVar7.C = 13;
                                objB4 = gVar5.b(smartBuild, fVar7);
                                aVar8 = aVar8;
                                if (objB4 == aVar8) {
                                    return aVar8;
                                }
                                list8 = list6;
                                str8 = str4;
                                i69 = i59;
                                i74 = i48;
                                z46 = z39;
                                gVar10 = gVar9;
                                uuid4 = uuid2;
                                i75 = i68;
                                smart = smartBuild;
                                i76 = i58;
                                smart2 = (GDISmartProto.Smart) objB4;
                                smart.getClass();
                                y0Var2.getClass();
                                gVar5.getClass();
                                lVar5 = lVar4;
                                y0Var = y0Var2;
                                y0Var.f170541b = gVar5;
                                y0Var.f170540a = smart;
                                zg2.c.f204692a.getClass();
                                zg2.c.a(str10, "activityStartRequest response " + smart2);
                                generatedExtension = GDILiveSessionExtension.liveSessionService;
                                if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                                    typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                                    zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                                    if (!typesList.isEmpty()) {
                                        dVar7 = dVar6;
                                        zf2.a aVar112 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                        i77 = i69;
                                        i78 = i74;
                                        zf2.h hVar14 = new zf2.h(fVar6, list7);
                                        if (dVar7 == zf2.d.f204583b2) {
                                            str9 = null;
                                        } else {
                                            str9 = null;
                                        }
                                        cVar12 = cVar10;
                                        cVar11 = new sf2.f.c(uuid4, cVar12, aVar112, lVar5, pVar3, hVar14, gVar10, false, str9);
                                        e2VarA3 = getF170500a();
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar10;
                                        fVar7.f170334c = null;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = null;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = null;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = null;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = null;
                                        fVar7.f170343l = null;
                                        fVar7.f170344m = null;
                                        fVar7.f170345n = null;
                                        fVar7.f170346o = null;
                                        fVar7.f170347p = null;
                                        fVar7.f170348q = null;
                                        fVar7.f170349r = null;
                                        fVar7.f170350t = i76;
                                        fVar7.f170354y = z45;
                                        fVar7.f170355z = z46;
                                        fVar7.f170351v = i77;
                                        fVar7.f170352w = i78;
                                        fVar7.f170353x = i75;
                                        fVar7.C = 14;
                                        if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                            return aVar8;
                                        }
                                        i85 = i75;
                                        i86 = i77;
                                        i79 = i78;
                                        fVar7.f170332a = null;
                                        fVar7.f170333b = cVar10;
                                        fVar7.f170334c = null;
                                        fVar7.f170335d = null;
                                        fVar7.f170336e = null;
                                        fVar7.f170337f = null;
                                        fVar7.f170338g = null;
                                        fVar7.f170339h = null;
                                        fVar7.f170340i = null;
                                        fVar7.f170341j = null;
                                        fVar7.f170342k = null;
                                        fVar7.f170343l = null;
                                        fVar7.f170344m = null;
                                        fVar7.f170345n = null;
                                        fVar7.f170346o = null;
                                        fVar7.f170347p = null;
                                        fVar7.f170348q = null;
                                        fVar7.f170349r = null;
                                        fVar7.f170350t = i76;
                                        fVar7.f170354y = z45;
                                        fVar7.f170355z = z46;
                                        fVar7.f170351v = i86;
                                        fVar7.f170352w = i79 == true ? 1 : 0;
                                        fVar7.f170353x = i85;
                                        fVar7.C = 15;
                                        if (y0Var.b(fVar7) == aVar8) {
                                            return aVar8;
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        break;
                    } else {
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LSVSessionStartInteractor", "Missing sport profile");
                        e2 e2VarA112 = getF170500a();
                        sf2.f.b bVar15 = new sf2.f.b(null, sf2.f.b.a.C3008f.f159003a, cVar6, 1, null);
                        fVar7.f170332a = null;
                        fVar7.f170333b = null;
                        fVar7.f170334c = null;
                        fVar7.f170335d = null;
                        fVar7.f170350t = i18;
                        fVar7.f170354y = z16;
                        fVar7.f170355z = zBooleanValue2;
                        fVar7.C = 3;
                        break;
                    }
                    return aVar8;
                case 3:
                    o13.r.b(obj7);
                    return Unit.INSTANCE;
                case 4:
                    o13.r.b(obj7);
                    return Unit.INSTANCE;
                case 5:
                    o13.r.b(obj7);
                    return Unit.INSTANCE;
                case 6:
                    o13.r.b(obj7);
                    return Unit.INSTANCE;
                case 7:
                    o13.r.b(obj7);
                    return Unit.INSTANCE;
                case 8:
                    int i93 = fVar7.f170353x;
                    i37 = fVar7.f170352w;
                    i36 = fVar7.f170351v;
                    z19 = fVar7.f170355z;
                    z16 = fVar7.f170354y;
                    i18 = fVar7.f170350t;
                    str6 = fVar7.f170337f;
                    UUID uuid20 = fVar7.f170336e;
                    o13.r.b(obj7);
                    obj3 = aVar8;
                    uuid3 = uuid20;
                    i19 = i93;
                    tVar2 = tVar3;
                    obj4 = obj7;
                    i39 = i37;
                    i38 = i36;
                    uuidC = uuid3;
                    str7 = (String) obj4;
                    zBooleanValue2 = z19;
                    tVar = tVar2;
                    if (str6 == null) {
                        tVar = tVar3;
                        strA = str6;
                    } else if (str7 != null) {
                        strA = ((tf2.g) tVar.getValue()).a(str7);
                    } else {
                        strA = null;
                    }
                    sf2.f.d dVar16 = new sf2.f.d(uuidC, new zf2.a(zf2.d.f204593g2, str7, i38, i39, p13.x.h(), strA, false, false));
                    e2 e2VarA113 = getF170500a();
                    fVar7.f170332a = null;
                    fVar7.f170333b = null;
                    fVar7.f170334c = null;
                    fVar7.f170335d = null;
                    fVar7.f170336e = null;
                    fVar7.f170337f = null;
                    fVar7.f170338g = null;
                    fVar7.f170339h = null;
                    fVar7.f170340i = null;
                    fVar7.f170341j = null;
                    fVar7.f170350t = i18;
                    fVar7.f170354y = z16;
                    fVar7.f170355z = zBooleanValue2;
                    fVar7.f170351v = i38;
                    fVar7.f170352w = i39;
                    fVar7.f170353x = i19;
                    fVar7.C = 9;
                    break;
                case 9:
                    o13.r.b(obj7);
                    return Unit.INSTANCE;
                case 10:
                    int i94 = fVar7.f170353x;
                    int i95 = fVar7.f170352w;
                    int i96 = fVar7.f170351v;
                    boolean z55 = fVar7.f170355z;
                    boolean z56 = fVar7.f170354y;
                    int i97 = fVar7.f170350t;
                    zf2.f fVar8 = fVar7.f170344m;
                    List list9 = fVar7.f170343l;
                    rf2.l lVar6 = fVar7.f170342k;
                    GDIDataTypes.UUID uuid21 = fVar7.f170341j;
                    String str20 = fVar7.f170340i;
                    String str21 = fVar7.f170339h;
                    zf2.d dVar17 = fVar7.f170338g;
                    UUID uuid22 = fVar7.f170336e;
                    dt2.g gVar19 = fVar7.f170334c;
                    rs2.c cVar17 = fVar7.f170333b;
                    GDILiveSessionProto.ActivityStartRequest activityStartRequest8 = fVar7.f170332a;
                    o13.r.b(obj7);
                    dVar5 = dVar17;
                    activityStartRequest6 = activityStartRequest8;
                    i28 = i97;
                    z17 = z55;
                    i34 = i95;
                    i30 = i94;
                    str2 = "LSVSessionStartInteractor";
                    fVar3 = fVar8;
                    z18 = z56;
                    i29 = i96;
                    lVar = lVar6;
                    aVar4 = aVar8;
                    list2 = list9;
                    uuid = uuid21;
                    str4 = str20;
                    uuid2 = uuid22;
                    gVar5 = gVar19;
                    cVar8 = cVar17;
                    str3 = str21;
                    obj2 = obj7;
                    gVar6 = (zf2.g) obj2;
                    target = activityStartRequest6.getTarget();
                    i44 = i30;
                    arrayList3 = new ArrayList();
                    if (target != null) {
                        if (target.hasDistance()) {
                            arrayList3.add(new zf2.c.a(target.getDistance()));
                        }
                        if (target.hasTime()) {
                            arrayList3.add(new zf2.c.d(target.getTime()));
                        }
                        if (target.hasSpeed()) {
                            arrayList3.add(new zf2.c.C3813c(target.getSpeed()));
                        }
                        if (target.hasReps()) {
                            arrayList3.add(new zf2.c.b(target.getReps()));
                        }
                    } else {
                        i34 = i34;
                        i29 = i29;
                    }
                    listB1 = p13.h0.b1(arrayList3);
                    long f172494b1111 = cVar8.getF92746j();
                    String f172493a15 = cVar8.getF92741e();
                    fVar7.f170332a = null;
                    fVar7.f170333b = cVar8;
                    fVar7.f170334c = gVar5;
                    fVar7.f170335d = null;
                    fVar7.f170336e = uuid2;
                    fVar7.f170337f = null;
                    fVar7.f170338g = dVar5;
                    fVar7.f170339h = null;
                    fVar7.f170340i = str4;
                    fVar7.f170341j = null;
                    fVar7.f170342k = lVar;
                    fVar7.f170343l = list2;
                    fVar7.f170344m = fVar3;
                    fVar7.f170345n = gVar6;
                    fVar7.f170346o = listB1;
                    fVar7.f170350t = i28;
                    fVar7.f170354y = z18;
                    fVar7.f170355z = z17;
                    i45 = i29;
                    fVar7.f170351v = i45;
                    i46 = i34;
                    fVar7.f170352w = i46;
                    i47 = i28;
                    fVar7.f170353x = i44;
                    fVar7.C = 11;
                    GDIDataTypes.UUID uuid115 = uuid;
                    z27 = z17;
                    z28 = z18;
                    lVar2 = lVar;
                    objC = this.f170314c.c(str3, f172494b1111, f172493a15, uuid115, fVar7);
                    aVar5 = aVar4;
                    if (objC == aVar5) {
                        return aVar5;
                    }
                    list3 = list2;
                    obj5 = objC;
                    aVar6 = aVar5;
                    cVar9 = cVar8;
                    dVar6 = dVar5;
                    z29 = z28;
                    z34 = z27;
                    i48 = i46;
                    i49 = i47;
                    i54 = i45;
                    i55 = i44;
                    list4 = listB1;
                    gVar7 = gVar6;
                    lVar3 = lVar2;
                    fVar4 = fVar3;
                    pVar = (vf2.p) obj5;
                    long f172494b1112 = cVar9.getF92746j();
                    i56 = i54;
                    fVar7.f170332a = null;
                    fVar7.f170333b = cVar9;
                    fVar7.f170334c = gVar5;
                    fVar7.f170335d = null;
                    fVar7.f170336e = uuid2;
                    fVar7.f170337f = null;
                    fVar7.f170338g = dVar6;
                    fVar7.f170339h = null;
                    fVar7.f170340i = str4;
                    fVar7.f170341j = null;
                    fVar7.f170342k = lVar3;
                    fVar7.f170343l = list3;
                    fVar7.f170344m = fVar4;
                    fVar7.f170345n = gVar7;
                    fVar7.f170346o = list4;
                    fVar7.f170347p = pVar;
                    fVar7.f170350t = i49;
                    fVar7.f170354y = z29;
                    fVar7.f170355z = z34;
                    fVar7.f170351v = i56;
                    fVar5 = fVar4;
                    fVar7.f170352w = i48;
                    fVar7.f170353x = i55;
                    fVar7.C = 12;
                    list5 = list3;
                    aVar7 = aVar6;
                    z35 = z34;
                    gVar8 = gVar7;
                    z36 = z29;
                    i57 = i49;
                    list6 = list4;
                    lVar4 = lVar3;
                    objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b1112, fVar7);
                    fVar7 = fVar7;
                    if (objB3 == aVar7) {
                        return aVar7;
                    }
                    obj6 = objB3;
                    i58 = i57;
                    fVar6 = fVar5;
                    z37 = z35;
                    aVar8 = aVar7;
                    cVar10 = cVar9;
                    list7 = list5;
                    pVar2 = pVar;
                    gVar9 = gVar8;
                    z38 = z36;
                    i59 = i56;
                    Iterable iterable15 = (Iterable) obj6;
                    z39 = z37;
                    z44 = z38;
                    arrayList4 = new ArrayList(p13.y.r(iterable15, 10));
                    it6 = iterable15.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                    }
                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder11113 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                    builderNewBuilder11113.addAllRequestedTypes(arrayList4);
                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder11114 = GDILiveSessionProto.LiveSessionService.newBuilder();
                    builderNewBuilder11114.setMetricConfigurationRequest(builderNewBuilder11113.build());
                    GDISmartProto.Smart.Builder builderNewBuilder11115 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder11115.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder11114.build());
                    smartBuild = builderNewBuilder11115.build();
                    String str115 = "activityStartRequest smart " + smartBuild;
                    zg2.c.f204692a.getClass();
                    str10 = str2;
                    zg2.c.a(str10, str115);
                    smartBuild.getClass();
                    fVar7.f170332a = null;
                    fVar7.f170333b = cVar10;
                    fVar7.f170334c = gVar5;
                    fVar7.f170335d = null;
                    fVar7.f170336e = uuid2;
                    fVar7.f170337f = null;
                    fVar7.f170338g = dVar6;
                    fVar7.f170339h = null;
                    fVar7.f170340i = str4;
                    fVar7.f170341j = null;
                    fVar7.f170342k = lVar4;
                    fVar7.f170343l = list7;
                    fVar7.f170344m = fVar6;
                    fVar7.f170345n = gVar9;
                    fVar7.f170346o = list6;
                    fVar7.f170347p = pVar2;
                    fVar7.f170348q = smartBuild;
                    fVar7.f170350t = i58;
                    z45 = z44;
                    fVar7.f170354y = z45;
                    i58 = i58;
                    fVar7.f170355z = z39;
                    z39 = z39;
                    i66 = i59;
                    fVar7.f170351v = i66;
                    i59 = i66;
                    i67 = i48;
                    fVar7.f170352w = i67;
                    i48 = i67;
                    i68 = i55;
                    fVar7.f170353x = i68;
                    pVar3 = pVar2;
                    fVar7.C = 13;
                    objB4 = gVar5.b(smartBuild, fVar7);
                    aVar8 = aVar8;
                    if (objB4 == aVar8) {
                        return aVar8;
                    }
                    list8 = list6;
                    str8 = str4;
                    i69 = i59;
                    i74 = i48;
                    z46 = z39;
                    gVar10 = gVar9;
                    uuid4 = uuid2;
                    i75 = i68;
                    smart = smartBuild;
                    i76 = i58;
                    smart2 = (GDISmartProto.Smart) objB4;
                    smart.getClass();
                    y0Var2.getClass();
                    gVar5.getClass();
                    lVar5 = lVar4;
                    y0Var = y0Var2;
                    y0Var.f170541b = gVar5;
                    y0Var.f170540a = smart;
                    zg2.c.f204692a.getClass();
                    zg2.c.a(str10, "activityStartRequest response " + smart2);
                    generatedExtension = GDILiveSessionExtension.liveSessionService;
                    if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                        typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                        zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                        if (!typesList.isEmpty()) {
                            dVar7 = dVar6;
                            zf2.a aVar113 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                            i77 = i69;
                            i78 = i74;
                            zf2.h hVar15 = new zf2.h(fVar6, list7);
                            if (dVar7 == zf2.d.f204583b2) {
                                str9 = null;
                            } else {
                                str9 = null;
                            }
                            cVar12 = cVar10;
                            cVar11 = new sf2.f.c(uuid4, cVar12, aVar113, lVar5, pVar3, hVar15, gVar10, false, str9);
                            e2VarA3 = getF170500a();
                            fVar7.f170332a = null;
                            fVar7.f170333b = cVar10;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170337f = null;
                            fVar7.f170338g = null;
                            fVar7.f170339h = null;
                            fVar7.f170340i = null;
                            fVar7.f170341j = null;
                            fVar7.f170342k = null;
                            fVar7.f170343l = null;
                            fVar7.f170344m = null;
                            fVar7.f170345n = null;
                            fVar7.f170346o = null;
                            fVar7.f170347p = null;
                            fVar7.f170348q = null;
                            fVar7.f170349r = null;
                            fVar7.f170350t = i76;
                            fVar7.f170354y = z45;
                            fVar7.f170355z = z46;
                            fVar7.f170351v = i77;
                            fVar7.f170352w = i78;
                            fVar7.f170353x = i75;
                            fVar7.C = 14;
                            if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                return aVar8;
                            }
                            i85 = i75;
                            i86 = i77;
                            i79 = i78;
                            fVar7.f170332a = null;
                            fVar7.f170333b = cVar10;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170337f = null;
                            fVar7.f170338g = null;
                            fVar7.f170339h = null;
                            fVar7.f170340i = null;
                            fVar7.f170341j = null;
                            fVar7.f170342k = null;
                            fVar7.f170343l = null;
                            fVar7.f170344m = null;
                            fVar7.f170345n = null;
                            fVar7.f170346o = null;
                            fVar7.f170347p = null;
                            fVar7.f170348q = null;
                            fVar7.f170349r = null;
                            fVar7.f170350t = i76;
                            fVar7.f170354y = z45;
                            fVar7.f170355z = z46;
                            fVar7.f170351v = i86;
                            fVar7.f170352w = i79 == true ? 1 : 0;
                            fVar7.f170353x = i85;
                            fVar7.C = 15;
                            if (y0Var.b(fVar7) == aVar8) {
                                return aVar8;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    int i98 = fVar7.f170353x;
                    int i99 = fVar7.f170352w;
                    int i100 = fVar7.f170351v;
                    z34 = fVar7.f170355z;
                    z29 = fVar7.f170354y;
                    i49 = fVar7.f170350t;
                    list4 = fVar7.f170346o;
                    gVar7 = fVar7.f170345n;
                    zf2.f fVar9 = fVar7.f170344m;
                    List list10 = fVar7.f170343l;
                    rf2.l lVar7 = fVar7.f170342k;
                    String str22 = fVar7.f170340i;
                    zf2.d dVar18 = fVar7.f170338g;
                    UUID uuid23 = fVar7.f170336e;
                    dt2.g gVar20 = fVar7.f170334c;
                    rs2.c cVar18 = fVar7.f170333b;
                    o13.r.b(obj7);
                    aVar6 = aVar8;
                    i48 = i99;
                    i54 = i100;
                    y0Var2 = y0Var2;
                    list3 = list10;
                    str4 = str22;
                    dVar6 = dVar18;
                    uuid2 = uuid23;
                    cVar9 = cVar18;
                    fVar4 = fVar9;
                    lVar3 = lVar7;
                    obj5 = obj7;
                    i55 = i98;
                    gVar5 = gVar20;
                    str2 = "LSVSessionStartInteractor";
                    pVar = (vf2.p) obj5;
                    long f172494b1113 = cVar9.getF92746j();
                    i56 = i54;
                    fVar7.f170332a = null;
                    fVar7.f170333b = cVar9;
                    fVar7.f170334c = gVar5;
                    fVar7.f170335d = null;
                    fVar7.f170336e = uuid2;
                    fVar7.f170337f = null;
                    fVar7.f170338g = dVar6;
                    fVar7.f170339h = null;
                    fVar7.f170340i = str4;
                    fVar7.f170341j = null;
                    fVar7.f170342k = lVar3;
                    fVar7.f170343l = list3;
                    fVar7.f170344m = fVar4;
                    fVar7.f170345n = gVar7;
                    fVar7.f170346o = list4;
                    fVar7.f170347p = pVar;
                    fVar7.f170350t = i49;
                    fVar7.f170354y = z29;
                    fVar7.f170355z = z34;
                    fVar7.f170351v = i56;
                    fVar5 = fVar4;
                    fVar7.f170352w = i48;
                    fVar7.f170353x = i55;
                    fVar7.C = 12;
                    list5 = list3;
                    aVar7 = aVar6;
                    z35 = z34;
                    gVar8 = gVar7;
                    z36 = z29;
                    i57 = i49;
                    list6 = list4;
                    lVar4 = lVar3;
                    objB3 = this.f170316e.b(dVar6, pVar, lVar4, list6, f172494b1113, fVar7);
                    fVar7 = fVar7;
                    if (objB3 == aVar7) {
                        return aVar7;
                    }
                    obj6 = objB3;
                    i58 = i57;
                    fVar6 = fVar5;
                    z37 = z35;
                    aVar8 = aVar7;
                    cVar10 = cVar9;
                    list7 = list5;
                    pVar2 = pVar;
                    gVar9 = gVar8;
                    z38 = z36;
                    i59 = i56;
                    Iterable iterable16 = (Iterable) obj6;
                    z39 = z37;
                    z44 = z38;
                    arrayList4 = new ArrayList(p13.y.r(iterable16, 10));
                    it6 = iterable16.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                    }
                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder11116 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                    builderNewBuilder11116.addAllRequestedTypes(arrayList4);
                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder11117 = GDILiveSessionProto.LiveSessionService.newBuilder();
                    builderNewBuilder11117.setMetricConfigurationRequest(builderNewBuilder11116.build());
                    GDISmartProto.Smart.Builder builderNewBuilder11118 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder11118.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder11117.build());
                    smartBuild = builderNewBuilder11118.build();
                    String str116 = "activityStartRequest smart " + smartBuild;
                    zg2.c.f204692a.getClass();
                    str10 = str2;
                    zg2.c.a(str10, str116);
                    smartBuild.getClass();
                    fVar7.f170332a = null;
                    fVar7.f170333b = cVar10;
                    fVar7.f170334c = gVar5;
                    fVar7.f170335d = null;
                    fVar7.f170336e = uuid2;
                    fVar7.f170337f = null;
                    fVar7.f170338g = dVar6;
                    fVar7.f170339h = null;
                    fVar7.f170340i = str4;
                    fVar7.f170341j = null;
                    fVar7.f170342k = lVar4;
                    fVar7.f170343l = list7;
                    fVar7.f170344m = fVar6;
                    fVar7.f170345n = gVar9;
                    fVar7.f170346o = list6;
                    fVar7.f170347p = pVar2;
                    fVar7.f170348q = smartBuild;
                    fVar7.f170350t = i58;
                    z45 = z44;
                    fVar7.f170354y = z45;
                    i58 = i58;
                    fVar7.f170355z = z39;
                    z39 = z39;
                    i66 = i59;
                    fVar7.f170351v = i66;
                    i59 = i66;
                    i67 = i48;
                    fVar7.f170352w = i67;
                    i48 = i67;
                    i68 = i55;
                    fVar7.f170353x = i68;
                    pVar3 = pVar2;
                    fVar7.C = 13;
                    objB4 = gVar5.b(smartBuild, fVar7);
                    aVar8 = aVar8;
                    if (objB4 == aVar8) {
                        return aVar8;
                    }
                    list8 = list6;
                    str8 = str4;
                    i69 = i59;
                    i74 = i48;
                    z46 = z39;
                    gVar10 = gVar9;
                    uuid4 = uuid2;
                    i75 = i68;
                    smart = smartBuild;
                    i76 = i58;
                    smart2 = (GDISmartProto.Smart) objB4;
                    smart.getClass();
                    y0Var2.getClass();
                    gVar5.getClass();
                    lVar5 = lVar4;
                    y0Var = y0Var2;
                    y0Var.f170541b = gVar5;
                    y0Var.f170540a = smart;
                    zg2.c.f204692a.getClass();
                    zg2.c.a(str10, "activityStartRequest response " + smart2);
                    generatedExtension = GDILiveSessionExtension.liveSessionService;
                    if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                        typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                        zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                        if (!typesList.isEmpty()) {
                            dVar7 = dVar6;
                            zf2.a aVar114 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                            i77 = i69;
                            i78 = i74;
                            zf2.h hVar16 = new zf2.h(fVar6, list7);
                            if (dVar7 == zf2.d.f204583b2) {
                                str9 = null;
                            } else {
                                str9 = null;
                            }
                            cVar12 = cVar10;
                            cVar11 = new sf2.f.c(uuid4, cVar12, aVar114, lVar5, pVar3, hVar16, gVar10, false, str9);
                            e2VarA3 = getF170500a();
                            fVar7.f170332a = null;
                            fVar7.f170333b = cVar10;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170337f = null;
                            fVar7.f170338g = null;
                            fVar7.f170339h = null;
                            fVar7.f170340i = null;
                            fVar7.f170341j = null;
                            fVar7.f170342k = null;
                            fVar7.f170343l = null;
                            fVar7.f170344m = null;
                            fVar7.f170345n = null;
                            fVar7.f170346o = null;
                            fVar7.f170347p = null;
                            fVar7.f170348q = null;
                            fVar7.f170349r = null;
                            fVar7.f170350t = i76;
                            fVar7.f170354y = z45;
                            fVar7.f170355z = z46;
                            fVar7.f170351v = i77;
                            fVar7.f170352w = i78;
                            fVar7.f170353x = i75;
                            fVar7.C = 14;
                            if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                return aVar8;
                            }
                            i85 = i75;
                            i86 = i77;
                            i79 = i78;
                            fVar7.f170332a = null;
                            fVar7.f170333b = cVar10;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170337f = null;
                            fVar7.f170338g = null;
                            fVar7.f170339h = null;
                            fVar7.f170340i = null;
                            fVar7.f170341j = null;
                            fVar7.f170342k = null;
                            fVar7.f170343l = null;
                            fVar7.f170344m = null;
                            fVar7.f170345n = null;
                            fVar7.f170346o = null;
                            fVar7.f170347p = null;
                            fVar7.f170348q = null;
                            fVar7.f170349r = null;
                            fVar7.f170350t = i76;
                            fVar7.f170354y = z45;
                            fVar7.f170355z = z46;
                            fVar7.f170351v = i86;
                            fVar7.f170352w = i79 == true ? 1 : 0;
                            fVar7.f170353x = i85;
                            fVar7.C = 15;
                            if (y0Var.b(fVar7) == aVar8) {
                                return aVar8;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 12:
                    int i101 = fVar7.f170353x;
                    int i102 = fVar7.f170352w;
                    int i103 = fVar7.f170351v;
                    boolean z57 = fVar7.f170355z;
                    boolean z58 = fVar7.f170354y;
                    int i104 = fVar7.f170350t;
                    vf2.p pVar4 = fVar7.f170347p;
                    List list11 = fVar7.f170346o;
                    zf2.g gVar21 = fVar7.f170345n;
                    zf2.f fVar10 = fVar7.f170344m;
                    List list12 = fVar7.f170343l;
                    rf2.l lVar8 = fVar7.f170342k;
                    String str23 = fVar7.f170340i;
                    zf2.d dVar19 = fVar7.f170338g;
                    UUID uuid24 = fVar7.f170336e;
                    dt2.g gVar22 = fVar7.f170334c;
                    rs2.c cVar19 = fVar7.f170333b;
                    o13.r.b(obj7);
                    lVar4 = lVar8;
                    obj6 = obj7;
                    i55 = i101;
                    str2 = "LSVSessionStartInteractor";
                    z38 = z58;
                    aVar8 = aVar8;
                    i48 = i102;
                    i59 = i103;
                    i58 = i104;
                    list6 = list11;
                    y0Var2 = y0Var2;
                    list7 = list12;
                    fVar6 = fVar10;
                    dVar6 = dVar19;
                    uuid2 = uuid24;
                    gVar5 = gVar22;
                    cVar10 = cVar19;
                    z37 = z57;
                    pVar2 = pVar4;
                    gVar9 = gVar21;
                    str4 = str23;
                    Iterable iterable17 = (Iterable) obj6;
                    z39 = z37;
                    z44 = z38;
                    arrayList4 = new ArrayList(p13.y.r(iterable17, 10));
                    it6 = iterable17.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(o72.t.k(((rf2.a) it6.next()).f152454a));
                    }
                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder11119 = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                    builderNewBuilder11119.addAllRequestedTypes(arrayList4);
                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder111110 = GDILiveSessionProto.LiveSessionService.newBuilder();
                    builderNewBuilder111110.setMetricConfigurationRequest(builderNewBuilder11119.build());
                    GDISmartProto.Smart.Builder builderNewBuilder111111 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder111111.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder111110.build());
                    smartBuild = builderNewBuilder111111.build();
                    String str117 = "activityStartRequest smart " + smartBuild;
                    zg2.c.f204692a.getClass();
                    str10 = str2;
                    zg2.c.a(str10, str117);
                    smartBuild.getClass();
                    fVar7.f170332a = null;
                    fVar7.f170333b = cVar10;
                    fVar7.f170334c = gVar5;
                    fVar7.f170335d = null;
                    fVar7.f170336e = uuid2;
                    fVar7.f170337f = null;
                    fVar7.f170338g = dVar6;
                    fVar7.f170339h = null;
                    fVar7.f170340i = str4;
                    fVar7.f170341j = null;
                    fVar7.f170342k = lVar4;
                    fVar7.f170343l = list7;
                    fVar7.f170344m = fVar6;
                    fVar7.f170345n = gVar9;
                    fVar7.f170346o = list6;
                    fVar7.f170347p = pVar2;
                    fVar7.f170348q = smartBuild;
                    fVar7.f170350t = i58;
                    z45 = z44;
                    fVar7.f170354y = z45;
                    i58 = i58;
                    fVar7.f170355z = z39;
                    z39 = z39;
                    i66 = i59;
                    fVar7.f170351v = i66;
                    i59 = i66;
                    i67 = i48;
                    fVar7.f170352w = i67;
                    i48 = i67;
                    i68 = i55;
                    fVar7.f170353x = i68;
                    pVar3 = pVar2;
                    fVar7.C = 13;
                    objB4 = gVar5.b(smartBuild, fVar7);
                    aVar8 = aVar8;
                    if (objB4 == aVar8) {
                        return aVar8;
                    }
                    list8 = list6;
                    str8 = str4;
                    i69 = i59;
                    i74 = i48;
                    z46 = z39;
                    gVar10 = gVar9;
                    uuid4 = uuid2;
                    i75 = i68;
                    smart = smartBuild;
                    i76 = i58;
                    smart2 = (GDISmartProto.Smart) objB4;
                    smart.getClass();
                    y0Var2.getClass();
                    gVar5.getClass();
                    lVar5 = lVar4;
                    y0Var = y0Var2;
                    y0Var.f170541b = gVar5;
                    y0Var.f170540a = smart;
                    zg2.c.f204692a.getClass();
                    zg2.c.a(str10, "activityStartRequest response " + smart2);
                    generatedExtension = GDILiveSessionExtension.liveSessionService;
                    if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                        typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                        zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                        if (!typesList.isEmpty()) {
                            dVar7 = dVar6;
                            zf2.a aVar115 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                            i77 = i69;
                            i78 = i74;
                            zf2.h hVar17 = new zf2.h(fVar6, list7);
                            if (dVar7 == zf2.d.f204583b2) {
                                str9 = null;
                            } else {
                                str9 = null;
                            }
                            cVar12 = cVar10;
                            cVar11 = new sf2.f.c(uuid4, cVar12, aVar115, lVar5, pVar3, hVar17, gVar10, false, str9);
                            e2VarA3 = getF170500a();
                            fVar7.f170332a = null;
                            fVar7.f170333b = cVar10;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170337f = null;
                            fVar7.f170338g = null;
                            fVar7.f170339h = null;
                            fVar7.f170340i = null;
                            fVar7.f170341j = null;
                            fVar7.f170342k = null;
                            fVar7.f170343l = null;
                            fVar7.f170344m = null;
                            fVar7.f170345n = null;
                            fVar7.f170346o = null;
                            fVar7.f170347p = null;
                            fVar7.f170348q = null;
                            fVar7.f170349r = null;
                            fVar7.f170350t = i76;
                            fVar7.f170354y = z45;
                            fVar7.f170355z = z46;
                            fVar7.f170351v = i77;
                            fVar7.f170352w = i78;
                            fVar7.f170353x = i75;
                            fVar7.C = 14;
                            if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                return aVar8;
                            }
                            i85 = i75;
                            i86 = i77;
                            i79 = i78;
                            fVar7.f170332a = null;
                            fVar7.f170333b = cVar10;
                            fVar7.f170334c = null;
                            fVar7.f170335d = null;
                            fVar7.f170336e = null;
                            fVar7.f170337f = null;
                            fVar7.f170338g = null;
                            fVar7.f170339h = null;
                            fVar7.f170340i = null;
                            fVar7.f170341j = null;
                            fVar7.f170342k = null;
                            fVar7.f170343l = null;
                            fVar7.f170344m = null;
                            fVar7.f170345n = null;
                            fVar7.f170346o = null;
                            fVar7.f170347p = null;
                            fVar7.f170348q = null;
                            fVar7.f170349r = null;
                            fVar7.f170350t = i76;
                            fVar7.f170354y = z45;
                            fVar7.f170355z = z46;
                            fVar7.f170351v = i86;
                            fVar7.f170352w = i79 == true ? 1 : 0;
                            fVar7.f170353x = i85;
                            fVar7.C = 15;
                            if (y0Var.b(fVar7) == aVar8) {
                                return aVar8;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 13:
                    int i105 = fVar7.f170353x;
                    int i106 = fVar7.f170352w;
                    i86 = fVar7.f170351v;
                    z15 = fVar7.f170355z;
                    z14 = fVar7.f170354y;
                    i15 = fVar7.f170350t;
                    GDISmartProto.Smart smart3 = fVar7.f170348q;
                    vf2.p pVar5 = fVar7.f170347p;
                    List list13 = fVar7.f170346o;
                    gVar10 = fVar7.f170345n;
                    zf2.f fVar11 = fVar7.f170344m;
                    List list14 = fVar7.f170343l;
                    rf2.l lVar9 = fVar7.f170342k;
                    String str24 = fVar7.f170340i;
                    zf2.d dVar20 = fVar7.f170338g;
                    UUID uuid25 = fVar7.f170336e;
                    dt2.g gVar23 = fVar7.f170334c;
                    rs2.c cVar20 = fVar7.f170333b;
                    try {
                        o13.r.b(obj7);
                        str8 = str24;
                        aVar8 = aVar8;
                        i74 = i106;
                        i69 = i86;
                        y0Var2 = y0Var2;
                        list8 = list13;
                        uuid4 = uuid25;
                        i75 = i105;
                        list7 = list14;
                        dVar6 = dVar20;
                        gVar5 = gVar23;
                        smart = smart3;
                        objB4 = obj7;
                        i76 = i15;
                        pVar3 = pVar5;
                        cVar10 = cVar20;
                        z45 = z14;
                        fVar6 = fVar11;
                        z46 = z15;
                        lVar4 = lVar9;
                        smart2 = (GDISmartProto.Smart) objB4;
                        smart.getClass();
                        y0Var2.getClass();
                        gVar5.getClass();
                        lVar5 = lVar4;
                        y0Var = y0Var2;
                        y0Var.f170541b = gVar5;
                        y0Var.f170540a = smart;
                        zg2.c.f204692a.getClass();
                        zg2.c.a(str10, "activityStartRequest response " + smart2);
                        generatedExtension = GDILiveSessionExtension.liveSessionService;
                        if (smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                            typesList = ((GDILiveSessionProto.LiveSessionService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMetricConfigurationResponse().getTypesList();
                            zg2.c.a(str10, "activityStartRequest typeList.size " + typesList.size());
                            if (!typesList.isEmpty()) {
                                dVar7 = dVar6;
                                zf2.a aVar116 = new zf2.a(dVar7, dVar6.f204629a, i69, i74, list8, str8, false, false);
                                i77 = i69;
                                i78 = i74;
                                zf2.h hVar18 = new zf2.h(fVar6, list7);
                                if (dVar7 == zf2.d.f204583b2) {
                                    str9 = null;
                                } else {
                                    str9 = null;
                                }
                                cVar12 = cVar10;
                                cVar11 = new sf2.f.c(uuid4, cVar12, aVar116, lVar5, pVar3, hVar18, gVar10, false, str9);
                                e2VarA3 = getF170500a();
                                fVar7.f170332a = null;
                                fVar7.f170333b = cVar10;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170336e = null;
                                fVar7.f170337f = null;
                                fVar7.f170338g = null;
                                fVar7.f170339h = null;
                                fVar7.f170340i = null;
                                fVar7.f170341j = null;
                                fVar7.f170342k = null;
                                fVar7.f170343l = null;
                                fVar7.f170344m = null;
                                fVar7.f170345n = null;
                                fVar7.f170346o = null;
                                fVar7.f170347p = null;
                                fVar7.f170348q = null;
                                fVar7.f170349r = null;
                                fVar7.f170350t = i76;
                                fVar7.f170354y = z45;
                                fVar7.f170355z = z46;
                                fVar7.f170351v = i77;
                                fVar7.f170352w = i78;
                                fVar7.f170353x = i75;
                                fVar7.C = 14;
                                if (e2VarA3.emit(cVar11, fVar7) == aVar8) {
                                    return aVar8;
                                }
                                i85 = i75;
                                i86 = i77;
                                i79 = i78;
                                fVar7.f170332a = null;
                                fVar7.f170333b = cVar10;
                                fVar7.f170334c = null;
                                fVar7.f170335d = null;
                                fVar7.f170336e = null;
                                fVar7.f170337f = null;
                                fVar7.f170338g = null;
                                fVar7.f170339h = null;
                                fVar7.f170340i = null;
                                fVar7.f170341j = null;
                                fVar7.f170342k = null;
                                fVar7.f170343l = null;
                                fVar7.f170344m = null;
                                fVar7.f170345n = null;
                                fVar7.f170346o = null;
                                fVar7.f170347p = null;
                                fVar7.f170348q = null;
                                fVar7.f170349r = null;
                                fVar7.f170350t = i76;
                                fVar7.f170354y = z45;
                                fVar7.f170355z = z46;
                                fVar7.f170351v = i86;
                                fVar7.f170352w = i79 == true ? 1 : 0;
                                fVar7.f170353x = i85;
                                fVar7.C = 15;
                                if (y0Var.b(fVar7) == aVar8) {
                                    return aVar8;
                                }
                            }
                        }
                    } catch (ProtobufException e34) {
                        e = e34;
                        cVar4 = cVar20;
                        i85 = i105;
                        r14 = i106;
                        protobufException = e;
                        i16 = r14;
                        e2VarA = getF170500a();
                        bVar = new sf2.f.b(null, new sf2.f.b.a.g(protobufException), cVar4, 1, null);
                        fVar7.f170332a = null;
                        fVar7.f170333b = null;
                        fVar7.f170334c = null;
                        fVar7.f170335d = null;
                        fVar7.f170336e = null;
                        fVar7.f170337f = null;
                        fVar7.f170338g = null;
                        fVar7.f170339h = null;
                        fVar7.f170340i = null;
                        fVar7.f170341j = null;
                        fVar7.f170342k = null;
                        fVar7.f170343l = null;
                        fVar7.f170344m = null;
                        fVar7.f170345n = null;
                        fVar7.f170346o = null;
                        fVar7.f170347p = null;
                        fVar7.f170348q = null;
                        fVar7.f170349r = protobufException;
                        fVar7.f170350t = i15;
                        fVar7.f170354y = z14;
                        fVar7.f170355z = z15;
                        fVar7.f170351v = i86;
                        fVar7.f170352w = i16;
                        fVar7.f170353x = i85;
                        fVar7.C = 16;
                        if (e2VarA.emit(bVar, fVar7) == aVar8) {
                            return aVar8;
                        }
                        zg2.c.f204692a.getClass();
                        zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                    }
                    return Unit.INSTANCE;
                case 14:
                    i85 = fVar7.f170353x;
                    int i107 = fVar7.f170352w;
                    i86 = fVar7.f170351v;
                    boolean z59 = fVar7.f170355z;
                    boolean z64 = fVar7.f170354y;
                    int i108 = fVar7.f170350t;
                    rs2.c cVar21 = fVar7.f170333b;
                    o13.r.b(obj7);
                    aVar8 = aVar8;
                    cVar10 = cVar21;
                    i76 = i108;
                    z45 = z64;
                    z46 = z59;
                    y0Var = y0Var2;
                    i79 = i107;
                    fVar7.f170332a = null;
                    fVar7.f170333b = cVar10;
                    fVar7.f170334c = null;
                    fVar7.f170335d = null;
                    fVar7.f170336e = null;
                    fVar7.f170337f = null;
                    fVar7.f170338g = null;
                    fVar7.f170339h = null;
                    fVar7.f170340i = null;
                    fVar7.f170341j = null;
                    fVar7.f170342k = null;
                    fVar7.f170343l = null;
                    fVar7.f170344m = null;
                    fVar7.f170345n = null;
                    fVar7.f170346o = null;
                    fVar7.f170347p = null;
                    fVar7.f170348q = null;
                    fVar7.f170349r = null;
                    fVar7.f170350t = i76;
                    fVar7.f170354y = z45;
                    fVar7.f170355z = z46;
                    fVar7.f170351v = i86;
                    fVar7.f170352w = i79 == true ? 1 : 0;
                    fVar7.f170353x = i85;
                    fVar7.C = 15;
                    if (y0Var.b(fVar7) == aVar8) {
                        return aVar8;
                    }
                    return Unit.INSTANCE;
                case 15:
                    int i109 = fVar7.f170353x;
                    int i110 = fVar7.f170352w;
                    int i111 = fVar7.f170351v;
                    boolean z65 = fVar7.f170355z;
                    boolean z66 = fVar7.f170354y;
                    int i112 = fVar7.f170350t;
                    rs2.c cVar22 = fVar7.f170333b;
                    o13.r.b(obj7);
                    return Unit.INSTANCE;
                case 16:
                    protobufException = fVar7.f170349r;
                    o13.r.b(obj7);
                    zg2.c.f204692a.getClass();
                    zg2.c.b(str10, "metricConfigurationRequest error - " + protobufException);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (ProtobufException e35) {
            e = e35;
            cVar4 = cVar3;
            r14 = tVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (e(r0, r8, r9, r10, r11, r12, r13, r14, r15) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j8, zf2.d dVar, boolean z14, boolean z15, boolean z16, zf2.i iVar, String str, yf2.a aVar, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f170369k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f170369k = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        g gVar2 = gVar;
        Object objG = gVar2.f170367i;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar2.f170369k;
        if (i15 == 0) {
            o13.r.b(objG);
            fg2.c cVar2 = (fg2.c) this.f170320i.getValue();
            gVar2.f170360b = dVar;
            gVar2.f170361c = iVar;
            gVar2.f170362d = str;
            gVar2.f170363e = aVar;
            gVar2.f170359a = j8;
            gVar2.f170364f = z14;
            gVar2.f170365g = z15;
            gVar2.f170366h = z16;
            gVar2.f170369k = 1;
            objG = cVar2.g(j8, gVar2);
            if (objG != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            z16 = gVar2.f170366h;
            z15 = gVar2.f170365g;
            z14 = gVar2.f170364f;
            j8 = gVar2.f170359a;
            aVar = gVar2.f170363e;
            str = gVar2.f170362d;
            iVar = gVar2.f170361c;
            dVar = gVar2.f170360b;
            o13.r.b(objG);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        return Unit.INSTANCE;
        rs2.c cVar3 = (rs2.c) objG;
        if (cVar3 == null) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LSVSessionStartInteractor", "Missing device info for device " + j8);
            vb.h.z(org.apache.commons.lang3.e.e(j8, "Unable to initialize manual start for device="));
            return null;
        }
        gVar2.f170360b = null;
        gVar2.f170361c = null;
        gVar2.f170362d = null;
        gVar2.f170363e = null;
        gVar2.f170359a = j8;
        gVar2.f170364f = z14;
        gVar2.f170365g = z15;
        gVar2.f170366h = z16;
        gVar2.f170369k = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0142, code lost:
    
        if (r13.emit(r1, r3) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0195, code lost:
    
        if (r13.emit(r12, r3) == r4) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rs2.c cVar, zf2.d dVar, boolean z14, boolean z15, boolean z16, zf2.i iVar, String str, yf2.a aVar, v13.c cVar2) {
        h hVar;
        int i14;
        String str2;
        String strD;
        UUID uuidRandomUUID;
        rs2.c cVar3;
        String str3;
        boolean z17;
        boolean z18;
        int i15;
        zf2.i iVar2;
        Object obj;
        yf2.a aVar2;
        zf2.d dVar2;
        boolean z19;
        if (cVar2 instanceof h) {
            hVar = (h) cVar2;
            int i16 = hVar.f170388p;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                hVar.f170388p = i16 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar2);
            }
        } else {
            hVar = new h(this, cVar2);
        }
        Object obj2 = hVar.f170386n;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = hVar.f170388p;
        if (i17 == 0) {
            o13.r.b(obj2);
            int i18 = dVar.f204633e;
            i14 = dVar.f204634f;
            str2 = dVar.f204629a;
            strD = ((tf2.g) this.f170317f.getValue()).d(dVar);
            uuidRandomUUID = UUID.randomUUID();
            fg2.c cVar4 = (fg2.c) this.f170320i.getValue();
            long f172494b = cVar.getF92746j();
            cVar3 = cVar;
            hVar.f170373a = cVar3;
            hVar.f170374b = dVar;
            hVar.f170375c = iVar;
            str3 = str;
            hVar.f170376d = str3;
            hVar.f170377e = aVar;
            hVar.f170378f = str2;
            hVar.f170379g = strD;
            hVar.f170380h = uuidRandomUUID;
            hVar.f170381i = z14;
            hVar.f170382j = z15;
            hVar.f170383k = z16;
            hVar.f170384l = i18;
            hVar.f170385m = i14;
            hVar.f170388p = 1;
            Object objD = cVar4.d(f172494b, hVar);
            if (objD != aVar3) {
                z17 = z14;
                z18 = z15;
                i15 = i18;
                iVar2 = iVar;
                obj = objD;
                aVar2 = aVar;
                dVar2 = dVar;
                z19 = z16;
            }
            return aVar3;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                o13.r.b(obj2);
                return Unit.INSTANCE;
            }
            if (i17 == 3) {
                o13.r.b(obj2);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i19 = hVar.f170385m;
        int i24 = hVar.f170384l;
        z19 = hVar.f170383k;
        z18 = hVar.f170382j;
        boolean z24 = hVar.f170381i;
        uuidRandomUUID = hVar.f170380h;
        strD = hVar.f170379g;
        str2 = hVar.f170378f;
        aVar2 = hVar.f170377e;
        str3 = hVar.f170376d;
        iVar2 = hVar.f170375c;
        zf2.d dVar3 = hVar.f170374b;
        rs2.c cVar5 = hVar.f170373a;
        o13.r.b(obj2);
        cVar3 = cVar5;
        dVar2 = dVar3;
        z17 = z24;
        i15 = i24;
        obj = obj2;
        i14 = i19;
        String str4 = strD;
        String str5 = str2;
        if (!((Boolean) obj).booleanValue()) {
            zg2.c.f204692a.getClass();
            zg2.c.d("LSVSessionStartInteractor", "User doesn't have access to Live Activity.");
            return Unit.INSTANCE;
        }
        zf2.d dVar4 = zf2.d.f204593g2;
        e2 e2Var = this.f170500a;
        if (dVar2 == dVar4) {
            zg2.c cVar6 = zg2.c.f204692a;
            String strG = am.j.g(i15, i14, "Unsupported activity type (sportType: ", ", subSportType: ", ")");
            cVar6.getClass();
            zg2.c.d("LSVSessionStartInteractor", strG);
            uuidRandomUUID.getClass();
            int i25 = i15;
            sf2.f.d dVar5 = new sf2.f.d(uuidRandomUUID, new zf2.a(dVar4, str5, i25, i14, p13.j0.f134944a, str4, z17, false));
            hVar.f170373a = null;
            hVar.f170374b = null;
            hVar.f170375c = null;
            hVar.f170376d = null;
            hVar.f170377e = null;
            hVar.f170378f = null;
            hVar.f170379g = null;
            hVar.f170380h = null;
            hVar.f170381i = z17;
            hVar.f170382j = z18;
            hVar.f170383k = z19;
            hVar.f170384l = i25;
            hVar.f170385m = i14;
            hVar.f170388p = 2;
        } else {
            int i26 = i15;
            uuidRandomUUID.getClass();
            rs2.c cVar7 = cVar3;
            UUID uuid = uuidRandomUUID;
            yf2.a aVar4 = aVar2;
            String str6 = str3;
            sf2.f.a aVar5 = new sf2.f.a(uuid, cVar7, new zf2.a(dVar2, str5, i26, i14, p13.j0.f134944a, str4, z17, z19), iVar2, str6, aVar4, z18);
            hVar.f170373a = null;
            hVar.f170374b = null;
            hVar.f170375c = null;
            hVar.f170376d = null;
            hVar.f170377e = null;
            hVar.f170378f = null;
            hVar.f170379g = null;
            hVar.f170380h = null;
            hVar.f170381i = z17;
            hVar.f170382j = z18;
            hVar.f170383k = z19;
            hVar.f170384l = i26;
            hVar.f170385m = i14;
            hVar.f170388p = 3;
        }
        return aVar3;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luf2/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
