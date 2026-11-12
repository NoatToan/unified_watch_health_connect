package f4;

import android.content.Context;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f68769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f68770c;

    public /* synthetic */ k(e23.l lVar, e23.l lVar2, int i14) {
        this.f68768a = i14;
        this.f68769b = lVar;
        this.f68770c = lVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f68768a) {
            case 0:
                this.f68769b.invoke(obj);
                this.f68770c.invoke(obj);
                return Unit.INSTANCE;
            case 1:
                this.f68769b.invoke(obj);
                this.f68770c.invoke(obj);
                return Unit.INSTANCE;
            default:
                Context context = (Context) obj;
                context.getClass();
                GCMMapPreview gCMMapPreview = new GCMMapPreview(context);
                rw0.d dVar = new rw0.d(gCMMapPreview);
                context.registerComponentCallbacks(dVar);
                rw0.j jVar = new rw0.j(gCMMapPreview);
                gCMMapPreview.setTag(new rw0.m(dVar, jVar));
                gCMMapPreview.addOnAttachStateChangeListener(new rw0.e(jVar));
                gCMMapPreview.setupMap(new rw0.c(this.f68769b, gCMMapPreview, this.f68770c));
                return gCMMapPreview;
        }
    }
}
