package com.huawei.operation.h5pro.bridgeimpl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.jsbridge.system.share.Share;
import com.huawei.health.h5pro.jsbridge.system.share.ShareExtApi;
import com.huawei.health.h5pro.jsbridge.system.share.ShareImageObj;
import com.huawei.health.h5pro.jsbridge.system.share.ShareLinkObj;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.operation.h5pro.jsmodules.sharecaas.ShareToCaasUtil;
import com.huawei.ui.commonui.R;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.gxz;
import defpackage.ltg;
import defpackage.qqf;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ShareImpl implements ShareExtApi {
    private static final String COLUMN_IS_NEED_PRINT = "isNeedPrint";
    private static final String COLUMN_IS_NEED_SAVE_PDF = "isNeedSavePdf";
    public static final String COLUMN_IS_SHARE_FAMILY = "isShareFamily";
    private static final String COLUMN_IS_SHOW_USERINFO_BUTTON = "isShowUserinfoButton";
    private static final String COLUMN_SAVE_FILE_IMAGES = "saveFileImages";
    private static final String COLUMN_SHARE_FROM = "shareFrom";
    private static final String COLUMN_SHARE_TITLE = "shareTitleContent";
    private static final String IMAGE_BASE64_HEAD_REGEX = "data:image/(jpeg|png|webp);base64,";
    private static final String IMAGE_BASE64_REGEX = "data:image/(jpeg|png|webp);base64,.*";
    private static final String TAG = "H5pro_ShareImpl";

    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share
    public void shareText(String str, Share.ShareCallback shareCallback) {
        gxt gxtVar = new gxt(0);
        gxtVar.b(str);
        gxtVar.d(AnalyticsValue.SHARE_1140001.value());
        gxtVar.e(false);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, BaseApplication.b());
        shareCallback.onSuccess();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share
    public void shareImage(ShareImageObj shareImageObj, Share.ShareCallback shareCallback) {
        gxt gxtVar;
        String filePath = shareImageObj.getFilePath();
        if (!GeneralUtil.isSafePath(filePath)) {
            LogUtil.w(TAG, "shareImage: untrusted -> " + filePath);
            return;
        }
        if (shareImageObj.isReport()) {
            gxtVar = new gxt(7);
            Bitmap bitmapC = qqf.c(filePath);
            if (bitmapC == null) {
                shareCallback.onFailure(-1, "shareImage gallery fail: bitmap is fail");
                return;
            }
            gxtVar.d(bitmapC);
        } else {
            gxtVar = new gxt(4);
            gxtVar.c(filePath);
        }
        gxtVar.d(shareImageObj.getModuleId());
        Map<String, Object> shareBiMap = shareImageObj.getShareBiMap();
        if (shareBiMap != null && !shareBiMap.isEmpty()) {
            gxtVar.c(shareBiMap);
        }
        parseShareExtra(gxtVar, shareImageObj.getExtra());
        gxtVar.a(1);
        gxtVar.f(false);
        gxtVar.e(false);
        try {
            if (gxtVar.aa() == 0) {
                gxtVar.d(Integer.parseInt(shareImageObj.getModuleId()));
            }
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, "shareImage ", e.getMessage());
        }
        exeShare(gxtVar, shareImageObj.getSharePlatform());
        shareCallback.onSuccess();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share
    public void shareLink(ShareLinkObj shareLinkObj, Share.ShareCallback shareCallback) {
        Bitmap bitmapA;
        if (TextUtils.isEmpty(shareLinkObj.getUrl()) || TextUtils.isEmpty(shareLinkObj.getTitle()) || TextUtils.isEmpty(shareLinkObj.getDesc())) {
            shareCallback.onFailure(-1, "param is invalid");
        }
        String iconUrl = shareLinkObj.getIconUrl();
        if (!TextUtils.isEmpty(iconUrl) && iconUrl.matches(IMAGE_BASE64_REGEX)) {
            try {
                String strReplaceFirst = iconUrl.replaceFirst(IMAGE_BASE64_HEAD_REGEX, "");
                if (TextUtils.isEmpty(strReplaceFirst)) {
                    bitmapA = null;
                } else {
                    byte[] bArrDecode = Base64.decode(strReplaceFirst, 0);
                    bitmapA = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                }
            } catch (IllegalArgumentException e) {
                LogUtil.w(TAG, "shareLink: exception -> " + e.getMessage());
            }
        } else {
            bitmapA = ltg.a(iconUrl);
        }
        if (bitmapA == null) {
            bitmapA = getAppIcon();
        }
        gxt gxtVar = new gxt(2);
        gxtVar.b(shareLinkObj.getDesc());
        gxtVar.d(bitmapA);
        gxtVar.f(shareLinkObj.getUrl());
        gxtVar.e(shareLinkObj.getTitle());
        gxtVar.d(shareLinkObj.getModuleId());
        parseShareExtra(gxtVar, shareLinkObj.getExtra());
        Map<String, Object> shareBiMap = shareLinkObj.getShareBiMap();
        if (shareBiMap != null && !shareBiMap.isEmpty()) {
            gxtVar.c(shareBiMap);
        }
        gxtVar.e(false);
        try {
            if (gxtVar.aa() == 0) {
                gxtVar.d(Integer.parseInt(shareLinkObj.getModuleId()));
            }
        } catch (NumberFormatException e2) {
            LogUtil.e(TAG, "shareImage ", e2.getMessage());
        }
        exeShare(gxtVar, shareLinkObj.getSharePlatform());
        shareCallback.onSuccess();
    }

    private void exeShare(gxt gxtVar, int[] iArr) {
        SocialShareCenterApi socialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        Context contextB = BaseApplication.b();
        if (iArr == null || iArr.length == 0) {
            socialShareCenterApi.exeShare(gxtVar, contextB);
        } else {
            socialShareCenterApi.exeShare(contextB, iArr[0], gxtVar);
        }
    }

    private Bitmap getAppIcon() {
        Drawable drawableLoadIcon = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getApplicationInfo().loadIcon(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageManager());
        if (drawableLoadIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableLoadIcon).getBitmap();
        }
        return null;
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.share.ShareExtApi
    public void share(Context context, H5ProAppInfo h5ProAppInfo, String str, Share.ShareCallback shareCallback) {
        LogUtil.i(TAG, "share start");
        if (TextUtils.isEmpty(str)) {
            shareCallback.onFailure(-1, "param is empty");
            return;
        }
        try {
            gxt gxtVar = (gxt) new Gson().fromJson(JsonSanitizer.sanitize(str), gxt.class);
            if (10 == gxtVar.u()) {
                gxt gxtVar2 = new gxt(gxtVar.u());
                gxtVar2.a(gxtVar.a());
                gxtVar2.d(gxtVar.aa());
                gxtVar2.e(gxtVar.p());
                ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(context, 5, gxtVar);
                shareCallback.onSuccess();
                return;
            }
            if (ShareType.MULTI_IMAGE_SHARING.shareType != gxtVar.u() && ShareType.SPORT_SHARE_WAY_OPTIONAL_IMG.shareType != gxtVar.u()) {
                shareCallback.onFailure(-1, "Not implemented -> " + gxtVar.u());
                return;
            }
            LogUtil.i(TAG, "MULTI_IMAGE_SHARING");
            for (gxy gxyVar : gxtVar.e()) {
                if (gxyVar == null) {
                    LogUtil.w(TAG, "shareEditContent is null");
                } else if (gxyVar.m()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(R.drawable.fitness_background_1));
                    arrayList.add(Integer.valueOf(R.drawable.share_geometry_1));
                    arrayList.add(Integer.valueOf(R.drawable.share_geometry_2));
                    arrayList.add(Integer.valueOf(R.drawable.share_geometry_3));
                    gxyVar.a(arrayList);
                    gxz gxzVar = new gxz();
                    gxzVar.a(1127);
                    gxzVar.b(R.drawable.watermark1127);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(gxzVar);
                    gxyVar.d(arrayList2);
                } else {
                    gxyVar.a(ShareToCaasUtil.imgResource2Bitmap(gxyVar.c()));
                }
            }
            ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, context);
            shareCallback.onSuccess();
        } catch (JsonSyntaxException e) {
            shareCallback.onFailure(-1, e.getMessage());
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    enum ShareType {
        MULTI_IMAGE_SHARING(6),
        SPORT_SHARE_WAY_OPTIONAL_IMG(13);

        private final int shareType;

        ShareType(int i) {
            this.shareType = i;
        }
    }

    private void parseShareExtra(gxt gxtVar, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.w(TAG, "parseShareExtra extraMap is null");
            return;
        }
        LogUtil.i(TAG, "parseShareExtra module:", gxtVar.o(), " extraMap:", HiJsonUtil.d(map));
        if (map.get(COLUMN_IS_SHARE_FAMILY) != null && (map.get(COLUMN_IS_SHARE_FAMILY) instanceof Boolean)) {
            gxtVar.b(((Boolean) map.get(COLUMN_IS_SHARE_FAMILY)).booleanValue());
        }
        if (map.get(COLUMN_IS_NEED_SAVE_PDF) != null && (map.get(COLUMN_IS_NEED_SAVE_PDF) instanceof Boolean)) {
            gxtVar.d(((Boolean) map.get(COLUMN_IS_NEED_SAVE_PDF)).booleanValue());
        }
        if (map.get(COLUMN_IS_NEED_PRINT) != null && (map.get(COLUMN_IS_NEED_PRINT) instanceof Boolean)) {
            gxtVar.a(((Boolean) map.get(COLUMN_IS_NEED_PRINT)).booleanValue());
        }
        if (map.get(COLUMN_SAVE_FILE_IMAGES) != null && (map.get(COLUMN_SAVE_FILE_IMAGES) instanceof ArrayList)) {
            gxtVar.e((ArrayList<String>) map.get(COLUMN_SAVE_FILE_IMAGES));
        }
        if (map.get(COLUMN_SHARE_TITLE) != null && (map.get(COLUMN_SHARE_TITLE) instanceof String)) {
            gxtVar.e((String) map.get(COLUMN_SHARE_TITLE));
        }
        if (map.get(COLUMN_SHARE_FROM) != null && (map.get(COLUMN_SHARE_FROM) instanceof Integer)) {
            gxtVar.d(((Integer) map.get(COLUMN_SHARE_FROM)).intValue());
        }
        if (map.containsKey(COLUMN_IS_SHOW_USERINFO_BUTTON)) {
            Object obj = map.get(COLUMN_IS_SHOW_USERINFO_BUTTON);
            if (obj instanceof Boolean) {
                gxtVar.j(((Boolean) obj).booleanValue());
            }
        }
    }
}
