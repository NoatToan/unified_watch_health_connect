package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.apo;
import defpackage.cm8;
import defpackage.dc1;
import defpackage.ec1;
import defpackage.foa;
import defpackage.hnq;
import defpackage.jd8;
import defpackage.kc1;
import defpackage.ku0;
import defpackage.lfd;
import defpackage.n7g;
import defpackage.p7o;
import defpackage.pop;
import defpackage.q07;
import defpackage.qd8;
import defpackage.tdi;
import defpackage.uag;
import defpackage.ur5;
import defpackage.vv6;
import defpackage.ylo;
import defpackage.zxp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import miuix.animation.FolmeEase;

/* JADX INFO: loaded from: classes4.dex */
public class a implements qd8 {
    public final UIManagerModule.d e;
    public final UIManagerModule f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<dc1> f7216a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<kc1> f7217b = new SparseArray<>();
    public final SparseArray<dc1> c = new SparseArray<>();
    public final Map<String, List<EventAnimationDriver>> d = new HashMap();
    public int g = 0;
    public final List<dc1> h = new LinkedList();

    /* JADX INFO: renamed from: com.facebook.react.animated.a$a, reason: collision with other inner class name */
    public class RunnableC0155a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jd8 f7218a;

        public RunnableC0155a(jd8 jd8Var) {
            this.f7218a = jd8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.m(this.f7218a);
        }
    }

    public a(UIManagerModule uIManagerModule) {
        this.f = uIManagerModule;
        uIManagerModule.getEventDispatcher().addListener(this);
        this.e = uIManagerModule.getDirectEventNamesResolver();
    }

    @Override // defpackage.qd8
    public void a(jd8 jd8Var) {
        if (UiThreadUtil.isOnUiThread()) {
            m(jd8Var);
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC0155a(jd8Var));
        }
    }

    public void c(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        dc1 dc1Var = this.f7216a.get(i2);
        if (dc1Var == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
        if (!(dc1Var instanceof hnq)) {
            throw new JSApplicationIllegalArgumentException("Animated node connected to event should beof type " + hnq.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i3 = 0; i3 < array.size(); i3++) {
            arrayList.add(array.getString(i3));
        }
        EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (hnq) dc1Var);
        String str2 = i + str;
        if (this.d.containsKey(str2)) {
            this.d.get(str2).add(eventAnimationDriver);
            return;
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(eventAnimationDriver);
        this.d.put(str2, arrayList2);
    }

    public void d(int i, int i2) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        if (dc1Var instanceof tdi) {
            ((tdi) dc1Var).f(i2);
            this.c.put(i, dc1Var);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + tdi.class.getName());
        }
    }

    public void e(int i, int i2) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        dc1 dc1Var2 = this.f7216a.get(i2);
        if (dc1Var2 != null) {
            dc1Var.a(dc1Var2);
            this.c.put(i2, dc1Var2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
    }

    public void f(int i, ReadableMap readableMap) {
        dc1 popVar;
        if (this.f7216a.get(i) != null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " already exists");
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            popVar = new ylo(readableMap, this);
        } else if ("value".equals(string)) {
            popVar = new hnq(readableMap);
        } else if ("props".equals(string)) {
            popVar = new tdi(readableMap, this, this.f);
        } else if ("interpolation".equals(string)) {
            popVar = new lfd(readableMap);
        } else if ("addition".equals(string)) {
            popVar = new ku0(readableMap, this);
        } else if ("subtraction".equals(string)) {
            popVar = new apo(readableMap, this);
        } else if ("division".equals(string)) {
            popVar = new q07(readableMap, this);
        } else if ("multiplication".equals(string)) {
            popVar = new uag(readableMap, this);
        } else if ("modulus".equals(string)) {
            popVar = new n7g(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            popVar = new vv6(readableMap, this);
        } else if ("transform".equals(string)) {
            popVar = new zxp(readableMap, this);
        } else {
            if (!"tracking".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            popVar = new pop(readableMap, this);
        }
        popVar.d = i;
        this.f7216a.put(i, popVar);
        this.c.put(i, popVar);
    }

    public void g(int i, int i2) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        if (dc1Var instanceof tdi) {
            ((tdi) dc1Var).g(i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + tdi.class.getName());
    }

    public void h(int i, int i2) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        dc1 dc1Var2 = this.f7216a.get(i2);
        if (dc1Var2 != null) {
            dc1Var.d(dc1Var2);
            this.c.put(i2, dc1Var2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
    }

    public void i(int i) {
        this.f7216a.remove(i);
        this.c.remove(i);
    }

    public void j(int i) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var != null && (dc1Var instanceof hnq)) {
            ((hnq) dc1Var).f();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public void k(int i) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var != null && (dc1Var instanceof hnq)) {
            ((hnq) dc1Var).g();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public dc1 l(int i) {
        return this.f7216a.get(i);
    }

    public final void m(jd8 jd8Var) {
        if (this.d.isEmpty()) {
            return;
        }
        String strA = this.e.a(jd8Var.getEventName());
        List<EventAnimationDriver> list = this.d.get(jd8Var.getViewTag() + strA);
        if (list != null) {
            for (EventAnimationDriver eventAnimationDriver : list) {
                w(eventAnimationDriver.mValueNode);
                jd8Var.dispatch(eventAnimationDriver);
                this.h.add(eventAnimationDriver.mValueNode);
            }
            y(this.h);
            this.h.clear();
        }
    }

    public boolean n() {
        return this.f7217b.size() > 0 || this.c.size() > 0;
    }

    public void o(int i, String str, int i2) {
        String str2 = i + str;
        if (this.d.containsKey(str2)) {
            List<EventAnimationDriver> list = this.d.get(str2);
            if (list.size() == 1) {
                this.d.remove(i + str);
                return;
            }
            ListIterator<EventAnimationDriver> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.d == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    public void p(int i, int i2) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var == null) {
            return;
        }
        if (dc1Var instanceof tdi) {
            ((tdi) dc1Var).h();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + tdi.class.getName());
    }

    public void q(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.c.size(); i++) {
            this.h.add(this.c.valueAt(i));
        }
        this.c.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.f7217b.size(); i2++) {
            kc1 kc1VarValueAt = this.f7217b.valueAt(i2);
            kc1VarValueAt.b(j);
            this.h.add(kc1VarValueAt.f23703b);
            if (kc1VarValueAt.f23702a) {
                z = true;
            }
        }
        y(this.h);
        this.h.clear();
        if (z) {
            for (int size = this.f7217b.size() - 1; size >= 0; size--) {
                kc1 kc1VarValueAt2 = this.f7217b.valueAt(size);
                if (kc1VarValueAt2.f23702a) {
                    if (kc1VarValueAt2.c != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("finished", true);
                        kc1VarValueAt2.c.invoke(writableMapCreateMap);
                    }
                    this.f7217b.removeAt(size);
                }
            }
        }
    }

    public void r(int i, double d) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var != null && (dc1Var instanceof hnq)) {
            ((hnq) dc1Var).g = d;
            this.c.put(i, dc1Var);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
    }

    public void s(int i, double d) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var != null && (dc1Var instanceof hnq)) {
            w(dc1Var);
            ((hnq) dc1Var).f = d;
            this.c.put(i, dc1Var);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
    }

    public void t(int i, int i2, ReadableMap readableMap, Callback callback) {
        kc1 ur5Var;
        dc1 dc1Var = this.f7216a.get(i2);
        if (dc1Var == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
        if (!(dc1Var instanceof hnq)) {
            throw new JSApplicationIllegalArgumentException("Animated node should be of type " + hnq.class.getName());
        }
        kc1 kc1Var = this.f7217b.get(i);
        if (kc1Var != null) {
            kc1Var.a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if ("frames".equals(string)) {
            ur5Var = new foa(readableMap);
        } else if (FolmeEase.SPRING.equals(string)) {
            ur5Var = new p7o(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported animation type: " + string);
            }
            ur5Var = new ur5(readableMap);
        }
        ur5Var.d = i;
        ur5Var.c = callback;
        ur5Var.f23703b = (hnq) dc1Var;
        this.f7217b.put(i, ur5Var);
    }

    public void u(int i, ec1 ec1Var) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var != null && (dc1Var instanceof hnq)) {
            ((hnq) dc1Var).k(ec1Var);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public void v(int i) {
        for (int i2 = 0; i2 < this.f7217b.size(); i2++) {
            kc1 kc1VarValueAt = this.f7217b.valueAt(i2);
            if (kc1VarValueAt.d == i) {
                if (kc1VarValueAt.c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    kc1VarValueAt.c.invoke(writableMapCreateMap);
                }
                this.f7217b.removeAt(i2);
                return;
            }
        }
    }

    public final void w(dc1 dc1Var) {
        int i = 0;
        while (i < this.f7217b.size()) {
            kc1 kc1VarValueAt = this.f7217b.valueAt(i);
            if (dc1Var.equals(kc1VarValueAt.f23703b)) {
                if (kc1VarValueAt.c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    kc1VarValueAt.c.invoke(writableMapCreateMap);
                }
                this.f7217b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    public void x(int i) {
        dc1 dc1Var = this.f7216a.get(i);
        if (dc1Var != null && (dc1Var instanceof hnq)) {
            ((hnq) dc1Var).k(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public final void y(List<dc1> list) {
        int i = this.g;
        int i2 = i + 1;
        this.g = i2;
        if (i2 == 0) {
            this.g = i + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = 0;
        for (dc1 dc1Var : list) {
            int i4 = dc1Var.c;
            int i5 = this.g;
            if (i4 != i5) {
                dc1Var.c = i5;
                i3++;
                arrayDeque.add(dc1Var);
            }
        }
        while (!arrayDeque.isEmpty()) {
            dc1 dc1Var2 = (dc1) arrayDeque.poll();
            if (dc1Var2.f15359a != null) {
                for (int i6 = 0; i6 < dc1Var2.f15359a.size(); i6++) {
                    dc1 dc1Var3 = dc1Var2.f15359a.get(i6);
                    dc1Var3.f15360b++;
                    int i7 = dc1Var3.c;
                    int i8 = this.g;
                    if (i7 != i8) {
                        dc1Var3.c = i8;
                        i3++;
                        arrayDeque.add(dc1Var3);
                    }
                }
            }
        }
        int i9 = this.g;
        int i10 = i9 + 1;
        this.g = i10;
        if (i10 == 0) {
            this.g = i9 + 2;
        }
        int i11 = 0;
        for (dc1 dc1Var4 : list) {
            if (dc1Var4.f15360b == 0) {
                int i12 = dc1Var4.c;
                int i13 = this.g;
                if (i12 != i13) {
                    dc1Var4.c = i13;
                    i11++;
                    arrayDeque.add(dc1Var4);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            dc1 dc1Var5 = (dc1) arrayDeque.poll();
            dc1Var5.e();
            if (dc1Var5 instanceof tdi) {
                try {
                    ((tdi) dc1Var5).i();
                } catch (IllegalViewOperationException e) {
                    cm8.j("ReactNative", "Native animation workaround, frame lost as result of race condition", e);
                }
            }
            if (dc1Var5 instanceof hnq) {
                ((hnq) dc1Var5).j();
            }
            if (dc1Var5.f15359a != null) {
                for (int i14 = 0; i14 < dc1Var5.f15359a.size(); i14++) {
                    dc1 dc1Var6 = dc1Var5.f15359a.get(i14);
                    int i15 = dc1Var6.f15360b - 1;
                    dc1Var6.f15360b = i15;
                    int i16 = dc1Var6.c;
                    int i17 = this.g;
                    if (i16 != i17 && i15 == 0) {
                        dc1Var6.c = i17;
                        i11++;
                        arrayDeque.add(dc1Var6);
                    }
                }
            }
        }
        if (i3 == i11) {
            return;
        }
        throw new IllegalStateException("Looks like animated nodes graph has cycles, there are " + i3 + " but toposort visited only " + i11);
    }
}
