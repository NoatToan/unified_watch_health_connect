package ss2;

/* JADX INFO: loaded from: classes7.dex */
public interface b {
    byte[] getEncryptedDiversifier(String str);

    byte[] getLongTermKey(String str);

    byte[] getRandomNumber(String str);

    boolean isGarminAuthAllowed(String str);

    void onDevicePairingPasskeyRequired(String str, int i14, w wVar);

    void onOutOfBandPasskeyRequired(String str, w wVar);

    void saveAuthenticationInfo(String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    void saveOutOfBandPasskey(String str, byte[] bArr);
}
