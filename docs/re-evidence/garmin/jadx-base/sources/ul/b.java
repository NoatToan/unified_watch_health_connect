package ul;

import android.app.Activity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f171948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zl.b f171949c;

    public /* synthetic */ b(Activity activity, zl.b bVar, int i14) {
        this.f171947a = i14;
        this.f171948b = activity;
        this.f171949c = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f171947a) {
            case 0:
                Activity activity = this.f171948b;
                if (activity != null) {
                    zl.b bVar = this.f171949c;
                    bVar.getClass();
                    bVar.f205171c.c(activity);
                }
                break;
            default:
                Activity activity2 = this.f171948b;
                if (activity2 != null) {
                    zl.b bVar2 = this.f171949c;
                    bVar2.getClass();
                    bVar2.f205171c.c(activity2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
