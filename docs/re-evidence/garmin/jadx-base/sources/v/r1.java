package v;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lv/r1;", "", "Landroidx/camera/camera2/internal/compat/h;", "characteristics", "<init>", "(Landroidx/camera/camera2/internal/compat/h;)V", "a", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f173999e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range<Integer> f174000f = new Range<>(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f174001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f174002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f174003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f174004d;

    public r1(androidx.camera.camera2.internal.compat.h hVar) {
        hVar.getClass();
        this.f174001a = hVar;
        final int i14 = 0;
        this.f174002b = o13.m.b(new e23.a(this) { // from class: v.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r1 f173993b;

            {
                this.f173993b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                r1 r1Var = this.f173993b;
                switch (i15) {
                    case 0:
                        int[] iArr = (int[]) r1Var.f174001a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z14 = false;
                        if (iArr != null) {
                            for (int i16 : iArr) {
                                if (i16 == 9) {
                                    z14 = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z14);
                    case 1:
                        r1.a aVar = r1.f173999e;
                        List list = (List) r1Var.f174004d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            c22.t.g();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = q0.c.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = q0.c.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = r1Var.f174001a.c().f5413a.f5417a.getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? p13.u.C(highSpeedVideoSizes) : p13.j0.f134944a;
                }
            }
        });
        final int i15 = 1;
        this.f174003c = o13.m.b(new e23.a(this) { // from class: v.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r1 f173993b;

            {
                this.f173993b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                r1 r1Var = this.f173993b;
                switch (i16) {
                    case 0:
                        int[] iArr = (int[]) r1Var.f174001a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z14 = false;
                        if (iArr != null) {
                            for (int i17 : iArr) {
                                if (i17 == 9) {
                                    z14 = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z14);
                    case 1:
                        r1.a aVar = r1.f173999e;
                        List list = (List) r1Var.f174004d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            c22.t.g();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = q0.c.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = q0.c.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = r1Var.f174001a.c().f5413a.f5417a.getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? p13.u.C(highSpeedVideoSizes) : p13.j0.f134944a;
                }
            }
        });
        final int i16 = 2;
        this.f174004d = o13.m.b(new e23.a(this) { // from class: v.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r1 f173993b;

            {
                this.f173993b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                r1 r1Var = this.f173993b;
                switch (i17) {
                    case 0:
                        int[] iArr = (int[]) r1Var.f174001a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z14 = false;
                        if (iArr != null) {
                            for (int i18 : iArr) {
                                if (i18 == 9) {
                                    z14 = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z14);
                    case 1:
                        r1.a aVar = r1.f173999e;
                        List list = (List) r1Var.f174004d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            c22.t.g();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = q0.c.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = q0.c.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = r1Var.f174001a.c().f5413a.f5417a.getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? p13.u.C(highSpeedVideoSizes) : p13.j0.f134944a;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListD1 = p13.h0.d1((Collection) p13.h0.b0(list));
        Iterator it = p13.h0.U(list, 1).iterator();
        while (it.hasNext()) {
            arrayListD1.retainAll((List) it.next());
        }
        return arrayListD1;
    }

    public final Range<Integer>[] b(List<Size> list) {
        int size = list.size();
        if (1 <= size && size < 3 && p13.h0.b1(p13.h0.f1(list)).size() == 1) {
            List<Range<Integer>> listC = c(list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (p005kotlin.jvm.internal.s.g(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List<Range<Integer>> c(Size size) {
        Object bVar;
        List<Range<Integer>> listB1;
        try {
            int i14 = o13.q.f128596b;
            bVar = this.f174001a.c().f5413a.f5417a.getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (bVar instanceof o13.q.b) {
            bVar = null;
        }
        Range[] rangeArr = (Range[]) bVar;
        return (rangeArr == null || (listB1 = p13.h0.b1(p13.u.C(rangeArr))) == null) ? p13.j0.f134944a : listB1;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv/r1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/util/Range;", "", "DEFAULT_FPS", "Landroid/util/Range;", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
