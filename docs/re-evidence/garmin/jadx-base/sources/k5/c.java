package k5;

import android.R;
import android.view.Menu;
import lc.u0;
import n4.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lk5/c;", "", "Lkotlin/Function0;", "", "onActionModeDestroy", "Ln4/d;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Le23/a;Ln4/d;Le23/a;Le23/a;Le23/a;Le23/a;Le23/a;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f102908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f102909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.a<Unit> f102910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.a<Unit> f102911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.a<Unit> f102912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e23.a<Unit> f102913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e23.a<Unit> f102914g;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(e23.a aVar, d dVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, int i14, j jVar) {
        aVar = (i14 & 1) != 0 ? null : aVar;
        if ((i14 & 2) != 0) {
            d.f123545e.getClass();
            dVar = d.f123546f;
        }
        this(aVar, dVar, (i14 & 4) != 0 ? null : aVar2, (i14 & 8) != 0 ? null : aVar3, (i14 & 16) != 0 ? null : aVar4, (i14 & 32) != 0 ? null : aVar5, (i14 & 64) != 0 ? null : aVar6);
    }

    public static void a(Menu menu, b bVar) {
        int i14;
        int i15 = bVar.f102905a;
        int i16 = bVar.f102906b;
        int i17 = b.a.f102907a[bVar.ordinal()];
        if (i17 == 1) {
            i14 = R.string.copy;
        } else if (i17 == 2) {
            i14 = R.string.paste;
        } else if (i17 == 3) {
            i14 = R.string.cut;
        } else if (i17 == 4) {
            i14 = R.string.selectAll;
        } else {
            if (i17 != 5) {
                u0.r();
                return;
            }
            i14 = R.string.autofill;
        }
        menu.add(0, i15, i16, i14).setShowAsAction(1);
    }

    public static void b(Menu menu, b bVar, e23.a aVar) {
        if (aVar != null && menu.findItem(bVar.f102905a) == null) {
            a(menu, bVar);
        } else {
            if (aVar != null || menu.findItem(bVar.f102905a) == null) {
                return;
            }
            menu.removeItem(bVar.f102905a);
        }
    }

    public c(e23.a<Unit> aVar, d dVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, e23.a<Unit> aVar6) {
        this.f102908a = aVar;
        this.f102909b = dVar;
        this.f102910c = aVar2;
        this.f102911d = aVar3;
        this.f102912e = aVar4;
        this.f102913f = aVar5;
        this.f102914g = aVar6;
    }

    public c() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
