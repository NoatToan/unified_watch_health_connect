package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class ax extends OfflineMapCity implements bg, bx {
    public static final Parcelable.Creator<ax> CREATOR = new Parcelable.Creator<ax>() { // from class: com.amap.api.mapcore.util.ax.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ax createFromParcel(Parcel parcel) {
            return new ax(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ax[] newArray(int i) {
            return new ax[i];
        }
    };
    public final cb a;
    public final cb b;
    public final cb c;
    public final cb d;
    public final cb e;
    public final cb f;
    public final cb g;
    public final cb h;
    public final cb i;
    public final cb j;
    public final cb k;
    public cb l;
    public Context m;
    public boolean n;
    private String o;
    private String p;
    private long q;

    /* JADX INFO: renamed from: com.amap.api.mapcore.util.ax$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[by.a.values().length];
            a = iArr;
            try {
                iArr[by.a.amap_exception.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[by.a.file_io_exception.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[by.a.network_exception.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ax(Context context, OfflineMapCity offlineMapCity) {
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
        o();
    }

    private String v() {
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        String str = this.o;
        return str.substring(0, str.lastIndexOf("."));
    }

    private String w() {
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        String strV = v();
        return strV.substring(0, strV.lastIndexOf(46));
    }

    @Override // com.amap.api.mapcore.util.bg
    public final String b() {
        return getUrl();
    }

    public final cb c() {
        return this.l;
    }

    public final void d() {
        ay ayVarA = ay.a(this.m);
        if (ayVarA != null) {
            bc bcVar = ayVarA.f;
            if (bcVar != null) {
                bcVar.a(this);
            }
            ay.b bVar = ayVarA.e;
            if (bVar != null) {
                Message messageObtainMessage = bVar.obtainMessage();
                messageObtainMessage.obj = this;
                ayVarA.e.sendMessage(messageObtainMessage);
            }
        }
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e() {
        ay ayVarA = ay.a(this.m);
        if (ayVarA != null) {
            ayVarA.d(this);
            d();
        }
    }

    public final void f() {
        this.l.equals(this.f);
        this.l.f();
    }

    public final void g() {
        ay ayVarA = ay.a(this.m);
        if (ayVarA != null) {
            ayVarA.b(this);
        }
    }

    public final void h() {
        ay ayVarA = ay.a(this.m);
        if (ayVarA != null) {
            ayVarA.c(this);
        }
    }

    @Override // com.amap.api.mapcore.util.by
    public final void i() {
        this.q = 0L;
        this.l.equals(this.b);
        this.l.c();
    }

    @Override // com.amap.api.mapcore.util.by
    public final void j() {
        this.l.equals(this.c);
        this.l.g();
    }

    @Override // com.amap.api.mapcore.util.by
    public final void k() {
        e();
    }

    @Override // com.amap.api.mapcore.util.bq
    public final void l() {
        this.q = 0L;
        setCompleteCode(0);
        this.l.equals(this.e);
        this.l.c();
    }

    @Override // com.amap.api.mapcore.util.bq
    public final void m() {
        this.l.equals(this.e);
        this.l.a(this.h.b());
    }

    @Override // com.amap.api.mapcore.util.bq
    public final void n() {
        e();
    }

    public final void o() {
        String str = ay.a;
        String strB = bv.b(getUrl());
        if (strB != null) {
            this.o = str + strB + ".zip.tmp";
            return;
        }
        this.o = str + getPinyin() + ".zip.tmp";
    }

    public final bi p() {
        setState(this.l.b());
        bi biVar = new bi(this, this.m);
        biVar.a(this.p);
        return biVar;
    }

    @Override // com.amap.api.mapcore.util.bx
    public final boolean q() {
        bv.a();
        getSize();
        getcompleteCode();
        getSize();
        return false;
    }

    @Override // com.amap.api.mapcore.util.bx
    public final String r() {
        StringBuffer stringBuffer = new StringBuffer();
        String strB = bv.b(getUrl());
        if (strB != null) {
            stringBuffer.append(strB);
        } else {
            stringBuffer.append(getPinyin());
        }
        stringBuffer.append(MultiDexExtractor.EXTRACTED_SUFFIX);
        return stringBuffer.toString();
    }

    @Override // com.amap.api.mapcore.util.bx
    public final String s() {
        return getAdcode();
    }

    @Override // com.amap.api.mapcore.util.br
    public final String t() {
        return v();
    }

    @Override // com.amap.api.mapcore.util.br
    public final String u() {
        return w();
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
    }

    @Override // com.amap.api.mapcore.util.bq
    public final void b(String str) {
        this.l.equals(this.e);
        this.p = str;
        final String strV = v();
        String strW = w();
        if (TextUtils.isEmpty(strV) || TextUtils.isEmpty(strW)) {
            m();
            return;
        }
        final File file = new File(strW + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        File file2 = new File(er.a(this.m) + File.separator + "map/");
        File file3 = new File(er.a(this.m));
        if (file3.exists() || file3.mkdir()) {
            if (file2.exists() || file2.mkdir()) {
                new bp().a(file, file2, -1L, bv.a(file), new bp.a() { // from class: com.amap.api.mapcore.util.ax.1
                    @Override // com.amap.api.mapcore.util.bp.a
                    public final void a(float f) {
                        int i = (int) ((((double) f) * 0.39d) + 60.0d);
                        if (i - ax.this.getcompleteCode() <= 0 || System.currentTimeMillis() - ax.this.q <= 1000) {
                            return;
                        }
                        ax.this.setCompleteCode(i);
                        ax.this.q = System.currentTimeMillis();
                    }

                    @Override // com.amap.api.mapcore.util.bp.a
                    public final void b() {
                        ax axVar = ax.this;
                        axVar.l.a(axVar.k.b());
                    }

                    @Override // com.amap.api.mapcore.util.bp.a
                    public final void a() {
                        try {
                            if (new File(strV).delete()) {
                                bv.b(file);
                                ax.this.setCompleteCode(100);
                                ax.this.l.g();
                            }
                        } catch (Exception unused) {
                            ax axVar = ax.this;
                            axVar.l.a(axVar.k.b());
                        }
                    }
                });
            }
        }
    }

    public final void a(String str) {
        this.p = str;
    }

    public final String a() {
        return this.p;
    }

    public final void a(int i) {
        if (i == -1) {
            this.l = this.h;
        } else if (i == 0) {
            this.l = this.c;
        } else if (i == 1) {
            this.l = this.e;
        } else if (i == 2) {
            this.l = this.b;
        } else if (i == 3) {
            this.l = this.d;
        } else if (i == 4) {
            this.l = this.f;
        } else if (i == 6) {
            this.l = this.a;
        } else if (i != 7) {
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
        } else {
            this.l = this.g;
        }
        setState(i);
    }

    private ax(Context context, int i) {
        this.a = new cd(this);
        this.b = new ck(this);
        this.c = new cg(this);
        this.d = new ci(this);
        this.e = new cj(this);
        this.f = new cc(this);
        this.g = new ch(this);
        this.h = new ce(-1, this);
        this.i = new ce(101, this);
        this.j = new ce(102, this);
        this.k = new ce(103, this);
        this.o = null;
        this.p = "";
        this.n = false;
        this.q = 0L;
        this.m = context;
        a(i);
    }

    public final void a(cb cbVar) {
        this.l = cbVar;
        setState(cbVar.b());
    }

    public final cb b(int i) {
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

    @Override // com.amap.api.mapcore.util.by
    public final void a(long j, long j2) {
        int i = (int) ((j2 * 100) / j);
        if (i != getcompleteCode()) {
            setCompleteCode(i);
            d();
        }
    }

    @Override // com.amap.api.mapcore.util.by
    public final void a(by.a aVar) {
        int iB;
        int i = AnonymousClass3.a[aVar.ordinal()];
        if (i == 1) {
            iB = this.j.b();
        } else if (i != 2) {
            iB = i != 3 ? 6 : this.i.b();
        } else {
            iB = this.k.b();
        }
        if (this.l.equals(this.c) || this.l.equals(this.b)) {
            this.l.a(iB);
        }
    }

    @Override // com.amap.api.mapcore.util.bq
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

    public ax(Parcel parcel) {
        super(parcel);
        this.a = new cd(this);
        this.b = new ck(this);
        this.c = new cg(this);
        this.d = new ci(this);
        this.e = new cj(this);
        this.f = new cc(this);
        this.g = new ch(this);
        this.h = new ce(-1, this);
        this.i = new ce(101, this);
        this.j = new ce(102, this);
        this.k = new ce(103, this);
        this.o = null;
        this.p = "";
        this.n = false;
        this.q = 0L;
        this.p = parcel.readString();
    }
}
