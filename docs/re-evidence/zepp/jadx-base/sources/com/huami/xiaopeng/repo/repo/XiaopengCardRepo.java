package com.huami.xiaopeng.repo.repo;

import com.huami.nfc.car.entity.VCardInfo;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u0013"}, d2 = {"Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepo;", "", "Lcom/huami/nfc/car/entity/VCardInfo;", "getVCardInfo", "", "action", "token", "keyToken", "", "issueCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "deleteCard", "()Lkotlin/Unit;", "bindDeviceDeleteCard", "aid", "", "isDefaultCard", "setDefaultCard", "Companion", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public interface XiaopengCardRepo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String XP_AID = "D2760001185347410002";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepo$Companion;", "", "", "XP_AID", "Ljava/lang/String;", "<init>", "()V", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String XP_AID = "D2760001185347410002";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    void bindDeviceDeleteCard();

    @Nullable
    Unit deleteCard();

    @Nullable
    VCardInfo getVCardInfo();

    boolean isDefaultCard(@NotNull String aid);

    @Nullable
    Unit issueCard(@NotNull String action, @Nullable String token, @Nullable String keyToken);

    boolean setDefaultCard(@NotNull String aid);
}
