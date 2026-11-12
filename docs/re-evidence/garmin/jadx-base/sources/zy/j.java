package zy;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f207410b;

    public /* synthetic */ j(Object obj, int i14) {
        this.f207409a = i14;
        this.f207410b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f207409a;
        Object obj = this.f207410b;
        switch (i14) {
            case 0:
                int i15 = i.b.f207399e;
                ((i) obj).f207390b.D0();
                break;
            default:
                ((zz0.j) obj).f207620a.z();
                break;
        }
    }
}
