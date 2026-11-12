package ga;

import com.google.android.exoplayer2.C;
import fa.r;
import fa.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f76583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<r> f76584b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<a> f76585c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue<a> f76586d = new PriorityQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76587e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f76588f;

    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f76590b = C.TIME_UNSET;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f76589a = new ArrayList();

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.f76590b, aVar.f76590b);
        }
    }

    public interface b {
        void e(long j8, r rVar);
    }

    public g(b bVar) {
        this.f76583a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r0.f76590b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j8, r rVar) {
        int i14 = this.f76587e;
        if (i14 != 0) {
            PriorityQueue<a> priorityQueue = this.f76586d;
            if (i14 != -1 && priorityQueue.size() >= this.f76587e) {
                a aVarPeek = priorityQueue.peek();
                int i15 = z.f70071a;
            }
            ArrayDeque<r> arrayDeque = this.f76584b;
            r rVar2 = arrayDeque.isEmpty() ? new r() : arrayDeque.pop();
            rVar2.D(rVar.a());
            System.arraycopy(rVar.f70054a, rVar.f70055b, rVar2.f70054a, 0, rVar2.a());
            a aVar = this.f76588f;
            if (aVar != null && j8 == aVar.f76590b) {
                aVar.f76589a.add(rVar2);
                return;
            }
            ArrayDeque<a> arrayDeque2 = this.f76585c;
            a aVar2 = arrayDeque2.isEmpty() ? new a() : arrayDeque2.pop();
            ArrayList arrayList = aVar2.f76589a;
            fa.a.a(j8 != C.TIME_UNSET);
            fa.a.d(arrayList.isEmpty());
            aVar2.f76590b = j8;
            arrayList.add(rVar2);
            priorityQueue.add(aVar2);
            this.f76588f = aVar2;
            int i16 = this.f76587e;
            if (i16 != -1) {
                b(i16);
                return;
            }
            return;
        }
        this.f76583a.e(j8, rVar);
    }

    public final void b(int i14) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue<a> priorityQueue = this.f76586d;
            if (priorityQueue.size() <= i14) {
                return;
            }
            a aVarPoll = priorityQueue.poll();
            int i15 = z.f70071a;
            int i16 = 0;
            while (true) {
                arrayList = aVarPoll.f76589a;
                if (i16 >= arrayList.size()) {
                    break;
                }
                this.f76583a.e(aVarPoll.f76590b, (r) arrayList.get(i16));
                this.f76584b.push((r) arrayList.get(i16));
                i16++;
            }
            arrayList.clear();
            a aVar = this.f76588f;
            if (aVar != null && aVar.f76590b == aVarPoll.f76590b) {
                this.f76588f = null;
            }
            this.f76585c.push(aVarPoll);
        }
    }
}
