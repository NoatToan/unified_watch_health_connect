package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.lang.reflect.Constructor;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class n implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53621a;

    public /* synthetic */ n(int i14) {
        this.f53621a = i14;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f53621a) {
            case 0:
                return FuturesGetChecked.lambda$static$0((List) obj);
            case 1:
                return FuturesGetChecked.lambda$static$1((List) obj);
            case 2:
                return FuturesGetChecked.lambda$static$2((Constructor) obj);
            default:
                return ClosingFuture.access$000((ClosingFuture) obj);
        }
    }
}
