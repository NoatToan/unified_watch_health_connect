package com.huawei.operation.h5pro.jsmodules.sharecaas;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.caas.messageservice.HwShareMsgInfo;
import com.huawei.caas.messageservice.WebPageShareMsg;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.ltg;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes41.dex */
public class ShareToCaasUtil {
    private static final String RESOURCE_PREFIX_IMG = "data:image/";
    private static final String TAG = "H5pro_ShareToCaasUtil";

    private ShareToCaasUtil() {
    }

    public static HwShareMsgInfo initHwShareMsgInfo(String str) throws JsonSyntaxException {
        ShareCaasParam shareCaasParam = (ShareCaasParam) new Gson().fromJson(str, ShareCaasParam.class);
        Bitmap appIcon = null;
        if (shareCaasParam == null) {
            return null;
        }
        if (TextUtils.equals(shareCaasParam.getShareType(), ShareCaasParam.SHARE_TYPE_WEBPAGE)) {
            WebPageShareMsg.Builder description = new WebPageShareMsg.Builder().setTitle(shareCaasParam.getTitle()).setUrl(shareCaasParam.getUrl()).setMultiUrl(shareCaasParam.getMultiUrl()).setDescription(shareCaasParam.getDescription());
            String filePath = shareCaasParam.getFilePath();
            if (!TextUtils.isEmpty(filePath)) {
                appIcon = filePath.startsWith(RESOURCE_PREFIX_IMG) ? imgResource2Bitmap(filePath) : null;
                if (filePath.startsWith("http")) {
                    appIcon = ltg.a(filePath);
                }
            }
            if (appIcon == null) {
                appIcon = getAppIcon();
            }
            if (appIcon != null) {
                LogUtil.i(TAG, "bitmap != null");
                description.setThumbData(appIcon);
            }
            return description.build();
        }
        LogUtil.i(TAG, "Not supported: " + shareCaasParam.getShareType());
        return null;
    }

    public static Bitmap imgResource2Bitmap(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str.replace("data:image/png;base64,", "").replace("data:image/jpeg;base64,", "").getBytes(Charset.defaultCharset()), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (IllegalArgumentException | OutOfMemoryError e) {
            LogUtil.e(TAG, "imgResource2Bitmap: exception -> " + e.getMessage());
            return null;
        }
    }

    private static Bitmap getAppIcon() {
        Drawable drawableLoadIcon = BaseApplication.getContext().getApplicationInfo().loadIcon(BaseApplication.getContext().getPackageManager());
        if (drawableLoadIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableLoadIcon).getBitmap();
        }
        return null;
    }
}
