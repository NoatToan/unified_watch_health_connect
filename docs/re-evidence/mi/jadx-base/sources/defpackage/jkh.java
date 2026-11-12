package defpackage;

import android.os.Parcel;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class jkh implements ParcelUtils.ValueWriter {
    @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueWriter
    public final void writeValue(Parcel parcel, Object obj) {
        parcel.writeInt(((Integer) obj).intValue());
    }
}
