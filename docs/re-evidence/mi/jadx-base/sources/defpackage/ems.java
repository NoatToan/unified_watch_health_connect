package defpackage;

import android.content.Context;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.push.service.o0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ems {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16826a = "power_consumption_stats";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16827b = "off_up_ct";
    public final String c = "off_dn_ct";
    public final String d = "off_ping_ct";
    public final String e = "off_pong_ct";
    public final String f = "off_dur";
    public final String g = "on_up_ct";
    public final String h = "on_dn_ct";
    public final String i = "on_ping_ct";
    public final String j = "on_pong_ct";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f16828k = "on_dur";
    public final String l = SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME;
    public final String m = SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME;
    public final String n = "xmsf_vc";
    public final String o = "android_vc";
    public final String p = "uuid";

    public void a(Context context, bms bmsVar) {
        if (bmsVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("off_up_ct", Integer.valueOf(bmsVar.a()));
        map.put("off_dn_ct", Integer.valueOf(bmsVar.e()));
        map.put("off_ping_ct", Integer.valueOf(bmsVar.i()));
        map.put("off_pong_ct", Integer.valueOf(bmsVar.m()));
        map.put("off_dur", Long.valueOf(bmsVar.b()));
        map.put("on_up_ct", Integer.valueOf(bmsVar.q()));
        map.put("on_dn_ct", Integer.valueOf(bmsVar.s()));
        map.put("on_ping_ct", Integer.valueOf(bmsVar.u()));
        map.put("on_pong_ct", Integer.valueOf(bmsVar.w()));
        map.put("on_dur", Long.valueOf(bmsVar.f()));
        map.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, Long.valueOf(bmsVar.j()));
        map.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, Long.valueOf(bmsVar.n()));
        map.put("xmsf_vc", Integer.valueOf(bmsVar.y()));
        map.put("android_vc", Integer.valueOf(bmsVar.A()));
        map.put("uuid", o0.d(context));
        tts.c().b("power_consumption_stats", map);
    }
}
