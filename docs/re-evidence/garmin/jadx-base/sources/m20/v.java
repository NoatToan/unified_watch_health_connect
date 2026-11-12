package m20;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo", f = "ContactsRepo.kt", l = {SyslogConstants.LOG_LOCAL2, 157}, m = "updateContact", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l20.a f116041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.b f116042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f116043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f116044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f116044d = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116043c = obj;
        this.f116045e |= Integer.MIN_VALUE;
        return this.f116044d.h(null, this);
    }
}
