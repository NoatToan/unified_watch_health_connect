package com.xiaomi.ai.domain.phonecall;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.ai.api.Launcher;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.CallMode;
import com.xiaomi.ai.domain.phonecall.common.CardType;
import com.xiaomi.ai.domain.phonecall.common.DeviceApp;
import com.xiaomi.ai.domain.phonecall.common.DeviceConfig;
import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallAnswer;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallRequestEnv;
import com.xiaomi.ai.domain.phonecall.common.ResponseStrategy;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.ai.domain.phonecall.util.EmergencyNumberUtils;
import com.xiaomi.ai.domain.phonecall.util.Instruction3_0Util;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.aqe;
import defpackage.klo;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class InstructionHelper {
    private static final String CONTACT_ICON_DESCRIPTION = "联系人";
    private static final String CONTACT_ICON_URL = "http://cdn.cnbj1.fds.api.mi-img.com/ai-open-file-service/phonecall_icons/com.android.contacts.png?GalaxyAccessKeyId=5151729087601&Expires=9223372036854775807&Signature=BkZkuNM25P71N8MQdXtwTPWJV5I=";
    private static final String CONTACT_ICON_URL_5 = "https://cdn.cnbj1.fds.api.mi-img.com/ai-open-file-service/domain_icons/phoneCall.png";
    private static final SpeechSynthesizer.Speak speak;
    private static final Template.Toast toast;
    public static final List<String> toastSpeakInstructionNames;
    private static final qpe LOGGER = aqe.f(InstructionHelper.class);
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    private static final List<String> viewHistoryActionTypeList = Arrays.asList(ActionType.VIEW_ALL_CALLS.toString(), ActionType.VIEW_MISSED_CALLS.toString(), ActionType.VIEW_OUTGOING_CALLS.toString());

    static {
        SpeechSynthesizer.Speak speak2 = new SpeechSynthesizer.Speak();
        speak = speak2;
        Template.Toast toast2 = new Template.Toast();
        toast = toast2;
        toastSpeakInstructionNames = Arrays.asList(buildInstructionName(speak2), buildInstructionName(toast2));
    }

    private void addCheckUnlockDependency(String str, Instruction instruction, ArrayList<Instruction> arrayList) {
        Instruction instructionBuildInstruction = APIUtils.buildInstruction(new Sys.CheckScreenUnlocked());
        instructionBuildInstruction.setHeader(instructionBuildInstruction.getHeader().setDialogId(str));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(instruction);
        instructionBuildInstruction.setDependenceSuccess(arrayList2);
        arrayList.add(instructionBuildInstruction);
    }

    private void addDependencyForInstruction(Instruction instruction, Instruction instruction2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(instruction2);
        instruction.setDependenceSuccess(arrayList);
    }

    private Instruction buildExpectSpeech(String str, boolean z) {
        if (!z) {
            return null;
        }
        Instruction instructionBuildInstruction = APIUtils.buildInstruction(new SpeechRecognizer.ExpectSpeech());
        instructionBuildInstruction.setHeader(instructionBuildInstruction.getHeader().setDialogId(str));
        return instructionBuildInstruction;
    }

    private static String buildInstructionName(InstructionPayload instructionPayload) {
        NamespaceName namespaceName = (NamespaceName) instructionPayload.getClass().getAnnotation(NamespaceName.class);
        if (namespaceName == null) {
            return "";
        }
        return namespaceName.namespace() + "." + namespaceName.name();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<Instruction> buildOthers(String str, PhoneCallAnswer phoneCallAnswer, DeviceApp deviceApp, boolean z, Instruction instruction, Instruction instruction2, List<Instruction> list, int i, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        List<Phone.Contact> listAsList;
        boolean zIsEmergencyNumber;
        ArrayList arrayList2 = new ArrayList();
        String action = phoneCallAnswer.getAction();
        List<SlotRet> slotRets = phoneCallAnswer.getIntention().getSlotRets();
        List<PhoneItem> phoneList = phoneCallAnswer.getContent().getPhoneList();
        String nickName = phoneCallAnswer.getIntention().getNickNameInfo().getNickName();
        String strName = phoneCallAnswer.getIntention().getCardType().name();
        PhoneCallIntention intention = phoneCallAnswer.getIntention();
        NameType nameType = (slotRets == null || slotRets.size() <= 0) ? NameType.NORMAL : slotRets.get(0).getNameType();
        Template.Image image = new Template.Image(CONTACT_ICON_DESCRIPTION, Arrays.asList(i >= 505100000 ? new Template.ImageSource(CONTACT_ICON_URL_5) : new Template.ImageSource(CONTACT_ICON_URL)));
        if (!action.equals(ActionType.PLAY.toString())) {
            if (action.equals(ActionType.PLAY_STORE.toString())) {
                PhoneItem phoneItem = phoneList.get(0);
                Instruction instructionBuildInstruction = APIUtils.buildInstruction(new Phone.MakeCall(Phone.CardType.valueOf(strName)).setContact(new Phone.Contact(phoneItem.getName(), phoneItem.getNumber(), phoneItem.getUserId()).setTag(phoneItem.getTag()).setAutoDial(phoneItem.isAutoDial())).setSkillIcon(image));
                if (intention.getCallMode().equals(CallMode.HAND_FREE)) {
                    ((Phone.MakeCall) instructionBuildInstruction.getPayload()).setCallMode(Phone.CallMode.HANDS_FREE);
                }
                instructionBuildInstruction.setHeader(instructionBuildInstruction.getHeader().setDialogId(str));
                zIsEmergencyNumber = EmergencyNumberUtils.isEmergencyNumber(phoneItem.getNumber());
                if (instruction != null) {
                    addDependencyForInstruction(instruction, instructionBuildInstruction);
                }
                arrayList2.add(instructionBuildInstruction);
                Instruction instructionBuildInstruction2 = APIUtils.buildInstruction(new Phone.SetNickname(phoneItem.getName(), nickName).setId(phoneItem.getUserId()));
                instructionBuildInstruction2.setHeader(instructionBuildInstruction2.getHeader().setDialogId(str));
                arrayList2.add(instructionBuildInstruction2);
            } else {
                if (action.equals(ActionType.PICK_UP.toString())) {
                    Instruction instructionBuildInstruction3 = APIUtils.buildInstruction(new Phone.PickUp());
                    instructionBuildInstruction3.setHeader(instructionBuildInstruction3.getHeader().setDialogId(str));
                    arrayList2.add(instructionBuildInstruction3);
                } else if (action.equals(ActionType.HANG_UP.toString())) {
                    Instruction instructionBuildInstruction4 = APIUtils.buildInstruction(new Phone.HangUp());
                    instructionBuildInstruction4.setHeader(instructionBuildInstruction4.getHeader().setDialogId(str));
                    arrayList2.add(instructionBuildInstruction4);
                } else if (action.equals(ActionType.PLAY_RECENT_MISSED_CALLS.toString())) {
                    Instruction instructionBuildInstruction5 = APIUtils.buildInstruction(new Phone.MakeCall(Phone.CardType.valueOf(strName)).setCallType(Phone.CallType.RECENT_MISSED_CALL).setSkillIcon(image));
                    instructionBuildInstruction5.setHeader(instructionBuildInstruction5.getHeader().setDialogId(str));
                    if (intention.getCallMode().equals(CallMode.HAND_FREE)) {
                        ((Phone.MakeCall) instructionBuildInstruction5.getPayload()).setCallMode(Phone.CallMode.HANDS_FREE);
                    }
                    if (instruction != null) {
                        addDependencyForInstruction(instruction, instructionBuildInstruction5);
                    }
                    arrayList2.add(instructionBuildInstruction5);
                } else if (action.equals(ActionType.PLAY_RECENT_ANSWERED_CALLS.toString())) {
                    Instruction instructionBuildInstruction6 = APIUtils.buildInstruction(new Phone.MakeCall(Phone.CardType.valueOf(strName)).setCallType(Phone.CallType.RECENT_ANSWERED_CALL).setSkillIcon(image));
                    instructionBuildInstruction6.setHeader(instructionBuildInstruction6.getHeader().setDialogId(str));
                    if (intention.getCallMode().equals(CallMode.HAND_FREE)) {
                        ((Phone.MakeCall) instructionBuildInstruction6.getPayload()).setCallMode(Phone.CallMode.HANDS_FREE);
                    }
                    if (instruction != null) {
                        addDependencyForInstruction(instruction, instructionBuildInstruction6);
                    }
                    arrayList2.add(instructionBuildInstruction6);
                } else if (action.equals(ActionType.PLAY_RECENT_INCOMING_CALLS.toString())) {
                    Instruction instructionBuildInstruction7 = APIUtils.buildInstruction(new Phone.MakeCall(Phone.CardType.valueOf(strName)).setCallType(Phone.CallType.RECENT_INCOMING_CALL).setSkillIcon(image));
                    instructionBuildInstruction7.setHeader(instructionBuildInstruction7.getHeader().setDialogId(str));
                    if (intention.getCallMode().equals(CallMode.HAND_FREE)) {
                        ((Phone.MakeCall) instructionBuildInstruction7.getPayload()).setCallMode(Phone.CallMode.HANDS_FREE);
                    }
                    if (instruction != null) {
                        addDependencyForInstruction(instruction, instructionBuildInstruction7);
                    }
                    arrayList2.add(instructionBuildInstruction7);
                } else if (action.equals(ActionType.PLAY_RECENT_OUTGOING_CALLS.toString())) {
                    Instruction instructionBuildInstruction8 = APIUtils.buildInstruction(new Phone.MakeCall(Phone.CardType.valueOf(strName)).setCallType(Phone.CallType.RECENT_OUTGOING_CALL).setSkillIcon(image));
                    instructionBuildInstruction8.setHeader(instructionBuildInstruction8.getHeader().setDialogId(str));
                    if (intention.getCallMode().equals(CallMode.HAND_FREE)) {
                        ((Phone.MakeCall) instructionBuildInstruction8.getPayload()).setCallMode(Phone.CallMode.HANDS_FREE);
                    }
                    if (instruction != null) {
                        addDependencyForInstruction(instruction, instructionBuildInstruction8);
                    }
                    arrayList2.add(instructionBuildInstruction8);
                } else if (action.equals(ActionType.VIEW_ALL_CALLS.toString())) {
                    Instruction instructionBuildInstruction9 = APIUtils.buildInstruction(new Launcher.LaunchShortcut("查看通话记录", "PHONECALL.RECENTS.ALL_CALLS"));
                    instructionBuildInstruction9.setHeader(instructionBuildInstruction9.getHeader().setDialogId(str));
                    arrayList2.add(instructionBuildInstruction9);
                } else if (action.equals(ActionType.VIEW_MISSED_CALLS.toString())) {
                    Instruction instructionBuildInstruction10 = APIUtils.buildInstruction(new Launcher.LaunchShortcut("查看未接电话", "PHONECALL.RECENTS.MISSED_CALLS"));
                    instructionBuildInstruction10.setHeader(instructionBuildInstruction10.getHeader().setDialogId(str));
                    arrayList2.add(instructionBuildInstruction10);
                } else if (!action.equals(ActionType.MESSAGE_QUERY_TEXT.toString())) {
                    if (!action.equals(ActionType.MESSAGE_SEND.toString())) {
                        arrayList = arrayList2;
                        z3 = false;
                        if (action.equals(ActionType.MESSAGE_WITHOUT_TEXT.toString())) {
                            if (intention.isSelectPlayOrder()) {
                                Instruction instructionBuildInstruction11 = APIUtils.buildInstruction(genShowMessage(phoneList, nameType, intention, phoneCallAnswer, Phone.ShowMessageType.MESSAGE_DRAFT));
                                instructionBuildInstruction11.setHeader(instructionBuildInstruction11.getHeader().setDialogId(str));
                                arrayList.add(instructionBuildInstruction11);
                            } else {
                                Instruction instructionBuildInstruction12 = APIUtils.buildInstruction(genShowContacts(phoneList, nameType, intention, deviceApp, i));
                                instructionBuildInstruction12.setHeader(instructionBuildInstruction12.getHeader().setDialogId(str));
                                arrayList.add(instructionBuildInstruction12);
                            }
                        } else if (!action.equals(ActionType.MESSAGE_DISCARD.toString()) && !action.equals(ActionType.MESSAGE_WITHOUT_CONTACT.toString())) {
                            if (action.equals(ActionType.VIEW_OUTGOING_CALLS.toString())) {
                                Instruction instructionBuildInstruction13 = APIUtils.buildInstruction(new Launcher.LaunchShortcut("查看最近拨打", "PHONECALL.RECENTS.OUTGOING_CALLS"));
                                instructionBuildInstruction13.setHeader(instructionBuildInstruction13.getHeader().setDialogId(str));
                                arrayList.add(instructionBuildInstruction13);
                            } else {
                                Instruction instructionBuildInstruction14 = APIUtils.buildInstruction(genShowContacts(phoneList, nameType, intention, deviceApp, i));
                                instructionBuildInstruction14.setHeader(instructionBuildInstruction14.getHeader().setDialogId(str));
                                arrayList.add(instructionBuildInstruction14);
                            }
                        }
                    } else if (phoneList.size() > 1 && !intention.isSelectPlayOrder()) {
                        Instruction instructionBuildInstruction15 = APIUtils.buildInstruction(genShowContacts(phoneList, nameType, intention, deviceApp, i));
                        instructionBuildInstruction15.setHeader(instructionBuildInstruction15.getHeader().setDialogId(str));
                        arrayList2.add(instructionBuildInstruction15);
                    } else if (intention.isAddShowContacts()) {
                        Template.Launcher launcher = new Template.Launcher();
                        launcher.setIntent(new Template.AndroidIntent(LifecycleConstantKt.TYPE_ACTIVITY, "com.android.mms", "intent:number#Intent;scheme=smsto;action=android.intent.action.SENDTO;launchFlags=0x10000000;S.sms_body=message;end".replace(RealNameWebViewActivity.NUMBER, phoneList.get(0).getNumber()).replace("message", klo.e(phoneCallAnswer.getContent().getMessageText()) ? phoneCallAnswer.getContent().getMessageText() : "")));
                        Phone.SelectSimCard selectSimCard = new Phone.SelectSimCard(Phone.PhoneOperationType.SEND_MESSAGE, launcher);
                        selectSimCard.setSkillIcon(new Template.Image("发短信", Arrays.asList(new Template.ImageSource(CONTACT_ICON_URL_5))));
                        if (phoneList.isEmpty()) {
                            z3 = false;
                            listAsList = Arrays.asList(new Phone.Contact("", "", ""));
                        } else {
                            z3 = false;
                            listAsList = genContacts(phoneList, nameType).subList(0, 1);
                        }
                        selectSimCard.setContacts(listAsList);
                        Instruction instructionBuildInstruction16 = APIUtils.buildInstruction(selectSimCard);
                        instructionBuildInstruction16.setHeader(instructionBuildInstruction16.getHeader().setDialogId(str));
                        arrayList = arrayList2;
                        arrayList.add(instructionBuildInstruction16);
                    } else {
                        arrayList = arrayList2;
                        z3 = false;
                        Instruction instructionBuildInstruction17 = APIUtils.buildInstruction(new Phone.SendMessage(Phone.CardType.valueOf(strName)).setMessage(phoneCallAnswer.getContent().getMessageText()).setContacts(genContacts(phoneList, nameType)));
                        instructionBuildInstruction17.setHeader(instructionBuildInstruction17.getHeader().setDialogId(str));
                        if (instruction != null) {
                            addDependencyForInstruction(instructionBuildInstruction17, instruction);
                        }
                        if (instruction2 != null) {
                            addDependencyForInstruction(instructionBuildInstruction17, instruction2);
                        }
                        arrayList.add(instructionBuildInstruction17);
                        arrayList.add(instruction2);
                        arrayList.add(instruction);
                    }
                    zIsEmergencyNumber = z3;
                } else if (phoneList.size() > 1 && !intention.isSelectPlayOrder()) {
                    Instruction instructionBuildInstruction18 = APIUtils.buildInstruction(genShowContacts(phoneList, nameType, intention, deviceApp, i));
                    instructionBuildInstruction18.setHeader(instructionBuildInstruction18.getHeader().setDialogId(str));
                    arrayList2.add(instructionBuildInstruction18);
                } else if (intention.isAddShowContacts()) {
                    Template.Launcher launcher2 = new Template.Launcher();
                    launcher2.setIntent(new Template.AndroidIntent(LifecycleConstantKt.TYPE_ACTIVITY, "com.android.mms", "intent:number#Intent;scheme=smsto;action=android.intent.action.SENDTO;launchFlags=0x10000000;S.sms_body=message;end".replace(RealNameWebViewActivity.NUMBER, phoneList.get(0).getNumber()).replace("message", klo.e(phoneCallAnswer.getContent().getMessageText()) ? phoneCallAnswer.getContent().getMessageText() : "")));
                    Phone.SelectSimCard selectSimCard2 = new Phone.SelectSimCard(Phone.PhoneOperationType.SEND_MESSAGE, launcher2);
                    selectSimCard2.setSkillIcon(new Template.Image("发短信", Arrays.asList(new Template.ImageSource(CONTACT_ICON_URL_5))));
                    selectSimCard2.setContacts(!phoneList.isEmpty() ? genContacts(phoneList, nameType).subList(0, 1) : Arrays.asList(new Phone.Contact("", "", "")));
                    Instruction instructionBuildInstruction19 = APIUtils.buildInstruction(selectSimCard2);
                    instructionBuildInstruction19.setHeader(instructionBuildInstruction19.getHeader().setDialogId(str));
                    arrayList2 = arrayList2;
                    arrayList2.add(instructionBuildInstruction19);
                } else {
                    Instruction instructionBuildInstruction20 = APIUtils.buildInstruction(genShowMessage(phoneList, nameType, intention, phoneCallAnswer, Phone.ShowMessageType.MESSAGE_DRAFT));
                    instructionBuildInstruction20.setHeader(instructionBuildInstruction20.getHeader().setDialogId(str));
                    arrayList2.add(instructionBuildInstruction20);
                }
                arrayList = arrayList2;
                z3 = false;
                zIsEmergencyNumber = z3;
            }
            if (z && !zIsEmergencyNumber) {
                list.add(makeCheckUnlock(str));
            }
            return arrayList;
        }
        PhoneItem phoneItem2 = phoneList.get(0);
        Instruction instructionBuildInstruction21 = APIUtils.buildInstruction(new Phone.MakeCall(Phone.CardType.valueOf(strName)).setContact(new Phone.Contact(phoneItem2.getName(), phoneItem2.getNumber(), phoneItem2.getUserId()).setTag(phoneItem2.getTag()).setAutoDial(phoneItem2.isAutoDial())).setSkillIcon(image));
        if (intention.getCallMode().equals(CallMode.HAND_FREE)) {
            ((Phone.MakeCall) instructionBuildInstruction21.getPayload()).setCallMode(Phone.CallMode.HANDS_FREE);
        }
        instructionBuildInstruction21.setHeader(instructionBuildInstruction21.getHeader().setDialogId(str));
        zIsEmergencyNumber = EmergencyNumberUtils.isEmergencyNumber(phoneItem2.getNumber());
        if (instruction != null) {
            addDependencyForInstruction(instruction, instructionBuildInstruction21);
        }
        if (intention.isAddShowContacts()) {
            Instruction instructionBuildInstruction22 = APIUtils.buildInstruction(genShowContacts(phoneList, nameType, intention, deviceApp, i));
            instructionBuildInstruction22.setHeader(instructionBuildInstruction22.getHeader().setDialogId(str));
            arrayList2.add(instructionBuildInstruction22);
        }
        if (!intention.isAddShowContacts()) {
            arrayList2.add(instructionBuildInstruction21);
        }
        arrayList = arrayList2;
        if (z) {
            list.add(makeCheckUnlock(str));
        }
        return arrayList;
    }

    private Instruction buildSpeak(String str, PhoneCallAnswer phoneCallAnswer) {
        Instruction instructionBuildInstruction = APIUtils.buildInstruction(new SpeechSynthesizer.Speak(phoneCallAnswer.getContent().getToSpeak()));
        instructionBuildInstruction.setHeader(instructionBuildInstruction.getHeader().setDialogId(str));
        return instructionBuildInstruction;
    }

    private Instruction buildToast(String str, PhoneCallAnswer phoneCallAnswer) {
        String toDisplay = phoneCallAnswer.getContent().getToDisplay();
        String query = phoneCallAnswer.getIntention().getQuery();
        if (toDisplay == null || toDisplay.trim().isEmpty()) {
            return null;
        }
        Template.Toast toast2 = new Template.Toast(toDisplay);
        if (!klo.a(query)) {
            toast2.setQuery(query);
        }
        Instruction instructionBuildInstruction = APIUtils.buildInstruction(toast2);
        instructionBuildInstruction.setHeader(instructionBuildInstruction.getHeader().setDialogId(str));
        return instructionBuildInstruction;
    }

    private List<Instruction> buildToastAndSpeak(String str, PhoneCallAnswer phoneCallAnswer) {
        String toSpeak = phoneCallAnswer.getContent().getToSpeak();
        String toDisplay = phoneCallAnswer.getContent().getToDisplay();
        String query = phoneCallAnswer.getIntention().getQuery();
        ArrayList arrayList = new ArrayList();
        if (toDisplay != null && !toDisplay.trim().isEmpty()) {
            Template.Toast toast2 = new Template.Toast(toDisplay);
            if (!klo.a(query)) {
                toast2.setQuery(query);
            }
            Instruction instructionBuildInstruction = APIUtils.buildInstruction(toast2);
            instructionBuildInstruction.setHeader(instructionBuildInstruction.getHeader().setDialogId(str));
            arrayList.add(instructionBuildInstruction);
        }
        Instruction instructionBuildInstruction2 = APIUtils.buildInstruction(new SpeechSynthesizer.Speak(toSpeak));
        instructionBuildInstruction2.setHeader(instructionBuildInstruction2.getHeader().setDialogId(str));
        arrayList.add(instructionBuildInstruction2);
        return arrayList;
    }

    private Phone.ShowContacts genShowContacts(List<PhoneItem> list, NameType nameType, PhoneCallIntention phoneCallIntention, DeviceApp deviceApp, int i) {
        HashSet hashSet = new HashSet();
        String action = phoneCallIntention.getAction();
        String strName = phoneCallIntention.getCardType().name();
        Phone.ShowContacts showContacts = new Phone.ShowContacts();
        if (list == null || list.isEmpty()) {
            showContacts.setContacts(new ArrayList());
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                PhoneItem phoneItem = list.get(i2);
                Phone.NameType phoneNameType = NameType.toPhoneNameType(nameType);
                hashSet.add(phoneItem.getName());
                arrayList.add(new Phone.Contact(phoneItem.getName(), phoneItem.getNumber(), phoneItem.getUserId()).setTag(phoneItem.getTag()).setAutoDial(phoneItem.isAutoDial()).setNameType(phoneNameType));
            }
            Template.Image image = new Template.Image(CONTACT_ICON_DESCRIPTION, Arrays.asList(i >= 505100000 ? new Template.ImageSource(CONTACT_ICON_URL_5) : new Template.ImageSource(CONTACT_ICON_URL)));
            showContacts = hashSet.size() == 1 ? new Phone.ShowContacts(arrayList, true) : new Phone.ShowContacts(arrayList, false);
            if (action.equals(ActionType.SHOW_CONTACT_NUMBER.toString())) {
                showContacts.setClickPurpose(Phone.ClickPurpose.CONTACT_DETAIL);
            } else if (action.startsWith("MESSAGE")) {
                showContacts.setClickPurpose(Phone.ClickPurpose.SEND_MESSAGE);
            } else if (CardType.SIM_CARD.getText().equalsIgnoreCase(phoneCallIntention.getCardType().getText())) {
                showContacts.setClickPurpose(Phone.ClickPurpose.ACTIVE_CARD);
            } else {
                showContacts.setClickPurpose(Phone.ClickPurpose.MAKE_CALL);
            }
            if (phoneCallIntention.getCallMode().getText().equalsIgnoreCase(CallMode.HAND_FREE.getText())) {
                showContacts.setCallMode(Phone.CallMode.HANDS_FREE);
            }
            showContacts.setSkillIcon(image);
            showContacts.setMatchRecentAndCall(needMatchRecentAndCall(action, deviceApp));
            showContacts.setCardType(Phone.CardType.valueOf(strName));
        }
        return showContacts;
    }

    private Phone.ShowMessage genShowMessage(List<PhoneItem> list, NameType nameType, PhoneCallIntention phoneCallIntention, PhoneCallAnswer phoneCallAnswer, Phone.ShowMessageType showMessageType) {
        String strName = phoneCallIntention.getCardType().name();
        List<Phone.Contact> listAsList = (list == null || list.isEmpty()) ? Arrays.asList(new Phone.Contact("", "", "")) : genContacts(list, nameType).subList(0, 1);
        Phone.ShowMessage showMessage = new Phone.ShowMessage(showMessageType, Phone.CardType.valueOf(strName), genLauncher(listAsList.get(0), phoneCallAnswer));
        showMessage.setContacts(listAsList);
        if (klo.e(phoneCallAnswer.getContent().getMessageText())) {
            showMessage.setMessage(phoneCallAnswer.getContent().getMessageText());
        }
        showMessage.setSkillIcon(new Template.Image("发短信", Arrays.asList(new Template.ImageSource(CONTACT_ICON_URL_5))));
        showMessage.setCardType(Phone.CardType.valueOf(strName));
        return showMessage;
    }

    private Instruction makeCheckUnlock(String str) {
        Instruction instructionBuildInstruction = APIUtils.buildInstruction(new Sys.CheckScreenUnlocked());
        instructionBuildInstruction.setHeader(instructionBuildInstruction.getHeader().setDialogId(str));
        return instructionBuildInstruction;
    }

    private boolean needCheckUnlock(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        return (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("device_status")) == null || jSONObjectOptJSONObject.optBoolean("phonecall_setting")) ? false : true;
    }

    private boolean needMatchRecentAndCall(String str, DeviceApp deviceApp) {
        return (str.equals(ActionType.SHOW_CONTACT_NUMBER.toString()) || str.equals(ActionType.BROWSE_STORE.toString()) || !DeviceConfig.useStrategy(ResponseStrategy.MATCH_RECENT_AND_CALL, deviceApp.getAppId())) ? false : true;
    }

    private boolean needToastAndSpeak(PhoneCallRequestEnv phoneCallRequestEnv, PhoneCallAnswer phoneCallAnswer) {
        PhoneCallIntention intention = phoneCallAnswer.getIntention();
        return (intention != null && intention.isSelectPlayOrder() && ActionType.PLAY.toString().equals(intention.getAction()) && DeviceConfig.useStrategy(ResponseStrategy.NO_TOAST_SPEAK_AFTER_SELECT_NUMBER, phoneCallRequestEnv.getDeviceApp().getAppId()) && !phoneCallRequestEnv.isBlueTooth() && phoneCallRequestEnv.isSelectDefaultCard()) ? false : true;
    }

    public String buildInstructions(String str, PhoneCallAnswer phoneCallAnswer) throws JsonProcessingException {
        return buildInstructions(str, phoneCallAnswer, new PhoneCallRequestEnv(DeviceApp.Default()), null, -1);
    }

    public ArrayList<Phone.Contact> genContacts(List<PhoneItem> list, NameType nameType) {
        ArrayList<Phone.Contact> arrayList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            PhoneItem phoneItem = list.get(i);
            arrayList.add(new Phone.Contact(phoneItem.getName(), phoneItem.getNumber(), phoneItem.getUserId()).setTag(phoneItem.getTag()).setAutoDial(phoneItem.isAutoDial()).setNameType(NameType.toPhoneNameType(nameType)));
        }
        return arrayList;
    }

    public Template.Launcher genLauncher(Phone.Contact contact, PhoneCallAnswer phoneCallAnswer) {
        Template.Launcher launcher = new Template.Launcher();
        launcher.setIntent(new Template.AndroidIntent(LifecycleConstantKt.TYPE_ACTIVITY, "com.android.mms", (phoneCallAnswer.getAction().equalsIgnoreCase(ActionType.MESSAGE_SEND.getText()) ? "intent:number#Intent;scheme=smsto;action=android.intent.action.SENDTO;end" : "intent:number#Intent;scheme=smsto;action=android.intent.action.SENDTO;launchFlags=0x10000000;S.sms_body=message;end").replace(RealNameWebViewActivity.NUMBER, contact.getNumber()).replace("message", klo.e(phoneCallAnswer.getContent().getMessageText()) ? phoneCallAnswer.getContent().getMessageText() : "")));
        return launcher;
    }

    public String buildInstructions(String str, PhoneCallAnswer phoneCallAnswer, PhoneCallRequestEnv phoneCallRequestEnv, JSONObject jSONObject, int i) throws JsonProcessingException {
        Instruction instruction;
        Instruction instruction2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        DeviceApp deviceApp = phoneCallRequestEnv.getDeviceApp();
        String action = phoneCallAnswer.getAction();
        if (needToastAndSpeak(phoneCallRequestEnv, phoneCallAnswer)) {
            Instruction instructionBuildToast = buildToast(str, phoneCallAnswer);
            if (instructionBuildToast != null && !action.equals(ActionType.MESSAGE_SEND.toString())) {
                arrayList2.add(instructionBuildToast);
            }
            Instruction instructionBuildSpeak = buildSpeak(str, phoneCallAnswer);
            if (!action.equals(ActionType.MESSAGE_SEND.toString())) {
                arrayList2.add(instructionBuildSpeak);
            }
            instruction2 = instructionBuildToast;
            instruction = instructionBuildSpeak;
        } else {
            instruction = null;
            instruction2 = null;
        }
        boolean zIsSelectDefaultCard = phoneCallRequestEnv.isSelectDefaultCard();
        Instruction instructionBuildExpectSpeech = buildExpectSpeech(str, phoneCallAnswer.getContent().isOpenMic());
        if (phoneCallAnswer.getIntention().getCardType() == null) {
            phoneCallAnswer.getIntention().setCardType(CardType.DEFAULT);
        }
        boolean zNeedCheckUnlock = needCheckUnlock(jSONObject);
        ArrayList arrayList3 = new ArrayList();
        List<Instruction> listBuildOthers = buildOthers(str, phoneCallAnswer, deviceApp, zNeedCheckUnlock, instruction, instruction2, arrayList3, i, zIsSelectDefaultCard);
        if (instructionBuildExpectSpeech != null) {
            arrayList2.add(instructionBuildExpectSpeech);
        }
        Instruction<Nlp.AuxiliaryIntention> instructionTransNlpToAuxiliary = Instruction3_0Util.transNlpToAuxiliary(phoneCallAnswer.getIntention(), phoneCallAnswer.getContent());
        if (phoneCallAnswer.getAction().equalsIgnoreCase("MESSAGE_DISCARD")) {
            addDependencyForInstruction(instructionTransNlpToAuxiliary, instruction2);
            arrayList2.add(0, instructionTransNlpToAuxiliary);
            arrayList2.addAll(listBuildOthers);
        } else {
            listBuildOthers.add(instructionTransNlpToAuxiliary);
            arrayList2.addAll(listBuildOthers);
        }
        if (arrayList3.size() > 0) {
            Instruction instruction3 = arrayList3.get(0);
            arrayList.add(instruction3);
            if (arrayList2.size() > 0) {
                addDependencyForInstruction(instruction3, (Instruction) arrayList2.get(0));
            }
        }
        arrayList.addAll(arrayList2);
        return APIUtils.toJsonString(arrayList);
    }
}
