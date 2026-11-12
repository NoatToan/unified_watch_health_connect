package ux;

import e23.l;
import e23.p;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f173028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f173029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f173030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f173031e;

    public /* synthetic */ a(List list, LocalDate localDate, LocalDate localDate2, l lVar, int i14) {
        this.f173027a = 0;
        this.f173030d = list;
        this.f173028b = localDate;
        this.f173029c = localDate2;
        this.f173031e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f173027a) {
            case 0:
                ((Integer) obj2).getClass();
                b.a(p0.t(1), this.f173031e, this.f173030d, this.f173028b, this.f173029c, (m) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                xr1.d.c(p0.t(1), this.f173031e, this.f173030d, this.f173028b, this.f173029c, (m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                xr1.e.c(p0.t(1), this.f173031e, this.f173030d, this.f173028b, this.f173029c, (m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(LocalDate localDate, LocalDate localDate2, List list, l lVar, int i14, int i15) {
        this.f173027a = i15;
        this.f173028b = localDate;
        this.f173029c = localDate2;
        this.f173030d = list;
        this.f173031e = lVar;
    }
}
