package com.huami.watch.transport;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class TransporterBLE extends Transporter {
    private TransporterBLE() {
    }

    public static Transporter get(@NonNull Context context, @NonNull String str) {
        return new TransporterBLE();
    }

    @Override // com.huami.watch.transport.Transporter
    public void addDataListener(Transporter.DataListener dataListener) {
    }

    @Override // com.huami.watch.transport.Transporter
    public boolean isAvailable() {
        return false;
    }

    @Override // com.huami.watch.transport.Transporter
    public void removeDataListener(Transporter.DataListener dataListener) {
    }

    @Override // com.huami.watch.transport.Transporter
    public void send(@NonNull String str, DataBundle dataBundle, Transporter.DataSendResultCallback dataSendResultCallback) {
    }

    @Override // com.huami.watch.transport.Transporter
    public void sendTo(@NonNull String str, @NonNull String str2, DataBundle dataBundle, Transporter.DataSendResultCallback dataSendResultCallback) {
    }
}
