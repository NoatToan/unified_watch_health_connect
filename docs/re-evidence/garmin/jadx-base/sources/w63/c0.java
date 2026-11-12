package w63;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lw63/c0;", "", "<init>", "()V", "", "data", "", "pos", MapboxMap.QFE_LIMIT, "", "shared", "owner", "([BIIZZ)V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f183336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f183337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f183339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f183340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0 f183341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f183342g;

    static {
        new a(null);
    }

    public c0(byte[] bArr, int i14, int i15, boolean z14, boolean z15) {
        bArr.getClass();
        this.f183336a = bArr;
        this.f183337b = i14;
        this.f183338c = i15;
        this.f183339d = z14;
        this.f183340e = z15;
    }

    public final c0 a() {
        c0 c0Var = this.f183341f;
        if (c0Var == this) {
            c0Var = null;
        }
        c0 c0Var2 = this.f183342g;
        c0Var2.getClass();
        c0Var2.f183341f = this.f183341f;
        c0 c0Var3 = this.f183341f;
        c0Var3.getClass();
        c0Var3.f183342g = this.f183342g;
        this.f183341f = null;
        this.f183342g = null;
        return c0Var;
    }

    public final void b(c0 c0Var) {
        c0Var.getClass();
        c0Var.f183342g = this;
        c0Var.f183341f = this.f183341f;
        c0 c0Var2 = this.f183341f;
        c0Var2.getClass();
        c0Var2.f183342g = c0Var;
        this.f183341f = c0Var;
    }

    public final c0 c() {
        this.f183339d = true;
        return new c0(this.f183336a, this.f183337b, this.f183338c, true, false);
    }

    public final void d(c0 c0Var, int i14) {
        c0Var.getClass();
        byte[] bArr = c0Var.f183336a;
        if (!c0Var.f183340e) {
            vb.h.z("only owner can write");
            return;
        }
        int i15 = c0Var.f183338c;
        int i16 = i15 + i14;
        if (i16 > 8192) {
            if (c0Var.f183339d) {
                vb.h.w();
                return;
            }
            int i17 = c0Var.f183337b;
            if (i16 - i17 > 8192) {
                vb.h.w();
                return;
            } else {
                p13.s.e(bArr, 0, i17, bArr, i15);
                c0Var.f183338c -= c0Var.f183337b;
                c0Var.f183337b = 0;
            }
        }
        int i18 = c0Var.f183338c;
        int i19 = this.f183337b;
        p13.s.e(this.f183336a, i18, i19, bArr, i19 + i14);
        c0Var.f183338c += i14;
        this.f183337b += i14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lw63/c0$a;", "", "<init>", "()V", "", "SIZE", "I", "SHARE_MINIMUM", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public c0() {
        this.f183336a = new byte[8192];
        this.f183340e = true;
        this.f183339d = false;
    }
}
