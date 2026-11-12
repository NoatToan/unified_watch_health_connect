package com.mi.health.course.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ImageRequest;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.view.RatioImageView;
import defpackage.bli;
import defpackage.czi;
import defpackage.oqi;
import defpackage.sti;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J \u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000fH\u0002J\u0006\u0010)\u001a\u00020 R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/mi/health/course/widget/CourseInfoHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "thumbnail", "Lcom/xiaomi/fitness/widget/view/RatioImageView;", "getThumbnail", "()Lcom/xiaomi/fitness/widget/view/RatioImageView;", "setThumbnail", "(Lcom/xiaomi/fitness/widget/view/RatioImageView;)V", "diffValueTv", "Landroid/widget/TextView;", "getDiffValueTv", "()Landroid/widget/TextView;", "setDiffValueTv", "(Landroid/widget/TextView;)V", "consumeValueTv", "getConsumeValueTv", "setConsumeValueTv", "durationValueTv", "getDurationValueTv", "setDurationValueTv", "desTv", "getDesTv", "setDesTv", "imageRequestDis", "Lcoil/request/Disposable;", "findViews", "", "bindData", "allInfo", "Lcom/mi/health/course/export/data/CourseAllInfo;", "setDataView", "unit", "", "value", "view", "disposeImageRequestIfNeed", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseInfoHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseInfoHeaderView.kt\ncom/mi/health/course/widget/CourseInfoHeaderView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,109:1\n54#2,3:110\n24#2:113\n57#2,6:114\n63#2,2:121\n57#3:120\n*S KotlinDebug\n*F\n+ 1 CourseInfoHeaderView.kt\ncom/mi/health/course/widget/CourseInfoHeaderView\n*L\n73#1:110,3\n73#1:113\n73#1:114,6\n73#1:121,2\n73#1:120\n*E\n"})
public final class CourseInfoHeaderView extends Hilt_CourseInfoHeaderView {
    public TextView consumeValueTv;
    public TextView desTv;
    public TextView diffValueTv;
    public TextView durationValueTv;

    @Nullable
    private Disposable imageRequestDis;
    public RatioImageView thumbnail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseInfoHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int screenState = UIUtils.INSTANCE.getScreenState();
        LayoutInflater.from(context).inflate(screenState != 0 ? screenState != 1 ? sti.course_info_detail_header_portrait : sti.course_info_detail_header_foldable_expand : sti.course_info_detail_header_tablet_landscape, this);
        findViews();
    }

    private final void findViews() {
        setThumbnail((RatioImageView) findViewById(oqi.T0));
        setDiffValueTv((TextView) findViewById(oqi.X));
        setConsumeValueTv((TextView) findViewById(oqi.A));
        setDurationValueTv((TextView) findViewById(oqi.x1));
        setDesTv((TextView) findViewById(oqi.R));
    }

    private final void setDataView(String unit, String value, TextView view) {
        int length = value.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(value + unit);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getColor(bli.course_black)), 0, length, 17);
        view.setText(spannableStringBuilder);
    }

    public final void bindData(@NotNull CourseAllInfo allInfo) {
        Intrinsics.checkNotNullParameter(allInfo, "allInfo");
        CourseModel.CourseData basicInfo = allInfo.getBasicInfo();
        if (basicInfo == null) {
            return;
        }
        Pair<String, String> difficult = CourseExtKt.getDifficult(basicInfo);
        int calorie = CourseExtKt.getCalorie(basicInfo);
        int i = basicInfo.duration;
        setDataView(" " + ((Object) difficult.getFirst()), difficult.getSecond(), getDiffValueTv());
        setDataView(" " + ResourceExtKt.getString(czi.course_calorie_label), String.valueOf(calorie), getConsumeValueTv());
        setDataView(" " + ResourceExtKt.getString(czi.i), String.valueOf(i), getDurationValueTv());
        RatioImageView thumbnail = getThumbnail();
        CourseConfigModel.PreviewImg img = allInfo.getImg();
        String str = img != null ? img.large : null;
        ImageLoader imageLoader = Coil.imageLoader(thumbnail.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(thumbnail.getContext()).data(str).target(thumbnail);
        Unit unit = Unit.INSTANCE;
        this.imageRequestDis = imageLoader.enqueue(builderTarget.build());
        CourseConfigModel.ConfigDetail detailInfo = allInfo.getDetailInfo();
        if (detailInfo == null) {
            return;
        }
        String str2 = detailInfo.course_intro;
        if (str2 == null || str2.length() == 0) {
            ViewExtKt.gone(getDesTv());
        } else {
            ViewExtKt.visible(getDesTv());
            getDesTv().setText(str2);
        }
        TextView diffValueTv = getDiffValueTv();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ResourceExtKt.getString(czi.course_difficult));
        stringBuffer.append(",");
        stringBuffer.append(getDiffValueTv().getText());
        diffValueTv.setContentDescription(stringBuffer.toString());
        TextView consumeValueTv = getConsumeValueTv();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(ResourceExtKt.getString(czi.course_share_calorie_desc));
        stringBuffer2.append(",");
        stringBuffer2.append(getConsumeValueTv().getText());
        consumeValueTv.setContentDescription(stringBuffer2.toString());
        TextView durationValueTv = getDurationValueTv();
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(ResourceExtKt.getString(czi.course_time));
        stringBuffer3.append(",");
        stringBuffer3.append(getDurationValueTv().getText());
        durationValueTv.setContentDescription(stringBuffer3.toString());
    }

    public final void disposeImageRequestIfNeed() {
        Disposable disposable = this.imageRequestDis;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @NotNull
    public final TextView getConsumeValueTv() {
        TextView textView = this.consumeValueTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("consumeValueTv");
        return null;
    }

    @NotNull
    public final TextView getDesTv() {
        TextView textView = this.desTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("desTv");
        return null;
    }

    @NotNull
    public final TextView getDiffValueTv() {
        TextView textView = this.diffValueTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("diffValueTv");
        return null;
    }

    @NotNull
    public final TextView getDurationValueTv() {
        TextView textView = this.durationValueTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("durationValueTv");
        return null;
    }

    @NotNull
    public final RatioImageView getThumbnail() {
        RatioImageView ratioImageView = this.thumbnail;
        if (ratioImageView != null) {
            return ratioImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thumbnail");
        return null;
    }

    public final void setConsumeValueTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.consumeValueTv = textView;
    }

    public final void setDesTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.desTv = textView;
    }

    public final void setDiffValueTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.diffValueTv = textView;
    }

    public final void setDurationValueTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.durationValueTv = textView;
    }

    public final void setThumbnail(@NotNull RatioImageView ratioImageView) {
        Intrinsics.checkNotNullParameter(ratioImageView, "<set-?>");
        this.thumbnail = ratioImageView;
    }
}
