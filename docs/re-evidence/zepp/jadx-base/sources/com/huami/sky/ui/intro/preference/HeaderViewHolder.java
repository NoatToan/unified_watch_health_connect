package com.huami.sky.ui.intro.preference;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.SkyPreferenceHeadBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.viewbindingx.ViewBindingProperty;
import com.huami.viewbindingx.viewholder.ViewHolderBindingsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/ui/intro/preference/HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "title", "subTitle", "", "bind", "Lcom/huami/sky/ui/databinding/SkyPreferenceHeadBinding;", "a", "Lcom/huami/viewbindingx/ViewBindingProperty;", "()Lcom/huami/sky/ui/databinding/SkyPreferenceHeadBinding;", "mViewBinding", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HeaderViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeaderViewHolder.class), "mViewBinding", "getMViewBinding()Lcom/huami/sky/ui/databinding/SkyPreferenceHeadBinding;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ViewBindingProperty mViewBinding;

    public HeaderViewHolder(@NotNull View view) {
        super(view);
        this.mViewBinding = ViewHolderBindingsKt.viewBinding(this, SkyPreferenceHeadBinding.class);
        SkyExtKt.setTextColorRes(a().subTitle, R.color.s46, Double.valueOf(0.6d));
    }

    private final SkyPreferenceHeadBinding a() {
        return (SkyPreferenceHeadBinding) this.mViewBinding.getValue(this, b[0]);
    }

    public final void bind(@NotNull String title, @NotNull String subTitle) {
        a().title.setText(title);
        a().subTitle.setText(subTitle);
    }
}
