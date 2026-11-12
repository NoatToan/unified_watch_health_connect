package yp2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import uy2.f0;
import uy2.j0;
import uy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lyp2/a;", "Lsy2/c;", "Lyp2/b;", "", "accountId", "accountName", "", "F0", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "d", "()Ljava/lang/String;", "cardName", "getUserId", "userId", "H0", "refundId", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a extends sy2.c<b> {
    @j0(description = "Submit failed", exceptionClass = Exception.class)
    @k(description = "Happy path")
    Object F0(String str, String str2, t13.d<? super Unit> dVar);

    @f0("e814b759-c4b9-4a5d-bdba-caae72de6ad9")
    String H0();

    @Override // sy2.c
    @k
    /* synthetic */ void a(b bVar);

    /* synthetic */ Object b();

    @f0("Beijing T-Union Transit Card")
    String d();

    @f0("388e1ac6-5bb0-49e3-a9b8-fc786c60a02e")
    String getUserId();
}
