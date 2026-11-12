package jr2;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingStatusDeviceActivity;
import com.garmin.feature.garminpay.ui.developer.GarminPayUIReviewActivity;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.c f100583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100584c;

    public /* synthetic */ n(i.c cVar, Object obj, int i14) {
        this.f100582a = i14;
        this.f100583b = cVar;
        this.f100584c = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view2, int i14, long j8) {
        int i15 = this.f100582a;
        Object obj = this.f100584c;
        i.c cVar = this.f100583b;
        switch (i15) {
            case 0:
                GarminPayUIReviewActivity garminPayUIReviewActivity = (GarminPayUIReviewActivity) cVar;
                int i16 = GarminPayUIReviewActivity.f51972a;
                garminPayUIReviewActivity.startActivity(((GarminPayUIReviewActivity.a[]) obj)[i14].a(garminPayUIReviewActivity));
                break;
            default:
                TrainingStatusDeviceActivity trainingStatusDeviceActivity = (TrainingStatusDeviceActivity) cVar;
                TrainingStatusDeviceActivity.a aVar = (TrainingStatusDeviceActivity.a) obj;
                int i17 = TrainingStatusDeviceActivity.f40027a;
                aVar.f40029b = i14;
                aVar.notifyDataSetChanged();
                Intent intent = new Intent();
                com.garmin.android.apps.connectmobile.performance.model.a aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) aVar.getItem(i14);
                if (aVar2 != null) {
                    intent.putExtra("extra_device_id", aVar2.f39917a);
                }
                trainingStatusDeviceActivity.setResult(-1, intent);
                trainingStatusDeviceActivity.finish();
                break;
        }
    }
}
