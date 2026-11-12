package s22;

import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class c extends q implements e23.a<Unit> {
    public c(Object obj) {
        super(0, obj, AudioRecordingView.class, "deleteAudioFile", "deleteAudioFile()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        ((AudioRecordingView) this.receiver).c();
        return Unit.INSTANCE;
    }
}
