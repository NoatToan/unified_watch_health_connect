package mu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmu/e;", "Lcom/garmin/android/apps/connectmobile/audioprompts/test/a;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends com.garmin.android.apps.connectmobile.audioprompts.test.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPicker f121087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f121088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f121089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NumberPicker f121090d;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.audio_prompts_test_fragment_lap, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.number_picker_lap_nbr);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f121087a = numberPicker;
        numberPicker.setMinValue(1);
        NumberPicker numberPicker2 = this.f121087a;
        numberPicker2.getClass();
        numberPicker2.setMaxValue(25);
        View viewFindViewById2 = view2.findViewById(R.id.number_picker_hours);
        viewFindViewById2.getClass();
        NumberPicker numberPicker3 = (NumberPicker) viewFindViewById2;
        this.f121088b = numberPicker3;
        numberPicker3.setMinValue(0);
        NumberPicker numberPicker4 = this.f121088b;
        numberPicker4.getClass();
        numberPicker4.setMaxValue(10);
        View viewFindViewById3 = view2.findViewById(R.id.number_picker_minutes);
        viewFindViewById3.getClass();
        NumberPicker numberPicker5 = (NumberPicker) viewFindViewById3;
        this.f121089c = numberPicker5;
        numberPicker5.setMinValue(0);
        NumberPicker numberPicker6 = this.f121089c;
        numberPicker6.getClass();
        numberPicker6.setMaxValue(59);
        View viewFindViewById4 = view2.findViewById(R.id.number_picker_seconds);
        viewFindViewById4.getClass();
        NumberPicker numberPicker7 = (NumberPicker) viewFindViewById4;
        this.f121090d = numberPicker7;
        numberPicker7.setMinValue(0);
        NumberPicker numberPicker8 = this.f121090d;
        numberPicker8.getClass();
        numberPicker8.setMaxValue(59);
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.test.a
    public final GDIAudioPromptsProto.AudioPromptsService.Builder u6() {
        GDIAudioPromptsProto.LapNotification.Builder builderNewBuilder = GDIAudioPromptsProto.LapNotification.newBuilder();
        NumberPicker numberPicker = this.f121087a;
        numberPicker.getClass();
        builderNewBuilder.setLapNumber(numberPicker.getValue());
        NumberPicker numberPicker2 = this.f121090d;
        numberPicker2.getClass();
        long value = numberPicker2.getValue();
        NumberPicker numberPicker3 = this.f121089c;
        numberPicker3.getClass();
        long value2 = value + ((long) (numberPicker3.getValue() * 60));
        NumberPicker numberPicker4 = this.f121088b;
        numberPicker4.getClass();
        builderNewBuilder.setLapTime(value2 + ((long) (numberPicker4.getValue() * DateTimeConstants.SECONDS_PER_HOUR)));
        return GDIAudioPromptsProto.AudioPromptsService.newBuilder().setLapNotification(builderNewBuilder);
    }
}
