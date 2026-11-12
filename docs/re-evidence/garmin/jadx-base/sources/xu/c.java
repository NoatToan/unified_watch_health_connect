package xu;

import am.j;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.badges.service.model.h;
import com.garmin.android.apps.connectmobile.badges.service.model.i;
import com.garmin.android.apps.connectmobile.badges.service.model.o;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import d53.w;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import lc.u0;
import o13.r;
import org.apache.commons.lang3.StringEscapeUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zy0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxu/c;", "", "Lav/e;", "badgeTranslationsRepo", "<init>", "(Lav/e;)V", "a", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f192210d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.e f192211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f192212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f192213c;

    static {
        new a(null);
    }

    public c(av.e eVar) {
        eVar.getClass();
        this.f192211a = eVar;
        this.f192213c = new h();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, v13.c cVar) {
        d dVar;
        String str3;
        v2<T> v2Var;
        Object objB;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f192218e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f192218e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        d dVar2 = dVar;
        Object objA = dVar2.f192216c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f192218e;
        av.e eVar = this.f192211a;
        if (i15 == 0) {
            r.b(objA);
            dVar2.f192214a = str;
            dVar2.f192215b = str2;
            dVar2.f192218e = 1;
            objA = eVar.a(str, dVar2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            str2 = dVar2.f192215b;
            str = dVar2.f192214a;
            r.b(objA);
        } else {
            if (i15 == 2) {
                r.b(objA);
                return objA;
            }
            if (i15 != 3) {
                if (i15 == 4) {
                    r.b(objA);
                    return objA;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = dVar2.f192215b;
            r.b(objA);
        }
        v2Var = ((p) objA).f207459a;
        if (v2Var instanceof v2.b) {
            if (v2Var instanceof v2.a) {
                v2.a aVar = (v2.a) v2Var;
                return new v2.a(aVar.f47383a, aVar.f47384b, null, 4, null);
            }
            u0.r();
            return null;
        }
        String str4 = (String) ((v2.b) v2Var).f47386a;
        e23.p fVar = new f(v2Var, null);
        dVar2.f192214a = null;
        dVar2.f192215b = null;
        dVar2.f192218e = 4;
        objB = b(str4, str3, str3, fVar, dVar2);
        if (objB != obj) {
            return obj;
        }
        return objB;
        v2<T> v2Var2 = ((p) objA).f207459a;
        if (v2Var2 instanceof v2.b) {
            String str5 = (String) ((v2.b) v2Var2).f47386a;
            e23.p eVar2 = new e(v2Var2, null);
            dVar2.f192214a = null;
            dVar2.f192215b = null;
            dVar2.f192218e = 2;
            Object objB2 = b(str5, str, str2, eVar2, dVar2);
            if (objB2 != obj) {
                return objB2;
            }
        } else {
            String str6 = str2;
            String str7 = str;
            str3 = str6;
            if (!(v2Var2 instanceof v2.a)) {
                u0.r();
                return null;
            }
            if (s.g(str7, str3)) {
                v2.a aVar2 = (v2.a) v2Var2;
                return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
            }
            dVar2.f192214a = null;
            dVar2.f192215b = str3;
            dVar2.f192218e = 3;
            int i16 = av.e.f13079d;
            objA = eVar.a(str3, dVar2);
            if (objA != obj) {
                v2Var = ((p) objA).f207459a;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        v2.a aVar3 = (v2.a) v2Var;
                        return new v2.a(aVar3.f47383a, aVar3.f47384b, null, 4, null);
                    }
                    u0.r();
                    return null;
                }
                String str8 = (String) ((v2.b) v2Var).f47386a;
                e23.p fVar2 = new f(v2Var, null);
                dVar2.f192214a = null;
                dVar2.f192215b = null;
                dVar2.f192218e = 4;
                objB = b(str8, str3, str3, fVar2, dVar2);
                if (objB != obj) {
                    return objB;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x0301  */
    /* JADX WARN: Code duplicated, block: B:183:0x0305  */
    /* JADX WARN: Code duplicated, block: B:184:0x031e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0336  */
    /* JADX WARN: Code duplicated, block: B:189:0x033a  */
    /* JADX WARN: Code duplicated, block: B:191:0x033e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0350  */
    /* JADX WARN: Code duplicated, block: B:202:0x0378  */
    /* JADX WARN: Code duplicated, block: B:207:0x0386  */
    /* JADX WARN: Code duplicated, block: B:212:0x0394  */
    /* JADX WARN: Code duplicated, block: B:217:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:227:0x03be  */
    /* JADX WARN: Code duplicated, block: B:232:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:237:0x03da  */
    /* JADX WARN: Code duplicated, block: B:245:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:251:0x0421  */
    /* JADX WARN: Code duplicated, block: B:252:0x0424  */
    /* JADX WARN: Code duplicated, block: B:256:0x0449 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:257:0x044a  */
    /* JADX WARN: Code duplicated, block: B:260:0x0459 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:261:0x045a  */
    /* JADX WARN: Code duplicated, block: B:269:0x047b  */
    /* JADX WARN: Code duplicated, block: B:272:0x048e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:273:0x048f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0494  */
    /* JADX WARN: Code duplicated, block: B:278:0x04a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:279:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:280:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:283:0x04b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:294:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:183:0x0305, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, String str2, String str3, e23.p pVar, v13.c cVar) {
        g gVar;
        i iVar;
        String string;
        BufferedReader bufferedReader;
        String str4;
        String strN;
        Object objInvoke;
        i iVar2;
        Object objInvoke2;
        HashMap map;
        i iVar3;
        String str5;
        Object objInvoke3;
        boolean z14;
        String str6;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar2;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar3;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        e23.p pVar2;
        v2 v2Var;
        Object objInvoke4;
        Object objInvoke5;
        String strV = str;
        e23.p pVar3 = pVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f192227e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f192227e = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objA = gVar.f192225c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        switch (gVar.f192227e) {
            case 0:
                r.b(objA);
                this.f192213c.getClass();
                HashMap map2 = new HashMap();
                o oVar = new o(null, null, null, null, 15, null);
                int i15 = 0;
                int i16 = 1;
                if (strV != null) {
                    try {
                        if (w.z(strV, "\\n", false)) {
                            strV = u.v(strV, "\\n", "\n", false);
                        }
                        String str15 = "";
                        BufferedReader bufferedReader2 = new BufferedReader(new StringReader(strV));
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line != null) {
                                str15 = line;
                            }
                            if (line == null) {
                                iVar = new i();
                                iVar.f30586b = oVar;
                                iVar.f30588d = null;
                                str2 = str2;
                                iVar.f30587c = str2;
                                for (Map.Entry entry : map2.entrySet()) {
                                    String str16 = (String) entry.getKey();
                                    com.garmin.android.apps.connectmobile.badges.service.model.g gVar4 = (com.garmin.android.apps.connectmobile.badges.service.model.g) entry.getValue();
                                    iVar.f30585a.put(str16, gVar4);
                                    if (gVar4.b()) {
                                        iVar.f30589e = true;
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str4 = "default";
                                } else {
                                    str4 = str2;
                                }
                                if (iVar != null) {
                                    strN = "Badge translations processed for language " + str4 + " with missingTranslations=" + iVar.f30589e;
                                } else {
                                    strN = fb1.c.n("Badge translations couldn't be processed for language ", str4);
                                }
                                a2 a2Var = a2.BADGES;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var, "BadgeTranslationsDataUseCase", strN);
                                if (s.g(str2, str3)) {
                                    iVar2 = this.f192212b;
                                    if (iVar2 != null) {
                                        map = iVar2.f30585a;
                                        if (iVar != null) {
                                            map.getClass();
                                            z14 = false;
                                            for (Map.Entry entry2 : map.entrySet()) {
                                                String str17 = (String) entry2.getKey();
                                                gVar3 = (com.garmin.android.apps.connectmobile.badges.service.model.g) entry2.getValue();
                                                gVarB = iVar.b(str17);
                                                if (gVarB != null && gVar3.b()) {
                                                    str7 = gVar3.f30568a;
                                                    if (str7 != null || str7.length() == 0) {
                                                        gVar3.f30568a = gVarB.f30568a;
                                                    }
                                                    str8 = gVar3.f30571d;
                                                    if (str8 != null || str8.length() == 0) {
                                                        gVar3.f30571d = gVarB.f30571d;
                                                    }
                                                    str9 = gVar3.f30572e;
                                                    if (str9 != null || str9.length() == 0) {
                                                        gVar3.f30572e = gVarB.f30572e;
                                                    }
                                                    str10 = gVar3.f30573f;
                                                    if (str10 != null || str10.length() == 0) {
                                                        gVar3.f30573f = gVarB.f30573f;
                                                    }
                                                    str11 = gVar3.f30577j;
                                                    if (str11 != null || str11.length() == 0) {
                                                        gVar3.f30577j = gVarB.f30577j;
                                                    }
                                                    str12 = gVar3.f30578k;
                                                    if (str12 != null || str12.length() == 0) {
                                                        gVar3.f30578k = gVarB.f30578k;
                                                    }
                                                    str13 = gVar3.f30579l;
                                                    if (str13 != null || str13.length() == 0) {
                                                        gVar3.f30579l = gVarB.f30579l;
                                                    }
                                                    str14 = gVar3.f30580m;
                                                    if (str14 != null || str14.length() == 0) {
                                                        gVar3.f30580m = gVarB.f30580m;
                                                    }
                                                }
                                                if (z14 && gVar3.b()) {
                                                    z14 = true;
                                                }
                                            }
                                            HashMap map3 = iVar.f30585a;
                                            map3.getClass();
                                            for (Map.Entry entry3 : map3.entrySet()) {
                                                str6 = (String) entry3.getKey();
                                                gVar2 = (com.garmin.android.apps.connectmobile.badges.service.model.g) entry3.getValue();
                                                if (iVar2.b(str6) == null) {
                                                    gVar2.getClass();
                                                    map.put(str6, gVar2);
                                                }
                                            }
                                            iVar2.f30589e = z14;
                                        }
                                        iVar3 = this.f192212b;
                                        if (iVar3 != null) {
                                            str5 = iVar3.f30587c;
                                        } else {
                                            str5 = null;
                                        }
                                        String strM = j.m("Returning badge translations processed for language ", str5, " with default translations");
                                        a2 a2Var2 = a2.BADGES;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var2, "BadgeTranslationsDataUseCase", strM);
                                        i iVar4 = this.f192212b;
                                        gVar.f192223a = null;
                                        gVar.f192224b = null;
                                        gVar.f192227e = 1;
                                        objInvoke3 = pVar3.invoke(iVar4, gVar);
                                        if (objInvoke3 == obj) {
                                            return objInvoke3;
                                        }
                                    } else {
                                        gVar.f192223a = null;
                                        gVar.f192224b = null;
                                        gVar.f192227e = 2;
                                        objInvoke2 = pVar3.invoke(iVar, gVar);
                                        if (objInvoke2 == obj) {
                                            return objInvoke2;
                                        }
                                    }
                                } else if (iVar == null && iVar.f30589e) {
                                    this.f192212b = iVar;
                                    gVar.f192223a = (v13.i) pVar3;
                                    gVar.f192224b = iVar;
                                    gVar.f192227e = 3;
                                    objA = a(str3, str3, gVar);
                                    if (objA != obj) {
                                        pVar2 = pVar3;
                                        v2Var = (v2) objA;
                                        if (v2Var instanceof v2.b) {
                                            T t7 = ((v2.b) v2Var).f47386a;
                                            gVar.f192223a = null;
                                            gVar.f192224b = null;
                                            gVar.f192227e = 4;
                                            objInvoke5 = pVar2.invoke(t7, gVar);
                                            if (objInvoke5 == obj) {
                                                return objInvoke5;
                                            }
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            gVar.f192223a = null;
                                            gVar.f192224b = null;
                                            gVar.f192227e = 5;
                                            objInvoke4 = pVar2.invoke(iVar, gVar);
                                            if (objInvoke4 == obj) {
                                                return objInvoke4;
                                            }
                                        }
                                    }
                                } else {
                                    gVar.f192223a = null;
                                    gVar.f192224b = null;
                                    gVar.f192227e = 6;
                                    objInvoke = pVar3.invoke(iVar, gVar);
                                    if (objInvoke != obj) {
                                        return objInvoke;
                                    }
                                }
                                pVar2 = pVar3;
                                return obj;
                            }
                            if (w.A(str15, '\\')) {
                                String strUnescapeJava = StringEscapeUtils.unescapeJava(str15);
                                strUnescapeJava.getClass();
                                int length = strUnescapeJava.length() - i16;
                                int i17 = i15;
                                int i18 = i17;
                                while (i17 <= length) {
                                    int i19 = s.h(strUnescapeJava.charAt(i18 == 0 ? i17 : length), 32) <= 0 ? i16 : 0;
                                    if (i18 == 0) {
                                        if (i19 == 0) {
                                            i18 = i16;
                                        } else {
                                            i17++;
                                        }
                                    } else if (i19 == 0) {
                                        string = strUnescapeJava.subSequence(i17, length + 1).toString();
                                    } else {
                                        length--;
                                    }
                                }
                                string = strUnescapeJava.subSequence(i17, length + 1).toString();
                            } else {
                                int length2 = str15.length() - i16;
                                int i24 = 0;
                                int i25 = 0;
                                while (i24 <= length2) {
                                    int i26 = s.h(str15.charAt(i25 == 0 ? i24 : length2), 32) <= 0 ? i16 : 0;
                                    if (i25 == 0) {
                                        if (i26 == 0) {
                                            i25 = i16;
                                        } else {
                                            i24++;
                                        }
                                    } else if (i26 == 0) {
                                        string = str15.subSequence(i24, length2 + 1).toString();
                                    } else {
                                        length2--;
                                    }
                                }
                                string = str15.subSequence(i24, length2 + 1).toString();
                            }
                            String[] strArr = h.f30584a;
                            int length3 = strArr.length;
                            int i27 = 0;
                            while (i27 < length3) {
                                String str18 = strArr[i27];
                                k7.d dVarA = h.a(string, str18);
                                if (dVarA != null) {
                                    String str19 = (String) dVarA.f103262a;
                                    String str20 = (String) dVarA.f103263b;
                                    com.garmin.android.apps.connectmobile.badges.service.model.g gVar5 = (com.garmin.android.apps.connectmobile.badges.service.model.g) map2.get(str19);
                                    com.garmin.android.apps.connectmobile.badges.service.model.g gVar6 = gVar5 == null ? new com.garmin.android.apps.connectmobile.badges.service.model.g(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : gVar5;
                                    switch (str18.hashCode()) {
                                        case -2075726636:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("expedition_details_desc_1_climb")) {
                                                oVar.f30642b = str20;
                                            }
                                            break;
                                        case -1945180171:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_reward_details_")) {
                                                gVar6.f30575h = str20;
                                            }
                                            break;
                                        case -1551461395:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_redeem_reward_header_")) {
                                                gVar6.f30581n = str20;
                                            }
                                            break;
                                        case -1339078836:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_rules_summary_additional_subhead_1_")) {
                                                gVar6.f30579l = str20;
                                            }
                                            break;
                                        case -1050149040:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_reward_terms_")) {
                                                gVar6.f30576i = str20;
                                            }
                                            break;
                                        case -1048256455:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_rules_summary_")) {
                                                gVar6.f30573f = str20;
                                            }
                                            break;
                                        case -1012600417:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("expedition_details_desc_2")) {
                                                oVar.f30643c = str20;
                                            }
                                            break;
                                        case -1012600416:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("expedition_details_desc_3")) {
                                                oVar.f30644d = str20;
                                            }
                                            break;
                                        case -844188975:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_additional_rule_1_")) {
                                                gVar6.f30577j = str20;
                                            }
                                            break;
                                        case -844188944:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_additional_rule_2_")) {
                                                gVar6.f30578k = str20;
                                            }
                                            break;
                                        case -700742946:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_range_")) {
                                                gVar6.f30570c = str20;
                                                gVar6.f30571d = str20;
                                            }
                                            break;
                                        case -635912925:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_title_")) {
                                                gVar6.f30568a = str20;
                                            }
                                            break;
                                        case -197497827:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_redeem_reward_message_")) {
                                                gVar6.f30582o = str20;
                                            }
                                            break;
                                        case 903018524:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("expedition_details_desc_1_hike")) {
                                                oVar.f30641a = str20;
                                            }
                                            break;
                                        case 1091767039:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_description_")) {
                                                gVar6.f30571d = str20;
                                            }
                                            break;
                                        case 1242522876:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_rule_earn_")) {
                                                gVar6.f30574g = str20;
                                            }
                                            break;
                                        case 1268195999:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_redeem_reward_footer_")) {
                                                gVar6.f30583p = str20;
                                            }
                                            break;
                                        case 1446085223:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_rules_summary_additional_section_1_")) {
                                                gVar6.f30580m = str20;
                                            }
                                            break;
                                        case 1557134766:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_location_")) {
                                                gVar6.f30569b = str20;
                                            }
                                            break;
                                        case 1565626574:
                                            bufferedReader = bufferedReader2;
                                            if (str18.equals("badge_challenge_rule_description_")) {
                                                gVar6.f30572e = str20;
                                            }
                                            break;
                                        default:
                                            bufferedReader = bufferedReader2;
                                            break;
                                    }
                                    map2.put(str19, gVar6);
                                } else {
                                    bufferedReader = bufferedReader2;
                                }
                                i27++;
                                bufferedReader2 = bufferedReader;
                                i16 = 1;
                            }
                            i15 = 0;
                        }
                    } catch (Throwable th3) {
                        i2.a aVar = i2.f36769a;
                        a2 a2Var3 = a2.BADGES;
                        aVar.getClass();
                        i2.a.g(a2Var3, "BadgeTranslationsManager", th3);
                        iVar = null;
                    }
                }
                iVar = null;
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = "default";
                }
                if (iVar != null) {
                    strN = "Badge translations processed for language " + str4 + " with missingTranslations=" + iVar.f30589e;
                } else {
                    strN = fb1.c.n("Badge translations couldn't be processed for language ", str4);
                }
                a2 a2Var4 = a2.BADGES;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "BadgeTranslationsDataUseCase", strN);
                if (s.g(str2, str3)) {
                    iVar2 = this.f192212b;
                    if (iVar2 != null) {
                        map = iVar2.f30585a;
                        if (iVar != null) {
                            map.getClass();
                            z14 = false;
                            while (r7.hasNext()) {
                                String str110 = (String) entry2.getKey();
                                gVar3 = (com.garmin.android.apps.connectmobile.badges.service.model.g) entry2.getValue();
                                gVarB = iVar.b(str110);
                                if (gVarB != null) {
                                    str7 = gVar3.f30568a;
                                    if (str7 != null) {
                                        gVar3.f30568a = gVarB.f30568a;
                                    } else {
                                        gVar3.f30568a = gVarB.f30568a;
                                    }
                                    str8 = gVar3.f30571d;
                                    if (str8 != null) {
                                        gVar3.f30571d = gVarB.f30571d;
                                    } else {
                                        gVar3.f30571d = gVarB.f30571d;
                                    }
                                    str9 = gVar3.f30572e;
                                    if (str9 != null) {
                                        gVar3.f30572e = gVarB.f30572e;
                                    } else {
                                        gVar3.f30572e = gVarB.f30572e;
                                    }
                                    str10 = gVar3.f30573f;
                                    if (str10 != null) {
                                        gVar3.f30573f = gVarB.f30573f;
                                    } else {
                                        gVar3.f30573f = gVarB.f30573f;
                                    }
                                    str11 = gVar3.f30577j;
                                    if (str11 != null) {
                                        gVar3.f30577j = gVarB.f30577j;
                                    } else {
                                        gVar3.f30577j = gVarB.f30577j;
                                    }
                                    str12 = gVar3.f30578k;
                                    if (str12 != null) {
                                        gVar3.f30578k = gVarB.f30578k;
                                    } else {
                                        gVar3.f30578k = gVarB.f30578k;
                                    }
                                    str13 = gVar3.f30579l;
                                    if (str13 != null) {
                                        gVar3.f30579l = gVarB.f30579l;
                                    } else {
                                        gVar3.f30579l = gVarB.f30579l;
                                    }
                                    str14 = gVar3.f30580m;
                                    if (str14 != null) {
                                        gVar3.f30580m = gVarB.f30580m;
                                    } else {
                                        gVar3.f30580m = gVarB.f30580m;
                                    }
                                }
                                if (z14) {
                                }
                            }
                            HashMap map4 = iVar.f30585a;
                            map4.getClass();
                            while (r0.hasNext()) {
                                str6 = (String) entry3.getKey();
                                gVar2 = (com.garmin.android.apps.connectmobile.badges.service.model.g) entry3.getValue();
                                if (iVar2.b(str6) == null) {
                                    gVar2.getClass();
                                    map.put(str6, gVar2);
                                }
                            }
                            iVar2.f30589e = z14;
                        }
                        iVar3 = this.f192212b;
                        if (iVar3 != null) {
                            str5 = iVar3.f30587c;
                        } else {
                            str5 = null;
                        }
                        String strM2 = j.m("Returning badge translations processed for language ", str5, " with default translations");
                        a2 a2Var5 = a2.BADGES;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var5, "BadgeTranslationsDataUseCase", strM2);
                        i iVar5 = this.f192212b;
                        gVar.f192223a = null;
                        gVar.f192224b = null;
                        gVar.f192227e = 1;
                        objInvoke3 = pVar3.invoke(iVar5, gVar);
                        if (objInvoke3 == obj) {
                            return objInvoke3;
                        }
                    } else {
                        gVar.f192223a = null;
                        gVar.f192224b = null;
                        gVar.f192227e = 2;
                        objInvoke2 = pVar3.invoke(iVar, gVar);
                        if (objInvoke2 == obj) {
                            return objInvoke2;
                        }
                    }
                } else if (iVar == null) {
                    gVar.f192223a = null;
                    gVar.f192224b = null;
                    gVar.f192227e = 6;
                    objInvoke = pVar3.invoke(iVar, gVar);
                    if (objInvoke != obj) {
                        return objInvoke;
                    }
                } else {
                    gVar.f192223a = null;
                    gVar.f192224b = null;
                    gVar.f192227e = 6;
                    objInvoke = pVar3.invoke(iVar, gVar);
                    if (objInvoke != obj) {
                        return objInvoke;
                    }
                }
                pVar2 = pVar3;
                return obj;
            case 1:
                r.b(objA);
                return objA;
            case 2:
                r.b(objA);
                return objA;
            case 3:
                iVar = gVar.f192224b;
                e23.p pVar4 = (e23.p) gVar.f192223a;
                r.b(objA);
                pVar2 = pVar4;
                pVar2 = pVar3;
                v2Var = (v2) objA;
                if (v2Var instanceof v2.b) {
                    T t14 = ((v2.b) v2Var).f47386a;
                    gVar.f192223a = null;
                    gVar.f192224b = null;
                    gVar.f192227e = 4;
                    objInvoke5 = pVar2.invoke(t14, gVar);
                    if (objInvoke5 == obj) {
                        return objInvoke5;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    gVar.f192223a = null;
                    gVar.f192224b = null;
                    gVar.f192227e = 5;
                    objInvoke4 = pVar2.invoke(iVar, gVar);
                    if (objInvoke4 == obj) {
                        return objInvoke4;
                    }
                }
                pVar2 = pVar3;
                return obj;
            case 4:
                r.b(objA);
                return objA;
            case 5:
                r.b(objA);
                return objA;
            case 6:
                r.b(objA);
                return objA;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxu/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
