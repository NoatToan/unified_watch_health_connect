package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ControlItem;
import com.huawei.health.marketing.datatype.ControlPic;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class exe {
    public static void b(String str, ImageView imageView) {
        a(str, imageView, R.drawable.ic_daily_card_site);
    }

    public static void a(final String str, final ImageView imageView, int i) {
        if (str == null || str.length() == 0) {
            LogUtil.j("ViewUtil", "url is invalid");
            return;
        }
        imageView.setImageResource(i);
        imageView.setTag(false);
        LogUtil.a("ViewUtil", "loadImage  url=", str);
        ThreadPoolManager.c().execute(new Runnable() { // from class: exd
            @Override // java.lang.Runnable
            public final void run() {
                exe.d(str, imageView);
            }
        });
    }

    static /* synthetic */ void d(String str, final ImageView imageView) {
        final Drawable drawableB = qqf.b(BaseApplication.getContext(), str);
        if (drawableB != null) {
            HandlerExecutor.c(new Runnable() { // from class: exb
                @Override // java.lang.Runnable
                public final void run() {
                    exe.b(imageView, drawableB);
                }
            });
        } else {
            LogUtil.j("ViewUtil", "loadImage drawable is null");
        }
    }

    static /* synthetic */ void b(ImageView imageView, Drawable drawable) {
        LogUtil.a("ViewUtil", "loadImage success");
        imageView.setImageDrawable(drawable);
        imageView.setTag(true);
    }

    public static void e(ControlItem controlItem, ImageView imageView, boolean z) {
        if (controlItem == null || imageView == null) {
            LogUtil.j("ViewUtil", "loadPlayBtnImage controlItem or mediaButton is null");
            return;
        }
        int i = z ? R.drawable.ic_health_stop : R.drawable.ic_health_play;
        List<ControlPic> controlPicUrlList = controlItem.getControlPicUrlList();
        if (njy.e(controlPicUrlList)) {
            LogUtil.j("ViewUtil", "loadPlayBtnImage controlPics is empty");
            imageView.setImageResource(i);
            return;
        }
        String controlPicUrl = "";
        String controlPicUrl2 = controlPicUrl;
        String controlPicUrl3 = controlPicUrl2;
        String controlPicUrl4 = controlPicUrl3;
        for (ControlPic controlPic : controlPicUrlList) {
            if (controlPic.getState() == 1) {
                controlPicUrl4 = controlPic.getControlPicUrl();
            } else if (controlPic.getState() == 3) {
                controlPicUrl3 = controlPic.getControlPicUrl();
            } else if (controlPic.getState() == 2) {
                controlPicUrl = controlPic.getControlPicUrl();
            } else if (controlPic.getState() == 4) {
                controlPicUrl2 = controlPic.getControlPicUrl();
            }
        }
        String str = qqs.e(BaseApplication.getContext()) ? z ? controlPicUrl2 : controlPicUrl : "";
        if (TextUtils.isEmpty(str)) {
            if (!z) {
                controlPicUrl3 = controlPicUrl4;
            }
            str = controlPicUrl3;
        }
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("ViewUtil", "loadPlayBtnImage imgUrl:", str);
            qqf.e(str, new RequestOptions().placeholder(i), imageView);
        } else {
            imageView.setImageResource(i);
        }
    }
}
