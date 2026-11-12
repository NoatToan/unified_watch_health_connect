package com.huami.bluetooth.profile.channel.module.find;

import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0004\b\t\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode;", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "", "code", "", "desc", "<init>", "(ILjava/lang/String;)V", "Companion", "InvalidParameter", "OK", "UnSupportCommand", "Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode$OK;", "Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode$InvalidParameter;", "Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode$UnSupportCommand;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class FindErrorCode extends ErrorCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode$Companion;", "", "", "code", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "toErrorCode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ErrorCode toErrorCode(int code) {
            OK ok = OK.INSTANCE;
            if (code == ok.getCode()) {
                return ok;
            }
            InvalidParameter invalidParameter = InvalidParameter.INSTANCE;
            if (code == invalidParameter.getCode()) {
                return invalidParameter;
            }
            UnSupportCommand unSupportCommand = UnSupportCommand.INSTANCE;
            return code == unSupportCommand.getCode() ? unSupportCommand : new ErrorCode(code, "未知错误");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode$InvalidParameter;", "Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class InvalidParameter extends FindErrorCode {

        @NotNull
        public static final InvalidParameter INSTANCE = new InvalidParameter();

        private InvalidParameter() {
            super(2, "无效参数", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode$OK;", "Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class OK extends FindErrorCode {

        @NotNull
        public static final OK INSTANCE = new OK();

        private OK() {
            super(1, "成功", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode$UnSupportCommand;", "Lcom/huami/bluetooth/profile/channel/module/find/FindErrorCode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UnSupportCommand extends FindErrorCode {

        @NotNull
        public static final UnSupportCommand INSTANCE = new UnSupportCommand();

        private UnSupportCommand() {
            super(3, "无效命令", null);
        }
    }

    private FindErrorCode(int i, String str) {
        super(i, str);
    }

    public /* synthetic */ FindErrorCode(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }
}
