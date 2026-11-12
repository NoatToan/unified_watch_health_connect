package f01;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lf01/c;", "", "", "encodedImage", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67682c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/ImageRecognitionRequestDTO.$serializer", "Lm63/e0;", "Lf01/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f67683a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f67683a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.ImageRecognitionRequestDTO", aVar, 3);
            m1Var.j("imageB64", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, y1Var, y1Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    strR2 = cVarC.r(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    strR3 = cVarC.r(eVar2, 2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new c(i15, strR, strR2, strR3, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.k(eVar, 0, cVar.f67680a);
            dVarC.k(eVar, 1, cVar.f67681b);
            dVarC.k(eVar, 2, cVar.f67682c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ c(int i14, String str, String str2, String str3, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f67683a.getF158591b());
            throw null;
        }
        this.f67680a = str;
        this.f67681b = str2;
        this.f67682c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f67680a, cVar.f67680a) && s.g(this.f67681b, cVar.f67681b) && s.g(this.f67682c, cVar.f67682c);
    }

    public final int hashCode() {
        return this.f67682c.hashCode() + wr.g.j(this.f67680a.hashCode() * 31, 31, this.f67681b);
    }

    public final String toString() {
        return am.j.o(this.f67682c, ")", p6.b.i("ImageRecognitionRequestDTO(encodedImage=", this.f67680a, ", regionCode=", this.f67681b, ", languageCode="));
    }

    /* JADX INFO: renamed from: f01.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf01/c$b;", "", "<init>", "()V", "Li63/c;", "Lf01/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f67683a;
        }

        private Companion() {
        }
    }

    public c(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f67680a = str;
        this.f67681b = str2;
        this.f67682c = str3;
    }
}
