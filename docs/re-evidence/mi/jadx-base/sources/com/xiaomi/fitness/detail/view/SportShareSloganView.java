package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ood;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "sloganTxt", "timeTxt", "sportValueTxt", "", "initSloganView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "updateSloganTxt", "(Ljava/lang/String;)V", "updateSportTxt", "Lood;", "binding", "Lood;", "Landroid/widget/TextView;", "sloganTxtView", "Landroid/widget/TextView;", "timeTxtView", "sportValueTxtView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportShareSloganView extends ConstraintLayout {

    @NotNull
    private final ood binding;

    @NotNull
    private final TextView sloganTxtView;

    @NotNull
    private final TextView sportValueTxtView;

    @NotNull
    private final TextView timeTxtView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareSloganView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void initSloganView(@NotNull String sloganTxt, @NotNull String timeTxt, @NotNull String sportValueTxt) {
        Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
        Intrinsics.checkNotNullParameter(timeTxt, "timeTxt");
        Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
        this.sloganTxtView.setText(sloganTxt);
        this.sportValueTxtView.setText(sportValueTxt);
        this.timeTxtView.setText(timeTxt);
    }

    public final void updateSloganTxt(@NotNull String sloganTxt) {
        Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
        this.sloganTxtView.setText(sloganTxt);
    }

    public final void updateSportTxt(@NotNull String sportValueTxt) {
        Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
        this.sportValueTxtView.setText(sportValueTxt);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareSloganView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportShareSloganView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareSloganView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ood oodVarA0 = ood.A0(LayoutInflater.from(context), this, true);
        this.binding = oodVarA0;
        this.sloganTxtView = oodVarA0.A;
        this.timeTxtView = oodVarA0.C;
        this.sportValueTxtView = oodVarA0.B;
    }
}
