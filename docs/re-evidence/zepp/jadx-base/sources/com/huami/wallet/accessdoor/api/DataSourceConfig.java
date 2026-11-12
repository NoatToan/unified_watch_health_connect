package com.huami.wallet.accessdoor.api;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/wallet/accessdoor/api/DataSourceConfig;", "", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getWithBleApi", "()Lkotlin/jvm/functions/Function0;", "setWithBleApi", "(Lkotlin/jvm/functions/Function0;)V", "withBleApi", "Lcom/huami/wallet/accessdoor/api/OnAccessDoorHttpError;", "b", "Lcom/huami/wallet/accessdoor/api/OnAccessDoorHttpError;", "getOnAccessDoorHttpErrorSupplier", "()Lcom/huami/wallet/accessdoor/api/OnAccessDoorHttpError;", "setOnAccessDoorHttpErrorSupplier", "(Lcom/huami/wallet/accessdoor/api/OnAccessDoorHttpError;)V", "onAccessDoorHttpErrorSupplier", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class DataSourceConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Function0<Boolean> withBleApi = a.a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private OnAccessDoorHttpError onAccessDoorHttpErrorSupplier;

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
            return false;
        }
    }

    @Nullable
    public final OnAccessDoorHttpError getOnAccessDoorHttpErrorSupplier() {
        return this.onAccessDoorHttpErrorSupplier;
    }

    @NotNull
    public final Function0<Boolean> getWithBleApi() {
        return this.withBleApi;
    }

    public final void setOnAccessDoorHttpErrorSupplier(@Nullable OnAccessDoorHttpError onAccessDoorHttpError) {
        this.onAccessDoorHttpErrorSupplier = onAccessDoorHttpError;
    }

    public final void setWithBleApi(@NotNull Function0<Boolean> function0) {
        this.withBleApi = function0;
    }
}
