package defpackage;

import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.TextView;
import com.huawei.health.tradeservice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes32.dex */
public class ilx {
    private static long e = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    WeakReference<TextView> f37803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownTimer f37804c;
    private Handler d;

    public ilx(Handler handler, TextView textView, long j) {
        this.d = handler;
        this.f37803b = new WeakReference<>(textView);
        this.f37802a = j;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [ilx$5] */
    public void d() {
        this.f37804c = new CountDownTimer(this.f37802a, e) { // from class: ilx.5
            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (ilx.this.f37803b.get() != null) {
                    ilx.this.d.sendEmptyMessage(1103);
                }
                ilx.this.f37804c.cancel();
                ilx.this.f37804c = null;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                String str;
                String str2;
                TextView textView = ilx.this.f37803b.get();
                if (textView != null) {
                    int[] iArrB = ilx.b(j);
                    int i = iArrB[0];
                    if (i > 0) {
                        str = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, iArrB[0], UnitUtil.e(i, 1, 0)) + ilx.b(iArrB[1]) + ":" + ilx.b(iArrB[2]);
                        str2 = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_end_time), str);
                    } else {
                        str = ilx.b(iArrB[1]) + ":" + ilx.b(iArrB[2]) + ":" + ilx.b(iArrB[3]);
                        str2 = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_end_time), str);
                    }
                    ily.a(str2, str, textView, R.color.emui_accent);
                    return;
                }
                LogUtil.j("TimeUtils", "textView = null");
            }
        }.start();
    }

    public void a() {
        CountDownTimer countDownTimer = this.f37804c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f37804c = null;
        }
    }

    public static int[] b(long j) {
        int i = (int) (j / 86400000);
        long j2 = j - (((long) i) * 86400000);
        int i2 = (int) (j2 / 3600000);
        long j3 = j2 - (((long) i2) * 3600000);
        int i3 = (int) (j3 / 60000);
        return new int[]{i, i2, i3, (int) ((j3 - (((long) i3) * 60000)) / 1000)};
    }

    public static String b(int i) {
        String strE = UnitUtil.e(i, 1, 0);
        String strE2 = UnitUtil.e(0.0d, 1, 0);
        if (String.valueOf(i).length() != 1) {
            return strE;
        }
        return strE2 + strE;
    }
}
