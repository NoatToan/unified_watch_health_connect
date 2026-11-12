package org.koin.core.logger;

import com.huami.nfc.bus.NoticesEntity;
import kotlin.Metadata;
import org.cybergarage.upnp.std.av.server.ContentDirectory;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/koin/core/logger/Level;", "", "<init>", "(Ljava/lang/String;I)V", "DEBUG", "INFO", ContentDirectory.ERROR, NoticesEntity.LOOP_TYPE_NONE, "koin-core"}, k = 1, mv = {1, 5, 1})
public enum Level {
    DEBUG,
    INFO,
    ERROR,
    NONE
}
