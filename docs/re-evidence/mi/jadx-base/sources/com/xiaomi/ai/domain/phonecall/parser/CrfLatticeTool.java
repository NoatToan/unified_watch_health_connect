package com.xiaomi.ai.domain.phonecall.parser;

import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import defpackage.aqe;
import defpackage.j45;
import defpackage.k45;
import defpackage.ovg;
import defpackage.qpe;
import defpackage.xb8;
import defpackage.y2e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class CrfLatticeTool {
    private static final qpe LOGGER = aqe.f(CrfLatticeTool.class);
    private j45 crfModel;

    private void changeBest(ovg ovgVar, ovg ovgVar2) {
        ovgVar.w(ovgVar2);
        ovgVar2.u(ovgVar);
    }

    private List<xb8> formatCrfLattice(y2e y2eVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("name", "tag");
        String[] strArr = {"name", "tag"};
        String str = "u_S";
        String[] strArr2 = {"u_S", "t_S"};
        String[] strArr3 = {"u_B", "t_B"};
        String[] strArr4 = {"u_M", "t_M"};
        String[] strArr5 = {"u_E", "t_E"};
        ovg ovgVarE = y2eVar.l().e();
        String str2 = "";
        String str3 = "";
        String str4 = str3;
        int i2 = -1;
        while (ovgVarE != null && ovgVarE.l() != y2eVar.o().l()) {
            int iA = ovgVarE.i().a();
            String strH = ovgVarE.i().h();
            String strF = ovgVarE.i().f();
            if (strF.equals(str)) {
                str3 = str2;
                str4 = str3;
                i2 = -1;
            }
            String str5 = str2;
            String str6 = str;
            for (int i3 = 0; i3 < 2; i3++) {
                if (strF.equals(strArr2[i3]) || strF.equals(strArr3[i3])) {
                    str3 = strArr[i3];
                    i = iA;
                    str4 = strH;
                } else {
                    i = i2;
                }
                String str7 = (str3.equals(strArr[i3]) && (strF.equals(strArr4[i3]) || strF.equals(strArr5[i3]))) ? str4 + strH : str4;
                if (strF.equals(strArr2[i3]) || strF.equals(strArr5[i3])) {
                    LOGGER.debug("formatCrfLattice slot: {}, token:{}", str3, str7);
                    if (i >= 0 && listAsList.contains(str3)) {
                        arrayList.add(new xb8(i, i + str7.length(), str7, str7, str3));
                    }
                    str3 = str5;
                    str4 = str3;
                    i2 = -1;
                } else {
                    str4 = str7;
                    i2 = i;
                }
            }
            ovgVarE = ovgVarE.e();
            str = str6;
            str2 = str5;
        }
        return arrayList;
    }

    private List<xb8> getAddEntities(int i, int i2, xb8 xb8Var, String str) {
        ArrayList arrayList = new ArrayList();
        int iA = xb8Var.a();
        int iB = xb8Var.b();
        while (i < iA) {
            int i3 = i + 1;
            arrayList.add(new xb8(i, i3, String.valueOf(str.charAt(i))));
            i = i3;
        }
        arrayList.add(xb8Var);
        while (iB < i2) {
            int i4 = iB + 1;
            arrayList.add(new xb8(iB, i4, String.valueOf(str.charAt(iB))));
            iB = i4;
        }
        return arrayList;
    }

    private List<xb8> getCharEntities(String str) {
        String[] strArr = {"S", "u_S", "u_B", "u_M", "u_E", "t_S", "t_B", "t_M", "t_E"};
        ArrayList arrayList = new ArrayList();
        EntityType entityType = EntityType.INIT_PARSED_ENTITY;
        for (int i = 0; i < str.length(); i++) {
            String strValueOf = String.valueOf(str.charAt(i));
            for (int i2 = 0; i2 < 9; i2++) {
                int i3 = i;
                arrayList.add(new xb8(i3, i + strValueOf.length(), strValueOf, strValueOf, strArr[i2], strValueOf, entityType));
            }
        }
        return arrayList;
    }

    private List<Set<ovg>> getCrfGraphNodes(y2e y2eVar) {
        ArrayList arrayList = new ArrayList();
        y2eVar.l().x(true);
        y2eVar.o().x(true);
        Map<Integer, Set<ovg>> mapI = y2eVar.i();
        for (int i = 0; i < y2eVar.o().i().a(); i++) {
            if (mapI.containsKey(Integer.valueOf(i))) {
                Set<ovg> set = mapI.get(Integer.valueOf(i));
                arrayList.add(set);
                Iterator<ovg> it = set.iterator();
                while (it.hasNext()) {
                    it.next().x(true);
                }
            }
        }
        return arrayList;
    }

    private ovg getShorestPathNode(Map<Integer, Set<ovg>> map, int i) {
        for (ovg ovgVar : map.get(Integer.valueOf(i))) {
            if (ovgVar.s()) {
                return ovgVar;
            }
        }
        return null;
    }

    public void addCrfSlots(List<xb8> list, y2e y2eVar, String str) {
        Map<Integer, Set<ovg>> mapI = y2eVar.i();
        Map<Integer, Set<ovg>> mapK = y2eVar.k();
        for (xb8 xb8Var : list) {
            int iA = xb8Var.a();
            int iB = xb8Var.b();
            if (!mapK.containsKey(Integer.valueOf(iA)) || getShorestPathNode(mapK, iA) == null) {
                while (iA > 0 && (!mapK.containsKey(Integer.valueOf(iA)) || getShorestPathNode(mapK, iA) == null)) {
                    iA--;
                }
            }
            if (!mapI.containsKey(Integer.valueOf(iB)) || getShorestPathNode(mapI, iB) == null) {
                while (iB < str.length() && (!mapI.containsKey(Integer.valueOf(iB)) || getShorestPathNode(mapI, iB) == null)) {
                    iB++;
                }
            }
            List<xb8> addEntities = getAddEntities(iA, iB, xb8Var, str);
            ovg shorestPathNode = getShorestPathNode(mapK, iA);
            ovg shorestPathNode2 = getShorestPathNode(mapI, iB);
            if (shorestPathNode != null && shorestPathNode2 != null) {
                for (ovg ovgVarE = shorestPathNode.e(); ovgVarE != shorestPathNode2 && ovgVarE != null; ovgVarE = ovgVarE.e()) {
                    ovgVarE.z(false);
                }
                Iterator<xb8> it = addEntities.iterator();
                while (it.hasNext()) {
                    ovg ovgVarM = y2eVar.m(y2eVar.b(it.next(), false));
                    ovgVarM.z(true);
                    changeBest(shorestPathNode, ovgVarM);
                    shorestPathNode = ovgVarM;
                }
                changeBest(shorestPathNode, shorestPathNode2);
            }
        }
    }

    public void loadModel(String str) throws Exception {
        LOGGER.debug("load crf path:" + str);
        getClass().getClassLoader();
        loadModel(getClass().getResourceAsStream(str));
    }

    public List<xb8> matchCrfQuery(String str) {
        y2e y2eVarS = y2e.s(str, true, getCharEntities(str));
        k45 k45Var = new k45(str.length(), 1);
        for (int i = 0; i < str.length(); i++) {
            k45Var.a(String.valueOf(str.charAt(i)));
        }
        y2eVarS.v(this.crfModel, k45Var, getCrfGraphNodes(y2eVarS));
        return formatCrfLattice(y2eVarS);
    }

    public void loadModel(InputStream inputStream) throws Exception {
        j45 j45Var = new j45();
        this.crfModel = j45Var;
        j45Var.c(inputStream);
    }
}
