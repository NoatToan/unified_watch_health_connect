package com.huawei.health.market.comment;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.huawei.health.servicesui.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import defpackage.lmf;
import defpackage.lsj;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class MarketCommentDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomViewDialog f8174c;
    private final Context d;

    public MarketCommentDialog(Context context) {
        this.d = context;
    }

    public void d() {
        View viewInflate = View.inflate(this.d, R.layout.market_comment_view, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon_market);
        Drawable drawable = this.d.getResources().getDrawable(R.mipmap.hw_health_market_comment);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        imageView.setImageDrawable(drawable);
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.d).d(viewInflate).c(this.d.getString(R.string.IDS_hwh_market_comment_reject).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: com.huawei.health.market.comment.MarketCommentDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MarketCommentDialog.this.b(AnalyticsValue.HEALTH_MARKET_COMMENT_DIALOG_2040060.value(), "1");
                MarketCommentDialog.this.f8174c.dismiss();
            }
        }).a(this.d.getString(R.string.IDS_hwh_market_comment_evaluate).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: com.huawei.health.market.comment.MarketCommentDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MarketCommentDialog.this.b(AnalyticsValue.HEALTH_MARKET_COMMENT_DIALOG_2040060.value(), "2");
                MarketCommentDialog.this.b();
                MarketCommentDialog.this.f8174c.dismiss();
            }
        }).d();
        this.f8174c = customViewDialogD;
        customViewDialogD.setCancelable(false);
        this.f8174c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.d, str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Uri uri;
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.addFlags(268435456);
            if (Utils.o()) {
                if (!lsj.a(this.d, "com.huawei.appmarket")) {
                    LogUtil.a("MarketCommentActivity", " oversea Not installed Market");
                    return;
                } else {
                    intent.setPackage("com.huawei.appmarket");
                    uri = null;
                }
            } else if (!lsj.c(this.d, "com.huawei.appmarket")) {
                LogUtil.a("MarketCommentActivity", "Not installed Market");
                return;
            } else {
                intent.setPackage("com.huawei.appmarket");
                uri = Uri.parse("hiapplink://com.huawei.appmarket?appId=C10414141&channelId=%E8%BF%90%E5%8A%A8%E5%81%A5%E5%BA%B7&id=d794c47a311e42558c2d9da299863601&s=54FAAEE06C524F8594B41D8550C4C39CE65C93322ACB8B3586D215D175EBDA44&detailType=0&v=&callType=AGDLINK&installType=0000");
            }
            if (uri == null) {
                uri = Uri.parse("market://details?id=com.huawei.health");
            }
            if (uri == null) {
                LogUtil.j("MarketCommentActivity", "uri is null");
            } else {
                intent.setData(uri);
                a(intent);
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MarketCommentActivity", "Exception: jumpToMarket");
        }
    }

    private void a(Intent intent) {
        Context context = this.d;
        if (context == null) {
            LogUtil.j("MarketCommentActivity", "startActivityForMarket mContext is null");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("MarketCommentActivity", "startActivityForMarket packageManager is null");
            return;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.isEmpty()) {
            LogUtil.j("MarketCommentActivity", "startActivityForMarket resolveInfoList is empty");
            return;
        }
        Intent intent2 = new Intent(intent);
        ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
        if (resolveInfo == null) {
            LogUtil.j("MarketCommentActivity", "startActivityForMarket resolveInfo is null");
            return;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo == null || activityInfo.packageName == null || activityInfo.name == null) {
            LogUtil.j("MarketCommentActivity", "startActivityForMarket resolveInfo activityInfo is null");
            return;
        }
        try {
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            qrs.c(intent2, activityInfo.packageName, this.d, qre.f(com.huawei.ui.commonui.R.string.IDS_device_fragment_application_market));
        } catch (ActivityNotFoundException e) {
            LogUtil.e("MarketCommentActivity", "startActivityForMarket ActivityNotFoundException e:", e.getMessage());
        }
    }
}
