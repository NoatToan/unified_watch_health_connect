package cn.hutool.core.date;

import cn.hutool.core.date.DateRange;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Range;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class DateRange extends Range<DateTime> {
    private static final long serialVersionUID = 1;

    public DateRange(Date date, Date date2, DateField dateField) {
        this(date, date2, dateField, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DateTime lambda$new$0(Date date, DateField dateField, int i, DateTime dateTime, DateTime dateTime2, int i2) {
        DateTime dateTimeOffsetNew = a.i(date).offsetNew(dateField, (i2 + 1) * i);
        if (dateTimeOffsetNew.isAfter(dateTime2)) {
            return null;
        }
        return dateTimeOffsetNew;
    }

    public DateRange(Date date, Date date2, DateField dateField, int i) {
        this(date, date2, dateField, i, true, true);
    }

    public DateRange(final Date date, Date date2, final DateField dateField, final int i, boolean z, boolean z2) {
        super(a.i(date), a.i(date2), new Range.a() { // from class: bq5
            @Override // cn.hutool.core.lang.Range.a
            public final Object a(Object obj, Object obj2, int i2) {
                return DateRange.lambda$new$0(date, dateField, i, (DateTime) obj, (DateTime) obj2, i2);
            }
        }, z, z2);
    }
}
