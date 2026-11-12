package ci0;

import e23.l;
import g22.k;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f27639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f27640c;

    public /* synthetic */ e(l lVar, DateTime dateTime, int i14) {
        this.f27638a = i14;
        this.f27639b = lVar;
        this.f27640c = dateTime;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f27638a) {
            case 0:
                this.f27639b.invoke(k.z(this.f27640c).b());
                break;
            case 1:
                this.f27639b.invoke(this.f27640c);
                break;
            case 2:
                DateTime dateTime = this.f27640c;
                if (dateTime != null) {
                    this.f27639b.invoke(dateTime);
                }
                break;
            case 3:
                this.f27639b.invoke(this.f27640c);
                break;
            case 4:
                this.f27639b.invoke(this.f27640c);
                break;
            case 5:
                this.f27639b.invoke(this.f27640c);
                break;
            case 6:
                LocalDate localDate = this.f27640c.toLocalDate();
                localDate.getClass();
                this.f27639b.invoke(k.t(localDate));
                break;
            case 7:
                this.f27639b.invoke(this.f27640c);
                break;
            case 8:
                this.f27639b.invoke(this.f27640c);
                break;
            case 9:
                this.f27639b.invoke(this.f27640c);
                break;
            case 10:
                this.f27639b.invoke(this.f27640c);
                break;
            default:
                this.f27639b.invoke(k.z(this.f27640c).b());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(DateTime dateTime, l lVar, int i14) {
        this.f27638a = i14;
        this.f27640c = dateTime;
        this.f27639b = lVar;
    }
}
