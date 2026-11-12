package n00;

import android.app.Activity;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.cloudmessaging.FCMRegistrationGCWorker;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import wd.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements OnCompleteListener, vd.d.c, AudioRecordingView.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f122022a;

    public /* synthetic */ b(Context context) {
        this.f122022a = context;
    }

    @Override // com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView.f
    public void a() {
        Context context = this.f122022a;
        context.getClass();
        z6.a.a((Activity) context, new String[]{"android.permission.RECORD_AUDIO"}, 200);
    }

    @Override // vd.d.c
    public vd.d b(vd.d.b bVar) {
        vd.d.b.f177135f.getClass();
        vd.d.b.a aVar = new vd.d.b.a(this.f122022a);
        aVar.f177142b = bVar.f177137b;
        vd.d.a aVar2 = bVar.f177138c;
        aVar2.getClass();
        aVar.f177143c = aVar2;
        aVar.f177144d = true;
        aVar.f177145e = true;
        return new f().b(aVar.a());
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        task.getClass();
        FCMRegistrationGCWorker.a aVar = FCMRegistrationGCWorker.f31356e;
        a2 a2Var = a2.CLOUD_MESSAGING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("FirebaseMessaging get token -> onComplete() successful=", task.isSuccessful());
        i2.f36769a.getClass();
        i2.a.b(a2Var, "FCMRegistrationGCWorker", strH);
        if (!task.isSuccessful()) {
            i2.a.f(a2Var, "FCMRegistrationGCWorker", "FirebaseMessaging get token failed: " + task.getException());
            return;
        }
        String str = (String) task.getResult();
        if (str != null) {
            i2.a.b(a2Var, "FCMRegistrationGCWorker", "FirebaseMessaging get token enqueue FCMRegistrationGCWorker");
            FCMRegistrationGCWorker.f31356e.getClass();
            FCMRegistrationGCWorker.a.b(this.f122022a, str);
        }
    }
}
