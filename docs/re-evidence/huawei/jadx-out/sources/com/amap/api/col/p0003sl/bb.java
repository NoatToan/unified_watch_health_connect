package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class bb extends OfflineMapCity implements bk, cb {
    public static final Parcelable.Creator<bb> CREATOR = new Parcelable.Creator<bb>() { // from class: com.amap.api.col.3sl.bb.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ bb createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ bb[] newArray(int i) {
            return a(i);
        }

        private static bb a(Parcel parcel) {
            return new bb(parcel);
        }

        private static bb[] a(int i) {
            return new bb[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf f2242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf f2243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf f2244c;
    public final cf d;
    public final cf e;
    public final cf f;
    public final cf g;
    public final cf h;
    public final cf i;
    public final cf j;
    public final cf k;
    cf l;
    Context m;
    boolean n;
    private String o;
    private String p;
    private long q;

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void a(String str) {
        this.p = str;
    }

    public final String a() {
        return this.p;
    }

    @Override // com.amap.api.col.p0003sl.bk
    public final String b() {
        return getUrl();
    }

    public bb(Context context, OfflineMapCity offlineMapCity) {
        this(context, offlineMapCity.getState());
        setCity(offlineMapCity.getCity());
        setUrl(offlineMapCity.getUrl());
        setState(offlineMapCity.getState());
        setCompleteCode(offlineMapCity.getcompleteCode());
        setAdcode(offlineMapCity.getAdcode());
        setVersion(offlineMapCity.getVersion());
        setSize(offlineMapCity.getSize());
        setCode(offlineMapCity.getCode());
        setJianpin(offlineMapCity.getJianpin());
        setPinyin(offlineMapCity.getPinyin());
        s();
    }

    private bb(Context context, int i) {
        this.f2242a = new ch(this);
        this.f2243b = new co(this);
        this.f2244c = new ck(this);
        this.d = new cm(this);
        this.e = new cn(this);
        this.f = new cg(this);
        this.g = new cl(this);
        this.h = new ci(-1, this);
        this.i = new ci(101, this);
        this.j = new ci(102, this);
        this.k = new ci(103, this);
        this.o = null;
        this.p = "";
        this.n = false;
        this.q = 0L;
        this.m = context;
        a(i);
    }

    public final void a(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 6) {
                                    if (i == 7) {
                                        this.l = this.g;
                                    } else {
                                        switch (i) {
                                            case 101:
                                                this.l = this.i;
                                                break;
                                            case 102:
                                                this.l = this.j;
                                                break;
                                            case 103:
                                                this.l = this.k;
                                                break;
                                            default:
                                                if (i < 0) {
                                                    this.l = this.h;
                                                }
                                                break;
                                        }
                                    }
                                } else {
                                    this.l = this.f2242a;
                                }
                            } else {
                                this.l = this.f;
                            }
                        } else {
                            this.l = this.d;
                        }
                    } else {
                        this.l = this.f2243b;
                    }
                } else {
                    this.l = this.e;
                }
            } else {
                this.l = this.f2244c;
            }
        } else {
            this.l = this.h;
        }
        setState(i);
    }

    public final void a(cf cfVar) {
        this.l = cfVar;
        setState(cfVar.b());
    }

    public final cf c() {
        return this.l;
    }

    public final void d() {
        bc bcVarA = bc.a(this.m);
        if (bcVarA != null) {
            bcVarA.c(this);
        }
    }

    public final void e() {
        bc bcVarA = bc.a(this.m);
        if (bcVarA != null) {
            bcVarA.e(this);
            d();
        }
    }

    public final void f() {
        c().b();
        if (this.l.equals(this.d)) {
            this.l.d();
            return;
        }
        if (this.l.equals(this.f2244c)) {
            this.l.e();
            return;
        }
        if (this.l.equals(this.g) || this.l.equals(this.h)) {
            z();
            this.n = true;
        } else if (this.l.equals(this.j) || this.l.equals(this.i) || this.l.a(this.k)) {
            this.l.c();
        } else {
            c().h();
        }
    }

    public final void g() {
        this.l.e();
    }

    public final void h() {
        this.l.a(this.k.b());
    }

    public final void i() {
        this.l.a();
        if (this.n) {
            this.l.h();
        }
        this.n = false;
    }

    public final void j() {
        this.l.equals(this.f);
        this.l.f();
    }

    private void z() {
        bc bcVarA = bc.a(this.m);
        if (bcVarA != null) {
            bcVarA.a(this);
        }
    }

    public final void k() {
        bc bcVarA = bc.a(this.m);
        if (bcVarA != null) {
            bcVarA.b(this);
        }
    }

    public final void l() {
        bc bcVarA = bc.a(this.m);
        if (bcVarA != null) {
            bcVarA.d(this);
        }
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void m() {
        this.q = 0L;
        this.l.equals(this.f2243b);
        this.l.c();
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void a(long j, long j2) {
        int i = (int) ((j2 * 100) / j);
        if (i != getcompleteCode()) {
            setCompleteCode(i);
            d();
        }
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void n() {
        this.l.equals(this.f2244c);
        this.l.g();
    }

    /* JADX INFO: renamed from: com.amap.api.col.3sl.bb$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2248a;

        static {
            int[] iArr = new int[cc.a.values().length];
            f2248a = iArr;
            try {
                iArr[cc.a.amap_exception.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2248a[cc.a.file_io_exception.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2248a[cc.a.network_exception.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void a(cc.a aVar) {
        int iB;
        int i = AnonymousClass3.f2248a[aVar.ordinal()];
        if (i == 1) {
            iB = this.j.b();
        } else if (i == 2) {
            iB = this.k.b();
        } else {
            iB = i != 3 ? 6 : this.i.b();
        }
        if (this.l.equals(this.f2244c) || this.l.equals(this.f2243b)) {
            this.l.a(iB);
        }
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void o() {
        e();
    }

    @Override // com.amap.api.col.p0003sl.bu
    public final void p() {
        this.q = 0L;
        setCompleteCode(0);
        this.l.equals(this.e);
        this.l.c();
    }

    @Override // com.amap.api.col.p0003sl.bu
    public final void q() {
        this.l.equals(this.e);
        this.l.a(this.h.b());
    }

    @Override // com.amap.api.col.p0003sl.bu
    public final void a(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.q > 500) {
            int i = (int) j;
            if (i > getcompleteCode()) {
                setCompleteCode(i);
                d();
            }
            this.q = jCurrentTimeMillis;
        }
    }

    @Override // com.amap.api.col.p0003sl.bu
    public final void b(String str) {
        this.l.equals(this.e);
        this.p = str;
        String strA = A();
        String strB = B();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB)) {
            q();
            return;
        }
        File file = new File(strB + "/");
        File file2 = new File(eb.a(this.m) + File.separator + "map/");
        File file3 = new File(eb.a(this.m));
        if (file3.exists() || file3.mkdir()) {
            if (file2.exists() || file2.mkdir()) {
                a(file, file2, strA);
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.bu
    public final void r() {
        e();
    }

    protected final void s() {
        String str = bc.f2249a;
        String strB = bz.b(getUrl());
        if (strB != null) {
            this.o = str + strB + ".zip.tmp";
            return;
        }
        this.o = str + getPinyin() + ".zip.tmp";
    }

    private String A() {
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        String str = this.o;
        return str.substring(0, str.lastIndexOf("."));
    }

    private String B() {
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        String strA = A();
        return strA.substring(0, strA.lastIndexOf(46));
    }

    private void a(final File file, File file2, final String str) {
        new bt().a(file, file2, -1L, bz.a(file), new bt.a() { // from class: com.amap.api.col.3sl.bb.1
            @Override // com.amap.api.col.3sl.bt.a
            public final void a(float f) {
                int i = (int) ((((double) f) * 0.39d) + 60.0d);
                if (i - bb.this.getcompleteCode() <= 0 || System.currentTimeMillis() - bb.this.q <= 1000) {
                    return;
                }
                bb.this.setCompleteCode(i);
                bb.this.q = System.currentTimeMillis();
            }

            @Override // com.amap.api.col.3sl.bt.a
            public final void a() {
                try {
                    if (new File(str).delete()) {
                        bz.b(file);
                        bb.this.setCompleteCode(100);
                        bb.this.l.g();
                    }
                } catch (Exception unused) {
                    bb.this.l.a(bb.this.k.b());
                }
            }

            @Override // com.amap.api.col.3sl.bt.a
            public final void b() {
                bb.this.l.a(bb.this.k.b());
            }
        });
    }

    private boolean C() {
        bz.a();
        getSize();
        getcompleteCode();
        getSize();
        return false;
    }

    public final bm t() {
        setState(this.l.b());
        bm bmVar = new bm(this, this.m);
        bmVar.a(a());
        a();
        return bmVar;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
    }

    public bb(Parcel parcel) {
        super(parcel);
        this.f2242a = new ch(this);
        this.f2243b = new co(this);
        this.f2244c = new ck(this);
        this.d = new cm(this);
        this.e = new cn(this);
        this.f = new cg(this);
        this.g = new cl(this);
        this.h = new ci(-1, this);
        this.i = new ci(101, this);
        this.j = new ci(102, this);
        this.k = new ci(103, this);
        this.o = null;
        this.p = "";
        this.n = false;
        this.q = 0L;
        this.p = parcel.readString();
    }

    @Override // com.amap.api.col.p0003sl.cb
    public final boolean u() {
        return C();
    }

    @Override // com.amap.api.col.p0003sl.cb
    public final String v() {
        StringBuffer stringBuffer = new StringBuffer();
        String strB = bz.b(getUrl());
        if (strB != null) {
            stringBuffer.append(strB);
        } else {
            stringBuffer.append(getPinyin());
        }
        stringBuffer.append(".zip");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.col.p0003sl.cb
    public final String w() {
        return getAdcode();
    }

    @Override // com.amap.api.col.p0003sl.bv
    public final String x() {
        return A();
    }

    @Override // com.amap.api.col.p0003sl.bv
    public final String y() {
        return B();
    }

    public final cf b(int i) {
        switch (i) {
            case 101:
                return this.i;
            case 102:
                return this.j;
            case 103:
                return this.k;
            default:
                return this.h;
        }
    }
}
