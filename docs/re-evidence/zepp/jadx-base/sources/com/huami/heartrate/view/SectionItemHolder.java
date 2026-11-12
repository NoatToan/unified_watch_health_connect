package com.huami.heartrate.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.heartrate.R;
import com.huami.heartrate.databinding.HeartRateSectionItemBinding;
import com.huami.heartrate.model.HeartRateSection;
import com.huami.heartrate.utils.SpannableStringKt;
import com.huami.heartrate.utils.UIUtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.ViewBindingProperty;
import com.huami.viewbindingx.viewholder.ViewHolderBindingsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/huami/heartrate/view/SectionItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "color", "Landroid/graphics/drawable/ShapeDrawable;", "a", "Lcom/huami/heartrate/model/HeartRateSection;", "heartRateSection", "", "bind", "Landroid/content/Context;", "Lcom/huami/heartrate/databinding/HeartRateSectionItemBinding;", "b", "Lcom/huami/viewbindingx/ViewBindingProperty;", "()Lcom/huami/heartrate/databinding/HeartRateSectionItemBinding;", "binding", "Landroid/view/View;", "itemView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class SectionItemHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionItemHolder.class), "binding", "getBinding()Lcom/huami/heartrate/databinding/HeartRateSectionItemBinding;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ViewBindingProperty binding;

    public SectionItemHolder(@NotNull Context context, @NotNull View view) {
        super(view);
        this.context = context;
        this.binding = ViewHolderBindingsKt.viewBinding(this, HeartRateSectionItemBinding.class);
    }

    private final ShapeDrawable a(Context context, int color) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(UIUtilsKt.dpToPx(context, 9.0f));
        shapeDrawable.setIntrinsicHeight(UIUtilsKt.dpToPx(context, 9.0f));
        shapeDrawable.getPaint().setColor(color);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        return shapeDrawable;
    }

    private final HeartRateSectionItemBinding b() {
        return (HeartRateSectionItemBinding) this.binding.getValue(this, c[0]);
    }

    public final void bind(@NotNull HeartRateSection heartRateSection) {
        HeartRateSectionItemBinding heartRateSectionItemBindingB = b();
        heartRateSectionItemBindingB.tvStart.setText(heartRateSection.getName());
        heartRateSectionItemBindingB.tvStart.setCompoundDrawablesRelativeWithIntrinsicBounds(a(this.context, heartRateSection.getColor()), (Drawable) null, (Drawable) null, (Drawable) null);
        int iSpToPx = UIUtilsKt.spToPx(this.context, 18.0f);
        heartRateSectionItemBindingB.tvEnd.setText(SpannableStringKt.getDigitsSpannableStringBuilder(heartRateSection.getTime(), ResourcesCompat.getFont(this.context, R.font.maisonneue), iSpToPx, ContextCompat.getColor(this.context, R.color.s1)));
    }
}
