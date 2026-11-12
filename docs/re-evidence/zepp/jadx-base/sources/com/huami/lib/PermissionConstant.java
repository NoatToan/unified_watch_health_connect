package com.huami.lib;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/huami/lib/PermissionConstant;", "", "", "REQUEST_CODE_IMAGE_SELECT_CAMERA", LogUtil.I, "REQUEST_CODE_IMAGE_SELECT_PHOTO", "", "KEY_HOME_BAND_DEVICE", "Ljava/lang/String;", "KEY_REQUEST_CODE_SHARE_HEART_RATE", "KEY_REQUEST_CODE_SHARE_STRESS", "KEY_REQUEST_CODE_SHARE_BODY_FAT", "KEY_REQUEST_CODE_SHARE_BASE", "KEY_IMAGE_SELECT_CAMERA_BASE", "KEY_IMAGE_SELECT_CAMERA_WATCH_FACE", "KEY_IMAGE_SELECT_PHOTO_BASE", "KEY_IMAGE_SELECT_PHOTO_WATCH_FACE", "KEY_SPORT_LOCATION", "KEY_SPORT_LOCATION_FIND", "<init>", "()V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionConstant {

    @NotNull
    public static final PermissionConstant INSTANCE = new PermissionConstant();

    @NotNull
    public static final String KEY_HOME_BAND_DEVICE = "key_home_band_device";

    @NotNull
    public static final String KEY_IMAGE_SELECT_CAMERA_BASE = "key_image_select_camera";

    @NotNull
    public static final String KEY_IMAGE_SELECT_CAMERA_WATCH_FACE = "key_image_select_camera_watch_face";

    @NotNull
    public static final String KEY_IMAGE_SELECT_PHOTO_BASE = "key_image_select_photo";

    @NotNull
    public static final String KEY_IMAGE_SELECT_PHOTO_WATCH_FACE = "key_image_select_photo_watch_face";

    @NotNull
    public static final String KEY_REQUEST_CODE_SHARE_BASE = "key_share_base";

    @NotNull
    public static final String KEY_REQUEST_CODE_SHARE_BODY_FAT = "key_share_body_fat";

    @NotNull
    public static final String KEY_REQUEST_CODE_SHARE_HEART_RATE = "key_share_heart_rate";

    @NotNull
    public static final String KEY_REQUEST_CODE_SHARE_STRESS = "key_share_stress";

    @NotNull
    public static final String KEY_SPORT_LOCATION = "main_sport_location";

    @NotNull
    public static final String KEY_SPORT_LOCATION_FIND = "main_sport_location_find";
    public static final int REQUEST_CODE_IMAGE_SELECT_CAMERA = 112;
    public static final int REQUEST_CODE_IMAGE_SELECT_PHOTO = 113;

    private PermissionConstant() {
    }
}
