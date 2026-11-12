package com.mipay.sdk.app;

import android.graphics.Color;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class WebConstants {
    public static int BACKGROUND_COLOR = 0;
    private static int ENGLISH = 0;
    public static int ID_CAMERA_STORAGE_TEXT = 0;
    public static int ID_CAMERA_TEXT = 0;
    public static int ID_CANCEL_TEXT = 0;
    public static int ID_FACE_CAMERA_DENIED_TEXT = 0;
    public static int ID_FACE_CAMERA_PERMANENTLY_DENIED_TEXT = 0;
    public static int ID_INFO_TEXT = 0;
    public static int ID_OK_TEXT = 0;
    public static int ID_STORAGE_TEXT = 0;
    public static final int IMAGE_SELECTOR_GO_TO_SETTINGS = 1003;
    public static final int IMAGE_SELECTOR_STORAGE = 1002;
    public static int INFO_TEXT_COLOR = 0;
    public static int INFO_TEXT_SIZE = 0;
    public static String KEY_URL = null;
    public static final String MODULE_TAG = "MipayWeb";
    public static final int REQUEST_CODE_INTERACTION = 1001;
    public static final int REQUEST_CODE_SELECT_IMAGE = 1004;
    private static int SIMPLIFIED_CHINESE;
    public static final boolean STAGING;
    public static final boolean TEST;
    private static int TRADITIONAL_CHINESE;
    public static String[][] UI_STRINGS;

    static {
        STAGING = new File("/data/system/server_staging").exists() || new File("/sdcard/server_staging").exists();
        TEST = new File("/data/system/server_testing").exists() || new File("/sdcard/server_testing").exists();
        KEY_URL = "url";
        INFO_TEXT_SIZE = 11;
        INFO_TEXT_COLOR = Color.parseColor("#bababa");
        BACKGROUND_COLOR = Color.parseColor("#f0f0f0");
        ID_INFO_TEXT = 0;
        ID_OK_TEXT = 1;
        ID_CANCEL_TEXT = 2;
        ID_CAMERA_TEXT = 3;
        ID_STORAGE_TEXT = 4;
        ID_CAMERA_STORAGE_TEXT = 5;
        ID_FACE_CAMERA_DENIED_TEXT = 6;
        ID_FACE_CAMERA_PERMANENTLY_DENIED_TEXT = 7;
        SIMPLIFIED_CHINESE = 0;
        TRADITIONAL_CHINESE = 1;
        ENGLISH = 2;
        UI_STRINGS = new String[][]{new String[]{"正在跳转", "正在跳轉", "Loading"}, new String[]{"确定", "確定", "OK"}, new String[]{"取消", "取消", OrderStatus.CANCEL}, new String[]{"缺少相机权限，请前往“设置”开启。", "缺少相機權限，請前往“設置”開啟。", "Allow camera in Settings to use the features."}, new String[]{"缺少存储权限，请前往“设置”开启", "缺少存儲權限，請前往“設置”開啟。", "Allow storage in Settings to use the features."}, new String[]{"缺少相机和存储权限，请前往“设置”开启。", "缺少相機和存儲權限，請前往“設置”開啟。", "Allow camera and storage in Settings to use the features."}, new String[]{"无法启动相机，暂时不能使用人脸识别", "無法啟動相機，暫時不能使用人臉識別", "无法启动相机，暂时不能使用人脸识别"}, new String[]{"请到设置-应用-权限中开启相机权限，以正常使用人脸识别功能", "請到設置-應用-權限中開啟相機權限，以正常使用人臉識別功能", "请到设置-应用-权限中开启相机权限，以正常使用人脸识别功能"}};
    }

    public static String getString(int i) {
        if (UI_STRINGS.length < i) {
            return "";
        }
        Locale locale = Locale.getDefault();
        if (locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            return UI_STRINGS[i][SIMPLIFIED_CHINESE];
        }
        return locale.equals(Locale.TRADITIONAL_CHINESE) ? UI_STRINGS[i][TRADITIONAL_CHINESE] : UI_STRINGS[i][ENGLISH];
    }
}
