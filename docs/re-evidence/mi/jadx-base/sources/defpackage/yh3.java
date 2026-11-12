package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraState;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.d;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class yh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f40170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData<CameraState> f40171b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40172a;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            f40172a = iArr;
            try {
                iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40172a[CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40172a[CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40172a[CameraInternal.State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40172a[CameraInternal.State.RELEASING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40172a[CameraInternal.State.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40172a[CameraInternal.State.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public yh3(d dVar) {
        this.f40170a = dVar;
        MutableLiveData<CameraState> mutableLiveData = new MutableLiveData<>();
        this.f40171b = mutableLiveData;
        mutableLiveData.postValue(CameraState.a(CameraState.Type.CLOSED));
    }

    public LiveData<CameraState> a() {
        return this.f40171b;
    }

    public final CameraState b() {
        return this.f40170a.a() ? CameraState.a(CameraState.Type.OPENING) : CameraState.a(CameraState.Type.PENDING_OPEN);
    }

    public void c(CameraInternal.State state, CameraState.a aVar) {
        CameraState cameraStateB;
        switch (a.f40172a[state.ordinal()]) {
            case 1:
                cameraStateB = b();
                break;
            case 2:
                cameraStateB = CameraState.b(CameraState.Type.OPENING, aVar);
                break;
            case 3:
                cameraStateB = CameraState.b(CameraState.Type.OPEN, aVar);
                break;
            case 4:
            case 5:
                cameraStateB = CameraState.b(CameraState.Type.CLOSING, aVar);
                break;
            case 6:
            case 7:
                cameraStateB = CameraState.b(CameraState.Type.CLOSED, aVar);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        zpe.a("CameraStateMachine", "New public camera state " + cameraStateB + " from " + state + " and " + aVar);
        if (Objects.equals(this.f40171b.getValue(), cameraStateB)) {
            return;
        }
        zpe.a("CameraStateMachine", "Publishing new public camera state " + cameraStateB);
        this.f40171b.postValue(cameraStateB);
    }
}
