package defpackage;

import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class xct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39003b;
    public boolean d;
    public byte f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserInfo f39002a = null;
    public int c = 0;
    public boolean e = true;

    public xct(String str, boolean z, byte b2) {
        this.f39003b = null;
        this.d = false;
        boolean z2 = wbt.f37823a;
        this.f39003b = str;
        this.d = z;
        this.f = b2;
    }

    public byte a() {
        return this.f;
    }

    public void b(int i) {
        this.c = i;
    }

    public void c(String str) {
        this.f39003b = str;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public String e() {
        return this.f39003b;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public String toString() {
        return "AuthInfo{mUserInfo=" + this.f39002a + ", mKey='" + this.f39003b + "', mIsPair=" + this.d + ", mNeedAuth=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
