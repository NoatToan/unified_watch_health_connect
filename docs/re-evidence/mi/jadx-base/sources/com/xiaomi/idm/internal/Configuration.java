package com.xiaomi.idm.internal;

import com.xiaomi.idm.api.IDMBase;
import com.xiaomi.idm.compat.proto.IPCParam$Configuration;
import defpackage.gpe;
import defpackage.pvc;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/idm/internal/Configuration;", "", "()V", "enableConfig", "", "idmBase", "Lcom/xiaomi/idm/api/IDMBase;", "Companion", "SendBlockConfiguration", "Lcom/xiaomi/idm/internal/Configuration$SendBlockConfiguration;", "IDMSdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Configuration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "Configuration";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/idm/internal/Configuration$Companion;", "", "()V", "TAG", "", "fromProto", "Lcom/xiaomi/idm/internal/Configuration;", "proto", "Lcom/xiaomi/idm/compat/proto/IPCParam$Configuration;", "IDMSdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IPCParam$Configuration.Type.values().length];
                iArr[IPCParam$Configuration.Type.SEND_BLOCK.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Configuration fromProto(@NotNull IPCParam$Configuration proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/idm/internal/Configuration$SendBlockConfiguration;", "Lcom/xiaomi/idm/internal/Configuration;", "Lcom/xiaomi/idm/api/IDMBase;", "idmBase", "", "enableConfig", "(Lcom/xiaomi/idm/api/IDMBase;)V", "Lpvc;", "sendBlockConfiguration", "Lpvc;", "<init>", "(Lpvc;)V", "Companion", "IDMSdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class SendBlockConfiguration extends Configuration {

        @NotNull
        private static final String TAG = "SendBlockConfiguration";

        @NotNull
        private final pvc sendBlockConfiguration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendBlockConfiguration(@NotNull pvc sendBlockConfiguration) {
            super(null);
            Intrinsics.checkNotNullParameter(sendBlockConfiguration, "sendBlockConfiguration");
        }

        @Override // com.xiaomi.idm.internal.Configuration
        public void enableConfig(@NotNull IDMBase idmBase) {
            Intrinsics.checkNotNullParameter(idmBase, "idmBase");
            pvc pvcVar = this.sendBlockConfiguration;
            String clientId = pvcVar.getClientId();
            Intrinsics.checkNotNullExpressionValue(clientId, "it.clientId");
            String strB = pvcVar.b();
            Intrinsics.checkNotNullExpressionValue(strB, "it.serviceId");
            Connection connection = idmBase.getConnection(clientId, strB);
            if (connection == null) {
                connection = null;
            } else {
                connection.setSendBlockTimeout(pvcVar.d());
                connection.setSendBlockSizePerPacket(pvcVar.c());
                connection.setSendBlockMaxParallelTaskNumber(pvcVar.a());
            }
            if (connection == null) {
                gpe.c(TAG, "enableConfig failed", new Object[0]);
            }
        }
    }

    private Configuration() {
    }

    public /* synthetic */ Configuration(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @Nullable
    public static final Configuration fromProto(@NotNull IPCParam$Configuration iPCParam$Configuration) {
        return INSTANCE.fromProto(iPCParam$Configuration);
    }

    public abstract void enableConfig(@NotNull IDMBase idmBase);
}
