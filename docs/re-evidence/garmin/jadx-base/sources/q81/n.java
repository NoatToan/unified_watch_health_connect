package q81;

import android.view.View;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p3.q1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq81/n;", "Lq81/m;", "Landroid/view/View;", "view", "Le32/l;", "Lo81/d;", "navigator", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/view/View;Le32/l;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f143354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tz.a<List<t71.a>> f143355j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view2, e32.l<o81.d> lVar, LocalDate localDate, LocalDate localDate2) {
        super(view2, lVar, localDate);
        view2.getClass();
        lVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f143354i = 10;
        this.f143355j = new tz.a<>(this.f143353h, new t71.d(this.f143350e, localDate, localDate2, 10, 0.0f, 100.0f, 0, 64, null), new t71.h(this.f143353h, localDate, 10), new t71.c(this.f143353h), null, null, 48, null);
    }

    @Override // q81.m, e32.p
    /* JADX INFO: renamed from: d */
    public final void c(u81.b bVar) {
        super.c(bVar);
        p81.b bVar2 = new p81.b(this.f143348c, new q1(this, 28));
        bVar2.f136382a.setContent(new z3.e(647285984, true, new p81.a(bVar, bVar2, 0)));
    }

    @Override // q81.m
    public final tz.a<List<t71.a>> f() {
        return this.f143355j;
    }

    @Override // q81.m
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF143354i() {
        return this.f143354i;
    }
}
