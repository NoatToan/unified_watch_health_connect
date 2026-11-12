package defpackage;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.alipay.sdk.m.s.e;
import com.apprichtap.haptic.b.a.c;
import com.huawei.openalliance.ad.constant.VastTag;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

/* JADX INFO: loaded from: classes4.dex */
public class pm {
    private static int d(int i, int i2) {
        if (i2 < 41 || i2 > 68) {
            if (i <= 0 || i >= 50) {
                return (i < 50 || i > 100) ? 0 : 15;
            }
            return 10;
        }
        if (i > 0 && i < 50) {
            return 15;
        }
        if (i < 50 || i >= 75) {
            return (i < 75 || i > 100) ? 0 : 30;
        }
        return 20;
    }

    private static int e(int i) {
        if (i <= 50 || i >= 100) {
            return i > 100 ? i - 50 : i;
        }
        return 50;
    }

    private static int e(int i, int i2) {
        if (-1 != i2) {
            if (30 > i2) {
                return 0;
            }
            if (100 >= i2) {
                return i;
            }
        }
        return 100;
    }

    private static String g(String str, int i) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<pf> arrayList;
        ArrayList<pf> arrayList2;
        List<pf> listSubList;
        ArrayList<pl> arrayList3;
        try {
            po.e.d("HEFileUtils", "shrinkHe20String:" + i);
            if (d(str) - i <= 500) {
                po.e.e("HEFileUtils", "shrinkHe20String, too closed!");
                return str;
            }
            pn pnVarB = b(str);
            if (!pq.d(pnVarB)) {
                po.e.a("HEFileUtils", "shrinkHe20String(), invalid HE20");
                return null;
            }
            po.e.d("HEFileUtils", "shrinkHe20String() original pattern count:" + pnVarB.f45702a.size());
            Iterator<pl> it = pnVarB.f45702a.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    iIndexOf2 = -1;
                    break;
                }
                pl next = it.next();
                ArrayList<pf> arrayList4 = next.e;
                if (arrayList4 != null) {
                    for (pf pfVar : arrayList4) {
                        ph phVar = pfVar.f45262a;
                        if (phVar != null && phVar.e + phVar.f45344b + next.f45580c >= i) {
                            iIndexOf = next.e.indexOf(pfVar);
                            iIndexOf2 = pnVarB.f45702a.indexOf(next);
                            break loop0;
                        }
                    }
                }
            }
            po.e.d("HEFileUtils", "shrinkHe20String targetPatternListItemIndex:" + iIndexOf2 + ", targetPatternItemIndex:" + iIndexOf);
            if (-1 != iIndexOf2 && -1 != iIndexOf) {
                if (iIndexOf != 0 || iIndexOf2 != 0) {
                    if (iIndexOf != 0 || iIndexOf2 <= 0) {
                        if (iIndexOf > 0 && iIndexOf2 == 0) {
                            ArrayList<pl> arrayList5 = pnVarB.f45702a;
                            arrayList5.subList(iIndexOf2 + 1, arrayList5.size()).clear();
                            ArrayList<pl> arrayList6 = pnVarB.f45702a;
                            arrayList = arrayList6.get(arrayList6.size() - 1).e;
                            ArrayList<pl> arrayList7 = pnVarB.f45702a;
                            arrayList2 = arrayList7.get(arrayList7.size() - 1).e;
                        } else if (iIndexOf > 0 && iIndexOf2 > 0) {
                            ArrayList<pl> arrayList8 = pnVarB.f45702a;
                            arrayList8.subList(iIndexOf2 + 1, arrayList8.size()).clear();
                            ArrayList<pl> arrayList9 = pnVarB.f45702a;
                            arrayList = arrayList9.get(arrayList9.size() - 1).e;
                            ArrayList<pl> arrayList10 = pnVarB.f45702a;
                            arrayList2 = arrayList10.get(arrayList10.size() - 1).e;
                        }
                        listSubList = arrayList.subList(iIndexOf, arrayList2.size());
                        listSubList.clear();
                    } else {
                        arrayList3 = pnVarB.f45702a;
                    }
                    po.e.d("HEFileUtils", "shrinkHe20String()  pattern count:" + pnVarB.f45702a.size());
                    pl plVar = new pl();
                    plVar.f45580c = i + (-48);
                    plVar.e = new ArrayList<>();
                    ph phVar2 = new ph();
                    pg pgVar = new pg();
                    phVar2.d = pgVar;
                    pgVar.d = 0;
                    pgVar.e = 0;
                    phVar2.f45343a = "transient";
                    pf pfVar2 = new pf();
                    pfVar2.f45262a = phVar2;
                    plVar.e.add(pfVar2);
                    pnVarB.f45702a.add(plVar);
                    String strD = d(pnVarB);
                    po.a("shrink20string_in.he", str);
                    po.a("shrink20string_out.he", strD);
                    return strD;
                }
                arrayList3 = pnVarB.f45702a;
                listSubList = arrayList3.subList(iIndexOf2, arrayList3.size());
                listSubList.clear();
                po.e.d("HEFileUtils", "shrinkHe20String()  pattern count:" + pnVarB.f45702a.size());
                pl plVar2 = new pl();
                plVar2.f45580c = i + (-48);
                plVar2.e = new ArrayList<>();
                ph phVar3 = new ph();
                pg pgVar2 = new pg();
                phVar3.d = pgVar2;
                pgVar2.d = 0;
                pgVar2.e = 0;
                phVar3.f45343a = "transient";
                pf pfVar3 = new pf();
                pfVar3.f45262a = phVar3;
                plVar2.e.add(pfVar3);
                pnVarB.f45702a.add(plVar2);
                String strD2 = d(pnVarB);
                po.a("shrink20string_in.he", str);
                po.a("shrink20string_out.he", strD2);
                return strD2;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String h(String str) throws Throwable {
        char c2;
        char c3;
        int i;
        int i2;
        int i3;
        po.a("trimOverlapEvent_in.he", str);
        pn pnVarB = b(str);
        if (!pq.d(pnVarB)) {
            return str;
        }
        try {
            for (pl plVar : pnVarB.f45702a) {
                ArrayList<pf> arrayList = plVar.e;
                if (arrayList != null) {
                    Iterator<pf> it = arrayList.iterator();
                    while (true) {
                        c2 = 2;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (2 == it.next().f45262a.f45345c) {
                            it.remove();
                        }
                    }
                    if (1 != plVar.e.size()) {
                        Collections.sort(plVar.e, new a());
                        int i4 = 0;
                        int i5 = 0;
                        int i6 = 1;
                        for (int i7 = 1; i5 <= plVar.e.size() - i7 && i6 <= plVar.e.size() - i7; i7 = 1) {
                            ph phVar = plVar.e.get(i5).f45262a;
                            ph phVar2 = plVar.e.get(i6).f45262a;
                            int i8 = "transient".equals(phVar.f45343a) ? 48 : phVar.f45344b;
                            int i9 = "transient".equals(phVar2.f45343a) ? 48 : phVar2.f45344b;
                            if (phVar2.e < phVar.e + i8) {
                                if (!"continuous".equals(phVar2.f45343a) || (i = phVar2.e + i9) <= (i2 = phVar.e + i8) || (i3 = i - i2) <= 48) {
                                    c3 = c2;
                                    phVar2.f45345c = -1;
                                } else {
                                    ArrayList<pc> arrayList2 = new ArrayList<>();
                                    pc pcVar = new pc();
                                    pcVar.d = i4;
                                    pcVar.f45134c = 0.0d;
                                    pcVar.e = i4;
                                    pc pcVar2 = new pc();
                                    pcVar2.d = i3 / 3;
                                    pcVar2.f45134c = 1.0d;
                                    pcVar2.e = i4;
                                    pc pcVar3 = new pc();
                                    c3 = 2;
                                    pcVar3.d = (i3 / 3) * 2;
                                    pcVar3.f45134c = 1.0d;
                                    pcVar3.e = 0;
                                    pc pcVar4 = new pc();
                                    pcVar4.d = i3;
                                    pcVar4.f45134c = 0.0d;
                                    i4 = 0;
                                    pcVar4.e = 0;
                                    arrayList2.add(pcVar);
                                    arrayList2.add(pcVar2);
                                    arrayList2.add(pcVar3);
                                    arrayList2.add(pcVar4);
                                    phVar2.f45344b = i3;
                                    phVar2.e = phVar.e + i8;
                                    phVar2.d.f45305b = arrayList2;
                                    i5 = i6;
                                }
                                i6++;
                                c2 = c3;
                            } else {
                                i5 = i6;
                                i6++;
                            }
                        }
                        Iterator<pf> it2 = plVar.e.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().f45262a.f45345c < 0) {
                                it2.remove();
                            }
                        }
                    }
                }
            }
            String strD = d(pnVarB);
            po.a("trimOverlapEvent_out.he", strD);
            return strD;
        } catch (Throwable th) {
            po.e.a("HEFileUtils", "trimOverlapEvent " + th.toString());
            return str;
        }
    }

    public static String a(String str, int i) {
        try {
            pn pnVarB = b(str);
            for (int i2 = 0; i2 < pnVarB.f45702a.size(); i2++) {
                for (int i3 = 0; i3 < pnVarB.f45702a.get(i2).e.size(); i3++) {
                    if (pnVarB.f45702a.get(i2).f45580c <= i && pnVarB.f45702a.get(i2).f45580c + pnVarB.f45702a.get(i2).e.get(i3).f45262a.e >= i) {
                        pn pnVar = new pn();
                        pnVar.d = new pj();
                        pnVar.f45702a = new ArrayList<>();
                        pl plVar = new pl();
                        plVar.f45580c = 0;
                        ArrayList<pf> arrayList = new ArrayList<>();
                        plVar.e = arrayList;
                        arrayList.addAll(pnVarB.f45702a.get(i2).e.subList(i3, pnVarB.f45702a.get(i2).e.size()));
                        Iterator<pf> it = plVar.e.iterator();
                        while (it.hasNext()) {
                            ph phVar = it.next().f45262a;
                            phVar.e = (phVar.e + pnVarB.f45702a.get(i2).f45580c) - i;
                        }
                        pnVar.f45702a.add(plVar);
                        return d(pnVar);
                    }
                    if (pnVarB.f45702a.get(i2).f45580c > i) {
                        pn pnVar2 = new pn();
                        pnVar2.d = new pj();
                        pnVar2.f45702a = new ArrayList<>();
                        pl plVar2 = new pl();
                        plVar2.f45580c = 0;
                        plVar2.e = new ArrayList<>();
                        ph phVar2 = new ph();
                        pg pgVar = new pg();
                        phVar2.d = pgVar;
                        pgVar.d = 0;
                        pgVar.e = 0;
                        phVar2.f45343a = "transient";
                        pf pfVar = new pf();
                        pfVar.f45262a = phVar2;
                        plVar2.e.add(pfVar);
                        pnVar2.f45702a.add(plVar2);
                        return d(pnVar2);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String f(String str) {
        pn pnVarB;
        try {
            pnVarB = b(str);
        } catch (Exception e) {
            e.printStackTrace();
            pnVarB = null;
        }
        if (!pq.d(pnVarB)) {
            po.e.e("HEFileUtils", " , trim16pTo4p, invalid HE2.0 string!");
            return "";
        }
        Iterator<pl> it = pnVarB.f45702a.iterator();
        while (it.hasNext()) {
            for (pf pfVar : it.next().e) {
                pg pgVar = pfVar.f45262a.d;
                pgVar.f45305b = c(pgVar.f45305b);
                if (pfVar.f45262a.f45343a.equals("transient")) {
                    pg pgVar2 = pfVar.f45262a.d;
                    int i = pgVar2.e;
                    if (i < 0) {
                        pgVar2.e = 0;
                    } else if (i > 100) {
                        pgVar2.e = 100;
                    }
                }
            }
        }
        return d(pnVarB);
    }

    public static c c(String str, int i) {
        po.e.d("HEFileUtils", "getHeRootFromHeString, HE version:" + i);
        if (i == 1) {
            try {
                return c(str);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        if (i != 2) {
            return null;
        }
        try {
            return b(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int e(String str) {
        try {
            return new JSONObject(str).getJSONObject("Metadata").getInt(e.g);
        } catch (Exception e) {
            po.e.a("HEFileUtils", "getHeVersion ERROR, heString:" + str);
            e.printStackTrace();
            return 0;
        }
    }

    public static pn b(String str) {
        if (2 != e(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            pn pnVar = new pn();
            pnVar.d = new pj();
            pnVar.f45702a = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("PatternList");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                pl plVar = new pl();
                plVar.f45580c = jSONObject2.getInt("AbsoluteTime");
                plVar.e = new ArrayList<>();
                JSONArray jSONArray2 = jSONObject2.getJSONArray("Pattern");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i2);
                    pf pfVar = new pf();
                    pfVar.f45262a = new ph();
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("Event");
                    pfVar.f45262a.f45343a = jSONObject4.getString(FaqConstants.FAQ_UPLOAD_FLAG);
                    if ("continuous".equals(pfVar.f45262a.f45343a)) {
                        pfVar.f45262a.f45344b = jSONObject4.getInt(VastTag.DURATION);
                    } else if ("transient".equals(pfVar.f45262a.f45343a)) {
                        pfVar.f45262a.f45344b = 48;
                    }
                    pfVar.f45262a.e = jSONObject4.getInt("RelativeTime");
                    pfVar.f45262a.f45345c = jSONObject4.getInt("Index");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("Parameters");
                    pfVar.f45262a.d = new pg();
                    pfVar.f45262a.d.e = jSONObject5.getInt("Frequency");
                    pfVar.f45262a.d.d = jSONObject5.getInt("Intensity");
                    pfVar.f45262a.d.f45305b = new ArrayList<>();
                    if ("continuous".equals(pfVar.f45262a.f45343a)) {
                        JSONArray jSONArray3 = jSONObject5.getJSONArray("Curve");
                        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                            JSONObject jSONObject6 = (JSONObject) jSONArray3.get(i3);
                            pc pcVar = new pc();
                            pcVar.e = jSONObject6.getInt("Frequency");
                            pcVar.f45134c = jSONObject6.getDouble("Intensity");
                            pcVar.d = jSONObject6.getInt("Time");
                            pfVar.f45262a.d.f45305b.add(pcVar);
                        }
                    }
                    plVar.e.add(pfVar);
                }
                pnVar.f45702a.add(plVar);
            }
            return pnVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int d(String str, int i) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        c cVarC = c(str, i);
        if (pq.d(cVarC)) {
            return cVarC.getDuration();
        }
        return 0;
    }

    public static String b(String str, int i) {
        pn pnVarB;
        ArrayList<pl> arrayList;
        int iIndexOf;
        int iIndexOf2;
        if (i == 0) {
            return str;
        }
        try {
            pnVarB = b(str);
        } catch (Exception e) {
            e.printStackTrace();
            pnVarB = null;
        }
        if (pnVarB == null || (arrayList = pnVarB.f45702a) == null || arrayList.size() == 0) {
            po.e.e("HEFileUtils", "  generatePartialHe20String, source HE invalid!");
            return "";
        }
        Iterator<pl> it = pnVarB.f45702a.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                iIndexOf = -1;
                iIndexOf2 = -1;
                break;
            }
            pl next = it.next();
            ArrayList<pf> arrayList2 = next.e;
            if (arrayList2 != null) {
                for (pf pfVar : arrayList2) {
                    ph phVar = pfVar.f45262a;
                    if (phVar != null && phVar.e + next.f45580c >= i) {
                        iIndexOf = next.e.indexOf(pfVar);
                        iIndexOf2 = pnVarB.f45702a.indexOf(next);
                        break loop0;
                    }
                }
            }
        }
        if (iIndexOf2 < 0 || iIndexOf < 0) {
            return "";
        }
        pnVarB.f45702a.subList(0, iIndexOf2).clear();
        pnVarB.f45702a.get(0).e.subList(0, iIndexOf).clear();
        po.e.d("HEFileUtils", "  generatePartialHe20String, targetPatternListItemIndex:" + iIndexOf2 + ",targetPatterItemIndex:" + iIndexOf + ", PatternList size:" + pnVarB.f45702a.size() + ",Pattern size:" + pnVarB.f45702a.get(0).e.size());
        for (pl plVar : pnVarB.f45702a) {
            ArrayList<pf> arrayList3 = plVar.e;
            if (arrayList3 != null) {
                int i2 = plVar.f45580c;
                if (i2 < i) {
                    Iterator<pf> it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ph phVar2 = it2.next().f45262a;
                        if (phVar2 != null) {
                            phVar2.e = (phVar2.e + plVar.f45580c) - i;
                        }
                    }
                    plVar.f45580c = 0;
                } else {
                    plVar.f45580c = i2 - i;
                }
            }
        }
        if (iIndexOf == 0 && pnVarB.f45702a.get(0).f45580c != 0) {
            pl plVar2 = new pl();
            plVar2.f45580c = 0;
            plVar2.e = new ArrayList<>();
            ph phVar3 = new ph();
            pg pgVar = new pg();
            phVar3.d = pgVar;
            pgVar.d = 0;
            pgVar.e = 0;
            phVar3.f45343a = "transient";
            pf pfVar2 = new pf();
            pfVar2.f45262a = phVar3;
            plVar2.e.add(pfVar2);
            pnVarB.f45702a.add(0, plVar2);
        }
        return d(pnVarB);
    }

    public static pi c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            pi piVar = new pi();
            piVar.e = new pe();
            piVar.d = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("Pattern");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                pf pfVar = new pf();
                pfVar.f45262a = new ph();
                JSONObject jSONObject3 = jSONObject2.getJSONObject("Event");
                pfVar.f45262a.f45343a = jSONObject3.getString(FaqConstants.FAQ_UPLOAD_FLAG);
                if ("continuous".equals(pfVar.f45262a.f45343a)) {
                    pfVar.f45262a.f45344b = jSONObject3.getInt(VastTag.DURATION);
                }
                pfVar.f45262a.e = jSONObject3.getInt("RelativeTime");
                JSONObject jSONObject4 = jSONObject3.getJSONObject("Parameters");
                pfVar.f45262a.d = new pg();
                pfVar.f45262a.d.e = jSONObject4.getInt("Frequency");
                pfVar.f45262a.d.d = jSONObject4.getInt("Intensity");
                pfVar.f45262a.d.f45305b = new ArrayList<>();
                if ("continuous".equals(pfVar.f45262a.f45343a)) {
                    JSONArray jSONArray2 = jSONObject4.getJSONArray("Curve");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject5 = (JSONObject) jSONArray2.get(i2);
                        pc pcVar = new pc();
                        pcVar.e = jSONObject5.getInt("Frequency");
                        pcVar.f45134c = jSONObject5.getDouble("Intensity");
                        pcVar.d = jSONObject5.getInt("Time");
                        pfVar.f45262a.d.f45305b.add(pcVar);
                    }
                }
                piVar.d.add(pfVar);
            }
            return piVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String i(String str, int i) {
        try {
            if (i - d(str) <= 500) {
                po.e.e("HEFileUtils", "extendHe20String, too closed!");
                return str;
            }
            pn pnVarB = b(str);
            if (!pq.d(pnVarB)) {
                po.e.a("HEFileUtils", "extendHe20String(), invalid HE20");
                return null;
            }
            po.e.d("HEFileUtils", "extendHe20String()original pattern count:" + pnVarB.f45702a.size());
            pf pfVar = new pf();
            ph phVar = new ph();
            pfVar.f45262a = phVar;
            phVar.f45343a = "transient";
            phVar.e = 0;
            phVar.d = new pg();
            pg pgVar = pfVar.f45262a.d;
            pgVar.e = 0;
            pgVar.d = 0;
            pl plVar = new pl();
            plVar.f45580c = i - 500;
            ArrayList<pf> arrayList = new ArrayList<>();
            plVar.e = arrayList;
            arrayList.add(pfVar);
            pnVarB.f45702a.add(plVar);
            String strD = d(pnVarB);
            po.a("extend20string_in.he", str);
            po.a("extend20string_out.he", strD);
            return strD;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int d(String str) {
        pn pnVarB = b(str);
        if (pnVarB != null) {
            return pnVarB.getDuration();
        }
        return 0;
    }

    public static int[] d(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        Integer num;
        pi piVar;
        String str2;
        char c2;
        String str3;
        Iterator<pl> it;
        StringBuilder sb;
        Integer numValueOf;
        int i6 = i2;
        ArrayList arrayList = new ArrayList();
        Integer num2 = 4096;
        Integer num3 = 4097;
        String str4 = "continuous";
        String str5 = "transient";
        int i7 = 24;
        int i8 = 16;
        try {
            if (i != 1) {
                if (i != 2 || 24 > i6) {
                    return null;
                }
                pn pnVarB = b(str);
                ArrayList<pl> arrayList2 = pnVarB.f45702a;
                if (arrayList2 != null && arrayList2.size() > 0 && pnVarB.f45702a.get(0).e != null && pnVarB.f45702a.get(0).e.size() > 0) {
                    int size = pnVarB.f45702a.size();
                    if (size > 4) {
                        po.e.e("HEFileUtils", "convertHEStringToIntArray, HE20 with more than 4 pattern!");
                    }
                    arrayList.add(2);
                    arrayList.add(2);
                    arrayList.add(Integer.valueOf(i4));
                    arrayList.add(Integer.valueOf(i5));
                    arrayList.add(Integer.valueOf(((size << 16) & SupportMenu.CATEGORY_MASK) | (size & 65535)));
                    Iterator<pl> it2 = pnVarB.f45702a.iterator();
                    int i9 = 0;
                    while (it2.hasNext()) {
                        pl next = it2.next();
                        arrayList.add(Integer.valueOf(i9));
                        arrayList.add(Integer.valueOf(next.f45580c));
                        int size2 = next.e.size() <= i8 ? next.e.size() : i8;
                        arrayList.add(Integer.valueOf(size2));
                        int i10 = 0;
                        while (i10 < size2) {
                            pf pfVar = next.e.get(i10);
                            if ("transient".equals(pfVar.f45262a.f45343a)) {
                                arrayList.add(num3);
                                arrayList.add(5);
                                int i11 = pfVar.f45262a.f45345c;
                                it = it2;
                                if (z) {
                                    i11 = i11 == 0 ? 0 : 1 == i11 ? 2 : 1;
                                }
                                arrayList.add(Integer.valueOf(i11));
                                arrayList.add(Integer.valueOf(pfVar.f45262a.e));
                                arrayList.add(Integer.valueOf(pfVar.f45262a.d.d));
                                arrayList.add(Integer.valueOf(pfVar.f45262a.d.e));
                                arrayList.add(Integer.valueOf(pfVar.f45262a.f45344b));
                                num2 = num2;
                                num3 = num3;
                                size2 = size2;
                            } else {
                                it = it2;
                                if ("continuous".equals(pfVar.f45262a.f45343a)) {
                                    int size3 = pfVar.f45262a.d.f45305b.size();
                                    if (4 > size3 || 16 < size3) {
                                        sb = new StringBuilder();
                                        sb.append("convertHEStringToIntArray, curvePointCount:");
                                        sb.append(size3);
                                    } else {
                                        arrayList.add(num2);
                                        arrayList.add(Integer.valueOf((size3 * 3) + 6));
                                        int i12 = pfVar.f45262a.f45345c;
                                        size2 = size2;
                                        if (z) {
                                            i12 = i12 == 0 ? 0 : 1 == i12 ? 2 : 1;
                                        }
                                        arrayList.add(Integer.valueOf(i12));
                                        arrayList.add(Integer.valueOf(pfVar.f45262a.e));
                                        arrayList.add(Integer.valueOf(pfVar.f45262a.d.d));
                                        if (i6 > 32 || i3 > 16) {
                                            numValueOf = Integer.valueOf(pfVar.f45262a.d.e);
                                        } else {
                                            int i13 = pfVar.f45262a.d.e;
                                            if (-1 == i13) {
                                                i13 = 56;
                                            }
                                            numValueOf = Integer.valueOf(i13);
                                        }
                                        arrayList.add(numValueOf);
                                        arrayList.add(Integer.valueOf(pfVar.f45262a.f45344b));
                                        arrayList.add(Integer.valueOf(size3));
                                        for (pc pcVar : pfVar.f45262a.d.f45305b) {
                                            arrayList.add(Integer.valueOf(pcVar.d));
                                            Integer num4 = num2;
                                            Integer num5 = num3;
                                            arrayList.add(Integer.valueOf((int) (pcVar.f45134c * 100.0d)));
                                            arrayList.add(Integer.valueOf((i6 > 32 || i3 > 16 || -1 != pfVar.f45262a.d.e) ? pcVar.e : 0));
                                            num2 = num4;
                                            num3 = num5;
                                        }
                                        num2 = num2;
                                        num3 = num3;
                                    }
                                } else {
                                    sb = new StringBuilder();
                                    sb.append("convertHEStringToIntArray, skip unknown type:");
                                    sb.append(pfVar.f45262a.f45343a);
                                }
                                po.e.e("HEFileUtils", sb.toString());
                            }
                            i10++;
                            it2 = it;
                            size2 = size2;
                            num2 = num2;
                            num3 = num3;
                        }
                        i9++;
                        i8 = 16;
                    }
                }
                po.e.e("HEFileUtils", "convertHEStringToIntArray, empty HE20!");
                return null;
            }
            Integer num6 = num3;
            pi piVarC = c(str);
            ArrayList<pf> arrayList3 = piVarC.d;
            if (arrayList3 == null && arrayList3.size() <= 0) {
                po.e.e("HEFileUtils", "convertHEStringToIntArray, empty HE10!");
                return null;
            }
            char c3 = 3;
            arrayList.add(24 > i6 ? 1 : 3);
            int size4 = piVarC.d.size() <= 16 ? piVarC.d.size() : 16;
            int i14 = 0;
            while (i14 < size4) {
                pf pfVar2 = piVarC.d.get(i14);
                if (str5.equals(pfVar2.f45262a.f45343a)) {
                    num = num6;
                    arrayList.add(num);
                    arrayList.add(Integer.valueOf(pfVar2.f45262a.e));
                    arrayList.add(Integer.valueOf(pfVar2.f45262a.d.d));
                    arrayList.add(Integer.valueOf(pfVar2.f45262a.d.e));
                    arrayList.add(Integer.valueOf(pfVar2.f45262a.f45344b));
                    if (i7 > i6) {
                        for (int i15 = 0; i15 < 12; i15++) {
                            arrayList.add(0);
                        }
                    } else {
                        arrayList.add(0);
                        arrayList.add(0);
                        for (int i16 = 0; i16 < 48; i16++) {
                            arrayList.add(0);
                        }
                    }
                } else {
                    num = num6;
                    if (str4.equals(pfVar2.f45262a.f45343a)) {
                        int size5 = pfVar2.f45262a.d.f45305b.size();
                        if (i7 <= i6 || 4 == size5) {
                            if (i7 > i6 || (4 <= size5 && 16 >= size5)) {
                                arrayList.add(num2);
                                arrayList.add(Integer.valueOf(pfVar2.f45262a.e));
                                arrayList.add(Integer.valueOf(pfVar2.f45262a.d.d));
                                int i17 = pfVar2.f45262a.d.e;
                                if (-1 == i17) {
                                    i17 = 56;
                                }
                                arrayList.add(Integer.valueOf(i17));
                                arrayList.add(Integer.valueOf(pfVar2.f45262a.f45344b));
                                if (24 > i6) {
                                    for (pc pcVar2 : pfVar2.f45262a.d.f45305b) {
                                        arrayList.add(Integer.valueOf(pcVar2.d));
                                        pi piVar2 = piVarC;
                                        arrayList.add(Integer.valueOf((int) (pcVar2.f45134c * 100.0d)));
                                        arrayList.add(Integer.valueOf(-1 == pfVar2.f45262a.d.e ? 0 : pcVar2.e));
                                        piVarC = piVar2;
                                    }
                                } else {
                                    piVar = piVarC;
                                    arrayList.add(Integer.valueOf(size5));
                                    for (pc pcVar3 : pfVar2.f45262a.d.f45305b) {
                                        arrayList.add(Integer.valueOf(pcVar3.d));
                                        String str6 = str4;
                                        String str7 = str5;
                                        arrayList.add(Integer.valueOf((int) (pcVar3.f45134c * 100.0d)));
                                        arrayList.add(Integer.valueOf(-1 == pfVar2.f45262a.d.e ? 0 : pcVar3.e));
                                        str4 = str6;
                                        str5 = str7;
                                    }
                                    str3 = str4;
                                    str2 = str5;
                                    int i18 = 0;
                                    while (true) {
                                        c2 = 3;
                                        if (i18 < (16 - size5) * 3) {
                                            arrayList.add(0);
                                            i18++;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        piVar = piVarC;
                        str2 = str5;
                        String str8 = str4;
                        c2 = c3;
                        str3 = str8;
                        po.e.e("HEFileUtils", "convertHEStringToIntArray, skip unknown type:" + pfVar2.f45262a.f45343a);
                    }
                    i14++;
                    piVarC = piVar;
                    i6 = i2;
                    str5 = str2;
                    num6 = num;
                    i7 = 24;
                    char c4 = c2;
                    str4 = str3;
                    c3 = c4;
                }
                piVar = piVarC;
                str3 = str4;
                str2 = str5;
                c2 = 3;
                i14++;
                piVarC = piVar;
                i6 = i2;
                str5 = str2;
                num6 = num;
                i7 = 24;
                char c5 = c2;
                str4 = str3;
                c3 = c5;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        return iArr;
    }

    public static void d(String str, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2) {
        ph phVar;
        int iE;
        if (str == null || str.length() == 0 || arrayList == null || arrayList2 == null) {
            po.e.a("HEFileUtils", "convertHE10StringToWaveformParams(), invalid parameters.");
            return;
        }
        c cVarC = c(str, 1);
        if (!c.a(cVarC)) {
            po.e.e("HEFileUtils", "convertHE10StringToGoogleWaveform, invalid heRoot!");
            return;
        }
        if (1 != cVarC.a()) {
            po.e.e("HEFileUtils", "convertHE10StringToGoogleWaveform, invalid HE version:" + cVarC.a());
            return;
        }
        arrayList.clear();
        arrayList2.clear();
        long jLongValue = 0;
        arrayList.add(new Long(0L));
        arrayList2.add(0);
        for (pf pfVar : ((pi) cVarC).d) {
            if (pfVar != null && (phVar = pfVar.f45262a) != null && phVar.d != null) {
                if ("transient".equals(phVar.f45343a)) {
                    if (pfVar.f45262a.e > jLongValue) {
                        arrayList.add(Long.valueOf(new Long(pfVar.f45262a.e).longValue() - jLongValue));
                        arrayList2.add(0);
                        jLongValue += arrayList.get(arrayList.size() - 1).longValue();
                    }
                    pg pgVar = pfVar.f45262a.d;
                    arrayList.add(new Long(d(pgVar.d, pgVar.e)));
                    iE = pfVar.f45262a.d.d;
                } else if ("continuous".equals(pfVar.f45262a.f45343a)) {
                    ArrayList<pc> arrayList3 = pfVar.f45262a.d.f45305b;
                    if (arrayList3 != null && 4 == arrayList3.size()) {
                        if (pfVar.f45262a.e > jLongValue) {
                            arrayList.add(Long.valueOf(new Long(pfVar.f45262a.e).longValue() - jLongValue));
                            arrayList2.add(0);
                            jLongValue += arrayList.get(arrayList.size() - 1).longValue();
                        }
                        arrayList.add(new Long(e(pfVar.f45262a.f45344b)));
                        pg pgVar2 = pfVar.f45262a.d;
                        iE = e(pgVar2.d, pgVar2.e);
                    }
                } else {
                    po.e.a("HEFileUtils", "unknown type!");
                }
                arrayList2.add(Integer.valueOf((int) (((((double) iE) * 1.0d) / 100.0d) * 255.0d)));
                jLongValue += arrayList.get(arrayList.size() - 1).longValue();
            }
        }
        if (po.b()) {
            Iterator<Long> it = arrayList.iterator();
            String str2 = "";
            String str3 = "";
            while (it.hasNext()) {
                str3 = str3 + it.next().toString() + ",";
            }
            Iterator<Integer> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                str2 = str2 + it2.next().toString() + ",";
            }
            po.e.d("HEFileUtils", "timings size:" + arrayList.size() + ",amplitudes size:" + arrayList2.size() + "\n timings:" + str3 + "\n amplitudes:" + str2);
        }
    }

    private static ArrayList<pc> c(ArrayList<pc> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        int size = arrayList.size();
        po.e.d("HEFileUtils", "trimTo4p size:" + size);
        if (size > 0 && size <= 4) {
            return arrayList;
        }
        pc pcVar = new pc();
        int i = size - 2;
        int i2 = i / 2;
        for (int i3 = 1; i3 <= i2; i3++) {
            pcVar.d += arrayList.get(i3).d;
            pcVar.f45134c += arrayList.get(i3).f45134c;
            pcVar.e += arrayList.get(i3).e;
        }
        pcVar.d /= i2;
        double d = pcVar.f45134c / ((double) i2);
        pcVar.f45134c = d;
        pcVar.f45134c = Math.round(d * 10.0d) / 10.0d;
        pcVar.e /= i2;
        pc pcVar2 = new pc();
        for (int i4 = i2 + 1; i4 <= i; i4++) {
            pcVar2.d += arrayList.get(i4).d;
            pcVar2.f45134c += arrayList.get(i4).f45134c;
            pcVar2.e += arrayList.get(i4).e;
        }
        int i5 = i - i2;
        pcVar2.d /= i5;
        double d2 = pcVar2.f45134c / ((double) i5);
        pcVar2.f45134c = d2;
        pcVar2.f45134c = Math.round(d2 * 10.0d) / 10.0d;
        pcVar2.e /= i5;
        po.e.d("HEFileUtils", "trimTo4p size:" + arrayList.size());
        arrayList.subList(1, size - 1).clear();
        arrayList.add(1, pcVar);
        arrayList.add(2, pcVar2);
        return arrayList;
    }

    public static String e(String str, boolean z) {
        String str2;
        if (z) {
            str = f(str);
        }
        String strH = h(str);
        if (strH == null || strH.length() == 0) {
            str2 = "convertHE20ToHE10, null after trim";
        } else {
            pn pnVarB = b(strH);
            if (c.a(pnVarB)) {
                Iterator<pf> it = pnVarB.f45702a.get(0).e.iterator();
                while (it.hasNext()) {
                    it.next().f45262a.e += pnVarB.f45702a.get(0).f45580c;
                }
                pi piVar = new pi();
                piVar.e = new pe();
                ArrayList<pf> arrayList = pnVarB.f45702a.get(0).e;
                piVar.d = arrayList;
                for (pf pfVar : arrayList) {
                    ph phVar = pfVar.f45262a;
                    if (phVar != null && "continuous".equals(phVar.f45343a)) {
                        pg pgVar = pfVar.f45262a.d;
                        if (-1 == pgVar.e) {
                            pgVar.e = 56;
                            Iterator<pc> it2 = pgVar.f45305b.iterator();
                            while (it2.hasNext()) {
                                it2.next().e = 0;
                            }
                        }
                    }
                }
                String strA = a(piVar);
                po.e.d("HEFileUtils", "convertHE20ToHE10 result:" + strA);
                return strA;
            }
            str2 = "convertHE20ToHE10, empty HeRoot";
        }
        po.e.a("HEFileUtils", str2);
        return null;
    }

    public static String c(String str, int i, int i2, int i3) {
        int i4;
        double d;
        int i5;
        double d2;
        int i6;
        String str2;
        po.e.d("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, deltaFreq:" + i2 + ", deltaIntensity:" + i + ", majorCoreVersion:" + i3);
        if (i2 == 0 && (255 == i || 256 == i)) {
            str2 = "overwriteBaseFrequencyAndIntensityOfHe20String, do nothing!";
        } else {
            double d3 = 0.0d;
            double d4 = (255 == i || 256 == i) ? 0.0d : (((double) i) - 255.5d) / 255.5d;
            double d5 = ((double) i2) / 100.0d;
            po.e.d("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, freqRatio:" + d5 + ", intensityRatio:" + d4);
            pn pnVarB = b(str);
            if (pq.d(pnVarB)) {
                Iterator<pl> it = pnVarB.f45702a.iterator();
                while (it.hasNext()) {
                    for (pf pfVar : it.next().e) {
                        if ("transient".equals(pfVar.f45262a.f45343a)) {
                            pg pgVar = pfVar.f45262a.d;
                            int i7 = pgVar.e;
                            if (i7 == 0 && pgVar.d == 0) {
                                po.e.d("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, ignore placeholder event!");
                            } else {
                                if (i3 >= 24) {
                                    i6 = (int) (d5 >= d3 ? ((double) i7) + (((double) (150 - i7)) * d5) : ((double) i7) + (((double) (i7 + 50)) * d5));
                                } else {
                                    double d6 = i7;
                                    if (d5 >= d3) {
                                        i7 = 100 - i7;
                                    }
                                    i6 = (int) (d6 + (((double) i7) * d5));
                                }
                                pgVar.e = i6;
                            }
                        } else if ("continuous".equals(pfVar.f45262a.f45343a)) {
                            pg pgVar2 = pfVar.f45262a.d;
                            if (d5 >= 0.0d) {
                                int i8 = pgVar2.e;
                                d = i8;
                                i4 = 100 - i8;
                            } else {
                                i4 = pgVar2.e;
                                d = i4;
                            }
                            pgVar2.e = (int) (d + (((double) i4) * d5));
                        }
                        pg pgVar3 = pfVar.f45262a.d;
                        if (d4 >= 0.0d) {
                            int i9 = pgVar3.d;
                            d2 = i9;
                            i5 = 100 - i9;
                        } else {
                            i5 = pgVar3.d;
                            d2 = i5;
                        }
                        pgVar3.d = (int) (d2 + (((double) i5) * d4));
                        d3 = 0.0d;
                    }
                }
                String strD = d(pnVarB);
                po.e.d("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, result:" + strD);
                return strD;
            }
            str2 = "overwriteBaseFrequencyAndIntensityOfHe20String, do nothing as invalid he20String";
        }
        po.e.d("HEFileUtils", str2);
        return str;
    }

    public static String e(String str, int i) {
        po.e.d("HEFileUtils", "alignHE20DurationToMedia, target duration:" + i);
        if (48 <= i) {
            int iD = d(str, 2);
            if (i - iD > 500) {
                return i(str, i);
            }
            return iD - i > 500 ? g(str, i) : str;
        }
        po.e.e("HEFileUtils", "alignHE20DurationToMedia, target duration:" + i + ", do nothing!");
        return str;
    }

    public static String a(String str, double d) {
        double d2;
        try {
            pn pnVarB = b(str);
            if (!pq.d(pnVarB)) {
                return null;
            }
            for (pl plVar : pnVarB.f45702a) {
                ArrayList<pf> arrayList = plVar.e;
                if (arrayList != null) {
                    plVar.f45580c = (int) (((double) plVar.f45580c) / d);
                    for (pf pfVar : arrayList) {
                        ph phVar = pfVar.f45262a;
                        if (phVar != null) {
                            phVar.e = (int) (((double) phVar.e) / d);
                            if (!TextUtils.equals("transient", phVar.f45343a)) {
                                ph phVar2 = pfVar.f45262a;
                                double d3 = phVar2.f45344b;
                                int i = (int) (d3 / d);
                                phVar2.f45344b = i;
                                if (i > 5000) {
                                    po.e.b("HEFileUtils", "lower duration to 5000");
                                    pfVar.f45262a.f45344b = 5000;
                                    d2 = 5000.0d / d3;
                                } else {
                                    d2 = d;
                                }
                                for (pc pcVar : pfVar.f45262a.d.f45305b) {
                                    if (pcVar != null) {
                                        pcVar.d = (int) (((double) pcVar.d) / d2);
                                    }
                                }
                                ArrayList<pc> arrayList2 = pfVar.f45262a.d.f45305b;
                                arrayList2.get(arrayList2.size() - 1).d = pfVar.f45262a.f45344b;
                            }
                        }
                    }
                }
            }
            return d(pnVarB);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        pi piVarC;
        ArrayList<pf> arrayList;
        try {
            piVarC = c(str);
        } catch (Exception e) {
            e.printStackTrace();
            piVarC = null;
        }
        if (piVarC == null || (arrayList = piVarC.d) == null || arrayList.size() == 0) {
            po.e.e("HEFileUtils", " , convertHe10ToHe20, invalid HE1.0 string!");
            return "";
        }
        pn pnVar = new pn();
        pnVar.d = new pj();
        pnVar.f45702a = new ArrayList<>();
        pl plVar = new pl();
        plVar.e = piVarC.d;
        plVar.f45580c = 0;
        pnVar.f45702a.add(plVar);
        return d(pnVar);
    }

    public static String a(pl plVar, boolean z) {
        pn pnVar = new pn();
        pnVar.d = new pj();
        ArrayList<pl> arrayList = new ArrayList<>();
        pnVar.f45702a = arrayList;
        if (z) {
            pl plVar2 = new pl();
            plVar2.f45580c = 0;
            plVar2.e = plVar.e;
            pnVar.f45702a.add(plVar2);
        } else {
            arrayList.add(plVar);
        }
        return d(pnVar);
    }

    public static String d(pn pnVar) {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            jSONStringer.object();
            jSONStringer.key("Metadata").object().key("Created").value(pnVar.d.f45477c).key(VastTag.DESCRIPTION).value(pnVar.d.f45476b).key(e.g).value(pnVar.d.e).endObject();
            jSONStringer.key("PatternList").array();
            for (pl plVar : pnVar.f45702a) {
                jSONStringer.object().key("AbsoluteTime").value(plVar.f45580c).key("Pattern").array();
                for (pf pfVar : plVar.e) {
                    jSONStringer.object();
                    jSONStringer.key("Event").object().key("Index").value(pfVar.f45262a.f45345c).key("RelativeTime").value(pfVar.f45262a.e).key(FaqConstants.FAQ_UPLOAD_FLAG).value(pfVar.f45262a.f45343a);
                    if ("continuous".equals(pfVar.f45262a.f45343a)) {
                        jSONStringer.key(VastTag.DURATION).value(pfVar.f45262a.f45344b);
                    }
                    jSONStringer.key("Parameters").object().key("Frequency").value(pfVar.f45262a.d.e).key("Intensity").value(pfVar.f45262a.d.d);
                    if ("continuous".equals(pfVar.f45262a.f45343a)) {
                        jSONStringer.key("Curve").array();
                        for (pc pcVar : pfVar.f45262a.d.f45305b) {
                            jSONStringer.object().key("Frequency").value(pcVar.e).key("Intensity").value(pcVar.f45134c).key("Time").value(pcVar.d).endObject();
                        }
                        jSONStringer.endArray();
                    }
                    jSONStringer.endObject().endObject().endObject();
                }
                jSONStringer.endArray().endObject();
            }
            jSONStringer.endArray().endObject();
            return jSONStringer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    class a implements Comparator<pf> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(pf pfVar, pf pfVar2) {
            return pfVar.f45262a.e - pfVar2.f45262a.e;
        }

        a() {
        }
    }

    public static String a(pi piVar) {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            jSONStringer.object();
            jSONStringer.key("Metadata").object().key("Created").value(piVar.e.f45229c).key(VastTag.DESCRIPTION).value(piVar.e.f45228b).key(e.g).value(piVar.e.f45227a).endObject();
            jSONStringer.key("Pattern").array();
            for (pf pfVar : piVar.d) {
                jSONStringer.object();
                jSONStringer.key("Event").object().key(FaqConstants.FAQ_UPLOAD_FLAG).value(pfVar.f45262a.f45343a).key("RelativeTime").value(pfVar.f45262a.e);
                if ("continuous".equals(pfVar.f45262a.f45343a)) {
                    jSONStringer.key(VastTag.DURATION).value(pfVar.f45262a.f45344b);
                }
                jSONStringer.key("Parameters").object().key("Frequency").value(pfVar.f45262a.d.e).key("Intensity").value(pfVar.f45262a.d.d);
                if ("continuous".equals(pfVar.f45262a.f45343a)) {
                    jSONStringer.key("Curve").array();
                    for (pc pcVar : pfVar.f45262a.d.f45305b) {
                        jSONStringer.object().key("Frequency").value(pcVar.e).key("Intensity").value(pcVar.f45134c).key("Time").value(pcVar.d).endObject();
                    }
                    jSONStringer.endArray();
                }
                jSONStringer.endObject().endObject().endObject();
            }
            jSONStringer.endArray().endObject();
            return jSONStringer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
