package in2;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    int close(int i14);

    int connectByName(int i14, int i15, int i16, int i17, String str, String str2, byte[] bArr);

    int read(int i14, byte[] bArr);

    int recv(int i14, byte[] bArr, int i15);

    int select(int i14);

    int send(int i14, byte[] bArr, int i15);

    int setRecvTimeout(int i14, int i15);

    int socket(int i14, int i15, int i16);

    int write(int i14, byte[] bArr);
}
