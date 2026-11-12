package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class dws implements nws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bws f16016a;

    public dws(bws bwsVar) {
        this.f16016a = bwsVar;
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, int i, Exception exc) {
        x9s.B("[Slim] " + this.f16016a.f4682a.format(new Date()) + " Connection closed (" + this.f16016a.f4683b.hashCode() + ")");
    }

    @Override // defpackage.nws
    public void b(gws gwsVar) {
        x9s.B("[Slim] " + this.f16016a.f4682a.format(new Date()) + " Connection reconnected (" + this.f16016a.f4683b.hashCode() + ")");
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, Exception exc) {
        x9s.B("[Slim] " + this.f16016a.f4682a.format(new Date()) + " Reconnection failed due to an exception (" + this.f16016a.f4683b.hashCode() + ")");
        exc.printStackTrace();
    }

    @Override // defpackage.nws
    public void a(gws gwsVar) {
        x9s.B("[Slim] " + this.f16016a.f4682a.format(new Date()) + " Connection started (" + this.f16016a.f4683b.hashCode() + ")");
    }
}
