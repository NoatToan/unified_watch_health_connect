package com.xiaomi.process;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.smarthome.frame.process.ProcessUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0013H\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/process/CacheData;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", DatabaseConstants.TABLE_CACHE, "", "", "Landroid/os/IInterface;", "getCache", "()Ljava/util/Map;", "mCache", "", "type", "", "getType", "()B", "describeContents", "", "writeToParcel", "", "flags", "Companion", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CacheData implements Parcelable {

    @NotNull
    private static final String TAG = "CacheData";
    public static final byte TYPE_IMPL = 1;
    public static final byte TYPE_PROXY = 2;

    @NotNull
    private final Map<String, IInterface> mCache;
    private final byte type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CacheData> CREATOR = new Parcelable.Creator<CacheData>() { // from class: com.xiaomi.process.CacheData$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CacheData createFromParcel(@NotNull Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new CacheData(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CacheData[] newArray(int size) {
            return new CacheData[size];
        }
    };

    public CacheData() {
        this.mCache = new HashMap();
        for (Map.Entry<String, DataShareFactory<? extends IInterface>> entry : ProcessInitData.INSTANCE.getFactory().entrySet()) {
            String key = entry.getKey();
            DataShareFactory<? extends IInterface> value = entry.getValue();
            Map<String, IInterface> map = this.mCache;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            map.put(key, value.createInstance());
        }
        this.type = (byte) 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Map<String, IInterface> getCache() {
        return this.mCache;
    }

    public final byte getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.mCache.size());
        for (Map.Entry<String, IInterface> entry : this.mCache.entrySet()) {
            String key = entry.getKey();
            IInterface value = entry.getValue();
            parcel.writeString(key);
            parcel.writeStrongBinder(value.asBinder());
        }
    }

    public CacheData(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.mCache = new HashMap();
        String currentProcessName = ProcessUtil.getCurrentProcessName(MiJiaEnvironment.getAppContext());
        int i = parcel.readInt();
        StringBuilder sb = new StringBuilder();
        sb.append("readBinder ");
        sb.append(i);
        sb.append(' ');
        sb.append((Object) currentProcessName);
        int i2 = 0;
        while (i2 < i) {
            i2++;
            String string = parcel.readString();
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNullExpressionValue(string, "parcel.readString()!!");
            IBinder strongBinder = parcel.readStrongBinder();
            Map<String, IInterface> map = this.mCache;
            DataShareFactory<? extends IInterface> dataShareFactory = ProcessInitData.INSTANCE.getFactory().get(string);
            Intrinsics.checkNotNull(dataShareFactory);
            map.put(string, dataShareFactory.createProxy(strongBinder));
        }
        this.type = (byte) 2;
    }
}
