package com.huami.healthlabel.ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.healthlabel.databinding.InputSelectViewBinding;
import com.huami.healthlabel.ui.custom.InputSelectView;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/huami/healthlabel/ui/custom/InputSelectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/huami/healthlabel/ui/custom/CircleView;", ViewHierarchyConstants.VIEW_KEY, "", "b", Configs.Params.RESET, "", "getSelectColor", "Lcom/huami/healthlabel/databinding/InputSelectViewBinding;", "a", "Lcom/huami/healthlabel/databinding/InputSelectViewBinding;", "binding", "Ljava/lang/String;", "targetColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class InputSelectView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InputSelectViewBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String targetColor;

    @JvmOverloads
    public InputSelectView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public InputSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ InputSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void b(final CircleView view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: of4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InputSelectView.c(this.a, view, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InputSelectView inputSelectView, CircleView circleView, View view) {
        inputSelectView.reset();
        circleView.setSelect(true);
        inputSelectView.targetColor = ColorExtKt.getBg2TextColor(circleView.getCircleColor());
    }

    private final void reset() {
        InputSelectViewBinding inputSelectViewBinding = this.binding;
        inputSelectViewBinding.inputItemBlue.setSelect(false);
        inputSelectViewBinding.inputItemGreen.setSelect(false);
        inputSelectViewBinding.inputItemOrange.setSelect(false);
        inputSelectViewBinding.inputItemPurple.setSelect(false);
        inputSelectViewBinding.inputItemRed.setSelect(false);
    }

    @NotNull
    /* JADX INFO: renamed from: getSelectColor, reason: from getter */
    public final String getTargetColor() {
        return this.targetColor;
    }

    @JvmOverloads
    public InputSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InputSelectViewBinding inputSelectViewBindingInflate = InputSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = inputSelectViewBindingInflate;
        b(inputSelectViewBindingInflate.inputItemBlue);
        b(inputSelectViewBindingInflate.inputItemGreen);
        b(inputSelectViewBindingInflate.inputItemOrange);
        b(inputSelectViewBindingInflate.inputItemPurple);
        b(inputSelectViewBindingInflate.inputItemRed);
        inputSelectViewBindingInflate.inputItemGreen.setSelect(true);
        this.targetColor = ColorExtKt.getBg2TextColor(inputSelectViewBindingInflate.inputItemGreen.getCircleColor());
    }
}
