package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.b0;
import androidx.media3.common.l;
import androidx.media3.common.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends na.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f9128n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f9129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f9130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f9131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f9132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f9133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f9134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f9135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<q> f9136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f9137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<l> f9138m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f9140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9141c;

        public a(Uri uri, q qVar, String str, String str2) {
            this.f9139a = uri;
            this.f9140b = qVar;
            this.f9141c = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f9143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f9145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f9146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f9147f;

        public b(Uri uri, q qVar, String str, String str2, String str3, String str4) {
            this.f9142a = uri;
            this.f9143b = qVar;
            this.f9144c = str;
            this.f9145d = str2;
            this.f9146e = str3;
            this.f9147f = str4;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f9128n = new c("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public c(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, q qVar, List<q> list7, boolean z14, Map<String, String> map, List<l> list8) {
        super(str, list, z14);
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list2.size(); i14++) {
            Uri uri = list2.get(i14).f9142a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f9129d = Collections.unmodifiableList(arrayList);
        this.f9130e = Collections.unmodifiableList(list2);
        this.f9131f = Collections.unmodifiableList(list3);
        this.f9132g = Collections.unmodifiableList(list4);
        this.f9133h = Collections.unmodifiableList(list5);
        this.f9134i = Collections.unmodifiableList(list6);
        this.f9135j = qVar;
        this.f9136k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f9137l = Collections.unmodifiableMap(map);
        this.f9138m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            Uri uri = ((a) list.get(i14)).f9139a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i14, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i15 = 0; i15 < list.size(); i15++) {
            Object obj = list.get(i15);
            for (int i16 = 0; i16 < list2.size(); i16++) {
                b0 b0Var = (b0) list2.get(i16);
                if (b0Var.f8171b == i14 && b0Var.f8172c == i15) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // na.c
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.f9130e, list);
        List list2 = Collections.EMPTY_LIST;
        return new c(this.f125102a, this.f125103b, arrayListC, list2, c(1, this.f9132g, list), c(2, this.f9133h, list), list2, this.f9135j, this.f9136k, this.f125104c, this.f9137l, this.f9138m);
    }
}
