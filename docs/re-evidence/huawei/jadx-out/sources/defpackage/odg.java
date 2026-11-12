package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.huawei.multisimsdk.odsa.view.ThirdPartyLoginWebActivity;

/* JADX INFO: loaded from: classes12.dex */
public class odg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f44191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Message f44192c;

    private odg() {
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final odg f44193c = new odg();
    }

    public static odg a() {
        return a.f44193c;
    }

    public void c(Context context, Message message) {
        this.f44191b = context;
        this.f44192c = message;
    }

    public void b(int i) {
        if (this.f44192c != null) {
            ocq.e("ThirdPartyAuth", "response result " + i + " to " + this.f44192c.getTarget());
            this.f44192c.arg1 = i;
            oco.a(this.f44192c);
            this.f44192c = null;
        }
    }

    public void e() {
        if (this.f44191b == null || this.f44192c == null) {
            ocq.c("ThirdPartyAuth", "Context or Message is not initialized!");
            return;
        }
        Intent intent = new Intent();
        intent.setClass(this.f44191b, ThirdPartyLoginWebActivity.class);
        intent.setFlags(268435456);
        ocq.e("ThirdPartyAuth", "start Third-party auth login " + intent);
        this.f44191b.startActivity(intent);
    }
}
