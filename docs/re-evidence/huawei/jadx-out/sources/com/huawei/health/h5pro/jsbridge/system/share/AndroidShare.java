package com.huawei.health.h5pro.jsbridge.system.share;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.operation.beans.TitleBean;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidShare implements Share {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6877b;

    public AndroidShare(Context context) {
        this.f6877b = context;
    }

    private static void b(Context context, Uri uri, Intent intent) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    private void e(File file) {
        Context context = this.f6877b;
        Uri uriForFile = FileProvider.getUriForFile(context, CommonUtil.getProviderAuthority(context), file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpeg");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        intentCreateChooser.addFlags(268435456);
        intentCreateChooser.setFlags(1);
        intentCreateChooser.setFlags(2);
        b(this.f6877b, uriForFile, intent);
        this.f6877b.startActivity(intentCreateChooser);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share
    public void shareImage(ShareImageObj shareImageObj, Share.ShareCallback shareCallback) {
        File file = new File(shareImageObj.getFilePath());
        if (!file.exists()) {
            shareCallback.onFailure(-1, "the file does not exist");
        }
        e(file);
        shareCallback.onSuccess();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share
    public void shareLink(ShareLinkObj shareLinkObj, Share.ShareCallback shareCallback) {
        Locale locale = Locale.ENGLISH;
        shareText(shareLinkObj.getTitle() + " " + shareLinkObj.getDesc() + " " + shareLinkObj.getUrl(), shareCallback);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.share.Share
    public void shareText(String str, Share.ShareCallback shareCallback) {
        if (TextUtils.isEmpty(str)) {
            shareCallback.onFailure(-1, "shareTextContent is empty");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        intent.addFlags(268435456);
        Intent intentCreateChooser = Intent.createChooser(intent, TitleBean.RIGHT_BTN_TYPE_SHARE);
        intentCreateChooser.addFlags(268435456);
        try {
            this.f6877b.startActivity(intentCreateChooser);
            shareCallback.onSuccess();
        } catch (ActivityNotFoundException e) {
            shareCallback.onFailure(-1, e.getMessage());
        }
    }
}
