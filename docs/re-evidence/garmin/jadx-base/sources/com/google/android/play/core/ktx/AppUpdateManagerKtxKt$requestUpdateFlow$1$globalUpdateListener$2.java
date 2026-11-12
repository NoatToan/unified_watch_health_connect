package com.google.android.play.core.ktx;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import q53.t;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2 extends w implements l<AppUpdatePassthroughListener, Unit> {
    final /* synthetic */ t<AppUpdateResult> $$this$callbackFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(t<? super AppUpdateResult> tVar) {
        super(1);
        this.$$this$callbackFlow = tVar;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AppUpdatePassthroughListener appUpdatePassthroughListener) {
        appUpdatePassthroughListener.getClass();
        this.$$this$callbackFlow.q(null);
    }

    @Override // e23.l
    public final /* bridge */ /* synthetic */ Unit invoke(AppUpdatePassthroughListener appUpdatePassthroughListener) {
        invoke2(appUpdatePassthroughListener);
        return Unit.INSTANCE;
    }
}
