package com.huami.midong.ppg.ui.midong.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.midong.ppg.ui.midong.R;
import com.huami.midong.ppg.ui.midong.databinding.ActivityHmafppgHrBinding;
import com.huami.midong.ppg.ui.midong.ui.activity.HMAtrialFibrillationHrActivity;
import com.huami.midong.ppg.ui.midong.ui.adapter.AfppgAdapter;
import com.huami.midong.ppg.ui.midong.ui.res.MedicalResource;
import com.huami.midong.ppg.ui.midong.ui.util.AtrialUtils;
import com.huami.midong.ppg.ui.midong.ui.viewmodel.AtrialFibViewModel;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Route({"afPpg/HMAtrialFibrillationHrActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010&¨\u0006+"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/activity/HMAtrialFibrillationHrActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "l", "e", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "atrialFibrillationList", "", "isInit", "m", "hrList", "", hl.k, "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/midong/ppg/ui/midong/databinding/ActivityHmafppgHrBinding;", "a", "Lkotlin/Lazy;", "i", "()Lcom/huami/midong/ppg/ui/midong/databinding/ActivityHmafppgHrBinding;", "activityHmafppgHrBinding", "Lcom/huami/midong/ppg/ui/midong/ui/viewmodel/AtrialFibViewModel;", "b", z.j, "()Lcom/huami/midong/ppg/ui/midong/ui/viewmodel/AtrialFibViewModel;", "atrialFibViewModel", "Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter;", "c", "Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter;", "afppgAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", GoogleApiAvailabilityLight.a, "Landroidx/recyclerview/widget/LinearLayoutManager;", "afppgLinearManager", "", "J", "lastItemTimestamp", "<init>", "()V", "Companion", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
public final class HMAtrialFibrillationHrActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int f = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private AfppgAdapter afppgAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LinearLayoutManager afppgLinearManager;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityHmafppgHrBinding = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy atrialFibViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AtrialFibViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.midong.ppg.ui.midong.ui.activity.HMAtrialFibrillationHrActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.midong.ppg.ui.midong.ui.activity.HMAtrialFibrillationHrActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long lastItemTimestamp = System.currentTimeMillis();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/activity/HMAtrialFibrillationHrActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, "", "MINUS_ONE", LogUtil.I, "<init>", "()V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            context.getApplicationContext().startActivity(new Intent(context.getApplicationContext(), (Class<?>) HMAtrialFibrillationHrActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/databinding/ActivityHmafppgHrBinding;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ActivityHmafppgHrBinding> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityHmafppgHrBinding invoke() {
            return ActivityHmafppgHrBinding.inflate(LayoutInflater.from(HMAtrialFibrillationHrActivity.this));
        }
    }

    private final void e() {
        j().getFibItems().observe(this, new Observer() { // from class: ek2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMAtrialFibrillationHrActivity.f(this.a, (List) obj);
            }
        });
        j().loadMore(this.lastItemTimestamp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HMAtrialFibrillationHrActivity hMAtrialFibrillationHrActivity, List list) {
        if (list.isEmpty()) {
            AfppgAdapter afppgAdapter = hMAtrialFibrillationHrActivity.afppgAdapter;
            (afppgAdapter != null ? afppgAdapter : null).loadEndRefresh();
        } else {
            AfppgAdapter afppgAdapter2 = hMAtrialFibrillationHrActivity.afppgAdapter;
            hMAtrialFibrillationHrActivity.m(list, (afppgAdapter2 != null ? afppgAdapter2 : null).getData().isEmpty());
        }
    }

    private final void g() {
        RainbowTitleBar rainbowTitleBar = i().tvTitleBar;
        rainbowTitleBar.setTitle(getString(MedicalResource.INSTANCE.get(false).getAtrial_fib_text()));
        rainbowTitleBar.setTitleTextColor(ContextCompat.getColor(this, R.color.s1));
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: dk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMAtrialFibrillationHrActivity.h(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HMAtrialFibrillationHrActivity hMAtrialFibrillationHrActivity, View view) {
        hMAtrialFibrillationHrActivity.finish();
    }

    private final ActivityHmafppgHrBinding i() {
        return (ActivityHmafppgHrBinding) this.activityHmafppgHrBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtrialFibViewModel j() {
        return (AtrialFibViewModel) this.atrialFibViewModel.getValue();
    }

    private final List<Object> k(List<AtrialFibrillation> hrList) {
        ArrayList arrayList = new ArrayList();
        int size = hrList.size() - 1;
        if (size >= 0) {
            String str = "";
            int i = 0;
            while (true) {
                int i2 = i + 1;
                AtrialFibrillation atrialFibrillation = hrList.get(i);
                String date = AtrialUtils.INSTANCE.formatDate(this, atrialFibrillation.getEventTime());
                if (!Intrinsics.areEqual(str, date)) {
                    arrayList.add(date);
                }
                arrayList.add(atrialFibrillation);
                if (i2 > size) {
                    break;
                }
                i = i2;
                str = date;
            }
        }
        return arrayList;
    }

    private final void l() {
        i().recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.midong.ppg.ui.midong.ui.activity.HMAtrialFibrillationHrActivity$initRecycler$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                AfppgAdapter afppgAdapter = this.a.afppgAdapter;
                if (afppgAdapter == null) {
                    afppgAdapter = null;
                }
                if (!afppgAdapter.getData().isEmpty() && newState == 0) {
                    LinearLayoutManager linearLayoutManager = this.a.afppgLinearManager;
                    if (linearLayoutManager == null) {
                        linearLayoutManager = null;
                    }
                    int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                    AfppgAdapter afppgAdapter2 = this.a.afppgAdapter;
                    if (iFindLastCompletelyVisibleItemPosition == (afppgAdapter2 != null ? afppgAdapter2 : null).getData().size() + 2) {
                        this.a.j().loadMore(this.a.lastItemTimestamp);
                    }
                }
            }
        });
        this.afppgLinearManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = i().recyclerView;
        LinearLayoutManager linearLayoutManager = this.afppgLinearManager;
        if (linearLayoutManager == null) {
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        this.afppgAdapter = new AfppgAdapter();
        RecyclerView recyclerView2 = i().recyclerView;
        AfppgAdapter afppgAdapter = this.afppgAdapter;
        recyclerView2.setAdapter(afppgAdapter != null ? afppgAdapter : null);
    }

    private final void m(List<AtrialFibrillation> atrialFibrillationList, boolean isInit) {
        List<? extends Object> listK = k(atrialFibrillationList);
        AfppgAdapter afppgAdapter = this.afppgAdapter;
        if (afppgAdapter == null) {
            afppgAdapter = null;
        }
        afppgAdapter.fillData(listK);
        long eventTime = ((AtrialFibrillation) CollectionsKt.last((List) atrialFibrillationList)).getEventTime() - 1;
        if (this.lastItemTimestamp == eventTime) {
            AfppgAdapter afppgAdapter2 = this.afppgAdapter;
            (afppgAdapter2 != null ? afppgAdapter2 : null).loadEndRefresh();
            return;
        }
        if (isInit && atrialFibrillationList.size() < 29) {
            AfppgAdapter afppgAdapter3 = this.afppgAdapter;
            (afppgAdapter3 != null ? afppgAdapter3 : null).loadEndRefresh();
        }
        this.lastItemTimestamp = eventTime;
    }

    public static /* synthetic */ void n(HMAtrialFibrillationHrActivity hMAtrialFibrillationHrActivity, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hMAtrialFibrillationHrActivity.m(list, z);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(i().getRoot());
        g();
        l();
        e();
    }
}
