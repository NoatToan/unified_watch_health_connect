package com.huami.third.wechat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p010navigation.Activity;
import androidx.p010navigation.NavController;
import androidx.p010navigation.NavGraph;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.third.wechat.ui.WeChatBindActivity;
import com.huami.tools.log.HMLog;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/third/wechat/ui/WeChatBindActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;", "Lorg/koin/core/component/KoinComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/os/PersistableBundle;", "persistentState", "Landroid/content/Intent;", "intent", "onNewIntent", "Lcom/tencent/mm/opensdk/modelbase/BaseReq;", "p0", "onReq", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "onResp", "Lcom/huami/third/wechat/ui/WeChatParams;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/third/wechat/ui/WeChatParams;", "weChatParams", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "b", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "weChatApi", "<init>", "()V", "Companion", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public class WeChatBindActivity extends AppCompatActivity implements IWXAPIEventHandler, KoinComponent {

    @NotNull
    public static final String START_DESTINATION = "startDestination";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy weChatParams;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private IWXAPI weChatApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ BaseResp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BaseResp baseResp) {
            super(0);
            this.a = baseResp;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            BaseResp baseResp = this.a;
            if (baseResp == null) {
                return null;
            }
            return baseResp.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeChatBindActivity() {
        super(R.layout.activity_bind_wechat);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.weChatParams = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WeChatParams>() { // from class: com.huami.third.wechat.ui.WeChatBindActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.third.wechat.ui.WeChatParams, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WeChatParams invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WeChatParams.class), qualifier, objArr);
            }
        });
    }

    private final WeChatParams d() {
        return (WeChatParams) this.weChatParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WeChatBindActivity weChatBindActivity, int i) {
        NavController navControllerFindNavController = Activity.findNavController(weChatBindActivity, R.id.fragment_container);
        NavGraph navGraphInflate = navControllerFindNavController.getNavInflater().inflate(R.navigation.nav_graph);
        navGraphInflate.setStartDestination(i);
        navControllerFindNavController.setGraph(navGraphInflate);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Integer numValueOf = savedInstanceState == null ? null : Integer.valueOf(savedInstanceState.getInt(START_DESTINATION));
        final int intExtra = numValueOf == null ? getIntent().getIntExtra(START_DESTINATION, WeChatStartDestination.Entry.getStartDestination()) : numValueOf.intValue();
        findViewById(R.id.fragment_container).post(new Runnable() { // from class: wm8
            @Override // java.lang.Runnable
            public final void run() {
                WeChatBindActivity.e(this.a, intExtra);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        IWXAPI iwxapi = this.weChatApi;
        Objects.requireNonNull(iwxapi);
        iwxapi.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(@Nullable BaseReq p0) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(@Nullable BaseResp p0) {
        HMLog.info("wechat", new a(p0));
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, d().getAppID(), false);
        this.weChatApi = iwxapiCreateWXAPI;
        Objects.requireNonNull(iwxapiCreateWXAPI);
        iwxapiCreateWXAPI.handleIntent(getIntent(), this);
    }
}
