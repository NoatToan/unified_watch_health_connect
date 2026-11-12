package com.huami.bluetooth.profile.channel.module.settings;

import com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsInterceptor;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/DefaultInterceptor;", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/SettingsInterceptor;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "settings", "", "onWrite", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultInterceptor implements SettingsInterceptor {

    @NotNull
    private static final String a = "DefaultInterceptor";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.DefaultInterceptor", f = "DefaultInterceptor.kt", i = {}, l = {21}, m = "onWrite", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DefaultInterceptor.this.onWrite(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "settingsModule null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SettingsGroupType> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends SettingsGroupType> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("groupTypes which version should be init: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "querySettings failed!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<SettingsGroupType, Settings> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Map.Entry<? extends SettingsGroupType, ? extends Settings> entry) {
            super(0);
            this.a = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "version of " + this.a.getKey() + " is null!";
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106 A[LOOP:0: B:44:0x00d9->B:50:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsInterceptor
    @Nullable
    public Object onWrite(@Nullable SettingsModule settingsModule, @NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        Integer cacheGroupVersion;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQuerySettings = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuerySettings);
            if (settingsModule == null) {
                HMLog.error$default(a, null, null, b.a, 6, null);
                return Boxing.boxBoolean(false);
            }
            Set<SettingsGroupType> setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (Boxing.boxBoolean(GroupVersionCache.INSTANCE.getCacheGroupVersion(settingsModule, (SettingsGroupType) obj) == null).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            HMLog.info(a, new c(arrayList));
            if (!arrayList.isEmpty()) {
                Object[] array = arrayList.toArray(new SettingsGroupType[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                aVar.a = settingsModule;
                aVar.b = map;
                aVar.e = 1;
                objQuerySettings = settingsModule.querySettings(false, (SettingsGroupType[]) array, aVar);
                if (objQuerySettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            for (Map.Entry<SettingsGroupType, Settings> entry : map.entrySet()) {
                cacheGroupVersion = GroupVersionCache.INSTANCE.getCacheGroupVersion(settingsModule, entry.getKey());
                if (cacheGroupVersion == null) {
                    HMLog.error$default(a, null, null, new e(entry), 6, null);
                    return Boxing.boxBoolean(false);
                }
                entry.getValue().setGroupVersion(cacheGroupVersion.intValue());
            }
            return Boxing.boxBoolean(true);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        HashMap<SettingsGroupType, Settings> map2 = (HashMap) aVar.b;
        SettingsModule settingsModule2 = (SettingsModule) aVar.a;
        ResultKt.throwOnFailure(objQuerySettings);
        map = map2;
        settingsModule = settingsModule2;
        Map map3 = (Map) objQuerySettings;
        if (map3 == null || map3.isEmpty()) {
            HMLog.error$default(a, null, null, d.a, 6, null);
            return Boxing.boxBoolean(false);
        }
        while (r14.hasNext()) {
            cacheGroupVersion = GroupVersionCache.INSTANCE.getCacheGroupVersion(settingsModule, entry.getKey());
            if (cacheGroupVersion == null) {
                HMLog.error$default(a, null, null, new e(entry), 6, null);
                return Boxing.boxBoolean(false);
            }
            entry.getValue().setGroupVersion(cacheGroupVersion.intValue());
        }
        return Boxing.boxBoolean(true);
    }

    @NotNull
    public String toString() {
        return a;
    }
}
