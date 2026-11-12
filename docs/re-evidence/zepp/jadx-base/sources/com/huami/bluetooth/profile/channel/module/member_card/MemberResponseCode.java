package com.huami.bluetooth.profile.channel.module.member_card;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/MemberResponseCode;", "", "", c.p, LogUtil.I, "INVALID_PARAMETER", "NOT_SUPPORT_CMD", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MemberResponseCode {

    @NotNull
    public static final MemberResponseCode INSTANCE = new MemberResponseCode();
    public static final int INVALID_PARAMETER = 2;
    public static final int NOT_SUPPORT_CMD = 3;
    public static final int SUCCESS = 1;

    private MemberResponseCode() {
    }
}
