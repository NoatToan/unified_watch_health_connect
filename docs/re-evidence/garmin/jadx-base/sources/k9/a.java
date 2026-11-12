package k9;

import android.os.IBinder;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f103406a;

    public a(b bVar) {
        this.f103406a = (b) Preconditions.checkNotNull(bVar);
    }

    @Override // k9.g
    public final b a() {
        return this.f103406a;
    }

    @Override // k9.g
    public void b(IBinder iBinder) {
    }

    @Override // k9.g
    public void c(Exception exc) {
    }

    @Override // k9.g
    public g d(e eVar) {
        return this;
    }
}
