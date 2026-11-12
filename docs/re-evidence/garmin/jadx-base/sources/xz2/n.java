package xz2;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import p1.l1;

/* JADX INFO: loaded from: classes3.dex */
public class n extends e<o> {

    public static class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f192918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f192919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l1<b> f192920c = new l1<>();

        public a(b bVar, b bVar2) {
            this.f192918a = new b(bVar.f192861a, bVar.f192862b, 1);
            this.f192919b = a(new b(bVar2.f192861a, bVar2.f192862b, 1)) + 1;
        }

        @Override // xz2.h
        public final int a(b bVar) {
            int i14 = bVar.f192861a;
            b bVar2 = this.f192918a;
            return ((i14 - bVar2.f192861a) * 12) + (bVar.f192862b - bVar2.f192862b);
        }

        @Override // xz2.h
        public final int getCount() {
            return this.f192919b;
        }

        @Override // xz2.h
        public final b getItem(int i14) {
            l1<b> l1Var = this.f192920c;
            b bVarC = l1Var.c(i14);
            if (bVarC != null) {
                return bVarC;
            }
            b bVar = this.f192918a;
            int i15 = bVar.f192861a + (i14 / 12);
            int i16 = bVar.f192862b + (i14 % 12);
            if (i16 >= 12) {
                i15++;
                i16 -= 12;
            }
            b bVar2 = new b(i15, i16, 1);
            l1Var.e(i14, bVar2);
            return bVar2;
        }
    }

    public n(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // xz2.e
    public final h a(b bVar, b bVar2) {
        return new a(bVar, bVar2);
    }

    @Override // xz2.e
    public final f b(int i14) {
        b item = this.f192881k.getItem(i14);
        MaterialCalendarView materialCalendarView = this.f192872b;
        return new o(materialCalendarView, item, materialCalendarView.getFirstDayOfWeek());
    }

    @Override // xz2.e
    public final int d(f fVar) {
        return this.f192881k.a(((o) fVar).getFirstViewDay());
    }

    @Override // xz2.e
    public final boolean g(Object obj) {
        return obj instanceof o;
    }
}
