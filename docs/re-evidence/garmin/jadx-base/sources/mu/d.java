package mu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmu/d;", "Lcom/garmin/android/apps/connectmobile/audioprompts/test/a;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.audioprompts.test.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPicker f121085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f121086b;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.audio_prompts_test_fragment_heart_rate_zone, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.number_picker_whole);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f121085a = numberPicker;
        numberPicker.setMinValue(0);
        NumberPicker numberPicker2 = this.f121085a;
        numberPicker2.getClass();
        numberPicker2.setMaxValue(6);
        View viewFindViewById2 = view2.findViewById(R.id.number_picker_fraction);
        viewFindViewById2.getClass();
        NumberPicker numberPicker3 = (NumberPicker) viewFindViewById2;
        this.f121086b = numberPicker3;
        numberPicker3.setMinValue(0);
        NumberPicker numberPicker4 = this.f121086b;
        numberPicker4.getClass();
        numberPicker4.setMaxValue(6);
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.test.a
    public final GDIAudioPromptsProto.AudioPromptsService.Builder u6() {
        GDIAudioPromptsProto.HeartRateNotification.Builder builderNewBuilder = GDIAudioPromptsProto.HeartRateNotification.newBuilder();
        NumberPicker numberPicker = this.f121085a;
        numberPicker.getClass();
        int value = numberPicker.getValue();
        NumberPicker numberPicker2 = this.f121086b;
        numberPicker2.getClass();
        builderNewBuilder.setZone(Float.parseFloat(value + "." + numberPicker2.getValue()));
        return GDIAudioPromptsProto.AudioPromptsService.newBuilder().setHeartRateNotification(builderNewBuilder);
    }
}
