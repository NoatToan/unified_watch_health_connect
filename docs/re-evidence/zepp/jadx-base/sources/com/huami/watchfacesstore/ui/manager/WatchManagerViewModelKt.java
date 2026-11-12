package com.huami.watchfacesstore.ui.manager;

import androidx.exifinterface.media.ExifInterface;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0018\u00010\u0001H\u0002¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "", "", "a", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class WatchManagerViewModelKt {
    private static final <T> boolean a(State<? extends List<? extends T>> state) {
        if (!(state instanceof Success)) {
            return false;
        }
        Collection collection = (Collection) ((Success) state).getValue();
        return collection == null || collection.isEmpty();
    }
}
