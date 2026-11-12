package com.huami.healthlabel.healthlabelmanager;

import android.content.ComponentCallbacks;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.R;
import com.huami.healthlabel.databinding.ActivityHealthLabelManagerBinding;
import com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity;
import com.huami.healthlabel.healthlabelmanager.HealthLabelManagerViewModel;
import com.huami.healthlabel.healthlabelmanager.adapter.HealthLabelAdapter;
import com.huami.healthlabel.healthlabelmanager.adapter.HealthLabelEditAdapter;
import com.huami.healthlabel.healthlabelmanager.adapter.HealthLabelEntity;
import com.huami.healthlabel.healthlabelmanager.helper.ItemDragHelperCallback;
import com.huami.healthlabel.healthlabelmanager.helper.OnItemDeleteListener;
import com.huami.healthlabel.ui.custom.InputView;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bG\u0010HJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J$\u0010\u0013\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0002J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R&\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000f0.j\b\u0012\u0004\u0012\u00020\u000f`/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00108\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010E¨\u0006I"}, d2 = {"Lcom/huami/healthlabel/healthlabelmanager/HealthLabelManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/healthlabel/ui/custom/InputView$InputResultCallback;", "", "initView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelAdapter;", "adapter", SOAP.XMLNS, GoogleApiAvailabilityLight.b, b.r, "o", "z", "", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEntity;", "showLabelDatas", z.j, "notShowLabelDatas", "l", "", "isEditMode", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "position", hl.k, "y", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "text", "textColor", "onInputResult", "onBackPressed", "Lcom/huami/healthlabel/databinding/ActivityHealthLabelManagerBinding;", "a", "Lcom/huami/healthlabel/databinding/ActivityHealthLabelManagerBinding;", "binding", "b", "Ljava/util/List;", "mShowLabelDatas", "c", "mNotShowLabelDatas", GoogleApiAvailabilityLight.a, "mLabelDatas", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "Ljava/util/ArrayList;", "markDeleteLabels", "Lcom/huami/healthlabel/healthlabelmanager/HealthLabelManagerViewModel;", "f", "Lkotlin/Lazy;", "m", "()Lcom/huami/healthlabel/healthlabelmanager/HealthLabelManagerViewModel;", "mViewModel", "g", "Z", "mIsEditMode", "h", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelAdapter;", "mShowAdapter", "i", "mNotShowAdapter", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEditAdapter;", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEditAdapter;", "mLabelEditAdapter", "Lcom/huami/healthlabel/ui/custom/InputView;", "Lcom/huami/healthlabel/ui/custom/InputView;", "inputView", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelManagerActivity extends AppCompatActivity implements InputView.InputResultCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ActivityHealthLabelManagerBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<HealthLabelEntity> mShowLabelDatas = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<HealthLabelEntity> mNotShowLabelDatas = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<HealthLabelEntity> mLabelDatas = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<HealthLabelEntity> markDeleteLabels = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mIsEditMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private HealthLabelAdapter mShowAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private HealthLabelAdapter mNotShowAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private HealthLabelEditAdapter mLabelEditAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private InputView inputView;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthLabelManagerActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthLabelManagerViewModel>() { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.healthlabel.healthlabelmanager.HealthLabelManagerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HealthLabelManagerViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(HealthLabelManagerViewModel.class), function0, objArr);
            }
        });
    }

    private final void A(boolean isEditMode) {
        this.mIsEditMode = isEditMode;
        ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding = this.binding;
        if (activityHealthLabelManagerBinding == null) {
            activityHealthLabelManagerBinding = null;
        }
        activityHealthLabelManagerBinding.healthLabelManagerCancel.setVisibility(isEditMode ? 0 : 8);
        activityHealthLabelManagerBinding.healthLabelManagerDone.setVisibility(isEditMode ? 0 : 8);
        activityHealthLabelManagerBinding.healthLabelManagerEdit.setVisibility(isEditMode ? 8 : 0);
        activityHealthLabelManagerBinding.healthLabelManagerBack.setVisibility(isEditMode ? 8 : 0);
        activityHealthLabelManagerBinding.healthLabelManagerRecyclerView.setVisibility(isEditMode ? 0 : 8);
        activityHealthLabelManagerBinding.layoutHealthLabelManager.getRoot().setVisibility(isEditMode ? 8 : 0);
        activityHealthLabelManagerBinding.healthLabelManagerAddLayout.setVisibility(isEditMode ? 8 : 0);
    }

    private final void initView() {
        final ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding = this.binding;
        if (activityHealthLabelManagerBinding == null) {
            activityHealthLabelManagerBinding = null;
        }
        this.mShowAdapter = new HealthLabelAdapter(this.mShowLabelDatas);
        this.mNotShowAdapter = new HealthLabelAdapter(this.mNotShowLabelDatas);
        HealthLabelAdapter healthLabelAdapter = this.mShowAdapter;
        if (healthLabelAdapter != null) {
            s(activityHealthLabelManagerBinding.layoutHealthLabelManager.healthLabelManagerShowRecycler, healthLabelAdapter);
        }
        HealthLabelAdapter healthLabelAdapter2 = this.mNotShowAdapter;
        if (healthLabelAdapter2 != null) {
            s(activityHealthLabelManagerBinding.layoutHealthLabelManager.healthLabelManagerNotShowRecycler, healthLabelAdapter2);
        }
        activityHealthLabelManagerBinding.layoutHealthLabelManager.healthLabelManagerShowRecycler.setNestedScrollingEnabled(false);
        activityHealthLabelManagerBinding.layoutHealthLabelManager.healthLabelManagerNotShowRecycler.setNestedScrollingEnabled(false);
        n();
        activityHealthLabelManagerBinding.healthLabelManagerBack.setOnClickListener(new View.OnClickListener() { // from class: iw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelManagerActivity.t(this.a, view);
            }
        });
        activityHealthLabelManagerBinding.healthLabelManagerAddView.setOnClickListener(new View.OnClickListener() { // from class: mw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelManagerActivity.u(this.a, activityHealthLabelManagerBinding, view);
            }
        });
        activityHealthLabelManagerBinding.healthLabelManagerEdit.setOnClickListener(new View.OnClickListener() { // from class: lw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelManagerActivity.v(this.a, view);
            }
        });
        activityHealthLabelManagerBinding.healthLabelManagerDone.setOnClickListener(new View.OnClickListener() { // from class: kw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelManagerActivity.w(this.a, view);
            }
        });
        activityHealthLabelManagerBinding.healthLabelManagerCancel.setOnClickListener(new View.OnClickListener() { // from class: jw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelManagerActivity.x(this.a, view);
            }
        });
    }

    private final void j(List<HealthLabelEntity> showLabelDatas) {
        this.mShowLabelDatas.add(0, showLabelDatas.get(0));
        HealthLabelAdapter healthLabelAdapter = this.mShowAdapter;
        if (healthLabelAdapter != null) {
            healthLabelAdapter.setNewData(this.mShowLabelDatas);
        }
        HealthLabelEditAdapter healthLabelEditAdapter = this.mLabelEditAdapter;
        if (healthLabelEditAdapter != null && healthLabelEditAdapter.getNotInHomePosition() > 0) {
            this.mLabelDatas.add(1, showLabelDatas.get(0));
            HealthLabelEditAdapter healthLabelEditAdapter2 = this.mLabelEditAdapter;
            if (healthLabelEditAdapter2 == null) {
                return;
            }
            healthLabelEditAdapter2.setNewData(this.mLabelDatas);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int position) {
        if (position < 0) {
            return;
        }
        HealthLabelEditAdapter healthLabelEditAdapter = this.mLabelEditAdapter;
        if (healthLabelEditAdapter != null) {
            HealthLabelEntity healthLabelEntity = (HealthLabelEntity) healthLabelEditAdapter.getData().get(position);
            HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.TAG_MANAGE_EDITOR_DELETE_C, (Map<String, String>) r.mapOf(TuplesKt.to("id", String.valueOf(healthLabelEntity.getLabelId())), TuplesKt.to("tag", healthLabelEntity.getLabelText())));
            this.markDeleteLabels.add(healthLabelEntity);
        }
        HealthLabelEditAdapter healthLabelEditAdapter2 = this.mLabelEditAdapter;
        if (healthLabelEditAdapter2 == null) {
            return;
        }
        healthLabelEditAdapter2.remove(position);
    }

    private final void l(List<HealthLabelEntity> showLabelDatas, List<HealthLabelEntity> notShowLabelDatas) {
        A(false);
        this.mShowLabelDatas = showLabelDatas;
        this.mNotShowLabelDatas = notShowLabelDatas;
        HealthLabelAdapter healthLabelAdapter = this.mShowAdapter;
        if (healthLabelAdapter != null) {
            healthLabelAdapter.setNewData(showLabelDatas);
        }
        HealthLabelAdapter healthLabelAdapter2 = this.mNotShowAdapter;
        if (healthLabelAdapter2 == null) {
            return;
        }
        healthLabelAdapter2.setNewData(this.mNotShowLabelDatas);
    }

    private final HealthLabelManagerViewModel m() {
        return (HealthLabelManagerViewModel) this.mViewModel.getValue();
    }

    private final void n() {
        o();
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemDragHelperCallback());
        ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding = this.binding;
        if (activityHealthLabelManagerBinding == null) {
            activityHealthLabelManagerBinding = null;
        }
        itemTouchHelper.attachToRecyclerView(activityHealthLabelManagerBinding.healthLabelManagerRecyclerView);
        this.mLabelEditAdapter = new HealthLabelEditAdapter(itemTouchHelper, this.mLabelDatas);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding2 = this.binding;
        if (activityHealthLabelManagerBinding2 == null) {
            activityHealthLabelManagerBinding2 = null;
        }
        activityHealthLabelManagerBinding2.healthLabelManagerRecyclerView.setLayoutManager(gridLayoutManager);
        HealthLabelEditAdapter healthLabelEditAdapter = this.mLabelEditAdapter;
        if (healthLabelEditAdapter != null) {
            healthLabelEditAdapter.setItemDeleteListener(new OnItemDeleteListener() { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity$initEditRecycler$1
                @Override // com.huami.healthlabel.healthlabelmanager.helper.OnItemDeleteListener
                public void onItemDelete(int position) {
                    HealthLabelEditAdapter healthLabelEditAdapter2 = this.a.mLabelEditAdapter;
                    if ((healthLabelEditAdapter2 == null ? -1 : healthLabelEditAdapter2.getNotInHomePosition()) > 21 || position > 20) {
                        this.a.k(position);
                    } else {
                        IconToast.showToast(this.a.getApplicationContext(), R.drawable.ic_health_label_warning_toast, R.string.health_label_show_delete, 0);
                    }
                }
            });
        }
        ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding3 = this.binding;
        if (activityHealthLabelManagerBinding3 == null) {
            activityHealthLabelManagerBinding3 = null;
        }
        activityHealthLabelManagerBinding3.healthLabelManagerRecyclerView.setAdapter(this.mLabelEditAdapter);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity$initEditRecycler$2
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                HealthLabelEditAdapter healthLabelEditAdapter2 = this.a.mLabelEditAdapter;
                Integer numValueOf = healthLabelEditAdapter2 == null ? null : Integer.valueOf(healthLabelEditAdapter2.getItemViewType(position));
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    return 3;
                }
                return (numValueOf != null && numValueOf.intValue() == 3) ? 3 : 1;
            }
        });
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(this, 0);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.shape_item_decoration);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.shape_item_decoration_horizontal_5);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
            ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding4 = this.binding;
            if (activityHealthLabelManagerBinding4 == null) {
                activityHealthLabelManagerBinding4 = null;
            }
            activityHealthLabelManagerBinding4.healthLabelManagerRecyclerView.addItemDecoration(dividerItemDecoration);
        }
        if (drawable2 == null) {
            return;
        }
        dividerItemDecoration2.setDrawable(drawable2);
        ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding5 = this.binding;
        (activityHealthLabelManagerBinding5 != null ? activityHealthLabelManagerBinding5 : null).healthLabelManagerRecyclerView.addItemDecoration(dividerItemDecoration2);
    }

    private final void o() {
        HealthLabelEntity healthLabelEntity = new HealthLabelEntity(1);
        HealthLabelEntity healthLabelEntity2 = new HealthLabelEntity(3);
        this.mLabelDatas.add(healthLabelEntity);
        this.mLabelDatas.add(healthLabelEntity2);
    }

    private final void p() {
        m().getLabelData().observe(this, new Observer() { // from class: ow3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthLabelManagerActivity.q(this.a, (List) obj);
            }
        });
        m().getUpdateLabelState().observe(this, new Observer() { // from class: nw3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthLabelManagerActivity.r(this.a, (HealthLabelManagerViewModel.UpdateLabelState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HealthLabelManagerActivity healthLabelManagerActivity, List list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((HealthLabelEntity) obj).getIsShow()) {
                    arrayList.add(obj);
                }
            }
            List<HealthLabelEntity> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            healthLabelManagerActivity.mShowLabelDatas = mutableList;
            HealthLabelAdapter healthLabelAdapter = healthLabelManagerActivity.mShowAdapter;
            if (healthLabelAdapter != null) {
                healthLabelAdapter.setNewData(mutableList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!((HealthLabelEntity) obj2).getIsShow()) {
                    arrayList2.add(obj2);
                }
            }
            List<HealthLabelEntity> mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            healthLabelManagerActivity.mNotShowLabelDatas = mutableList2;
            HealthLabelAdapter healthLabelAdapter2 = healthLabelManagerActivity.mNotShowAdapter;
            if (healthLabelAdapter2 != null) {
                healthLabelAdapter2.setNewData(mutableList2);
            }
            healthLabelManagerActivity.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(HealthLabelManagerActivity healthLabelManagerActivity, HealthLabelManagerViewModel.UpdateLabelState updateLabelState) {
        if (!updateLabelState.isUpdateLabelSuccess()) {
            IconToast.showToast(healthLabelManagerActivity.getApplicationContext(), R.drawable.ic_health_label_warning_toast, R.string.health_label_save_network_error, 0);
        } else if (updateLabelState.isAddLabel()) {
            healthLabelManagerActivity.j(updateLabelState.getShowLabelDatas());
        } else {
            healthLabelManagerActivity.l(updateLabelState.getShowLabelDatas(), updateLabelState.getNotShowLabelDatas());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager, com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity$initShowRecycler$gridLayoutManager$1] */
    private final void s(RecyclerView recyclerView, final HealthLabelAdapter adapter) {
        recyclerView.setAdapter(adapter);
        final int iScreenWidth = UtilsKt.screenWidth() - NumberExtKt.dp(60);
        final Paint paint = new Paint();
        paint.setTextSize(NumberExtKt.sp(14));
        final ?? r2 = new GridLayoutManager(iScreenWidth) { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity$initShowRecycler$gridLayoutManager$1
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.a, iScreenWidth);
                this.b = iScreenWidth;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        final int iDp = NumberExtKt.dp(20) + NumberExtKt.dp(10);
        r2.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity$initShowRecycler$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                int spanCount = getSpanCount();
                int iMeasureText = (int) (paint.measureText(adapter.getData().get(position).getLabelText()) + iDp);
                return iMeasureText >= spanCount ? spanCount : iMeasureText + 1;
            }
        });
        recyclerView.setLayoutManager(r2);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(this, 0);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.shape_item_decoration_15);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.shape_item_decoration_horizontal);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration);
        }
        if (drawable2 == null) {
            return;
        }
        dividerItemDecoration2.setDrawable(drawable2);
        recyclerView.addItemDecoration(dividerItemDecoration2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HealthLabelManagerActivity healthLabelManagerActivity, View view) {
        healthLabelManagerActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HealthLabelManagerActivity healthLabelManagerActivity, ActivityHealthLabelManagerBinding activityHealthLabelManagerBinding, View view) {
        if (healthLabelManagerActivity.inputView == null) {
            healthLabelManagerActivity.inputView = new InputView(healthLabelManagerActivity, healthLabelManagerActivity);
        }
        healthLabelManagerActivity.inputView.showAtLocation(activityHealthLabelManagerBinding.healthLabelContainer, 80, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(HealthLabelManagerActivity healthLabelManagerActivity, View view) {
        healthLabelManagerActivity.A(true);
        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.TAG_MANAGE_EDITOR_C, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HealthLabelManagerActivity healthLabelManagerActivity, View view) {
        HealthLabelEditAdapter healthLabelEditAdapter = healthLabelManagerActivity.mLabelEditAdapter;
        if (healthLabelEditAdapter == null) {
            return;
        }
        int notInHomePosition = healthLabelEditAdapter.getNotInHomePosition();
        List<T> data = healthLabelEditAdapter.getData();
        int size = data.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (1 < notInHomePosition) {
            int i = 1;
            while (true) {
                int i2 = i + 1;
                arrayList.add(data.get(i));
                if (i2 >= notInHomePosition) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        int i3 = notInHomePosition + 1;
        if (i3 < size) {
            while (true) {
                int i4 = i3 + 1;
                arrayList2.add(data.get(i3));
                if (i4 >= size) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        HealthLabelManagerViewModel.updateLabels$default(healthLabelManagerActivity.m(), arrayList, arrayList2, false, 4, null);
        healthLabelManagerActivity.m().markDeleteLabels(healthLabelManagerActivity.markDeleteLabels);
        healthLabelManagerActivity.markDeleteLabels.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(HealthLabelManagerActivity healthLabelManagerActivity, View view) {
        healthLabelManagerActivity.y();
    }

    private final void y() {
        A(false);
        z();
    }

    private final void z() {
        HealthLabelEditAdapter healthLabelEditAdapter = this.mLabelEditAdapter;
        if (healthLabelEditAdapter == null) {
            return;
        }
        this.mLabelDatas.clear();
        this.mLabelDatas.add(new HealthLabelEntity(1));
        this.mLabelDatas.addAll(this.mShowLabelDatas);
        this.mLabelDatas.add(new HealthLabelEntity(3));
        this.mLabelDatas.addAll(this.mNotShowLabelDatas);
        healthLabelEditAdapter.setNewData(this.mLabelDatas);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mIsEditMode) {
            y();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setStatusColor(this, false, !UtilsKt.isDarkMode(this), ColorExtKt.color(this, R.color.s38));
        ActivityHealthLabelManagerBinding activityHealthLabelManagerBindingInflate = ActivityHealthLabelManagerBinding.inflate(getLayoutInflater());
        this.binding = activityHealthLabelManagerBindingInflate;
        if (activityHealthLabelManagerBindingInflate == null) {
            activityHealthLabelManagerBindingInflate = null;
        }
        setContentView(activityHealthLabelManagerBindingInflate.getRoot());
        initView();
        p();
        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.TAG_MANAGE_V, null, 2, null);
    }

    @Override // com.huami.healthlabel.ui.custom.InputView.InputResultCallback
    public void onInputResult(@NotNull String text, @NotNull String textColor) {
        Object next;
        HealthLabelEntity healthLabelEntity = new HealthLabelEntity(2);
        healthLabelEntity.setLabelText(text);
        healthLabelEntity.setLabelColor(textColor);
        healthLabelEntity.setShow(true);
        healthLabelEntity.setLabelId(-1);
        Iterator<T> it2 = this.mShowLabelDatas.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((HealthLabelEntity) next).getLabelText(), text));
        HealthLabelEntity healthLabelEntity2 = (HealthLabelEntity) next;
        if (healthLabelEntity2 != null) {
            healthLabelEntity.setLabelId(healthLabelEntity2.getLabelId());
        }
        ArrayList arrayList = new ArrayList();
        List<HealthLabelEntity> list = this.mShowLabelDatas;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((HealthLabelEntity) obj).getLabelText(), text)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.add(0, healthLabelEntity);
        m().updateLabels(arrayList, this.mNotShowLabelDatas, true);
    }
}
