package com.huami.healthlabel.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.R;
import com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity;
import com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity;
import com.huami.healthlabel.ui.HomeLabelFragment;
import com.huami.healthlabel.ui.adapter.LabelAdapter;
import com.huami.healthlabel.ui.anim.FillAfterAlphaAnimation;
import com.huami.healthlabel.ui.anim.SelfRotateAnimation;
import com.huami.healthlabel.ui.anim.SelfScaleAnimation;
import com.huami.healthlabel.ui.custom.AdapterAnimationListener;
import com.huami.healthlabel.ui.custom.InputView;
import com.huami.healthlabel.ui.viewModel.FirstLoad;
import com.huami.healthlabel.ui.viewModel.HomeLabelViewModel;
import com.huami.healthlabel.ui.viewModel.ManagerLabel;
import com.huami.healthlabel.ui.viewModel.RecordLabel;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.healthlabel.utils.HealthLabelHelper;
import com.huami.healthlabel.utils.ReLoginListener;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.DateExtKt;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import com.huami.lib.healthlabel.service.MixLabel;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.e;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\b\u00102\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bh\u0010iB\t\b\u0016¢\u0006\u0004\bh\u0010jJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016J\u001a\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u001a\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010 H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0012H\u0016R\u0018\u00102\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00101R\u0016\u00109\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u0010;\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00101R\u0016\u0010=\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00101R\u0016\u0010?\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00101R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u00101R\u0016\u0010L\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u00101R\u0016\u0010N\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u00101R\u0016\u0010P\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u00101R\u0016\u0010(\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0016\u0010U\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u0016\u0010V\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0016\u0010X\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u00101R\u0016\u0010Y\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0016\u0010Z\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u00101R\u001d\u0010^\u001a\u00020[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\bW\u0010]R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010aR\u0016\u0010e\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010dR\u0016\u0010g\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010f¨\u0006k"}, d2 = {"Lcom/huami/healthlabel/ui/HomeLabelFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/huami/healthlabel/ui/adapter/LabelAdapter$ItemListener;", "Lcom/huami/healthlabel/ui/custom/InputView$InputResultCallback;", "", "x", "i", "v", "", "Lcom/huami/lib/healthlabel/service/MixLabel;", "labelDatas", SOAP.XMLNS, "", "loadFromDb", "isEmpty", "t", b.r, DTransferConstants.SEARCH_KEY, "", "o", "u", "y", "w", "C", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "text", "textColor", "onInputResult", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Landroidx/fragment/app/FragmentManager;", "manager", "tag", "show", "dismiss", "onStart", "position", "onItemClick", "onItemLongClick", "a", "Landroid/view/View;", "headerView", "b", LogUtil.I, "barHeight", "c", "editView", GoogleApiAvailabilityLight.a, "recordView", "e", "closeView", "f", "addNewLabelView", "g", "labelView", "Landroidx/recyclerview/widget/RecyclerView;", "h", "Landroidx/recyclerview/widget/RecyclerView;", "labelRv", "loadingLl", "Landroid/widget/ImageView;", z.j, "Landroid/widget/ImageView;", "loadingIv", hl.k, "retryLl", "l", "retryBt", "m", "contentSv", GoogleApiAvailabilityLight.b, "blurIv", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "Lcom/huami/healthlabel/ui/adapter/LabelAdapter;", "Lcom/huami/healthlabel/ui/adapter/LabelAdapter;", "labelAdapter", "labelHomeLl", "r", "labelHomeCl", "historyDeleteLl", "historyDeleteIv", "Lcom/huami/healthlabel/ui/viewModel/HomeLabelViewModel;", "Lkotlin/Lazy;", "()Lcom/huami/healthlabel/ui/viewModel/HomeLabelViewModel;", "labelModel", "Ljava/util/List;", "Lcom/huami/healthlabel/ui/custom/InputView;", "Lcom/huami/healthlabel/ui/custom/InputView;", "inputView", "", "J", "useLongTime", "Z", "firstLoad", "<init>", "(Landroid/view/View;I)V", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HomeLabelFragment extends DialogFragment implements LabelAdapter.ItemListener, InputView.InputResultCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final View headerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int barHeight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private View editView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private View recordView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private View closeView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private View addNewLabelView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private View labelView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private RecyclerView labelRv;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private View loadingLl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ImageView loadingIv;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View retryLl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private View retryBt;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private View contentSv;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private View blurIv;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private FlexboxLayoutManager manager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private LabelAdapter labelAdapter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private View labelHomeLl;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private View labelHomeCl;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private View historyDeleteLl;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private View historyDeleteIv;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy labelModel;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final List<MixLabel> labelDatas;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private InputView inputView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long useLongTime;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean firstLoad;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeLabelFragment(@Nullable View view, int i) {
        this.headerView = view;
        this.barHeight = i;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$special$$inlined$viewModel$default$1
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
        this.labelModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HomeLabelViewModel>() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.healthlabel.ui.viewModel.HomeLabelViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HomeLabelViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(HomeLabelViewModel.class), function0, objArr);
            }
        });
        this.labelDatas = new ArrayList();
        this.useLongTime = System.currentTimeMillis();
        this.firstLoad = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final HomeLabelFragment homeLabelFragment, HomeLabelViewModel.LoadData loadData) {
        if (loadData.getLoadFromDb()) {
            return;
        }
        homeLabelFragment.t(loadData.getLoadFromDb(), loadData.getDatas().isEmpty());
        homeLabelFragment.labelDatas.clear();
        homeLabelFragment.labelDatas.addAll(loadData.getDatas());
        LabelAdapter labelAdapter = homeLabelFragment.labelAdapter;
        if (labelAdapter == null) {
            labelAdapter = null;
        }
        labelAdapter.submitList(loadData.getDatas(), new Runnable() { // from class: q84
            @Override // java.lang.Runnable
            public final void run() {
                HomeLabelFragment.B(this.a);
            }
        });
        homeLabelFragment.s(homeLabelFragment.labelDatas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HomeLabelFragment homeLabelFragment) {
        homeLabelFragment.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        View view = this.historyDeleteLl;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        View view2 = this.historyDeleteIv;
        (view2 != null ? view2 : null).clearAnimation();
    }

    private final void i() {
        View view = this.addNewLabelView;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: l84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeLabelFragment.j(this.a, view2);
            }
        });
        View view2 = this.recordView;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: k84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                HomeLabelFragment.k(this.a, view3);
            }
        });
        View view3 = this.closeView;
        if (view3 == null) {
            view3 = null;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: m84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                HomeLabelFragment.l(this.a, view4);
            }
        });
        View view4 = this.editView;
        if (view4 == null) {
            view4 = null;
        }
        view4.setOnClickListener(new View.OnClickListener() { // from class: j84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                HomeLabelFragment.m(this.a, view5);
            }
        });
        View view5 = this.retryBt;
        (view5 != null ? view5 : null).setOnClickListener(new View.OnClickListener() { // from class: n84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                HomeLabelFragment.n(this.a, view6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HomeLabelFragment homeLabelFragment, View view) {
        if (homeLabelFragment.labelDatas.isEmpty() && UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
            homeLabelFragment.r().retryLoad();
        }
        if (homeLabelFragment.inputView == null) {
            homeLabelFragment.inputView = new InputView(homeLabelFragment.getContext(), homeLabelFragment);
        }
        InputView inputView = homeLabelFragment.inputView;
        View view2 = homeLabelFragment.labelView;
        if (view2 == null) {
            view2 = null;
        }
        inputView.showAtLocation(view2, 80, 0, 0);
        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_ADD_C, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HomeLabelFragment homeLabelFragment, View view) {
        homeLabelFragment.r().hasHealthRecordCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HomeLabelFragment homeLabelFragment, View view) {
        homeLabelFragment.q();
        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_BACK_C, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HomeLabelFragment homeLabelFragment, View view) {
        homeLabelFragment.r().hasManagerLabelCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HomeLabelFragment homeLabelFragment, View view) {
        homeLabelFragment.x();
        homeLabelFragment.r().retryLoad();
    }

    private final int o() {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Context context = getContext();
            Object systemService = context == null ? null : context.getSystemService("window");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return -1;
        }
    }

    private final void p() {
        View view = this.blurIv;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        View view2 = this.headerView;
        if (view2 != null) {
            view2.startAnimation(new SelfScaleAnimation(0.0f, 0.0f, 0L, 0, 15, null));
        }
        SelfRotateAnimation selfRotateAnimation = new SelfRotateAnimation(45.0f, 0.0f, 0L, 0, 12, null);
        View view3 = this.recordView;
        if (view3 == null) {
            view3 = null;
        }
        view3.setAnimation(selfRotateAnimation);
        View view4 = this.closeView;
        if (view4 == null) {
            view4 = null;
        }
        view4.setAnimation(selfRotateAnimation);
        View view5 = this.addNewLabelView;
        if (view5 == null) {
            view5 = null;
        }
        view5.setAnimation(selfRotateAnimation);
        View view6 = this.labelView;
        (view6 != null ? view6 : null).startAnimation(new FillAfterAlphaAnimation(0.0f, 0.0f, 500L, 3, null));
    }

    private final void q() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new SelfRotateAnimation(0.0f, 0.0f, 0L, 0, 15, null));
        animationSet.addAnimation(new FillAfterAlphaAnimation(1.0f, 0.0f, 0L, 4, null));
        animationSet.setFillAfter(true);
        View view = this.closeView;
        if (view == null) {
            view = null;
        }
        view.clearAnimation();
        View view2 = this.closeView;
        if (view2 == null) {
            view2 = null;
        }
        view2.setAnimation(animationSet);
        View view3 = this.recordView;
        if (view3 == null) {
            view3 = null;
        }
        view3.setAnimation(animationSet);
        View view4 = this.addNewLabelView;
        if (view4 == null) {
            view4 = null;
        }
        view4.setAnimation(animationSet);
        View view5 = this.labelView;
        View view6 = view5 != null ? view5 : null;
        view6.clearAnimation();
        FillAfterAlphaAnimation fillAfterAlphaAnimation = new FillAfterAlphaAnimation(1.0f, 0.0f, 500L);
        fillAfterAlphaAnimation.setAnimationListener(new AdapterAnimationListener() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$execExitAnimation$3$1$1
            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation animation) {
                this.a.dismiss();
            }
        });
        Unit unit = Unit.INSTANCE;
        view6.startAnimation(fillAfterAlphaAnimation);
        View view7 = this.headerView;
        if (view7 == null) {
            return;
        }
        view7.startAnimation(new SelfScaleAnimation(0.7f, 1.0f, 0L, 0, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeLabelViewModel r() {
        return (HomeLabelViewModel) this.labelModel.getValue();
    }

    private final void s(List<MixLabel> labelDatas) {
        if (labelDatas.isEmpty() || !this.firstLoad) {
            return;
        }
        this.firstLoad = false;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(labelDatas, 10));
        for (MixLabel mixLabel : labelDatas) {
            arrayList.add(new Triple(mixLabel.getLabelText(), Integer.valueOf(mixLabel.getLabelId()), mixLabel.getReason()));
        }
        HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.HOME_TAG_V, (Map<String, String>) q.mapOf(new Pair(HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, arrayList.toString())));
    }

    private final void t(boolean loadFromDb, boolean isEmpty) {
        if (loadFromDb && isEmpty) {
            return;
        }
        ImageView imageView = this.loadingIv;
        if (imageView == null) {
            imageView = null;
        }
        imageView.clearAnimation();
        View view = this.loadingLl;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        if (isEmpty) {
            View view2 = this.retryLl;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.contentSv;
            (view3 != null ? view3 : null).setVisibility(8);
            return;
        }
        View view4 = this.retryLl;
        if (view4 == null) {
            view4 = null;
        }
        view4.setVisibility(8);
        View view5 = this.contentSv;
        (view5 != null ? view5 : null).setVisibility(0);
    }

    private final void u() {
        RecyclerView recyclerView = this.labelRv;
        if (recyclerView == null) {
            recyclerView = null;
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.setJustifyContent(0);
        flexboxLayoutManager.setAlignItems(4);
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setMaxLine(3);
        this.manager = flexboxLayoutManager;
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(flexboxLayoutManager);
        LabelAdapter labelAdapter = new LabelAdapter(this, false, 2, null);
        this.labelAdapter = labelAdapter;
        recyclerView.setAdapter(labelAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$initRv$1$3

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private int scrollLength;

            public final int getScrollLength() {
                return this.scrollLength;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
                if (newState == 0) {
                    if (Math.abs(this.scrollLength) >= UtilsKt.screenWidth() / 3) {
                        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_SLIDE_C, null, 2, null);
                    }
                    this.scrollLength = 0;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView2, int dx, int dy) {
                this.scrollLength += dx;
            }

            public final void setScrollLength(int i) {
                this.scrollLength = i;
            }
        });
    }

    private final void v() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setGravity(48);
    }

    private final void w() {
        View view = this.historyDeleteLl;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        View view2 = this.historyDeleteIv;
        View view3 = view2 != null ? view2 : null;
        final SelfRotateAnimation selfRotateAnimation = new SelfRotateAnimation(0.0f, 360.0f, 500L, -1);
        selfRotateAnimation.setAnimationListener(new AdapterAnimationListener() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$loadDeleteAnimation$1$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private long startTime = System.currentTimeMillis();

            public final long getStartTime() {
                return this.startTime;
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
                if (System.currentTimeMillis() - this.startTime > 30000) {
                    selfRotateAnimation.cancel();
                    View view4 = this.historyDeleteIv;
                    if (view4 == null) {
                        view4 = null;
                    }
                    view4.setVisibility(8);
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
        view3.startAnimation(selfRotateAnimation);
    }

    private final void x() {
        View view = this.loadingLl;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        View view2 = this.contentSv;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(8);
        View view3 = this.retryLl;
        if (view3 == null) {
            view3 = null;
        }
        view3.setVisibility(8);
        ImageView imageView = this.loadingIv;
        ImageView imageView2 = imageView != null ? imageView : null;
        final SelfRotateAnimation selfRotateAnimation = new SelfRotateAnimation(0.0f, 360.0f, 500L, -1);
        selfRotateAnimation.setAnimationListener(new AdapterAnimationListener() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$loadingView$1$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private long startTime = System.currentTimeMillis();

            public final long getStartTime() {
                return this.startTime;
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
                if (System.currentTimeMillis() - this.startTime > 30000) {
                    selfRotateAnimation.cancel();
                    View view4 = this.loadingLl;
                    if (view4 == null) {
                        view4 = null;
                    }
                    view4.setVisibility(8);
                    View view5 = this.retryLl;
                    if (view5 == null) {
                        view5 = null;
                    }
                    view5.setVisibility(0);
                    View view6 = this.contentSv;
                    (view6 != null ? view6 : null).setVisibility(8);
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
        imageView2.startAnimation(selfRotateAnimation);
    }

    private final void y() {
        int size = this.labelDatas.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += (this.labelDatas.get(i).getLabelText().length() * ((int) NumberExtKt.sp(15))) + NumberExtKt.dp(34) + NumberExtKt.dp(15);
            if (this.labelDatas.get(i).getClickCount() > 0) {
                length += NumberExtKt.dp(15);
            }
        }
        int size2 = this.labelDatas.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            int length2 = (this.labelDatas.get(i5).getLabelText().length() * ((int) NumberExtKt.sp(15))) + NumberExtKt.dp(34) + NumberExtKt.dp(15);
            if (this.labelDatas.get(i5).getClickCount() > 0) {
                length2 += NumberExtKt.dp(15);
            }
            i2 += length2;
            if (i2 >= length / 3) {
                i3++;
                i2 = length2;
            }
            if (i3 >= 3) {
                i4 += length2;
            }
        }
        if (this.labelDatas.size() <= 1 || length % UtilsKt.screenWidth() == 0 || length / UtilsKt.screenWidth() < 3) {
            return;
        }
        int i6 = (length / 3) + (i4 / 2);
        RecyclerView recyclerView = this.labelRv;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(i6, NumberExtKt.dp(165)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(HomeLabelFragment homeLabelFragment, Ref.IntRef intRef, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            View view2 = homeLabelFragment.labelHomeCl;
            if (view2 == null) {
                view2 = null;
            }
            if (motionEvent.getY() > view2.getHeight() + intRef.element) {
                homeLabelFragment.q();
                HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_BACK_C, null, 2, null);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.HOME_TAG_T, (List<? extends Pair<String, ? extends Object>>) e.listOf(new Pair("time", Long.valueOf(System.currentTimeMillis() - this.useLongTime))));
        r().clearHomeLabelCache();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.health_label_window, container);
        this.editView = viewInflate.findViewById(R.id.health_label_home_edit);
        this.recordView = viewInflate.findViewById(R.id.health_label_home_record);
        this.closeView = viewInflate.findViewById(R.id.health_label_home_close);
        this.addNewLabelView = viewInflate.findViewById(R.id.health_label_home_add);
        this.labelRv = (RecyclerView) viewInflate.findViewById(R.id.home_health_label_rv);
        this.loadingLl = viewInflate.findViewById(R.id.health_label_loading_ll);
        this.loadingIv = (ImageView) viewInflate.findViewById(R.id.health_label_loading_iv);
        this.retryLl = viewInflate.findViewById(R.id.health_label_retry_ll);
        this.retryBt = viewInflate.findViewById(R.id.health_label_retry_bt);
        this.contentSv = viewInflate.findViewById(R.id.health_label_content_sv);
        this.blurIv = viewInflate.findViewById(R.id.health_label_blur_iv);
        this.labelHomeLl = viewInflate.findViewById(R.id.health_label_home_ll);
        this.labelHomeCl = viewInflate.findViewById(R.id.health_label_home_cl);
        this.historyDeleteLl = viewInflate.findViewById(R.id.health_label_history_delete_ll);
        this.historyDeleteIv = viewInflate.findViewById(R.id.health_label_history_delete_iv);
        Unit unit = Unit.INSTANCE;
        this.labelView = viewInflate;
        final View view = this.labelHomeLl;
        if (view == null) {
            view = null;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$onCreateView$2$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (iArr[1] == 0) {
                    View view2 = this.labelHomeCl;
                    if (view2 == null) {
                        view2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin += this.barHeight;
                    View view3 = this.labelHomeCl;
                    (view3 != null ? view3 : null).setLayoutParams(marginLayoutParams);
                    intRef.element = this.barHeight;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o84
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return HomeLabelFragment.z(this.a, intRef, view2, motionEvent);
            }
        });
        v();
        u();
        i();
        View view2 = this.labelView;
        if (view2 == null) {
            return null;
        }
        return view2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        HealthLabelHelper.setReLoginListener(null);
    }

    @Override // com.huami.healthlabel.ui.custom.InputView.InputResultCallback
    public void onInputResult(@NotNull String text, @NotNull String textColor) {
        if (this.labelDatas.size() < 20 && UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
            r().retryLoad();
        }
        r().insertHomeLabel(new MixLabel(-1, text, textColor, true, System.currentTimeMillis(), 0, -UtilsKt.getTimeSecond(), ColorExtKt.getConvertColor(textColor), null, 256, null));
    }

    @Override // com.huami.healthlabel.ui.adapter.LabelAdapter.ItemListener
    public void onItemClick(int position) {
        MixLabel mixLabel = this.labelDatas.get(position);
        if (mixLabel.getClickCount() < 99) {
            mixLabel.setClickCount(mixLabel.getClickCount() + 1);
            mixLabel.setTimestamp(System.currentTimeMillis());
            r().updateRecordLabel(mixLabel);
        } else {
            UtilsKt.toast(R.string.health_label_click_limit_reached);
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("id", Integer.valueOf(mixLabel.getLabelId()));
        pairArr[1] = new Pair("tag", mixLabel.getLabelText());
        String reason = mixLabel.getReason();
        if (reason == null) {
            reason = "";
        }
        pairArr[2] = new Pair("reason", reason);
        HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.HOME_TAG_SELECT_C, (List<? extends Pair<String, ? extends Object>>) CollectionsKt__CollectionsKt.listOf((Object[]) pairArr));
    }

    @Override // com.huami.healthlabel.ui.adapter.LabelAdapter.ItemListener
    public void onItemLongClick(int position) {
        MixLabel mixLabel = this.labelDatas.get(position);
        if (mixLabel.getClickCount() > 0) {
            if (!UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
                UtilsKt.toast(R.string.health_label_delete_error);
                return;
            }
            w();
            Pair<Long, Long> pairTimeRange = DateExtKt.timeRange(DateExtKt.getBeginningTime(new Date()), 1440);
            r().deleteLabelRecord(mixLabel.getLabelText(), pairTimeRange.getFirst().longValue(), pairTimeRange.getSecond().longValue());
            HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.HOME_TAG_HOLD_C, CollectionsKt__CollectionsKt.arrayListOf(new Pair("id", Integer.valueOf(mixLabel.getLabelId())), new Pair("tag", mixLabel.getLabelText()), new Pair("count", Integer.valueOf(mixLabel.getClickCount()))));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.dimAmount = 0.0f;
            attributes.width = -1;
            attributes.height = o();
            attributes.y = AMapEngineUtils.MIN_LONGITUDE_DEGREE;
            Dialog dialog2 = getDialog();
            Window window2 = dialog2 == null ? null : dialog2.getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        p();
        HealthLabelHelper.setReLoginListener(new ReLoginListener() { // from class: com.huami.healthlabel.ui.HomeLabelFragment.onViewCreated.1
            @Override // com.huami.healthlabel.utils.ReLoginListener
            public void reLoginSuccess() {
                HomeLabelFragment.this.r().retryLoad();
            }
        });
        x();
        r().getShowHomeLabel().observeForever(new Observer() { // from class: p84
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeLabelFragment.A(this.a, (HomeLabelViewModel.LoadData) obj);
            }
        });
        r().getHasCacheData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                FirstLoad firstLoad = (FirstLoad) t;
                if (firstLoad instanceof ManagerLabel) {
                    if (!UtilsKt.isNetworkConnect(this.a.getContext()) && !((ManagerLabel) firstLoad).getHasCache()) {
                        UtilsKt.toast(R.string.health_label_network_error_retry);
                        return;
                    } else {
                        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_MANAGE_C, null, 2, null);
                        this.a.startActivity(new Intent(this.a.getContext(), (Class<?>) HealthLabelManagerActivity.class));
                        return;
                    }
                }
                if (firstLoad instanceof RecordLabel) {
                    if (!UtilsKt.isNetworkConnect(this.a.getContext()) && !((RecordLabel) firstLoad).getHasCache()) {
                        UtilsKt.toast(R.string.health_label_network_error_retry);
                    } else {
                        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_LOGGING_C, null, 2, null);
                        this.a.startActivity(new Intent(this.a.getContext(), (Class<?>) HealthLabelHistoryActivity.class).putExtra("cf", HealthLabelAnalyticsKt.TAG_CLICK_SOURCE_HOME));
                    }
                }
            }
        });
        r().getDeleteLabel().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.healthlabel.ui.HomeLabelFragment$onViewCreated$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                this.a.C();
                if (((Boolean) t).booleanValue()) {
                    return;
                }
                UtilsKt.toast(R.string.health_label_delete_error);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        this.useLongTime = System.currentTimeMillis();
        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_C, null, 2, null);
        super.show(manager, tag);
    }

    public /* synthetic */ HomeLabelFragment(View view, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i2 & 2) != 0 ? NumberExtKt.dp(30) : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeLabelFragment() {
        this(null, 0, 2, 0 == true ? 1 : 0);
    }
}
