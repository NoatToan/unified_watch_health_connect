package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationAdapter;
import defpackage.ano;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jrk;
import defpackage.jui;
import defpackage.lpi;
import defpackage.pni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000512345B\u0007¢\u0006\u0004\b0\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001e\u0010-\u001a\f\u0012\b\u0012\u00060,R\u00020\u00000(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "expand", "", "handleExpandOrFoldAndNotify", "(Z)V", "reportOneTrackMapOnClick", "()V", "expandStatus", "buildUiModelList", "", "zeroBasedIndex", "", MiuiCursorConstants.CONTENT, "problemHitCount", "Landroid/text/SpannableString;", "getInterprSpannable", "(ILjava/lang/String;I)Landroid/text/SpannableString;", "getAdviceSpannable", "(Ljava/lang/String;)Landroid/text/SpannableString;", "", "interprList", "adviceList", "refreshText", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "mInterpretationList", "Ljava/util/List;", "mAdviceList", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter$UiModel;", "mUiModelList", "mExpandStatus", "Z", "<init>", "Companion", "TitleViewHolder", "TextViewHolder", "HandleViewHolder", "UiModel", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepInterpretationAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "SleepInterpretationAdapter";
    public static final int TYPE_HANDLE_ITEM = 2;
    public static final int TYPE_TEXT_ITEM = 1;
    public static final int TYPE_TITLE_ITEM = 0;
    private boolean mExpandStatus;

    @NotNull
    private final List<String> mInterpretationList = new ArrayList();

    @NotNull
    private final List<String> mAdviceList = new ArrayList();

    @NotNull
    private final List<UiModel> mUiModelList = new ArrayList();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter$HandleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "isExpandStatus", "", "bindData", "(Z)V", "Landroid/widget/TextView;", "handleTv", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HandleViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView handleTv;
        final /* synthetic */ SleepInterpretationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleViewHolder(@NotNull SleepInterpretationAdapter sleepInterpretationAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepInterpretationAdapter;
            View viewFindViewById = itemView.findViewById(eri.w5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.handleTv = (TextView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(SleepInterpretationAdapter this$0, TextView it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.mExpandStatus = !this$0.mExpandStatus;
            this$0.reportOneTrackMapOnClick();
            this$0.handleExpandOrFoldAndNotify(this$0.mExpandStatus);
            return Unit.INSTANCE;
        }

        public final void bindData(boolean isExpandStatus) {
            this.handleTv.setText(isExpandStatus ? c0j.E4 : c0j.G8);
            Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), isExpandStatus ? pni.w3 : pni.v3);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, ExtUtilsKt.getDp(14), ExtUtilsKt.getDp(9));
            }
            if (AppUtil.isRTLDirection()) {
                this.handleTv.setCompoundDrawables(resourceDrawable, null, null, null);
            } else {
                this.handleTv.setCompoundDrawables(null, null, resourceDrawable, null);
            }
            TextView textView = this.handleTv;
            final SleepInterpretationAdapter sleepInterpretationAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: hpm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepInterpretationAdapter.HandleViewHolder.bindData$lambda$0(sleepInterpretationAdapter, (TextView) obj);
                }
            }, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter$TextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/text/SpannableString;", MiuiCursorConstants.CONTENT, "", "bindData", "(Landroid/text/SpannableString;)V", "Landroid/widget/TextView;", "textTv", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TextViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView textTv;
        final /* synthetic */ SleepInterpretationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextViewHolder(@NotNull SleepInterpretationAdapter sleepInterpretationAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepInterpretationAdapter;
            View viewFindViewById = itemView.findViewById(eri.Ki);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.textTv = (TextView) viewFindViewById;
        }

        public final void bindData(@NotNull SpannableString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.textTv.setText(content);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TitleViewHolder extends RecyclerView.d0 {
        final /* synthetic */ SleepInterpretationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(@NotNull SleepInterpretationAdapter sleepInterpretationAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepInterpretationAdapter;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter$UiModel;", "", "type", "", "textSpannable", "Landroid/text/SpannableString;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationAdapter;ILandroid/text/SpannableString;)V", "getType", "()I", "getTextSpannable", "()Landroid/text/SpannableString;", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class UiModel {

        @NotNull
        private final SpannableString textSpannable;
        final /* synthetic */ SleepInterpretationAdapter this$0;
        private final int type;

        public UiModel(SleepInterpretationAdapter sleepInterpretationAdapter, @NotNull int i, SpannableString textSpannable) {
            Intrinsics.checkNotNullParameter(textSpannable, "textSpannable");
            this.this$0 = sleepInterpretationAdapter;
            this.type = i;
            this.textSpannable = textSpannable;
        }

        @NotNull
        public final SpannableString getTextSpannable() {
            return this.textSpannable;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public String toString() {
            return "UiModel(type=" + this.type + ", textSpannable='" + ((Object) this.textSpannable) + "')";
        }

        public /* synthetic */ UiModel(SleepInterpretationAdapter sleepInterpretationAdapter, int i, SpannableString spannableString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sleepInterpretationAdapter, i, (i2 & 2) != 0 ? new SpannableString("") : spannableString);
        }
    }

    private final void buildUiModelList(boolean expandStatus) {
        this.mExpandStatus = expandStatus;
        this.mUiModelList.clear();
        this.mUiModelList.add(new UiModel(this, 0, null, 2, null));
        int size = this.mInterpretationList.size();
        if (expandStatus) {
            for (int i = 0; i < size; i++) {
                this.mUiModelList.add(new UiModel(this, 1, getInterprSpannable(i, this.mInterpretationList.get(i), size)));
                this.mUiModelList.add(new UiModel(this, 1, getAdviceSpannable(this.mAdviceList.get(i))));
            }
        } else {
            this.mUiModelList.add(new UiModel(this, 1, getInterprSpannable(0, this.mInterpretationList.get(0), size)));
        }
        this.mUiModelList.add(new UiModel(this, 2, null, 2, null));
        Logger.d(TAG, "buildUiModelList mUiModelList=" + this.mUiModelList);
    }

    private final SpannableString getAdviceSpannable(String content) {
        String string = ResourceExtKt.getString(c0j.G);
        String string2 = ResourceExtKt.getString(c0j.H, string, content);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default;
        Logger.d(TAG, "getAdviceSpannable prefixStartIn=" + iIndexOf$default + " prefixEndEx=" + length);
        SpannableString spannableString = new SpannableString(string2);
        Typeface typefaceCreate = Typeface.create(jrk.h(ApplicationExtKt.getApplication(), lpi.f25303b), 1);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(...)");
        if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(ano.a(typefaceCreate), iIndexOf$default, length, 17);
        }
        return spannableString;
    }

    private final SpannableString getInterprSpannable(int zeroBasedIndex, String content, int problemHitCount) {
        return problemHitCount == 1 ? new SpannableString(content) : new SpannableString(ResourceExtKt.getString(c0j.l9, String.valueOf(zeroBasedIndex + 1), content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void handleExpandOrFoldAndNotify(boolean expand) {
        this.mUiModelList.clear();
        buildUiModelList(expand);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportOneTrackMapOnClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.37.2.1.35836"), TuplesKt.to("name", "sleep_Interpretation_suggestions_card"), TuplesKt.to("type", Integer.valueOf(this.mExpandStatus ? 1 : 2))));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mUiModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mUiModelList.get(position).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        UiModel uiModel = this.mUiModelList.get(position);
        if (holder instanceof TextViewHolder) {
            ((TextViewHolder) holder).bindData(uiModel.getTextSpannable());
        }
        if (holder instanceof HandleViewHolder) {
            ((HandleViewHolder) holder).bindData(this.mExpandStatus);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.m5, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new TitleViewHolder(this, viewInflate);
        }
        if (viewType != 1) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jui.k5, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new HandleViewHolder(this, viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(jui.l5, parent, false);
        Intrinsics.checkNotNull(viewInflate3);
        return new TextViewHolder(this, viewInflate3);
    }

    public final void refreshText(@NotNull List<String> interprList, @NotNull List<String> adviceList) {
        Intrinsics.checkNotNullParameter(interprList, "interprList");
        Intrinsics.checkNotNullParameter(adviceList, "adviceList");
        this.mInterpretationList.clear();
        this.mInterpretationList.addAll(interprList);
        this.mAdviceList.clear();
        this.mAdviceList.addAll(adviceList);
        handleExpandOrFoldAndNotify(this.mExpandStatus);
    }
}
