package defpackage;

import android.os.Parcel;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ikh implements ParcelUtils.ValueReader {
    @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueReader
    public final Object readValue(Parcel parcel) {
        return Integer.valueOf(parcel.readInt());
    }
}
