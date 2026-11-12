package com.garmin.android.apps.connectmobile.audioprompts.test;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import k32.n;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/test/f;", "Lcom/garmin/android/apps/connectmobile/audioprompts/test/a;", "Landroid/widget/NumberPicker$OnValueChangeListener;", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.apps.connectmobile.audioprompts.test.a implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f30243j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f30246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NumberPicker f30247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NumberPicker f30248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f30249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f30250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f30251h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30244a = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f30252i = new n(this, 18);

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30244a = requireArguments().getInt(NotificationConstants.KEY_DATA_MIME_TYPE);
        this.f30251h = new Handler();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.audio_prompts_test_fragment_speed, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Handler handler = this.f30251h;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        numberPicker.getClass();
        Handler handler = this.f30251h;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
        Handler handler2 = this.f30251h;
        handler2.getClass();
        handler2.post(this.f30252i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        NumberPicker numberPicker = (NumberPicker) view2.findViewById(R.id.number_picker_mph_whole);
        this.f30246c = numberPicker;
        if (numberPicker != null) {
            numberPicker.setMinValue(0);
        }
        NumberPicker numberPicker2 = this.f30246c;
        if (numberPicker2 != null) {
            numberPicker2.setMaxValue(100);
        }
        NumberPicker numberPicker3 = this.f30246c;
        if (numberPicker3 != null) {
            numberPicker3.setOnValueChangedListener(this);
        }
        NumberPicker numberPicker4 = (NumberPicker) view2.findViewById(R.id.number_picker_mph_tenth);
        this.f30247d = numberPicker4;
        if (numberPicker4 != null) {
            numberPicker4.setMinValue(0);
        }
        NumberPicker numberPicker5 = this.f30247d;
        if (numberPicker5 != null) {
            numberPicker5.setMaxValue(9);
        }
        NumberPicker numberPicker6 = this.f30247d;
        if (numberPicker6 != null) {
            numberPicker6.setOnValueChangedListener(this);
        }
        NumberPicker numberPicker7 = (NumberPicker) view2.findViewById(R.id.number_picker_mph_hundreth);
        this.f30248e = numberPicker7;
        if (numberPicker7 != null) {
            numberPicker7.setMinValue(0);
        }
        NumberPicker numberPicker8 = this.f30248e;
        if (numberPicker8 != null) {
            numberPicker8.setMaxValue(9);
        }
        NumberPicker numberPicker9 = this.f30248e;
        if (numberPicker9 != null) {
            numberPicker9.setOnValueChangedListener(this);
        }
        this.f30249f = (CheckBox) view2.findViewById(R.id.checkbox_speak_metric_conversion);
        this.f30250g = (TextView) view2.findViewById(R.id.meters_per_second_text_vew);
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.test.a
    public final GDIAudioPromptsProto.AudioPromptsService.Builder u6() {
        GDIAudioPromptsProto.SpeedNotification.Builder builderNewBuilder = GDIAudioPromptsProto.SpeedNotification.newBuilder();
        CheckBox checkBox = this.f30249f;
        checkBox.getClass();
        builderNewBuilder.setDeviceIsDisplayingMetricUnits(checkBox.isChecked());
        int i14 = this.f30244a;
        if (i14 == 1) {
            builderNewBuilder.setAverageSpeed(this.f30245b);
        } else if (i14 == 2) {
            builderNewBuilder.setCurrentSpeed(this.f30245b);
        } else if (i14 != 3) {
            Unit unit = Unit.INSTANCE;
        } else {
            builderNewBuilder.setLapSpeed(this.f30245b);
        }
        return GDIAudioPromptsProto.AudioPromptsService.newBuilder().setSpeedNotification(builderNewBuilder);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/test/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_TYPE", "", "VAL_AVERAGE", "I", "VAL_CURRENT", "VAL_LAP", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static f a(int i14) {
            Bundle bundle = new Bundle(1);
            bundle.putInt(NotificationConstants.KEY_DATA_MIME_TYPE, i14);
            f fVar = new f();
            fVar.setArguments(bundle);
            return fVar;
        }

        private a() {
        }
    }
}
