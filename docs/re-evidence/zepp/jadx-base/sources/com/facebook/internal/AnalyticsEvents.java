package com.facebook.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b^\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b^\u0010_R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u0016\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0004R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0016\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0004R\u0016\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0004R\u0016\u00105\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0004R\u0016\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0004R\u0016\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0004R\u0016\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0004R\u0016\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0004R\u0016\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0004R\u0016\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0016\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0004R\u0016\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0004R\u0016\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0004R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0004R\u0016\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0004R\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0004R\u0016\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0004R\u0016\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0004R\u0016\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0004R\u0016\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0004R\u0016\u0010F\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0004R\u0016\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\u0004R\u0016\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0004R\u0016\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0004R\u0016\u0010J\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\u0004R\u0016\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010\u0004R\u0016\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0004R\u0016\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\u0004R\u0016\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\u0004R\u0016\u0010O\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010\u0004R\u0016\u0010P\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u0004R\u0016\u0010Q\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\u0004R\u0016\u0010R\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\u0004R\u0016\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\u0004R\u0016\u0010T\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010\u0004R\u0016\u0010U\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\u0004R\u0016\u0010V\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010\u0004R\u0016\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010\u0004R\u0016\u0010X\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010\u0004R\u0016\u0010Y\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010\u0004R\u0016\u0010Z\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010\u0004R\u0016\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\u0004R\u0016\u0010\\\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010\u0004R\u0016\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010\u0004¨\u0006`"}, d2 = {"Lcom/facebook/internal/AnalyticsEvents;", "", "", "EVENT_NATIVE_LOGIN_DIALOG_COMPLETE", "Ljava/lang/String;", "EVENT_NATIVE_LOGIN_DIALOG_START", "EVENT_WEB_LOGIN_COMPLETE", "EVENT_FRIEND_PICKER_USAGE", "EVENT_PLACE_PICKER_USAGE", "EVENT_LOGIN_VIEW_USAGE", "EVENT_USER_SETTINGS_USAGE", "EVENT_NATIVE_DIALOG_START", "EVENT_NATIVE_DIALOG_COMPLETE", "PARAMETER_WEB_LOGIN_E2E", "PARAMETER_WEB_LOGIN_SWITCHBACK_TIME", "PARAMETER_APP_ID", "PARAMETER_CALL_ID", "PARAMETER_ACTION_ID", "PARAMETER_NATIVE_LOGIN_DIALOG_START_TIME", "PARAMETER_NATIVE_LOGIN_DIALOG_COMPLETE_TIME", "PARAMETER_DIALOG_OUTCOME", "PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED", "PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN", "PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED", "PARAMETER_DIALOG_OUTCOME_VALUE_FAILED", "EVENT_NATIVE_DIALOG_TYPE_SHARE", "EVENT_NATIVE_DIALOG_TYPE_MESSAGE", "EVENT_NATIVE_DIALOG_TYPE_OG_SHARE", "EVENT_NATIVE_DIALOG_TYPE_OG_MESSAGE", "EVENT_NATIVE_DIALOG_TYPE_PHOTO_SHARE", "EVENT_NATIVE_DIALOG_TYPE_PHOTO_MESSAGE", "EVENT_NATIVE_DIALOG_TYPE_VIDEO_SHARE", "EVENT_NATIVE_DIALOG_TYPE_LIKE", "EVENT_LIKE_VIEW_CANNOT_PRESENT_DIALOG", "EVENT_LIKE_VIEW_DID_LIKE", "EVENT_LIKE_VIEW_DID_PRESENT_DIALOG", "EVENT_LIKE_VIEW_DID_PRESENT_FALLBACK", "EVENT_LIKE_VIEW_DID_UNLIKE", "EVENT_LIKE_VIEW_DID_UNDO_QUICKLY", "EVENT_LIKE_VIEW_DIALOG_DID_SUCCEED", "EVENT_LIKE_VIEW_ERROR", "PARAMETER_LIKE_VIEW_STYLE", "PARAMETER_LIKE_VIEW_AUXILIARY_POSITION", "PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT", "PARAMETER_LIKE_VIEW_OBJECT_ID", "PARAMETER_LIKE_VIEW_OBJECT_TYPE", "PARAMETER_LIKE_VIEW_CURRENT_ACTION", "PARAMETER_LIKE_VIEW_ERROR_JSON", "PARAMETER_SHARE_OUTCOME", "PARAMETER_SHARE_OUTCOME_SUCCEEDED", "PARAMETER_SHARE_OUTCOME_CANCELLED", "PARAMETER_SHARE_OUTCOME_ERROR", "PARAMETER_SHARE_OUTCOME_UNKNOWN", "PARAMETER_SHARE_ERROR_MESSAGE", "PARAMETER_SHARE_DIALOG_SHOW", "PARAMETER_SHARE_DIALOG_SHOW_WEB", "PARAMETER_SHARE_DIALOG_SHOW_NATIVE", "PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC", "PARAMETER_SHARE_DIALOG_SHOW_UNKNOWN", "PARAMETER_SHARE_DIALOG_CONTENT_TYPE", "PARAMETER_SHARE_DIALOG_CONTENT_UUID", "PARAMETER_SHARE_DIALOG_CONTENT_PAGE_ID", "PARAMETER_SHARE_DIALOG_CONTENT_VIDEO", "PARAMETER_SHARE_DIALOG_CONTENT_PHOTO", "PARAMETER_SHARE_DIALOG_CONTENT_STATUS", "PARAMETER_SHARE_DIALOG_CONTENT_OPENGRAPH", "PARAMETER_SHARE_DIALOG_CONTENT_UNKNOWN", "EVENT_SHARE_RESULT", "EVENT_SHARE_DIALOG_SHOW", "EVENT_SHARE_MESSENGER_DIALOG_SHOW", "EVENT_LIKE_BUTTON_CREATE", "EVENT_LOGIN_BUTTON_CREATE", "EVENT_SHARE_BUTTON_CREATE", "EVENT_SEND_BUTTON_CREATE", "EVENT_SHARE_BUTTON_DID_TAP", "EVENT_SEND_BUTTON_DID_TAP", "EVENT_LIKE_BUTTON_DID_TAP", "EVENT_LOGIN_BUTTON_DID_TAP", "EVENT_DEVICE_SHARE_BUTTON_CREATE", "EVENT_DEVICE_SHARE_BUTTON_DID_TAP", "EVENT_SMART_LOGIN_SERVICE", "EVENT_SDK_INITIALIZE", "PARAMETER_SHARE_MESSENGER_GENERIC_TEMPLATE", "PARAMETER_SHARE_MESSENGER_MEDIA_TEMPLATE", "PARAMETER_SHARE_MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE", "EVENT_FOA_LOGIN_BUTTON_CREATE", "EVENT_FOA_LOGIN_BUTTON_DID_TAP", "EVENT_FOA_DISAMBIGUATION_DIALOG_FB_DID_TAP", "EVENT_FOA_DISAMBIGUATION_DIALOG_IG_DID_TAP", "EVENT_FOA_DISAMBIGUATION_DIALOG_CANCELLED", "EVENT_FOA_FB_LOGIN_BUTTON_CREATE", "EVENT_FOA_FB_LOGIN_BUTTON_DID_TAP", "EVENT_FOA_IG_LOGIN_BUTTON_CREATE", "EVENT_FOA_IG_LOGIN_BUTTON_DID_TAP", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsEvents {

    @NotNull
    public static final String EVENT_DEVICE_SHARE_BUTTON_CREATE = "fb_device_share_button_create";

    @NotNull
    public static final String EVENT_DEVICE_SHARE_BUTTON_DID_TAP = "fb_device_share_button_did_tap";

    @NotNull
    public static final String EVENT_FOA_DISAMBIGUATION_DIALOG_CANCELLED = "foa_disambiguation_dialog_cancelled";

    @NotNull
    public static final String EVENT_FOA_DISAMBIGUATION_DIALOG_FB_DID_TAP = "foa_disambiguation_dialog_fb_did_tap";

    @NotNull
    public static final String EVENT_FOA_DISAMBIGUATION_DIALOG_IG_DID_TAP = "foa_disambiguation_dialog_ig_did_tap";

    @NotNull
    public static final String EVENT_FOA_FB_LOGIN_BUTTON_CREATE = "foa_fb_login_button_create";

    @NotNull
    public static final String EVENT_FOA_FB_LOGIN_BUTTON_DID_TAP = "foa_fb_login_button_did_tap";

    @NotNull
    public static final String EVENT_FOA_IG_LOGIN_BUTTON_CREATE = "foa_ig_login_button_create";

    @NotNull
    public static final String EVENT_FOA_IG_LOGIN_BUTTON_DID_TAP = "foa_ig_login_button_did_tap";

    @NotNull
    public static final String EVENT_FOA_LOGIN_BUTTON_CREATE = "foa_login_button_create";

    @NotNull
    public static final String EVENT_FOA_LOGIN_BUTTON_DID_TAP = "foa_login_button_did_tap";

    @NotNull
    public static final String EVENT_FRIEND_PICKER_USAGE = "fb_friend_picker_usage";

    @NotNull
    public static final String EVENT_LIKE_BUTTON_CREATE = "fb_like_button_create";

    @NotNull
    public static final String EVENT_LIKE_BUTTON_DID_TAP = "fb_like_button_did_tap";

    @NotNull
    public static final String EVENT_LIKE_VIEW_CANNOT_PRESENT_DIALOG = "fb_like_control_cannot_present_dialog";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DIALOG_DID_SUCCEED = "fb_like_control_dialog_did_succeed";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_LIKE = "fb_like_control_did_like";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_PRESENT_DIALOG = "fb_like_control_did_present_dialog";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_PRESENT_FALLBACK = "fb_like_control_did_present_fallback_dialog";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_UNDO_QUICKLY = "fb_like_control_did_undo_quickly";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_UNLIKE = "fb_like_control_did_unlike";

    @NotNull
    public static final String EVENT_LIKE_VIEW_ERROR = "fb_like_control_error";

    @NotNull
    public static final String EVENT_LOGIN_BUTTON_CREATE = "fb_login_button_create";

    @NotNull
    public static final String EVENT_LOGIN_BUTTON_DID_TAP = "fb_login_button_did_tap";

    @NotNull
    public static final String EVENT_LOGIN_VIEW_USAGE = "fb_login_view_usage";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_COMPLETE = "fb_native_dialog_complete";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_START = "fb_native_dialog_start";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_LIKE = "fb_dialogs_present_like";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_MESSAGE = "fb_dialogs_present_message";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_OG_MESSAGE = "fb_dialogs_present_message_og";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_OG_SHARE = "fb_dialogs_present_share_og";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_PHOTO_MESSAGE = "fb_dialogs_present_message_photo";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_PHOTO_SHARE = "fb_dialogs_present_share_photo";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_SHARE = "fb_dialogs_present_share";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_VIDEO_SHARE = "fb_dialogs_present_share_video";

    @NotNull
    public static final String EVENT_NATIVE_LOGIN_DIALOG_COMPLETE = "fb_dialogs_native_login_dialog_complete";

    @NotNull
    public static final String EVENT_NATIVE_LOGIN_DIALOG_START = "fb_dialogs_native_login_dialog_start";

    @NotNull
    public static final String EVENT_PLACE_PICKER_USAGE = "fb_place_picker_usage";

    @NotNull
    public static final String EVENT_SDK_INITIALIZE = "fb_sdk_initialize";

    @NotNull
    public static final String EVENT_SEND_BUTTON_CREATE = "fb_send_button_create";

    @NotNull
    public static final String EVENT_SEND_BUTTON_DID_TAP = "fb_send_button_did_tap";

    @NotNull
    public static final String EVENT_SHARE_BUTTON_CREATE = "fb_share_button_create";

    @NotNull
    public static final String EVENT_SHARE_BUTTON_DID_TAP = "fb_share_button_did_tap";

    @NotNull
    public static final String EVENT_SHARE_DIALOG_SHOW = "fb_share_dialog_show";

    @NotNull
    public static final String EVENT_SHARE_MESSENGER_DIALOG_SHOW = "fb_messenger_share_dialog_show";

    @NotNull
    public static final String EVENT_SHARE_RESULT = "fb_share_dialog_result";

    @NotNull
    public static final String EVENT_SMART_LOGIN_SERVICE = "fb_smart_login_service";

    @NotNull
    public static final String EVENT_USER_SETTINGS_USAGE = "fb_user_settings_vc_usage";

    @NotNull
    public static final String EVENT_WEB_LOGIN_COMPLETE = "fb_dialogs_web_login_dialog_complete";

    @NotNull
    public static final AnalyticsEvents INSTANCE = new AnalyticsEvents();

    @NotNull
    public static final String PARAMETER_ACTION_ID = "action_id";

    @NotNull
    public static final String PARAMETER_APP_ID = "app_id";

    @NotNull
    public static final String PARAMETER_CALL_ID = "call_id";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME = "fb_dialog_outcome";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED = "Cancelled";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED = "Completed";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_FAILED = "Failed";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN = "Unknown";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_AUXILIARY_POSITION = "auxiliary_position";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_CURRENT_ACTION = "current_action";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_ERROR_JSON = "error";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT = "horizontal_alignment";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_OBJECT_ID = "object_id";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_OBJECT_TYPE = "object_type";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_STYLE = "style";

    @NotNull
    public static final String PARAMETER_NATIVE_LOGIN_DIALOG_COMPLETE_TIME = "fb_native_login_dialog_complete_time";

    @NotNull
    public static final String PARAMETER_NATIVE_LOGIN_DIALOG_START_TIME = "fb_native_login_dialog_start_time";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_OPENGRAPH = "open_graph";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_PAGE_ID = "fb_share_dialog_content_page_id";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_PHOTO = "photo";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_STATUS = "status";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_TYPE = "fb_share_dialog_content_type";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_UNKNOWN = "unknown";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_UUID = "fb_share_dialog_content_uuid";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_VIDEO = "video";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW = "fb_share_dialog_show";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC = "automatic";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_NATIVE = "native";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_UNKNOWN = "unknown";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_WEB = "web";

    @NotNull
    public static final String PARAMETER_SHARE_ERROR_MESSAGE = "error_message";

    @NotNull
    public static final String PARAMETER_SHARE_MESSENGER_GENERIC_TEMPLATE = "GenericTemplate";

    @NotNull
    public static final String PARAMETER_SHARE_MESSENGER_MEDIA_TEMPLATE = "MediaTemplate";

    @NotNull
    public static final String PARAMETER_SHARE_MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE = "OpenGraphMusicTemplate";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME = "fb_share_dialog_outcome";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_CANCELLED = "cancelled";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_ERROR = "error";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_SUCCEEDED = "succeeded";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_UNKNOWN = "unknown";

    @NotNull
    public static final String PARAMETER_WEB_LOGIN_E2E = "fb_web_login_e2e";

    @NotNull
    public static final String PARAMETER_WEB_LOGIN_SWITCHBACK_TIME = "fb_web_login_switchback_time";

    private AnalyticsEvents() {
    }
}
