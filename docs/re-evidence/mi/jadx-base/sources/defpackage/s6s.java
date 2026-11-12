package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
public class s6s extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d6s f33358a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6s(d6s d6sVar, Handler handler) {
        super(handler);
        this.f33358a = d6sVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        d6s d6sVar = this.f33358a;
        d6sVar.f15157k = Integer.valueOf(jcs.c(d6sVar.f15156b).a());
        if (this.f33358a.f15157k.intValue() != 0) {
            this.f33358a.f15156b.getContentResolver().unregisterContentObserver(this);
            if (obs.v(this.f33358a.f15156b)) {
                this.f33358a.R();
            }
        }
    }
}
