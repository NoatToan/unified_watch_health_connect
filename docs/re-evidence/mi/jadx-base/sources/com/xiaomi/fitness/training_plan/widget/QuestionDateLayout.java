package com.xiaomi.fitness.training_plan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.widget.QuestionDateLayout;
import defpackage.chi;
import defpackage.csi;
import defpackage.cyi;
import defpackage.eki;
import defpackage.ioi;
import defpackage.jrk;
import defpackage.jvi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\fH\u0002J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019X\u0082.¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/QuestionDateLayout;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "title", "", "desc", "initSelectedDays", "", "", "selectedDaysChanged", "Lkotlin/Function1;", "", "min", VibrateModeSetFragment.MAX, "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;II)V", "selectedDays", "Ljava/util/ArrayList;", "titleTV", "Landroid/widget/TextView;", "descTV", "flexLayout", "Lcom/google/android/flexbox/FlexboxLayout;", "dayArray", "", "[Ljava/lang/String;", "tipString", "initView", "updateItemSelectedStatus", "itemView", "selected", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nQuestionDateLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionDateLayout.kt\ncom/xiaomi/fitness/training_plan/widget/QuestionDateLayout\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,116:1\n13423#2,2:117\n*S KotlinDebug\n*F\n+ 1 QuestionDateLayout.kt\ncom/xiaomi/fitness/training_plan/widget/QuestionDateLayout\n*L\n55#1:117,2\n*E\n"})
public final class QuestionDateLayout extends FrameLayout {

    @NotNull
    private final Context ctx;
    private String[] dayArray;

    @NotNull
    private final String desc;

    @Nullable
    private TextView descTV;

    @Nullable
    private FlexboxLayout flexLayout;

    @NotNull
    private final List<Integer> initSelectedDays;
    private final int max;
    private final int min;

    @NotNull
    private final ArrayList<Integer> selectedDays;

    @NotNull
    private final Function1<List<Integer>, Unit> selectedDaysChanged;
    private String tipString;

    @NotNull
    private final String title;

    @Nullable
    private TextView titleTV;

    public /* synthetic */ QuestionDateLayout(Context context, String str, String str2, List list, Function1 function1, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, list, function1, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 7 : i2);
    }

    private final void initView() {
        this.tipString = this.ctx.getResources().getQuantityString(cyi.e, this.max, Integer.valueOf(this.min), Integer.valueOf(this.max));
        LayoutInflater.from(this.ctx).inflate(jvi.U, this);
        this.titleTV = (TextView) findViewById(csi.I3);
        this.descTV = (TextView) findViewById(csi.X);
        this.flexLayout = (FlexboxLayout) findViewById(csi.g0);
        TextView textView = this.titleTV;
        if (textView != null) {
            textView.setText(this.title);
        }
        TextView textView2 = this.descTV;
        if (textView2 != null) {
            textView2.setText(this.desc);
        }
        this.dayArray = ResourceExtKt.getStringArray(this.ctx, chi.f5350b);
        int[] iArr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 7; i++) {
            final int i2 = iArr[i];
            final TextView textView3 = new TextView(this.ctx);
            textView3.setTextSize(15.0f);
            String[] strArr = null;
            textView3.setBackground(jrk.f(this.ctx.getResources(), ioi.d, null));
            textView3.setTextColor(ExtUtilsKt.getColor(eki.d));
            String[] strArr2 = this.dayArray;
            if (strArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dayArray");
            } else {
                strArr = strArr2;
            }
            textView3.setText(strArr[i2 - 1]);
            textView3.setGravity(17);
            textView3.setTag(Integer.valueOf(i2));
            textView3.setOnClickListener(new View.OnClickListener() { // from class: agi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuestionDateLayout.initView$lambda$3$lambda$1$lambda$0(i2, this, textView3, view);
                }
            });
            FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(ExtUtilsKt.getDp(38), ExtUtilsKt.getDp(38));
            layoutParams.setMarginEnd(ExtUtilsKt.getDp(13));
            layoutParams.setMarginEnd(ExtUtilsKt.getDp(12));
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ExtUtilsKt.getDp(12);
            if (this.initSelectedDays.contains(Integer.valueOf(i2))) {
                this.selectedDays.add(Integer.valueOf(i2));
                updateItemSelectedStatus(textView3, true);
            }
            this.selectedDaysChanged.invoke2(this.selectedDays);
            FlexboxLayout flexboxLayout = this.flexLayout;
            if (flexboxLayout != null) {
                flexboxLayout.addView(textView3, layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$1$lambda$0(int i, QuestionDateLayout this$0, TextView this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (Intrinsics.areEqual(textView.getTag(), Integer.valueOf(i))) {
                String str = null;
                if (this$0.selectedDays.contains(Integer.valueOf(i))) {
                    if (this$0.min <= 0 || this$0.selectedDays.size() - 1 >= this$0.min) {
                        this$0.selectedDays.remove(Integer.valueOf(i));
                        this$0.selectedDaysChanged.invoke2(this$0.selectedDays);
                        this$0.updateItemSelectedStatus(textView, false);
                        return;
                    } else {
                        String str2 = this$0.tipString;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tipString");
                        } else {
                            str = str2;
                        }
                        ViewExtKt.toast(this_apply, str);
                        return;
                    }
                }
                if (this$0.max <= 0 || this$0.selectedDays.size() + 1 <= this$0.max) {
                    this$0.selectedDays.add(Integer.valueOf(i));
                    this$0.selectedDaysChanged.invoke2(this$0.selectedDays);
                    this$0.updateItemSelectedStatus(textView, true);
                } else {
                    String str3 = this$0.tipString;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tipString");
                    } else {
                        str = str3;
                    }
                    ViewExtKt.toast(this_apply, str);
                }
            }
        }
    }

    private final void updateItemSelectedStatus(TextView itemView, boolean selected) {
        if (selected) {
            itemView.setBackgroundResource(ioi.c);
            itemView.setTextColor(getContext().getColor(eki.h));
        } else {
            itemView.setBackgroundResource(ioi.d);
            itemView.setTextColor(getContext().getColor(eki.d));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDateLayout(@NotNull Context ctx, @NotNull String title, @NotNull String desc, @NotNull List<Integer> initSelectedDays, @NotNull Function1<? super List<Integer>, Unit> selectedDaysChanged, int i, int i2) {
        super(ctx, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(initSelectedDays, "initSelectedDays");
        Intrinsics.checkNotNullParameter(selectedDaysChanged, "selectedDaysChanged");
        this.ctx = ctx;
        this.title = title;
        this.desc = desc;
        this.initSelectedDays = initSelectedDays;
        this.selectedDaysChanged = selectedDaysChanged;
        this.min = i;
        this.max = i2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.selectedDays = arrayList;
        initView();
        arrayList.clear();
        arrayList.addAll(initSelectedDays);
    }
}
