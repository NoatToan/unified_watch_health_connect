package com.xiaomi.fitness.feedback.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/feedback/util/FeedbackConstants;", "", "<init>", "()V", "KEY_SUB_TAG_ID", "", "KEY_MAIN_TAG_ID", "KEY_SELECTED_TYPE", "KEY_TAG_ID", "KEY_TYPE_ITEM", "KEY_TAG_ID_FROM_WEB", "KEY_SHOW_RIGHT", "KEY_SUB_TAG_ID_FROM_WEB", "KEY_MODULE_ID", "MODULE_ID", "", "MODULE_WEARABLE_ID", "MODULE_FITNESS_APP", "MODULE_WEARABLE_DEVICE", "KEY_CONTENT_TYPE", "KEY_TAG_LIST", "KEY_APP_NAME", "KEY_DEVICE_MODEL", "KEY_TYPE", "DEVICE_CAPABILITY_SUPPORT_LOG", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackConstants {
    public static final int DEVICE_CAPABILITY_SUPPORT_LOG = 4;

    @NotNull
    public static final FeedbackConstants INSTANCE = new FeedbackConstants();

    @NotNull
    public static final String KEY_APP_NAME = "app_name";

    @NotNull
    public static final String KEY_CONTENT_TYPE = "showContent_type";

    @NotNull
    public static final String KEY_DEVICE_MODEL = "device_model";

    @NotNull
    public static final String KEY_MAIN_TAG_ID = "main_tag_id";

    @NotNull
    public static final String KEY_MODULE_ID = "module_id";

    @NotNull
    public static final String KEY_SELECTED_TYPE = "selected_type";

    @NotNull
    public static final String KEY_SHOW_RIGHT = "not_show_right";

    @NotNull
    public static final String KEY_SUB_TAG_ID = "sub_tag_id";

    @NotNull
    public static final String KEY_SUB_TAG_ID_FROM_WEB = "sub_tag_id_from_web";

    @NotNull
    public static final String KEY_TAG_ID = "tag_id";

    @NotNull
    public static final String KEY_TAG_ID_FROM_WEB = "tag_id_from_web";

    @NotNull
    public static final String KEY_TAG_LIST = "tag_list";

    @NotNull
    public static final String KEY_TYPE = "type";

    @NotNull
    public static final String KEY_TYPE_ITEM = "type_item";
    public static final int MODULE_FITNESS_APP = 400;
    public static final int MODULE_ID = 239;
    public static final int MODULE_WEARABLE_DEVICE = 401;
    public static final int MODULE_WEARABLE_ID = 273;

    private FeedbackConstants() {
    }
}
