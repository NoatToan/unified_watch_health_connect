package com.xiaomi.push;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes22.dex */
public final class at {

    public static final class a extends e {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private int b = 0;
        private boolean d = false;
        private int f = 0;
        private boolean h = false;
        private List<String> i = Collections.emptyList();
        private int j = -1;

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }

        public static a b(b bVar) {
            return new a().a(bVar);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.j < 0) {
                b();
            }
            return this.j;
        }

        public a a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public a a(b bVar) throws d {
            while (true) {
                int iM3577a = bVar.m3577a();
                if (iM3577a == 0) {
                    return this;
                }
                if (iM3577a == 8) {
                    a(bVar.c());
                } else if (iM3577a == 16) {
                    a(bVar.m3583a());
                } else if (iM3577a == 24) {
                    b(bVar.b());
                } else if (iM3577a == 32) {
                    b(bVar.m3583a());
                } else if (iM3577a == 42) {
                    a(bVar.m3580a());
                } else if (!a(bVar, iM3577a)) {
                    return this;
                }
            }
        }

        public a a(String str) {
            Objects.requireNonNull(str);
            if (this.i.isEmpty()) {
                this.i = new ArrayList();
            }
            this.i.add(str);
            return this;
        }

        public a a(boolean z) {
            this.c = true;
            this.d = z;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public List<String> m3506a() {
            return this.i;
        }

        @Override // com.xiaomi.push.e
        public void a(c cVar) throws IOException {
            if (m3507a()) {
                cVar.m3631b(1, c());
            }
            if (m3509c()) {
                cVar.m3623a(2, m3508b());
            }
            if (m3510d()) {
                cVar.m3618a(3, d());
            }
            if (f()) {
                cVar.m3623a(4, e());
            }
            Iterator<String> it2 = m3506a().iterator();
            while (it2.hasNext()) {
                cVar.m3622a(5, it2.next());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3507a() {
            return this.a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = 0;
            int iB = m3507a() ? c.b(1, c()) + 0 : 0;
            if (m3509c()) {
                iB += c.a(2, m3508b());
            }
            if (m3510d()) {
                iB += c.a(3, d());
            }
            if (f()) {
                iB += c.a(4, e());
            }
            Iterator<String> it2 = m3506a().iterator();
            while (it2.hasNext()) {
                iA += c.a(it2.next());
            }
            int size = iB + iA + (m3506a().size() * 1);
            this.j = size;
            return size;
        }

        public a b(int i) {
            this.e = true;
            this.f = i;
            return this;
        }

        public a b(boolean z) {
            this.g = true;
            this.h = z;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m3508b() {
            return this.d;
        }

        public int c() {
            return this.b;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m3509c() {
            return this.c;
        }

        public int d() {
            return this.f;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m3510d() {
            return this.e;
        }

        public boolean e() {
            return this.h;
        }

        public boolean f() {
            return this.g;
        }
    }
}
