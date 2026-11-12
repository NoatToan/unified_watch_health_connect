package com.xiaomi.ai.domain.phonecall;

import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.util.ContactEncryptor;
import defpackage.a08;
import defpackage.aqe;
import defpackage.n08;
import defpackage.qpe;
import defpackage.yz7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhonecallAppFacade implements yz7 {
    private static final qpe LOGGER = aqe.f(PhonecallAppFacade.class);
    private static volatile PhonecallAppFacade instance;
    private PhoneCallSolver phoneCallSolver = new PhoneCallSolver();

    private PhonecallAppFacade() throws Exception {
    }

    public static PhonecallAppFacade getInstance() {
        if (instance == null) {
            synchronized (PhonecallAppFacade.class) {
                if (instance == null) {
                    try {
                        instance = new PhonecallAppFacade();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }

    public JSONArray clearPrivacyInfo(JSONArray jSONArray) throws JSONException {
        return this.phoneCallSolver.clearPrivacyInfo(jSONArray);
    }

    public String decrypt(String str, String str2, String str3) throws Exception {
        return ContactEncryptor.decrypt(str, str2, str3);
    }

    public String encrypt(String str, String str2, String str3) throws Exception {
        return ContactEncryptor.encrypt(str, str2, str3);
    }

    @Override // defpackage.yz7
    public String getDomain() {
        return this.phoneCallSolver.getDomain();
    }

    public List<String> getNormalizeDataForAsr(n08 n08Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.phoneCallSolver.getContactNames().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replaceAll("[^一-龥a-zA-Z0-9]", ""));
        }
        return arrayList;
    }

    public boolean initEdge(Object obj) {
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            try {
                return this.phoneCallSolver.initContacts(jSONObject) >= 0;
            } catch (JSONException e) {
                LOGGER.error("init edge occur exception: {}", (Throwable) e);
            }
        }
        return false;
    }

    @Override // defpackage.yz7
    public JSONObject parse(String str, n08 n08Var) {
        return this.phoneCallSolver.parse(str, n08Var);
    }

    @Override // defpackage.yz7
    public a08 provide(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        return this.phoneCallSolver.provide(jSONObject, jSONObject2, n08Var);
    }

    public boolean restoreFromPersistData(Object obj) {
        return this.phoneCallSolver.restoreFromPersistData(obj);
    }

    public JSONObject clearPrivacyInfo(JSONObject jSONObject) throws Exception {
        return this.phoneCallSolver.clearPrivacyInfo(jSONObject);
    }

    public List<Contact> obtainPersistData() {
        return this.phoneCallSolver.obtainPersistData();
    }
}
