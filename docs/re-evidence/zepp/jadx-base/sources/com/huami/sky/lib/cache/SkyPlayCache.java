package com.huami.sky.lib.cache;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.sky.service.SkyUpdateShowInfo;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002) B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002J\u001c\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\u0019\u001a\u00020\u0010\"\b\b\u0000\u0010\u0018*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b \u0010%¨\u0006*"}, d2 = {"Lcom/huami/sky/lib/cache/SkyPlayCache;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "key", "b", "Lcom/huami/sky/service/SkyUpdateShowInfo;", "updateInfo", "", "saveSkyUpdateShowInfo", "getSkyUpdateShowInfo", "defaultString", "getStringWithUserId", "", "defaultInt", "getIntWithUserId", "value", "", "saveIntWithUserId", "saveStringWithUserId", "", WatchFaceArrivingEvent.CMD_SET, "saveSetWithUserId", "getSetWithUserId", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "saveParcelableWithUserId", "(Ljava/lang/String;Landroid/os/Parcelable;)Z", "Ljava/lang/Class;", "tClass", "getParcelabelWithUserId", "(Ljava/lang/String;Ljava/lang/Class;)Landroid/os/Parcelable;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "Lcom/huami/account/service/AccountService;", "Lkotlin/Lazy;", "()Lcom/huami/account/service/AccountService;", "accountService", "<init>", "()V", "Companion", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayCache implements KoinComponentAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SkyPlayCache c = a.a.a();

    @NotNull
    private static final String d = "play.guide.key";

    @NotNull
    private static final String e = "SkyPlayCache";

    @NotNull
    private static final String f = "promotion.key";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv = KvKit.getKvPersistence$default(e, false, 2, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/lib/cache/SkyPlayCache$Companion;", "", "Lcom/huami/sky/lib/cache/SkyPlayCache;", DefaultSettingsSpiCall.n, "Lcom/huami/sky/lib/cache/SkyPlayCache;", "getInstance", "()Lcom/huami/sky/lib/cache/SkyPlayCache;", "", "PLAY_GUIDE_KEY", "Ljava/lang/String;", "PLAY_KV_FILE_NAME", "PROMOTION_KEY", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SkyPlayCache getInstance() {
            return SkyPlayCache.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/sky/lib/cache/SkyPlayCache$a", "", "Lcom/huami/sky/lib/cache/SkyPlayCache;", "b", "Lcom/huami/sky/lib/cache/SkyPlayCache;", "a", "()Lcom/huami/sky/lib/cache/SkyPlayCache;", "holder", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final SkyPlayCache holder = new SkyPlayCache();

        private a() {
        }

        @NotNull
        public final SkyPlayCache a() {
            return holder;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkyPlayCache() {
        final Qualifier qualifier = null;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.accountService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AccountService>() { // from class: com.huami.sky.lib.cache.SkyPlayCache$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.service.AccountService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AccountService invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AccountService.class), qualifier, objArr);
            }
        });
    }

    private final AccountService a() {
        return (AccountService) this.accountService.getValue();
    }

    private final String b(String key) {
        String strUserId = AccountServiceExtKt.userId(a());
        if (strUserId == null) {
            return null;
        }
        return key + "." + strUserId;
    }

    public final int getIntWithUserId(@NotNull String key, int defaultInt) {
        String strB = b(key);
        return strB == null ? defaultInt : ((Number) this.kv.getValue(strB, Integer.valueOf(defaultInt))).intValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final <T extends Parcelable> T getParcelabelWithUserId(@NotNull String key, @NotNull Class<T> tClass) {
        String strB = b(key);
        if (strB == null) {
            return null;
        }
        return (T) this.kv.getParcelableValue(strB, tClass);
    }

    @NotNull
    public final Set<String> getSetWithUserId(@NotNull String key) {
        String strB = b(key);
        Set<String> set = strB == null ? null : (Set) this.kv.getValue(strB, y.emptySet());
        return set == null ? y.emptySet() : set;
    }

    @Nullable
    public final SkyUpdateShowInfo getSkyUpdateShowInfo() {
        String strUserId = AccountServiceExtKt.userId(a());
        if (strUserId == null) {
            return null;
        }
        return (SkyUpdateShowInfo) this.kv.getParcelableValue("promotion.key." + strUserId, SkyUpdateShowInfo.class);
    }

    @Nullable
    public final String getStringWithUserId(@NotNull String key, @NotNull String defaultString) {
        String strB = b(key);
        if (strB == null) {
            return null;
        }
        return (String) this.kv.getValue(strB, defaultString);
    }

    public final boolean saveIntWithUserId(@NotNull String key, int value) {
        String strB = b(key);
        if (strB == null) {
            return false;
        }
        return this.kv.setValue(strB, Integer.valueOf(value));
    }

    public final <T extends Parcelable> boolean saveParcelableWithUserId(@NotNull String key, @NotNull T value) {
        String strB = b(key);
        if (strB == null) {
            return false;
        }
        return this.kv.setValue(strB, value);
    }

    public final boolean saveSetWithUserId(@NotNull String key, @NotNull Set<String> set) {
        String strB = b(key);
        if (strB == null) {
            return false;
        }
        return this.kv.setValue(strB, set);
    }

    public final void saveSkyUpdateShowInfo(@NotNull SkyUpdateShowInfo updateInfo) {
        String strUserId = AccountServiceExtKt.userId(a());
        if (strUserId == null) {
            return;
        }
        this.kv.setValue("promotion.key." + strUserId, updateInfo);
    }

    public final boolean saveStringWithUserId(@NotNull String key, @NotNull String value) {
        String strB = b(key);
        if (strB == null) {
            return false;
        }
        return this.kv.setValue(strB, value);
    }
}
