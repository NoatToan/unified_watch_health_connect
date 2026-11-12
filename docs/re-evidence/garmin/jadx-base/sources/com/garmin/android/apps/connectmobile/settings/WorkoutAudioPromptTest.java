package com.garmin.android.apps.connectmobile.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/WorkoutAudioPromptTest;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutAudioPromptTest extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioRecordingView f41574a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/WorkoutAudioPromptTest$b", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$f;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements AudioRecordingView.f {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView.f
        public final void a() {
            WorkoutAudioPromptTest workoutAudioPromptTest = WorkoutAudioPromptTest.this;
            Toast.makeText(workoutAudioPromptTest.getApplicationContext(), "No Record Permission", 0).show();
            z6.a.a(workoutAudioPromptTest, new String[]{"android.permission.RECORD_AUDIO"}, 200);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.test_audio_prompt);
        View viewFindViewById = findViewById(R.id.audio_record_view);
        viewFindViewById.getClass();
        AudioRecordingView audioRecordingView = (AudioRecordingView) viewFindViewById;
        this.f41574a = audioRecordingView;
        audioRecordingView.setRequestPermissionListener(new b());
        AudioRecordingView audioRecordingView2 = this.f41574a;
        if (audioRecordingView2 == null) {
            s.m("startRecordingButton");
            throw null;
        }
        com.garmin.android.apps.connectmobile.view.audiorecording.b bVar = audioRecordingView2.f47562b;
        Context context = audioRecordingView2.getContext();
        context.getClass();
        bVar.getClass();
        if (a7.b.checkSelfPermission(context, "android.permission.RECORD_AUDIO") != 0) {
            z6.a.a(this, new String[]{"android.permission.RECORD_AUDIO"}, 200);
        }
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        if (i14 == 200) {
            int i15 = iArr[0];
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/WorkoutAudioPromptTest$a;", "", "<init>", "()V", "", "REQUEST_RECORD_AUDIO_PERMISSION", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
