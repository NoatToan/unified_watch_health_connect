package com.xiaomi.fitness.devicesettings.bigdata;

import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordViewModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.aje;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0006\u0010\t\u001a\u00020\u0001¨\u0006\n"}, d2 = {"sendProgress", "", MediaStoreUtil.MediaInfo.SIZE, "", "sendUploadResult", "id", "", "isSuccess", "", "sendCancelReceiver", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NormalFileSaveKt {
    public static final void sendCancelReceiver() {
        NormalFileSave.INSTANCE.reset();
        aje.b(ApplicationExtKt.getApplication()).d(new Intent(AudioRecordViewModel.sActionUploadCancel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendProgress(int i) {
        Intent intent = new Intent(AudioRecordViewModel.sActionProgress);
        intent.putExtra(AudioRecordViewModel.sKeySize, i);
        aje.b(ApplicationExtKt.getApplication()).d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendUploadResult(String str, boolean z) {
        Intent intent = new Intent("com.xiaomi.fitness.audioRecordViewModel.uploadRecordResult");
        intent.putExtra("sKeyId", str);
        intent.putExtra("sKeyIsSuccess", z);
        aje.b(ApplicationExtKt.getApplication()).d(intent);
    }
}
