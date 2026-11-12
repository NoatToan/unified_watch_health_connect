package bi2;

import android.app.AlertDialog;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.BaseNumberInputDialog", f = "BaseNumberInputDialog.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "populateVariableViews$suspendImpl")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f18105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlertDialog f18106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f18108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f18108d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18107c = obj;
        this.f18109e |= Integer.MIN_VALUE;
        return f.i(this.f18108d, null, this);
    }
}
