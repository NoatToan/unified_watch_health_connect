package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0000*\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmRawDataCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "t", "", "onData", "onResultData", "(Ljava/lang/Object;)V", "parse", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;)Ljava/lang/Object;", "", "getDataType", "()I", "dataType", "", "onUIThread", "<init>", "(Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class HmRawDataCallback<T> extends HMCallback<HmGdspRawData> {
    public HmRawDataCallback() {
        this(false, 1, null);
    }

    public HmRawDataCallback(boolean z) {
        super(z);
    }

    public abstract int getDataType();

    public void onResultData(T t) {
    }

    public abstract T parse(@NotNull HmGdspRawData hmGdspRawData);

    public /* synthetic */ HmRawDataCallback(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(@Nullable HmGdspRawData t) {
        super.onData(t);
        if (t == 0) {
            return;
        }
        onResultData(parse(t));
    }
}
