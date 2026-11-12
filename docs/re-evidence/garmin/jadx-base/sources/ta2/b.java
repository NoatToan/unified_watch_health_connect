package ta2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xz2.j;
import xz2.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lta2/b;", "Lxz2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f163507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xz2.b f163508b;

    public b(Context context) {
        context.getClass();
        this.f163507a = a7.b.getDrawable(context, R.drawable.er_calendar_selected_day);
    }

    @Override // xz2.j
    public final boolean a(xz2.b bVar) {
        bVar.getClass();
        xz2.b bVar2 = this.f163508b;
        return bVar2 != null && s.g(bVar2, bVar);
    }

    @Override // xz2.j
    public final void b(k kVar) {
        Drawable drawable = this.f163507a;
        if (drawable != null) {
            kVar.b(drawable);
        }
    }
}
