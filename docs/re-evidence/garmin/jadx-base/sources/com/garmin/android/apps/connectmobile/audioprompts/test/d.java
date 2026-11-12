package com.garmin.android.apps.connectmobile.audioprompts.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/test/d;", "Lcom/garmin/android/apps/connectmobile/audioprompts/test/a;", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.audioprompts.test.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30236d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30237a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f30238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f30239c;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30237a = requireArguments().getInt(NotificationConstants.KEY_DATA_MIME_TYPE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.audio_prompts_test_fragment_pace, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.number_picker_minutes);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f30238b = numberPicker;
        numberPicker.setMinValue(0);
        NumberPicker numberPicker2 = this.f30238b;
        numberPicker2.getClass();
        numberPicker2.setMaxValue(59);
        View viewFindViewById2 = view2.findViewById(R.id.number_picker_seconds);
        viewFindViewById2.getClass();
        NumberPicker numberPicker3 = (NumberPicker) viewFindViewById2;
        this.f30239c = numberPicker3;
        numberPicker3.setMinValue(0);
        NumberPicker numberPicker4 = this.f30239c;
        numberPicker4.getClass();
        numberPicker4.setMaxValue(59);
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.test.a
    public final GDIAudioPromptsProto.AudioPromptsService.Builder u6() {
        GDIAudioPromptsProto.PaceNotification.Builder builderNewBuilder = GDIAudioPromptsProto.PaceNotification.newBuilder();
        int i14 = this.f30237a;
        if (i14 == 1) {
            builderNewBuilder.setAveragePace(v6());
        } else if (i14 == 2) {
            builderNewBuilder.setCurrentPace(v6());
        } else if (i14 != 3) {
            Unit unit = Unit.INSTANCE;
        } else {
            builderNewBuilder.setLapPace(v6());
        }
        return GDIAudioPromptsProto.AudioPromptsService.newBuilder().setPaceNotification(builderNewBuilder);
    }

    public final long v6() {
        NumberPicker numberPicker = this.f30239c;
        numberPicker.getClass();
        long value = numberPicker.getValue();
        NumberPicker numberPicker2 = this.f30238b;
        numberPicker2.getClass();
        return value + ((long) (numberPicker2.getValue() * 60));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/test/d$a;", "", "<init>", "()V", "", "ARG_TYPE", "Ljava/lang/String;", "", "VAL_AVERAGE", "I", "VAL_CURRENT", "VAL_LAP", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(int i14) {
            Bundle bundle = new Bundle(1);
            bundle.putInt(NotificationConstants.KEY_DATA_MIME_TYPE, i14);
            d dVar = new d();
            dVar.setArguments(bundle);
            return dVar;
        }

        private a() {
        }
    }
}
