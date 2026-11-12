package com.huami.snore.ui.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.snore.core.R;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.util.PlayWavVoice;
import com.huami.snore.core.util.TimeUtil;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.huami.snore.ui.adapter.VoiceAdapter;
import com.huami.snore.ui.adapter.VoiceClickListener;
import com.huami.snore.ui.adapter.WrapVoiceInfo;
import com.huami.snore.ui.dialog.Builder;
import com.huami.snore.ui.dialog.SnoreNormalDialog;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.huami.snore.ui.util.CommonUiUtilKt;
import com.huami.snore.ui.viewmodel.SnoreListViewModel;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/huami/snore/ui/fragment/SnoreListFragment;", "Landroidx/fragment/app/Fragment;", "", "loadData", "initData", "m", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "type", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "info", LogUtil.D, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "onPause", "Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", "a", "Lkotlin/Lazy;", "y", "()Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", "model", "Lcom/huami/snore/ui/adapter/VoiceAdapter;", "b", "z", "()Lcom/huami/snore/ui/adapter/VoiceAdapter;", "voiceAdapter", "Ljava/util/Date;", "c", "Ljava/util/Date;", "mDayTime", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", GoogleApiAvailabilityLight.a, "x", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mDialog", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreListFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DAY_TIME_DATE_KEY = "day_time_date_key";

    @NotNull
    public static final String TYPE_DELETE = "delete";

    @NotNull
    public static final String TYPE_DELETE_ALL = "delete_all";

    @NotNull
    public static final String TYPE_UPLOAD = "upload";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Date mDayTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/snore/ui/fragment/SnoreListFragment$Companion;", "", "Ljava/util/Date;", "dayTime", "Landroidx/fragment/app/Fragment;", "newInstance", "", "DAY_TIME_DATE_KEY", "Ljava/lang/String;", "TYPE_DELETE", "TYPE_DELETE_ALL", "TYPE_UPLOAD", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Fragment newInstance(@NotNull Date dayTime) {
            SnoreListFragment snoreListFragment = new SnoreListFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(SnoreListFragment.DAY_TIME_DATE_KEY, dayTime);
            Unit unit = Unit.INSTANCE;
            snoreListFragment.setArguments(bundle);
            return snoreListFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialog = new LoadingDialog(SnoreListFragment.this.requireContext());
            loadingDialog.setCancelable(false);
            return loadingDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ VoiceShowInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VoiceShowInfo voiceShowInfo) {
            super(0);
            this.b = voiceShowInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SnoreListFragment.this.y().removeVoice(SnoreListFragment.this.requireContext(), this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SnoreListFragment.this.y().deleteAllData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ VoiceShowInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VoiceShowInfo voiceShowInfo) {
            super(0);
            this.b = voiceShowInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SnoreListFragment.this.y().getUploadSnoreInfo().setValue(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/snore/ui/adapter/VoiceAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<VoiceAdapter> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VoiceAdapter getA() {
            VoiceAdapter voiceAdapter = new VoiceAdapter();
            voiceAdapter.setHasStableIds(true);
            return voiceAdapter;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnoreListFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.snore.ui.fragment.SnoreListFragment$special$$inlined$viewModel$default$1
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
        this.model = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SnoreListViewModel>() { // from class: com.huami.snore.ui.fragment.SnoreListFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.snore.ui.viewmodel.SnoreListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SnoreListViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SnoreListViewModel.class), function0, objArr);
            }
        });
        this.voiceAdapter = LazyKt__LazyJVMKt.lazy(e.a);
        this.mDialog = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final void A() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.topTime))).setText(TimeUtil.INSTANCE.formatTime(this.mDayTime));
        z().setOnItemClickListener(new VoiceClickListener() { // from class: com.huami.snore.ui.fragment.SnoreListFragment$setupView$1
            @Override // com.huami.snore.ui.adapter.VoiceClickListener
            public void onDelete(@Nullable VoiceShowInfo info) {
                if (info == null) {
                    return;
                }
                this.a.y().clickUpDel("delete", info);
            }

            @Override // com.huami.snore.ui.adapter.VoiceClickListener
            public void onPlay(@Nullable WrapVoiceInfo info) {
                if (info == null) {
                    return;
                }
                this.a.y().playAction(info);
            }

            @Override // com.huami.snore.ui.adapter.VoiceClickListener
            public void onUpload(@Nullable VoiceShowInfo info) {
                if (info == null) {
                    return;
                }
                this.a.y().clickUpDel(SnoreListFragment.TYPE_UPLOAD, info);
            }
        });
        View view2 = getView();
        ((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.snoreList))).setAdapter(z());
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.editText))).setOnClickListener(new View.OnClickListener() { // from class: z47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SnoreListFragment.B(this.a, view4);
            }
        });
        View view4 = getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.delAllTv) : null)).setOnClickListener(new View.OnClickListener() { // from class: w47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                SnoreListFragment.C(this.a, view5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SnoreListFragment snoreListFragment, View view) {
        snoreListFragment.y().getEditStateLiveData().setValue(Boolean.valueOf(!snoreListFragment.y().getEditStateLiveData().getValue().booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SnoreListFragment snoreListFragment, View view) {
        E(snoreListFragment, TYPE_DELETE_ALL, null, 2, null);
    }

    private final void D(String type, VoiceShowInfo info) {
        int iHashCode = type.hashCode();
        if (iHashCode == -1335458389) {
            if (type.equals("delete")) {
                Builder builder = new Builder();
                builder.setOkText(getResources().getString(R.string.snore_delete));
                builder.setOkListener(new b(info));
                builder.setCancelText(getResources().getString(R.string.snore_cancel));
                builder.setTitleStr(getResources().getString(R.string.snore_delete_tip_title));
                builder.setDescStr(getResources().getString(R.string.snore_delete_tip_desc));
                builder.setTitleStyle(SnoreNormalDialog.TileStyle.TITLE);
                builder.setOkTextColor(Integer.valueOf(R.color.p3));
                builder.setCancelTextColor(Integer.valueOf(R.color.s2));
                builder.build().show(getChildFragmentManager());
                return;
            }
            return;
        }
        if (iHashCode == -838595071) {
            if (type.equals(TYPE_UPLOAD)) {
                Builder builder2 = new Builder();
                builder2.setOkText(getResources().getString(R.string.snore_upload_text));
                builder2.setOkListener(new d(info));
                builder2.setCancelText(getResources().getString(R.string.snore_cancel));
                builder2.setTitleStr(getResources().getString(R.string.snore_upload_tip_tile));
                builder2.setDescStr(getResources().getString(R.string.snore_upload_tip_desc));
                builder2.setTitleStyle(SnoreNormalDialog.TileStyle.TITLE);
                builder2.setCancelTextColor(Integer.valueOf(R.color.s2));
                builder2.build().show(getChildFragmentManager());
                return;
            }
            return;
        }
        if (iHashCode == 1764909325 && type.equals(TYPE_DELETE_ALL)) {
            Builder builder3 = new Builder();
            builder3.setOkText(getResources().getString(R.string.snore_delete));
            builder3.setOkListener(new c());
            builder3.setCancelText(getResources().getString(R.string.snore_cancel));
            builder3.setTitleStr("");
            builder3.setDescStr(getResources().getString(R.string.snore_dialog_del_all_tip));
            builder3.setTitleStyle(SnoreNormalDialog.TileStyle.NO_TITLE);
            builder3.setOkTextColor(Integer.valueOf(R.color.p3));
            builder3.setCancelTextColor(Integer.valueOf(R.color.s2));
            builder3.build().show(getChildFragmentManager());
        }
    }

    public static /* synthetic */ void E(SnoreListFragment snoreListFragment, String str, VoiceShowInfo voiceShowInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            voiceShowInfo = null;
        }
        snoreListFragment.D(str, voiceShowInfo);
    }

    private final void initData() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable(DAY_TIME_DATE_KEY);
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type java.util.Date");
        this.mDayTime = (Date) serializable;
    }

    private final void loadData() {
        y().syncSnoreData(this.mDayTime);
    }

    private final void m() {
        SnoreListViewModel snoreListViewModelY = y();
        snoreListViewModelY.getPageList().observe(getViewLifecycleOwner(), new Observer() { // from class: a57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.n(this.a, (PagedList) obj);
            }
        });
        snoreListViewModelY.getEditStateLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: f57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.o(this.a, (Boolean) obj);
            }
        });
        snoreListViewModelY.getMCount().observe(getViewLifecycleOwner(), new Observer() { // from class: g57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.q(this.a, (Integer) obj);
            }
        });
        snoreListViewModelY.getRefreshPosition().observe(getViewLifecycleOwner(), new Observer() { // from class: h57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.r(this.a, (Integer) obj);
            }
        });
        snoreListViewModelY.getUploadResult().observe(getViewLifecycleOwner(), new Observer() { // from class: c57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.s(this.a, (Resource) obj);
            }
        });
        snoreListViewModelY.getDownFileResult().observe(getViewLifecycleOwner(), new Observer() { // from class: d57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.t(this.a, (Resource) obj);
            }
        });
        snoreListViewModelY.getClickPlayItem().observe(getViewLifecycleOwner(), new Observer() { // from class: e57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.u(this.a, (WrapVoiceInfo) obj);
            }
        });
        snoreListViewModelY.getMToast().observe(getViewLifecycleOwner(), new Observer() { // from class: x47
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.v(this.a, (String) obj);
            }
        });
        snoreListViewModelY.getMDialogShowInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: y47
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.w(this.a, (Pair) obj);
            }
        });
        snoreListViewModelY.getMLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: b57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListFragment.p(this.a, (Resource) obj);
            }
        });
        snoreListViewModelY.setDate(this.mDayTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SnoreListFragment snoreListFragment, PagedList pagedList) {
        snoreListFragment.z().submitList(pagedList);
        snoreListFragment.z().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SnoreListFragment snoreListFragment, Boolean bool) {
        View view = snoreListFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.editText))).setText(bool.booleanValue() ? snoreListFragment.getString(R.string.snore_complete) : snoreListFragment.getString(R.string.snore_edit));
        View view2 = snoreListFragment.getView();
        CommonUiUtilKt.setVisible(view2 != null ? view2.findViewById(R.id.group_edit) : null, bool.booleanValue());
        snoreListFragment.z().setEditable(bool.booleanValue());
        if (bool.booleanValue()) {
            PlayWavVoice.INSTANCE.stopPlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SnoreListFragment snoreListFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            snoreListFragment.x().setSuccess((CharSequence) resource.getData());
        } else if (i != 2) {
            snoreListFragment.x().show();
            snoreListFragment.x().setFailed((CharSequence) resource.getData());
        } else {
            snoreListFragment.x().setMessage((CharSequence) resource.getData());
            snoreListFragment.x().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SnoreListFragment snoreListFragment, Integer num) {
        View view = snoreListFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.topSnoreNum))).setText(KoinExtKt.getAppContext().getResources().getQuantityString(R.plurals.snore_list_top_num_desc, num.intValue(), num));
        View view2 = snoreListFragment.getView();
        ((ConstraintLayout) (view2 != null ? view2.findViewById(R.id.editLayout) : null)).setVisibility(num.intValue() == 0 ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SnoreListFragment snoreListFragment, Integer num) {
        snoreListFragment.z().notifyItemChanged(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SnoreListFragment snoreListFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            snoreListFragment.x().setSuccess(snoreListFragment.getString(R.string.snore_upload_succ));
        } else if (i != 2) {
            snoreListFragment.x().setFailed(snoreListFragment.getString(R.string.snore_net_fail));
        } else {
            snoreListFragment.x().setMessage(snoreListFragment.getString(R.string.snore_uploading));
            snoreListFragment.x().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SnoreListFragment snoreListFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            WrapVoiceInfo value = snoreListFragment.y().getDownLoadFileInfo().getValue();
            if (value != null) {
                snoreListFragment.y().playAction(value);
            }
            snoreListFragment.x().dismiss();
            return;
        }
        if (i != 2) {
            snoreListFragment.x().setFailed(snoreListFragment.getString(R.string.snore_net_fail));
        } else {
            snoreListFragment.x().setMessage(snoreListFragment.getString(R.string.snore_downloading));
            snoreListFragment.x().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SnoreListFragment snoreListFragment, WrapVoiceInfo wrapVoiceInfo) {
        snoreListFragment.z().setClickPlayItem(wrapVoiceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SnoreListFragment snoreListFragment, String str) {
        Toast.makeText(snoreListFragment.requireContext(), str, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SnoreListFragment snoreListFragment, Pair pair) {
        snoreListFragment.D((String) pair.getFirst(), (VoiceShowInfo) pair.getSecond());
    }

    private final LoadingDialog x() {
        return (LoadingDialog) this.mDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SnoreListViewModel y() {
        return (SnoreListViewModel) this.model.getValue();
    }

    private final VoiceAdapter z() {
        return (VoiceAdapter) this.voiceAdapter.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        A();
        m();
        loadData();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_snore_list_layout, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        PlayWavVoice.INSTANCE.stopPlay();
    }
}
