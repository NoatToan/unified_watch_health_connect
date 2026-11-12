package kd0;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypeToken f104399b;

    public /* synthetic */ w(TypeToken typeToken, int i14) {
        this.f104398a = i14;
        this.f104399b = typeToken;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f104398a;
        TypeToken typeToken = this.f104399b;
        String str = (String) obj;
        switch (i14) {
            case 0:
                int i15 = x.f104414b;
                str.getClass();
                Object objFromJson = new Gson().fromJson(str, typeToken.getType());
                objFromJson.getClass();
                return objFromJson;
            default:
                int i16 = x.f104414b;
                str.getClass();
                return new Gson().fromJson(str, typeToken.getType());
        }
    }
}
