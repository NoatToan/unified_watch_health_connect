package com.xiaomi.hm.health.bodyfat.activity;

import android.R;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.helper.Resource;
import com.huami.arch.helper.Status;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bodyfat.activity.WeightRecordWithoutOwnerActivity;
import com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter;
import com.xiaomi.hm.health.bodyfat.adapter.MyViewHolder;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityWeightWithoutOwnerBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment;
import com.xiaomi.hm.health.bodyfat.model.WeightInfoWithoutOwner;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel;
import com.xiaomi.hm.health.bodyfat.worker.UploadWeightInfoWorker;
import com.xiaomi.hm.health.databases.model.UserInfos;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0016\u001a\u00060\u0012R\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightRecordWithoutOwnerActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityWeightWithoutOwnerBinding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityWeightWithoutOwnerBinding;", "binding", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "y", "Lkotlin/Lazy;", "getLoadingDialog", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/xiaomi/hm/health/bodyfat/activity/WeightRecordWithoutOwnerActivity$WeightRecordAdapter;", "z", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/bodyfat/activity/WeightRecordWithoutOwnerActivity$WeightRecordAdapter;", "adapter", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightRecordWithoutOwnerViewModel;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "o", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightRecordWithoutOwnerViewModel;", "viewModel", "<init>", "()V", "WeightRecordAdapter", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightRecordWithoutOwnerActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityWeightWithoutOwnerBinding binding;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightRecordWithoutOwnerActivity$WeightRecordAdapter;", "Lcom/xiaomi/hm/health/bodyfat/adapter/BaseRecyclerAdapter;", "Lcom/xiaomi/hm/health/bodyfat/model/WeightInfoWithoutOwner;", "Lcom/xiaomi/hm/health/bodyfat/adapter/MyViewHolder;", "holder", "item", "", "position", "", "onBindViewHolder", "", ParamKey.createTime, "removeByCreateTime", "layoutRes", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/activity/WeightRecordWithoutOwnerActivity;I)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public final class WeightRecordAdapter extends BaseRecyclerAdapter<WeightInfoWithoutOwner> {
        public WeightRecordAdapter(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(WeightRecordWithoutOwnerActivity weightRecordWithoutOwnerActivity, WeightInfoWithoutOwner weightInfoWithoutOwner, View view) {
            weightRecordWithoutOwnerActivity.o().deleteWeightRecords(weightInfoWithoutOwner == null ? null : Long.valueOf(weightInfoWithoutOwner.getCreateTime()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(final WeightInfoWithoutOwner weightInfoWithoutOwner, final WeightRecordWithoutOwnerActivity weightRecordWithoutOwnerActivity, View view) {
            if (weightInfoWithoutOwner == null) {
                return;
            }
            weightRecordWithoutOwnerActivity.getSupportFragmentManager().beginTransaction().add(R.id.content, ChooseUserFragment.INSTANCE.newInstance(new ChooseUserFragment.WeightData(weightInfoWithoutOwner.getWeight(), weightInfoWithoutOwner.getCreateTime(), weightInfoWithoutOwner.getImpedance(), 0.0f, 0, true, 24, null), new ChooseUserFragment.ChooseUserListener() { // from class: com.xiaomi.hm.health.bodyfat.activity.WeightRecordWithoutOwnerActivity$WeightRecordAdapter$onBindViewHolder$2$1$chooseUserFragment$1
                @Override // com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment.ChooseUserListener
                public void chooseUser(@NotNull UserInfos userInfos) {
                    weightRecordWithoutOwnerActivity.o().claimWeightRecords(weightInfoWithoutOwner, userInfos);
                }
            })).commit();
        }

        public final void removeByCreateTime(long createTime) {
            int pagerCount = getA();
            if (pagerCount <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (getItem(i).getCreateTime() == createTime) {
                    remove(i);
                    return;
                } else if (i2 >= pagerCount) {
                    return;
                } else {
                    i = i2;
                }
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter
        public void onBindViewHolder(@Nullable MyViewHolder holder, @SuppressLint({RecyclerView.TAG}) @Nullable final WeightInfoWithoutOwner item, int position) {
            View view;
            View view2;
            int weightUnit = BFCallback.getUnitManager().getWeightUnit();
            String weightValueStringForDisplay = HMWeightUtils.getWeightValueStringForDisplay(item == null ? 0.0f : item.getWeight(), weightUnit);
            String weightUnitString = BFCallback.getUnitManager().getWeightUnitString(weightUnit);
            if (holder != null) {
                holder.setText(com.xiaomi.hm.health.bodyfat.R.id.text_weight_value, Intrinsics.stringPlus(weightValueStringForDisplay, weightUnitString));
            }
            if (holder != null) {
                holder.setText(com.xiaomi.hm.health.bodyfat.R.id.text_date, BodyFatTimeUtils.INSTANCE.formatDate(WeightRecordWithoutOwnerActivity.this.getString(com.xiaomi.hm.health.bodyfat.R.string.date_Mdahhmm_unit_pattern), item == null ? 0L : ExtentionUtilsKt.millsToSecond(item.getCreateTime(), true)));
            }
            if (holder != null && (view2 = holder.getView(com.xiaomi.hm.health.bodyfat.R.id.text_delete)) != null) {
                final WeightRecordWithoutOwnerActivity weightRecordWithoutOwnerActivity = WeightRecordWithoutOwnerActivity.this;
                view2.setOnClickListener(new View.OnClickListener() { // from class: it8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        WeightRecordWithoutOwnerActivity.WeightRecordAdapter.c(weightRecordWithoutOwnerActivity, item, view3);
                    }
                });
            }
            if (holder == null || (view = holder.getView(com.xiaomi.hm.health.bodyfat.R.id.text_claim)) == null) {
                return;
            }
            final WeightRecordWithoutOwnerActivity weightRecordWithoutOwnerActivity2 = WeightRecordWithoutOwnerActivity.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: jt8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    WeightRecordWithoutOwnerActivity.WeightRecordAdapter.d(item, weightRecordWithoutOwnerActivity2, view3);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightRecordWithoutOwnerActivity$WeightRecordAdapter;", "Lcom/xiaomi/hm/health/bodyfat/activity/WeightRecordWithoutOwnerActivity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WeightRecordAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightRecordAdapter getA() {
            return WeightRecordWithoutOwnerActivity.this.new WeightRecordAdapter(com.xiaomi.hm.health.bodyfat.R.layout.item_weight_record_without_owner);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LoadingDialog> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            return new LoadingDialog(WeightRecordWithoutOwnerActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightRecordWithoutOwnerViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<WeightRecordWithoutOwnerViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightRecordWithoutOwnerViewModel getA() {
            return (WeightRecordWithoutOwnerViewModel) ViewModelProviders.of(WeightRecordWithoutOwnerActivity.this).get(WeightRecordWithoutOwnerViewModel.class);
        }
    }

    private final LoadingDialog getLoadingDialog() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    private final void initView() {
        setTitleText(com.xiaomi.hm.health.bodyfat.R.string.title_weight_record_claim);
        ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBinding = this.binding;
        Objects.requireNonNull(activityWeightWithoutOwnerBinding);
        activityWeightWithoutOwnerBinding.listWeightRecord.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBinding2 = this.binding;
        Objects.requireNonNull(activityWeightWithoutOwnerBinding2);
        activityWeightWithoutOwnerBinding2.listWeightRecord.setHasFixedSize(true);
        ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBinding3 = this.binding;
        Objects.requireNonNull(activityWeightWithoutOwnerBinding3);
        activityWeightWithoutOwnerBinding3.listWeightRecord.setAdapter(n());
        o().getWeightInfoRecords().observe(this, new Observer() { // from class: gt8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightRecordWithoutOwnerActivity.p(this.a, (Resource) obj);
            }
        });
        o().getDeleteResult().observe(this, new Observer() { // from class: ht8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightRecordWithoutOwnerActivity.q(this.a, (Resource) obj);
            }
        });
        o().m3436getWeightInfoRecords();
    }

    private final WeightRecordAdapter n() {
        return (WeightRecordAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightRecordWithoutOwnerViewModel o() {
        return (WeightRecordWithoutOwnerViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WeightRecordWithoutOwnerActivity weightRecordWithoutOwnerActivity, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            weightRecordWithoutOwnerActivity.getLoadingDialog().show();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            weightRecordWithoutOwnerActivity.getLoadingDialog().dismiss();
            return;
        }
        weightRecordWithoutOwnerActivity.getLoadingDialog().dismiss();
        weightRecordWithoutOwnerActivity.n().update((List) resource.getData());
        List list = (List) resource.getData();
        if (list == null) {
            return;
        }
        ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBinding = weightRecordWithoutOwnerActivity.binding;
        Objects.requireNonNull(activityWeightWithoutOwnerBinding);
        activityWeightWithoutOwnerBinding.textCount.setText(weightRecordWithoutOwnerActivity.getResources().getQuantityString(com.xiaomi.hm.health.bodyfat.R.plurals.tips_number_weight_record_claim, list.size(), Integer.valueOf(list.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(WeightRecordWithoutOwnerActivity weightRecordWithoutOwnerActivity, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            weightRecordWithoutOwnerActivity.getLoadingDialog().show();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            CustomToast.makeText(weightRecordWithoutOwnerActivity, resource.getMessage(), 0).show();
            weightRecordWithoutOwnerActivity.getLoadingDialog().dismiss();
            return;
        }
        weightRecordWithoutOwnerActivity.getLoadingDialog().dismiss();
        Long l = (Long) resource.getData();
        if (l == null) {
            return;
        }
        weightRecordWithoutOwnerActivity.n().removeByCreateTime(l.longValue());
        int pagerCount = weightRecordWithoutOwnerActivity.n().getA();
        if (pagerCount == 0) {
            ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBinding = weightRecordWithoutOwnerActivity.binding;
            Objects.requireNonNull(activityWeightWithoutOwnerBinding);
            activityWeightWithoutOwnerBinding.listWeightRecord.setVisibility(8);
        } else {
            ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBinding2 = weightRecordWithoutOwnerActivity.binding;
            Objects.requireNonNull(activityWeightWithoutOwnerBinding2);
            activityWeightWithoutOwnerBinding2.listWeightRecord.setVisibility(0);
        }
        ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBinding3 = weightRecordWithoutOwnerActivity.binding;
        Objects.requireNonNull(activityWeightWithoutOwnerBinding3);
        activityWeightWithoutOwnerBinding3.textCount.setText(weightRecordWithoutOwnerActivity.getResources().getQuantityString(com.xiaomi.hm.health.bodyfat.R.plurals.tips_number_weight_record_claim, pagerCount, Integer.valueOf(pagerCount)));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        ActivityWeightWithoutOwnerBinding activityWeightWithoutOwnerBindingInflate = ActivityWeightWithoutOwnerBinding.inflate(getLayoutInflater());
        this.binding = activityWeightWithoutOwnerBindingInflate;
        Objects.requireNonNull(activityWeightWithoutOwnerBindingInflate);
        setContentView(activityWeightWithoutOwnerBindingInflate.getRoot());
        BFTitleStyleKt.setTitleStyle$default(this, null, null, null, 0, BFCallback.getInstance().enableMiDongFlavor(), 15, null);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WorkManager.getInstance(this).enqueueUniqueWork(ParamKey.uploadWorker, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(UploadWeightInfoWorker.class).build());
    }
}
