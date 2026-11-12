package rw;

import java.util.Calendar;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f154781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Calendar f154782c;

    public /* synthetic */ d(g gVar, Calendar calendar, int i14) {
        this.f154780a = i14;
        this.f154781b = gVar;
        this.f154782c = calendar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f154780a) {
            case 0:
                g gVar = this.f154781b;
                gVar.f154789c.invoke(this.f154782c, Boolean.valueOf(gVar.c()));
                break;
            default:
                this.f154781b.f154788b.invoke(this.f154782c);
                break;
        }
        return Unit.INSTANCE;
    }
}
