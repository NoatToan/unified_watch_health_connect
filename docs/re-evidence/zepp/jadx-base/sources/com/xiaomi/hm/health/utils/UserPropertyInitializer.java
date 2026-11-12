package com.xiaomi.hm.health.utils;

import android.content.Context;
import androidx.startup.Initializer;
import com.huami.account.HMLoginManager;
import com.huami.koinstartup.StartKoinInitializer;
import com.huami.member_card.MemberCardProperties;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.respiratoryrate.core.synctime.RespRateSyncTime;
import com.huami.sky.lib.properties.SkyPropertiesKey;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.DbMigrationInterceptor;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.entity.AbsFetchParams;
import com.huami.userproperty.entity.BatchFetchParams;
import com.huami.userproperty.entity.FetchParams;
import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.userproperty.service.entity.remote.BatchPushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.huami.userproperty.service.interceptor.BatchPushInterceptor;
import com.huami.userproperty.service.interceptor.Interceptor;
import com.xiaomi.hm.health.HMProperty;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.HmProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/utils/UserPropertyInitializer;", "Landroidx/startup/Initializer;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "create", "", "Ljava/lang/Class;", "dependencies", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class UserPropertyInitializer implements Initializer<Unit> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String huamiId = HMLoginManager.getHuamiId();
            if (huamiId == null) {
                huamiId = null;
            }
            if (huamiId == null) {
                return "";
            }
            return HMServerDef.getHost() + "users/" + huamiId + "/properties";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "key", "api", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<String, String, String> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ HmProperty b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, HmProperty hmProperty) {
                super(0);
                this.a = str;
                this.b = hmProperty;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "fallback 读取数据库：key=" + this.a + ", value=" + this.b.getValue();
            }
        }

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final String invoke(@NotNull String str, @Nullable String str2) {
            Object objM3845constructorimpl;
            String value;
            try {
                Result.Companion companion = Result.Companion;
                if (str2 != null) {
                    value = null;
                } else {
                    HmProperty hmPropertyLoad = HMDaoManager.getInstance().getHmPropertyDao().load(str);
                    HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new a(str, hmPropertyLoad));
                    value = hmPropertyLoad.getValue();
                }
                objM3845constructorimpl = Result.m3845constructorimpl(value);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        }
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return CollectionsKt__CollectionsKt.mutableListOf(StartKoinInitializer.class);
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        DbMigrationInterceptor dbMigrationInterceptor = new DbMigrationInterceptor(new b());
        UserPropertyManager userPropertyManager = UserPropertyManager.INSTANCE;
        userPropertyManager.registerInterceptor(dbMigrationInterceptor);
        userPropertyManager.registerInterceptor(new BatchPushInterceptor() { // from class: com.xiaomi.hm.health.utils.UserPropertyInitializer$create$sortingValueInterceptor$1
            @Override // com.huami.userproperty.service.interceptor.Interceptor
            @NotNull
            /* JADX INFO: renamed from: intercept, reason: merged with bridge method [inline-methods] */
            public ResultFuture<BatchPushResult> intercept2(@NotNull Interceptor.Chain<List<? extends LocalProperty>, ResultFuture<BatchPushResult>> chain) {
                List<? extends LocalProperty> listParams = chain.params();
                Map<String, Function1<String, String>> sortingHandlers = HMPropertyUtilExt.INSTANCE.getSortingHandlers();
                boolean z = false;
                if (!(listParams instanceof Collection) || !listParams.isEmpty()) {
                    Iterator<T> it2 = listParams.iterator();
                    while (it2.hasNext()) {
                        if (sortingHandlers.keySet().contains(((LocalProperty) it2.next()).getKey())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    return chain.handle(listParams);
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listParams, 10));
                for (LocalProperty localProperty : listParams) {
                    String key = localProperty.getKey();
                    Function1<String, String> function1 = sortingHandlers.get(key);
                    if (function1 != null) {
                        localProperty = new LocalProperty(key, function1.invoke(localProperty.getValue()), localProperty.getUpdateAt(), localProperty.getApi());
                    }
                    arrayList.add(localProperty);
                }
                return chain.handle(arrayList);
            }
        });
        userPropertyManager.setDefaultApi(a.a);
        userPropertyManager.registerFetchProperties(CollectionsKt__CollectionsKt.listOf((Object[]) new AbsFetchParams[]{new FetchParams(Property.PROPERTY_GROUP_HUAMI_MIFIT_USER_SETTINGS, "RANGE", null), new FetchParams(HMProperty.PROPERTY_GROUP_HUAMI_MIDONG_USER_SETTINGS, "RANGE", null), new BatchFetchParams(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{RespRateSyncTime.KEY, SkyPropertiesKey.PLAY_SETTINGS, SkyPropertiesKey.QUESTION_COMPLETE_STATUS, SkyPropertiesKey.SLEEP_REMINDER_SETTING, SkyPropertiesKey.MUSIC_PREFERENCE_QUESTIONNAIRE, MemberCardProperties.PROPERTY_MEMBER_CARD}), null, 2, null)}));
    }
}
