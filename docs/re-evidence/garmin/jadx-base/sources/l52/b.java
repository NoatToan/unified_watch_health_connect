package l52;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.AudioDownloadRepository$deleteExpiredLocalAudioFiles$2", f = "AudioDownloadRepository.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f110217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f110217b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f110217b, dVar);
        bVar.f110216a = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a2 a2Var = a2.WORKOUTS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "AudioDownloadRepository", "deleteExpiredLocalAudioFiles: Deleting audio files which are expired.");
        File[] fileArrListFiles = new File(this.f110217b.f110209a).listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (fileArrListFiles[i14].lastModified() + 86400000 < System.currentTimeMillis()) {
                    fileArrListFiles[i14].delete();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
