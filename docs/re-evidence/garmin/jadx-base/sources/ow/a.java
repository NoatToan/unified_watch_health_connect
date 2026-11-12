package ow;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kw.j;
import n70.a0;
import p005kotlin.Metadata;
import r53.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B-\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Low/a;", "Ln70/a0;", "Lr53/i;", "Lkw/a;", "Lj70/d;", "", "data", "Lnw/a;", "bloodPressureDelegate", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Lr53/i;Lnw/a;Ljava/lang/String;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a0<i<? extends kw.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j70.d<String>> f134274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nw.a f134275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134276c;

    /* JADX INFO: renamed from: ow.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2547a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f134278b;

        static {
            int[] iArr = new int[kw.b.values().length];
            try {
                iArr[kw.b.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kw.b.TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kw.b.THREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kw.b.FOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kw.b.FIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f134277a = iArr;
            int[] iArr2 = new int[j.values().length];
            try {
                iArr2[j.WORLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[j.US.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f134278b = iArr2;
        }
    }

    public a(i<j70.d<String>> iVar, nw.a aVar, String str) {
        iVar.getClass();
        aVar.getClass();
        str.getClass();
        this.f134274a = iVar;
        this.f134275b = aVar;
        this.f134276c = str;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetBloodPressureDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends kw.a> invoke() {
        return new b(this.f134274a, this);
    }
}
