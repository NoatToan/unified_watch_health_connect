package com.huami.wallet.accessdoor.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.AccessCardDetailActivity;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/AccessCardDetailActivity;", "Lcom/huami/wallet/accessdoor/activity/BaseAccessDoorActivity;", "", "initView", z.j, GoogleApiAvailabilityLight.b, "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "e", LogUtil.I, "cardSize", "", "f", "Z", "isFromList", "Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "g", "Lkotlin/Lazy;", hl.k, "()Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "accessDoorDataSource", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class AccessCardDetailActivity extends BaseAccessDoorActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "Wallet-AccessCardDetailActivity";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int cardSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isFromList = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy accessDoorDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007R\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/AccessCardDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "doorInfoAndDefaultCard", "", "open", "", "isFromList", "", "cardSize", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void open(@NotNull Context context, @NotNull DoorInfoAndDefaultCard doorInfoAndDefaultCard) {
            open(context, doorInfoAndDefaultCard, 1, true);
        }

        @JvmStatic
        public final void open(@NotNull Context context, @NotNull DoorInfoAndDefaultCard doorInfoAndDefaultCard, boolean isFromList) {
            open(context, doorInfoAndDefaultCard, 1, isFromList);
        }

        @JvmStatic
        public final void open(@NotNull Context context, @NotNull DoorInfoAndDefaultCard doorInfoAndDefaultCard, int cardSize, boolean isFromList) {
            Intent intent = new Intent(context, (Class<?>) AccessCardDetailActivity.class);
            intent.putExtra("doorInfoAndDefaultCard", doorInfoAndDefaultCard);
            intent.putExtra("cardSize", cardSize);
            intent.putExtra("isFromList", isFromList);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessCardDetailActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.accessDoorDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AccessDoorDataSource>() { // from class: com.huami.wallet.accessdoor.activity.AccessCardDetailActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.accessdoor.api.service.AccessDoorDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AccessDoorDataSource invoke() {
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
        tvTitleBar.setTitle(R.string.access_door_simulation);
        tvTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessCardDetailActivity.l(this.a, view);
            }
        });
        tvTitleBar.setMenuIcon(R.drawable.wl_card_add_grey);
        tvTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: g0
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                AccessCardDetailActivity.m(this.a, view, i);
            }
        });
    }

    private final void j() {
        if (this.isFromList || this.cardSize != 1) {
            finish();
        } else {
            AccessDoorPageHelper.getInstance().finishPreviousActivities();
        }
    }

    private final AccessDoorDataSource k() {
        return (AccessDoorDataSource) this.accessDoorDataSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(AccessCardDetailActivity accessCardDetailActivity, View view) {
        accessCardDetailActivity.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(AccessCardDetailActivity accessCardDetailActivity, View view, int i) {
        if (accessCardDetailActivity.cardSize >= 5) {
            accessCardDetailActivity.o();
        } else {
            accessCardDetailActivity.n();
            SelectDoorTypeActivity.INSTANCE.open(accessCardDetailActivity, true);
        }
    }

    private final void n() {
        HashMap map = new HashMap(2);
        map.put("DeviceSource", k().getDeviceModel());
        map.put(ParamKey.DOOR_DETAIL_OPERATION, ParamValue.Add);
        Analytics.recordEvent(new CountEventBuilder(EventId.DOOR_DETAIL_OUT).putExtras(map));
    }

    private final void o() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.access_card_not_support_size).setNeutralButton(R.string.access_card_has_known, new DialogInterface.OnClickListener() { // from class: e0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AccessCardDetailActivity.p(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull DoorInfoAndDefaultCard doorInfoAndDefaultCard) {
        INSTANCE.open(context, doorInfoAndDefaultCard);
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull DoorInfoAndDefaultCard doorInfoAndDefaultCard, int i, boolean z) {
        INSTANCE.open(context, doorInfoAndDefaultCard, i, z);
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull DoorInfoAndDefaultCard doorInfoAndDefaultCard, boolean z) {
        INSTANCE.open(context, doorInfoAndDefaultCard, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(DialogInterface dialogInterface, int i) {
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        j();
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseAccessDoorActivity, com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_card_detail);
        initView();
        this.cardSize = getIntent().getIntExtra("cardSize", 0);
        this.isFromList = getIntent().getBooleanExtra("isFromList", true);
    }
}
