package tw2;

import la2.c;
import la2.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltw2/a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.realtimesettings.app.presentationlayer.a f166800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3137a f166801b = new C3137a();

    /* JADX INFO: renamed from: tw2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"tw2/a$a", "Lla2/a;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3137a implements la2.a {
        public C3137a() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            com.garmin.realtimesettings.app.presentationlayer.a aVar = a.this.f166800a;
            if (aVar != null) {
                aVar.R9(true);
            }
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
            com.garmin.realtimesettings.app.presentationlayer.a aVar = a.this.f166800a;
            if (aVar != null) {
                aVar.R9(false);
            }
        }
    }
}
