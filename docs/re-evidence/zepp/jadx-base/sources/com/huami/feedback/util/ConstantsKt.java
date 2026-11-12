package com.huami.feedback.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0007\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0016\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0016\u0010\r\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0016\u0010\u0010\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0016\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0002\"\u0016\u0010\u0012\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0016\u0010\u0017\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u0016\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"", "FEED_BACK_SUBMIT_STATUS", "Ljava/lang/String;", "VALUE_OFF_BLE", "VALUE_FEEDBACK_OFF_LINE", "FEEDBACK_NUMS", "FEEDBACK_NUMS_ENTRANCE", "MINE_FEEDBACK_RETURN_C", "MINE_FEEDBACK_SUBMIT_C", "MINE_KEY_TP", "EXTRA_FORCE_DARK", "TAG", "APP_LOG_FILE_NAME_PATTEN", "APP_LOG_RENAME_TEMP_FILE_PATTEN", "UNKNOWN_DEVICE", ConstantsKt.FEEDBACK_KV_FILE, ConstantsKt.FEEDBACK_USER_FORM_KEY, ConstantsKt.FEEDBACK_ISSUES, ConstantsKt.FEEDBACK_CONTACT_KEY, "", "ISSUE_ID_WRIST_DEVICE", LogUtil.I, "ISSUE_ID_SCALE_DEVICE", "ISSUE_ID_EARBUD_DEVICE", "ISSUE_ID_TREADMILL_DEVICE", "ISSUE_ID_APP", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class ConstantsKt {

    @NotNull
    public static final String APP_LOG_FILE_NAME_PATTEN = "^[0-9]*$";

    @NotNull
    public static final String APP_LOG_RENAME_TEMP_FILE_PATTEN = "[1-9][0-9]{3}-[0-9]{2}-[0-9]{2}\\(utc\\+[0-9]{1,2}\\)";

    @NotNull
    public static final String EXTRA_FORCE_DARK = "force_dark";

    @NotNull
    public static final String FEEDBACK_CONTACT_KEY = "FEEDBACK_CONTACT_KEY";

    @NotNull
    public static final String FEEDBACK_ISSUES = "FEEDBACK_ISSUES";

    @NotNull
    public static final String FEEDBACK_KV_FILE = "FEEDBACK_KV_FILE";

    @NotNull
    public static final String FEEDBACK_NUMS = "Feedback_Nums";

    @NotNull
    public static final String FEEDBACK_NUMS_ENTRANCE = "Feedback_Nums_Entrance";

    @NotNull
    public static final String FEEDBACK_USER_FORM_KEY = "FEEDBACK_USER_FORM_KEY";

    @NotNull
    public static final String FEED_BACK_SUBMIT_STATUS = "Feedback_SubmitStatus";
    public static final int ISSUE_ID_APP = 14000;
    public static final int ISSUE_ID_EARBUD_DEVICE = 12000;
    public static final int ISSUE_ID_SCALE_DEVICE = 11000;
    public static final int ISSUE_ID_TREADMILL_DEVICE = 13000;
    public static final int ISSUE_ID_WRIST_DEVICE = 10000;

    @NotNull
    public static final String MINE_FEEDBACK_RETURN_C = "MINE_FEEDBACK_RETURN_C";

    @NotNull
    public static final String MINE_FEEDBACK_SUBMIT_C = "MINE_FEEDBACK_SUBMIT_C";

    @NotNull
    public static final String MINE_KEY_TP = "tp";

    @NotNull
    public static final String TAG = "feedback";

    @NotNull
    public static final String UNKNOWN_DEVICE = "VDEVICE";

    @NotNull
    public static final String VALUE_FEEDBACK_OFF_LINE = "OffLine";

    @NotNull
    public static final String VALUE_OFF_BLE = "OffBLE";
}
