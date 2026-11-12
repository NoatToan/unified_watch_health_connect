package x9;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.m1;
import androidx.lifecycle.p1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import p005kotlin.Metadata;
import sc.i;
import t21.v0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx9/c;", "", "T", "Lsc/i;", "Landroidx/lifecycle/y1;", "viewModelStore", "Lkotlin/Function0;", "", "removeViewModelStoreOnPop", "<init>", "(Landroidx/lifecycle/y1;Le23/a;)V", "lifecycle-viewmodel-navigation3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c<T> extends i<T> {

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"x9/c$a", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lnd/e;", "Landroidx/lifecycle/y;", "lifecycle-viewmodel-navigation3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements ViewModelStoreOwner, nd.e, y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nd.e f189590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y1 f189591b;

        public a(nd.e eVar, y1 y1Var) {
            this.f189591b = y1Var;
            this.f189590a = eVar;
            if (eVar.getF158016a().getF7973d() == b0.b.INITIALIZED) {
                m1.b(this);
            } else {
                h.s("The Lifecycle state is already beyond INITIALIZED. The ViewModelStoreNavEntryDecorator requires adding the SavedStateNavEntryDecorator to ensure support for SavedStateHandles.");
                throw null;
            }
        }

        @Override // androidx.lifecycle.y
        public final CreationExtras getDefaultViewModelCreationExtras() {
            androidx.lifecycle.viewmodel.a aVar = new androidx.lifecycle.viewmodel.a(null, 1, null);
            aVar.b(m1.f7960a, this);
            aVar.b(m1.f7961b, this);
            return aVar;
        }

        @Override // androidx.lifecycle.y
        public final x1.c getDefaultViewModelProviderFactory() {
            return new p1();
        }

        @Override // androidx.lifecycle.n0
        /* JADX INFO: renamed from: getLifecycle */
        public final b0 getF158016a() {
            return this.f189590a.getF158016a();
        }

        @Override // nd.e
        public final nd.c getSavedStateRegistry() {
            return this.f189590a.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        /* JADX INFO: renamed from: getViewModelStore, reason: from getter */
        public final y1 getF189591b() {
            return this.f189591b;
        }
    }

    public c(y1 y1Var, e23.a<Boolean> aVar) {
        super(new b(0, aVar, y1Var), new z3.e(-1481256515, true, new v0(y1Var, 24)));
    }
}
