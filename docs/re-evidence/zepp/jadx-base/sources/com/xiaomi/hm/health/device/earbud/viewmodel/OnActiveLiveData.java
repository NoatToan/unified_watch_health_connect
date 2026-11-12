package com.xiaomi.hm.health.device.earbud.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u001a\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0014R*\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/OnActiveLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "", "onActive", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onActiveFunc", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OnActiveLiveData<T> extends MutableLiveData<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function1<OnActiveLiveData<T>, Unit> onActiveFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public OnActiveLiveData(@Nullable Function1<? super OnActiveLiveData<T>, Unit> function1) {
        this.onActiveFunc = function1;
    }

    @Override // androidx.p008lifecycle.LiveData
    public void onActive() {
        super.onActive();
        Function1<OnActiveLiveData<T>, Unit> function1 = this.onActiveFunc;
        if (function1 == null) {
            return;
        }
        function1.invoke(this);
    }
}
