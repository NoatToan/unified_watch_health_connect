package defpackage;

import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class pj4 implements rm1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rm1 f30456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r4n f30457b;

    @Override // rm1.a
    public void a(kt3 kt3Var, String str) {
        if (this.f30457b == null) {
            return;
        }
        String strF = kt3Var.f();
        strF.hashCode();
        if (strF.equals("notify")) {
            String strA = kt3Var.a();
            if (strA != null && strA.equals("audioList")) {
                JSONObject jSONObjectC = kt3Var.c();
                wm1 wm1Var = new wm1();
                wm1Var.b(jSONObjectC);
                this.f30457b.b(wm1Var, kt3Var.e(), str);
            }
            if (strA != null && strA.equals("loopType")) {
                JSONObject jSONObjectC2 = kt3Var.c();
                k55 k55Var = new k55();
                k55Var.b(jSONObjectC2);
                this.f30457b.a(k55Var, kt3Var.e(), str);
            }
            if (strA == null || !strA.equals("playCapacity")) {
                return;
            }
            this.f30457b.d(new k0i.b().a(kt3Var.c()), kt3Var.e(), str);
            return;
        }
        if (strF.equals(Packet.ACK)) {
            String strA2 = kt3Var.a();
            if (strA2 != null && strA2.equals("loopType")) {
                JSONObject jSONObjectC3 = kt3Var.c();
                k55 k55Var2 = new k55();
                k55Var2.b(jSONObjectC3);
                this.f30457b.a(k55Var2, kt3Var.e(), str);
            }
            if (strA2 != null && strA2.equals("audioList")) {
                JSONObject jSONObjectC4 = kt3Var.c();
                wm1 wm1Var2 = new wm1();
                wm1Var2.b(jSONObjectC4);
                this.f30457b.b(wm1Var2, kt3Var.e(), str);
            }
            if (strA2 != null && strA2.equals("playCapacity")) {
                JSONObject jSONObjectC5 = kt3Var.c();
                k0i k0iVarA = new k0i.b().a(jSONObjectC5);
                k0iVarA.e(jSONObjectC5);
                this.f30457b.d(k0iVarA, kt3Var.e(), str);
            }
            if (strA2 == null || strA2.equals("")) {
                if (kt3Var.b() == 200) {
                    this.f30457b.c(kt3Var.d(), kt3Var.e(), str);
                }
                if (kt3Var.b() == 201) {
                    this.f30457b.e(kt3Var.d(), kt3Var.e(), str);
                }
            }
        }
    }

    public void b(rm1 rm1Var) {
        this.f30456a = rm1Var;
        rm1Var.d(this);
    }

    public void c(r4n r4nVar) {
        this.f30457b = r4nVar;
    }
}
