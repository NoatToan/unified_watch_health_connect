package com.xiaomi.hm.health.play.sport;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.FragmentPlayBaseBinding;
import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.PlayViewModel;
import com.xiaomi.hm.health.play.base.PlayBaseFragment;
import com.xiaomi.hm.health.play.card.CardManager;
import com.xiaomi.hm.health.play.sport.SportFragment;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/play/sport/SportFragment;", "Lcom/xiaomi/hm/health/play/base/PlayBaseFragment;", "Lcom/xiaomi/hm/health/databinding/FragmentPlayBaseBinding;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initBinding", "", "initView", "Lcom/xiaomi/hm/health/play/card/CardManager;", "b", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/play/card/CardManager;", "cardManager", "Lcom/xiaomi/hm/health/play/PlayViewModel;", "c", "()Lcom/xiaomi/hm/health/play/PlayViewModel;", "playViewModel", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportFragment extends PlayBaseFragment<FragmentPlayBaseBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy playViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CardManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardManager invoke() {
            return new CardManager(SportFragment.this.requireContext(), SportFragment.this.requireActivity());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportFragment() {
        super(R.layout.fragment_play_base);
        this.cardManager = LazyKt__LazyJVMKt.lazy(new a());
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.sport.SportFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PlayViewModel>() { // from class: com.xiaomi.hm.health.play.sport.SportFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.PlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PlayViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PlayViewModel.class), function0, objArr);
            }
        });
    }

    private final CardManager b() {
        return (CardManager) this.cardManager.getValue();
    }

    private final PlayViewModel c() {
        return (PlayViewModel) this.playViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SportFragment sportFragment, List list) {
        sportFragment.b().updateCardUi(list, PlayTabType.SPORT);
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    public void initView() {
        LinearLayout root = getBinding().getRoot();
        RecyclerView cardContainer = b().getCardContainer();
        cardContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Unit unit = Unit.INSTANCE;
        root.addView(cardContainer);
        c().getSportLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: y97
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportFragment.d(this.a, (List) obj);
            }
        });
        c().loadSupportSorTools(PlayTabType.SPORT);
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    @NotNull
    public FragmentPlayBaseBinding initBinding(@NotNull View view) {
        return FragmentPlayBaseBinding.bind(view);
    }
}
