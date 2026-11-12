package g50;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import o53.s0;
import p005kotlin.Metadata;
import r53.c2;
import r53.m1;
import r53.p2;
import r53.s;
import r53.u;
import r53.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg50/i;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<com.garmin.android.apps.connectmobile.courses.model.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f75921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75922b;

    public i(g gVar, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        this.f75921a = gVar;
        this.f75922b = eVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        Object value;
        cVar.getClass();
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        g gVar = this.f75921a;
        if (cVar != cVar2 && cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA) {
            p2 p2Var = gVar.f75903i;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, i50.h.a((i50.h) value, null, false, false, false, null, null, null, false, null, 0, false, 16375)));
            gVar.y4(i50.c.l.a(R.string.msg_sorry_something_went_wrong));
            return;
        }
        String str = this.f75922b.courseId;
        f30.a aVar = gVar.f75898d;
        i50.b bVar = gVar.f75895a;
        aVar.getClass();
        bVar.getClass();
        u uVar = new u(new m1(new v(new j(gVar, null), new c2(new f30.b(aVar, bVar, null))), new k(gVar, str, null)), new l(gVar, null));
        x53.c cVar3 = s0.f129406a;
        s.C(s.A(uVar, x53.b.f189152a), v1.a(gVar));
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, com.garmin.android.apps.connectmobile.courses.model.e eVar2) {
        eVar.getClass();
        eVar2.getClass();
    }
}
