package gw;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B%\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgw/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lhv/h;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "useCache", "includeIntelligentRoleTask", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;ZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.library.backgroundtaskmanagement.b<hv.h> {
    public a(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, boolean z14, boolean z15) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        b(new jw.a(this, z14, new g12.f(this, 22)));
        if (z15) {
            b(new jw.v(this));
        }
        b(new jw.b(this));
    }

    public /* synthetic */ a(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, z14, (i14 & 4) != 0 ? false : z15);
    }

    public a(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, boolean z14) {
        this(aVar, z14, false, 4, null);
    }
}
