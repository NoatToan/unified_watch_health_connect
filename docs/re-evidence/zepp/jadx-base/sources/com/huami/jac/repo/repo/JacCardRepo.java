package com.huami.jac.repo.repo;

import com.huami.nfc.car.entity.SupportCar;
import com.huami.nfc.car.entity.VCardInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&JA\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\rH&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H&¨\u0006\u0018"}, d2 = {"Lcom/huami/jac/repo/repo/JacCardRepo;", "", "Lcom/huami/nfc/car/entity/VCardInfo;", "getVCardInfo", "", "Lcom/huami/nfc/car/entity/SupportCar;", "getSupportCarList", "", "action", "token", "keyToken", "watchId", "vin", "", "issueCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "deleteCard", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "bindDeviceDeleteCard", "aid", "", "isDefaultCard", "setDefaultCard", "Companion", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public interface JacCardRepo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String JAC_AID = "F060BBA2E1B8FD6B01";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/jac/repo/repo/JacCardRepo$Companion;", "", "", "JAC_AID", "Ljava/lang/String;", "<init>", "()V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String JAC_AID = "F060BBA2E1B8FD6B01";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    void bindDeviceDeleteCard();

    @Nullable
    Unit deleteCard(@Nullable String watchId, @Nullable String vin);

    @Nullable
    List<SupportCar> getSupportCarList();

    @Nullable
    VCardInfo getVCardInfo();

    boolean isDefaultCard(@NotNull String aid);

    @Nullable
    Unit issueCard(@NotNull String action, @Nullable String token, @Nullable String keyToken, @Nullable String watchId, @Nullable String vin);

    boolean setDefaultCard(@NotNull String aid);
}
