package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.mediaprocess.VideoUtil;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.io.File;

/* JADX INFO: loaded from: classes15.dex */
public class pli {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gxt f45597a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f45598c;

    pli(Context context, gxt gxtVar) {
        this.f45598c = context;
        this.f45597a = gxtVar;
    }

    void b() {
        gxt gxtVar = this.f45597a;
        if (gxtVar == null || this.f45598c == null) {
            LogUtil.e("Share_FamilyGroupInteractors", "shareByFamilyGroup fail:mShareContent/mShareHandler/mContext is null");
            return;
        }
        int iU = gxtVar.u();
        if (iU != 0) {
            if (iU != 1) {
                if (iU != 2) {
                    if (iU != 4) {
                        if (iU == 5) {
                            LogUtil.a("Share_FamilyGroupInteractors", "SHARE_WAY_MULTI_IMG");
                            e();
                            return;
                        } else if (iU != 6) {
                            if (iU == 8 || iU == 9) {
                                LogUtil.a("Share_FamilyGroupInteractors", "SHARE_VIDEO");
                                d();
                                return;
                            } else if (iU != 13) {
                                LogUtil.e("Share_FamilyGroupInteractors", "UNKNOWN FamilyGroupWay!");
                                return;
                            }
                        }
                    }
                }
            }
            LogUtil.a("Share_FamilyGroupInteractors", "SHARE_WAY_PIC");
            e();
            return;
        }
        LogUtil.a("Share_FamilyGroupInteractors", "SHARE_WAY_TEXT");
        e(this.f45597a);
    }

    private void e(gxt gxtVar) {
        Bitmap bitmapA = a();
        ffz ffzVar = new ffz();
        ffzVar.d("link");
        ffzVar.f(gxtVar.v());
        ffzVar.j(gxtVar.p());
        ffzVar.a(gxtVar.q());
        String strE = pnq.e(this.f45598c, "linkimage.webp", bitmapA);
        ffzVar.c(strE);
        ffzVar.e(String.valueOf(pee.a(strE)));
        LogUtil.j("Share_FamilyGroupInteractors", "shareLink shareParamData: ", ffzVar.toString());
        c(ffzVar);
    }

    private void e() {
        String strE = pnq.e(this.f45598c, "shareimage.webp", a());
        ffz ffzVar = new ffz();
        ffzVar.d("image");
        ffzVar.g(strE);
        ffzVar.e(String.valueOf(pee.a(strE)));
        LogUtil.j("Share_FamilyGroupInteractors", "shareImage shareParamData: ", ffzVar.toString());
        c(ffzVar);
    }

    private Bitmap a() {
        Bitmap bitmapR;
        if (this.f45597a.r() == null || this.f45597a.r().isRecycled()) {
            LogUtil.e("Share_FamilyGroupInteractors", "ERROR getSharePicContent in getShareContentBitmap()");
            bitmapR = null;
        } else {
            bitmapR = this.f45597a.r();
        }
        return (bitmapR != null || TextUtils.isEmpty(this.f45597a.g())) ? bitmapR : BitmapFactory.decodeFile(this.f45597a.g());
    }

    private void c(ffz ffzVar) {
        ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).startFamilySpaceH5(BaseApplication.b(), ffzVar);
    }

    private void d() {
        Uri uriY;
        LogUtil.a("Share_FamilyGroupInteractors", "shareFamilyGroupVideo enter");
        if (this.f45597a.u() == 8) {
            String strX = this.f45597a.x();
            if (TextUtils.isEmpty(strX)) {
                return;
            } else {
                uriY = Uri.fromFile(new File(strX));
            }
        } else if (this.f45597a.u() == 9) {
            uriY = this.f45597a.y();
        } else {
            LogUtil.a("Share_FamilyGroupInteractors", "video uri err");
            uriY = null;
        }
        LogUtil.a("Share_FamilyGroupInteractors", "shareFamilyGroupVideo uri:", uriY != null ? uriY.getPath() : "");
        Bitmap bitmapB = VideoUtil.b(uriY);
        String strE = bitmapB != null ? pnq.e(this.f45598c, "videoimage.webp", bitmapB) : null;
        if (this.f45597a.u() == 8) {
            ffz ffzVar = new ffz();
            ffzVar.d("video");
            ffzVar.g(this.f45597a.x());
            ffzVar.c(strE);
            ffzVar.b(String.valueOf(pee.a(this.f45597a.x())));
            ffzVar.e(String.valueOf(pee.a(strE)));
            LogUtil.a("Share_FamilyGroupInteractors", "sharevideo with path");
            c(ffzVar);
        }
    }
}
