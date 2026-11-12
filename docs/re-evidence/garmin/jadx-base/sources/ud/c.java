package ud;

/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    boolean J0();

    String M1(int i14);

    default boolean P3() {
        return getLong(0) != 0;
    }

    byte[] getBlob(int i14);

    int getColumnCount();

    String getColumnName(int i14);

    double getDouble(int i14);

    long getLong(int i14);

    void h(int i14, long j8);

    boolean isNull(int i14);

    void m(double d14, int i14);

    void o();

    void q3(int i14, String str);

    void reset();

    void t(int i14, byte[] bArr);

    void u(int i14);
}
