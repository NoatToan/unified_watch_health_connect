package com.huami.bluetooth.profile.cmdrequest;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/cmdrequest/CmdRequest;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "array", "<init>", "([B)V", "", Constant.h, "cmdByteSize", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class CmdRequest extends Request.Command {
    public CmdRequest(@NotNull byte[] bArr) {
        super(bArr);
    }

    public CmdRequest(int i, int i2) {
        this(ByteUtilsKt.toByteArray(i, i2));
    }

    public /* synthetic */ CmdRequest(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 1 : i2);
    }
}
