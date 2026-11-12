package vd;

import com.google.android.gms.actions.SearchIntents;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lvd/a;", "Lvd/f;", "", SearchIntents.EXTRA_QUERY, "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "a", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3313a f177130c = new C3313a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f177132b;

    public a(String str, Object[] objArr) {
        str.getClass();
        this.f177131a = str;
        this.f177132b = objArr;
    }

    @Override // vd.f
    public final void a(e eVar) {
        f177130c.getClass();
        C3313a.a(eVar, this.f177132b);
    }

    @Override // vd.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF177131a() {
        return this.f177131a;
    }

    /* JADX INFO: renamed from: vd.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvd/a$a;", "", "<init>", "()V", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3313a {
        public /* synthetic */ C3313a(j jVar) {
            this();
        }

        public static void a(e eVar, Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i14 = 0;
            while (i14 < length) {
                Object obj = objArr[i14];
                i14++;
                if (obj == null) {
                    eVar.u(i14);
                } else if (obj instanceof byte[]) {
                    eVar.t(i14, (byte[]) obj);
                } else if (obj instanceof Float) {
                    eVar.m(((Number) obj).floatValue(), i14);
                } else if (obj instanceof Double) {
                    eVar.m(((Number) obj).doubleValue(), i14);
                } else if (obj instanceof Long) {
                    eVar.h(i14, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    eVar.h(i14, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    eVar.h(i14, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    eVar.h(i14, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    eVar.r(i14, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i14 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    eVar.h(i14, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }

        private C3313a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, null);
        str.getClass();
    }
}
