package com.huami.watch.companion.ble.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huami.watch.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

/* JADX INFO: loaded from: classes16.dex */
public class StateMachine {
    public static final boolean HANDLED = true;
    public static final boolean NOT_HANDLED = false;
    private static final String d = "StateMachine";
    private static final int e = -1;
    private static final int f = -2;
    private String a;
    private b b;
    private HandlerThread c;

    public static class LogRec {
        private long a;
        private int b;
        private String c;
        private State d;
        private State e;

        public LogRec(Message message, String str, State state, State state2) {
            update(message, str, state, state2);
        }

        public String getInfo() {
            return this.c;
        }

        public State getOriginalState() {
            return this.e;
        }

        public State getState() {
            return this.d;
        }

        public long getTime() {
            return this.a;
        }

        public long getWhat() {
            return this.b;
        }

        public String toString(StateMachine stateMachine) {
            StringBuilder sb = new StringBuilder();
            sb.append("time=");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.a);
            sb.append(String.format("%tm-%td %tH:%tM:%tS.%tL", calendar, calendar, calendar, calendar, calendar, calendar));
            sb.append(" state=");
            State state = this.d;
            sb.append(state == null ? "<null>" : state.getName());
            sb.append(" orgState=");
            State state2 = this.e;
            sb.append(state2 != null ? state2.getName() : "<null>");
            sb.append(" what=");
            String whatToString = stateMachine.getWhatToString(this.b);
            if (TextUtils.isEmpty(whatToString)) {
                sb.append(this.b);
                sb.append("(0x");
                sb.append(Integer.toHexString(this.b));
                sb.append(")");
            } else {
                sb.append(whatToString);
            }
            if (!TextUtils.isEmpty(this.c)) {
                sb.append(" ");
                sb.append(this.c);
            }
            return sb.toString();
        }

        public void update(Message message, String str, State state, State state2) {
            this.a = System.currentTimeMillis();
            this.b = message != null ? message.what : 0;
            this.c = str;
            this.d = state;
            this.e = state2;
        }
    }

    public static class a {
        private static final int e = 20;
        private Vector<LogRec> a;
        private int b;
        private int c;
        private int d;

        private a() {
            this.a = new Vector<>();
            this.b = 20;
            this.c = 0;
            this.d = 0;
        }

        public synchronized void a(Message message, String str, State state, State state2) {
            this.d++;
            if (this.a.size() < this.b) {
                this.a.add(new LogRec(message, str, state, state2));
            } else {
                LogRec logRec = this.a.get(this.c);
                int i = this.c + 1;
                this.c = i;
                if (i >= this.b) {
                    this.c = 0;
                }
                logRec.update(message, str, state, state2);
            }
        }

        public synchronized void b() {
            this.a.clear();
        }

        public synchronized int c() {
            return this.d;
        }

        public synchronized LogRec d(int i) {
            int i2 = this.c + i;
            int i3 = this.b;
            if (i2 >= i3) {
                i2 -= i3;
            }
            if (i2 >= f()) {
                return null;
            }
            return this.a.get(i2);
        }

        public synchronized void e(int i) {
            this.b = i;
            this.d = 0;
            this.a.clear();
        }

        public synchronized int f() {
            return this.a.size();
        }
    }

    public static class b extends Handler {
        private static final Object p = new Object();
        private boolean a;
        private Message b;
        private a c;
        private boolean d;
        private c[] e;
        private int f;
        private c[] g;
        private int h;
        private a i;
        private C0651b j;
        private StateMachine k;
        private HashMap<State, c> l;
        private State m;
        private State n;
        private ArrayList<Message> o;

        public class a extends State {
            private a() {
            }

            @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
            public boolean processMessage(Message message) {
                b.this.k.haltedProcessMessage(message);
                return true;
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.companion.ble.utils.StateMachine$b$b, reason: collision with other inner class name */
        public class C0651b extends State {
            private C0651b() {
            }

            @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
            public boolean processMessage(Message message) {
                return false;
            }
        }

        public class c {
            public State a;
            public c b;
            public boolean c;

            private c() {
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("state=");
                sb.append(this.a.getName());
                sb.append(",active=");
                sb.append(this.c);
                sb.append(",parent=");
                c cVar = this.b;
                sb.append(cVar == null ? "null" : cVar.a.getName());
                return sb.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private b(Looper looper, StateMachine stateMachine) {
            super(looper);
            this.a = false;
            this.c = new a();
            this.f = -1;
            this.i = new a();
            this.j = new C0651b();
            this.l = new HashMap<>();
            this.o = new ArrayList<>();
            this.k = stateMachine;
            p(this.i, null);
            p(this.j, null);
        }

        private final int A() {
            int i = this.f + 1;
            int i2 = i;
            for (int i3 = this.h - 1; i3 >= 0; i3--) {
                if (this.a) {
                    Log.d(StateMachine.d, "moveTempStackToStateStack: i=" + i3 + ",j=" + i2, new Object[0]);
                }
                this.e[i2] = this.g[i3];
                i2++;
            }
            this.f = i2 - 1;
            if (this.a) {
                Log.d(StateMachine.d, "moveTempStackToStateStack: X mStateStackTop=" + this.f + ",startingIndex=" + i + ",Top=" + this.e[this.f].a.getName(), new Object[0]);
            }
            return i;
        }

        private void B() {
            State state = null;
            while (this.n != null) {
                if (this.a) {
                    Log.d(StateMachine.d, "handleMessage: new destination call exit", new Object[0]);
                }
                state = this.n;
                this.n = null;
                w(I(state));
                v(A());
                z();
            }
            if (state != null) {
                if (state == this.j) {
                    this.k.onQuitting();
                    q();
                } else if (state == this.i) {
                    this.k.onHalting();
                }
            }
        }

        private final void C(Message message) {
            c cVar = this.e[this.f];
            if (this.a) {
                Log.d(StateMachine.d, "processMsg: " + cVar.a.getName(), new Object[0]);
            }
            if (y(message)) {
                J(this.j);
                return;
            }
            while (!cVar.a.processMessage(message)) {
                cVar = cVar.b;
                if (cVar == null) {
                    this.k.unhandledMessage(message);
                    break;
                } else if (this.a) {
                    Log.d(StateMachine.d, "processMsg: " + cVar.a.getName(), new Object[0]);
                }
            }
            if (this.k.recordLogRec(message)) {
                if (cVar == null) {
                    this.c.a(message, this.k.getLogRecString(message), null, null);
                } else {
                    this.c.a(message, this.k.getLogRecString(message), cVar.a, this.e[this.f].a);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D() {
            if (this.a) {
                Log.d(StateMachine.d, "quit:", new Object[0]);
            }
            sendMessage(obtainMessage(-1, p));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E() {
            if (this.a) {
                Log.d(StateMachine.d, "abort:", new Object[0]);
            }
            sendMessageAtFrontOfQueue(obtainMessage(-1, p));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(boolean z) {
            this.a = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(State state) {
            if (this.a) {
                Log.d(StateMachine.d, "setInitialState: initialState=" + state.getName(), new Object[0]);
            }
            this.m = state;
        }

        private final void H() {
            if (this.a) {
                Log.d(StateMachine.d, "setupInitialStateStack: E mInitialState=" + this.m.getName(), new Object[0]);
            }
            c cVar = this.l.get(this.m);
            this.h = 0;
            while (cVar != null) {
                c[] cVarArr = this.g;
                int i = this.h;
                cVarArr[i] = cVar;
                cVar = cVar.b;
                this.h = i + 1;
            }
            this.f = -1;
            A();
        }

        private final c I(State state) {
            this.h = 0;
            c cVar = this.l.get(state);
            do {
                c[] cVarArr = this.g;
                int i = this.h;
                this.h = i + 1;
                cVarArr[i] = cVar;
                cVar = cVar.b;
                if (cVar == null) {
                    break;
                }
            } while (!cVar.c);
            if (this.a) {
                Log.d(StateMachine.d, "setupTempStateStackWithStatesToEnter: X mTempStateStackCount=" + this.h + ",curStateInfo: " + cVar, new Object[0]);
            }
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(IState iState) {
            this.n = (State) iState;
            if (this.a) {
                Log.d(StateMachine.d, "transitionTo: destState=" + this.n.getName(), new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c p(State state, State state2) {
            c cVarP;
            if (this.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("addStateInternal: E state=");
                sb.append(state.getName());
                sb.append(",parent=");
                sb.append(state2 == null ? "" : state2.getName());
                Log.d(StateMachine.d, sb.toString(), new Object[0]);
            }
            if (state2 != null) {
                cVarP = this.l.get(state2);
                if (cVarP == null) {
                    cVarP = p(state2, null);
                }
            } else {
                cVarP = null;
            }
            c cVar = this.l.get(state);
            if (cVar == null) {
                cVar = new c();
                this.l.put(state, cVar);
            }
            c cVar2 = cVar.b;
            if (cVar2 != null && cVar2 != cVarP) {
                throw new RuntimeException("state already added");
            }
            cVar.a = state;
            cVar.b = cVarP;
            cVar.c = false;
            if (this.a) {
                Log.d(StateMachine.d, "addStateInternal: X stateInfo: " + cVar, new Object[0]);
            }
            return cVar;
        }

        private final void q() {
            if (this.k.c != null) {
                getLooper().quit();
                this.k.c = null;
            }
            this.k.b = null;
            this.k = null;
            this.b = null;
            this.c.b();
            this.e = null;
            this.g = null;
            this.l.clear();
            this.m = null;
            this.n = null;
            this.o.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r() {
            if (this.a) {
                Log.d(StateMachine.d, "completeConstruction: E", new Object[0]);
            }
            int i = 0;
            for (c cVar : this.l.values()) {
                int i2 = 0;
                while (cVar != null) {
                    cVar = cVar.b;
                    i2++;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            if (this.a) {
                Log.d(StateMachine.d, "completeConstruction: maxDepth=" + i, new Object[0]);
            }
            this.e = new c[i];
            this.g = new c[i];
            H();
            sendMessageAtFrontOfQueue(obtainMessage(-2, p));
            if (this.a) {
                Log.d(StateMachine.d, "completeConstruction: X", new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s(Message message) {
            if (this.a) {
                Log.d(StateMachine.d, "deferMessage: msg=" + message.what, new Object[0]);
            }
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.copyFrom(message);
            this.o.add(messageObtainMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Message t() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IState u() {
            return this.e[this.f].a;
        }

        private final void v(int i) {
            while (i <= this.f) {
                if (this.a) {
                    Log.d(StateMachine.d, "invokeEnterMethods: " + this.e[i].a.getName(), new Object[0]);
                }
                this.e[i].a.enter();
                this.e[i].c = true;
                i++;
            }
        }

        private final void w(c cVar) {
            while (true) {
                int i = this.f;
                if (i < 0) {
                    return;
                }
                c[] cVarArr = this.e;
                if (cVarArr[i] == cVar) {
                    return;
                }
                State state = cVarArr[i].a;
                if (this.a) {
                    Log.d(StateMachine.d, "invokeExitMethods: " + state.getName(), new Object[0]);
                }
                state.exit();
                c[] cVarArr2 = this.e;
                int i2 = this.f;
                cVarArr2[i2].c = false;
                this.f = i2 - 1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean x() {
            return this.a;
        }

        private final boolean y(Message message) {
            return message.what == -1 && message.obj == p;
        }

        private final void z() {
            for (int size = this.o.size() - 1; size >= 0; size--) {
                Message message = this.o.get(size);
                if (this.a) {
                    Log.d(StateMachine.d, "moveDeferredMessageAtFrontOfQueue; what=" + message.what, new Object[0]);
                }
                sendMessageAtFrontOfQueue(message);
            }
            this.o.clear();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.a) {
                Log.d(StateMachine.d, "handleMessage: E msg.what=" + message.what, new Object[0]);
            }
            this.b = message;
            boolean z = this.d;
            if (z) {
                C(message);
            } else {
                if (z || message.what != -2 || message.obj != p) {
                    throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
                }
                this.d = true;
                v(0);
            }
            B();
            if (this.a) {
                Log.d(StateMachine.d, "handleMessage: X", new Object[0]);
            }
        }
    }

    public StateMachine(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        handlerThread.start();
        d(str, this.c.getLooper());
    }

    private void d(String str, Looper looper) {
        this.a = str;
        this.b = new b(looper, this);
    }

    public void addLogRec(String str) {
        this.b.c.a(null, str, null, null);
    }

    public final void addState(State state, State state2) {
        this.b.p(state, state2);
    }

    public final void deferMessage(Message message) {
        this.b.s(message);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println(getName() + ":");
        printWriter.println(" total records=" + getLogRecCount());
        for (int i = 0; i < getLogRecSize(); i++) {
            printWriter.printf(" rec[%d]: %s\n", Integer.valueOf(i), getLogRec(i).toString(this));
            printWriter.flush();
        }
        printWriter.println("curState=" + getCurrentState().getName());
    }

    public final Message getCurrentMessage() {
        return this.b.t();
    }

    public final IState getCurrentState() {
        return this.b.u();
    }

    public final Handler getHandler() {
        return this.b;
    }

    public final LogRec getLogRec(int i) {
        return this.b.c.d(i);
    }

    public final int getLogRecCount() {
        return this.b.c.c();
    }

    public final int getLogRecSize() {
        return this.b.c.f();
    }

    public String getLogRecString(Message message) {
        return "";
    }

    public final String getName() {
        return this.a;
    }

    public String getWhatToString(int i) {
        return null;
    }

    public void haltedProcessMessage(Message message) {
    }

    public boolean isDbg() {
        b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return bVar.x();
    }

    public final Message obtainMessage() {
        b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return Message.obtain(bVar);
    }

    public void onHalting() {
    }

    public void onQuitting() {
    }

    public final void quit() {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.D();
    }

    public final void quitNow() {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.E();
    }

    public boolean recordLogRec(Message message) {
        return true;
    }

    public final void removeMessages(int i) {
        this.b.removeMessages(i);
    }

    public final void sendMessage(int i) {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.sendMessage(obtainMessage(i));
    }

    public final void sendMessageAtFrontOfQueue(int i, Object obj) {
        this.b.sendMessageAtFrontOfQueue(obtainMessage(i, obj));
    }

    public final void sendMessageDelayed(int i, long j) {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.sendMessageDelayed(obtainMessage(i), j);
    }

    public void setDbg(boolean z) {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.F(z);
    }

    public final void setInitialState(State state) {
        this.b.G(state);
    }

    public final void setLogRecSize(int i) {
        this.b.c.e(i);
    }

    public void start() {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.r();
    }

    public final void transitionTo(IState iState) {
        this.b.J(iState);
    }

    public final void transitionToHaltingState() {
        b bVar = this.b;
        bVar.J(bVar.i);
    }

    public void unhandledMessage(Message message) {
        if (this.b.a) {
            Log.e(d, this.a + " - unhandledMessage: msg.what=" + message.what, new Object[0]);
        }
    }

    public void addLogRec(String str, State state) {
        this.b.c.a(null, str, state, null);
    }

    public final void addState(State state) {
        this.b.p(state, null);
    }

    public final void sendMessageAtFrontOfQueue(int i) {
        this.b.sendMessageAtFrontOfQueue(obtainMessage(i));
    }

    public final Message obtainMessage(int i) {
        b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return Message.obtain(bVar, i);
    }

    public final void sendMessage(int i, Object obj) {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.sendMessage(obtainMessage(i, obj));
    }

    public final void sendMessageAtFrontOfQueue(Message message) {
        this.b.sendMessageAtFrontOfQueue(message);
    }

    public final void sendMessageDelayed(int i, Object obj, long j) {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.sendMessageDelayed(obtainMessage(i, obj), j);
    }

    public final Message obtainMessage(int i, Object obj) {
        b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return Message.obtain(bVar, i, obj);
    }

    public final void sendMessage(Message message) {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.sendMessage(message);
    }

    public final void sendMessageDelayed(Message message, long j) {
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.sendMessageDelayed(message, j);
    }

    public StateMachine(String str, Looper looper) {
        d(str, looper);
    }

    public final Message obtainMessage(int i, int i2, int i3) {
        b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return Message.obtain(bVar, i, i2, i3);
    }

    public final Message obtainMessage(int i, int i2, int i3, Object obj) {
        b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return Message.obtain(bVar, i, i2, i3, obj);
    }
}
