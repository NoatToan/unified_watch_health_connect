package com.huami.account.usecase;

import com.huami.account.AccountExternalsKt;
import com.huami.passport.AccountManager;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/account/usecase/CheckThirdPartNicknameUseCase;", "", "", Constant.METHOD_EXECUTE, "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class CheckThirdPartNicknameUseCase {

    @NotNull
    public static final CheckThirdPartNicknameUseCase INSTANCE = new CheckThirdPartNicknameUseCase();

    private CheckThirdPartNicknameUseCase() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    public final boolean execute() {
        boolean z;
        String provider = AccountManager.getDefault(AccountExternalsKt.getAppContext()).getProvider();
        if (provider != null) {
            switch (provider) {
                case "google":
                case "wechat":
                case "xiaomi":
                case "line":
                case "huami":
                case "facebook":
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
        } else {
            z = false;
        }
        return (z && Intrinsics.areEqual(AccountManager.getDefault(AccountExternalsKt.getAppContext()).getUserInfo().getNickName(), HMPersonInfo.getInstance().getUserInfo().getNickname())) ? false : true;
    }
}
