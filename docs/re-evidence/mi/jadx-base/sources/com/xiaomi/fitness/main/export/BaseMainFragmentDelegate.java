package com.xiaomi.fitness.main.export;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&JB\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\u00130\u0012\"\b\b\u0000\u0010\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u001aH&J$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J0\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0003\u0018\u00010!H&J\u0012\u0010#\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH&J\"\u0010$\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010&H&¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;", "", "onAttach", "", "context", "Landroid/content/Context;", "fragment", "Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "contentView", "Landroid/view/View;", LifecycleConstantKt.ON_DESTROY, "onInflateView", "Lkotlin/Pair;", "D", "Landroidx/databinding/ViewDataBinding;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "layoutId", "", "onViewCreated", "view", "showPopupMenu", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "onMenuClickListener", "Lkotlin/Function1;", "Landroid/view/MenuItem;", "scanToAddDevice", "addDevice", "callback", "Lkotlin/Function0;", "main-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BaseMainFragmentDelegate {
    void addDevice(@Nullable FragmentActivity activity, @Nullable Function0<Unit> callback);

    void onAttach(@NotNull Context context, @NotNull BaseMainFragment<?, ?> fragment);

    void onConfigurationChanged(@NotNull Configuration newConfig, @Nullable View contentView);

    void onCreate(@Nullable Bundle savedInstanceState);

    void onDestroy();

    @NotNull
    <D extends ViewDataBinding> Pair<View, D> onInflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState, int layoutId);

    void onViewCreated(@NotNull View view, @Nullable View contentView, @Nullable Bundle savedInstanceState);

    void scanToAddDevice(@Nullable FragmentActivity activity);

    void showPopupMenu(@Nullable FragmentActivity activity, @NotNull View view, @Nullable Function1<? super MenuItem, Unit> onMenuClickListener);
}
