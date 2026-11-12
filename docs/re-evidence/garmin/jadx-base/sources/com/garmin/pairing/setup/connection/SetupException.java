package com.garmin.pairing.setup.connection;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ju2.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import rs2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/garmin/pairing/setup/connection/SetupException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lju2/a;", TtmlNode.TAG_METADATA, "", "msg", "", "cause", "Lrs2/c;", "deviceInfo", "<init>", "(Lju2/a;Ljava/lang/String;Ljava/lang/Throwable;Lrs2/c;)V", "Lju2/a;", "getMetadata", "()Lju2/a;", "Lrs2/c;", "getDeviceInfo", "()Lrs2/c;", "getStep", "()Ljava/lang/String;", "step", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SetupException extends Exception {
    private final c deviceInfo;
    private final a metadata;

    public /* synthetic */ SetupException(a aVar, String str, Throwable th3, c cVar, int i14, j jVar) {
        this(aVar, str, (i14 & 4) != 0 ? null : th3, (i14 & 8) != 0 ? null : cVar);
    }

    public final c getDeviceInfo() {
        return this.deviceInfo;
    }

    public final a getMetadata() {
        return this.metadata;
    }

    public final String getStep() {
        return this.metadata.f100939a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupException(a aVar, String str, Throwable th3, c cVar) {
        super(str, th3);
        aVar.getClass();
        str.getClass();
        this.metadata = aVar;
        this.deviceInfo = cVar;
    }
}
