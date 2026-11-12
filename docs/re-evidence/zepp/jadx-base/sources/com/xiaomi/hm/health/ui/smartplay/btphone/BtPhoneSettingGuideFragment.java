package com.xiaomi.hm.health.ui.smartplay.btphone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.discovery.bridge.WebFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneSettingGuideFragment;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR%\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneSettingGuideFragment;", "Landroidx/fragment/app/Fragment;", "", "e", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneSettingGuideViewModel;", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneSettingGuideViewModel;", "viewModel", "Lcom/huami/discovery/bridge/WebFragment;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/discovery/bridge/WebFragment;", "webFragment", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneSettingGuideFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = 100;

    @NotNull
    private static final String d = "BtPhoneSettingGuideFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private BtPhoneSettingGuideViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy webFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneSettingGuideFragment$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, "", "GO_TO_BLE_SETTING", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) BtPhoneSettingGuideFragment.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = BtPhoneSettingGuideFragment.this.viewModel;
            Objects.requireNonNull(btPhoneSettingGuideViewModel);
            return "need check pair status = " + btPhoneSettingGuideViewModel.getNeedCheckPairStatus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "go to result failed as " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = BtPhoneSettingGuideFragment.this.viewModel;
            Objects.requireNonNull(btPhoneSettingGuideViewModel);
            return "onCreate and needcheck = " + btPhoneSettingGuideViewModel.getNeedCheckPairStatus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "go to ble setting view";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/discovery/bridge/WebFragment;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<WebFragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebFragment getA() {
            BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = BtPhoneSettingGuideFragment.this.viewModel;
            Objects.requireNonNull(btPhoneSettingGuideViewModel);
            return WebFragment.newInstance(btPhoneSettingGuideViewModel.getGuidingWebItem());
        }
    }

    public BtPhoneSettingGuideFragment() {
        super(R.layout.fragment_bt_phone_setting_guide);
        this.webFragment = LazyKt__LazyJVMKt.lazy(new e());
    }

    private final WebFragment d() {
        return (WebFragment) this.webFragment.getValue();
    }

    private final void e() {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.container, d());
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BtPhoneSettingGuideFragment btPhoneSettingGuideFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        Bundle arguments = BtPhonePairResultFragment.INSTANCE.getArguments(bool.booleanValue());
        HMLog.info(d, btPhoneSettingGuideFragment.new a());
        BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = btPhoneSettingGuideFragment.viewModel;
        Objects.requireNonNull(btPhoneSettingGuideViewModel);
        if (btPhoneSettingGuideViewModel.getNeedCheckPairStatus().compareAndSet(true, false)) {
            try {
                FragmentKt.findNavController(btPhoneSettingGuideFragment).navigate(R.id.guide_to_pair_result_fragment, arguments);
            } catch (Exception e2) {
                HMLog.info(d, new b(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BtPhoneSettingGuideFragment btPhoneSettingGuideFragment, View view) {
        btPhoneSettingGuideFragment.startActivityForResult(new Intent("android.settings.BLUETOOTH_SETTINGS"), 100);
        BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = btPhoneSettingGuideFragment.viewModel;
        Objects.requireNonNull(btPhoneSettingGuideViewModel);
        btPhoneSettingGuideViewModel.getNeedCheckPairStatus().set(true);
        HMLog.info(d, d.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BtPhoneSettingGuideFragment btPhoneSettingGuideFragment, View view) {
        FragmentKt.findNavController(btPhoneSettingGuideFragment).navigate(R.id.guide_back_to_bt_phone);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = (BtPhoneSettingGuideViewModel) new ViewModelProvider(this).get(BtPhoneSettingGuideViewModel.class);
        this.viewModel = btPhoneSettingGuideViewModel;
        Objects.requireNonNull(btPhoneSettingGuideViewModel);
        btPhoneSettingGuideViewModel.getPairedData().observe(this, new Observer() { // from class: c90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneSettingGuideFragment.f(this.a, (Boolean) obj);
            }
        });
        HMLog.info(d, new c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = this.viewModel;
        Objects.requireNonNull(btPhoneSettingGuideViewModel);
        if (btPhoneSettingGuideViewModel.getNeedCheckPairStatus().get()) {
            BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel2 = this.viewModel;
            Objects.requireNonNull(btPhoneSettingGuideViewModel2);
            btPhoneSettingGuideViewModel2.checkToUpdateStatus();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.bt_go_setting).setOnClickListener(new View.OnClickListener() { // from class: b90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BtPhoneSettingGuideFragment.g(this.a, view2);
            }
        });
        ((RainbowTitleBar) view.findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: a90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BtPhoneSettingGuideFragment.h(this.a, view2);
            }
        });
        e();
    }
}
