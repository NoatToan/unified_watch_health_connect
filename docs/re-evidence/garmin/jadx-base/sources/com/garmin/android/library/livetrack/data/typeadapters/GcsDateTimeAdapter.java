package com.garmin.android.library.livetrack.data.typeadapters;

import ca0.d4;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/GcsDateTimeAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lorg/joda/time/DateTime;", "<init>", "()V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GcsDateTimeAdapter extends BaseStringTypeAdapter<DateTime> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f50207d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f50208b = m.b(new d4(9));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f50209c = m.b(new d4(10));

    static {
        new a(null);
    }

    @Override // ce2.a
    public final String a(Object obj) {
        String strPrint = ((DateTimeFormatter) this.f50208b.getValue()).print((DateTime) obj);
        return strPrint == null ? "" : strPrint;
    }

    @Override // ce2.a
    public final Object b(String str) {
        try {
            return ((DateTimeFormatter) this.f50209c.getValue()).parseDateTime(str);
        } catch (Exception e4) {
            this.f50206a.error("Error parsing DateTime: " + str + ": " + e4.getMessage());
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/GcsDateTimeAdapter$a;", "", "<init>", "()V", "", "GCS_DATE_TIME_PATTERN", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
