package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import defpackage.tet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/Spo2Node;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "timeDiff", "", "spo2", "", "(JI)V", "getSpo2", "()I", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Spo2Node extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int spo2;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/Spo2Node$Companion;", "", "()V", "parse", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/Spo2Node;", "byteArray", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Spo2Node parse(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return new Spo2Node(tet.v(byteArray, 0, 2), tet.d(byteArray, 2, 1));
        }
    }

    public Spo2Node(long j, int i) {
        super(j);
        this.spo2 = i;
    }

    public final int getSpo2() {
        return this.spo2;
    }
}
