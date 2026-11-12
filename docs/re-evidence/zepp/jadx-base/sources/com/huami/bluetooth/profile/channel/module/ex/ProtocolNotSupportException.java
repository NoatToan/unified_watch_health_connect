package com.huami.bluetooth.profile.channel.module.ex;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ex/ProtocolNotSupportException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", Constants.EXCEPTION, "(Ljava/lang/String;Ljava/lang/Exception;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ProtocolNotSupportException extends Exception {
    public ProtocolNotSupportException(@Nullable String str) {
        super(str);
    }

    public ProtocolNotSupportException(@Nullable String str, @NotNull Exception exc) {
        super(str, exc);
    }
}
