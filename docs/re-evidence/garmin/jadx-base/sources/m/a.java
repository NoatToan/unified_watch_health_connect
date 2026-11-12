package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115421a;

    private a(Context context) {
        this.f115421a = context;
    }

    public static a a(Context context) {
        return new a(context);
    }

    public final int b() {
        Configuration configuration = this.f115421a.getResources().getConfiguration();
        int i14 = configuration.screenWidthDp;
        int i15 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i14 > 600) {
            return 5;
        }
        if (i14 > 960 && i15 > 720) {
            return 5;
        }
        if (i14 > 720 && i15 > 960) {
            return 5;
        }
        if (i14 >= 500) {
            return 4;
        }
        if (i14 > 640 && i15 > 480) {
            return 4;
        }
        if (i14 <= 480 || i15 <= 640) {
            return i14 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final int c() {
        Context context = this.f115421a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.a.f80421a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }
}
