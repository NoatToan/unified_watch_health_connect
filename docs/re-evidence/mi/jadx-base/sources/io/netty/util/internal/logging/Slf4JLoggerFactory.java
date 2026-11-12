package io.netty.util.internal.logging;

import defpackage.aqe;
import defpackage.coe;
import defpackage.igg;
import defpackage.qpe;

/* JADX INFO: loaded from: classes2.dex */
public class Slf4JLoggerFactory extends InternalLoggerFactory {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final InternalLoggerFactory INSTANCE = new Slf4JLoggerFactory();

    @Deprecated
    public Slf4JLoggerFactory() {
    }

    public static InternalLogger wrapLogger(qpe qpeVar) {
        return qpeVar instanceof coe ? new LocationAwareSlf4JLogger((coe) qpeVar) : new Slf4JLogger(qpeVar);
    }

    @Override // io.netty.util.internal.logging.InternalLoggerFactory
    public InternalLogger newInstance(String str) {
        return wrapLogger(aqe.g(str));
    }

    public Slf4JLoggerFactory(boolean z) {
        if (aqe.e() instanceof igg) {
            throw new NoClassDefFoundError("NOPLoggerFactory not supported");
        }
    }
}
