package com.huami.module.homepage.cards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.module.homepage.cards.manager.CardManager;
import com.huami.module.homepage.databinding.HomepageFragmentCardBinding;
import com.huami.module.homepage.utils.HandlerExceptionScopeKt;
import com.huami.module.ktx.NumberExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\r8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/module/homepage/cards/CardFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/huami/module/homepage/databinding/HomepageFragmentCardBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageFragmentCardBinding;", "_binding", "b", "()Lcom/huami/module/homepage/databinding/HomepageFragmentCardBinding;", "binding", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CardFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HomepageFragmentCardBinding _binding;

    /* JADX INFO: renamed from: b, reason: from getter */
    private final HomepageFragmentCardBinding get_binding() {
        return this._binding;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this._binding = HomepageFragmentCardBinding.inflate(inflater, container, false);
        return get_binding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CardManager cardManager = new CardManager(HandlerExceptionScopeKt.getLifecycleExceptionScope(this), requireActivity());
        FrameLayout frameLayout = get_binding().cardFragment;
        RecyclerView recyclerView = cardManager.getRecyclerView();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(NumberExtKt.getDp(10), NumberExtKt.getDp(12), NumberExtKt.getDp(10), NumberExtKt.getDp(12));
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(recyclerView, layoutParams);
    }
}
