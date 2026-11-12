package com.google.accompanist.permissions;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1 extends w implements l<Boolean, Unit> {
    final /* synthetic */ l<Boolean, Unit> $onPermissionResult;
    final /* synthetic */ MutablePermissionState $permissionState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1(MutablePermissionState mutablePermissionState, l<? super Boolean, Unit> lVar) {
        super(1);
        this.$permissionState = mutablePermissionState;
        this.$onPermissionResult = lVar;
    }

    public final void invoke(boolean z14) {
        this.$permissionState.refreshPermissionStatus$permissions_release();
        this.$onPermissionResult.invoke(Boolean.valueOf(z14));
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
