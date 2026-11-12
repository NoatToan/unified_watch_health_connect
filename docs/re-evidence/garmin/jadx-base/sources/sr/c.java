package sr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsr/c;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f160564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160565b;

    public c(l22.b bVar) {
        bVar.getClass();
        this.f160564a = bVar;
    }

    public final String a() {
        Integer[] numArr = {Integer.valueOf(R.string.nice_job), Integer.valueOf(R.string.great_work), Integer.valueOf(R.string.well_done)};
        if (this.f160565b == 0) {
            h23.c.f81216a.getClass();
            this.f160565b = numArr[h23.c.f81217b.c(3)].intValue();
        }
        return this.f160564a.getString(this.f160565b);
    }
}
