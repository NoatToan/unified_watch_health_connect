package kotlin;

import android.view.ActionMode;
import android.view.View;
import k5.c;
import n4.d;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/p0;", "Li5/q3;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 implements q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f91376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMode f91377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f91378c = new c(new a(), null, null, null, null, null, null, 126, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s3 f91379d = s3.Hidden;

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements e23.a<p005kotlin.Unit> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final p005kotlin.Unit invoke() {
            p0.this.f91377b = null;
            return p005kotlin.Unit.INSTANCE;
        }
    }

    public p0(View view2) {
        this.f91376a = view2;
    }

    @Override // kotlin.q3
    public final void a(d dVar, e23.a<p005kotlin.Unit> aVar, e23.a<p005kotlin.Unit> aVar2, e23.a<p005kotlin.Unit> aVar3, e23.a<p005kotlin.Unit> aVar4, e23.a<p005kotlin.Unit> aVar5) {
        c cVar = this.f91378c;
        cVar.f102909b = dVar;
        cVar.f102910c = aVar;
        cVar.f102912e = aVar3;
        cVar.f102911d = aVar2;
        cVar.f102913f = aVar4;
        cVar.f102914g = aVar5;
        ActionMode actionMode = this.f91377b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f91379d = s3.Shown;
        r3 r3Var = r3.f91430a;
        k5.a aVar6 = new k5.a(cVar);
        r3Var.getClass();
        this.f91377b = this.f91376a.startActionMode(aVar6, 1);
    }

    @Override // kotlin.q3
    public final void b(d dVar, e23.a<p005kotlin.Unit> aVar, e23.a<p005kotlin.Unit> aVar2, e23.a<p005kotlin.Unit> aVar3, e23.a<p005kotlin.Unit> aVar4) {
        a(dVar, aVar, aVar2, aVar3, aVar4, null);
    }

    @Override // kotlin.q3
    /* JADX INFO: renamed from: getStatus, reason: from getter */
    public final s3 getF91379d() {
        return this.f91379d;
    }

    @Override // kotlin.q3
    public final void hide() {
        this.f91379d = s3.Hidden;
        ActionMode actionMode = this.f91377b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f91377b = null;
    }
}
