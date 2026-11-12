package h23;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0010B9\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh23/d;", "Lh23/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends c implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81223h;

    static {
        new a(null);
    }

    public d(int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f81218c = i14;
        this.f81219d = i15;
        this.f81220e = i16;
        this.f81221f = i17;
        this.f81222g = i18;
        this.f81223h = i19;
        if ((i14 | i15 | i16 | i17 | i18) == 0) {
            h.s("Initial state must have at least one non-zero element.");
            throw null;
        }
        for (int i24 = 0; i24 < 64; i24++) {
            b();
        }
    }

    @Override // h23.c
    public final int a(int i14) {
        return ((-i14) >> 31) & (b() >>> (32 - i14));
    }

    @Override // h23.c
    public final int b() {
        int i14 = this.f81218c;
        int i15 = i14 ^ (i14 >>> 2);
        this.f81218c = this.f81219d;
        this.f81219d = this.f81220e;
        this.f81220e = this.f81221f;
        int i16 = this.f81222g;
        this.f81221f = i16;
        int i17 = ((i15 ^ (i15 << 1)) ^ i16) ^ (i16 << 4);
        this.f81222g = i17;
        int i18 = this.f81223h + 362437;
        this.f81223h = i18;
        return i17 + i18;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh23/d$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(int i14, int i15) {
        this(i14, i15, 0, 0, ~i14, (i14 << 10) ^ (i15 >>> 4));
    }
}
