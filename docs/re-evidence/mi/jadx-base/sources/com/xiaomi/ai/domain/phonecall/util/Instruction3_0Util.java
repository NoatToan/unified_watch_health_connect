package com.xiaomi.ai.domain.phonecall.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.domain.phonecall.InstructionHelper;
import com.xiaomi.ai.domain.phonecall.common.CallMode;
import com.xiaomi.ai.domain.phonecall.common.CardType;
import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.common.NickNameInfo;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallAnswer;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallContent;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import defpackage.aqe;
import defpackage.c4h;
import defpackage.klo;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class Instruction3_0Util {
    private static final qpe LOGGER = aqe.f(Instruction3_0Util.class);
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public static Phone.PhoneIntention auxiliaryJsToIntention(String str) {
        try {
            return auxiliaryObjToIntention(new JSONObject(str));
        } catch (Exception e) {
            LOGGER.error("parse auxiliary json fail:{}", (Throwable) e);
            return null;
        }
    }

    public static Phone.PhoneIntention auxiliaryObjToIntention(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("header");
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(TSMAuthContants.PARAM_PAYLOAD);
            if (jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject3 == null || !jSONObjectOptJSONObject2.optString("namespace").equals(AIApiConstants.Nlp.NAME) || !jSONObjectOptJSONObject2.optString("name").equals("AuxiliaryIntention") || !jSONObjectOptJSONObject3.optString("type").equals(Nlp.IntentionType.PHONE.toString()) || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("intention")) == null) {
                return null;
            }
            return (Phone.PhoneIntention) APIUtils.fromJsonString(jSONObjectOptJSONObject.toString(), Phone.PhoneIntention.class);
        } catch (Exception e) {
            LOGGER.error("parse auxiliary json fail:{}", (Throwable) e);
            return null;
        }
    }

    public static JSONObject buildOfflineContextForProto3(JSONObject jSONObject) {
        PhoneCallAnswer phoneCallAnswerTransContextToAnswer = transContextToAnswer(jSONObject);
        if (phoneCallAnswerTransContextToAnswer == null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(GSON.toJson(phoneCallAnswerTransContextToAnswer)));
            jSONObject2.put("data", jSONArray);
            jSONObject.put("last_answer", jSONObject2);
            if (jSONObject.has("items")) {
                jSONObject.remove("items");
            }
        } catch (Exception e) {
            LOGGER.error("build 3.0 offline context fail,exception:{}", e.getMessage());
        }
        return jSONObject;
    }

    public static Instruction genAuxiliaryInstruction(JSONObject jSONObject) {
        return APIUtils.buildInstruction(new Nlp.AuxiliaryIntention(Nlp.IntentionType.PHONE, (c4h) APIUtils.toJsonNode(transPhoneCallIntentionToIntention((PhoneCallIntention) GSON.fromJson(jSONObject.toString(), PhoneCallIntention.class)))));
    }

    public static SpeechRecognizer.ExpectSpeech getExpectSpeechFromContext(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("items") && (jSONObject.get("items") instanceof JSONArray)) {
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("header");
                    JSONObject jSONObject4 = jSONObject2.getJSONObject(TSMAuthContants.PARAM_PAYLOAD);
                    boolean z = true;
                    boolean z2 = jSONObject3 != null;
                    if (jSONObject4 == null) {
                        z = false;
                    }
                    if ((z && z2) && jSONObject3.getString("namespace").equals(AIApiConstants.SpeechRecognizer.NAME) && jSONObject3.getString("name").equals("ExpectSpeech")) {
                        return (SpeechRecognizer.ExpectSpeech) APIUtils.fromJsonString(jSONObject4.toString(), SpeechRecognizer.ExpectSpeech.class);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("parse instructions fail, msg:{}", e.getMessage());
        }
        return null;
    }

    public static Phone.PhoneIntention getPhoneIntentionFromContext(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("items") && (jSONObject.get("items") instanceof JSONArray)) {
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("header");
                    JSONObject jSONObject5 = jSONObject3.getJSONObject(TSMAuthContants.PARAM_PAYLOAD);
                    boolean z = true;
                    boolean z2 = jSONObject4 != null;
                    if (jSONObject5 == null) {
                        z = false;
                    }
                    if ((z && z2) && jSONObject4.getString("namespace").equals(AIApiConstants.Nlp.NAME) && jSONObject4.getString("name").equals("AuxiliaryIntention") && jSONObject3.getJSONObject(TSMAuthContants.PARAM_PAYLOAD).optString("type").equals(Nlp.IntentionType.PHONE.toString()) && (jSONObject2 = jSONObject5.getJSONObject("intention")) != null) {
                        return (Phone.PhoneIntention) APIUtils.fromJsonString(jSONObject2.toString(), Phone.PhoneIntention.class);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("parse instructions fail, msg:{}", e.getMessage());
        }
        return null;
    }

    public static SpeechSynthesizer.Speak getSpeakFromContext(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("items") && (jSONObject.get("items") instanceof JSONArray)) {
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("header");
                    JSONObject jSONObject4 = jSONObject2.getJSONObject(TSMAuthContants.PARAM_PAYLOAD);
                    boolean z = true;
                    boolean z2 = jSONObject3 != null;
                    if (jSONObject4 == null) {
                        z = false;
                    }
                    if ((z && z2) && jSONObject3.getString("namespace").equals(AIApiConstants.SpeechSynthesizer.NAME) && jSONObject3.getString("name").equals("Speak")) {
                        return (SpeechSynthesizer.Speak) APIUtils.fromJsonString(jSONObject4.toString(), SpeechSynthesizer.Speak.class);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("parse instructions fail,msg:{}", e.getMessage());
        }
        return null;
    }

    public static Template.Toast getToastFromContext(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("items") && (jSONObject.get("items") instanceof JSONArray)) {
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("header");
                    JSONObject jSONObject4 = jSONObject2.getJSONObject(TSMAuthContants.PARAM_PAYLOAD);
                    boolean z = true;
                    boolean z2 = jSONObject3 != null;
                    if (jSONObject4 == null) {
                        z = false;
                    }
                    if ((z && z2) && jSONObject3.getString("namespace").equals(AIApiConstants.Template.NAME) && jSONObject3.getString("name").equals("Toast")) {
                        return (Template.Toast) APIUtils.fromJsonString(jSONObject4.toString(), Template.Toast.class);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("parse instructions fail, msg:{}", e.getMessage());
        }
        return null;
    }

    public static void parseInstructionsFromContext(JSONObject jSONObject, ParsedInstructions parsedInstructions) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("items") && (jSONObject.get("items") instanceof JSONArray)) {
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("header");
                    JSONObject jSONObject5 = jSONObject3.getJSONObject(TSMAuthContants.PARAM_PAYLOAD);
                    boolean z = true;
                    if (((jSONObject4 != null) && (jSONObject5 != null)) && jSONObject4.getString("namespace").equals(AIApiConstants.Nlp.NAME) && jSONObject4.getString("name").equals("AuxiliaryIntention")) {
                        if (jSONObject3.getJSONObject(TSMAuthContants.PARAM_PAYLOAD).optString("type").equals(Nlp.IntentionType.PHONE.toString()) && (jSONObject2 = jSONObject5.getJSONObject("intention")) != null) {
                            parsedInstructions.setIntention((Phone.PhoneIntention) APIUtils.fromJsonString(jSONObject2.toString(), Phone.PhoneIntention.class));
                        }
                    } else if (((jSONObject4 != null) && (jSONObject5 != null)) && jSONObject4.getString("namespace").equals(AIApiConstants.SpeechSynthesizer.NAME) && jSONObject4.getString("name").equals("Speak")) {
                        parsedInstructions.setSpeak((SpeechSynthesizer.Speak) APIUtils.fromJsonString(jSONObject5.toString(), SpeechSynthesizer.Speak.class));
                    } else if (((jSONObject4 != null) && (jSONObject5 != null)) && jSONObject4.getString("namespace").equals(AIApiConstants.SpeechRecognizer.NAME) && jSONObject4.getString("name").equals("ExpectSpeech")) {
                        parsedInstructions.setExpectSpeech((SpeechRecognizer.ExpectSpeech) APIUtils.fromJsonString(jSONObject5.toString(), SpeechRecognizer.ExpectSpeech.class));
                    } else {
                        boolean z2 = jSONObject4 != null;
                        if (jSONObject5 == null) {
                            z = false;
                        }
                        if ((z2 & z) && jSONObject4.getString("namespace").equals(AIApiConstants.Template.NAME) && jSONObject4.getString("name").equals("Toast")) {
                            parsedInstructions.setToast((Template.Toast) APIUtils.fromJsonString(jSONObject5.toString(), Template.Toast.class));
                        }
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("parse instructions fail, msg:{}", e.getMessage());
        }
    }

    public static PhoneCallAnswer transContextToAnswer(JSONObject jSONObject) {
        ParsedInstructions parsedInstructions = new ParsedInstructions();
        parseInstructionsFromContext(jSONObject, parsedInstructions);
        Phone.PhoneIntention intention = parsedInstructions.getIntention();
        if (intention == null) {
            return null;
        }
        Template.Toast toast = parsedInstructions.getToast();
        SpeechSynthesizer.Speak speak = parsedInstructions.getSpeak();
        SpeechRecognizer.ExpectSpeech expectSpeech = parsedInstructions.getExpectSpeech();
        PhoneCallAnswer phoneCallAnswer = new PhoneCallAnswer();
        phoneCallAnswer.setAction(intention.getAction());
        PhoneCallIntention phoneCallIntentionTransIntentionToPhoneCallIntention = transIntentionToPhoneCallIntention(intention);
        PhoneCallContent phoneCallContent = new PhoneCallContent();
        if (toast != null) {
            phoneCallContent.setToDisplay(toast.getText());
        }
        if (speak != null) {
            phoneCallContent.setToSpeak(speak.getText());
        }
        if (expectSpeech != null) {
            phoneCallContent.setOpenMic(true);
        }
        updateIntentionToPhoneCallContent(intention, phoneCallContent);
        phoneCallAnswer.setContent(phoneCallContent);
        phoneCallAnswer.setIntention(phoneCallIntentionTransIntentionToPhoneCallIntention);
        return phoneCallAnswer;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    public static PhoneCallIntention transIntentionToPhoneCallIntention(Phone.PhoneIntention phoneIntention) {
        PhoneCallIntention phoneCallIntention = new PhoneCallIntention();
        phoneCallIntention.setAction(phoneIntention.getAction());
        phoneCallIntention.setCardType(CardType.fromString(phoneIntention.getCardType().toString().toLowerCase()));
        if (phoneIntention.getBlockedRound().c()) {
            phoneCallIntention.setProcessingRound(phoneIntention.getBlockedRound().b().intValue());
        }
        phoneCallIntention.setName(phoneIntention.getName());
        if (phoneIntention.getQuery().c()) {
            phoneCallIntention.setQuery(phoneIntention.getQuery().b());
        }
        if (phoneIntention.getNormTag().c()) {
            phoneCallIntention.setNormTag(phoneIntention.getNormTag().b());
        }
        if (phoneIntention.getTag().c()) {
            phoneCallIntention.setTag(phoneIntention.getTag().b());
        }
        if (phoneIntention.getChosenIndex().c()) {
            phoneCallIntention.setPlayOrder(phoneIntention.getChosenIndex().b().intValue());
        }
        if (phoneIntention.getDisableInstructions().c() && phoneIntention.getDisableInstructions().b().size() == 2) {
            String str = phoneIntention.getDisableInstructions().b().get(0);
            List<String> list = InstructionHelper.toastSpeakInstructionNames;
            if (str.equals(list.get(0)) && phoneIntention.getDisableInstructions().b().get(1).equals(list.get(1))) {
                phoneCallIntention.setSelectPlayOrder(true);
            } else if (phoneIntention.isHadChosen().c()) {
                phoneCallIntention.setSelectPlayOrder(true);
            }
        } else if (phoneIntention.isHadChosen().c() && phoneIntention.isHadChosen().b().booleanValue()) {
            phoneCallIntention.setSelectPlayOrder(true);
        }
        if (phoneIntention.isMultipleTurn().c()) {
            phoneCallIntention.setRequery(phoneIntention.isMultipleTurn().b().booleanValue());
        }
        if (phoneIntention.getNameSlots() != null) {
            ArrayList arrayList = new ArrayList();
            for (Phone.NameSlot nameSlot : phoneIntention.getNameSlots()) {
                Phone.NameType nameType = nameSlot.getNameType();
                SlotRet slotRet = new SlotRet(nameSlot.getName(), nameSlot.getPrefix(), nameSlot.getSuffix(), Boolean.valueOf(nameSlot.isQrw()), Boolean.valueOf(nameSlot.isOfflineAsr()));
                slotRet.setNameType(NameType.toNameType(nameType));
                arrayList.add(slotRet);
            }
            phoneCallIntention.setSlotRets(arrayList);
        }
        if (phoneIntention.getNicknameInfo().c()) {
            Phone.NicknameInfo nicknameInfoB = phoneIntention.getNicknameInfo().b();
            phoneCallIntention.setNickNameInfo(new NickNameInfo(nicknameInfoB.getNickname(), nicknameInfoB.getName()));
        }
        if (phoneIntention.getContacts().c()) {
            for (Phone.Contact contact : phoneIntention.getContacts().b()) {
                phoneCallIntention.getContact().setName2(contact.getName()).getYellowPageNumbers().add(contact.getNumber());
            }
        }
        if (phoneIntention.getTailNumbers().c()) {
            phoneCallIntention.setTailNumber(phoneIntention.getTailNumbers().b());
        }
        if (phoneIntention.getCallMode().c() && phoneIntention.getCallMode().b().getId() == Phone.CallMode.HANDS_FREE.getId()) {
            phoneCallIntention.setCallMode(CallMode.HAND_FREE);
        }
        if (phoneIntention.getMessageText().c()) {
            phoneCallIntention.setMessageText(phoneIntention.getMessageText().b());
        }
        phoneCallIntention.setScore(0.9d);
        return phoneCallIntention;
    }

    private static Phone.NameType transNameType(NameType nameType) {
        if (nameType != null) {
            String string = nameType.toString();
            Phone.NameType nameType2 = Phone.NameType.NORMAL;
            if (string.equalsIgnoreCase(nameType2.toString())) {
                return nameType2;
            }
            String string2 = nameType.toString();
            Phone.NameType nameType3 = Phone.NameType.DIGIT;
            if (string2.equalsIgnoreCase(nameType3.toString())) {
                return nameType3;
            }
            String string3 = nameType.toString();
            Phone.NameType nameType4 = Phone.NameType.FAMOUS;
            if (string3.equalsIgnoreCase(nameType4.toString())) {
                return nameType4;
            }
            String string4 = nameType.toString();
            Phone.NameType nameType5 = Phone.NameType.RELATIVE;
            if (string4.equalsIgnoreCase(nameType5.toString())) {
                return nameType5;
            }
            String string5 = nameType.toString();
            Phone.NameType nameType6 = Phone.NameType.YELLOW_PAGE;
            if (string5.equalsIgnoreCase(nameType6.toString())) {
                return nameType6;
            }
        }
        return Phone.NameType.NORMAL;
    }

    public static Instruction<Nlp.AuxiliaryIntention> transNlpToAuxiliary(PhoneCallIntention phoneCallIntention, PhoneCallContent phoneCallContent) {
        Phone.PhoneIntention phoneIntentionTransPhoneCallIntentionToIntention = transPhoneCallIntentionToIntention(phoneCallIntention);
        ArrayList arrayList = new ArrayList();
        for (PhoneItem phoneItem : phoneCallContent.getPhoneList()) {
            Phone.Contact contact = new Phone.Contact();
            contact.setName(phoneItem.getName());
            contact.setNumber(phoneItem.getNumber());
            contact.setId(phoneItem.getUserId());
            contact.setTag(phoneItem.getTag());
            arrayList.add(contact);
        }
        phoneIntentionTransPhoneCallIntentionToIntention.setContacts(arrayList);
        return APIUtils.buildInstruction(new Nlp.AuxiliaryIntention(Nlp.IntentionType.PHONE, (c4h) APIUtils.toJsonNode(phoneIntentionTransPhoneCallIntentionToIntention)));
    }

    public static Phone.PhoneIntention transPhoneCallIntentionToIntention(PhoneCallIntention phoneCallIntention) {
        Phone.CardType cardType = Phone.CardType.DEFAULT;
        if (phoneCallIntention.getCardType().getText().equalsIgnoreCase("CARD_ONE")) {
            cardType = Phone.CardType.CARD_ONE;
        } else if (phoneCallIntention.getCardType().getText().equalsIgnoreCase("CARD_TWO")) {
            cardType = Phone.CardType.CARD_TWO;
        } else if (phoneCallIntention.getCardType().getText().equalsIgnoreCase("SIM_CARD")) {
            cardType = Phone.CardType.SIM_CARD;
        }
        ArrayList arrayList = new ArrayList();
        for (SlotRet slotRet : phoneCallIntention.getSlotRets()) {
            arrayList.add(new Phone.NameSlot(slotRet.getSlot(), slotRet.getPrefix(), slotRet.getSuffix(), slotRet.getQrw().booleanValue(), transNameType(slotRet.getNameType()), slotRet.getOfflineAsr()));
        }
        Phone.PhoneIntention phoneIntention = new Phone.PhoneIntention(phoneCallIntention.getAction(), phoneCallIntention.getName(), arrayList, cardType);
        phoneIntention.setChosenIndex(phoneCallIntention.getPlayOrder());
        if (phoneCallIntention.isSelectPlayOrder()) {
            phoneIntention.setDisableInstructions(InstructionHelper.toastSpeakInstructionNames);
            phoneIntention.setHadChosen(phoneCallIntention.isSelectPlayOrder());
        }
        phoneIntention.setBlockedRound(phoneCallIntention.getProcessingRound());
        phoneIntention.setMultipleTurn(phoneCallIntention.isRequery());
        if (phoneCallIntention.getCallMode() != null && phoneCallIntention.getCallMode().equals(CallMode.HAND_FREE)) {
            phoneIntention.setCallMode(Phone.CallMode.HANDS_FREE);
        }
        if (klo.d(phoneCallIntention.getTag())) {
            phoneIntention.setTag(phoneCallIntention.getTag());
        }
        if (klo.d(phoneCallIntention.getNormTag())) {
            phoneIntention.setNormTag(phoneCallIntention.getNormTag());
        }
        if (phoneCallIntention.getNickNameInfo() != null) {
            NickNameInfo nickNameInfo = phoneCallIntention.getNickNameInfo();
            phoneIntention.setNicknameInfo(new Phone.NicknameInfo(nickNameInfo.getName(), nickNameInfo.getNickName()));
        }
        if (klo.d(phoneCallIntention.getQuery())) {
            phoneIntention.setQuery(phoneCallIntention.getQuery());
        }
        return phoneIntention;
    }

    public static void updateIntentionToPhoneCallContent(Phone.PhoneIntention phoneIntention, PhoneCallContent phoneCallContent) {
        ArrayList arrayList = new ArrayList();
        if (phoneIntention.getContacts().c()) {
            for (Phone.Contact contact : phoneIntention.getContacts().b()) {
                PhoneItem phoneItem = new PhoneItem();
                phoneItem.setName(contact.getName());
                phoneItem.setNumber(contact.getNumber());
                if (contact.getTag().c()) {
                    phoneItem.setTag(contact.getTag().b());
                }
                phoneItem.setUserId(contact.getId());
                if (contact.isAutoDial().c()) {
                    phoneItem.setAutoDial(contact.isAutoDial().b().booleanValue());
                }
                arrayList.add(phoneItem);
            }
        }
        if (arrayList.size() > 0) {
            phoneCallContent.setPhoneList(arrayList);
        }
        if (phoneIntention.getMessageText().c()) {
            phoneCallContent.setMessageText(phoneIntention.getMessageText().b());
        }
    }
}
