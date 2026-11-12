package fz0;

import b63.o;
import java.time.format.DateTimeFormatter;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfz0/c;", "", "Lorg/joda/time/DateTime;", "date", "Lb63/o;", "localDate", "<init>", "(Lorg/joda/time/DateTime;Lb63/o;)V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f73970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f73971b;

    public /* synthetic */ c(DateTime dateTime, o oVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : oVar);
    }

    public final String toString() {
        DateTime dateTime = this.f73970a;
        if (dateTime != null) {
            String string = dateTime.toString("yyyy-MM-dd");
            string.getClass();
            return string;
        }
        o oVar = this.f73971b;
        if (oVar == null) {
            return "";
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        oVar.getClass();
        String str = oVar.f16206a.format(dateTimeFormatterOfPattern);
        str.getClass();
        return str;
    }

    public c(DateTime dateTime, o oVar) {
        this.f73970a = dateTime;
        this.f73971b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
