package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Ln6;", "Lds;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "settings", "", PluginDeviceInfo.FMODEL, "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "<init>", "()V", PluginDeviceInfo.FBLUETOOTHPAIR, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class n6 implements ds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f27581a = new f(null);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.DefaultInterceptor", f = "DefaultInterceptor.kt", i = {0, 0}, l = {21}, m = "onWrite", n = {"settingsModule", "settings"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return n6.this.a(null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "settingsModule null!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SettingsGroupType> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends SettingsGroupType> list) {
            super(0);
            this.t = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "groupTypes which version should be init: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d t = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "querySettings failed!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<SettingsGroupType, Settings> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Map.Entry<? extends SettingsGroupType, ? extends Settings> entry) {
            super(0);
            this.t = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "version of " + this.t.getKey() + " is null!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ln6$f;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f {
        public f() {
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb A[LOOP:0: B:36:0x00ce->B:42:0x00fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ds
    @Nullable
    public Object a(@Nullable SettingsModule settingsModule, @NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        Integer numA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.x = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQuerySettings = aVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.x;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuerySettings);
            if (settingsModule == null) {
                le.a("DefaultInterceptor", null, null, b.t, 6, null);
                return Boxing.boxBoolean(false);
            }
            Set<SettingsGroupType> setKeySet = map.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "settings.keys");
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                SettingsGroupType it = (SettingsGroupType) obj;
                ad adVar = ad.f888a;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (adVar.a(settingsModule, it) == null) {
                    arrayList.add(obj);
                }
            }
            le.c("DefaultInterceptor", new c(arrayList));
            if (!arrayList.isEmpty()) {
                Object[] array = arrayList.toArray(new SettingsGroupType[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                aVar.t = settingsModule;
                aVar.u = map;
                aVar.x = 1;
                objQuerySettings = settingsModule.querySettings(false, (SettingsGroupType[]) array, aVar);
                if (objQuerySettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            for (Map.Entry<SettingsGroupType, Settings> entry : map.entrySet()) {
                numA = ad.f888a.a(settingsModule, entry.getKey());
                if (numA == null) {
                    le.a("DefaultInterceptor", null, null, new e(entry), 6, null);
                    return Boxing.boxBoolean(false);
                }
                entry.getValue().setGroupVersion(numA.intValue());
            }
            return Boxing.boxBoolean(true);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = (HashMap) aVar.u;
        settingsModule = (SettingsModule) aVar.t;
        ResultKt.throwOnFailure(objQuerySettings);
        Map map2 = (Map) objQuerySettings;
        if (map2 == null || map2.isEmpty()) {
            le.a("DefaultInterceptor", null, null, d.t, 6, null);
            return Boxing.boxBoolean(false);
        }
        while (r13.hasNext()) {
            numA = ad.f888a.a(settingsModule, entry.getKey());
            if (numA == null) {
                le.a("DefaultInterceptor", null, null, new e(entry), 6, null);
                return Boxing.boxBoolean(false);
            }
            entry.getValue().setGroupVersion(numA.intValue());
        }
        return Boxing.boxBoolean(true);
    }

    @NotNull
    public String toString() {
        return "DefaultInterceptor";
    }
}
