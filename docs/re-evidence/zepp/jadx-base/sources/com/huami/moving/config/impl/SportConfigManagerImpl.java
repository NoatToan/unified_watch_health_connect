package com.huami.moving.config.impl;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.config.DataGroup;
import com.huami.moving.config.DataItem;
import com.huami.moving.config.SportConfigManager;
import com.huami.moving.utils.FileUtilsKt;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000eB\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/moving/config/impl/SportConfigManagerImpl;", "Lcom/huami/moving/config/SportConfigManager;", "", "sportType", "", "getGroupId", "", "Lcom/huami/moving/config/DataItem;", "getDataCardItems", "", "Lcom/huami/moving/config/DataGroup;", "getDataList", "Lkotlin/Function0;", "Landroid/content/Context;", "a", "Lkotlin/jvm/functions/Function0;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/moving/config/impl/SportGroupConfig;", "b", "Lkotlin/Lazy;", "()Lcom/huami/moving/config/impl/SportGroupConfig;", "sportGroupConfig", "Lcom/huami/moving/config/impl/SportDataConfig;", "c", "()Lcom/huami/moving/config/impl/SportDataConfig;", "sportDataConfig", "<init>", "(Lkotlin/jvm/functions/Function0;)V", GoogleApiAvailabilityLight.a, "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportConfigManagerImpl implements SportConfigManager {

    @Deprecated
    @NotNull
    public static final String SPORT_DATA_CARD_CONFIG = "config_sport_data_cards.json";

    @Deprecated
    @NotNull
    public static final String SPORT_DATA_CONFIG = "config_sport_data.json";

    @Deprecated
    @NotNull
    public static final String SPORT_DATA_GROUP_CONFIG = "config_sport_data_group.json";

    @Deprecated
    @NotNull
    public static final String SPORT_TYPE_GROUP_CONFIG = "config_sport_type_group.json";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Context> context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportGroupConfig = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportDataConfig = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"com/huami/moving/config/impl/SportConfigManagerImpl$a", "", "", "SPORT_DATA_CARD_CONFIG", "Ljava/lang/String;", "SPORT_DATA_CONFIG", "SPORT_DATA_GROUP_CONFIG", "SPORT_TYPE_GROUP_CONFIG", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/moving/config/impl/SportDataConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SportDataConfig> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SportConfigManagerImpl a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportConfigManagerImpl sportConfigManagerImpl) {
                super(0);
                this.a = sportConfigManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                Context context = (Context) this.a.context.invoke();
                if (context == null) {
                    return null;
                }
                return FileUtilsKt.readAssets(context, SportConfigManagerImpl.SPORT_DATA_CONFIG);
            }
        }

        /* JADX INFO: renamed from: com.huami.moving.config.impl.SportConfigManagerImpl$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0492b extends Lambda implements Function0<String> {
            public final /* synthetic */ SportConfigManagerImpl a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0492b(SportConfigManagerImpl sportConfigManagerImpl) {
                super(0);
                this.a = sportConfigManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                Context context = (Context) this.a.context.invoke();
                if (context == null) {
                    return null;
                }
                return FileUtilsKt.readAssets(context, SportConfigManagerImpl.SPORT_DATA_GROUP_CONFIG);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ SportConfigManagerImpl a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SportConfigManagerImpl sportConfigManagerImpl) {
                super(0);
                this.a = sportConfigManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                Context context = (Context) this.a.context.invoke();
                if (context == null) {
                    return null;
                }
                return FileUtilsKt.readAssets(context, SportConfigManagerImpl.SPORT_DATA_CARD_CONFIG);
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportDataConfig invoke() {
            return new SportDataConfig(new a(SportConfigManagerImpl.this), new C0492b(SportConfigManagerImpl.this), new c(SportConfigManagerImpl.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/moving/config/impl/SportGroupConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SportGroupConfig> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SportConfigManagerImpl a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportConfigManagerImpl sportConfigManagerImpl) {
                super(0);
                this.a = sportConfigManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                Context context = (Context) this.a.context.invoke();
                if (context == null) {
                    return null;
                }
                return FileUtilsKt.readAssets(context, SportConfigManagerImpl.SPORT_TYPE_GROUP_CONFIG);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportGroupConfig invoke() {
            return new SportGroupConfig(new a(SportConfigManagerImpl.this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportConfigManagerImpl(@NotNull Function0<? extends Context> function0) {
        this.context = function0;
    }

    private final SportDataConfig a() {
        return (SportDataConfig) this.sportDataConfig.getValue();
    }

    private final SportGroupConfig b() {
        return (SportGroupConfig) this.sportGroupConfig.getValue();
    }

    @Override // com.huami.moving.config.SportConfigManager
    @NotNull
    public List<DataItem> getDataCardItems(int sportType) {
        String groupId = getGroupId(sportType);
        List<DataItem> dataCardItems = groupId == null ? null : a().getDataCardItems(groupId);
        return dataCardItems == null ? CollectionsKt__CollectionsKt.emptyList() : dataCardItems;
    }

    @Override // com.huami.moving.config.SportConfigManager
    @NotNull
    public Map<DataGroup, List<DataItem>> getDataList(int sportType) {
        String groupId = getGroupId(sportType);
        Map<DataGroup, List<DataItem>> dataList = groupId == null ? null : a().getDataList(groupId);
        return dataList == null ? r.emptyMap() : dataList;
    }

    @Override // com.huami.moving.config.SportConfigManager
    @Nullable
    public String getGroupId(int sportType) {
        return b().getGroupId(sportType);
    }
}
