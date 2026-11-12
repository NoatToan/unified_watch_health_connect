package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import defpackage.k9c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends k9c {
    public static final b n = new b("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List<Uri> d;
    public final List<C0193b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;
    public final Format j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Format> f8157k;
    public final Map<String, String> l;
    public final List<DrmInitData> m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f8159b;
        public final String c;
        public final String d;

        public a(Uri uri, Format format, String str, String str2) {
            this.f8158a = uri;
            this.f8159b = format;
            this.c = str;
            this.d = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$b, reason: collision with other inner class name */
    public static final class C0193b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f8161b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public C0193b(Uri uri, Format format, String str, String str2, String str3, String str4) {
            this.f8160a = uri;
            this.f8161b = format;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public static C0193b b(Uri uri) {
            return new C0193b(uri, new Format.b().S("0").K("application/x-mpegURL").E(), null, null, null, null);
        }

        public C0193b a(Format format) {
            return new C0193b(this.f8160a, format, this.c, this.d, this.e, this.f);
        }
    }

    public b(String str, List<String> list, List<C0193b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, Format format, List<Format> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = format;
        this.f8157k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void b(List<a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f8158a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> d(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                StreamKey streamKey = list2.get(i3);
                if (streamKey.f8049b == i && streamKey.c == i2) {
                    arrayList.add(t);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static b e(String str) {
        return new b("", Collections.emptyList(), Collections.singletonList(C0193b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    public static List<Uri> f(List<C0193b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f8160a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // defpackage.ym9
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b a(List<StreamKey> list) {
        return new b(this.f23628a, this.f23629b, d(this.e, 0, list), Collections.emptyList(), d(this.g, 1, list), d(this.h, 2, list), Collections.emptyList(), this.j, this.f8157k, this.c, this.l, this.m);
    }
}
