package com.xiaomi.ai.domain.phonecall;

import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.util.ContactEncryptor;
import defpackage.a08;
import defpackage.aqe;
import defpackage.d08;
import defpackage.n08;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhonecallAppFacadeV3 extends d08 {
    private static final qpe LOGGER = aqe.f(PhonecallAppFacadeV3.class);
    private static volatile PhonecallAppFacadeV3 instance;
    private PhoneCallSolver phoneCallSolver = new PhoneCallSolver();

    private PhonecallAppFacadeV3() throws Exception {
    }

    public static PhonecallAppFacadeV3 getInstance() {
        if (instance == null) {
            synchronized (PhonecallAppFacadeV3.class) {
                if (instance == null) {
                    try {
                        instance = new PhonecallAppFacadeV3();
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

    public boolean contactDataIsEmpty() {
        return this.phoneCallSolver.contactDataIsEmpty();
    }

    public String decrypt(String str, String str2, String str3) throws Exception {
        return ContactEncryptor.decrypt(str, str2, str3);
    }

    public String encrypt(String str, String str2, String str3) throws Exception {
        return ContactEncryptor.encrypt(str, str2, str3);
    }

    @Override // defpackage.d08, defpackage.zz7
    public String getDomain() {
        return this.phoneCallSolver.getDomain();
    }

    @Override // defpackage.d08
    public List<String> getNormalizeDataForAsr(n08 n08Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.phoneCallSolver.getContactNames().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replaceAll("[^一-龥a-zA-Z0-9]", ""));
        }
        return arrayList;
    }

    @Override // defpackage.d08
    public boolean initEdge(Object obj) {
        qpe qpeVar = LOGGER;
        qpeVar.info("provide3.0 initEdge start");
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            try {
                int iInitContacts = this.phoneCallSolver.initContacts(jSONObject);
                qpeVar.info("provide3.0 initEdge end contacts number is " + iInitContacts);
                return iInitContacts >= 0;
            } catch (JSONException e) {
                LOGGER.error("provide3.0 init edge occur exception:", (Throwable) e);
            }
        }
        LOGGER.info("provide3.0 initEdge end,contactJS is null:{}", Boolean.valueOf(jSONObject == null));
        return false;
    }

    public void invalidContactsData() {
        this.phoneCallSolver.invalidContactsData();
    }

    @Override // defpackage.d08, defpackage.zz7
    public JSONObject parse(String str, n08 n08Var) {
        return this.phoneCallSolver.parseFor3_0(str, n08Var);
    }

    @Override // defpackage.d08, defpackage.zz7
    public a08 provide(JSONObject jSONObject, List<Instruction> list, n08 n08Var) {
        return this.phoneCallSolver.provideFor3_0(jSONObject, list, n08Var);
    }

    @Override // defpackage.d08
    public boolean restoreFromPersistData(Object obj) {
        return this.phoneCallSolver.restoreFromPersistData(obj);
    }

    public JSONObject clearPrivacyInfo(JSONObject jSONObject) throws Exception {
        return this.phoneCallSolver.clearPrivacyInfo(jSONObject);
    }

    @Override // defpackage.d08
    public List<Contact> obtainPersistData() {
        return this.phoneCallSolver.obtainPersistData();
    }

    public Context clearPrivacyInfo(Instruction instruction) throws Exception {
        return this.phoneCallSolver.clearPrivacyInfo(instruction);
    }
}
