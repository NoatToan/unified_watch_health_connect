package com.huami.femalehealth.uilib.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryActivity;
import com.huami.femalehealth.uilib.viewmodel.HistoryAdapter;
import com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryViewModel;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0014R\u001d\u0010\u0014\u001a\u00020\u000f8T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198\u0010@\u0010X\u0090D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/MenstruationHistoryActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "", "g", "initView", "e", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "historyItemVo", "onItemClick$uilib_release", "(Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;)V", "onItemClick", "onResume", "Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryViewModel;", "a", "Lkotlin/Lazy;", "getViewModel", "()Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryViewModel;", "viewModel", "Lcom/huami/femalehealth/uilib/viewmodel/HistoryAdapter;", "b", "Lcom/huami/femalehealth/uilib/viewmodel/HistoryAdapter;", "historyAdapter", "", "c", "Z", "getAddEnable$uilib_release", "()Z", "addEnable", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public class MenstruationHistoryActivity extends FHBaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private HistoryAdapter historyAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean addEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/MenstruationHistoryActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) MenstruationHistoryActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<HistoryItemVo, Unit> {
        public a(MenstruationHistoryActivity menstruationHistoryActivity) {
            super(1, menstruationHistoryActivity, MenstruationHistoryActivity.class, "onItemClick", "onItemClick$uilib_release(Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;)V", 0);
        }

        public final void a(@NotNull HistoryItemVo historyItemVo) {
            ((MenstruationHistoryActivity) this.receiver).onItemClick$uilib_release(historyItemVo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HistoryItemVo historyItemVo) {
            a(historyItemVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HistoryItemVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HistoryItemVo historyItemVo) {
            super(0);
            this.a = historyItemVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("item点击:", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenstruationHistoryActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MenstruationHistoryViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenstruationHistoryViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MenstruationHistoryViewModel.class), c15291, objArr);
            }
        });
    }

    private final void e() {
        getViewModel().getPagedList().observe(this, new Observer() { // from class: yz4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MenstruationHistoryActivity.f(this.a, (PagedList) obj);
            }
        });
        getViewModel().showAllHistory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MenstruationHistoryActivity menstruationHistoryActivity, PagedList pagedList) {
        menstruationHistoryActivity.getViewModel().calcCycle(pagedList);
        HistoryAdapter historyAdapter = menstruationHistoryActivity.historyAdapter;
        Objects.requireNonNull(historyAdapter);
        historyAdapter.submitList(pagedList);
        HistoryAdapter historyAdapter2 = menstruationHistoryActivity.historyAdapter;
        Objects.requireNonNull(historyAdapter2);
        historyAdapter2.notifyDataSetChanged();
    }

    private final void g() {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: xz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenstruationHistoryActivity.h(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MenstruationHistoryActivity menstruationHistoryActivity, View view) {
        menstruationHistoryActivity.finish();
    }

    private final void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_history);
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAnimation(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        HistoryAdapter historyAdapter = new HistoryAdapter(this, getAddEnable(), new a(this));
        this.historyAdapter = historyAdapter;
        Objects.requireNonNull(historyAdapter);
        recyclerView.setAdapter(historyAdapter);
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    /* JADX INFO: renamed from: getAddEnable$uilib_release, reason: from getter */
    public boolean getAddEnable() {
        return this.addEnable;
    }

    @NotNull
    public MenstruationHistoryViewModel getViewModel() {
        return (MenstruationHistoryViewModel) this.viewModel.getValue();
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_menstruation_history);
        g();
        initView();
        e();
        observerLifeCycle(getViewModel());
    }

    public void onItemClick$uilib_release(@NotNull HistoryItemVo historyItemVo) {
        HMLog.info("xys", new b(historyItemVo));
        MenstruationHistoryDetailActivity.INSTANCE.start(this, historyItemVo);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().initRefresh();
        getViewModel().showAllHistory();
    }
}
