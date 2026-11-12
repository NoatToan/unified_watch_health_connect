package com.garmin.pairing.setup.connection;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ju2.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import rs2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/pairing/setup/connection/SetupDisconnectException;", "Lcom/garmin/pairing/setup/connection/SetupException;", "Lju2/a;", TtmlNode.TAG_METADATA, "", "msg", "", "cause", "Lrs2/c;", "deviceInfo", "<init>", "(Lju2/a;Ljava/lang/String;Ljava/lang/Throwable;Lrs2/c;)V", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetupDisconnectException extends SetupException {
    public /* synthetic */ SetupDisconnectException(a aVar, String str, Throwable th3, c cVar, int i14, j jVar) {
        this(aVar, str, (i14 & 4) != 0 ? null : th3, (i14 & 8) != 0 ? null : cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupDisconnectException(a aVar, String str, Throwable th3, c cVar) {
        super(aVar, str, th3, cVar);
        aVar.getClass();
        str.getClass();
    }
}
