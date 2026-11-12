package v30;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv30/c;", "Lq82/c;", "", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements q82.c<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f175402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f175403b;

    public c(Context context, int i14) {
        this.f175402a = context;
        this.f175403b = i14;
    }

    @Override // q82.c
    public final String a(Integer num) {
        String string = this.f175402a.getString(R.string.climb_details_title, String.valueOf(num.intValue() + 1), String.valueOf(this.f175403b));
        string.getClass();
        return string;
    }
}
