package defpackage;

import androidx.health.platform.client.proto.ProtoSyntax;
import androidx.health.platform.client.proto.o0;

/* JADX INFO: loaded from: classes.dex */
public final class bcj implements rrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f4059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4060b;
    public final Object[] c;
    public final int d;

    public bcj(o0 o0Var, String str, Object[] objArr) {
        this.f4059a = o0Var;
        this.f4060b = str;
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

    @Override // defpackage.rrf
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.rrf
    public o0 b() {
        return this.f4059a;
    }

    @Override // defpackage.rrf
    public ProtoSyntax c() {
        return (this.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    public Object[] d() {
        return this.c;
    }

    public String e() {
        return this.f4060b;
    }
}
