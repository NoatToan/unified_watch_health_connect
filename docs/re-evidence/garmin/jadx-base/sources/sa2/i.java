package sa2;

import java.io.IOException;
import java.io.InputStream;
import o53.b0;
import okhttp3.ResponseBody;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f158356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f158357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f158358d;

    public /* synthetic */ i(b0 b0Var, h hVar, e23.l lVar, int i14) {
        this.f158355a = i14;
        this.f158356b = b0Var;
        this.f158357c = hVar;
        this.f158358d = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f158355a;
        e23.l<? super Unit, Unit> lVar = this.f158358d;
        h hVar = this.f158357c;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool == null || bool.booleanValue()) {
                    wa2.b bVar = h.f158334i;
                    hVar.e();
                    lVar.invoke(Unit.INSTANCE);
                } else if (hVar.f158342h >= 2) {
                    hVar.e();
                    lVar.invoke(Unit.INSTANCE);
                } else {
                    hVar.b(lVar);
                }
                break;
            case 1:
                ResponseBody responseBody = (ResponseBody) obj;
                InputStream inputStreamByteStream = responseBody != null ? responseBody.byteStream() : null;
                if (inputStreamByteStream != null) {
                    try {
                        h.a(hVar, inputStreamByteStream, lVar);
                    } catch (IOException unused) {
                        h.f158334i.a("IOException trying to save the report to local storage");
                        hVar.c();
                        lVar.invoke(null);
                    }
                } else {
                    wa2.b bVar2 = h.f158334i;
                    hVar.c();
                    lVar.invoke(null);
                }
                break;
            default:
                qa2.b bVar3 = (qa2.b) obj;
                if (bVar3 != null) {
                    wa2.b bVar4 = h.f158334i;
                    hVar.e();
                    lVar.invoke(bVar3);
                } else {
                    wa2.b bVar5 = h.f158334i;
                    hVar.c();
                    lVar.invoke(null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
