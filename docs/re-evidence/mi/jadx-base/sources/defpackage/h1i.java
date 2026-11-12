package defpackage;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.wearable.play.core.playerview.PlayerViewImpl;

/* JADX INFO: loaded from: classes2.dex */
public class h1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ghl f19573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerViewImpl f19574b;
    public ghl.a c = new a();

    public class a implements ghl.a {
        public a() {
        }

        @Override // ghl.a
        public void a() {
            if (a1i.f526b) {
                h1i.this.f19574b.f();
            }
        }

        @Override // ghl.a
        public void b() {
            if (a1i.f526b) {
                h1i.this.f19574b.f();
            }
        }

        @Override // ghl.a
        public void c() {
            h1i.this.f19574b.e();
        }
    }

    public h1i(Context context, PlayerViewImpl playerViewImpl) {
        this.f19574b = playerViewImpl;
    }

    public void b(Context context) {
        c(context);
    }

    public final void c(Context context) {
        e(context);
        d(context);
    }

    public final void d(Context context) {
        ghl ghlVar = new ghl(context, this.c);
        this.f19573a = ghlVar;
        ghlVar.c();
    }

    public final void e(Context context) {
        Intent intent = new Intent("com.android.music.musicservicecommand");
        intent.putExtra("command", "pause");
        context.sendBroadcast(intent);
    }
}
