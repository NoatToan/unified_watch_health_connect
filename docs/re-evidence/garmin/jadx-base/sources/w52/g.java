package w52;

import com.garmin.android.apps.connectmobile.v2;
import java.io.File;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.components.AudioNoteViewModel$uploadAudioNote$2", f = "AudioNoteViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f182525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f182526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(File file, e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f182525b = file;
        this.f182526c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f182525b, this.f182526c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182524a;
        File file = this.f182525b;
        if (i14 == 0) {
            o13.r.b(obj);
            l52.y yVar = (l52.y) KoinJavaComponent.get$default(l52.y.class, null, null, 6, null);
            this.f182524a = 1;
            obj = yVar.E(file, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return null;
            }
            lc.u0.r();
            return null;
        }
        e eVar = this.f182526c;
        l52.a aVar2 = eVar.f182501a;
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        String str = eVar.f182503c;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) ((v2.b) v2Var).f47386a;
        String str2 = str + aVar3.getAudioNoteUuid() + ".mp3";
        aVar2.getClass();
        File file2 = new File(absolutePath);
        File file3 = new File(str2);
        if (file2.exists()) {
            file2.renameTo(file3);
        }
        return aVar3;
    }
}
