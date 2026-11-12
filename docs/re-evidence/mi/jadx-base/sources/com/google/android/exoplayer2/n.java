package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.j4h;
import defpackage.j63;
import defpackage.ph8;
import defpackage.wbj;
import defpackage.wlq;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n {
    public static final n i = new b().k();
    public static final j63<n> j = new ph8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f8035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f8036b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Uri h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f8037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f8038b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public CharSequence f;
        public CharSequence g;
        public Uri h;

        public b() {
        }

        public static /* synthetic */ wbj b(b bVar) {
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ wbj j(b bVar) {
            bVar.getClass();
            return null;
        }

        public n k() {
            return new n(this);
        }

        public b l(Metadata metadata) {
            for (int i = 0; i < metadata.e(); i++) {
                metadata.d(i).y(this);
            }
            return this;
        }

        public b m(List<Metadata> list) {
            for (int i = 0; i < list.size(); i++) {
                Metadata metadata = list.get(i);
                for (int i2 = 0; i2 < metadata.e(); i2++) {
                    metadata.d(i2).y(this);
                }
            }
            return this;
        }

        public b n(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b p(CharSequence charSequence) {
            this.f8038b = charSequence;
            return this;
        }

        public b q(CharSequence charSequence) {
            this.f8037a = charSequence;
            return this;
        }

        public b(n nVar) {
            this.f8037a = nVar.f8035a;
            this.f8038b = nVar.f8036b;
            this.c = nVar.c;
            this.d = nVar.d;
            this.e = nVar.e;
            this.f = nVar.f;
            this.g = nVar.g;
            this.h = nVar.h;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return wlq.c(this.f8035a, nVar.f8035a) && wlq.c(this.f8036b, nVar.f8036b) && wlq.c(this.c, nVar.c) && wlq.c(this.d, nVar.d) && wlq.c(this.e, nVar.e) && wlq.c(this.f, nVar.f) && wlq.c(this.g, nVar.g) && wlq.c(this.h, nVar.h) && wlq.c(null, null) && wlq.c(null, null);
    }

    public int hashCode() {
        return j4h.b(this.f8035a, this.f8036b, this.c, this.d, this.e, this.f, this.g, this.h, null, null);
    }

    public n(b bVar) {
        this.f8035a = bVar.f8037a;
        this.f8036b = bVar.f8038b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        b.j(bVar);
        b.b(bVar);
    }
}
