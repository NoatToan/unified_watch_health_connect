package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.UnitUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class hnn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthProgressBar f36958a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f36959c;
    private String d;
    private HealthTextView e;

    public hnn() {
        b();
    }

    private void b() {
        View viewInflate = View.inflate(BaseApplication.getContext(), R.layout.layout_progress_time, null);
        this.f36959c = viewInflate;
        this.e = (HealthTextView) viewInflate.findViewById(R.id.tv_time);
        this.f36958a = (HealthProgressBar) this.f36959c.findViewById(R.id.time_progress_bar);
        this.f36959c.setVisibility(8);
    }

    public void d(int i) {
        LogUtil.a("Suggestion_ProgressTimeViewHolder", "setTotalTime totalTime = ", Integer.valueOf(i));
        this.f36958a.setMax(i);
        this.d = UnitUtil.b(i / 1000);
    }

    public void b(int i) {
        this.f36959c.setVisibility(0);
        this.f36958a.setSecondaryProgress(i);
        String strC = c(BaseApplication.getContext(), R.string.IDS_current_total_time, UnitUtil.b(i / 1000), this.d);
        int iD = d(strC);
        int length = strC.length();
        SpannableString spannableString = new SpannableString(strC);
        qri.d(spannableString, iD, length, new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.getContext(), R.color.textColorSecondaryInverse)));
        qri.d(spannableString, iD, length, new TypefaceSpan(BaseApplication.getContext().getString(R.string.textFontFamilyRegular)));
        qri.d(spannableString, iD, length, new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.textSizeBody3)));
        this.e.setText(spannableString);
    }

    private String c(Context context, int i, Object... objArr) {
        if (context == null) {
            LogUtil.j("Suggestion_ProgressTimeViewHolder", "getString context == null");
            return "";
        }
        return String.format(context.getApplicationContext().getResources().getString(i), objArr);
    }

    private int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = Pattern.compile("/").matcher(str);
        if (matcher.find()) {
            return matcher.start();
        }
        return -1;
    }

    public void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        layoutParams.addRule(13);
        this.f36959c.setLayoutParams(layoutParams);
    }

    public void c(String str) {
        if ("NORMAL_MODE".equals(str)) {
            this.f36959c.setBackgroundResource(R.drawable.progress_time_bg);
        } else {
            this.f36959c.setBackgroundResource(R.drawable.progress_time_bg_whitle);
        }
    }

    public View c() {
        return this.f36959c;
    }

    public void a() {
        this.f36959c.postDelayed(new Runnable() { // from class: hnr
            @Override // java.lang.Runnable
            public final void run() {
                this.f36963b.e();
            }
        }, 100L);
    }

    /* synthetic */ void e() {
        this.f36959c.setVisibility(8);
    }
}
