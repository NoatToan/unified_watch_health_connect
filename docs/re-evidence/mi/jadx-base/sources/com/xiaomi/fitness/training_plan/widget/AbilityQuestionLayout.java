package com.xiaomi.fitness.training_plan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.training_plan.widget.AbilityQuestionLayout;
import com.xiaomi.fitness.training_plan_export.model.Question;
import com.xiaomi.fitness.training_plan_export.model.QuestionOption;
import defpackage.csi;
import defpackage.eki;
import defpackage.ioi;
import defpackage.jvi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\nH\u0002J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityQuestionLayout;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "question", "Lcom/xiaomi/fitness/training_plan_export/model/Question;", "onSelectChange", "Lkotlin/Function2;", "", "", "", "<init>", "(Landroid/content/Context;Lcom/xiaomi/fitness/training_plan_export/model/Question;Lkotlin/jvm/functions/Function2;)V", "titleTV", "Landroid/widget/TextView;", "descTV", "flexLayout", "Lcom/google/android/flexbox/FlexboxLayout;", "curSelectId", "initView", "getTitleDesc", "option", "Lcom/xiaomi/fitness/training_plan_export/model/QuestionOption;", "updateItemSelectedStatus", "itemView", "selected", "", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAbilityQuestionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityQuestionLayout.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityQuestionLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,106:1\n774#2:107\n865#2,2:108\n1317#3,2:110\n*S KotlinDebug\n*F\n+ 1 AbilityQuestionLayout.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityQuestionLayout\n*L\n44#1:107\n44#1:108,2\n54#1:110,2\n*E\n"})
public final class AbilityQuestionLayout extends FrameLayout {

    @NotNull
    private static final String QUESTION_TAG = "question_item";

    @NotNull
    private final Context ctx;
    private int curSelectId;

    @Nullable
    private TextView descTV;

    @Nullable
    private FlexboxLayout flexLayout;

    @NotNull
    private final Function2<String, Integer, Unit> onSelectChange;

    @NotNull
    private final Question question;

    @Nullable
    private TextView titleTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbilityQuestionLayout(@NotNull Context ctx, @NotNull Question question, @NotNull Function2<? super String, ? super Integer, Unit> onSelectChange) {
        super(ctx, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
        this.ctx = ctx;
        this.question = question;
        this.onSelectChange = onSelectChange;
        this.curSelectId = -1;
        LayoutInflater.from(ctx).inflate(jvi.i, this);
        this.titleTV = (TextView) findViewById(csi.I3);
        this.descTV = (TextView) findViewById(csi.X);
        this.flexLayout = (FlexboxLayout) findViewById(csi.Y1);
        initView();
    }

    private final String getTitleDesc(QuestionOption option) {
        if (option == null) {
            return "";
        }
        if (!TextUtils.isEmpty(option.getSelectedDescStr())) {
            String selectedDescStr = option.getSelectedDescStr();
            Intrinsics.checkNotNull(selectedDescStr);
            return selectedDescStr;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(this.question.getDescRes());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{option.getContentRes()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final void initView() {
        TextView textView = this.titleTV;
        if (textView != null) {
            textView.setText(getContext().getString(this.question.getTitleRes()));
        }
        List<QuestionOption> options = this.question.getOptions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : options) {
            if (Intrinsics.areEqual(((QuestionOption) obj).getSelected(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        QuestionOption questionOption = (QuestionOption) arrayList.get(0);
        TextView textView2 = this.descTV;
        if (textView2 != null) {
            textView2.setText(getTitleDesc(questionOption));
        }
        for (final QuestionOption questionOption2 : this.question.getOptions()) {
            View viewInflate = LayoutInflater.from(this.ctx).inflate(jvi.j, (ViewGroup) null);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            final TextView textView3 = (TextView) viewInflate;
            textView3.setText(questionOption2.getContentRes());
            textView3.setTag(QUESTION_TAG);
            textView3.setOnClickListener(new View.OnClickListener() { // from class: rr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbilityQuestionLayout.initView$lambda$3(this.f32810a, questionOption2, textView3, view);
                }
            });
            if (Intrinsics.areEqual(questionOption2.getSelected(), Boolean.TRUE)) {
                this.curSelectId = questionOption2.getId();
                this.onSelectChange.invoke(this.question.getKey(), Integer.valueOf(questionOption2.getId()));
                updateItemSelectedStatus(textView3, true);
            } else {
                updateItemSelectedStatus(textView3, false);
            }
            FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(ExtUtilsKt.getDp(20));
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ExtUtilsKt.getDp(12);
            FlexboxLayout flexboxLayout = this.flexLayout;
            if (flexboxLayout != null) {
                flexboxLayout.addView(textView3, layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(AbilityQuestionLayout this$0, QuestionOption item, TextView textView, View view) {
        Sequence<View> children;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(textView, "$textView");
        if (this$0.curSelectId != item.getId()) {
            FlexboxLayout flexboxLayout = this$0.flexLayout;
            if (flexboxLayout != null && (children = ViewGroupKt.getChildren(flexboxLayout)) != null) {
                for (View view2 : children) {
                    if (!Intrinsics.areEqual(view2, view)) {
                        Object tag = view2.getTag();
                        if (TextUtils.equals(QUESTION_TAG, tag != null ? tag.toString() : null)) {
                            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.TextView");
                            this$0.updateItemSelectedStatus((TextView) view2, false);
                        }
                    }
                }
            }
            this$0.updateItemSelectedStatus(textView, true);
            this$0.curSelectId = item.getId();
            this$0.onSelectChange.invoke(this$0.question.getKey(), Integer.valueOf(item.getId()));
            TextView textView2 = this$0.descTV;
            if (textView2 != null) {
                textView2.setText(this$0.getTitleDesc(item));
            }
        }
    }

    private final void updateItemSelectedStatus(TextView itemView, boolean selected) {
        if (selected) {
            itemView.setBackgroundResource(ioi.o);
            itemView.setTextColor(getContext().getColor(eki.c));
        } else {
            itemView.setBackgroundResource(ioi.p);
            itemView.setTextColor(getContext().getColor(eki.d));
        }
    }
}
