package com.huami.watch.companion.ecg.ui.fragment;

import android.view.View;
import android.widget.Toast;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import com.huami.watch.companion.ecg.media.VoiceRecord;
import com.huami.watch.companion.ecg.ui.fragment.EcgTagFragment$initVoice$2;
import com.huami.watch.companion.ecg.view.voice.SpeakingPopup;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"com/huami/watch/companion/ecg/ui/fragment/EcgTagFragment$initVoice$2", "Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper$OnMediaRecordChangeListener;", "", "voiceLevel", "", "onVoiceLevelChange", "Lcom/huami/watch/companion/ecg/media/VoiceRecord;", "voiceRecord", "onMediaRecordSave", "onMediaRecordStart", "", "timeLeft", "timeCountDown", "onNeedPermission", "onNeedNetWork", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgTagFragment$initVoice$2 implements MediaRecorderHelper.OnMediaRecordChangeListener {
    public final /* synthetic */ EcgTagFragment a;

    public EcgTagFragment$initVoice$2(EcgTagFragment ecgTagFragment) {
        this.a = ecgTagFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(EcgTagFragment ecgTagFragment, int i) {
        ecgTagFragment.i().setVoiceLevel(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EcgTagFragment ecgTagFragment) {
        ecgTagFragment.i().dismissPopup();
    }

    @Override // com.huami.watch.companion.ecg.media.MediaRecorderHelper.OnMediaRecordChangeListener
    public void onMediaRecordSave(@NotNull VoiceRecord voiceRecord) {
        Log.d("Ecg-TagFragment", "voice length:" + voiceRecord.getDuration() + " file:" + voiceRecord.getPath(), new Object[0]);
        if (voiceRecord.getDuration() >= 1000) {
            this.a.j().saveVoiceTag(voiceRecord.getPath());
        } else {
            this.a.i().timeToShort();
            Toast.makeText(this.a.requireContext(), R.string.speak_time_too_short, 0).show();
        }
    }

    @Override // com.huami.watch.companion.ecg.media.MediaRecorderHelper.OnMediaRecordChangeListener
    public void onMediaRecordStart() {
        SpeakingPopup speakingPopupI = this.a.i();
        View view = this.a.getView();
        speakingPopupI.showAsPopupWindow(view == null ? null : view.findViewById(R.id.ecg_chart_tv_press_to_record));
        this.a.i().changeState(false);
    }

    @Override // com.huami.watch.companion.ecg.media.MediaRecorderHelper.OnMediaRecordChangeListener
    public void onNeedNetWork() {
        Toast.makeText(this.a.requireContext(), R.string.net_unavailable, 0).show();
    }

    @Override // com.huami.watch.companion.ecg.media.MediaRecorderHelper.OnMediaRecordChangeListener
    public void onNeedPermission() {
        Toast.makeText(this.a.requireContext(), R.string.need_record_permission, 0).show();
        AndroidPermissions.request(this.a.requireActivity(), "android.permission.RECORD_AUDIO");
    }

    @Override // com.huami.watch.companion.ecg.media.MediaRecorderHelper.OnMediaRecordChangeListener
    public void onVoiceLevelChange(final int voiceLevel) {
        final EcgTagFragment ecgTagFragment = this.a;
        Rx.mainThread(new Runnable() { // from class: qh1
            @Override // java.lang.Runnable
            public final void run() {
                EcgTagFragment$initVoice$2.c(ecgTagFragment, voiceLevel);
            }
        });
    }

    @Override // com.huami.watch.companion.ecg.media.MediaRecorderHelper.OnMediaRecordChangeListener
    public void timeCountDown(long timeLeft) {
        if (TimeUnit.MILLISECONDS.toSeconds(timeLeft) > 0) {
            this.a.i().countDown(timeLeft);
            return;
        }
        this.a.i().overTime();
        final EcgTagFragment ecgTagFragment = this.a;
        Rx.delayMainThread(new Runnable() { // from class: ph1
            @Override // java.lang.Runnable
            public final void run() {
                EcgTagFragment$initVoice$2.d(ecgTagFragment);
            }
        }, 1L, TimeUnit.SECONDS);
    }
}
