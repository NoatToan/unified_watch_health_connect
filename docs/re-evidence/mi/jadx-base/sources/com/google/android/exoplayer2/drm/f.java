package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import defpackage.oh8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f7900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7901b;
        public final int c;

        public a(byte[] bArr, String str, int i) {
            this.f7900a = bArr;
            this.f7901b = str;
            this.c = i;
        }

        public byte[] a() {
            return this.f7900a;
        }

        public String b() {
            return this.f7901b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f7903b;

        public b(int i, byte[] bArr) {
            this.f7902a = i;
            this.f7903b = bArr;
        }
    }

    public interface c {
        void a(f fVar, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface d {
        void a(f fVar, byte[] bArr, long j);
    }

    public interface e {
        void a(f fVar, byte[] bArr, List<b> list, boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f$f, reason: collision with other inner class name */
    public interface InterfaceC0185f {
        f a(UUID uuid);
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f7904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7905b;

        public g(byte[] bArr, String str) {
            this.f7904a = bArr;
            this.f7905b = str;
        }

        public byte[] a() {
            return this.f7904a;
        }

        public String b() {
            return this.f7905b;
        }
    }

    Class<? extends oh8> a();

    Map<String, String> b(byte[] bArr);

    g c();

    byte[] d() throws MediaDrmException;

    void e(byte[] bArr, byte[] bArr2);

    byte[] f(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    oh8 g(byte[] bArr) throws MediaCryptoException;

    void h(byte[] bArr) throws DeniedByServerException;

    void i(byte[] bArr);

    a j(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException;

    void release();

    void setOnEventListener(c cVar);

    void setOnExpirationUpdateListener(d dVar);

    void setOnKeyStatusChangeListener(e eVar);
}
