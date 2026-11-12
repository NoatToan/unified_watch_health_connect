package com.huami.femalehealth.uilib.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.manager.FHUploadPermissionManager;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryEditViewModel;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u00020\u000b8\u0010@\u0010X\u0090D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/MenstruationHistoryEditActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/MenstruationHistoryActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "historyItemVo", "onItemClick$uilib_release", "(Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;)V", "onItemClick", "", GoogleApiAvailabilityLight.a, "Z", "getAddEnable$uilib_release", "()Z", "addEnable", "Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryEditViewModel;", "e", "Lkotlin/Lazy;", "getViewModel", "()Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryEditViewModel;", "viewModel", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationHistoryEditActivity extends MenstruationHistoryActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "MenstruationHistoryEditActivity";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean addEnable = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/MenstruationHistoryEditActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) MenstruationHistoryEditActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HistoryItemVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HistoryItemVo historyItemVo) {
            super(0);
            this.a = historyItemVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onItemClick:", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenstruationHistoryEditActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MenstruationHistoryEditViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryEditActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryEditViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenstruationHistoryEditViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MenstruationHistoryEditViewModel.class), c15291, objArr);
            }
        });
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryActivity, com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryActivity
    /* JADX INFO: renamed from: getAddEnable$uilib_release, reason: from getter */
    public boolean getAddEnable() {
        return this.addEnable;
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryActivity, com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = R.id.tv_title_bar;
        ((RainbowTitleBar) findViewById(i)).setMenuText("");
        ((RainbowTitleBar) findViewById(i)).setTitle(R.string.fh_menstruation_edit);
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryActivity
    public void onItemClick$uilib_release(@NotNull HistoryItemVo historyItemVo) {
        HMLog.info("xys_MenstruationHistoryEditActivity", new a(historyItemVo));
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, this, null, 2, null);
            return;
        }
        getViewModel().clearCycleCatch();
        if (historyItemVo.getType() == 17) {
            EditMenstruationDetailActivity.Companion.start$default(EditMenstruationDetailActivity.INSTANCE, this, 2, null, 4, null);
        } else {
            EditMenstruationDetailActivity.INSTANCE.start(this, 1, historyItemVo);
        }
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.MenstruationHistoryActivity
    @NotNull
    public MenstruationHistoryEditViewModel getViewModel() {
        return (MenstruationHistoryEditViewModel) this.viewModel.getValue();
    }
}
