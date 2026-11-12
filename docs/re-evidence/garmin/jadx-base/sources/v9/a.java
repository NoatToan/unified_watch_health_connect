package v9;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import p005kotlin.Metadata;
import p3.j0;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv9/a;", "", "<init>", "()V", "lifecycle-viewmodel-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f176280a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f176281b = v.c(new v10.a(5));

    private a() {
    }

    public static ViewModelStoreOwner a(m mVar) {
        x1 x1Var = n.f135158a;
        ViewModelStoreOwner viewModelStoreOwnerS = (ViewModelStoreOwner) mVar.A(f176281b);
        if (viewModelStoreOwnerS == null) {
            mVar.C(1260197608);
            viewModelStoreOwnerS = zf.b.s((View) mVar.A(AndroidCompositionLocals_androidKt.f6046f));
        } else {
            mVar.C(1260196492);
        }
        mVar.f();
        return viewModelStoreOwnerS;
    }
}
