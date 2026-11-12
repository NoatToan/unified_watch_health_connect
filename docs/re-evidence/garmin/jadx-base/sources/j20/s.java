package j20;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lj20/s;", "Landroidx/lifecycle/x1$c;", "Ll20/a;", "contactDTO", "Ljava/util/ArrayList;", "Ll20/c;", "Lkotlin/collections/ArrayList;", "contactMethodList", "contactMethod", "", "fromEmergencyContactDetails", "isLiveTrackSetup", "isLiveTrackAndEmergencyContactSetup", "Lhl/a;", "screenAccessRole", "<init>", "(Ll20/a;Ljava/util/ArrayList;Ll20/c;ZZZLhl/a;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l20.a f96604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<l20.c> f96605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l20.c f96606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f96608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f96609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hl.a f96610g;

    public /* synthetic */ s(l20.a aVar, ArrayList arrayList, l20.c cVar, boolean z14, boolean z15, boolean z16, hl.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : arrayList, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? hl.a.c.f84256b : aVar2);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(com.garmin.android.apps.connectmobile.contacts.emergency.d.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new com.garmin.android.apps.connectmobile.contacts.emergency.d(this.f96604a, this.f96605b, this.f96606c, this.f96607d, this.f96608e, this.f96609f, this.f96610g);
    }

    public s(l20.a aVar, ArrayList<l20.c> arrayList, l20.c cVar, boolean z14, boolean z15, boolean z16, hl.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f96604a = aVar;
        this.f96605b = arrayList;
        this.f96606c = cVar;
        this.f96607d = z14;
        this.f96608e = z15;
        this.f96609f = z16;
        this.f96610g = aVar2;
    }
}
