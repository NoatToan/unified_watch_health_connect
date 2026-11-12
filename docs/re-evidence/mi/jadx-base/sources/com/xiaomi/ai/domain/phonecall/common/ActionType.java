package com.xiaomi.ai.domain.phonecall.common;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum ActionType {
    QUERY("QUERY", "social_communication.phonecall.call.call_contact"),
    BLACK("BLACK", " . . . "),
    EMPTY("EMPTY", "social_communication.phonecall.call.call_default"),
    PICK_UP("PICK_UP", "social_communication.phonecall.accept.answer_call"),
    HANG_UP("HANG_UP", "social_communication.phonecall.end.hang_up_the_call"),
    VIEW_ALL_CALLS("VIEW_ALL_CALLS", "social_communication.phonecall.history. "),
    VIEW_OUTGOING_CALLS("VIEW_OUTGOING_CALLS", "social_communication.phonecall.history.get_outgoing_calls"),
    VIEW_MISSED_CALLS("VIEW_MISSED_CALLS", "social_communication.phonecall.history.get_missed_calls"),
    PLAY_RECENT_MISSED_CALLS("PLAY_RECENT_MISSED_CALLS", "social_communication.phonecall. . "),
    PLAY_RECENT_ANSWERED_CALLS("PLAY_RECENT_ANSWERED_CALLS", "social_communication.phonecall. . "),
    PLAY_RECENT_INCOMING_CALLS("PLAY_RECENT_INCOMING_CALLS", "social_communication.phonecall. . "),
    PLAY_RECENT_OUTGOING_CALLS("PLAY_RECENT_OUTGOING_CALLS", "social_communication.phonecall. . "),
    SHOW_CONTACT_NUMBER("SHOW_CONTACT_NUMBER", "social_communication.phonecall.contacts.search_contact_number"),
    MESSAGE_EMPTY("MESSAGE_EMPTY", "social_communication.phonecall.call.text_default"),
    MESSAGE_QUERY_TEXT("MESSAGE_QUERY_TEXT", "social_communication.phonecall.call.text_contact_a_text"),
    MESSAGE_WITHOUT_CONTACT("MESSAGE_WITHOUT_CONTACT", "social_communication.phonecall.call.text_without_contact"),
    MESSAGE_WITHOUT_TEXT("MESSAGE_WITHOUT_TEXT", "social_communication.phonecall.call.text_without_text"),
    BROWSE("BROWSE", "social_communication.phonecall.call. "),
    PLAY("PLAY", "social_communication.phonecall.call. "),
    STOP("STOP", "social_communication.phonecall. . "),
    MESSAGE_SEND("MESSAGE_SEND", "social_communication.phonecall.call. "),
    MESSAGE_DISCARD("MESSAGE_DISCARD", "social_communication.phonecall. . "),
    EMPTY_STORE("EMPTY_STORE", "social_communication.phonecall.call.call_appellation"),
    QUERY_STORE("QUERY_STORE", "social_communication.phonecall.contacts. "),
    STOP_STORE("STOP_STORE", "social_communication.phonecall. . "),
    PLAY_STORE("PLAY_STORE", "social_communication.phonecall.contacts.add_contact"),
    BROWSE_STORE("BROWSE_STORE", "social_communication.phonecall. . "),
    NOT_STORE("NOT_STORE", "social_communication.phonecall. . ");

    private String func;
    private String text;

    ActionType(String str, String str2) {
        this.text = str;
        this.func = str2;
    }

    public static ActionType fromString(String str) {
        for (ActionType actionType : values()) {
            if (actionType.getText().equals(str)) {
                return actionType;
            }
        }
        return null;
    }

    public static String getFinalFunc(ActionType actionType, PhoneCallIntention phoneCallIntention) {
        return (actionType.equals(QUERY) && hasRelativeName(phoneCallIntention)) ? EMPTY_STORE.getFunc() : actionType.getFunc();
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
