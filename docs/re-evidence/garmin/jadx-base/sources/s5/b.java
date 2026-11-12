package s5;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.util.List;
import o4.l1;
import o4.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBk\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\n\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls5/b;", "Ls5/r;", "La6/d;", "paragraphIntrinsics", "", "maxLines", "Ld6/p;", "overflow", "Lg6/a;", "constraints", "<init>", "(La6/d;IIJLkotlin/jvm/internal/j;)V", "", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "Ls5/c$d;", "Ls5/c$a;", "annotations", "Ls5/y;", "placeholders", "Lw5/q$b;", "fontFamilyResolver", "Lg6/c;", "density", "(Ljava/lang/String;Ls5/x0;Ljava/util/List;Ljava/util/List;IIJLw5/q$b;Lg6/c;Lkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.d f157128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f157130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t5.b0 f157131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f157132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f157133f;

    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: a6.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: a6.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private b(a6.d r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.b.<init>(a6.d, int, int, long):void");
    }

    public final void A(o4.y yVar) {
        Canvas canvasA = o4.d.a(yVar);
        t5.b0 b0Var = this.f157131d;
        if (b0Var.f162406e) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        int i14 = b0Var.f162410i;
        if (canvasA.getClipBounds(b0Var.f162418q)) {
            if (i14 != 0) {
                canvasA.translate(0.0f, i14);
            }
            ThreadLocal<t5.a0> threadLocal = t5.d0.f162422a;
            t5.a0 a0Var = threadLocal.get();
            if (a0Var == null) {
                a0Var = new t5.a0();
                threadLocal.set(a0Var);
            }
            t5.a0 a0Var2 = a0Var;
            a0Var2.f162400a = canvasA;
            try {
                b0Var.f162408g.draw(a0Var2);
                a0Var2.f162400a = null;
                if (i14 != 0) {
                    canvasA.translate(0.0f, (-1) * i14);
                }
            } catch (Throwable th3) {
                a0Var2.f162400a = null;
                throw th3;
            }
        }
        if (b0Var.f162406e) {
            canvasA.restore();
        }
    }

    @Override // s5.r
    public final n4.d a(int i14) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        CharSequence charSequence = this.f157132e;
        if (!(i14 >= 0 && i14 < charSequence.length())) {
            StringBuilder sbI = b71.i.i(i14, "offset(", ") is out of bounds [0,");
            sbI.append(charSequence.length());
            sbI.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            y5.a.a(sbI.toString());
        }
        t5.b0 b0Var = this.f157131d;
        Layout layout = b0Var.f162408g;
        int lineForOffset = layout.getLineForOffset(i14);
        float fG = b0Var.g(lineForOffset);
        float fE = b0Var.e(lineForOffset);
        boolean z14 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(i14);
        if (!z14 || zIsRtlCharAt) {
            if (z14 && zIsRtlCharAt) {
                fH = b0Var.i(i14, false);
                fH2 = b0Var.i(i14 + 1, true);
            } else if (zIsRtlCharAt) {
                fH = b0Var.h(i14, false);
                fH2 = b0Var.h(i14 + 1, true);
            } else {
                fI = b0Var.i(i14, false);
                fI2 = b0Var.i(i14 + 1, true);
            }
            float f14 = fH;
            fI = fH2;
            fI2 = f14;
        } else {
            fI = b0Var.h(i14, false);
            fI2 = b0Var.h(i14 + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return new n4.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // s5.r
    public final float b(int i14) {
        t5.b0 b0Var = this.f157131d;
        return b0Var.e(i14) - b0Var.g(i14);
    }

    @Override // s5.r
    public final float c(int i14) {
        t5.b0 b0Var = this.f157131d;
        return b0Var.f162408g.getLineLeft(i14) + (i14 == b0Var.f162409h + (-1) ? b0Var.f162412k : 0.0f);
    }

    @Override // s5.r
    public final float d(int i14) {
        t5.b0 b0Var = this.f157131d;
        return b0Var.f162408g.getLineRight(i14) + (i14 == b0Var.f162409h + (-1) ? b0Var.f162413l : 0.0f);
    }

    @Override // s5.r
    public final d6.g e(int i14) {
        t5.b0 b0Var = this.f157131d;
        return b0Var.f162408g.getParagraphDirection(b0Var.f162408g.getLineForOffset(i14)) == 1 ? d6.g.Ltr : d6.g.Rtl;
    }

    @Override // s5.r
    public final float f(int i14) {
        return this.f157131d.g(i14);
    }

    @Override // s5.r
    public final float g() {
        return this.f157131d.d(0);
    }

    @Override // s5.r
    public final float getHeight() {
        return this.f157131d.a();
    }

    @Override // s5.r
    public final float getWidth() {
        return g6.a.j(this.f157130c);
    }

    @Override // s5.r
    public final int h(int i14) {
        return this.f157131d.f162408g.getLineStart(i14);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Type inference failed for: r14v15, types: [t5.a] */
    @Override // s5.r
    public final long i(n4.d dVar, int i14, n0 n0Var) {
        u5.f dVar2;
        int i15;
        int[] rangeForRect;
        SegmentFinder segmentFinderL;
        RectF rectFI = l1.i(dVar);
        m0.f157245b.getClass();
        boolean z14 = i14 != 0 && i14 == m0.f157246c;
        final a aVar = new a(n0Var, 0);
        t5.b0 b0Var = this.f157131d;
        TextPaint textPaint = b0Var.f162402a;
        Layout layout = b0Var.f162408g;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 34) {
            t5.b.f162401a.getClass();
            if (z14) {
                u5.b bVar = u5.b.f168631a;
                u5.h hVar = new u5.h(layout.getText(), b0Var.j());
                bVar.getClass();
                segmentFinderL = new u5.a(hVar);
            } else {
                q2.o.n();
                segmentFinderL = q2.o.l(q2.o.k(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFI, segmentFinderL, new Layout.TextInclusionStrategy() { // from class: t5.a
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    s5.a aVar2 = aVar;
                    b bVar2 = b.f162401a;
                    return ((Boolean) aVar2.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            t5.n nVarC = b0Var.c();
            if (z14) {
                dVar2 = new u5.h(layout.getText(), b0Var.j());
            } else {
                CharSequence text = layout.getText();
                dVar2 = i16 >= 29 ? new u5.d(text, textPaint) : new u5.e(text);
            }
            u5.f fVar = dVar2;
            int lineForVertical = layout.getLineForVertical((int) rectFI.top);
            if (rectFI.top <= b0Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < b0Var.f162409h) {
                int i17 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFI.bottom);
                if (lineForVertical2 != 0 || rectFI.bottom >= b0Var.g(0)) {
                    int iB = t5.c0.b(b0Var, layout, nVarC, i17, rectFI, fVar, aVar, true);
                    while (true) {
                        i15 = i17;
                        if (iB != -1 || i15 >= lineForVertical2) {
                            break;
                        }
                        i17 = i15 + 1;
                        iB = t5.c0.b(b0Var, layout, nVarC, i17, rectFI, fVar, aVar, true);
                    }
                    if (iB == -1) {
                        rangeForRect = null;
                    } else {
                        int i18 = lineForVertical2;
                        int iB2 = t5.c0.b(b0Var, layout, nVarC, i18, rectFI, fVar, aVar, false);
                        while (iB2 == -1 && i15 < i18) {
                            i18--;
                            iB2 = t5.c0.b(b0Var, layout, nVarC, i18, rectFI, fVar, aVar, false);
                        }
                        if (iB2 == -1) {
                            rangeForRect = null;
                        } else {
                            rangeForRect = new int[]{fVar.c(iB + 1), fVar.d(iB2 - 1)};
                        }
                    }
                } else {
                    rangeForRect = null;
                }
            } else {
                rangeForRect = null;
            }
        }
        if (rangeForRect != null) {
            return og.a.l(rangeForRect[0], rangeForRect[1]);
        }
        w0.f157315b.getClass();
        return w0.f157316c;
    }

    @Override // s5.r
    public final n4.d j(int i14) {
        CharSequence charSequence = this.f157132e;
        if (i14 < 0 || i14 > charSequence.length()) {
            StringBuilder sbI = b71.i.i(i14, "offset(", ") is out of bounds [0,");
            sbI.append(charSequence.length());
            sbI.append(']');
            y5.a.a(sbI.toString());
        }
        t5.b0 b0Var = this.f157131d;
        float fH = b0Var.h(i14, false);
        int lineForOffset = b0Var.f162408g.getLineForOffset(i14);
        return new n4.d(fH, b0Var.g(lineForOffset), fH, b0Var.e(lineForOffset));
    }

    @Override // s5.r
    public final void k(o4.y yVar, long j8, q1 q1Var, d6.i iVar, q4.g gVar, int i14) {
        a6.d dVar = this.f157128a;
        a6.h hVar = dVar.f1491g;
        int i15 = hVar.f1503c;
        hVar.d(j8);
        hVar.f(q1Var);
        hVar.g(iVar);
        hVar.e(gVar);
        hVar.b(i14);
        A(yVar);
        dVar.f1491g.b(i15);
    }

    @Override // s5.r
    public final float l() {
        t5.b0 b0Var = this.f157131d;
        return b0Var.d(b0Var.f162409h - 1);
    }

    @Override // s5.r
    public final int m(int i14) {
        return this.f157131d.f162408g.getLineForOffset(i14);
    }

    @Override // s5.r
    public final long n(int i14) {
        int i15;
        int iH;
        int iH2;
        u5.g gVarJ = this.f157131d.j();
        if (gVarJ.g(gVarJ.i(i14))) {
            gVarJ.a(i14);
            i15 = i14;
            while (i15 != -1 && (!gVarJ.g(i15) || gVarJ.c(i15))) {
                i15 = gVarJ.i(i15);
            }
        } else {
            gVarJ.a(i14);
            if (gVarJ.f(i14)) {
                i15 = (!gVarJ.d(i14) || gVarJ.b(i14)) ? gVarJ.i(i14) : i14;
            } else {
                i15 = gVarJ.b(i14) ? gVarJ.i(i14) : -1;
            }
        }
        if (i15 == -1) {
            i15 = i14;
        }
        if (gVarJ.c(gVarJ.h(i14))) {
            gVarJ.a(i14);
            iH = i14;
            while (iH != -1 && (gVarJ.g(iH) || !gVarJ.c(iH))) {
                iH = gVarJ.h(iH);
            }
        } else {
            gVarJ.a(i14);
            if (gVarJ.b(i14)) {
                if (!gVarJ.d(i14) || gVarJ.f(i14)) {
                    iH2 = gVarJ.h(i14);
                    iH = iH2;
                } else {
                    iH = i14;
                }
            } else if (gVarJ.f(i14)) {
                iH2 = gVarJ.h(i14);
                iH = iH2;
            } else {
                iH = -1;
            }
        }
        if (iH != -1) {
            i14 = iH;
        }
        return og.a.l(i15, i14);
    }

    @Override // s5.r
    public final int o(long j8) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & j8));
        t5.b0 b0Var = this.f157131d;
        int lineForVertical = b0Var.f162408g.getLineForVertical(iIntBitsToFloat - b0Var.f162410i);
        return b0Var.f162408g.getOffsetForHorizontal(lineForVertical, (b0Var.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (j8 >> 32)));
    }

    @Override // s5.r
    public final int p(int i14, boolean z14) {
        t5.b0 b0Var = this.f157131d;
        if (!z14) {
            return b0Var.f(i14);
        }
        Layout layout = b0Var.f162408g;
        ThreadLocal<t5.a0> threadLocal = t5.d0.f162422a;
        if (layout.getEllipsisCount(i14) > 0 && b0Var.f162403b == TextUtils.TruncateAt.END) {
            return layout.getEllipsisStart(i14) + layout.getLineStart(i14);
        }
        t5.n nVarC = b0Var.c();
        Layout layout2 = nVarC.f162439a;
        return nVarC.f(layout2.getLineEnd(i14), layout2.getLineStart(i14));
    }

    @Override // s5.r
    public final int q(float f14) {
        t5.b0 b0Var = this.f157131d;
        return b0Var.f162408g.getLineForVertical(((int) f14) - b0Var.f162410i);
    }

    @Override // s5.r
    public final void r(long j8, float[] fArr, int i14) {
        int i15;
        float fA;
        float fA2;
        int iH = w0.h(j8);
        int iG = w0.g(j8);
        t5.b0 b0Var = this.f157131d;
        Layout layout = b0Var.f162408g;
        int length = layout.getText().length();
        if (iH < 0) {
            y5.a.a("startOffset must be > 0");
        }
        if (iH >= length) {
            y5.a.a("startOffset must be less than text length");
        }
        if (iG <= iH) {
            y5.a.a("endOffset must be greater than startOffset");
        }
        if (iG > length) {
            y5.a.a("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i14 < (iG - iH) * 4) {
            y5.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = layout.getLineForOffset(iH);
        int lineForOffset2 = layout.getLineForOffset(iG - 1);
        t5.l lVar = new t5.l(b0Var);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i16 = lineForOffset;
        int i17 = i14;
        while (true) {
            int lineStart = layout.getLineStart(i16);
            int iF = b0Var.f(i16);
            int iMax = Math.max(iH, lineStart);
            int iMin = Math.min(iG, iF);
            float fG = b0Var.g(i16);
            float fE = b0Var.e(i16);
            boolean z14 = layout.getParagraphDirection(i16) == 1;
            while (iMax < iMin) {
                boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                if (!z14 || zIsRtlCharAt) {
                    if (z14 && zIsRtlCharAt) {
                        float fA3 = lVar.a(iMax, false, false, false);
                        i15 = iH;
                        fA = lVar.a(iMax + 1, true, true, false);
                        fA2 = fA3;
                    } else {
                        i15 = iH;
                        if (z14 || !zIsRtlCharAt) {
                            fA = lVar.a(iMax, false, false, false);
                            fA2 = lVar.a(iMax + 1, true, true, false);
                        } else {
                            fA2 = lVar.a(iMax, false, false, true);
                            fA = lVar.a(iMax + 1, true, true, true);
                        }
                    }
                    fArr[i17] = fA;
                    fArr[i17 + 1] = fG;
                    fArr[i17 + 2] = fA2;
                    fArr[i17 + 3] = fE;
                    i17 += 4;
                    iMax++;
                    iH = i15;
                } else {
                    fA = lVar.a(iMax, false, false, true);
                    i15 = iH;
                    fA2 = lVar.a(iMax + 1, true, true, true);
                }
                fArr[i17] = fA;
                fArr[i17 + 1] = fG;
                fArr[i17 + 2] = fA2;
                fArr[i17 + 3] = fE;
                i17 += 4;
                iMax++;
                iH = i15;
            }
            int i18 = iH;
            if (i16 == lineForOffset2) {
                return;
            }
            i16++;
            iH = i18;
        }
    }

    @Override // s5.r
    public final float s(int i14) {
        return this.f157131d.e(i14);
    }

    @Override // s5.r
    public final void t(o4.y yVar, o4.w wVar, float f14, q1 q1Var, d6.i iVar, q4.g gVar, int i14) {
        a6.d dVar = this.f157128a;
        a6.h hVar = dVar.f1491g;
        int i15 = hVar.f1503c;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        n4.g.a aVar = n4.g.f123559b;
        hVar.c(wVar, jFloatToRawIntBits, f14);
        hVar.f(q1Var);
        hVar.g(iVar);
        hVar.e(gVar);
        hVar.b(i14);
        A(yVar);
        dVar.f1491g.b(i15);
    }

    @Override // s5.r
    public final boolean u(int i14) {
        Layout layout = this.f157131d.f162408g;
        ThreadLocal<t5.a0> threadLocal = t5.d0.f162422a;
        return layout.getEllipsisCount(i14) > 0;
    }

    @Override // s5.r
    public final o4.j v(int i14, int i15) {
        CharSequence charSequence = this.f157132e;
        if (i14 < 0 || i14 > i15 || i15 > charSequence.length()) {
            StringBuilder sbJ = e5.j(i14, i15, "start(", ") or end(", ") is out of range [0..");
            sbJ.append(charSequence.length());
            sbJ.append("], or start > end!");
            y5.a.a(sbJ.toString());
        }
        Path path = new Path();
        t5.b0 b0Var = this.f157131d;
        b0Var.f162408g.getSelectionPath(i14, i15, path);
        int i16 = b0Var.f162410i;
        if (i16 != 0 && !path.isEmpty()) {
            path.offset(0.0f, i16);
        }
        return new o4.j(path);
    }

    @Override // s5.r
    public final float w(int i14, boolean z14) {
        t5.b0 b0Var = this.f157131d;
        return z14 ? b0Var.h(i14, false) : b0Var.i(i14, false);
    }

    @Override // s5.r
    public final d6.g x(int i14) {
        return this.f157131d.f162408g.isRtlCharAt(i14) ? d6.g.Rtl : d6.g.Ltr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<n4.d>] */
    @Override // s5.r
    public final List<n4.d> y() {
        return this.f157133f;
    }

    public final t5.b0 z(int i14, int i15, TextUtils.TruncateAt truncateAt, int i16, int i17, int i18, int i19, int i24, CharSequence charSequence) {
        a0 a0Var;
        float width = getWidth();
        a6.d dVar = this.f157128a;
        a6.h hVar = dVar.f1491g;
        int i25 = dVar.f1496l;
        t5.o oVar = dVar.f1493i;
        x0 x0Var = dVar.f1486b;
        a6.b.a aVar = a6.b.f1482a;
        c0 c0Var = x0Var.platformStyle;
        return new t5.b0(charSequence, width, hVar, i14, truncateAt, i25, 1.0f, 0.0f, (c0Var == null || (a0Var = c0Var.f157154b) == null) ? false : a0Var.f157125a, true, i16, i18, i19, i24, i17, i15, null, null, oVar, 196736, null);
    }

    public /* synthetic */ b(String str, x0 x0Var, List list, List list2, int i14, int i15, long j8, w5.q.b bVar, g6.c cVar, p005kotlin.jvm.internal.j jVar) {
        this(str, x0Var, list, list2, i14, i15, j8, bVar, cVar);
    }

    public /* synthetic */ b(a6.d dVar, int i14, int i15, long j8, p005kotlin.jvm.internal.j jVar) {
        this(dVar, i14, i15, j8);
    }

    private b(String str, x0 x0Var, List<? extends c.d<? extends c.a>> list, List<c.d<y>> list2, int i14, int i15, long j8, w5.q.b bVar, g6.c cVar) {
        this(new a6.d(str, x0Var, list, list2, bVar, cVar), i14, i15, j8, null);
    }
}
