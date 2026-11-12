package qd;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import java.util.LinkedHashMap;
import nd.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import q53.q;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqd/a;", "", "Lnd/e;", "owner", "Lkotlin/Function0;", "", "onAttach", "<init>", "(Lnd/e;Le23/a;)V", "a", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f144453i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f144454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f144455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f144456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f144457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f144458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f144459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f144460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f144461h;

    static {
        new C2720a(null);
    }

    public a(e eVar, e23.a<Unit> aVar) {
        eVar.getClass();
        aVar.getClass();
        this.f144454a = eVar;
        this.f144455b = aVar;
        this.f144456c = new b();
        this.f144457d = new LinkedHashMap();
        this.f144461h = true;
    }

    public final void a() {
        e eVar = this.f144454a;
        if (eVar.getF158017a().getF7973d() != b0.b.INITIALIZED) {
            h.z("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f144458e) {
                h.z("SavedStateRegistry was already attached.");
                return;
            }
            this.f144455b.invoke();
            eVar.getF158017a().a(new a0(this, 9));
            this.f144458e = true;
        }
    }

    /* JADX INFO: renamed from: qd.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqd/a$a;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2720a {
        public /* synthetic */ C2720a(j jVar) {
            this();
        }

        private C2720a() {
        }
    }

    public /* synthetic */ a(e eVar, e23.a aVar, int i14, j jVar) {
        this(eVar, (i14 & 2) != 0 ? new q(16) : aVar);
    }
}
