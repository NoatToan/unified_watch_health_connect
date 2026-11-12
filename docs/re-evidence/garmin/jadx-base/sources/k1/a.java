package k1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lk1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "spanSlop", "minSpan", "Lk1/a$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;IILk1/a$b;)V", "c", "b", "a", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f102126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f102129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f102130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f102131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f102132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f102133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f102134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f102135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f102136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f102137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f102138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GestureDetector f102139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f102140q;

    public interface b {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k1/a$d", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            motionEvent.getClass();
            float x14 = motionEvent.getX();
            a aVar = a.this;
            aVar.f102136m = x14;
            aVar.f102137n = motionEvent.getY();
            aVar.f102138o = 1;
            return true;
        }
    }

    static {
        new C1959a(null);
    }

    @SuppressLint({"ExecutorRegistration"})
    public a(Context context, int i14, int i15, b bVar) {
        context.getClass();
        bVar.getClass();
        this.f102124a = i14;
        this.f102125b = i15;
        this.f102126c = bVar;
        this.f102129f = true;
        this.f102130g = true;
        this.f102139p = new GestureDetector(context, new d());
    }

    public final float a() {
        if (!b()) {
            float f14 = this.f102132i;
            if (f14 > 0.0f) {
                return this.f102131h / f14;
            }
            return 1.0f;
        }
        boolean z14 = this.f102140q;
        boolean z15 = (z14 && this.f102131h < this.f102132i) || (!z14 && this.f102131h > this.f102132i);
        float fAbs = Math.abs(1 - (this.f102131h / this.f102132i)) * 0.5f;
        if (this.f102132i <= this.f102124a) {
            return 1.0f;
        }
        return z15 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public final boolean b() {
        return this.f102138o != 0;
    }

    /* JADX INFO: renamed from: k1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lk1/a$a;", "", "<init>", "()V", "", "DEFAULT_MIN_SPAN", "I", "", "SCALE_FACTOR", "F", "ANCHORED_ZOOM_MODE_NONE", "ANCHORED_ZOOM_MODE_DOUBLE_TAP", "ANCHORED_ZOOM_MODE_STYLUS", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1959a {
        public /* synthetic */ C1959a(j jVar) {
            this();
        }

        private C1959a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lk1/a$c;", "", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "a", "c", "b", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: k1.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk1/a$c$a;", "Lk1/a$c;", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1960a extends c {
            public C1960a(long j8, int i14, int i15) {
                super(j8, i14, i15, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk1/a$c$b;", "Lk1/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends c {
            public b(long j8, int i14, int i15, float f14) {
                super(j8, i14, i15, null);
            }
        }

        /* JADX INFO: renamed from: k1.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk1/a$c$c;", "Lk1/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1961c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f102141a;

            public C1961c(long j8, int i14, int i15, float f14) {
                super(j8, i14, i15, null);
                this.f102141a = f14;
            }
        }

        public /* synthetic */ c(long j8, int i14, int i15, j jVar) {
            this(j8, i14, i15);
        }

        private c(long j8, int i14, int i15) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public a(Context context, b bVar) {
        this(context, 0, 0, bVar, 6, null);
        context.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public a(Context context, int i14, b bVar) {
        this(context, i14, 0, bVar, 4, null);
        context.getClass();
        bVar.getClass();
    }

    public /* synthetic */ a(Context context, int i14, int i15, b bVar, int i16, j jVar) {
        this(context, (i16 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i14, (i16 & 4) != 0 ? 0 : i15, bVar);
    }
}
