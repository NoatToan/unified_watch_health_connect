package e22;

import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le22/a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f62640a = 0;

    static {
        new a();
    }

    private a() {
    }

    public static final <T> void a(List<? extends T> list, c<T> cVar) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                cVar.k(it.next());
            }
        }
    }

    public static final List b(List list, d dVar, f3 f3Var) {
        if (list == null) {
            return j0.f134944a;
        }
        if (f3Var != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                f3Var.getClass();
                String str = (String) obj;
                Parcelable.Creator<DeviceSettingsDTO> creator = DeviceSettingsDTO.CREATOR;
                zb0.a.f203414e.getClass();
                if ((TextUtils.isEmpty(str) || zb0.a.AudioPromptsInvalid == zb0.a.C3799a.a(str)) ? false : true) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(dVar.transform(it.next()));
        }
        return arrayList2;
    }
}
