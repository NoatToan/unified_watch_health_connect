package ob2;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import p005kotlin.Metadata;
import vh.z;
import zh.f;
import zh.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lob2/b;", "Lvh/a;", "Lorg/joda/time/LocalDateTime;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements vh.a<LocalDateTime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f131139a;

    public b() {
        DateTimeFormatter dateTimeFormatterDateTime = ISODateTimeFormat.dateTime();
        dateTimeFormatterDateTime.getClass();
        this.f131139a = dateTimeFormatterDateTime;
    }

    @Override // vh.a
    public final void a(g gVar, z zVar, LocalDateTime localDateTime) {
        LocalDateTime localDateTime2 = localDateTime;
        gVar.getClass();
        zVar.getClass();
        localDateTime2.getClass();
        String strPrint = this.f131139a.print(localDateTime2);
        strPrint.getClass();
        gVar.n0(strPrint);
    }

    @Override // vh.a
    public final LocalDateTime b(f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        String strNextString = fVar.nextString();
        try {
            LocalDateTime localDateTime = this.f131139a.parseLocalDateTime(strNextString);
            localDateTime.getClass();
            return localDateTime;
        } catch (Exception unused) {
            LocalDateTime localDateTime2 = LocalDateTime.parse(strNextString);
            localDateTime2.getClass();
            return localDateTime2;
        }
    }
}
