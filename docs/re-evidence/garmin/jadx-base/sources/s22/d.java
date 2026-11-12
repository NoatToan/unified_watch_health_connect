package s22;

import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class d extends q implements e23.a<Unit> {
    public d(Object obj) {
        super(0, obj, AudioRecordingView.class, "startPlayingAfterDownload", "startPlayingAfterDownload()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        AudioRecordingView audioRecordingView = (AudioRecordingView) this.receiver;
        int i14 = AudioRecordingView.C;
        audioRecordingView.h(true);
        audioRecordingView.d();
        e.l(audioRecordingView.f47577q);
        audioRecordingView.f47574n.c();
        audioRecordingView.f47563c.a(audioRecordingView.f47562b.f47610a);
        return Unit.INSTANCE;
    }
}
