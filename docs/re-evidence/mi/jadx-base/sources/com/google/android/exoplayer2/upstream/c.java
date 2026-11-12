package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.fxp;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import defpackage.zn5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<fxp> f8410b = new ArrayList();
    public final a c;
    public a d;
    public a e;
    public a f;
    public a g;
    public a h;
    public a i;
    public a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f8411k;

    public c(Context context, a aVar) {
        this.f8409a = context.getApplicationContext();
        this.c = (a) rk1.e(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws IOException {
        rk1.g(this.f8411k == null);
        String scheme = bVar.f8404a.getScheme();
        if (wlq.q0(bVar.f8404a)) {
            String path = bVar.f8404a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f8411k = v();
            } else {
                this.f8411k = s();
            }
        } else if ("asset".equals(scheme)) {
            this.f8411k = s();
        } else if (MiuiCursorConstants.CONTENT.equals(scheme)) {
            this.f8411k = t();
        } else if ("rtmp".equals(scheme)) {
            this.f8411k = x();
        } else if ("udp".equals(scheme)) {
            this.f8411k = y();
        } else if ("data".equals(scheme)) {
            this.f8411k = u();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f8411k = w();
        } else {
            this.f8411k = this.c;
        }
        return this.f8411k.b(bVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        a aVar = this.f8411k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f8411k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        a aVar = this.f8411k;
        return aVar == null ? Collections.emptyMap() : aVar.d();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
        rk1.e(fxpVar);
        this.c.f(fxpVar);
        this.f8410b.add(fxpVar);
        z(this.d, fxpVar);
        z(this.e, fxpVar);
        z(this.f, fxpVar);
        z(this.g, fxpVar);
        z(this.h, fxpVar);
        z(this.i, fxpVar);
        z(this.j, fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        a aVar = this.f8411k;
        if (aVar == null) {
            return null;
        }
        return aVar.h();
    }

    public final void r(a aVar) {
        for (int i = 0; i < this.f8410b.size(); i++) {
            aVar.f(this.f8410b.get(i));
        }
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((a) rk1.e(this.f8411k)).read(bArr, i, i2);
    }

    public final a s() {
        if (this.e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f8409a);
            this.e = assetDataSource;
            r(assetDataSource);
        }
        return this.e;
    }

    public final a t() {
        if (this.f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f8409a);
            this.f = contentDataSource;
            r(contentDataSource);
        }
        return this.f;
    }

    public final a u() {
        if (this.i == null) {
            zn5 zn5Var = new zn5();
            this.i = zn5Var;
            r(zn5Var);
        }
        return this.i;
    }

    public final a v() {
        if (this.d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.d = fileDataSource;
            r(fileDataSource);
        }
        return this.d;
    }

    public final a w() {
        if (this.j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f8409a);
            this.j = rawResourceDataSource;
            r(rawResourceDataSource);
        }
        return this.j;
    }

    public final a x() {
        if (this.g == null) {
            try {
                a aVar = (a) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.g = aVar;
                r(aVar);
            } catch (ClassNotFoundException unused) {
                toe.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    public final a y() {
        if (this.h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.h = udpDataSource;
            r(udpDataSource);
        }
        return this.h;
    }

    public final void z(a aVar, fxp fxpVar) {
        if (aVar != null) {
            aVar.f(fxpVar);
        }
    }
}
