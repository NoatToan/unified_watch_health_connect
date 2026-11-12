package com.careforeyou.library;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.careforeyou.library.bean.CsFatScale;
import com.careforeyou.library.bean.RoleInfo;
import com.careforeyou.library.bean.WeightEntity;
import com.careforeyou.library.enums.Protocal_Type;
import com.careforeyou.library.intface.BIACallback;
import com.careforeyou.library.intface.OnBluetoothListener;
import com.careforeyou.library.intface.OnWeightScalesListener;
import com.careforeyou.library.utils.CsBtUtil_v11;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.vi;
import defpackage.vk;
import defpackage.vl;
import defpackage.vm;
import defpackage.vu;
import defpackage.vw;
import defpackage.vy;
import defpackage.wc;
import defpackage.wf;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class BIAWorker implements OnBluetoothListener, OnWeightScalesListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile BIAWorker f4023c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4024a;
    private volatile int aa;
    private Runnable ab;
    private BluetoothGattCharacteristic ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BIACallback f4025b;
    private boolean e;
    private volatile int f;
    private Context g;
    private volatile String j;
    private volatile boolean k;
    private Handler l;
    private volatile vi p;
    private ArrayList<vl> q;
    private volatile RoleInfo u;
    private volatile int v;
    private Protocal_Type w;
    private volatile String y;
    private volatile boolean h = false;
    private volatile boolean x = false;
    private volatile boolean m = true;
    private volatile long s = 0;
    private volatile Date t = new Date();
    private volatile boolean o = true;
    private boolean i = true;
    private long ac = 0;
    private volatile boolean r = false;
    private volatile int d = 0;
    private CsBtUtil_v11 n = CsBtUtil_v11.b();

    static /* synthetic */ long b(BIAWorker bIAWorker, long j) {
        long j2 = bIAWorker.ac + j;
        bIAWorker.ac = j2;
        return j2;
    }

    private JSONObject b(WeightEntity weightEntity) {
        float weight = weightEntity.getWeight();
        String scaleweight = weightEntity.getScaleweight();
        int score = weightEntity.getScore();
        float bmi = weightEntity.getBmi();
        float axunge = weightEntity.getAxunge();
        float muscleWeight = weightEntity.getMuscleWeight();
        float viscera = weightEntity.getViscera();
        String bodyLeve = weightEntity.getBodyLeve();
        float metabolism = weightEntity.getMetabolism();
        float water = weightEntity.getWater();
        float bone = weightEntity.getBone();
        float protein = weightEntity.getProtein();
        float thinWeight = weightEntity.getThinWeight();
        float body_age = weightEntity.getBody_age();
        int heart = weightEntity.getHeart();
        String weight_time = weightEntity.getWeight_time();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("weight", Float.valueOf(weight).toString());
            jSONObject.put("scaleWeight", scaleweight);
            jSONObject.put(JsUtil.SCORE, score);
            jSONObject.put(BleConstants.BMI, Float.valueOf(bmi).toString());
            jSONObject.put("axunge", Float.valueOf(axunge).toString());
            jSONObject.put("muscleWeight", Float.valueOf(muscleWeight).toString());
            jSONObject.put("viscera", Float.valueOf(viscera).toString());
            jSONObject.put("bodyLeve", bodyLeve);
            jSONObject.put("metabolism", Float.valueOf(metabolism).toString());
            jSONObject.put("water", Float.valueOf(water).toString());
            jSONObject.put("bone", Float.valueOf(bone).toString());
            jSONObject.put("protein", Float.valueOf(protein).toString());
            jSONObject.put("thinWeight", Float.valueOf(thinWeight).toString());
            jSONObject.put("body_age", Float.valueOf(body_age).toString());
            jSONObject.put("heart", heart);
            jSONObject.put("weight_time", weight_time);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public BIAWorker(Context context) {
        this.g = context;
        h();
    }

    public static BIAWorker b(Context context) {
        if (f4023c == null) {
            synchronized (BIAWorker.class) {
                if (f4023c == null) {
                    f4023c = new BIAWorker(context);
                }
            }
        }
        return f4023c;
    }

    private void e() {
        BIACallback bIACallback;
        CsBtUtil_v11 csBtUtil_v11 = this.n;
        if (csBtUtil_v11 == null) {
            return;
        }
        this.e = csBtUtil_v11.e();
        boolean zA = vw.a(this.g);
        this.f4024a = zA;
        if (this.e) {
            if (zA || (bIACallback = this.f4025b) == null) {
                return;
            }
            bIACallback.onState(1, "定位权限未打开");
            return;
        }
        BIACallback bIACallback2 = this.f4025b;
        if (bIACallback2 != null) {
            bIACallback2.onState(0, "蓝牙未打开");
        }
    }

    private void h() {
        CsBtUtil_v11 csBtUtil_v11 = this.n;
        if (csBtUtil_v11 == null) {
            return;
        }
        csBtUtil_v11.e(this);
        this.n.b(this);
        this.n.a(this.g);
    }

    private RoleInfo e(JSONObject jSONObject) {
        this.u = new RoleInfo();
        if (jSONObject != null) {
            try {
                int i = jSONObject.getInt("id");
                int i2 = jSONObject.getInt("height");
                int i3 = jSONObject.getInt("sex");
                int i4 = jSONObject.getInt("age");
                double d = jSONObject.getDouble("weight");
                this.u.setId(i);
                this.u.setHeight(i2);
                this.u.setSex(i3);
                this.u.setAge(i4);
                this.u.setWeight((float) d);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.u;
    }

    public void b(String str, JSONObject jSONObject, byte[] bArr, BIACallback bIACallback) {
        this.j = str;
        this.u = e(jSONObject);
        this.f4025b = bIACallback;
        e();
        this.d = 1;
        this.n.h();
        this.n.d();
        b(true);
        f();
    }

    public void a() {
        this.d = 0;
        CsBtUtil_v11 csBtUtil_v11 = this.n;
        if (csBtUtil_v11 != null) {
            csBtUtil_v11.e(this.g);
            b(false);
            e(false);
            this.n.h();
            wf.e("CsBtUtil_v11", "stop");
            this.n.j();
            this.n.c();
            d();
        }
        j();
    }

    private void f() {
        this.k = false;
        this.l = new Handler(Looper.getMainLooper());
        this.ab = new Runnable() { // from class: com.careforeyou.library.BIAWorker.1
            @Override // java.lang.Runnable
            public void run() {
                if (BIAWorker.this.k) {
                    BIAWorker.this.j();
                    BIAWorker.this.k = false;
                } else if (BIAWorker.this.ac > 120000) {
                    BIAWorker.this.f4025b.onState(19, "设备搜索超时");
                    if (BIAWorker.this.n != null) {
                        BIAWorker.this.n.h();
                    }
                    BIAWorker.this.j();
                }
                BIAWorker.b(BIAWorker.this, 1000L);
                BIAWorker.this.c();
            }
        };
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacks(this.ab);
            this.l = null;
            this.ac = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Handler handler = this.l;
        if (handler != null) {
            handler.postDelayed(this.ab, 1000L);
        }
    }

    public void a(JSONArray jSONArray) {
        d(jSONArray);
        a(2);
    }

    private void b(boolean z) {
        this.h = z;
    }

    private void e(boolean z) {
        this.m = z;
    }

    private boolean b() {
        return this.m;
    }

    private void d() {
        this.p = null;
    }

    @Override // com.careforeyou.library.intface.OnBluetoothListener
    public void bluetoothStateChange(int i) {
        String str;
        switch (i) {
            case 2:
                str = "上报数据";
                break;
            case 3:
                str = "下发数据";
                break;
            case 4:
                str = "正在测体重";
                break;
            case 5:
                str = "正在测脂";
                break;
            case 6:
                str = "正在测心率";
                break;
            case 7:
                str = "蓝牙已关闭";
                break;
            case 8:
                str = "蓝牙已打开";
                break;
            case 9:
                str = "蓝牙扫描中";
                break;
            case 10:
                str = "发现服务";
                break;
            case 11:
                this.o = true;
                if (this.n.e() && b()) {
                    g();
                }
                str = "连接已关闭";
                break;
            case 12:
                str = "连接中";
                break;
            case 13:
                str = "已连接";
                break;
            case 14:
                str = "等待链接";
                break;
            case 15:
                str = "计算中";
                break;
            case 16:
                str = "等待测量";
                break;
            case 17:
                str = "位置权限有变化";
                break;
            default:
                str = null;
                break;
        }
        BIACallback bIACallback = this.f4025b;
        if (bIACallback != null) {
            bIACallback.onState(i, str);
        }
    }

    private void g() {
        SystemClock.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        wf.e("CsBtUtil_v11", "mac:" + this.y + "+protocalType:+" + this.w);
        this.n.d(this.y, this.w, false);
    }

    @Override // com.careforeyou.library.intface.OnBluetoothListener
    public void bluetoothTurnOff() {
        wf.e("CsBtUtil_v11", "bluetoothTurnOff");
        this.n.h();
        if (this.f == 1) {
            wf.e("CsBtUtil_v11", "deviceType == 1");
            this.n.j();
            this.n.c();
        }
    }

    @Override // com.careforeyou.library.intface.OnBluetoothListener
    public void bluetoothTurnOn() {
        if (this.f == 1) {
            e(this.y, this.w, true);
        } else {
            this.n.h();
            this.n.d();
        }
    }

    @Override // com.careforeyou.library.intface.OnWeightScalesListener
    public void broadcastChipseaData(vu vuVar) {
        wf.e("CsBtUtil_v11", "++broadcastChipseaData+" + vuVar.toString());
        if (TextUtils.isEmpty(this.j)) {
            d(vuVar);
        } else if (this.j.equalsIgnoreCase(vuVar.f51593c)) {
            d(vuVar);
        }
    }

    private void d(vu vuVar) {
        this.k = true;
        this.v = vuVar.j;
        this.y = vuVar.f51593c;
        if (this.h) {
            e(vuVar);
        } else {
            c(vuVar);
        }
    }

    private void c(vu vuVar) {
        wf.e("CsBtUtil_v11", "onBLEData");
        if (this.y == null) {
            return;
        }
        WeightEntity weightEntityE = vm.c(this.g).e((float) vuVar.l, vuVar.o, vuVar.i, vuVar.n, vuVar.g);
        if (this.y.equalsIgnoreCase(vuVar.f51593c)) {
            if (vuVar.e == 1) {
                if (vuVar.f51592b >= 2) {
                    wf.e("CsBtUtil_v11", "isWeightStartLock = 0;");
                    d(true, weightEntityE);
                    return;
                } else {
                    wf.e("CsBtUtil_v11", "isWeightStartLock = 1;");
                    d(true, weightEntityE);
                    return;
                }
            }
            wf.e("CsBtUtil_v11", "isWeightStartLock = 2;");
            d(false, weightEntityE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    private void e(vu vuVar) {
        boolean z;
        wf.e("CsBtUtil_v11", "onBLEbound");
        if (this.p != null) {
            if (this.p.d() == null || !this.p.d().equals(vuVar.f51593c)) {
                z = false;
            }
            b(false);
            e(true);
            if (z) {
                if (this.p.c() == 1) {
                    this.n.h();
                    if (this.n.a()) {
                        return;
                    }
                    e(this.p.d(), this.p.b(), false);
                    return;
                }
                this.n.d();
            }
        }
        this.p = new vi();
        this.p.d(vuVar.f51593c);
        this.p.a(vuVar.k);
        this.p.d(vuVar.f51592b);
        this.p.b(vuVar.g);
        this.p.c(vuVar.h);
        this.p.a(vuVar.d);
        z = true;
        b(false);
        e(true);
        if (z) {
            if (this.p.c() == 1) {
                this.n.h();
                if (this.n.a()) {
                    e(this.p.d(), this.p.b(), false);
                    return;
                }
                return;
            }
            this.n.d();
        }
    }

    private void e(String str, Protocal_Type protocal_Type, boolean z) {
        CsBtUtil_v11 csBtUtil_v11 = this.n;
        if (csBtUtil_v11 == null || !csBtUtil_v11.e() || str == null) {
            return;
        }
        this.y = str;
        this.w = protocal_Type;
        this.x = false;
        this.n.d(str, protocal_Type, z);
    }

    @Override // com.careforeyou.library.intface.OnWeightScalesListener
    public void specialFatScaleInfo(CsFatScale csFatScale) {
        if (csFatScale != null) {
            WeightEntity weightEntityA = vm.c(this.g).a(csFatScale);
            wf.e("CsBtUtil_v11", "BIAWorker WeightEntity：" + weightEntityA.toString());
            if (csFatScale.getLockFlag() == 1) {
                wf.e("CsBtUtil_v11", "BIAWorker fatScale.getLockFlag() == 1：");
                if (this.f == 2) {
                    csFatScale.cleanFatInfo();
                    csFatScale.setLockFlag((byte) 0);
                    b(this.u);
                }
                if (this.w == Protocal_Type.OKOKCloud && csFatScale.weighingDate != null && !csFatScale.weighingDate.equals(this.t)) {
                    this.o = true;
                    this.t = csFatScale.weighingDate;
                }
                if (this.o) {
                    wf.e("CsBtUtil_v11", "BIAWorker isFatFirst");
                    this.s = csFatScale.getRoleId();
                    d(true, weightEntityA);
                } else {
                    wf.e("CsBtUtil_v11", "BIAWorker !isFatFirst");
                    if (this.s != csFatScale.getRoleId()) {
                        wf.e("CsBtUtil_v11", "BIAWorker !isFatFirst mPrevMatchUserId != fatScale.getRoleId()");
                        this.s = csFatScale.getRoleId();
                        d(true, weightEntityA);
                    }
                }
            } else {
                wf.e("CsBtUtil_v11", "BIAWorker fatScale.getLockFlag() == 0");
                this.o = true;
                d(false, weightEntityA);
            }
            if (csFatScale.isHistoryData()) {
                return;
            }
            this.r = true;
        }
    }

    private void d(boolean z, WeightEntity weightEntity) {
        this.d = 2;
        BIACallback bIACallback = this.f4025b;
        if (bIACallback != null) {
            bIACallback.onState(15, "计算中");
        }
        vm.c(this.g).e(weightEntity, this.u, this.p);
        JSONObject jSONObjectB = b(weightEntity);
        if (this.f4025b != null) {
            if (weightEntity.getInsRateMeasuringType() == -1 && weightEntity.getHeartRateMeasuringType() == -1 && z) {
                this.f4025b.onState(18, "完成");
            } else if (weightEntity.getHeartRateMeasuringType() == 1 && weightEntity.getInsRateMeasuringType() == 0) {
                this.f4025b.onState(6, "正在测心率");
            } else if (weightEntity.getHeartRateMeasuringType() == 0 && weightEntity.getInsRateMeasuringType() == 0 && z) {
                this.f4025b.onState(18, "完成");
            }
        }
        if (this.f4025b != null) {
            wf.e("CsBtUtil_v11", "BIAWorker onResult");
            this.f4025b.onResult(z ? 1 : 0, jSONObjectB);
        }
    }

    @Override // com.careforeyou.library.intface.OnWeightScalesListener
    public void matchUserMsg(vk vkVar) {
        WeightEntity weightEntityE = vm.c(this.g).e((float) vkVar.d(), vkVar.b(), 0.0f, new Date(), 0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("weight", Float.valueOf(weightEntityE.getWeight()).toString());
            jSONObject.put("scaleWeight", weightEntityE.getScaleweight());
            jSONObject.put("weight_time", weightEntityE.getWeight_time());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        BIACallback bIACallback = this.f4025b;
        if (bIACallback != null) {
            bIACallback.onUserMatchResult(jSONObject, vkVar.c());
        }
    }

    @Override // com.careforeyou.library.intface.OnWeightScalesListener
    public void bluetoothWriteChannelDone(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.n == null) {
            return;
        }
        this.ad = bluetoothGattCharacteristic;
        if (this.p == null) {
            return;
        }
        this.f = this.n.b(this.p.d());
        this.aa = this.p.j();
        if (this.w == Protocal_Type.OKOKCloud) {
            this.n.g();
            i();
        }
        if (this.w == Protocal_Type.OKOKCloudV3 || this.w == Protocal_Type.OKOKCloudV4) {
            this.n.i();
            if (this.w != Protocal_Type.OKOKCloudV4 || this.u == null) {
                return;
            }
            byte[] bArrC = vy.c(this.u);
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.n.e(bArrC);
            return;
        }
        if (this.aa == 17) {
            BIACallback bIACallback = this.f4025b;
            if (bIACallback != null) {
                bIACallback.onSyncAllUserInfo();
                return;
            }
            return;
        }
        b(this.u);
    }

    private void i() {
        BIACallback bIACallback;
        if (this.w == Protocal_Type.OKOKCloud && this.aa == 2 && (bIACallback = this.f4025b) != null) {
            bIACallback.onCanSyncUnit();
        }
    }

    private void b(final RoleInfo roleInfo) {
        if (roleInfo == null) {
            return;
        }
        final byte b2 = 1;
        if (this.f != 2 ? roleInfo.getSex() == 0 : roleInfo.getSex() == 1) {
            b2 = 0;
        }
        final byte height = (byte) (roleInfo.getHeight() & 255);
        wc.b(new Runnable() { // from class: com.careforeyou.library.BIAWorker.5
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (i < 4) {
                    try {
                        Thread.sleep(150L);
                        if (BIAWorker.this.ad != null && BIAWorker.this.n != null) {
                            BIAWorker.this.n.a(BIAWorker.this.ad, vy.b(roleInfo.getId(), b2, height, roleInfo.getAge()), CsBtUtil_v11.Down_Instruction_Type.Sync_UserInfo);
                        }
                        i++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void a(final int i) {
        ArrayList<vl> arrayList = this.q;
        if (arrayList == null) {
            return;
        }
        final ArrayList<byte[]> arrayListD = vy.d(arrayList);
        wc.b(new Runnable() { // from class: com.careforeyou.library.BIAWorker.3
            @Override // java.lang.Runnable
            public void run() {
                BIAWorker.this.x = true;
                for (int i2 = 0; i2 < i; i2++) {
                    for (int i3 = 0; i3 < arrayListD.size(); i3++) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        byte[] bArr = (byte[]) arrayListD.get(i3);
                        if (BIAWorker.this.ad != null && BIAWorker.this.n != null) {
                            BIAWorker.this.n.a(BIAWorker.this.ad, bArr, CsBtUtil_v11.Down_Instruction_Type.Sync_UserInfo);
                        }
                    }
                }
                BIAWorker.this.x = false;
            }
        });
    }

    private void d(JSONArray jSONArray) {
        this.q = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                RoleInfo roleInfoE = e((JSONObject) jSONArray.get(i));
                vl vlVar = new vl();
                vlVar.f51279c = (byte) (roleInfoE.getAge() & 255);
                vlVar.e = (byte) (roleInfoE.getHeight() & 255);
                vlVar.f51277a = roleInfoE.getId();
                vlVar.f51278b = (byte) roleInfoE.getSex();
                vlVar.d = (short) (roleInfoE.getWeight() * 10.0f);
                this.q.add(vlVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
