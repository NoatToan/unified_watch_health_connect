package com.huami.android.livedata;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/huami/android/livedata/AbsentLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "<init>", "()V", "Companion", "livedata-ex_release"}, k = 1, mv = {1, 4, 0})
public final class AbsentLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/android/livedata/AbsentLiveData$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "create", "<init>", "()V", "livedata-ex_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final <T> LiveData<T> create() {
            return new AbsentLiveData(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AbsentLiveData() {
        postValue(null);
    }

    public /* synthetic */ AbsentLiveData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
