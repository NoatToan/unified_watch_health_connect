package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.BodyfatDialogMatchingUserBinding;
import com.xiaomi.hm.health.bodyfat.fragment.MatchUserTipsDialog;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MatchUserTipsDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/BodyfatDialogMatchingUserBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/BodyfatDialogMatchingUserBinding;", "binding", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MatchUserTipsDialog extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private BodyfatDialogMatchingUserBinding binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MatchUserTipsDialog matchUserTipsDialog, View view) {
        matchUserTipsDialog.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        BodyfatDialogMatchingUserBinding bodyfatDialogMatchingUserBindingInflate = BodyfatDialogMatchingUserBinding.inflate(inflater);
        this.binding = bodyfatDialogMatchingUserBindingInflate;
        Objects.requireNonNull(bodyfatDialogMatchingUserBindingInflate);
        return bodyfatDialogMatchingUserBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        float screenWidth = ViewUtils.getScreenWidth(requireActivity()) - ViewUtils.dp2px(requireContext(), 30.0f);
        double d = ((double) screenWidth) * 0.6115d;
        BodyfatDialogMatchingUserBinding bodyfatDialogMatchingUserBinding = this.binding;
        Objects.requireNonNull(bodyfatDialogMatchingUserBinding);
        bodyfatDialogMatchingUserBinding.ivTips.getLayoutParams().width = (int) screenWidth;
        BodyfatDialogMatchingUserBinding bodyfatDialogMatchingUserBinding2 = this.binding;
        Objects.requireNonNull(bodyfatDialogMatchingUserBinding2);
        bodyfatDialogMatchingUserBinding2.ivTips.getLayoutParams().height = (int) d;
        if (RainbowUtils.isDarkMode(getContext())) {
            BodyfatDialogMatchingUserBinding bodyfatDialogMatchingUserBinding3 = this.binding;
            Objects.requireNonNull(bodyfatDialogMatchingUserBinding3);
            bodyfatDialogMatchingUserBinding3.ivTips.setImageResource(R.drawable.match_user_img_dark);
        } else {
            DisplayConfig.ConfigBuilder configBuilderLoad = HMImageLoader.with(this).load(R.drawable.match_user_img);
            BodyfatDialogMatchingUserBinding bodyfatDialogMatchingUserBinding4 = this.binding;
            Objects.requireNonNull(bodyfatDialogMatchingUserBinding4);
            configBuilderLoad.into(bodyfatDialogMatchingUserBinding4.ivTips);
        }
        BodyfatDialogMatchingUserBinding bodyfatDialogMatchingUserBinding5 = this.binding;
        Objects.requireNonNull(bodyfatDialogMatchingUserBinding5);
        bodyfatDialogMatchingUserBinding5.textClose.setOnClickListener(new View.OnClickListener() { // from class: kv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MatchUserTipsDialog.b(this.a, view2);
            }
        });
    }
}
