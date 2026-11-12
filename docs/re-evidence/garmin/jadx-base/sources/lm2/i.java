package lm2;

/* JADX INFO: loaded from: classes11.dex */
public interface i {

    public interface a {
        byte[] b();

        long d();

        String f();

        bm2.d getDeviceInfo();

        String getMacAddress();
    }

    public interface b<T> {
        void a(T t7);

        void onFailure(Throwable th3);
    }
}
