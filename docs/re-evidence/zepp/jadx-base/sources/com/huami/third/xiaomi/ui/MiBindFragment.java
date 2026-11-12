package com.huami.third.xiaomi.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.third.xiaomi.ui.databinding.FragmentBindXiaomiBinding;
import com.huami.thirdparty.support.viewbinding.CreateMethod;
import com.huami.thirdparty.support.viewbinding.ReflectionFragmentViewBindings;
import com.huami.thirdparty.support.viewbinding.ViewBindingProperty;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/third/xiaomi/ui/MiBindFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/huami/third/xiaomi/ui/databinding/FragmentBindXiaomiBinding;", "a", "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "b", "()Lcom/huami/third/xiaomi/ui/databinding/FragmentBindXiaomiBinding;", "binding", "<init>", "()V", "xiaomi-ui_release"}, k = 1, mv = {1, 4, 1})
public final class MiBindFragment extends Fragment {
    public static final /* synthetic */ KProperty[] c = {Reflection.property1(new PropertyReference1Impl(MiBindFragment.class, "binding", "getBinding()Lcom/huami/third/xiaomi/ui/databinding/FragmentBindXiaomiBinding;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ViewBindingProperty binding;
    private HashMap b;

    public MiBindFragment() {
        super(R.layout.fragment_bind_xiaomi);
        this.binding = ReflectionFragmentViewBindings.viewBindingFragment(this, FragmentBindXiaomiBinding.class, CreateMethod.BIND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final FragmentBindXiaomiBinding b() {
        return (FragmentBindXiaomiBinding) this.binding.getValue(this, c[0]);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.b;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        View view = (View) this.b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.b.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b().tvAuthor.setText(getString(R.string.already_author, getString(R.string.mi_account)));
    }
}
