package com.huami.bloodpressure_ui.history;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.base.BaseActivity;
import com.huami.bloodpressure_ui.databinding.ActivityBloodPressureHistoryBinding;
import com.huami.bloodpressure_ui.ext.ContextExKt;
import com.huami.bloodpressure_ui.ext.DataExKt;
import com.huami.bloodpressure_ui.ext.TimeZoneExKt;
import com.huami.bloodpressure_ui.history.BloodPressureHistoryActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.widget.toast.CustomToast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Route({BloodPressureHistoryActivity.ROUTE_BLOODPRESSURE_HISTORY})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryActivity;", "Lcom/huami/bloodpressure_ui/base/BaseActivity;", "", "initView", "i", "initTitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryAdapter;", "a", "Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryAdapter;", "adapter", "Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureHistoryBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureHistoryBinding;", "binding", "Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryViewModel;", "c", "Lkotlin/Lazy;", "g", "()Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryViewModel;", "model", "Ljava/text/SimpleDateFormat;", GoogleApiAvailabilityLight.a, "Ljava/text/SimpleDateFormat;", "yearFormat", "e", "dateFormat", "", "Lcom/huami/bloodpressure_ui/history/BloodPressureTimeEntity;", "Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryEntity;", "Ljava/util/List;", "getDatas", "()Ljava/util/List;", "datas", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureHistoryActivity extends BaseActivity {

    @NotNull
    public static final String ROUTE_BLOODPRESSURE_HISTORY = "bloodpressure/BloodPressureHistoryActivity";
    public static final /* synthetic */ KProperty<Object>[] g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private BloodPressureHistoryAdapter adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new BloodPressureHistoryActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityBloodPressureHistoryBinding.class)));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SimpleDateFormat yearFormat;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<BloodPressureTimeEntity<BloodPressureHistoryEntity>> datas;

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureHistoryActivity.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/ActivityBloodPressureHistoryBinding;"));
        g = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureHistoryActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.history.BloodPressureHistoryActivity$special$$inlined$viewModel$default$1
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
        this.model = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureHistoryViewModel>() { // from class: com.huami.bloodpressure_ui.history.BloodPressureHistoryActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BloodPressureHistoryViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BloodPressureHistoryViewModel.class), function0, objArr);
            }
        });
        this.datas = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityBloodPressureHistoryBinding f() {
        return (ActivityBloodPressureHistoryBinding) this.binding.getValue(this, g[0]);
    }

    private final BloodPressureHistoryViewModel g() {
        return (BloodPressureHistoryViewModel) this.model.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BloodPressureHistoryActivity bloodPressureHistoryActivity, View view) {
        bloodPressureHistoryActivity.finish();
    }

    private final void i() {
        g().getHistoryData().observe(this, new Observer() { // from class: x00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureHistoryActivity.j(this.a, (List) obj);
            }
        });
        g().getDeleteLiveData().observe(this, new Observer() { // from class: w00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureHistoryActivity.k(this.a, (Resource) obj);
            }
        });
    }

    private final void initTitle() {
        RainbowTitleBar rainbowTitleBar = f().containerTitlebar.tvTitlebar;
        rainbowTitleBar.setTitle(R.string.blood_pressure_manual_data);
        rainbowTitleBar.setTitleTextColor(ContextExKt.color(rainbowTitleBar.getContext(), R.color.blood_pressure_s1));
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: v00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureHistoryActivity.h(this.a, view);
            }
        });
    }

    private final void initView() {
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        f().rvHistory.setLayoutManager(linearLayoutManager);
        BloodPressureHistoryAdapter bloodPressureHistoryAdapter = new BloodPressureHistoryAdapter(this.datas, null);
        bloodPressureHistoryAdapter.bindToRecyclerView(f().rvHistory);
        bloodPressureHistoryAdapter.setEmptyView(R.layout.layout_bp_history_empty);
        Unit unit = Unit.INSTANCE;
        this.adapter = bloodPressureHistoryAdapter;
        RecyclerView recyclerView = f().rvHistory;
        BloodPressureHistoryAdapter bloodPressureHistoryAdapter2 = this.adapter;
        Objects.requireNonNull(bloodPressureHistoryAdapter2);
        recyclerView.setAdapter(bloodPressureHistoryAdapter2);
        f().rvHistory.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.bloodpressure_ui.history.BloodPressureHistoryActivity.initView.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView2, int dx, int dy) {
                super.onScrolled(recyclerView2, dx, dy);
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition >= 1 && this.f().bpHistoryDateLayout.getVisibility() == 8) {
                    this.f().bpHistoryDateLayout.setVisibility(0);
                } else if (iFindFirstVisibleItemPosition == 0 && this.f().bpHistoryDateLayout.getVisibility() == 0) {
                    this.f().bpHistoryDateLayout.setVisibility(8);
                }
                if (iFindFirstVisibleItemPosition >= 1) {
                    BloodPressureHistoryAdapter bloodPressureHistoryAdapter3 = this.adapter;
                    Objects.requireNonNull(bloodPressureHistoryAdapter3);
                    long mLabelDate = ((BloodPressureTimeEntity) bloodPressureHistoryAdapter3.getData().get(iFindFirstVisibleItemPosition)).getMLabelDate();
                    BloodPressureHistoryActivity bloodPressureHistoryActivity = this;
                    SimpleDateFormat simpleDateFormat = bloodPressureHistoryActivity.yearFormat;
                    Objects.requireNonNull(simpleDateFormat);
                    String strMillis2String = DataExKt.millis2String(mLabelDate, simpleDateFormat);
                    SimpleDateFormat simpleDateFormat2 = bloodPressureHistoryActivity.dateFormat;
                    Objects.requireNonNull(simpleDateFormat2);
                    String strMillis2String2 = DataExKt.millis2String(mLabelDate, simpleDateFormat2);
                    AppCompatTextView appCompatTextView = bloodPressureHistoryActivity.f().bpHistoryYear;
                    appCompatTextView.setVisibility(0);
                    if (!Intrinsics.areEqual(appCompatTextView.getText(), strMillis2String)) {
                        appCompatTextView.setText(strMillis2String);
                    }
                    AppCompatTextView appCompatTextView2 = bloodPressureHistoryActivity.f().bpHistoryDate;
                    if (Intrinsics.areEqual(appCompatTextView2.getText(), appCompatTextView2)) {
                        return;
                    }
                    if (DataExKt.isToday(mLabelDate)) {
                        strMillis2String2 = bloodPressureHistoryActivity.getResources().getString(R.string.blood_pressure_today);
                    }
                    appCompatTextView2.setText(strMillis2String2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BloodPressureHistoryActivity bloodPressureHistoryActivity, List list) {
        LinkedHashMap linkedHashMap;
        BloodPressureDbVo bloodPressureDbVo;
        String strMillis2String;
        Set<String> setKeySet;
        BloodPressureDbVo bloodPressureDbVo2;
        ArrayList arrayList;
        BloodPressureDbVo bloodPressureDbVo3;
        BloodPressureDbVo bloodPressureDbVo4;
        bloodPressureHistoryActivity.getDatas().clear();
        if (list != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : list) {
                String timeYYYY = TimeFormatEx.INSTANCE.formatTimeYYYY(((BloodPressureDbVo) obj).getMeasureTime());
                Object arrayList2 = linkedHashMap2.get(timeYYYY);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(timeYYYY, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            for (String str : linkedHashMap2.keySet()) {
                List list2 = (List) linkedHashMap2.get(str);
                if (list2 == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : list2) {
                        String timeYMD = TimeFormatEx.INSTANCE.formatTimeYMD(((BloodPressureDbVo) obj2).getMeasureTime());
                        Object arrayList3 = linkedHashMap.get(timeYMD);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(timeYMD, arrayList3);
                        }
                        ((List) arrayList3).add(obj2);
                    }
                }
                List list3 = (List) linkedHashMap2.get(str);
                if (list3 == null || (bloodPressureDbVo = (BloodPressureDbVo) list3.get(0)) == null) {
                    strMillis2String = null;
                } else {
                    long measureTime = bloodPressureDbVo.getMeasureTime();
                    SimpleDateFormat simpleDateFormat = bloodPressureHistoryActivity.yearFormat;
                    Objects.requireNonNull(simpleDateFormat);
                    strMillis2String = DataExKt.millis2String(measureTime, simpleDateFormat);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                SimpleDateFormat simpleDateFormat2 = bloodPressureHistoryActivity.yearFormat;
                Objects.requireNonNull(simpleDateFormat2);
                if (!Intrinsics.areEqual(strMillis2String, DataExKt.millis2String(jCurrentTimeMillis, simpleDateFormat2))) {
                    List<BloodPressureTimeEntity<BloodPressureHistoryEntity>> datas = bloodPressureHistoryActivity.getDatas();
                    BloodPressureTimeEntity<BloodPressureHistoryEntity> bloodPressureTimeEntity = new BloodPressureTimeEntity<>(3);
                    List list4 = (List) linkedHashMap2.get(str);
                    Long lValueOf = (list4 == null || (bloodPressureDbVo4 = (BloodPressureDbVo) list4.get(0)) == null) ? null : Long.valueOf(bloodPressureDbVo4.getMeasureTime());
                    bloodPressureTimeEntity.setMLabelDate(lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue());
                    Unit unit = Unit.INSTANCE;
                    datas.add(bloodPressureTimeEntity);
                }
                if (linkedHashMap != null && (setKeySet = linkedHashMap.keySet()) != null) {
                    for (String str2 : setKeySet) {
                        BloodPressureTimeEntity bloodPressureTimeEntity2 = (BloodPressureTimeEntity) CollectionsKt.lastOrNull((List) bloodPressureHistoryActivity.getDatas());
                        if (!(bloodPressureTimeEntity2 != null && bloodPressureTimeEntity2.getItemType() == 3)) {
                            List<BloodPressureTimeEntity<BloodPressureHistoryEntity>> datas2 = bloodPressureHistoryActivity.getDatas();
                            BloodPressureTimeEntity<BloodPressureHistoryEntity> bloodPressureTimeEntity3 = new BloodPressureTimeEntity<>(1);
                            List list5 = (List) linkedHashMap.get(str2);
                            Long lValueOf2 = (list5 == null || (bloodPressureDbVo3 = (BloodPressureDbVo) list5.get(0)) == null) ? null : Long.valueOf(bloodPressureDbVo3.getMeasureTime());
                            bloodPressureTimeEntity3.setMLabelDate(lValueOf2 == null ? System.currentTimeMillis() : lValueOf2.longValue());
                            Unit unit2 = Unit.INSTANCE;
                            datas2.add(bloodPressureTimeEntity3);
                        }
                        List<BloodPressureTimeEntity<BloodPressureHistoryEntity>> datas3 = bloodPressureHistoryActivity.getDatas();
                        BloodPressureTimeEntity<BloodPressureHistoryEntity> bloodPressureTimeEntity4 = new BloodPressureTimeEntity<>(2);
                        List list6 = (List) linkedHashMap.get(str2);
                        Long lValueOf3 = (list6 == null || (bloodPressureDbVo2 = (BloodPressureDbVo) list6.get(0)) == null) ? null : Long.valueOf(bloodPressureDbVo2.getMeasureTime());
                        bloodPressureTimeEntity4.setMLabelDate(lValueOf3 == null ? System.currentTimeMillis() : lValueOf3.longValue());
                        List<BloodPressureDbVo> list7 = (List) linkedHashMap.get(str2);
                        if (list7 == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                            for (BloodPressureDbVo bloodPressureDbVo5 : list7) {
                                arrayList.add(new BloodPressureHistoryEntity(bloodPressureDbVo5.getMeasureTime(), bloodPressureDbVo5.getSbp(), bloodPressureDbVo5.getDbp(), bloodPressureDbVo5.getDataSource()));
                            }
                        }
                        bloodPressureTimeEntity4.setMDayLabelData(arrayList);
                        Unit unit3 = Unit.INSTANCE;
                        datas3.add(bloodPressureTimeEntity4);
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
            }
            Unit unit5 = Unit.INSTANCE;
        }
        Dispatchers.getMain();
        BloodPressureHistoryAdapter bloodPressureHistoryAdapter = bloodPressureHistoryActivity.adapter;
        Objects.requireNonNull(bloodPressureHistoryAdapter);
        bloodPressureHistoryAdapter.setNewData(bloodPressureHistoryActivity.getDatas());
        Unit unit6 = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BloodPressureHistoryActivity bloodPressureHistoryActivity, Resource resource) {
        if (resource.getStatus() == Status.SUCCESS) {
            CustomToast.showShort(bloodPressureHistoryActivity, R.string.blood_pressure_delete_success);
        } else if (resource.getStatus() == Status.ERROR) {
            CustomToast.showShort(bloodPressureHistoryActivity, R.string.blood_pressure_delete_failer);
        }
    }

    @NotNull
    public final List<BloodPressureTimeEntity<BloodPressureHistoryEntity>> getDatas() {
        return this.datas;
    }

    @Override // com.huami.bloodpressure_ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(f().getRoot());
        this.yearFormat = TimeZoneExKt.getChinaSDF(getResources().getString(R.string.blood_pressure_y));
        this.dateFormat = TimeZoneExKt.getChinaSDF(getResources().getString(R.string.blood_pressure_md));
        initTitle();
        initView();
        i();
    }
}
