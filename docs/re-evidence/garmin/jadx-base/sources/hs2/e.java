package hs2;

import jn2.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhs2/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        FIRMWARE_MISSING_REQUIRED_CMDS,
        ENVIRONMENT_MISMATCH,
        NFC_STACK_FAILED
    }

    void b(hs2.a aVar, m mVar);

    void c(long j8);

    void d(long j8, a aVar);
}
