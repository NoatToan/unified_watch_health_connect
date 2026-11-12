package com.mi.health.appupgrade;

import com.mi.health.appupgrade.model.AppUpgradeResult;
import com.mi.health.appupgrade.net.AppUpgradeRequest;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class AppUpgradeUtil$doCheckAppUpgrade$requestFunction$1 extends FunctionReferenceImpl implements Function5<String, String, Long, Function1<? super AppUpgradeResult, ? extends Unit>, Function1<? super ApiException, ? extends Unit>, Unit> {
    public AppUpgradeUtil$doCheckAppUpgrade$requestFunction$1(Object obj) {
        super(5, obj, AppUpgradeRequest.class, "getAppUpgradeDetails", "getAppUpgradeDetails(Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Long l, Function1<? super AppUpgradeResult, ? extends Unit> function1, Function1<? super ApiException, ? extends Unit> function2) {
        invoke(str, str2, l.longValue(), (Function1<? super AppUpgradeResult, Unit>) function1, (Function1<? super ApiException, Unit>) function2);
        return Unit.INSTANCE;
    }

    public final void invoke(String p0, String p1, long j, Function1<? super AppUpgradeResult, Unit> p3, Function1<? super ApiException, Unit> p4) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p3, "p3");
        Intrinsics.checkNotNullParameter(p4, "p4");
        ((AppUpgradeRequest) this.receiver).getAppUpgradeDetails(p0, p1, j, p3, p4);
    }
}
