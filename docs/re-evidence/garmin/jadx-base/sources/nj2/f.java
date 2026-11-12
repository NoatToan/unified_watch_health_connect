package nj2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel", f = "CustomerManagementViewModel.kt", l = {SyslogConstants.SYSLOG_PORT}, m = "getAddressValidation", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f126311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f126312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f126313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f126312b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f126311a = obj;
        this.f126313c |= Integer.MIN_VALUE;
        int i14 = a.A;
        return this.f126312b.C4(null, this);
    }
}
