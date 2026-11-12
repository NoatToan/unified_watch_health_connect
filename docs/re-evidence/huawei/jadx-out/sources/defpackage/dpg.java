package defpackage;

import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.operation.ble.BleConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class dpg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f32186a;
    public static final UUID aa;
    public static final UUID ab;
    public static final UUID ac;
    public static final UUID ad;
    public static final UUID ae;
    public static final UUID af;
    public static final Set<String> ag;
    public static final UUID ah;
    public static final UUID ai;
    public static final UUID aj;
    public static final UUID ak;
    public static final UUID al;
    public static final UUID am;
    public static final UUID an;
    public static final Set<String> ao;
    public static final UUID ap;
    public static final UUID aq;
    public static final UUID ar;
    public static final UUID as;
    private static Map<BleTaskQueueUtil.TaskType, e> at;
    public static final UUID au;
    private static Map<UUID, Integer> av;
    public static final UUID aw;
    public static final UUID ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f32187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UUID f32188c;
    public static final UUID d;
    public static final UUID e;
    public static final UUID f;
    public static final UUID g;
    public static final UUID h;
    public static final UUID i;
    public static final UUID j;
    public static final UUID k;
    public static final UUID l;
    public static final UUID m;
    public static final UUID n;
    public static final UUID o;
    public static final UUID p;
    public static final UUID q;
    public static final UUID r;
    public static final UUID s;
    public static final UUID t;
    public static final UUID u;
    public static final UUID v;
    public static final UUID w;
    public static final UUID x;
    public static final UUID y;
    public static final UUID z;

    static {
        UUID uuidFromString = UUID.fromString("0000181c-0000-1000-8000-00805f9b34fb");
        aq = uuidFromString;
        UUID uuidFromString2 = UUID.fromString("00002a80-0000-1000-8000-00805f9b34fb");
        f32187b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("00002a8c-0000-1000-8000-00805f9b34fb");
        o = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("00002a8e-0000-1000-8000-00805f9b34fb");
        p = uuidFromString4;
        UUID uuidFromString5 = UUID.fromString("02b2a08e-f8b0-4047-b1fd-f4e0efeee679");
        q = uuidFromString5;
        UUID uuidFromString6 = UUID.fromString("32330a04-15d9-421a-91c5-2a2d5c7525c9");
        d = uuidFromString6;
        UUID uuidFromString7 = UUID.fromString("a3d330f8-b84f-4f48-a78c-f8d1e33b597a");
        ab = uuidFromString7;
        UUID uuidFromString8 = UUID.fromString("42596cbe-d291-4da3-8ca6-d1ae5d1c9174");
        f32188c = uuidFromString8;
        UUID uuidFromString9 = UUID.fromString("8cc61d7d-66c0-4802-89c3-38c5a163592e");
        ac = uuidFromString9;
        n = UUID.fromString("4338c65e-ed8e-4085-bbea-a25e33ca6b54");
        y = UUID.fromString("3a3a7d71-37f6-4b94-b44a-21ac1916ac4f");
        g = UUID.fromString("2acf269d-6dae-4a64-98a4-dbf98c2e66c4");
        UUID uuidFromString10 = UUID.fromString("319d46ad-df02-4be5-b80f-6aa6f9c69329");
        j = uuidFromString10;
        i = UUID.fromString("4599778a-ea8a-4ffe-9499-de1ba7a03f3a");
        h = UUID.fromString("7749db19-9db5-4430-b6e2-5fcfb3f5b988");
        t = UUID.fromString("78bdadc1-5cae-4ec4-8832-21a020b1080b");
        UUID uuidFromString11 = UUID.fromString("00001805-0000-1000-8000-00805f9b34fb");
        al = uuidFromString11;
        UUID uuidFromString12 = UUID.fromString("00002a2b-0000-1000-8000-00805f9b34fb");
        f = uuidFromString12;
        k = UUID.fromString("75143e79-f878-4a00-a628-edc40509de7e");
        e = UUID.fromString("426f058d-8211-413e-8320-397a890a08bf");
        m = UUID.fromString("1f5d3d5c-496d-4290-af03-c7a8d5419741");
        ad = UUID.fromString("11872f15-a91d-49da-ac89-5107284f3425");
        l = UUID.fromString("7e6dbc73-42e7-45b9-a6ec-6aa2d7834695");
        UUID uuidFromString13 = UUID.fromString("0000181d-0000-1000-8000-00805f9b34fb");
        ap = uuidFromString13;
        UUID uuidFromString14 = UUID.fromString("00002a9d-0000-1000-8000-00805f9b34fb");
        z = uuidFromString14;
        UUID uuidFromString15 = UUID.fromString("0000181b-0000-1000-8000-00805f9b34fb");
        am = uuidFromString15;
        UUID uuidFromString16 = UUID.fromString("00002a9c-0000-1000-8000-00805f9b34fb");
        f32186a = uuidFromString16;
        af = UUID.fromString("46797c17-d639-488d-9476-4789e8472878");
        ai = UUID.fromString("0212f42a-5f19-4bc1-ba52-d7ec7ccb71a4");
        aa = UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID);
        s = UUID.fromString("bfc36f6e-4150-4a4b-9052-3d359e52962e");
        ak = UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb");
        x = UUID.fromString("0000fff1-0000-1000-8000-00805f9b34fb");
        w = UUID.fromString("0000fff2-0000-1000-8000-00805f9b34fb");
        v = UUID.fromString("0000fff3-0000-1000-8000-00805f9b34fb");
        u = UUID.fromString("0000fff4-0000-1000-8000-00805f9b34fb");
        an = UUID.fromString("00001880-0000-1000-8000-00805f9b34fb");
        r = UUID.fromString("ba216311-1787-472b-bef6-3eb29e62293e");
        au = UUID.fromString("e3c7a876-3307-414d-84f6-fbcd64710dc3");
        ax = UUID.fromString("33ff0cad-834f-4e42-ab91-a0747856d574");
        ae = UUID.fromString("b4e384f2-d880-44e7-8c7e-5249239633b4");
        ar = UUID.fromString("0000fe86-0000-1000-8000-00805f9b34fb");
        ah = UUID.fromString("000018a1-0000-1000-8000-00805f9b34fb");
        aj = UUID.fromString("000018a0-0000-1000-8000-00805f9b34fb");
        aw = UUID.fromString("0000fe01-0000-1000-8000-00805f9b34fb");
        as = UUID.fromString("0000fe02-0000-1000-8000-00805f9b34fb");
        ag = Collections.unmodifiableSet(new HashSet<String>() { // from class: dpg.4
            {
                add(dpg.r.toString());
                add(dpg.ak.toString());
                add(dpg.x.toString());
                add(dpg.v.toString());
                add(dpg.ai.toString());
                add(dpg.as.toString());
            }
        });
        ao = Collections.unmodifiableSet(new HashSet<String>() { // from class: dpg.1
            {
                add(dpg.r.toString());
                add(dpg.ax.toString());
                add(dpg.ae.toString());
                add(dpg.y.toString());
                add(dpg.g.toString());
                add(dpg.ab.toString());
                add(dpg.x.toString());
                add(dpg.w.toString());
                add(dpg.v.toString());
                add(dpg.u.toString());
                add(dpg.i.toString());
                add(dpg.h.toString());
                add(dpg.ad.toString());
                add(dpg.l.toString());
                add(dpg.k.toString());
                add(dpg.ac.toString());
                add(dpg.f.toString());
                add(dpg.e.toString());
                add(dpg.j.toString());
                add(dpg.ah.toString());
            }
        });
        HashMap<BleTaskQueueUtil.TaskType, e> map = new HashMap<BleTaskQueueUtil.TaskType, e>(16) { // from class: dpg.3
            public static final long serialVersionUID = -5758607221325354320L;

            {
                put(BleTaskQueueUtil.TaskType.GET_MANAGER_INFO, new e(dpg.aq, dpg.n));
                put(BleTaskQueueUtil.TaskType.SET_MANAGER_INFO, new e(dpg.aq, dpg.y));
                put(BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO, new e(dpg.aq, dpg.g));
                put(BleTaskQueueUtil.TaskType.SEND_DEVICE_RESET, new e(dpg.aq, dpg.i));
                put(BleTaskQueueUtil.TaskType.SEND_DELETE_USER_DATA, new e(dpg.aq, dpg.h));
                put(BleTaskQueueUtil.TaskType.SEND_GET_USER_DATA, new e(dpg.aq, dpg.t));
                put(BleTaskQueueUtil.TaskType.GET_DEVICE_SSID, new e(dpg.al, dpg.k));
                put(BleTaskQueueUtil.TaskType.GET_ALLOW_RESET_WIFI, new e(dpg.al, dpg.e));
                put(BleTaskQueueUtil.TaskType.GET_WEIGHT_REAL_TIME_DATA, new e(dpg.am, dpg.af));
                put(BleTaskQueueUtil.TaskType.REQUEST_OTA_UPGRADE, new e(dpg.ak, dpg.x));
                put(BleTaskQueueUtil.TaskType.OTA_UPGRADE_SHA_CHECK, new e(dpg.ak, dpg.w));
                put(BleTaskQueueUtil.TaskType.SEND_OTA_PACKAGE_DATA, new e(dpg.ak, dpg.v));
                put(BleTaskQueueUtil.TaskType.GET_OTA_UPGRADE_RESULT, new e(dpg.ak, dpg.u));
                put(BleTaskQueueUtil.TaskType.GET_SCALE_VERSION, new e(dpg.al, dpg.m));
                put(BleTaskQueueUtil.TaskType.GET_WEIGHT_HISTORY_DATA, new e(dpg.am, dpg.ai));
                put(BleTaskQueueUtil.TaskType.SET_WEIGHT_UNIT, new e(dpg.al, dpg.ad));
                put(BleTaskQueueUtil.TaskType.GET_WEIGHT_UNIT, new e(dpg.al, dpg.l));
                put(BleTaskQueueUtil.TaskType.SEND_WAKE_UP, new e(dpg.al, dpg.au));
                put(BleTaskQueueUtil.TaskType.SEND_SSID, new e(dpg.al, dpg.ax));
                put(BleTaskQueueUtil.TaskType.SEND_WIFI_PASSWORD, new e(dpg.al, dpg.ae));
                put(BleTaskQueueUtil.TaskType.OPEN_STATUS, new e(dpg.al, dpg.r));
                put(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE, new e(dpg.ar, dpg.aw));
                put(BleTaskQueueUtil.TaskType.NOTIFY_BLE_FILE, new e(dpg.ar, dpg.as));
                put(BleTaskQueueUtil.TaskType.SEND_OTA_URL, new e(dpg.aj, dpg.ah));
            }
        };
        at = map;
        map.put(BleTaskQueueUtil.TaskType.SET_AGE, new e(uuidFromString, uuidFromString2));
        at.put(BleTaskQueueUtil.TaskType.SET_GENDER, new e(uuidFromString, uuidFromString3));
        at.put(BleTaskQueueUtil.TaskType.SET_HEIGHT, new e(uuidFromString, uuidFromString4));
        at.put(BleTaskQueueUtil.TaskType.SET_SYNC_TIME, new e(uuidFromString11, uuidFromString12));
        at.put(BleTaskQueueUtil.TaskType.ENABLE_WEIGHT_SCALE, new e(uuidFromString13, uuidFromString14));
        at.put(BleTaskQueueUtil.TaskType.ENABLE_BODY_MEASUREMENT, new e(uuidFromString15, uuidFromString16));
        at.put(BleTaskQueueUtil.TaskType.REQUEST_AUTH, new e(uuidFromString, uuidFromString5));
        at.put(BleTaskQueueUtil.TaskType.AUTH_TOKEN, new e(uuidFromString, uuidFromString6));
        at.put(BleTaskQueueUtil.TaskType.SEND_WORK_KEY, new e(uuidFromString, uuidFromString7));
        at.put(BleTaskQueueUtil.TaskType.BIND_REQUEST, new e(uuidFromString, uuidFromString8));
        at.put(BleTaskQueueUtil.TaskType.SET_USER_INFO, new e(uuidFromString, uuidFromString9));
        at.put(BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO_ENCRYPTED, new e(uuidFromString, uuidFromString10));
        av = new HashMap<UUID, Integer>(16) { // from class: dpg.5
            public static final long serialVersionUID = -5753607221225351370L;

            {
                put(dpg.f32187b, Integer.valueOf(BleTaskQueueUtil.TaskType.SET_AGE.ordinal()));
                put(dpg.o, Integer.valueOf(BleTaskQueueUtil.TaskType.SET_GENDER.ordinal()));
                put(dpg.p, Integer.valueOf(BleTaskQueueUtil.TaskType.SET_HEIGHT.ordinal()));
                put(dpg.f, Integer.valueOf(BleTaskQueueUtil.TaskType.SET_SYNC_TIME.ordinal()));
                put(dpg.z, Integer.valueOf(BleTaskQueueUtil.TaskType.ENABLE_WEIGHT_SCALE.ordinal()));
                put(dpg.f32186a, Integer.valueOf(BleTaskQueueUtil.TaskType.ENABLE_BODY_MEASUREMENT.ordinal()));
                put(dpg.q, Integer.valueOf(BleTaskQueueUtil.TaskType.REQUEST_AUTH.ordinal()));
                put(dpg.d, Integer.valueOf(BleTaskQueueUtil.TaskType.AUTH_TOKEN.ordinal()));
                put(dpg.ab, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_WORK_KEY.ordinal()));
                put(dpg.f32188c, Integer.valueOf(BleTaskQueueUtil.TaskType.BIND_REQUEST.ordinal()));
                put(dpg.ac, Integer.valueOf(BleTaskQueueUtil.TaskType.SET_USER_INFO.ordinal()));
                put(dpg.n, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_MANAGER_INFO.ordinal()));
                put(dpg.y, Integer.valueOf(BleTaskQueueUtil.TaskType.SET_MANAGER_INFO.ordinal()));
                put(dpg.g, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO.ordinal()));
                put(dpg.i, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_DEVICE_RESET.ordinal()));
                put(dpg.h, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_DELETE_USER_DATA.ordinal()));
                put(dpg.t, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_GET_USER_DATA.ordinal()));
                put(dpg.k, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_DEVICE_SSID.ordinal()));
                put(dpg.e, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_ALLOW_RESET_WIFI.ordinal()));
                put(dpg.af, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_WEIGHT_REAL_TIME_DATA.ordinal()));
                put(dpg.x, Integer.valueOf(BleTaskQueueUtil.TaskType.REQUEST_OTA_UPGRADE.ordinal()));
                put(dpg.w, Integer.valueOf(BleTaskQueueUtil.TaskType.OTA_UPGRADE_SHA_CHECK.ordinal()));
                put(dpg.v, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_OTA_PACKAGE_DATA.ordinal()));
                put(dpg.u, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_OTA_UPGRADE_RESULT.ordinal()));
                put(dpg.m, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_SCALE_VERSION.ordinal()));
                put(dpg.ai, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_WEIGHT_HISTORY_DATA.ordinal()));
                put(dpg.ad, Integer.valueOf(BleTaskQueueUtil.TaskType.SET_WEIGHT_UNIT.ordinal()));
                put(dpg.l, Integer.valueOf(BleTaskQueueUtil.TaskType.GET_WEIGHT_UNIT.ordinal()));
                put(dpg.aw, Integer.valueOf(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE.ordinal()));
                put(dpg.j, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO_ENCRYPTED.ordinal()));
                put(dpg.ah, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_OTA_URL.ordinal()));
                put(dpg.au, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_WAKE_UP.ordinal()));
                put(dpg.ax, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_SSID.ordinal()));
                put(dpg.ae, Integer.valueOf(BleTaskQueueUtil.TaskType.SEND_WIFI_PASSWORD.ordinal()));
                put(dpg.r, Integer.valueOf(BleTaskQueueUtil.TaskType.OPEN_STATUS.ordinal()));
                put(dpg.as, Integer.valueOf(BleTaskQueueUtil.TaskType.NOTIFY_BLE_FILE.ordinal()));
            }
        };
    }

    public static Map<UUID, Integer> c() {
        return av;
    }

    public static Map<BleTaskQueueUtil.TaskType, e> b() {
        return at;
    }

    public static UUID d(UUID uuid) {
        Integer num = av.get(uuid);
        BleTaskQueueUtil.TaskType[] taskTypeArrValues = BleTaskQueueUtil.TaskType.values();
        if (taskTypeArrValues == null || taskTypeArrValues.length <= num.intValue()) {
            return null;
        }
        return at.get(taskTypeArrValues[num.intValue()]).c();
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private UUID f32189a;
        private UUID e;

        e(UUID uuid, UUID uuid2) {
            this.f32189a = uuid;
            this.e = uuid2;
        }

        public UUID c() {
            return this.f32189a;
        }

        public UUID a() {
            return this.e;
        }
    }
}
