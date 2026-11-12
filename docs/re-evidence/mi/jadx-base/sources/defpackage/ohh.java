package defpackage;

import com.xiaomi.continuity.channel.Packet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ohh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29176a = Packet.TAG;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29177b;
    public String c;

    public ohh(String str) {
        this.c = str;
    }

    public void a(String str, Object... objArr) {
        n5n.a(this.f29176a, str, objArr);
    }

    public String b() {
        return this.c;
    }

    public void c(String str, Object... objArr) {
        n5n.b(this.f29176a, str, objArr);
    }
}
