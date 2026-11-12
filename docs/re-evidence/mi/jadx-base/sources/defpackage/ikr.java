package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment;
import com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ikr {
    public static int a(int i) {
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            switch (i) {
                case 4:
                case 8:
                case 16:
                case 1024:
                case 2048:
                    break;
                case 32:
                case 64:
                case 256:
                case 4096:
                case 8192:
                    return 2;
                case 128:
                case 512:
                case 16384:
                    return 1;
                default:
                    return 0;
            }
        }
        return 3;
    }

    public static String b(int i) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String str = Constant.DeviceType.WATCH;
        if (wearableDeviceModel != null) {
            str = Constant.DeviceType.WATCH + "/" + wearableDeviceModel.getProduct().getModel();
        }
        return ijr.c().d() + String.format(Locale.US, "?data={\"module\":\"%s\",\"category\":\"%s\",\"name\":\"%d.png\"}", "widget", str, Integer.valueOf(i));
    }

    public static boolean c() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null && wearableDeviceModel.isDeviceConnected();
    }

    public static boolean d(Collection<?> collection, Collection<?> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection.iterator();
        Iterator<?> it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            Object next2 = it2.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
            } else if (!next.equals(next2)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public static void e(Context context, int i, ImageLoadUtil.Callback callback) {
        if (i <= 0) {
            return;
        }
        ImageLoadUtil.loadBitmapWidthCookie(context, b(i), Collections.emptyMap(), callback);
    }

    public static void f(ImageView imageView, int i, String str) {
        if (i <= 0) {
            return;
        }
        String strB = b(i);
        Logger.i(WidgetGroupEditFragment.sTAG, "title:" + str + " subType:" + i + " url:" + strB);
        ImageLoadUtil.loadBitmapWidthCookie(imageView, strB, Collections.emptyMap());
    }

    public static void g(jyo.b bVar, int i, int i2, String str) {
        jyo[] jyoVarArr;
        if (bVar == null || (jyoVarArr = bVar.c) == null || jyoVarArr.length == 0) {
            return;
        }
        String str2 = TextUtils.equals(str, WidgetGroupEditFragment.ORIGIN_PAGE_TEMPLATE) ? "add" : TextUtils.equals(str, WidgetGroupEditFragment.ORIGIN_PAGE_MANAGE) ? "modify" : "delete";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (jyo jyoVar : bVar.c) {
            kyo[] kyoVarArr = jyoVar.e;
            for (int i3 = 0; i3 < kyoVarArr.length; i3++) {
                linkedHashMap.put("group_sequence", String.valueOf(i));
                linkedHashMap.put("group_style", String.valueOf(i2));
                linkedHashMap.put("operation", str2);
                kyo kyoVar = kyoVarArr[i3];
                linkedHashMap.put("index", String.valueOf(i3));
                linkedHashMap.put("function", String.valueOf(kyoVar.d));
                linkedHashMap.put("subtype", String.valueOf(kyoVar.e));
                linkedHashMap.put("name", kyoVar.f);
                linkedHashMap.put("sport_type", String.valueOf(kyoVar.g));
                linkedHashMap.put("style", String.valueOf(kyoVar.c));
            }
        }
    }

    public static void h(pir pirVar, Map<String, String> map) {
        List<kyo> listH = pirVar.h();
        for (int i = 0; listH != null && i < listH.size(); i++) {
            kyo kyoVar = listH.get(i);
            map.put("group_sequence", String.valueOf(pirVar.a()));
            map.put("group_style", String.valueOf(pirVar.b()));
            map.put("index", String.valueOf(i));
            map.put("function", String.valueOf(kyoVar.d));
            map.put("subtype", String.valueOf(kyoVar.e));
            map.put("name", kyoVar.f);
            map.put("sport_type", String.valueOf(kyoVar.g));
            map.put("style", String.valueOf(kyoVar.c));
        }
    }

    public static void i(List<pir> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < list.size(); i++) {
            linkedHashMap.put("operation", str);
            pir pirVar = list.get(i);
            if (pirVar.c() == 1) {
                h(pirVar, linkedHashMap);
                linkedHashMap.clear();
            }
        }
    }
}
