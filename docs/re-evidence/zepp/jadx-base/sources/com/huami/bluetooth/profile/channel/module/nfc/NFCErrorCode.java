package com.huami.bluetooth.profile.channel.module.nfc;

import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0004\n\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode;", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "", "isSuccess", "", "code", "", "desc", "<init>", "(ILjava/lang/String;)V", "Companion", "EncryptedCard", "ReadCardFailed", "Success", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode$Success;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode$ReadCardFailed;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode$EncryptedCard;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class NFCErrorCode extends ErrorCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode$Companion;", "", "", "code", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "toErrorCode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ErrorCode toErrorCode(int code) {
            Success success = Success.INSTANCE;
            if (code == success.getCode()) {
                return success;
            }
            ReadCardFailed readCardFailed = ReadCardFailed.INSTANCE;
            if (code == readCardFailed.getCode()) {
                return readCardFailed;
            }
            EncryptedCard encryptedCard = EncryptedCard.INSTANCE;
            return code == encryptedCard.getCode() ? encryptedCard : new ErrorCode(code, "未知错误");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode$EncryptedCard;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EncryptedCard extends NFCErrorCode {

        @NotNull
        public static final EncryptedCard INSTANCE = new EncryptedCard();

        private EncryptedCard() {
            super(9, "认证失败，可复制UID/ATQA/SAK", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode$ReadCardFailed;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReadCardFailed extends NFCErrorCode {

        @NotNull
        public static final ReadCardFailed INSTANCE = new ReadCardFailed();

        private ReadCardFailed() {
            super(3, "未读到卡片的任何有效信息", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode$Success;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCErrorCode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends NFCErrorCode {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(0, "成功", null);
        }
    }

    private NFCErrorCode(int i, String str) {
        super(i, str);
    }

    public /* synthetic */ NFCErrorCode(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ErrorCode
    public boolean isSuccess() {
        return getCode() == Success.INSTANCE.getCode();
    }
}
