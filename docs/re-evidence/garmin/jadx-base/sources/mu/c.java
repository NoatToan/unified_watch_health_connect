package mu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmu/c;", "Lcom/garmin/android/apps/connectmobile/audioprompts/test/a;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.apps.connectmobile.audioprompts.test.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPicker f121084a;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.audio_prompts_test_fragment_heart_rate_bpm, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.number_picker_bpm);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f121084a = numberPicker;
        numberPicker.setMinValue(0);
        NumberPicker numberPicker2 = this.f121084a;
        numberPicker2.getClass();
        numberPicker2.setMaxValue(260);
        NumberPicker numberPicker3 = this.f121084a;
        numberPicker3.getClass();
        numberPicker3.setValue(TsExtractor.TS_STREAM_TYPE_DTS);
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.test.a
    public final GDIAudioPromptsProto.AudioPromptsService.Builder u6() {
        GDIAudioPromptsProto.HeartRateNotification.Builder builderNewBuilder = GDIAudioPromptsProto.HeartRateNotification.newBuilder();
        NumberPicker numberPicker = this.f121084a;
        numberPicker.getClass();
        builderNewBuilder.setBpm(numberPicker.getValue());
        return GDIAudioPromptsProto.AudioPromptsService.newBuilder().setHeartRateNotification(builderNewBuilder);
    }
}
