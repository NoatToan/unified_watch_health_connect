package com.xiaomi.hm.health.play.base;

import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\bH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0013\u001a\u00028\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/play/base/PlayBaseFragment;", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "initBinding", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "initView", "onDestroyView", "a", "Landroidx/viewbinding/ViewBinding;", "_binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "binding", "", "layoutId", "<init>", "(I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class PlayBaseFragment<T extends ViewBinding> extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private T _binding;

    public PlayBaseFragment(int i) {
        super(i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final T getBinding() {
        return this._binding;
    }

    @NotNull
    public abstract T initBinding(@NotNull View view);

    public abstract void initView();

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this._binding = (T) initBinding(view);
        initView();
    }
}
