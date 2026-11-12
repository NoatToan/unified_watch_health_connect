package com.xiaomi.ai.domain.phonecall.common;

import com.miui.tsmclient.service.DKFRequestService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.xiaomi.ai.domain.phonecall.common.Function, still in use, count: 1, list:
  (r0v0 com.xiaomi.ai.domain.phonecall.common.Function) from 0x0154: INVOKE (r0v0 com.xiaomi.ai.domain.phonecall.common.Function) VIRTUAL call: com.xiaomi.ai.domain.phonecall.common.Function.getFunc():java.lang.String A[MD:():java.lang.String (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class Function {
    CALL_CONTACT("CALL_CONTACT", "social_communication.phonecall.call.call_contact"),
    CALL_DEFAULT("CALL_DEFAULT", "social_communication.phonecall.call.call_default"),
    VIDEO_CALL("VIDEO_CALL", "social_communication.phonecall.call.call_contact"),
    VOICE_CALL("VOICE_CALL", "social_communication.phonecall.call.call_contact"),
    CALL_APP("CALL_APP", "social_communication.phonecall.call.call_contact"),
    CALL_APPELLATION("CALL_APPELLATION", "social_communication.phonecall.call.call_appellation"),
    CALL_ORGANIZATION("CALL_ORGANIZATION", "social_communication.phonecall.call.call_organization"),
    CALL_NUMBER("CALL_NUMBER", "social_communication.phonecall.call.call_number"),
    CALL_CELEBRITY("CALL_CELEBRITY", "social_communication.phonecall.call.call_celebrity"),
    ADD_CONTACT("ADD_CONTACT", "social_communication.phonecall.contacts.add_contact"),
    ANSWER_CALL("ANSWER_CALL", "social_communication.phonecall.accept.answer_call"),
    HANG_UP_THE_CALL("HANG_UP_THE_CALL", "social_communication.phonecall.end.hang_up_the_call"),
    VIEW_ALL_CALLS("VIEW_ALL_CALLS", "social_communication.phonecall.history. "),
    GET_OUTGOING_CALLS("GET_OUTGOING_CALLS", "social_communication.phonecall.history.get_outgoing_calls"),
    GET_MISSED_CALLS("GET_MISSED_CALLS", "social_communication.phonecall.history.get_missed_calls"),
    PLAY_RECENT_MISSED_CALLS("PLAY_RECENT_MISSED_CALLS", "social_communication.phonecall. . "),
    PLAY_RECENT_ANSWERED_CALLS("PLAY_RECENT_ANSWERED_CALLS", "social_communication.phonecall. . "),
    PLAY_RECENT_INCOMING_CALLS("PLAY_RECENT_INCOMING_CALLS", "social_communication.phonecall. . "),
    PLAY_RECENT_OUTGOING_CALLS("PLAY_RECENT_OUTGOING_CALLS", "social_communication.phonecall. . "),
    SEARCH_CONTACT_NUMBER("SEARCH_CONTACT_NUMBER", "social_communication.phonecall.contacts.search_contact_number"),
    CALL_YELLOWPAGE_WM("CALL_YELLOWPAGE_WM", "social_communication.phonecall.call.call_organization"),
    SUBCATEGORY_PHONECALL("SUBCATEGORY_PHONECALL", "social_communication.phonecall. . "),
    MODULE_CALL("MODULE_CALL", "social_communication.phonecall.call. "),
    MODULE_CONTACTS("MODULE_CONTACTS", "social_communication.phonecall.contacts. "),
    OTHER(DKFRequestService.a.d, " . . . ");

    private static final Map<ActionType, String> actionMap;
    private String func;
    private String text;

    static {
        Function function = SUBCATEGORY_PHONECALL;
        Function function2 = MODULE_CALL;
        HashMap map = new HashMap();
        actionMap = map;
        map.put(ActionType.QUERY, new Function("CALL_CONTACT", "social_communication.phonecall.call.call_contact").getFunc());
        map.put(ActionType.EMPTY, new Function("CALL_DEFAULT", "social_communication.phonecall.call.call_default").getFunc());
        map.put(ActionType.BLACK, new Function(DKFRequestService.a.d, " . . . ").getFunc());
        map.put(ActionType.PICK_UP, new Function("ANSWER_CALL", "social_communication.phonecall.accept.answer_call").getFunc());
        map.put(ActionType.HANG_UP, new Function("HANG_UP_THE_CALL", "social_communication.phonecall.end.hang_up_the_call").getFunc());
        map.put(ActionType.VIEW_ALL_CALLS, new Function("VIEW_ALL_CALLS", "social_communication.phonecall.history. ").getFunc());
        map.put(ActionType.VIEW_OUTGOING_CALLS, new Function("GET_OUTGOING_CALLS", "social_communication.phonecall.history.get_outgoing_calls").getFunc());
        map.put(ActionType.VIEW_MISSED_CALLS, new Function("GET_MISSED_CALLS", "social_communication.phonecall.history.get_missed_calls").getFunc());
        map.put(ActionType.PLAY_RECENT_MISSED_CALLS, new Function("PLAY_RECENT_MISSED_CALLS", "social_communication.phonecall. . ").getFunc());
        map.put(ActionType.PLAY_RECENT_ANSWERED_CALLS, new Function("PLAY_RECENT_ANSWERED_CALLS", "social_communication.phonecall. . ").getFunc());
        map.put(ActionType.PLAY_RECENT_INCOMING_CALLS, new Function("PLAY_RECENT_INCOMING_CALLS", "social_communication.phonecall. . ").getFunc());
        map.put(ActionType.PLAY_RECENT_OUTGOING_CALLS, new Function("PLAY_RECENT_OUTGOING_CALLS", "social_communication.phonecall. . ").getFunc());
        map.put(ActionType.SHOW_CONTACT_NUMBER, new Function("SEARCH_CONTACT_NUMBER", "social_communication.phonecall.contacts.search_contact_number").getFunc());
        map.put(ActionType.BROWSE, function2.getFunc());
        map.put(ActionType.PLAY, function2.getFunc());
        map.put(ActionType.STOP, function.getFunc());
        map.put(ActionType.EMPTY_STORE, new Function("CALL_APPELLATION", "social_communication.phonecall.call.call_appellation").getFunc());
        map.put(ActionType.QUERY_STORE, new Function("MODULE_CONTACTS", "social_communication.phonecall.contacts. ").getFunc());
        map.put(ActionType.STOP_STORE, function.getFunc());
        map.put(ActionType.PLAY_STORE, new Function("ADD_CONTACT", "social_communication.phonecall.contacts.add_contact").getFunc());
        map.put(ActionType.BROWSE_STORE, function.getFunc());
        map.put(ActionType.NOT_STORE, function.getFunc());
    }

    private Function(String str, String str2) {
        super(str, i);
        this.text = str;
        this.func = str2;
    }

    public static Function fromString(String str) {
        for (Function function : values()) {
            if (function.getText().equals(str)) {
                return function;
            }
        }
        return null;
    }

    public static String getFinalFunc(ActionType actionType, PhoneCallIntention phoneCallIntention) {
        if (actionType.equals(ActionType.QUERY)) {
            NameType firstNameType = getFirstNameType(phoneCallIntention);
            if (NameType.RELATIVE.equals(firstNameType)) {
                return CALL_APPELLATION.getFunc();
            }
            if (NameType.DIGIT.equals(firstNameType)) {
                return CALL_NUMBER.getFunc();
            }
            if (NameType.FAMOUS.equals(firstNameType)) {
                return CALL_CELEBRITY.getFunc();
            }
            if (NameType.YELLOW_PAGE.equals(firstNameType)) {
                return CALL_ORGANIZATION.getFunc();
            }
        }
        Map<ActionType, String> map = actionMap;
        return map.containsKey(actionType) ? map.get(actionType) : SUBCATEGORY_PHONECALL.getFunc();
    }

    public static NameType getFirstNameType(PhoneCallIntention phoneCallIntention) {
        List<SlotRet> slotRets;
        if (phoneCallIntention != null && (slotRets = phoneCallIntention.getSlotRets()) != null) {
            Iterator<SlotRet> it = slotRets.iterator();
            if (it.hasNext()) {
                return it.next().getNameType();
            }
        }
        return NameType.NORMAL;
    }

    public static boolean hasRelativeName(PhoneCallIntention phoneCallIntention) {
        List<SlotRet> slotRets;
        if (phoneCallIntention == null || (slotRets = phoneCallIntention.getSlotRets()) == null) {
            return false;
        }
        Iterator<SlotRet> it = slotRets.iterator();
        while (it.hasNext()) {
            if (it.next().getNameType().equals(NameType.RELATIVE)) {
                return true;
            }
        }
        return false;
    }

    public static Function valueOf(String str) {
        return (Function) Enum.valueOf(Function.class, str);
    }

    public static Function[] values() {
        return (Function[]) $VALUES.clone();
    }

    public String getFunc() {
        return this.func;
    }

    public String getText() {
        return this.text;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
