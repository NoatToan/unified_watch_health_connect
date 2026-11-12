package com.huami.moving.sport.ui.view.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.alipay.sdk.m.x.d;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.model.HeartRateZone;
import com.huami.moving.sport.ui.R;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import java.text.DecimalFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\b0\u00101B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b0\u00102B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b0\u00103J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0010J\u001e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0018\u0010(\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/huami/moving/sport/ui/view/bar/HeartRateBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "type", "index", "", "isEllipsis", "", "a", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "time", "c", "title", "", d.o, "interval", "setInterval", "setTime", "tvProgress", "setTvProcess", "progress", "setProgress", "setContents", "Lcom/huami/mifit/sportlib/model/HeartRateZone;", "heartRateZone", "setContent", LogUtil.I, "mSeekColor", "mBgColor", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "mTitle", GoogleApiAvailabilityLight.a, "mInterval", "e", "mTime", "f", "mTvProcess", "Lcom/huami/moving/sport/ui/view/bar/ProgressBar;", "g", "Lcom/huami/moving/sport/ui/view/bar/ProgressBar;", "mProgressBar", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateBar extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mSeekColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mBgColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView mTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView mInterval;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView mTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TextView mTvProcess;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private ProgressBar mProgressBar;

    public HeartRateBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.card_heart_bar, this);
        this.mTitle = (TextView) findViewById(R.id.title);
        this.mInterval = (TextView) findViewById(R.id.interval);
        this.mTime = (TextView) findViewById(R.id.time);
        this.mTvProcess = (TextView) findViewById(R.id.tv_process);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.mProgressBar = progressBar;
        if (progressBar == null) {
            return;
        }
        progressBar.setColors(this.mSeekColor, this.mBgColor);
    }

    private final String a(int type, int index, boolean isEllipsis) {
        if (type != 0) {
            return getContext().getString(com.huami.moving.R.string.reserve_heart_range_title, Integer.valueOf(5 - index));
        }
        if (index == 0) {
            return getContext().getString(isEllipsis ? R.string.heart_ellipsis_section0 : R.string.heart_section0);
        }
        if (index == 1) {
            return getContext().getString(isEllipsis ? R.string.heart_ellipsis_section1 : R.string.heart_section1);
        }
        if (index == 2) {
            return getContext().getString(isEllipsis ? R.string.heart_ellipsis_section2 : R.string.heart_section2);
        }
        if (index == 3) {
            return getContext().getString(isEllipsis ? R.string.heart_ellipsis_section3 : R.string.heart_section3);
        }
        if (index == 4) {
            return getContext().getString(isEllipsis ? R.string.heart_ellipsis_section4 : R.string.heart_section4);
        }
        if (index != 5) {
            return "";
        }
        return getContext().getString(isEllipsis ? R.string.heart_ellipsis_section5 : R.string.heart_section5);
    }

    private final int b(int index) {
        int color = ContextCompat.getColor(getContext(), R.color.s4);
        if (index == 0) {
            return ContextCompat.getColor(getContext(), R.color.p3);
        }
        if (index == 1) {
            return ContextCompat.getColor(getContext(), R.color.s33);
        }
        if (index == 2) {
            return ContextCompat.getColor(getContext(), R.color.s20);
        }
        if (index == 3) {
            return ContextCompat.getColor(getContext(), R.color.s15);
        }
        if (index != 4) {
            return index != 5 ? color : ContextCompat.getColor(getContext(), R.color.s26);
        }
        return ContextCompat.getColor(getContext(), R.color.s25);
    }

    private final String c(Context context, float time) {
        int i;
        int i2;
        int i3 = (int) (time / 3600.0f);
        if (i3 == 0) {
            int i4 = (int) time;
            i = i4 / 60;
            i2 = i4 % 60;
        } else {
            i = (int) ((time - ((i3 * 60) * 60)) / 60.0f);
            i2 = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#00");
        if (i3 != 0) {
            String str = decimalFormat.format(Integer.valueOf(i3));
            int i5 = R.string.moving_ui_colon;
            return str + context.getString(i5) + decimalFormat.format(Integer.valueOf(i)) + context.getString(i5) + decimalFormat.format(Integer.valueOf(i2));
        }
        if (i == 0) {
            return "00" + context.getString(R.string.moving_ui_colon) + decimalFormat.format(Integer.valueOf(i2));
        }
        return decimalFormat.format(Integer.valueOf(i)) + context.getString(R.string.moving_ui_colon) + decimalFormat.format(Integer.valueOf(i2));
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setContent(int index, @NotNull HeartRateZone heartRateZone, boolean isEllipsis) {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setWidth(ViewUtils.dp2px(getContext(), 8.0f));
        }
        ProgressBar progressBar2 = this.mProgressBar;
        if (progressBar2 != null) {
            progressBar2.setColors(b(index), ContextCompat.getColor(getContext(), R.color.s4));
        }
        TextView textView = this.mTitle;
        if (textView != null) {
            textView.setText(a(heartRateZone.getZoneType(), index, isEllipsis));
        }
        TextView textView2 = this.mTvProcess;
        if (textView2 != null) {
            textView2.setText(getContext().getString(R.string.moving_ui_percent, Integer.valueOf(heartRateZone.getPercent())));
        }
        TextView textView3 = this.mInterval;
        if (textView3 != null) {
            textView3.setText(getContext().getString(R.string.reserve_heart_range_value_title, Integer.valueOf(heartRateZone.getZoneStart()), Integer.valueOf(heartRateZone.getZoneEnd())));
        }
        ProgressBar progressBar3 = this.mProgressBar;
        if (progressBar3 != null) {
            progressBar3.setProcess(heartRateZone.getPercent());
        }
        TextView textView4 = this.mTime;
        if (textView4 == null) {
            return;
        }
        textView4.setText(c(getContext(), heartRateZone.getCostTime()));
    }

    public final void setContents() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setColors(ContextCompat.getColor(getContext(), R.color.p3), ContextCompat.getColor(getContext(), R.color.s4));
        }
        ProgressBar progressBar2 = this.mProgressBar;
        if (progressBar2 != null) {
            progressBar2.setProcess(50);
        }
        TextView textView = this.mTvProcess;
        if (textView != null) {
            textView.setText("50%");
        }
        TextView textView2 = this.mInterval;
        if (textView2 != null) {
            textView2.setText("1111");
        }
        TextView textView3 = this.mTitle;
        if (textView3 != null) {
            textView3.setText("1111");
        }
        TextView textView4 = this.mTime;
        if (textView4 == null) {
            return;
        }
        textView4.setText("1111");
    }

    public final void setInterval(@NotNull String interval) {
        TextView textView = this.mInterval;
        if (textView == null) {
            return;
        }
        textView.setText(interval);
    }

    public final void setProgress(int progress) {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar == null) {
            return;
        }
        progressBar.setProcess(progress);
    }

    public final void setTime(@NotNull String time) {
        TextView textView = this.mTime;
        if (textView == null) {
            return;
        }
        textView.setText(time);
    }

    public final void setTitle(@NotNull String title) {
        TextView textView = this.mTitle;
        if (textView == null) {
            return;
        }
        textView.setText(title);
    }

    public final void setTvProcess(@NotNull String tvProgress) {
        TextView textView = this.mTvProcess;
        if (textView == null) {
            return;
        }
        textView.setText(tvProgress);
    }

    public HeartRateBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartRateBar(@NotNull Context context) {
        this(context, null);
    }
}
