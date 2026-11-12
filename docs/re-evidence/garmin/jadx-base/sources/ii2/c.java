package ii2;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import nh2.d;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lii2/c;", "Landroidx/lifecycle/x1$c;", "Lnh2/d;", "settingsDataModel", "<init>", "(Lnh2/d;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93795a;

    public c(d dVar) {
        dVar.getClass();
        this.f93795a = dVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        return new b(this.f93795a);
    }
}
