package com.huami.sleepassistant.lib.ui.base.fragmentdelegate;

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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u001b\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0001J\u001b\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001J/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J#\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001J\u001a\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010%\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001aH\u0016J\b\u0010&\u001a\u00020\tH&R\u0016\u0010)\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/fragmentdelegate/LoadDataOnVisibleOnce;", "Lcom/huami/sleepassistant/lib/ui/base/fragmentdelegate/FragmentDelegate;", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onDestroy", "onDestroyView", "onDetach", "", "hidden", "onHiddenChanged", "onPause", "onResume", "onStart", "onStop", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "isVisibleToUser", "setUserVisibleHint", "loadDataOnVisibleOnce", "b", "Z", "hasNotLoaded", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class LoadDataOnVisibleOnce implements FragmentDelegate {
    private final /* synthetic */ DummyFragmentDelegate a = new DummyFragmentDelegate();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean hasNotLoaded = true;

    public abstract void loadDataOnVisibleOnce();

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onActivityCreated(@NotNull Fragment fragment, @Nullable Bundle savedInstanceState) {
        if (this.hasNotLoaded && fragment.getUserVisibleHint()) {
            this.hasNotLoaded = false;
            loadDataOnVisibleOnce();
        }
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onActivityResult(@NotNull Fragment fragment, int requestCode, int resultCode, @Nullable Intent data) {
        this.a.onActivityResult(fragment, requestCode, resultCode, data);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onAttach(@NotNull Fragment fragment, @Nullable Context context) {
        this.a.onAttach(fragment, context);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onCreate(@NotNull Fragment fragment, @Nullable Bundle savedInstanceState) {
        this.a.onCreate(fragment, savedInstanceState);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    @Nullable
    public View onCreateView(@NotNull Fragment fragment, @NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return this.a.onCreateView(fragment, inflater, container, savedInstanceState);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onDestroy(@NotNull Fragment fragment) {
        this.a.onDestroy(fragment);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onDestroyView(@NotNull Fragment fragment) {
        this.a.onDestroyView(fragment);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onDetach(@NotNull Fragment fragment) {
        this.a.onDetach(fragment);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onHiddenChanged(@NotNull Fragment fragment, boolean hidden) {
        this.a.onHiddenChanged(fragment, hidden);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onPause(@NotNull Fragment fragment) {
        this.a.onPause(fragment);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onResume(@NotNull Fragment fragment) {
        this.a.onResume(fragment);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onStart(@NotNull Fragment fragment) {
        this.a.onStart(fragment);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onStop(@NotNull Fragment fragment) {
        this.a.onStop(fragment);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void onViewCreated(@NotNull Fragment fragment, @NotNull View view, @Nullable Bundle savedInstanceState) {
        this.a.onViewCreated(fragment, view, savedInstanceState);
    }

    @Override // com.huami.sleepassistant.lib.ui.base.fragmentdelegate.FragmentDelegate
    public void setUserVisibleHint(@NotNull Fragment fragment, boolean isVisibleToUser) {
        if (this.hasNotLoaded && fragment.getView() != null && isVisibleToUser) {
            this.hasNotLoaded = false;
            loadDataOnVisibleOnce();
        }
    }
}
