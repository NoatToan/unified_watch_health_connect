package g02;

import android.app.Activity;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74603a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f74604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f74605c;

    public /* synthetic */ w0(int i14, Context context) {
        this.f74605c = i14;
        this.f74604b = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        switch (this.f74603a) {
            case 0:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                int i14 = this.f74605c;
                Context context = this.f74604b;
                if (i14 != 1) {
                    string = context.getString(R.string.stars_rating_content_description, String.valueOf(i14));
                    string.getClass();
                } else {
                    string = context.getString(R.string.one_star_rating_content_description);
                    string.getClass();
                }
                p5.h0.n(k0Var, string);
                return Unit.INSTANCE;
            default:
                ((p3.i0) obj).getClass();
                Activity activityW = g8.i.w(this.f74604b);
                if (activityW == null) {
                    return new nn.h();
                }
                activityW.getRequestedOrientation();
                activityW.setRequestedOrientation(this.f74605c);
                return new nn.i();
        }
    }

    public /* synthetic */ w0(Context context, int i14) {
        this.f74604b = context;
        this.f74605c = i14;
    }
}
