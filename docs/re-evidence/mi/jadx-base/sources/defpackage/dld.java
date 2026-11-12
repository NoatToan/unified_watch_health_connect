package defpackage;

import android.os.Bundle;
import com.miui.tsmclient.model.BaseResponse;
import com.service.mi.BankCard;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;
import com.xiaomi.fitness.nfc.ui.IssuerFragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dld implements itc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IssuerFragment f15656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardWrapper f15657b;
    public b c;
    public jz6 d;
    public String e;
    public String f;
    public Bundle g;
    public BankCard h;
    public Map<String, String> i;
    public boolean j;

    public static class a {
        public static dld a(IssuerFragment issuerFragment, BankCard bankCard, Bundle bundle) {
            b7f b7fVar = new b7f();
            HashMap map = new HashMap();
            map.put("security_code", bundle.getString("security_code"));
            map.put("account_holder_name", bundle.getString("account_holder_name"));
            map.put("account_number", bundle.getString("account_number"));
            map.put("expiry_year", bundle.getString("expiry_year"));
            map.put("expiry_month", bundle.getString("expiry_month"));
            b7fVar.g(issuerFragment, bankCard, map);
            return b7fVar;
        }

        public static dld b(IssuerFragment issuerFragment, CardWrapper cardWrapper, Bundle bundle, String str, String str2) {
            dld kxfVar;
            if (str != null || cardWrapper.isMifare() || cardWrapper.isCloudDoor()) {
                kxfVar = new kxf(bundle);
            } else if (cardWrapper.isBank()) {
                kxfVar = new a02();
            } else {
                kxfVar = cardWrapper.isPrivateCarKey() ? new sdi() : new woh();
            }
            kxfVar.h(issuerFragment, cardWrapper, str, str2);
            return kxfVar;
        }

        public static dld c(IssuerFragment issuerFragment, String str, boolean z, String str2) {
            return new sl3(issuerFragment, str, z, str2);
        }
    }

    public interface b {
        void onFinished(BaseResponse baseResponse);

        void onFinished(IssuerResult issuerResult);

        void onStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Throwable th) throws Exception {
        b bVar = this.c;
        if (bVar != null) {
            bVar.onFinished(new BaseResponse(-2, fmg.c(th), new Object[0]));
        }
    }

    public void g(IssuerFragment issuerFragment, BankCard bankCard, Map<String, String> map) {
        this.f15656a = issuerFragment;
        this.h = bankCard;
        this.i = map;
    }

    public void h(IssuerFragment issuerFragment, CardWrapper cardWrapper, String str, String str2) {
        this.f15656a = issuerFragment;
        this.f15657b = cardWrapper;
        this.e = str;
        this.f = str2;
    }

    public void i() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.onStart();
        }
        jz6 jz6Var = this.d;
        if (jz6Var != null && !jz6Var.isDisposed()) {
            this.d.dispose();
        }
        if (this.h != null) {
            this.d = s3q.f0().y0(this.h, this.i, this.j).O(new bg4() { // from class: zkd
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    this.f41401a.j((IssuerResult) obj);
                }
            }, new bg4() { // from class: ald
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    this.f1171a.k((Throwable) obj);
                }
            });
        } else {
            this.d = s3q.f0().z0(this.f15657b, this.e, this.g, this.f, this.f != null ? 1 : 3).O(new bg4() { // from class: bld
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    this.f4336a.l((BaseResponse) obj);
                }
            }, new bg4() { // from class: cld
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    this.f5452a.m((Throwable) obj);
                }
            });
        }
    }

    public final /* synthetic */ void j(IssuerResult issuerResult) throws Exception {
        b bVar = this.c;
        if (bVar != null) {
            bVar.onFinished(issuerResult);
        }
    }

    public final /* synthetic */ void l(BaseResponse baseResponse) throws Exception {
        b bVar = this.c;
        if (bVar != null) {
            bVar.onFinished(baseResponse);
        }
    }

    public final /* synthetic */ void m(Throwable th) throws Exception {
        b bVar = this.c;
        if (bVar != null) {
            bVar.onFinished(new BaseResponse(-2, fmg.c(th), new Object[0]));
        }
    }

    public void n(boolean z, int i, String str, IssuerResult issuerResult) {
    }

    public void o() {
        vqg.a("preIssue");
    }

    public void p() {
        jz6 jz6Var = this.d;
        if (jz6Var == null || jz6Var.isDisposed()) {
            return;
        }
        this.d.dispose();
    }

    public void q(b bVar) {
        this.c = bVar;
    }

    public void r(CardWrapper cardWrapper) {
        this.f15657b = cardWrapper;
    }
}
