package f8;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.v;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.k0;
import p13.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lf8/a;", "", "<init>", "()V", "a", "b", "c", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69927a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f69928b = c.f69939c;

    /* JADX INFO: renamed from: f8.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf8/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EnumC1431a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    private a() {
    }

    public static c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f69928b;
    }

    public static void b(c cVar, Violation violation) {
        Fragment fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        Set<EnumC1431a> set = cVar.f69940a;
        set.contains(EnumC1431a.PENALTY_LOG);
        if (set.contains(EnumC1431a.PENALTY_DEATH)) {
            eh2.b bVar = new eh2.b(name, violation);
            if (!fragment.isAdded()) {
                bVar.run();
                throw null;
            }
            Handler handler = fragment.getParentFragmentManager().f7393x.f7359c;
            if (s.g(handler.getLooper(), Looper.myLooper())) {
                bVar.run();
                throw null;
            }
            handler.post(bVar);
        }
    }

    public static void c(Violation violation) {
        if (v.R(3)) {
            violation.getFragment().getClass();
        }
    }

    public static final void d(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        f69927a.getClass();
        c(fragmentReuseViolation);
        c cVarA = a(fragment);
        if (cVarA.f69940a.contains(EnumC1431a.DETECT_FRAGMENT_REUSE) && e(cVarA, fragment.getClass(), FragmentReuseViolation.class)) {
            b(cVarA, fragmentReuseViolation);
        }
    }

    public static boolean e(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f69941b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (s.g(cls2.getSuperclass(), Violation.class) || !h0.R(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lf8/a$c;", "", "", "Lf8/a$a;", "flags", "Lf8/a$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowedViolations", "<init>", "(Ljava/util/Set;Lf8/a$b;Ljava/util/Map;)V", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f69939c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<EnumC1431a> f69940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f69941b;

        static {
            new C1432a(null);
            l0 l0Var = l0.f134950a;
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            f69939c = new c(l0Var, null, k0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends EnumC1431a> set, b bVar, Map<String, ? extends Set<Class<? extends Violation>>> map) {
            set.getClass();
            map.getClass();
            this.f69940a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f69941b = linkedHashMap;
        }

        /* JADX INFO: renamed from: f8.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf8/a$c$a;", "", "<init>", "()V", "Lf8/a$c;", "LAX", "Lf8/a$c;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C1432a {
            public /* synthetic */ C1432a(j jVar) {
                this();
            }

            private C1432a() {
            }
        }
    }
}
