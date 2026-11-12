package wl0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$updateSwingSessionDetail$1", f = "GolfSwingAnalysisViewModel.kt", l = {28, 28}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<t0<v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f185991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f185993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwingSessionDTO f185995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, SwingSessionDTO swingSessionDTO, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f185994d = cVar;
        this.f185995e = swingSessionDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f185994d, this.f185995e, dVar);
        sVar.f185993c = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((s) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L64;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String string;
        t0 t0Var = (t0) this.f185993c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185992b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f185991a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        ql0.b bVar = this.f185994d.f35814a;
        this.f185993c = null;
        this.f185991a = t0Var;
        this.f185992b = 1;
        bVar.getClass();
        SwingSessionDTO swingSessionDTO = this.f185995e;
        if (swingSessionDTO.f35882a <= 0) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GOLF;
            aVar2.getClass();
            i2.a.a(a2Var, "updateSwingSession: Invalid session id found. Failing the request.");
            obj = new v2.a(new Exception("updateSwingSession: Invalid session id found. Failing the request."), null, null, 6, null);
        } else {
            ArrayList arrayList = new ArrayList();
            String str = swingSessionDTO.f35887f;
            if (str == null) {
                string = null;
            } else {
                StringBuffer stringBuffer = new StringBuffer(str.length());
                int length = str.length();
                for (int i15 = 0; i15 < length; i15++) {
                    char cCharAt = str.charAt(i15);
                    if (cCharAt == '\f') {
                        stringBuffer.append("\\f");
                    } else if (cCharAt == '\r') {
                        stringBuffer.append("\\r");
                    } else if (cCharAt == '\"') {
                        stringBuffer.append("\\\"");
                    } else if (cCharAt == '/') {
                        stringBuffer.append("\\/");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                stringBuffer.append("\\b");
                                break;
                            case '\t':
                                stringBuffer.append("\\t");
                                break;
                            case '\n':
                                stringBuffer.append("\\n");
                                break;
                            default:
                                if (cCharAt <= 31 || ((cCharAt >= 127 && cCharAt <= 159) || (cCharAt >= 8192 && cCharAt <= 8447))) {
                                    String hexString = Integer.toHexString(cCharAt);
                                    stringBuffer.append("\\u");
                                    for (int i16 = 0; i16 < 4 - hexString.length(); i16++) {
                                        stringBuffer.append('0');
                                    }
                                    stringBuffer.append(hexString.toUpperCase(Locale.US));
                                } else {
                                    stringBuffer.append(cCharAt);
                                }
                                break;
                        }
                    } else {
                        stringBuffer.append("\\\\");
                    }
                }
                string = stringBuffer.toString();
            }
            String str2 = com.garmin.android.apps.connectmobile.golf.truswing.model.f.REPLACE.f35923a;
            if (string == null) {
                string = "";
            }
            arrayList.add(new com.garmin.android.apps.connectmobile.golf.truswing.model.e(str2, "/notes", string));
            obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new ql0.g(bVar, swingSessionDTO, new com.garmin.android.apps.connectmobile.golf.truswing.model.d(arrayList), null), this);
        }
        if (obj != aVar) {
        }
        return aVar;
        this.f185993c = null;
        this.f185991a = null;
        this.f185992b = 2;
    }
}
