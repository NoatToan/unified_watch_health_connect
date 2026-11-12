package qk2;

import com.garmin.device.filetransfer.adhoc.AdHocException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk2.c f145198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdHocException f145199c;

    public /* synthetic */ c(mk2.c cVar, AdHocException adHocException, int i14) {
        this.f145197a = i14;
        this.f145198b = cVar;
        this.f145199c = adHocException;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f145197a) {
            case 0:
                this.f145198b.b(this.f145199c);
                break;
            default:
                this.f145198b.a(this.f145199c);
                break;
        }
        return Unit.INSTANCE;
    }
}
