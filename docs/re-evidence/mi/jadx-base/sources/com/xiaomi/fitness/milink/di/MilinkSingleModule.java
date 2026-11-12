package com.xiaomi.fitness.milink.di;

import com.mi.fitness.capability.export.model.CapabilityModel;
import com.xiaomi.fitness.milink.export.MilinkManagerImpl;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/milink/di/MilinkSingleModule;", "", "<init>", "()V", "bindMilinkManager", "milinkManager", "Lcom/xiaomi/fitness/milink/export/MilinkManagerImpl;", "Companion", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MilinkSingleModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/milink/di/MilinkSingleModule$Companion;", "", "<init>", "()V", "provideMilink", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "provideScreenCast", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CapabilityModel provideMilink() {
            return MilinkHelper.INSTANCE.isSupportMilink() ? new CapabilityModel(16) : new CapabilityModel(0);
        }

        @NotNull
        public final CapabilityModel provideScreenCast() {
            return MilinkHelper.INSTANCE.isSupportScreenCast() ? new CapabilityModel(8) : new CapabilityModel(0);
        }
    }

    @NotNull
    public abstract Object bindMilinkManager(@NotNull MilinkManagerImpl milinkManager);
}
