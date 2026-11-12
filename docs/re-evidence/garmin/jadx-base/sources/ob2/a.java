package ob2;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import vh.z;
import zh.f;
import zh.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lob2/a;", "Lvh/a;", "Lorg/joda/time/DateTime;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements vh.a<DateTime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f131138a;

    public a() {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        dateTimeFormatterForPattern.getClass();
        this.f131138a = dateTimeFormatterForPattern;
    }

    @Override // vh.a
    public final void a(g gVar, z zVar, DateTime dateTime) {
        DateTime dateTime2 = dateTime;
        gVar.getClass();
        zVar.getClass();
        dateTime2.getClass();
        String strPrint = this.f131138a.print(dateTime2);
        strPrint.getClass();
        gVar.n0(strPrint);
    }

    @Override // vh.a
    public final DateTime b(f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = this.f131138a.parseDateTime(fVar.nextString());
        dateTime.getClass();
        return dateTime;
    }
}
