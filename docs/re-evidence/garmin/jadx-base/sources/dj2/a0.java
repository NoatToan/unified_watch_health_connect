package dj2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "getPhoneNumber", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f59983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(a aVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f59983b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59982a = obj;
        this.f59984c |= Integer.MIN_VALUE;
        return this.f59983b.n(null, this);
    }
}
