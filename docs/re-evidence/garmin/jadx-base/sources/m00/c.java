package m00;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm00/c;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f115522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f115524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w00.b f115525d;

    public c(l22.b bVar) {
        bVar.getClass();
        this.f115522a = bVar;
        this.f115523b = bVar.getString(R.string.no_value);
        this.f115524c = bVar.getString(R.string.no_duration_value);
        this.f115525d = new w00.b(bVar);
    }

    public final String a(Double d14) {
        if (d14 != null) {
            l3.a aVar = l3.f23124b;
            long jRound = Math.round(d14.doubleValue());
            aVar.getClass();
            String strE1 = l3.a.e1(jRound);
            if (strE1 != null) {
                return strE1;
            }
        }
        return this.f115524c;
    }
}
