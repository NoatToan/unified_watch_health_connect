package com.xiaomi.fitness.health.sleep.interfere;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipView;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereHistoryFragment;
import com.xiaomi.fitness.health.sleep.interfere.adapter.SleepInterfereHistoryAdapter;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlanListResult;
import defpackage.aje;
import defpackage.c0j;
import defpackage.dih;
import defpackage.jui;
import defpackage.yba;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereHistoryFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereHistoryVM;", "Lyba;", "", "initView", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getData", "", "next", "Ljava/lang/String;", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereHistoryAdapter;", "planHistoryAdapter", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereHistoryAdapter;", "Lcom/xiaomi/fitness/baseui/view/TipView;", "errorTipView", "Lcom/xiaomi/fitness/baseui/view/TipView;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereHistoryFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereHistoryFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n774#2:135\n865#2,2:136\n*S KotlinDebug\n*F\n+ 1 SleepInterfereHistoryFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereHistoryFragment\n*L\n107#1:135\n107#1:136,2\n*E\n"})
public final class SleepInterfereHistoryFragment extends BaseBindingFragment<SleepInterfereHistoryVM, yba> {

    @NotNull
    private static final String CLOSE_ACTION = "action.close_sleep_interfere_history";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private TipView errorTipView;

    @Nullable
    private String next;

    @Nullable
    private SleepInterfereHistoryAdapter planHistoryAdapter;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereHistoryFragment$Companion;", "", "<init>", "()V", "CLOSE_ACTION", "", "launch", "", "ctx", "Landroid/content/Context;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            dih.a().e(ctx, new FragmentParams.b().e(SleepInterfereHistoryFragment.class).b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setActionBarDisplayable(false);
        getMBinding().C.setTitle(c0j.Rg);
        getMBinding().C.hideMore();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.planHistoryAdapter = new SleepInterfereHistoryAdapter(contextRequireContext);
        getMBinding().B.setAdapter(this.planHistoryAdapter);
        getMBinding().B.setLayoutManager(new LinearLayoutManager(requireContext()));
        getMBinding().B.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereHistoryFragment.initView.1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.top = ExtUtilsKt.getDp(12);
            }
        });
        getMBinding().B.setEnableMore(true);
        getMBinding().B.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereHistoryFragment.initView.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                SleepInterfereHistoryFragment.this.getData();
            }
        });
        ((SleepInterfereHistoryVM) getMViewModel()).getPlanList().observe(getViewLifecycleOwner(), new SleepInterfereHistoryFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vnm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereHistoryFragment.initView$lambda$4(this.f37068a, (SleepInterferePlanListResult) obj);
            }
        }));
        getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4(final SleepInterfereHistoryFragment this$0, SleepInterferePlanListResult sleepInterferePlanListResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (sleepInterferePlanListResult != null) {
            this$0.next = sleepInterferePlanListResult.getNext();
            List<SleepInterferePlan> plans = sleepInterferePlanListResult.getPlans();
            if (plans != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : plans) {
                    if (((SleepInterferePlan) obj).getStatus() != 0) {
                        arrayList.add(obj);
                    }
                }
                SleepInterfereHistoryAdapter sleepInterfereHistoryAdapter = this$0.planHistoryAdapter;
                if (sleepInterfereHistoryAdapter != null) {
                    sleepInterfereHistoryAdapter.addPlanHistory(arrayList);
                }
                if (arrayList.isEmpty()) {
                    FrameLayout contentRoot = this$0.getMBinding().A;
                    Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
                    TipViewKt.addTipView(contentRoot, TipType.NO_DATA, true, new Function0() { // from class: tnm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SleepInterfereHistoryFragment.initView$lambda$4$lambda$2$lambda$1(this.f34876a);
                        }
                    });
                }
            }
            if (TextUtils.isEmpty(this$0.next)) {
                MoreRecyclerView.setStatus$default(this$0.getMBinding().B, Status.DONE, false, 2, null);
            } else {
                MoreRecyclerView.setStatus$default(this$0.getMBinding().B, Status.MORE, false, 2, null);
            }
        } else {
            FrameLayout contentRoot2 = this$0.getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(contentRoot2, "contentRoot");
            TipViewKt.addTipView(contentRoot2, TipType.NO_NET, true, new Function0() { // from class: unm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SleepInterfereHistoryFragment.initView$lambda$4$lambda$3(this.f35952a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4$lambda$2$lambda$1(SleepInterfereHistoryFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4$lambda$3(SleepInterfereHistoryFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getData() {
        PageState.DefaultImpls.showLoading$default(this, c0j.yq, false, 2, null);
        ((SleepInterfereHistoryVM) getMViewModel()).getPlanHistory(this.next);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.P0;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        aje.b(requireContext()).d(new Intent(CLOSE_ACTION));
        aje.b(requireContext()).c(new BroadcastReceiver() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereHistoryFragment.onCreate.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    SleepInterfereHistoryFragment.this.requireActivity().finish();
                } catch (Exception unused) {
                    Logger.e(BaseFragment.TAG, "close activity exception!!");
                }
            }
        }, new IntentFilter(CLOSE_ACTION));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
