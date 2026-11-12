package p007l6;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p6.a;
import p6.f;
import p6.g;
import p6.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll6/c;", "Ll6/c0;", "Lp6/g;", "containerObject", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lp6/g;I)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f110445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110446b;

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    public c(g gVar, int i14) {
        String str;
        this.f110445a = gVar;
        a.f110438a.getClass();
        if (i14 == -2) {
            str = TtmlNode.START;
        } else if (i14 == -1) {
            str = TtmlNode.END;
        } else if (i14 == 0) {
            str = TtmlNode.LEFT;
        } else if (i14 != 1) {
            str = TtmlNode.START;
        } else {
            str = TtmlNode.RIGHT;
        }
        this.f110446b = str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    @Override // p007l6.c0
    public final void b(h.c cVar, float f14, float f15) {
        String str;
        a aVar = a.f110438a;
        int i14 = cVar.f110477b;
        aVar.getClass();
        if (i14 == -2) {
            str = TtmlNode.START;
        } else if (i14 == -1) {
            str = TtmlNode.END;
        } else if (i14 == 0) {
            str = TtmlNode.LEFT;
        } else if (i14 != 1) {
            str = TtmlNode.START;
        } else {
            str = TtmlNode.RIGHT;
        }
        a aVar2 = new a(new char[0]);
        aVar2.g(h.g(cVar.f110476a.toString()));
        aVar2.g(h.g(str));
        aVar2.g(new f(f14));
        aVar2.g(new f(f15));
        this.f110445a.u(this.f110446b, aVar2);
    }
}
