package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.market.comment.MarketCommentDialog;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class fws {
    private static volatile fws d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f34651c;

    private fws(Context context) {
        this.f34651c = context.getApplicationContext();
    }

    public static fws c(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new fws(context);
                }
            }
        }
        return d;
    }

    public void e(Context context) {
        LogUtil.a("MarketMgr", "enter showMarektCommentDialog");
        if (context == null) {
            LogUtil.j("MarketMgr", "context is null");
            return;
        }
        if (!d()) {
            LogUtil.j("MarketMgr", "should not show");
            return;
        }
        MarketCommentDialog marketCommentDialog = new MarketCommentDialog(context);
        if (Utils.o()) {
            LogUtil.a("MarketMgr", "isOversea");
            if (lsj.a(this.f34651c, "com.huawei.appmarket")) {
                marketCommentDialog.d();
                fwy.e(this.f34651c).c();
                return;
            }
            return;
        }
        LogUtil.a("MarketMgr", "isNotOversea");
        if (lsj.c(this.f34651c, "com.huawei.appmarket")) {
            marketCommentDialog.d();
            fwy.e(this.f34651c).a();
        }
    }

    public void c(Context context, long j, int i) {
        LogUtil.a("MarketMgr", "fromTrack_trackTime ", Long.valueOf(j), "trackDis ", Integer.valueOf(i));
        if (i > 3000 || j > 1800000) {
            e(context);
        }
    }

    private boolean d() {
        long j;
        if (!CommonUtil.ab(this.f34651c.getApplicationContext()) || Utils.i()) {
            LogUtil.a("MarketMgr", "Network is not Connected");
            return false;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isKoreaCountry()) {
            return false;
        }
        String strE = Utils.o() ? "1" : SharedPreferenceManager.e(this.f34651c, Integer.toString(10000), "market_comment_status");
        try {
            j = Long.parseLong(SharedPreferenceManager.e(this.f34651c, Integer.toString(10000), "market_comment_time"));
        } catch (NumberFormatException unused) {
            LogUtil.e("MarketMgr", "parseLong Exception shouldShow Exception");
            j = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        LogUtil.a("MarketMgr", "MarketCommentCloud_shouldShow() commentStatus ", strE, " spaceTime", Long.valueOf(jCurrentTimeMillis), "lastShowTime ", Long.valueOf(j));
        return jCurrentTimeMillis > 31536000000L && "1".equals(strE);
    }
}
