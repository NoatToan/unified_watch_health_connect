package p008y1;

import b5.c;
import b5.s;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import t13.d;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend", v = 1)
public final class r3 extends h implements p<c, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f193617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<l1> f193618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(s sVar, r0<l1> r0Var, d<? super r3> dVar) {
        super(2, dVar);
        this.f193617c = sVar;
        this.f193618d = r0Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        r3 r3Var = new r3(this.f193617c, this.f193618d, dVar);
        r3Var.f193616b = obj;
        return r3Var;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super Unit> dVar) {
        return ((r3) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[LOOP:1: B:16:0x0047->B:41:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0084 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10, types: [T, y1.l1$a] */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, y1.l1$c] */
    /* JADX WARN: Type inference failed for: r15v19, types: [T, y1.l1$a] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, y1.l1$b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:34:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
