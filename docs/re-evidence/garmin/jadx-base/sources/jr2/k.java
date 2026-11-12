package jr2;

import android.widget.Toast;
import com.garmin.feature.garminpay.devicedrivensocket.NativeDeviceDrivenSocketApi;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity$onSocketTestClicked$1", f = "DeveloperSettingsActivity.kt", l = {650}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuffer f100570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeveloperSettingsActivity f100572c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity$onSocketTestClicked$1$1", f = "DeveloperSettingsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ in2.a f100573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuffer f100574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(in2.a aVar, StringBuffer stringBuffer, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f100573a = aVar;
            this.f100574b = stringBuffer;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f100573a, this.f100574b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            in2.a aVar2 = this.f100573a;
            int iSocket = aVar2.socket(2, 1, 0);
            if (iSocket <= 0) {
                kg.f.n(am.j.h(iSocket, "Failed to create socket: "));
                return null;
            }
            int recvTimeout = aVar2.setRecvTimeout(iSocket, 1000);
            if (recvTimeout != 0) {
                kg.f.n(am.j.h(recvTimeout, "Failed to set recv timeout: "));
                return null;
            }
            try {
                int iConnectByName = this.f100573a.connectByName(iSocket, 0, 1, 0, "203.209.250.19", "443", new byte[4]);
                if (iConnectByName != 0) {
                    throw new RuntimeException("Failed to connect: " + iConnectByName);
                }
                byte[] bytes = "Hello from client".getBytes(d53.c.f57667c);
                bytes.getClass();
                int iWrite = aVar2.write(iSocket, bytes);
                if (iWrite < 0) {
                    throw new RuntimeException("Failed to write: " + iWrite);
                }
                byte[] bArr = new byte[4096];
                while (true) {
                    int iSelect = aVar2.select(iSocket);
                    if (iSelect != 0) {
                        if (iSelect != 1) {
                            throw new RuntimeException("Failed to select: " + iSelect);
                        }
                        int i14 = aVar2.read(iSocket, bArr);
                        if (i14 <= 0) {
                            if (i14 == 0) {
                                aVar2.close(iSocket);
                                return Unit.INSTANCE;
                            }
                            throw new RuntimeException("Failed to read: " + i14);
                        }
                        this.f100574b.append(new String(bArr, 0, i14, d53.c.f57667c));
                    }
                }
            } catch (Throwable th3) {
                aVar2.close(iSocket);
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DeveloperSettingsActivity developerSettingsActivity, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f100572c = developerSettingsActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f100572c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        StringBuffer stringBuffer;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100571b;
        DeveloperSettingsActivity developerSettingsActivity = this.f100572c;
        try {
            if (i14 == 0) {
                r.b(obj);
                in2.a aVar2 = (in2.a) KoinJavaComponent.get$default(in2.a.class, new TypeQualifier(s0.f105811a.b(NativeDeviceDrivenSocketApi.class)), null, 4, null);
                StringBuffer stringBuffer2 = new StringBuffer();
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar3 = new a(aVar2, stringBuffer2, null);
                this.f100570a = stringBuffer2;
                this.f100571b = 1;
                if (ge1.b.e0(bVar, aVar3, this) == aVar) {
                    return aVar;
                }
                stringBuffer = stringBuffer2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                stringBuffer = this.f100570a;
                r.b(obj);
            }
            Toast.makeText(developerSettingsActivity, stringBuffer.toString(), 1).show();
        } catch (Throwable th3) {
            Toast.makeText(developerSettingsActivity, th3.getMessage(), 1).show();
        }
        return Unit.INSTANCE;
    }
}
