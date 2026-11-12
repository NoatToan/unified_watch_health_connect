package xz2;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class v extends e<w> {

    public static class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f192936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f192937b;

        public a(b bVar, b bVar2, int i14) {
            Calendar calendar = Calendar.getInstance();
            bVar.getClass();
            calendar.clear();
            calendar.set(bVar.f192861a, bVar.f192862b, bVar.f192863c);
            while (calendar.get(7) != i14) {
                calendar.add(7, -1);
            }
            b bVarB = b.b(calendar);
            this.f192936a = bVarB;
            this.f192937b = b(bVarB, bVar2) + 1;
        }

        public static int b(b bVar, b bVar2) {
            return (int) (((((bVar2.g().getTime() - bVar.g().getTime()) + ((long) bVar2.f().get(16))) - ((long) bVar.f().get(16))) / 86400000) / 7);
        }

        @Override // xz2.h
        public final int a(b bVar) {
            return b(this.f192936a, bVar);
        }

        @Override // xz2.h
        public final int getCount() {
            return this.f192937b;
        }

        @Override // xz2.h
        public final b getItem(int i14) {
            return b.d(new Date(TimeUnit.MILLISECONDS.convert(i14 * 7, TimeUnit.DAYS) + this.f192936a.g().getTime()));
        }
    }

    public v(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // xz2.e
    public final h a(b bVar, b bVar2) {
        return new a(bVar, bVar2, this.f192872b.getFirstDayOfWeek());
    }

    @Override // xz2.e
    public final f b(int i14) {
        b item = this.f192881k.getItem(i14);
        MaterialCalendarView materialCalendarView = this.f192872b;
        return new w(materialCalendarView, item, materialCalendarView.getFirstDayOfWeek());
    }

    @Override // xz2.e
    public final int d(f fVar) {
        return this.f192881k.a(((w) fVar).getFirstViewDay());
    }

    @Override // xz2.e
    public final boolean g(Object obj) {
        return obj instanceof w;
    }
}
