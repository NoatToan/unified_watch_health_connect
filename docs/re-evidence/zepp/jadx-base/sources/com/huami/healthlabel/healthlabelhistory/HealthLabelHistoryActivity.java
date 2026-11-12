package com.huami.healthlabel.healthlabelhistory;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.R;
import com.huami.healthlabel.databinding.ActivityHealthLabelHistoryBinding;
import com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity;
import com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelDayEntity;
import com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelHistoryAdapter;
import com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelHistoryEntity;
import com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelLoadMoreView;
import com.huami.healthlabel.healthlabelhistory.adapter.ItemClickListener;
import com.huami.healthlabel.healthlabelhistory.adapter.LoadMoreLabelHistoryData;
import com.huami.healthlabel.healthlabelhistory.adapter.PageInfo;
import com.huami.healthlabel.ui.AlertDialogFragment;
import com.huami.healthlabel.ui.anim.SelfRotateAnimation;
import com.huami.healthlabel.ui.custom.AdapterAnimationListener;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.DateExtKt;
import com.huami.view.basetitle.StatusBarUtil;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/HealthLabelHistoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/healthlabel/healthlabelhistory/adapter/ItemClickListener;", "", "initView", z.j, "i", "", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayEntity;", "itemList", "curItemEntry", "", "h", b.r, "o", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "item", "onItemClick", "Lcom/huami/healthlabel/healthlabelhistory/HealthLabelHistoryViewModel;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/healthlabel/healthlabelhistory/HealthLabelHistoryViewModel;", "mViewModel", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryAdapter;", "b", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryAdapter;", "mHistoryAdapter", "Lcom/huami/healthlabel/healthlabelhistory/adapter/PageInfo;", "c", "Lcom/huami/healthlabel/healthlabelhistory/adapter/PageInfo;", "mPageInfo", GoogleApiAvailabilityLight.a, "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayEntity;", "Lcom/huami/healthlabel/databinding/ActivityHealthLabelHistoryBinding;", "e", "Lcom/huami/healthlabel/databinding/ActivityHealthLabelHistoryBinding;", "binding", "", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryEntity;", "f", "Ljava/util/List;", "allRecordLabelList", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelHistoryActivity extends AppCompatActivity implements ItemClickListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private HealthLabelHistoryAdapter mHistoryAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PageInfo mPageInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private HealthLabelDayEntity curItemEntry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ActivityHealthLabelHistoryBinding binding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<HealthLabelHistoryEntity> allRecordLabelList;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthLabelHistoryActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity$special$$inlined$viewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthLabelHistoryViewModel>() { // from class: com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HealthLabelHistoryViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(HealthLabelHistoryViewModel.class), function0, objArr);
            }
        });
        this.mPageInfo = new PageInfo();
        this.allRecordLabelList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthLabelHistoryViewModel g() {
        return (HealthLabelHistoryViewModel) this.mViewModel.getValue();
    }

    private final int h(List<HealthLabelDayEntity> itemList, HealthLabelDayEntity curItemEntry) {
        int size = itemList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (Intrinsics.areEqual(curItemEntry, itemList.get(i))) {
                    return i;
                }
                if (i2 <= size) {
                    i = i2;
                }
            }
        }
        return -1;
    }

    private final void i() {
        int i;
        HealthLabelDayEntity healthLabelDayEntity = this.curItemEntry;
        if (healthLabelDayEntity == null) {
            return;
        }
        long mLabelDate = healthLabelDayEntity.getMLabelDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd", Locale.CHINA);
        List<HealthLabelDayEntity> arrayList = new ArrayList<>();
        int size = this.allRecordLabelList.size();
        int size2 = 0;
        if (size <= 0) {
            i = 0;
            break;
        }
        i = 0;
        while (true) {
            int i2 = i + 1;
            if (Intrinsics.areEqual(DateExtKt.millis2String(mLabelDate, simpleDateFormat), DateExtKt.millis2String(this.allRecordLabelList.get(i).getMLabelDate(), simpleDateFormat)) && this.allRecordLabelList.get(i).getMyItemType() == 2) {
                List<HealthLabelDayEntity> mDayLabelData = this.allRecordLabelList.get(i).getMDayLabelData();
                size2 = mDayLabelData.size();
                Unit unit = Unit.INSTANCE;
                arrayList.addAll(mDayLabelData);
                break;
            }
            if (i2 >= size) {
                i = 0;
                break;
            }
            i = i2;
        }
        HealthLabelHistoryAdapter healthLabelHistoryAdapter = this.mHistoryAdapter;
        if (healthLabelHistoryAdapter == null) {
            healthLabelHistoryAdapter = null;
        }
        int iDeleteData = healthLabelHistoryAdapter.deleteData(this.curItemEntry);
        if (iDeleteData > 0) {
            int iH = h(arrayList, this.curItemEntry);
            arrayList.remove(this.curItemEntry);
            if (iDeleteData > 1) {
                arrayList.remove(iH - 1);
            }
            if (iDeleteData == size2) {
                HealthLabelHistoryAdapter healthLabelHistoryAdapter2 = this.mHistoryAdapter;
                if (healthLabelHistoryAdapter2 == null) {
                    healthLabelHistoryAdapter2 = null;
                }
                healthLabelHistoryAdapter2.remove(i);
                HealthLabelHistoryAdapter healthLabelHistoryAdapter3 = this.mHistoryAdapter;
                if (healthLabelHistoryAdapter3 == null) {
                    healthLabelHistoryAdapter3 = null;
                }
                int i3 = i - 1;
                healthLabelHistoryAdapter3.remove(i3);
                this.allRecordLabelList.remove(i);
                this.allRecordLabelList.remove(i3);
            } else {
                List<HealthLabelDayEntity> mDayLabelData2 = this.allRecordLabelList.get(i).getMDayLabelData();
                mDayLabelData2.clear();
                mDayLabelData2.addAll(arrayList);
            }
            HealthLabelHistoryAdapter healthLabelHistoryAdapter4 = this.mHistoryAdapter;
            (healthLabelHistoryAdapter4 != null ? healthLabelHistoryAdapter4 : null).notifyDataSetChanged();
        }
    }

    private final void initView() {
        HealthLabelHistoryAdapter healthLabelHistoryAdapter = new HealthLabelHistoryAdapter(new ArrayList(), this);
        this.mHistoryAdapter = healthLabelHistoryAdapter;
        BaseQuickAdapter.RequestLoadMoreListener requestLoadMoreListener = new BaseQuickAdapter.RequestLoadMoreListener() { // from class: hw3
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
            public final void onLoadMoreRequested() {
                HealthLabelHistoryActivity.m(this.a);
            }
        };
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding = this.binding;
        if (activityHealthLabelHistoryBinding == null) {
            activityHealthLabelHistoryBinding = null;
        }
        healthLabelHistoryAdapter.setOnLoadMoreListener(requestLoadMoreListener, activityHealthLabelHistoryBinding.healthLabelHistoryRecyclerView);
        HealthLabelHistoryAdapter healthLabelHistoryAdapter2 = this.mHistoryAdapter;
        if (healthLabelHistoryAdapter2 == null) {
            healthLabelHistoryAdapter2 = null;
        }
        healthLabelHistoryAdapter2.setLoadMoreView(new HealthLabelLoadMoreView());
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding2 = this.binding;
        if (activityHealthLabelHistoryBinding2 == null) {
            activityHealthLabelHistoryBinding2 = null;
        }
        RecyclerView recyclerView = activityHealthLabelHistoryBinding2.healthLabelHistoryRecyclerView;
        recyclerView.setLayoutManager(linearLayoutManager);
        HealthLabelHistoryAdapter healthLabelHistoryAdapter3 = this.mHistoryAdapter;
        if (healthLabelHistoryAdapter3 == null) {
            healthLabelHistoryAdapter3 = null;
        }
        recyclerView.setAdapter(healthLabelHistoryAdapter3);
        HealthLabelHistoryAdapter healthLabelHistoryAdapter4 = this.mHistoryAdapter;
        if (healthLabelHistoryAdapter4 == null) {
            healthLabelHistoryAdapter4 = null;
        }
        healthLabelHistoryAdapter4.setEmptyView(R.layout.layout_label_history_empty);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M月d日", Locale.getDefault());
        final SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年", Locale.getDefault());
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding3 = this.binding;
        if (activityHealthLabelHistoryBinding3 == null) {
            activityHealthLabelHistoryBinding3 = null;
        }
        activityHealthLabelHistoryBinding3.healthLabelHistoryRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity.initView.3
            /* JADX WARN: Code duplicated, block: B:16:0x003e  */
            /* JADX WARN: Code duplicated, block: B:17:0x0040  */
            /* JADX WARN: Code duplicated, block: B:19:0x0048  */
            /* JADX WARN: Code duplicated, block: B:22:0x0051  */
            /* JADX WARN: Code duplicated, block: B:24:0x0059  */
            /* JADX WARN: Code duplicated, block: B:27:0x0067  */
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView2, int dx, int dy) {
                ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding4;
                ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding5;
                ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding6;
                super.onScrolled(recyclerView2, dx, dy);
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition >= 1) {
                    ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding7 = this.binding;
                    if (activityHealthLabelHistoryBinding7 == null) {
                        activityHealthLabelHistoryBinding7 = null;
                    }
                    if (activityHealthLabelHistoryBinding7.healthLabelHistoryDateLayout.getVisibility() == 8) {
                        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding8 = this.binding;
                        if (activityHealthLabelHistoryBinding8 == null) {
                            activityHealthLabelHistoryBinding8 = null;
                        }
                        activityHealthLabelHistoryBinding8.healthLabelHistoryDateLayout.setVisibility(0);
                        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding9 = this.binding;
                        if (activityHealthLabelHistoryBinding9 == null) {
                            activityHealthLabelHistoryBinding9 = null;
                        }
                        activityHealthLabelHistoryBinding9.healthLabelHistoryDateImage.setVisibility(0);
                    } else if (iFindFirstVisibleItemPosition == 0) {
                        activityHealthLabelHistoryBinding4 = this.binding;
                        if (activityHealthLabelHistoryBinding4 == null) {
                            activityHealthLabelHistoryBinding4 = null;
                        }
                        if (activityHealthLabelHistoryBinding4.healthLabelHistoryDateLayout.getVisibility() == 0) {
                            activityHealthLabelHistoryBinding5 = this.binding;
                            if (activityHealthLabelHistoryBinding5 == null) {
                                activityHealthLabelHistoryBinding5 = null;
                            }
                            activityHealthLabelHistoryBinding5.healthLabelHistoryDateLayout.setVisibility(8);
                            activityHealthLabelHistoryBinding6 = this.binding;
                            if (activityHealthLabelHistoryBinding6 == null) {
                                activityHealthLabelHistoryBinding6 = null;
                            }
                            activityHealthLabelHistoryBinding6.healthLabelHistoryDateImage.setVisibility(8);
                        }
                    }
                } else if (iFindFirstVisibleItemPosition == 0) {
                    activityHealthLabelHistoryBinding4 = this.binding;
                    if (activityHealthLabelHistoryBinding4 == null) {
                        activityHealthLabelHistoryBinding4 = null;
                    }
                    if (activityHealthLabelHistoryBinding4.healthLabelHistoryDateLayout.getVisibility() == 0) {
                        activityHealthLabelHistoryBinding5 = this.binding;
                        if (activityHealthLabelHistoryBinding5 == null) {
                            activityHealthLabelHistoryBinding5 = null;
                        }
                        activityHealthLabelHistoryBinding5.healthLabelHistoryDateLayout.setVisibility(8);
                        activityHealthLabelHistoryBinding6 = this.binding;
                        if (activityHealthLabelHistoryBinding6 == null) {
                            activityHealthLabelHistoryBinding6 = null;
                        }
                        activityHealthLabelHistoryBinding6.healthLabelHistoryDateImage.setVisibility(8);
                    }
                }
                if (iFindFirstVisibleItemPosition >= 1) {
                    HealthLabelHistoryAdapter healthLabelHistoryAdapter5 = this.mHistoryAdapter;
                    if (healthLabelHistoryAdapter5 == null) {
                        healthLabelHistoryAdapter5 = null;
                    }
                    long mLabelDate = ((HealthLabelHistoryEntity) healthLabelHistoryAdapter5.getData().get(iFindFirstVisibleItemPosition)).getMLabelDate();
                    SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                    SimpleDateFormat simpleDateFormat4 = simpleDateFormat;
                    HealthLabelHistoryActivity healthLabelHistoryActivity = this;
                    String strMillis2String = DateExtKt.millis2String(mLabelDate, simpleDateFormat3);
                    String strMillis2String2 = DateExtKt.millis2String(mLabelDate, simpleDateFormat4);
                    ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding10 = healthLabelHistoryActivity.binding;
                    if (activityHealthLabelHistoryBinding10 == null) {
                        activityHealthLabelHistoryBinding10 = null;
                    }
                    AppCompatTextView appCompatTextView = activityHealthLabelHistoryBinding10.healthLabelHistoryYear;
                    appCompatTextView.setVisibility(0);
                    if (!Intrinsics.areEqual(appCompatTextView.getText(), strMillis2String)) {
                        appCompatTextView.setText(strMillis2String);
                    }
                    ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding11 = healthLabelHistoryActivity.binding;
                    AppCompatTextView appCompatTextView2 = (activityHealthLabelHistoryBinding11 != null ? activityHealthLabelHistoryBinding11 : null).healthLabelHistoryDate;
                    if (Intrinsics.areEqual(appCompatTextView2.getText(), strMillis2String2)) {
                        return;
                    }
                    if (DateExtKt.isToday(mLabelDate)) {
                        strMillis2String2 = appCompatTextView2.getResources().getString(R.string.health_label_today);
                    }
                    appCompatTextView2.setText(strMillis2String2);
                }
            }
        });
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding4 = this.binding;
        (activityHealthLabelHistoryBinding4 != null ? activityHealthLabelHistoryBinding4 : null).healthLabelHistoryBack.setOnClickListener(new View.OnClickListener() { // from class: ew3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelHistoryActivity.n(this.a, view);
            }
        });
    }

    private final void j() {
        HealthLabelHistoryViewModel.loadLabelHistoryData$default(g(), System.currentTimeMillis(), 0L, null, 6, null);
        g().getLabelHistoryData().observe(this, new Observer() { // from class: fw3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthLabelHistoryActivity.k(this.a, (LoadMoreLabelHistoryData) obj);
            }
        });
        g().getLabelDeleteStatus().observe(this, new Observer() { // from class: gw3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthLabelHistoryActivity.l(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HealthLabelHistoryActivity healthLabelHistoryActivity, LoadMoreLabelHistoryData loadMoreLabelHistoryData) {
        List<HealthLabelHistoryEntity> healthLabelHistoryEntity = loadMoreLabelHistoryData.getHealthLabelHistoryEntity();
        healthLabelHistoryActivity.allRecordLabelList.addAll(healthLabelHistoryEntity);
        if (healthLabelHistoryActivity.mPageInfo.isFirstPage()) {
            HealthLabelHistoryAdapter healthLabelHistoryAdapter = healthLabelHistoryActivity.mHistoryAdapter;
            if (healthLabelHistoryAdapter == null) {
                healthLabelHistoryAdapter = null;
            }
            healthLabelHistoryAdapter.setNewData(healthLabelHistoryEntity);
        } else {
            if (loadMoreLabelHistoryData.isOldLabelDate()) {
                HealthLabelHistoryAdapter healthLabelHistoryAdapter2 = healthLabelHistoryActivity.mHistoryAdapter;
                if (healthLabelHistoryAdapter2 == null) {
                    healthLabelHistoryAdapter2 = null;
                }
                int size = healthLabelHistoryAdapter2.getData().size();
                if (size > 0) {
                    HealthLabelHistoryAdapter healthLabelHistoryAdapter3 = healthLabelHistoryActivity.mHistoryAdapter;
                    if (healthLabelHistoryAdapter3 == null) {
                        healthLabelHistoryAdapter3 = null;
                    }
                    healthLabelHistoryAdapter3.setData(size - 1, healthLabelHistoryEntity.get(0));
                    healthLabelHistoryEntity.remove(0);
                }
            }
            HealthLabelHistoryAdapter healthLabelHistoryAdapter4 = healthLabelHistoryActivity.mHistoryAdapter;
            if (healthLabelHistoryAdapter4 == null) {
                healthLabelHistoryAdapter4 = null;
            }
            healthLabelHistoryAdapter4.addData((Collection) healthLabelHistoryEntity);
        }
        if (loadMoreLabelHistoryData.isLoadMoreEnd()) {
            HealthLabelHistoryAdapter healthLabelHistoryAdapter5 = healthLabelHistoryActivity.mHistoryAdapter;
            (healthLabelHistoryAdapter5 != null ? healthLabelHistoryAdapter5 : null).loadMoreEnd();
        } else {
            HealthLabelHistoryAdapter healthLabelHistoryAdapter6 = healthLabelHistoryActivity.mHistoryAdapter;
            (healthLabelHistoryAdapter6 != null ? healthLabelHistoryAdapter6 : null).loadMoreComplete();
        }
        healthLabelHistoryActivity.mPageInfo.nextPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HealthLabelHistoryActivity healthLabelHistoryActivity, Boolean bool) {
        healthLabelHistoryActivity.q();
        if (bool.booleanValue()) {
            healthLabelHistoryActivity.i();
        } else {
            UtilsKt.toast(R.string.health_label_delete_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HealthLabelHistoryActivity healthLabelHistoryActivity) {
        healthLabelHistoryActivity.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HealthLabelHistoryActivity healthLabelHistoryActivity, View view) {
        healthLabelHistoryActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding = this.binding;
        if (activityHealthLabelHistoryBinding == null) {
            activityHealthLabelHistoryBinding = null;
        }
        activityHealthLabelHistoryBinding.healthLabelHistoryDeleteLl.setVisibility(0);
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding2 = this.binding;
        ImageView imageView = (activityHealthLabelHistoryBinding2 != null ? activityHealthLabelHistoryBinding2 : null).healthLabelHistoryDeleteIv;
        final SelfRotateAnimation selfRotateAnimation = new SelfRotateAnimation(0.0f, 360.0f, 500L, -1);
        selfRotateAnimation.setAnimationListener(new AdapterAnimationListener() { // from class: com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity$loadDeleteAnimation$1$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private long startTime = System.currentTimeMillis();

            public final long getStartTime() {
                return this.startTime;
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
                if (System.currentTimeMillis() - this.startTime > 30000) {
                    selfRotateAnimation.cancel();
                    ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding3 = this.binding;
                    if (activityHealthLabelHistoryBinding3 == null) {
                        activityHealthLabelHistoryBinding3 = null;
                    }
                    activityHealthLabelHistoryBinding3.healthLabelHistoryDeleteIv.setVisibility(8);
                }
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation) {
                this.startTime = System.currentTimeMillis();
            }

            public final void setStartTime(long j) {
                this.startTime = j;
            }
        });
        Unit unit = Unit.INSTANCE;
        imageView.startAnimation(selfRotateAnimation);
    }

    private final void p() {
        HealthLabelDayEntity healthLabelDayEntity;
        HealthLabelHistoryAdapter healthLabelHistoryAdapter = this.mHistoryAdapter;
        if (healthLabelHistoryAdapter == null) {
            healthLabelHistoryAdapter = null;
        }
        HealthLabelHistoryEntity healthLabelHistoryEntity = (HealthLabelHistoryEntity) CollectionsKt.lastOrNull((List) healthLabelHistoryAdapter.getData());
        if (healthLabelHistoryEntity == null || (healthLabelDayEntity = (HealthLabelDayEntity) CollectionsKt.lastOrNull((List) healthLabelHistoryEntity.getMDayLabelData())) == null) {
            return;
        }
        g().loadLabelHistoryData(healthLabelDayEntity.getMLabelDate() - 1, healthLabelDayEntity.getMLabelDate(), healthLabelHistoryEntity);
    }

    private final void q() {
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBinding = this.binding;
        if (activityHealthLabelHistoryBinding == null) {
            activityHealthLabelHistoryBinding = null;
        }
        activityHealthLabelHistoryBinding.healthLabelHistoryDeleteLl.setVisibility(8);
        activityHealthLabelHistoryBinding.healthLabelHistoryDeleteIv.clearAnimation();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setStatusColor(this, false, !UtilsKt.isDarkMode(this), ColorExtKt.color(this, R.color.s38));
        ActivityHealthLabelHistoryBinding activityHealthLabelHistoryBindingInflate = ActivityHealthLabelHistoryBinding.inflate(getLayoutInflater());
        this.binding = activityHealthLabelHistoryBindingInflate;
        if (activityHealthLabelHistoryBindingInflate == null) {
            activityHealthLabelHistoryBindingInflate = null;
        }
        setContentView(activityHealthLabelHistoryBindingInflate.getRoot());
        String stringExtra = getIntent().getStringExtra("cf");
        if (stringExtra != null) {
            HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.TAG_LOGGING_V, (Map<String, String>) q.mapOf(new Pair("cf", stringExtra)));
        }
        initView();
        j();
    }

    @Override // com.huami.healthlabel.healthlabelhistory.adapter.ItemClickListener
    public void onItemClick(@NotNull final HealthLabelDayEntity item) {
        this.curItemEntry = item;
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment(item.getLabelText(), DateExtKt.millis2String(item.getMLabelDate(), new SimpleDateFormat("yyyy.MM.dd HH:mm", Locale.CHINA)));
        alertDialogFragment.setListener(new AlertDialogFragment.OnClickListener() { // from class: com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity$onItemClick$1$1
            @Override // com.huami.healthlabel.ui.AlertDialogFragment.OnClickListener
            public void onNegativeButtonClick() {
            }

            /* JADX WARN: Code duplicated, block: B:9:0x007f  */
            @Override // com.huami.healthlabel.ui.AlertDialogFragment.OnClickListener
            public void onPositiveButtonClick() {
                String labelText;
                if (!UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
                    UtilsKt.toast(R.string.health_label_delete_error);
                    return;
                }
                this.a.o();
                if (item.getLabelCount() > 1) {
                    if (m.endsWith$default(item.getLabelText(), "+" + item.getLabelCount(), false, 2, null)) {
                        String labelText2 = item.getLabelText();
                        int length = item.getLabelText().length() - ("+" + item.getLabelCount()).length();
                        Objects.requireNonNull(labelText2, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring = labelText2.substring(0, length);
                        Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type kotlin.CharSequence");
                        labelText = StringsKt__StringsKt.trim(strSubstring).toString();
                    } else {
                        labelText = item.getLabelText();
                    }
                } else {
                    labelText = item.getLabelText();
                }
                Pair pairTimeRange$default = DateExtKt.timeRange$default(item.getMLabelDate(), 0, 1, null);
                this.a.g().deleteLabelRecord(labelText, ((Number) pairTimeRange$default.getFirst()).longValue(), ((Number) pairTimeRange$default.getSecond()).longValue());
                HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.TAG_LOGGING_DELETE_C, CollectionsKt__CollectionsKt.arrayListOf(new Pair("id", Integer.valueOf(item.getLabelId())), new Pair("tag", labelText), new Pair("count", Integer.valueOf(item.getLabelCount()))));
            }
        });
        alertDialogFragment.show(getSupportFragmentManager(), "DeleteLabelRecord");
    }
}
