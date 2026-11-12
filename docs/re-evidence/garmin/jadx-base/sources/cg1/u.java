package cg1;

import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class u {
    public static final String a(UserRankDTO userRankDTO) {
        userRankDTO.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        try {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            ArrayList arrayList = userRankDTO.f41269w;
            if (arrayList == null) {
                return null;
            }
            Date date = simpleDateFormat.parse(((SegmentLeaderboardRowDTO) arrayList.get(0)).f41228d);
            date.getClass();
            return j0.g(date, "MMM d, yyyy", TimeZone.getDefault());
        } catch (ParseException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.d(a2Var, e4);
            l3.a aVar2 = l3.f23124b;
            long j8 = userRankDTO.f41250b;
            aVar2.getClass();
            return l3.a.b1(j8);
        }
    }
}
