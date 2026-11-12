package di0;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f59716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f59717c;

    public /* synthetic */ e(e23.l lVar, LocalDate localDate, int i14) {
        this.f59715a = i14;
        this.f59717c = lVar;
        this.f59716b = localDate;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f59715a) {
            case 0:
                this.f59717c.invoke(this.f59716b);
                break;
            case 1:
                LocalDate localDate = this.f59716b;
                if (localDate != null) {
                    this.f59717c.invoke(localDate);
                }
                break;
            case 2:
                LocalDate localDate2 = this.f59716b;
                if (localDate2 != null) {
                    this.f59717c.invoke(localDate2);
                }
                break;
            case 3:
                DateTime dateTimeAtStartOfDay = this.f59716b.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                this.f59717c.invoke(dateTimeAtStartOfDay);
                break;
            case 4:
                DateTime dateTimeAtStartOfDay2 = this.f59716b.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay2.getClass();
                this.f59717c.invoke(dateTimeAtStartOfDay2);
                break;
            case 5:
                LocalDate localDate3 = this.f59716b;
                if (localDate3 != null) {
                    this.f59717c.invoke(localDate3);
                }
                break;
            case 6:
                LocalDate localDate4 = this.f59716b;
                if (localDate4 != null) {
                    this.f59717c.invoke(localDate4);
                }
                break;
            case 7:
                LocalDate localDate5 = this.f59716b;
                if (localDate5 != null) {
                    this.f59717c.invoke(localDate5);
                }
                break;
            case 8:
                LocalDate localDate6 = this.f59716b;
                if (localDate6 != null) {
                    this.f59717c.invoke(localDate6);
                }
                break;
            case 9:
                this.f59717c.invoke(this.f59716b);
                break;
            case 10:
                this.f59717c.invoke(this.f59716b);
                break;
            case 11:
                LocalDate localDate7 = this.f59716b;
                localDate7.getClass();
                this.f59717c.invoke(localDate7);
                break;
            case 12:
                this.f59717c.invoke(this.f59716b);
                break;
            default:
                LocalDate localDate8 = this.f59716b;
                if (localDate8 != null) {
                    this.f59717c.invoke(localDate8);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(LocalDate localDate, e23.l lVar, int i14) {
        this.f59715a = i14;
        this.f59716b = localDate;
        this.f59717c = lVar;
    }
}
