package qw0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqw0/i;", "Lcom/garmin/android/library/mapsdkadapter/r;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "baiduApiKey", "mapBoxApiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends com.garmin.android.library.mapsdkadapter.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f148318f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f148319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str, String str2) {
        super(context, str2);
        e0.p(context, str, str2);
        this.f148319e = o13.m.b(new qr.n(22));
    }

    @Override // com.garmin.android.library.mapsdkadapter.r, com.garmin.android.library.mapsdkadapter.k
    public final com.garmin.android.library.mapsdkadapter.i.d b() {
        s.f148346a.getClass();
        boolean zA = s.a.a();
        kg1.a.f104701a.getClass();
        com.garmin.android.library.mapsdkadapter.i.d dVarA = kg1.a.C2003a.a().a();
        if (dVarA != com.garmin.android.library.mapsdkadapter.i.d.NULL) {
            return (dVarA != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX || zA) ? dVarA : super.b();
        }
        return super.b();
    }

    @Override // com.garmin.android.library.mapsdkadapter.r
    public final List<com.garmin.android.library.mapsdkadapter.i.d> c() {
        List<com.garmin.android.library.mapsdkadapter.i.d> listC = super.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((com.garmin.android.library.mapsdkadapter.i.d) obj) == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX ? ((s) this.f148319e.getValue()).c() : true) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final com.garmin.android.library.mapsdkadapter.i.d f() {
        kg1.a.f104701a.getClass();
        com.garmin.android.library.mapsdkadapter.i.d dVarA = kg1.a.C2003a.a().a();
        if (dVarA != com.garmin.android.library.mapsdkadapter.i.d.NULL) {
            return (dVarA != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX || ((s) this.f148319e.getValue()).c()) ? dVarA : com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        }
        return com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
    }
}
