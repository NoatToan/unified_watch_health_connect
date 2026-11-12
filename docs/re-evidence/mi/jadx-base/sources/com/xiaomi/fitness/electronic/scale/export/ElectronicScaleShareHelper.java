package com.xiaomi.fitness.electronic.scale.export;

import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\b\u0010\t\u001a\u00020\u0005H&J(\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH&¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleShareHelper;", "", "isOwner", "", "checkSharedScale", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", "refreshShareToOtherList", "updateShareStatus", "userId", "", "shareUserId", "shareId", "type", "", "offlineShareDevice", "checkAccountWhetherShared", "did", "full", "Companion", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ElectronicScaleShareHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleShareHelper$Companion;", "", "<init>", "()V", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    boolean checkAccountWhetherShared(@NotNull String userId, @Nullable String did);

    void checkSharedScale(@NotNull Function1<? super ShareAccount, Unit> success);

    boolean full(@NotNull String did);

    boolean isOwner();

    boolean offlineShareDevice();

    void refreshShareToOtherList();

    void updateShareStatus(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int type);
}
