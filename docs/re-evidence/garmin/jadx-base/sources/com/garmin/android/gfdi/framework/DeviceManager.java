package com.garmin.android.gfdi.framework;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability;
import com.garmin.android.gfdi.AuthRegistry;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.common.primitives.Bytes;
import da2.j;
import da2.l;
import ea2.f;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import rs2.i;
import vb.h;
import vs2.k;

/* JADX INFO: loaded from: classes8.dex */
public final class DeviceManager extends CapabilitiesProxy implements l, f, SyncDownloadCapability, ea2.c, ea2.a {
    private static final int INVALID = -1;
    private FileManagerCompat mFileManager;
    private i mGfdiDevice;
    private SetDeviceSettingsCompat mSetDeviceSettings;
    private SystemEventCompat mSystemEvent;
    private j pairingState;
    private boolean supportsMultiLink;

    public DeviceManager(String str, int i14) {
        super(str, i14);
        this.pairingState = null;
        this.supportsMultiLink = false;
        setGenericCapability(f.class, this);
        setGenericCapability(SyncDownloadCapability.class, this);
        setGenericCapability(ea2.c.class, this);
        setGenericCapability(ea2.a.class, this);
    }

    private String getDeviceModelName() {
        if (getGfdiDevice() != null) {
            return getGfdiDevice().f154388a.getF172496d();
        }
        return null;
    }

    private String getDeviceName() {
        return getGfdiDevice() != null ? getGfdiDevice().f154388a.getF172496d() : "";
    }

    private String getDualPairingMacAddress() {
        i iVar = this.mGfdiDevice;
        if (iVar == null) {
            return null;
        }
        int connectionType = getConnectionType();
        rs2.c cVar = iVar.f154388a;
        return connectionType == 1 ? cVar.getF172502j() : cVar.getF172501i();
    }

    private i getGfdiDevice() {
        i iVar;
        synchronized (this.lock) {
            iVar = this.mGfdiDevice;
        }
        return iVar;
    }

    private int getProductNumber() {
        if (getGfdiDevice() != null) {
            return getGfdiDevice().f154388a.getF172495c();
        }
        return -1;
    }

    private int getSoftwareVersion() {
        if (getGfdiDevice() != null) {
            return getGfdiDevice().f154388a.getF172497e();
        }
        return -1;
    }

    private long getUnitId() {
        if (getGfdiDevice() != null) {
            return getGfdiDevice().f154388a.getF172494b();
        }
        return -1L;
    }

    private boolean isDualBluetoothConnection() {
        return getGfdiDevice() != null && getGfdiDevice().f154388a.getF172498f();
    }

    public static DeviceManager register(Context context, String str, int i14) {
        da2.b bVar = da2.d.c(context).f58886a.f111646e;
        l lVarF = bVar.f(str);
        if (lVarF == null) {
            DeviceManager deviceManager = new DeviceManager(str, i14);
            bVar.g(str, deviceManager);
            return deviceManager;
        }
        if (lVarF instanceof DeviceManager) {
            return (DeviceManager) lVarF;
        }
        h.z("Registered RemoteDeviceProxy is not a DeviceManager");
        return null;
    }

    @Override // ea2.f
    public void archiveFile(String str, f.a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null || this.mFileManager == null) {
            return;
        }
        this.mFileManager.archive(Integer.parseInt(str), aVar);
    }

    @Override // ea2.c
    public void authenticateDevice(String str) {
        AuthRegistry.getInstance().setPasskey(this.mMacAddress, str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object, rs2.i] */
    @Override // com.garmin.android.gfdi.framework.CapabilitiesProxy
    public <T> T childGetCapability(Class<T> cls) {
        ?? r14;
        synchronized (this.lock) {
            r14 = (T) this.mGfdiDevice;
        }
        if (cls.isInstance(r14)) {
            return r14;
        }
        if (r14 == 0) {
            return null;
        }
        return (T) r14.b(cls);
    }

    @Override // ea2.a
    public void completeHandshake() {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat != null) {
            systemEventCompat.sendSystemEvent(k.HANDSHAKE_COMPLETE, null);
        }
    }

    @Override // ea2.f
    public void extractFile(String str, File file, f.c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null || this.mFileManager == null) {
            return;
        }
        this.mFileManager.readFile(Integer.parseInt(str), file.getParent(), null, cVar);
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability
    public long getDownloadBitMask() {
        vs2.i iVar = (vs2.i) getCapability(vs2.i.class);
        if (iVar == null) {
            return -1L;
        }
        Set<Integer> set = iVar.f179957h.get();
        long jIntValue = 0;
        if (set != null) {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                jIntValue |= (long) (1 << it.next().intValue());
            }
        }
        return jIntValue;
    }

    @Override // com.garmin.android.gfdi.framework.CapabilitiesProxy, da2.l
    public DeviceProfile getProfile() {
        i iVar;
        synchronized (this.lock) {
            iVar = this.mGfdiDevice;
        }
        if (iVar == null) {
            return null;
        }
        rs2.c cVar = iVar.f154388a;
        return new DeviceProfile(cVar.getF172494b(), cVar.getF172495c(), cVar.getF172496d(), cVar.getF172497e(), cVar.getF172493a(), getConnectionType(), cVar.getConfigurationFlags(), getDualPairingMacAddress(), this.supportsMultiLink, cVar.getF172499g());
    }

    @Override // ea2.f
    public byte[] getSupportedFitSubTypes() {
        FileManagerCompat fileManagerCompat = this.mFileManager;
        return fileManagerCompat == null ? new byte[0] : Bytes.toArray(fileManagerCompat.getSupportedFileSubTypes());
    }

    @Override // com.garmin.android.gfdi.framework.CapabilitiesProxy
    public String getTag() {
        return oa2.d.b("GDI#", "DeviceManager", getMacAddress(), getUnitId(), this);
    }

    @Override // ea2.a
    public void initiateRemoteDeviceSoftwareUpdate(ea2.a.c cVar) {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat != null) {
            systemEventCompat.initiateRemoteDeviceSoftwareUpdate(cVar);
        }
    }

    public boolean isFileUploadInProgress(int i14) {
        FileManagerCompat fileManagerCompat = this.mFileManager;
        if (fileManagerCompat != null) {
            return fileManagerCompat.isFileUploadInProgress(i14);
        }
        return false;
    }

    @Override // da2.l
    public boolean isHandshakeCompleted() {
        boolean z14;
        synchronized (this.lock) {
            z14 = this.mGfdiDevice != null;
        }
        return z14;
    }

    public boolean isPairing() {
        boolean z14;
        synchronized (this.lock) {
            z14 = this.pairingState == j.STARTED;
        }
        return z14;
    }

    public void listFiles(byte b14, byte[] bArr, f.b bVar) {
        FileManagerCompat fileManagerCompat;
        if (bVar == null || (fileManagerCompat = this.mFileManager) == null) {
            return;
        }
        fileManagerCompat.listFiles(b14, bArr, bVar);
    }

    @Override // ea2.f
    public void listPendingUploadFiles(byte[] bArr, f.b bVar) {
        if (bVar == null || this.mFileManager == null) {
            return;
        }
        listFiles((byte) 3, bArr, bVar);
    }

    @Override // ea2.f
    public void readGarminDeviceXml(f.d dVar) {
        FileManagerCompat fileManagerCompat;
        if (dVar == null || (fileManagerCompat = this.mFileManager) == null) {
            return;
        }
        fileManagerCompat.readDeviceXml(dVar);
    }

    public void redisplayPairingPasskey() {
        this.mLogger.warn("Unexpected call to redisplayPairingPasskey");
    }

    @Override // ea2.a
    public void requestFactoryReset(ea2.a.InterfaceC1344a interfaceC1344a) {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat != null) {
            systemEventCompat.requestFactoryReset(interfaceC1344a);
        }
    }

    @Override // ea2.a
    public void requestRemoteDeviceDisconnection(ea2.a.b bVar) {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat != null) {
            systemEventCompat.requestRemoteDeviceDisconnection(bVar);
        }
    }

    @Override // ea2.f
    public String resolveGarminDeviceFileType(byte b14) {
        FileManagerCompat fileManagerCompat = this.mFileManager;
        if (fileManagerCompat == null) {
            return null;
        }
        return fileManagerCompat.resolveGarminDeviceFileType(b14);
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability
    public void saveFile(String str, File file, byte b14, byte b15, String str2, long j8, boolean z14, SyncDownloadCapability.ResultListener resultListener) {
        FileManagerCompat fileManagerCompat;
        if (resultListener == null || (fileManagerCompat = this.mFileManager) == null) {
            return;
        }
        fileManagerCompat.saveFile(str, file, b14, b15, str2, z14, resultListener);
    }

    @Override // ea2.a
    public void setApplicationVisibility(boolean z14) {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat != null) {
            systemEventCompat.setApplicationVisibility(z14);
        }
    }

    @Override // ea2.a
    public void setCurrentTime(ea2.a.d dVar) {
        SetDeviceSettingsCompat setDeviceSettingsCompat = this.mSetDeviceSettings;
        if (setDeviceSettingsCompat != null) {
            setDeviceSettingsCompat.setCurrentTime(dVar);
        }
    }

    public void setGfdiDevice(i iVar) {
        synchronized (this.lock) {
            this.mGfdiDevice = iVar;
        }
        vs2.l lVar = (vs2.l) iVar.b(vs2.l.class);
        if (lVar != null) {
            this.mSystemEvent = new SystemEventCompat(lVar, iVar.f154388a.getF172493a());
        }
        com.garmin.gfdi.file.a aVar = (com.garmin.gfdi.file.a) iVar.b(com.garmin.gfdi.file.a.class);
        if (aVar != null) {
            FileManagerCompat fileManagerCompat = new FileManagerCompat(aVar, iVar.f154388a);
            this.mFileManager = fileManagerCompat;
            setGenericCapability(FileManagerCompat.class, fileManagerCompat);
        }
        this.mSetDeviceSettings = new SetDeviceSettingsCompat(iVar.f154388a, (vs2.a) iVar.b(vs2.a.class));
    }

    @Override // ea2.a
    public void setPairingState(j jVar) {
        if (this.mSystemEvent == null || jVar == null) {
            return;
        }
        synchronized (this.lock) {
            try {
                if (j.FINISHED_WITH_SUCCESS == jVar || j.FINISHED_WITH_FAILURE == jVar) {
                    this.pairingState = null;
                } else {
                    this.pairingState = jVar;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.mSystemEvent.sendPairingState(jVar);
    }

    @Override // ea2.a
    public void setSetupWizardState(j jVar) {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat == null || jVar == null) {
            return;
        }
        systemEventCompat.setSetupWizardState(jVar);
    }

    public void setSupportsMultiLink(boolean z14) {
        synchronized (this.lock) {
            this.supportsMultiLink = z14;
        }
    }

    @Override // ea2.e
    public void setSyncState(j jVar) {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat == null || jVar == null) {
            return;
        }
        systemEventCompat.setSyncState(jVar);
    }

    @Override // ea2.a
    public void setTutorialComplete() {
        SystemEventCompat systemEventCompat = this.mSystemEvent;
        if (systemEventCompat != null) {
            systemEventCompat.sendSystemEvent(k.TUTORIAL_COMPLETE, null);
        }
    }

    public void terminate() {
        synchronized (this.lock) {
            try {
                i iVar = this.mGfdiDevice;
                this.mGfdiDevice = null;
                if (iVar != null) {
                    this.mLogger.info("Terminating RemoteDeviceProxy (DeviceManager)");
                    iVar.a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public String toString() {
        return String.format(Locale.getDefault(), "[remote device proxy (device manager)] macAddress: %1$s, deprecated: %2$s, unitId: %3$d, productNumber: %4$d, deviceName: %5$s, deviceModelName: %6$s, softwareVersion: %7$d, connectionType: %8$s, getSupportedFitSubTypes: %9$s, downloadBitMask: %10$d, isDualBluetoothConnection: %11$s", getMacAddress(), null, Long.valueOf(getUnitId()), Integer.valueOf(getProductNumber()), getDeviceName(), getDeviceModelName(), Integer.valueOf(getSoftwareVersion()), Integer.valueOf(getConnectionType()), Arrays.toString(getSupportedFitSubTypes()), Long.valueOf(getDownloadBitMask()), Boolean.valueOf(isDualBluetoothConnection()));
    }

    public void authenticateDevice(byte[] bArr) {
        AuthRegistry.getInstance().setOutOfBandPasskey(this.mMacAddress, bArr);
    }

    @Override // ea2.f
    public void extractFile(int i14, File file, String str, f.c cVar) {
        FileManagerCompat fileManagerCompat;
        if (cVar == null || (fileManagerCompat = this.mFileManager) == null) {
            return;
        }
        fileManagerCompat.readFile(i14, file.getParent(), str, cVar);
    }
}
