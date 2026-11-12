package com.huami.sky.ui.play;

import android.media.AudioManager;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayAudioFocusChange;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "", "focusChange", "", "onAudioFocusChange", "", "a", "Z", "isLossFocus", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayAudioFocusChange implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isLossFocus;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        if (focusChange == -3 || focusChange == -2) {
            if (!SkyServiceHelperKt.getSkyService().isPlaying() || this.isLossFocus) {
                return;
            }
            this.isLossFocus = true;
            SkyServiceHelperKt.getSkyService().pause();
            return;
        }
        if (focusChange == -1) {
            if (SkyServiceHelperKt.getSkyService().isPlaying()) {
                SkyServiceHelperKt.getSkyService().pause();
            }
        } else if (focusChange == 1 && !SkyServiceHelperKt.getSkyService().isPlaying() && this.isLossFocus) {
            SkyServiceHelperKt.getSkyService().restart();
            this.isLossFocus = false;
        }
    }
}
