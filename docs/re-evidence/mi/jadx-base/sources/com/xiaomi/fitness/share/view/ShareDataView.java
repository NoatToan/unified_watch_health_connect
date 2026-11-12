package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.rz5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/share/view/ShareDataView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "nameView", "valueView", "Lrz5;", "model", "", "setItem", "(Landroid/widget/TextView;Landroid/widget/TextView;Lrz5;)V", "", "list", "bindData", "(Ljava/util/List;)V", "name1View", "Landroid/widget/TextView;", "getName1View", "()Landroid/widget/TextView;", "setName1View", "(Landroid/widget/TextView;)V", "name2View", "getName2View", "setName2View", "name3View", "getName3View", "setName3View", "value1View", "getValue1View", "setValue1View", "value2View", "getValue2View", "setValue2View", "value3View", "getValue3View", "setValue3View", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareDataView extends ConstraintLayout {

    @NotNull
    private TextView name1View;

    @NotNull
    private TextView name2View;

    @NotNull
    private TextView name3View;

    @NotNull
    private TextView value1View;

    @NotNull
    private TextView value2View;

    @NotNull
    private TextView value3View;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareDataView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setItem(TextView nameView, TextView valueView, rz5 model) {
        if (model.b()) {
            ViewExtKt.invisible(nameView);
            ViewExtKt.invisible(valueView);
        } else {
            nameView.setText(model.f33082b);
            if (model.a()) {
                valueView.setTextDirection(3);
            }
            valueView.setText(model.d);
        }
    }

    public final void bindData(@NotNull List<rz5> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = list.size();
        if (size == 0) {
            return;
        }
        setItem(this.name1View, this.value1View, list.get(0));
        if (size > 1) {
            setItem(this.name2View, this.value2View, list.get(1));
        }
        if (size > 2) {
            setItem(this.name3View, this.value3View, list.get(2));
        }
    }

    @NotNull
    public final TextView getName1View() {
        return this.name1View;
    }

    @NotNull
    public final TextView getName2View() {
        return this.name2View;
    }

    @NotNull
    public final TextView getName3View() {
        return this.name3View;
    }

    @NotNull
    public final TextView getValue1View() {
        return this.value1View;
    }

    @NotNull
    public final TextView getValue2View() {
        return this.value2View;
    }

    @NotNull
    public final TextView getValue3View() {
        return this.value3View;
    }

    public final void setName1View(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.name1View = textView;
    }

    public final void setName2View(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.name2View = textView;
    }

    public final void setName3View(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.name3View = textView;
    }

    public final void setValue1View(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.value1View = textView;
    }

    public final void setValue2View(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.value2View = textView;
    }

    public final void setValue3View(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.value3View = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareDataView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareDataView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(ivi.W0, (ViewGroup) this, true);
        this.name1View = (TextView) viewInflate.findViewById(bsi.C4);
        this.name2View = (TextView) viewInflate.findViewById(bsi.D4);
        this.name3View = (TextView) viewInflate.findViewById(bsi.E4);
        this.value1View = (TextView) viewInflate.findViewById(bsi.Q9);
        this.value2View = (TextView) viewInflate.findViewById(bsi.R9);
        this.value3View = (TextView) viewInflate.findViewById(bsi.S9);
    }

    public /* synthetic */ ShareDataView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
