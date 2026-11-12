package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes15.dex */
public class pyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f45963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f45964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45965c;
    private String d;
    private String e;
    private String h;

    public pyj(e eVar) {
        this.f45965c = eVar.e;
        this.h = eVar.i;
        this.d = eVar.d;
        this.e = eVar.f45966a;
        this.f45963a = eVar.f45967b;
        this.f45964b = eVar.f45968c;
    }

    public String a() {
        return this.h;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public String[] e() {
        return this.f45963a;
    }

    public String[] d() {
        return this.f45964b;
    }

    public String toString() {
        return "mStyleType: " + this.f45965c + " mSupportWidgetClz: " + this.h + " mStyleableClzName" + this.d + " mStyleableField: " + this.e + " mIndexNames: " + this.f45963a + " mAttrNames: " + this.f45964b;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f45966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f45967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f45968c;
        private String d;
        private String e;
        private String i;

        public e a(String str) {
            if (TtmlNode.TAG_STYLE.equals(str)) {
                this.e = TtmlNode.TAG_STYLE;
                return this;
            }
            if ("textAppearance".equals(str)) {
                this.e = "textAppearance";
            }
            return this;
        }

        public e b(String str) {
            this.i = str;
            return this;
        }

        public e d(String str) {
            this.d = str;
            return this;
        }

        public e e(String str) {
            this.f45966a = str;
            return this;
        }

        public e b(String[] strArr) {
            this.f45967b = strArr;
            return this;
        }

        public e a(String[] strArr) {
            this.f45968c = strArr;
            return this;
        }

        public pyj a() {
            return new pyj(this);
        }
    }
}
