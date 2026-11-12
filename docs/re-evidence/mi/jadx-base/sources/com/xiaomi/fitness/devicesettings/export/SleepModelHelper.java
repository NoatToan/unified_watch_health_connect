package com.xiaomi.fitness.devicesettings.export;

import defpackage.q14;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ+\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/SleepModelHelper;", "", "Lkotlin/Function2;", "", "Lq14;", "", "callback", "getSleepModelTime", "(Lkotlin/jvm/functions/Function2;)V", "Companion", "device-settings-export_release"}, k = 1, mv = {2, 0, 0})
public interface SleepModelHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/SleepModelHelper$Companion;", "", "<init>", "()V", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void getSleepModelTime(@NotNull Function2<? super Integer, ? super q14, Unit> callback);
}
