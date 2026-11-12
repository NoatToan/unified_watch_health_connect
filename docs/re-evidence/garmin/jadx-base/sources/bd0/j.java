package bd0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;

/* JADX INFO: loaded from: classes8.dex */
public class j implements Html.ImageGetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BLEScanningActivity f17580a;

    public j(BLEScanningActivity bLEScanningActivity) {
        this.f17580a = bLEScanningActivity;
    }

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) {
        Resources resources = this.f17580a.getResources();
        int i14 = Integer.parseInt(str);
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        Drawable drawable = resources.getDrawable(i14, null);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        return drawable;
    }
}
