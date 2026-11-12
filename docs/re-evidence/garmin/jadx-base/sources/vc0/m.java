package vc0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvc0/m;", "Lei2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends ei2.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f176998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f176998c = fVar;
    }

    @Override // ei2.j
    public final void s(Fragment fragment, di2.a aVar) {
        com.garmin.android.apps.connectmobile.handalignment.e eVar = new com.garmin.android.apps.connectmobile.handalignment.e();
        fragment.getF158016a().a(eVar);
        androidx.fragment.app.m mVarRequireActivity = fragment.requireActivity();
        sd2.f fVar = this.f176998c;
        eVar.a(mVarRequireActivity, fVar.getUnitID(), fVar.getDisplayName());
    }
}
