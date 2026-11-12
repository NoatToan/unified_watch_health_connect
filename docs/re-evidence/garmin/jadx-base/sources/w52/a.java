package w52;

import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import java.io.File;
import java.util.UUID;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f182478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f182480d;

    public /* synthetic */ a(Context context, boolean z14, n70.g gVar) {
        this.f182477a = 1;
        this.f182479c = context;
        this.f182478b = z14;
        this.f182480d = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f182477a;
        boolean z14 = this.f182478b;
        Object obj2 = this.f182480d;
        Object obj3 = this.f182479c;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) obj3;
                String str = (String) obj2;
                d dVar = (d) obj;
                dVar.getClass();
                String audioNoteUrl = aVar.getAudioNoteUrl();
                String audioNoteUuid = aVar.getAudioNoteUuid();
                str.getClass();
                AudioRecordingView audioRecordingView = dVar.f182488a;
                audioRecordingView.setShowDeleteAudioButton(z14);
                ProgressBar progressBar = audioRecordingView.f47577q;
                audioRecordingView.setClickable(true);
                audioRecordingView.setMaxRecordTime(15);
                if (audioNoteUuid == null || audioNoteUuid.length() == 0) {
                    d.i(dVar);
                    audioRecordingView.h(false);
                    v22.e.l(progressBar);
                } else if (audioNoteUrl == null || audioNoteUrl.length() == 0) {
                    audioRecordingView.g(str, audioNoteUuid);
                    audioRecordingView.h(true);
                    audioRecordingView.d();
                } else {
                    d.i(dVar);
                    audioRecordingView.f47567g = audioNoteUrl;
                    v22.e.l(progressBar);
                    audioRecordingView.g(str, audioNoteUuid);
                    if (audioNoteUrl.length() == 0) {
                        audioRecordingView.h(false);
                        v22.e.j(audioRecordingView.f47568h);
                        v22.e.j(audioRecordingView.f47571k);
                        progressBar.setVisibility(8);
                        v22.e.q(audioRecordingView.f47575o);
                        TextView textView = audioRecordingView.f47569i;
                        v22.e.q(textView);
                        textView.setText(audioRecordingView.getContext().getText(R.string.audio_note_not_available));
                    } else if (new File(audioRecordingView.f47566f).exists()) {
                        audioRecordingView.h(true);
                        audioRecordingView.d();
                    } else {
                        audioRecordingView.h(true);
                        v22.e.q(audioRecordingView.f47573m);
                        v22.e.j(audioRecordingView.f47574n);
                        v22.e.j(audioRecordingView.f47572l);
                    }
                }
                break;
            case 1:
                Context context = (Context) obj3;
                n70.g gVar = (n70.g) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (str2.equals("MenuHelp")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("SHOW_RESET_HOME", z14);
                    bundle.putBoolean("SHOW_SLEEP_COACH", gVar.E());
                    HelpActivity.a.e(HelpActivity.f36653a, context, ro0.l.HOME_SETTINGS, null, bundle, 4);
                }
                break;
            case 2:
                CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) obj3;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) obj2;
                com.garmin.android.apps.connectmobile.courses.model.g gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                gVar3.getClass();
                x40.l0 l0VarFa = createCustomCourseActivity.fa();
                l0VarFa.getClass();
                l0VarFa.D4(new a50.e.c0(gVar2));
                createCustomCourseActivity.fa().A4();
                createCustomCourseActivity.ha(new a50.c.f(gVar2, gVar3, true ^ z14));
                break;
            default:
                y10.k kVar = (y10.k) obj3;
                o10.b bVar = (o10.b) obj2;
                kVar.f193917p.j(y10.n0.f.f193967a);
                UUID uuidFromString = UUID.fromString(bVar.f());
                com.garmin.android.apps.connectmobile.connectiq.b0 b0Var = kVar.f193906e;
                int nativeAppSourceId = bVar.getNativeAppSourceId();
                y10.v.a aVar3 = new y10.v.a(kVar, z14);
                b0Var.getClass();
                b0Var.b(nativeAppSourceId, GDIConnectIQInstalledApps.AppType.WIDGET, uuidFromString, aVar3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(Object obj, Object obj2, boolean z14, int i14) {
        this.f182477a = i14;
        this.f182479c = obj;
        this.f182480d = obj2;
        this.f182478b = z14;
    }
}
