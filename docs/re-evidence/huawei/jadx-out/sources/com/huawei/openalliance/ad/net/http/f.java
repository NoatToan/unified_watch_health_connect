package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.utils.dg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f19697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f19698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f19699c;
    final List<String> d;
    final List<String> e;
    final String f;
    final boolean g;
    final String h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f19700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f19701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19702c;
        final List<String> d;
        List<String> e;
        String f;
        boolean g;
        String h;

        public f a() {
            return new f(this);
        }

        public a a(List<String> list) {
            if (list != null) {
                this.e.addAll(list);
            }
            return this;
        }

        public a a(Context context, String str) {
            if (TextUtils.isEmpty(str) || !dg.l(str)) {
                str = fp.b(context).a(context, str);
            }
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            this.h = str;
            Uri uri = Uri.parse(str);
            this.f19700a = uri.getScheme();
            this.f19701b = dg.m(str);
            this.f19702c = uri.getPort();
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments != null) {
                this.d.addAll(pathSegments);
            }
            String encodedQuery = uri.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                for (String str2 : encodedQuery.split("&")) {
                    this.e.add(str2);
                }
            }
            this.f = uri.getEncodedFragment();
            return this;
        }

        public a(boolean z) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.g = z;
        }

        public a() {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.g = false;
        }
    }

    public String c() {
        int size;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19697a);
        sb.append("://");
        sb.append(this.f19698b);
        if (this.f19699c > 0) {
            sb.append(':');
            sb.append(this.f19699c);
        }
        sb.append('/');
        List<String> list = this.d;
        if (list != null) {
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                sb.append(this.d.get(i));
                sb.append('/');
            }
        }
        dg.a(sb, '/');
        List<String> list2 = this.e;
        if (list2 != null && (size = list2.size()) > 0) {
            sb.append('?');
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.e.get(i2));
                sb.append('&');
            }
            dg.a(sb, '&');
        }
        if (!TextUtils.isEmpty(this.f)) {
            sb.append('#');
            sb.append(this.f);
        }
        return sb.toString();
    }

    public String b() {
        return this.h;
    }

    public boolean a() {
        return this.g;
    }

    f(a aVar) {
        this.f19697a = aVar.f19700a;
        this.f19698b = aVar.f19701b;
        this.f19699c = aVar.f19702c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
    }
}
