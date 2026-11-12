package lq2;

import c83.h;
import com.garmin.android.apps.connectmobile.s0;
import d13.o;
import e23.l;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llq2/e;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f114358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f114359e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.a f114360a = (kq2.a) ez0.b.a(ez0.b.f67468a, ez0.c.STATIC, kq2.a.class, new h.a[0], null, null, null, 120);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f114361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jw.c f114362c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114363a;

        static {
            int[] iArr = new int[is2.b.values().length];
            try {
                iArr[is2.b.PRELOAD_EASYCARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[is2.b.PRELOAD_IPASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f114363a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements u03.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f114364a;

        public c(l lVar) {
            lVar.getClass();
            this.f114364a = lVar;
        }

        @Override // u03.f
        /* JADX INFO: renamed from: apply */
        public final /* synthetic */ Object mo330apply(Object obj) {
            return this.f114364a.invoke(obj);
        }
    }

    static {
        new a(null);
        f114358d = 2592000000L;
    }

    public e() {
        s0 s0Var = (s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null);
        this.f114361b = s0Var;
        this.f114362c = s0Var.a(f114358d, 2592000000L);
    }

    public final o a(is2.b bVar) {
        String str;
        int i14 = b.f114363a[bVar.ordinal()];
        if (i14 == 1) {
            str = "easycard";
        } else {
            if (i14 != 2) {
                vb.h.s("Not supported card type");
                return null;
            }
            str = "ipass";
        }
        String url = this.f114360a.a(str).request().url().getUrl();
        jw.c cVar = this.f114362c;
        cVar.e(url);
        String str2 = cVar.f101228a;
        str2.getClass();
        q03.l<List<String>> lVarD = ((s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null)).d(str2);
        c cVar2 = new c(f.f114365a);
        lVarD.getClass();
        int i15 = w03.b.f181178a;
        return new o(lVarD, cVar2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq2/e$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
