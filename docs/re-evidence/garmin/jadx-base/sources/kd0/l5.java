package kd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/l5;", "Lde1/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l5 implements de1.a {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kd0/l5$a", "Lcom/google/gson/reflect/TypeToken;", "Lkm1/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<km1.c> {
    }

    @Override // de1.a
    public final Double a(String str) {
        km1.c cVar;
        km1.v dailySleep;
        if (str != null) {
            try {
                cVar = (km1.c) new Gson().fromJson(str, new a().getType());
            } catch (Exception unused) {
                cVar = null;
            }
        } else {
            cVar = null;
        }
        if (cVar == null || (dailySleep = cVar.getDailySleep()) == null) {
            return null;
        }
        return dailySleep.getAverageRespirationValue();
    }

    @Override // de1.a
    public final void b(Context context, DateTime dateTime, boolean z14) {
        context.getClass();
        context.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, context, dateTime, en1.c.SCORE, false, z14 ? rl1.i.RESPIRATION_AVERAGES : rl1.i.RESPIRATION, null, 32));
    }
}
