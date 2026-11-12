package defpackage;

import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.main.export.BaseMainFragment;
import com.xiaomi.fitness.main.export.BaseMainFragmentDelegate;

/* JADX INFO: loaded from: classes9.dex */
public final class e92<VM extends AbsViewModel, VDB extends ViewDataBinding> {
    public static <VM extends AbsViewModel, VDB extends ViewDataBinding> void a(BaseMainFragment<VM, VDB> baseMainFragment, BaseMainFragmentDelegate baseMainFragmentDelegate) {
        baseMainFragment.mBaseFragmentDelegate = baseMainFragmentDelegate;
    }
}
