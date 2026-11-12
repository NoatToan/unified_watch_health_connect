package re;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.i;
import me.k;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lre/e;", "", "Lme/k;", "verificationMode", "<init>", "(Lme/k;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f152085b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f152086c = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f152087a;

    public /* synthetic */ e(k kVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? k.QUIET : kVar);
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (s.g(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return s.g(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (a((SidecarDisplayFeature) list.get(i14), (SidecarDisplayFeature) list2.get(i14))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oe.d dVarI = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (dVarI != null) {
                arrayListL.add(dVarI);
            }
        }
        return arrayListL;
    }

    public final l d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new l(j0.f134944a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        f152085b.getClass();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new l(c(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final oe.d i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        oe.d.b bVar;
        oe.c.C2494c c2494c;
        sidecarDisplayFeature.getClass();
        i.a aVar = i.f117969a;
        String str = f152086c;
        str.getClass();
        me.a aVar2 = me.a.f117949a;
        aVar.getClass();
        k kVar = this.f152087a;
        kVar.getClass();
        aVar2.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new me.j(sidecarDisplayFeature, str, kVar, aVar2).b(new re.a(), "Type must be either TYPE_FOLD or TYPE_HINGE").b(new b(), "Feature bounds must not be 0").b(new c(), "TYPE_FOLD must have 0 area").b(new d(), "Feature be pinned to either left or top").a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            oe.d.b.f131211b.getClass();
            bVar = oe.d.b.f131212c;
        } else {
            if (type != 2) {
                return null;
            }
            oe.d.b.f131211b.getClass();
            bVar = oe.d.b.f131213d;
        }
        f152085b.getClass();
        int iB = a.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            c2494c = oe.c.C2494c.f131205c;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            c2494c = oe.c.C2494c.f131204b;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new oe.d(new me.b(rect), bVar, c2494c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lre/e$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static int a(SidecarDeviceState sidecarDeviceState) {
            sidecarDeviceState.getClass();
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                objInvoke.getClass();
                return ((Integer) objInvoke).intValue();
            }
        }

        public static int b(SidecarDeviceState sidecarDeviceState) {
            sidecarDeviceState.getClass();
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            sidecarWindowLayoutInfo.getClass();
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? j0.f134944a : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return j0.f134944a;
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                objInvoke.getClass();
                return (List) objInvoke;
            }
            return j0.f134944a;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void d(SidecarDeviceState sidecarDeviceState, int i14) {
            try {
                try {
                    sidecarDeviceState.posture = i14;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i14));
                }
            } catch (IllegalAccessException unused2) {
                Unit unit = Unit.INSTANCE;
            } catch (NoSuchMethodException unused3) {
                Unit unit2 = Unit.INSTANCE;
            } catch (InvocationTargetException unused4) {
                Unit unit3 = Unit.INSTANCE;
            }
        }

        private a() {
        }
    }

    public e(k kVar) {
        kVar.getClass();
        this.f152087a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
