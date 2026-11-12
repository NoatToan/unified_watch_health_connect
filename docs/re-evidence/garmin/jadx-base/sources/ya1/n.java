package ya1;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lya1/n;", "", "Landroid/view/View;", "rootView", "Landroidx/fragment/app/v;", "fragmentManager", "Lkotlin/Function2;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "", "", "onClickMapOverlay", "<init>", "(Landroid/view/View;Landroidx/fragment/app/v;Le23/p;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.v f195576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<com.garmin.android.apps.connectmobile.courses.model.e, List<Integer>, Unit> f195577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f195578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Fragment f195579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa1.j f195580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f195581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f195582g;

    /* JADX WARN: Multi-variable type inference failed */
    public n(View view2, androidx.fragment.app.v vVar, e23.p<? super com.garmin.android.apps.connectmobile.courses.model.e, ? super List<Integer>, Unit> pVar) {
        view2.getClass();
        vVar.getClass();
        pVar.getClass();
        this.f195576a = vVar;
        this.f195577b = pVar;
        this.f195578c = view2.getContext();
        this.f195580e = (sa1.j) KoinJavaComponent.get$default(sa1.j.class, null, null, 6, null);
        view2.findViewById(R.id.map_overlay).setOnClickListener(new xp0.d(this, 11));
    }
}
