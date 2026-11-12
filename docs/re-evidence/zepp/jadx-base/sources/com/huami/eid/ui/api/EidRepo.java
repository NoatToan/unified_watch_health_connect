package com.huami.eid.ui.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.nfc.eid.entities.EidStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0016"}, d2 = {"Lcom/huami/eid/ui/api/EidRepo;", "", "", "checkPwdState", "verifyWatchPwd", "", "getRequestId", "queryType", "requestId", "Lcom/huami/nfc/eid/entities/EidStatus;", "getEidStatus", "bizSerialNumber", "", "imageData", "", "faceCompare", "openEidCard", "deleteEidCard", "revokeEidCard", "url", "gotoWeb", "Companion", "eid_release"}, k = 1, mv = {1, 5, 1})
public interface EidRepo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String EID_AID = "A000000003454944";
    public static final int EID_TYPE = 5;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/eid/ui/api/EidRepo$Companion;", "", "", "EID_AID", "Ljava/lang/String;", "", "EID_TYPE", LogUtil.I, "<init>", "()V", "eid_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String EID_AID = "A000000003454944";
        public static final int EID_TYPE = 5;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ EidStatus getEidStatus$default(EidRepo eidRepo, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEidStatus");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return eidRepo.getEidStatus(str, str2);
        }
    }

    boolean checkPwdState();

    void deleteEidCard(@NotNull String bizSerialNumber);

    void faceCompare(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull byte[] imageData);

    @NotNull
    EidStatus getEidStatus(@NotNull String queryType, @Nullable String requestId);

    @NotNull
    String getRequestId();

    void gotoWeb(@NotNull String url);

    boolean openEidCard(@NotNull String bizSerialNumber, @NotNull String requestId);

    void revokeEidCard();

    boolean verifyWatchPwd();
}
