package com.huami.femalehealth.uilib.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.adapter.HistoryDetailAdapter;
import com.huami.femalehealth.uilib.adapter.SpacingDecoration;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryDetailActivity;
import com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryDetailViewModel;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/MenstruationHistoryDetailActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "", "h", "initView", "f", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryDetailViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryDetailViewModel;", "viewModel", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailAdapter;", "b", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailAdapter;", "historyAdapter", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationHistoryDetailActivity extends FHBaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "historyVo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private HistoryDetailAdapter historyAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/MenstruationHistoryDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "historyItemVo", "", "start", "", "HISTORY_VO", "Ljava/lang/String;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @NotNull HistoryItemVo historyItemVo) {
            Intent intent = new Intent(context, (Class<?>) MenstruationHistoryDetailActivity.class);
            intent.putExtra(MenstruationHistoryDetailActivity.c, historyItemVo);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenstruationHistoryDetailActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MenstruationHistoryDetailViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryDetailActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenstruationHistoryDetailViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MenstruationHistoryDetailViewModel.class), c15291, objArr);
            }
        });
    }

    private final MenstruationHistoryDetailViewModel e() {
        return (MenstruationHistoryDetailViewModel) this.viewModel.getValue();
    }

    private final void f() {
        e().getHistoryDetail().observe(this, new Observer() { // from class: a05
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MenstruationHistoryDetailActivity.g(this.a, (List) obj);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        e().initHistoryDetail((HistoryItemVo) extras.getParcelable(c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MenstruationHistoryDetailActivity menstruationHistoryDetailActivity, List list) {
        if (list == null) {
            return;
        }
        HistoryDetailAdapter historyDetailAdapter = menstruationHistoryDetailActivity.historyAdapter;
        Objects.requireNonNull(historyDetailAdapter);
        historyDetailAdapter.submit(list);
    }

    private final void h() {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: zz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenstruationHistoryDetailActivity.i(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MenstruationHistoryDetailActivity menstruationHistoryDetailActivity, View view) {
        menstruationHistoryDetailActivity.finish();
    }

    private final void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_history_detail);
        if (recyclerView == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.addItemDecoration(new SpacingDecoration(0, (int) ResourceHelper.INSTANCE.dp2px(7.0f), false, 0, 0, 29, null));
        HistoryDetailAdapter historyDetailAdapter = new HistoryDetailAdapter();
        this.historyAdapter = historyDetailAdapter;
        Objects.requireNonNull(historyDetailAdapter);
        recyclerView.setAdapter(historyDetailAdapter);
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_menstruation_history_detail);
        h();
        initView();
        f();
    }
}
