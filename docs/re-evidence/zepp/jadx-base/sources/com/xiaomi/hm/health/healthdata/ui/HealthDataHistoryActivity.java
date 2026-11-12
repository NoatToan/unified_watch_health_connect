package com.xiaomi.hm.health.healthdata.ui;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.adapter.BaseRecyclerAdapter;
import com.xiaomi.hm.health.adapter.MyViewHolder;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.healthdata.ui.HealthDataHistoryActivity;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.HistoryItem;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.k;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u001d\u0010\u000f\u001a\u00020\n8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/HealthDataHistoryActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", PointCategory.INIT, "Lcom/xiaomi/hm/health/healthdata/ui/vo/HistoryItem;", "item", "t", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataViewModel;", "x", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataViewModel;", "viewModel", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "y", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "type", "Lcom/xiaomi/hm/health/healthdata/ui/HealthDataHistoryActivity$a;", "z", "Lcom/xiaomi/hm/health/healthdata/ui/HealthDataHistoryActivity$a;", "historyAdapter", "<init>", "()V", "Companion", "a", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataHistoryActivity extends BaseTitleActivity {

    @NotNull
    private static final String A = "HealthData-HealthDataHistory";

    @NotNull
    public static final String DATA_TYPE = "dataType";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private DataType type;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private a historyAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nj\u0002`\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0015R)\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nj\u0002`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001b\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"com/xiaomi/hm/health/healthdata/ui/HealthDataHistoryActivity$a", "Lcom/xiaomi/hm/health/adapter/BaseRecyclerAdapter;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HistoryItem;", "Lcom/xiaomi/hm/health/adapter/MyViewHolder;", "holder", "item", "", "position", "", "e", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/healthdata/ui/DeleteRecord;", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "deleteRecord", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "unit", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "b", "()Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "dataType", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/xiaomi/hm/health/healthdata/dto/DataType;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a extends BaseRecyclerAdapter<HistoryItem> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<HistoryItem, Unit> deleteRecord;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private String unit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final DataType dataType;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.HealthDataHistoryActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0963a extends Lambda implements Function0<String> {
            public final /* synthetic */ HistoryItem a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0963a(HistoryItem historyItem) {
                super(0);
                this.a = historyItem;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "delete item " + this.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super HistoryItem, Unit> function1, @NotNull String str, @NotNull DataType dataType) {
            super(R.layout.item_health_data_history);
            this.deleteRecord = function1;
            this.unit = str;
            this.dataType = dataType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(HistoryItem historyItem, a aVar, View view) {
            if (!historyItem.getDelete()) {
                return true;
            }
            HMLog.debug(HealthDataHistoryActivity.A, new C0963a(historyItem));
            aVar.c().invoke(historyItem);
            return true;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final DataType getDataType() {
            return this.dataType;
        }

        @NotNull
        public final Function1<HistoryItem, Unit> c() {
            return this.deleteRecord;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter
        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull MyViewHolder holder, @NotNull final HistoryItem item, int position) {
            DataType dataType = this.dataType;
            boolean z = true;
            if (!(dataType == HealthDataType.MUSCLE || dataType == HealthDataType.BONE) && dataType != HealthDataType.SKELETAL_MUSCLE) {
                z = false;
            }
            if (z) {
                int weightUnit = BFCallback.getUnitManager().getWeightUnit();
                if (StringsKt__StringsKt.contains$default((CharSequence) item.getValue(), (CharSequence) ",", false, 2, (Object) null)) {
                    Float floatOrNull = k.toFloatOrNull(m.replace$default(item.getValue(), ",", ".", false, 4, (Object) null));
                    if (floatOrNull != null) {
                        String weightValueStringForDisplay = HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(floatOrNull.floatValue(), weightUnit), weightUnit);
                        ((TextView) holder.getView(R.id.data)).setText(weightValueStringForDisplay + " " + getUnit());
                    }
                } else {
                    Float floatOrNull2 = k.toFloatOrNull(item.getValue());
                    if (floatOrNull2 != null) {
                        String weightValueStringForDisplay2 = HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(floatOrNull2.floatValue(), weightUnit), weightUnit);
                        ((TextView) holder.getView(R.id.data)).setText(weightValueStringForDisplay2 + " " + getUnit());
                    }
                }
            } else {
                ((TextView) holder.getView(R.id.data)).setText(item.getValue() + " " + this.unit);
            }
            ((TextView) holder.getView(R.id.time)).setText(item.getTime());
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xiaomi.hm.health.healthdata.ui.a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return HealthDataHistoryActivity.a.f(item, this, view);
                }
            });
        }

        public final void g(@NotNull String str) {
            this.unit = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/HistoryItem;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<HistoryItem, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull HistoryItem historyItem) {
            HealthDataHistoryActivity.this.t(historyItem);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HistoryItem historyItem) {
            a(historyItem);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthDataHistoryActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.HealthDataHistoryActivity$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthDataViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.HealthDataHistoryActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HealthDataViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(HealthDataViewModel.class), function0, objArr);
            }
        });
    }

    private final void init() {
        GlobalTitleStyle.setUnifyTitleStyle$default(this, getString(R.string.health_data_history), null, 2, null);
        b bVar = new b();
        HealthDataUtils healthDataUtils = HealthDataUtils.INSTANCE;
        DataType dataType = this.type;
        Objects.requireNonNull(dataType);
        String healthDataUnit = healthDataUtils.getHealthDataUnit(dataType);
        DataType dataType2 = this.type;
        Objects.requireNonNull(dataType2);
        this.historyAdapter = new a(bVar, healthDataUnit, dataType2);
        RecyclerView recyclerView = (RecyclerView) findViewById(com.xiaomi.hm.health.R.id.history_data);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        a aVar = this.historyAdapter;
        Objects.requireNonNull(aVar);
        recyclerView.setAdapter(aVar);
        HealthDataViewModel viewModel = getViewModel();
        DataType dataType3 = this.type;
        Objects.requireNonNull(dataType3);
        viewModel.loadHistoryByType(dataType3);
        viewModel.getHistoryLiveData().observe(this, new Observer() { // from class: pv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataHistoryActivity.q(this.a, (List) obj);
            }
        });
        viewModel.getDeleteHealthResultLiveData().observe(this, new Observer() { // from class: qv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataHistoryActivity.r(this.a, (Pair) obj);
            }
        });
        viewModel.getShowNoData().observe(this, new Observer() { // from class: ov3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataHistoryActivity.s(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HealthDataHistoryActivity healthDataHistoryActivity, List list) {
        a aVar = healthDataHistoryActivity.historyAdapter;
        Objects.requireNonNull(aVar);
        aVar.update(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(HealthDataHistoryActivity healthDataHistoryActivity, Pair pair) {
        CustomToast.showShort(healthDataHistoryActivity, ((Boolean) pair.getFirst()).booleanValue() ? R.string.delete_success : R.string.delete_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(HealthDataHistoryActivity healthDataHistoryActivity, Boolean bool) {
        ViewExKt.setVisible((TypefaceTextView) healthDataHistoryActivity.findViewById(com.xiaomi.hm.health.R.id.no_data), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final HistoryItem item) {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.health_data_delete_record_confirm)).setCancelable(false).setNegativeButton(getString(R.string.health_data_delete), new DialogInterface.OnClickListener() { // from class: mv3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthDataHistoryActivity.u(this.a, item, dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: nv3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthDataHistoryActivity.v(dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "Delete Record");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HealthDataHistoryActivity healthDataHistoryActivity, HistoryItem historyItem, DialogInterface dialogInterface, int i) {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            healthDataHistoryActivity.getViewModel().deleteHistory(historyItem);
        } else {
            CustomToast.showShort(healthDataHistoryActivity, R.string.no_network_connection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final HealthDataViewModel getViewModel() {
        return (HealthDataViewModel) this.viewModel.getValue();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_data_history);
        String stringExtra = getIntent().getStringExtra("dataType");
        if (stringExtra != null) {
            this.type = DataType.INSTANCE.find(stringExtra);
        }
        init();
    }
}
