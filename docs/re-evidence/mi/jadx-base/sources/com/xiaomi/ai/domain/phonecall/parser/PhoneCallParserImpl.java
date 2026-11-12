package com.xiaomi.ai.domain.phonecall.parser;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.DeviceApp;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallAnswer;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallRequestEnv;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.ContactData;
import com.xiaomi.ai.domain.phonecall.util.ClientAdapter;
import com.xiaomi.ai.domain.phonecall.util.IntentionUtils;
import com.xiaomi.ai.nlp.contact.common.a;
import defpackage.aqe;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallParserImpl {
    private ContactData contactData;
    private QueryMatcher matcher = new QueryMatcher();
    private ReQueryMatcher reMatcher = new ReQueryMatcher();
    private static final qpe LOGGER = aqe.f(PhoneCallParserImpl.class);
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    private boolean enterMultipleTurn(PhoneCallAnswer phoneCallAnswer) {
        return (phoneCallAnswer == null || phoneCallAnswer.getIntention() == null || ActionType.STOP.getText().equalsIgnoreCase(phoneCallAnswer.getIntention().getAction()) || ActionType.SHOW_CONTACT_NUMBER.getText().equalsIgnoreCase(phoneCallAnswer.getIntention().getAction())) ? false : true;
    }

    private boolean isMultiturnSingleName(PhoneCallAnswer phoneCallAnswer, boolean z) {
        return phoneCallAnswer != null && phoneCallAnswer.getIntention() != null && IntentionUtils.lastSessionEnd(phoneCallAnswer.getIntention().getAction()) && z;
    }

    private boolean isSingleName(String str, ContactData contactData) {
        if (str.length() < 6 && contactData != null) {
            Iterator<a.C0349a> it = a.b().f(str, true).iterator();
            while (it.hasNext()) {
                Set<Contact> contactsByNamePinyin = contactData.getContactsByNamePinyin(it.next().c().toLowerCase());
                if (contactsByNamePinyin != null && contactsByNamePinyin.size() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static PhoneCallIntention parseFromContextJS(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optJSONObject("server_intention") == null || jSONObject.optJSONObject("server_intention").optJSONObject("data") == null) {
            return null;
        }
        try {
            return (PhoneCallIntention) GSON.fromJson(jSONObject.optJSONObject("server_intention").optJSONObject("data").toString(), PhoneCallIntention.class);
        } catch (JsonSyntaxException e) {
            LOGGER.warn("parse context server_intention, exception {}", (Throwable) e);
            return null;
        }
    }

    public PhoneCallIntention parse(String str, Boolean bool, JSONObject jSONObject, JSONObject jSONObject2) {
        return parse(str, bool, jSONObject, jSONObject2, new PhoneCallRequestEnv());
    }

    public void setContactData(ContactData contactData) {
        this.contactData = contactData;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    public PhoneCallIntention parse(String str, Boolean bool, JSONObject jSONObject, JSONObject jSONObject2, PhoneCallRequestEnv phoneCallRequestEnv) {
        PhoneCallAnswer phoneCallAnswer;
        PhoneCallIntention phoneCallIntention;
        boolean zOptBoolean;
        PhoneCallIntention fromContextJS = parseFromContextJS(jSONObject);
        DeviceApp deviceApp = phoneCallRequestEnv.getDeviceApp();
        String strOptString = null;
        if (jSONObject == null || jSONObject.length() <= 0) {
            phoneCallAnswer = null;
        } else {
            qpe qpeVar = LOGGER;
            Gson gson = GSON;
            qpeVar.debug("last contextJS {}, phoneCallRequestEnv {}", jSONObject, gson.toJson(phoneCallRequestEnv));
            if (jSONObject.optJSONObject("last_answer") == null) {
                phoneCallAnswer = null;
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("last_answer");
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("data");
                JSONObject jSONObjectOptJSONObject2 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? null : jSONObjectOptJSONObject.optJSONArray("data").optJSONObject(0);
                if (jSONObjectOptJSONObject2 != null) {
                    try {
                        phoneCallAnswer = (PhoneCallAnswer) gson.fromJson(jSONObjectOptJSONObject2.toString(), PhoneCallAnswer.class);
                    } catch (JsonSyntaxException e) {
                        LOGGER.warn("parse context last_answer failed, exception {}", (Throwable) e);
                        phoneCallAnswer = null;
                    }
                } else {
                    phoneCallAnswer = null;
                }
            }
            qpe qpeVar2 = LOGGER;
            qpeVar2.debug("last answer {}", GSON.toJson(phoneCallAnswer));
            if (jSONObject.optJSONObject("device_status") != null && (zOptBoolean = jSONObject.optJSONObject("device_status").optBoolean("phonecall_is_ringing"))) {
                qpeVar2.info("phonecallIsRinging {}", Boolean.valueOf(zOptBoolean));
            }
        }
        if (jSONObject != null && jSONObject.optJSONObject("rewriter") != null && jSONObject.optJSONObject("rewriter").optJSONObject("phonecall") != null) {
            strOptString = jSONObject.optJSONObject("rewriter").optJSONObject("phonecall").optString("origin_query");
        }
        if (strOptString == null || strOptString.equals(str)) {
            phoneCallIntention = parse(str, bool, phoneCallAnswer, deviceApp);
        } else {
            phoneCallIntention = parse(str, bool, phoneCallAnswer, deviceApp);
            PhoneCallIntention phoneCallIntention2 = parse(strOptString, bool, phoneCallAnswer, deviceApp);
            ArrayList arrayList = new ArrayList();
            for (SlotRet slotRet : phoneCallIntention.getSlotRets()) {
                slotRet.setQrw(Boolean.TRUE);
                arrayList.add(slotRet);
            }
            arrayList.addAll(phoneCallIntention2.getSlotRets());
            phoneCallIntention.setSlotRets(arrayList);
        }
        if (phoneCallIntention == null) {
            return fromContextJS;
        }
        if (fromContextJS != null && fromContextJS.getScore() > 0.5d && phoneCallIntention.getScore() < 0.5d) {
            return fromContextJS;
        }
        if (fromContextJS != null) {
            phoneCallIntention.setUseContactModelMatcher(fromContextJS.isUseContactModelMatcher());
        }
        return phoneCallIntention;
    }

    private PhoneCallIntention parse(String str, Boolean bool, PhoneCallAnswer phoneCallAnswer, DeviceApp deviceApp) {
        PhoneCallIntention phoneCallIntention;
        boolean zIsSingleName = isSingleName(str, this.contactData);
        if (enterMultipleTurn(phoneCallAnswer)) {
            phoneCallIntention = this.reMatcher.parse(str, phoneCallAnswer, zIsSingleName);
            PhoneCallIntention phoneCallIntention2 = this.matcher.parse(str, bool, deviceApp);
            if (phoneCallIntention2.getScore() > phoneCallIntention.getScore()) {
                phoneCallIntention = phoneCallIntention2;
            }
        } else {
            phoneCallIntention = this.matcher.parse(str, bool, deviceApp);
        }
        ClientAdapter.adaptParser(deviceApp, phoneCallIntention);
        phoneCallIntention.setAction(ActionType.fromString(phoneCallIntention.getAction()));
        return phoneCallIntention;
    }
}
