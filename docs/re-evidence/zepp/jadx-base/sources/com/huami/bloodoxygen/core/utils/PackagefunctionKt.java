package com.huami.bloodoxygen.core.utils;

import com.huami.bloodoxygen.core.koin.BloodOxygenConfig;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002\"\u001d\u0010\n\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"", "tag", "Lkotlin/Function0;", "messageCollector", "", "bloodOxygenDebugLog", "", "a", "Lkotlin/Lazy;", "()Z", "isDevOrInnerChannel", "core_release"}, k = 2, mv = {1, 5, 1})
public final class PackagefunctionKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return ((BloodOxygenConfig) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).isDevOrInnerChannel();
        }
    }

    private static final boolean a() {
        return ((Boolean) a.getValue()).booleanValue();
    }

    public static final void bloodOxygenDebugLog(@NotNull String str, @NotNull Function0<String> function0) {
        if (a()) {
            HMLog.info(str, function0);
        }
    }

    public static /* synthetic */ void bloodOxygenDebugLog$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "BloodOxygenDebugLog";
        }
        bloodOxygenDebugLog(str, function0);
    }
}
