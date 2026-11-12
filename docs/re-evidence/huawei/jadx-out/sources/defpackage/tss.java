package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;

/* JADX INFO: loaded from: classes19.dex */
public class tss {
    public static int e(short s, short s2) {
        int iC = (int) ems.c(s, s2);
        return iC <= 20 ? (iC * 100) / 30 : (int) ((((iC - 20) * 33.33f) / 40.0f) + 66.67f);
    }

    public static Bitmap b(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getHeight() == 0) {
            LogUtil.j("ExhibitionUtil", "contentView scrollView.height == 0");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static void b(RelativeLayout relativeLayout, int i) throws Throwable {
        String str;
        IllegalArgumentException e;
        ?? bitmapDrawable;
        ?? r7;
        ?? r1 = 0;
        Bitmap bitmapDecodeStream = null;
        switch (i) {
            case 100:
                str = "pic_report_cover.webp";
                break;
            case 101:
                str = "pic_report_blood_bg.webp";
                break;
            case 102:
                str = "pic_report_body_bg.webp";
                break;
            case 103:
                str = "pic_report_ecg_bg.webp";
                break;
            case 104:
                str = "pic_report_run_bg.webp";
                break;
            default:
                LogUtil.a("ExhibitionUtil", "wrong position");
                str = null;
                break;
        }
        try {
            bitmapDrawable = pee.e("exhibitioninfo", str);
            try {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(bitmapDrawable);
                    r7 = bitmapDrawable;
                } catch (Throwable th) {
                    th = th;
                    r1 = bitmapDrawable;
                    IoUtils.c(r1);
                    throw th;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                LogUtil.e("ExhibitionUtil", "setBackGround catch Exception is ", e.getMessage());
                r7 = bitmapDrawable;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            bitmapDrawable = 0;
        } catch (Throwable th2) {
            th = th2;
            IoUtils.c(r1);
            throw th;
        }
        IoUtils.c(r7);
        bitmapDrawable = new BitmapDrawable(bitmapDecodeStream);
        relativeLayout.setBackground(bitmapDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static Drawable e(int i) throws Throwable {
        String str;
        IllegalArgumentException e;
        ?? bitmapDrawable;
        ?? r6;
        ?? r2 = 0;
        Bitmap bitmapDecodeStream = null;
        if (i == 105) {
            str = "report_blood_sugar_not_limosis_bar.webp";
        } else if (i != 106) {
            LogUtil.a("ExhibitionUtil", "wrong position");
            str = null;
        } else {
            str = "report_health_seekbar_bg.png";
        }
        try {
            bitmapDrawable = pee.e("exhibitioninfo", str);
            try {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(bitmapDrawable);
                    r6 = bitmapDrawable;
                } catch (Throwable th) {
                    r2 = bitmapDrawable;
                    th = th;
                    IoUtils.c(r2);
                    throw th;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                LogUtil.e("ExhibitionUtil", "getSeekBarRule catch Exception is ", e.getMessage());
                r6 = bitmapDrawable;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            bitmapDrawable = 0;
        } catch (Throwable th2) {
            th = th2;
            IoUtils.c(r2);
            throw th;
        }
        IoUtils.c(r6);
        bitmapDrawable = new BitmapDrawable(bitmapDecodeStream);
        return bitmapDrawable;
    }
}
