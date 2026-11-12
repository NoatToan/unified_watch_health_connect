package com.google.accompanist.permissions;

import e23.l;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "permissionsResult", "", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1 extends w implements l<Map<String, Boolean>, Unit> {
    final /* synthetic */ MutableMultiplePermissionsState $multiplePermissionsState;
    final /* synthetic */ l<Map<String, Boolean>, Unit> $onPermissionsResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1(MutableMultiplePermissionsState mutableMultiplePermissionsState, l<? super Map<String, Boolean>, Unit> lVar) {
        super(1);
        this.$multiplePermissionsState = mutableMultiplePermissionsState;
        this.$onPermissionsResult = lVar;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Boolean> map) {
        map.getClass();
        this.$multiplePermissionsState.updatePermissionsStatus$permissions_release(map);
        this.$onPermissionsResult.invoke(map);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
        invoke2(map);
        return Unit.INSTANCE;
    }
}
