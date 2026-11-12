package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class f1a {
    public static f1a d = new f1a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f17287b;
    public Object[] c;

    public f1a(String str) {
        this(str, null, null);
    }

    public static Object[] d(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public Object[] a() {
        return this.c;
    }

    public String b() {
        return this.f17286a;
    }

    public Throwable c() {
        return this.f17287b;
    }

    public f1a(String str, Object[] objArr, Throwable th) {
        this.f17286a = str;
        this.f17287b = th;
        if (th == null) {
            this.c = objArr;
        } else {
            this.c = d(objArr);
        }
    }
}
