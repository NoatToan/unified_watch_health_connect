package com.xiaomi.xms.wearable.di;

import com.mi.fitness.capability.export.model.CapabilityModel;
import com.xiaomi.xms.wearable.XmsManagerImpl;
import com.xms.wearable.export.XmsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/xiaomi/xms/wearable/di/XmsManagerModule;", "", "<init>", "()V", "bindXmsManager", "Lcom/xms/wearable/export/XmsManager;", "manager", "Lcom/xiaomi/xms/wearable/XmsManagerImpl;", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class XmsManagerModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/xms/wearable/di/XmsManagerModule$Companion;", "", "<init>", "()V", "provideWechatLicense", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CapabilityModel provideWechatLicense() {
            return new CapabilityModel(32);
        }
    }

    @NotNull
    public abstract XmsManager bindXmsManager(@NotNull XmsManagerImpl manager);
}
