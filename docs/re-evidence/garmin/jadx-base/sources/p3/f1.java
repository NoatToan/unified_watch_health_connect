package p3;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class f1 implements e23.l<Long, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Object> f135078a;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(e23.l<? super Long, Object> lVar) {
        this.f135078a = lVar;
    }

    @Override // e23.l
    public final Object invoke(Long l14) {
        return this.f135078a.invoke(Long.valueOf(l14.longValue() / 1000000));
    }
}
