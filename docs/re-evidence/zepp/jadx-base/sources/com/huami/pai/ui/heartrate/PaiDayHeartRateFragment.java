package com.huami.pai.ui.heartrate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.dto.HttpUserInfo;
import com.huami.pai.dto.IHttpUserInfoManager;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.pai.lib.databinding.FragmentDayHeartRateBinding;
import com.huami.pai.ui.history.PAIHistoryViewModel;
import com.huami.pai.vo.PAIDataVo;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001e\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0012\u0010#¨\u0006'"}, d2 = {"Lcom/huami/pai/ui/heartrate/PaiDayHeartRateFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "resId", "value", "", "kotlin.jvm.PlatformType", "getResStr", "", "a", "F", "VALUE_MIN_HEARTRATE", "b", "VALUE_MAX_HEARTRATE", "Lcom/huami/pai/ui/heartrate/IPaiHeartRateRepo;", "c", "Lcom/huami/pai/ui/heartrate/IPaiHeartRateRepo;", "mRepoPai", "Lcom/huami/pai/dto/IHttpUserInfoManager;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/pai/dto/IHttpUserInfoManager;", "userRepos", "e", "Ljava/lang/String;", "curUserId", "Lcom/huami/pai/lib/databinding/FragmentDayHeartRateBinding;", "f", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/pai/lib/databinding/FragmentDayHeartRateBinding;", "binding", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiDayHeartRateFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float VALUE_MIN_HEARTRATE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float VALUE_MAX_HEARTRATE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IPaiHeartRateRepo mRepoPai;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy userRepos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String curUserId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PaiDayHeartRateFragment.class), "binding", "getBinding()Lcom/huami/pai/lib/databinding/FragmentDayHeartRateBinding;"));
        g = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaiDayHeartRateFragment() {
        String userId;
        super(R.layout.fragment_day_heart_rate);
        this.VALUE_MIN_HEARTRATE = 30.0f;
        this.VALUE_MAX_HEARTRATE = 200.0f;
        final Qualifier qualifier = null;
        this.mRepoPai = (IPaiHeartRateRepo) ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(IPaiHeartRateRepo.class), null, null);
        final Object[] objArr = 0 == true ? 1 : 0;
        this.userRepos = LazyKt__LazyJVMKt.lazy(new Function0<IHttpUserInfoManager>() { // from class: com.huami.pai.ui.heartrate.PaiDayHeartRateFragment$special$$inlined$injectInPai$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.dto.IHttpUserInfoManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IHttpUserInfoManager invoke() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(IHttpUserInfoManager.class), qualifier, objArr);
            }
        });
        HttpUserInfo userInfo = c().getUserInfo();
        String str = "";
        if (userInfo != null && (userId = userInfo.getUserId()) != null) {
            str = userId;
        }
        this.curUserId = str;
        this.binding = FragmentViewBindingKt.viewBinding(new PaiDayHeartRateFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentDayHeartRateBinding.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDayHeartRateBinding b() {
        return (FragmentDayHeartRateBinding) this.binding.getValue(this, g[1]);
    }

    private final IHttpUserInfoManager c() {
        return (IHttpUserInfoManager) this.userRepos.getValue();
    }

    public final String getResStr(int resId, int value) {
        return String.format(requireActivity().getResources().getString(resId, Integer.valueOf(value)), new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((PAIHistoryViewModel) new ViewModelProvider(requireActivity()).get(PAIHistoryViewModel.class)).getCurrentSelectData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.heartrate.PaiDayHeartRateFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                PAIDataVo pAIDataVo = (PAIDataVo) t;
                if (pAIDataVo != null) {
                    ViewExKt.setVisible(this.a.b().paiHrParent, pAIDataVo.getLhr() > 0);
                    int dp = (int) pAIDataVo.getDp();
                    int lp = (int) pAIDataVo.getLp();
                    int mp = (int) pAIDataVo.getMp();
                    int hp = (int) pAIDataVo.getHp();
                    float lp2 = pAIDataVo.getLp() - lp;
                    float mp2 = pAIDataVo.getMp() - mp;
                    float hp2 = pAIDataVo.getHp() - hp;
                    int i = dp - ((lp + mp) + hp);
                    if (i != 1) {
                        if (i == 2) {
                            if (hp2 >= mp2 || hp2 >= lp2) {
                                if (mp2 >= hp2 || mp2 >= lp2) {
                                    mp++;
                                } else {
                                    lp++;
                                }
                                hp++;
                            } else {
                                lp++;
                                mp++;
                            }
                        }
                    } else if (hp2 >= mp2 && hp2 >= lp2) {
                        hp++;
                    } else if (mp2 <= hp2 || mp2 < lp2) {
                        lp++;
                    } else {
                        mp++;
                    }
                    try {
                        TextView textView = this.a.b().paiHreatTitleDayValue;
                        PaiDayHeartRateFragment paiDayHeartRateFragment = this.a;
                        int i2 = R.string.pai_value_and_unit;
                        textView.setText(paiDayHeartRateFragment.getResStr(i2, (int) pAIDataVo.getDp()));
                        this.a.b().tvLowPaiValue.setText(this.a.getResStr(i2, lp));
                        this.a.b().tvMiddlePaiValue.setText(this.a.getResStr(i2, mp));
                        this.a.b().tvHighPaiValue.setText(this.a.getResStr(i2, hp));
                    } catch (Exception unused) {
                    }
                    e.f(LifecycleOwnerKt.getLifecycleScope(this.a), null, null, new PaiDayHeartRateFragment$onViewCreated$1$1(this.a, pAIDataVo, null), 3, null);
                }
            }
        });
    }
}
