package gc0;

import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public class j implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f76876a;

    public j(i iVar) {
        this.f76876a = iVar;
    }

    @Override // gc0.r.a
    public final void a() {
        this.f76876a.f76870c.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 2);
    }
}
