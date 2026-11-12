package miuix.autodensity;

import defpackage.irc;
import miuix.app.Application;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class MiuixApplication extends Application implements irc {
    @Override // defpackage.irc
    public boolean b() {
        return true;
    }

    @Override // miuix.app.Application, android.app.Application
    public void onCreate() {
        super.onCreate();
        AutoDensityConfig.init(this);
    }
}
