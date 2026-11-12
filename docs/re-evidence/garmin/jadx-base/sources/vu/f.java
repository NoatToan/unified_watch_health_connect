package vu;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvu/f;", "", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f180219a = 0;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f180220a = w13.b.g(com.garmin.android.apps.connectmobile.badges.service.model.d.values());
    }

    static {
        new f();
    }

    private f() {
    }

    public static final String a(Context context, com.garmin.android.apps.connectmobile.badges.service.model.d dVar) {
        dVar.getClass();
        int i14 = dVar.f30564b;
        if (i14 > 1) {
            String string = context.getString(R.string.social_more_points, Integer.valueOf(i14));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.social_one_point);
        string2.getClass();
        return string2;
    }
}
