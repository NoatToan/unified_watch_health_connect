package d92;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.core.view.o1;
import p005kotlin.Unit;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f58630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f58631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f58632d;

    public /* synthetic */ d(Context context, View view2, boolean z14, int i14) {
        this.f58629a = i14;
        this.f58630b = context;
        this.f58631c = view2;
        this.f58632d = z14;
    }

    @Override // e23.a
    public final Object invoke() {
        Activity activity;
        switch (this.f58629a) {
            case 0:
                Context baseContext = this.f58630b;
                while (true) {
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                    } else if (baseContext instanceof ContextWrapper) {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        baseContext.getClass();
                    } else {
                        activity = null;
                    }
                }
                if (activity != null) {
                    new o1(activity.getWindow(), this.f58631c).b(!this.f58632d);
                }
                return Unit.INSTANCE;
            default:
                Context baseContext2 = this.f58630b;
                while (!(baseContext2 instanceof Activity)) {
                    if (!(baseContext2 instanceof ContextWrapper)) {
                        h.s("Could not find activity!");
                        return null;
                    }
                    baseContext2 = ((ContextWrapper) baseContext2).getBaseContext();
                    baseContext2.getClass();
                }
                new o1(((Activity) baseContext2).getWindow(), this.f58631c).b(!this.f58632d);
                return Unit.INSTANCE;
        }
    }
}
