package pi;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import vh.n0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lpi/p;", "", "Lpi/i;", "webSocketConnection", "Lpi/p$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lpi/i;Lpi/p$b;)V", "a", "b", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f137820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f137821b;

    public interface a {
        f a(i iVar, k.i iVar2, b0 b0Var);
    }

    public interface b {
        void a(Exception exc);

        void b(String str, Map<String, ? extends Object> map);

        void c(Map<String, ? extends Object> map);

        void d(String str);

        void e(String str, Map<String, ? extends Object> map);
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137822a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Binary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f137822a = iArr;
        }
    }

    public p(i iVar, b bVar) {
        iVar.getClass();
        bVar.getClass();
        this.f137820a = iVar;
        this.f137821b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0044 -> B:23:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object c(pi.p r4, v13.c r5) {
        /*
            boolean r0 = r5 instanceof pi.r
            if (r0 == 0) goto L13
            r0 = r5
            pi.r r0 = (pi.r) r0
            int r1 = r0.f137832e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137832e = r1
            goto L18
        L13:
            pi.r r0 = new pi.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f137830c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f137832e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            pi.p r4 = r0.f137829b
            pi.p r2 = r0.f137828a
            o13.r.b(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L57
            goto L45
        L2b:
            r4 = move-exception
            goto L4f
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r4)
            r4 = 0
            return r4
        L34:
            o13.r.b(r5)
        L37:
            r0.f137828a = r4     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L57
            r0.f137829b = r4     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L57
            r0.f137832e = r3     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L57
            java.lang.Object r5 = r4.b(r0)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L57
            if (r5 != r1) goto L44
            return r1
        L44:
            r2 = r4
        L45:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L57
            r4.a(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L57
            r4 = r2
            goto L37
        L4c:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L4f:
            pi.p$b r5 = r2.f137821b
            r5.a(r4)
            kotlin.Unit r4 = p005kotlin.Unit.INSTANCE
            return r4
        L57:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.p.c(pi.p, v13.c):java.lang.Object");
    }

    public abstract void a(Map<String, ? extends Object> map);

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068 A[Catch: Exception -> 0x006b, TRY_LEAVE, TryCatch #0 {Exception -> 0x006b, blocks: (B:20:0x004f, B:22:0x0068), top: B:28:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0045 -> B:19:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(v13.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof pi.q
            if (r0 == 0) goto L13
            r0 = r9
            pi.q r0 = (pi.q) r0
            int r1 = r0.f137827e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137827e = r1
            goto L18
        L13:
            pi.q r0 = new pi.q
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f137825c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f137827e
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            pi.p r2 = r0.f137824b
            pi.p r4 = r0.f137823a
            o13.r.b(r9)
            goto L46
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L32:
            o13.r.b(r9)
            r2 = r8
        L36:
            pi.i r9 = r2.f137820a
            r0.f137823a = r2
            r0.f137824b = r2
            r0.f137827e = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            r4 = r2
        L46:
            java.lang.String r9 = (java.lang.String) r9
            r2.getClass()
            r9.getClass()
            r2 = 0
            vh.c$a r5 = vh.c.f178272g     // Catch: java.lang.Exception -> L6b
            zh.d r6 = new zh.d     // Catch: java.lang.Exception -> L6b
            w63.e r7 = new w63.e     // Catch: java.lang.Exception -> L6b
            r7.<init>()     // Catch: java.lang.Exception -> L6b
            r7.R(r9)     // Catch: java.lang.Exception -> L6b
            r6.<init>(r7)     // Catch: java.lang.Exception -> L6b
            vh.z r9 = vh.z.f178397f     // Catch: java.lang.Exception -> L6b
            java.lang.Object r9 = r5.b(r6, r9)     // Catch: java.lang.Exception -> L6b
            boolean r5 = r9 instanceof java.util.Map     // Catch: java.lang.Exception -> L6b
            if (r5 == 0) goto L6b
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L6b
            r2 = r9
        L6b:
            if (r2 == 0) goto L6e
            return r2
        L6e:
            r2 = r4
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.p.b(v13.c):java.lang.Object");
    }

    public final void d(Map<String, ? extends Object> map, o oVar) {
        map.getClass();
        oVar.getClass();
        int i14 = c.f137822a[oVar.ordinal()];
        i iVar = this.f137820a;
        if (i14 == 1) {
            w63.e eVar = new w63.e();
            zh.b.a(new zh.c(eVar, null), map);
            iVar.send(eVar.x());
        } else {
            if (i14 != 2) {
                return;
            }
            w63.e eVar2 = new w63.e();
            zh.b.a(new zh.c(eVar2, null), map);
            iVar.send(eVar2.h0(eVar2.f183349b));
        }
    }

    public abstract <D extends n0.a> void e(vh.e<D> eVar);

    public abstract <D extends n0.a> void f(vh.e<D> eVar);
}
