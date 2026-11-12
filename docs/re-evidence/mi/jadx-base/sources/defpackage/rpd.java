package defpackage;

import com.nimbusds.jose.shaded.json.parser.ParseException;

/* JADX INFO: loaded from: classes6.dex */
public class rpd extends qpd {
    public String z;

    public rpd(int i) {
        super(i);
    }

    @Override // defpackage.ppd
    public void f() {
        int i = this.g + 1;
        this.g = i;
        if (i >= this.y) {
            this.f30607a = (char) 26;
        } else {
            this.f30607a = this.z.charAt(i);
        }
    }

    @Override // defpackage.ppd
    public void k() throws ParseException {
        int i = this.g + 1;
        this.g = i;
        if (i < this.y) {
            this.f30607a = this.z.charAt(i);
        } else {
            this.f30607a = (char) 26;
            throw new ParseException(this.g - 1, 3, "EOF");
        }
    }

    @Override // defpackage.ppd
    public void n() {
        int i = this.g + 1;
        this.g = i;
        if (i >= this.y) {
            this.f30607a = (char) 26;
        } else {
            this.f30607a = this.z.charAt(i);
        }
    }

    @Override // defpackage.qpd
    public void u(int i, int i2) {
        this.f = this.z.substring(i, i2);
    }

    @Override // defpackage.qpd
    public void v(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.z.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.z.charAt(i3))) {
                break;
            } else {
                i2--;
            }
        }
        u(i, i2);
    }

    @Override // defpackage.qpd
    public int w(char c, int i) {
        return this.z.indexOf(c, i);
    }

    public Object x(String str) throws ParseException {
        return y(str, ypd.c.f37207b);
    }

    public <T> T y(String str, wtd<T> wtdVar) throws ParseException {
        this.f30608b = wtdVar.f38340a;
        this.z = str;
        this.y = str.length();
        return (T) d(wtdVar);
    }
}
