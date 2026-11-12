package by0;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "getMultiDayActivityTimelineSummaries", v = 2)
public final class f1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f21797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f21798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f21799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f21803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2 f21804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21805j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g2 g2Var, t13.d<? super f1> dVar) {
        super(dVar);
        this.f21804i = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21803h = obj;
        this.f21805j |= Integer.MIN_VALUE;
        return this.f21804i.k(null, 0, 0, null, this);
    }
}
