package com.xiaomi.hm.health.healthdata.ui.base;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RadioGroup;
import androidx.core.util.SparseArrayKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.chenenyu.router.annotation.Route;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.base.DataDetailBaseNewActivity;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Route({"detail/DataDetailBaseNewActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0002J\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/base/DataDetailBaseNewActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "observeData", "Landroidx/fragment/app/FragmentTransaction;", "o", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "v", DTransferConstants.SEARCH_KEY, "u", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "x", "Landroid/util/SparseArray;", "fragments", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/DataDetailBaseViewModel;", "y", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/DataDetailBaseViewModel;", "viewModel", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataDetailBaseNewActivity extends BaseTitleActivity {

    @NotNull
    public static final String EXTRA_DATA_TYPE = "data_type";

    @NotNull
    public static final String ROUTER_PATH = "detail/DataDetailBaseNewActivity";

    @NotNull
    private static final String z = "DataDetailBaseNewActivity";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<Fragment> fragments = new SparseArray<>();

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data type:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data type:" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataDetailBaseNewActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.base.DataDetailBaseNewActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DataDetailBaseViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.base.DataDetailBaseNewActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DataDetailBaseViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(DataDetailBaseViewModel.class), function0, objArr);
            }
        });
    }

    private final void initView() {
        GlobalTitleStyle.setUnifyTitleStyle$default(this, "", null, 2, null);
        ((RadioGroup) findViewById(R.id.tab_group)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: t21
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                DataDetailBaseNewActivity.r(this.a, radioGroup, i);
            }
        });
    }

    private final FragmentTransaction o(FragmentTransaction fragmentTransaction) {
        SparseArray<Fragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                sparseArray.keyAt(i);
                fragmentTransaction.add(com.huami.watch.hmwatchmanager.R.id.container, sparseArray.valueAt(i));
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return fragmentTransaction;
    }

    private final void observeData() {
        DataDetailBaseViewModel dataDetailBaseViewModelP = p();
        String stringExtra = getIntent().getStringExtra("data_type");
        if (stringExtra != null) {
            HMLog.info(z, new a(stringExtra));
            DataType dataTypeFind = DataType.INSTANCE.find(stringExtra);
            if (dataTypeFind != null) {
                dataDetailBaseViewModelP.setDataType(dataTypeFind);
            }
        }
        dataDetailBaseViewModelP.getDataName().observe(this, new Observer() { // from class: v21
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DataDetailBaseNewActivity.s(this.a, (String) obj);
            }
        });
        dataDetailBaseViewModelP.getFragmentsLiveData().observe(this, new Observer() { // from class: u21
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DataDetailBaseNewActivity.t(this.a, (SparseArray) obj);
            }
        });
    }

    private final DataDetailBaseViewModel p() {
        return (DataDetailBaseViewModel) this.viewModel.getValue();
    }

    private final void q() {
        v(o(getSupportFragmentManager().beginTransaction()), TimeMode.DAY).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(DataDetailBaseNewActivity dataDetailBaseNewActivity, RadioGroup radioGroup, int i) {
        switch (i) {
            case com.huami.watch.hmwatchmanager.R.id.tab_day /* 2131368108 */:
                dataDetailBaseNewActivity.u(TimeMode.DAY);
                break;
            case com.huami.watch.hmwatchmanager.R.id.tab_month /* 2131368113 */:
                dataDetailBaseNewActivity.u(TimeMode.MONTH);
                break;
            case com.huami.watch.hmwatchmanager.R.id.tab_week /* 2131368116 */:
                dataDetailBaseNewActivity.u(TimeMode.WEEK);
                break;
            case com.huami.watch.hmwatchmanager.R.id.tab_year /* 2131368117 */:
                dataDetailBaseNewActivity.u(TimeMode.YEAR);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(DataDetailBaseNewActivity dataDetailBaseNewActivity, String str) {
        dataDetailBaseNewActivity.setTitleText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(DataDetailBaseNewActivity dataDetailBaseNewActivity, SparseArray sparseArray) {
        dataDetailBaseNewActivity.fragments.clear();
        SparseArrayKt.putAll(dataDetailBaseNewActivity.fragments, sparseArray);
        dataDetailBaseNewActivity.q();
    }

    private final void u(TimeMode timeMode) {
        v(getSupportFragmentManager().beginTransaction(), timeMode).commit();
    }

    private final FragmentTransaction v(FragmentTransaction fragmentTransaction, TimeMode timeMode) {
        SparseArray<Fragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int iKeyAt = sparseArray.keyAt(i);
                Fragment fragmentValueAt = sparseArray.valueAt(i);
                if (iKeyAt != timeMode.ordinal()) {
                    fragmentTransaction.hide(fragmentValueAt);
                } else {
                    fragmentTransaction.show(fragmentValueAt);
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return fragmentTransaction;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(com.huami.watch.hmwatchmanager.R.layout.activity_data_detail_base_new);
        observeData();
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        String stringExtra;
        super.onNewIntent(intent);
        if (intent == null || (stringExtra = intent.getStringExtra("data_type")) == null) {
            return;
        }
        HMLog.info(z, new b(stringExtra));
        DataType dataTypeFind = DataType.INSTANCE.find(stringExtra);
        if (dataTypeFind == null) {
            return;
        }
        p().setDataType(dataTypeFind);
    }
}
