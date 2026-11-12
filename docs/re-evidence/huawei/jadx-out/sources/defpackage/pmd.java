package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class pmd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gxt f45650c;
    private Context e;

    public pmd(Context context, gxt gxtVar) {
        this.e = context;
        this.f45650c = gxtVar;
    }

    private boolean b() {
        return CommonUtil.d(this.e, "com.xingin.xhs");
    }

    public void d() throws Throwable {
        if (!b()) {
            Toast.makeText(this.e, R.string.IDS_plugin_socialshare_install_xhs, 0).show();
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.xingin.xhs");
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.addFlags(2);
        int iU = this.f45650c.u();
        if (iU == 1 || iU == 4) {
            if (PermissionUtil.a()) {
                d(intent);
            } else {
                h(intent);
            }
        } else if (iU == 5) {
            a(intent);
        } else if (iU == 8 || iU == 9) {
            if (PermissionUtil.a()) {
                b(intent);
            } else {
                c(intent);
            }
        } else {
            LogUtil.e("Share_XiaohongshuShareInteractors", "UNKNOWN XhsShareWay!");
        }
        try {
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Share_XiaohongshuShareInteractors", "share xhs ActivityNotFoundException.");
        }
    }

    private void c(final Intent intent) {
        PermissionUtil.d(this.e, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.e) { // from class: pmd.1
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() throws Throwable {
                pmd.this.g(intent);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                super.onDenied(str);
                LogUtil.a("Share_XiaohongshuShareInteractors", "setupVideoByMediaStore Permission onDenied");
                pmd.this.b(intent);
            }
        });
    }

    private void h(final Intent intent) {
        PermissionUtil.d(this.e, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.e) { // from class: pmd.3
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() throws Throwable {
                pmd.this.d(intent);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                super.onDenied(str);
                LogUtil.a("Share_XiaohongshuShareInteractors", "shareSingleImage Permission onDenied");
                pmd.this.e(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        String strG;
        if (this.f45650c.u() == 1) {
            strG = pnq.a(this.e, this.f45650c.r());
        } else {
            strG = this.f45650c.g();
        }
        if (TextUtils.isEmpty(strG)) {
            ReleaseLogUtil.e("Share_XiaohongshuShareInteractors", "setupSingleImage xhs filePath is null.");
            return;
        }
        Uri uriA = pnq.a(this.e, new File(strG));
        if (uriA == null) {
            ReleaseLogUtil.e("Share_XiaohongshuShareInteractors", "setupSingleImage xhs imageUri is null.");
            return;
        }
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", uriA);
        this.e.grantUriPermission("com.xingin.xhs", uriA, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Intent intent) throws Throwable {
        Uri uriY;
        if (this.f45650c.u() == 8) {
            String strX = this.f45650c.x();
            if (TextUtils.isEmpty(strX)) {
                return;
            } else {
                uriY = pnq.a(this.e, new File(strX));
            }
        } else {
            uriY = this.f45650c.u() == 9 ? this.f45650c.y() : null;
        }
        if (uriY == null) {
            return;
        }
        Uri uriE = pnq.e(this.e, uriY, "share_red_book_video.mp4");
        pnq.a(uriE, 5000);
        intent.setType(MediaQueryHelper.VideoType.TYPE_ALL);
        intent.putExtra("android.intent.extra.STREAM", uriE);
        this.e.grantUriPermission("com.xingin.xhs", uriE, 1);
        this.e.grantUriPermission("com.xingin.xhs", uriE, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) throws Throwable {
        String strG;
        if (this.f45650c.r() != null) {
            ReleaseLogUtil.e("Share_XiaohongshuShareInteractors", "setupSingleImageByMediaStore getSharePicContent is not null.");
            strG = pnq.a(this.e, this.f45650c.r());
        } else {
            strG = this.f45650c.g();
        }
        if (TextUtils.isEmpty(strG)) {
            ReleaseLogUtil.e("Share_XiaohongshuShareInteractors", "setupSingleImageByMediaStore xhs filePath is null.");
            return;
        }
        Uri uriC = pnq.c(this.e, this.f45650c.r(), "xiaohongshu_share.jpg");
        if (uriC == null) {
            ReleaseLogUtil.e("Share_XiaohongshuShareInteractors", "setupSingleImageByMediaStore saveBitmapToMediaStore is null.");
            uriC = pnq.a(this.e, new File(strG));
        } else {
            pnq.a(uriC, 5000);
        }
        if (uriC == null) {
            ReleaseLogUtil.e("Share_XiaohongshuShareInteractors", "setupSingleImageByMediaStore xhs imageUri is null.");
            return;
        }
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", uriC);
        this.e.grantUriPermission("com.xingin.xhs", uriC, 1);
    }

    private void a(Intent intent) {
        ArrayList<Uri> arrayListB = pnq.b(this.e, this.f45650c, 3);
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", arrayListB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        Uri uriY;
        if (this.f45650c.u() == 8) {
            String strX = this.f45650c.x();
            if (TextUtils.isEmpty(strX)) {
                return;
            } else {
                uriY = pnq.a(this.e, new File(strX));
            }
        } else {
            uriY = this.f45650c.u() == 9 ? this.f45650c.y() : null;
        }
        if (uriY == null) {
            return;
        }
        intent.setType(MediaQueryHelper.VideoType.TYPE_ALL);
        intent.putExtra("android.intent.extra.STREAM", uriY);
        this.e.grantUriPermission("com.xingin.xhs", uriY, 1);
    }
}
