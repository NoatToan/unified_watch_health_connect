package j02;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.Scroller", f = "Scroller.kt", l = {ModuleDescriptor.MODULE_VERSION, 156}, m = "stop$gcm_common_ui_vanillaRelease", v = 2)
public final class l0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f96109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j0 j0Var, t13.d<? super l0> dVar) {
        super(dVar);
        this.f96109b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96108a = obj;
        this.f96110c |= Integer.MIN_VALUE;
        return this.f96109b.d(this);
    }
}
