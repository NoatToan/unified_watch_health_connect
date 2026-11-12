package mu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmu/f;", "Lcom/garmin/android/apps/connectmobile/audioprompts/test/a;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.apps.connectmobile.audioprompts.test.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPicker f121091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<NumberPicker> f121092b;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.audio_prompts_test_fragment_phrase, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.number_picker_phrase_id);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f121091a = numberPicker;
        numberPicker.setMinValue(0);
        NumberPicker numberPicker2 = this.f121091a;
        numberPicker2.getClass();
        numberPicker2.setMaxValue(999);
        NumberPicker numberPicker3 = this.f121091a;
        numberPicker3.getClass();
        numberPicker3.setValue(1);
        this.f121092b = new ArrayList<>();
        int[] iArr = {R.id.number_picker_slot_0, R.id.number_picker_slot_1, R.id.number_picker_slot_2};
        for (int i14 = 0; i14 < 3; i14++) {
            NumberPicker numberPicker4 = (NumberPicker) view2.findViewById(iArr[i14]);
            numberPicker4.setMinValue(0);
            numberPicker4.setMaxValue(29999);
            numberPicker4.setValue(1);
            ArrayList<NumberPicker> arrayList = this.f121092b;
            arrayList.getClass();
            arrayList.add(numberPicker4);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.test.a
    public final GDIAudioPromptsProto.AudioPromptsService.Builder u6() {
        GDIAudioPromptsProto.PhraseNotification.Builder builderNewBuilder = GDIAudioPromptsProto.PhraseNotification.newBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList<NumberPicker> arrayList2 = this.f121092b;
        arrayList2.getClass();
        Iterator<NumberPicker> it = arrayList2.iterator();
        it.getClass();
        while (it.hasNext()) {
            NumberPicker next = it.next();
            next.getClass();
            GDIAudioPromptsProto.SlotValue.Builder builderNewBuilder2 = GDIAudioPromptsProto.SlotValue.newBuilder();
            builderNewBuilder2.setIntValue(next.getValue());
            arrayList.add(builderNewBuilder2.build());
        }
        GDIAudioPromptsProto.Phrase.Builder builderNewBuilder3 = GDIAudioPromptsProto.Phrase.newBuilder();
        NumberPicker numberPicker = this.f121091a;
        numberPicker.getClass();
        builderNewBuilder3.setPhraseId(numberPicker.getValue());
        builderNewBuilder3.addAllSlotValues(arrayList);
        builderNewBuilder.addPhrases(builderNewBuilder3);
        return GDIAudioPromptsProto.AudioPromptsService.newBuilder().setPhraseNotification(builderNewBuilder);
    }
}
