package ph2;

import android.widget.ImageView;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.features.controlsmenu.boundedcontrolsupport.presenter.BoundedControlsMenuActivity;
import java.util.HashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00050\u0001¨\u0006\u0006"}, d2 = {"Lph2/a;", "Lni2/a;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements ni2.a<HashMap<String, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BoundedControlsMenuActivity f137716a;

    public a(BoundedControlsMenuActivity boundedControlsMenuActivity) {
        this.f137716a = boundedControlsMenuActivity;
    }

    @Override // ni2.a
    public final void a() {
        this.f137716a.hideProgressOverlay();
    }

    @Override // ni2.a
    public final void b(String str, Throwable th3) {
        th3.getClass();
        BoundedControlsMenuActivity boundedControlsMenuActivity = this.f137716a;
        Toast.makeText(boundedControlsMenuActivity, R.string.txt_something_went_wrong_try_again, 0).show();
        boundedControlsMenuActivity.hideProgressOverlay();
    }

    @Override // ni2.a
    public final void onSuccess(HashMap<String, Object> map) {
        List list;
        HashMap<String, Object> map2 = map;
        map2.getClass();
        if (map2.isEmpty()) {
            return;
        }
        oh2.b bVar = oh2.b.f132168a;
        Object obj = map2.get("controlsMenuReset");
        if (obj != null) {
            if (!(obj instanceof List)) {
                obj = null;
            }
            list = (List) obj;
        } else {
            list = null;
        }
        bVar.getClass();
        oh2.a aVarA = oh2.b.a(list);
        BoundedControlsMenuActivity boundedControlsMenuActivity = this.f137716a;
        boundedControlsMenuActivity.f50600p = aVarA;
        d dVar = boundedControlsMenuActivity.f50601q;
        if (dVar == null) {
            s.m("controlsMenuAdapter");
            throw null;
        }
        dVar.f137718b = aVarA;
        dVar.notifyDataSetChanged();
        qh2.a aVar = boundedControlsMenuActivity.f50597m;
        if (aVar == null) {
            s.m("controlsMenuPreviewView");
            throw null;
        }
        int i14 = aVar.noOfOptions;
        for (int i15 = 0; i15 < i14; i15++) {
            ImageView imageView = aVar.watchFaceIconImageViews[i15];
            if (imageView != null) {
                imageView.setImageResource(2131231194);
            }
            ImageView imageView2 = aVar.watchFaceIconImageViews[i15];
            if (imageView2 != null) {
                imageView2.setSelected(false);
            }
        }
        boundedControlsMenuActivity.T9();
        boundedControlsMenuActivity.X9(-1);
        boundedControlsMenuActivity.hideProgressOverlay();
    }
}
