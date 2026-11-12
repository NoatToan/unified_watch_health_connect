package jd1;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98412a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd1.b f98413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f98414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.c f98415d;

    public /* synthetic */ c(b bVar, pd1.b bVar2, b.c cVar) {
        this.f98414c = bVar;
        this.f98413b = bVar2;
        this.f98415d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f98412a;
        b.c cVar = this.f98415d;
        b bVar = this.f98414c;
        pd1.b bVar2 = this.f98413b;
        switch (i14) {
            case 0:
                int i15 = b.c.f98404h;
                com.airbnb.lottie.animation.keyframe.a.u("Linear layout tapped for [", bVar2.getReminderText(), "], navigating to edit page", bVar.f98401c);
                cVar.f98405a.c(bVar2);
                break;
            default:
                int i16 = b.c.f98404h;
                if (hb2.i.a(view2.getContext())) {
                    Boolean enabled = bVar2.getEnabled();
                    bVar2.m(enabled != null ? Boolean.valueOf(!enabled.booleanValue()) : Boolean.FALSE);
                    bVar.f98401c.debug("Item id [" + bVar2.getUserReminderId() + "] now enabled = " + bVar2.getEnabled());
                    cVar.f98405a.a();
                }
                break;
        }
    }

    public /* synthetic */ c(pd1.b bVar, b bVar2, b.c cVar) {
        this.f98413b = bVar;
        this.f98414c = bVar2;
        this.f98415d = cVar;
    }
}
