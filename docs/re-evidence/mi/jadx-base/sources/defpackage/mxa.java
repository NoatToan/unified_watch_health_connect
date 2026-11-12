package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class mxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo2 f27308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l55 f27309b = new l55();
    public final StringBuilder c = new StringBuilder();

    public mxa(zo2 zo2Var) {
        this.f27308a = zo2Var;
    }

    public static int g(zo2 zo2Var, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (zo2Var.g(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    public String a(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            ks5 ks5VarC = c(i, str);
            String strA = el9.a(ks5VarC.b());
            if (strA != null) {
                sb.append(strA);
            }
            String strValueOf = ks5VarC.d() ? String.valueOf(ks5VarC.c()) : null;
            if (i == ks5VarC.a()) {
                return sb.toString();
            }
            i = ks5VarC.a();
            str = strValueOf;
        }
    }

    public final js5 b(int i) {
        char c;
        int iF = f(i, 5);
        if (iF == 15) {
            return new js5(i + 5, Typography.dollar);
        }
        if (iF >= 5 && iF < 15) {
            return new js5(i + 5, (char) (iF + 43));
        }
        int iF2 = f(i, 6);
        if (iF2 >= 32 && iF2 < 58) {
            return new js5(i + 6, (char) (iF2 + 33));
        }
        switch (iF2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iF2)));
        }
        return new js5(i + 6, c);
    }

    public ks5 c(int i, String str) throws FormatException {
        this.c.setLength(0);
        if (str != null) {
            this.c.append(str);
        }
        this.f27309b.h(i);
        ks5 ks5VarO = o();
        return (ks5VarO == null || !ks5VarO.d()) ? new ks5(this.f27309b.a(), this.c.toString()) : new ks5(this.f27309b.a(), this.c.toString(), ks5VarO.c());
    }

    public final js5 d(int i) throws FormatException {
        int iF = f(i, 5);
        if (iF == 15) {
            return new js5(i + 5, Typography.dollar);
        }
        char c = '+';
        if (iF >= 5 && iF < 15) {
            return new js5(i + 5, (char) (iF + 43));
        }
        int iF2 = f(i, 7);
        if (iF2 >= 64 && iF2 < 90) {
            return new js5(i + 7, (char) (iF2 + 1));
        }
        if (iF2 >= 90 && iF2 < 116) {
            return new js5(i + 7, (char) (iF2 + 7));
        }
        switch (f(i, 8)) {
            case ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE /* 232 */:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = Typography.amp;
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = AbstractJsonLexerKt.COLON;
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = Typography.less;
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = Typography.greater;
                break;
            case 250:
                c = '?';
                break;
            case VibrateModeSetViewModel.DEFAULT_BBJI /* 251 */:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new js5(i + 8, c);
    }

    public final ls5 e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 > this.f27308a.k()) {
            int iF = f(i, 4);
            return iF == 0 ? new ls5(this.f27308a.k(), 10, 10) : new ls5(this.f27308a.k(), iF - 1, 10);
        }
        int iF2 = f(i, 7) - 8;
        return new ls5(i2, iF2 / 11, iF2 % 11);
    }

    public int f(int i, int i2) {
        return g(this.f27308a, i, i2);
    }

    public final boolean h(int i) {
        int i2 = i + 3;
        if (i2 > this.f27308a.k()) {
            return false;
        }
        while (i < i2) {
            if (this.f27308a.g(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final boolean i(int i) {
        int i2;
        if (i + 1 > this.f27308a.k()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f27308a.k(); i3++) {
            if (i3 == 2) {
                if (!this.f27308a.g(i + 2)) {
                    return false;
                }
            } else if (this.f27308a.g(i2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i) {
        int i2;
        if (i + 1 > this.f27308a.k()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f27308a.k(); i3++) {
            if (this.f27308a.g(i2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(int i) {
        int iF;
        if (i + 5 > this.f27308a.k()) {
            return false;
        }
        int iF2 = f(i, 5);
        if (iF2 < 5 || iF2 >= 16) {
            return i + 6 <= this.f27308a.k() && (iF = f(i, 6)) >= 16 && iF < 63;
        }
        return true;
    }

    public final boolean l(int i) {
        int iF;
        if (i + 5 > this.f27308a.k()) {
            return false;
        }
        int iF2 = f(i, 5);
        if (iF2 >= 5 && iF2 < 16) {
            return true;
        }
        if (i + 7 > this.f27308a.k()) {
            return false;
        }
        int iF3 = f(i, 7);
        if (iF3 < 64 || iF3 >= 116) {
            return i + 8 <= this.f27308a.k() && (iF = f(i, 8)) >= 232 && iF < 253;
        }
        return true;
    }

    public final boolean m(int i) {
        if (i + 7 > this.f27308a.k()) {
            return i + 4 <= this.f27308a.k();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f27308a.g(i3);
            }
            if (this.f27308a.g(i2)) {
                return true;
            }
            i2++;
        }
    }

    public final vv2 n() {
        while (k(this.f27309b.a())) {
            js5 js5VarB = b(this.f27309b.a());
            this.f27309b.h(js5VarB.a());
            if (js5VarB.c()) {
                return new vv2(new ks5(this.f27309b.a(), this.c.toString()), true);
            }
            this.c.append(js5VarB.b());
        }
        if (h(this.f27309b.a())) {
            this.f27309b.b(3);
            this.f27309b.g();
        } else if (i(this.f27309b.a())) {
            if (this.f27309b.a() + 5 < this.f27308a.k()) {
                this.f27309b.b(5);
            } else {
                this.f27309b.h(this.f27308a.k());
            }
            this.f27309b.f();
        }
        return new vv2(false);
    }

    public final ks5 o() throws FormatException {
        vv2 vv2VarQ;
        boolean zB;
        do {
            int iA = this.f27309b.a();
            if (this.f27309b.c()) {
                vv2VarQ = n();
                zB = vv2VarQ.b();
            } else if (this.f27309b.d()) {
                vv2VarQ = p();
                zB = vv2VarQ.b();
            } else {
                vv2VarQ = q();
                zB = vv2VarQ.b();
            }
            if (iA == this.f27309b.a() && !zB) {
                break;
            }
        } while (!zB);
        return vv2VarQ.a();
    }

    public final vv2 p() throws FormatException {
        while (l(this.f27309b.a())) {
            js5 js5VarD = d(this.f27309b.a());
            this.f27309b.h(js5VarD.a());
            if (js5VarD.c()) {
                return new vv2(new ks5(this.f27309b.a(), this.c.toString()), true);
            }
            this.c.append(js5VarD.b());
        }
        if (h(this.f27309b.a())) {
            this.f27309b.b(3);
            this.f27309b.g();
        } else if (i(this.f27309b.a())) {
            if (this.f27309b.a() + 5 < this.f27308a.k()) {
                this.f27309b.b(5);
            } else {
                this.f27309b.h(this.f27308a.k());
            }
            this.f27309b.e();
        }
        return new vv2(false);
    }

    public final vv2 q() throws FormatException {
        while (m(this.f27309b.a())) {
            ls5 ls5VarE = e(this.f27309b.a());
            this.f27309b.h(ls5VarE.a());
            if (ls5VarE.d()) {
                return new vv2(ls5VarE.e() ? new ks5(this.f27309b.a(), this.c.toString()) : new ks5(this.f27309b.a(), this.c.toString(), ls5VarE.c()), true);
            }
            this.c.append(ls5VarE.b());
            if (ls5VarE.e()) {
                return new vv2(new ks5(this.f27309b.a(), this.c.toString()), true);
            }
            this.c.append(ls5VarE.c());
        }
        if (j(this.f27309b.a())) {
            this.f27309b.e();
            this.f27309b.b(4);
        }
        return new vv2(false);
    }
}
