package com.xiaomi.ai.domain.mobileapp.parser;

import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.gv5;
import defpackage.j45;
import defpackage.k45;
import defpackage.klo;
import defpackage.ovg;
import defpackage.y2e;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class CrfLatticeTool {
    private final String AND_CONNECTOR;
    private j45 crfModel;
    private boolean isInit;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrfLatticeTool f11010a = new CrfLatticeTool();
    }

    private k45 getCrfSample(y2e y2eVar) {
        List<Set<ovg>> listJ = y2eVar.j();
        ArrayList arrayList = new ArrayList(Arrays.asList("eps", RealNameWebViewActivity.NUMBER));
        k45 k45Var = new k45(listJ.size(), 2);
        for (Set<ovg> set : listJ) {
            String[] strArr = new String[2];
            HashSet hashSet = new HashSet();
            if (set.size() > 0) {
                for (ovg ovgVar : set) {
                    hashSet.add(ovgVar.i().f());
                    strArr[0] = ovgVar.i().h();
                    if (!ovgVar.i().h().equals(strArr[0])) {
                        break;
                    }
                }
                ArrayList arrayList2 = new ArrayList(hashSet);
                arrayList2.removeAll(arrayList);
                if (arrayList2.size() == 0) {
                    arrayList2.add(strArr[0]);
                }
                Collections.sort(arrayList2);
                strArr[1] = klo.g(arrayList2, gv5.CONNECT_STR);
            }
            k45Var.b(strArr);
        }
        return k45Var;
    }

    public static CrfLatticeTool getInstance() {
        return b.f11010a;
    }

    public boolean isInit() {
        return this.isInit;
    }

    public void loadModel(InputStream inputStream) throws IOException {
        j45 j45Var = new j45();
        this.crfModel = j45Var;
        j45Var.c(inputStream);
        this.isInit = true;
    }

    public void shortPath(y2e y2eVar) {
        y2eVar.v(this.crfModel, getCrfSample(y2eVar), y2eVar.j());
    }

    private CrfLatticeTool() {
        this.AND_CONNECTOR = gv5.CONNECT_STR;
        this.crfModel = null;
        this.isInit = false;
    }
}
