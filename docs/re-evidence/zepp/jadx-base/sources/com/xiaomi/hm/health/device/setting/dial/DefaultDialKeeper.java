package com.xiaomi.hm.health.device.setting.dial;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.lang.reflect.Type;
import java.util.HashMap;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005`\nH\u0016R\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/dial/DefaultDialKeeper;", "Lcom/xiaomi/hm/health/device/setting/dial/IDialKeeper;", "Lorg/koin/core/component/KoinComponent;", "", "sn", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", LargeWatchSkinActivity.KEY_BEAN, "", "addDialBean", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getAllDialBean", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultDialKeeper implements IDialKeeper, KoinComponent {

    @NotNull
    private static final String b = "KEY_CURR_DIAL_BEAN";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "e: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDialKeeper() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.setting.dial.DefaultDialKeeper$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
    }

    private final KeeperProxyApi a() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.IDialKeeper
    public void addDialBean(@NotNull String sn, @NotNull MyWatchFaceBean bean) {
        HashMap<String, MyWatchFaceBean> allDialBean = getAllDialBean();
        allDialBean.put(sn, bean);
        Type type = new TypeToken<HashMap<String, MyWatchFaceBean>>() { // from class: com.xiaomi.hm.health.device.setting.dial.DefaultDialKeeper$addDialBean$type$1
        }.getType();
        SharedPreferences.Editor editorEdit = a().getSp().edit();
        editorEdit.putString(b, new Gson().toJson(allDialBean, type));
        editorEdit.apply();
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.IDialKeeper
    @NotNull
    public HashMap<String, MyWatchFaceBean> getAllDialBean() {
        String string = a().getSp().getString(b, "");
        try {
            HashMap<String, MyWatchFaceBean> map = (HashMap) new Gson().fromJson(string, new TypeToken<HashMap<String, MyWatchFaceBean>>() { // from class: com.xiaomi.hm.health.device.setting.dial.DefaultDialKeeper$getAllDialBean$type$1
            }.getType());
            if (map != null) {
                return map;
            }
        } catch (Exception e) {
            HMLog.info("getCurrDialBean", new a(e));
        }
        return new HashMap<>();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
