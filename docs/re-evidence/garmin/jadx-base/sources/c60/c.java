package c60;

import com.garmin.android.apps.connectmobile.courses.model.g;
import e23.l;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f24618b;

    public /* synthetic */ c(g gVar, int i14) {
        this.f24617a = i14;
        this.f24618b = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f24617a;
        g gVar = this.f24618b;
        switch (i14) {
            case 0:
                return gVar;
            default:
                g gVar2 = (g) obj;
                com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
                gVar2.getClass();
                return Boolean.valueOf(gVar2.h(gVar) || (gVar.getCoursePointId() != null && s.g(gVar.getCoursePointId(), gVar2.getCoursePointId())));
        }
    }
}
