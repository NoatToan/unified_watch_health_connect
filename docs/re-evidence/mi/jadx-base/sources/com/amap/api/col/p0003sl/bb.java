package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import defpackage.acs;
import defpackage.ags;
import defpackage.bes;
import defpackage.dhs;
import defpackage.fgs;
import defpackage.gcs;
import defpackage.hhs;
import defpackage.jgs;
import defpackage.kfs;
import defpackage.mgs;
import defpackage.tgs;
import defpackage.wgs;
import defpackage.zas;
import defpackage.zgs;
import defpackage.zns;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class bb extends OfflineMapCity implements acs, kfs {
    public static final Parcelable.Creator<bb> CREATOR = new b();
    public final ags f;
    public final ags g;
    public final ags h;
    public final ags i;
    public final ags j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ags f5972k;
    public final ags l;
    public final ags m;
    public final ags n;
    public final ags o;
    public final ags p;
    public ags q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f5973r;
    public String s;
    public String t;
    public boolean u;
    public long v;

    public static class b implements Parcelable.Creator<bb> {
        public static bb a(Parcel parcel) {
            return new bb(parcel);
        }

        public static bb[] b(int i) {
            return new bb[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ bb createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ bb[] newArray(int i) {
            return b(i);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5976a;

        static {
            int[] iArr = new int[cc.a.values().length];
            f5976a = iArr;
            try {
                iArr[cc.a.amap_exception.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5976a[cc.a.file_io_exception.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5976a[cc.a.network_exception.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
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
        V();
    }

    public final ags A(int i) {
        switch (i) {
            case 101:
                return this.n;
            case 102:
                return this.o;
            case 103:
                return this.p;
            default:
                return this.m;
        }
    }

    public final ags B() {
        return this.q;
    }

    public final void C() {
        zas zasVarA = zas.a(this.f5973r);
        if (zasVarA != null) {
            zasVarA.q(this);
        }
    }

    public final void E() {
        zas zasVarA = zas.a(this.f5973r);
        if (zasVarA != null) {
            zasVarA.x(this);
            C();
        }
    }

    public final void F() {
        B().d();
        if (this.q.equals(this.i)) {
            this.q.g();
            return;
        }
        if (this.q.equals(this.h)) {
            this.q.i();
            return;
        }
        if (this.q.equals(this.l) || this.q.equals(this.m)) {
            X();
            this.u = true;
        } else if (this.q.equals(this.o) || this.q.equals(this.n) || this.q.c(this.p)) {
            this.q.f();
        } else {
            B().h();
        }
    }

    public final void G() {
        this.q.i();
    }

    public final void H() {
        this.q.b(this.p.d());
    }

    public final void I() {
        this.q.a();
        if (this.u) {
            this.q.h();
        }
        this.u = false;
    }

    public final void L() {
        this.q.equals(this.f5972k);
        this.q.j();
    }

    public final void P() {
        zas zasVarA = zas.a(this.f5973r);
        if (zasVarA != null) {
            zasVarA.l(this);
        }
    }

    public final void R() {
        zas zasVarA = zas.a(this.f5973r);
        if (zasVarA != null) {
            zasVarA.u(this);
        }
    }

    public final void V() {
        String str = zas.o;
        String strI = bes.i(getUrl());
        if (strI != null) {
            this.s = str + strI + ".zip.tmp";
            return;
        }
        this.s = str + getPinyin() + ".zip.tmp";
    }

    public final gcs W() {
        setState(this.q.d());
        gcs gcsVar = new gcs(this, this.f5973r);
        gcsVar.m(u());
        u();
        return gcsVar;
    }

    public final void X() {
        zas zasVarA = zas.a(this.f5973r);
        if (zasVarA != null) {
            zasVarA.f(this);
        }
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void a(long j, long j2) {
        int i = (int) ((j2 * 100) / j);
        if (i != getcompleteCode()) {
            setCompleteCode(i);
            C();
        }
    }

    @Override // defpackage.acs
    public final String b() {
        return getUrl();
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void c() {
        E();
    }

    @Override // defpackage.ids
    public final void d() {
        this.v = 0L;
        setCompleteCode(0);
        this.q.equals(this.j);
        this.q.f();
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ids
    public final void e() {
        this.q.equals(this.j);
        this.q.b(this.m.d());
    }

    @Override // defpackage.ids
    public final void f() {
        E();
    }

    @Override // defpackage.kfs
    public final boolean g() {
        return q();
    }

    @Override // defpackage.kfs
    public final String h() {
        return getAdcode();
    }

    @Override // defpackage.lds
    public final String i() {
        return l();
    }

    @Override // defpackage.lds
    public final String j() {
        return o();
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void k(cc.a aVar) {
        int iD;
        int i = c.f5976a[aVar.ordinal()];
        if (i == 1) {
            iD = this.o.d();
        } else if (i != 2) {
            iD = i != 3 ? 6 : this.n.d();
        } else {
            iD = this.p.d();
        }
        if (this.q.equals(this.h) || this.q.equals(this.g)) {
            this.q.b(iD);
        }
    }

    public final String l() {
        if (TextUtils.isEmpty(this.s)) {
            return null;
        }
        String str = this.s;
        return str.substring(0, str.lastIndexOf("."));
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void m() {
        this.v = 0L;
        this.q.equals(this.g);
        this.q.f();
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void n() {
        this.q.equals(this.h);
        this.q.k();
    }

    public final String o() {
        if (TextUtils.isEmpty(this.s)) {
            return null;
        }
        String strL = l();
        return strL.substring(0, strL.lastIndexOf(46));
    }

    public final boolean q() {
        bes.a();
        getSize();
        getcompleteCode();
        getSize();
        return false;
    }

    public final String u() {
        return this.t;
    }

    public final void v(int i) {
        if (i == -1) {
            this.q = this.m;
        } else if (i == 0) {
            this.q = this.h;
        } else if (i == 1) {
            this.q = this.j;
        } else if (i == 2) {
            this.q = this.g;
        } else if (i == 3) {
            this.q = this.i;
        } else if (i == 4) {
            this.q = this.f5972k;
        } else if (i == 6) {
            this.q = this.f;
        } else if (i != 7) {
            switch (i) {
                case 101:
                    this.q = this.n;
                    break;
                case 102:
                    this.q = this.o;
                    break;
                case 103:
                    this.q = this.p;
                    break;
                default:
                    if (i < 0) {
                        this.q = this.m;
                    }
                    break;
            }
        } else {
            this.q = this.l;
        }
        setState(i);
    }

    public final void w(ags agsVar) {
        this.q = agsVar;
        setState(agsVar.d());
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.t);
    }

    public final void x(File file, File file2, String str) {
        new e().b(file, file2, -1L, bes.b(file), new a(str, file));
    }

    public final void z(String str) {
        this.t = str;
    }

    @Override // defpackage.ids
    public final void b(String str) {
        this.q.equals(this.j);
        this.t = str;
        String strL = l();
        String strO = o();
        if (TextUtils.isEmpty(strL) || TextUtils.isEmpty(strO)) {
            e();
            return;
        }
        File file = new File(strO + "/");
        File file2 = new File(zns.v(this.f5973r) + File.separator + "map/");
        File file3 = new File(zns.v(this.f5973r));
        if (file3.exists() || file3.mkdir()) {
            if (file2.exists() || file2.mkdir()) {
                x(file, file2, strL);
            }
        }
    }

    public class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f5975b;

        public a(String str, File file) {
            this.f5974a = str;
            this.f5975b = file;
        }

        @Override // com.amap.api.col.3sl.e.a
        public final void a(float f) {
            int i = (int) ((((double) f) * 0.39d) + 60.0d);
            if (i - bb.this.getcompleteCode() <= 0 || System.currentTimeMillis() - bb.this.v <= 1000) {
                return;
            }
            bb.this.setCompleteCode(i);
            bb.this.v = System.currentTimeMillis();
        }

        @Override // com.amap.api.col.3sl.e.a
        public final void b() {
            bb bbVar = bb.this;
            bbVar.q.b(bbVar.p.d());
        }

        @Override // com.amap.api.col.3sl.e.a
        public final void a() {
            try {
                if (new File(this.f5974a).delete()) {
                    bes.l(this.f5975b);
                    bb.this.setCompleteCode(100);
                    bb.this.q.k();
                }
            } catch (Exception unused) {
                bb bbVar = bb.this;
                bbVar.q.b(bbVar.p.d());
            }
        }
    }

    @Override // defpackage.ids
    public final void a(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.v > 500) {
            int i = (int) j;
            if (i > getcompleteCode()) {
                setCompleteCode(i);
                C();
            }
            this.v = jCurrentTimeMillis;
        }
    }

    public bb(Context context, int i) {
        this.f = new jgs(this);
        this.g = new hhs(this);
        this.h = new tgs(this);
        this.i = new zgs(this);
        this.j = new dhs(this);
        this.f5972k = new fgs(this);
        this.l = new wgs(this);
        this.m = new mgs(-1, this);
        this.n = new mgs(101, this);
        this.o = new mgs(102, this);
        this.p = new mgs(103, this);
        this.s = null;
        this.t = "";
        this.u = false;
        this.v = 0L;
        this.f5973r = context;
        v(i);
    }

    @Override // defpackage.kfs
    public final String v() {
        StringBuffer stringBuffer = new StringBuffer();
        String strI = bes.i(getUrl());
        if (strI != null) {
            stringBuffer.append(strI);
        } else {
            stringBuffer.append(getPinyin());
        }
        stringBuffer.append(".zip");
        return stringBuffer.toString();
    }

    public bb(Parcel parcel) {
        super(parcel);
        this.f = new jgs(this);
        this.g = new hhs(this);
        this.h = new tgs(this);
        this.i = new zgs(this);
        this.j = new dhs(this);
        this.f5972k = new fgs(this);
        this.l = new wgs(this);
        this.m = new mgs(-1, this);
        this.n = new mgs(101, this);
        this.o = new mgs(102, this);
        this.p = new mgs(103, this);
        this.s = null;
        this.t = "";
        this.u = false;
        this.v = 0L;
        this.t = parcel.readString();
    }
}
