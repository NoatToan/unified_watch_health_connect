package com.huami.sky.ui.intro.preference;

import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.SkyItemPreferenceBinding;
import com.huami.sky.ui.intro.preference.SelectedViewHolder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/sky/ui/intro/preference/SelectedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "isSelected", "", "selectJson", "", "unSelectedImage", "", "c", "Lcom/huami/sky/ui/intro/preference/SelectEntity;", "itemData", "bind", "Lcom/huami/sky/ui/databinding/SkyItemPreferenceBinding;", "a", "Lcom/huami/sky/ui/databinding/SkyItemPreferenceBinding;", "getBinding", "()Lcom/huami/sky/ui/databinding/SkyItemPreferenceBinding;", "binding", "b", "Z", "isSingleSelect", "<init>", "(Lcom/huami/sky/ui/databinding/SkyItemPreferenceBinding;Z)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectedViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyItemPreferenceBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSingleSelect;

    public SelectedViewHolder(@NotNull SkyItemPreferenceBinding skyItemPreferenceBinding, boolean z) {
        super(skyItemPreferenceBinding.getRoot());
        this.binding = skyItemPreferenceBinding;
        this.isSingleSelect = z;
    }

    private final void c(boolean isSelected, final String selectJson, @DrawableRes int unSelectedImage) {
        if (!isSelected) {
            this.binding.selected.setImageResource(unSelectedImage);
            this.binding.dividerAnim.setVisibility(4);
        } else {
            final SkyItemPreferenceBinding skyItemPreferenceBinding = this.binding;
            skyItemPreferenceBinding.selected.post(new Runnable() { // from class: cn6
                @Override // java.lang.Runnable
                public final void run() {
                    SelectedViewHolder.d(skyItemPreferenceBinding, selectJson);
                }
            });
            skyItemPreferenceBinding.dividerAnim.post(new Runnable() { // from class: bn6
                @Override // java.lang.Runnable
                public final void run() {
                    SelectedViewHolder.e(skyItemPreferenceBinding);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SkyItemPreferenceBinding skyItemPreferenceBinding, String str) {
        skyItemPreferenceBinding.selected.setAnimation(str);
        skyItemPreferenceBinding.selected.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SkyItemPreferenceBinding skyItemPreferenceBinding) {
        skyItemPreferenceBinding.dividerAnim.setVisibility(0);
        skyItemPreferenceBinding.dividerAnim.setAnimation("sky_question_divider.json");
        skyItemPreferenceBinding.dividerAnim.playAnimation();
    }

    public final void bind(@NotNull SelectEntity itemData) {
        this.binding.content.setText(itemData.getPreferenceItem().getName());
        AppCompatImageView appCompatImageView = this.binding.desc;
        String descriptionUrl = itemData.getPreferenceItem().getDescriptionUrl();
        appCompatImageView.setVisibility(descriptionUrl == null || descriptionUrl.length() == 0 ? 8 : 0);
        if (this.isSingleSelect) {
            c(itemData.isSelected(), "sky_question_single_select.json", R.drawable.ic_sky_question_single_unselecet);
        } else {
            c(itemData.isSelected(), "sky_question_multi_select.json", R.drawable.ic_sky_question_multi_unselect);
        }
    }

    @NotNull
    public final SkyItemPreferenceBinding getBinding() {
        return this.binding;
    }
}
