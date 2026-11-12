package v71;

import a81.q;
import a81.t;
import a81.u;
import a81.v;
import am.x0;
import am.y0;
import b63.o;
import c22.c3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import g81.m0;
import g81.n0;
import g81.o0;
import g81.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o13.p;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv71/h;", "Ly82/b;", "Lb63/o;", "Lg81/c;", "Ll22/b;", "stringResolver", "Lv71/a;", "enduranceScoreRepo", "Lv71/k;", "staminaRepo", "Lr71/a;", "delegate", "", "hasStaminaCurveCapability", "<init>", "(Ll22/b;Lv71/a;Lv71/k;Lr71/a;Z)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements y82.b<o, g81.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f176146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f176147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f176148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r71.a f176149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f176150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f176151f;

    public h(l22.b bVar, a aVar, k kVar, r71.a aVar2, boolean z14) {
        bVar.getClass();
        aVar.getClass();
        kVar.getClass();
        aVar2.getClass();
        this.f176146a = bVar;
        this.f176147b = aVar;
        this.f176148c = kVar;
        this.f176149d = aVar2;
        this.f176150e = z14;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x043e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0448  */
    /* JADX WARN: Code duplicated, block: B:166:0x045c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0466  */
    /* JADX WARN: Code duplicated, block: B:171:0x046b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0473  */
    /* JADX WARN: Code duplicated, block: B:175:0x047b  */
    /* JADX WARN: Code duplicated, block: B:178:0x048a  */
    /* JADX WARN: Code duplicated, block: B:184:0x04af  */
    /* JADX WARN: Code duplicated, block: B:186:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:187:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:190:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:192:0x0502  */
    /* JADX WARN: Code duplicated, block: B:194:0x0510  */
    /* JADX WARN: Code duplicated, block: B:195:0x0512  */
    /* JADX WARN: Code duplicated, block: B:198:0x0577  */
    /* JADX WARN: Code duplicated, block: B:204:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:205:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:209:0x05ec A[LOOP:2: B:207:0x05e6->B:209:0x05ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0640  */
    /* JADX WARN: Code duplicated, block: B:213:0x0643  */
    /* JADX WARN: Code duplicated, block: B:217:0x0669  */
    /* JADX WARN: Code duplicated, block: B:219:0x0671  */
    /* JADX WARN: Code duplicated, block: B:220:0x0677  */
    /* JADX WARN: Code duplicated, block: B:223:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:225:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:227:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:228:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:234:0x0769  */
    /* JADX WARN: Code duplicated, block: B:235:0x076d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0787  */
    /* JADX WARN: Code duplicated, block: B:239:0x078a  */
    /* JADX WARN: Code duplicated, block: B:243:0x07bd A[LOOP:4: B:241:0x07b7->B:243:0x07bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x0808  */
    /* JADX WARN: Code duplicated, block: B:249:0x0817  */
    /* JADX WARN: Code duplicated, block: B:250:0x081b  */
    /* JADX WARN: Code duplicated, block: B:254:0x083b  */
    /* JADX WARN: Code duplicated, block: B:256:0x0849  */
    /* JADX WARN: Code duplicated, block: B:259:0x0858  */
    /* JADX WARN: Code duplicated, block: B:265:0x086e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0878  */
    /* JADX WARN: Code duplicated, block: B:268:0x0882  */
    /* JADX WARN: Code duplicated, block: B:271:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:273:0x08af  */
    /* JADX WARN: Code duplicated, block: B:275:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:276:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:279:0x0926  */
    /* JADX WARN: Code duplicated, block: B:286:0x09bb A[LOOP:7: B:284:0x09b5->B:286:0x09bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:290:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:292:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:293:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:296:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:298:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:307:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:308:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:311:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:312:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:316:0x0b59 A[LOOP:9: B:314:0x0b53->B:316:0x0b59, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:323:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:324:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:327:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0588 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0578 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x074b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:340:0x0865 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0939 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0927 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0ac3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01be  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c3  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r4 == r3) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29, types: [g81.f] */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [g81.n0] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55, types: [g81.n0] */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r4v10, types: [b63.o, o13.p] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [g81.n0] */
    /* JADX WARN: Type inference failed for: r4v29 */
    @Override // y82.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o oVar, v13.c cVar) throws Throwable {
        g gVar;
        o oVar2;
        p pVar;
        Object objA;
        Object objJ3;
        o oVar3;
        v2 v2Var;
        l22.b bVar;
        boolean z14;
        Throwable th3;
        l22.b bVar2;
        g81.p pVar2;
        v2 v2Var2;
        Object objM4;
        g81.p pVar3;
        n61.c cVar2;
        g81.p pVar4;
        Object next;
        int iIntValue;
        ?? arrayList;
        boolean z15;
        Object obj;
        Object objJ;
        Set set;
        Set linkedHashSet;
        Set set2;
        Integer activityTypeId;
        Integer group;
        sd2.f fVarI;
        List list;
        String str;
        List list2;
        l22.b bVar3;
        String str2;
        Throwable th4;
        int i14;
        g81.f fVar;
        g81.p pVar5;
        ?? fVar2;
        i53.f fVarA;
        Iterator it;
        Object next2;
        n61.i iVar;
        String str3;
        int i15;
        int i16;
        ?? n0Var;
        ?? n0Var2;
        List<Float> list3;
        List<Float> list4;
        boolean z16;
        ArrayList arrayList2;
        Iterator it3;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList3;
        Iterator it4;
        Object next3;
        int i24;
        zp1.a aVar;
        int i25;
        List<Float> list5;
        List<Float> list6;
        ArrayList arrayList4;
        Iterator it5;
        int i26;
        ArrayList arrayList5;
        Iterator it6;
        Object next4;
        int i27;
        zp1.a aVar2;
        int i28;
        String str4;
        String strE1;
        Iterator it7;
        Object next5;
        n61.i iVar2;
        int i29;
        int i30;
        int i34;
        n0 n0Var3;
        ?? n0Var4;
        List<Float> list7;
        boolean z17;
        ArrayList arrayList6;
        int i35;
        int i36;
        int i37;
        ArrayList arrayList7;
        Iterator it8;
        int i38;
        int i39;
        zp1.a aVar3;
        int i44;
        List<Float> list8;
        List<Float> list9;
        boolean z18;
        ArrayList arrayList8;
        int i45;
        int i46;
        ArrayList arrayList9;
        Iterator it9;
        int i47;
        int i48;
        zp1.a aVar4;
        int i49;
        String strE2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i54 = gVar.f176145f;
            if ((i54 & Integer.MIN_VALUE) != 0) {
                gVar.f176145f = i54 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj2 = gVar.f176143d;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        int i55 = gVar.f176145f;
        boolean z19 = this.f176150e;
        l22.b bVar4 = this.f176146a;
        Throwable th5 = null;
        if (i55 == 0) {
            r.b(obj2);
            if (this.f176151f == null) {
                oVar2 = oVar;
                gVar.f176140a = oVar2;
                gVar.f176145f = 1;
                objA = this.f176149d.a(gVar);
            } else {
                oVar2 = oVar;
                pVar = null;
                gVar.f176140a = oVar2;
                gVar.f176141b = pVar;
                gVar.f176145f = 2;
                objJ3 = this.f176147b.J3(oVar2, gVar);
                if (objJ3 != aVar5) {
                    oVar3 = oVar2;
                    obj2 = objJ3;
                    v2Var = (v2) obj2;
                    if (pVar != null) {
                        rd2.j jVar = rd2.f.a().f152045a;
                        bVar = bVar4;
                        long jLongValue = ((Number) pVar.f128594a).longValue();
                        jVar.getClass();
                        fVarI = rd2.j.i(jLongValue, null);
                        if (fVarI != null) {
                            this.f176151f = (String) pVar.f128595b;
                        }
                    } else {
                        bVar = bVar4;
                    }
                    if (v2Var instanceof v2.b) {
                        z14 = z19;
                        th3 = null;
                        bVar2 = bVar;
                        pVar2 = null;
                    } else {
                        z14 = z19;
                        th3 = null;
                        bVar2 = bVar;
                        pVar2 = null;
                    }
                    if (z14) {
                        ?? r14 = th3;
                        gVar.f176140a = r14;
                        gVar.f176141b = r14;
                        gVar.f176142c = pVar2;
                        gVar.f176145f = 3;
                        objM4 = this.f176148c.m4(oVar3, gVar);
                        if (objM4 != aVar5) {
                            pVar3 = pVar2;
                            obj2 = objM4;
                            v2Var2 = (v2) obj2;
                            pVar2 = pVar3;
                        }
                    } else {
                        v2Var2 = null;
                    }
                    if (v2Var2 instanceof v2.b) {
                        list = (List) ((v2.b) v2Var2).f47386a;
                    } else {
                        list = null;
                    }
                    str = "";
                    if (list != null) {
                        v.f1974a.getClass();
                        it7 = list.iterator();
                        do {
                            if (it7.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it7.next();
                        } while (((n61.i) next5).f123869d != 1);
                        iVar2 = (n61.i) next5;
                        i29 = R.string.lbl_minute_per_mile;
                        if (iVar2 != null) {
                            list8 = iVar2.f123872g;
                            list9 = iVar2.f123876k;
                            if (zf.b.Q(iVar2)) {
                                z18 = am.j.z(f12.l.f68084a);
                                List listN0 = h0.N0(h0.b1(zp1.a.f206594h), new u());
                                arrayList8 = new ArrayList(y.r(listN0, 10));
                                i45 = 0;
                                for (Object obj3 : listN0) {
                                    i48 = i45 + 1;
                                    if (i45 >= 0) {
                                        x.q();
                                        throw null;
                                    }
                                    aVar4 = (zp1.a) obj3;
                                    int i56 = i45 * 2;
                                    int i57 = i56 + 1;
                                    if (aVar4.f206595a != zp1.a.MAXIMUM.f206595a) {
                                        i49 = 1;
                                    } else {
                                        i49 = 0;
                                    }
                                    float fFloatValue = list8.get(i57).floatValue();
                                    l3.a aVar6 = l3.f23124b;
                                    int i58 = i49;
                                    List<Float> list10 = list8;
                                    List list11 = list;
                                    double dFloatValue = list9.get(i56 + 2).floatValue();
                                    aVar6.getClass();
                                    int iP = l3.a.p(dFloatValue, z18);
                                    int iP2 = l3.a.p(list9.get(i56).floatValue(), z18);
                                    int i59 = aVar4.f206597c;
                                    String string = bVar2.getString(aVar4.f206596b);
                                    String strA = bVar2.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP, iP2) + i58), l3.a.w0(Math.max(iP, iP2)));
                                    strE2 = l3.a.e1((long) fFloatValue);
                                    if (strE2 == null) {
                                        strE2 = "";
                                    }
                                    arrayList8.add(new m0(i59, string, strA, strE2));
                                    i45 = i48;
                                    list = list11;
                                    list8 = list10;
                                }
                                List<Float> list12 = list8;
                                list2 = list;
                                th4 = null;
                                i53.f fVarJ = i53.a.j(h0.G0(arrayList8));
                                a81.f fVar3 = a81.f.f1960a;
                                String strA2 = bVar2.a(R.string.string_space_string_bracket_pattern, bVar2.getString(R.string.lbl_time), bVar2.getString(R.string.lbl_hours_minutes_seconds_abbreviated));
                                String string2 = bVar2.getString(R.string.lbl_stamina_pace_range);
                                if (z18) {
                                    i46 = R.string.lbl_pace_unit_km;
                                } else {
                                    i46 = R.string.lbl_pace_unit_mi;
                                }
                                String string3 = bVar2.getString(i46);
                                List<Float> list13 = iVar2.f123874i;
                                List<Float> list14 = iVar2.f123876k;
                                List<Float> list15 = iVar2.f123875j;
                                int iA = v.a(list12);
                                w13.c cVar3 = zp1.a.f206594h;
                                arrayList9 = new ArrayList(y.r(cVar3, 10));
                                it9 = cVar3.iterator();
                                while (it9.hasNext()) {
                                    arrayList9.add(Integer.valueOf(((zp1.a) it9.next()).f206597c));
                                }
                                a03.h hVar = new a03.h(27);
                                a81.j jVar2 = new a81.j(z18, 3);
                                fVar3.getClass();
                                i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                                i34 = R.string.lbl_stamina_pace_range;
                                bVar3 = bVar2;
                                g81.e eVarC = a81.f.c(bVar3, strA2, string2, string3, false, list13, list14, list15, list12, arrayList9, iA, hVar, jVar2, null);
                                c22.i iVarB = c22.i.b(R.string.lbl_pace);
                                c22.i iVarB2 = c22.i.b(R.string.lbl_zone);
                                c22.i iVarB3 = c22.i.b(R.string.lbl_stamina_pace_range);
                                if (z18) {
                                    i47 = R.string.lbl_minute_per_km;
                                } else {
                                    i47 = R.string.lbl_minute_per_mile;
                                }
                                n0Var3 = new n0(iVarB, null, new o0(iVarB2, iVarB3, c22.i.b(i47), c22.i.b(R.string.lbl_time), c22.i.b(R.string.lbl_hours_minutes_seconds_abbreviated), fVarJ), eVarC, 2, null);
                            } else {
                                list2 = list;
                                bVar3 = bVar2;
                                i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                                th4 = null;
                                i34 = R.string.lbl_stamina_pace_range;
                                n0Var3 = null;
                            }
                        } else {
                            list2 = list;
                            bVar3 = bVar2;
                            i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                            th4 = null;
                            i34 = R.string.lbl_stamina_pace_range;
                            n0Var3 = null;
                        }
                        if (iVar2 != 0) {
                            list7 = iVar2.f123876k;
                            if (zf.b.M(iVar2)) {
                                z17 = am.j.z(f12.l.f68084a);
                                List listN1 = h0.N0(h0.b1(zp1.a.f206594h), new t());
                                arrayList6 = new ArrayList(y.r(listN1, 10));
                                i35 = 0;
                                for (Object obj4 : listN1) {
                                    i39 = i35 + 1;
                                    if (i35 >= 0) {
                                        x.q();
                                        throw th4;
                                    }
                                    aVar3 = (zp1.a) obj4;
                                    int i64 = i35 * 2;
                                    int i65 = i64 + 1;
                                    int i66 = i30;
                                    if (aVar3.f206595a != zp1.a.MAXIMUM.f206595a) {
                                        i44 = 1;
                                    } else {
                                        i44 = 0;
                                    }
                                    double dFloatValue2 = iVar2.b().get(i65).floatValue();
                                    l3.a aVar7 = l3.f23124b;
                                    l22.b bVar5 = bVar3;
                                    double dFloatValue3 = list7.get(i64 + 2).floatValue();
                                    aVar7.getClass();
                                    int iP3 = l3.a.p(dFloatValue3, z17);
                                    int iP4 = l3.a.p(list7.get(i64).floatValue(), z17);
                                    int i67 = aVar3.f206597c;
                                    String string4 = bVar5.getString(aVar3.f206596b);
                                    String strA3 = bVar5.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP3, iP4) + i44), l3.a.w0(Math.max(iP3, iP4)));
                                    ArrayList arrayList10 = arrayList6;
                                    arrayList10.add(new m0(i67, string4, strA3, l3.a.S(bVar5, dFloatValue2, l3.f23125c, false, z17)));
                                    arrayList6 = arrayList10;
                                    bVar3 = bVar5;
                                    i35 = i39;
                                    i30 = i66;
                                    str = str;
                                }
                                i14 = i30;
                                str2 = str;
                                l22.b bVar6 = bVar3;
                                i53.f fVarJ2 = i53.a.j(h0.G0(arrayList6));
                                a81.f fVar4 = a81.f.f1960a;
                                String string5 = bVar6.getString(R.string.lbl_distance);
                                if (z17) {
                                    i36 = R.string.lbl_km;
                                } else {
                                    i36 = R.string.lbl_mile;
                                }
                                String strA4 = bVar6.a(R.string.string_space_string_bracket_pattern, string5, bVar6.getString(i36));
                                int i68 = i34;
                                String string6 = bVar6.getString(i68);
                                if (z17) {
                                    i37 = R.string.lbl_pace_unit_km;
                                } else {
                                    i37 = R.string.lbl_pace_unit_mi;
                                }
                                String string7 = bVar6.getString(i37);
                                List<Float> list16 = iVar2.f123874i;
                                List<Float> list17 = iVar2.f123876k;
                                List<Float> list18 = iVar2.f123875j;
                                List<Float> listB = iVar2.b();
                                int iA2 = v.a(iVar2.b());
                                w13.c cVar4 = zp1.a.f206594h;
                                arrayList7 = new ArrayList(y.r(cVar4, 10));
                                it8 = cVar4.iterator();
                                while (it8.hasNext()) {
                                    arrayList7.add(Integer.valueOf(((zp1.a) it8.next()).f206597c));
                                }
                                a81.j jVar3 = new a81.j(z17, 4);
                                a81.j jVar4 = new a81.j(z17, 5);
                                a81.k kVar = new a81.k(bVar6, z17, 2);
                                fVar4.getClass();
                                bVar3 = bVar6;
                                g81.e eVarC2 = a81.f.c(bVar3, strA4, string6, string7, false, list16, list17, list18, listB, arrayList7, iA2, jVar3, jVar4, kVar);
                                c22.i iVarB4 = c22.i.b(R.string.lbl_pace);
                                c22.i iVarB5 = c22.i.b(R.string.lbl_zone);
                                c22.i iVarB6 = c22.i.b(i68);
                                if (z17) {
                                    i29 = R.string.lbl_minute_per_km;
                                }
                                c22.i iVarB7 = c22.i.b(i29);
                                c22.i iVarB8 = c22.i.b(R.string.lbl_distance);
                                if (z17) {
                                    i38 = R.string.lbl_km;
                                } else {
                                    i38 = R.string.lbl_mile;
                                }
                                n0Var4 = new n0(iVarB4, null, new o0(iVarB5, iVarB6, iVarB7, iVarB8, c22.i.b(i38), fVarJ2), eVarC2, 2, null);
                            } else {
                                i14 = i30;
                                str2 = "";
                                n0Var4 = th4;
                            }
                        } else {
                            i14 = i30;
                            str2 = "";
                            n0Var4 = th4;
                        }
                        new g81.f(n0Var3, n0Var4);
                    } else {
                        list2 = list;
                        bVar3 = bVar2;
                        str2 = "";
                        th4 = null;
                        i14 = R.string.lbl_hours_minutes_seconds_abbreviated;
                        fVar = null;
                    }
                    if (list2 != null) {
                        v.f1974a.getClass();
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next2 = th4;
                                break;
                            }
                            next2 = it.next();
                        } while (((n61.i) next2).f123869d != 2);
                        iVar = (n61.i) next2;
                        if (iVar != null) {
                            list5 = iVar.f123872g;
                            list6 = iVar.f123876k;
                            if (zf.b.Q(iVar)) {
                                List listN2 = h0.N0(h0.b1(zp1.a.f206594h), new q());
                                arrayList4 = new ArrayList(y.r(listN2, 10));
                                it5 = listN2.iterator();
                                i26 = 0;
                                while (it5.hasNext()) {
                                    next4 = it5.next();
                                    i27 = i26 + 1;
                                    if (i26 >= 0) {
                                        x.q();
                                        throw th4;
                                    }
                                    aVar2 = (zp1.a) next4;
                                    int i69 = i26 * 2;
                                    int i74 = i69 + 1;
                                    if (aVar2.f206595a != zp1.a.MAXIMUM.f206595a) {
                                        i28 = 1;
                                    } else {
                                        i28 = 0;
                                    }
                                    float fFloatValue2 = list5.get(i74).floatValue();
                                    List<Float> list19 = list5;
                                    double dFloatValue4 = ((double) list6.get(i69 + 2).floatValue()) - ((double) i28);
                                    float fFloatValue3 = list6.get(i69).floatValue();
                                    List<Float> list20 = list6;
                                    Iterator it10 = it5;
                                    int i75 = aVar2.f206597c;
                                    String string8 = bVar3.getString(aVar2.f206596b);
                                    l3.f23124b.getClass();
                                    str4 = str2;
                                    String strA5 = bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, fFloatValue3, false, str4), l3.a.E0(bVar3, dFloatValue4, false, str4));
                                    strE1 = l3.a.e1((long) fFloatValue2);
                                    if (strE1 == null) {
                                        strE1 = str4;
                                    }
                                    arrayList4.add(new m0(i75, string8, strA5, strE1));
                                    str2 = str4;
                                    list6 = list20;
                                    list5 = list19;
                                    it5 = it10;
                                    i26 = i27;
                                }
                                List<Float> list21 = list5;
                                String str5 = str2;
                                i15 = R.string.common_watts;
                                i16 = R.string.activity_details_power;
                                i53.f fVarJ3 = i53.a.j(h0.G0(arrayList4));
                                c22.i iVarB9 = c22.i.b(R.string.activity_details_power);
                                o0 o0Var = new o0(c22.i.b(R.string.lbl_zone), c22.i.b(R.string.lbl_stamina_power_range), c22.i.b(R.string.common_watts), c22.i.b(R.string.lbl_time), c22.i.b(i14), fVarJ3);
                                a81.f fVar5 = a81.f.f1960a;
                                String strA6 = bVar3.a(R.string.string_space_string_bracket_pattern, bVar3.getString(R.string.lbl_time), bVar3.getString(i14));
                                String string9 = bVar3.getString(R.string.lbl_stamina_power_range);
                                String string10 = bVar3.getString(R.string.lbl_watts);
                                List<Float> list22 = iVar.f123874i;
                                List<Float> list23 = iVar.f123876k;
                                List<Float> list24 = iVar.f123875j;
                                int iA3 = v.a(list21);
                                w13.c cVar5 = zp1.a.f206594h;
                                arrayList5 = new ArrayList(y.r(cVar5, 10));
                                it6 = cVar5.iterator();
                                while (it6.hasNext()) {
                                    arrayList5.add(Integer.valueOf(((zp1.a) it6.next()).f206597c));
                                }
                                a03.h hVar2 = new a03.h(29);
                                a81.h hVar3 = new a81.h(bVar3, 3);
                                fVar5.getClass();
                                str3 = str5;
                                n0Var = new n0(iVarB9, null, o0Var, a81.f.c(bVar3, strA6, string9, string10, true, list22, list23, list24, list21, arrayList5, iA3, hVar2, hVar3, null), 2, null);
                            } else {
                                str3 = str2;
                                i15 = R.string.common_watts;
                                i16 = R.string.activity_details_power;
                                n0Var = th4;
                            }
                        } else {
                            str3 = str2;
                            i15 = R.string.common_watts;
                            i16 = R.string.activity_details_power;
                            n0Var = th4;
                        }
                        if (iVar != null) {
                            list3 = iVar.f123873h;
                            list4 = iVar.f123876k;
                            if (zf.b.m(iVar)) {
                                z16 = am.j.z(f12.l.f68084a);
                                List listN3 = h0.N0(h0.b1(zp1.a.f206594h), new a81.p());
                                arrayList2 = new ArrayList(y.r(listN3, 10));
                                it3 = listN3.iterator();
                                i17 = 0;
                                while (it3.hasNext()) {
                                    next3 = it3.next();
                                    i24 = i17 + 1;
                                    if (i17 >= 0) {
                                        x.q();
                                        throw th4;
                                    }
                                    aVar = (zp1.a) next3;
                                    int i76 = i17 * 2;
                                    int i77 = i76 + 1;
                                    Iterator it11 = it3;
                                    if (aVar.f206595a != zp1.a.MAXIMUM.f206595a) {
                                        i25 = 1;
                                    } else {
                                        i25 = 0;
                                    }
                                    double dFloatValue5 = list3.get(i77).floatValue();
                                    List<Float> list25 = list3;
                                    double dFloatValue6 = ((double) list4.get(i76 + 2).floatValue()) - ((double) i25);
                                    double dFloatValue7 = list4.get(i76).floatValue();
                                    int i78 = aVar.f206597c;
                                    String string11 = bVar3.getString(aVar.f206596b);
                                    l3.f23124b.getClass();
                                    arrayList2.add(new m0(i78, string11, bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, dFloatValue7, false, str3), l3.a.E0(bVar3, dFloatValue6, false, str3)), l3.a.S(bVar3, dFloatValue5, l3.f23125c, false, z16)));
                                    i17 = i24;
                                    it3 = it11;
                                    list3 = list25;
                                    list4 = list4;
                                    pVar2 = pVar2;
                                }
                                pVar5 = pVar2;
                                List<Float> list26 = list3;
                                i53.f fVarJ4 = i53.a.j(h0.G0(arrayList2));
                                c22.i iVarB10 = c22.i.b(i16);
                                c22.i iVarB11 = c22.i.b(R.string.lbl_stamina_distance_estimate_disclaimer);
                                c22.i iVarB12 = c22.i.b(R.string.lbl_zone);
                                c22.i iVarB13 = c22.i.b(R.string.lbl_stamina_power_range);
                                c22.i iVarB14 = c22.i.b(i15);
                                c22.i iVarB15 = c22.i.b(R.string.lbl_distance);
                                if (z16) {
                                    i18 = R.string.lbl_km;
                                } else {
                                    i18 = R.string.lbl_mile;
                                }
                                o0 o0Var2 = new o0(iVarB12, iVarB13, iVarB14, iVarB15, c22.i.b(i18), fVarJ4);
                                a81.f fVar6 = a81.f.f1960a;
                                String string12 = bVar3.getString(R.string.lbl_distance);
                                if (z16) {
                                    i19 = R.string.lbl_km;
                                } else {
                                    i19 = R.string.lbl_mile;
                                }
                                String strA7 = bVar3.a(R.string.string_space_string_bracket_pattern, string12, bVar3.getString(i19));
                                String string13 = bVar3.getString(R.string.lbl_stamina_power_range);
                                String string14 = bVar3.getString(R.string.lbl_watts);
                                List<Float> list27 = iVar.f123874i;
                                List<Float> list28 = iVar.f123876k;
                                List<Float> list29 = iVar.f123875j;
                                int iA4 = v.a(list26);
                                w13.c cVar6 = zp1.a.f206594h;
                                arrayList3 = new ArrayList(y.r(cVar6, 10));
                                it4 = cVar6.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(Integer.valueOf(((zp1.a) it4.next()).f206597c));
                                }
                                a81.j jVar5 = new a81.j(z16, 1);
                                a81.h hVar4 = new a81.h(bVar3, 1);
                                fVar6.getClass();
                                n0Var2 = new n0(iVarB10, iVarB11, o0Var2, a81.f.c(bVar3, strA7, string13, string14, true, list27, list28, list29, list26, arrayList3, iA4, jVar5, hVar4, null));
                            } else {
                                pVar5 = pVar2;
                                n0Var2 = th4;
                            }
                        } else {
                            pVar5 = pVar2;
                            n0Var2 = th4;
                        }
                        fVar2 = new g81.f(n0Var, n0Var2);
                    } else {
                        pVar5 = pVar2;
                        fVar2 = th4;
                    }
                    if (z14) {
                        fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors), c22.i.b(R.string.lbl_running_stamina), c22.i.b(R.string.lbl_cycling_stamina));
                    } else {
                        fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors));
                    }
                    return new g81.c(pVar5, fVar, fVar2, fVarA);
                }
            }
            return aVar5;
        }
        if (i55 == 1) {
            o oVar4 = gVar.f176140a;
            r.b(obj2);
            objA = obj2;
            oVar2 = oVar4;
        } else {
            if (i55 == 2) {
                pVar = gVar.f176141b;
                oVar3 = gVar.f176140a;
                r.b(obj2);
                v2Var = (v2) obj2;
                if (pVar != null) {
                    rd2.j jVar6 = rd2.f.a().f152045a;
                    bVar = bVar4;
                    long jLongValue2 = ((Number) pVar.f128594a).longValue();
                    jVar6.getClass();
                    fVarI = rd2.j.i(jLongValue2, null);
                    if (fVarI != null && fVarI.O0()) {
                        this.f176151f = (String) pVar.f128595b;
                    }
                } else {
                    bVar = bVar4;
                }
                if ((v2Var instanceof v2.b) || (cVar2 = (n61.c) ((v2.b) v2Var).f47386a) == null) {
                    z14 = z19;
                    th3 = null;
                    bVar2 = bVar;
                    pVar2 = null;
                } else {
                    String str6 = this.f176151f;
                    Integer num = cVar2.f123827e;
                    Integer num2 = cVar2.f123826d;
                    if (num2 == null || num2.intValue() == 0) {
                        z14 = z19;
                        th3 = null;
                        bVar2 = bVar;
                        pVar4 = null;
                    } else {
                        y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
                        g81.k kVar2 = g81.k.f76348a;
                        List<n61.a> list30 = cVar2.f123830h;
                        kVar2.getClass();
                        list30.getClass();
                        y0Var.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List<x0> listK = y0Var.k(x0.f4304m);
                        Iterator it12 = list30.iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                th3 = th5;
                                next = th3;
                                break;
                            }
                            next = it12.next();
                            Integer group2 = ((n61.a) next).getGroup();
                            int i79 = a81.b.OTHER.f1949a;
                            th3 = th5;
                            if (group2 != null && group2.intValue() == i79) {
                                break;
                            }
                            th5 = th3;
                        }
                        ArrayList<n61.a> arrayListY0 = h0.y0(list30, (n61.a) next);
                        for (x0 x0Var : listK) {
                            ArrayList arrayListD0 = h0.D0(y0Var.k(x0Var), x0Var);
                            String str7 = str6;
                            ArrayList arrayList11 = new ArrayList();
                            for (n61.a aVar8 : arrayListY0) {
                                if (aVar8 == null || (group = aVar8.getGroup()) == null) {
                                    z15 = z19;
                                } else {
                                    int iIntValue2 = group.intValue();
                                    a81.b.f1945e.getClass();
                                    z15 = z19;
                                    a81.b bVarA = a81.b.a.a(iIntValue2);
                                    if (bVarA != null) {
                                        obj = bVarA.f1950b;
                                    }
                                    if (aVar8 != null || (activityTypeId = aVar8.getActivityTypeId()) == null) {
                                        objJ = th3;
                                    } else {
                                        objJ = y0Var.j(activityTypeId.intValue());
                                    }
                                    if (h0.R(arrayListD0, obj) || h0.R(arrayListD0, objJ)) {
                                        set = (Set) linkedHashMap.get(x0Var);
                                        if (set != null) {
                                            linkedHashSet = h0.f1(set);
                                        } else {
                                            linkedHashSet = new LinkedHashSet();
                                        }
                                        set2 = linkedHashSet;
                                        if (obj != null) {
                                            set2.add(obj);
                                        }
                                        if (objJ != null) {
                                            set2.add(objJ);
                                        }
                                        linkedHashMap.put(x0Var, set2);
                                    }
                                    arrayList11.add(Unit.INSTANCE);
                                    arrayListY0 = arrayListY0;
                                    arrayListD0 = arrayListD0;
                                    z19 = z15;
                                }
                                obj = th3;
                                if (aVar8 != null) {
                                    objJ = th3;
                                } else {
                                    objJ = th3;
                                }
                                if (h0.R(arrayListD0, obj)) {
                                    set = (Set) linkedHashMap.get(x0Var);
                                    if (set != null) {
                                        linkedHashSet = h0.f1(set);
                                    } else {
                                        linkedHashSet = new LinkedHashSet();
                                    }
                                    set2 = linkedHashSet;
                                    if (obj != null) {
                                        set2.add(obj);
                                    }
                                    if (objJ != null) {
                                        set2.add(objJ);
                                    }
                                    linkedHashMap.put(x0Var, set2);
                                } else {
                                    set = (Set) linkedHashMap.get(x0Var);
                                    if (set != null) {
                                        linkedHashSet = h0.f1(set);
                                    } else {
                                        linkedHashSet = new LinkedHashSet();
                                    }
                                    set2 = linkedHashSet;
                                    if (obj != null) {
                                        set2.add(obj);
                                    }
                                    if (objJ != null) {
                                        set2.add(objJ);
                                    }
                                    linkedHashMap.put(x0Var, set2);
                                }
                                arrayList11.add(Unit.INSTANCE);
                                arrayListY0 = arrayListY0;
                                arrayListD0 = arrayListD0;
                                z19 = z15;
                            }
                            str6 = str7;
                        }
                        String str8 = str6;
                        z14 = z19;
                        ArrayList<g81.g> arrayListA = g81.k.a(list30, y0Var, linkedHashMap);
                        String str9 = cVar2.f123825c;
                        boolean zA = str9 != null ? g22.l.a(o.Companion.b(o.INSTANCE, str9)) : false;
                        Integer num3 = cVar2.f123826d;
                        Integer num4 = cVar2.f123827e;
                        ?? r24 = zA ? cVar2.f123828f : th3;
                        ArrayList arrayList12 = new ArrayList(y.r(arrayListA, 10));
                        for (g81.g gVar2 : arrayListA) {
                            c3 c3VarB = gVar2.f76325a;
                            if (c3VarB == null) {
                                c3VarB = c22.i.b(R.string.lbl_other);
                            }
                            String str10 = l3.f23125c.format(gVar2.f76328d);
                            str10.getClass();
                            Integer num5 = num3;
                            l22.b bVar7 = bVar;
                            String strA8 = bVar7.a(R.string.lbl_value_percent, str10);
                            i53.c<g81.v> cVar7 = gVar2.f76331g;
                            if (cVar7 != null) {
                                arrayList = new ArrayList(y.r(cVar7, 10));
                                for (g81.v vVar : cVar7) {
                                    c3 c3VarB2 = vVar.f76409a;
                                    if (c3VarB2 == null) {
                                        c3VarB2 = c22.i.b(R.string.lbl_other);
                                    }
                                    arrayList.add(new g81.l(c3VarB2, bVar7.a(R.string.lbl_value_percent, vVar.f76411c), null, 4, null));
                                }
                            } else {
                                arrayList = th3;
                            }
                            arrayList12.add(new g81.l(c3VarB, strA8, arrayList));
                            bVar = bVar7;
                            num = num;
                            num3 = num5;
                            num4 = num4;
                        }
                        Integer num6 = num3;
                        Integer num7 = num4;
                        Integer num8 = num;
                        bVar2 = bVar;
                        Boolean boolValueOf = Boolean.valueOf(cVar2.f123829g);
                        n61.b.f123808d.getClass();
                        n61.b bVarA2 = n61.b.a.a(num8);
                        List listN4 = h0.N0(n61.b.f123817m, new g81.q());
                        ArrayList arrayList13 = new ArrayList(y.r(listN4, 10));
                        Iterator it13 = listN4.iterator();
                        while (it13.hasNext()) {
                            arrayList13.add(Integer.valueOf(((n61.b) it13.next()).f123820c));
                        }
                        int i84 = cVar2.b().f123847h;
                        float f14 = cVar2.b().f123848i - i84;
                        float fD = j23.t.d((num2.intValue() - i84) / f14, 0.0f, 1.0f);
                        n61.d dVarB = cVar2.b();
                        List listK2 = x.k(dVarB.f123840a, dVarB.f123841b, dVarB.f123842c, dVarB.f123843d, dVarB.f123844e, dVarB.f123845f, dVarB.f123846g);
                        ArrayList arrayList14 = new ArrayList(y.r(listK2, 10));
                        int i85 = 0;
                        for (Iterator it14 = listK2.iterator(); it14.hasNext(); it14 = it14) {
                            Object next6 = it14.next();
                            int i86 = i85 + 1;
                            if (i85 < 0) {
                                x.q();
                                throw th3;
                            }
                            p pVar6 = (p) next6;
                            arrayList14.add(new p(Float.valueOf((((Number) pVar6.f128595b).intValue() - ((Number) pVar6.f128594a).intValue()) / f14), arrayList13.get(i85)));
                            i85 = i86;
                        }
                        i53.f fVarJ5 = i53.a.j(arrayList14);
                        l3.f23124b.getClass();
                        String str11 = l3.f23131i.format(num2);
                        str11.getClass();
                        int i87 = R.string.no_value;
                        s sVar = new s(fD, str11, bVarA2 != null ? bVarA2.f123819b : R.string.no_value, fVarJ5, bVarA2 != null ? bVarA2.f123820c : R.color.gcm_progress_indicator_empty);
                        n61.b.f123808d.getClass();
                        n61.b bVarA3 = n61.b.a.a(num8);
                        List<g81.g> listN5 = h0.N0(arrayListA, new g81.r());
                        ArrayList arrayList15 = new ArrayList(y.r(listN5, 10));
                        for (g81.g gVar3 : listN5) {
                            c3 c3VarB3 = gVar3.f76325a;
                            if (c3VarB3 == null) {
                                c3VarB3 = c22.i.b(R.string.lbl_other);
                            }
                            Double d14 = gVar3.f76328d;
                            float fDoubleValue = d14 != null ? (float) d14.doubleValue() : 0.0f;
                            Integer num9 = gVar3.f76327c;
                            if (num9 != null) {
                                iIntValue = num9.intValue();
                            } else {
                                g81.k.f76348a.getClass();
                                iIntValue = g81.k.f76350c;
                            }
                            arrayList15.add(new g81.m.b(c3VarB3, fDoubleValue, iIntValue, p005kotlin.jvm.internal.s.g(gVar3.f76325a, c22.i.b(R.string.lbl_miscellaneous_activities))));
                        }
                        l3.f23124b.getClass();
                        String str12 = l3.f23131i.format(num2);
                        str12.getClass();
                        if (bVarA3 != null) {
                            i87 = bVarA3.f123819b;
                        }
                        pVar4 = new g81.p(num6, num7, r24, arrayList12, boolValueOf, str8, sVar, new g81.m(str12, i87, i53.a.j(arrayList15)));
                    }
                    pVar2 = pVar4;
                }
                if (z14) {
                    ?? r15 = th3;
                    gVar.f176140a = r15;
                    gVar.f176141b = r15;
                    gVar.f176142c = pVar2;
                    gVar.f176145f = 3;
                    objM4 = this.f176148c.m4(oVar3, gVar);
                    if (objM4 != aVar5) {
                        pVar3 = pVar2;
                        obj2 = objM4;
                    }
                    return aVar5;
                }
                v2Var2 = null;
                if (v2Var2 instanceof v2.b) {
                    list = (List) ((v2.b) v2Var2).f47386a;
                } else {
                    list = null;
                }
                str = "";
                if (list != null) {
                    v.f1974a.getClass();
                    it7 = list.iterator();
                    do {
                        if (it7.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it7.next();
                    } while (((n61.i) next5).f123869d != 1);
                    iVar2 = (n61.i) next5;
                    i29 = R.string.lbl_minute_per_mile;
                    if (iVar2 != null) {
                        list8 = iVar2.f123872g;
                        list9 = iVar2.f123876k;
                        if (zf.b.Q(iVar2)) {
                            list2 = list;
                            bVar3 = bVar2;
                            i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                            th4 = null;
                            i34 = R.string.lbl_stamina_pace_range;
                            n0Var3 = null;
                        } else {
                            z18 = am.j.z(f12.l.f68084a);
                            List listN6 = h0.N0(h0.b1(zp1.a.f206594h), new u());
                            arrayList8 = new ArrayList(y.r(listN6, 10));
                            i45 = 0;
                            while (r9.hasNext()) {
                                i48 = i45 + 1;
                                if (i45 >= 0) {
                                    x.q();
                                    throw null;
                                }
                                aVar4 = (zp1.a) obj3;
                                int i510 = i45 * 2;
                                int i511 = i510 + 1;
                                if (aVar4.f206595a != zp1.a.MAXIMUM.f206595a) {
                                    i49 = 1;
                                } else {
                                    i49 = 0;
                                }
                                float fFloatValue4 = list8.get(i511).floatValue();
                                l3.a aVar9 = l3.f23124b;
                                int i512 = i49;
                                List<Float> list110 = list8;
                                List list111 = list;
                                double dFloatValue8 = list9.get(i510 + 2).floatValue();
                                aVar9.getClass();
                                int iP5 = l3.a.p(dFloatValue8, z18);
                                int iP6 = l3.a.p(list9.get(i510).floatValue(), z18);
                                int i513 = aVar4.f206597c;
                                String string15 = bVar2.getString(aVar4.f206596b);
                                String strA9 = bVar2.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP5, iP6) + i512), l3.a.w0(Math.max(iP5, iP6)));
                                strE2 = l3.a.e1((long) fFloatValue4);
                                if (strE2 == null) {
                                    strE2 = "";
                                }
                                arrayList8.add(new m0(i513, string15, strA9, strE2));
                                i45 = i48;
                                list = list111;
                                list8 = list110;
                            }
                            List<Float> list112 = list8;
                            list2 = list;
                            th4 = null;
                            i53.f fVarJ6 = i53.a.j(h0.G0(arrayList8));
                            a81.f fVar7 = a81.f.f1960a;
                            String strA10 = bVar2.a(R.string.string_space_string_bracket_pattern, bVar2.getString(R.string.lbl_time), bVar2.getString(R.string.lbl_hours_minutes_seconds_abbreviated));
                            String string16 = bVar2.getString(R.string.lbl_stamina_pace_range);
                            if (z18) {
                                i46 = R.string.lbl_pace_unit_km;
                            } else {
                                i46 = R.string.lbl_pace_unit_mi;
                            }
                            String string17 = bVar2.getString(i46);
                            List<Float> list113 = iVar2.f123874i;
                            List<Float> list114 = iVar2.f123876k;
                            List<Float> list115 = iVar2.f123875j;
                            int iA5 = v.a(list112);
                            w13.c cVar8 = zp1.a.f206594h;
                            arrayList9 = new ArrayList(y.r(cVar8, 10));
                            it9 = cVar8.iterator();
                            while (it9.hasNext()) {
                                arrayList9.add(Integer.valueOf(((zp1.a) it9.next()).f206597c));
                            }
                            a03.h hVar5 = new a03.h(27);
                            a81.j jVar7 = new a81.j(z18, 3);
                            fVar7.getClass();
                            i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                            i34 = R.string.lbl_stamina_pace_range;
                            bVar3 = bVar2;
                            g81.e eVarC3 = a81.f.c(bVar3, strA10, string16, string17, false, list113, list114, list115, list112, arrayList9, iA5, hVar5, jVar7, null);
                            c22.i iVarB16 = c22.i.b(R.string.lbl_pace);
                            c22.i iVarB17 = c22.i.b(R.string.lbl_zone);
                            c22.i iVarB18 = c22.i.b(R.string.lbl_stamina_pace_range);
                            if (z18) {
                                i47 = R.string.lbl_minute_per_km;
                            } else {
                                i47 = R.string.lbl_minute_per_mile;
                            }
                            n0Var3 = new n0(iVarB16, null, new o0(iVarB17, iVarB18, c22.i.b(i47), c22.i.b(R.string.lbl_time), c22.i.b(R.string.lbl_hours_minutes_seconds_abbreviated), fVarJ6), eVarC3, 2, null);
                        }
                    } else {
                        list2 = list;
                        bVar3 = bVar2;
                        i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                        th4 = null;
                        i34 = R.string.lbl_stamina_pace_range;
                        n0Var3 = null;
                    }
                    if (iVar2 != 0) {
                        list7 = iVar2.f123876k;
                        if (zf.b.M(iVar2)) {
                            i14 = i30;
                            str2 = "";
                            n0Var4 = th4;
                        } else {
                            z17 = am.j.z(f12.l.f68084a);
                            List listN7 = h0.N0(h0.b1(zp1.a.f206594h), new t());
                            arrayList6 = new ArrayList(y.r(listN7, 10));
                            i35 = 0;
                            while (r16.hasNext()) {
                                i39 = i35 + 1;
                                if (i35 >= 0) {
                                    x.q();
                                    throw th4;
                                }
                                aVar3 = (zp1.a) obj4;
                                int i610 = i35 * 2;
                                int i611 = i610 + 1;
                                int i612 = i30;
                                if (aVar3.f206595a != zp1.a.MAXIMUM.f206595a) {
                                    i44 = 1;
                                } else {
                                    i44 = 0;
                                }
                                double dFloatValue9 = iVar2.b().get(i611).floatValue();
                                l3.a aVar10 = l3.f23124b;
                                l22.b bVar8 = bVar3;
                                double dFloatValue10 = list7.get(i610 + 2).floatValue();
                                aVar10.getClass();
                                int iP7 = l3.a.p(dFloatValue10, z17);
                                int iP8 = l3.a.p(list7.get(i610).floatValue(), z17);
                                int i613 = aVar3.f206597c;
                                String string18 = bVar8.getString(aVar3.f206596b);
                                String strA11 = bVar8.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP7, iP8) + i44), l3.a.w0(Math.max(iP7, iP8)));
                                ArrayList arrayList16 = arrayList6;
                                arrayList16.add(new m0(i613, string18, strA11, l3.a.S(bVar8, dFloatValue9, l3.f23125c, false, z17)));
                                arrayList6 = arrayList16;
                                bVar3 = bVar8;
                                i35 = i39;
                                i30 = i612;
                                str = str;
                            }
                            i14 = i30;
                            str2 = str;
                            l22.b bVar9 = bVar3;
                            i53.f fVarJ7 = i53.a.j(h0.G0(arrayList6));
                            a81.f fVar8 = a81.f.f1960a;
                            String string19 = bVar9.getString(R.string.lbl_distance);
                            if (z17) {
                                i36 = R.string.lbl_km;
                            } else {
                                i36 = R.string.lbl_mile;
                            }
                            String strA12 = bVar9.a(R.string.string_space_string_bracket_pattern, string19, bVar9.getString(i36));
                            int i614 = i34;
                            String string20 = bVar9.getString(i614);
                            if (z17) {
                                i37 = R.string.lbl_pace_unit_km;
                            } else {
                                i37 = R.string.lbl_pace_unit_mi;
                            }
                            String string21 = bVar9.getString(i37);
                            List<Float> list116 = iVar2.f123874i;
                            List<Float> list117 = iVar2.f123876k;
                            List<Float> list118 = iVar2.f123875j;
                            List<Float> listB2 = iVar2.b();
                            int iA6 = v.a(iVar2.b());
                            w13.c cVar9 = zp1.a.f206594h;
                            arrayList7 = new ArrayList(y.r(cVar9, 10));
                            it8 = cVar9.iterator();
                            while (it8.hasNext()) {
                                arrayList7.add(Integer.valueOf(((zp1.a) it8.next()).f206597c));
                            }
                            a81.j jVar8 = new a81.j(z17, 4);
                            a81.j jVar9 = new a81.j(z17, 5);
                            a81.k kVar3 = new a81.k(bVar9, z17, 2);
                            fVar8.getClass();
                            bVar3 = bVar9;
                            g81.e eVarC4 = a81.f.c(bVar3, strA12, string20, string21, false, list116, list117, list118, listB2, arrayList7, iA6, jVar8, jVar9, kVar3);
                            c22.i iVarB19 = c22.i.b(R.string.lbl_pace);
                            c22.i iVarB20 = c22.i.b(R.string.lbl_zone);
                            c22.i iVarB21 = c22.i.b(i614);
                            if (z17) {
                                i29 = R.string.lbl_minute_per_km;
                            }
                            c22.i iVarB22 = c22.i.b(i29);
                            c22.i iVarB23 = c22.i.b(R.string.lbl_distance);
                            if (z17) {
                                i38 = R.string.lbl_km;
                            } else {
                                i38 = R.string.lbl_mile;
                            }
                            n0Var4 = new n0(iVarB19, null, new o0(iVarB20, iVarB21, iVarB22, iVarB23, c22.i.b(i38), fVarJ7), eVarC4, 2, null);
                        }
                    } else {
                        i14 = i30;
                        str2 = "";
                        n0Var4 = th4;
                    }
                    new g81.f(n0Var3, n0Var4);
                } else {
                    list2 = list;
                    bVar3 = bVar2;
                    str2 = "";
                    th4 = null;
                    i14 = R.string.lbl_hours_minutes_seconds_abbreviated;
                    fVar = null;
                }
                if (list2 != null) {
                    v.f1974a.getClass();
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = th4;
                            break;
                        }
                        next2 = it.next();
                    } while (((n61.i) next2).f123869d != 2);
                    iVar = (n61.i) next2;
                    if (iVar != null) {
                        list5 = iVar.f123872g;
                        list6 = iVar.f123876k;
                        if (zf.b.Q(iVar)) {
                            str3 = str2;
                            i15 = R.string.common_watts;
                            i16 = R.string.activity_details_power;
                            n0Var = th4;
                        } else {
                            List listN8 = h0.N0(h0.b1(zp1.a.f206594h), new q());
                            arrayList4 = new ArrayList(y.r(listN8, 10));
                            it5 = listN8.iterator();
                            i26 = 0;
                            while (it5.hasNext()) {
                                next4 = it5.next();
                                i27 = i26 + 1;
                                if (i26 >= 0) {
                                    x.q();
                                    throw th4;
                                }
                                aVar2 = (zp1.a) next4;
                                int i615 = i26 * 2;
                                int i710 = i615 + 1;
                                if (aVar2.f206595a != zp1.a.MAXIMUM.f206595a) {
                                    i28 = 1;
                                } else {
                                    i28 = 0;
                                }
                                float fFloatValue5 = list5.get(i710).floatValue();
                                List<Float> list119 = list5;
                                double dFloatValue11 = ((double) list6.get(i615 + 2).floatValue()) - ((double) i28);
                                float fFloatValue6 = list6.get(i615).floatValue();
                                List<Float> list210 = list6;
                                Iterator it15 = it5;
                                int i711 = aVar2.f206597c;
                                String string22 = bVar3.getString(aVar2.f206596b);
                                l3.f23124b.getClass();
                                str4 = str2;
                                String strA13 = bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, fFloatValue6, false, str4), l3.a.E0(bVar3, dFloatValue11, false, str4));
                                strE1 = l3.a.e1((long) fFloatValue5);
                                if (strE1 == null) {
                                    strE1 = str4;
                                }
                                arrayList4.add(new m0(i711, string22, strA13, strE1));
                                str2 = str4;
                                list6 = list210;
                                list5 = list119;
                                it5 = it15;
                                i26 = i27;
                            }
                            List<Float> list211 = list5;
                            String str13 = str2;
                            i15 = R.string.common_watts;
                            i16 = R.string.activity_details_power;
                            i53.f fVarJ8 = i53.a.j(h0.G0(arrayList4));
                            c22.i iVarB24 = c22.i.b(R.string.activity_details_power);
                            o0 o0Var3 = new o0(c22.i.b(R.string.lbl_zone), c22.i.b(R.string.lbl_stamina_power_range), c22.i.b(R.string.common_watts), c22.i.b(R.string.lbl_time), c22.i.b(i14), fVarJ8);
                            a81.f fVar9 = a81.f.f1960a;
                            String strA14 = bVar3.a(R.string.string_space_string_bracket_pattern, bVar3.getString(R.string.lbl_time), bVar3.getString(i14));
                            String string23 = bVar3.getString(R.string.lbl_stamina_power_range);
                            String string110 = bVar3.getString(R.string.lbl_watts);
                            List<Float> list212 = iVar.f123874i;
                            List<Float> list213 = iVar.f123876k;
                            List<Float> list214 = iVar.f123875j;
                            int iA7 = v.a(list211);
                            w13.c cVar10 = zp1.a.f206594h;
                            arrayList5 = new ArrayList(y.r(cVar10, 10));
                            it6 = cVar10.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(Integer.valueOf(((zp1.a) it6.next()).f206597c));
                            }
                            a03.h hVar6 = new a03.h(29);
                            a81.h hVar7 = new a81.h(bVar3, 3);
                            fVar9.getClass();
                            str3 = str13;
                            n0Var = new n0(iVarB24, null, o0Var3, a81.f.c(bVar3, strA14, string23, string110, true, list212, list213, list214, list211, arrayList5, iA7, hVar6, hVar7, null), 2, null);
                        }
                    } else {
                        str3 = str2;
                        i15 = R.string.common_watts;
                        i16 = R.string.activity_details_power;
                        n0Var = th4;
                    }
                    if (iVar != null) {
                        list3 = iVar.f123873h;
                        list4 = iVar.f123876k;
                        if (zf.b.m(iVar)) {
                            pVar5 = pVar2;
                            n0Var2 = th4;
                        } else {
                            z16 = am.j.z(f12.l.f68084a);
                            List listN9 = h0.N0(h0.b1(zp1.a.f206594h), new a81.p());
                            arrayList2 = new ArrayList(y.r(listN9, 10));
                            it3 = listN9.iterator();
                            i17 = 0;
                            while (it3.hasNext()) {
                                next3 = it3.next();
                                i24 = i17 + 1;
                                if (i17 >= 0) {
                                    x.q();
                                    throw th4;
                                }
                                aVar = (zp1.a) next3;
                                int i712 = i17 * 2;
                                int i713 = i712 + 1;
                                Iterator it16 = it3;
                                if (aVar.f206595a != zp1.a.MAXIMUM.f206595a) {
                                    i25 = 1;
                                } else {
                                    i25 = 0;
                                }
                                double dFloatValue12 = list3.get(i713).floatValue();
                                List<Float> list215 = list3;
                                double dFloatValue13 = ((double) list4.get(i712 + 2).floatValue()) - ((double) i25);
                                double dFloatValue14 = list4.get(i712).floatValue();
                                int i714 = aVar.f206597c;
                                String string111 = bVar3.getString(aVar.f206596b);
                                l3.f23124b.getClass();
                                arrayList2.add(new m0(i714, string111, bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, dFloatValue14, false, str3), l3.a.E0(bVar3, dFloatValue13, false, str3)), l3.a.S(bVar3, dFloatValue12, l3.f23125c, false, z16)));
                                i17 = i24;
                                it3 = it16;
                                list3 = list215;
                                list4 = list4;
                                pVar2 = pVar2;
                            }
                            pVar5 = pVar2;
                            List<Float> list216 = list3;
                            i53.f fVarJ9 = i53.a.j(h0.G0(arrayList2));
                            c22.i iVarB110 = c22.i.b(i16);
                            c22.i iVarB111 = c22.i.b(R.string.lbl_stamina_distance_estimate_disclaimer);
                            c22.i iVarB112 = c22.i.b(R.string.lbl_zone);
                            c22.i iVarB113 = c22.i.b(R.string.lbl_stamina_power_range);
                            c22.i iVarB114 = c22.i.b(i15);
                            c22.i iVarB115 = c22.i.b(R.string.lbl_distance);
                            if (z16) {
                                i18 = R.string.lbl_km;
                            } else {
                                i18 = R.string.lbl_mile;
                            }
                            o0 o0Var4 = new o0(iVarB112, iVarB113, iVarB114, iVarB115, c22.i.b(i18), fVarJ9);
                            a81.f fVar10 = a81.f.f1960a;
                            String string112 = bVar3.getString(R.string.lbl_distance);
                            if (z16) {
                                i19 = R.string.lbl_km;
                            } else {
                                i19 = R.string.lbl_mile;
                            }
                            String strA15 = bVar3.a(R.string.string_space_string_bracket_pattern, string112, bVar3.getString(i19));
                            String string113 = bVar3.getString(R.string.lbl_stamina_power_range);
                            String string114 = bVar3.getString(R.string.lbl_watts);
                            List<Float> list217 = iVar.f123874i;
                            List<Float> list218 = iVar.f123876k;
                            List<Float> list219 = iVar.f123875j;
                            int iA8 = v.a(list216);
                            w13.c cVar11 = zp1.a.f206594h;
                            arrayList3 = new ArrayList(y.r(cVar11, 10));
                            it4 = cVar11.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(Integer.valueOf(((zp1.a) it4.next()).f206597c));
                            }
                            a81.j jVar10 = new a81.j(z16, 1);
                            a81.h hVar8 = new a81.h(bVar3, 1);
                            fVar10.getClass();
                            n0Var2 = new n0(iVarB110, iVarB111, o0Var4, a81.f.c(bVar3, strA15, string113, string114, true, list217, list218, list219, list216, arrayList3, iA8, jVar10, hVar8, null));
                        }
                    } else {
                        pVar5 = pVar2;
                        n0Var2 = th4;
                    }
                    fVar2 = new g81.f(n0Var, n0Var2);
                } else {
                    pVar5 = pVar2;
                    fVar2 = th4;
                }
                if (z14) {
                    fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors), c22.i.b(R.string.lbl_running_stamina), c22.i.b(R.string.lbl_cycling_stamina));
                } else {
                    fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors));
                }
                return new g81.c(pVar5, fVar, fVar2, fVarA);
            }
            if (i55 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar3 = gVar.f176142c;
            r.b(obj2);
            z14 = z19;
            bVar2 = bVar4;
        }
        v2Var2 = (v2) obj2;
        pVar2 = pVar3;
        if (v2Var2 instanceof v2.b) {
            list = (List) ((v2.b) v2Var2).f47386a;
        } else {
            list = null;
        }
        str = "";
        if (list != null) {
            v.f1974a.getClass();
            it7 = list.iterator();
            do {
                if (it7.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it7.next();
            } while (((n61.i) next5).f123869d != 1);
            iVar2 = (n61.i) next5;
            i29 = R.string.lbl_minute_per_mile;
            if (iVar2 != null) {
                list8 = iVar2.f123872g;
                list9 = iVar2.f123876k;
                if (zf.b.Q(iVar2)) {
                    list2 = list;
                    bVar3 = bVar2;
                    i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                    th4 = null;
                    i34 = R.string.lbl_stamina_pace_range;
                    n0Var3 = null;
                } else {
                    z18 = am.j.z(f12.l.f68084a);
                    List listN10 = h0.N0(h0.b1(zp1.a.f206594h), new u());
                    arrayList8 = new ArrayList(y.r(listN10, 10));
                    i45 = 0;
                    while (r9.hasNext()) {
                        i48 = i45 + 1;
                        if (i45 >= 0) {
                            x.q();
                            throw null;
                        }
                        aVar4 = (zp1.a) obj3;
                        int i514 = i45 * 2;
                        int i515 = i514 + 1;
                        if (aVar4.f206595a != zp1.a.MAXIMUM.f206595a) {
                            i49 = 1;
                        } else {
                            i49 = 0;
                        }
                        float fFloatValue7 = list8.get(i515).floatValue();
                        l3.a aVar11 = l3.f23124b;
                        int i516 = i49;
                        List<Float> list1110 = list8;
                        List list1111 = list;
                        double dFloatValue15 = list9.get(i514 + 2).floatValue();
                        aVar11.getClass();
                        int iP9 = l3.a.p(dFloatValue15, z18);
                        int iP10 = l3.a.p(list9.get(i514).floatValue(), z18);
                        int i517 = aVar4.f206597c;
                        String string115 = bVar2.getString(aVar4.f206596b);
                        String strA16 = bVar2.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP9, iP10) + i516), l3.a.w0(Math.max(iP9, iP10)));
                        strE2 = l3.a.e1((long) fFloatValue7);
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        arrayList8.add(new m0(i517, string115, strA16, strE2));
                        i45 = i48;
                        list = list1111;
                        list8 = list1110;
                    }
                    List<Float> list1112 = list8;
                    list2 = list;
                    th4 = null;
                    i53.f fVarJ10 = i53.a.j(h0.G0(arrayList8));
                    a81.f fVar11 = a81.f.f1960a;
                    String strA17 = bVar2.a(R.string.string_space_string_bracket_pattern, bVar2.getString(R.string.lbl_time), bVar2.getString(R.string.lbl_hours_minutes_seconds_abbreviated));
                    String string116 = bVar2.getString(R.string.lbl_stamina_pace_range);
                    if (z18) {
                        i46 = R.string.lbl_pace_unit_km;
                    } else {
                        i46 = R.string.lbl_pace_unit_mi;
                    }
                    String string117 = bVar2.getString(i46);
                    List<Float> list1113 = iVar2.f123874i;
                    List<Float> list1114 = iVar2.f123876k;
                    List<Float> list1115 = iVar2.f123875j;
                    int iA9 = v.a(list1112);
                    w13.c cVar12 = zp1.a.f206594h;
                    arrayList9 = new ArrayList(y.r(cVar12, 10));
                    it9 = cVar12.iterator();
                    while (it9.hasNext()) {
                        arrayList9.add(Integer.valueOf(((zp1.a) it9.next()).f206597c));
                    }
                    a03.h hVar9 = new a03.h(27);
                    a81.j jVar11 = new a81.j(z18, 3);
                    fVar11.getClass();
                    i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                    i34 = R.string.lbl_stamina_pace_range;
                    bVar3 = bVar2;
                    g81.e eVarC5 = a81.f.c(bVar3, strA17, string116, string117, false, list1113, list1114, list1115, list1112, arrayList9, iA9, hVar9, jVar11, null);
                    c22.i iVarB116 = c22.i.b(R.string.lbl_pace);
                    c22.i iVarB117 = c22.i.b(R.string.lbl_zone);
                    c22.i iVarB118 = c22.i.b(R.string.lbl_stamina_pace_range);
                    if (z18) {
                        i47 = R.string.lbl_minute_per_km;
                    } else {
                        i47 = R.string.lbl_minute_per_mile;
                    }
                    n0Var3 = new n0(iVarB116, null, new o0(iVarB117, iVarB118, c22.i.b(i47), c22.i.b(R.string.lbl_time), c22.i.b(R.string.lbl_hours_minutes_seconds_abbreviated), fVarJ10), eVarC5, 2, null);
                }
            } else {
                list2 = list;
                bVar3 = bVar2;
                i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                th4 = null;
                i34 = R.string.lbl_stamina_pace_range;
                n0Var3 = null;
            }
            if (iVar2 != 0) {
                list7 = iVar2.f123876k;
                if (zf.b.M(iVar2)) {
                    i14 = i30;
                    str2 = "";
                    n0Var4 = th4;
                } else {
                    z17 = am.j.z(f12.l.f68084a);
                    List listN11 = h0.N0(h0.b1(zp1.a.f206594h), new t());
                    arrayList6 = new ArrayList(y.r(listN11, 10));
                    i35 = 0;
                    while (r16.hasNext()) {
                        i39 = i35 + 1;
                        if (i35 >= 0) {
                            x.q();
                            throw th4;
                        }
                        aVar3 = (zp1.a) obj4;
                        int i616 = i35 * 2;
                        int i617 = i616 + 1;
                        int i618 = i30;
                        if (aVar3.f206595a != zp1.a.MAXIMUM.f206595a) {
                            i44 = 1;
                        } else {
                            i44 = 0;
                        }
                        double dFloatValue16 = iVar2.b().get(i617).floatValue();
                        l3.a aVar12 = l3.f23124b;
                        l22.b bVar10 = bVar3;
                        double dFloatValue17 = list7.get(i616 + 2).floatValue();
                        aVar12.getClass();
                        int iP11 = l3.a.p(dFloatValue17, z17);
                        int iP12 = l3.a.p(list7.get(i616).floatValue(), z17);
                        int i619 = aVar3.f206597c;
                        String string118 = bVar10.getString(aVar3.f206596b);
                        String strA18 = bVar10.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP11, iP12) + i44), l3.a.w0(Math.max(iP11, iP12)));
                        ArrayList arrayList17 = arrayList6;
                        arrayList17.add(new m0(i619, string118, strA18, l3.a.S(bVar10, dFloatValue16, l3.f23125c, false, z17)));
                        arrayList6 = arrayList17;
                        bVar3 = bVar10;
                        i35 = i39;
                        i30 = i618;
                        str = str;
                    }
                    i14 = i30;
                    str2 = str;
                    l22.b bVar11 = bVar3;
                    i53.f fVarJ11 = i53.a.j(h0.G0(arrayList6));
                    a81.f fVar12 = a81.f.f1960a;
                    String string119 = bVar11.getString(R.string.lbl_distance);
                    if (z17) {
                        i36 = R.string.lbl_km;
                    } else {
                        i36 = R.string.lbl_mile;
                    }
                    String strA19 = bVar11.a(R.string.string_space_string_bracket_pattern, string119, bVar11.getString(i36));
                    int i6110 = i34;
                    String string24 = bVar11.getString(i6110);
                    if (z17) {
                        i37 = R.string.lbl_pace_unit_km;
                    } else {
                        i37 = R.string.lbl_pace_unit_mi;
                    }
                    String string25 = bVar11.getString(i37);
                    List<Float> list1116 = iVar2.f123874i;
                    List<Float> list1117 = iVar2.f123876k;
                    List<Float> list1118 = iVar2.f123875j;
                    List<Float> listB3 = iVar2.b();
                    int iA10 = v.a(iVar2.b());
                    w13.c cVar13 = zp1.a.f206594h;
                    arrayList7 = new ArrayList(y.r(cVar13, 10));
                    it8 = cVar13.iterator();
                    while (it8.hasNext()) {
                        arrayList7.add(Integer.valueOf(((zp1.a) it8.next()).f206597c));
                    }
                    a81.j jVar12 = new a81.j(z17, 4);
                    a81.j jVar13 = new a81.j(z17, 5);
                    a81.k kVar4 = new a81.k(bVar11, z17, 2);
                    fVar12.getClass();
                    bVar3 = bVar11;
                    g81.e eVarC6 = a81.f.c(bVar3, strA19, string24, string25, false, list1116, list1117, list1118, listB3, arrayList7, iA10, jVar12, jVar13, kVar4);
                    c22.i iVarB119 = c22.i.b(R.string.lbl_pace);
                    c22.i iVarB25 = c22.i.b(R.string.lbl_zone);
                    c22.i iVarB26 = c22.i.b(i6110);
                    if (z17) {
                        i29 = R.string.lbl_minute_per_km;
                    }
                    c22.i iVarB27 = c22.i.b(i29);
                    c22.i iVarB28 = c22.i.b(R.string.lbl_distance);
                    if (z17) {
                        i38 = R.string.lbl_km;
                    } else {
                        i38 = R.string.lbl_mile;
                    }
                    n0Var4 = new n0(iVarB119, null, new o0(iVarB25, iVarB26, iVarB27, iVarB28, c22.i.b(i38), fVarJ11), eVarC6, 2, null);
                }
            } else {
                i14 = i30;
                str2 = "";
                n0Var4 = th4;
            }
            new g81.f(n0Var3, n0Var4);
        } else {
            list2 = list;
            bVar3 = bVar2;
            str2 = "";
            th4 = null;
            i14 = R.string.lbl_hours_minutes_seconds_abbreviated;
            fVar = null;
        }
        if (list2 != null) {
            v.f1974a.getClass();
            it = list2.iterator();
            do {
                if (it.hasNext()) {
                    next2 = th4;
                    break;
                }
                next2 = it.next();
            } while (((n61.i) next2).f123869d != 2);
            iVar = (n61.i) next2;
            if (iVar != null) {
                list5 = iVar.f123872g;
                list6 = iVar.f123876k;
                if (zf.b.Q(iVar)) {
                    str3 = str2;
                    i15 = R.string.common_watts;
                    i16 = R.string.activity_details_power;
                    n0Var = th4;
                } else {
                    List listN12 = h0.N0(h0.b1(zp1.a.f206594h), new q());
                    arrayList4 = new ArrayList(y.r(listN12, 10));
                    it5 = listN12.iterator();
                    i26 = 0;
                    while (it5.hasNext()) {
                        next4 = it5.next();
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            x.q();
                            throw th4;
                        }
                        aVar2 = (zp1.a) next4;
                        int i6111 = i26 * 2;
                        int i715 = i6111 + 1;
                        if (aVar2.f206595a != zp1.a.MAXIMUM.f206595a) {
                            i28 = 1;
                        } else {
                            i28 = 0;
                        }
                        float fFloatValue8 = list5.get(i715).floatValue();
                        List<Float> list1119 = list5;
                        double dFloatValue18 = ((double) list6.get(i6111 + 2).floatValue()) - ((double) i28);
                        float fFloatValue9 = list6.get(i6111).floatValue();
                        List<Float> list2110 = list6;
                        Iterator it17 = it5;
                        int i716 = aVar2.f206597c;
                        String string26 = bVar3.getString(aVar2.f206596b);
                        l3.f23124b.getClass();
                        str4 = str2;
                        String strA110 = bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, fFloatValue9, false, str4), l3.a.E0(bVar3, dFloatValue18, false, str4));
                        strE1 = l3.a.e1((long) fFloatValue8);
                        if (strE1 == null) {
                            strE1 = str4;
                        }
                        arrayList4.add(new m0(i716, string26, strA110, strE1));
                        str2 = str4;
                        list6 = list2110;
                        list5 = list1119;
                        it5 = it17;
                        i26 = i27;
                    }
                    List<Float> list2111 = list5;
                    String str14 = str2;
                    i15 = R.string.common_watts;
                    i16 = R.string.activity_details_power;
                    i53.f fVarJ12 = i53.a.j(h0.G0(arrayList4));
                    c22.i iVarB29 = c22.i.b(R.string.activity_details_power);
                    o0 o0Var5 = new o0(c22.i.b(R.string.lbl_zone), c22.i.b(R.string.lbl_stamina_power_range), c22.i.b(R.string.common_watts), c22.i.b(R.string.lbl_time), c22.i.b(i14), fVarJ12);
                    a81.f fVar13 = a81.f.f1960a;
                    String strA111 = bVar3.a(R.string.string_space_string_bracket_pattern, bVar3.getString(R.string.lbl_time), bVar3.getString(i14));
                    String string27 = bVar3.getString(R.string.lbl_stamina_power_range);
                    String string1110 = bVar3.getString(R.string.lbl_watts);
                    List<Float> list2112 = iVar.f123874i;
                    List<Float> list2113 = iVar.f123876k;
                    List<Float> list2114 = iVar.f123875j;
                    int iA11 = v.a(list2111);
                    w13.c cVar14 = zp1.a.f206594h;
                    arrayList5 = new ArrayList(y.r(cVar14, 10));
                    it6 = cVar14.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(Integer.valueOf(((zp1.a) it6.next()).f206597c));
                    }
                    a03.h hVar10 = new a03.h(29);
                    a81.h hVar11 = new a81.h(bVar3, 3);
                    fVar13.getClass();
                    str3 = str14;
                    n0Var = new n0(iVarB29, null, o0Var5, a81.f.c(bVar3, strA111, string27, string1110, true, list2112, list2113, list2114, list2111, arrayList5, iA11, hVar10, hVar11, null), 2, null);
                }
            } else {
                str3 = str2;
                i15 = R.string.common_watts;
                i16 = R.string.activity_details_power;
                n0Var = th4;
            }
            if (iVar != null) {
                list3 = iVar.f123873h;
                list4 = iVar.f123876k;
                if (zf.b.m(iVar)) {
                    pVar5 = pVar2;
                    n0Var2 = th4;
                } else {
                    z16 = am.j.z(f12.l.f68084a);
                    List listN13 = h0.N0(h0.b1(zp1.a.f206594h), new a81.p());
                    arrayList2 = new ArrayList(y.r(listN13, 10));
                    it3 = listN13.iterator();
                    i17 = 0;
                    while (it3.hasNext()) {
                        next3 = it3.next();
                        i24 = i17 + 1;
                        if (i17 >= 0) {
                            x.q();
                            throw th4;
                        }
                        aVar = (zp1.a) next3;
                        int i717 = i17 * 2;
                        int i718 = i717 + 1;
                        Iterator it18 = it3;
                        if (aVar.f206595a != zp1.a.MAXIMUM.f206595a) {
                            i25 = 1;
                        } else {
                            i25 = 0;
                        }
                        double dFloatValue19 = list3.get(i718).floatValue();
                        List<Float> list2115 = list3;
                        double dFloatValue110 = ((double) list4.get(i717 + 2).floatValue()) - ((double) i25);
                        double dFloatValue111 = list4.get(i717).floatValue();
                        int i719 = aVar.f206597c;
                        String string1111 = bVar3.getString(aVar.f206596b);
                        l3.f23124b.getClass();
                        arrayList2.add(new m0(i719, string1111, bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, dFloatValue111, false, str3), l3.a.E0(bVar3, dFloatValue110, false, str3)), l3.a.S(bVar3, dFloatValue19, l3.f23125c, false, z16)));
                        i17 = i24;
                        it3 = it18;
                        list3 = list2115;
                        list4 = list4;
                        pVar2 = pVar2;
                    }
                    pVar5 = pVar2;
                    List<Float> list2116 = list3;
                    i53.f fVarJ13 = i53.a.j(h0.G0(arrayList2));
                    c22.i iVarB1110 = c22.i.b(i16);
                    c22.i iVarB1111 = c22.i.b(R.string.lbl_stamina_distance_estimate_disclaimer);
                    c22.i iVarB1112 = c22.i.b(R.string.lbl_zone);
                    c22.i iVarB1113 = c22.i.b(R.string.lbl_stamina_power_range);
                    c22.i iVarB1114 = c22.i.b(i15);
                    c22.i iVarB1115 = c22.i.b(R.string.lbl_distance);
                    if (z16) {
                        i18 = R.string.lbl_km;
                    } else {
                        i18 = R.string.lbl_mile;
                    }
                    o0 o0Var6 = new o0(iVarB1112, iVarB1113, iVarB1114, iVarB1115, c22.i.b(i18), fVarJ13);
                    a81.f fVar14 = a81.f.f1960a;
                    String string1112 = bVar3.getString(R.string.lbl_distance);
                    if (z16) {
                        i19 = R.string.lbl_km;
                    } else {
                        i19 = R.string.lbl_mile;
                    }
                    String strA112 = bVar3.a(R.string.string_space_string_bracket_pattern, string1112, bVar3.getString(i19));
                    String string1113 = bVar3.getString(R.string.lbl_stamina_power_range);
                    String string1114 = bVar3.getString(R.string.lbl_watts);
                    List<Float> list2117 = iVar.f123874i;
                    List<Float> list2118 = iVar.f123876k;
                    List<Float> list2119 = iVar.f123875j;
                    int iA12 = v.a(list2116);
                    w13.c cVar15 = zp1.a.f206594h;
                    arrayList3 = new ArrayList(y.r(cVar15, 10));
                    it4 = cVar15.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Integer.valueOf(((zp1.a) it4.next()).f206597c));
                    }
                    a81.j jVar14 = new a81.j(z16, 1);
                    a81.h hVar12 = new a81.h(bVar3, 1);
                    fVar14.getClass();
                    n0Var2 = new n0(iVarB1110, iVarB1111, o0Var6, a81.f.c(bVar3, strA112, string1113, string1114, true, list2117, list2118, list2119, list2116, arrayList3, iA12, jVar14, hVar12, null));
                }
            } else {
                pVar5 = pVar2;
                n0Var2 = th4;
            }
            fVar2 = new g81.f(n0Var, n0Var2);
        } else {
            pVar5 = pVar2;
            fVar2 = th4;
        }
        if (z14) {
            fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors), c22.i.b(R.string.lbl_running_stamina), c22.i.b(R.string.lbl_cycling_stamina));
        } else {
            fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors));
        }
        return new g81.c(pVar5, fVar, fVar2, fVarA);
        pVar = (p) objA;
        gVar.f176140a = oVar2;
        gVar.f176141b = pVar;
        gVar.f176145f = 2;
        objJ3 = this.f176147b.J3(oVar2, gVar);
        if (objJ3 != aVar5) {
            oVar3 = oVar2;
            obj2 = objJ3;
            v2Var = (v2) obj2;
            if (pVar != null) {
                rd2.j jVar15 = rd2.f.a().f152045a;
                bVar = bVar4;
                long jLongValue3 = ((Number) pVar.f128594a).longValue();
                jVar15.getClass();
                fVarI = rd2.j.i(jLongValue3, null);
                if (fVarI != null) {
                    this.f176151f = (String) pVar.f128595b;
                }
            } else {
                bVar = bVar4;
            }
            if (v2Var instanceof v2.b) {
                z14 = z19;
                th3 = null;
                bVar2 = bVar;
                pVar2 = null;
            } else {
                z14 = z19;
                th3 = null;
                bVar2 = bVar;
                pVar2 = null;
            }
            if (z14) {
                ?? r16 = th3;
                gVar.f176140a = r16;
                gVar.f176141b = r16;
                gVar.f176142c = pVar2;
                gVar.f176145f = 3;
                objM4 = this.f176148c.m4(oVar3, gVar);
                if (objM4 != aVar5) {
                    pVar3 = pVar2;
                    obj2 = objM4;
                    v2Var2 = (v2) obj2;
                    pVar2 = pVar3;
                }
            } else {
                v2Var2 = null;
            }
            if (v2Var2 instanceof v2.b) {
                list = (List) ((v2.b) v2Var2).f47386a;
            } else {
                list = null;
            }
            str = "";
            if (list != null) {
                v.f1974a.getClass();
                it7 = list.iterator();
                do {
                    if (it7.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it7.next();
                } while (((n61.i) next5).f123869d != 1);
                iVar2 = (n61.i) next5;
                i29 = R.string.lbl_minute_per_mile;
                if (iVar2 != null) {
                    list8 = iVar2.f123872g;
                    list9 = iVar2.f123876k;
                    if (zf.b.Q(iVar2)) {
                        list2 = list;
                        bVar3 = bVar2;
                        i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                        th4 = null;
                        i34 = R.string.lbl_stamina_pace_range;
                        n0Var3 = null;
                    } else {
                        z18 = am.j.z(f12.l.f68084a);
                        List listN14 = h0.N0(h0.b1(zp1.a.f206594h), new u());
                        arrayList8 = new ArrayList(y.r(listN14, 10));
                        i45 = 0;
                        while (r9.hasNext()) {
                            i48 = i45 + 1;
                            if (i45 >= 0) {
                                x.q();
                                throw null;
                            }
                            aVar4 = (zp1.a) obj3;
                            int i518 = i45 * 2;
                            int i519 = i518 + 1;
                            if (aVar4.f206595a != zp1.a.MAXIMUM.f206595a) {
                                i49 = 1;
                            } else {
                                i49 = 0;
                            }
                            float fFloatValue10 = list8.get(i519).floatValue();
                            l3.a aVar13 = l3.f23124b;
                            int i5110 = i49;
                            List<Float> list11110 = list8;
                            List list11111 = list;
                            double dFloatValue112 = list9.get(i518 + 2).floatValue();
                            aVar13.getClass();
                            int iP13 = l3.a.p(dFloatValue112, z18);
                            int iP14 = l3.a.p(list9.get(i518).floatValue(), z18);
                            int i5111 = aVar4.f206597c;
                            String string1115 = bVar2.getString(aVar4.f206596b);
                            String strA113 = bVar2.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP13, iP14) + i5110), l3.a.w0(Math.max(iP13, iP14)));
                            strE2 = l3.a.e1((long) fFloatValue10);
                            if (strE2 == null) {
                                strE2 = "";
                            }
                            arrayList8.add(new m0(i5111, string1115, strA113, strE2));
                            i45 = i48;
                            list = list11111;
                            list8 = list11110;
                        }
                        List<Float> list11112 = list8;
                        list2 = list;
                        th4 = null;
                        i53.f fVarJ14 = i53.a.j(h0.G0(arrayList8));
                        a81.f fVar15 = a81.f.f1960a;
                        String strA114 = bVar2.a(R.string.string_space_string_bracket_pattern, bVar2.getString(R.string.lbl_time), bVar2.getString(R.string.lbl_hours_minutes_seconds_abbreviated));
                        String string1116 = bVar2.getString(R.string.lbl_stamina_pace_range);
                        if (z18) {
                            i46 = R.string.lbl_pace_unit_km;
                        } else {
                            i46 = R.string.lbl_pace_unit_mi;
                        }
                        String string1117 = bVar2.getString(i46);
                        List<Float> list11113 = iVar2.f123874i;
                        List<Float> list11114 = iVar2.f123876k;
                        List<Float> list11115 = iVar2.f123875j;
                        int iA13 = v.a(list11112);
                        w13.c cVar16 = zp1.a.f206594h;
                        arrayList9 = new ArrayList(y.r(cVar16, 10));
                        it9 = cVar16.iterator();
                        while (it9.hasNext()) {
                            arrayList9.add(Integer.valueOf(((zp1.a) it9.next()).f206597c));
                        }
                        a03.h hVar13 = new a03.h(27);
                        a81.j jVar16 = new a81.j(z18, 3);
                        fVar15.getClass();
                        i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                        i34 = R.string.lbl_stamina_pace_range;
                        bVar3 = bVar2;
                        g81.e eVarC7 = a81.f.c(bVar3, strA114, string1116, string1117, false, list11113, list11114, list11115, list11112, arrayList9, iA13, hVar13, jVar16, null);
                        c22.i iVarB1116 = c22.i.b(R.string.lbl_pace);
                        c22.i iVarB1117 = c22.i.b(R.string.lbl_zone);
                        c22.i iVarB1118 = c22.i.b(R.string.lbl_stamina_pace_range);
                        if (z18) {
                            i47 = R.string.lbl_minute_per_km;
                        } else {
                            i47 = R.string.lbl_minute_per_mile;
                        }
                        n0Var3 = new n0(iVarB1116, null, new o0(iVarB1117, iVarB1118, c22.i.b(i47), c22.i.b(R.string.lbl_time), c22.i.b(R.string.lbl_hours_minutes_seconds_abbreviated), fVarJ14), eVarC7, 2, null);
                    }
                } else {
                    list2 = list;
                    bVar3 = bVar2;
                    i30 = R.string.lbl_hours_minutes_seconds_abbreviated;
                    th4 = null;
                    i34 = R.string.lbl_stamina_pace_range;
                    n0Var3 = null;
                }
                if (iVar2 != 0) {
                    list7 = iVar2.f123876k;
                    if (zf.b.M(iVar2)) {
                        i14 = i30;
                        str2 = "";
                        n0Var4 = th4;
                    } else {
                        z17 = am.j.z(f12.l.f68084a);
                        List listN15 = h0.N0(h0.b1(zp1.a.f206594h), new t());
                        arrayList6 = new ArrayList(y.r(listN15, 10));
                        i35 = 0;
                        while (r16.hasNext()) {
                            i39 = i35 + 1;
                            if (i35 >= 0) {
                                x.q();
                                throw th4;
                            }
                            aVar3 = (zp1.a) obj4;
                            int i6112 = i35 * 2;
                            int i6113 = i6112 + 1;
                            int i6114 = i30;
                            if (aVar3.f206595a != zp1.a.MAXIMUM.f206595a) {
                                i44 = 1;
                            } else {
                                i44 = 0;
                            }
                            double dFloatValue113 = iVar2.b().get(i6113).floatValue();
                            l3.a aVar14 = l3.f23124b;
                            l22.b bVar12 = bVar3;
                            double dFloatValue114 = list7.get(i6112 + 2).floatValue();
                            aVar14.getClass();
                            int iP15 = l3.a.p(dFloatValue114, z17);
                            int iP16 = l3.a.p(list7.get(i6112).floatValue(), z17);
                            int i6115 = aVar3.f206597c;
                            String string1118 = bVar12.getString(aVar3.f206596b);
                            String strA115 = bVar12.a(R.string.string_line_string_pattern, l3.a.w0(Math.min(iP15, iP16) + i44), l3.a.w0(Math.max(iP15, iP16)));
                            ArrayList arrayList18 = arrayList6;
                            arrayList18.add(new m0(i6115, string1118, strA115, l3.a.S(bVar12, dFloatValue113, l3.f23125c, false, z17)));
                            arrayList6 = arrayList18;
                            bVar3 = bVar12;
                            i35 = i39;
                            i30 = i6114;
                            str = str;
                        }
                        i14 = i30;
                        str2 = str;
                        l22.b bVar13 = bVar3;
                        i53.f fVarJ15 = i53.a.j(h0.G0(arrayList6));
                        a81.f fVar16 = a81.f.f1960a;
                        String string1119 = bVar13.getString(R.string.lbl_distance);
                        if (z17) {
                            i36 = R.string.lbl_km;
                        } else {
                            i36 = R.string.lbl_mile;
                        }
                        String strA116 = bVar13.a(R.string.string_space_string_bracket_pattern, string1119, bVar13.getString(i36));
                        int i6116 = i34;
                        String string28 = bVar13.getString(i6116);
                        if (z17) {
                            i37 = R.string.lbl_pace_unit_km;
                        } else {
                            i37 = R.string.lbl_pace_unit_mi;
                        }
                        String string29 = bVar13.getString(i37);
                        List<Float> list11116 = iVar2.f123874i;
                        List<Float> list11117 = iVar2.f123876k;
                        List<Float> list11118 = iVar2.f123875j;
                        List<Float> listB4 = iVar2.b();
                        int iA14 = v.a(iVar2.b());
                        w13.c cVar17 = zp1.a.f206594h;
                        arrayList7 = new ArrayList(y.r(cVar17, 10));
                        it8 = cVar17.iterator();
                        while (it8.hasNext()) {
                            arrayList7.add(Integer.valueOf(((zp1.a) it8.next()).f206597c));
                        }
                        a81.j jVar17 = new a81.j(z17, 4);
                        a81.j jVar18 = new a81.j(z17, 5);
                        a81.k kVar5 = new a81.k(bVar13, z17, 2);
                        fVar16.getClass();
                        bVar3 = bVar13;
                        g81.e eVarC8 = a81.f.c(bVar3, strA116, string28, string29, false, list11116, list11117, list11118, listB4, arrayList7, iA14, jVar17, jVar18, kVar5);
                        c22.i iVarB1119 = c22.i.b(R.string.lbl_pace);
                        c22.i iVarB210 = c22.i.b(R.string.lbl_zone);
                        c22.i iVarB211 = c22.i.b(i6116);
                        if (z17) {
                            i29 = R.string.lbl_minute_per_km;
                        }
                        c22.i iVarB212 = c22.i.b(i29);
                        c22.i iVarB213 = c22.i.b(R.string.lbl_distance);
                        if (z17) {
                            i38 = R.string.lbl_km;
                        } else {
                            i38 = R.string.lbl_mile;
                        }
                        n0Var4 = new n0(iVarB1119, null, new o0(iVarB210, iVarB211, iVarB212, iVarB213, c22.i.b(i38), fVarJ15), eVarC8, 2, null);
                    }
                } else {
                    i14 = i30;
                    str2 = "";
                    n0Var4 = th4;
                }
                new g81.f(n0Var3, n0Var4);
            } else {
                list2 = list;
                bVar3 = bVar2;
                str2 = "";
                th4 = null;
                i14 = R.string.lbl_hours_minutes_seconds_abbreviated;
                fVar = null;
            }
            if (list2 != null) {
                v.f1974a.getClass();
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = th4;
                        break;
                    }
                    next2 = it.next();
                } while (((n61.i) next2).f123869d != 2);
                iVar = (n61.i) next2;
                if (iVar != null) {
                    list5 = iVar.f123872g;
                    list6 = iVar.f123876k;
                    if (zf.b.Q(iVar)) {
                        str3 = str2;
                        i15 = R.string.common_watts;
                        i16 = R.string.activity_details_power;
                        n0Var = th4;
                    } else {
                        List listN16 = h0.N0(h0.b1(zp1.a.f206594h), new q());
                        arrayList4 = new ArrayList(y.r(listN16, 10));
                        it5 = listN16.iterator();
                        i26 = 0;
                        while (it5.hasNext()) {
                            next4 = it5.next();
                            i27 = i26 + 1;
                            if (i26 >= 0) {
                                x.q();
                                throw th4;
                            }
                            aVar2 = (zp1.a) next4;
                            int i6117 = i26 * 2;
                            int i7110 = i6117 + 1;
                            if (aVar2.f206595a != zp1.a.MAXIMUM.f206595a) {
                                i28 = 1;
                            } else {
                                i28 = 0;
                            }
                            float fFloatValue11 = list5.get(i7110).floatValue();
                            List<Float> list11119 = list5;
                            double dFloatValue115 = ((double) list6.get(i6117 + 2).floatValue()) - ((double) i28);
                            float fFloatValue12 = list6.get(i6117).floatValue();
                            List<Float> list21110 = list6;
                            Iterator it19 = it5;
                            int i7111 = aVar2.f206597c;
                            String string210 = bVar3.getString(aVar2.f206596b);
                            l3.f23124b.getClass();
                            str4 = str2;
                            String strA117 = bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, fFloatValue12, false, str4), l3.a.E0(bVar3, dFloatValue115, false, str4));
                            strE1 = l3.a.e1((long) fFloatValue11);
                            if (strE1 == null) {
                                strE1 = str4;
                            }
                            arrayList4.add(new m0(i7111, string210, strA117, strE1));
                            str2 = str4;
                            list6 = list21110;
                            list5 = list11119;
                            it5 = it19;
                            i26 = i27;
                        }
                        List<Float> list21111 = list5;
                        String str15 = str2;
                        i15 = R.string.common_watts;
                        i16 = R.string.activity_details_power;
                        i53.f fVarJ16 = i53.a.j(h0.G0(arrayList4));
                        c22.i iVarB214 = c22.i.b(R.string.activity_details_power);
                        o0 o0Var7 = new o0(c22.i.b(R.string.lbl_zone), c22.i.b(R.string.lbl_stamina_power_range), c22.i.b(R.string.common_watts), c22.i.b(R.string.lbl_time), c22.i.b(i14), fVarJ16);
                        a81.f fVar17 = a81.f.f1960a;
                        String strA118 = bVar3.a(R.string.string_space_string_bracket_pattern, bVar3.getString(R.string.lbl_time), bVar3.getString(i14));
                        String string211 = bVar3.getString(R.string.lbl_stamina_power_range);
                        String string11110 = bVar3.getString(R.string.lbl_watts);
                        List<Float> list21112 = iVar.f123874i;
                        List<Float> list21113 = iVar.f123876k;
                        List<Float> list21114 = iVar.f123875j;
                        int iA15 = v.a(list21111);
                        w13.c cVar18 = zp1.a.f206594h;
                        arrayList5 = new ArrayList(y.r(cVar18, 10));
                        it6 = cVar18.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(Integer.valueOf(((zp1.a) it6.next()).f206597c));
                        }
                        a03.h hVar14 = new a03.h(29);
                        a81.h hVar15 = new a81.h(bVar3, 3);
                        fVar17.getClass();
                        str3 = str15;
                        n0Var = new n0(iVarB214, null, o0Var7, a81.f.c(bVar3, strA118, string211, string11110, true, list21112, list21113, list21114, list21111, arrayList5, iA15, hVar14, hVar15, null), 2, null);
                    }
                } else {
                    str3 = str2;
                    i15 = R.string.common_watts;
                    i16 = R.string.activity_details_power;
                    n0Var = th4;
                }
                if (iVar != null) {
                    list3 = iVar.f123873h;
                    list4 = iVar.f123876k;
                    if (zf.b.m(iVar)) {
                        pVar5 = pVar2;
                        n0Var2 = th4;
                    } else {
                        z16 = am.j.z(f12.l.f68084a);
                        List listN17 = h0.N0(h0.b1(zp1.a.f206594h), new a81.p());
                        arrayList2 = new ArrayList(y.r(listN17, 10));
                        it3 = listN17.iterator();
                        i17 = 0;
                        while (it3.hasNext()) {
                            next3 = it3.next();
                            i24 = i17 + 1;
                            if (i17 >= 0) {
                                x.q();
                                throw th4;
                            }
                            aVar = (zp1.a) next3;
                            int i7112 = i17 * 2;
                            int i7113 = i7112 + 1;
                            Iterator it110 = it3;
                            if (aVar.f206595a != zp1.a.MAXIMUM.f206595a) {
                                i25 = 1;
                            } else {
                                i25 = 0;
                            }
                            double dFloatValue116 = list3.get(i7113).floatValue();
                            List<Float> list21115 = list3;
                            double dFloatValue117 = ((double) list4.get(i7112 + 2).floatValue()) - ((double) i25);
                            double dFloatValue118 = list4.get(i7112).floatValue();
                            int i7114 = aVar.f206597c;
                            String string11111 = bVar3.getString(aVar.f206596b);
                            l3.f23124b.getClass();
                            arrayList2.add(new m0(i7114, string11111, bVar3.a(R.string.string_line_string_pattern, l3.a.E0(bVar3, dFloatValue118, false, str3), l3.a.E0(bVar3, dFloatValue117, false, str3)), l3.a.S(bVar3, dFloatValue116, l3.f23125c, false, z16)));
                            i17 = i24;
                            it3 = it110;
                            list3 = list21115;
                            list4 = list4;
                            pVar2 = pVar2;
                        }
                        pVar5 = pVar2;
                        List<Float> list21116 = list3;
                        i53.f fVarJ17 = i53.a.j(h0.G0(arrayList2));
                        c22.i iVarB11110 = c22.i.b(i16);
                        c22.i iVarB11111 = c22.i.b(R.string.lbl_stamina_distance_estimate_disclaimer);
                        c22.i iVarB11112 = c22.i.b(R.string.lbl_zone);
                        c22.i iVarB11113 = c22.i.b(R.string.lbl_stamina_power_range);
                        c22.i iVarB11114 = c22.i.b(i15);
                        c22.i iVarB11115 = c22.i.b(R.string.lbl_distance);
                        if (z16) {
                            i18 = R.string.lbl_km;
                        } else {
                            i18 = R.string.lbl_mile;
                        }
                        o0 o0Var8 = new o0(iVarB11112, iVarB11113, iVarB11114, iVarB11115, c22.i.b(i18), fVarJ17);
                        a81.f fVar18 = a81.f.f1960a;
                        String string11112 = bVar3.getString(R.string.lbl_distance);
                        if (z16) {
                            i19 = R.string.lbl_km;
                        } else {
                            i19 = R.string.lbl_mile;
                        }
                        String strA119 = bVar3.a(R.string.string_space_string_bracket_pattern, string11112, bVar3.getString(i19));
                        String string11113 = bVar3.getString(R.string.lbl_stamina_power_range);
                        String string11114 = bVar3.getString(R.string.lbl_watts);
                        List<Float> list21117 = iVar.f123874i;
                        List<Float> list21118 = iVar.f123876k;
                        List<Float> list21119 = iVar.f123875j;
                        int iA16 = v.a(list21116);
                        w13.c cVar19 = zp1.a.f206594h;
                        arrayList3 = new ArrayList(y.r(cVar19, 10));
                        it4 = cVar19.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(Integer.valueOf(((zp1.a) it4.next()).f206597c));
                        }
                        a81.j jVar19 = new a81.j(z16, 1);
                        a81.h hVar16 = new a81.h(bVar3, 1);
                        fVar18.getClass();
                        n0Var2 = new n0(iVarB11110, iVarB11111, o0Var8, a81.f.c(bVar3, strA119, string11113, string11114, true, list21117, list21118, list21119, list21116, arrayList3, iA16, jVar19, hVar16, null));
                    }
                } else {
                    pVar5 = pVar2;
                    n0Var2 = th4;
                }
                fVar2 = new g81.f(n0Var, n0Var2);
            } else {
                pVar5 = pVar2;
                fVar2 = th4;
            }
            if (z14) {
                fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors), c22.i.b(R.string.lbl_running_stamina), c22.i.b(R.string.lbl_cycling_stamina));
            } else {
                fVarA = i53.a.a(c22.i.b(R.string.lbl_endurance_score), c22.i.b(R.string.lbl_top_contributors));
            }
            return new g81.c(pVar5, fVar, fVar2, fVarA);
        }
        return aVar5;
    }
}
