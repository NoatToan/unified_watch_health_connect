package b0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e extends u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f13874b;

    public e(int i14, Throwable th3) {
        this.f13873a = i14;
        this.f13874b = th3;
    }

    @Override // b0.u.a
    public final Throwable a() {
        return this.f13874b;
    }

    @Override // b0.u.a
    public final int b() {
        return this.f13873a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u.a)) {
            return false;
        }
        u.a aVar = (u.a) obj;
        if (this.f13873a != aVar.b()) {
            return false;
        }
        Throwable th3 = this.f13874b;
        if (th3 == null) {
            return aVar.a() == null;
        }
        return th3.equals(aVar.a());
    }

    public final int hashCode() {
        int i14 = (this.f13873a ^ 1000003) * 1000003;
        Throwable th3 = this.f13874b;
        return i14 ^ (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f13873a + ", cause=" + this.f13874b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
