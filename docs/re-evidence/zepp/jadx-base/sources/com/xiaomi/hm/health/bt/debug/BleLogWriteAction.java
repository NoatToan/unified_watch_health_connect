package com.xiaomi.hm.health.bt.debug;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00038F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLogWriteAction;", "Lcom/xiaomi/hm/health/bt/debug/BleLogAction;", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "log", "c", "Lkotlin/Lazy;", "getLogInfo", "()Ljava/lang/String;", "logInfo", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleLogWriteAction extends BleLogAction {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> log;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy logInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return (String) BleLogWriteAction.this.log.invoke();
        }
    }

    public BleLogWriteAction(@NotNull Function0<String> function0) {
        super(1);
        this.log = function0;
        this.logInfo = LazyKt__LazyJVMKt.lazy(new a());
    }

    @NotNull
    public final String getLogInfo() {
        return (String) this.logInfo.getValue();
    }
}
