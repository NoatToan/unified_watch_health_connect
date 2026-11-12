package ya0;

import com.garmin.proto.generated.GDIDataTypes;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f195430b;

    public /* synthetic */ f0(e23.l lVar, int i14) {
        this.f195429a = i14;
        this.f195430b = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f195429a) {
            case 0:
                this.f195430b.invoke(Boolean.FALSE);
                break;
            case 1:
                this.f195430b.invoke(Boolean.TRUE);
                break;
            case 2:
                this.f195430b.invoke(Boolean.FALSE);
                break;
            case 3:
                this.f195430b.invoke(GDIDataTypes.MeasurementUnit.STATUTE);
                break;
            case 4:
                this.f195430b.invoke(GDIDataTypes.MeasurementUnit.METRIC);
                break;
            case 5:
                e23.l lVar = this.f195430b;
                if (lVar != null) {
                    lVar.invoke(nr.x.EDIT_NOTE);
                }
                break;
            case 6:
                this.f195430b.invoke(Boolean.TRUE);
                break;
            case 7:
                this.f195430b.invoke(Boolean.FALSE);
                break;
            case 8:
                this.f195430b.invoke(new w41.a.m(w41.b.c.f181978a));
                break;
            case 9:
                this.f195430b.invoke(new w41.a.m(new w41.b.d(n51.b.e.INSTANCE)));
                break;
            case 10:
                this.f195430b.invoke(new w41.a.m(new w41.b.d(n51.b.c.INSTANCE)));
                break;
            case 11:
                this.f195430b.invoke(new w41.a.k(true));
                break;
            case 12:
                this.f195430b.invoke(w41.a.j.f181956a);
                break;
            case 13:
                this.f195430b.invoke(w41.a.d.f181950a);
                break;
            case 14:
                this.f195430b.invoke(w41.a.d.f181950a);
                break;
            case 15:
                this.f195430b.invoke(w41.a.C3387a.f181947a);
                break;
            case 16:
                this.f195430b.invoke(new w41.a.m(w41.b.c.f181978a));
                break;
            case 17:
                this.f195430b.invoke(new w41.a.m(new w41.b.d(n51.b.d.INSTANCE)));
                break;
            case 18:
                this.f195430b.invoke(Float.valueOf(0.0f));
                break;
            case 19:
                t41.c.f162274a.getClass();
                this.f195430b.invoke(Float.valueOf(t41.c.f162279f.f96790b / 2.0f));
                break;
            case 20:
                this.f195430b.invoke(t41.g.ELEVATION_SENSITIVITY);
                break;
            case 21:
                this.f195430b.invoke(t41.g.PACING_STRATEGY);
                break;
            case 22:
                this.f195430b.invoke(Float.valueOf(0.0f));
                break;
            case 23:
                this.f195430b.invoke(t41.g.HILL_EFFORT);
                break;
            case 24:
                this.f195430b.invoke(Boolean.TRUE);
                break;
            default:
                this.f195430b.invoke(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
