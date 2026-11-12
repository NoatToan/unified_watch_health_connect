package com.xiaomi.hm.health.play.card.health;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.snore.core.util.TimeUtil;
import com.huami.snore.ui.activity.SnoreListActivity;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.snore.ui.viewmodel.SnoreListViewModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.LayoutToolSnoreMonitorBinding;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.health.SnoreMonitorRender;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/SnoreMonitorRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolSnoreMonitorBinding;", "", "onClear", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "onCardClick", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "initData", "setUiData", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", "h", "Lkotlin/Lazy;", "()Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", "mSnoreViewModel", "", "i", LogUtil.I, "mSnoreAudioCount", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SnoreMonitorRender extends AbstractCardRender<LayoutToolSnoreMonitorBinding> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSnoreViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mSnoreAudioCount;

    /* JADX WARN: Multi-variable type inference failed */
    public SnoreMonitorRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.health.SnoreMonitorRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mSnoreViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SnoreListViewModel>() { // from class: com.xiaomi.hm.health.play.card.health.SnoreMonitorRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.snore.ui.viewmodel.SnoreListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SnoreListViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(SnoreListViewModel.class), function0, objArr);
            }
        });
        SnoreListViewModel snoreListViewModelG = g();
        snoreListViewModelG.getMCount().observe(lifecycleOwner, new Observer() { // from class: q57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreMonitorRender.h(this.a, (Integer) obj);
            }
        });
        snoreListViewModelG.setDate(new Date());
    }

    private final SnoreListViewModel g() {
        return (SnoreListViewModel) this.mSnoreViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SnoreMonitorRender snoreMonitorRender, Integer num) {
        snoreMonitorRender.mSnoreAudioCount = num.intValue();
        snoreMonitorRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SnoreMonitorRender snoreMonitorRender, Context context, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        if (snoreMonitorRender.mSnoreAudioCount > 0) {
            SnoreListActivity.INSTANCE.navigation(context, new Date());
        } else {
            context.startActivity(new Intent(context, (Class<?>) SnoreMonitorActivity.class));
        }
        snoreMonitorRender.recordClickEvent();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.initData(context, uiParams);
        g().syncSnoreData(new Date());
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        super.onCardClick(context, uiParams);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        g().getMCount().removeObservers(this.lifecycleOwner);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        getBinding().toolSnoreMonitorDate.setText(TimeUtil.INSTANCE.formatTime(new Date()));
        if (this.mSnoreAudioCount > 0) {
            getBinding().toolSnoreMonitorPrompt.setVisibility(8);
            getBinding().toolSnoreMonitorTitle.setVisibility(0);
            getBinding().toolSnoreMonitorStatus.setVisibility(0);
            getBinding().toolSnoreMonitorDate.setVisibility(0);
            getBinding().toolSnoreMonitorCheck.setText(context.getResources().getString(R.string.play_tool_snore_view));
            AppCompatTextView appCompatTextView = getBinding().toolSnoreMonitorTitle;
            Resources resources = context.getResources();
            int i = this.mSnoreAudioCount;
            appCompatTextView.setText(resources.getQuantityString(R.plurals.play_tool_snore_audio, i, Integer.valueOf(i)));
        } else {
            getBinding().toolSnoreMonitorPrompt.setVisibility(0);
            getBinding().toolSnoreMonitorTitle.setVisibility(8);
            getBinding().toolSnoreMonitorStatus.setVisibility(8);
            getBinding().toolSnoreMonitorDate.setVisibility(8);
            getBinding().toolSnoreMonitorCheck.setText(context.getResources().getString(R.string.play_tool_snore_monitor));
        }
        getBinding().toolSnoreMonitorCheck.setOnClickListener(new View.OnClickListener() { // from class: p57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnoreMonitorRender.i(this.a, context, view);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolSnoreMonitorBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolSnoreMonitorBinding.inflate(inflater, rootView, true);
    }
}
