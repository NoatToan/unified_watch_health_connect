package rs2;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    void onClose();

    void onMessageReadFailed(String str);

    void onRequestRead(Integer num, int i14, byte[] bArr);

    void onResponseRead(Integer num, int i14, y yVar, byte[] bArr);

    void onWrite(Integer num, int i14, y yVar, byte[] bArr);

    void onWrite(Integer num, int i14, byte[] bArr);
}
