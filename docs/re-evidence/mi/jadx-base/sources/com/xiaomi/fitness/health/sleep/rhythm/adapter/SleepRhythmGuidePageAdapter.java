package com.xiaomi.fitness.health.sleep.rhythm.adapter;

import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extension.PageUtilExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmGuidePageAdapter;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmSupportDevicesFragment;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmGuideHelper;
import defpackage.c0j;
import defpackage.dih;
import defpackage.iji;
import defpackage.qge;
import defpackage.r1c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u001c\u0010\u0017\u001a\u00020\u000f2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter$GuideViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuideEntity;", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/baseui/view/BaseActivity;)V", "getDataList", "()Ljava/util/List;", "touchListener", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/OnGuideItemTouchListener;", "setOnGuideItemTouchListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "setClickAble", "Landroid/text/SpannableString;", "originalText", "", "highColorId", "onClickListener", "Lkotlin/Function0;", "GuideViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmGuidePageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmGuidePageAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,141:1\n13467#2,3:142\n*S KotlinDebug\n*F\n+ 1 SleepRhythmGuidePageAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter\n*L\n107#1:142,3\n*E\n"})
public final class SleepRhythmGuidePageAdapter extends RecyclerView.Adapter<GuideViewHolder> {

    @NotNull
    private final BaseActivity context;

    @NotNull
    private final List<SleepRhythmGuideEntity> dataList;

    @Nullable
    private OnGuideItemTouchListener touchListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter$GuideViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuideEntity;", "data", "", "updateItem", "(Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuideEntity;)V", "Lr1c;", "binding", "Lr1c;", "getBinding", "()Lr1c;", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "getScrollView", "()Landroidx/core/widget/NestedScrollView;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter;Lr1c;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepRhythmGuidePageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmGuidePageAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter$GuideViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,141:1\n54#2,3:142\n24#2:145\n57#2,6:146\n63#2,2:153\n57#3:152\n*S KotlinDebug\n*F\n+ 1 SleepRhythmGuidePageAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuidePageAdapter$GuideViewHolder\n*L\n83#1:142,3\n83#1:145\n83#1:146,6\n83#1:153,2\n83#1:152\n*E\n"})
    public final class GuideViewHolder extends RecyclerView.d0 {

        @NotNull
        private final r1c binding;

        @NotNull
        private final NestedScrollView scrollView;
        final /* synthetic */ SleepRhythmGuidePageAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GuideViewHolder(@NotNull SleepRhythmGuidePageAdapter sleepRhythmGuidePageAdapter, r1c binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = sleepRhythmGuidePageAdapter;
            this.binding = binding;
            NestedScrollView scrollView = binding.B;
            Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
            this.scrollView = scrollView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit updateItem$lambda$0(SleepRhythmGuidePageAdapter this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            dih dihVarA = dih.a();
            if (dihVarA != null) {
                PageUtilExtKt.goCommonActivity(dihVarA, this$0.context, SleepRhythmSupportDevicesFragment.class, null);
            }
            return Unit.INSTANCE;
        }

        @NotNull
        public final r1c getBinding() {
            return this.binding;
        }

        @NotNull
        public final NestedScrollView getScrollView() {
            return this.scrollView;
        }

        public final void updateItem(@NotNull SleepRhythmGuideEntity data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.binding.F.setText(data.getTitle());
            TextView tvTitle = this.binding.F;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            String title = data.getTitle();
            ViewExtKt.setVisible(tvTitle, !(title == null || StringsKt__StringsKt.isBlank(title)));
            this.binding.D.setText(data.getTitle2());
            TextView tvSecondTitle = this.binding.D;
            Intrinsics.checkNotNullExpressionValue(tvSecondTitle, "tvSecondTitle");
            String title2 = data.getTitle2();
            ViewExtKt.setVisible(tvSecondTitle, !(title2 == null || StringsKt__StringsKt.isBlank(title2)));
            this.binding.C.setText(data.getDescription2());
            TextView tvSecondSubTitle = this.binding.C;
            Intrinsics.checkNotNullExpressionValue(tvSecondSubTitle, "tvSecondSubTitle");
            CharSequence description2 = data.getDescription2();
            ViewExtKt.setVisible(tvSecondSubTitle, !(description2 == null || StringsKt__StringsKt.isBlank(description2)));
            AppCompatImageView ivImage = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(ivImage, "ivImage");
            Coil.imageLoader(ivImage.getContext()).enqueue(new ImageRequest.Builder(ivImage.getContext()).data(data.getImageUrl()).target(ivImage).build());
            if (!Intrinsics.areEqual(data.getImageUrl(), SleepRhythmGuideHelper.GUIDE_IMAGE_URI_4)) {
                this.binding.E.setText(data.getDescription());
                TextView tvSubTitle = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(tvSubTitle, "tvSubTitle");
                CharSequence description = data.getDescription();
                ViewExtKt.setVisible(tvSubTitle, !(description == null || StringsKt__StringsKt.isBlank(description)));
                return;
            }
            TextView tvSubTitle2 = this.binding.E;
            Intrinsics.checkNotNullExpressionValue(tvSubTitle2, "tvSubTitle");
            ViewExtKt.visible(tvSubTitle2);
            String string = ResourceExtKt.getString(c0j.Ui);
            TextView textView = this.binding.E;
            final SleepRhythmGuidePageAdapter sleepRhythmGuidePageAdapter = this.this$0;
            textView.setText(sleepRhythmGuidePageAdapter.setClickAble(string, iji.f21230k, new Function0() { // from class: vtm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SleepRhythmGuidePageAdapter.GuideViewHolder.updateItem$lambda$0(sleepRhythmGuidePageAdapter);
                }
            }));
            this.binding.E.setMovementMethod(qge.getInstance());
        }
    }

    public SleepRhythmGuidePageAdapter(@NotNull List<SleepRhythmGuideEntity> dataList, @NotNull BaseActivity context) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = dataList;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$0(SleepRhythmGuidePageAdapter this$0, View view, MotionEvent motionEvent) {
        OnGuideItemTouchListener onGuideItemTouchListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int action = motionEvent.getAction();
        Logger.d("SleepRhythmGuidePageAdapter", "setOnTouchListener action " + action);
        if (action == 0) {
            OnGuideItemTouchListener onGuideItemTouchListener2 = this$0.touchListener;
            if (onGuideItemTouchListener2 == null) {
                return false;
            }
            onGuideItemTouchListener2.touchDown();
            return false;
        }
        if ((action != 1 && action != 3) || (onGuideItemTouchListener = this$0.touchListener) == null) {
            return false;
        }
        onGuideItemTouchListener.touchUp();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpannableString setClickAble(String originalText, final int highColorId, final Function0<Unit> onClickListener) {
        Spanned spannedFromHtml = Html.fromHtml(originalText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        Intrinsics.checkNotNull(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmGuidePageAdapter$setClickAble$1$clickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    onClickListener.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    int i = highColorId;
                    if (i != -1) {
                        ds.setColor(ExtUtilsKt.getColor(i));
                    }
                    ds.setUnderlineText(true);
                }
            }, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            spannableString.removeSpan(uRLSpan);
        }
        return spannableString;
    }

    @NotNull
    public final List<SleepRhythmGuideEntity> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    public final void setOnGuideItemTouchListener(@NotNull OnGuideItemTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.touchListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull GuideViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.updateItem(this.dataList.get(position));
        holder.getScrollView().setOnTouchListener(new View.OnTouchListener() { // from class: utm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SleepRhythmGuidePageAdapter.onBindViewHolder$lambda$0(this.f36123a, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public GuideViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        r1c r1cVarA0 = r1c.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(r1cVarA0, "inflate(...)");
        return new GuideViewHolder(this, r1cVarA0);
    }
}
