package sb1;

import androidx.fragment.app.v;
import db1.m;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r13.b;
import r22.b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsb1/a;", "Lr22/b0;", "Landroidx/fragment/app/v;", "fm", "", "intervalType", "Lorg/joda/time/DateTime;", "referenceStartDate", "endDate", "Lr22/b0$b;", "pagerTitleFormatter", "Ldb1/m;", "pregnancySnapshotDTO", "<init>", "(Landroidx/fragment/app/v;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lr22/b0$b;Ldb1/m;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends b0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m f158395v;

    public /* synthetic */ a(v vVar, int i14, DateTime dateTime, DateTime dateTime2, b0.b bVar, m mVar, int i15, j jVar) {
        this(vVar, i14, dateTime, dateTime2, bVar, (i15 & 32) != 0 ? null : mVar);
    }

    @Override // r22.b0, fe.a
    public final CharSequence getPageTitle(int i14) {
        DateTime dateTimePlusDays;
        int i15 = this.f149584l;
        if (i15 == 1 || i15 == 3 || i15 == 6 || i15 == 7) {
            return super.getPageTitle(i14);
        }
        int i16 = this.f149588p;
        DateTime dateTime = this.f149589q;
        DateTime dateTimePlusDays2 = dateTime.plusDays(i14 * i16);
        dateTimePlusDays2.getClass();
        if (dateTimePlusDays2.isAfter(dateTime.plusDays(279))) {
            dateTimePlusDays = dateTimePlusDays2.plusDays(13);
            dateTimePlusDays.getClass();
        } else {
            dateTimePlusDays = dateTime.plusDays(((i14 + 1) * i16) - 1);
            dateTimePlusDays.getClass();
        }
        b0.b bVar = this.f149585m;
        m mVar = this.f158395v;
        if (mVar != null) {
            LocalDate deliveryDate = mVar.getDeliveryDate();
            if (deliveryDate == null) {
                deliveryDate = mVar.getEndDate();
            }
            if (deliveryDate != null) {
                DateTime dateTimeAtStartOfDay = deliveryDate.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                return bVar.a(i15, dateTimePlusDays2, (DateTime) b.e(dateTimePlusDays, dateTimeAtStartOfDay));
            }
        }
        return bVar.a(i15, dateTimePlusDays2, dateTimePlusDays);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, int i14, DateTime dateTime, DateTime dateTime2, b0.b bVar, m mVar) {
        super(vVar, i14, dateTime, dateTime2, bVar);
        vVar.getClass();
        bVar.getClass();
        this.f158395v = mVar;
    }
}
