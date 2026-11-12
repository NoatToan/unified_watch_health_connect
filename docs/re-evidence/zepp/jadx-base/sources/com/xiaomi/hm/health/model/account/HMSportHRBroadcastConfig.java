package com.xiaomi.hm.health.model.account;

import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.hmchartui.utils.Constant;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
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
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMSportHRBroadcastConfig;", "", "", "saveAndUpload", "", "enable", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "", "time", "J", "getTime", "()J", "setTime", "(J)V", "", HMSportHRBroadcastConfig.KEY_USER, "Ljava/lang/String;", "getUser", "()Ljava/lang/String;", "setUser", "(Ljava/lang/String;)V", "<init>", "(ZJLjava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMSportHRBroadcastConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_ENABLE = "enable";

    @NotNull
    private static final String KEY_TIME = "time";

    @NotNull
    private static final String KEY_USER = "user";

    @NotNull
    public static final String TAG = "HMSportHRBroadcastConfig";

    @NotNull
    private static final Lazy<PropertyStoreApi> propertyStoreApiLazy;
    private boolean enable;
    private long time;

    @NotNull
    private String user;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMSportHRBroadcastConfig$Companion;", "", "Lcom/xiaomi/hm/health/model/account/HMSportHRBroadcastConfig;", "fromJson", "", "KEY_ENABLE", "Ljava/lang/String;", Constant.KEY_TIME, "KEY_USER", "TAG", "Lkotlin/Lazy;", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApiLazy", "Lkotlin/Lazy;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HMSportHRBroadcastConfig fromJson() {
            String property = ((PropertyStoreApi) HMSportHRBroadcastConfig.propertyStoreApiLazy.getValue()).getProperty(Property.PROPERTY_SPORT_HR_BROADCAST, "");
            HMSportHRBroadcastConfig hMSportHRBroadcastConfig = new HMSportHRBroadcastConfig(false, 0L, "");
            try {
                JSONObject jSONObject = new JSONObject(property);
                hMSportHRBroadcastConfig.setEnable(jSONObject.optBoolean("enable"));
                hMSportHRBroadcastConfig.setTime(jSONObject.optLong("time"));
                hMSportHRBroadcastConfig.setUser(jSONObject.optString(HMSportHRBroadcastConfig.KEY_USER));
            } catch (Exception e) {
                HMLog.info(HMSportHRBroadcastConfig.TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.model.account.HMSportHRBroadcastConfig$Companion$fromJson$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "fromJson exception " + e.getMessage();
                    }
                });
            }
            return hMSportHRBroadcastConfig;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Koin koin = GlobalContext.INSTANCE.get();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        propertyStoreApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PropertyStoreApi>() { // from class: com.xiaomi.hm.health.model.account.HMSportHRBroadcastConfig$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.devicex.injection.data.PropertyStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PropertyStoreApi invoke() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), objArr, objArr2);
            }
        });
    }

    public HMSportHRBroadcastConfig(boolean z, long j, @NotNull String str) {
        this.enable = z;
        this.time = j;
        this.user = str;
    }

    @JvmStatic
    @NotNull
    public static final HMSportHRBroadcastConfig fromJson() {
        return INSTANCE.fromJson();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getUser() {
        return this.user;
    }

    public final void saveAndUpload() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enable", this.enable);
            jSONObject.put("time", this.time);
            jSONObject.put(KEY_USER, this.user);
            String string = jSONObject.toString();
            Lazy<PropertyStoreApi> lazy = propertyStoreApiLazy;
            lazy.getValue().setProperty(Property.PROPERTY_SPORT_HR_BROADCAST, string);
            lazy.getValue().postPropertiesToServer(true);
        } catch (Exception e) {
            HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.model.account.HMSportHRBroadcastConfig.saveAndUpload.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "saveAndUpload exception " + e.getMessage();
                }
            });
        }
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUser(@NotNull String str) {
        this.user = str;
    }
}
