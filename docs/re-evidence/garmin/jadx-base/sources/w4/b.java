package w4;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lw4/b;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f181904b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f181905a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f181905a == ((b) obj).f181905a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f181905a);
    }

    public final String toString() {
        f181904b.getClass();
        d dVar = d.f181907a;
        dVar.getClass();
        int i14 = d.f181908b;
        int i15 = this.f181905a;
        if (i15 == i14) {
            return "Confirm";
        }
        dVar.getClass();
        if (i15 == d.f181909c) {
            return "ContextClick";
        }
        dVar.getClass();
        if (i15 == d.f181910d) {
            return "GestureEnd";
        }
        dVar.getClass();
        if (i15 == d.f181911e) {
            return "GestureThresholdActivate";
        }
        dVar.getClass();
        if (i15 == d.f181912f) {
            return "KeyboardTap";
        }
        a.a();
        if (i15 == 0) {
            return "LongPress";
        }
        dVar.getClass();
        if (i15 == d.f181913g) {
            return "Reject";
        }
        dVar.getClass();
        if (i15 == d.f181914h) {
            return "SegmentFrequentTick";
        }
        dVar.getClass();
        if (i15 == d.f181915i) {
            return "SegmentTick";
        }
        if (i15 == a.b()) {
            return "TextHandleMove";
        }
        dVar.getClass();
        if (i15 == d.f181917k) {
            return "ToggleOff";
        }
        dVar.getClass();
        if (i15 == d.f181918l) {
            return "ToggleOn";
        }
        return i15 == a.c() ? "VirtualKey" : "Invalid";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4/b$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a() {
            d.f181907a.getClass();
        }

        public static int b() {
            d.f181907a.getClass();
            return d.f181916j;
        }

        public static int c() {
            d.f181907a.getClass();
            return d.f181919m;
        }

        private a() {
        }
    }
}
