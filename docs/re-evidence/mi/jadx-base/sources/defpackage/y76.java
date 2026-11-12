package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceFaceEntranceViewV4;
import com.xiaomi.fitness.device.manager.ui.tab.TabFaceEntranceItem;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class y76 extends x76 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final DeviceFaceEntranceViewV4 B;
    public long C;

    public y76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 5);
        this.C = -1L;
        DeviceFaceEntranceViewV4 deviceFaceEntranceViewV4 = (DeviceFaceEntranceViewV4) objArr[0];
        this.B = deviceFaceEntranceViewV4;
        deviceFaceEntranceViewV4.setTag(null);
        o0(view);
        H();
    }

    private boolean E0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public final boolean A0(ObservableField<List<FaceData>> observableField, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 8;
        }
        return true;
    }

    public final boolean B0(ObservableLong observableLong, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public final boolean C0(ObservableInt observableInt, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean D0(ObservableBoolean observableBoolean, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void F0(TabFaceEntranceItem tabFaceEntranceItem) {
        this.A = tabFaceEntranceItem;
        synchronized (this) {
            this.C |= 32;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 64L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((ObservableLong) obj, i2);
        }
        if (i == 1) {
            return E0((MutableLiveData) obj, i2);
        }
        if (i == 2) {
            return C0((ObservableInt) obj, i2);
        }
        if (i == 3) {
            return A0((ObservableField) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return D0((ObservableBoolean) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        long j2;
        int i;
        String value;
        boolean z;
        List<FaceData> list;
        long j3;
        int i2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        TabFaceEntranceItem tabFaceEntranceItem = this.A;
        if ((127 & j) != 0) {
            if ((j & 97) == 0) {
                j3 = 0;
            } else {
                ObservableLong loadTime = tabFaceEntranceItem != null ? tabFaceEntranceItem.getLoadTime() : null;
                x0(0, loadTime);
                if (loadTime != null) {
                    j3 = loadTime.get();
                } else {
                    j3 = 0;
                }
            }
            if ((j & 98) == 0) {
                value = null;
            } else {
                LiveData<?> title = tabFaceEntranceItem != null ? tabFaceEntranceItem.getTitle() : null;
                w0(1, title);
                if (title != null) {
                    value = title.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 100) == 0) {
                i2 = 0;
            } else {
                ObservableInt recentOnlineCount = tabFaceEntranceItem != null ? tabFaceEntranceItem.getRecentOnlineCount() : null;
                x0(2, recentOnlineCount);
                if (recentOnlineCount != null) {
                    i2 = recentOnlineCount.get();
                } else {
                    i2 = 0;
                }
            }
            if ((j & 104) == 0) {
                list = null;
            } else {
                ObservableField<List<FaceData>> dataList = tabFaceEntranceItem != null ? tabFaceEntranceItem.getDataList() : null;
                x0(3, dataList);
                if (dataList != null) {
                    list = dataList.get();
                } else {
                    list = null;
                }
            }
            if ((j & 112) == 0) {
                i = i2;
                j2 = j3;
                z = false;
            } else {
                ObservableBoolean redPoint = tabFaceEntranceItem != null ? tabFaceEntranceItem.getRedPoint() : null;
                x0(4, redPoint);
                if (redPoint != null) {
                    j2 = j3;
                    int i3 = i2;
                    z = redPoint.get();
                    i = i3;
                } else {
                    i = i2;
                    j2 = j3;
                    z = false;
                }
            }
        } else {
            j2 = 0;
            i = 0;
            value = null;
            z = false;
            list = null;
        }
        if ((104 & j) != 0) {
            DeviceFaceEntranceViewV4.setIconList(this.B, list);
        }
        if ((j & 97) != 0) {
            DeviceFaceEntranceViewV4.setLoadTime(this.B, j2);
        }
        if ((112 & j) != 0) {
            DeviceFaceEntranceViewV4.setRedPoint(this.B, z);
        }
        if ((j & 98) != 0) {
            DeviceFaceEntranceViewV4.setTitle(this.B, value);
        }
        if ((j & 100) != 0) {
            DeviceFaceEntranceViewV4.setRecentOnlineCount(this.B, i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        F0((TabFaceEntranceItem) obj);
        return true;
    }

    public y76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
