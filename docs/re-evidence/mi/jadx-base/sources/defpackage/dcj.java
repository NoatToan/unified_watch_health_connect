package defpackage;

import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class dcj implements trf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f15370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15371b;
    public final Object[] c;
    public final int d;

    public dcj(q0 q0Var, String str, Object[] objArr) {
        char cCharAt;
        this.f15370a = q0Var;
        this.f15371b = str;
        this.c = objArr;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        cCharAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.trf
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.trf
    public q0 b() {
        return this.f15370a;
    }

    @Override // defpackage.trf
    public ProtoSyntax c() {
        return (this.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    public Object[] d() {
        return this.c;
    }

    public String e() {
        return this.f15371b;
    }
}
