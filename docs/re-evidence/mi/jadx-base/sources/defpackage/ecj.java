package defpackage;

import androidx.datastore.preferences.protobuf.ProtoSyntax;
import androidx.datastore.preferences.protobuf.b0;

/* JADX INFO: loaded from: classes.dex */
public final class ecj implements urf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f16499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16500b;
    public final Object[] c;
    public final int d;

    public ecj(b0 b0Var, String str, Object[] objArr) {
        this.f16499a = b0Var;
        this.f16500b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
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

    @Override // defpackage.urf
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.urf
    public b0 b() {
        return this.f16499a;
    }

    @Override // defpackage.urf
    public ProtoSyntax c() {
        return (this.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    public Object[] d() {
        return this.c;
    }

    public String e() {
        return this.f16500b;
    }
}
