package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import defpackage.b89;
import defpackage.dpo;
import defpackage.fhd;
import defpackage.xe4;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends y<xe4> {
    public final int n;

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public int w() {
        return this.n;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    @RequiresApi(api = 26)
    public void y(BluetoothDevice bluetoothDevice, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS, to = 3200) int i, @IntRange(from = 0, to = 499) int i2, @IntRange(from = 10, to = 3200) int i3) {
        T t = this.m;
        if (t != 0) {
            ((xe4) t).a(bluetoothDevice, i, i2, i3);
        }
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b s(d dVar) {
        super.s(dVar);
        return this;
    }
}
