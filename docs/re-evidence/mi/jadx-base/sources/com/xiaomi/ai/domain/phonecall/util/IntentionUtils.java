package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.DialogStatus;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class IntentionUtils {
    private static final Set<String> FIRST_TURN_PARSER_ACTION_SET;
    private static final Set<String> PARSER_FOLLOWUP_ACTION_SET;
    private static final Set<String> PARSER_PROCESSING_ACTION_SET;
    private static final Set<String> PROVIDER_PROCESSING_ACTION_SET;
    private static final Set<String> SESSION_PARSER_END_ACTION_SET;

    static {
        ActionType actionType = ActionType.QUERY;
        String string = actionType.toString();
        String string2 = ActionType.BLACK.toString();
        ActionType actionType2 = ActionType.EMPTY;
        String string3 = actionType2.toString();
        String string4 = ActionType.PICK_UP.toString();
        String string5 = ActionType.HANG_UP.toString();
        String string6 = ActionType.VIEW_ALL_CALLS.toString();
        String string7 = ActionType.VIEW_OUTGOING_CALLS.toString();
        String string8 = ActionType.VIEW_MISSED_CALLS.toString();
        String string9 = ActionType.PLAY_RECENT_OUTGOING_CALLS.toString();
        String string10 = ActionType.PLAY_RECENT_INCOMING_CALLS.toString();
        String string11 = ActionType.PLAY_RECENT_MISSED_CALLS.toString();
        String string12 = ActionType.PLAY_RECENT_ANSWERED_CALLS.toString();
        ActionType actionType3 = ActionType.EMPTY_STORE;
        String string13 = actionType3.toString();
        ActionType actionType4 = ActionType.QUERY_STORE;
        String string14 = actionType4.toString();
        ActionType actionType5 = ActionType.NOT_STORE;
        String string15 = actionType5.toString();
        ActionType actionType6 = ActionType.SHOW_CONTACT_NUMBER;
        FIRST_TURN_PARSER_ACTION_SET = new HashSet(Arrays.asList(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, actionType6.toString(), ActionType.MESSAGE_QUERY_TEXT.toString(), ActionType.MESSAGE_EMPTY.toString(), ActionType.MESSAGE_WITHOUT_TEXT.toString(), ActionType.MESSAGE_WITHOUT_CONTACT.toString()));
        String string16 = actionType.toString();
        String string17 = actionType2.toString();
        ActionType actionType7 = ActionType.BROWSE;
        String string18 = actionType7.toString();
        ActionType actionType8 = ActionType.BROWSE_STORE;
        PROVIDER_PROCESSING_ACTION_SET = new HashSet(Arrays.asList(string16, string17, string18, actionType8.toString(), actionType3.toString()));
        String string19 = actionType4.toString();
        ActionType actionType9 = ActionType.STOP_STORE;
        String string20 = actionType9.toString();
        ActionType actionType10 = ActionType.STOP;
        PARSER_FOLLOWUP_ACTION_SET = new HashSet(Arrays.asList(string19, string20, actionType10.toString(), actionType5.toString()));
        PARSER_PROCESSING_ACTION_SET = new HashSet(Arrays.asList(actionType2.toString(), actionType7.toString(), actionType8.toString()));
        SESSION_PARSER_END_ACTION_SET = new HashSet(Arrays.asList(ActionType.PLAY.toString(), actionType6.toString(), actionType10.toString(), actionType9.toString(), ActionType.PLAY_STORE.toString(), actionType5.toString()));
    }

    public static boolean isFirstTurnInParser(PhoneCallIntention phoneCallIntention) {
        return phoneCallIntention == null || FIRST_TURN_PARSER_ACTION_SET.contains(phoneCallIntention.getAction());
    }

    public static boolean lastSessionEnd(String str) {
        return SESSION_PARSER_END_ACTION_SET.contains(str);
    }

    public static DialogStatus updateDialogStatusInParser(PhoneCallIntention phoneCallIntention) {
        if (phoneCallIntention == null || !PARSER_PROCESSING_ACTION_SET.contains(phoneCallIntention.getAction())) {
            return (phoneCallIntention == null || !PARSER_FOLLOWUP_ACTION_SET.contains(phoneCallIntention.getAction())) ? DialogStatus.FINISH : DialogStatus.FOLLOWUP;
        }
        return DialogStatus.PROCESSING;
    }

    public static DialogStatus updateDialogStatusInProvider(PhoneCallIntention phoneCallIntention) {
        return (phoneCallIntention == null || !PROVIDER_PROCESSING_ACTION_SET.contains(phoneCallIntention.getAction())) ? DialogStatus.FINISH : DialogStatus.PROCESSING;
    }

    public static DialogStatus updateDialogStatusInParser(PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2) {
        if (phoneCallIntention2 != null && PROVIDER_PROCESSING_ACTION_SET.contains(phoneCallIntention2.getAction())) {
            return DialogStatus.FOLLOWUP;
        }
        if (phoneCallIntention != null && PARSER_PROCESSING_ACTION_SET.contains(phoneCallIntention.getAction())) {
            return DialogStatus.PROCESSING;
        }
        if (phoneCallIntention != null && PARSER_FOLLOWUP_ACTION_SET.contains(phoneCallIntention.getAction())) {
            return DialogStatus.FOLLOWUP;
        }
        return DialogStatus.FINISH;
    }
}
