package r33;

import java.util.LinkedHashMap;
import p005kotlin.jvm.internal.j;
import p13.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2820a f150095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33.c f150096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f150097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f150098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f150099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f150100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f150101g;

    public a(EnumC2820a enumC2820a, u33.c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i14, String str2, byte[] bArr) {
        enumC2820a.getClass();
        cVar.getClass();
        this.f150095a = enumC2820a;
        this.f150096b = cVar;
        this.f150097c = strArr;
        this.f150098d = strArr2;
        this.f150099e = strArr3;
        this.f150100f = str;
        this.f150101g = i14;
    }

    public final String toString() {
        return this.f150095a + " version=" + this.f150096b;
    }

    /* JADX INFO: renamed from: r33.a$a, reason: collision with other inner class name */
    public enum EnumC2820a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2821a f150102b = new C2821a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final LinkedHashMap f150103c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f150111a;

        static {
            EnumC2820a[] enumC2820aArrValues = values();
            int iA = t0.a(enumC2820aArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (EnumC2820a enumC2820a : enumC2820aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC2820a.f150111a), enumC2820a);
            }
            f150103c = linkedHashMap;
        }

        EnumC2820a(int i14) {
            this.f150111a = i14;
        }

        /* JADX INFO: renamed from: r33.a$a$a, reason: collision with other inner class name */
        public static final class C2821a {
            public /* synthetic */ C2821a(j jVar) {
                this();
            }

            private C2821a() {
            }
        }
    }
}
