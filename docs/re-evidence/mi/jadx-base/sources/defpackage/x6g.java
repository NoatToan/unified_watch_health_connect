package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes4.dex */
public class x6g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Point f38754a = new Point();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Point f38755b = new Point();
    public static final Point c = new Point();

    public static Point a(Context context) {
        Point pointC;
        Display defaultDisplay = ((WindowManager) sk1.c((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        Point point = f38754a;
        Point point2 = f38755b;
        defaultDisplay.getCurrentSizeRange(point, point2);
        Point point3 = c;
        defaultDisplay.getSize(point3);
        int dimension = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{R.attr.windowFullscreen}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        if (z && identifier > 0) {
            dimension = (int) resources.getDimension(identifier);
        }
        if (!rhh.a().g() || (pointC = rhh.a().c()) == null) {
            return point3.x < point3.y ? new Point(point.x, point2.y + dimension) : new Point(point2.x, point.y + dimension);
        }
        return pointC;
    }
}
