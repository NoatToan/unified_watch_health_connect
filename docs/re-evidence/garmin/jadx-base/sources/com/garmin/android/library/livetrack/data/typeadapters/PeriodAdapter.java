package com.garmin.android.library.livetrack.data.typeadapters;

import ds.e0;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/PeriodAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lorg/joda/time/Period;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PeriodAdapter extends BaseStringTypeAdapter<Period> {
    @Override // ce2.a
    public final String a(Object obj) {
        String string = ((Period) obj).toString();
        string.getClass();
        return string;
    }

    @Override // ce2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Period b(String str) {
        str.getClass();
        try {
            return Period.parse(str);
        } catch (Exception e4) {
            e0.v("Error parsing Period: ", e4.getMessage(), this.f50206a);
            return null;
        }
    }
}
