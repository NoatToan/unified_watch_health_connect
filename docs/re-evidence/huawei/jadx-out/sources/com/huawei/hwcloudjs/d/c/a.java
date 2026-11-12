package com.huawei.hwcloudjs.d.c;

import com.huawei.hwcloudjs.e.b.c;
import com.huawei.hwcloudjs.e.b.d;

/* JADX INFO: loaded from: classes10.dex */
public class a extends c<C0178a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f17087b = new a();

    /* JADX INFO: renamed from: com.huawei.hwcloudjs.d.c.a$a, reason: collision with other inner class name */
    public static final class C0178a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int[] f17089b;

        public int b() {
            return this.f17088a;
        }

        public int[] a() {
            int[] iArr = this.f17089b;
            return iArr != null ? (int[]) iArr.clone() : new int[0];
        }

        public void a(int[] iArr) {
            if (iArr != null) {
                this.f17089b = (int[]) iArr.clone();
            }
        }

        public void a(int i) {
            this.f17088a = i;
        }
    }

    public static a a() {
        return f17087b;
    }
}
