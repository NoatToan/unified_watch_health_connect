package defpackage;

import com.xiaomi.push.ig;

/* JADX INFO: loaded from: classes11.dex */
public class ass extends vas.a {
    public final /* synthetic */ pns c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ass(pns pnsVar, int i, String str) {
        super(i, str);
        this.c = pnsVar;
    }

    @Override // vas.a
    public void a() {
        boolean zM = vas.d(this.c.f30572a).m(ig.AggregatePushSwitch.a(), true);
        if (this.c.c != zM) {
            this.c.c = zM;
            gxs.l(this.c.f30572a);
        }
    }
}
