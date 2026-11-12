package t8;

import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.TimeRangeFilter;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n {
    public static /* bridge */ /* synthetic */ Class A() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return RemoveSpaceGesture.class;
    }

    public static /* synthetic */ LocalTimeRangeFilter.Builder a() {
        return new LocalTimeRangeFilter.Builder();
    }

    public static /* synthetic */ TimeInstantRangeFilter.Builder d() {
        return new TimeInstantRangeFilter.Builder();
    }

    public static /* bridge */ /* synthetic */ TimeRangeFilter g(Object obj) {
        return (TimeRangeFilter) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return DeleteGesture.class;
    }
}
