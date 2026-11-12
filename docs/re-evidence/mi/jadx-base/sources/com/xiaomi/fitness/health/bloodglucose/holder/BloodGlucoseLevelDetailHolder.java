package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseLevelDetailHolder;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseLevelDetailHolder;", "", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mRootView", "dataTitleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "tvTitleDec", "Landroid/widget/TextView;", "initBloodGlucoseLevel", "", "context", "Landroid/content/Context;", "bindData", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseLevelDetailHolder {
    private DataTitleSimpleView dataTitleView;

    @NotNull
    private final View mRootView;

    @Nullable
    private TextView tvTitleDec;

    public BloodGlucoseLevelDetailHolder(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(eri.A0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        initBloodGlucoseLevel(context);
    }

    private final void initBloodGlucoseLevel(final Context context) {
        TextView textView = (TextView) this.mRootView.findViewById(eri.Kn);
        View viewFindViewById = this.mRootView.findViewById(eri.t7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.tvTitleDec = (TextView) this.mRootView.findViewById(eri.lj);
        View viewFindViewById2 = this.mRootView.findViewById(eri.D7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        ((ImageView) viewFindViewById).setImageDrawable(context.getDrawable(pni.J));
        textView.setText(c0j.B0);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: tx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseLevelDetailHolder.initBloodGlucoseLevel$lambda$0(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBloodGlucoseLevel$lambda$0(Context context, View view) {
        Intrinsics.checkNotNullParameter(context, "$context");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandBloodSugarUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), context.getString(c0j.o1), false, false, null, false, null, false, 252, null);
    }

    public final void bindData(@Nullable BloodSugarGMIAndAGPResult report) {
        TextView textView = (TextView) this.mRootView.findViewById(eri.K0);
        TextView textView2 = (TextView) this.mRootView.findViewById(eri.J0);
        LinearLayout linearLayout = (LinearLayout) this.mRootView.findViewById(eri.ua);
        LinearLayout linearLayout2 = (LinearLayout) this.mRootView.findViewById(eri.xa);
        TextView textView3 = (TextView) this.mRootView.findViewById(eri.M5);
        Float gmi = report != null ? report.getGmi() : null;
        if (gmi != null) {
            Intrinsics.checkNotNull(linearLayout);
            ViewExtKt.setVisible(linearLayout, false);
            Intrinsics.checkNotNull(textView2);
            ViewExtKt.setVisible(textView2, false);
            Intrinsics.checkNotNull(linearLayout2);
            ViewExtKt.setVisible(linearLayout2, true);
            Intrinsics.checkNotNull(textView3);
            ViewExtKt.setVisible(textView3, true);
            textView.setText(gmi.toString());
            TextView textView4 = this.tvTitleDec;
            if (textView4 != null) {
                textView4.setText(this.mRootView.getContext().getString(c0j.d0, TimeDateUtil.getDateMMddFormat(report.getStartTime()), TimeDateUtil.getDateMMddFormat(report.getEndTime())));
            }
            TextView textView5 = this.tvTitleDec;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
    }
}
