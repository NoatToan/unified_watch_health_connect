package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment.e;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.adapter.CommonLanguageAdapter;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.adapter.CommonLanguageListener;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo.CommonLanguageConfig;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001%\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u00020\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageSettingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initViewModel", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDestroyView", "", GoogleApiAvailabilityLight.a, LogUtil.I, "originIndex", "e", "getContainerId", "()I", "containerId", "", "f", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageAdapter;", "g", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageAdapter;", "adapter", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageViewModel;", "h", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "i", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "languageConfig", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageSettingFragment$listener$1", z.j, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageSettingFragment$listener$1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CommonLanguageSettingFragment extends BaseWatchSettingFragment {

    @NotNull
    public static final String KEY_REPO = "repo";

    @NotNull
    public static final String KEY_TITLE = "title";

    @NotNull
    private static final String k = "CommonLanguageSettingFragment";
    private static final long l = 800;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int originIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CommonLanguageAdapter adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private CommonLanguageViewModel viewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private CommonLanguageConfig languageConfig;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final CommonLanguageSettingFragment$listener$1 listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (CommonLanguageSettingFragment.this.languageConfig.getCurrIndex() == CommonLanguageSettingFragment.this.originIndex) {
                WatchSettingExtsKt.navigateUpSafely(CommonLanguageSettingFragment.this);
                return;
            }
            CommonLanguageViewModel commonLanguageViewModel = CommonLanguageSettingFragment.this.viewModel;
            Objects.requireNonNull(commonLanguageViewModel);
            commonLanguageViewModel.setLanguageConfig(CommonLanguageSettingFragment.this.languageConfig);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Class<? extends ICommonLanguageRepo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class<? extends ICommonLanguageRepo> cls) {
            super(0);
            this.a = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "repo: " + this.a.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "initRepo error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ CommonLanguageConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CommonLanguageConfig commonLanguageConfig) {
            super(0);
            this.a = commonLanguageConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "languageConfig: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a implements Runnable {
            public final /* synthetic */ CommonLanguageSettingFragment a;

            public a(CommonLanguageSettingFragment commonLanguageSettingFragment) {
                this.a = commonLanguageSettingFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WatchSettingExtsKt.navigateUpSafely(this.a);
            }
        }

        public e() {
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
            View view = CommonLanguageSettingFragment.this.getView();
            ((TextView) (view == null ? null : view.findViewById(R.id.toolbar_title))).postDelayed(new a(CommonLanguageSettingFragment.this), CommonLanguageSettingFragment.l);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment$listener$1] */
    public CommonLanguageSettingFragment() {
        super(R.layout.fragment_common_language_setting);
        this.originIndex = -1;
        this.containerId = R.id.container;
        this.titleRes = "";
        this.languageConfig = new CommonLanguageConfig(null, -1, null, 5, null);
        this.listener = new CommonLanguageListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment$listener$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ CommonLanguageSettingFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(CommonLanguageSettingFragment commonLanguageSettingFragment) {
                    super(0);
                    this.a = commonLanguageSettingFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "onSelect: " + this.a.languageConfig.getCurrIndex();
                }
            }

            @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.adapter.CommonLanguageListener
            public void onSelect(@NotNull CommonLanguageConfig config) {
                this.a.languageConfig = config;
                HMLog.info("CommonLanguageSettingFragment", new a(this.a));
            }
        };
    }

    private final void initView() {
        String string;
        View view = getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.confirm_btn), true, false, 2, null);
        setLoadingHelper(new LoadingHelper(requireContext()));
        View view2 = getView();
        TextView textView = (TextView) (view2 == null ? null : view2.findViewById(R.id.toolbar_title));
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("title")) != null) {
            str = string;
        }
        textView.setText(str);
        View view3 = getView();
        RecyclerView recyclerView = (RecyclerView) (view3 == null ? null : view3.findViewById(R.id.common_language_rv));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        CommonLanguageAdapter commonLanguageAdapter = new CommonLanguageAdapter(null, this.listener, 1, null);
        this.adapter = commonLanguageAdapter;
        Unit unit = Unit.INSTANCE;
        recyclerView.setAdapter(commonLanguageAdapter);
        View view4 = getView();
        ExtKt.smartClick$default(view4 != null ? view4.findViewById(R.id.confirm_btn) : null, 0L, new a(), 1, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void initViewModel() {
        Object objM3845constructorimpl;
        this.viewModel = (CommonLanguageViewModel) new ViewModelProvider(this).get(CommonLanguageViewModel.class);
        try {
            Result.Companion companion = Result.Companion;
            Bundle arguments = getArguments();
            Serializable serializable = arguments == null ? null : arguments.getSerializable(KEY_REPO);
            Class<? extends ICommonLanguageRepo> cls = serializable instanceof Class ? (Class) serializable : null;
            HMLog.info(k, new b(cls));
            CommonLanguageViewModel commonLanguageViewModel = this.viewModel;
            if (commonLanguageViewModel == null) {
                throw null;
            }
            commonLanguageViewModel.init(cls, ((WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class)).getWatchSettings());
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(k, null, null, new c(thM3848exceptionOrNullimpl), 6, null);
                FragmentKt.findNavController(this).navigateUp();
            }
            CommonLanguageViewModel commonLanguageViewModel2 = this.viewModel;
            Objects.requireNonNull(commonLanguageViewModel2);
            commonLanguageViewModel2.getLanguageConfigLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment$initViewModel$$inlined$observe$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(T t) {
                    CommonLanguageConfig commonLanguageConfig = (CommonLanguageConfig) t;
                    HMLog.info("CommonLanguageSettingFragment", new CommonLanguageSettingFragment.d(commonLanguageConfig));
                    this.a.originIndex = commonLanguageConfig.getCurrIndex();
                    this.a.languageConfig = commonLanguageConfig;
                    CommonLanguageAdapter commonLanguageAdapter = this.a.adapter;
                    Objects.requireNonNull(commonLanguageAdapter);
                    commonLanguageAdapter.setLanguageConfig(commonLanguageConfig);
                    CommonLanguageAdapter commonLanguageAdapter2 = this.a.adapter;
                    Objects.requireNonNull(commonLanguageAdapter2);
                    commonLanguageAdapter2.notifyDataSetChanged();
                }
            });
            CommonLanguageViewModel commonLanguageViewModel3 = this.viewModel;
            Objects.requireNonNull(commonLanguageViewModel3);
            commonLanguageViewModel3.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment$initViewModel$$inlined$observe$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(T t) {
                    LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, this.a.new e(), null, 8, null);
                }
            });
            CommonLanguageViewModel commonLanguageViewModel4 = this.viewModel;
            Objects.requireNonNull(commonLanguageViewModel4);
            commonLanguageViewModel4.getResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment$initViewModel$$inlined$observe$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(T t) {
                    View view = this.a.getView();
                    ((TextView) (view == null ? null : view.findViewById(R.id.confirm_btn))).setEnabled(false);
                }
            });
            CommonLanguageViewModel commonLanguageViewModel5 = this.viewModel;
            Objects.requireNonNull(commonLanguageViewModel5);
            commonLanguageViewModel5.queryLanguageConfig();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public int getContainerId() {
        return this.containerId;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    @NotNull
    public String getTitleRes() {
        return this.titleRes;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        CommonLanguageViewModel commonLanguageViewModel = this.viewModel;
        Objects.requireNonNull(commonLanguageViewModel);
        commonLanguageViewModel.releaseOperation();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initViewModel();
    }
}
