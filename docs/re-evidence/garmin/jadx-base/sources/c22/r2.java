package c22;

import android.os.SystemClock;
import android.view.View;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc22/r2;", "Landroid/view/View$OnClickListener;", "", "intervalMillis", "Lkotlin/Function1;", "Landroid/view/View;", "", "onSafeClick", "<init>", "(ILe23/l;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<View, Unit> f23236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23237c;

    /* JADX WARN: Multi-variable type inference failed */
    public r2(int i14, e23.l<? super View, Unit> lVar) {
        lVar.getClass();
        this.f23235a = i14;
        this.f23236b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        if (SystemClock.elapsedRealtime() - this.f23237c < this.f23235a) {
            return;
        }
        this.f23237c = SystemClock.elapsedRealtime();
        this.f23236b.invoke(view2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r2(e23.l<? super View, Unit> lVar) {
        this(0, lVar, 1, null);
        lVar.getClass();
    }

    public /* synthetic */ r2(int i14, e23.l lVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 1000 : i14, lVar);
    }
}
