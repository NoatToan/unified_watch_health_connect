package androidx.core.view;

import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fa.j.a, fa.j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6456a;

    public static /* synthetic */ void A(Object obj, String str) {
        throw new IllegalStateException((str + obj + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    public static /* synthetic */ void B(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static int a(int i14, int i15, int i16, int i17) {
        return ((i14 * i15) / i16) + i17;
    }

    public static androidx.fragment.app.a b(androidx.fragment.app.v vVar, androidx.fragment.app.v vVar2) {
        vVar.getClass();
        return new androidx.fragment.app.a(vVar2);
    }

    public static String d(int i14, int i15, String str) {
        return i14 + str + i15;
    }

    public static String e(int i14, int i15, String str, String str2, StringBuilder sb3) {
        sb3.append(i14);
        sb3.append(str);
        sb3.append(i15);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String f(int i14, String str) {
        return i14 + str;
    }

    public static String g(RecyclerView recyclerView, StringBuilder sb3) {
        sb3.append(recyclerView.exceptionLabel());
        return sb3.toString();
    }

    public static String h(Class cls, String str) {
        return str + cls;
    }

    public static String i(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static String j(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static StringBuilder k(int i14, String str, String str2, String str3, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(i14);
        sb3.append(str4);
        return sb3;
    }

    public static ArrayList l(List list) {
        list.getClass();
        return new ArrayList();
    }

    public static void m(int i14, int i15, String str, String str2, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(i14);
        sb3.append(str2);
        sb3.append(i15);
    }

    public static /* synthetic */ void n(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static void o(Class cls, StringBuilder sb3, String str) {
        sb3.append(cls.getName());
        sb3.append(str);
    }

    public static /* synthetic */ void p(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void q(Object obj, Object obj2, Object obj3, Throwable th3) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(obj2);
        sb3.append(obj3);
        throw new IllegalStateException(sb3.toString(), th3);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void u(String str, Object obj, Throwable th3) {
        throw new RuntimeException(str + obj, th3);
    }

    public static int v(int i14, int i15, int i16, int i17) {
        return ((i14 / i15) * i16) + i17;
    }

    public static /* synthetic */ void w(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void y(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void z(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    @Override // fa.j.b
    public void c(Object obj, androidx.media3.common.o oVar) {
        ((androidx.media3.common.z.d) obj).r8(new androidx.media3.common.z.c(oVar));
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj;
        switch (this.f6456a) {
            case 17:
                int i14 = androidx.media3.exoplayer.v.f9731j0;
                dVar.g1(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
                break;
            default:
                dVar.onRenderedFirstFrame();
                break;
        }
    }
}
