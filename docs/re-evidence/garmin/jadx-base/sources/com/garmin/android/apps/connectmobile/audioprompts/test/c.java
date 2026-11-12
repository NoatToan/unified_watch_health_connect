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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/test/c;", "Lcom/garmin/android/apps/connectmobile/audioprompts/test/a;", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.apps.connectmobile.audioprompts.test.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30233c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30234a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f30235b;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30234a = requireArguments().getInt(NotificationConstants.KEY_DATA_MIME_TYPE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.audio_prompts_test_fragment_heart_rate_percent, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.number_picker_percent);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f30235b = numberPicker;
        numberPicker.setMinValue(0);
        NumberPicker numberPicker2 = this.f30235b;
        numberPicker2.getClass();
        numberPicker2.setMaxValue(120);
        NumberPicker numberPicker3 = this.f30235b;
        numberPicker3.getClass();
        numberPicker3.setValue(50);
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.test.a
    public final GDIAudioPromptsProto.AudioPromptsService.Builder u6() {
        GDIAudioPromptsProto.HeartRateNotification.Builder builderNewBuilder = GDIAudioPromptsProto.HeartRateNotification.newBuilder();
        int i14 = this.f30234a;
        if (i14 == 1) {
            NumberPicker numberPicker = this.f30235b;
            numberPicker.getClass();
            builderNewBuilder.setPercentageMax(numberPicker.getValue());
        } else if (i14 != 2) {
            Unit unit = Unit.INSTANCE;
        } else {
            NumberPicker numberPicker2 = this.f30235b;
            numberPicker2.getClass();
            builderNewBuilder.setPercentageHrr(numberPicker2.getValue());
        }
        return GDIAudioPromptsProto.AudioPromptsService.newBuilder().setHeartRateNotification(builderNewBuilder);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/test/c$a;", "", "<init>", "()V", "", "ARG_PERCENT_TYPE", "Ljava/lang/String;", "", "VAL_PERCENT_TYPE_MAX", "I", "VAL_PERCENT_TYPE_RESERVE", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
