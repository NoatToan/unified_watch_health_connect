package q61;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity;
import java.util.List;
import n71.g;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
public interface a<T extends Parcelable> extends Parcelable {
    default List G2(ItemPickerActivity itemPickerActivity) {
        return j0.f134944a;
    }

    g X(T t7);

    default g o4(T t7) {
        return null;
    }
}
