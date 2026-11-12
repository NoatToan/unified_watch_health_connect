package com.xiaomi.ai.domain.phonecall;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.DeviceApp;
import com.xiaomi.ai.domain.phonecall.common.EventInfo;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallAnswer;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallContent;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallRequestEnv;
import com.xiaomi.ai.domain.phonecall.common.ResultEventInfo;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.ai.domain.phonecall.parser.PhoneCallParserImpl;
import com.xiaomi.ai.domain.phonecall.provider.PhoneCallProviderImpl;
import com.xiaomi.ai.domain.phonecall.util.ABTestConfig;
import com.xiaomi.ai.domain.phonecall.util.ABTestConfigLoader;
import com.xiaomi.ai.domain.phonecall.util.ABTestGroupType;
import com.xiaomi.ai.domain.phonecall.util.Instruction3_0Util;
import com.xiaomi.ai.domain.phonecall.util.UAUtils;
import com.xiaomi.ai.edge.common.model.FullEdgeRequestEnv;
import com.xiaomi.common.Optional;
import com.xiaomi.onetrack.OneTrack;
import defpackage.a08;
import defpackage.aqe;
import defpackage.c4h;
import defpackage.klo;
import defpackage.mjh;
import defpackage.n08;
import defpackage.qpe;
import defpackage.yz7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallSolver implements yz7 {
    private static final String OFFLINE_HELP_INFO = "小爱还不支持这个功能哦，你可以对我说“打电话给某某”";
    private static final qpe LOGGER = aqe.f(PhoneCallSolver.class);
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    private PhoneCallParserImpl parser = new PhoneCallParserImpl();
    private PhoneCallProviderImpl provider = new PhoneCallProviderImpl();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private InstructionHelper instructionHelper = new InstructionHelper();
    private ABTestConfig testConfig = ABTestConfigLoader.getInstance().getTestConfig();

    private EventInfo getEventInfoFromRespStr(JSONObject jSONObject, boolean z) throws JSONException {
        if (jSONObject == null) {
            return new EventInfo();
        }
        String strOptString = jSONObject.optString("request_id");
        String strOptString2 = jSONObject.optString(OneTrack.Param.SESSION_ID);
        EventInfo eventInfo = ((PhoneCallAnswer) GSON.fromJson(new JSONObject(jSONObject.optJSONArray("answer").get(0).toString()).toString(), PhoneCallAnswer.class)).getIntention().getEventInfo();
        if (!z) {
            eventInfo.clearPrivacy(strOptString2, strOptString);
        }
        return eventInfo;
    }

    private static String getRequestId(Instruction instruction) {
        Optional<String> dialogId;
        return (instruction == null || (dialogId = instruction.getDialogId()) == null || !dialogId.c()) ? "" : dialogId.b();
    }

    private String getToSpeak(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return "";
        }
        return ((PhoneCallAnswer) GSON.fromJson(new JSONObject(jSONObject.optJSONArray("answer").get(0).toString()).toString(), PhoneCallAnswer.class)).getContent().getToSpeak();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static mjh<String, Phone.PhoneIntention> instructionToPhoneIntention(Instruction instruction) {
        Nlp.AuxiliaryIntention auxiliaryIntention;
        if (instruction == null) {
            return new mjh<>(null, null);
        }
        Optional<String> dialogId = instruction.getDialogId();
        String strB = (dialogId == null || !dialogId.c()) ? "" : dialogId.b();
        if (instruction.getNamespace().equals(AIApiConstants.Nlp.NAME) && instruction.getName().equals("AuxiliaryIntention") && (instruction.getPayload() instanceof Nlp.AuxiliaryIntention) && (auxiliaryIntention = (Nlp.AuxiliaryIntention) instruction.getPayload()) != null && auxiliaryIntention.getType().equals(Nlp.IntentionType.PHONE)) {
            try {
                return new mjh<>(strB, (Phone.PhoneIntention) APIUtils.fromJsonNode(auxiliaryIntention.getIntention(), Phone.PhoneIntention.class));
            } catch (Exception e) {
                LOGGER.error("request_id:{}, parse PhoneIntention failure:{}", strB, e.getMessage());
            }
        }
        return new mjh<>(null, null);
    }

    public JSONArray clearPrivacyInfo(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray(jSONArray.toString());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                PhoneCallAnswer phoneCallAnswer = (PhoneCallAnswer) GSON.fromJson(jSONArray.optJSONObject(i).toString(), PhoneCallAnswer.class);
                phoneCallAnswer.getContent().setToSpeak("");
                phoneCallAnswer.getContent().setToDisplay("");
                ArrayList arrayList = new ArrayList();
                Iterator<PhoneItem> it = phoneCallAnswer.getContent().getPhoneList().iterator();
                while (it.hasNext()) {
                    arrayList.add(new PhoneItem("", "", it.next().getTag(), "", false));
                }
                phoneCallAnswer.getContent().setPhoneList(arrayList);
                phoneCallAnswer.getIntention().setFixName("");
                phoneCallAnswer.getIntention().setFixQuery("");
                phoneCallAnswer.getIntention().getEventInfo().clearOtherInfos();
                phoneCallAnswer.getIntention().getEventInfo().setContactCnt(0);
                phoneCallAnswer.setText("");
                jSONObjectOptJSONObject = new JSONObject(GSON.toJson(phoneCallAnswer));
            } catch (Exception e) {
                jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                LOGGER.error("clear failed {}", (Throwable) e);
            }
            jSONArray2.put(i, jSONObjectOptJSONObject);
        }
        return jSONArray2;
    }

    public boolean contactDataIsEmpty() {
        return this.provider.getContactData().isEmpty();
    }

    public List<String> getContactNames() {
        this.readWriteLock.readLock().lock();
        LOGGER.info("getContactNames readWriteLock.readLock().lock()");
        try {
            return this.provider.getContactNames();
        } catch (Exception e) {
            LOGGER.error("getContactNames Exception:{}", e.getMessage());
            return new ArrayList();
        } finally {
            LOGGER.info("getContactNames readWriteLock.readLock().unlock()");
            this.readWriteLock.readLock().unlock();
        }
    }

    @Override // defpackage.yz7
    public String getDomain() {
        return "phonecall";
    }

    public int initContacts(JSONObject jSONObject) throws JSONException {
        this.readWriteLock.writeLock().lock();
        qpe qpeVar = LOGGER;
        qpeVar.info("provide3.0 initContacts readWriteLock.writeLock().lock()");
        try {
            try {
                int iInitContacts = this.provider.initContacts(jSONObject);
                this.parser.setContactData(this.provider.getContactData());
                qpeVar.info("provide3.0 initContacts readWriteLock.writeLock().unlock()");
                this.readWriteLock.writeLock().unlock();
                return iInitContacts;
            } catch (JSONException e) {
                LOGGER.error("provide3.0 initContacts JSONException:{}", e.getMessage());
                throw e;
            }
        } catch (Throwable th) {
            LOGGER.info("provide3.0 initContacts readWriteLock.writeLock().unlock()");
            this.readWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public void invalidContactsData() {
        this.provider.getContactData().clear();
    }

    @Override // defpackage.yz7
    public JSONObject parse(String str, n08 n08Var) {
        JSONObject jSONObjectJ;
        if (n08Var != null) {
            try {
                jSONObjectJ = n08Var.getContext().j();
            } catch (Exception e) {
                LOGGER.error("parse intention occur exception: {}", (Throwable) e);
                return null;
            }
        } else {
            jSONObjectJ = null;
        }
        return new JSONObject(GSON.toJson(this.parser.parse(str, Boolean.FALSE, jSONObjectJ, (n08Var == null || n08Var.getSession() == null) ? null : n08Var.getSession().a(), new PhoneCallRequestEnv(n08Var))));
    }

    public JSONObject parseFor3_0(String str, n08 n08Var) {
        JSONObject jSONObjectJ;
        String requestId = (n08Var == null || n08Var.getRequestId() == null) ? "" : n08Var.getRequestId();
        if (n08Var != null) {
            try {
                jSONObjectJ = n08Var.getContext().j();
            } catch (Exception e) {
                LOGGER.error("parse fail: request_id:{}, exception:{}", requestId, e.getMessage());
                return null;
            }
        } else {
            jSONObjectJ = null;
        }
        return new JSONObject(GSON.toJson(this.parser.parse(str, Boolean.FALSE, Instruction3_0Util.buildOfflineContextForProto3(jSONObjectJ), (n08Var == null || n08Var.getSession() == null) ? null : n08Var.getSession().a(), new PhoneCallRequestEnv(n08Var))));
    }

    @Override // defpackage.yz7
    public a08 provide(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        int version;
        try {
            boolean z = PhoneContextSolver.chooseRequestContext(jSONObject, jSONObject2, n08Var) == jSONObject2;
            JSONObject jSONObjectProvideFor2_0 = jSONObject2 != null ? provideFor2_0(jSONObject2, false, n08Var) : null;
            JSONObject jSONObjectProvideFor2_1 = jSONObject != null ? provideFor2_0(jSONObject, true, n08Var) : null;
            boolean zC = n08Var != null ? n08Var.getContext().c() : false;
            ABTestGroupType testGroup = ABTestGroupType.DEFAULT;
            if (n08Var == null || this.testConfig == null) {
                version = -1;
            } else {
                testGroup = this.testConfig.getTestGroup(new PhoneCallRequestEnv(new DeviceApp(n08Var.getAppId(), n08Var.getAppName(), n08Var.getDevice() != null ? n08Var.getDevice().a() : ""), n08Var.getDeviceId(), n08Var.getUserInfo().a()));
                version = this.testConfig.getVersion();
            }
            ResultEventInfo resultEventInfo = new ResultEventInfo();
            resultEventInfo.setUseOnlineQuery(z);
            resultEventInfo.setGroupType(testGroup);
            resultEventInfo.setAbTestVersion(version);
            resultEventInfo.setHasPrivacyInfo(zC);
            resultEventInfo.setOnlineInfo(getEventInfoFromRespStr(jSONObjectProvideFor2_0, zC));
            resultEventInfo.setLocalInfo(getEventInfoFromRespStr(jSONObjectProvideFor2_1, zC));
            a08 a08Var = new a08();
            if (!z) {
                jSONObjectProvideFor2_0 = jSONObjectProvideFor2_1;
            }
            a08Var.d(jSONObjectProvideFor2_0);
            a08Var.c(new JSONObject(GSON.toJson(resultEventInfo)));
            return a08Var;
        } catch (JSONException e) {
            LOGGER.error("provide for 2.0 occur exception: {}", (Throwable) e);
            return null;
        }
    }

    public JSONObject provideFor2_0(JSONObject jSONObject, boolean z, n08 n08Var) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 200);
        jSONObject3.put("error_type", "success");
        jSONObject2.put("status", jSONObject3);
        this.readWriteLock.readLock().lock();
        String strOptString = jSONObject.optString("request_id");
        String strOptString2 = jSONObject.optString(OneTrack.Param.SESSION_ID);
        try {
            int iBuildNumber = UAUtils.buildNumber(n08Var.getUserAgent());
            JSONObject jSONObjectJ = n08Var.getContext().j();
            if (jSONObjectJ == null) {
                jSONObjectJ = new JSONObject();
            }
            JSONObject jSONObject4 = jSONObjectJ;
            PhoneCallIntention phoneCallIntention = (PhoneCallIntention) GSON.fromJson(z ? jSONObject.toString() : jSONObject.optString("intention", null), PhoneCallIntention.class);
            if (phoneCallIntention == null) {
                phoneCallIntention = new PhoneCallIntention();
            }
            PhoneCallRequestEnv phoneCallRequestEnv = new PhoneCallRequestEnv(n08Var);
            phoneCallRequestEnv.setGroupType(this.testConfig.getTestGroup(phoneCallRequestEnv));
            PhoneCallContent phoneCallContentProvide = this.provider.provide(phoneCallIntention, jSONObject4, null, phoneCallRequestEnv);
            if (phoneCallContentProvide.getToSpeak().isEmpty()) {
                phoneCallContentProvide.setToSpeak(OFFLINE_HELP_INFO);
                phoneCallContentProvide.setToDisplay(OFFLINE_HELP_INFO);
                phoneCallContentProvide.getPhoneList().clear();
            }
            PhoneCallAnswer phoneCallAnswer = new PhoneCallAnswer();
            phoneCallAnswer.setIntention(phoneCallIntention);
            phoneCallAnswer.setContent(phoneCallContentProvide);
            phoneCallAnswer.setText(phoneCallContentProvide.getToSpeak());
            phoneCallAnswer.setAction(phoneCallIntention.getAction());
            phoneCallAnswer.setDomain(phoneCallIntention.getDomain());
            Iterator<SlotRet> it = phoneCallAnswer.getIntention().getSlotRets().iterator();
            while (it.hasNext()) {
                phoneCallAnswer.getIntention().getEventInfo().addSlot(it.next().getSlot());
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(GSON.toJson(phoneCallAnswer)));
            JSONArray jSONArray2 = new JSONArray(this.instructionHelper.buildInstructions(strOptString, phoneCallAnswer, phoneCallRequestEnv, jSONObject4, iBuildNumber));
            jSONObject2.put("answer", jSONArray);
            jSONObject2.put("instructions", jSONArray2);
            jSONObject2.put(OneTrack.Param.SESSION_ID, strOptString2);
            jSONObject2.put("request_id", strOptString);
            return jSONObject2;
        } catch (JsonProcessingException e) {
            LOGGER.error("provide2.0 request_id:{}, exception:{}", strOptString, e.getMessage());
            return null;
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public JSONObject provideFor3_0(JSONObject jSONObject, n08 n08Var, Boolean bool) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 200);
        jSONObject3.put("error_type", "success");
        jSONObject2.put("status", jSONObject3);
        this.readWriteLock.readLock().lock();
        String requestId = n08Var.getRequestId();
        try {
            int iBuildNumber = UAUtils.buildNumber(n08Var.getUserAgent());
            JSONObject jSONObjectBuildOfflineContextForProto3 = Instruction3_0Util.buildOfflineContextForProto3(n08Var.getContext().j());
            PhoneCallRequestEnv phoneCallRequestEnv = new PhoneCallRequestEnv(n08Var);
            PhoneCallAnswer phoneCallAnswerProvideInternalFor3_0 = provideInternalFor3_0(jSONObject, "", requestId, jSONObjectBuildOfflineContextForProto3, phoneCallRequestEnv, bool);
            if (phoneCallAnswerProvideInternalFor3_0.getContent().getToSpeak().isEmpty()) {
                phoneCallAnswerProvideInternalFor3_0.getContent().setToSpeak(OFFLINE_HELP_INFO);
                phoneCallAnswerProvideInternalFor3_0.getContent().setToDisplay(OFFLINE_HELP_INFO);
                phoneCallAnswerProvideInternalFor3_0.getContent().getPhoneList().clear();
            }
            Iterator<SlotRet> it = phoneCallAnswerProvideInternalFor3_0.getIntention().getSlotRets().iterator();
            while (it.hasNext()) {
                phoneCallAnswerProvideInternalFor3_0.getIntention().getEventInfo().addSlot(it.next().getSlot());
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(GSON.toJson(phoneCallAnswerProvideInternalFor3_0)));
            JSONArray jSONArray2 = new JSONArray(this.instructionHelper.buildInstructions(requestId, phoneCallAnswerProvideInternalFor3_0, phoneCallRequestEnv, jSONObjectBuildOfflineContextForProto3, iBuildNumber));
            jSONObject2.put("answer", jSONArray);
            jSONObject2.put("instructions", jSONArray2);
            jSONObject2.put(OneTrack.Param.SESSION_ID, "");
            jSONObject2.put("request_id", requestId);
            return jSONObject2;
        } catch (JsonProcessingException e) {
            LOGGER.error("provide3.0 request_id:{}, exception:{}", requestId, e.getMessage());
            return null;
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public PhoneCallAnswer provideInternalFor3_0(JSONObject jSONObject, String str, String str2, JSONObject jSONObject2, PhoneCallRequestEnv phoneCallRequestEnv, Boolean bool) {
        phoneCallRequestEnv.setGroupType(this.testConfig.getTestGroup(phoneCallRequestEnv));
        PhoneCallIntention phoneCallIntention = (PhoneCallIntention) GSON.fromJson(jSONObject.toString(), PhoneCallIntention.class);
        try {
            phoneCallIntention.setAction(jSONObject.getString("action"));
        } catch (JSONException e) {
            LOGGER.error("provide3.0 isOnline:{} request_id:{},message:{}", bool, str2, e.getMessage());
        }
        if (phoneCallIntention == null) {
            phoneCallIntention = new PhoneCallIntention();
        }
        LOGGER.info("provide3.0 isOnline:{} request_id:{},ntention:{}", bool, str2, jSONObject);
        PhoneCallContent phoneCallContentProvide = this.provider.provide(phoneCallIntention, jSONObject2, null, phoneCallRequestEnv);
        phoneCallIntention.setAction(ActionType.fromString(phoneCallIntention.getAction()));
        phoneCallIntention.getEventInfo().encryptOtherInfo(str, str2);
        PhoneCallAnswer phoneCallAnswer = new PhoneCallAnswer();
        phoneCallAnswer.setIntention(phoneCallIntention);
        phoneCallAnswer.setContent(phoneCallContentProvide);
        phoneCallAnswer.setText(phoneCallContentProvide.getToSpeak());
        phoneCallAnswer.setAction(phoneCallIntention.getAction());
        phoneCallAnswer.setDomain(phoneCallIntention.getDomain());
        return phoneCallAnswer;
    }

    public boolean restoreFromPersistData(Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        qpe qpeVar = LOGGER;
        qpeVar.info("restoreFromPersistData start writeLock.lock");
        this.readWriteLock.writeLock().lock();
        try {
            boolean zRestoreFromPersistData = this.provider.restoreFromPersistData(obj);
            qpeVar.info("restoreFromPersistData end,cost:{}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return zRestoreFromPersistData;
        } catch (Exception e) {
            LOGGER.error("restoreFromPersistData occur Exception:", (Throwable) e);
            return false;
        } finally {
            LOGGER.info("restoreFromPersistData finally writeLock.unlock");
            this.readWriteLock.writeLock().unlock();
        }
    }

    public PhoneCallAnswer solve(String str, JSONObject jSONObject) {
        return solve(str, "", "", jSONObject, null, new PhoneCallRequestEnv());
    }

    public mjh<PhoneCallAnswer, JSONArray> solveFor3(String str, JSONObject jSONObject) {
        return solveFor3(str, "", "", jSONObject, null, new PhoneCallRequestEnv());
    }

    public mjh<PhoneCallAnswer, JSONArray> solveFor3BlueTooth(String str, JSONObject jSONObject, DeviceApp deviceApp) {
        PhoneCallRequestEnv phoneCallRequestEnv = new PhoneCallRequestEnv(deviceApp);
        phoneCallRequestEnv.setBlueTooth(true);
        return solveFor3(str, "", "", jSONObject, null, phoneCallRequestEnv);
    }

    public List<Contact> obtainPersistData() {
        return this.provider.obtainPersistData();
    }

    public PhoneCallAnswer solve(String str, JSONObject jSONObject, JSONObject jSONObject2, DeviceApp deviceApp) {
        return solve(str, "", "", jSONObject, jSONObject2, new PhoneCallRequestEnv(deviceApp));
    }

    public mjh<PhoneCallAnswer, JSONArray> solveFor3(String str, JSONObject jSONObject, DeviceApp deviceApp) {
        return solveFor3(str, "", "", jSONObject, null, new PhoneCallRequestEnv(deviceApp));
    }

    public PhoneCallAnswer solve(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, PhoneCallRequestEnv phoneCallRequestEnv) {
        phoneCallRequestEnv.setGroupType(this.testConfig.getTestGroup(phoneCallRequestEnv));
        PhoneCallIntention phoneCallIntention = this.parser.parse(str, Boolean.FALSE, jSONObject, jSONObject2, phoneCallRequestEnv);
        PhoneCallContent phoneCallContentProvide = this.provider.provide(phoneCallIntention, jSONObject, null, phoneCallRequestEnv);
        phoneCallIntention.setAction(ActionType.fromString(phoneCallIntention.getAction()));
        phoneCallIntention.getEventInfo().encryptOtherInfo(str2, str3);
        PhoneCallAnswer phoneCallAnswer = new PhoneCallAnswer();
        phoneCallAnswer.setIntention(phoneCallIntention);
        phoneCallAnswer.setContent(phoneCallContentProvide);
        phoneCallAnswer.setText(phoneCallContentProvide.getToSpeak());
        phoneCallAnswer.setAction(phoneCallIntention.getAction());
        phoneCallAnswer.setDomain(phoneCallIntention.getDomain());
        return phoneCallAnswer;
    }

    public mjh<PhoneCallAnswer, JSONArray> solveFor3(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, PhoneCallRequestEnv phoneCallRequestEnv) {
        FullEdgeRequestEnv fullEdgeRequestEnv = new FullEdgeRequestEnv();
        if (phoneCallRequestEnv.isBlueTooth()) {
            fullEdgeRequestEnv.setCurrentModels(new String[]{"BLUE_TOOTH"});
        }
        fullEdgeRequestEnv.setSelectDefaultCard(true);
        fullEdgeRequestEnv.setRequestId(str3);
        fullEdgeRequestEnv.setAppId(phoneCallRequestEnv.getAppId());
        try {
            Phone.PhoneIntention phoneIntentionFromContext = Instruction3_0Util.getPhoneIntentionFromContext(jSONObject);
            if (phoneIntentionFromContext != null) {
                fullEdgeRequestEnv.getContext().g(APIUtils.buildInstruction(new Nlp.AuxiliaryIntention(Nlp.IntentionType.PHONE, (c4h) APIUtils.toJsonNode(phoneIntentionFromContext))));
            }
            Template.Toast toastFromContext = Instruction3_0Util.getToastFromContext(jSONObject);
            if (toastFromContext != null) {
                fullEdgeRequestEnv.getContext().g(APIUtils.buildInstruction(toastFromContext));
            }
            SpeechSynthesizer.Speak speakFromContext = Instruction3_0Util.getSpeakFromContext(jSONObject);
            if (speakFromContext != null) {
                fullEdgeRequestEnv.getContext().g(APIUtils.buildInstruction(speakFromContext));
            }
            if (jSONObject != null && jSONObject.has("device_status")) {
                fullEdgeRequestEnv.getContext().e(jSONObject.optJSONObject("device_status"));
            }
            a08 a08VarProvideFor3_0 = provideFor3_0(parseFor3_0(str, fullEdgeRequestEnv), (List<Instruction>) null, fullEdgeRequestEnv);
            return new mjh<>((PhoneCallAnswer) GSON.fromJson(new JSONObject(a08VarProvideFor3_0.b().optJSONArray("answer").get(0).toString()).toString(), PhoneCallAnswer.class), a08VarProvideFor3_0.b().optJSONArray("instructions"));
        } catch (JSONException e) {
            LOGGER.error("exception:{}", e.getMessage());
            return new mjh<>(null, null);
        }
    }

    private static mjh<String, Phone.PhoneIntention> instructionToPhoneIntention(List<Instruction> list) {
        if (list == null) {
            return new mjh<>(null, null);
        }
        Iterator<Instruction> it = list.iterator();
        while (it.hasNext()) {
            mjh<String, Phone.PhoneIntention> mjhVarInstructionToPhoneIntention = instructionToPhoneIntention(it.next());
            if (mjhVarInstructionToPhoneIntention.c() != null) {
                return mjhVarInstructionToPhoneIntention;
            }
        }
        return new mjh<>(null, null);
    }

    public JSONObject clearPrivacyInfo(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        JSONObject jSONObject3 = (jSONObject2.getString("namespace").equals(AIApiConstants.Nlp.NAME) && jSONObject2.getString("name").equals("AuxiliaryIntention")) ? jSONObject.getJSONObject(TSMAuthContants.PARAM_PAYLOAD).getJSONObject("intention") : null;
        if (jSONObject3 == null) {
            return null;
        }
        Phone.LocalCallingData localCallingData = new Phone.LocalCallingData();
        localCallingData.setAction(jSONObject3.getString("action"));
        if (jSONObject3.has("contacts")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject3.getJSONArray("contacts");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                Phone.Contact contact = new Phone.Contact();
                contact.setName("");
                contact.setId("");
                contact.setTag(jSONObject4.optString("tag"));
                contact.setNumber("");
                arrayList.add(contact);
            }
            localCallingData.setContacts(arrayList);
        }
        return new JSONObject(APIUtils.buildContext(localCallingData).toString());
    }

    public a08 provideFor3_0(JSONObject jSONObject, List<Instruction> list, n08 n08Var) {
        String strB;
        JSONObject jSONObject2;
        boolean z;
        String toSpeak;
        JSONObject jSONObjectProvideFor3_0;
        JSONObject jSONObjectProvideFor3_1;
        int version;
        try {
            mjh<String, Phone.PhoneIntention> mjhVarInstructionToPhoneIntention = instructionToPhoneIntention(list);
            if (mjhVarInstructionToPhoneIntention.b() == null) {
                strB = "";
            } else {
                strB = mjhVarInstructionToPhoneIntention.b();
                if (klo.b(n08Var.getRequestId())) {
                    n08Var.setRequestId(strB);
                }
            }
            Phone.PhoneIntention phoneIntentionC = mjhVarInstructionToPhoneIntention.c();
            if (phoneIntentionC != null) {
                PhoneCallIntention phoneCallIntentionTransIntentionToPhoneCallIntention = Instruction3_0Util.transIntentionToPhoneCallIntention(phoneIntentionC);
                String action = phoneCallIntentionTransIntentionToPhoneCallIntention.getAction();
                z = klo.d(action) && action.startsWith("MESSAGE");
                LOGGER.info("provide3.0 request_id:{}, action:{}，isMessage:{}", strB, action, Boolean.valueOf(z));
                jSONObject2 = new JSONObject(GSON.toJson(phoneCallIntentionTransIntentionToPhoneCallIntention));
            } else {
                jSONObject2 = null;
                z = false;
            }
            boolean z2 = PhoneContextSolver.chooseRequestContext(jSONObject, jSONObject2, n08Var) == jSONObject2 || z;
            if (jSONObject2 == null) {
                toSpeak = "";
                jSONObjectProvideFor3_0 = null;
            } else {
                LOGGER.info("provide3.0 request_id:{}, isOnlineRespJS :{}", strB, true);
                jSONObjectProvideFor3_0 = provideFor3_0(jSONObject2, n08Var, Boolean.TRUE);
                toSpeak = getToSpeak(jSONObjectProvideFor3_0);
            }
            if (jSONObject == null || z) {
                jSONObjectProvideFor3_1 = null;
            } else {
                LOGGER.info("provide3.0 request_id:{}, isOfflineRespJS :{}", strB, true);
                jSONObjectProvideFor3_1 = provideFor3_0(jSONObject, n08Var, Boolean.FALSE);
                toSpeak = getToSpeak(jSONObjectProvideFor3_0);
            }
            boolean zC = n08Var != null ? n08Var.getContext().c() : false;
            ABTestGroupType testGroup = ABTestGroupType.DEFAULT;
            if (n08Var == null || this.testConfig == null) {
                version = -1;
            } else {
                testGroup = this.testConfig.getTestGroup(new PhoneCallRequestEnv(new DeviceApp(n08Var.getAppId(), n08Var.getAppName(), n08Var.getDevice() != null ? n08Var.getDevice().a() : ""), n08Var.getDeviceId(), n08Var.getUserInfo().a()));
                version = this.testConfig.getVersion();
            }
            ResultEventInfo resultEventInfo = new ResultEventInfo();
            resultEventInfo.setUseOnlineQuery(z2);
            resultEventInfo.setGroupType(testGroup);
            resultEventInfo.setAbTestVersion(version);
            if (phoneIntentionC != null && phoneIntentionC.isHadChosen().c() && phoneIntentionC.isHadChosen().b().booleanValue() && phoneIntentionC.getChosenIndex().c()) {
                resultEventInfo.setQueryPosition(phoneIntentionC.getChosenIndex().b().intValue());
            }
            resultEventInfo.setOnlineInfo(getEventInfoFromRespStr(jSONObjectProvideFor3_0, zC));
            resultEventInfo.setLocalInfo(getEventInfoFromRespStr(jSONObjectProvideFor3_1, zC));
            resultEventInfo.setTtsContent(toSpeak);
            resultEventInfo.setHasPrivacyInfo(zC);
            a08 a08Var = new a08();
            if (!z2) {
                jSONObjectProvideFor3_0 = jSONObjectProvideFor3_1;
            }
            a08Var.d(jSONObjectProvideFor3_0);
            a08Var.c(resultEventInfo.getEventInfoJson());
            return a08Var;
        } catch (JSONException e) {
            LOGGER.error("provide3.0 request_id:{}, exception:{}", n08Var.getRequestId() != null ? n08Var.getRequestId() : "", e.getMessage());
            return null;
        }
    }

    public Context clearPrivacyInfo(Instruction instruction) throws Exception {
        String requestId = getRequestId(instruction);
        mjh<String, Phone.PhoneIntention> mjhVarInstructionToPhoneIntention = instructionToPhoneIntention(instruction);
        if (mjhVarInstructionToPhoneIntention.c() == null) {
            LOGGER.error("request_id:{}, parse PhoneIntention failure", requestId);
            return null;
        }
        Phone.PhoneIntention phoneIntentionC = mjhVarInstructionToPhoneIntention.c();
        Phone.LocalCallingData localCallingData = new Phone.LocalCallingData();
        localCallingData.setAction(phoneIntentionC.getAction());
        if (phoneIntentionC.getContacts() != null && phoneIntentionC.getContacts().c()) {
            ArrayList arrayList = new ArrayList();
            for (Phone.Contact contact : phoneIntentionC.getContacts().b()) {
                contact.setName("");
                contact.setId("");
                contact.setNumber("");
                arrayList.add(contact);
            }
            localCallingData.setContacts(arrayList);
        }
        return APIUtils.buildContext(localCallingData);
    }
}
