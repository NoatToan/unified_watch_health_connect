package defpackage;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class mjr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetGroupManager f26941b;
    public jz6 c;
    public jz6 d;

    public class a implements eu6<List<rxo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f26942a;

        public a(MutableLiveData mutableLiveData) {
            this.f26942a = mutableLiveData;
        }

        @Override // defpackage.eu6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(List<rxo> list) {
            ArrayList arrayList = new ArrayList();
            for (rxo rxoVar : list) {
                if (rxoVar.d) {
                    arrayList.add(rxoVar);
                }
            }
            this.f26942a.postValue(arrayList);
        }

        @Override // defpackage.eu6
        public void onError(int i) {
            this.f26942a.postValue(Collections.emptyList());
            Logger.e("WidgetRepository", "loadSportListFromDevice has error:" + i);
        }
    }

    public mjr(Context context, WearableDeviceModel wearableDeviceModel) {
        Objects.requireNonNull(context);
        this.f26940a = context;
        this.f26941b = new WidgetGroupManager();
    }

    public static /* synthetic */ void e(MutableLiveData mutableLiveData, kyo.a aVar) throws Exception {
        if (aVar == null) {
            Logger.e("WidgetRepository", "loadWidgetV2SupportedListLiveData: WidgetV2.List is null");
            return;
        }
        Logger.d("WidgetRepository", "loadWidgetV2SupportedListLiveData: list = " + aVar);
        mutableLiveData.postValue(aVar);
    }

    public static /* synthetic */ void f(MutableLiveData mutableLiveData, Throwable th) throws Exception {
        Logger.e("WidgetRepository", "loadWidgetV2SupportedListLiveData: ", th);
        mutableLiveData.postValue(new kyo.a());
    }

    public void c() {
        jz6 jz6Var = this.c;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        jz6 jz6Var2 = this.d;
        if (jz6Var2 != null) {
            jz6Var2.dispose();
        }
    }

    public LiveData<kyo.a> d() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        this.d = this.f26941b.getWidgetV2SupportedList().O(new bg4() { // from class: kjr
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                mjr.e(mutableLiveData, (kyo.a) obj);
            }
        }, new bg4() { // from class: ljr
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                mjr.f(mutableLiveData, (Throwable) obj);
            }
        });
        return mutableLiveData;
    }

    public LiveData<List<rxo>> g() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f26941b.loadSportListFromDevice(new a(mutableLiveData));
        return mutableLiveData;
    }

    public void h(eu6<lyo.c> eu6Var) {
        this.f26941b.getWidgetV3SupportedList(eu6Var);
    }

    public void i(eu6<jyo.b> eu6Var) {
        this.f26941b.loadWidgetGroupList(eu6Var);
    }

    public void j(eu6<lyo> eu6Var) {
        this.f26941b.loadWidgetV3(eu6Var);
    }

    public void k(jyo.b bVar, eu6<Boolean> eu6Var) {
        this.f26941b.setWidgetGroupListToDevice(bVar, eu6Var);
    }

    public void l(lyo lyoVar, eu6<Boolean> eu6Var) {
        this.f26941b.setWidgetV3(lyoVar, eu6Var);
    }
}
