package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class qp2 extends BitmapFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Object f31708a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static byte[] f31709b = {-119, SettingsModule.VALUE_TYPE_FLAG, 78, 71, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 10, 26, 10};
    public static final ThreadLocal<Canvas> c = new ThreadLocal<>();
    public static final Paint d;
    public static final Pattern e;
    public static final String[] f;

    static {
        Paint paint = new Paint(1);
        d = paint;
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        e = Pattern.compile("[\u3100-ㄭㆠ-ㆺ一-鿌㐀-䶵豈-龎⼀-⿕⺀-⻳㇀-㇣ᄀ-ᇿꥠ-ꥼힰ-ퟻㄱ-ㆎ가-힣\u3040-ゟ゠-ヿㇰ-ㇿ㆐-㆟ꀀ-ꒌ꒐-꓆]");
        f = new String[]{"老师", "先生", "老板", "仔", "手机", "叔", "阿姨", "宅", "伯", "伯母", "伯父", "哥", "姐", "弟", "妹", "舅", "姑", "父", "主任", "经理", "工作", "同事", "律师", "司机", "师傅", "师父", "爷", "奶", "中介", "董", "总", "太太", "保姆", "某", "秘书", "处长", "局长", "班长", "兄", "助理"};
    }

    public static Bitmap a(Bitmap bitmap, float f2) {
        return b(bitmap, f2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap b(Bitmap bitmap, float f2, Bitmap.Config config) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        return bitmapCreateBitmap;
    }
}
