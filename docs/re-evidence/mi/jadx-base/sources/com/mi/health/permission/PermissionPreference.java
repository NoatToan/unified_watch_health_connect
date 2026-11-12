package com.mi.health.permission;

import com.google.gson.Gson;
import com.mi.health.permission.PermissionPreference;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0005J\u001c\u0010\u001d\u001a\u00020\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/mi/health/permission/PermissionPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_PER_NOT_REMIND_MAP", "getKEY_PER_NOT_REMIND_MAP", "setKEY_PER_NOT_REMIND_MAP", "(Ljava/lang/String;)V", "KEY_PER_NOT_REMIND_MAP$delegate", "Lkotlin/properties/ReadWriteProperty;", "permissionRejectNotRemindMap", "", "", "getPermissionRejectNotRemindMap", "()Ljava/util/Map;", "permissionRejectNotRemindMap$delegate", "Lkotlin/Lazy;", "removePermissionRejectStatus", "", "key", "putPermissionRejectAndNotRemindStatus", "value", "getPermissionRejectAndNotRemindStatus", "asyncUpdatePrefByMap", "map", "", "permission-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionPreference.kt\ncom/mi/health/permission/PermissionPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,54:1\n140#2:55\n*S KotlinDebug\n*F\n+ 1 PermissionPreference.kt\ncom/mi/health/permission/PermissionPreference\n*L\n15#1:55\n*E\n"})
public final class PermissionPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PermissionPreference.class, "KEY_PER_NOT_REMIND_MAP", "getKEY_PER_NOT_REMIND_MAP()Ljava/lang/String;", 0))};

    @NotNull
    public static final PermissionPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_PER_NOT_REMIND_MAP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_PER_NOT_REMIND_MAP;

    @NotNull
    public static final String TAG = "PermissionPreference";

    /* JADX INFO: renamed from: permissionRejectNotRemindMap$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy permissionRejectNotRemindMap;

    /* JADX INFO: renamed from: com.mi.health.permission.PermissionPreference$asyncUpdatePrefByMap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.permission.PermissionPreference$asyncUpdatePrefByMap$1", f = "PermissionPreference.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Boolean> $map;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, Boolean> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$map = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$map, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String json = new Gson().toJson(this.$map);
            Logger.i(PermissionPreference.TAG, "asyncUpdatePrefByMap json " + json);
            PermissionPreference.INSTANCE.setKEY_PER_NOT_REMIND_MAP(json);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        PermissionPreference permissionPreference = new PermissionPreference();
        INSTANCE = permissionPreference;
        String json = new Gson().toJson(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        KEY_PER_NOT_REMIND_MAP = permissionPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.mi.health.permission.PermissionPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), json, "per_not_remind_map", true);
        permissionRejectNotRemindMap = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ksh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionPreference.permissionRejectNotRemindMap_delegate$lambda$0();
            }
        });
    }

    private PermissionPreference() {
    }

    private final void asyncUpdatePrefByMap(Map<String, Boolean> map) {
        AnyExtKt.io$default(null, new AnonymousClass1(map, null), 1, null);
    }

    private final String getKEY_PER_NOT_REMIND_MAP() {
        return (String) KEY_PER_NOT_REMIND_MAP.getValue(this, $$delegatedProperties[0]);
    }

    private final Map<String, Boolean> getPermissionRejectNotRemindMap() {
        Object value = permissionRejectNotRemindMap.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Map) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map permissionRejectNotRemindMap_delegate$lambda$0() {
        Map map = (Map) new Gson().fromJson(INSTANCE.getKEY_PER_NOT_REMIND_MAP(), (Type) Map.class);
        Logger.i(TAG, "initMap " + map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setKEY_PER_NOT_REMIND_MAP(String str) {
        KEY_PER_NOT_REMIND_MAP.setValue(this, $$delegatedProperties[0], str);
    }

    public final boolean getPermissionRejectAndNotRemindStatus(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Boolean bool = getPermissionRejectNotRemindMap().get(key);
        Logger.i(TAG, "getPermissionRejectAndNotRemindStatus key " + key + ";result " + bool);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_permission_config";
    }

    public final void putPermissionRejectAndNotRemindStatus(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Logger.i(TAG, "putPermissionRejectAndNotRemindStatus key " + key + ";value " + value);
        getPermissionRejectNotRemindMap().put(key, Boolean.valueOf(value));
        asyncUpdatePrefByMap(MapsKt__MapsKt.toMap(getPermissionRejectNotRemindMap()));
    }

    public final void removePermissionRejectStatus(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Logger.i(TAG, "removePermissionRejectStatus key " + key);
        if (getPermissionRejectNotRemindMap().containsKey(key)) {
            getPermissionRejectNotRemindMap().remove(key);
            asyncUpdatePrefByMap(MapsKt__MapsKt.toMap(getPermissionRejectNotRemindMap()));
        }
    }
}
