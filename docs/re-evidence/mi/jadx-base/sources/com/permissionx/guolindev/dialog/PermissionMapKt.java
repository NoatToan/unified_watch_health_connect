package com.permissionx.guolindev.dialog;

import android.annotation.TargetApi;
import com.xiaomi.accounts.Manifest;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"allSpecialPermissions", "", "", "getAllSpecialPermissions", "()Ljava/util/Set;", "permissionMapOnQ", "", "getPermissionMapOnQ", "()Ljava/util/Map;", "permissionMapOnR", "getPermissionMapOnR", "permissionx_release"}, k = 2, mv = {1, 4, 2})
public final class PermissionMapKt {

    @TargetApi(30)
    @NotNull
    private static final Set<String> allSpecialPermissions = SetsKt__SetsKt.setOf((Object[]) new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE"});

    @TargetApi(29)
    @NotNull
    private static final Map<String, String> permissionMapOnQ;

    @TargetApi(30)
    @NotNull
    private static final Map<String, String> permissionMapOnR;

    static {
        Map<String, String> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), TuplesKt.to("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), TuplesKt.to("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), TuplesKt.to("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), TuplesKt.to("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), TuplesKt.to("android.permission.CAMERA", "android.permission-group.CAMERA"), TuplesKt.to("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), TuplesKt.to("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), TuplesKt.to(Manifest.permission.GET_ACCOUNTS, "android.permission-group.CONTACTS"), TuplesKt.to("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), TuplesKt.to("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), TuplesKt.to("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE"), TuplesKt.to("android.permission.READ_PHONE_NUMBERS", "android.permission-group.PHONE"), TuplesKt.to("android.permission.CALL_PHONE", "android.permission-group.PHONE"), TuplesKt.to("android.permission.ANSWER_PHONE_CALLS", "android.permission-group.PHONE"), TuplesKt.to("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE"), TuplesKt.to("android.permission.USE_SIP", "android.permission-group.PHONE"), TuplesKt.to("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), TuplesKt.to("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), TuplesKt.to("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), TuplesKt.to("android.permission.SEND_SMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.READ_SMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), TuplesKt.to("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), TuplesKt.to("android.permission.ACCESS_MEDIA_LOCATION", "android.permission-group.STORAGE"));
        permissionMapOnQ = mapMapOf;
        permissionMapOnR = mapMapOf;
    }

    @NotNull
    public static final Set<String> getAllSpecialPermissions() {
        return allSpecialPermissions;
    }

    @NotNull
    public static final Map<String, String> getPermissionMapOnQ() {
        return permissionMapOnQ;
    }

    @NotNull
    public static final Map<String, String> getPermissionMapOnR() {
        return permissionMapOnR;
    }
}
