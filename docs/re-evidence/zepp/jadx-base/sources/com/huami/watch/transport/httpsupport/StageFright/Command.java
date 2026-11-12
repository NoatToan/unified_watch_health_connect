package com.huami.watch.transport.httpsupport.StageFright;

import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class Command {
    public static final String CMD_ARRIVAL_TOKEN = "_arrival_token";
    public static final String CMD_QUERY_TOKEN = "_query_token";
    public static final String CMD_QUERY_UPLOAD_LIST = "_query_sync_list";
    public static final String CMD_REPORT_UPLOAD_LIST = "_report_sync_list";
    public static final String CMD_TRIGGER_POOR_MAN_UPLOAD_LIST = "_come_on";
    public static final String CMD_TRIGGER_REPORT_FROM_CLIENT = "_client_trigger_report";
    public static final String DATA_SYNC_TELL_RESULT = "tell-internal-for-assist";
    public static final String DATA_SYNC_TRIGGER = "sync-internal-for-assist";
    public static final String EXTRA_ASSIST_CLEAR_DATA = "is_clear";
    public static final String EXTRA_ASSIST_HEALTH_TIME_FRAME = "health_last_sync_time";
    public static final HashSet<String> INTERNAL_COMMAND;

    static {
        HashSet<String> hashSet = new HashSet<>();
        INTERNAL_COMMAND = hashSet;
        hashSet.add(DATA_SYNC_TRIGGER);
        hashSet.add(DATA_SYNC_TELL_RESULT);
        hashSet.add(CMD_REPORT_UPLOAD_LIST);
        hashSet.add(CMD_QUERY_UPLOAD_LIST);
        hashSet.add(CMD_TRIGGER_POOR_MAN_UPLOAD_LIST);
        hashSet.add(CMD_TRIGGER_REPORT_FROM_CLIENT);
        hashSet.add(CMD_ARRIVAL_TOKEN);
        hashSet.add(CMD_QUERY_TOKEN);
    }

    public static boolean isInternal(String str) {
        boolean zContains;
        synchronized (Command.class) {
            zContains = INTERNAL_COMMAND.contains(str);
        }
        return zContains;
    }
}
