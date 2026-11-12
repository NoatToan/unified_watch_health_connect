package com.xiaomi.fitness.health.vitality;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010&\u001a\u00020'H\u0014J\u0010\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*J\u000e\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020*H\u0003J\u0006\u00100\u001a\u00020'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u0010\u0010%\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/health/vitality/VitalityProgressView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "layoutPaiProgress", "getLayoutPaiProgress", "()Landroid/widget/LinearLayout;", "setLayoutPaiProgress", "(Landroid/widget/LinearLayout;)V", "tvTargetDisparity", "Landroid/widget/TextView;", "getTvTargetDisparity", "()Landroid/widget/TextView;", "setTvTargetDisparity", "(Landroid/widget/TextView;)V", "tvVitalitySuggest", "getTvVitalitySuggest", "setTvVitalitySuggest", "pbTargetStep1", "Landroid/widget/ProgressBar;", "getPbTargetStep1", "()Landroid/widget/ProgressBar;", "setPbTargetStep1", "(Landroid/widget/ProgressBar;)V", "pbTargetStep2", "getPbTargetStep2", "setPbTargetStep2", "pbTargetStep3", "getPbTargetStep3", "setPbTargetStep3", "pbTargetStep4", "getPbTargetStep4", "setPbTargetStep4", "mContext", "onFinishInflate", "", "updateVitalityGoalData", "today", "Lcom/xiaomi/fitness/health/vitality/VitalityEntry;", "setVisible", "visibility", "", "displayPaiTarget", "vitalityItem", "bindHeadEmptyData", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VitalityProgressView extends LinearLayout {

    @Nullable
    private LinearLayout layoutPaiProgress;

    @Nullable
    private Context mContext;

    @Nullable
    private ProgressBar pbTargetStep1;

    @Nullable
    private ProgressBar pbTargetStep2;

    @Nullable
    private ProgressBar pbTargetStep3;

    @Nullable
    private ProgressBar pbTargetStep4;

    @Nullable
    private TextView tvTargetDisparity;

    @Nullable
    private TextView tvVitalitySuggest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VitalityProgressView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mContext = context;
        LayoutInflater.from(context).inflate(jui.n2, this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[PHI: r2
      0x002d: PHI (r2v10 int) = (r2v1 int), (r2v2 int), (r2v3 int) binds: [B:15:0x002b, B:18:0x0031, B:21:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @SuppressLint({"StringFormatMatches"})
    private final void displayPaiTarget(VitalityEntry vitalityItem) {
        int i;
        int totalVitality = vitalityItem.getTotalVitality();
        if (vitalityItem.getDailyVitality() >= 80) {
            TextView textView = this.tvTargetDisparity;
            if (textView != null) {
                textView.setText(c0j.to);
            }
            TextView textView2 = this.tvVitalitySuggest;
            if (textView2 != null) {
                textView2.setText("");
            }
            TextView textView3 = this.tvVitalitySuggest;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        int i2 = 30;
        if (totalVitality < 30) {
            i = i2 - totalVitality;
        } else {
            i2 = 60;
            if (totalVitality < 60) {
                i = i2 - totalVitality;
            } else {
                i2 = 100;
                if (totalVitality < 100) {
                    i = i2 - totalVitality;
                } else {
                    i = -1;
                }
            }
        }
        if (i == -1) {
            TextView textView4 = this.tvTargetDisparity;
            if (textView4 != null) {
                textView4.setText(getContext().getString(c0j.so));
            }
            TextView textView5 = this.tvVitalitySuggest;
            if (textView5 != null) {
                textView5.setText("");
            }
            TextView textView6 = this.tvVitalitySuggest;
            if (textView6 != null) {
                textView6.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView7 = this.tvTargetDisparity;
        if (textView7 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView7.setText(ResourceExtKt.getQuantityString(context, qxi.D1, i, Integer.valueOf(i)));
        }
        if (vitalityItem.getSuggestSportType() != 1 || vitalityItem.getSuggestVitality() == 0) {
            TextView textView8 = this.tvVitalitySuggest;
            if (textView8 != null) {
                textView8.setVisibility(8);
                return;
            }
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String quantityString = ResourceExtKt.getQuantityString(context2, qxi.C1, vitalityItem.getSuggestVitality(), Integer.valueOf(vitalityItem.getSuggestVitality()));
        UserProfile.RecordMaxHrm recordMaxHrm = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getRecordMaxHrm();
        String string = getContext().getString(c0j.E8, Integer.valueOf((int) (((double) (recordMaxHrm != null ? recordMaxHrm.getHrm() : 0)) * 0.77d)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView9 = this.tvVitalitySuggest;
        if (textView9 != null) {
            textView9.setText(getContext().getString(c0j.Bo, quantityString, string));
        }
        TextView textView10 = this.tvVitalitySuggest;
        if (textView10 != null) {
            textView10.setVisibility(0);
        }
    }

    public final void bindHeadEmptyData() {
        TextView textView = this.tvTargetDisparity;
        if (textView != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setText(ResourceExtKt.getQuantityString(context, qxi.D1, 30, 30));
        }
        TextView textView2 = this.tvVitalitySuggest;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    @Nullable
    public final LinearLayout getLayoutPaiProgress() {
        return this.layoutPaiProgress;
    }

    @Nullable
    public final ProgressBar getPbTargetStep1() {
        return this.pbTargetStep1;
    }

    @Nullable
    public final ProgressBar getPbTargetStep2() {
        return this.pbTargetStep2;
    }

    @Nullable
    public final ProgressBar getPbTargetStep3() {
        return this.pbTargetStep3;
    }

    @Nullable
    public final ProgressBar getPbTargetStep4() {
        return this.pbTargetStep4;
    }

    @Nullable
    public final TextView getTvTargetDisparity() {
        return this.tvTargetDisparity;
    }

    @Nullable
    public final TextView getTvVitalitySuggest() {
        return this.tvVitalitySuggest;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.layoutPaiProgress = (LinearLayout) findViewById(eri.R9);
        this.tvTargetDisparity = (TextView) findViewById(eri.am);
        this.tvVitalitySuggest = (TextView) findViewById(eri.Zl);
        this.pbTargetStep1 = (ProgressBar) findViewById(eri.xc);
        this.pbTargetStep2 = (ProgressBar) findViewById(eri.yc);
        this.pbTargetStep3 = (ProgressBar) findViewById(eri.zc);
        this.pbTargetStep4 = (ProgressBar) findViewById(eri.Ac);
    }

    public final void setLayoutPaiProgress(@Nullable LinearLayout linearLayout) {
        this.layoutPaiProgress = linearLayout;
    }

    public final void setPbTargetStep1(@Nullable ProgressBar progressBar) {
        this.pbTargetStep1 = progressBar;
    }

    public final void setPbTargetStep2(@Nullable ProgressBar progressBar) {
        this.pbTargetStep2 = progressBar;
    }

    public final void setPbTargetStep3(@Nullable ProgressBar progressBar) {
        this.pbTargetStep3 = progressBar;
    }

    public final void setPbTargetStep4(@Nullable ProgressBar progressBar) {
        this.pbTargetStep4 = progressBar;
    }

    public final void setTvTargetDisparity(@Nullable TextView textView) {
        this.tvTargetDisparity = textView;
    }

    public final void setTvVitalitySuggest(@Nullable TextView textView) {
        this.tvVitalitySuggest = textView;
    }

    public final void setVisible(int visibility) {
        setVisibility(visibility);
        LinearLayout linearLayout = this.layoutPaiProgress;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.setVisibility(visibility);
    }

    public final void updateVitalityGoalData(@Nullable VitalityEntry today) {
        if (today == null) {
            setVisible(8);
            return;
        }
        if (!TimeDateUtil.isToday(today.timestamp)) {
            setVisible(8);
            return;
        }
        int totalVitality = today.getTotalVitality();
        setVisible(0);
        displayPaiTarget(today);
        int i = totalVitality - 30;
        int i2 = totalVitality - 60;
        int i3 = totalVitality - 100;
        ProgressBar progressBar = this.pbTargetStep1;
        Intrinsics.checkNotNull(progressBar);
        progressBar.setProgress(totalVitality);
        ProgressBar progressBar2 = this.pbTargetStep2;
        Intrinsics.checkNotNull(progressBar2);
        progressBar2.setProgress(i);
        ProgressBar progressBar3 = this.pbTargetStep3;
        Intrinsics.checkNotNull(progressBar3);
        progressBar3.setProgress(i2);
        ProgressBar progressBar4 = this.pbTargetStep4;
        Intrinsics.checkNotNull(progressBar4);
        progressBar4.setProgress(i3);
    }
}
