package ru1;

import am.x0;
import android.text.TextUtils;
import c22.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.v2;
import o53.s0;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru1/e;", "Lru1/d;", "Lru1/a;", "exerciseListAPI", "Lc22/o;", "appUtilDelegate", "<init>", "(Lru1/a;Lc22/o;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru1.a f154580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f154581b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154582a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4326r2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4322q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f154582a = iArr;
        }
    }

    public e(ru1.a aVar, o oVar) {
        aVar.getClass();
        oVar.getClass();
        this.f154580a = aVar;
        this.f154581b = oVar;
    }

    @Override // ru1.d
    public final Object b(x0 x0Var, boolean z14, v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new f(this, x0Var, z14, null), cVar);
    }

    public final v2 c(x0 x0Var, boolean z14, boolean z15, String str) {
        a0<String> a0VarExecute;
        ru1.a aVar = this.f154580a;
        try {
            if (z15) {
                int i14 = x0Var == null ? -1 : a.f154582a[x0Var.ordinal()];
                if (i14 != 1) {
                    a0VarExecute = i14 != 2 ? aVar.j(oc.b.A(str)).execute() : aVar.c(oc.b.A(str)).execute();
                } else {
                    a0VarExecute = aVar.m(oc.b.A(str)).execute();
                }
                a0VarExecute.getClass();
            } else {
                if (z14) {
                    a0VarExecute = aVar.j(oc.b.A(str)).execute();
                } else {
                    a0VarExecute = (x0Var == x0.f4326r2 || x0Var == x0.f4322q2) ? aVar.b(oc.b.A(str)).execute() : aVar.j(oc.b.A(str)).execute();
                }
                a0VarExecute.getClass();
            }
            String str2 = a0VarExecute.f25746b;
            Response response = a0VarExecute.f25745a;
            return response.isSuccessful() ? new v2.b(!TextUtils.isEmpty(str2) ? str2 : null, response.code(), null, null, 12, null) : new v2.a(new Exception(response.message()), Integer.valueOf(response.code()), response.message());
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }
}
