package defpackage;

import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.UIManagerModule;
import com.mi.health.course.export.data.CourseConfigModel;
import com.swmansion.reanimated.nodes.EventNode;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import miuix.animation.FolmeEase;

/* JADX INFO: loaded from: classes6.dex */
public class svg implements qd8 {
    public static final Double t = Double.valueOf(0.0d);
    public final com.facebook.react.uimanager.b c;
    public final DeviceEventManagerModule.RCTDeviceEventEmitter d;
    public final ReactChoreographer e;
    public final l4b f;
    public final UIManagerModule.d g;
    public final fwg i;
    public final ReactContext j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final UIManagerModule f34028k;
    public boolean n;
    public double o;
    public final tbq p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<pvg> f34026a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, EventNode> f34027b = new HashMap();
    public final AtomicBoolean h = new AtomicBoolean();
    public List<d> l = new ArrayList();
    public ConcurrentLinkedQueue<jd8> m = new ConcurrentLinkedQueue<>();
    public Set<String> q = Collections.emptySet();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Set<String> f34029r = Collections.emptySet();
    public Queue<c> s = new LinkedList();

    public class a extends l4b {
        public a(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // defpackage.l4b
        public void c(long j) {
            svg.this.s(j);
        }
    }

    public class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Queue f34030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, Queue queue) {
            super(reactContext);
            this.f34030a = queue;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            boolean zA = t7q.a(svg.this.c);
            while (!this.f34030a.isEmpty()) {
                c cVar = (c) this.f34030a.remove();
                oej oejVarResolveShadowNode = svg.this.c.resolveShadowNode(cVar.f34032a);
                if (oejVarResolveShadowNode != null) {
                    svg.this.f34028k.updateView(cVar.f34032a, oejVarResolveShadowNode.getViewClass(), cVar.f34033b);
                }
            }
            if (zA) {
                svg.this.c.dispatchViewUpdates(-1);
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WritableMap f34033b;

        public c(int i, WritableMap writableMap) {
            this.f34032a = i;
            this.f34033b = writableMap;
        }
    }

    public interface d {
        void a();
    }

    public svg(ReactContext reactContext) {
        this.j = reactContext;
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f34028k = uIManagerModule;
        this.p = new tbq();
        this.c = uIManagerModule.getUIImplementation();
        this.g = uIManagerModule.getDirectEventNamesResolver();
        this.d = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.e = ReactChoreographer.i();
        this.f = new a(reactContext);
        this.i = new fwg(this);
        uIManagerModule.getEventDispatcher().addListener(this);
    }

    private void r(jd8 jd8Var) {
        if (this.f34027b.isEmpty()) {
            return;
        }
        String strA = this.g.a(jd8Var.getEventName());
        EventNode eventNode = this.f34027b.get(jd8Var.getViewTag() + strA);
        if (eventNode != null) {
            jd8Var.dispatch(eventNode);
        }
    }

    public final void A() {
        if (this.h.getAndSet(false)) {
            this.e.o(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f);
        }
    }

    @Override // defpackage.qd8
    public void a(jd8 jd8Var) {
        if (UiThreadUtil.isOnUiThread()) {
            r(jd8Var);
        } else {
            this.m.offer(jd8Var);
            z();
        }
    }

    public void e(int i, String str, int i2) {
        String str2 = i + str;
        EventNode eventNode = (EventNode) this.f34026a.get(i2);
        if (eventNode != null) {
            if (this.f34027b.containsKey(str2)) {
                throw new JSApplicationIllegalArgumentException("Event handler already set for the given view and event type");
            }
            this.f34027b.put(str2, eventNode);
        } else {
            throw new JSApplicationIllegalArgumentException("Event node " + i2 + " does not exists");
        }
    }

    public void f(Set<String> set, Set<String> set2) {
        this.f34029r = set;
        this.q = set2;
    }

    public void g(int i, int i2) {
        pvg pvgVar = this.f34026a.get(i);
        if (pvgVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " does not exists");
        }
        if (pvgVar instanceof udi) {
            ((udi) pvgVar).c(i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + udi.class.getName());
    }

    public void h(int i, int i2) {
        pvg pvgVar = this.f34026a.get(i);
        pvg pvgVar2 = this.f34026a.get(i2);
        if (pvgVar2 != null) {
            pvgVar.addChild(pvgVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i2 + " does not exists");
    }

    public void i(int i, ReadableMap readableMap) {
        pvg oa3Var;
        if (this.f34026a.get(i) != null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " already exists");
        }
        String string = readableMap.getString("type");
        if ("props".equals(string)) {
            oa3Var = new udi(i, readableMap, this, this.c);
        } else if ("style".equals(string)) {
            oa3Var = new zlo(i, readableMap, this);
        } else if ("transform".equals(string)) {
            oa3Var = new gyp(i, readableMap, this);
        } else if ("value".equals(string)) {
            oa3Var = new qnq(i, readableMap, this);
        } else if ("block".equals(string)) {
            oa3Var = new tv2(i, readableMap, this);
        } else if ("cond".equals(string)) {
            oa3Var = new jb4(i, readableMap, this);
        } else if ("op".equals(string)) {
            oa3Var = new lbh(i, readableMap, this);
        } else if (CourseConfigModel.DevCmd.CMD_ACTION_SET.equals(string)) {
            oa3Var = new yyl(i, readableMap, this);
        } else if ("debug".equals(string)) {
            oa3Var = new lr5(i, readableMap, this);
        } else if (Feature.CLOCK.equals(string)) {
            oa3Var = new i14(i, readableMap, this);
        } else if ("clockStart".equals(string)) {
            oa3Var = new j14.a(i, readableMap, this);
        } else if ("clockStop".equals(string)) {
            oa3Var = new j14.b(i, readableMap, this);
        } else if ("clockTest".equals(string)) {
            oa3Var = new j14.c(i, readableMap, this);
        } else if ("call".equals(string)) {
            oa3Var = new jpd(i, readableMap, this);
        } else if (FolmeEase.BEZIER.equals(string)) {
            oa3Var = new ki2(i, readableMap, this);
        } else if ("event".equals(string)) {
            oa3Var = new EventNode(i, readableMap, this);
        } else if ("always".equals(string)) {
            oa3Var = new y61(i, readableMap, this);
        } else if ("concat".equals(string)) {
            oa3Var = new cb4(i, readableMap, this);
        } else if ("param".equals(string)) {
            oa3Var = new yjh(i, readableMap, this);
        } else if ("func".equals(string)) {
            oa3Var = new gua(i, readableMap, this);
        } else {
            if (!"callfunc".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            oa3Var = new oa3(i, readableMap, this);
        }
        this.f34026a.put(i, oa3Var);
    }

    public void j(int i, String str, int i2) {
        this.f34027b.remove(i + str);
    }

    public void k(int i, int i2) {
        pvg pvgVar = this.f34026a.get(i);
        if (pvgVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " does not exists");
        }
        if (pvgVar instanceof udi) {
            ((udi) pvgVar).d(i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + udi.class.getName());
    }

    public void l(int i, int i2) {
        pvg pvgVar = this.f34026a.get(i);
        pvg pvgVar2 = this.f34026a.get(i2);
        if (pvgVar2 != null) {
            pvgVar.removeChild(pvgVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i2 + " does not exists");
    }

    public void m(int i) {
        this.f34026a.remove(i);
    }

    public void n(int i, WritableMap writableMap) {
        this.s.add(new c(i, writableMap));
    }

    public <T extends pvg> T o(int i, Class<T> cls) {
        T t2 = (T) this.f34026a.get(i);
        if (t2 == null) {
            if (cls == pvg.class || cls == qnq.class) {
                return this.i;
            }
            throw new IllegalArgumentException("Requested node with id " + i + " of type " + cls + " cannot be found");
        }
        if (cls.isInstance(t2)) {
            return t2;
        }
        throw new IllegalArgumentException("Node with id " + i + " is of incompatible type " + t2.getClass() + ", requested type was " + cls);
    }

    public Object p(int i) {
        pvg pvgVar = this.f34026a.get(i);
        return pvgVar != null ? pvgVar.value() : t;
    }

    public void q(int i, Callback callback) {
        callback.invoke(this.f34026a.get(i).value());
    }

    public final void s(long j) {
        this.o = j / 1000000.0d;
        while (!this.m.isEmpty()) {
            r(this.m.poll());
        }
        if (!this.l.isEmpty()) {
            List<d> list = this.l;
            this.l = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).a();
            }
        }
        if (this.n) {
            pvg.runUpdates(this.p);
        }
        if (!this.s.isEmpty()) {
            Queue<c> queue = this.s;
            this.s = new LinkedList();
            ReactContext reactContext = this.j;
            reactContext.runOnNativeModulesQueueThread(new b(reactContext, queue));
        }
        this.h.set(false);
        this.n = false;
        if (this.l.isEmpty() && this.m.isEmpty()) {
            return;
        }
        z();
    }

    public void t() {
        if (this.h.get()) {
            A();
            this.h.set(true);
        }
    }

    public void u() {
        if (this.h.getAndSet(false)) {
            z();
        }
    }

    public void v(d dVar) {
        this.l.add(dVar);
        z();
    }

    public void w() {
        this.n = true;
        z();
    }

    public void x(String str, WritableMap writableMap) {
        this.d.emit(str, writableMap);
    }

    public void y(int i, Double d2) {
        pvg pvgVar = this.f34026a.get(i);
        if (pvgVar != null) {
            ((qnq) pvgVar).b(d2);
        }
    }

    public final void z() {
        if (this.h.getAndSet(true)) {
            return;
        }
        this.e.m(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f);
    }
}
