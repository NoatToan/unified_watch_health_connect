package androidx.camera.camera2.interop;

import androidx.annotation.NonNull;
import androidx.camera.camera2.interop.Camera2CameraFilter;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalCamera2Interop
public final class Camera2CameraFilter {

    public interface Camera2Filter {
        @NonNull
        List<Camera2CameraInfo> filter(@NonNull List<Camera2CameraInfo> cameraInfos);
    }

    private Camera2CameraFilter() {
    }

    @NonNull
    public static CameraFilter createCameraFilter(@NonNull final Camera2Filter filter) {
        return new CameraFilter() { // from class: zi0
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return Camera2CameraFilter.lambda$createCameraFilter$0(filter, list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$createCameraFilter$0(Camera2Filter camera2Filter, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Camera2CameraInfo.from((CameraInfo) it2.next()));
        }
        List<Camera2CameraInfo> listFilter = camera2Filter.filter(Collections.unmodifiableList(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it3.next();
            if (listFilter.contains(Camera2CameraInfo.from(cameraInfo))) {
                arrayList2.add(cameraInfo);
            }
        }
        return arrayList2;
    }
}
