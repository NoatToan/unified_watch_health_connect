package com.huami.wallet.accessdoor.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.AccessCardListActivity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.fragment.AccessDoorListFragment;
import com.huami.wallet.accessdoor.helper.AccessDoorPageHelper;
import com.huami.wallet.accessdoor.utils.EventId;
import com.huami.wallet.accessdoor.utils.ParamKey;
import com.huami.wallet.accessdoor.utils.ParamValue;
import com.loc.z;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/AccessCardListActivity;", "Lcom/huami/wallet/accessdoor/activity/BaseAccessDoorActivity;", "", "initView", "m", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "e", "Lkotlin/Lazy;", z.j, "()Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "accessDoorDataSource", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class AccessCardListActivity extends BaseAccessDoorActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DOOR_CARD_MAX_SIZE = 5;

    @NotNull
    public static final String TAG = "Wallet-AccessCardListActivity";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy accessDoorDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/AccessCardListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "open", "", "DOOR_CARD_MAX_SIZE", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void open(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) AccessCardListActivity.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessCardListActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.accessDoorDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AccessDoorDataSource>() { // from class: com.huami.wallet.accessdoor.activity.AccessCardListActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.accessdoor.api.service.AccessDoorDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AccessDoorDataSource getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(AccessDoorDataSource.class), qualifier, objArr);
            }
        });
    }

    private final void initView() {
        RainbowTitleBar tvTitleBar = getTvTitleBar();
        if (tvTitleBar == null) {
            return;
        }
        tvTitleBar.setTitle(R.string.access_door_choose_card);
        tvTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessCardListActivity.k(view);
            }
        });
        tvTitleBar.setMenuIcon(R.drawable.wl_card_add_grey);
        tvTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: u0
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                AccessCardListActivity.l(this.a, view, i);
            }
        });
    }

    private final AccessDoorDataSource j() {
        return (AccessDoorDataSource) this.accessDoorDataSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view) {
        AccessDoorPageHelper.getInstance().finishPreviousActivities();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(AccessCardListActivity accessCardListActivity, View view, int i) {
        Fragment fragmentFindFragmentById = accessCardListActivity.getSupportFragmentManager().findFragmentById(R.id.fragment_access_card_list);
        AccessDoorListFragment accessDoorListFragment = fragmentFindFragmentById instanceof AccessDoorListFragment ? (AccessDoorListFragment) fragmentFindFragmentById : null;
        Integer numValueOf = accessDoorListFragment != null ? Integer.valueOf(accessDoorListFragment.getAccessDoorCardListSize()) : null;
        if (numValueOf == null || numValueOf.intValue() >= 5) {
            accessCardListActivity.n();
        } else {
            accessCardListActivity.m();
            SelectDoorTypeActivity.INSTANCE.open(accessCardListActivity, true);
        }
    }

    private final void m() {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", j().getDeviceModel());
        map.put(ParamKey.DOOR_DETAIL_OPERATION, ParamValue.Add);
        Analytics.recordEvent(new CountEventBuilder(EventId.DOOR_DETAIL_OUT).putExtras(map));
    }

    private final void n() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.access_card_not_support_size).setNeutralButton(R.string.access_card_has_known, new DialogInterface.OnClickListener() { // from class: s0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AccessCardListActivity.o(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DialogInterface dialogInterface, int i) {
    }

    @JvmStatic
    public static final void open(@NotNull Context context) {
        INSTANCE.open(context);
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AccessDoorPageHelper.getInstance().finishPreviousActivities();
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_card_list);
        initView();
    }
}
