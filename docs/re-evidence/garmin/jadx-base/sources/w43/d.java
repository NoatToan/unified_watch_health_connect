package w43;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f181993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f181994b;

    public static final class b extends p13.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f181995c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d<T> f181996d;

        public b(d<T> dVar) {
            this.f181996d = dVar;
        }

        @Override // p13.b
        public final void a() {
            int i14;
            Object[] objArr;
            do {
                i14 = this.f181995c + 1;
                this.f181995c = i14;
                objArr = this.f181996d.f181993a;
                if (i14 >= objArr.length) {
                    break;
                }
            } while (objArr[i14] == null);
            if (i14 >= objArr.length) {
                this.f134914a = 2;
                return;
            }
            T t7 = (T) objArr[i14];
            t7.getClass();
            this.f134915b = t7;
            this.f134914a = 1;
        }
    }

    static {
        new a(null);
    }

    private d(Object[] objArr, int i14) {
        super(null);
        this.f181993a = objArr;
        this.f181994b = i14;
    }

    @Override // w43.c
    public final int a() {
        return this.f181994b;
    }

    @Override // w43.c
    public final void b(int i14, T t7) {
        t7.getClass();
        Object[] objArr = this.f181993a;
        if (objArr.length <= i14) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i14);
            this.f181993a = Arrays.copyOf(this.f181993a, length);
        }
        Object[] objArr2 = this.f181993a;
        if (objArr2[i14] == null) {
            this.f181994b++;
        }
        objArr2[i14] = t7;
    }

    @Override // w43.c
    public final T get(int i14) {
        return (T) p13.u.L(i14, this.f181993a);
    }

    @Override // w43.c, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new b(this);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d() {
        this(new Object[20], 0);
    }
}
