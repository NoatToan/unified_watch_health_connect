package zf0;

import java.util.Comparator;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateTimeFormatter f204526a;

    public w0(DateTimeFormatter dateTimeFormatter) {
        this.f204526a = dateTimeFormatter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        String eventDate = ((fg0.o) t7).getEventDate();
        DateTimeFormatter dateTimeFormatter = this.f204526a;
        return r13.a.b(LocalDate.parse(eventDate, dateTimeFormatter), LocalDate.parse(((fg0.o) t14).getEventDate(), dateTimeFormatter));
    }
}
