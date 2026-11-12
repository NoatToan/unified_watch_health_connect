package com.google.android.play.core.ktx;

import e23.a;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class AppUpdateManagerKtxKt$runTask$3$1 extends w implements l<Throwable, Unit> {
    final /* synthetic */ a<Unit> $onCanceled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$runTask$3$1(a<Unit> aVar) {
        super(1);
        this.$onCanceled = aVar;
    }

    @Override // e23.l
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
        invoke2(th3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th3) {
        this.$onCanceled.invoke();
    }
}
