package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class oe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f29053b;
    public b c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        void a(boolean z);
    }

    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public oe0(Context context) {
        this.f29052a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void h() {
        this.c = null;
        this.f29053b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void i(a aVar) {
        this.f29053b = aVar;
    }

    public void j(b bVar) {
        if (this.c != null && bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
        }
        this.c = bVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k(boolean z) {
        a aVar = this.f29053b;
        if (aVar != null) {
            aVar.a(z);
        }
    }
}
