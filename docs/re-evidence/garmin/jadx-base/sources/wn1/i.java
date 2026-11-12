package wn1;

import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class i implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f186250a;

    public i(h hVar) {
        this.f186250a = hVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        h.b bVar;
        i2.d("WeightScaleUserInfoDtoAssembler", "retrieveAllRegisteredShortNames_onComplete: status=" + cVar);
        h hVar = this.f186250a;
        hVar.f186236d.remove(Long.valueOf(j8));
        if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS || (bVar = hVar.f186237e) == null) {
            return;
        }
        bVar.c3(cVar.name());
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        i2.d("WeightScaleUserInfoDtoAssembler", "retrieveAllRegisteredShortNames_onResults: data=" + obj);
        h hVar = this.f186250a;
        hVar.f186236d.remove(Long.valueOf(j8));
        if (obj != null) {
            List list = (List) obj;
            wb0.b bVar = hVar.f186235c;
            bVar.getClass();
            ArrayList arrayList = bVar.f183869b;
            arrayList.clear();
            if (list.size() > 0) {
                arrayList.addAll(list);
            }
            i2.d("WeightScaleUserInfoDtoAssembler", "retrieveAllRegisteredShortNames_onResults: result=" + list);
        }
        h.b bVar2 = hVar.f186237e;
        if (bVar2 != null) {
            bVar2.l0();
        }
    }
}
