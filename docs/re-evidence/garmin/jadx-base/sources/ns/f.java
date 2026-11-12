package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/f;", "Lns/g;", "Ll22/b;", "resourceResolver", "Lu00/c;", "", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l22.b f127643d;

    public /* synthetic */ f(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.t() : cVar);
    }

    @Override // ns.g
    public final String h() {
        return this.f127643d.getString(R.string.lbl_body_battery_drain);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l22.b bVar, u00.c<Integer> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127643d = bVar;
    }
}
