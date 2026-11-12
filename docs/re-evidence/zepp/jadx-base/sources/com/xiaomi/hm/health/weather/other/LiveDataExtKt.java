package com.xiaomi.hm.health.weather.other;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.xiaomi.hm.health.weather.other.LiveDataExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00040\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0006"}, d2 = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Landroidx/lifecycle/LiveData;", "b", "Lkotlin/Pair;", "combineLatest", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class LiveDataExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef2, Object obj) {
        objectRef.element = obj;
        booleanRef.element = true;
        if (booleanRef2.element) {
            mediatorLiveData.setValue(TuplesKt.to(obj, objectRef2.element));
            objectRef.element = null;
            booleanRef.element = false;
            objectRef2.element = null;
            booleanRef2.element = false;
        }
    }

    @NotNull
    public static final <A, B> LiveData<Pair<A, B>> combineLatest(@NotNull LiveData<A> liveData, @NotNull LiveData<B> liveData2) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: xo4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.c(objectRef, booleanRef, booleanRef2, mediatorLiveData, objectRef2, obj);
            }
        });
        mediatorLiveData.addSource(liveData2, new Observer() { // from class: yo4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.d(objectRef2, booleanRef2, booleanRef, mediatorLiveData, objectRef, obj);
            }
        });
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef2, Object obj) {
        objectRef.element = obj;
        booleanRef.element = true;
        if (booleanRef2.element) {
            mediatorLiveData.setValue(TuplesKt.to(objectRef2.element, obj));
            objectRef2.element = null;
            booleanRef2.element = false;
            objectRef.element = null;
            booleanRef.element = false;
        }
    }
}
