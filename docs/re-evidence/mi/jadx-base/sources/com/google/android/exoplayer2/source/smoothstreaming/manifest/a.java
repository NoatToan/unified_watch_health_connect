package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.StreamKey;
import defpackage.hdq;
import defpackage.rk1;
import defpackage.smp;
import defpackage.wlq;
import defpackage.ym9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public class a implements ym9<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8268b;
    public final int c;
    public final boolean d;
    public final C0201a e;
    public final b[] f;
    public final long g;
    public final long h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a, reason: collision with other inner class name */
    public static class C0201a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f8269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f8270b;
        public final smp[] c;

        public C0201a(UUID uuid, byte[] bArr, smp[] smpVarArr) {
            this.f8269a = uuid;
            this.f8270b = bArr;
            this.c = smpVarArr;
        }
    }

    public a(int i, int i2, long j, long j2, long j3, int i3, boolean z, C0201a c0201a, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : wlq.H0(j2, FolmeCore.NANOS_TO_MS, j), j3 != 0 ? wlq.H0(j3, FolmeCore.NANOS_TO_MS, j) : -9223372036854775807L, i3, z, c0201a, bVarArr);
    }

    @Override // defpackage.ym9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            b bVar2 = this.f[streamKey.f8049b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[streamKey.c]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new a(this.f8267a, this.f8268b, this.g, this.h, this.c, this.d, this.e, (b[]) arrayList2.toArray(new b[0]));
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8272b;
        public final long c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final String i;
        public final Format[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f8273k;
        public final String l;
        public final String m;
        public final List<Long> n;
        public final long[] o;
        public final long p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list, wlq.I0(list, FolmeCore.NANOS_TO_MS, j), wlq.H0(j2, FolmeCore.NANOS_TO_MS, j));
        }

        public Uri a(int i, int i2) {
            rk1.g(this.j != null);
            rk1.g(this.n != null);
            rk1.g(i2 < this.n.size());
            String string = Integer.toString(this.j[i].h);
            String string2 = this.n.get(i2).toString();
            return hdq.d(this.l, this.m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(Format[] formatArr) {
            return new b(this.l, this.m, this.f8271a, this.f8272b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, formatArr, this.n, this.o, this.p);
        }

        public long c(int i) {
            if (i == this.f8273k - 1) {
                return this.p;
            }
            long[] jArr = this.o;
            return jArr[i + 1] - jArr[i];
        }

        public int d(long j) {
            return wlq.i(this.o, j, true, true);
        }

        public long e(int i) {
            return this.o[i];
        }

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j2) {
            this.l = str;
            this.m = str2;
            this.f8271a = i;
            this.f8272b = str3;
            this.c = j;
            this.d = str4;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = str5;
            this.j = formatArr;
            this.n = list;
            this.o = jArr;
            this.p = j2;
            this.f8273k = list.size();
        }
    }

    public a(int i, int i2, long j, long j2, int i3, boolean z, C0201a c0201a, b[] bVarArr) {
        this.f8267a = i;
        this.f8268b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = c0201a;
        this.f = bVarArr;
    }
}
