package jx2;

import android.content.SharedPreferences;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.SaMDEcg;
import com.garmin.samd.exception.GarminDeviceNotBluetoothConnectedException;
import com.garmin.samd.exception.InvalidOAuth2DIBearerTokenException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.b1;
import p13.c1;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lkx2/c;", "<anonymous>", "(Lo53/b0;)Lkx2/c;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$enableFeature$2", f = "SaMDDeviceManager.kt", l = {119}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<b0, t13.d<? super kx2.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f101559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceProfile f101560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f101562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kx2.a f101563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f101564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f101565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f101566h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101567a;

        static {
            int[] iArr = new int[kx2.a.values().length];
            try {
                iArr[kx2.a.ECG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f101567a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, kx2.a aVar, long j8, String str, String str2, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f101562d = rVar;
        this.f101563e = aVar;
        this.f101564f = j8;
        this.f101565g = str;
        this.f101566h = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f101562d, this.f101563e, this.f101564f, this.f101565g, this.f101566h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super kx2.c> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0135 A[Catch: Exception -> 0x0141, TRY_ENTER, TryCatch #5 {Exception -> 0x0141, blocks: (B:47:0x011d, B:49:0x0121, B:51:0x012d, B:54:0x0135, B:57:0x0144), top: B:93:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0144 A[Catch: Exception -> 0x0141, TRY_LEAVE, TryCatch #5 {Exception -> 0x0141, blocks: (B:47:0x011d, B:49:0x0121, B:51:0x012d, B:54:0x0135, B:57:0x0144), top: B:93:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0192  */
    /* JADX WARN: Code duplicated, block: B:71:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0144, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws InvalidOAuth2DIBearerTokenException {
        ArrayList arrayList;
        Exception exc;
        DeviceProfile deviceProfile;
        kx2.b bVar;
        SaMDEcg.EnableResponse.ResponseStatus responseStatus;
        r rVar;
        long j8;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101561c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f101562d.d().debug(n23.j.d(this.f101564f, "enableFeature: ", this.f101563e.name(), ", deviceUnitId "));
            if (d53.w.J(this.f101565g)) {
                throw new InvalidOAuth2DIBearerTokenException();
            }
            this.f101562d.getClass();
            qx2.a aVar2 = qx2.a.f148445a;
            Set<kx2.a> setD = aVar2.d(this.f101564f);
            if (setD == null || !setD.contains(this.f101563e)) {
                this.f101562d.getClass();
                long j14 = this.f101564f;
                kx2.a aVar3 = this.f101563e;
                synchronized (aVar2) {
                    try {
                        aVar3.getClass();
                        String strB = aVar2.b(qx2.b.DEVICE_FEATURES_THAT_SHOULD_BE_ENABLED, j14);
                        Set<kx2.a> setD2 = aVar2.d(j14);
                        Iterable iterableI = setD2 != null ? c1.i(h0.f1(setD2), aVar3) : b1.c(aVar3);
                        SharedPreferences.Editor editorEdit = qx2.a.f().edit();
                        ArrayList arrayList2 = new ArrayList(y.r(iterableI, 10));
                        Iterator it = iterableI.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((kx2.a) it.next()).name());
                        }
                        editorEdit.putStringSet(strB, h0.g1(arrayList2)).commit();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            kx2.a aVar4 = this.f101563e;
            if (aVar4.f107121a != null) {
                try {
                    b.m(new b(), aVar4, this.f101565g);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e4) {
                    arrayList3.add(e4);
                }
            }
            try {
                DeviceProfile deviceProfileA = da2.d.b().a(this.f101566h);
                try {
                    if (deviceProfileA != null) {
                        if (a.f101567a[this.f101563e.ordinal()] == 1) {
                            px2.e eVarI = r.i(this.f101562d, this.f101564f, this.f101566h, this.f101563e);
                            this.f101562d.getClass();
                            String strE = qx2.a.f148445a.e();
                            this.f101559a = arrayList3;
                            this.f101560b = deviceProfileA;
                            this.f101561c = 1;
                            Enum enumE = eVarI.e(strE, this);
                            if (enumE == aVar) {
                                return aVar;
                            }
                            arrayList = arrayList3;
                            obj = enumE;
                            deviceProfile = deviceProfileA;
                            if (obj instanceof SaMDEcg.EnableResponse.ResponseStatus) {
                                responseStatus = SaMDEcg.EnableResponse.ResponseStatus.SUCCESS;
                                rVar = this.f101562d;
                                j8 = this.f101564f;
                                if (obj == responseStatus) {
                                    r.l(rVar, j8, this.f101563e, deviceProfile, null, null, null, 56);
                                } else {
                                    r.l(rVar, j8, this.f101563e, deviceProfile, kx2.b.OTHER, null, "SaMDEcg.EnableResponse.ResponseStatus." + ((SaMDEcg.EnableResponse.ResponseStatus) obj).name(), 16);
                                }
                            }
                        }
                    } else {
                        arrayList3.add(new GarminDeviceNotBluetoothConnectedException(this.f101564f));
                    }
                    arrayList = arrayList3;
                    obj = null;
                } catch (Exception e14) {
                    arrayList = arrayList3;
                    exc = e14;
                    obj = null;
                    deviceProfile = deviceProfileA;
                    arrayList.add(exc);
                    if (r.j(this.f101562d, this.f101564f, this.f101563e)) {
                        if (exc instanceof ProtobufException) {
                            bVar = kx2.b.PROTO_EXCEPTION;
                        } else {
                            bVar = kx2.b.OTHER;
                        }
                        r.l(this.f101562d, this.f101564f, this.f101563e, deviceProfile, bVar, exc, null, 32);
                    }
                    return new kx2.c(obj, arrayList.isEmpty() ? null : (Exception[]) arrayList.toArray(new Exception[0]));
                }
            } catch (Exception e15) {
                arrayList = arrayList3;
                exc = e15;
                obj = null;
                deviceProfile = null;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            DeviceProfile deviceProfile2 = this.f101560b;
            arrayList = this.f101559a;
            try {
                o13.r.b(obj);
                deviceProfile = deviceProfile2;
                try {
                    if ((obj instanceof SaMDEcg.EnableResponse.ResponseStatus) && r.j(this.f101562d, this.f101564f, this.f101563e)) {
                        responseStatus = SaMDEcg.EnableResponse.ResponseStatus.SUCCESS;
                        rVar = this.f101562d;
                        j8 = this.f101564f;
                        if (obj == responseStatus) {
                            r.l(rVar, j8, this.f101563e, deviceProfile, null, null, null, 56);
                        } else {
                            r.l(rVar, j8, this.f101563e, deviceProfile, kx2.b.OTHER, null, "SaMDEcg.EnableResponse.ResponseStatus." + ((SaMDEcg.EnableResponse.ResponseStatus) obj).name(), 16);
                        }
                    }
                } catch (Exception e16) {
                    exc = e16;
                    arrayList.add(exc);
                    if (r.j(this.f101562d, this.f101564f, this.f101563e)) {
                        if (exc instanceof ProtobufException) {
                            bVar = kx2.b.PROTO_EXCEPTION;
                        } else {
                            bVar = kx2.b.OTHER;
                        }
                        r.l(this.f101562d, this.f101564f, this.f101563e, deviceProfile, bVar, exc, null, 32);
                    }
                }
            } catch (Exception e17) {
                exc = e17;
                deviceProfile = deviceProfile2;
                obj = null;
                arrayList.add(exc);
                if (r.j(this.f101562d, this.f101564f, this.f101563e)) {
                    if (exc instanceof ProtobufException) {
                        bVar = kx2.b.PROTO_EXCEPTION;
                    } else {
                        bVar = kx2.b.OTHER;
                    }
                    r.l(this.f101562d, this.f101564f, this.f101563e, deviceProfile, bVar, exc, null, 32);
                }
                return new kx2.c(obj, arrayList.isEmpty() ? null : (Exception[]) arrayList.toArray(new Exception[0]));
            }
        }
        return new kx2.c(obj, arrayList.isEmpty() ? null : (Exception[]) arrayList.toArray(new Exception[0]));
    }
}
