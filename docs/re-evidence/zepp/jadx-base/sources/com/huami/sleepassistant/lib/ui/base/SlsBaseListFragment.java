package com.huami.sleepassistant.lib.ui.base;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0013H&R\u001d\u0010\u001d\u001a\u00020\u00198D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/SlsBaseListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroid/widget/FrameLayout;", "a", "Landroid/view/ViewGroup$LayoutParams;", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "parent", "", "initFrontFrame", "v", "initAdapter", "initLayoutManager", "initObservers", "Lcom/huami/sleepassistant/lib/ui/base/FTLog;", "Lkotlin/Lazy;", "getLog", "()Lcom/huami/sleepassistant/lib/ui/base/FTLog;", "log", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class SlsBaseListFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy log;

    /* JADX WARN: Multi-variable type inference failed */
    public SlsBaseListFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.log = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FTLog>() { // from class: com.huami.sleepassistant.lib.ui.base.SlsBaseListFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sleepassistant.lib.ui.base.FTLog, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FTLog invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(FTLog.class), qualifier, objArr);
            }
        });
    }

    private final FrameLayout a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(c());
        return frameLayout;
    }

    private final RecyclerView b(Context context) {
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutParams(c());
        recyclerView.setBackgroundColor(-1);
        initAdapter(recyclerView);
        initLayoutManager(recyclerView);
        initObservers();
        return recyclerView;
    }

    private final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final FTLog getLog() {
        return (FTLog) this.log.getValue();
    }

    public abstract void initAdapter(@NotNull RecyclerView v);

    public void initFrontFrame(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
    }

    public abstract void initLayoutManager(@NotNull RecyclerView v);

    public abstract void initObservers();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerViewB = b(inflater.getContext());
        FrameLayout frameLayoutA = a(inflater.getContext());
        frameLayoutA.addView(recyclerViewB);
        initFrontFrame(inflater, frameLayoutA);
        return frameLayoutA;
    }
}
