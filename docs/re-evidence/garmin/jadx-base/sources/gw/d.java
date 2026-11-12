package gw;

import com.garmin.android.apps.connectmobile.settings.model.AutoActivityDetectDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgw/d;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/apps/connectmobile/settings/model/AutoActivityDetectDTO;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.library.backgroundtaskmanagement.b<AutoActivityDetectDTO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        aVar.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new AutoActivityDetectDTO());
        b bVar = new b(this);
        c cVar = new c(this);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(bVar);
        arrayList.add(cVar);
        c(arrayList);
    }
}
