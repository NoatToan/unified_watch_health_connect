package lo;

import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class q1 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(f0 f0Var) {
        super(f0Var, 0);
        this.f113941b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113941b;
        f0Var.W.getButtonTopLabel();
        Boolean bool = f0Var.f113758a2.get("deco_dive");
        bool.getClass();
        t tVar = (t) dVar;
        tVar.getClass();
        HashMap map = new HashMap();
        map.put(Boolean.TRUE, tVar.getString(R.string.lbl_yes));
        map.put(Boolean.FALSE, tVar.getString(R.string.lbl_no));
        tVar.I6(tVar.getString(R.string.lbl_decompression_dive), "deco_dive", map, bool);
    }
}
