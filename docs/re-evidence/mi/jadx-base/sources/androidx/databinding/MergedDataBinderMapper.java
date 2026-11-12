package androidx.databinding;

import android.view.View;
import androidx.annotation.RestrictTo;
import defpackage.qk5;
import defpackage.rk5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MergedDataBinderMapper extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<Class<? extends qk5>> f2133a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<qk5> f2134b = new CopyOnWriteArrayList();
    public List<String> c = new CopyOnWriteArrayList();

    public void a(qk5 qk5Var) {
        if (this.f2133a.add((Class<? extends qk5>) qk5Var.getClass())) {
            this.f2134b.add(qk5Var);
            Iterator<qk5> it = qk5Var.collectDependencies().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    public final boolean b() {
        boolean z = false;
        for (String str : this.c) {
            try {
                Class<?> cls = Class.forName(str);
                if (qk5.class.isAssignableFrom(cls)) {
                    a((qk5) cls.newInstance());
                    this.c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(str);
            } catch (InstantiationException unused3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unable to add feature mapper for ");
                sb2.append(str);
            }
        }
        return z;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        Iterator<qk5> it = this.f2134b.iterator();
        while (it.hasNext()) {
            String strConvertBrIdToString = it.next().convertBrIdToString(i);
            if (strConvertBrIdToString != null) {
                return strConvertBrIdToString;
            }
        }
        if (b()) {
            return convertBrIdToString(i);
        }
        return null;
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        Iterator<qk5> it = this.f2134b.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = it.next().getDataBinder(rk5Var, view, i);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(rk5Var, view, i);
        }
        return null;
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Iterator<qk5> it = this.f2134b.iterator();
        while (it.hasNext()) {
            int layoutId = it.next().getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (b()) {
            return getLayoutId(str);
        }
        return 0;
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        Iterator<qk5> it = this.f2134b.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = it.next().getDataBinder(rk5Var, viewArr, i);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(rk5Var, viewArr, i);
        }
        return null;
    }
}
