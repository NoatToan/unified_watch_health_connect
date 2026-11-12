package com.huami.message.ui.base.fragmentdelegate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J.\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J*\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¨\u0006("}, d2 = {"Lcom/huami/message/ui/base/fragmentdelegate/DummyFragmentDelegate;", "Lcom/huami/message/ui/base/fragmentdelegate/FragmentDelegate;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "onDestroy", "onDetach", "", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class DummyFragmentDelegate implements FragmentDelegate {
    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onActivityCreated(@NotNull Fragment fragment, @Nullable Bundle savedInstanceState) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onActivityResult(@NotNull Fragment fragment, int requestCode, int resultCode, @Nullable Intent data) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onAttach(@NotNull Fragment fragment, @Nullable Context context) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onCreate(@NotNull Fragment fragment, @Nullable Bundle savedInstanceState) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    @Nullable
    public View onCreateView(@NotNull Fragment fragment, @NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onDestroy(@NotNull Fragment fragment) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onDestroyView(@NotNull Fragment fragment) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onDetach(@NotNull Fragment fragment) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onHiddenChanged(@NotNull Fragment fragment, boolean hidden) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onPause(@NotNull Fragment fragment) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onResume(@NotNull Fragment fragment) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onStart(@NotNull Fragment fragment) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onStop(@NotNull Fragment fragment) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void onViewCreated(@NotNull Fragment fragment, @NotNull View view, @Nullable Bundle savedInstanceState) {
    }

    @Override // com.huami.message.ui.base.fragmentdelegate.FragmentDelegate
    public void setUserVisibleHint(@NotNull Fragment fragment, boolean isVisibleToUser) {
    }
}
