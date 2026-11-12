package defpackage;

import com.nimbusds.jose.shaded.json.parser.ParseException;

/* JADX INFO: loaded from: classes6.dex */
public class opd {
    public static int c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rpd f29363b;

    static {
        c = System.getProperty("JSON_SMART_SIMPLE") != null ? 4032 : -1;
    }

    public opd(int i) {
        this.f29362a = i;
    }

    public final rpd a() {
        if (this.f29363b == null) {
            this.f29363b = new rpd(this.f29362a);
        }
        return this.f29363b;
    }

    public Object b(String str) throws ParseException {
        return a().x(str);
    }
}
