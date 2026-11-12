package b5;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb5/m;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f15838b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f15839c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15840d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.z<a> f15841e = new p1.z<>(0, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15842f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15843g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n4.c f15846j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f15838b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j8 = this.f15837a;
                this.f15837a = 1 + j8;
                sparseLongArray.put(pointerId, j8);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j14 = this.f15837a;
            this.f15837a = 1 + j14;
            sparseLongArray.put(pointerId2, j14);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f15839c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f15842f && source == this.f15843g) {
            return;
        }
        this.f15842f = toolType;
        this.f15843g = source;
        this.f15839c.clear();
        this.f15838b.clear();
    }

    public final c0 c(kotlin.m mVar, MotionEvent motionEvent) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f15839c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f15838b.clear();
            sparseBooleanArray.clear();
            this.f15844h = false;
            this.f15845i = false;
            this.f15846j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z14 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z15 = actionMasked == 8;
        if (z14) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.f15840d;
        arrayList.clear();
        boolean z16 = h4.i.f81565g;
        if (z16 && motionEvent.getActionMasked() == 0) {
            boolean z17 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z18 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z17 || z18) {
                this.f15844h = true;
            }
        }
        if (z16 && Build.VERSION.SDK_INT >= 34 && motionEvent.getClassification() == 3) {
            this.f15845i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f15846j = n4.c.a((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32));
            }
            arrayList.add(d(mVar, motionEvent, this.f15846j, 0, false));
        } else {
            this.f15845i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i14 = 0;
            while (i14 < pointerCount) {
                arrayList.add(d(mVar, motionEvent, null, i14, (z14 || i14 == actionIndex || (z15 && motionEvent.getButtonState() == 0)) ? false : true));
                i14++;
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f15844h = false;
            this.f15845i = false;
            this.f15846j = null;
        }
        e(motionEvent);
        return new c0(motionEvent.getEventTime(), arrayList, motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0218  */
    /* JADX WARN: Code duplicated, block: B:87:0x021c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0252  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cb A[EDGE_INSN: B:99:0x01cb->B:73:0x01cb BREAK  A[LOOP:0: B:52:0x012a->B:72:0x01c2], SYNTHETIC] */
    public final d0 d(kotlin.m mVar, MotionEvent motionEvent, n4.c cVar, int i14, boolean z14) {
        long jValueAt;
        char c14;
        long j8;
        long jF;
        long j14;
        long jFloatToRawIntBits;
        long jO;
        int toolType;
        int i15;
        int historySize;
        char c15;
        int i16;
        long jFloatToRawIntBits2;
        float fFloatValue;
        long jFloatToRawIntBits3;
        boolean z15;
        Float fValueOf;
        float historicalX;
        int i17;
        int pointerId = motionEvent.getPointerId(i14);
        SparseLongArray sparseLongArray = this.f15838b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j15 = this.f15837a;
            this.f15837a = 1 + j15;
            sparseLongArray.put(pointerId, j15);
            jValueAt = j15;
        }
        float pressure = motionEvent.getPressure(i14);
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(motionEvent.getY(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i14))) << 32);
        n4.c.a aVar = n4.c.f123541b;
        if (i14 != 0) {
            c14 = ' ';
            j8 = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                if (cVar != null) {
                    jFloatToRawIntBits = cVar.f123544a;
                } else {
                    n.f15855a.getClass();
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawX(i14))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i14))) & 4294967295L);
                }
                jF = jFloatToRawIntBits;
                jO = mVar.o(jF);
            } else {
                jF = mVar.f(jFloatToRawIntBits4);
                j14 = jFloatToRawIntBits4;
            }
            toolType = motionEvent.getToolType(i14);
            if (toolType != 0) {
                if (toolType != 1) {
                    if (toolType != 2) {
                        m0.f15849b.getClass();
                        i17 = m0.f15852e;
                    } else if (toolType != 3) {
                        m0.f15849b.getClass();
                        i17 = m0.f15851d;
                    } else if (toolType != 4) {
                        m0.f15849b.getClass();
                    } else {
                        m0.f15849b.getClass();
                        i17 = m0.f15853f;
                    }
                } else if (h4.i.f81565g) {
                    m0.f15849b.getClass();
                    i17 = m0.f15850c;
                } else if ((!motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.f15844h || this.f15845i)) {
                    m0.f15849b.getClass();
                    i17 = m0.f15851d;
                } else {
                    m0.f15849b.getClass();
                    i17 = m0.f15850c;
                }
                i15 = i17;
                ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                c15 = c14;
                i16 = 0;
                while (true) {
                    jFloatToRawIntBits2 = 0;
                    fFloatValue = 1.0f;
                    if (i16 < historySize) {
                        break;
                    }
                    historicalX = motionEvent.getHistoricalX(i14, i16);
                    float historicalY = motionEvent.getHistoricalY(i14, i16);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(historicalX)) << c15) | (((long) Float.floatToRawIntBits(historicalY)) & j8);
                        long historicalEventTime = motionEvent.getHistoricalEventTime(i16);
                        float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i14, i16);
                        fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                        float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                        if (Build.VERSION.SDK_INT < 29 || motionEvent.getClassification() != 3) {
                            n4.c.f123541b.getClass();
                        } else {
                            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i14, i16))) << c15) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i14, i16))) & j8);
                        }
                        arrayList.add(new e(historicalEventTime, jFloatToRawIntBits5, fFloatValue2, jFloatToRawIntBits2, jFloatToRawIntBits5, (p005kotlin.jvm.internal.j) null));
                    }
                    i16++;
                    historySize = historySize;
                }
                if (motionEvent.getActionMasked() == 8) {
                    jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c15) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j8);
                } else {
                    n4.c.f123541b.getClass();
                    jFloatToRawIntBits3 = 0;
                }
                z15 = h4.i.f81565g;
                if (z15 && Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 5) {
                    float axisValue = motionEvent.getAxisValue(52, i14);
                    fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                }
                float f14 = fFloatValue;
                if (z15 || Build.VERSION.SDK_INT < 29 || motionEvent.getClassification() != 3) {
                    n4.c.f123541b.getClass();
                } else {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i14))) << c15) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i14))) & j8);
                }
                return new d0(jValueAt, motionEvent.getEventTime(), jF, j14, z14, pressure, i15, this.f15839c.get(motionEvent.getPointerId(i14), false), arrayList, jFloatToRawIntBits3, f14, jFloatToRawIntBits2, jFloatToRawIntBits4, null);
            }
            m0.f15849b.getClass();
            i15 = 0;
            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            c15 = c14;
            i16 = 0;
            while (true) {
                jFloatToRawIntBits2 = 0;
                fFloatValue = 1.0f;
                if (i16 < historySize) {
                    break;
                    break;
                }
                historicalX = motionEvent.getHistoricalX(i14, i16);
                float historicalY2 = motionEvent.getHistoricalY(i14, i16);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                }
                i16++;
                historySize = historySize;
            }
            if (motionEvent.getActionMasked() == 8) {
                jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c15) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j8);
            } else {
                n4.c.f123541b.getClass();
                jFloatToRawIntBits3 = 0;
            }
            z15 = h4.i.f81565g;
            if (z15) {
                float axisValue2 = motionEvent.getAxisValue(52, i14);
                if (axisValue2 > 0.0f) {
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                }
            }
            float f15 = fFloatValue;
            if (z15) {
                n4.c.f123541b.getClass();
            } else {
                n4.c.f123541b.getClass();
            }
            return new d0(jValueAt, motionEvent.getEventTime(), jF, j14, z14, pressure, i15, this.f15839c.get(motionEvent.getPointerId(i14), false), arrayList2, jFloatToRawIntBits3, f15, jFloatToRawIntBits2, jFloatToRawIntBits4, null);
        }
        if (cVar != null) {
            jF = cVar.f123544a;
            c14 = ' ';
            j8 = 4294967295L;
        } else {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            long jFloatToRawIntBits6 = Float.floatToRawIntBits(rawX);
            int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
            c14 = ' ';
            j8 = 4294967295L;
            jF = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
        }
        jO = mVar.o(jF);
        j14 = jO;
        toolType = motionEvent.getToolType(i14);
        if (toolType != 0) {
            if (toolType != 1) {
                if (toolType != 2) {
                    m0.f15849b.getClass();
                    i17 = m0.f15852e;
                } else if (toolType != 3) {
                    m0.f15849b.getClass();
                    i17 = m0.f15851d;
                } else if (toolType != 4) {
                    m0.f15849b.getClass();
                } else {
                    m0.f15849b.getClass();
                    i17 = m0.f15853f;
                }
            } else if (h4.i.f81565g) {
                m0.f15849b.getClass();
                i17 = m0.f15850c;
            } else if (motionEvent.isFromSource(8194)) {
                m0.f15849b.getClass();
                i17 = m0.f15851d;
            } else {
                m0.f15849b.getClass();
                i17 = m0.f15851d;
            }
            i15 = i17;
            ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            c15 = c14;
            i16 = 0;
            while (true) {
                jFloatToRawIntBits2 = 0;
                fFloatValue = 1.0f;
                if (i16 < historySize) {
                    break;
                    break;
                }
                historicalX = motionEvent.getHistoricalX(i14, i16);
                float historicalY3 = motionEvent.getHistoricalY(i14, i16);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                }
                i16++;
                historySize = historySize;
            }
            if (motionEvent.getActionMasked() == 8) {
                jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c15) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j8);
            } else {
                n4.c.f123541b.getClass();
                jFloatToRawIntBits3 = 0;
            }
            z15 = h4.i.f81565g;
            if (z15) {
                float axisValue3 = motionEvent.getAxisValue(52, i14);
                if (axisValue3 > 0.0f) {
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                }
            }
            float f16 = fFloatValue;
            if (z15) {
                n4.c.f123541b.getClass();
            } else {
                n4.c.f123541b.getClass();
            }
            return new d0(jValueAt, motionEvent.getEventTime(), jF, j14, z14, pressure, i15, this.f15839c.get(motionEvent.getPointerId(i14), false), arrayList3, jFloatToRawIntBits3, f16, jFloatToRawIntBits2, jFloatToRawIntBits4, null);
        }
        m0.f15849b.getClass();
        i15 = 0;
        ArrayList arrayList4 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        c15 = c14;
        i16 = 0;
        while (true) {
            jFloatToRawIntBits2 = 0;
            fFloatValue = 1.0f;
            if (i16 < historySize) {
                break;
                break;
            }
            historicalX = motionEvent.getHistoricalX(i14, i16);
            float historicalY4 = motionEvent.getHistoricalY(i14, i16);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i16++;
            historySize = historySize;
        }
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c15) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j8);
        } else {
            n4.c.f123541b.getClass();
            jFloatToRawIntBits3 = 0;
        }
        z15 = h4.i.f81565g;
        if (z15) {
            float axisValue4 = motionEvent.getAxisValue(52, i14);
            if (axisValue4 > 0.0f) {
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        float f17 = fFloatValue;
        if (z15) {
            n4.c.f123541b.getClass();
        } else {
            n4.c.f123541b.getClass();
        }
        return new d0(jValueAt, motionEvent.getEventTime(), jF, j14, z14, pressure, i15, this.f15839c.get(motionEvent.getPointerId(i14), false), arrayList4, jFloatToRawIntBits3, f17, jFloatToRawIntBits2, jFloatToRawIntBits4, null);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f15839c;
        SparseLongArray sparseLongArray = this.f15838b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i14) == iKeyAt) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0083@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lb5/m$a;", "", "a", "packedValue", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0224a f15847b = new C0224a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15848a;

        private /* synthetic */ a(long j8) {
            this.f15848a = j8;
        }

        public static final /* synthetic */ a a(long j8) {
            return new a(j8);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f15848a == ((a) obj).f15848a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f15848a);
        }

        public final String toString() {
            return "IndirectPointerEventData(packedValue=" + this.f15848a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX INFO: renamed from: b5.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb5/m$a$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0224a {
            public /* synthetic */ C0224a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0224a() {
            }
        }
    }
}
