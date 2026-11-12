package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.text.Collator;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public class lzj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41198b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f41197a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41199c = null;
    private String g = null;
    private String d = null;
    private int e = 0;
    private int j = -1;

    public void d(String str) {
        this.f41198b = str;
    }

    public void c(Drawable drawable) {
        this.f41197a = drawable;
    }

    public Drawable b() {
        return this.f41197a;
    }

    public void a(String str) {
        this.f41199c = str;
    }

    public String d() {
        return this.f41199c;
    }

    public void e(String str) {
        this.g = str;
    }

    public String f() {
        return this.g;
    }

    public void e(int i) {
        this.e = i;
    }

    public int e() {
        return this.e;
    }

    public void d(int i) {
        this.j = i;
    }

    public int a() {
        return this.j;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public static class e implements Comparator<lzj> {
        private final Collator e;

        public e() {
            Collator collator = Collator.getInstance();
            this.e = collator;
            collator.setStrength(0);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compare(lzj lzjVar, lzj lzjVar2) {
            if (TextUtils.isEmpty(lzjVar.d())) {
                return 1;
            }
            if (TextUtils.isEmpty(lzjVar2.d())) {
                return -1;
            }
            return this.e.compare(lzjVar.d(), lzjVar2.d());
        }
    }
}
