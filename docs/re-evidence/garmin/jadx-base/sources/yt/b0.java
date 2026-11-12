package yt;

import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import f5.z0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/b1;", "", "Lf5/y0;", "measurables", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Ljava/util/List;J)Lf5/a1;", "androidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$measurePolicy$1", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class b0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f199270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007l6.y f199271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p007l6.p f199272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f199274e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p007l6.y f199275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f199276b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p007l6.y yVar, List list) {
            super(1);
            this.f199275a = yVar;
            this.f199276b = list;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            this.f199275a.e(aVar, this.f199276b);
            return Unit.INSTANCE;
        }
    }

    public b0(p1 p1Var, p007l6.y yVar, p007l6.p pVar, int i14, p1 p1Var2) {
        this.f199270a = p1Var;
        this.f199271b = yVar;
        this.f199272c = pVar;
        this.f199273d = i14;
        this.f199274e = p1Var2;
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        this.f199270a.getF182175a();
        long jF = this.f199271b.f(j8, b1Var.getF68910b(), this.f199272c, list, this.f199273d);
        this.f199274e.getF182175a();
        g6.m.a aVar = g6.m.f76012b;
        return b1.h0(b1Var, (int) (jF >> 32), (int) (jF & 4294967295L), new a(this.f199271b, list));
    }
}
