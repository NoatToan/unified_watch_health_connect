package com.xiaomi.digitalkey.wearable;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.digitalkey.wearable.certificate.InstanceCertificate;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.CryptoUtil;
import com.xiaomi.digitalkey.wearable.utils.ECDHFactory;
import com.xiaomi.digitalkey.wearable.utils.EnvironmentConfig;
import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceConf {
    private static final String LogTag = "SDK-DKF-DevConf:";
    private IECDHAlgorithm mECDHAlgorithm;
    private static final boolean DEBUG = Logger.LOG_SECURITY;
    static volatile DeviceConf sInstance = null;
    static String INSTANCE_CA = "Instance";
    static String DEV_OEM_CA = "Dev_oem";
    static String VEHICLE_CA_J = "Vehicle_J";
    static String VEHICLE_CA_ENC = "Vehicle_ENC";
    static String VEHICLE_CA_SIG = "Vehicle_SIG";
    byte[] mVehicle_pk_cert_data = null;
    byte[] mPk_attestation_data = null;
    private final Map<String, String> mDeviceOEMCertDataMap = new ConcurrentHashMap();
    private final Map<String, String> mInstanceCertDataMap = new ConcurrentHashMap();
    private final Map<String, String> mVehicleOEMCAJDataMap = new ConcurrentHashMap();
    private final Map<String, String> mVehicleOEMEncryptCertDataMap = new ConcurrentHashMap();
    private final Map<String, String> mVehicleOEMSigCertDataMap = new ConcurrentHashMap();
    private final Map<String, String> mEpCertDataMap = new ConcurrentHashMap();
    private final Context mContext = EnvironmentConfig.getContext();

    private DeviceConf() {
    }

    public static DeviceConf getInstance() {
        if (sInstance == null) {
            synchronized (DeviceConf.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new DeviceConf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public boolean checkCertificateLocal(String str) {
        String deviceId = EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext);
        byte[] caFromKeyStore = getCaFromKeyStore(str, INSTANCE_CA);
        if (caFromKeyStore == null) {
            return false;
        }
        this.mInstanceCertDataMap.put(deviceId, ByteUtils.toHexString(caFromKeyStore));
        byte[] caFromKeyStore2 = getCaFromKeyStore(str, DEV_OEM_CA);
        if (caFromKeyStore2 == null) {
            return false;
        }
        this.mDeviceOEMCertDataMap.put(deviceId, ByteUtils.toHexString(caFromKeyStore2));
        byte[] caFromKeyStore3 = getCaFromKeyStore(str, VEHICLE_CA_J);
        if (caFromKeyStore3 == null) {
            return false;
        }
        this.mVehicleOEMCAJDataMap.put(deviceId, ByteUtils.toHexString(caFromKeyStore3));
        byte[] caFromKeyStore4 = getCaFromKeyStore(str, VEHICLE_CA_ENC);
        if (caFromKeyStore4 == null) {
            return false;
        }
        this.mVehicleOEMEncryptCertDataMap.put(deviceId, ByteUtils.toHexString(caFromKeyStore4));
        byte[] caFromKeyStore5 = getCaFromKeyStore(str, VEHICLE_CA_SIG);
        if (caFromKeyStore5 == null) {
            return false;
        }
        this.mVehicleOEMSigCertDataMap.put(deviceId, ByteUtils.toHexString(caFromKeyStore5));
        return false;
    }

    public byte[] generateSharedSecret(PublicKey publicKey) throws IOException {
        loadKeystoreKeyPair();
        return this.mECDHAlgorithm.generateSharedSecret(publicKey);
    }

    public byte[] getCaFromKeyStore(String str, String str2) {
        String str3 = "cert" + str + EnvironmentConfig.getDeviceInfo().getDeviceId(EnvironmentConfig.getContext());
        try {
            KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
            keyStore.load(null, null);
            String str4 = str3 + str2;
            X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(str4);
            if (x509Certificate == null) {
                return null;
            }
            x509Certificate.checkValidity();
            boolean z = DEBUG;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("load ");
                sb.append(str4);
                sb.append(" ca from ke store: \n");
                sb.append(x509Certificate);
            }
            byte[] encoded = x509Certificate.getEncoded();
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("get ");
                sb2.append(str4);
                sb2.append(" ca data: ");
                sb2.append(ByteUtils.toHexString(encoded));
            }
            return encoded;
        } catch (IOException e) {
            e = e;
            e.printStackTrace();
            return null;
        } catch (KeyStoreException e2) {
            e = e2;
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            e.printStackTrace();
            return null;
        } catch (CertificateException e4) {
            e = e4;
            e.printStackTrace();
            return null;
        }
    }

    public byte[] getDevCAFromKeyStore(String str) {
        return getCaFromKeyStore(str, DEV_OEM_CA);
    }

    public ECPublicKey getDevEncPubKey() throws IOException {
        loadKeystoreKeyPair();
        return this.mECDHAlgorithm.getPublicKey();
    }

    public byte[] getDeviceCertificate(String str) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("get device oem CA for ");
            sb.append(str);
        }
        String str2 = this.mDeviceOEMCertDataMap.get(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext));
        return TextUtils.isEmpty(str2) ? getCaFromKeyStore(str, DEV_OEM_CA) : ByteUtils.fromHexString(str2);
    }

    public X509Certificate getInstanceCA(String str) throws CertificateException {
        byte[] instanceCertificate = getInstanceCertificate(str);
        if (instanceCertificate != null) {
            return CryptoUtil.createCertifcate(instanceCertificate);
        }
        return null;
    }

    public byte[] getInstanceCAFromKeyStore(String str) {
        return getCaFromKeyStore(str, INSTANCE_CA);
    }

    public byte[] getInstanceCertificate(String str) throws CertificateException {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("get instance CA for ");
            sb.append(str);
        }
        String str2 = this.mInstanceCertDataMap.get(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext));
        if (!TextUtils.isEmpty(str2)) {
            byte[] bArrFromHexString = ByteUtils.fromHexString(str2);
            String instanceCAId = new InstanceCertificate(bArrFromHexString).getInstanceCAId();
            if (instanceCAId != null && instanceCAId.equalsIgnoreCase(str)) {
                return bArrFromHexString;
            }
        }
        return getCaFromKeyStore(str, INSTANCE_CA);
    }

    public X509Certificate getVehicleEncCa(String str) {
        String str2 = this.mVehicleOEMEncryptCertDataMap.get(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext));
        return CryptoUtil.createCertifcate(TextUtils.isEmpty(str2) ? getCaFromKeyStore(str, VEHICLE_CA_ENC) : ByteUtils.fromHexString(str2));
    }

    public X509Certificate getVehicleOEMCAJ(String str) {
        String str2 = this.mVehicleOEMCAJDataMap.get(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext));
        return CryptoUtil.createCertifcate(TextUtils.isEmpty(str2) ? getCaFromKeyStore(str, VEHICLE_CA_J) : ByteUtils.fromHexString(str2));
    }

    public X509Certificate getVehiclePkCa() {
        byte[] bArr = this.mVehicle_pk_cert_data;
        if (bArr != null) {
            return CryptoUtil.createCertifcate(bArr);
        }
        return null;
    }

    public byte[] getVehiclePkCertData() {
        return this.mVehicle_pk_cert_data;
    }

    public X509Certificate getVehicleSigCa(String str) {
        String str2 = this.mVehicleOEMSigCertDataMap.get(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext));
        return CryptoUtil.createCertifcate(TextUtils.isEmpty(str2) ? getCaFromKeyStore(str, VEHICLE_CA_SIG) : ByteUtils.fromHexString(str2));
    }

    public byte[] getVehicle_oem_ca_J_data(String str) {
        String str2 = this.mVehicleOEMCAJDataMap.get(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext));
        return TextUtils.isEmpty(str2) ? getCaFromKeyStore(str, VEHICLE_CA_J) : ByteUtils.fromHexString(str2);
    }

    public byte[] get_ep_certificate(byte[] bArr) {
        String str = this.mEpCertDataMap.get(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext));
        if (!TextUtils.isEmpty(str)) {
            return ByteUtils.fromHexString(str);
        }
        try {
            return new Endpoint().getEndpointCertificate(bArr);
        } catch (Endpoint.EndpointTerminatedException | WearableSEProxy.AppletNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] get_pk_attestation_data() {
        return this.mPk_attestation_data;
    }

    public void loadKeystoreKeyPair() throws IOException {
        if (this.mECDHAlgorithm == null) {
            this.mECDHAlgorithm = ECDHFactory.getECDHGenerator();
        }
    }

    public void saveCaToKeystore(String str, String str2, byte[] bArr) {
        String str3 = "cert" + str + EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext);
        try {
            KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
            keyStore.load(null, null);
            String str4 = str3 + str2;
            keyStore.setCertificateEntry(str4, CryptoUtil.createCertifcate(bArr));
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("save ");
                sb.append(str4);
                sb.append(" ca to keystore done");
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            e.printStackTrace();
        }
    }

    public void setDeviceCertificate(String str, byte[] bArr) {
        this.mDeviceOEMCertDataMap.put(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext), ByteUtils.toHexString(bArr));
        saveCaToKeystore(str, DEV_OEM_CA, bArr);
    }

    public void setInstanceCertificate(String str, byte[] bArr) {
        this.mInstanceCertDataMap.put(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext), ByteUtils.toHexString(bArr));
        saveCaToKeystore(str, INSTANCE_CA, bArr);
    }

    public void setVehicleOemCaJData(String str, byte[] bArr) {
        this.mVehicleOEMCAJDataMap.put(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext), ByteUtils.toHexString(bArr));
        saveCaToKeystore(str, VEHICLE_CA_J, bArr);
    }

    public void setVehicleOemEncryptCaPData(String str, byte[] bArr) {
        this.mVehicleOEMEncryptCertDataMap.put(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext), ByteUtils.toHexString(bArr));
        saveCaToKeystore(str, VEHICLE_CA_ENC, bArr);
    }

    public void setVehicleOemSigCertData(String str, byte[] bArr) {
        this.mVehicleOEMSigCertDataMap.put(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext), ByteUtils.toHexString(bArr));
        saveCaToKeystore(str, VEHICLE_CA_SIG, bArr);
    }

    public void setVehiclePkCertData(byte[] bArr) {
        this.mVehicle_pk_cert_data = bArr;
    }

    public void set_ep_certificate(byte[] bArr) {
        this.mEpCertDataMap.put(EnvironmentConfig.getDeviceInfo().getDeviceId(this.mContext), ByteUtils.toHexString(bArr));
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("get ep data is: ");
            sb.append(ByteUtils.toHexString(bArr));
        }
    }

    public void set_pk_attestation_data(byte[] bArr) {
        this.mPk_attestation_data = bArr;
    }
}
