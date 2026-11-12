package ea2;

import da2.j;

/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: ea2.a$a, reason: collision with other inner class name */
    public interface InterfaceC1344a {
        void a();

        void b();
    }

    public interface b {
        void a();

        void b();
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
    }

    void completeHandshake();

    void initiateRemoteDeviceSoftwareUpdate(c cVar);

    void requestFactoryReset(InterfaceC1344a interfaceC1344a);

    void requestRemoteDeviceDisconnection(b bVar);

    void setApplicationVisibility(boolean z14);

    void setCurrentTime(d dVar);

    void setPairingState(j jVar);

    void setSetupWizardState(j jVar);

    void setTutorialComplete();
}
