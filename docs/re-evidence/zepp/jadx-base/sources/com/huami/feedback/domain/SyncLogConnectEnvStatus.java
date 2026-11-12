package com.huami.feedback.domain;

import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/feedback/domain/SyncLogConnectEnvStatus;", "", "", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BluetoothOff", "Disconnected", TrainingAnalytics.ParamValue.Network.NO_NETWORK, "Successful", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public enum SyncLogConnectEnvStatus {
    BluetoothOff("BluetoothOff"),
    Disconnected("Disconnected"),
    NoNetwork(TrainingAnalytics.ParamValue.Network.NO_NETWORK),
    Successful("Successful");


    @NotNull
    private final String status;

    SyncLogConnectEnvStatus(String str) {
        this.status = str;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
