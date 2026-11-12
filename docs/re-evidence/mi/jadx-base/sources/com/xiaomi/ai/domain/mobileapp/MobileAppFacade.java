package com.xiaomi.ai.domain.mobileapp;

import defpackage.a08;
import defpackage.aqe;
import defpackage.n08;
import defpackage.qpe;
import defpackage.yz7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MobileAppFacade implements yz7 {
    private static final qpe LOGGER = aqe.f(MobileAppFacade.class);
    private static MobileAppFacade instance = new MobileAppFacade();
    private MobileAppSolver mobileAppSolver = new MobileAppSolver();
    private String persistDataStr = null;

    private MobileAppFacade() {
    }

    public static MobileAppFacade getInstance() {
        return instance;
    }

    @Override // defpackage.yz7
    public String getDomain() {
        return this.mobileAppSolver.getDomain();
    }

    public List<String> getNormalizeDataForAsr(n08 n08Var) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.mobileAppSolver.getAsrNames().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().toUpperCase());
        }
        return new ArrayList(hashSet);
    }

    public synchronized boolean initEdge(Object obj) {
        if (obj instanceof String) {
            try {
                String str = (String) obj;
                boolean zInit = this.mobileAppSolver.init(str);
                if (zInit) {
                    this.persistDataStr = str;
                }
                return zInit;
            } catch (Exception e) {
                LOGGER.error("initEdgeBaseAndBlackResource edge occur exception: {}", (Throwable) e);
            }
        }
        return false;
    }

    @Override // defpackage.yz7
    public JSONObject parse(String str, n08 n08Var) {
        return this.mobileAppSolver.parse(str, n08Var);
    }

    @Override // defpackage.yz7
    public a08 provide(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        return this.mobileAppSolver.provide(jSONObject, jSONObject2, n08Var);
    }

    public boolean restoreFromPersistData(Object obj) {
        return initEdge(obj);
    }

    public String obtainPersistData() {
        return this.persistDataStr;
    }
}
