package com.garmin.android.apps.connectmobile.menstrualcycle.data.api;

import c83.a0;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/api/f;", "", "Lfz0/c;", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "", "Lzk0/f;", "a", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @i83.f("periodichealth-service/menstrualcycle/pregnancy/weightgoals/{startDate}/{endDate}")
    i0<a0<List<zk0.f>>> a(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);
}
