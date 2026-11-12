package com.xiaomi.hm.health.permission;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b.\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0016\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0016\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0016\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0016\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0016\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0016\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u0016\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\bR\u0016\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\bR\u0016\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u0016\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\bR\u0016\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010%\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010 R\u0016\u0010&\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010 R\u0016\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010(\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010 R\u0016\u0010)\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010*\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010+\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010 R\u0016\u0010,\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010 R\u0016\u0010-\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010 R\u0016\u0010.\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010 R\u0016\u0010/\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010 R\u0016\u00100\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010 R\u0016\u00101\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010 ¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/permission/PermissionManager;", "", "", "", "getSharePermissions", "()[Ljava/lang/String;", "", "REQUEST_CODE_HOME_BASIC", LogUtil.I, "REQUEST_CODE_HOME_BAND_DEVICE", "REQUEST_CODE_DEVICE_BIND_BLUE_MONKEY", "REQUEST_CODE_DEVICE_BIND_BIND_SCALE", "REQUEST_CODE_DEVICE_BIND_BIND_BAND", "REQUEST_CODE_DEVICE_BIND_BIND_SHOES", "REQUEST_CODE_DEVICE_BIND_BIND_ANTELOPE", "REQUEST_CODE_DEVICE_BIND_BIND_KANGNAI", "REQUEST_CODE_DEVICE_BIND_BIND_MIJIA", "REQUEST_CODE_IMAGE_SELECT_CAMERA", "REQUEST_CODE_IMAGE_SELECT_PHOTO", "REQUEST_CODE_NFC", "REQUEST_CODE_SHARE", "REQUEST_CODE_SPORT_MAP_LOCATION", "REQUEST_CODE_DEVICE_BIND_BLUE_MONKEY_BACKGROUND_LOCATION", "REQUEST_CODE_DEVICE_BIND_BIND_SCALE_BACKGROUND_LOCATION", "REQUEST_CODE_DEVICE_BIND_BIND_BAND_BACKGROUND_LOCATION", "REQUEST_CODE_HOME_BACKGROUND_LOCATION", "REQUEST_CODE_DEVICE_BIND_BIND_SHOES_BACKGROUND_LOCATION", "REQUEST_CODE_DEVICE_BIND_BIND_ANTELOPE_BACKGROUND_LOCATION", "REQUEST_CODE_DEVICE_BIND_BIND_KANGNAI_BACKGROUND_LOCATION", "REQUEST_CODE_DEVICE_BIND_BIND_MIJIA_BACKGROUND_LOCATION", "REQUEST_CODE_WEIGHT_CONNECT_LOCATION", "KEY_HOME_BASIC", "Ljava/lang/String;", "KEY_HOME_BAND_DEVICE", "KEY_DEVICE_BIND_BLUE_MONKEY", "KEY_DEVICE_BIND_BIND_SCALE", "KEY_DEVICE_BIND_BIND_BAND", "KEY_DEVICE_BIND_BIND_SHOES", "KEY_DEVICE_BIND_BIND_ANTELOPE", "KEY_DEVICE_BIND_BIND_KANGNAI", "KEY_DEVICE_BIND_BIND_MIJIA", "KEY_IMAGE_SELECT_CAMERA", "KEY_IMAGE_SELECT_PHOTO", "KEY_NFC", "KEY_SHARE", "KEY_SHARE_BODY_FAT", "KEY_SHARE_STRESS", "KEY_SHARE_HEART_RATE", "KEY_SPORT_LOCATION", "KEY_WEIGHT_CONNECT_LOCATION", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PermissionManager {

    @NotNull
    public static final PermissionManager INSTANCE = new PermissionManager();

    @NotNull
    public static final String KEY_DEVICE_BIND_BIND_ANTELOPE = "key_device_bind_bind_antelope";

    @NotNull
    public static final String KEY_DEVICE_BIND_BIND_BAND = "key_device_bind_bind_band";

    @NotNull
    public static final String KEY_DEVICE_BIND_BIND_KANGNAI = "key_device_bind_bind_kangnai";

    @NotNull
    public static final String KEY_DEVICE_BIND_BIND_MIJIA = "key_device_bind_bind_mijia";

    @NotNull
    public static final String KEY_DEVICE_BIND_BIND_SCALE = "key_device_bind_bind_scale";

    @NotNull
    public static final String KEY_DEVICE_BIND_BIND_SHOES = "key_device_bind_bind_shoes";

    @NotNull
    public static final String KEY_DEVICE_BIND_BLUE_MONKEY = "key_device_bind_blue_monkey";

    @NotNull
    public static final String KEY_HOME_BAND_DEVICE = "key_home_band_device";

    @NotNull
    public static final String KEY_HOME_BASIC = "key_home_basic";

    @NotNull
    public static final String KEY_IMAGE_SELECT_CAMERA = "key_image_select_camera";

    @NotNull
    public static final String KEY_IMAGE_SELECT_PHOTO = "key_image_select_photo";

    @NotNull
    public static final String KEY_NFC = "key_nfc";

    @NotNull
    public static final String KEY_SHARE = "key_share";

    @NotNull
    public static final String KEY_SHARE_BODY_FAT = "key_share_body_fat";

    @NotNull
    public static final String KEY_SHARE_HEART_RATE = "key_share_heart_rate";

    @NotNull
    public static final String KEY_SHARE_STRESS = "key_share_stress";

    @NotNull
    public static final String KEY_SPORT_LOCATION = "main_sport_location";

    @NotNull
    public static final String KEY_WEIGHT_CONNECT_LOCATION = "key_weight_connect_location";
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_ANTELOPE = 106;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_ANTELOPE_BACKGROUND_LOCATION = 120;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_BAND = 104;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_BAND_BACKGROUND_LOCATION = 117;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_KANGNAI = 107;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_KANGNAI_BACKGROUND_LOCATION = 121;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_MIJIA = 108;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_MIJIA_BACKGROUND_LOCATION = 122;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_SCALE = 103;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_SCALE_BACKGROUND_LOCATION = 116;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_SHOES = 105;
    public static final int REQUEST_CODE_DEVICE_BIND_BIND_SHOES_BACKGROUND_LOCATION = 119;
    public static final int REQUEST_CODE_DEVICE_BIND_BLUE_MONKEY = 102;
    public static final int REQUEST_CODE_DEVICE_BIND_BLUE_MONKEY_BACKGROUND_LOCATION = 115;
    public static final int REQUEST_CODE_HOME_BACKGROUND_LOCATION = 118;
    public static final int REQUEST_CODE_HOME_BAND_DEVICE = 101;
    public static final int REQUEST_CODE_HOME_BASIC = 100;
    public static final int REQUEST_CODE_IMAGE_SELECT_CAMERA = 109;
    public static final int REQUEST_CODE_IMAGE_SELECT_PHOTO = 110;
    public static final int REQUEST_CODE_NFC = 111;
    public static final int REQUEST_CODE_SHARE = 112;
    public static final int REQUEST_CODE_SPORT_MAP_LOCATION = 113;
    public static final int REQUEST_CODE_WEIGHT_CONNECT_LOCATION = 123;

    private PermissionManager() {
    }

    @JvmStatic
    @NotNull
    public static final String[] getSharePermissions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
