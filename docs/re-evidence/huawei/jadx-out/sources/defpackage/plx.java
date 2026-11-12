package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginsocialshare.R;
import health.compact.a.CommonUtil;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class plx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gxt f45623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f45624c;

    plx(Context context, gxt gxtVar) {
        this.f45624c = context;
        this.f45623b = gxtVar;
    }

    private boolean d() {
        return CommonUtil.d(this.f45624c, "com.sina.weibo");
    }

    void b() {
        if (this.f45623b == null || this.f45624c == null) {
            LogUtil.e("Share_SinaShareInteractors", "shareBySina fail:mShareContent/mShareHandler/mContext is null");
            return;
        }
        if (!d()) {
            Toast.makeText(this.f45624c, R.string.IDS_plugin_socialshare_install_weibo, 0).show();
            LogUtil.e("Share_SinaShareInteractors", "shareBySina fail: sina not installed");
            return;
        }
        int iU = this.f45623b.u();
        if (iU != 0) {
            if (iU != 1) {
                if (iU != 2) {
                    if (iU != 4) {
                        if (iU == 5) {
                            LogUtil.a("Share_SinaShareInteractors", "SHARE_WAY_MULTI_IMG");
                            e();
                            return;
                        } else if (iU == 8 || iU == 9) {
                            a();
                            return;
                        } else {
                            LogUtil.e("Share_SinaShareInteractors", "UNKNOWN SinaShareWay!");
                            return;
                        }
                    }
                }
            }
            LogUtil.a("Share_SinaShareInteractors", "SHARE_WAY_PIC");
            c();
            return;
        }
        LogUtil.j("Share_SinaShareInteractors", "SHARE_WAY_TEXT unsupported!");
    }

    private void c() {
        String strG;
        if (this.f45623b.u() == 1) {
            strG = pnq.a(this.f45624c, this.f45623b.r());
        } else {
            strG = this.f45623b.g();
        }
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        Uri uriA = pnq.a(this.f45624c, new File(strG));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", uriA);
        c(intent);
    }

    private void a() {
        Uri uriY;
        LogUtil.a("Share_SinaShareInteractors", "shareSingleVideo enter");
        if (this.f45623b.u() == 8) {
            String strX = this.f45623b.x();
            if (TextUtils.isEmpty(strX)) {
                return;
            } else {
                uriY = pnq.a(this.f45624c, new File(strX));
            }
        } else if (this.f45623b.u() == 9) {
            uriY = this.f45623b.y();
        } else {
            LogUtil.j("Share_SinaShareInteractors", "shareSingleVideo is other share type");
            uriY = null;
        }
        LogUtil.a("Share_SinaShareInteractors", "shareSingleVideo uri:", uriY != null ? uriY.getPath() : "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(MediaQueryHelper.VideoType.TYPE_ALL);
        intent.putExtra("android.intent.extra.STREAM", uriY);
        c(intent);
    }

    private void e() {
        ArrayList<Uri> arrayListB = pnq.b(this.f45624c, this.f45623b, 3);
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", arrayListB);
        c(intent);
    }

    private void c(Intent intent) {
        intent.setComponent(new ComponentName("com.sina.weibo", "com.sina.weibo.composerinde.ComposerDispatchActivity"));
        intent.addFlags(268435456);
        intent.setFlags(1);
        intent.setFlags(2);
        try {
            this.f45624c.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Share_SinaShareInteractors", "systemShareWeibo ActivityNotFoundException: ", e.getMessage());
        }
    }
}
