package defpackage;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qpd extends ppd {
    public int y;

    public qpd(int i) {
        super(i);
    }

    @Override // defpackage.ppd
    public void j(boolean[] zArr) throws IOException {
        int i = this.g;
        s(zArr);
        v(i, this.g);
    }

    @Override // defpackage.ppd
    public Object l(boolean[] zArr) throws ParseException, IOException {
        int i = this.g;
        f();
        r();
        char c = this.f30607a;
        if (c != '.' && c != 'E' && c != 'e') {
            t();
            char c2 = this.f30607a;
            if (c2 < 0 || c2 >= '~' || zArr[c2] || c2 == 26) {
                v(i, this.g);
                return e(this.f);
            }
            s(zArr);
            v(i, this.g);
            if (this.j) {
                return this.f;
            }
            throw new ParseException(this.g, 1, this.f);
        }
        if (c == '.') {
            f();
            r();
        }
        char c3 = this.f30607a;
        if (c3 != 'E' && c3 != 'e') {
            t();
            char c4 = this.f30607a;
            if (c4 < 0 || c4 >= '~' || zArr[c4] || c4 == 26) {
                v(i, this.g);
                return c();
            }
            s(zArr);
            v(i, this.g);
            if (this.j) {
                return this.f;
            }
            throw new ParseException(this.g, 1, this.f);
        }
        this.d.a('E');
        f();
        char c5 = this.f30607a;
        if (c5 != '+' && c5 != '-' && (c5 < '0' || c5 > '9')) {
            s(zArr);
            v(i, this.g);
            if (!this.j) {
                throw new ParseException(this.g, 1, this.f);
            }
            if (!this.h) {
                b();
            }
            return this.f;
        }
        this.d.a(c5);
        f();
        r();
        t();
        char c6 = this.f30607a;
        if (c6 < 0 || c6 >= '~' || zArr[c6] || c6 == 26) {
            v(i, this.g);
            return c();
        }
        s(zArr);
        v(i, this.g);
        if (this.j) {
            return this.f;
        }
        throw new ParseException(this.g, 1, this.f);
    }

    @Override // defpackage.ppd
    public void o() throws ParseException, IOException {
        if (!this.f30609k && this.f30607a == '\'') {
            if (!this.j) {
                throw new ParseException(this.g, 0, Character.valueOf(this.f30607a));
            }
            j(ppd.t);
            return;
        }
        int iW = w(this.f30607a, this.g + 1);
        if (iW == -1) {
            throw new ParseException(this.y, 3, null);
        }
        u(this.g + 1, iW);
        if (this.f.indexOf(92) != -1) {
            this.d.b();
            p();
        } else {
            a();
            this.g = iW;
            f();
        }
    }

    public abstract void u(int i, int i2);

    public abstract void v(int i, int i2);

    public abstract int w(char c, int i);
}
