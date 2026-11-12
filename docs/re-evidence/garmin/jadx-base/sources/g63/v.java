package g63;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lg63/v;", "Output", "Lg63/m;", "Lg63/a;", "", "setter", "<init>", "(Lg63/a;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v<Output> implements m<Output> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76173b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g63.a<Output, String> f76174a;

    /* JADX WARN: Multi-variable type inference failed */
    public v(g63.a<? super Output, String> aVar) {
        aVar.getClass();
        this.f76174a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b  */
    /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 java.lang.Object, still in use, count: 2, list:
          (r3v9 java.lang.Object) from 0x0101: PHI (r3 I:??) = (r3v6 java.lang.Object), (r3v9 java.lang.Object) binds: [B:61:0x0100, B:148:0x0101] A[DONT_GENERATE, DONT_INLINE]
          (r3v9 java.lang.Object) from 0x00f5: CHECK_CAST (java.lang.String) (r3v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:47)
        */
    @Override // g63.m
    public final java.lang.Object a(g63.c r9, java.lang.CharSequence r10, int r11) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g63.v.a(g63.c, java.lang.CharSequence, int):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg63/v$a;", "", "<init>", "()V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: g63.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg63/v$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC1528a {
            START,
            AFTER_PREFIX,
            AFTER_SIGN,
            AFTER_INIT_SIGN,
            AFTER_HOUR,
            AFTER_INIT_HOUR,
            AFTER_MINUTE,
            AFTER_COLON_MINUTE,
            IN_PART,
            AFTER_SLASH,
            END
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76187a;

            static {
                int[] iArr = new int[EnumC1528a.values().length];
                try {
                    iArr[EnumC1528a.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1528a.AFTER_PREFIX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1528a.AFTER_SIGN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1528a.AFTER_INIT_SIGN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1528a.AFTER_HOUR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1528a.AFTER_INIT_HOUR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC1528a.AFTER_MINUTE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC1528a.AFTER_COLON_MINUTE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC1528a.IN_PART.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC1528a.AFTER_SLASH.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC1528a.END.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                f76187a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final boolean a(char c14) {
            if ('A' > c14 || c14 >= '[') {
                return ('a' <= c14 && c14 < '{') || c14 == '.' || c14 == '_';
            }
            return true;
        }

        public static final boolean b(CharSequence charSequence, p0 p0Var) {
            a aVar = v.f76173b;
            if (!p13.x.k('+', '-').contains(Character.valueOf(charSequence.charAt(p0Var.f105807a)))) {
                return false;
            }
            p0Var.f105807a++;
            return true;
        }

        public static final boolean c(p0 p0Var, CharSequence charSequence, int i14) {
            boolean z14;
            a aVar = v.f76173b;
            int i15 = p0Var.f105807a;
            Iterable iterableO = j23.t.o(i15, i15 + i14);
            if (!(iterableO instanceof Collection) || !((Collection) iterableO).isEmpty()) {
                Iterator<Integer> it = iterableO.iterator();
                while (true) {
                    if (!((j23.k) it).f96801c) {
                        z14 = true;
                        break;
                    }
                    int iNextInt = ((p13.p0) it).nextInt();
                    charSequence.getClass();
                    Character chValueOf = (iNextInt < 0 || iNextInt >= charSequence.length()) ? null : Character.valueOf(charSequence.charAt(iNextInt));
                    if (!(chValueOf != null ? dh.b.G(chValueOf.charValue()) : false)) {
                        z14 = false;
                        break;
                    }
                }
            } else {
                z14 = true;
                break;
            }
            if (!z14) {
                return false;
            }
            p0Var.f105807a += i14;
            return true;
        }

        public static final boolean d(CharSequence charSequence, p0 p0Var) {
            a aVar = v.f76173b;
            if (charSequence.charAt(p0Var.f105807a) == ':') {
                p0Var.f105807a++;
                if (c(p0Var, charSequence, 2)) {
                    return true;
                }
                p0Var.f105807a--;
            }
            return false;
        }

        private a() {
        }
    }
}
