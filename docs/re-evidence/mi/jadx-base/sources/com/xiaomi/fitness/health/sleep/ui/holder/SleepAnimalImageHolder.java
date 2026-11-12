package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import coil.request.Disposable;
import coil.util.CoilUtils;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalImageHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.health.sleep.view.SleepAnimalShadowLayout;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.c0j;
import defpackage.iyb;
import defpackage.lpi;
import defpackage.ne5;
import defpackage.pni;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b9\u0010:J+\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!R\u0014\u0010*\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010!R\u0014\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010!R\u0014\u0010,\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010!R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalImageHolder;", "", "Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;", "currentAnimalInfo", "latestInfo", "", "origin", "", "refreshAnimalImage", "(Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;Ljava/lang/String;)V", "", "empty", "refreshViewVisible", "(Z)V", "showEmptyReportView", "()V", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "animalReport", "latestAnimalReport", "updateReport", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;Ljava/lang/String;)V", "disposeImageRequest", "Liyb;", "binding", "Liyb;", "getBinding", "()Liyb;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "tvNoReportTitle", "Landroid/widget/TextView;", "tvNoReportSubtitle", "Landroidx/appcompat/widget/AppCompatImageView;", "ivNoReportAnimal", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/RelativeLayout;", "viewNoReportShadowLayout", "Landroid/widget/RelativeLayout;", "tvHasReportAnimalType", "tvHasReportAnimalTimeRange", "tvHasReportTag", "tvHasReportAnimalDesc", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "ivHasReportAnimal", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Lcom/xiaomi/fitness/health/sleep/view/SleepAnimalShadowLayout;", "viewHasReportShadowLayout", "Lcom/xiaomi/fitness/health/sleep/view/SleepAnimalShadowLayout;", "Landroidx/appcompat/widget/AppCompatTextView;", "tvUnderstandAnimal", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcoil/request/Disposable;", "gifDispose", "Lcoil/request/Disposable;", "<init>", "(Liyb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepAnimalImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnimalImageHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalImageHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,142:1\n71#2,2:143\n*S KotlinDebug\n*F\n+ 1 SleepAnimalImageHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalImageHolder\n*L\n139#1:143,2\n*E\n"})
public final class SleepAnimalImageHolder {

    @NotNull
    private final iyb binding;
    private final Context context;

    @Nullable
    private Disposable gifDispose;

    @NotNull
    private final RoundImageView ivHasReportAnimal;

    @NotNull
    private final AppCompatImageView ivNoReportAnimal;

    @NotNull
    private final TextView tvHasReportAnimalDesc;

    @NotNull
    private final TextView tvHasReportAnimalTimeRange;

    @NotNull
    private final TextView tvHasReportAnimalType;

    @NotNull
    private final TextView tvHasReportTag;

    @NotNull
    private final TextView tvNoReportSubtitle;

    @NotNull
    private final TextView tvNoReportTitle;

    @NotNull
    private final AppCompatTextView tvUnderstandAnimal;

    @NotNull
    private final SleepAnimalShadowLayout viewHasReportShadowLayout;

    @NotNull
    private final RelativeLayout viewNoReportShadowLayout;

    public SleepAnimalImageHolder(@NotNull iyb binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.context = binding.getRoot().getContext();
        TextView tvNoReportTitle = binding.K;
        Intrinsics.checkNotNullExpressionValue(tvNoReportTitle, "tvNoReportTitle");
        this.tvNoReportTitle = tvNoReportTitle;
        TextView tvNoReportSubtitle = binding.J;
        Intrinsics.checkNotNullExpressionValue(tvNoReportSubtitle, "tvNoReportSubtitle");
        this.tvNoReportSubtitle = tvNoReportSubtitle;
        AppCompatImageView ivNoReportAnimal = binding.C;
        Intrinsics.checkNotNullExpressionValue(ivNoReportAnimal, "ivNoReportAnimal");
        this.ivNoReportAnimal = ivNoReportAnimal;
        RelativeLayout shadowNoReport = binding.E;
        Intrinsics.checkNotNullExpressionValue(shadowNoReport, "shadowNoReport");
        this.viewNoReportShadowLayout = shadowNoReport;
        TextView tvHasReportAnimalType = binding.G;
        Intrinsics.checkNotNullExpressionValue(tvHasReportAnimalType, "tvHasReportAnimalType");
        this.tvHasReportAnimalType = tvHasReportAnimalType;
        TextView tvHasReportTimeRange = binding.I;
        Intrinsics.checkNotNullExpressionValue(tvHasReportTimeRange, "tvHasReportTimeRange");
        this.tvHasReportAnimalTimeRange = tvHasReportTimeRange;
        TextView tvHasReportTag = binding.H;
        Intrinsics.checkNotNullExpressionValue(tvHasReportTag, "tvHasReportTag");
        this.tvHasReportTag = tvHasReportTag;
        TextView tvHasReportAnimalDesc = binding.F;
        Intrinsics.checkNotNullExpressionValue(tvHasReportAnimalDesc, "tvHasReportAnimalDesc");
        this.tvHasReportAnimalDesc = tvHasReportAnimalDesc;
        RoundImageView ivHasReportAnimal = binding.B;
        Intrinsics.checkNotNullExpressionValue(ivHasReportAnimal, "ivHasReportAnimal");
        this.ivHasReportAnimal = ivHasReportAnimal;
        SleepAnimalShadowLayout shadowHasReport = binding.D;
        Intrinsics.checkNotNullExpressionValue(shadowHasReport, "shadowHasReport");
        this.viewHasReportShadowLayout = shadowHasReport;
        AppCompatTextView tvUnderstandAnimal = binding.L;
        Intrinsics.checkNotNullExpressionValue(tvUnderstandAnimal, "tvUnderstandAnimal");
        this.tvUnderstandAnimal = tvUnderstandAnimal;
    }

    private final void refreshAnimalImage(AnimalInfo currentAnimalInfo, AnimalInfo latestInfo, String origin) {
        refreshViewVisible(false);
        this.tvHasReportTag.setText(this.context.getString((!Intrinsics.areEqual(origin, "animal_detecting") || currentAnimalInfo == null) ? c0j.md : c0j.vd));
        if (currentAnimalInfo == null) {
            currentAnimalInfo = latestInfo;
        }
        if (currentAnimalInfo == null) {
            return;
        }
        final int type = currentAnimalInfo.getType();
        this.tvHasReportAnimalType.setText(this.context.getString(SleepAnimalExtKt.getSleepAnimalTypeStringRes(type)));
        this.tvHasReportAnimalDesc.setText(this.context.getString(SleepAnimalExtKt.getSleepAnimalIntroductionStringRes(type)));
        this.viewHasReportShadowLayout.updateShadowColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalShadowColor(type)));
        this.ivHasReportAnimal.setMInnerStrokeColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalStrokeColor(type)));
        this.ivHasReportAnimal.setImageResource(SleepAnimalExtKt.getSleepAnimalDrawableRes(type));
        String string = this.context.getString(c0j.m);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView = this.tvHasReportAnimalTimeRange;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        long j = 1000;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{TimeUtils.formatDate(string, Long.valueOf(currentAnimalInfo.getStartTime() * j)), TimeUtils.formatDate(string, Long.valueOf(currentAnimalInfo.getEndTime() * j))}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        this.tvUnderstandAnimal.setOnClickListener(new View.OnClickListener() { // from class: jgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAnimalImageHolder.refreshAnimalImage$lambda$0(type, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshAnimalImage$lambda$0(int i, View view) {
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepAnimalUrl(i), null, false, false, null, false, null, false, 254, null);
        SleepTrackHelper.INSTANCE.trackSleepAnimalReportUnderstandAnimalClick();
    }

    private final void refreshViewVisible(boolean empty) {
        ViewExtKt.setVisible(this.tvNoReportTitle, empty);
        ViewExtKt.setVisible(this.tvNoReportSubtitle, empty);
        ViewExtKt.setVisible(this.ivNoReportAnimal, empty);
        ViewExtKt.setVisible(this.viewNoReportShadowLayout, empty);
        ViewExtKt.setVisible(this.tvHasReportAnimalType, !empty);
        ViewExtKt.setVisible(this.tvHasReportAnimalTimeRange, !empty);
        ViewExtKt.setVisible(this.tvHasReportAnimalDesc, !empty);
        ViewExtKt.setVisible(this.tvHasReportTag, !empty);
        ViewExtKt.setVisible(this.ivHasReportAnimal, !empty);
        ViewExtKt.setVisible(this.viewHasReportShadowLayout, !empty);
    }

    private final void showEmptyReportView() {
        refreshViewVisible(true);
        String string = this.context.getString(c0j.gf);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(c0j.ff, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string2);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default;
        Typeface font = this.context.getResources().getFont(lpi.e);
        if (font != null) {
            spannableString.setSpan(new ne5(font), iIndexOf$default, length, 17);
        }
        this.tvNoReportSubtitle.setText(spannableString);
        this.gifDispose = SleepAnimalExtKt.showGifImage(this.ivNoReportAnimal, SleepAnimalExtKt.SLEEP_ANIMAL_LOADING_ANIMATION_MIDDLE_WEBP_URL, pni.l1);
        this.tvUnderstandAnimal.setOnClickListener(new View.OnClickListener() { // from class: kgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAnimalImageHolder.showEmptyReportView$lambda$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEmptyReportView$lambda$1(View view) {
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepAnimalUrl(0), null, false, false, null, false, null, false, 254, null);
        SleepTrackHelper.INSTANCE.trackSleepAnimalReportUnderstandAnimalClick();
    }

    public final void disposeImageRequest() {
        CoilUtils.dispose(this.ivNoReportAnimal);
        Disposable disposable = this.gifDispose;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @NotNull
    public final iyb getBinding() {
        return this.binding;
    }

    public final void updateReport(@Nullable SleepAnimalReport animalReport, @Nullable SleepAnimalReport latestAnimalReport, @NotNull String origin) {
        AnimalInfo animal;
        Intrinsics.checkNotNullParameter(origin, "origin");
        if (animalReport == null || (animal = animalReport.getAnimal()) == null) {
            animal = latestAnimalReport != null ? latestAnimalReport.getAnimal() : null;
        }
        if (animal == null) {
            showEmptyReportView();
        } else {
            refreshAnimalImage(animalReport != null ? animalReport.getAnimal() : null, latestAnimalReport != null ? latestAnimalReport.getAnimal() : null, origin);
        }
    }
}
