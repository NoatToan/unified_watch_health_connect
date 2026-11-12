package health.compact.a;

/* JADX INFO: loaded from: classes2.dex */
public class StorageResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f36653c;
    private int d;

    public StorageResult() {
        this.d = 201000;
        this.f36653c = null;
    }

    public StorageResult(int i, Object obj) {
        this.d = i;
        this.f36653c = obj;
    }

    public int b() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public Object c() {
        return this.f36653c;
    }
}
