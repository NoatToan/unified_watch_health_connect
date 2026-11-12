package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fitness.banner.export.newbieguide.model.a;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.common.utils.UIUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FragmentActivity f16302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f16303b;
    public String c;
    public boolean d;
    public View e;
    public int f = 1;
    public List<a> g = new ArrayList();
    public int h;

    public e63(FragmentActivity fragmentActivity) {
        this.f16302a = fragmentActivity;
    }

    public e63 a(a aVar) {
        this.g.add(aVar);
        return this;
    }

    public e63 b(boolean z) {
        this.d = z;
        return this;
    }

    public final void c() {
        if (TextUtils.isEmpty(this.c)) {
            throw new IllegalArgumentException("the param 'label' is missing, please call setLabel()");
        }
        if (this.f16302a == null && this.f16303b != null) {
            throw new IllegalStateException("activity is null, please make sure that fragment is showing when call NewbieGuide");
        }
    }

    public e63 d(String str) {
        this.c = str;
        return this;
    }

    public e63 e(int i) {
        boolean zIsFoldDisplay = SystemProperties.INSTANCE.isFoldDisplay();
        boolean zIsTablet = UIUtils.INSTANCE.isTablet();
        if (zIsFoldDisplay || zIsTablet) {
            i = 0;
        }
        this.f = i;
        return this;
    }

    public e63 f(int i) {
        this.h = i;
        return this;
    }

    public com.fitness.banner.export.newbieguide.core.a g() {
        c();
        com.fitness.banner.export.newbieguide.core.a aVar = new com.fitness.banner.export.newbieguide.core.a(this);
        aVar.h();
        return aVar;
    }
}
