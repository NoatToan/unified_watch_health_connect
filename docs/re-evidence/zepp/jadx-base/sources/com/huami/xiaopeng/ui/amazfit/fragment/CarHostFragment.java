package com.huami.xiaopeng.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.content.Intent;
import androidx.p010navigation.NavController;
import com.huami.xiaopeng.repo.ActionToXiaoPengActivity;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.activity.CarHostActivity;
import com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/fragment/CarHostFragment;", "Lcom/huami/xiaopeng/ui/amazfit/fragment/XpBaseFragment;", "", "setViewId", "", "showTitleBar", "", "loadData", "Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "e", "Lkotlin/Lazy;", z.j, "()Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "navigationApi", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CarHostFragment extends XpBaseFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX WARN: Multi-variable type inference failed */
    public CarHostFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XpNavigationApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CarHostFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final XpNavigationApi invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(XpNavigationApi.class), qualifier, objArr);
            }
        });
    }

    private final XpNavigationApi j() {
        return (XpNavigationApi) this.navigationApi.getValue();
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void loadData() {
        Intent intent = requireActivity().getIntent();
        String stringExtra = intent.getStringExtra(CarHostActivity.XP_ACTION);
        if (Intrinsics.areEqual(stringExtra, ActionToXiaoPengActivity.Inner.getAction())) {
            if (intent.getIntExtra(CarHostActivity.XP_KEY_COUNT, 0) == 0) {
                j().hostToNoCard(getNavController());
                return;
            } else {
                j().hostToDetail(getNavController());
                return;
            }
        }
        if (Intrinsics.areEqual(stringExtra, ActionToXiaoPengActivity.BigCard.getAction()) ? true : Intrinsics.areEqual(stringExtra, ActionToXiaoPengActivity.KeyCard.getAction())) {
            XpNavigationApi xpNavigationApiJ = j();
            NavController navController = getNavController();
            String stringExtra2 = intent.getStringExtra(CarHostActivity.XP_ACTION);
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            String stringExtra3 = intent.getStringExtra(CarHostActivity.XP_TOKEN);
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            String stringExtra4 = intent.getStringExtra(CarHostActivity.XP_KEY_TOKEN);
            xpNavigationApiJ.hostToCheck(navController, stringExtra2, stringExtra3, stringExtra4 != null ? stringExtra4 : "");
        }
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public int setViewId() {
        return R.layout.fragment_host_xp;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public boolean showTitleBar() {
        return false;
    }
}
