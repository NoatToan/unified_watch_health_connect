package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.push.Cif;
import com.xiaomi.push.service.o0;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class kds implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f23763a;

    public static String a() {
        return "dc_job_result_time_25";
    }

    public static void b(Context context) {
        if (context == null || !context.getPackageName().equals("com.xiaomi.xmsf")) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis % 86400000;
        if (f23763a == null) {
            f23763a = context.getSharedPreferences("mipush_extra", 0);
        }
        String strA = a();
        long j2 = f23763a.getLong(strA, 0L);
        if (j2 <= 0) {
            Random random = new Random(jCurrentTimeMillis);
            f23763a.edit().putLong(strA, jCurrentTimeMillis + ((long) random.nextInt(46800000)) + (86400000 - j) + ((long) (random.nextInt(3) * 86400000))).apply();
            return;
        }
        long j3 = jCurrentTimeMillis - j2;
        if (j3 >= 0) {
            f23763a.edit().putLong(strA, j2 + (((j3 / 259200000) + 1) * 259200000)).apply();
            new Thread(new kds()).start();
        } else if (Math.abs(j3) > 259200000) {
            f23763a.edit().putLong(strA, jCurrentTimeMillis + ((long) new Random(jCurrentTimeMillis).nextInt(46800000)) + (86400000 - j)).apply();
        }
    }

    public final void c(Context context, gds gdsVar, xcs xcsVar) {
        Cif cif = new Cif();
        cif.d("category_app_channel_info");
        cif.c("app_channel_info");
        cif.b(gdsVar.toString());
        cif.a(false);
        cif.a(1L);
        cif.a("xmsf_channel");
        cif.b(System.currentTimeMillis());
        cif.g("com.xiaomi.xmsf");
        cif.e("com.xiaomi.xmsf");
        cif.f(jfs.b());
        nfs.a(context, cif);
    }

    public final void d(xcs xcsVar, ucs ucsVar, Exception exc) {
        HashMap map = new HashMap();
        String strD = o0.d(odt.b());
        if (!TextUtils.isEmpty(strD)) {
            map.put("uuid", strD);
        }
        map.put("appCount", Long.valueOf(xcsVar.b()));
        map.put(Constants.KEY_RECHARGE_CHANNELS, Long.valueOf(xcsVar.e()));
        map.put("packCount", Long.valueOf(xcsVar.g()));
        map.put("totalSize", Long.valueOf(xcsVar.i()));
        map.put("isBatch", Integer.valueOf(xcsVar.a()));
        map.put("maxCallTime", Long.valueOf(ucsVar.a()));
        map.put("minCallTime", Long.valueOf(ucsVar.c()));
        map.put("callAvg", Long.valueOf(ucsVar.d()));
        map.put("duration", Long.valueOf(ucsVar.e()));
        if (exc != null) {
            map.put("exception", exc.toString());
        }
        tts.c().b("app_switch_upload", map);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [gds] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v7, types: [gds] */
    /* JADX WARN: Type inference failed for: r10v8, types: [gds] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r11v5, types: [eds, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v3, types: [gds, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [kds] */
    @Override // java.lang.Runnable
    public void run() {
        xcs xcsVar;
        xcs xcsVar2;
        String str;
        xcs xcsVar3;
        ?? r11;
        String str2;
        ?? r19;
        ?? edsVar;
        ?? r10;
        String str3 = "mipush_";
        String str4 = "com.xiaomi.xmsf";
        Context contextB = odt.b();
        if (contextB != null) {
            xcs xcsVar4 = new xcs();
            ucs ucsVar = new ucs(50L, 1000L);
            try {
                Map<String, ?> all = odt.b().getSharedPreferences("pref_registered_pkg_names", 0).getAll();
                if (all == null || all.isEmpty()) {
                    xcsVar = xcsVar4;
                } else {
                    Set<String> setKeySet = all.keySet();
                    xcsVar4.d(setKeySet.contains("com.xiaomi.xmsf") ? setKeySet.size() - 1 : setKeySet.size());
                    gds gdsVar = new gds();
                    gdsVar.put(PluginDeviceInfo.FICONON, xcsVar4.b());
                    Set<Map.Entry<String, ?>> setEntrySet = all.entrySet();
                    eds edsVar2 = new eds();
                    Iterator<Map.Entry<String, ?>> it = setEntrySet.iterator();
                    ?? r12 = gdsVar;
                    ?? r13 = edsVar2;
                    while (it.hasNext()) {
                        Map.Entry<String, ?> next = it.next();
                        String key = next.getKey();
                        String str5 = (String) next.getValue();
                        if (TextUtils.isEmpty(key)) {
                            str = str3;
                            str4 = str4;
                            xcsVar3 = xcsVar4;
                            it = it;
                            r10 = r12;
                            edsVar = r13;
                        } else {
                            try {
                                if (str4.equals(key) || TextUtils.isEmpty(str5)) {
                                    str = str3;
                                    str4 = str4;
                                    xcsVar3 = xcsVar4;
                                    it = it;
                                    r10 = r12;
                                    edsVar = r13;
                                } else {
                                    ?? gdsVar2 = new gds();
                                    gdsVar2.put(PluginDeviceInfo.FMODEL, str5);
                                    gdsVar2.put("s", (String) ucsVar.b(new nds(this, contextB, key)));
                                    List<NotificationChannel> listL = p8s.e(contextB, key).l();
                                    if (listL == null || listL.isEmpty()) {
                                        str = str3;
                                        xcsVar3 = xcsVar4;
                                        r11 = r13;
                                    } else {
                                        eds edsVar3 = new eds();
                                        xcsVar4.f(listL.size());
                                        Iterator<NotificationChannel> it2 = listL.iterator();
                                        ?? r14 = r13;
                                        while (it2.hasNext()) {
                                            NotificationChannel next2 = it2.next();
                                            String id = next2.getId();
                                            gds gdsVar3 = new gds();
                                            Iterator<NotificationChannel> it3 = it2;
                                            xcsVar2 = xcsVar4;
                                            if (id.startsWith(str3)) {
                                                r19 = r14;
                                                try {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str3);
                                                    sb.append(key);
                                                    str2 = str3;
                                                    sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
                                                    String strReplace = id.replace(sb.toString(), "");
                                                    gdsVar3.put(DeviceTagInterface.CUSTOM_TAG_TYPE, 1);
                                                    gdsVar3.put(PluginDeviceInfo.FICONON, strReplace);
                                                } catch (Exception e) {
                                                    e = e;
                                                    xcsVar = xcsVar2;
                                                    d(xcsVar, ucsVar, e);
                                                }
                                            } else {
                                                str2 = str3;
                                                r19 = r14;
                                                if (id.startsWith("mipush|")) {
                                                    String strReplace2 = id.replace("mipush|" + key + "|", "");
                                                    gdsVar3.put(DeviceTagInterface.CUSTOM_TAG_TYPE, 2);
                                                    gdsVar3.put(PluginDeviceInfo.FICONON, strReplace2);
                                                }
                                            }
                                            gdsVar3.put("s", (String) ucsVar.b(new qds(this, contextB, key, next2)));
                                            edsVar3.put(gdsVar3);
                                            r14 = r19;
                                            it2 = it3;
                                            xcsVar4 = xcsVar2;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        xcsVar3 = xcsVar4;
                                        gdsVar2.put(PluginDeviceInfo.FICONON, edsVar3);
                                        r11 = r14;
                                    }
                                    r11.put(gdsVar2);
                                    ?? r15 = r12;
                                    r15.put(PluginDeviceInfo.FICONOFF, r11);
                                    r10 = r15;
                                    edsVar = r11;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                xcsVar2 = xcsVar4;
                            }
                        }
                        if (r10.a() > 30720) {
                            xcsVar3.c();
                            xcsVar = xcsVar3;
                            try {
                                xcsVar.h(r10.a());
                                c(contextB, r10, xcsVar);
                                gds gdsVar4 = new gds();
                                gdsVar4.put(PluginDeviceInfo.FICONON, xcsVar.b());
                                r10 = gdsVar4;
                                edsVar = new eds();
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } else {
                            xcsVar = xcsVar3;
                        }
                        xcsVar4 = xcsVar;
                        str4 = str4;
                        it = it;
                        str3 = str;
                        r12 = r10;
                        r13 = edsVar;
                    }
                    xcsVar = xcsVar4;
                    if (r13.length() > 0) {
                        xcsVar.c();
                        xcsVar.h(r12.a());
                        c(contextB, r12, xcsVar);
                    }
                }
                e = null;
            } catch (Exception e4) {
                e = e4;
                xcsVar = xcsVar4;
            }
            d(xcsVar, ucsVar, e);
        }
    }
}
