package com.xiaomi.ai.domain.phonecall.provider;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.MatchRet;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallContent;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallRequestEnv;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.ContactData;
import com.xiaomi.ai.domain.phonecall.contact.RelativeMappingData;
import com.xiaomi.ai.domain.phonecall.util.ABTestGroupType;
import com.xiaomi.ai.domain.phonecall.util.IntentionUtils;
import com.xiaomi.ai.domain.phonecall.util.NameNormaliztion;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.aqe;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallProviderImpl {
    private static final qpe LOGGER = aqe.f(PhoneCallProviderImpl.class);
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    private ContactSimMatcher contactSimMatcher = new ContactSimMatcher();
    private ContactData localContactData = new ContactData();
    private QueryProvider provider = new QueryProvider();
    private ReQueryProvider reProvider = new ReQueryProvider();
    private RelativeMappingData relativeMappingData = RelativeMappingSingleton.getInstance().getRelativeMappingData();
    private boolean isLoadContactComplete = false;

    private PhoneCallContent provideFirstTurn(PhoneCallIntention phoneCallIntention, JSONObject jSONObject, PhoneCallRequestEnv phoneCallRequestEnv) {
        ContactData contactData;
        if (jSONObject != null) {
            contactData = new ContactData();
            contactData.initContactsFromJson(jSONObject);
        } else {
            contactData = this.localContactData;
        }
        if (contactData == null || contactData.isEmpty()) {
            qpe qpeVar = LOGGER;
            Object[] objArr = new Object[3];
            objArr[0] = phoneCallIntention.getFixQuery();
            objArr[1] = Boolean.valueOf(contactData == null);
            objArr[2] = Boolean.valueOf(contactData.isEmpty());
            qpeVar.error("{},contacts Data is null！contactData==null:{},contactData.isEmpty {}", objArr);
        } else {
            LOGGER.info("{},contacts Contact Info:{}", phoneCallIntention.getFixQuery(), contactData.toString());
        }
        phoneCallRequestEnv.getDeviceApp();
        ABTestGroupType groupType = phoneCallRequestEnv.getGroupType();
        if (groupType.equals(ABTestGroupType.ENABLE_NAME_MODEL_MATCHER) || groupType.equals(ABTestGroupType.WHITE_LIST)) {
            phoneCallIntention.setUseContactModelMatcher(true);
        }
        MatchRet matchRetMatch = phoneCallIntention.isUseContactModelMatcher() ? this.contactSimMatcher.match(phoneCallIntention, contactData, this.relativeMappingData) : this.contactSimMatcher.match(phoneCallIntention, contactData, this.relativeMappingData);
        if (matchRetMatch != null) {
            LOGGER.info("{} matchRet Info:{}", phoneCallIntention.getFixQuery(), matchRetMatch.toString());
        } else {
            LOGGER.error("{} matchRet is null！", phoneCallIntention.getFixQuery());
        }
        PhoneCallContent phoneCallContentProvide = this.provider.provide(phoneCallIntention, matchRetMatch, phoneCallRequestEnv);
        phoneCallContentProvide.setMatchRet(matchRetMatch);
        matchRetMatch.getEventInfo().setQuery(phoneCallIntention.getQuery());
        matchRetMatch.getEventInfo().setAction(matchRetMatch.getAction().toString());
        matchRetMatch.getEventInfo().setContactType(matchRetMatch.getNameType().toString());
        matchRetMatch.getEventInfo().setLoadContactComplete(this.isLoadContactComplete);
        phoneCallIntention.setAction(matchRetMatch.getAction().toString());
        phoneCallIntention.setFixName(matchRetMatch.getFixName());
        phoneCallIntention.setFixQuery(matchRetMatch.getFixQuery());
        phoneCallIntention.setMatchType(matchRetMatch.getMatchType());
        phoneCallIntention.setEventInfo(matchRetMatch.getEventInfo());
        phoneCallIntention.setDialogStatus(IntentionUtils.updateDialogStatusInProvider(phoneCallIntention));
        return phoneCallContentProvide;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    private PhoneCallContent provideMultiTurn(PhoneCallIntention phoneCallIntention, JSONObject jSONObject, PhoneCallRequestEnv phoneCallRequestEnv) {
        PhoneCallIntention phoneCallIntention2;
        PhoneCallContent phoneCallContent;
        PhoneCallContent phoneCallContent2;
        PhoneCallIntention phoneCallIntention3 = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.optJSONObject("last_answer") == null || jSONObject.optJSONObject("last_answer").optJSONArray("data") == null || jSONObject.optJSONObject("last_answer").optJSONArray("data").length() <= 0) {
                    phoneCallContent2 = null;
                } else {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("last_answer").optJSONArray("data").optJSONObject(0);
                    Gson gson = GSON;
                    phoneCallIntention2 = (PhoneCallIntention) gson.fromJson(jSONObjectOptJSONObject.optJSONObject("intention").toString(), PhoneCallIntention.class);
                    try {
                        phoneCallContent2 = (PhoneCallContent) gson.fromJson(jSONObjectOptJSONObject.optJSONObject(MiuiCursorConstants.CONTENT).toString(), PhoneCallContent.class);
                        phoneCallIntention3 = phoneCallIntention2;
                    } catch (Exception e) {
                        e = e;
                        LOGGER.error("parse contextJS , exception {}", (Throwable) e);
                        phoneCallContent = null;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                phoneCallIntention2 = null;
            }
        } else {
            phoneCallContent2 = null;
        }
        phoneCallContent = phoneCallContent2;
        phoneCallIntention2 = phoneCallIntention3;
        PhoneCallContent phoneCallContentProvide = this.reProvider.provide(phoneCallIntention, phoneCallIntention2, phoneCallContent, this.relativeMappingData, phoneCallRequestEnv);
        if (phoneCallIntention2 != null) {
            String action = phoneCallIntention2.getAction();
            ActionType actionType = ActionType.BROWSE;
            if (action.equals(actionType.toString()) && phoneCallIntention.getAction().equals(actionType.toString())) {
                phoneCallIntention.setProcessingRound(phoneCallIntention2.getProcessingRound() + 1);
            }
        }
        if (phoneCallIntention2 != null) {
            String action2 = phoneCallIntention2.getAction();
            ActionType actionType2 = ActionType.BROWSE_STORE;
            if (action2.equals(actionType2.toString()) && phoneCallIntention.getAction().equals(actionType2.toString())) {
                phoneCallIntention.setProcessingRound(phoneCallIntention2.getProcessingRound() + 1);
            }
        }
        updateActionByProcessingRound(phoneCallIntention, phoneCallIntention2);
        phoneCallIntention.setDialogStatus(IntentionUtils.updateDialogStatusInProvider(phoneCallIntention));
        return phoneCallContentProvide;
    }

    public ContactData getContactData() {
        return this.localContactData;
    }

    public List<String> getContactNames() {
        HashSet hashSet = new HashSet();
        ContactData contactData = this.localContactData;
        if (contactData != null) {
            Iterator<Contact> it = contactData.getContacts().iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                if (!name.isEmpty()) {
                    hashSet.add(name);
                    if (name.length() >= 3 && name.length() <= 4) {
                        String strSubstring = NameNormaliztion.getInstance().containSurName(name.substring(0, 2)).booleanValue() ? name.substring(2) : name.substring(1);
                        if (strSubstring.length() == 2) {
                            hashSet.add(strSubstring);
                        }
                    }
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public int initContacts(JSONObject jSONObject) throws JSONException {
        int iInitContactsFromJson = this.localContactData.initContactsFromJson(jSONObject);
        this.isLoadContactComplete = true;
        return iInitContactsFromJson;
    }

    public PhoneCallContent provide(PhoneCallIntention phoneCallIntention, JSONObject jSONObject, JSONObject jSONObject2, PhoneCallRequestEnv phoneCallRequestEnv) {
        if (phoneCallIntention == null || phoneCallIntention.getScore() < 0.5d) {
            return new PhoneCallContent();
        }
        PhoneCallContent phoneCallContentProvideFirstTurn = IntentionUtils.isFirstTurnInParser(phoneCallIntention) ? provideFirstTurn(phoneCallIntention, jSONObject2, phoneCallRequestEnv) : provideMultiTurn(phoneCallIntention, jSONObject, phoneCallRequestEnv);
        RelativeMappingSingleton.getInstance().serializeData();
        return phoneCallContentProvideFirstTurn;
    }

    public boolean restoreFromPersistData(Object obj) {
        ContactData contactData;
        try {
            List list = (List) obj;
            LOGGER.info("restore from persist data contactList.size() {}", Integer.valueOf(list.size()));
            contactData = new ContactData(list);
        } catch (Exception e) {
            LOGGER.error("restore from persist data FAIL:{}, exception", obj, e);
            contactData = null;
        }
        if (contactData != null) {
            this.localContactData = contactData;
        }
        return (contactData == null || contactData.isEmpty()) ? false : true;
    }

    public void updateActionByProcessingRound(PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2) {
        if ((phoneCallIntention.getAction().equals(ActionType.BROWSE.toString()) || phoneCallIntention.getAction().equals(ActionType.BROWSE_STORE.toString())) && phoneCallIntention2 != null && phoneCallIntention2.getProcessingRound() + 1 >= 3) {
            phoneCallIntention.setAction(ActionType.STOP);
        }
    }

    public List<Contact> obtainPersistData() {
        return this.localContactData.getContacts();
    }
}
