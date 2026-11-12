package defpackage;

import android.graphics.Typeface;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes8.dex */
public class gxu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36208c = lrp.g + "Thumbnail_Share.png";
    private static Typeface d;

    public static Typeface e() {
        if (d == null) {
            d = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "fonts/hw-italic.ttf");
        }
        return d;
    }
}
