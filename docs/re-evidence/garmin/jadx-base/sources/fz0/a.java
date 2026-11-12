package fz0;

import c83.h;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f73969b;

    public /* synthetic */ a(h hVar, int i14) {
        this.f73968a = i14;
        this.f73969b = hVar;
    }

    @Override // c83.h
    public final Object convert(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        switch (this.f73968a) {
            case 0:
                if (responseBody.get$contentLength() == 0) {
                    return null;
                }
                return this.f73969b.convert(responseBody);
            default:
                if (responseBody.get$contentLength() == 0) {
                    return null;
                }
                return this.f73969b.convert(responseBody);
        }
    }
}
