package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class cmy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("type")
    private int f1810a;

    @SerializedName("matcher")
    private String e;

    protected cmy(a aVar) {
        this.f1810a = aVar.f1812c;
        this.e = aVar.f1811b;
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1812c = 0;

        public a b(int i) {
            this.f1812c = i;
            return this;
        }

        public a a(String str) {
            this.f1811b = str;
            return this;
        }

        public cmy c() {
            return new cmy(this);
        }
    }

    public int c() {
        return this.f1810a;
    }

    public String a() {
        return this.e;
    }
}
