package com.xiaomi.fitness.relative.ui.util;

import com.xiaomi.fitness.common.utils.LocaleUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/relative/ui/util/RelativeCareConstants;", "", "<init>", "()V", "RELATIVE_CARE_SHARE_WITH_MESSAGE_UNIQUE_ID_PREFIX", "", "RELATIVE_CARE_RULE_INSTRUCTION_URL", "KEY_RELATIVE_UID", "KEY_INVITE_LINK_ID", "KEY_AUTH_DATA_LIST", "KEY_ACCOUNT_NICKNAME", "KEY_ACCOUNT_ICON", "KEY_MSG_ID", "KEY_INVITE_ID", "KEY_IS_ACCEPTANCE_PROCESS", "KEY_DATA_SHARE_TIME_SCOPE", "KEY_RELATIVE_SET", "KEY_HOME_PAGE_LAYOUT_TYPE", "KEY_QR_CODE_ID", "KEY_FAMILY_SERVICE_SHARE_STATUS", "KEY_ORIGIN", "KEY_REQUEST_SET_CODE_FROM_HEALTH", "", "KEY_REQUEST_SET_NODE", "KEY_REQUEST_SET_CODE_FROM_SETTING", "KEY_IS_THIRD_PARTY_INVITATION", "RELATIVE_CARE_QR_CODE_ID_PREFIX", "RELATIVE_CARE_CLICK_V3", "RELATIVE_CARE_EVENT_V3", "KEY_RELATIVE_NODE", "RELATIVE_CARE_CONST_ACCOUNT", "KEY_RELATIONSHIP_ESTABLISHED", "getRelativeCareRuleUrl", "getRelativeCareInvitationLinkUrlPrefix", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeCareConstants {

    @NotNull
    public static final RelativeCareConstants INSTANCE = new RelativeCareConstants();

    @NotNull
    public static final String KEY_ACCOUNT_ICON = "key_account_icon";

    @NotNull
    public static final String KEY_ACCOUNT_NICKNAME = "key_account_nickname";

    @NotNull
    public static final String KEY_AUTH_DATA_LIST = "key_auth_data_list";

    @NotNull
    public static final String KEY_DATA_SHARE_TIME_SCOPE = "key_data_share_time_scope";

    @NotNull
    public static final String KEY_FAMILY_SERVICE_SHARE_STATUS = "key_family_service_share_status";

    @NotNull
    public static final String KEY_HOME_PAGE_LAYOUT_TYPE = "key_home_page_layout_type";

    @NotNull
    public static final String KEY_INVITE_ID = "key_invite_id";

    @NotNull
    public static final String KEY_INVITE_LINK_ID = "key_invite_link_id";

    @NotNull
    public static final String KEY_IS_ACCEPTANCE_PROCESS = "key_is_acceptance_process";

    @NotNull
    public static final String KEY_IS_THIRD_PARTY_INVITATION = "key_is_third_party_invitation";

    @NotNull
    public static final String KEY_MSG_ID = "key_msg_id";

    @NotNull
    public static final String KEY_ORIGIN = "origin";

    @NotNull
    public static final String KEY_QR_CODE_ID = "key_qr_code_id";

    @NotNull
    public static final String KEY_RELATIONSHIP_ESTABLISHED = "relation_established";

    @NotNull
    public static final String KEY_RELATIVE_NODE = "key_relative_note";

    @NotNull
    public static final String KEY_RELATIVE_SET = "key_relative_set";

    @NotNull
    public static final String KEY_RELATIVE_UID = "key_relative_uid";
    public static final int KEY_REQUEST_SET_CODE_FROM_HEALTH = 1;
    public static final int KEY_REQUEST_SET_CODE_FROM_SETTING = 2;

    @NotNull
    public static final String KEY_REQUEST_SET_NODE = "ket_request_set_node";

    @NotNull
    public static final String RELATIVE_CARE_CLICK_V3 = "click_v3";

    @NotNull
    public static final String RELATIVE_CARE_CONST_ACCOUNT = "account";

    @NotNull
    public static final String RELATIVE_CARE_EVENT_V3 = "event_v3";

    @NotNull
    public static final String RELATIVE_CARE_QR_CODE_ID_PREFIX = "com.mi.health://relativecare/qrcodeid/";

    @NotNull
    private static final String RELATIVE_CARE_RULE_INSTRUCTION_URL = "https://watch.iot.mi.com/libai/activity-invite-friends.html?locale=%s#/rule";

    @NotNull
    private static final String RELATIVE_CARE_SHARE_WITH_MESSAGE_UNIQUE_ID_PREFIX = "https://watch.iot.mi.com/libai/activity-invite-friends.html?locale=%s";

    private RelativeCareConstants() {
    }

    @NotNull
    public final String getRelativeCareInvitationLinkUrlPrefix() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(RELATIVE_CARE_SHARE_WITH_MESSAGE_UNIQUE_ID_PREFIX, Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getRelativeCareRuleUrl() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(RELATIVE_CARE_RULE_INSTRUCTION_URL, Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
