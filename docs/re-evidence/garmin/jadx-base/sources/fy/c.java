package fy;

import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f73870a;

    public c(Map map) {
        this.f73870a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        CalendarItemDTO.b bVar = ((CalendarItemDTO) t7).f30973d;
        Map map = this.f73870a;
        Integer num = (Integer) map.get(bVar);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) map.get(((CalendarItemDTO) t14).f30973d);
        return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
