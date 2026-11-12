package com.xiaomi.onetrack.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.util.p;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13862a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13863b = "AndroidKeyStore";
    private static final String c = "AndroidKeyStore";
    private static final String d = "RSA/ECB/PKCS1Padding";
    private static final String e = "RSA_KEY";

    public static synchronized String a(Context context, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
        keyStore.load(null);
        a(context, keyStore);
        Certificate certificate = keyStore.getCertificate(e);
        if (certificate == null) {
            return null;
        }
        cipher.init(1, certificate.getPublicKey());
        return Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 0);
    }

    public static synchronized String b(Context context, String str) throws Exception {
        Cipher cipher;
        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
        keyStore.load(null);
        a(context, keyStore);
        cipher.init(2, (PrivateKey) keyStore.getKey(e, null));
        return new String(cipher.doFinal(Base64.decode(str, 0)), "UTF-8");
    }

    private static String b() {
        try {
            return new String(new byte[]{104, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, 89, 51, 49, 93, 99, SettingsModule.VALUE_TYPE_STRING_ENUM, 64, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 78, 115, 95, 106, SettingsModule.VALUE_TYPE_FLAG, 115, 118, 101, 106, SettingsModule.VALUE_TYPE_STRING_ENUM, 64, 51, 91, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, 119, HMProSyncDataBaseProfile.DATA_SPO2_ODI, SettingsModule.VALUE_TYPE_STRING_ENUM, 108}, "UTF-8");
        } catch (Exception e2) {
            p.b(IECDHAlgorithm.KEY_STORE, e2.getMessage());
            return "";
        }
    }

    private static void a(Context context, KeyStore keyStore) {
        try {
            if (keyStore.containsAlias(e)) {
                return;
            }
            a();
        } catch (Throwable th) {
            p.b(IECDHAlgorithm.KEY_STORE, "createKey e", th);
        }
    }

    @TargetApi(18)
    private static void a(Context context) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.add(1, 1);
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context).setAlias(e).setSubject(new X500Principal("CN=RSA_KEY")).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(SignUtils.KEY_RSA, IECDHAlgorithm.KEY_STORE);
        keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
        keyPairGenerator.generateKeyPair();
    }

    private static void a() throws IllegalAccessException, NoSuchFieldException, LinkageError, NoSuchMethodException, NoSuchAlgorithmException, InstantiationException, ClassNotFoundException, NoSuchProviderException, InvocationTargetException, InvalidAlgorithmParameterException {
        Class<?> cls = Class.forName("android.security.keystore.KeyGenParameterSpec$Builder");
        Constructor<?> constructor = cls.getConstructor(String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.security.keystore.KeyProperties");
        Object objNewInstance = constructor.newInstance(e, Integer.valueOf(cls2.getDeclaredField("PURPOSE_ENCRYPT").getInt(null) | cls2.getDeclaredField("PURPOSE_DECRYPT").getInt(null)));
        cls.getMethod("setDigests", String[].class).invoke(objNewInstance, new String[]{(String) cls2.getDeclaredField("DIGEST_SHA256").get(null), (String) cls2.getDeclaredField("DIGEST_SHA512").get(null)});
        cls.getMethod("setEncryptionPaddings", String[].class).invoke(objNewInstance, new String[]{(String) cls2.getDeclaredField("ENCRYPTION_PADDING_RSA_PKCS1").get(null)});
        Object objInvoke = cls.getMethod(OneTrack.Param.BUILD, new Class[0]).invoke(objNewInstance, new Object[0]);
        Class<?> cls3 = Class.forName("java.security.KeyPairGenerator");
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) cls3.getMethod("getInstance", String.class, String.class).invoke(null, SignUtils.KEY_RSA, IECDHAlgorithm.KEY_STORE);
        cls3.getMethod("initialize", AlgorithmParameterSpec.class).invoke(keyPairGenerator, objInvoke);
        keyPairGenerator.generateKeyPair();
    }
}
