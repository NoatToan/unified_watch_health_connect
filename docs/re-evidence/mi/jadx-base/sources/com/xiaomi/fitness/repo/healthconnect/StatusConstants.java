package com.xiaomi.fitness.repo.healthconnect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/StatusConstants;", "", "<init>", "()V", "SyncStatus", "DeletedStatus", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatusConstants {

    @NotNull
    public static final StatusConstants INSTANCE = new StatusConstants();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/StatusConstants$DeletedStatus;", "", "<init>", "()V", "DELETED", "", "UN_DELETED", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeletedStatus {
        public static final int DELETED = 1;

        @NotNull
        public static final DeletedStatus INSTANCE = new DeletedStatus();
        public static final int UN_DELETED = 0;

        private DeletedStatus() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/StatusConstants$SyncStatus;", "", "<init>", "()V", "SYNCED", "", "UN_SYNCED", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SyncStatus {

        @NotNull
        public static final SyncStatus INSTANCE = new SyncStatus();
        public static final int SYNCED = 1;
        public static final int UN_SYNCED = 0;

        private SyncStatus() {
        }
    }

    private StatusConstants() {
    }
}
