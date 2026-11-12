package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import com.xiaomi.miot.ble.ByteUtil;
import com.xiaomi.miot.ble.CRCUtil;
import com.xiaomi.miot.ble.channel.ChannelEvent;
import com.xiaomi.miot.ble.channel.ChannelState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ft3 implements ypc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qfp f18174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f18175b;
    public final Handler c;
    public byte g;
    public int h;
    public short i;
    public byte[] j;
    public int n;
    public ChannelState o;
    public it3 p;
    public final bqc q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bqc f18177r;
    public final bqc s;
    public final bqc t;
    public final bqc u;
    public final bqc v;
    public final bqc w;
    public final bqc x;
    public final qfp.a y;
    public final nt3[] z;
    public int d = 23;
    public boolean e = false;
    public boolean f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray<phh> f18176k = new SparseArray<>();
    public final List<Short> l = new ArrayList();
    public short m = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f18178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f18179b;
        public final /* synthetic */ boolean c;

        public a(int i, boolean z, boolean z2) {
            this.f18178a = i;
            this.f18179b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ft3.this.R(this.f18178a, this.f18179b, this.c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte f18180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f18181b;
        public final /* synthetic */ it3 c;

        public b(byte b2, byte[] bArr, it3 it3Var) {
            this.f18180a = b2;
            this.f18181b = bArr;
            this.c = it3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ft3.this.Q(this.f18180a, this.f18181b, this.c);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f18182a;

        public c(byte[] bArr) {
            this.f18182a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ft3.this.P(this.f18182a);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ft3.this.U();
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ it3 f18185a;

        public e(it3 it3Var) {
            this.f18185a = it3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18185a.onCallback(-3);
        }
    }

    public class f implements it3 {
        public f() {
        }

        @Override // defpackage.it3
        public void onCallback(int i) {
            ft3.this.B();
            if (i != 0) {
                ft3.this.O(-7);
                ft3.this.U();
            }
        }
    }

    public class g implements it3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f18188a;

        public g(List list) {
            this.f18188a = list;
        }

        @Override // defpackage.it3
        public void onCallback(int i) {
            ft3.this.B();
            this.f18188a.remove(0);
            ft3.this.W(this.f18188a);
        }
    }

    public class h implements it3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ short f18190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ it3 f18191b;

        public h(short s, it3 it3Var) {
            this.f18190a = s;
            this.f18191b = it3Var;
        }

        @Override // defpackage.it3
        @SuppressLint({"DefaultLocale"})
        public void onCallback(int i) {
            ft3.this.B();
            if (i != 0) {
                mr2.e("Channel", String.format("packet %d write failed", Short.valueOf(this.f18190a)));
            }
            it3 it3Var = this.f18191b;
            if (it3Var != null) {
                it3Var.onCallback(i);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ it3 f18192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f18193b;

        public i(it3 it3Var, int i) {
            this.f18192a = it3Var;
            this.f18193b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18192a.onCallback(this.f18193b);
        }
    }

    public class j implements it3 {
        public j() {
        }

        @Override // defpackage.it3
        public void onCallback(int i) {
            ft3.this.B();
            if (i == 0) {
                ft3.this.c0();
            } else {
                ft3.this.U();
            }
        }
    }

    public class k implements it3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f18195a;

        public k(byte[] bArr) {
            this.f18195a = bArr;
        }

        @Override // defpackage.it3
        public void onCallback(int i) {
            ft3.this.B();
            ft3.this.U();
            if (i == 0) {
                ft3.this.C(this.f18195a);
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f18197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ it3 f18198b;

        public l(byte[] bArr, it3 it3Var) {
            this.f18197a = bArr;
            this.f18198b = it3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ft3 ft3Var = ft3.this;
            ft3Var.a(this.f18197a, ft3Var.new q(this.f18198b));
        }
    }

    public class m extends qfp.a {
        public m(String str) {
            super(str);
        }

        @Override // qfp.a
        public void onTimerCallback() throws TimeoutException {
            throw new TimeoutException();
        }

        @Override // qfp.a
        public void resetCallback() {
            ft3.this.f18174a.c();
        }
    }

    public class n implements bqc {

        public class a implements it3 {
            public a() {
            }

            @Override // defpackage.it3
            public void onCallback(int i) {
                ft3.this.B();
                if (i == 0) {
                    ft3.this.c0();
                } else {
                    ft3.this.U();
                }
            }
        }

        public n() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            w83 w83Var = (w83) objArr[0];
            ft3.this.i = w83Var.h();
            ft3.this.g = w83Var.g();
            ft3.this.Y(ChannelState.READY);
            ft3.this.S(new defpackage.q((byte) 1), new a());
            ft3.this.Y(ChannelState.READING);
        }
    }

    public class o implements bqc {

        public class a extends qfp.a {
            public a(String str) {
                super(str);
            }

            @Override // qfp.a
            public void onTimerCallback() {
                ft3.this.b0();
            }

            @Override // qfp.a
            public void resetCallback() {
                ft3.this.f18174a.c();
            }
        }

        public o() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            nm5 nm5Var = (nm5) objArr[0];
            if (!ft3.this.L(nm5Var)) {
                mr2.e("Channel", "data packet repeated!!");
            } else if (nm5Var.i() != ft3.this.i) {
                ft3.this.e0(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION, new a("WaitData"));
            } else {
                ft3.this.f0();
                ft3.this.b0();
            }
        }
    }

    public class p implements bqc {

        public class a implements it3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ byte[] f18205a;

            public a(byte[] bArr) {
                this.f18205a = bArr;
            }

            @Override // defpackage.it3
            public void onCallback(int i) {
                ft3.this.B();
                ft3.this.U();
                if (i == 0) {
                    ft3.this.C(this.f18205a);
                }
            }
        }

        public p() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            bem bemVar = (bem) objArr[0];
            ft3.this.g = bemVar.h();
            byte[] bArrH = ft3.this.H(bemVar.g());
            ft3.this.Y(ChannelState.READY);
            ft3.this.S(new zdm((byte) 0), new a(bArrH));
        }
    }

    public class q implements it3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final it3 f18207a;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f18209a;

            public a(int i) {
                this.f18209a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                q.this.f18207a.onCallback(this.f18209a);
            }
        }

        public q(it3 it3Var) {
            this.f18207a = it3Var;
        }

        @Override // defpackage.it3
        public void onCallback(int i) {
            if (ft3.this.J()) {
                ft3.this.f0();
            }
            if (this.f18207a != null) {
                ft3.this.c.post(new a(i));
            }
        }
    }

    public class r implements bqc {
        public r() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            ft3.this.Y(ChannelState.WAIT_ACK);
            ft3.this.c0();
        }
    }

    public class s implements bqc {
        public s() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            defpackage.q qVar = (defpackage.q) objArr[0];
            byte bH = qVar.h();
            if (bH == 0) {
                ft3.this.O(0);
                ft3.this.U();
                return;
            }
            if (bH != 1) {
                if (bH != 5) {
                    ft3.this.O(-5);
                    ft3.this.U();
                    return;
                } else {
                    ft3.this.f0();
                    ft3.this.W(qVar.g());
                    return;
                }
            }
            ft3.this.f0();
            ft3.this.Y(ChannelState.WRITING);
            ArrayList arrayList = new ArrayList();
            for (short s = 1; s <= ft3.this.i; s = (short) (s + 1)) {
                arrayList.add(Short.valueOf(s));
            }
            ft3.this.W(arrayList);
        }
    }

    public class t implements bqc {
        public t() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            nm5 nm5Var = (nm5) objArr[0];
            short sI = nm5Var.i();
            Short shValueOf = Short.valueOf(sI);
            if (!ft3.this.l.contains(shValueOf)) {
                mr2.b("Channel", "sync packet not matched!!");
                ft3.this.c0();
                return;
            }
            if (!ft3.this.L(nm5Var)) {
                mr2.e("Channel", "sync packet repeated!!");
                ft3.this.c0();
                return;
            }
            ft3.this.l.remove(shValueOf);
            if (!ft3.this.l.isEmpty()) {
                ft3.this.c0();
                return;
            }
            ft3.this.m = sI;
            ft3.this.f0();
            ft3.this.b0();
        }
    }

    public class u implements bqc {
        public u() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            ft3.this.Y(ChannelState.WAIT_SINGLE_ACK);
            ft3.this.c0();
        }
    }

    public class v implements bqc {
        public v() {
        }

        @Override // defpackage.bqc
        public void handleState(Object... objArr) {
            ft3.this.B();
            byte bG = ((zdm) objArr[0]).g();
            if (bG == 0) {
                ft3.this.O(0);
                ft3.this.U();
            } else if (bG != 2) {
                ft3.this.O(-6);
                ft3.this.U();
            } else {
                ft3.this.O(-3);
                ft3.this.U();
            }
        }
    }

    public class w extends qfp.a {
        public w(String str) {
            super(str);
        }

        @Override // qfp.a
        public void onTimerCallback() {
            ft3.this.B();
            ft3.this.O(-2);
            ft3.this.U();
        }

        @Override // qfp.a
        public void resetCallback() {
            ft3.this.f18174a.c();
        }
    }

    public class x implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f18217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f18218b;

        public x(byte b2, byte[] bArr) {
            this.f18217a = b2;
            this.f18218b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ft3.this.c(this.f18217a, this.f18218b);
        }
    }

    public ft3() {
        ChannelState channelState = ChannelState.IDLE;
        this.o = channelState;
        r rVar = new r();
        this.q = rVar;
        s sVar = new s();
        this.f18177r = sVar;
        n nVar = new n();
        this.s = nVar;
        o oVar = new o();
        this.t = oVar;
        t tVar = new t();
        this.u = tVar;
        u uVar = new u();
        this.v = uVar;
        v vVar = new v();
        this.w = vVar;
        p pVar = new p();
        this.x = pVar;
        this.y = new w(getClass().getSimpleName());
        ChannelState channelState2 = ChannelState.READY;
        nt3 nt3Var = new nt3(channelState2, ChannelEvent.SEND_CMD, rVar);
        ChannelState channelState3 = ChannelState.WAIT_ACK;
        ChannelEvent channelEvent = ChannelEvent.RECEIVE_ACK;
        nt3 nt3Var2 = new nt3(channelState3, channelEvent, sVar);
        nt3 nt3Var3 = new nt3(ChannelState.SYNC, channelEvent, sVar);
        nt3 nt3Var4 = new nt3(channelState, ChannelEvent.RECEIVE_CMD, nVar);
        ChannelState channelState4 = ChannelState.READING;
        ChannelEvent channelEvent2 = ChannelEvent.RECEIVE_DATA;
        this.z = new nt3[]{nt3Var, nt3Var2, nt3Var3, nt3Var4, new nt3(channelState4, channelEvent2, oVar), new nt3(ChannelState.SYNC_ACK, channelEvent2, tVar), new nt3(channelState2, ChannelEvent.SEND_SINGLE_CMD, uVar), new nt3(ChannelState.WAIT_SINGLE_ACK, ChannelEvent.RECEIVE_SINGLE_ACK, vVar), new nt3(channelState, ChannelEvent.RECEIVE_SINGLE_CMD, pVar)};
        Looper looperA = mt3.a();
        this.f18174a = new qfp(looperA);
        this.f18175b = new Handler(Looper.getMainLooper());
        this.c = new Handler(looperA);
    }

    public final void B() {
        if (Looper.myLooper() != this.c.getLooper()) {
            throw new RuntimeException();
        }
    }

    public final void C(byte[] bArr) {
        this.f18175b.post(new x(this.g, bArr));
    }

    public final short D() {
        return (short) ((((g0() ? this.n + 4 : this.n) - 1) / this.h) + 1);
    }

    public final int E() {
        return this.d - 7;
    }

    public final int F() {
        return this.d - 5;
    }

    public final int G() {
        if (this.f) {
            return (this.d - 7) / 2;
        }
        return 1;
    }

    public final byte[] H(byte[] bArr) {
        try {
            if (!g0()) {
                return bArr;
            }
            int length = bArr.length;
            int i2 = length - 4;
            byte[] bArr2 = {bArr[i2], bArr[length - 3], bArr[length - 2], bArr[length - 1]};
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr, 0, bArr3, 0, i2);
            if (ByteUtil.equals(bArr2, CRCUtil.CRC32(bArr3))) {
                return bArr3;
            }
            mr2.b("Channel", "check crc failed!!");
            return ByteUtil.EMPTY_BYTES;
        } catch (Exception e2) {
            e2.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("getTotalReceiveData: ");
            sb.append(e2.getMessage());
            return null;
        }
    }

    public final byte[] I() {
        B();
        if (this.f18176k.size() != this.i) {
            throw new IllegalStateException();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.n);
        for (int i2 = 1; i2 <= this.i; i2++) {
            ((nm5) this.f18176k.get(i2)).g(byteBufferAllocate);
        }
        return H(byteBufferAllocate.array());
    }

    public final boolean J() {
        return "exception".equals(this.f18174a.a());
    }

    public final boolean K() {
        return this.f18174a.b();
    }

    public final boolean L(nm5 nm5Var) {
        B();
        short sI = nm5Var.i();
        if (this.f18176k.get(sI) != null) {
            return false;
        }
        this.f18176k.put(sI, nm5Var);
        this.n += nm5Var.h();
        return true;
    }

    public final void M(ChannelEvent channelEvent, Object... objArr) {
        B();
        mr2.a("Channel", String.format("state=%s, event=%s", this.o, channelEvent));
        for (nt3 nt3Var : this.z) {
            if (nt3Var.f28346a == this.o && nt3Var.f28347b == channelEvent) {
                nt3Var.c.handleState(objArr);
                return;
            }
        }
        mr2.b("Channel", "STATE_MACHINE not handled!");
    }

    public final void N(byte[] bArr) {
        this.c.post(new c(bArr));
    }

    public final void O(int i2) {
        B();
        it3 it3Var = this.p;
        if (it3Var != null) {
            this.f18175b.post(new i(it3Var, i2));
        }
    }

    public final void P(byte[] bArr) {
        B();
        phh phhVarD = phh.d(bArr);
        String strC = phhVarD.c();
        strC.hashCode();
        switch (strC) {
            case "ack":
                M(ChannelEvent.RECEIVE_ACK, phhVarD);
                break;
            case "cmd":
                M(ChannelEvent.RECEIVE_CMD, phhVarD);
                break;
            case "data":
                M(ChannelEvent.RECEIVE_DATA, phhVarD);
                break;
            case "single_ack":
                M(ChannelEvent.RECEIVE_SINGLE_ACK, phhVarD);
                break;
            case "single_cmd":
                M(ChannelEvent.RECEIVE_SINGLE_CMD, phhVarD);
                break;
            default:
                mr2.b("Channel", "invalid packet!!");
                break;
        }
    }

    public final void Q(byte b2, byte[] bArr, it3 it3Var) {
        B();
        if (this.o != ChannelState.IDLE) {
            mr2.e("Channel", "send failed for current state is not IDLE: " + this.o);
            this.f18175b.post(new e(it3Var));
            return;
        }
        this.g = b2;
        this.o = ChannelState.READY;
        this.p = it3Var;
        if (g0()) {
            this.j = Arrays.copyOf(bArr, bArr.length + 4);
            System.arraycopy(CRCUtil.CRC32(bArr), 0, this.j, bArr.length, 4);
        } else {
            this.j = Arrays.copyOf(bArr, bArr.length);
        }
        this.n = this.j.length;
        V(b2);
    }

    public final void R(int i2, boolean z, boolean z2) {
        B();
        if (this.o != ChannelState.IDLE) {
            mr2.e("Channel", "set options when current state is not IDLE: " + this.o);
        }
        this.d = i2;
        this.e = z;
        this.f = z2;
    }

    public final void S(phh phhVar, it3 it3Var) {
        B();
        if (!K()) {
            a0();
        }
        this.f18175b.post(new l(phhVar.f(), it3Var));
    }

    public final void T() {
        this.c.post(new d());
    }

    public final void U() {
        B();
        f0();
        Y(ChannelState.IDLE);
        this.i = (short) 0;
        this.j = null;
        this.f18176k.clear();
        this.l.clear();
        this.m = (short) 0;
        this.n = 0;
        this.p = null;
    }

    @SuppressLint({"DefaultLocale"})
    public final void V(byte b2) {
        phh w83Var;
        boolean z;
        B();
        if (!this.e || this.n > E()) {
            this.h = F();
            short sD = D();
            this.i = sD;
            w83Var = new w83(b2, sD);
            mr2.a("Channel", String.format("cmd: totalBytes=%d, frameCount=%d", Integer.valueOf(this.n), Short.valueOf(this.i)));
            z = false;
        } else {
            z = true;
            this.i = (short) 1;
            w83Var = new bem(b2, this.j);
            mr2.a("Channel", String.format("singleCmd: totalBytes=%d", Integer.valueOf(this.n)));
        }
        S(w83Var, new f());
        M(z ? ChannelEvent.SEND_SINGLE_CMD : ChannelEvent.SEND_CMD, new Object[0]);
    }

    public final void W(List<Short> list) {
        B();
        if (list == null) {
            throw new IllegalArgumentException("sequences must not null");
        }
        if (!list.isEmpty()) {
            X(list.get(0).shortValue(), new g(list));
            return;
        }
        mr2.a("Channel", "all packets sent or sync!!");
        Y(ChannelState.SYNC);
        d0(30000L);
    }

    public final void X(short s2, it3 it3Var) {
        B();
        if (s2 < 1 || s2 > this.i) {
            mr2.e("Channel", "index overlap");
            return;
        }
        int i2 = this.h;
        S(new nm5(s2, this.j, (s2 - 1) * i2, Math.min(this.j.length, i2 * s2)), new h(s2, it3Var));
    }

    public final void Y(ChannelState channelState) {
        B();
        mr2.a("Channel", String.format("state=%s", channelState));
        this.o = channelState;
    }

    public final void Z(int i2, boolean z, boolean z2) {
        this.c.post(new a(i2, z, z2));
    }

    public final void a0() {
        e0(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION, new m("exception"));
    }

    @Override // defpackage.aqc
    public final void b(byte b2, byte[] bArr, it3 it3Var) {
        this.c.post(new b(b2, bArr, it3Var));
    }

    public final void b0() {
        B();
        this.l.clear();
        int iG = G();
        int i2 = 0;
        for (short s2 = (short) (this.m + 1); s2 <= this.i; s2 = (short) (s2 + 1)) {
            if (this.f18176k.get(s2) == null) {
                this.l.add(Short.valueOf(s2));
                i2++;
                if (i2 >= iG) {
                    break;
                }
            }
        }
        if (this.l.size() > 0) {
            S(new defpackage.q((byte) 5, this.l), new j());
            Y(ChannelState.SYNC_ACK);
            return;
        }
        byte[] bArrI = I();
        if (ByteUtil.isEmpty(bArrI)) {
            U();
        } else {
            S(new defpackage.q((byte) 0), new k(bArrI));
            Y(ChannelState.SYNC_ACK);
        }
    }

    public final void c0() {
        d0(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION);
    }

    public final void d0(long j2) {
        e0(j2, this.y);
    }

    public final void e0(long j2, qfp.a aVar) {
        this.f18174a.d(aVar, j2);
    }

    public final void f0() {
        this.f18174a.e();
    }

    public abstract boolean g0();
}
