package com.huami.training.ui.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.ui.common.fragmentdelegate.FragmentDelegate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\"\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/huami/training/ui/common/TrFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/training/ui/common/fragmentdelegate/FragmentDelegate;", "delegate", "", "addDelegate", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "onDestroy", "onDetach", "", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "a", "Ljava/util/Set;", "delegates", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public class TrFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Set<FragmentDelegate> delegates = new LinkedHashSet();

    public void _$_clearFindViewByIdCache() {
    }

    public final void addDelegate(@NotNull FragmentDelegate delegate) {
        this.delegates.add(delegate);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onActivityCreated(this, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onActivityResult(this, requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onAttach(this, context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onCreate(this, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onCreateView(this, inflater, container, savedInstanceState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onDestroy(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onDestroyView(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onDetach(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onHiddenChanged(this, hidden);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onPause(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onResume(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onStart(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onStop(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).onViewCreated(this, view, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Iterator<T> it2 = this.delegates.iterator();
        while (it2.hasNext()) {
            ((FragmentDelegate) it2.next()).setUserVisibleHint(this, isVisibleToUser);
        }
    }
}
