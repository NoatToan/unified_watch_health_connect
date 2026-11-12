package com.xiaomi.aicr.constant;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.model.ErrorCode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class Constants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<Integer, String[]> f11095a = new a();

    public enum STATUS_DEFINE {
        OK,
        DOWNLOADING_FIRST_USE,
        NEED_UPGRADE,
        SERVICE_NOT_CONNECTED,
        SERVICE_ERROR,
        NOT_FOUND,
        SET_IMAGE_FAIL,
        UNSUPPORTED_CAPABILITY,
        PERMISSION_DENIED
    }

    public class a extends HashMap<Integer, String[]> {
        public a() {
            put(2000, new String[]{"com.xiaomi.aicr.cognition.ICognitionAudioInterface", "V1", "V1"});
            put(2001, new String[]{"com.xiaomi.aicr.cognition.ICognitionAudioInterface", "V1", "V1"});
            put(2003, new String[]{"com.xiaomi.aicr.cognition.ICognitionAudioInterface", "V1", "V1"});
            put(2004, new String[]{"com.xiaomi.aicr.cognition.ICognitionAudioInterface", "V1", "V1"});
            put(Integer.valueOf(CommonConstants.Mgc.RECHARGE_NOT_EXIST), new String[]{"com.xiaomi.aicr.cognition.ICognitionAudioInterface", "V1", "V1"});
            put(1010, new String[]{"com.xiaomi.aicr.cognition.ICognitionEngineInterface", "V1", "V1"});
            put(4000, new String[]{"com.xiaomi.aicr.cognition.IAppSuggestInterface", "V1", "V1"});
            put(4001, new String[]{"com.xiaomi.aicr.cognition.IAppSuggestInterface", "V1", "V1"});
            put(3000, new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(3001, new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(3002, new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(3003, new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(3100, new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(3004, new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(3005, new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(Integer.valueOf(AuthApiStatusCodes.AUTH_APP_CERT_ERROR), new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
            put(Integer.valueOf(ErrorCode.DATA_NOT_READY), new String[]{"com.xiaomi.aicr.cognition.ISceneRecognitionInterface", "V1", "V1"});
        }
    }
}
