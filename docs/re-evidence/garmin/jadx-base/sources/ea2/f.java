package ea2;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public interface f extends e {

    public interface a {
    }

    public interface b {
    }

    public interface c {
        void a(long j8, String str);

        void b(File file, String str);

        void c(String str, String str2);
    }

    public interface d {
        void a(long j8, long j14);

        void b(String str);

        void c(byte[] bArr);
    }

    void archiveFile(String str, a aVar);

    void extractFile(int i14, File file, String str, c cVar);

    void extractFile(String str, File file, c cVar);

    byte[] getSupportedFitSubTypes();

    void listPendingUploadFiles(byte[] bArr, b bVar);

    void readGarminDeviceXml(d dVar);

    String resolveGarminDeviceFileType(byte b14);
}
