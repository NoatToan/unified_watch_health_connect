package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginsocialshare.R;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public class pnp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f45726c;
    private String d;
    private gxt f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45724a = false;
    private Uri e = Uri.EMPTY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45725b = !PermissionUtil.a();

    public pnp(Context context, gxt gxtVar) {
        this.f45726c = context;
        this.f = gxtVar;
    }

    public void a() {
        lsy.a(new Runnable() { // from class: pnp.2
            @Override // java.lang.Runnable
            public void run() {
                pnp.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("Share_SystemShareInteractors", "doShare: enter");
        gxt gxtVar = this.f;
        if (gxtVar == null) {
            LogUtil.e("Share_SystemShareInteractors", "mShareContent is null");
        }
        int iU = gxtVar.u();
        LogUtil.a("Share_SystemShareInteractors", "doShare shareType=", Integer.valueOf(iU));
        switch (iU) {
            case 0:
                LogUtil.a("Share_SystemShareInteractors", "SHARE_WAY_TEXT");
                c(this.f.q());
                break;
            case 1:
            case 7:
                e(pnq.a(this.f45726c, this.f.r()));
                this.f45724a = true;
                break;
            case 2:
                LogUtil.a("Share_SystemShareInteractors", "SHARE_WAY_WEBPAGE");
                String strQ = this.f.q();
                String strV = this.f.v();
                if (strQ != null && strV != null) {
                    c(strQ + " " + strV);
                    break;
                }
                break;
            case 3:
            case 6:
            default:
                LogUtil.e("Share_SystemShareInteractors", "UNKNOWN ShareWay!");
                break;
            case 4:
            case 5:
                LogUtil.a("Share_SystemShareInteractors", "SHARE_WAY_IMG_PATH");
                e(this.f.g());
                break;
            case 8:
            case 9:
                i();
                break;
            case 10:
            case 11:
                d();
                break;
        }
    }

    private void i() {
        Uri uriY;
        LogUtil.a("Share_SystemShareInteractors", "shareVideo enter");
        if (this.f.u() == 8) {
            String strC = CommonUtil.c(this.f.x());
            if (TextUtils.isEmpty(strC)) {
                return;
            } else {
                uriY = pnq.a(this.f45726c, new File(strC));
            }
        } else if (this.f.u() == 9) {
            uriY = this.f.y();
        } else {
            LogUtil.j("Share_SystemShareInteractors", "shareVideo is other share type");
            uriY = null;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(MediaQueryHelper.VideoType.TYPE_ALL);
        intent.putExtra("android.intent.extra.STREAM", uriY);
        Intent intentCreateChooser = Intent.createChooser(intent, BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_share));
        intentCreateChooser.addFlags(268435456);
        intentCreateChooser.setFlags(1);
        intentCreateChooser.setFlags(2);
        try {
            this.f45726c.startActivity(intentCreateChooser);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Share_SystemShareInteractors", "systemShareImage err: ActivityNotFoundException");
        }
    }

    private void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            Intent intentCreateChooser = Intent.createChooser(intent, BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_share));
            intentCreateChooser.addFlags(268435456);
            try {
                this.f45726c.startActivity(intentCreateChooser);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Share_SystemShareInteractors", "systemShareText err: ActivityNotFoundException");
                return;
            }
        }
        LogUtil.e("Share_SystemShareInteractors", "systemShareText", "mShareText is null");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    private void d() {
        String strA;
        Uri uriC;
        String strSubstring;
        byte b2;
        String str;
        LogUtil.a("Share_SystemShareInteractors", "shareFile enter");
        if (this.f.u() == 10) {
            strA = this.f.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            } else {
                uriC = pnq.a(this.f45726c, new File(strA));
            }
        } else if (this.f.u() == 11) {
            uriC = this.f.c();
            strA = null;
        } else {
            strA = null;
            uriC = null;
        }
        if (!TextUtils.isEmpty(strA) && strA.contains(".")) {
            strSubstring = strA.substring(strA.lastIndexOf(".") + 1);
        } else if (uriC != null && !TextUtils.isEmpty(uriC.getPath())) {
            strSubstring = uriC.getPath().substring(uriC.getPath().lastIndexOf(".") + 1);
        } else {
            strSubstring = "";
        }
        strSubstring.hashCode();
        int iHashCode = strSubstring.hashCode();
        if (iHashCode != 102575) {
            if (iHashCode != 106314) {
                if (iHashCode == 114665 && strSubstring.equals(NavigationFileParser.TCX)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strSubstring.equals(NavigationFileParser.KML)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strSubstring.equals("gpx")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            str = "application/gpx+xml";
        } else if (b2 == 1) {
            str = "application/vnd.google-earth.kml+xml";
        } else if (b2 == 2) {
            str = "application/vnd.garmin.tcx+xml";
        } else {
            str = "*/*";
        }
        d(uriC, str);
    }

    private void d(Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        Intent intentCreateChooser = Intent.createChooser(intent, BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_share));
        intentCreateChooser.addFlags(268435456);
        intentCreateChooser.setFlags(1);
        intentCreateChooser.setFlags(2);
        try {
            this.f45726c.startActivity(intentCreateChooser);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Share_SystemShareInteractors", "systemShareFile err: ActivityNotFoundException");
        }
    }

    private void e(String str) {
        c();
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("Share_SystemShareInteractors", "imgPath is invalid");
            return;
        }
        this.d = str;
        File file = new File(str);
        LogUtil.a("Share_SystemShareInteractors", "file length = ", Long.valueOf(file.length()));
        if (!file.exists()) {
            LogUtil.a("Share_SystemShareInteractors", "SystemShare", "share() file not exists()");
            return;
        }
        Uri uriA = Uri.EMPTY;
        try {
            if (this.f45725b) {
                String strInsertImage = MediaStore.Images.Media.insertImage(this.f45726c.getContentResolver(), file.getCanonicalPath(), "health_system_share_tmp.jpg", (String) null);
                if (strInsertImage != null) {
                    uriA = Uri.parse(strInsertImage);
                } else {
                    LogUtil.e("Share_SystemShareInteractors", "cache image insert failed");
                }
            } else {
                uriA = pnq.a(this.f45726c, file);
            }
        } catch (IOException | IllegalArgumentException unused) {
            LogUtil.e("Share_SystemShareInteractors", "cache image failed");
        }
        if (uriA == null || uriA == Uri.EMPTY) {
            LogUtil.e("Share_SystemShareInteractors", "get imgUri failed");
            return;
        }
        this.e = uriA;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(Constants.IMAGE_TYPE);
        intent.putExtra("android.intent.extra.STREAM", this.e);
        Intent intentCreateChooser = Intent.createChooser(intent, BaseApplication.getContext().getString(R.string.IDS_plugin_socialshare_share));
        intentCreateChooser.addFlags(268435456);
        intentCreateChooser.setFlags(1);
        intentCreateChooser.setFlags(2);
        try {
            this.f45726c.startActivity(intentCreateChooser);
        } catch (ActivityNotFoundException unused2) {
            LogUtil.e("Share_SystemShareInteractors", "systemShareImage err: ActivityNotFoundException");
        }
    }

    private void c() {
        if (this.e != Uri.EMPTY) {
            if (this.f45725b) {
                pnq.c(this.f45726c, this.e);
            }
            this.e = Uri.EMPTY;
        }
        if (!this.f45724a || TextUtils.isEmpty(this.d)) {
            return;
        }
        pnq.c(this.d);
        this.d = "";
    }

    public void e() {
        c();
    }
}
