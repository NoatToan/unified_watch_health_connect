package hb2;

/* JADX INFO: loaded from: classes8.dex */
public class c {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f82779a;
    }

    public static class b extends a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final byte[] f82780i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte[] f82781j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f82782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f82783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f82784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f82785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f82786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f82787g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f82788h;

        public b(int i14, byte[] bArr) {
            this.f82779a = bArr;
            this.f82785e = (i14 & 1) == 0;
            boolean z14 = (i14 & 2) == 0;
            this.f82786f = z14;
            this.f82787g = (i14 & 4) != 0;
            this.f82788h = (i14 & 8) == 0 ? f82780i : f82781j;
            this.f82782b = new byte[2];
            this.f82783c = 0;
            this.f82784d = z14 ? 19 : -1;
        }
    }

    private c() {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112 A[EDGE_INSN: B:47:0x0112->B:38:0x00bd BREAK  A[LOOP:0: B:41:0x00c5->B:48:0x011a]] */
    /* JADX WARN: Code duplicated, block: B:48:0x011a A[LOOP:0: B:41:0x00c5->B:48:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x010b A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static byte[] a(byte[] r22) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb2.c.a(byte[]):byte[]");
    }
}
