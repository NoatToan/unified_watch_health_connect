package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class dmz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32036a;
    public static final UUID aa;
    public static final UUID ab;
    public static final Set<String> ac;
    public static final UUID ad;
    public static final UUID ae;
    public static final UUID af;
    public static final Set<String> ag;
    public static final UUID ah;
    public static final UUID ai;
    public static final UUID ak;
    public static final Set<Integer> al;
    public static final Set<String> an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f32037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UUID f32038c;
    public static final UUID d;
    public static final String e;
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
    public static final String y;
    public static final UUID z;

    static {
        HashSet hashSet = new HashSet(3);
        ac = hashSet;
        HashSet hashSet2 = new HashSet(4);
        an = hashSet2;
        HashSet hashSet3 = new HashSet(5);
        ag = hashSet3;
        HashSet hashSet4 = new HashSet();
        al = hashSet4;
        ad = UUID.fromString("00001810-0000-1000-8000-00805f9b34fb");
        f32038c = UUID.fromString("00002A35-0000-1000-8000-00805f9b34fb");
        r = UUID.fromString("00002A08-0000-1000-8000-00805f9b34fb");
        p = UUID.fromString("00001805-0000-1000-8000-00805f9b34fb");
        q = UUID.fromString("00002A2B-0000-1000-8000-00805f9b34fb");
        ah = UUID.fromString("473ef714-9b8c-4a3b-bd79-c843137e803f");
        k = UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID);
        w = UUID.fromString("00002a51-0000-1000-8000-00805f9b34fb");
        ak = UUID.fromString("00002a50-0000-1000-8000-00805f9b34fb");
        x = UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb");
        v = UUID.fromString("0000fff1-0000-1000-8000-00805f9b34fb");
        u = UUID.fromString("0000fff2-0000-1000-8000-00805f9b34fb");
        z = UUID.fromString("00001808-0000-1000-8000-00805f9b34fb");
        j = UUID.fromString("00002A18-0000-1000-8000-00805f9b34fb");
        o = UUID.fromString("00002A52-0000-1000-8000-00805f9b34fb");
        t = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb");
        h = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");
        s = UUID.fromString("00002a38-0000-1000-8000-00805f9b34fb");
        af = UUID.fromString("0000181c-0000-1000-8000-00805f9b34fb");
        d = UUID.fromString("00002a80-0000-1000-8000-00805f9b34fb");
        f = UUID.fromString("00002a8c-0000-1000-8000-00805f9b34fb");
        g = UUID.fromString("00002a8e-0000-1000-8000-00805f9b34fb");
        aa = UUID.fromString("00001805-0000-1000-8000-00805f9b34fb");
        i = UUID.fromString("00002a2b-0000-1000-8000-00805f9b34fb");
        ae = UUID.fromString("0000181d-0000-1000-8000-00805f9b34fb");
        l = UUID.fromString("00002a9d-0000-1000-8000-00805f9b34fb");
        ab = UUID.fromString("0000181b-0000-1000-8000-00805f9b34fb");
        f32037b = UUID.fromString("00002a9c-0000-1000-8000-00805f9b34fb");
        ai = UUID.fromString("0000faa0-0000-1000-8000-00805f9b34fb");
        n = UUID.fromString("0000faa1-0000-1000-8000-00805f9b34fb");
        m = UUID.fromString("0000faa2-0000-1000-8000-00805f9b34fb");
        y = BaseApplication.d();
        String str = dxc.f32474a + "am16Rs";
        e = str;
        f32036a = str + File.separator + "6d5416d9-2167-41df-ab10-c492e152b44f.zip";
        hashSet.add("2G97");
        hashSet.add("2G98");
        hashSet.add("2IX6");
        hashSet3.add("2G97");
        hashSet3.add("2G98");
        hashSet3.add("O03P");
        hashSet3.add("2GYA");
        hashSet3.add("2IX6");
        hashSet4.add(6);
        hashSet4.add(7);
        hashSet4.add(11);
        hashSet2.add("2G97");
        hashSet2.add("2G98");
        hashSet2.add("2IX6");
        hashSet2.add("O03P");
    }

    public static boolean e() {
        return CommonUtil.ap() || CommonUtil.cj() || CommonUtil.cl() || CommonUtil.ao();
    }
}
