package defpackage;

import android.content.ActivityNotFoundException;
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
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class plk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gxt f45600a;
    private Context e;

    public plk(Context context, gxt gxtVar) {
        this.e = context;
        this.f45600a = gxtVar;
    }

    private boolean d() {
        return CommonUtil.d(this.e, "com.ss.android.ugc.aweme");
    }

    public void a() {
        if (!d()) {
            Toast.makeText(this.e, R.string.IDS_plugin_socialshare_install_douyin, 0).show();
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.ss.android.ugc.aweme");
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.addFlags(2);
        int iU = this.f45600a.u();
        if (iU == 1 || iU == 4) {
            b(intent);
        } else if (iU == 5) {
            e(intent);
        } else if (iU == 8 || iU == 9) {
            c(intent);
        } else {
            LogUtil.e("Share_DouyinShareInteractors", "UNKNOWN DouyinShareWay!");
        }
        try {
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ReleaseLogUtil.a("Share_DouyinShareInteractors", "share douyin ActivityNotFoundException.");
        }
    }

    private void b(Intent intent) {
        String strG;
        if (this.f45600a.u() == 1) {
            strG = pnq.a(this.e, this.f45600a.r());
        } else {
            strG = this.f45600a.g();
        }
        if (TextUtils.isEmpty(strG)) {
            ReleaseLogUtil.e("Share_DouyinShareInteractors", "setupSingleImage douyin filePath is null.");
            return;
        }
        Uri uriA = pnq.a(this.e, new File(strG));
        if (uriA == null) {
            ReleaseLogUtil.e("Share_DouyinShareInteractors", "setupSingleImage douyin imageUri is null.");
            return;
        }
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", uriA);
        this.e.grantUriPermission("com.ss.android.ugc.aweme", uriA, 1);
    }

    private void e(Intent intent) {
        ArrayList<Uri> arrayListB = pnq.b(this.e, this.f45600a, 3);
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", arrayListB);
    }

    private void c(Intent intent) {
        Uri uriY;
        if (this.f45600a.u() == 8) {
            String strX = this.f45600a.x();
            if (TextUtils.isEmpty(strX)) {
                return;
            } else {
                uriY = pnq.a(this.e, new File(strX));
            }
        } else {
            uriY = this.f45600a.u() == 9 ? this.f45600a.y() : null;
        }
        if (uriY == null) {
            return;
        }
        intent.setType(MediaQueryHelper.VideoType.TYPE_ALL);
        intent.putExtra("android.intent.extra.STREAM", uriY);
    }
}
