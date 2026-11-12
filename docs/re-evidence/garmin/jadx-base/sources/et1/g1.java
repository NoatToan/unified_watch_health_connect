package et1;

import l72.i3;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f65624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f65625c;

    public /* synthetic */ g1(e23.a aVar, e23.l lVar) {
        this.f65623a = 0;
        this.f65625c = aVar;
        this.f65624b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f65623a) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str, "menu_item_saved_trails")) {
                    this.f65625c.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str, "menu_item_my_trails")) {
                    this.f65624b.invoke(null);
                }
                break;
            case 1:
                this.f65624b.invoke((Long) obj);
                this.f65625c.invoke();
                break;
            case 2:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == -1) {
                    this.f65624b.invoke(this.f65625c.invoke());
                }
                break;
            case 3:
                f.a aVar2 = (f.a) obj;
                aVar2.getClass();
                if (aVar2.f67585a == -1) {
                    this.f65624b.invoke(this.f65625c.invoke());
                }
                break;
            case 4:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "MENU_ITEM_SAVE")) {
                    this.f65624b.invoke(Boolean.TRUE);
                    this.f65625c.invoke();
                }
                break;
            case 5:
                ti2.c cVar = (ti2.c) obj;
                cVar.getClass();
                this.f65624b.invoke(cVar);
                this.f65625c.invoke();
                break;
            case 6:
                l01.a aVar3 = (l01.a) obj;
                aVar3.getClass();
                this.f65624b.invoke(aVar3);
                this.f65625c.invoke();
                break;
            case 7:
                l01.d dVar = (l01.d) obj;
                dVar.getClass();
                this.f65624b.invoke(dVar);
                this.f65625c.invoke();
                break;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                this.f65624b.invoke(str2);
                this.f65625c.invoke();
                break;
            case 9:
                this.f65624b.invoke(Long.valueOf(new LocalDate((Long) obj, DateTimeZone.UTC).toDate().getTime()));
                this.f65625c.invoke();
                break;
            default:
                q91.b bVar = (q91.b) obj;
                bVar.getClass();
                this.f65624b.invoke(bVar);
                this.f65625c.invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g1(int i14, e23.a aVar, e23.l lVar) {
        this.f65623a = i14;
        this.f65624b = lVar;
        this.f65625c = aVar;
    }
}
