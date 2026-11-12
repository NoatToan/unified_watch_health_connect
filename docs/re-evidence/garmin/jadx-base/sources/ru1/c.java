package ru1;

import am.x0;
import c83.a0;
import com.garmin.android.apps.connectmobile.v2;
import o72.t;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru1/c;", "Lru1/b;", "Lru1/a;", "exerciseListAPI", "<init>", "(Lru1/a;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru1.a f154578a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154579a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4326r2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4329s2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4322q2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f154579a = iArr;
        }
    }

    public c(ru1.a aVar) {
        aVar.getClass();
        this.f154578a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru1.b
    public final v2 a(x0 x0Var, boolean z14) {
        a0 a0VarK;
        int i14 = x0Var == null ? -1 : a.f154579a[x0Var.ordinal()];
        ru1.a aVar = this.f154578a;
        if (i14 == 1) {
            a0VarK = t.K(aVar, z14);
        } else if (i14 != 2) {
            a0VarK = i14 != 3 ? t.E(aVar, z14) : t.O(aVar, z14);
        } else {
            a0VarK = t.J(aVar, z14);
        }
        Response response = a0VarK.f25745a;
        if (!response.isSuccessful()) {
            return new v2.a(new Exception(response.message()), null, null, 6, null);
        }
        com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
        String str = (String) a0VarK.f25746b;
        bVar.getClass();
        return new v2.b(com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str), response.code(), null, null, 12, null);
    }
}
